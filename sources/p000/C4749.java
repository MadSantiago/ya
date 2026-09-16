package p000;

/* JADX INFO: renamed from: ۦٝؕٚؐ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4749 extends AbstractC0106 {

    /* JADX INFO: renamed from: ۥؗ */
    public static final C4749 f15680 = new C4749(C0839.f3000);

    @Override // p000.AbstractC0026
    /* JADX INFO: renamed from: ۥۜ */
    public final int mo539(Object obj) {
        return ((double[]) obj).length;
    }

    @Override // p000.AbstractC5224, p000.AbstractC0026
    /* JADX INFO: renamed from: ۦِ */
    public final void mo540(InterfaceC5308 interfaceC5308, int i, Object obj) {
        C3349 c3349 = (C3349) obj;
        double dMo5164 = interfaceC5308.mo5164(this.f423, i);
        c3349.mo2857(c3349.mo2859() + 1);
        double[] dArr = c3349.f11200;
        int i2 = c3349.f11199;
        c3349.f11199 = i2 + 1;
        dArr[i2] = dMo5164;
    }

    @Override // p000.AbstractC0026
    /* JADX INFO: renamed from: ۦۗ */
    public final Object mo541(Object obj) {
        double[] dArr = (double[]) obj;
        C3349 c3349 = new C3349();
        c3349.f11200 = dArr;
        c3349.f11199 = dArr.length;
        c3349.mo2857(10);
        return c3349;
    }

    @Override // p000.AbstractC0106
    /* JADX INFO: renamed from: ۦۚ */
    public final Object mo201() {
        return new double[0];
    }

    @Override // p000.AbstractC0106
    /* JADX INFO: renamed from: ۦۨ */
    public final void mo202(C3782 c3782, Object obj, int i) {
        double[] dArr = (double[]) obj;
        for (int i2 = 0; i2 < i; i2++) {
            double d = dArr[i2];
            c3782.m6685(this.f423, i2);
            c3782.m6684(d);
        }
    }
}
