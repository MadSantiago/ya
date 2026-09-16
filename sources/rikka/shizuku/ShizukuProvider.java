package rikka.shizuku;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import moe.shizuku.api.BinderContainer;
import p000.AbstractC3310;
import p000.AbstractC4489;
import p000.C1078;

/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class ShizukuProvider extends ContentProvider {
    @Override // android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.multiprocess) {
            C1078.m2276("android:multiprocess must be false");
        } else {
            if (providerInfo.exported) {
                return;
            }
            C1078.m2276("android:exported must be true");
        }
    }

    @Override // android.content.ContentProvider
    public final Bundle call(String str, String str2, Bundle bundle) {
        IBinder iBinder;
        if (AbstractC4489.f14858) {
            Log.w("ShizukuProvider", "Provider called when Sui is available. Are you using Shizuku and Sui at the same time?");
            return new Bundle();
        }
        if (bundle == null) {
            return null;
        }
        bundle.setClassLoader(BinderContainer.class.getClassLoader());
        Bundle bundle2 = new Bundle();
        str.getClass();
        if (str.equals("sendBinder")) {
            if (AbstractC3310.m6080()) {
                Log.d("ShizukuProvider", "sendBinder is called when already a living binder");
                return bundle2;
            }
            BinderContainer binderContainer = (BinderContainer) bundle.getParcelable("moe.shizuku.privileged.api.intent.extra.BINDER");
            if (binderContainer != null && (iBinder = binderContainer.f365) != null) {
                Log.d("ShizukuProvider", "binder received");
                AbstractC3310.m6085(iBinder, getContext().getPackageName());
            }
        } else if (str.equals("getBinder")) {
            IBinder iBinder2 = AbstractC3310.f11078;
            if (iBinder2 == null || !iBinder2.pingBinder()) {
                return null;
            }
            BinderContainer binderContainer2 = new BinderContainer();
            binderContainer2.f365 = iBinder2;
            bundle2.putParcelable("moe.shizuku.privileged.api.intent.extra.BINDER", binderContainer2);
            return bundle2;
        }
        return bundle2;
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        if (AbstractC4489.f14858) {
            return true;
        }
        Log.d("ShizukuProvider", "Initialize Sui: " + AbstractC4489.m7785(getContext().getPackageName()));
        return true;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
