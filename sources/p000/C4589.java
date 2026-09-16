package p000;

import android.util.Log;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: ۦٚۛۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4589 {

    /* JADX INFO: renamed from: ۥؗ */
    public final AtomicReference f15139 = new AtomicReference();

    /* JADX INFO: renamed from: ۥۗ */
    public final InterfaceC1015 f15140;

    /* JADX INFO: renamed from: ۥۣ */
    public final C3729 f15141;

    public C4589(InterfaceC3534 interfaceC3534, C3729 c3729, InterfaceC1015 interfaceC1015) {
        this.f15141 = c3729;
        this.f15140 = interfaceC1015;
        AbstractC2765.m5135(AbstractC4009.m7151(interfaceC3534), null, 0, new C1390(this, null, 0), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: ۥؗ */
    public final Object m7953(C2944 c2944, AbstractC0772 abstractC0772) {
        C3960 c3960;
        if (abstractC0772 instanceof C3960) {
            c3960 = (C3960) abstractC0772;
            int i = c3960.f13240;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3960.f13240 = i - Integer.MIN_VALUE;
            } else {
                c3960 = new C3960(this, abstractC0772);
            }
        } else {
            c3960 = new C3960(this, abstractC0772);
        }
        Object obj = c3960.f13239;
        int i2 = c3960.f13240;
        InterfaceC0443 interfaceC0443 = null;
        try {
            if (i2 == 0) {
                AbstractC0186.m409(obj);
                InterfaceC1015 interfaceC1015 = this.f15140;
                C0876 c0876 = new C0876(c2944, interfaceC0443, 3);
                c3960.f13240 = 1;
                Object objMo2233 = interfaceC1015.mo2233(c0876, c3960);
                EnumC2282 enumC2282 = EnumC2282.f7590;
                if (objMo2233 == enumC2282) {
                    return enumC2282;
                }
            } else {
                if (i2 != 1) {
                    C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC0186.m409(obj);
            }
        } catch (IOException e) {
            Log.w("FirebaseSessions", "Failed to update config values: " + e);
        }
        return C2358.f7817;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final boolean m7954() {
        Long l = m7955().f9881;
        Integer num = m7955().f9884;
        if (l == null || num == null) {
            return true;
        }
        this.f15141.getClass();
        return C3729.m6575().f16404 - l.longValue() >= ((long) num.intValue());
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final C2944 m7955() throws Throwable {
        AtomicReference atomicReference = this.f15139;
        if (atomicReference.get() == null) {
            Object objM9243 = AbstractC5537.m9243(C4794.f15814, new C1390(this, null, 1));
            while (!atomicReference.compareAndSet(null, objM9243) && atomicReference.get() == null) {
            }
        }
        return (C2944) atomicReference.get();
    }
}
