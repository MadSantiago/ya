package p000;

import java.util.List;

/* JADX INFO: renamed from: ۦِؐؗۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3000 {

    /* JADX INFO: renamed from: ۥؗ */
    public final long f10081;

    /* JADX INFO: renamed from: ۥُ */
    public final C4274 f10082;

    /* JADX INFO: renamed from: ۥّ */
    public final EnumC2459 f10083;

    /* JADX INFO: renamed from: ۥۗ */
    public final List f10084;

    /* JADX INFO: renamed from: ۥۜ */
    public final int f10085;

    /* JADX INFO: renamed from: ۥۣ */
    public final int f10086;

    /* JADX INFO: renamed from: ۦؑ */
    public final Object f10087;

    /* JADX INFO: renamed from: ۦِ */
    public int f10088;

    /* JADX INFO: renamed from: ۦٛ */
    public final int[] f10089;

    /* JADX INFO: renamed from: ۦۗ */
    public int f10090;

    /* JADX INFO: renamed from: ۦۙ */
    public final boolean f10091 = false;

    public C3000(int i, int i2, List list, long j, Object obj, C4274 c4274, EnumC2459 enumC2459) {
        this.f10086 = i;
        this.f10084 = list;
        this.f10081 = j;
        this.f10087 = obj;
        this.f10082 = c4274;
        this.f10083 = enumC2459;
        int size = list.size();
        int iMax = 0;
        for (int i3 = 0; i3 < size; i3++) {
            AbstractC0275 abstractC0275 = (AbstractC0275) list.get(i3);
            iMax = Math.max(iMax, !this.f10091 ? abstractC0275.f984 : abstractC0275.f985);
        }
        this.f10085 = iMax;
        this.f10089 = new int[this.f10084.size() * 2];
        this.f10090 = Integer.MIN_VALUE;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final void m5589(int i, int i2, int i3) {
        int i4;
        this.f10088 = i;
        boolean z = this.f10091;
        this.f10090 = z ? i3 : i2;
        List list = this.f10084;
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            AbstractC0275 abstractC0275 = (AbstractC0275) list.get(i5);
            int i6 = i5 * 2;
            int[] iArr = this.f10089;
            if (z) {
                iArr[i6] = Math.round((1.0f + (this.f10083 != EnumC2459.f8215 ? 0.0f * (-1.0f) : 0.0f)) * ((i2 - abstractC0275.f985) / 2.0f));
                iArr[i6 + 1] = i;
                i4 = abstractC0275.f984;
            } else {
                iArr[i6] = i;
                iArr[i6 + 1] = this.f10082.m7577(abstractC0275.f984, i3);
                i4 = abstractC0275.f985;
            }
            i += i4;
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m5590(int i) {
        this.f10088 += i;
        int[] iArr = this.f10089;
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            boolean z = this.f10091;
            if ((z && i2 % 2 == 1) || (!z && i2 % 2 == 0)) {
                iArr[i2] = iArr[i2] + i;
            }
        }
    }
}
