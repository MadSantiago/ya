package p000;

/* JADX INFO: renamed from: ۦۡؔۧۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5467 extends AbstractC0106 {

    /* JADX INFO: renamed from: ۥؗ */
    public static final C5467 f18028 = new C5467(C1785.f5953);

    @Override // p000.AbstractC0026
    /* JADX INFO: renamed from: ۥۜ */
    public final int mo539(Object obj) {
        return ((C4556) obj).f15056.length;
    }

    @Override // p000.AbstractC5224, p000.AbstractC0026
    /* JADX INFO: renamed from: ۦِ */
    public final void mo540(InterfaceC5308 interfaceC5308, int i, Object obj) {
        C1349 c1349 = (C1349) obj;
        long jMo4108 = interfaceC5308.mo5154(this.f423, i).mo4108();
        c1349.mo2857(c1349.mo2859() + 1);
        long[] jArr = c1349.f4639;
        int i2 = c1349.f4638;
        c1349.f4638 = i2 + 1;
        jArr[i2] = jMo4108;
    }

    @Override // p000.AbstractC0026
    /* JADX INFO: renamed from: ۦۗ */
    public final Object mo541(Object obj) {
        long[] jArr = ((C4556) obj).f15056;
        C1349 c1349 = new C1349();
        c1349.f4639 = jArr;
        c1349.f4638 = jArr.length;
        c1349.mo2857(10);
        return c1349;
    }

    @Override // p000.AbstractC0106
    /* JADX INFO: renamed from: ۦۚ */
    public final Object mo201() {
        return new C4556(new long[0]);
    }

    @Override // p000.AbstractC0106
    /* JADX INFO: renamed from: ۦۨ */
    public final void mo202(C3782 c3782, Object obj, int i) {
        long[] jArr = ((C4556) obj).f15056;
        for (int i2 = 0; i2 < i; i2++) {
            c3782.m6696(this.f423, i2).m6697(jArr[i2]);
        }
    }
}
