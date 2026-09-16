package p000;

/* JADX INFO: renamed from: ۦٗؑ۟ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4342 {

    /* JADX INFO: renamed from: ۥۗ */
    public static final C4342 f14328;

    /* JADX INFO: renamed from: ۥۣ */
    public final AbstractC1425 f14329;

    static {
        int i = AbstractC1425.f4897;
        f14328 = new C4342(C2912.f9705);
    }

    public C4342(AbstractC1425 abstractC1425) {
        this.f14329 = abstractC1425;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static C4342 m7637(AbstractC4650 abstractC4650) throws C5463 {
        String strMo4606;
        long j;
        C5105 c5105;
        int iMo4615 = abstractC4650.mo4615();
        if (iMo4615 < 0) {
            C2316.m4358("Negative number of flags");
            return null;
        }
        int i = AbstractC1425.f4897;
        C3094 c3094 = new C3094(4);
        long j2 = 0;
        for (int i2 = 0; i2 < iMo4615; i2++) {
            long jMo4613 = abstractC4650.mo4613();
            int i3 = (int) jMo4613;
            long j3 = jMo4613 >>> 3;
            if (j3 == 0) {
                j = 0;
                strMo4606 = abstractC4650.mo4606();
            } else {
                long j4 = j3 + j2;
                if (j4 > 2305843009213693951L) {
                    C2316.m4358("Flag name larger than max size");
                    return null;
                }
                strMo4606 = null;
                j = j4;
            }
            int i4 = i3 & 7;
            if (i4 == 0 || i4 == 1) {
                c5105 = new C5105(j, strMo4606, i4, 0L, null);
            } else if (i4 == 2) {
                c5105 = new C5105(j, strMo4606, i4, abstractC4650.mo4613(), null);
            } else if (i4 == 3) {
                c5105 = new C5105(j, strMo4606, i4, Double.doubleToRawLongBits(abstractC4650.mo4627()), null);
            } else if (i4 == 4) {
                c5105 = new C5105(j, strMo4606, i4, 0L, abstractC4650.mo4606());
            } else {
                if (i4 != 5) {
                    C2316.m4358(AbstractC5078.m8673(i4, "Unrecognized flag type ", new StringBuilder(String.valueOf(i4).length() + 23)));
                    return null;
                }
                c5105 = new C5105(j, strMo4606, i4, 0L, abstractC4650.mo4595());
            }
            long j5 = c5105.f16948;
            if (j5 != 0) {
                j2 = j5;
            }
            c3094.m5683(c5105);
        }
        return new C4342(c3094.m5681());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4342)) {
            return false;
        }
        return this.f14329.equals(((C4342) obj).f14329);
    }

    public final int hashCode() {
        AbstractC1425 abstractC1425 = this.f14329;
        abstractC1425.getClass();
        return AbstractC2552.m4829(abstractC1425);
    }
}
