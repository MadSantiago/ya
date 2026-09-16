package p000;

import android.os.Trace;

/* JADX INFO: renamed from: ۦؘؑۘۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3468 extends AbstractC5381 implements InterfaceC4825, InterfaceC3126, InterfaceC0349, InterfaceC2827, InterfaceC3975 {

    /* JADX INFO: renamed from: ۥً */
    public final boolean f11507;

    /* JADX INFO: renamed from: ۥٕ */
    public boolean f11508;

    /* JADX INFO: renamed from: ۥۙ */
    public boolean f11509;

    /* JADX INFO: renamed from: ۦؙ */
    public final int f11510;

    /* JADX INFO: renamed from: ۦٚ */
    public final InterfaceC5731 f11511;

    public C3468(int i, InterfaceC5731 interfaceC5731, int i2) {
        i = (i2 & 1) != 0 ? 1 : i;
        boolean z = (i2 & 2) == 0;
        interfaceC5731 = (i2 & 4) != 0 ? null : interfaceC5731;
        this.f11507 = z;
        this.f11511 = interfaceC5731;
        this.f11510 = i;
    }

    /* JADX INFO: renamed from: ۦۥ */
    public static boolean m6247(C3468 c3468) {
        return c3468.m6255(7);
    }

    /* JADX INFO: renamed from: ۥؐ */
    public final C2793 m6248(InterfaceC2015 interfaceC2015) {
        C2793 c2793 = m6250().f4557;
        if (c2793 != C0373.f1370) {
            return interfaceC2015 == null ? c2793 : c2793.m5323(interfaceC2015.mo2781(AbstractC5537.m9247(this), 0L));
        }
        return interfaceC2015 != null ? interfaceC2015.mo2794(AbstractC5537.m9247(this), false) : AbstractC5568.m9368(0L, AbstractC5537.m9235(AbstractC5537.m9247(this).f982));
    }

    /* JADX INFO: renamed from: ۥؑ */
    public final boolean m6249(int i) {
        int iM6632 = AbstractC3761.m6632(AbstractC1434.m3046(this, i));
        if (iM6632 == 0) {
            return AbstractC1434.m3050(this);
        }
        if (iM6632 == 1) {
            return false;
        }
        if (iM6632 == 2) {
            return true;
        }
        if (iM6632 == 3) {
            return false;
        }
        C1078.m2275();
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [ۦٖ۠ؒٔ] */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [ۦٖ۠ؒٔ] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [ۥًؗۤ] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [ۥًؗۤ] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX INFO: renamed from: ۥؒ */
    public final C1321 m6250() {
        boolean z;
        C2457 c2457;
        C1321 c1321 = new C1321();
        c1321.f4555 = true;
        C3985 c3985 = C3985.f13306;
        c1321.f4553 = c3985;
        c1321.f4550 = c3985;
        c1321.f4556 = c3985;
        c1321.f4551 = c3985;
        c1321.f4552 = c3985;
        c1321.f4561 = c3985;
        c1321.f4554 = c3985;
        c1321.f4559 = c3985;
        c1321.f4558 = C1931.f6368;
        c1321.f4560 = C1931.f6372;
        c1321.f4557 = C0373.f1370;
        int i = this.f11510;
        if (i == 1) {
            z = true;
        } else if (i == 0) {
            z = !(((C0119) ((C3845) ((InterfaceC0310) AbstractC2552.m4807(this, AbstractC2853.f9548))).f12859.getValue()).f471 == 1);
        } else {
            if (i != 2) {
                C1078.m2276("Unknown Focusability");
                return null;
            }
            z = false;
        }
        c1321.f4555 = z;
        AbstractC5381 abstractC5381 = this.f17791;
        if (!abstractC5381.f17786) {
            AbstractC3480.m6278("visitAncestors called on an unattached node");
        }
        AbstractC5381 abstractC5382 = this.f17791;
        C0605 c0605M9270 = AbstractC5537.m9270(this);
        loop0: while (c0605M9270 != null) {
            if ((((AbstractC5381) c0605M9270.f2256.f8210).f17782 & 3072) != 0) {
                while (abstractC5382 != null) {
                    int i2 = abstractC5382.f17781;
                    if ((i2 & 3072) != 0) {
                        if (abstractC5382 != abstractC5381 && (i2 & 1024) != 0) {
                            break loop0;
                        }
                        if ((i2 & 2048) != 0) {
                            ?? c0863 = 0;
                            ?? M9233 = abstractC5382;
                            while (M9233 != 0) {
                                if (M9233 instanceof InterfaceC5448) {
                                    ((InterfaceC5448) M9233).mo5853(c1321);
                                } else if ((M9233.f17781 & 2048) != 0 && (M9233 instanceof AbstractC3019)) {
                                    AbstractC5381 abstractC5383 = ((AbstractC3019) M9233).f10167;
                                    int i3 = 0;
                                    while (abstractC5383 != null) {
                                        if ((abstractC5383.f17781 & 2048) != 0) {
                                            i3++;
                                            if (i3 == 1) {
                                                M9233 = M9233;
                                                c0863 = c0863;
                                                c0863 = c0863;
                                                M9233 = abstractC5383;
                                            } else {
                                                if (c0863 == 0) {
                                                    c0863 = new C0863(new AbstractC5381[16]);
                                                }
                                                if (M9233 != 0) {
                                                    c0863.m1843(M9233);
                                                    M9233 = 0;
                                                }
                                                c0863.m1843(abstractC5383);
                                            }
                                        } else {
                                            M9233 = M9233;
                                            c0863 = c0863;
                                        }
                                        abstractC5383 = abstractC5383.f17783;
                                        M9233 = M9233;
                                        c0863 = c0863;
                                    }
                                    if (i3 == 1) {
                                        M9233 = M9233;
                                        c0863 = c0863;
                                    } else {
                                        M9233 = M9233;
                                        c0863 = c0863;
                                    }
                                }
                                M9233 = AbstractC5537.m9233(c0863);
                            }
                        }
                    }
                    abstractC5382 = abstractC5382.f17780;
                }
            }
            c0605M9270 = c0605M9270.m1356();
            abstractC5382 = (c0605M9270 == null || (c2457 = c0605M9270.f2256) == null) ? null : (C1850) c2457.f8202;
        }
        return c1321;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [ۦٖ۠ؒٔ] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [ۦٖ۠ؒٔ] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [ۥًؗۤ] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [ۥًؗۤ] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX INFO: renamed from: ۥٜ */
    public final void m6251(EnumC4125 enumC4125, EnumC4125 enumC4126) {
        C2457 c2457;
        InterfaceC5731 interfaceC5731;
        C2016 c2016 = (C2016) ((ViewTreeObserverOnGlobalLayoutListenerC0850) AbstractC5537.m9224(this)).getFocusOwner();
        C3468 c3468M3926 = c2016.m3926();
        if (!enumC4125.equals(enumC4126) && (interfaceC5731 = this.f11511) != null) {
            interfaceC5731.mo219(enumC4125, enumC4126);
        }
        AbstractC5381 abstractC5381 = this.f17791;
        if (!abstractC5381.f17786) {
            AbstractC3480.m6278("visitAncestors called on an unattached node");
        }
        AbstractC5381 abstractC5382 = this.f17791;
        C0605 c0605M9270 = AbstractC5537.m9270(this);
        while (c0605M9270 != null) {
            if ((((AbstractC5381) c0605M9270.f2256.f8210).f17782 & 5120) != 0) {
                while (abstractC5382 != null) {
                    int i = abstractC5382.f17781;
                    if ((i & 5120) != 0) {
                        if (abstractC5382 != abstractC5381 && (i & 1024) != 0) {
                            return;
                        }
                        if ((i & 4096) != 0) {
                            ?? M9233 = abstractC5382;
                            ?? c0863 = 0;
                            while (M9233 != 0) {
                                if (M9233 instanceof InterfaceC3392) {
                                    InterfaceC3392 interfaceC3392 = (InterfaceC3392) M9233;
                                    if (c3468M3926 == c2016.m3926()) {
                                        interfaceC3392.mo2392(enumC4126);
                                    }
                                } else if ((M9233.f17781 & 4096) != 0 && (M9233 instanceof AbstractC3019)) {
                                    AbstractC5381 abstractC5383 = ((AbstractC3019) M9233).f10167;
                                    int i2 = 0;
                                    M9233 = M9233;
                                    c0863 = c0863;
                                    while (abstractC5383 != null) {
                                        if ((abstractC5383.f17781 & 4096) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                c0863 = c0863;
                                                M9233 = abstractC5383;
                                            } else {
                                                if (c0863 == 0) {
                                                    c0863 = new C0863(new AbstractC5381[16]);
                                                }
                                                if (M9233 != 0) {
                                                    c0863.m1843(M9233);
                                                    M9233 = 0;
                                                }
                                                c0863.m1843(abstractC5383);
                                            }
                                        }
                                        abstractC5383 = abstractC5383.f17783;
                                        M9233 = M9233;
                                        c0863 = c0863;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                M9233 = AbstractC5537.m9233(c0863);
                            }
                        }
                    }
                    abstractC5382 = abstractC5382.f17780;
                }
            }
            c0605M9270 = c0605M9270.m1356();
            abstractC5382 = (c0605M9270 == null || (c2457 = c0605M9270.f2256) == null) ? null : (C1850) c2457.f8202;
        }
    }

    /* JADX INFO: renamed from: ۥٟ */
    public final void m6252() {
        int iOrdinal = m6254().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return;
                }
                C1078.m2275();
                return;
            }
        }
        C5450 c5450 = new C5450();
        AbstractC5568.m9359(this, new C5304(5, c5450, this));
        Object obj = c5450.f17965;
        if ((obj == null ? null : (InterfaceC0133) obj).mo295()) {
            return;
        }
        ((C2016) ((ViewTreeObserverOnGlobalLayoutListenerC0850) AbstractC5537.m9224(this)).getFocusOwner()).m3927(8, true, true);
    }

    /* JADX INFO: renamed from: ۦؕ */
    public final C3317 m6253() {
        C2457 c2457;
        Object obj;
        if (!this.f17791.f17786) {
            AbstractC3480.m6278("visitAncestors called on an unattached node");
        }
        AbstractC5381 abstractC5381 = this.f17791.f17780;
        C0605 c0605M9270 = AbstractC5537.m9270(this);
        loop0: while (c0605M9270 != null) {
            if ((((AbstractC5381) c0605M9270.f2256.f8210).f17782 & 8388640) != 0) {
                while (abstractC5381 != null) {
                    int i = abstractC5381.f17781;
                    if ((i & 8388640) != 0) {
                        if ((8388608 & i) != 0) {
                            if (!(abstractC5381 instanceof C3317)) {
                                if (abstractC5381 instanceof AbstractC3019) {
                                    abstractC5381 = null;
                                    for (AbstractC5381 abstractC5382 = ((AbstractC3019) abstractC5381).f10167; abstractC5382 != null; abstractC5382 = abstractC5382.f17783) {
                                        if (abstractC5382 instanceof C3317) {
                                            abstractC5381 = abstractC5382;
                                        }
                                    }
                                } else {
                                    abstractC5381 = null;
                                }
                            }
                            C3317 c3317 = (C3317) abstractC5381;
                            if (c3317 != null) {
                                return c3317;
                            }
                        } else if ((i & 32) != 0) {
                            if (abstractC5381 instanceof InterfaceC2827) {
                                obj = abstractC5381;
                            } else if (abstractC5381 instanceof AbstractC3019) {
                                obj = null;
                                for (AbstractC5381 abstractC5383 = ((AbstractC3019) abstractC5381).f10167; abstractC5383 != null; abstractC5383 = abstractC5383.f17783) {
                                    if (abstractC5383 instanceof InterfaceC2827) {
                                        obj = abstractC5383;
                                    }
                                }
                            } else {
                                obj = null;
                            }
                            InterfaceC2827 interfaceC2827 = (InterfaceC2827) obj;
                            if (interfaceC2827 != null) {
                                interfaceC2827.mo5392();
                            }
                        }
                    }
                    abstractC5381 = abstractC5381.f17780;
                }
            }
            c0605M9270 = c0605M9270.m1356();
            abstractC5381 = (c0605M9270 == null || (c2457 = c0605M9270.f2256) == null) ? null : (C1850) c2457.f8202;
        }
        return null;
    }

    @Override // p000.AbstractC5381
    /* JADX INFO: renamed from: ۦؘ */
    public final boolean mo786() {
        return false;
    }

    @Override // p000.AbstractC5381
    /* JADX INFO: renamed from: ۦً */
    public final void mo1267() {
        if (m6254().m7315()) {
            ((C2016) ((ViewTreeObserverOnGlobalLayoutListenerC0850) AbstractC5537.m9224(this)).getFocusOwner()).m3927(8, true, true);
        }
    }

    @Override // p000.AbstractC5381
    /* JADX INFO: renamed from: ۦٓ */
    public final void mo788() {
        int iOrdinal = m6254().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                InterfaceC0475 focusOwner = ((ViewTreeObserverOnGlobalLayoutListenerC0850) AbstractC5537.m9224(this)).getFocusOwner();
                C3468 c3468M7060 = AbstractC3925.m7060(this);
                if (c3468M7060 == null || !c3468M7060.f11507) {
                    return;
                }
                C2016 c2016 = (C2016) focusOwner;
                c2016.f6642.m1789();
                c2016.f6643.m3595();
                return;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return;
                }
                C1078.m2275();
                return;
            }
        }
        C2016 c2017 = (C2016) ((ViewTreeObserverOnGlobalLayoutListenerC0850) AbstractC5537.m9224(this)).getFocusOwner();
        c2017.m3927(8, true, false);
        if (this.f11507) {
            c2017.f6642.m1789();
        }
        c2017.f6643.m3595();
    }

    @Override // p000.InterfaceC0349
    /* JADX INFO: renamed from: ۦٖ */
    public final void mo772() {
        m6252();
    }

    /* JADX INFO: renamed from: ۦ٘ */
    public final EnumC4125 m6254() {
        C3468 c3468M3926;
        C2457 c2457;
        if (this.f17786 && (c3468M3926 = ((C2016) ((ViewTreeObserverOnGlobalLayoutListenerC0850) AbstractC5537.m9224(this)).getFocusOwner()).m3926()) != null) {
            if (this == c3468M3926) {
                return EnumC4125.f13742;
            }
            if (c3468M3926.f17786) {
                if (!c3468M3926.f17791.f17786) {
                    AbstractC3480.m6278("visitAncestors called on an unattached node");
                }
                AbstractC5381 abstractC5381 = c3468M3926.f17791.f17780;
                C0605 c0605M9270 = AbstractC5537.m9270(c3468M3926);
                while (c0605M9270 != null) {
                    if ((((AbstractC5381) c0605M9270.f2256.f8210).f17782 & 1024) != 0) {
                        while (abstractC5381 != null) {
                            if ((abstractC5381.f17781 & 1024) != 0) {
                                AbstractC5381 abstractC5381M9233 = abstractC5381;
                                C0863 c0863 = null;
                                while (abstractC5381M9233 != null) {
                                    if (abstractC5381M9233 instanceof C3468) {
                                        if (this == ((C3468) abstractC5381M9233)) {
                                            return EnumC4125.f13741;
                                        }
                                    } else if ((abstractC5381M9233.f17781 & 1024) != 0 && (abstractC5381M9233 instanceof AbstractC3019)) {
                                        int i = 0;
                                        for (AbstractC5381 abstractC5382 = ((AbstractC3019) abstractC5381M9233).f10167; abstractC5382 != null; abstractC5382 = abstractC5382.f17783) {
                                            if ((abstractC5382.f17781 & 1024) != 0) {
                                                i++;
                                                if (i == 1) {
                                                    abstractC5381M9233 = abstractC5382;
                                                } else {
                                                    if (c0863 == null) {
                                                        c0863 = new C0863(new AbstractC5381[16]);
                                                    }
                                                    if (abstractC5381M9233 != null) {
                                                        c0863.m1843(abstractC5381M9233);
                                                        abstractC5381M9233 = null;
                                                    }
                                                    c0863.m1843(abstractC5382);
                                                }
                                            }
                                        }
                                        if (i == 1) {
                                        }
                                    }
                                    abstractC5381M9233 = AbstractC5537.m9233(c0863);
                                }
                            }
                            abstractC5381 = abstractC5381.f17780;
                        }
                    }
                    c0605M9270 = c0605M9270.m1356();
                    abstractC5381 = (c0605M9270 == null || (c2457 = c0605M9270.f2256) == null) ? null : (C1850) c2457.f8202;
                }
            }
        }
        return EnumC4125.f13739;
    }

    /* JADX INFO: renamed from: ۦۘ */
    public final boolean m6255(int i) {
        Trace.beginSection("FocusTransactions:requestFocus");
        try {
            return m6250().f4555 ? m6249(i) : AbstractC4009.m7156(this, i, new C2180(i, 4));
        } finally {
            Trace.endSection();
        }
    }

    @Override // p000.InterfaceC3126
    /* JADX INFO: renamed from: ۥْ */
    public final void mo5752(InterfaceC2015 interfaceC2015) {
    }
}
