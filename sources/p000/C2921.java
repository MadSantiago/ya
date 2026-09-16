package p000;

/* JADX INFO: renamed from: ۥۨؔٝٓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2921 extends AbstractC0275 implements InterfaceC1827, InterfaceC0155, InterfaceC4262 {

    /* JADX INFO: renamed from: ۥؓ */
    public boolean f9799;

    /* JADX INFO: renamed from: ۥؖ */
    public boolean f9801;

    /* JADX INFO: renamed from: ۥٖ */
    public final C1233 f9804;

    /* JADX INFO: renamed from: ۥ٘ */
    public boolean f9805;

    /* JADX INFO: renamed from: ۥٙ */
    public boolean f9806;

    /* JADX INFO: renamed from: ۥۦ */
    public boolean f9809;

    /* JADX INFO: renamed from: ۥۧ */
    public C3693 f9810;

    /* JADX INFO: renamed from: ۦٖ */
    public Object f9816;

    /* JADX INFO: renamed from: ۦٗ */
    public boolean f9817;

    /* JADX INFO: renamed from: ۦٚ */
    public InterfaceC4745 f9818;

    /* JADX INFO: renamed from: ۦۛ */
    public int f9819 = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: ۥۖ */
    public int f9807 = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: ۦٕ */
    public int f9815 = 3;

    /* JADX INFO: renamed from: ۥً */
    public long f9802 = 0;

    /* JADX INFO: renamed from: ۥٕ */
    public int f9803 = 3;

    /* JADX INFO: renamed from: ۥۙ */
    public final C0143 f9808 = new C0143(this, 1);

    /* JADX INFO: renamed from: ۦؙ */
    public final C0863 f9813 = new C0863(new C2921[16]);

    /* JADX INFO: renamed from: ۦؖ */
    public boolean f9811 = true;

    /* JADX INFO: renamed from: ۦؗ */
    public final C4913 f9812 = new C4913(this, 0);

    /* JADX INFO: renamed from: ۦُ */
    public boolean f9814 = true;

    /* JADX INFO: renamed from: ۥؔ */
    public long f9800 = AbstractC0671.m1494(0, 0, 0, 0, 15);

    /* JADX INFO: renamed from: ۦۜ */
    public final C4913 f9820 = new C4913(this, 2);

    /* JADX INFO: renamed from: ۦۣ */
    public final C4913 f9821 = new C4913(this, 1);

    public C2921(C1233 c1233) {
        this.f9804 = c1233;
        this.f9816 = c1233.f4252.f7751;
    }

    @Override // p000.InterfaceC0155
    public final void requestLayout() {
        this.f9804.f4243.m1346(false);
    }

    @Override // p000.InterfaceC1827
    /* JADX INFO: renamed from: ۥؙ */
    public final int mo3596(int i) {
        m5506();
        return this.f9804.m2603().mo2793().mo3596(i);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0025  */
    @Override // p000.InterfaceC1827
    /* JADX INFO: renamed from: ۥُ */
    public final AbstractC0275 mo3597(long j) {
        C1233 c1233 = this.f9804;
        C0605 c0605 = c1233.f4243;
        C0605 c0606 = c1233.f4243;
        C0605 c0605M1356 = c0605.m1356();
        int i = 2;
        if ((c0605M1356 != null ? c0605M1356.f2261.f4244 : 0) == 2) {
            c1233.f4241 = false;
        } else {
            C0605 c0605M1357 = c0606.m1356();
            if ((c0605M1357 != null ? c0605M1357.f2261.f4244 : 0) == 4) {
                c1233.f4241 = false;
            }
        }
        C0605 c0605M1358 = c0606.m1356();
        if (c0605M1358 != null) {
            C1233 c1234 = c0605M1358.f2261;
            if (this.f9815 != 3 && !c0606.f2249) {
                AbstractC3480.m6278("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int iM6632 = AbstractC3761.m6632(c1234.f4244);
            if (iM6632 == 0 || iM6632 == 1) {
                i = 1;
            } else if (iM6632 != 2 && iM6632 != 3) {
                C1078.m2276("Measurable could be only measured from the parent's measure or layout block. Parents state is ".concat(AbstractC5078.m8682(c1234.f4244)));
                return null;
            }
            this.f9815 = i;
        } else {
            this.f9815 = 3;
        }
        if (c0606.f2252 == 3) {
            c0606.m1318();
        }
        m5509(j);
        return this;
    }

    @Override // p000.InterfaceC1827
    /* JADX INFO: renamed from: ۥّ */
    public final int mo3598(int i) {
        m5506();
        return this.f9804.m2603().mo2793().mo3598(i);
    }

    @Override // p000.InterfaceC0155
    /* JADX INFO: renamed from: ۥْ */
    public final void mo327() {
        this.f9809 = true;
        C0143 c0143 = this.f9808;
        c0143.m317();
        C1233 c1233 = this.f9804;
        boolean z = c1233.f4239;
        C0605 c0605 = c1233.f4243;
        if (z) {
            C0863 c0863M1329 = c0605.m1329();
            Object[] objArr = c0863M1329.f3182;
            int i = c0863M1329.f3180;
            for (int i2 = 0; i2 < i; i2++) {
                C0605 c0606 = (C0605) objArr[i2];
                if (c0606.f2261.f4238 && c0606.m1320() == 1) {
                    C2921 c2921 = c0606.f2261.f4240;
                    if (c2921.m5509((c2921 != null ? c2921.f9810 : null).f12325)) {
                        C0605.m1313(c0605, false, 7);
                    }
                }
            }
        }
        C2242 c2242 = mo333().f9865;
        if (c1233.f4250 || (!this.f9806 && !c2242.f12092 && c1233.f4239)) {
            c1233.f4239 = false;
            int i3 = c1233.f4244;
            c1233.f4244 = 4;
            c1233.m2606(false);
            C1775 snapshotObserver = ((ViewTreeObserverOnGlobalLayoutListenerC0850) AbstractC5359.m8951(c0605)).getSnapshotObserver();
            snapshotObserver.getClass();
            snapshotObserver.f5926.m9077(c0605, C3948.f13191, this.f9812);
            c1233.f4244 = i3;
            if (c1233.f4246 && c2242.f12092) {
                requestLayout();
            }
            c1233.f4250 = false;
        }
        if (c0143.f571) {
            c0143.f566 = true;
        }
        if (c0143.f568 && c0143.m314()) {
            c0143.m320();
        }
        this.f9809 = false;
    }

    /* JADX INFO: renamed from: ۥٗ */
    public final void m5506() {
        int i;
        C1233 c1233 = this.f9804;
        C0605.m1313(c1233.f4243, false, 7);
        C0605 c0605 = c1233.f4243;
        C0605 c0605M1356 = c0605.m1356();
        if (c0605M1356 == null || c0605.f2252 != 3) {
            return;
        }
        int iM6632 = AbstractC3761.m6632(c0605M1356.f2261.f4244);
        if (iM6632 != 0) {
            i = 2;
            if (iM6632 != 2) {
                i = c0605M1356.f2252;
            }
        } else {
            i = 1;
        }
        c0605.f2252 = i;
    }

    @Override // p000.InterfaceC0155
    /* JADX INFO: renamed from: ۥ٘ */
    public final int mo328() {
        return this.f9807;
    }

    /* JADX INFO: renamed from: ۥٚ */
    public final void m5507(boolean z) {
        if (z && m5511()) {
            return;
        }
        if (z || m5511()) {
            this.f9803 = 3;
            C0863 c0863M1329 = this.f9804.f4243.m1329();
            Object[] objArr = c0863M1329.f3182;
            int i = c0863M1329.f3180;
            for (int i2 = 0; i2 < i; i2++) {
                ((C0605) objArr[i2]).f2261.f4240.m5507(true);
            }
        }
    }

    @Override // p000.InterfaceC0155
    /* JADX INFO: renamed from: ۥٛ */
    public final void mo329() {
        C0605.m1313(this.f9804.f4243, false, 7);
    }

    /* JADX INFO: renamed from: ۥۚ */
    public final void m5508() {
        C1233 c1233 = this.f9804;
        if (c1233.f4253 > 0) {
            C0863 c0863M1329 = c1233.f4243.m1329();
            Object[] objArr = c0863M1329.f3182;
            int i = c0863M1329.f3180;
            for (int i2 = 0; i2 < i; i2++) {
                C0605 c0605 = (C0605) objArr[i2];
                C1233 c1234 = c0605.f2261;
                if ((c1234.f4246 || c1234.f4251) && !c1234.f4239) {
                    c0605.m1346(false);
                }
                C2921 c2921 = c1234.f4240;
                if (c2921 != null) {
                    c2921.m5508();
                }
            }
        }
    }

    @Override // p000.InterfaceC1827
    /* JADX INFO: renamed from: ۥ۟ */
    public final int mo3599(int i) {
        m5506();
        return this.f9804.m2603().mo2793().mo3599(i);
    }

    /* JADX INFO: renamed from: ۥ۠ */
    public final boolean m5509(long j) {
        C1233 c1233 = this.f9804;
        C0605 c0605 = c1233.f4243;
        C0605 c0606 = c1233.f4243;
        try {
            if (c0605.f2242) {
                AbstractC3480.m6279("measure is called on a deactivated node");
            }
            C0605 c0605M1356 = c0606.m1356();
            c0606.f2249 = c0606.f2249 || (c0605M1356 != null && c0605M1356.f2249);
            if (!c0606.f2261.f4238) {
                C3693 c3693 = this.f9810;
                if (c3693 == null ? false : C3693.m6547(c3693.f12325, j)) {
                    InterfaceC2043 interfaceC2043 = c0606.f2259;
                    if (interfaceC2043 != null) {
                        ((ViewTreeObserverOnGlobalLayoutListenerC0850) interfaceC2043).m1792(c0606, true);
                    }
                    c0606.m1337();
                    return false;
                }
            }
            this.f9810 = new C3693(j);
            m573(j);
            this.f9808.f567 = false;
            C0863 c0863M1329 = c0606.m1329();
            Object[] objArr = c0863M1329.f3182;
            int i = c0863M1329.f3180;
            for (int i2 = 0; i2 < i; i2++) {
                ((C0605) objArr[i2]).f2261.f4240.f9808.f565 = false;
            }
            long j2 = this.f9799 ? this.f982 : -9223372034707292160L;
            this.f9799 = true;
            AbstractC2045 abstractC2045Mo2793 = c1233.m2603().mo2793();
            if (abstractC2045Mo2793 == null) {
                AbstractC3480.m6278("Lookahead result from lookaheadRemeasure cannot be null");
            }
            c1233.m2598(j);
            m572((((long) abstractC2045Mo2793.f985) << 32) | (((long) abstractC2045Mo2793.f984) & 4294967295L));
            return (((int) (j2 >> 32)) == abstractC2045Mo2793.f985 && ((int) (j2 & 4294967295L)) == abstractC2045Mo2793.f984) ? false : true;
        } catch (Throwable th) {
            c0605.m1367(th);
            throw null;
        }
    }

    @Override // p000.AbstractC0275
    /* JADX INFO: renamed from: ۥۡ */
    public final int mo567(AbstractC4642 abstractC4642) {
        C1233 c1233 = this.f9804;
        C0605 c0605M1356 = c1233.f4243.m1356();
        int i = c0605M1356 != null ? c0605M1356.f2261.f4244 : 0;
        C0143 c0143 = this.f9808;
        if (i == 2) {
            c0143.f565 = true;
        } else {
            C0605 c0605M1357 = c1233.f4243.m1356();
            if ((c0605M1357 != null ? c0605M1357.f2261.f4244 : 0) == 4) {
                c0143.f571 = true;
            }
        }
        this.f9806 = true;
        int iMo567 = c1233.m2603().mo2793().mo567(abstractC4642);
        this.f9806 = false;
        return iMo567;
    }

    @Override // p000.InterfaceC0155
    /* JADX INFO: renamed from: ۥۣ */
    public final C0143 mo330() {
        return this.f9808;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0068 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0006, B:5:0x000d, B:9:0x0016, B:12:0x001b, B:14:0x001f, B:15:0x0024, B:17:0x0033, B:19:0x0037, B:22:0x003d, B:21:0x003b, B:23:0x0040, B:25:0x004a, B:30:0x0053, B:32:0x0081, B:31:0x0068), top: B:36:0x0006 }] */
    /* JADX INFO: renamed from: ۦؐ */
    public final void m5510(long j, InterfaceC4745 interfaceC4745) throws Throwable {
        C1233 c1233 = this.f9804;
        C0605 c0605 = c1233.f4243;
        C0605 c0606 = c1233.f4243;
        try {
            C0605 c0605M1356 = c0605.m1356();
            if ((c0605M1356 != null ? c0605M1356.f2261.f4244 : 0) == 4) {
                c1233.f4237 = false;
            }
            if (c0606.f2242) {
                AbstractC3480.m6279("place is called on a deactivated node");
            }
            c1233.f4244 = 4;
            boolean z = true;
            this.f9801 = true;
            this.f9805 = false;
            if (!C0873.m1863(j, this.f9802)) {
                if (c1233.f4251 || c1233.f4246) {
                    c1233.f4239 = true;
                }
                m5508();
            }
            InterfaceC2043 interfaceC2043M8951 = AbstractC5359.m8951(c0606);
            this.f9802 = j;
            if (c1233.f4239) {
                c1233.m2602(false);
                this.f9808.f574 = false;
                C1775 snapshotObserver = ((ViewTreeObserverOnGlobalLayoutListenerC0850) interfaceC2043M8951).getSnapshotObserver();
                C4913 c4913 = this.f9821;
                snapshotObserver.getClass();
                snapshotObserver.f5926.m9077(c0606, C3948.f13200, c4913);
            } else {
                if (this.f9803 == 3) {
                    z = false;
                }
                if (z) {
                    AbstractC2045 abstractC2045Mo2793 = c1233.m2603().mo2793();
                    abstractC2045Mo2793.m3990(C0873.m1861(j, abstractC2045Mo2793.f981));
                    m5513();
                } else {
                    c1233.m2602(false);
                    this.f9808.f574 = false;
                    C1775 snapshotObserver2 = ((ViewTreeObserverOnGlobalLayoutListenerC0850) interfaceC2043M8951).getSnapshotObserver();
                    C4913 c4914 = this.f9821;
                    snapshotObserver2.getClass();
                    snapshotObserver2.f5926.m9077(c0606, C3948.f13200, c4914);
                }
            }
            this.f9818 = interfaceC4745;
            c1233.f4244 = 5;
        } catch (Throwable th) {
            c0605.m1367(th);
            throw null;
        }
    }

    /* JADX INFO: renamed from: ۦؓ */
    public final boolean m5511() {
        C1233 c1233 = this.f9804;
        return AbstractC2765.m5126(c1233.f4243) || c1233.f4237;
    }

    @Override // p000.InterfaceC0155
    /* JADX INFO: renamed from: ۦؚ */
    public final void mo331(C2932 c2932) {
        C0863 c0863M1329 = this.f9804.f4243.m1329();
        Object[] objArr = c0863M1329.f3182;
        int i = c0863M1329.f3180;
        for (int i2 = 0; i2 < i; i2++) {
            c2932.mo211(((C0605) objArr[i2]).f2261.f4240);
        }
    }

    @Override // p000.InterfaceC4262
    /* JADX INFO: renamed from: ۦٌ */
    public final void mo4387(boolean z) {
        AbstractC2045 abstractC2045Mo2793;
        C1233 c1233 = this.f9804;
        AbstractC2045 abstractC2045Mo2794 = c1233.m2603().mo2793();
        if (Boolean.valueOf(z).equals(abstractC2045Mo2794 != null ? Boolean.valueOf(abstractC2045Mo2794.f12093) : null) || (abstractC2045Mo2793 = c1233.m2603().mo2793()) == null) {
            return;
        }
        abstractC2045Mo2793.f12093 = z;
    }

    /* JADX INFO: renamed from: ۦَ */
    public final void m5512() {
        int i = this.f9803;
        C1233 c1233 = this.f9804;
        boolean z = c1233.f4237;
        C0605 c0605 = c1233.f4243;
        if (z) {
            this.f9803 = 2;
        } else {
            this.f9803 = 1;
        }
        if (i != 1 && c1233.f4238) {
            C0605.m1313(c0605, true, 6);
        }
        C0863 c0863M1329 = c0605.m1329();
        Object[] objArr = c0863M1329.f3182;
        int i2 = c0863M1329.f3180;
        for (int i3 = 0; i3 < i2; i3++) {
            C0605 c0606 = (C0605) objArr[i3];
            C2921 c2921 = c0606.f2261.f4240;
            if (c2921 == null) {
                C1078.m2272("Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.");
                return;
            }
            if (c2921.f9807 != Integer.MAX_VALUE) {
                c2921.m5512();
                C0605.m1311(c0606);
            }
        }
    }

    @Override // p000.AbstractC0275, p000.InterfaceC1827
    /* JADX INFO: renamed from: ۦِ */
    public final Object mo570() {
        return this.f9816;
    }

    /* JADX INFO: renamed from: ۦٔ */
    public final void m5513() {
        int i;
        this.f9805 = true;
        C1233 c1233 = this.f9804;
        C0605 c0605M1356 = c1233.f4243.m1356();
        int i2 = this.f9803;
        if ((i2 != 1 && !c1233.f4237) || (i2 != 2 && c1233.f4237)) {
            m5512();
            if (this.f9817 && c0605M1356 != null) {
                c0605M1356.m1346(false);
            }
        }
        if (c0605M1356 != null) {
            C1233 c1234 = c0605M1356.f2261;
            if (!this.f9817 && ((i = c1234.f4244) == 3 || i == 4)) {
                if (this.f9807 != Integer.MAX_VALUE) {
                    AbstractC3480.m6278("Place was called on a node which was placed already");
                }
                int i3 = c1234.f4242;
                this.f9807 = i3;
                c1234.f4242 = i3 + 1;
            }
        } else {
            this.f9807 = 0;
        }
        mo327();
    }

    @Override // p000.AbstractC0275
    /* JADX INFO: renamed from: ۦٝ */
    public final void mo571(long j, float f, InterfaceC4745 interfaceC4745) throws Throwable {
        m5510(j, interfaceC4745);
    }

    @Override // p000.InterfaceC0155
    /* JADX INFO: renamed from: ۦ۟ */
    public final InterfaceC0155 mo332() {
        C1233 c1233;
        C0605 c0605M1356 = this.f9804.f4243.m1356();
        if (c0605M1356 == null || (c1233 = c0605M1356.f2261) == null) {
            return null;
        }
        return c1233.f4240;
    }

    @Override // p000.InterfaceC1827
    /* JADX INFO: renamed from: ۦۣ */
    public final int mo3600(int i) {
        m5506();
        return this.f9804.m2603().mo2793().mo3600(i);
    }

    @Override // p000.InterfaceC0155
    /* JADX INFO: renamed from: ۦۨ */
    public final C2935 mo333() {
        return (C2935) this.f9804.f4243.f2256.f8206;
    }
}
