package p000;

import android.graphics.Canvas;

/* JADX INFO: renamed from: ۦًۣٕؒ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5583 extends AbstractC1127 implements InterfaceC4745 {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ Object f18410;

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ Object f18411;

    /* JADX INFO: renamed from: ۥٓ */
    public final /* synthetic */ Object f18412;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ int f18413;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5583(C4855 c4855, C0605 c0605, C4855 c4856) {
        super(1);
        this.f18413 = 0;
        this.f18411 = c4855;
        this.f18410 = c0605;
        this.f18412 = c4856;
    }

    @Override // p000.InterfaceC4745
    /* JADX INFO: renamed from: ۦؚ */
    public final Object mo211(Object obj) {
        long j;
        int i = this.f18413;
        C2358 c2358 = C2358.f7817;
        boolean zBooleanValue = false;
        Object obj2 = this.f18410;
        Object obj3 = this.f18412;
        Object obj4 = this.f18411;
        switch (i) {
            case 0:
                C4855 c4855 = (C4855) obj4;
                C0605 c0605 = (C0605) obj2;
                C4855 c4856 = (C4855) obj3;
                InterfaceC3212 interfaceC3212M5353 = ((InterfaceC2442) obj).mo3908().m5353();
                if (c4855.getView().getVisibility() != 8) {
                    c4855.f8393 = true;
                    InterfaceC2043 interfaceC2043 = c0605.f2259;
                    ViewTreeObserverOnGlobalLayoutListenerC0850 viewTreeObserverOnGlobalLayoutListenerC0850 = interfaceC2043 instanceof ViewTreeObserverOnGlobalLayoutListenerC0850 ? (ViewTreeObserverOnGlobalLayoutListenerC0850) interfaceC2043 : null;
                    if (viewTreeObserverOnGlobalLayoutListenerC0850 != null) {
                        Canvas canvas = AbstractC5664.f18633;
                        Canvas canvas2 = ((C0979) interfaceC3212M5353).f3447;
                        viewTreeObserverOnGlobalLayoutListenerC0850.getAndroidViewsHandler$ui().getClass();
                        c4856.draw(canvas2);
                    }
                    c4855.f8393 = false;
                }
                return c2358;
            case 1:
                InterfaceC0289 interfaceC0289 = (InterfaceC0289) obj;
                C3920 c3920 = (C3920) interfaceC0289;
                if (!((ViewOnDragListenerC1501) ((ViewTreeObserverOnGlobalLayoutListenerC0850) AbstractC5537.m9224((C3920) obj3)).m9770getDragAndDropManager()).f5105.contains(c3920) || !AbstractC4593.m7985(c3920, AbstractC3801.m6749((C5086) obj2))) {
                    return EnumC1848.f6133;
                }
                ((C5450) obj4).f17965 = interfaceC0289;
                return EnumC1848.f6130;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                C1117 c1117 = (C1117) obj;
                InterfaceC5372 interfaceC5372 = (InterfaceC5372) obj3;
                InterfaceC5372 interfaceC5373 = (InterfaceC5372) obj4;
                c1117.m2338(interfaceC5373 != null ? ((Number) interfaceC5373.getValue()).floatValue() : 1.0f);
                c1117.m2347(interfaceC5372 != null ? ((Number) interfaceC5372.getValue()).floatValue() : 1.0f);
                c1117.m2345(interfaceC5372 != null ? ((Number) interfaceC5372.getValue()).floatValue() : 1.0f);
                InterfaceC5372 interfaceC5374 = (InterfaceC5372) obj2;
                if (interfaceC5374 != null) {
                    ((AbstractC5477) interfaceC5374.getValue()).getClass();
                    j = 0;
                } else {
                    j = AbstractC5477.f18071;
                }
                c1117.m2343(j);
                return c2358;
            default:
                C3468 c3468 = (C3468) obj;
                if (!AbstractC3831.m6874(c3468, (C3468) obj4)) {
                    if (AbstractC3831.m6874(c3468, ((C2016) obj3).f6637)) {
                        C1078.m2276("Focus search landed at the root.");
                        return null;
                    }
                    zBooleanValue = ((Boolean) ((InterfaceC4745) obj2).mo211(c3468)).booleanValue();
                }
                return Boolean.valueOf(zBooleanValue);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5583(Object obj, Object obj2, Object obj3, int i) {
        super(1);
        this.f18413 = i;
        this.f18411 = obj;
        this.f18412 = obj2;
        this.f18410 = obj3;
    }
}
