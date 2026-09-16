package p000;

/* JADX INFO: renamed from: ۦٍّؓٛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4016 extends AbstractC0106 {

    /* JADX INFO: renamed from: ۥؗ */
    public static final C4016 f13384 = new C4016(C2305.f7640);

    @Override // p000.AbstractC0026
    /* JADX INFO: renamed from: ۥۜ */
    public final int mo539(Object obj) {
        return ((C5142) obj).f17032.length;
    }

    @Override // p000.AbstractC5224, p000.AbstractC0026
    /* JADX INFO: renamed from: ۦِ */
    public final void mo540(InterfaceC5308 interfaceC5308, int i, Object obj) {
        C3853 c3853 = (C3853) obj;
        byte bMo4115 = interfaceC5308.mo5154(this.f423, i).mo4115();
        c3853.mo2857(c3853.mo2859() + 1);
        byte[] bArr = c3853.f12875;
        int i2 = c3853.f12874;
        c3853.f12874 = i2 + 1;
        bArr[i2] = bMo4115;
    }

    @Override // p000.AbstractC0026
    /* JADX INFO: renamed from: ۦۗ */
    public final Object mo541(Object obj) {
        byte[] bArr = ((C5142) obj).f17032;
        C3853 c3853 = new C3853();
        c3853.f12875 = bArr;
        c3853.f12874 = bArr.length;
        c3853.mo2857(10);
        return c3853;
    }

    @Override // p000.AbstractC0106
    /* JADX INFO: renamed from: ۦۚ */
    public final Object mo201() {
        return new C5142(new byte[0]);
    }

    @Override // p000.AbstractC0106
    /* JADX INFO: renamed from: ۦۨ */
    public final void mo202(C3782 c3782, Object obj, int i) {
        byte[] bArr = ((C5142) obj).f17032;
        for (int i2 = 0; i2 < i; i2++) {
            c3782.m6696(this.f423, i2).m6682(bArr[i2]);
        }
    }
}
