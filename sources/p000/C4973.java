package p000;

/* JADX INFO: renamed from: ۦؙٟۗؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4973 extends AbstractC0106 {

    /* JADX INFO: renamed from: ۥؗ */
    public static final C4973 f16456 = new C4973(C3591.f11947);

    @Override // p000.AbstractC0026
    /* JADX INFO: renamed from: ۥۜ */
    public final int mo539(Object obj) {
        return ((byte[]) obj).length;
    }

    @Override // p000.AbstractC5224, p000.AbstractC0026
    /* JADX INFO: renamed from: ۦِ */
    public final void mo540(InterfaceC5308 interfaceC5308, int i, Object obj) {
        C5355 c5355 = (C5355) obj;
        byte bMo5166 = interfaceC5308.mo5166(this.f423, i);
        c5355.mo2857(c5355.mo2859() + 1);
        byte[] bArr = c5355.f17623;
        int i2 = c5355.f17622;
        c5355.f17622 = i2 + 1;
        bArr[i2] = bMo5166;
    }

    @Override // p000.AbstractC0026
    /* JADX INFO: renamed from: ۦۗ */
    public final Object mo541(Object obj) {
        byte[] bArr = (byte[]) obj;
        C5355 c5355 = new C5355();
        c5355.f17623 = bArr;
        c5355.f17622 = bArr.length;
        c5355.mo2857(10);
        return c5355;
    }

    @Override // p000.AbstractC0106
    /* JADX INFO: renamed from: ۦۚ */
    public final Object mo201() {
        return new byte[0];
    }

    @Override // p000.AbstractC0106
    /* JADX INFO: renamed from: ۦۨ */
    public final void mo202(C3782 c3782, Object obj, int i) {
        byte[] bArr = (byte[]) obj;
        for (int i2 = 0; i2 < i; i2++) {
            byte b = bArr[i2];
            c3782.m6685(this.f423, i2);
            c3782.m6682(b);
        }
    }
}
