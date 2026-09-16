package p000;

/* JADX INFO: renamed from: ۥؕٞ٘, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0501 extends AbstractC3008 {

    /* JADX INFO: renamed from: ۥؗ */
    public final float f1811;

    /* JADX INFO: renamed from: ۥُ */
    public final float f1812;

    /* JADX INFO: renamed from: ۥّ */
    public final float f1813;

    /* JADX INFO: renamed from: ۦؑ */
    public final float f1814;

    public C0501(float f, float f2, float f3, float f4) {
        super(1);
        this.f1811 = f;
        this.f1814 = f2;
        this.f1812 = f3;
        this.f1813 = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0501)) {
            return false;
        }
        C0501 c0501 = (C0501) obj;
        return Float.compare(this.f1811, c0501.f1811) == 0 && Float.compare(this.f1814, c0501.f1814) == 0 && Float.compare(this.f1812, c0501.f1812) == 0 && Float.compare(this.f1813, c0501.f1813) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f1813) + AbstractC3761.m6635(this.f1812, AbstractC3761.m6635(this.f1814, Float.hashCode(this.f1811) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeQuadTo(dx1=");
        sb.append(this.f1811);
        sb.append(", dy1=");
        sb.append(this.f1814);
        sb.append(", dx2=");
        sb.append(this.f1812);
        sb.append(", dy2=");
        return AbstractC3761.m6639(sb, this.f1813, ')');
    }
}
