package p000;

/* JADX INFO: renamed from: ۦٞؕٞۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4803 extends AbstractC0106 {

    /* JADX INFO: renamed from: ۥؗ */
    public static final C4803 f15842 = new C4803(C2716.f9007);

    @Override // p000.AbstractC0026
    /* JADX INFO: renamed from: ۥۜ */
    public final int mo539(Object obj) {
        return ((float[]) obj).length;
    }

    @Override // p000.AbstractC5224, p000.AbstractC0026
    /* JADX INFO: renamed from: ۦِ */
    public final void mo540(InterfaceC5308 interfaceC5308, int i, Object obj) {
        C1741 c1741 = (C1741) obj;
        float fMo5161 = interfaceC5308.mo5161(this.f423, i);
        c1741.mo2857(c1741.mo2859() + 1);
        float[] fArr = c1741.f5777;
        int i2 = c1741.f5776;
        c1741.f5776 = i2 + 1;
        fArr[i2] = fMo5161;
    }

    @Override // p000.AbstractC0026
    /* JADX INFO: renamed from: ۦۗ */
    public final Object mo541(Object obj) {
        float[] fArr = (float[]) obj;
        C1741 c1741 = new C1741();
        c1741.f5777 = fArr;
        c1741.f5776 = fArr.length;
        c1741.mo2857(10);
        return c1741;
    }

    @Override // p000.AbstractC0106
    /* JADX INFO: renamed from: ۦۚ */
    public final Object mo201() {
        return new float[0];
    }

    @Override // p000.AbstractC0106
    /* JADX INFO: renamed from: ۦۨ */
    public final void mo202(C3782 c3782, Object obj, int i) {
        float[] fArr = (float[]) obj;
        for (int i2 = 0; i2 < i; i2++) {
            float f = fArr[i2];
            c3782.m6685(this.f423, i2);
            c3782.m6698(f);
        }
    }
}
