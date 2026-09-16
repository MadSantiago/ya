package p000;

/* JADX INFO: renamed from: ۥؔؒٗۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0379 {

    /* JADX INFO: renamed from: ۥۗ */
    public final int f1416;

    /* JADX INFO: renamed from: ۥۣ */
    public final String f1417;

    public C0379(int i, String str) {
        this.f1417 = str;
        this.f1416 = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0379)) {
            return false;
        }
        C0379 c0379 = (C0379) obj;
        return this.f1417.equals(c0379.f1417) && this.f1416 == c0379.f1416;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f1416) + (this.f1417.hashCode() * 31);
    }

    public final String toString() {
        return "CheckBoxData(id=" + this.f1417 + ", label=" + this.f1416 + ")";
    }
}
