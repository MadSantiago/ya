package p000;

/* JADX INFO: renamed from: ۦۡؖۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5490 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final C1254 f18100;

    static {
        C1254 c1254 = AbstractC0664.f2448;
        f18100 = new C1254();
    }

    /* JADX INFO: renamed from: ۥؗ */
    public static final void m9190(AbstractC5381 abstractC5381) {
        if (!abstractC5381.f17786) {
            AbstractC3480.m6278("autoInvalidateUpdatedNode called on unattached node");
        }
        m9194(abstractC5381, -1, 0);
    }

    /* JADX INFO: renamed from: ۥُ */
    public static final int m9191(AbstractC5381 abstractC5381) {
        int i = abstractC5381.f17781;
        if (i != 0) {
            return i;
        }
        Class<?> cls = abstractC5381.getClass();
        C1254 c1254 = f18100;
        int iM2654 = c1254.m2654(cls);
        if (iM2654 >= 0) {
            return c1254.f4315[iM2654];
        }
        int i2 = abstractC5381 instanceof InterfaceC4933 ? 3 : 1;
        if (abstractC5381 instanceof InterfaceC0951) {
            i2 |= 4;
        }
        if (abstractC5381 instanceof InterfaceC5671) {
            i2 |= 8;
        }
        if (abstractC5381 instanceof InterfaceC2766) {
            i2 |= 16;
        }
        if (abstractC5381 instanceof InterfaceC2827) {
            i2 |= 32;
        }
        if (abstractC5381 instanceof InterfaceC1696) {
            i2 |= 64;
        }
        if (abstractC5381 instanceof InterfaceC3126) {
            i2 |= 4194432;
        } else if (abstractC5381 instanceof InterfaceC1293) {
            i2 |= 128;
        }
        if (abstractC5381 instanceof InterfaceC0882) {
            i2 |= 256;
        }
        if (abstractC5381 instanceof C3468) {
            i2 |= 1024;
        }
        if (abstractC5381 instanceof InterfaceC5448) {
            i2 |= 2048;
        }
        if (abstractC5381 instanceof InterfaceC3392) {
            i2 |= 4096;
        }
        if (abstractC5381 instanceof InterfaceC0174) {
            i2 |= 8192;
        }
        if (abstractC5381 instanceof C4644) {
            i2 |= 16384;
        }
        if (abstractC5381 instanceof InterfaceC4825) {
            i2 |= 32768;
        }
        if (abstractC5381 instanceof InterfaceC0289) {
            i2 |= 262144;
        }
        if (abstractC5381 instanceof InterfaceC2269) {
            i2 |= 524288;
        }
        if (abstractC5381 instanceof InterfaceC5119) {
            i2 |= 2097152;
        }
        if (abstractC5381 instanceof C3317) {
            i2 |= 8388608;
        }
        c1254.m2655(i2, cls);
        return i2;
    }

    /* JADX INFO: renamed from: ۥّ */
    public static final int m9192(AbstractC5381 abstractC5381) {
        if (!(abstractC5381 instanceof AbstractC3019)) {
            return m9191(abstractC5381);
        }
        AbstractC3019 abstractC3019 = (AbstractC3019) abstractC5381;
        int iM9192 = abstractC3019.f10166;
        for (AbstractC5381 abstractC5382 = abstractC3019.f10167; abstractC5382 != null; abstractC5382 = abstractC5382.f17783) {
            iM9192 |= m9192(abstractC5382);
        }
        return iM9192;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۥۗ */
    public static final void m9193(AbstractC5381 abstractC5381, int i, int i2) {
        if (i2 != 0 || abstractC5381.mo786()) {
            if ((i & 2) != 0 && (abstractC5381 instanceof InterfaceC4933)) {
                C5063.m8642((InterfaceC4933) abstractC5381);
                if (i2 == 2) {
                    AbstractC5537.m9245(abstractC5381, 2).m9783();
                }
            }
            if ((i & 128) != 0 && i2 != 2) {
                AbstractC5537.m9270(abstractC5381).m1326();
            }
            if ((4194304 & i) != 0 && i2 != 2) {
                AbstractC5537.m9270(abstractC5381).m1336(false);
            }
            if ((i & 256) != 0 && (abstractC5381 instanceof InterfaceC0882)) {
                if (i2 == 1) {
                    C0605 c0605M9270 = AbstractC5537.m9270(abstractC5381);
                    c0605M9270.m1344(c0605M9270.f2274 + 1);
                } else if (i2 == 2) {
                    C0605 c0605M9271 = AbstractC5537.m9270(abstractC5381);
                    c0605M9271.m1344(c0605M9271.f2274 - 1);
                }
                if (i2 != 2) {
                    C0605 c0605M9272 = AbstractC5537.m9270(abstractC5381);
                    if (c0605M9272.f2274 != 0 && !c0605M9272.m1364() && !c0605M9272.m1324() && !c0605M9272.f2260) {
                        ViewTreeObserverOnGlobalLayoutListenerC0850 viewTreeObserverOnGlobalLayoutListenerC0850 = (ViewTreeObserverOnGlobalLayoutListenerC0850) AbstractC5359.m8951(c0605M9272);
                        C3369 c3369 = (C3369) viewTreeObserverOnGlobalLayoutListenerC0850.f3125.f4713;
                        if (c0605M9272.f2274 > 0) {
                            ((C0863) c3369.f11255).m1843(c0605M9272);
                            c0605M9272.f2260 = true;
                        }
                        viewTreeObserverOnGlobalLayoutListenerC0850.m1787(null);
                    }
                }
            }
            if ((i & 4) != 0 && (abstractC5381 instanceof InterfaceC0951)) {
                AbstractC5378.m9047((InterfaceC0951) abstractC5381);
            }
            if ((i & 8) != 0 && (abstractC5381 instanceof InterfaceC5671)) {
                AbstractC5537.m9270(abstractC5381).f2253 = true;
            }
            if ((i & 64) != 0 && (abstractC5381 instanceof InterfaceC1696)) {
                C1233 c1233 = AbstractC5537.m9270((InterfaceC1696) abstractC5381).f2261;
                c1233.f4252.f7772 = true;
                C2921 c2921 = c1233.f4240;
                if (c2921 != null) {
                    c2921.f9814 = true;
                }
            }
            if ((i & 2048) != 0 && (abstractC5381 instanceof InterfaceC5448)) {
                InterfaceC5448 interfaceC5448 = (InterfaceC5448) abstractC5381;
                C3752.f12484 = null;
                interfaceC5448.mo5853(C3752.f12485);
                if (C3752.f12484 != null) {
                    AbstractC5381 abstractC5382 = (AbstractC5381) interfaceC5448;
                    if (!abstractC5382.f17791.f17786) {
                        AbstractC3480.m6278("visitChildren called on an unattached node");
                    }
                    C0863 c0863 = new C0863(new AbstractC5381[16]);
                    AbstractC5381 abstractC5383 = abstractC5382.f17791;
                    AbstractC5381 abstractC5384 = abstractC5383.f17783;
                    if (abstractC5384 == null) {
                        AbstractC5537.m9249(c0863, abstractC5383);
                    } else {
                        c0863.m1843(abstractC5384);
                    }
                    while (true) {
                        int i3 = c0863.f3180;
                        if (i3 == 0) {
                            break;
                        }
                        AbstractC5381 abstractC5381M9233 = (AbstractC5381) c0863.m1850(i3 - 1);
                        if ((abstractC5381M9233.f17782 & 1024) == 0) {
                            AbstractC5537.m9249(c0863, abstractC5381M9233);
                        } else {
                            while (abstractC5381M9233 != null) {
                                if ((abstractC5381M9233.f17781 & 1024) != 0) {
                                    C0863 c0864 = null;
                                    while (abstractC5381M9233 != null) {
                                        if (abstractC5381M9233 instanceof C3468) {
                                            C3468 c3468 = (C3468) abstractC5381M9233;
                                            C1822 c1822 = ((C2016) ((ViewTreeObserverOnGlobalLayoutListenerC0850) AbstractC5537.m9224(c3468)).getFocusOwner()).f6643;
                                            if (c1822.f6052.m6495(c3468)) {
                                                c1822.m3595();
                                            }
                                        } else if ((abstractC5381M9233.f17781 & 1024) != 0 && (abstractC5381M9233 instanceof AbstractC3019)) {
                                            int i4 = 0;
                                            for (AbstractC5381 abstractC5385 = ((AbstractC3019) abstractC5381M9233).f10167; abstractC5385 != null; abstractC5385 = abstractC5385.f17783) {
                                                if ((abstractC5385.f17781 & 1024) != 0) {
                                                    i4++;
                                                    if (i4 == 1) {
                                                        abstractC5381M9233 = abstractC5385;
                                                    } else {
                                                        if (c0864 == null) {
                                                            c0864 = new C0863(new AbstractC5381[16]);
                                                        }
                                                        if (abstractC5381M9233 != null) {
                                                            c0864.m1843(abstractC5381M9233);
                                                            abstractC5381M9233 = null;
                                                        }
                                                        c0864.m1843(abstractC5385);
                                                    }
                                                }
                                            }
                                            if (i4 == 1) {
                                            }
                                        }
                                        abstractC5381M9233 = AbstractC5537.m9233(c0864);
                                    }
                                    break;
                                }
                                abstractC5381M9233 = abstractC5381M9233.f17783;
                            }
                        }
                    }
                }
            }
            if ((i & 4096) != 0 && (abstractC5381 instanceof InterfaceC3392)) {
                InterfaceC3392 interfaceC3392 = (InterfaceC3392) abstractC5381;
                C1822 c1823 = ((C2016) ((ViewTreeObserverOnGlobalLayoutListenerC0850) AbstractC5537.m9224(interfaceC3392)).getFocusOwner()).f6643;
                if (c1823.f6056.m6495(interfaceC3392)) {
                    c1823.m3595();
                }
            }
            if ((i & 2097152) != 0 && (abstractC5381 instanceof InterfaceC5119) && i2 == 2) {
                ((InterfaceC5119) abstractC5381).mo1266();
            }
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static final void m9194(AbstractC5381 abstractC5381, int i, int i2) {
        if (!(abstractC5381 instanceof AbstractC3019)) {
            m9193(abstractC5381, i & abstractC5381.f17781, i2);
            return;
        }
        AbstractC3019 abstractC3019 = (AbstractC3019) abstractC5381;
        int i3 = abstractC3019.f10166;
        m9193(abstractC5381, i3 & i, i2);
        int i4 = (~i3) & i;
        for (AbstractC5381 abstractC5382 = abstractC3019.f10167; abstractC5382 != null; abstractC5382 = abstractC5382.f17783) {
            m9194(abstractC5382, i4, i2);
        }
    }

    /* JADX INFO: renamed from: ۦؑ */
    public static final int m9195(InterfaceC2252 interfaceC2252) {
        int i = interfaceC2252 instanceof InterfaceC3205 ? 3 : 1;
        if (interfaceC2252 instanceof AbstractC5711) {
            i |= 4;
        }
        if (interfaceC2252 instanceof C1023) {
            i |= 8;
        }
        if (interfaceC2252 instanceof C2317) {
            i |= 16;
        }
        if (interfaceC2252 instanceof C1317) {
            i |= 64;
        }
        return interfaceC2252 instanceof InterfaceC2269 ? 524288 | i : i;
    }

    /* JADX INFO: renamed from: ۦۙ */
    public static final boolean m9196(int i) {
        return ((i & 128) != 0) | ((i & 4194304) != 0);
    }
}
