package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;

/* JADX INFO: renamed from: ۥۙؑٙؓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2200 implements InterfaceC2090 {

    /* JADX INFO: renamed from: ۥؗ */
    public final /* synthetic */ Object f7290;

    /* JADX INFO: renamed from: ۥۗ */
    public final /* synthetic */ Object f7291;

    /* JADX INFO: renamed from: ۥۣ */
    public final /* synthetic */ int f7292;

    public /* synthetic */ C2200(int i, Object obj, Object obj2) {
        this.f7292 = i;
        this.f7291 = obj;
        this.f7290 = obj2;
    }

    @Override // p000.InterfaceC2090
    public final Object get() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        int i = this.f7292;
        Object obj = this.f7290;
        Object obj2 = this.f7291;
        switch (i) {
            case 0:
                C5221 c5221 = (C5221) obj;
                return c5221.f17238.mo400(new C2813(c5221, (C3571) obj2));
            case 1:
                return new C3134((Context) obj2, (String) obj);
            default:
                C0377 c0377 = (C0377) obj2;
                String strM824 = c0377.m824();
                C5491 c5491 = new C5491();
                Context contextCreateDeviceProtectedStorageContext = ((Context) obj).createDeviceProtectedStorageContext();
                SharedPreferences sharedPreferences = contextCreateDeviceProtectedStorageContext.getSharedPreferences("com.google.firebase.common.prefs:".concat(strM824), 0);
                boolean z = true;
                if (sharedPreferences.contains("firebase_data_collection_default_enabled")) {
                    z = sharedPreferences.getBoolean("firebase_data_collection_default_enabled", true);
                } else {
                    try {
                        PackageManager packageManager = contextCreateDeviceProtectedStorageContext.getPackageManager();
                        if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(contextCreateDeviceProtectedStorageContext.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_data_collection_default_enabled")) {
                            z = applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
                        }
                        break;
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                c5491.f18101 = z;
                return c5491;
        }
    }
}
