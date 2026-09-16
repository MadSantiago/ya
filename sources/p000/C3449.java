package p000;

/* JADX INFO: renamed from: ۦؘؘؗٞ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3449 extends AbstractC2426 implements InterfaceC2609 {

    /* JADX INFO: renamed from: ۥَ */
    public /* synthetic */ float f11457;

    /* JADX INFO: renamed from: ۥٖ */
    public final /* synthetic */ InterfaceC4745 f11458;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3449(InterfaceC4745 interfaceC4745, InterfaceC0443 interfaceC0443) {
        super(3, interfaceC0443);
        this.f11458 = interfaceC4745;
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٖ */
    public final Object mo218(Object obj) {
        AbstractC0186.m409(obj);
        this.f11458.mo211(new Float(this.f11457));
        return C2358.f7817;
    }

    @Override // p000.InterfaceC2609
    /* JADX INFO: renamed from: ۦۙ */
    public final Object mo1173(Object obj, Object obj2, Object obj3) {
        float fFloatValue = ((Number) obj2).floatValue();
        C3449 c3449 = new C3449(this.f11458, (InterfaceC0443) obj3);
        c3449.f11457 = fFloatValue;
        C2358 c2358 = C2358.f7817;
        c3449.mo218(c2358);
        return c2358;
    }
}
