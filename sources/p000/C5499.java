package p000;

/* JADX INFO: renamed from: ۦٕۡؗ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5499 extends AbstractC2426 implements InterfaceC2609 {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ int f18160;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5499(int i, InterfaceC0443 interfaceC0443, int i2) {
        super(i, interfaceC0443);
        this.f18160 = i2;
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٖ */
    public final Object mo218(Object obj) {
        int i = this.f18160;
        C2358 c2358 = C2358.f7817;
        switch (i) {
            case 0:
                AbstractC0186.m409(obj);
                break;
            case 1:
                AbstractC0186.m409(obj);
                break;
            default:
                AbstractC0186.m409(obj);
                break;
        }
        return c2358;
    }

    @Override // p000.InterfaceC2609
    /* JADX INFO: renamed from: ۦۙ */
    public final Object mo1173(Object obj, Object obj2, Object obj3) {
        int i = this.f18160;
        C2358 c2358 = C2358.f7817;
        int i2 = 3;
        switch (i) {
            case 0:
                long j = ((C1553) obj2).f5241;
                new C5499(i2, (InterfaceC0443) obj3, 0).mo218(c2358);
                break;
            case 1:
                ((Number) obj2).floatValue();
                new C5499(i2, (InterfaceC0443) obj3, 1).mo218(c2358);
                break;
            default:
                long j2 = ((C1553) obj2).f5241;
                new C5499(i2, (InterfaceC0443) obj3, 2).mo218(c2358);
                break;
        }
        return c2358;
    }
}
