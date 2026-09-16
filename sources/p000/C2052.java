package p000;

/* JADX INFO: renamed from: ۥۖؓٓؒ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2052 extends AbstractC3008 {

    /* JADX INFO: renamed from: ۥؗ */
    public final float f6761;

    /* JADX INFO: renamed from: ۥُ */
    public final float f6762;

    /* JADX INFO: renamed from: ۥّ */
    public final float f6763;

    /* JADX INFO: renamed from: ۥۜ */
    public final float f6764;

    /* JADX INFO: renamed from: ۦؑ */
    public final float f6765;

    /* JADX INFO: renamed from: ۦۙ */
    public final float f6766;

    public C2052(float f, float f2, float f3, float f4, float f5, float f6) {
        super(2);
        this.f6761 = f;
        this.f6765 = f2;
        this.f6762 = f3;
        this.f6763 = f4;
        this.f6766 = f5;
        this.f6764 = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2052)) {
            return false;
        }
        C2052 c2052 = (C2052) obj;
        return Float.compare(this.f6761, c2052.f6761) == 0 && Float.compare(this.f6765, c2052.f6765) == 0 && Float.compare(this.f6762, c2052.f6762) == 0 && Float.compare(this.f6763, c2052.f6763) == 0 && Float.compare(this.f6766, c2052.f6766) == 0 && Float.compare(this.f6764, c2052.f6764) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f6764) + AbstractC3761.m6635(this.f6766, AbstractC3761.m6635(this.f6763, AbstractC3761.m6635(this.f6762, AbstractC3761.m6635(this.f6765, Float.hashCode(this.f6761) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CurveTo(x1=");
        sb.append(this.f6761);
        sb.append(", y1=");
        sb.append(this.f6765);
        sb.append(", x2=");
        sb.append(this.f6762);
        sb.append(", y2=");
        sb.append(this.f6763);
        sb.append(", x3=");
        sb.append(this.f6766);
        sb.append(", y3=");
        return AbstractC3761.m6639(sb, this.f6764, ')');
    }
}
