package p000;

/* JADX INFO: renamed from: ۥۦٜؗٝ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2831 extends AbstractC0106 {

    /* JADX INFO: renamed from: ۥؗ */
    public static final C2831 f9466 = new C2831(C2788.f9293);

    @Override // p000.AbstractC0026
    /* JADX INFO: renamed from: ۥۜ */
    public final int mo539(Object obj) {
        return ((long[]) obj).length;
    }

    @Override // p000.AbstractC5224, p000.AbstractC0026
    /* JADX INFO: renamed from: ۦِ */
    public final void mo540(InterfaceC5308 interfaceC5308, int i, Object obj) {
        C1608 c1608 = (C1608) obj;
        long jMo5155 = interfaceC5308.mo5155(this.f423, i);
        c1608.mo2857(c1608.mo2859() + 1);
        long[] jArr = c1608.f5405;
        int i2 = c1608.f5404;
        c1608.f5404 = i2 + 1;
        jArr[i2] = jMo5155;
    }

    @Override // p000.AbstractC0026
    /* JADX INFO: renamed from: ۦۗ */
    public final Object mo541(Object obj) {
        long[] jArr = (long[]) obj;
        C1608 c1608 = new C1608();
        c1608.f5405 = jArr;
        c1608.f5404 = jArr.length;
        c1608.mo2857(10);
        return c1608;
    }

    @Override // p000.AbstractC0106
    /* JADX INFO: renamed from: ۦۚ */
    public final Object mo201() {
        return new long[0];
    }

    @Override // p000.AbstractC0106
    /* JADX INFO: renamed from: ۦۨ */
    public final void mo202(C3782 c3782, Object obj, int i) {
        long[] jArr = (long[]) obj;
        for (int i2 = 0; i2 < i; i2++) {
            long j = jArr[i2];
            c3782.m6685(this.f423, i2);
            c3782.m6697(j);
        }
    }
}
