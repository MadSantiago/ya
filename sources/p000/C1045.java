package p000;

import android.os.Build;
import java.util.ArrayList;

/* JADX INFO: renamed from: ۥَُؓٓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1045 {

    /* JADX INFO: renamed from: ۥؗ */
    public final String f3695;

    /* JADX INFO: renamed from: ۥُ */
    public final ArrayList f3696;

    /* JADX INFO: renamed from: ۥۗ */
    public final String f3697;

    /* JADX INFO: renamed from: ۥۣ */
    public final String f3698;

    /* JADX INFO: renamed from: ۦؑ */
    public final C2271 f3699;

    public C1045(String str, String str2, String str3, C2271 c2271, ArrayList arrayList) {
        String str4 = Build.MANUFACTURER;
        this.f3698 = str;
        this.f3697 = str2;
        this.f3695 = str3;
        this.f3699 = c2271;
        this.f3696 = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1045)) {
            return false;
        }
        C1045 c1045 = (C1045) obj;
        if (!AbstractC3831.m6874(this.f3698, c1045.f3698) || !AbstractC3831.m6874(this.f3697, c1045.f3697) || !AbstractC3831.m6874(this.f3695, c1045.f3695)) {
            return false;
        }
        String str = Build.MANUFACTURER;
        return AbstractC3831.m6874(str, str) && this.f3699.equals(c1045.f3699) && this.f3696.equals(c1045.f3696);
    }

    public final int hashCode() {
        return this.f3696.hashCode() + ((this.f3699.hashCode() + AbstractC5078.m8674(AbstractC5078.m8674(AbstractC5078.m8674(this.f3698.hashCode() * 31, 31, this.f3697), 31, this.f3695), 31, Build.MANUFACTURER)) * 31);
    }

    public final String toString() {
        return "AndroidApplicationInfo(packageName=" + this.f3698 + ", versionName=" + this.f3697 + ", appBuildVersion=" + this.f3695 + ", deviceManufacturer=" + Build.MANUFACTURER + ", currentProcessDetails=" + this.f3699 + ", appProcessDetails=" + this.f3696 + ')';
    }
}
