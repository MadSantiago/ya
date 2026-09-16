package p000;

import android.os.Build;

/* JADX INFO: renamed from: ۥۢؔۜۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2616 {

    /* JADX INFO: renamed from: ۥۣ */
    public final boolean f8717;

    public C2616(boolean z) {
        String str = Build.VERSION.RELEASE;
        String str2 = Build.VERSION.CODENAME;
        if (str == null) {
            C0178.m387("Null osRelease");
            throw null;
        }
        if (str2 != null) {
            this.f8717 = z;
        } else {
            C0178.m387("Null osCodeName");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2616)) {
            return false;
        }
        C2616 c2616 = (C2616) obj;
        String str = Build.VERSION.RELEASE;
        if (!str.equals(str)) {
            return false;
        }
        String str2 = Build.VERSION.CODENAME;
        return str2.equals(str2) && this.f8717 == c2616.f8717;
    }

    public final int hashCode() {
        return (this.f8717 ? 1231 : 1237) ^ ((((Build.VERSION.RELEASE.hashCode() ^ 1000003) * 1000003) ^ Build.VERSION.CODENAME.hashCode()) * 1000003);
    }

    public final String toString() {
        return "OsData{osRelease=" + Build.VERSION.RELEASE + ", osCodeName=" + Build.VERSION.CODENAME + ", isRooted=" + this.f8717 + "}";
    }
}
