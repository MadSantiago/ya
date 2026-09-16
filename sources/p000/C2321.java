package p000;

/* JADX INFO: renamed from: ۥٍۛؔٗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2321 {

    /* JADX INFO: renamed from: ۥؗ */
    public final C0079 f7674;

    /* JADX INFO: renamed from: ۥُ */
    public long f7675;

    /* JADX INFO: renamed from: ۥّ */
    public long f7676;

    /* JADX INFO: renamed from: ۥۗ */
    public final C3896 f7677;

    /* JADX INFO: renamed from: ۥۜ */
    public final /* synthetic */ C1545 f7678;

    /* JADX INFO: renamed from: ۥۣ */
    public final int f7679;

    /* JADX INFO: renamed from: ۦؑ */
    public C2321 f7680;

    /* JADX INFO: renamed from: ۦۙ */
    public long f7681 = Long.MIN_VALUE;

    public C2321(C1545 c1545, int i, C3896 c3896, C0079 c0079) {
        this.f7678 = c1545;
        this.f7679 = i;
        this.f7677 = c3896;
        this.f7674 = c0079;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final void m4364() {
        C1545 c1545 = this.f7678;
        C4912 c4912 = c1545.f5226;
        int i = this.f7679;
        C2321 c2321 = (C2321) c4912.m8320(i);
        if (c2321 != null) {
            if (c2321 == this) {
                C2321 c2322 = this.f7680;
                this.f7680 = null;
                if (c2322 == null) {
                    C0605 c0605M9270 = AbstractC5537.m9270(this.f7677.f17791);
                    if (c0605M9270.f2269) {
                        ((ViewTreeObserverOnGlobalLayoutListenerC0850) AbstractC5359.m8951(c0605M9270)).getRectManager().f18006.m6309(c0605M9270.f2273, false);
                        return;
                    }
                    return;
                }
                int iM8318 = c4912.m8318(i);
                Object[] objArr = c4912.f18945;
                Object obj = objArr[iM8318];
                c4912.f18947[iM8318] = i;
                objArr[iM8318] = c2322;
                return;
            }
            int iM8319 = c4912.m8318(i);
            Object[] objArr2 = c4912.f18945;
            Object obj2 = objArr2[iM8319];
            c4912.f18947[iM8319] = i;
            objArr2[iM8319] = c2321;
            while (true) {
                C2321 c2323 = c2321.f7680;
                if (c2323 == null) {
                    break;
                }
                if (c2323 == this) {
                    c2321.f7680 = this.f7680;
                    this.f7680 = null;
                    return;
                }
                c2321 = c2323;
            }
        }
        C2321 c2324 = c1545.f5225;
        if (c2324 == this) {
            c1545.f5225 = c2324.f7680;
            this.f7680 = null;
            return;
        }
        C2321 c2325 = c2324 != null ? c2324.f7680 : null;
        while (true) {
            C2321 c2326 = c2324;
            c2324 = c2325;
            if (c2324 == null) {
                return;
            }
            if (c2324 == this) {
                if (c2326 != null) {
                    c2326.f7680 = c2324.f7680;
                }
                this.f7680 = null;
                return;
            }
            c2325 = c2324.f7680;
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m4365(long j, long j2, long j3, long j4, float[] fArr) {
        C3732 c3732;
        C3732 c3733;
        long j5 = this.f7678.f5224;
        C3896 c3896 = this.f7677;
        AbstractC1311 abstractC1311M9245 = AbstractC5537.m9245(c3896, 2);
        C0605 c0605M9270 = AbstractC5537.m9270(c3896);
        boolean zM1342 = c0605M9270.m1342();
        C2457 c2457 = c0605M9270.f2256;
        if (zM1342) {
            if (((AbstractC1311) c2457.f8201) != abstractC1311M9245) {
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits((int) (j >> 32)) << 32);
                abstractC1311M9245.getClass();
                long j6 = abstractC1311M9245.f982;
                AbstractC1311 abstractC1311 = (AbstractC1311) c2457.f8201;
                abstractC1311.getClass();
                long jM8635 = C5063.m8635(abstractC1311.mo2781(abstractC1311M9245, jFloatToRawIntBits));
                c3732 = new C3732(jM8635, (4294967295L & ((long) (((int) (jM8635 & 4294967295L)) + ((int) (j6 & 4294967295L))))) | (((long) (((int) (jM8635 >> 32)) + ((int) (j6 >> 32)))) << 32), j3, j4, j5, fArr, c3896);
            } else {
                c3732 = new C3732(j, j2, j3, j4, j5, fArr, c3896);
            }
            c3733 = c3732;
        } else {
            c3733 = null;
        }
        if (c3733 == null) {
            return;
        }
        this.f7674.mo211(c3733);
    }
}
