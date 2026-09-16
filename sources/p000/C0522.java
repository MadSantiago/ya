package p000;

/* JADX INFO: renamed from: ۥؖؒۧٔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0522 {

    /* JADX INFO: renamed from: ۥۣ */
    public float f1852 = 0.0f;

    /* JADX INFO: renamed from: ۥۗ */
    public boolean f1851 = true;

    /* JADX INFO: renamed from: ۥؗ */
    public C2772 f1850 = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0522)) {
            return false;
        }
        C0522 c0522 = (C0522) obj;
        return Float.compare(this.f1852, c0522.f1852) == 0 && this.f1851 == c0522.f1851 && AbstractC3831.m6874(this.f1850, c0522.f1850);
    }

    public final int hashCode() {
        int iM8672 = AbstractC5078.m8672(Float.hashCode(this.f1852) * 31, 31, this.f1851);
        C2772 c2772 = this.f1850;
        return (iM8672 + (c2772 == null ? 0 : c2772.hashCode())) * 31;
    }

    public final String toString() {
        return "RowColumnParentData(weight=" + this.f1852 + ", fill=" + this.f1851 + ", crossAxisAlignment=" + this.f1850 + ", flowLayoutData=null)";
    }
}
