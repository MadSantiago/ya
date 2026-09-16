package p000;

/* JADX INFO: renamed from: ۥؘٝؒ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1860 {

    /* JADX INFO: renamed from: ۥۗ */
    public final int f6201;

    /* JADX INFO: renamed from: ۥۣ */
    public final String f6202;

    public C1860(int i, String str) {
        this.f6202 = str;
        this.f6201 = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1860)) {
            return false;
        }
        C1860 c1860 = (C1860) obj;
        return AbstractC3831.m6874(this.f6202, c1860.f6202) && this.f6201 == c1860.f6201;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f6201) + (this.f6202.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WorkGenerationalId(workSpecId=");
        sb.append(this.f6202);
        sb.append(", generation=");
        return AbstractC3761.m6638(sb, this.f6201, ')');
    }
}
