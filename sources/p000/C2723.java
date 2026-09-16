package p000;

import java.util.Map;

/* JADX INFO: renamed from: ۥۥؒۗٗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2723 implements InterfaceC5370 {

    /* JADX INFO: renamed from: ۥؗ */
    public final /* synthetic */ C0851 f9019;

    /* JADX INFO: renamed from: ۥُ */
    public final /* synthetic */ InterfaceC5370 f9020;

    /* JADX INFO: renamed from: ۥۗ */
    public final /* synthetic */ InterfaceC5370 f9021;

    /* JADX INFO: renamed from: ۥۣ */
    public final /* synthetic */ int f9022;

    /* JADX INFO: renamed from: ۦؑ */
    public final /* synthetic */ int f9023;

    public /* synthetic */ C2723(InterfaceC5370 interfaceC5370, C0851 c0851, int i, InterfaceC5370 interfaceC5371, int i2) {
        this.f9022 = i2;
        this.f9019 = c0851;
        this.f9023 = i;
        this.f9020 = interfaceC5371;
        this.f9021 = interfaceC5370;
    }

    @Override // p000.InterfaceC5370
    /* JADX INFO: renamed from: ۥؗ */
    public final int mo618() {
        switch (this.f9022) {
            case 0:
                break;
        }
        return this.f9021.mo618();
    }

    @Override // p000.InterfaceC5370
    /* JADX INFO: renamed from: ۥُ */
    public final int mo619() {
        switch (this.f9022) {
            case 0:
                break;
        }
        return this.f9021.mo619();
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0089  */
    /* JADX WARN: Code duplicated, block: B:32:0x0095 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x0097 A[LOOP:0: B:11:0x002f->B:33:0x0097, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:36:0x009a A[SYNTHETIC] */
    @Override // p000.InterfaceC5370
    /* JADX INFO: renamed from: ۥۗ */
    public final void mo620() {
        int i = this.f9022;
        InterfaceC5370 interfaceC5370 = this.f9020;
        int i2 = this.f9023;
        C0851 c0851 = this.f9019;
        switch (i) {
            case 0:
                c0851.f3143 = i2;
                interfaceC5370.mo620();
                C0863 c0863 = c0851.f3140;
                C3262 c3262 = c0851.f3141;
                long[] jArr = c3262.f10948;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    while (true) {
                        long j = jArr[i3];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i4 = 8;
                            int i5 = 8 - ((~(i3 - length)) >>> 31);
                            int i6 = 0;
                            while (i6 < i5) {
                                if ((255 & j) < 128) {
                                    int i7 = (i3 << 3) + i6;
                                    Object obj = c3262.f10947[i7];
                                    InterfaceC0712 interfaceC0712 = (InterfaceC0712) c3262.f10944[i7];
                                    int iM1849 = c0863.m1849(obj);
                                    if (iM1849 < 0 || iM1849 >= c0851.f3143) {
                                        if (iM1849 >= 0) {
                                            Object obj2 = AbstractC0186.f685;
                                            Object[] objArr = c0863.f3182;
                                            Object obj3 = objArr[iM1849];
                                            objArr[iM1849] = obj2;
                                        }
                                        if (c0851.f3150.m6018(obj)) {
                                            interfaceC0712.mo1579();
                                        }
                                        c3262.m6022(i7);
                                    } else {
                                        i4 = i4;
                                    }
                                } else {
                                    i4 = i4;
                                }
                                j >>= i4;
                                i6++;
                                i4 = i4;
                            }
                            if (i5 == i4) {
                                if (i3 != length) {
                                    i3++;
                                }
                            }
                        } else if (i3 != length) {
                            i3++;
                        }
                    }
                }
                c0851.m1805(c0851.f3145);
                break;
            default:
                c0851.f3145 = i2;
                interfaceC5370.mo620();
                if (c0851.f3155.f2271 == null) {
                    c0851.m1805(c0851.f3145);
                }
                break;
        }
    }

    @Override // p000.InterfaceC5370
    /* JADX INFO: renamed from: ۥۣ */
    public final Map mo621() {
        switch (this.f9022) {
            case 0:
                break;
        }
        return this.f9021.mo621();
    }

    @Override // p000.InterfaceC5370
    /* JADX INFO: renamed from: ۦؑ */
    public final InterfaceC4745 mo2711() {
        switch (this.f9022) {
            case 0:
                break;
        }
        return this.f9021.mo2711();
    }
}
