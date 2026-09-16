package p000;

/* JADX INFO: renamed from: ۥًٔؓؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1327 {

    /* JADX INFO: renamed from: ۥۜ */
    public static final long f4589;

    /* JADX INFO: renamed from: ۦِ */
    public static final long f4591;

    /* JADX INFO: renamed from: ۦٛ */
    public static final long f4592;

    /* JADX INFO: renamed from: ۦۗ */
    public static final /* synthetic */ int f4593 = 0;

    /* JADX INFO: renamed from: ۥۣ */
    public final long f4595;

    /* JADX INFO: renamed from: ۥۗ */
    public static final long f4588 = AbstractC4225.m7443(4278190080L);

    /* JADX INFO: renamed from: ۥؗ */
    public static final long f4585 = AbstractC4225.m7443(4282664004L);

    /* JADX INFO: renamed from: ۦؑ */
    public static final long f4590 = AbstractC4225.m7443(4287137928L);

    /* JADX INFO: renamed from: ۥُ */
    public static final long f4586 = AbstractC4225.m7443(4291611852L);

    /* JADX INFO: renamed from: ۥّ */
    public static final long f4587 = AbstractC4225.m7443(4294967295L);

    /* JADX INFO: renamed from: ۦۙ */
    public static final long f4594 = AbstractC4225.m7443(4294901760L);

    static {
        AbstractC4225.m7443(4278255360L);
        f4589 = AbstractC4225.m7443(4278190335L);
        AbstractC4225.m7443(4294967040L);
        AbstractC4225.m7443(4278255615L);
        AbstractC4225.m7443(4294902015L);
        f4592 = AbstractC4225.m7468(0);
        f4591 = AbstractC4225.m7438(0.0f, 0.0f, 0.0f, 0.0f, C3444.f11444);
    }

    public /* synthetic */ C1327(long j) {
        this.f4595 = j;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public static final float m2823(long j) {
        float fM4132;
        float f;
        if ((63 & j) == 0) {
            fM4132 = (float) AbstractC2133.m4132((j >>> 56) & 255);
            f = 255.0f;
        } else {
            fM4132 = (float) AbstractC2133.m4132((j >>> 6) & 1023);
            f = 1023.0f;
        }
        return fM4132 / f;
    }

    /* JADX INFO: renamed from: ۥُ */
    public static final AbstractC3292 m2824(long j) {
        float[] fArr = C3444.f11438;
        return C3444.f11434[(int) (j & 63)];
    }

    /* JADX INFO: renamed from: ۥّ */
    public static final float m2825(long j) {
        int i;
        int i2;
        int i3;
        if ((63 & j) == 0) {
            return ((float) AbstractC2133.m4132((j >>> 40) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 32) & 65535);
        int i4 = Short.MIN_VALUE & s;
        int i5 = ((65535 & s) >>> 10) & 31;
        int i6 = s & 1023;
        if (i5 != 0) {
            int i7 = i6 << 13;
            if (i5 == 31) {
                i = 255;
                if (i7 != 0) {
                    i7 |= 4194304;
                }
            } else {
                i = i5 + 112;
            }
            int i8 = i;
            i2 = i7;
            i3 = i8;
        } else {
            if (i6 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - AbstractC4221.f14001;
                return i4 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static long m2826(long j, float f, int i) {
        if ((i & 1) != 0) {
            f = m2823(j);
        }
        return AbstractC4225.m7438(m2830(j), m2825(j), m2829(j), f, m2824(j));
    }

    /* JADX INFO: renamed from: ۥۜ */
    public static String m2827(long j) {
        StringBuilder sb = new StringBuilder("Color(");
        sb.append(m2830(j));
        sb.append(", ");
        sb.append(m2825(j));
        sb.append(", ");
        sb.append(m2829(j));
        sb.append(", ");
        sb.append(m2823(j));
        sb.append(", ");
        return AbstractC5078.m8678(sb, m2824(j).f11028, ')');
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static final long m2828(long j, AbstractC3292 abstractC3292) {
        C0269 c0269M6788;
        AbstractC3292 abstractC3292M2824 = m2824(j);
        int i = abstractC3292M2824.f11026;
        int i2 = abstractC3292.f11026;
        if ((i | i2) < 0) {
            c0269M6788 = AbstractC3801.m6788(abstractC3292M2824, abstractC3292);
        } else {
            C4912 c4912 = AbstractC3669.f12264;
            int i3 = i | (i2 << 6);
            Object objM9571 = c4912.m9571(i3);
            if (objM9571 == null) {
                objM9571 = AbstractC3801.m6788(abstractC3292M2824, abstractC3292);
                c4912.m8319(i3, objM9571);
            }
            c0269M6788 = (C0269) objM9571;
        }
        return c0269M6788.mo562(j);
    }

    /* JADX INFO: renamed from: ۦؑ */
    public static final float m2829(long j) {
        int i;
        int i2;
        int i3;
        if ((63 & j) == 0) {
            return ((float) AbstractC2133.m4132((j >>> 32) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 16) & 65535);
        int i4 = Short.MIN_VALUE & s;
        int i5 = ((65535 & s) >>> 10) & 31;
        int i6 = s & 1023;
        if (i5 != 0) {
            int i7 = i6 << 13;
            if (i5 == 31) {
                i = 255;
                if (i7 != 0) {
                    i7 |= 4194304;
                }
            } else {
                i = i5 + 112;
            }
            int i8 = i;
            i2 = i7;
            i3 = i8;
        } else {
            if (i6 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - AbstractC4221.f14001;
                return i4 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    /* JADX INFO: renamed from: ۦۙ */
    public static final float m2830(long j) {
        int i;
        int i2;
        int i3;
        if ((63 & j) == 0) {
            return ((float) AbstractC2133.m4132((j >>> 48) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 48) & 65535);
        int i4 = Short.MIN_VALUE & s;
        int i5 = ((65535 & s) >>> 10) & 31;
        int i6 = s & 1023;
        if (i5 != 0) {
            int i7 = i6 << 13;
            if (i5 == 31) {
                i = 255;
                if (i7 != 0) {
                    i7 |= 4194304;
                }
            } else {
                i = i5 + 112;
            }
            int i8 = i;
            i2 = i7;
            i3 = i8;
        } else {
            if (i6 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - AbstractC4221.f14001;
                return i4 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1327) {
            return this.f4595 == ((C1327) obj).f4595;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f4595);
    }

    public final String toString() {
        return m2827(this.f4595);
    }
}
