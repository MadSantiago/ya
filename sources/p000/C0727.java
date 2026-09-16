package p000;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: ۥؙؔۛۦ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0727 extends AbstractC2426 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥَ */
    public int f2653;

    /* JADX INFO: renamed from: ۥٖ */
    public /* synthetic */ Object f2654;

    /* JADX INFO: renamed from: ۥۖ */
    public final /* synthetic */ InterfaceC3762 f2655;

    /* JADX INFO: renamed from: ۦٕ */
    public final /* synthetic */ long f2656;

    /* JADX INFO: renamed from: ۦٗ */
    public final /* synthetic */ C2567 f2657;

    /* JADX INFO: renamed from: ۦۛ */
    public final /* synthetic */ C4174 f2658;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0727(C2567 c2567, C4174 c4174, InterfaceC3762 interfaceC3762, long j, InterfaceC0443 interfaceC0443) {
        super(2, interfaceC0443);
        this.f2657 = c2567;
        this.f2658 = c4174;
        this.f2655 = interfaceC3762;
        this.f2656 = j;
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٓ */
    public final InterfaceC0443 mo217(InterfaceC0443 interfaceC0443, Object obj) {
        C0727 c0727 = new C0727(this.f2657, this.f2658, this.f2655, this.f2656, interfaceC0443);
        c0727.f2654 = obj;
        return c0727;
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٖ */
    public final Object mo218(Object obj) {
        C2567 c2567 = this.f2657;
        C4228 c4228 = c2567.f8574;
        int i = this.f2653;
        try {
            try {
                if (i == 0) {
                    AbstractC0186.m409(obj);
                    InterfaceC3196 interfaceC3196M9362 = AbstractC5568.m9362(((InterfaceC4643) this.f2654).mo1586());
                    c2567.f8577 = true;
                    C4545 c4545 = c2567.f8578;
                    EnumC4386 enumC4386 = EnumC4386.f14455;
                    C0136 c0136 = new C0136(this.f2658, c2567, this.f2655, this.f2656, interfaceC3196M9362, null);
                    this.f2653 = 1;
                    Object objM7868 = c4545.m7868(enumC4386, c0136, this);
                    EnumC2282 enumC2282 = EnumC2282.f7590;
                    if (objM7868 == enumC2282) {
                        return enumC2282;
                    }
                } else {
                    if (i != 1) {
                        C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC0186.m409(obj);
                }
                c4228.m7498();
                c2567.f8577 = false;
                c4228.m7497(null);
                c2567.f8573 = false;
                return C2358.f7817;
            } catch (CancellationException e) {
                throw e;
            }
        } catch (Throwable th) {
            c2567.f8577 = false;
            c4228.m7497(null);
            c2567.f8573 = false;
            throw th;
        }
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        return ((C0727) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(C2358.f7817);
    }
}
