package p000;

import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: ۥٟؖ۠ؒ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2022 {

    /* JADX INFO: renamed from: ۥۣ */
    public final C1543 f6662;

    public C2022(C1543 c1543) {
        this.f6662 = c1543;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static C0008 m3941(C3580 c3580) {
        C2801 c2801 = new C2801();
        c2801.f9356 = c3580;
        C2391 c2391 = new C2391(12, c2801);
        c3580.getClass();
        EnumC0486 enumC0486 = EnumC0486.f1767;
        c3580.f11911.m9159(new C3517((Executor) enumC0486, (InterfaceC2659) c2391));
        c3580.m6400();
        int i = AbstractRunnableC0049.f9490;
        C0008 c0008 = new C0008(c2801, C1717.class, C1965.f6488);
        c2801.mo3760(c0008, AbstractC0993.m2137(enumC0486, c0008));
        return c0008;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final C0008 m3942(C0430 c0430) throws Throwable {
        String string;
        C1543 c1543 = this.f6662;
        String simpleName = C5390.class.getSimpleName();
        Looper looper = c1543.f14878;
        AbstractC0487.m1048(looper, "Looper must not be null");
        C1795 c1795 = new C1795(looper, c0430, simpleName);
        String strM8130 = C4773.m8130();
        if (strM8130 == null) {
            string = "__PH_INTERNAL__NO_PROCESS__";
        } else {
            int length = strM8130.length() + 1;
            int iIdentityHashCode = System.identityHashCode(C5390.class);
            StringBuilder sb = new StringBuilder(length + String.valueOf(iIdentityHashCode).length());
            sb.append(strM8130);
            sb.append("|");
            sb.append(iIdentityHashCode);
            string = sb.toString();
        }
        C5460 c5460 = new C5460(c1543, string, c1795, 13);
        C5518 c5518 = C5518.f18216;
        C4752 c4752 = new C4752();
        c4752.f15688 = c1795;
        c4752.f15686 = c5460;
        c4752.f15684 = c5518;
        c4752.f15685 = new C2274[]{AbstractC0186.f681};
        c4752.f15687 = false;
        C0488 c0488 = (C0488) ((C1795) c4752.f15688).f5992;
        AbstractC0487.m1048(c0488, "Key must not be null");
        C1795 c1796 = (C1795) c4752.f15688;
        C1405 c1405 = new C1405(c4752, c1796, (C2274[]) c4752.f15685, c4752.f15687);
        C1039 c1039 = new C1039(c4752, c0488);
        AbstractC0487.m1048((C0488) c1796.f5992, "Listener has already been released.");
        C4085 c4085 = c1543.f14883;
        c4085.getClass();
        C2332 c2332 = new C2332();
        C4129 c4129 = new C4129(new C1664(new C5742(c1405, c1039), c2332), c4085.f13636.get(), c1543);
        HandlerC0645 handlerC0645 = c4085.f13634;
        handlerC0645.sendMessage(handlerC0645.obtainMessage(8, c4129));
        return m3941(c2332.f7721);
    }
}
