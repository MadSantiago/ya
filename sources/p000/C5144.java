package p000;

/* JADX INFO: renamed from: ۦۙۤؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5144 {

    /* JADX INFO: renamed from: ۥؗ */
    public final String f17037;

    /* JADX INFO: renamed from: ۥۗ */
    public final String f17038;

    /* JADX INFO: renamed from: ۥۣ */
    public final String f17039;

    /* JADX INFO: renamed from: ۦؑ */
    public final String f17040;

    public C5144(int i, String str, String str2, String str3, String str4) {
        str3 = (i & 4) != 0 ? null : str3;
        str4 = (i & 8) != 0 ? null : str4;
        this.f17039 = str;
        this.f17038 = str2;
        this.f17037 = str3;
        this.f17040 = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5144)) {
            return false;
        }
        C5144 c5144 = (C5144) obj;
        return AbstractC3831.m6874(this.f17039, c5144.f17039) && AbstractC3831.m6874(this.f17038, c5144.f17038) && AbstractC3831.m6874(this.f17037, c5144.f17037) && AbstractC3831.m6874(this.f17040, c5144.f17040);
    }

    public final int hashCode() {
        int iM8674 = AbstractC5078.m8674(this.f17039.hashCode() * 31, 31, this.f17038);
        String str = this.f17037;
        int iHashCode = (iM8674 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f17040;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "SearchData(prefsKey=" + this.f17039 + ", logMethod=" + this.f17038 + ", single=" + this.f17037 + ", multiple=" + this.f17040 + ")";
    }
}
