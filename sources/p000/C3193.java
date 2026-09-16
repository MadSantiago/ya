package p000;

/* JADX INFO: renamed from: ۦَٜؓؗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3193 {

    /* JADX INFO: renamed from: ۥؗ */
    public final int f10727;

    /* JADX INFO: renamed from: ۥۗ */
    public final int f10728;

    /* JADX INFO: renamed from: ۥۣ */
    public final String f10729;

    public C3193(int i, int i2, String str) {
        this.f10729 = str;
        this.f10728 = i;
        this.f10727 = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3193)) {
            return false;
        }
        C3193 c3193 = (C3193) obj;
        return AbstractC3831.m6874(this.f10729, c3193.f10729) && this.f10728 == c3193.f10728 && this.f10727 == c3193.f10727;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f10727) + AbstractC2049.m3999(this.f10728, this.f10729.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SystemIdInfo(workSpecId=");
        sb.append(this.f10729);
        sb.append(", generation=");
        sb.append(this.f10728);
        sb.append(", systemId=");
        return AbstractC3761.m6638(sb, this.f10727, ')');
    }
}
