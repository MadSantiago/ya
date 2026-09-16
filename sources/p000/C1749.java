package p000;

/* JADX INFO: renamed from: ۥٚؗۦؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1749 extends AbstractC1127 implements InterfaceC4745 {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ InterfaceC4745 f5821;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ int f5822;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1749(InterfaceC4745 interfaceC4745, int i) {
        super(1);
        this.f5822 = i;
        this.f5821 = interfaceC4745;
    }

    @Override // p000.InterfaceC4745
    /* JADX INFO: renamed from: ۦؚ */
    public final Object mo211(Object obj) {
        int i = this.f5822;
        InterfaceC4745 interfaceC4745 = this.f5821;
        switch (i) {
            case 0:
                long j = ((C4207) obj).f13969;
                int i2 = (int) (j >> 32);
                return new C4207((((long) ((Number) interfaceC4745.mo211(Integer.valueOf((int) (j & 4294967295L)))).intValue()) & 4294967295L) | (((long) i2) << 32));
            case 1:
                long j2 = ((C4207) obj).f13969;
                int i3 = (int) (j2 >> 32);
                return new C4207((((long) ((Number) interfaceC4745.mo211(Integer.valueOf((int) (j2 & 4294967295L)))).intValue()) & 4294967295L) | (((long) i3) << 32));
            default:
                return new C0873(((long) ((Number) interfaceC4745.mo211(Integer.valueOf((int) (((C4207) obj).f13969 & 4294967295L)))).intValue()) & 4294967295L);
        }
    }
}
