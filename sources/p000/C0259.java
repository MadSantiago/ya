package p000;

/* JADX INFO: renamed from: ۥؒؔ۟ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0259 extends AbstractC0106 {

    /* JADX INFO: renamed from: ۥؗ */
    public static final C0259 f958 = new C0259(C0160.f611);

    @Override // p000.AbstractC0026
    /* JADX INFO: renamed from: ۥۜ */
    public final int mo539(Object obj) {
        return ((C5576) obj).f18404.length;
    }

    @Override // p000.AbstractC5224, p000.AbstractC0026
    /* JADX INFO: renamed from: ۦِ */
    public final void mo540(InterfaceC5308 interfaceC5308, int i, Object obj) {
        C1816 c1816 = (C1816) obj;
        int iMo4116 = interfaceC5308.mo5154(this.f423, i).mo4116();
        c1816.mo2857(c1816.mo2859() + 1);
        int[] iArr = c1816.f6040;
        int i2 = c1816.f6039;
        c1816.f6039 = i2 + 1;
        iArr[i2] = iMo4116;
    }

    @Override // p000.AbstractC0026
    /* JADX INFO: renamed from: ۦۗ */
    public final Object mo541(Object obj) {
        int[] iArr = ((C5576) obj).f18404;
        C1816 c1816 = new C1816();
        c1816.f6040 = iArr;
        c1816.f6039 = iArr.length;
        c1816.mo2857(10);
        return c1816;
    }

    @Override // p000.AbstractC0106
    /* JADX INFO: renamed from: ۦۚ */
    public final Object mo201() {
        return new C5576(new int[0]);
    }

    @Override // p000.AbstractC0106
    /* JADX INFO: renamed from: ۦۨ */
    public final void mo202(C3782 c3782, Object obj, int i) {
        int[] iArr = ((C5576) obj).f18404;
        for (int i2 = 0; i2 < i; i2++) {
            c3782.m6696(this.f423, i2).m6695(iArr[i2]);
        }
    }
}
