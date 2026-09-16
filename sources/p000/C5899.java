package p000;

import android.os.Build;

/* JADX INFO: renamed from: ۦٍۨؗؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5899 {

    /* JADX INFO: renamed from: ۥۗ */
    public final C1045 f19450;

    /* JADX INFO: renamed from: ۥۣ */
    public final String f19451;

    public C5899(String str, C1045 c1045) {
        String str2 = Build.MODEL;
        String str3 = Build.VERSION.RELEASE;
        this.f19451 = str;
        this.f19450 = c1045;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5899)) {
            return false;
        }
        C5899 c5899 = (C5899) obj;
        if (!AbstractC3831.m6874(this.f19451, c5899.f19451)) {
            return false;
        }
        String str = Build.MODEL;
        if (!AbstractC3831.m6874(str, str)) {
            return false;
        }
        String str2 = Build.VERSION.RELEASE;
        return AbstractC3831.m6874(str2, str2) && this.f19450.equals(c5899.f19450);
    }

    public final int hashCode() {
        return this.f19450.hashCode() + ((EnumC5090.f16882.hashCode() + AbstractC5078.m8674((((Build.MODEL.hashCode() + (this.f19451.hashCode() * 31)) * 31) + 48517566) * 31, 31, Build.VERSION.RELEASE)) * 31);
    }

    public final String toString() {
        return "ApplicationInfo(appId=" + this.f19451 + ", deviceModel=" + Build.MODEL + ", sessionSdkVersion=3.0.7, osVersion=" + Build.VERSION.RELEASE + ", logEnvironment=" + EnumC5090.f16882 + ", androidAppInfo=" + this.f19450 + ')';
    }
}
