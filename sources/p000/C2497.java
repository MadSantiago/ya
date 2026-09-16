package p000;

/* JADX INFO: renamed from: ۥؙ۠ؓۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2497 implements InterfaceC2442 {

    /* JADX INFO: renamed from: ۦ۟ */
    public InterfaceC0951 f8303;

    /* JADX INFO: renamed from: ۦۨ */
    public final C2004 f8304 = new C2004();

    @Override // p000.InterfaceC2442
    public final EnumC2459 getLayoutDirection() {
        return this.f8304.f6604.f8015;
    }

    @Override // p000.InterfaceC2442
    /* JADX INFO: renamed from: ۥؕ */
    public final void mo3900(long j, long j2, long j3, float f) {
        this.f8304.mo3900(j, j2, j3, f);
    }

    @Override // p000.InterfaceC2880
    /* JADX INFO: renamed from: ۥؖ */
    public final float mo741(float f) {
        return this.f8304.mo746() * f;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final void m4643(InterfaceC3212 interfaceC3212, long j, AbstractC1311 abstractC1311, InterfaceC0951 interfaceC0951, C4893 c4893) {
        InterfaceC0951 interfaceC0952 = this.f8303;
        this.f8303 = interfaceC0951;
        EnumC2459 enumC2459 = abstractC1311.f4513.f2272;
        C2808 c2808 = this.f8304.f6603;
        C2406 c2406 = ((C2004) c2808.f9377).f6604;
        InterfaceC2880 interfaceC2880 = c2406.f8016;
        EnumC2459 enumC24510 = c2406.f8015;
        InterfaceC3212 interfaceC3212M5353 = c2808.m5353();
        long jM5355 = c2808.m5355();
        C4893 c4894 = (C4893) c2808.f9376;
        c2808.m5341(abstractC1311);
        c2808.m5346(enumC2459);
        c2808.m5356(interfaceC3212);
        c2808.m5351(j);
        c2808.f9376 = c4893;
        interfaceC3212.mo2092();
        try {
            interfaceC0951.mo1726(this);
            interfaceC3212.mo2095();
            c2808.m5341(interfaceC2880);
            c2808.m5346(enumC24510);
            c2808.m5356(interfaceC3212M5353);
            c2808.m5351(jM5355);
            c2808.f9376 = c4894;
            this.f8303 = interfaceC0952;
        } catch (Throwable th) {
            interfaceC3212.mo2095();
            c2808.m5341(interfaceC2880);
            c2808.m5346(enumC24510);
            c2808.m5356(interfaceC3212M5353);
            c2808.m5351(jM5355);
            c2808.f9376 = c4894;
            throw th;
        }
    }

    @Override // p000.InterfaceC2880
    /* JADX INFO: renamed from: ۥٌ */
    public final long mo742(float f) {
        return this.f8304.mo742(f);
    }

    @Override // p000.InterfaceC2442
    /* JADX INFO: renamed from: ۥٍ */
    public final void mo3902(long j, long j2, long j3, float f, int i) {
        this.f8304.mo3902(j, j2, j3, f, i);
    }

    @Override // p000.InterfaceC2442
    /* JADX INFO: renamed from: ۥِ */
    public final void mo3904(C0935 c0935, long j, AbstractC0213 abstractC0213) {
        this.f8304.mo3904(c0935, j, abstractC0213);
    }

    @Override // p000.InterfaceC2442
    /* JADX INFO: renamed from: ۥٙ */
    public final void mo3905(long j, long j2, long j3, long j4, AbstractC0213 abstractC0213) {
        this.f8304.mo3905(j, j2, j3, j4, abstractC0213);
    }

    @Override // p000.InterfaceC2880
    /* JADX INFO: renamed from: ۥٝ */
    public final int mo743(float f) {
        return this.f8304.mo743(f);
    }

    @Override // p000.InterfaceC2880
    /* JADX INFO: renamed from: ۥٞ */
    public final float mo744(long j) {
        return this.f8304.mo744(j);
    }

    @Override // p000.InterfaceC2880
    /* JADX INFO: renamed from: ۥۖ */
    public final long mo745(float f) {
        return this.f8304.mo745(f);
    }

    @Override // p000.InterfaceC2880
    /* JADX INFO: renamed from: ۥۗ */
    public final float mo746() {
        return this.f8304.mo746();
    }

    @Override // p000.InterfaceC2442
    /* JADX INFO: renamed from: ۥۜ */
    public final void mo3906(C0935 c0935, AbstractC0548 abstractC0548, float f, AbstractC0213 abstractC0213, int i) {
        this.f8304.mo3906(c0935, abstractC0548, f, abstractC0213, i);
    }

    @Override // p000.InterfaceC2880
    /* JADX INFO: renamed from: ۥۢ */
    public final long mo747(long j) {
        return this.f8304.mo747(j);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m4644() {
        C2004 c2004 = this.f8304;
        C2808 c2808 = c2004.f6603;
        InterfaceC3212 interfaceC3212M5353 = c2004.f6603.m5353();
        InterfaceC3975 interfaceC3975 = this.f8303;
        if (interfaceC3975 == null) {
            throw AbstractC3761.m6633("Attempting to drawContent for a `null` node. This usually means that a call to ContentDrawScope#drawContent() has been captured inside a lambda, and is being invoked outside of the draw pass. Capturing the scope this way is unsupported - if you are trying to record drawContent with graphicsLayer.record(), make sure you are using the GraphicsLayer#record function within DrawScope, instead of the member function on GraphicsLayer.");
        }
        AbstractC5381 abstractC5381 = (AbstractC5381) interfaceC3975;
        AbstractC5381 abstractC5381M9233 = abstractC5381.f17791.f17783;
        if (abstractC5381M9233 != null && (abstractC5381M9233.f17782 & 4) != 0) {
            while (true) {
                if (abstractC5381M9233 != null) {
                    int i = abstractC5381M9233.f17781;
                    if ((i & 2) == 0) {
                        if ((i & 4) != 0) {
                            break;
                        } else {
                            abstractC5381M9233 = abstractC5381M9233.f17783;
                        }
                    }
                }
                abstractC5381M9233 = null;
                break;
            }
        } else {
            abstractC5381M9233 = null;
            break;
        }
        if (abstractC5381M9233 == null) {
            AbstractC1311 abstractC1311M9245 = AbstractC5537.m9245(interfaceC3975, 4);
            if (abstractC1311M9245.mo2787() == abstractC5381.f17791) {
                abstractC1311M9245 = abstractC1311M9245.f4530;
            }
            abstractC1311M9245.mo9787(interfaceC3212M5353, (C4893) c2808.f9376);
            return;
        }
        C0863 c0863 = null;
        while (abstractC5381M9233 != null) {
            if (abstractC5381M9233 instanceof InterfaceC0951) {
                InterfaceC0951 interfaceC0951 = (InterfaceC0951) abstractC5381M9233;
                C4893 c4893 = (C4893) c2808.f9376;
                AbstractC1311 abstractC1311M9246 = AbstractC5537.m9245(interfaceC0951, 4);
                long jM9235 = AbstractC5537.m9235(abstractC1311M9246.f982);
                C0605 c0605 = abstractC1311M9246.f4513;
                c0605.getClass();
                ((ViewTreeObserverOnGlobalLayoutListenerC0850) AbstractC5359.m8951(c0605)).getSharedDrawScope().m4643(interfaceC3212M5353, jM9235, abstractC1311M9246, interfaceC0951, c4893);
            } else if ((abstractC5381M9233.f17781 & 4) != 0 && (abstractC5381M9233 instanceof AbstractC3019)) {
                int i2 = 0;
                for (AbstractC5381 abstractC5382 = ((AbstractC3019) abstractC5381M9233).f10167; abstractC5382 != null; abstractC5382 = abstractC5382.f17783) {
                    if ((abstractC5382.f17781 & 4) != 0) {
                        i2++;
                        if (i2 == 1) {
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
                if (i2 == 1) {
                }
            }
            abstractC5381M9233 = AbstractC5537.m9233(c0863);
        }
    }

    @Override // p000.InterfaceC2880
    /* JADX INFO: renamed from: ۥۦ */
    public final int mo749(long j) {
        return this.f8304.mo749(j);
    }

    @Override // p000.InterfaceC2442
    /* JADX INFO: renamed from: ۦؑ */
    public final long mo4567() {
        return this.f8304.mo4567();
    }

    @Override // p000.InterfaceC2442
    /* JADX INFO: renamed from: ۦؒ */
    public final void mo3907(C1955 c1955, long j, long j2, long j3, float f, C1516 c1516, int i) {
        this.f8304.mo3907(c1955, j, j2, j3, f, c1516, i);
    }

    @Override // p000.InterfaceC2880
    /* JADX INFO: renamed from: ۦُ */
    public final float mo751(long j) {
        return this.f8304.mo751(j);
    }

    @Override // p000.InterfaceC2880
    /* JADX INFO: renamed from: ۦٕ */
    public final long mo752(long j) {
        return this.f8304.mo752(j);
    }

    @Override // p000.InterfaceC2442
    /* JADX INFO: renamed from: ۦٚ */
    public final C2808 mo3908() {
        return this.f8304.f6603;
    }

    @Override // p000.InterfaceC2880
    /* JADX INFO: renamed from: ۦۖ */
    public final float mo753(float f) {
        return f / this.f8304.mo746();
    }

    @Override // p000.InterfaceC2880
    /* JADX INFO: renamed from: ۦۚ */
    public final float mo754() {
        return this.f8304.mo754();
    }

    @Override // p000.InterfaceC2442
    /* JADX INFO: renamed from: ۦ۠ */
    public final long mo4568() {
        return this.f8304.mo4568();
    }

    @Override // p000.InterfaceC2442
    /* JADX INFO: renamed from: ۦۢ */
    public final void mo3909(long j, float f, long j2, AbstractC0213 abstractC0213) {
        this.f8304.mo3909(j, f, j2, abstractC0213);
    }

    @Override // p000.InterfaceC2880
    /* JADX INFO: renamed from: ۦۦ */
    public final float mo756(int i) {
        return this.f8304.mo756(i);
    }
}
