package p000;

/* JADX INFO: renamed from: ۦٔؑٔٔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4154 extends AbstractC0106 {

    /* JADX INFO: renamed from: ۥؗ */
    public static final C4154 f13841 = new C4154(C1438.f4929);

    @Override // p000.AbstractC0026
    /* JADX INFO: renamed from: ۥۜ */
    public final int mo539(Object obj) {
        return ((int[]) obj).length;
    }

    @Override // p000.AbstractC5224, p000.AbstractC0026
    /* JADX INFO: renamed from: ۦِ */
    public final void mo540(InterfaceC5308 interfaceC5308, int i, Object obj) {
        C1503 c1503 = (C1503) obj;
        int iMo5158 = interfaceC5308.mo5158(this.f423, i);
        c1503.mo2857(c1503.mo2859() + 1);
        int[] iArr = c1503.f5111;
        int i2 = c1503.f5110;
        c1503.f5110 = i2 + 1;
        iArr[i2] = iMo5158;
    }

    @Override // p000.AbstractC0026
    /* JADX INFO: renamed from: ۦۗ */
    public final Object mo541(Object obj) {
        int[] iArr = (int[]) obj;
        C1503 c1503 = new C1503();
        c1503.f5111 = iArr;
        c1503.f5110 = iArr.length;
        c1503.mo2857(10);
        return c1503;
    }

    @Override // p000.AbstractC0106
    /* JADX INFO: renamed from: ۦۚ */
    public final Object mo201() {
        return new int[0];
    }

    @Override // p000.AbstractC0106
    /* JADX INFO: renamed from: ۦۨ */
    public final void mo202(C3782 c3782, Object obj, int i) {
        int[] iArr = (int[]) obj;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            c3782.m6685(this.f423, i2);
            c3782.m6695(i3);
        }
    }
}
