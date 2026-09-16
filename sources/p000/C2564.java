package p000;

/* JADX INFO: renamed from: ۥٌٍۡؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2564 extends AbstractC1127 implements InterfaceC4745 {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ C5583 f8558;

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ long f8559;

    /* JADX INFO: renamed from: ۥٓ */
    public final /* synthetic */ long f8560;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ AbstractC0275 f8561;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2564(AbstractC0275 abstractC0275, long j, long j2, C5583 c5583) {
        super(1);
        this.f8561 = abstractC0275;
        this.f8559 = j;
        this.f8560 = j2;
        this.f8558 = c5583;
    }

    @Override // p000.InterfaceC4745
    /* JADX INFO: renamed from: ۦؚ */
    public final Object mo211(Object obj) {
        long j = this.f8559;
        long j2 = this.f8560;
        AbstractC0275 abstractC0275 = this.f8561;
        ((AbstractC1842) obj).m3629(abstractC0275);
        abstractC0275.mo571(C0873.m1861((((long) (((int) (j >> 32)) + ((int) (j2 >> 32)))) << 32) | (((long) (((int) (j & 4294967295L)) + ((int) (j2 & 4294967295L)))) & 4294967295L), abstractC0275.f981), 0.0f, this.f8558);
        return C2358.f7817;
    }
}
