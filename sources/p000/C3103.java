package p000;

/* JADX INFO: renamed from: ۦؒؓۜ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3103 {

    /* JADX INFO: renamed from: ۥؗ */
    public final String f10401;

    /* JADX INFO: renamed from: ۥۗ */
    public final String f10402;

    /* JADX INFO: renamed from: ۥۣ */
    public final String f10403;

    /* JADX INFO: renamed from: ۦؑ */
    public final int f10404;

    public C3103(String str, String str2, String str3, int i) {
        this.f10403 = str;
        this.f10402 = str2;
        this.f10401 = str3;
        this.f10404 = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3103)) {
            return false;
        }
        C3103 c3103 = (C3103) obj;
        return AbstractC3831.m6874(this.f10403, c3103.f10403) && AbstractC3831.m6874(this.f10402, c3103.f10402) && AbstractC3831.m6874(this.f10401, c3103.f10401) && this.f10404 == c3103.f10404;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f10404) + AbstractC5078.m8674(AbstractC5078.m8674(this.f10403.hashCode() * 31, 31, this.f10402), 31, this.f10401);
    }

    public final String toString() {
        return "ReleaseRepositoryConfig(downloadUrl=" + this.f10403 + ", changeLog=" + this.f10402 + ", versionName=" + this.f10401 + ", versionCode=" + this.f10404 + ")";
    }
}
