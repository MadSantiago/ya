package p000;

/* JADX INFO: renamed from: ۦٖؔؑٓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3208 extends AbstractC3008 {

    /* JADX INFO: renamed from: ۥؗ */
    public final float f10760;

    /* JADX INFO: renamed from: ۥُ */
    public final float f10761;

    /* JADX INFO: renamed from: ۥّ */
    public final float f10762;

    /* JADX INFO: renamed from: ۥۜ */
    public final float f10763;

    /* JADX INFO: renamed from: ۦؑ */
    public final float f10764;

    /* JADX INFO: renamed from: ۦۙ */
    public final float f10765;

    public C3208(float f, float f2, float f3, float f4, float f5, float f6) {
        super(2);
        this.f10760 = f;
        this.f10764 = f2;
        this.f10761 = f3;
        this.f10762 = f4;
        this.f10765 = f5;
        this.f10763 = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3208)) {
            return false;
        }
        C3208 c3208 = (C3208) obj;
        return Float.compare(this.f10760, c3208.f10760) == 0 && Float.compare(this.f10764, c3208.f10764) == 0 && Float.compare(this.f10761, c3208.f10761) == 0 && Float.compare(this.f10762, c3208.f10762) == 0 && Float.compare(this.f10765, c3208.f10765) == 0 && Float.compare(this.f10763, c3208.f10763) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f10763) + AbstractC3761.m6635(this.f10765, AbstractC3761.m6635(this.f10762, AbstractC3761.m6635(this.f10761, AbstractC3761.m6635(this.f10764, Float.hashCode(this.f10760) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeCurveTo(dx1=");
        sb.append(this.f10760);
        sb.append(", dy1=");
        sb.append(this.f10764);
        sb.append(", dx2=");
        sb.append(this.f10761);
        sb.append(", dy2=");
        sb.append(this.f10762);
        sb.append(", dx3=");
        sb.append(this.f10765);
        sb.append(", dy3=");
        return AbstractC3761.m6639(sb, this.f10763, ')');
    }
}
