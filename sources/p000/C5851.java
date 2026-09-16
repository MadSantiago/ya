package p000;

import java.util.List;

/* JADX INFO: renamed from: ۦۧٗؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5851 {

    /* JADX INFO: renamed from: ۥؗ */
    public final C1911 f19284;

    /* JADX INFO: renamed from: ۥُ */
    public final int f19285;

    /* JADX INFO: renamed from: ۥّ */
    public final long f19286;

    /* JADX INFO: renamed from: ۥۗ */
    public final List f19287;

    /* JADX INFO: renamed from: ۥۜ */
    public final Object f19288;

    /* JADX INFO: renamed from: ۥۣ */
    public final int f19289;

    /* JADX INFO: renamed from: ۦؑ */
    public final EnumC2459 f19290;

    /* JADX INFO: renamed from: ۦؚ */
    public final int f19291;

    /* JADX INFO: renamed from: ۦٌ */
    public final int f19292;

    /* JADX INFO: renamed from: ۦِ */
    public int f19293;

    /* JADX INFO: renamed from: ۦٛ */
    public final C0474 f19294;

    /* JADX INFO: renamed from: ۦۗ */
    public final int f19295;

    /* JADX INFO: renamed from: ۦۙ */
    public final Object f19296;

    /* JADX INFO: renamed from: ۦۚ */
    public boolean f19297;

    /* JADX INFO: renamed from: ۦ۟ */
    public final int[] f19298;

    /* JADX INFO: renamed from: ۦۨ */
    public int f19299 = Integer.MIN_VALUE;

    public C5851(int i, List list, C1911 c1911, EnumC2459 enumC2459, int i2, int i3, int i4, long j, Object obj, Object obj2, C0474 c0474, long j2) {
        this.f19289 = i;
        this.f19287 = list;
        this.f19284 = c1911;
        this.f19290 = enumC2459;
        this.f19285 = i4;
        this.f19286 = j;
        this.f19296 = obj;
        this.f19288 = obj2;
        this.f19294 = c0474;
        int size = list.size();
        int i5 = 0;
        int iMax = 0;
        for (int i6 = 0; i6 < size; i6++) {
            AbstractC0275 abstractC0275 = (AbstractC0275) list.get(i6);
            i5 += abstractC0275.f984;
            iMax = Math.max(iMax, abstractC0275.f985);
        }
        this.f19295 = i5;
        int i7 = i5 + this.f19285;
        this.f19291 = i7 >= 0 ? i7 : 0;
        this.f19292 = iMax;
        this.f19298 = new int[this.f19287.size() * 2];
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final void m9675(int i, int i2, int i3) {
        this.f19293 = i;
        this.f19299 = i3;
        List list = this.f19287;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            AbstractC0275 abstractC0275 = (AbstractC0275) list.get(i4);
            int i5 = i4 * 2;
            C1911 c1911 = this.f19284;
            if (c1911 == null) {
                AbstractC4690.m8037("null horizontalAlignment when isVertical == true");
                C1078.m2274();
                return;
            }
            int iM3748 = c1911.m3748(abstractC0275.f985, i2, this.f19290);
            int[] iArr = this.f19298;
            iArr[i5] = iM3748;
            iArr[i5 + 1] = i;
            i += abstractC0275.f984;
        }
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final void m9676(AbstractC1842 abstractC1842) {
        if (this.f19299 == Integer.MIN_VALUE) {
            AbstractC4690.m8038("position() should be called first");
        }
        List list = this.f19287;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            AbstractC0275 abstractC0275 = (AbstractC0275) list.get(i);
            int i2 = abstractC0275.f984;
            long jM9677 = m9677(i);
            AbstractC2049.m4001(((C3262) this.f19294.f1727).m6027(this.f19296));
            AbstractC1842.m3622(abstractC1842, abstractC0275, C0873.m1861(jM9677, this.f19286));
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final long m9677(int i) {
        if (i == 0 && this.f19287.size() == 0) {
            return ((long) this.f19293) & 4294967295L;
        }
        int i2 = i * 2;
        int[] iArr = this.f19298;
        int i3 = iArr[i2];
        return (((long) iArr[i2 + 1]) & 4294967295L) | (((long) i3) << 32);
    }
}
