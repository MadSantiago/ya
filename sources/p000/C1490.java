package p000;

/* JADX INFO: renamed from: ۥًٖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1490 extends AbstractC0106 {

    /* JADX INFO: renamed from: ۥؗ */
    public static final C1490 f5061 = new C1490(C1252.f4313);

    @Override // p000.AbstractC0026
    /* JADX INFO: renamed from: ۥۜ */
    public final int mo539(Object obj) {
        return ((short[]) obj).length;
    }

    @Override // p000.AbstractC5224, p000.AbstractC0026
    /* JADX INFO: renamed from: ۦِ */
    public final void mo540(InterfaceC5308 interfaceC5308, int i, Object obj) {
        C5095 c5095 = (C5095) obj;
        short sMo5157 = interfaceC5308.mo5157(this.f423, i);
        c5095.mo2857(c5095.mo2859() + 1);
        short[] sArr = c5095.f16891;
        int i2 = c5095.f16890;
        c5095.f16890 = i2 + 1;
        sArr[i2] = sMo5157;
    }

    @Override // p000.AbstractC0026
    /* JADX INFO: renamed from: ۦۗ */
    public final Object mo541(Object obj) {
        short[] sArr = (short[]) obj;
        C5095 c5095 = new C5095();
        c5095.f16891 = sArr;
        c5095.f16890 = sArr.length;
        c5095.mo2857(10);
        return c5095;
    }

    @Override // p000.AbstractC0106
    /* JADX INFO: renamed from: ۦۚ */
    public final Object mo201() {
        return new short[0];
    }

    @Override // p000.AbstractC0106
    /* JADX INFO: renamed from: ۦۨ */
    public final void mo202(C3782 c3782, Object obj, int i) {
        short[] sArr = (short[]) obj;
        for (int i2 = 0; i2 < i; i2++) {
            short s = sArr[i2];
            c3782.m6685(this.f423, i2);
            c3782.m6700(s);
        }
    }
}
