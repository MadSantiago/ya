package p000;

/* JADX INFO: renamed from: ۥًؗؓۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0596 extends AbstractC3008 {

    /* JADX INFO: renamed from: ۥؗ */
    public final float f2201;

    /* JADX INFO: renamed from: ۥُ */
    public final float f2202;

    /* JADX INFO: renamed from: ۥّ */
    public final boolean f2203;

    /* JADX INFO: renamed from: ۥۜ */
    public final float f2204;

    /* JADX INFO: renamed from: ۦؑ */
    public final float f2205;

    /* JADX INFO: renamed from: ۦٛ */
    public final float f2206;

    /* JADX INFO: renamed from: ۦۙ */
    public final boolean f2207;

    public C0596(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        super(3);
        this.f2201 = f;
        this.f2205 = f2;
        this.f2202 = f3;
        this.f2203 = z;
        this.f2207 = z2;
        this.f2204 = f4;
        this.f2206 = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0596)) {
            return false;
        }
        C0596 c0596 = (C0596) obj;
        return Float.compare(this.f2201, c0596.f2201) == 0 && Float.compare(this.f2205, c0596.f2205) == 0 && Float.compare(this.f2202, c0596.f2202) == 0 && this.f2203 == c0596.f2203 && this.f2207 == c0596.f2207 && Float.compare(this.f2204, c0596.f2204) == 0 && Float.compare(this.f2206, c0596.f2206) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f2206) + AbstractC3761.m6635(this.f2204, AbstractC5078.m8672(AbstractC5078.m8672(AbstractC3761.m6635(this.f2202, AbstractC3761.m6635(this.f2205, Float.hashCode(this.f2201) * 31, 31), 31), 31, this.f2203), 31, this.f2207), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeArcTo(horizontalEllipseRadius=");
        sb.append(this.f2201);
        sb.append(", verticalEllipseRadius=");
        sb.append(this.f2205);
        sb.append(", theta=");
        sb.append(this.f2202);
        sb.append(", isMoreThanHalf=");
        sb.append(this.f2203);
        sb.append(", isPositiveArc=");
        sb.append(this.f2207);
        sb.append(", arcStartDx=");
        sb.append(this.f2204);
        sb.append(", arcStartDy=");
        return AbstractC3761.m6639(sb, this.f2206, ')');
    }
}
