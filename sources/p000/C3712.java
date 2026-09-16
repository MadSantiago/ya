package p000;

/* JADX INFO: renamed from: ۦٌُؒۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3712 extends AbstractC1127 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ C0857 f12378;

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ C5686 f12379;

    /* JADX INFO: renamed from: ۥٓ */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0850 f12380;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ int f12381 = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3712(ViewTreeObserverOnGlobalLayoutListenerC0850 viewTreeObserverOnGlobalLayoutListenerC0850, C5686 c5686, C0857 c0857) {
        super(2);
        this.f12380 = viewTreeObserverOnGlobalLayoutListenerC0850;
        this.f12379 = c5686;
        this.f12378 = c0857;
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        int i = this.f12381;
        C2358 c2358 = C2358.f7817;
        C0857 c0857 = this.f12378;
        ViewTreeObserverOnGlobalLayoutListenerC0850 viewTreeObserverOnGlobalLayoutListenerC0850 = this.f12380;
        C5686 c5686 = this.f12379;
        switch (i) {
            case 0:
                C5362 c5362 = (C5362) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (!c5362.m9011(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c5362.m8982();
                } else {
                    c5362.m8957(866651995);
                    AbstractC2853.m5418(viewTreeObserverOnGlobalLayoutListenerC0850, c5686.f18707, c0857, c5362, 0);
                    c5362.m9009(false);
                }
                break;
            default:
                ((Number) obj2).intValue();
                c5686.m9502(viewTreeObserverOnGlobalLayoutListenerC0850, c0857, (C5362) obj, AbstractC3831.m6835(1));
                break;
        }
        return c2358;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3712(C5686 c5686, ViewTreeObserverOnGlobalLayoutListenerC0850 viewTreeObserverOnGlobalLayoutListenerC0850, C0857 c0857, int i) {
        super(2);
        this.f12379 = c5686;
        this.f12380 = viewTreeObserverOnGlobalLayoutListenerC0850;
        this.f12378 = c0857;
    }
}
