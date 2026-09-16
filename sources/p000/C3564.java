package p000;

/* JADX INFO: renamed from: ۦؙؙؗٔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3564 {

    /* JADX INFO: renamed from: ۦؑ */
    public static final C3564 f11800 = new C3564(0, 0, null, 0, 0, 0, null, null, 16777215);

    /* JADX INFO: renamed from: ۥؗ */
    public final C0507 f11801;

    /* JADX INFO: renamed from: ۥۗ */
    public final C0477 f11802;

    /* JADX INFO: renamed from: ۥۣ */
    public final C0553 f11803;

    /* JADX WARN: Illegal instructions before constructor call */
    public C3564(long j, long j2, C1626 c1626, long j3, int i, long j4, C0507 c0507, C1220 c1220, int i2) {
        long j5 = (i2 & 1) != 0 ? C1327.f4591 : j;
        long j6 = (i2 & 2) != 0 ? C5023.f16620 : j2;
        C1626 c1627 = (i2 & 4) != 0 ? null : c1626;
        C3277 c3277 = (i2 & 32) != 0 ? null : AbstractC0903.f3246;
        long j7 = (i2 & 128) != 0 ? C5023.f16620 : j3;
        long j8 = C1327.f4591;
        int i3 = (32768 & i2) != 0 ? 0 : i;
        long j9 = (131072 & i2) != 0 ? C5023.f16620 : j4;
        C0507 c0508 = (524288 & i2) != 0 ? null : c0507;
        C1220 c1221 = (i2 & 1048576) != 0 ? null : c1220;
        C0507 c0509 = c0508;
        this(new C0553(j5, j6, c1627, (C5827) null, (C2848) null, c3277, (String) null, j7, (C3917) null, (C5647) null, (C5668) null, j8, (C1690) null, (C5906) null, c0508 != null ? c0508.f1828 : null), new C0477(i3, 0, j9, null, c0509 != null ? c0509.f1827 : null, c1221, 0, 0, null), c0509);
    }

    /* JADX INFO: renamed from: ۥُ */
    public static C3564 m6356(C3564 c3564, long j, long j2, C1626 c1626, long j3, int i, long j4, int i2) {
        long j5 = (i2 & 2) != 0 ? C5023.f16620 : j2;
        C1626 c1627 = (i2 & 4) != 0 ? null : c1626;
        long j6 = (i2 & 128) != 0 ? C5023.f16620 : j3;
        long j7 = C1327.f4591;
        int i3 = (32768 & i2) != 0 ? 0 : i;
        long j8 = (i2 & 131072) != 0 ? C5023.f16620 : j4;
        C0553 c0553M8743 = AbstractC5118.m8743(c3564.f11803, j, null, Float.NaN, j5, c1627, null, null, null, null, j6, null, null, null, j7, null, null, null, null);
        C0477 c0477M7996 = AbstractC4594.m7996(c3564.f11802, i3, 0, j8, null, null, null, 0, 0, null);
        return (c3564.f11803 == c0553M8743 && c3564.f11802 == c0477M7996) ? c3564 : new C3564(c0553M8743, c0477M7996);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static C3564 m6357(C3564 c3564, long j, long j2, C1626 c1626, AbstractC0903 abstractC0903, long j3, long j4, C0507 c0507, C1220 c1220, int i) {
        InterfaceC5561 c4268;
        long jMo3548 = (i & 1) != 0 ? c3564.f11803.f1989.mo3548() : j;
        long j5 = (i & 2) != 0 ? c3564.f11803.f1987 : j2;
        C1626 c1627 = (i & 4) != 0 ? c3564.f11803.f1984 : c1626;
        C0553 c0553 = c3564.f11803;
        C5827 c5827 = c0553.f1990;
        C2848 c2848 = c0553.f1985;
        AbstractC0903 abstractC0904 = (i & 32) != 0 ? c0553.f1986 : abstractC0903;
        String str = c0553.f1996;
        long j6 = (i & 128) != 0 ? c0553.f1988 : j3;
        C3917 c3917 = c0553.f1994;
        C5647 c5647 = c0553.f1993;
        C5668 c5668 = c0553.f1995;
        long j7 = c0553.f1991;
        C1690 c1690 = c0553.f1992;
        C5906 c5906 = c0553.f1997;
        AbstractC0213 abstractC0213 = c0553.f1998;
        int i2 = (i & 32768) != 0 ? c3564.f11802.f1736 : 3;
        C0477 c0477 = c3564.f11802;
        int i3 = c0477.f1734;
        long j8 = (i & 131072) != 0 ? c0477.f1731 : j4;
        C4755 c4755 = c0477.f1737;
        C0507 c0508 = (i & 524288) != 0 ? c3564.f11801 : c0507;
        C1220 c1221 = (i & 1048576) != 0 ? c0477.f1733 : c1220;
        int i4 = c0477.f1739;
        int i5 = c0477.f1735;
        C2309 c2309 = c0477.f1738;
        long jMo3549 = c0553.f1989.mo3548();
        int i6 = C1327.f4593;
        if (C4462.m7744(jMo3548, jMo3549)) {
            c4268 = c0553.f1989;
        } else {
            c4268 = jMo3548 != 16 ? new C4268(jMo3548) : C1752.f5825;
        }
        return new C3564(new C0553(c4268, j5, c1627, c5827, c2848, abstractC0904, str, j6, c3917, c5647, c5668, j7, c1690, c5906, c0508 != null ? c0508.f1828 : null, abstractC0213), new C0477(i2, i3, j8, c4755, c0508 != null ? c0508.f1827 : null, c1221, i4, i5, c2309), c0508);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3564)) {
            return false;
        }
        C3564 c3564 = (C3564) obj;
        return AbstractC3831.m6874(this.f11803, c3564.f11803) && AbstractC3831.m6874(this.f11802, c3564.f11802) && AbstractC3831.m6874(this.f11801, c3564.f11801);
    }

    public final int hashCode() {
        int iHashCode = (this.f11802.hashCode() + (this.f11803.hashCode() * 31)) * 31;
        C0507 c0507 = this.f11801;
        return iHashCode + (c0507 != null ? c0507.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextStyle(color=");
        sb.append((Object) C1327.m2827(m6359()));
        sb.append(", brush=");
        C0553 c0553 = this.f11803;
        sb.append(c0553.f1989.mo3547());
        sb.append(", alpha=");
        sb.append(c0553.f1989.mo3549());
        sb.append(", fontSize=");
        sb.append((Object) C5023.m8441(c0553.f1987));
        sb.append(", fontWeight=");
        sb.append(c0553.f1984);
        sb.append(", fontStyle=");
        sb.append(c0553.f1990);
        sb.append(", fontSynthesis=");
        sb.append(c0553.f1985);
        sb.append(", fontFamily=");
        sb.append(c0553.f1986);
        sb.append(", fontFeatureSettings=");
        sb.append(c0553.f1996);
        sb.append(", letterSpacing=");
        sb.append((Object) C5023.m8441(c0553.f1988));
        sb.append(", baselineShift=");
        sb.append(c0553.f1994);
        sb.append(", textGeometricTransform=");
        sb.append(c0553.f1993);
        sb.append(", localeList=");
        sb.append(c0553.f1995);
        sb.append(", background=");
        AbstractC5078.m8677(c0553.f1991, sb, ", textDecoration=");
        sb.append(c0553.f1992);
        sb.append(", shadow=");
        sb.append(c0553.f1997);
        sb.append(", drawStyle=");
        sb.append(c0553.f1998);
        sb.append(", textAlign=");
        C0477 c0477 = this.f11802;
        sb.append((Object) C4202.m7425(c0477.f1736));
        sb.append(", textDirection=");
        sb.append((Object) C4740.m8061(c0477.f1734));
        sb.append(", lineHeight=");
        sb.append((Object) C5023.m8441(c0477.f1731));
        sb.append(", textIndent=");
        sb.append(c0477.f1737);
        sb.append(", platformStyle=");
        sb.append(this.f11801);
        sb.append(", lineHeightStyle=");
        sb.append(c0477.f1733);
        sb.append(", lineBreak=");
        sb.append((Object) C2591.m4891(c0477.f1739));
        sb.append(", hyphens=");
        sb.append((Object) C1723.m3542(c0477.f1735));
        sb.append(", textMotion=");
        sb.append(c0477.f1738);
        sb.append(')');
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final boolean m6358(C3564 c3564) {
        if (this != c3564) {
            return AbstractC3831.m6874(this.f11802, c3564.f11802) && this.f11803.m1244(c3564.f11803);
        }
        return true;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final long m6359() {
        return this.f11803.f1989.mo3548();
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final C3564 m6360(C3564 c3564) {
        return (c3564 == null || c3564.equals(f11800)) ? this : new C3564(this.f11803.m1242(c3564.f11803), this.f11802.m1026(c3564.f11802));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C3564(C0553 c0553, C0477 c0477) {
        C2393 c2393 = c0553.f1999;
        C0823 c0823 = c0477.f1732;
        this(c0553, c0477, (c2393 == null && c0823 == null) ? null : new C0507(c2393, c0823));
    }

    public C3564(C0553 c0553, C0477 c0477, C0507 c0507) {
        this.f11803 = c0553;
        this.f11802 = c0477;
        this.f11801 = c0507;
    }
}
