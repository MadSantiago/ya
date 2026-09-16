package p000;

/* JADX INFO: renamed from: ۥُِؚؓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1093 {

    /* JADX INFO: renamed from: ۥؗ */
    public int f3838;

    /* JADX INFO: renamed from: ۥُ */
    public int f3839;

    /* JADX INFO: renamed from: ۥۗ */
    public int f3840;

    /* JADX INFO: renamed from: ۥۣ */
    public final C0835 f3841;

    /* JADX INFO: renamed from: ۦؑ */
    public int f3842;

    public C1093(C1249 c1249, long j) {
        String str = c1249.f4307;
        C0835 c0835 = new C0835();
        c0835.f2980 = str;
        c0835.f2978 = -1;
        c0835.f2976 = -1;
        this.f3841 = c0835;
        this.f3840 = C3346.m6109(j);
        this.f3838 = C3346.m6108(j);
        this.f3842 = -1;
        this.f3839 = -1;
        int iM6109 = C3346.m6109(j);
        int iM6108 = C3346.m6108(j);
        if (iM6109 < 0 || iM6109 > str.length()) {
            C5028.m8444(str.length(), AbstractC5078.m8680(iM6109, "start (", ") offset is outside of text region "));
            throw null;
        }
        if (iM6108 < 0 || iM6108 > str.length()) {
            C5028.m8444(str.length(), AbstractC5078.m8680(iM6108, "end (", ") offset is outside of text region "));
            throw null;
        }
        if (iM6109 <= iM6108) {
            return;
        }
        C1078.m2272(AbstractC5078.m8679("Do not set reversed range: ", iM6109, iM6108, " > "));
        throw null;
    }

    public final String toString() {
        return this.f3841.toString();
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final C3346 m2307() {
        int i = this.f3842;
        if (i != -1) {
            return new C3346(AbstractC2765.m5145(i, this.f3839));
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥُ */
    public final void m2308(int i, int i2) {
        C0835 c0835 = this.f3841;
        if (i < 0 || i > c0835.m1730()) {
            C5028.m8444(c0835.m1730(), AbstractC5078.m8680(i, "start (", ") offset is outside of text region "));
        } else if (i2 < 0 || i2 > c0835.m1730()) {
            C5028.m8444(c0835.m1730(), AbstractC5078.m8680(i2, "end (", ") offset is outside of text region "));
        } else if (i >= i2) {
            C1078.m2272(AbstractC5078.m8679("Do not set reversed or empty range: ", i, i2, " > "));
        } else {
            this.f3842 = i;
            this.f3839 = i2;
        }
    }

    /* JADX INFO: renamed from: ۥّ */
    public final void m2309(int i, int i2) {
        C0835 c0835 = this.f3841;
        if (i < 0 || i > c0835.m1730()) {
            C5028.m8444(c0835.m1730(), AbstractC5078.m8680(i, "start (", ") offset is outside of text region "));
        } else if (i2 < 0 || i2 > c0835.m1730()) {
            C5028.m8444(c0835.m1730(), AbstractC5078.m8680(i2, "end (", ") offset is outside of text region "));
        } else if (i > i2) {
            C1078.m2272(AbstractC5078.m8679("Do not set reversed range: ", i, i2, " > "));
        } else {
            m2311(i);
            m2314(i2);
        }
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final char m2310(int i) {
        C0835 c0835 = this.f3841;
        C4902 c4902 = (C4902) c0835.f2977;
        if (c4902 == null) {
            return ((String) c0835.f2980).charAt(i);
        }
        if (i < c0835.f2978) {
            return ((String) c0835.f2980).charAt(i);
        }
        int iM8245 = c4902.f16168 - c4902.m8245();
        int i2 = c0835.f2978;
        if (i >= iM8245 + i2) {
            return ((String) c0835.f2980).charAt(i - ((iM8245 - c0835.f2976) + i2));
        }
        int i3 = i - i2;
        int i4 = c4902.f16166;
        char[] cArr = (char[]) c4902.f16167;
        return i3 < i4 ? cArr[i3] : cArr[(i3 - i4) + c4902.f16170];
    }

    /* JADX INFO: renamed from: ۥۜ */
    public final void m2311(int i) {
        if (!(i >= 0)) {
            AbstractC3767.m6644("Cannot set selectionStart to a negative value: " + i);
        }
        this.f3840 = i;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m2312(int i, int i2) {
        long jM5145 = AbstractC2765.m5145(i, i2);
        this.f3841.m1738(i, i2, "");
        long jM3425 = AbstractC1631.m3425(AbstractC2765.m5145(this.f3840, this.f3838), jM5145);
        m2311(C3346.m6109(jM3425));
        m2314(C3346.m6108(jM3425));
        int i3 = this.f3842;
        if (i3 != -1) {
            long jM3426 = AbstractC1631.m3425(AbstractC2765.m5145(i3, this.f3839), jM5145);
            if (C3346.m6107(jM3426)) {
                this.f3842 = -1;
                this.f3839 = -1;
            } else {
                this.f3842 = C3346.m6109(jM3426);
                this.f3839 = C3346.m6108(jM3426);
            }
        }
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final void m2313(int i, int i2, String str) {
        C0835 c0835 = this.f3841;
        if (i < 0 || i > c0835.m1730()) {
            C5028.m8444(c0835.m1730(), AbstractC5078.m8680(i, "start (", ") offset is outside of text region "));
            return;
        }
        if (i2 < 0 || i2 > c0835.m1730()) {
            C5028.m8444(c0835.m1730(), AbstractC5078.m8680(i2, "end (", ") offset is outside of text region "));
        } else {
            if (i > i2) {
                C1078.m2272(AbstractC5078.m8679("Do not set reversed range: ", i, i2, " > "));
                return;
            }
            c0835.m1738(i, i2, str);
            m2311(str.length() + i);
            m2314(str.length() + i);
            this.f3842 = -1;
            this.f3839 = -1;
        }
    }

    /* JADX INFO: renamed from: ۦۙ */
    public final void m2314(int i) {
        if (!(i >= 0)) {
            AbstractC3767.m6644("Cannot set selectionEnd to a negative value: " + i);
        }
        this.f3838 = i;
    }
}
