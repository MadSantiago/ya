package p000;

/* JADX INFO: renamed from: ۦٕۖؒٛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4897 implements InterfaceC4745 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ InterfaceC4745 f16140;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f16141;

    public /* synthetic */ C4897(InterfaceC4745 interfaceC4745, int i) {
        this.f16141 = i;
        this.f16140 = interfaceC4745;
    }

    @Override // p000.InterfaceC4745
    /* JADX INFO: renamed from: ۦؚ */
    public final Object mo211(Object obj) {
        long j;
        switch (this.f16141) {
            case 0:
                C5570 c5570 = (C5570) obj;
                synchronized (AbstractC1538.f5203) {
                    j = AbstractC1538.f5204;
                    AbstractC1538.f5204 = 1 + j;
                }
                return new C2617(j, c5570, this.f16140);
            default:
                return this.f16140.mo211(Long.valueOf(((Number) obj).longValue() / 1000000));
        }
    }
}
