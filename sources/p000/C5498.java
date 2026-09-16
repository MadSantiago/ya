package p000;

/* JADX INFO: renamed from: ۦَۡؗۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5498 extends AbstractC1355 {

    /* JADX INFO: renamed from: ۥؗ */
    public final int f18156;

    /* JADX INFO: renamed from: ۥۗ */
    public final int f18157;

    /* JADX INFO: renamed from: ۥۣ */
    public final String f18158;

    /* JADX INFO: renamed from: ۦؑ */
    public final boolean f18159;

    public C5498(int i, int i2, String str, boolean z) {
        this.f18158 = str;
        this.f18157 = i;
        this.f18156 = i2;
        this.f18159 = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1355) {
            C5498 c5498 = (C5498) ((AbstractC1355) obj);
            if (this.f18158.equals(c5498.f18158) && this.f18157 == c5498.f18157 && this.f18156 == c5498.f18156 && this.f18159 == c5498.f18159) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f18159 ? 1231 : 1237) ^ ((((((this.f18158.hashCode() ^ 1000003) * 1000003) ^ this.f18157) * 1000003) ^ this.f18156) * 1000003);
    }

    public final String toString() {
        return "ProcessDetails{processName=" + this.f18158 + ", pid=" + this.f18157 + ", importance=" + this.f18156 + ", defaultProcess=" + this.f18159 + "}";
    }
}
