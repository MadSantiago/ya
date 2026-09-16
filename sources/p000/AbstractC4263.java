package p000;

/* JADX INFO: renamed from: ۦٌٕؗؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4263 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final C4216 f14119 = new C4216(1, C3709.f12362);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: ۥۗ */
    public static final void m7558(InterfaceC2043 interfaceC2043, InterfaceC5731 interfaceC5731, AbstractC0772 abstractC0772) {
        C2843 c2843;
        if (abstractC0772 instanceof C2843) {
            c2843 = (C2843) abstractC0772;
            int i = c2843.f9496;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2843.f9496 = i - Integer.MIN_VALUE;
            } else {
                c2843 = new C2843(abstractC0772);
            }
        } else {
            c2843 = new C2843(abstractC0772);
        }
        Object obj = c2843.f9497;
        int i2 = c2843.f9496;
        if (i2 == 0) {
            AbstractC0186.m409(obj);
            c2843.f9496 = 1;
            ((ViewTreeObserverOnGlobalLayoutListenerC0850) interfaceC2043).m1794(interfaceC5731, c2843);
        } else if (i2 == 1) {
            AbstractC0186.m409(obj);
            C1078.m2274();
        } else if (i2 != 2) {
            C1078.m2276("call to 'resume' before 'invoke' with coroutine");
        } else {
            AbstractC0186.m409(obj);
            C1078.m2274();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: ۥۣ */
    public static final void m7559(C4306 c4306, C1734 c1734, AbstractC0772 abstractC0772) {
        C1050 c1050;
        if (abstractC0772 instanceof C1050) {
            c1050 = (C1050) abstractC0772;
            int i = c1050.f3716;
            if ((i & Integer.MIN_VALUE) != 0) {
                c1050.f3716 = i - Integer.MIN_VALUE;
            } else {
                c1050 = new C1050(abstractC0772);
            }
        } else {
            c1050 = new C1050(abstractC0772);
        }
        Object obj = c1050.f3717;
        int i2 = c1050.f3716;
        if (i2 != 0) {
            if (i2 != 1) {
                C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                return;
            } else {
                AbstractC0186.m409(obj);
                C1078.m2274();
                return;
            }
        }
        AbstractC0186.m409(obj);
        if (!c4306.f17791.f17786) {
            C1078.m2272("establishTextInputSession called from an unattached node");
            return;
        }
        InterfaceC2043 interfaceC2043M9224 = AbstractC5537.m9224(c4306);
        C2103 c2103 = (C2103) AbstractC5537.m9270(c4306).f2247;
        c2103.getClass();
        if (C3133.m5778(c2103, f14119) != null) {
            C0178.m382();
        } else {
            c1050.f3716 = 1;
            m7558(interfaceC2043M9224, c1734, c1050);
        }
    }
}
