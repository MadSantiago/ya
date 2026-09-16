package p000;

/* JADX INFO: renamed from: ۥؚۨؑۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2898 extends AbstractC0106 {

    /* JADX INFO: renamed from: ۥؗ */
    public static final C2898 f9660 = new C2898(C3447.f11454);

    @Override // p000.AbstractC0026
    /* JADX INFO: renamed from: ۥۜ */
    public final int mo539(Object obj) {
        return ((char[]) obj).length;
    }

    @Override // p000.AbstractC5224, p000.AbstractC0026
    /* JADX INFO: renamed from: ۦِ */
    public final void mo540(InterfaceC5308 interfaceC5308, int i, Object obj) {
        C4558 c4558 = (C4558) obj;
        char cMo5160 = interfaceC5308.mo5160(this.f423, i);
        c4558.mo2857(c4558.mo2859() + 1);
        char[] cArr = c4558.f15058;
        int i2 = c4558.f15057;
        c4558.f15057 = i2 + 1;
        cArr[i2] = cMo5160;
    }

    @Override // p000.AbstractC0026
    /* JADX INFO: renamed from: ۦۗ */
    public final Object mo541(Object obj) {
        char[] cArr = (char[]) obj;
        C4558 c4558 = new C4558();
        c4558.f15058 = cArr;
        c4558.f15057 = cArr.length;
        c4558.mo2857(10);
        return c4558;
    }

    @Override // p000.AbstractC0106
    /* JADX INFO: renamed from: ۦۚ */
    public final Object mo201() {
        return new char[0];
    }

    @Override // p000.AbstractC0106
    /* JADX INFO: renamed from: ۦۨ */
    public final void mo202(C3782 c3782, Object obj, int i) {
        char[] cArr = (char[]) obj;
        for (int i2 = 0; i2 < i; i2++) {
            char c = cArr[i2];
            c3782.m6685(this.f423, i2);
            c3782.m6692(c);
        }
    }
}
