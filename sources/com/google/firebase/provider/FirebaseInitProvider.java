package com.google.firebase.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.SystemClock;
import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;
import p000.AbstractC0487;
import p000.C0377;
import p000.C1078;
import p000.C2760;

/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class FirebaseInitProvider extends ContentProvider {

    /* JADX INFO: renamed from: ۦۨ */
    public static final C2760 f357 = new C2760(System.currentTimeMillis(), SystemClock.elapsedRealtime(), SystemClock.uptimeMillis());

    /* JADX INFO: renamed from: ۦ۟ */
    public static final AtomicBoolean f356 = new AtomicBoolean(false);

    @Override // android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        AbstractC0487.m1048(providerInfo, "FirebaseInitProvider ProviderInfo cannot be null.");
        if ("com.google.firebase.firebaseinitprovider".equals(providerInfo.authority)) {
            C1078.m2276("Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application's build.gradle.");
        } else {
            super.attachInfo(context, providerInfo);
        }
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
        AtomicBoolean atomicBoolean = f356;
        try {
            atomicBoolean.set(true);
            if (C0377.m821(getContext()) == null) {
                Log.i("FirebaseInitProvider", "FirebaseApp initialization unsuccessful");
            } else {
                Log.i("FirebaseInitProvider", "FirebaseApp initialization successful");
            }
            return false;
        } finally {
            atomicBoolean.set(false);
        }
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
