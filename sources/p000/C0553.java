package p000;

/* JADX INFO: renamed from: ۥٕؖؖۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0553 implements InterfaceC1116 {

    /* JADX INFO: renamed from: ۥؗ */
    public final C1626 f1984;

    /* JADX INFO: renamed from: ۥُ */
    public final C2848 f1985;

    /* JADX INFO: renamed from: ۥّ */
    public final AbstractC0903 f1986;

    /* JADX INFO: renamed from: ۥۗ */
    public final long f1987;

    /* JADX INFO: renamed from: ۥۜ */
    public final long f1988;

    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC5561 f1989;

    /* JADX INFO: renamed from: ۦؑ */
    public final C5827 f1990;

    /* JADX INFO: renamed from: ۦؚ */
    public final long f1991;

    /* JADX INFO: renamed from: ۦٌ */
    public final C1690 f1992;

    /* JADX INFO: renamed from: ۦِ */
    public final C5647 f1993;

    /* JADX INFO: renamed from: ۦٛ */
    public final C3917 f1994;

    /* JADX INFO: renamed from: ۦۗ */
    public final C5668 f1995;

    /* JADX INFO: renamed from: ۦۙ */
    public final String f1996;

    /* JADX INFO: renamed from: ۦۚ */
    public final C5906 f1997;

    /* JADX INFO: renamed from: ۦ۟ */
    public final AbstractC0213 f1998;

    /* JADX INFO: renamed from: ۦۨ */
    public final C2393 f1999;

    public C0553(long j, long j2, C1626 c1626, C5827 c5827, C2848 c2848, AbstractC0903 abstractC0903, String str, long j3, C3917 c3917, C5647 c5647, C5668 c5668, long j4, C1690 c1690, C5906 c5906, int i) {
        this((i & 1) != 0 ? C1327.f4591 : j, (i & 2) != 0 ? C5023.f16620 : j2, (i & 4) != 0 ? null : c1626, (i & 8) != 0 ? null : c5827, (i & 16) != 0 ? null : c2848, (i & 32) != 0 ? null : abstractC0903, (i & 64) != 0 ? null : str, (i & 128) != 0 ? C5023.f16620 : j3, (i & 256) != 0 ? null : c3917, (i & 512) != 0 ? null : c5647, (i & 1024) != 0 ? null : c5668, (i & 2048) != 0 ? C1327.f4591 : j4, (i & 4096) != 0 ? null : c1690, (i & 8192) != 0 ? null : c5906, (C2393) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0553)) {
            return false;
        }
        C0553 c0553 = (C0553) obj;
        return m1244(c0553) && m1243(c0553);
    }

    public final int hashCode() {
        InterfaceC5561 interfaceC5561 = this.f1989;
        long jMo3548 = interfaceC5561.mo3548();
        int i = C1327.f4593;
        int iHashCode = Long.hashCode(jMo3548) * 31;
        AbstractC0548 abstractC0548Mo3547 = interfaceC5561.mo3547();
        int iHashCode2 = (Float.hashCode(interfaceC5561.mo3549()) + ((iHashCode + (abstractC0548Mo3547 != null ? abstractC0548Mo3547.hashCode() : 0)) * 31)) * 31;
        C3970[] c3970Arr = C5023.f16621;
        int iM6626 = AbstractC3761.m6626(iHashCode2, 31, this.f1987);
        C1626 c1626 = this.f1984;
        int i2 = (iM6626 + (c1626 != null ? c1626.f5444 : 0)) * 31;
        C5827 c5827 = this.f1990;
        int iHashCode3 = (i2 + (c5827 != null ? Integer.hashCode(c5827.f19197) : 0)) * 31;
        C2848 c2848 = this.f1985;
        int iHashCode4 = (iHashCode3 + (c2848 != null ? Integer.hashCode(c2848.f9512) : 0)) * 31;
        AbstractC0903 abstractC0903 = this.f1986;
        int iHashCode5 = (iHashCode4 + (abstractC0903 != null ? abstractC0903.hashCode() : 0)) * 31;
        String str = this.f1996;
        int iM6627 = AbstractC3761.m6626((iHashCode5 + (str != null ? str.hashCode() : 0)) * 31, 31, this.f1988);
        C3917 c3917 = this.f1994;
        int iHashCode6 = (iM6627 + (c3917 != null ? Float.hashCode(c3917.f13058) : 0)) * 31;
        C5647 c5647 = this.f1993;
        int iHashCode7 = (iHashCode6 + (c5647 != null ? c5647.hashCode() : 0)) * 31;
        C5668 c5668 = this.f1995;
        int iM6628 = AbstractC3761.m6626((iHashCode7 + (c5668 != null ? c5668.f18646.hashCode() : 0)) * 31, 31, this.f1991);
        C1690 c1690 = this.f1992;
        int i3 = (iM6628 + (c1690 != null ? c1690.f5637 : 0)) * 31;
        C5906 c5906 = this.f1997;
        int iHashCode8 = (i3 + (c5906 != null ? c5906.hashCode() : 0)) * 31;
        C2393 c2393 = this.f1999;
        int iHashCode9 = (iHashCode8 + (c2393 != null ? c2393.hashCode() : 0)) * 31;
        AbstractC0213 abstractC0213 = this.f1998;
        return iHashCode9 + (abstractC0213 != null ? abstractC0213.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpanStyle(color=");
        InterfaceC5561 interfaceC5561 = this.f1989;
        sb.append((Object) C1327.m2827(interfaceC5561.mo3548()));
        sb.append(", brush=");
        sb.append(interfaceC5561.mo3547());
        sb.append(", alpha=");
        sb.append(interfaceC5561.mo3549());
        sb.append(", fontSize=");
        sb.append((Object) C5023.m8441(this.f1987));
        sb.append(", fontWeight=");
        sb.append(this.f1984);
        sb.append(", fontStyle=");
        sb.append(this.f1990);
        sb.append(", fontSynthesis=");
        sb.append(this.f1985);
        sb.append(", fontFamily=");
        sb.append(this.f1986);
        sb.append(", fontFeatureSettings=");
        sb.append(this.f1996);
        sb.append(", letterSpacing=");
        sb.append((Object) C5023.m8441(this.f1988));
        sb.append(", baselineShift=");
        sb.append(this.f1994);
        sb.append(", textGeometricTransform=");
        sb.append(this.f1993);
        sb.append(", localeList=");
        sb.append(this.f1995);
        sb.append(", background=");
        AbstractC5078.m8677(this.f1991, sb, ", textDecoration=");
        sb.append(this.f1992);
        sb.append(", shadow=");
        sb.append(this.f1997);
        sb.append(", platformStyle=");
        sb.append(this.f1999);
        sb.append(", drawStyle=");
        sb.append(this.f1998);
        sb.append(')');
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final C0553 m1242(C0553 c0553) {
        if (c0553 == null) {
            return this;
        }
        InterfaceC5561 interfaceC5561 = c0553.f1989;
        return AbstractC5118.m8743(this, interfaceC5561.mo3548(), interfaceC5561.mo3547(), interfaceC5561.mo3549(), c0553.f1987, c0553.f1984, c0553.f1990, c0553.f1985, c0553.f1986, c0553.f1996, c0553.f1988, c0553.f1994, c0553.f1993, c0553.f1995, c0553.f1991, c0553.f1992, c0553.f1997, c0553.f1999, c0553.f1998);
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final boolean m1243(C0553 c0553) {
        return AbstractC3831.m6874(this.f1989, c0553.f1989) && AbstractC3831.m6874(this.f1992, c0553.f1992) && AbstractC3831.m6874(this.f1997, c0553.f1997) && AbstractC3831.m6874(this.f1998, c0553.f1998);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final boolean m1244(C0553 c0553) {
        if (this == c0553) {
            return true;
        }
        if (!C5023.m8440(this.f1987, c0553.f1987) || !AbstractC3831.m6874(this.f1984, c0553.f1984) || !AbstractC3831.m6874(this.f1990, c0553.f1990) || !AbstractC3831.m6874(this.f1985, c0553.f1985) || !AbstractC3831.m6874(this.f1986, c0553.f1986) || !AbstractC3831.m6874(this.f1996, c0553.f1996) || !C5023.m8440(this.f1988, c0553.f1988) || !AbstractC3831.m6874(this.f1994, c0553.f1994) || !AbstractC3831.m6874(this.f1993, c0553.f1993) || !AbstractC3831.m6874(this.f1995, c0553.f1995)) {
            return false;
        }
        long j = c0553.f1991;
        int i = C1327.f4593;
        return C4462.m7744(this.f1991, j) && AbstractC3831.m6874(this.f1999, c0553.f1999);
    }

    public C0553(InterfaceC5561 interfaceC5561, long j, C1626 c1626, C5827 c5827, C2848 c2848, AbstractC0903 abstractC0903, String str, long j2, C3917 c3917, C5647 c5647, C5668 c5668, long j3, C1690 c1690, C5906 c5906, C2393 c2393, AbstractC0213 abstractC0213) {
        this.f1989 = interfaceC5561;
        this.f1987 = j;
        this.f1984 = c1626;
        this.f1990 = c5827;
        this.f1985 = c2848;
        this.f1986 = abstractC0903;
        this.f1996 = str;
        this.f1988 = j2;
        this.f1994 = c3917;
        this.f1993 = c5647;
        this.f1995 = c5668;
        this.f1991 = j3;
        this.f1992 = c1690;
        this.f1997 = c5906;
        this.f1999 = c2393;
        this.f1998 = abstractC0213;
    }

    public C0553(long j, long j2, C1626 c1626, C5827 c5827, C2848 c2848, AbstractC0903 abstractC0903, String str, long j3, C3917 c3917, C5647 c5647, C5668 c5668, long j4, C1690 c1690, C5906 c5906, C2393 c2393) {
        InterfaceC5561 c4268;
        if (j != 16) {
            c4268 = new C4268(j);
        } else {
            c4268 = C1752.f5825;
        }
        this(c4268, j2, c1626, c5827, c2848, abstractC0903, str, j3, c3917, c5647, c5668, j4, c1690, c5906, c2393, null);
    }
}
