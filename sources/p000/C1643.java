package p000;

/* JADX INFO: renamed from: ۥًٙؓۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1643 extends AbstractC2426 implements InterfaceC2609 {

    /* JADX INFO: renamed from: ۥَ */
    public int f5488;

    /* JADX INFO: renamed from: ۥٖ */
    public /* synthetic */ float f5489;

    /* JADX INFO: renamed from: ۦٗ */
    public final /* synthetic */ C4741 f5490;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1643(C4741 c4741, InterfaceC0443 interfaceC0443) {
        super(3, interfaceC0443);
        this.f5490 = c4741;
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٖ */
    public final Object mo218(Object obj) {
        int i = this.f5488;
        if (i == 0) {
            AbstractC0186.m409(obj);
            float f = this.f5489;
            C5277 c5277 = this.f5490.f15647;
            C5765 c5765 = c5277.f17393;
            C5468 c5468 = c5277.f17390;
            InterfaceC3347 interfaceC3347 = c5277.f17392;
            this.f5488 = 1;
            Object objM4310 = AbstractC2264.m4310(c5765, f, c5468, interfaceC3347, this);
            EnumC2282 enumC2282 = EnumC2282.f7590;
            if (objM4310 == enumC2282) {
                return enumC2282;
            }
        } else {
            if (i != 1) {
                C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC0186.m409(obj);
        }
        return C2358.f7817;
    }

    @Override // p000.InterfaceC2609
    /* JADX INFO: renamed from: ۦۙ */
    public final Object mo1173(Object obj, Object obj2, Object obj3) {
        float fFloatValue = ((Number) obj2).floatValue();
        C1643 c1643 = new C1643(this.f5490, (InterfaceC0443) obj3);
        c1643.f5489 = fFloatValue;
        return c1643.mo218(C2358.f7817);
    }
}
