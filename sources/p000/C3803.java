package p000;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: ۦٍؖۖۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3803 extends AbstractC2426 implements InterfaceC4745 {

    /* JADX INFO: renamed from: ۥَ */
    public C3411 f12624;

    /* JADX INFO: renamed from: ۥٖ */
    public C5662 f12625;

    /* JADX INFO: renamed from: ۥٙ */
    public final /* synthetic */ long f12626;

    /* JADX INFO: renamed from: ۥۖ */
    public final /* synthetic */ Object f12627;

    /* JADX INFO: renamed from: ۦٕ */
    public final /* synthetic */ C4214 f12628;

    /* JADX INFO: renamed from: ۦٗ */
    public int f12629;

    /* JADX INFO: renamed from: ۦۛ */
    public final /* synthetic */ C5825 f12630;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3803(C5825 c5825, Object obj, C4214 c4214, long j, InterfaceC0443 interfaceC0443) {
        super(1, interfaceC0443);
        this.f12630 = c5825;
        this.f12627 = obj;
        this.f12628 = c4214;
        this.f12626 = j;
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٖ */
    public final Object mo218(Object obj) {
        C3411 c3411;
        C5662 c5662;
        C4214 c4214 = this.f12628;
        int i = this.f12629;
        int i2 = 1;
        C5825 c5825 = this.f12630;
        try {
            if (i == 0) {
                AbstractC0186.m409(obj);
                c5825.f19169.f11356 = (AbstractC1814) c5825.f19174.f4359.mo211(this.f12627);
                c5825.f19170.setValue(c4214.f13983);
                c5825.f19175.setValue(Boolean.TRUE);
                C3411 c3412 = c5825.f19169;
                C3411 c3413 = new C3411(c3412.f11360, c3412.f11359.getValue(), AbstractC3933.m7072(c3412.f11356), c3412.f11357, Long.MIN_VALUE, c3412.f11358);
                C5662 c5663 = new C5662();
                long j = this.f12626;
                C3464 c3464 = new C3464(c5825, c3413, c5663, 0);
                this.f12624 = c3413;
                this.f12625 = c5663;
                this.f12629 = 1;
                Object objM6842 = AbstractC3831.m6842(c3413, c4214, j, c3464, this);
                EnumC2282 enumC2282 = EnumC2282.f7590;
                if (objM6842 == enumC2282) {
                    return enumC2282;
                }
                c3411 = c3413;
                c5662 = c5663;
            } else {
                if (i != 1) {
                    C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                c5662 = this.f12625;
                c3411 = this.f12624;
                AbstractC0186.m409(obj);
            }
            if (!c5662.f18631) {
                i2 = 2;
            }
            c5825.m9635();
            return new C4742(c3411, i2);
        } catch (CancellationException e) {
            c5825.m9635();
            throw e;
        }
    }

    @Override // p000.InterfaceC4745
    /* JADX INFO: renamed from: ۦؚ */
    public final Object mo211(Object obj) {
        C4214 c4214 = this.f12628;
        long j = this.f12626;
        return new C3803(this.f12630, this.f12627, c4214, j, (InterfaceC0443) obj).mo218(C2358.f7817);
    }
}
