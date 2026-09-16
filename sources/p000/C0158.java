package p000;

/* JADX INFO: renamed from: ۥؐۖؗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0158 {

    /* JADX INFO: renamed from: ۥؗ */
    public final int f597;

    /* JADX INFO: renamed from: ۥُ */
    public final int f598;

    /* JADX INFO: renamed from: ۥّ */
    public final float f599;

    /* JADX INFO: renamed from: ۥۗ */
    public final int f600;

    /* JADX INFO: renamed from: ۥۣ */
    public final C4303 f601;

    /* JADX INFO: renamed from: ۦؑ */
    public final int f602;

    /* JADX INFO: renamed from: ۦۙ */
    public final float f603;

    public C0158(C4303 c4303, int i, int i2, int i3, int i4, float f, float f2) {
        this.f601 = c4303;
        this.f600 = i;
        this.f597 = i2;
        this.f602 = i3;
        this.f598 = i4;
        this.f599 = f;
        this.f603 = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0158) {
            C0158 c0158 = (C0158) obj;
            if (this.f601 == c0158.f601 && this.f600 == c0158.f600 && this.f597 == c0158.f597 && this.f602 == c0158.f602 && this.f598 == c0158.f598 && Float.compare(this.f599, c0158.f599) == 0 && Float.compare(this.f603, c0158.f603) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f603) + AbstractC3761.m6635(this.f599, AbstractC2049.m3999(this.f598, AbstractC2049.m3999(this.f602, AbstractC2049.m3999(this.f597, AbstractC2049.m3999(this.f600, this.f601.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphInfo(paragraph=");
        sb.append(this.f601);
        sb.append(", startIndex=");
        sb.append(this.f600);
        sb.append(", endIndex=");
        sb.append(this.f597);
        sb.append(", startLineIndex=");
        sb.append(this.f602);
        sb.append(", endLineIndex=");
        sb.append(this.f598);
        sb.append(", top=");
        sb.append(this.f599);
        sb.append(", bottom=");
        return AbstractC3761.m6639(sb, this.f603, ')');
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final C2793 m339(C2793 c2793) {
        float f = -this.f599;
        return c2793.m5323((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L));
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final long m340(long j, boolean z) {
        if (z) {
            long j2 = C3346.f11196;
            if (C3346.m6110(j, j2)) {
                return j2;
            }
        }
        int i = C3346.f11195;
        int i2 = this.f600;
        return AbstractC2765.m5145(((int) (j >> 32)) + i2, ((int) (j & 4294967295L)) + i2);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final C2793 m341(C2793 c2793) {
        return c2793.m5323((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(this.f599)) & 4294967295L));
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final int m342(int i) {
        int i2 = this.f597;
        int i3 = this.f600;
        return AbstractC4554.m7934(i, i3, i2) - i3;
    }
}
