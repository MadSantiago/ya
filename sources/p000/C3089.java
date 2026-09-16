package p000;

/* JADX INFO: renamed from: ۦٖؒؒٔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3089 extends AbstractC0106 {

    /* JADX INFO: renamed from: ۥؗ */
    public static final C3089 f10370 = new C3089(C1908.f6295);

    @Override // p000.AbstractC0026
    /* JADX INFO: renamed from: ۥۜ */
    public final int mo539(Object obj) {
        return ((C2560) obj).f8537.length;
    }

    @Override // p000.AbstractC5224, p000.AbstractC0026
    /* JADX INFO: renamed from: ۦِ */
    public final void mo540(InterfaceC5308 interfaceC5308, int i, Object obj) {
        C2698 c2698 = (C2698) obj;
        short sMo4104 = interfaceC5308.mo5154(this.f423, i).mo4104();
        c2698.mo2857(c2698.mo2859() + 1);
        short[] sArr = c2698.f8946;
        int i2 = c2698.f8945;
        c2698.f8945 = i2 + 1;
        sArr[i2] = sMo4104;
    }

    @Override // p000.AbstractC0026
    /* JADX INFO: renamed from: ۦۗ */
    public final Object mo541(Object obj) {
        short[] sArr = ((C2560) obj).f8537;
        C2698 c2698 = new C2698();
        c2698.f8946 = sArr;
        c2698.f8945 = sArr.length;
        c2698.mo2857(10);
        return c2698;
    }

    @Override // p000.AbstractC0106
    /* JADX INFO: renamed from: ۦۚ */
    public final Object mo201() {
        return new C2560(new short[0]);
    }

    @Override // p000.AbstractC0106
    /* JADX INFO: renamed from: ۦۨ */
    public final void mo202(C3782 c3782, Object obj, int i) {
        short[] sArr = ((C2560) obj).f8537;
        for (int i2 = 0; i2 < i; i2++) {
            c3782.m6696(this.f423, i2).m6700(sArr[i2]);
        }
    }
}
