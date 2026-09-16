package p000;

/* JADX INFO: renamed from: ۦۣٖۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5626 extends AbstractC3008 {

    /* JADX INFO: renamed from: ۥؗ */
    public final float f18545;

    /* JADX INFO: renamed from: ۥُ */
    public final float f18546;

    /* JADX INFO: renamed from: ۥّ */
    public final boolean f18547;

    /* JADX INFO: renamed from: ۥۜ */
    public final float f18548;

    /* JADX INFO: renamed from: ۦؑ */
    public final float f18549;

    /* JADX INFO: renamed from: ۦٛ */
    public final float f18550;

    /* JADX INFO: renamed from: ۦۙ */
    public final boolean f18551;

    public C5626(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        super(3);
        this.f18545 = f;
        this.f18549 = f2;
        this.f18546 = f3;
        this.f18547 = z;
        this.f18551 = z2;
        this.f18548 = f4;
        this.f18550 = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5626)) {
            return false;
        }
        C5626 c5626 = (C5626) obj;
        return Float.compare(this.f18545, c5626.f18545) == 0 && Float.compare(this.f18549, c5626.f18549) == 0 && Float.compare(this.f18546, c5626.f18546) == 0 && this.f18547 == c5626.f18547 && this.f18551 == c5626.f18551 && Float.compare(this.f18548, c5626.f18548) == 0 && Float.compare(this.f18550, c5626.f18550) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f18550) + AbstractC3761.m6635(this.f18548, AbstractC5078.m8672(AbstractC5078.m8672(AbstractC3761.m6635(this.f18546, AbstractC3761.m6635(this.f18549, Float.hashCode(this.f18545) * 31, 31), 31), 31, this.f18547), 31, this.f18551), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ArcTo(horizontalEllipseRadius=");
        sb.append(this.f18545);
        sb.append(", verticalEllipseRadius=");
        sb.append(this.f18549);
        sb.append(", theta=");
        sb.append(this.f18546);
        sb.append(", isMoreThanHalf=");
        sb.append(this.f18547);
        sb.append(", isPositiveArc=");
        sb.append(this.f18551);
        sb.append(", arcStartX=");
        sb.append(this.f18548);
        sb.append(", arcStartY=");
        return AbstractC3761.m6639(sb, this.f18550, ')');
    }
}
