package p000;

/* JADX INFO: renamed from: ۦًٍٞؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4811 extends AbstractC1127 implements InterfaceC4448 {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ Object f15859;

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ Object f15860;

    /* JADX INFO: renamed from: ۥٓ */
    public final /* synthetic */ Object f15861;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ int f15862;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4811(Object obj, Object obj2, Object obj3, int i) {
        super(0);
        this.f15862 = i;
        this.f15860 = obj;
        this.f15861 = obj2;
        this.f15859 = obj3;
    }

    @Override // p000.InterfaceC4448
    /* JADX INFO: renamed from: ۥۣ */
    public final Object mo449() {
        int i = this.f15862;
        Object obj = this.f15859;
        Object obj2 = this.f15861;
        Object obj3 = this.f15860;
        switch (i) {
            case 0:
                return ((C3175) obj3).f10673.mo793(((C3462) obj).f11486.f2801, ((C4073) obj2).m7257());
            default:
                AbstractC0054 abstractC0054 = (AbstractC0054) obj3;
                abstractC0054.removeOnAttachStateChangeListener((ViewOnAttachStateChangeListenerC3944) obj2);
                AbstractC1434.m3033(abstractC0054).f661.remove((C2316) obj);
                return C2358.f7817;
        }
    }
}
