package p000;

/* JADX INFO: renamed from: ۥؕؖٗؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0477 implements InterfaceC1116 {

    /* JADX INFO: renamed from: ۥؗ */
    public final long f1731;

    /* JADX INFO: renamed from: ۥُ */
    public final C0823 f1732;

    /* JADX INFO: renamed from: ۥّ */
    public final C1220 f1733;

    /* JADX INFO: renamed from: ۥۗ */
    public final int f1734;

    /* JADX INFO: renamed from: ۥۜ */
    public final int f1735;

    /* JADX INFO: renamed from: ۥۣ */
    public final int f1736;

    /* JADX INFO: renamed from: ۦؑ */
    public final C4755 f1737;

    /* JADX INFO: renamed from: ۦٛ */
    public final C2309 f1738;

    /* JADX INFO: renamed from: ۦۙ */
    public final int f1739;

    public C0477(int i, int i2, long j, C4755 c4755, C0823 c0823, C1220 c1220, int i3, int i4, C2309 c2309) {
        this.f1736 = i;
        this.f1734 = i2;
        this.f1731 = j;
        this.f1737 = c4755;
        this.f1732 = c0823;
        this.f1733 = c1220;
        this.f1739 = i3;
        this.f1735 = i4;
        this.f1738 = c2309;
        C3970[] c3970Arr = C5023.f16621;
        if (C5023.m8440(j, C5023.f16620)) {
            return;
        }
        if (C5023.m8438(j) >= 0.0f) {
            return;
        }
        AbstractC3767.m6643("lineHeight can't be negative (" + C5023.m8438(j) + ')');
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0477)) {
            return false;
        }
        C0477 c0477 = (C0477) obj;
        return this.f1736 == c0477.f1736 && this.f1734 == c0477.f1734 && C5023.m8440(this.f1731, c0477.f1731) && AbstractC3831.m6874(this.f1737, c0477.f1737) && AbstractC3831.m6874(this.f1732, c0477.f1732) && AbstractC3831.m6874(this.f1733, c0477.f1733) && this.f1739 == c0477.f1739 && this.f1735 == c0477.f1735 && AbstractC3831.m6874(this.f1738, c0477.f1738);
    }

    public final int hashCode() {
        int iM3999 = AbstractC2049.m3999(this.f1734, Integer.hashCode(this.f1736) * 31, 31);
        C3970[] c3970Arr = C5023.f16621;
        int iM6626 = AbstractC3761.m6626(iM3999, 31, this.f1731);
        C4755 c4755 = this.f1737;
        int iHashCode = (iM6626 + (c4755 != null ? c4755.hashCode() : 0)) * 31;
        C0823 c0823 = this.f1732;
        int iHashCode2 = (iHashCode + (c0823 != null ? c0823.hashCode() : 0)) * 31;
        C1220 c1220 = this.f1733;
        int iM39910 = AbstractC2049.m3999(this.f1735, AbstractC2049.m3999(this.f1739, (iHashCode2 + (c1220 != null ? c1220.hashCode() : 0)) * 31, 31), 31);
        C2309 c2309 = this.f1738;
        return iM39910 + (c2309 != null ? c2309.hashCode() : 0);
    }

    public final String toString() {
        return "ParagraphStyle(textAlign=" + ((Object) C4202.m7425(this.f1736)) + ", textDirection=" + ((Object) C4740.m8061(this.f1734)) + ", lineHeight=" + ((Object) C5023.m8441(this.f1731)) + ", textIndent=" + this.f1737 + ", platformStyle=" + this.f1732 + ", lineHeightStyle=" + this.f1733 + ", lineBreak=" + ((Object) C2591.m4891(this.f1739)) + ", hyphens=" + ((Object) C1723.m3542(this.f1735)) + ", textMotion=" + this.f1738 + ')';
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final C0477 m1026(C0477 c0477) {
        return c0477 == null ? this : AbstractC4594.m7996(this, c0477.f1736, c0477.f1734, c0477.f1731, c0477.f1737, c0477.f1732, c0477.f1733, c0477.f1739, c0477.f1735, c0477.f1738);
    }
}
