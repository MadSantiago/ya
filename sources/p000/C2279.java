package p000;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: ۥٖۚؕۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2279 extends AbstractC2426 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥَ */
    public int f7568;

    /* JADX INFO: renamed from: ۥٖ */
    public final /* synthetic */ InterfaceC4707[] f7569;

    /* JADX INFO: renamed from: ۥۖ */
    public final /* synthetic */ C5559 f7570;

    /* JADX INFO: renamed from: ۦٗ */
    public final /* synthetic */ int f7571;

    /* JADX INFO: renamed from: ۦۛ */
    public final /* synthetic */ AtomicInteger f7572;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2279(InterfaceC4707[] interfaceC4707Arr, int i, AtomicInteger atomicInteger, C5559 c5559, InterfaceC0443 interfaceC0443) {
        super(2, interfaceC0443);
        this.f7569 = interfaceC4707Arr;
        this.f7571 = i;
        this.f7572 = atomicInteger;
        this.f7570 = c5559;
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٓ */
    public final InterfaceC0443 mo217(InterfaceC0443 interfaceC0443, Object obj) {
        return new C2279(this.f7569, this.f7571, this.f7572, this.f7570, interfaceC0443);
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٖ */
    public final Object mo218(Object obj) {
        int i = this.f7568;
        AtomicInteger atomicInteger = this.f7572;
        C5559 c5559 = this.f7570;
        try {
            if (i == 0) {
                AbstractC0186.m409(obj);
                InterfaceC4707[] interfaceC4707Arr = this.f7569;
                int i2 = this.f7571;
                InterfaceC4707 interfaceC4707 = interfaceC4707Arr[i2];
                C4916 c4916 = new C4916(c5559, i2);
                this.f7568 = 1;
                Object objMo1575 = interfaceC4707.mo1575(c4916, this);
                EnumC2282 enumC2282 = EnumC2282.f7590;
                if (objMo1575 == enumC2282) {
                    return enumC2282;
                }
            } else {
                if (i != 1) {
                    C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC0186.m409(obj);
            }
            if (atomicInteger.decrementAndGet() == 0) {
                c5559.m9329(null);
            }
            return C2358.f7817;
        } catch (Throwable th) {
            if (atomicInteger.decrementAndGet() == 0) {
                c5559.m9329(null);
            }
            throw th;
        }
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        return ((C2279) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(C2358.f7817);
    }
}
