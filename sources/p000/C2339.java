package p000;

import java.util.List;

/* JADX INFO: renamed from: ۥٟۛؗۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2339 extends AbstractC0275 implements InterfaceC1827, InterfaceC0155, InterfaceC4262 {

    /* JADX INFO: renamed from: ۥؖ */
    public boolean f7747;

    /* JADX INFO: renamed from: ۥؚ */
    public float f7749;

    /* JADX INFO: renamed from: ۥً */
    public float f7750;

    /* JADX INFO: renamed from: ۥٕ */
    public Object f7751;

    /* JADX INFO: renamed from: ۥٖ */
    public final C1233 f7752;

    /* JADX INFO: renamed from: ۥٙ */
    public boolean f7754;

    /* JADX INFO: renamed from: ۥٝ */
    public InterfaceC4745 f7756;

    /* JADX INFO: renamed from: ۥۙ */
    public boolean f7758;

    /* JADX INFO: renamed from: ۥۡ */
    public boolean f7760;

    /* JADX INFO: renamed from: ۥۤ */
    public float f7761;

    /* JADX INFO: renamed from: ۥۦ */
    public boolean f7762;

    /* JADX INFO: renamed from: ۥۧ */
    public InterfaceC4745 f7763;

    /* JADX INFO: renamed from: ۦؒ */
    public boolean f7764;

    /* JADX INFO: renamed from: ۦؖ */
    public boolean f7765;

    /* JADX INFO: renamed from: ۦؗ */
    public boolean f7766;

    /* JADX INFO: renamed from: ۦؙ */
    public boolean f7767;

    /* JADX INFO: renamed from: ۦٕ */
    public boolean f7769;

    /* JADX INFO: renamed from: ۦٗ */
    public boolean f7771;

    /* JADX INFO: renamed from: ۦۜ */
    public boolean f7774;

    /* JADX INFO: renamed from: ۦۛ */
    public int f7773 = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: ۥۖ */
    public int f7757 = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: ۦۧ */
    public int f7776 = 3;

    /* JADX INFO: renamed from: ۥؓ */
    public long f7745 = 0;

    /* JADX INFO: renamed from: ۦٚ */
    public boolean f7772 = true;

    /* JADX INFO: renamed from: ۦُ */
    public final C0143 f7768 = new C0143(this, 0);

    /* JADX INFO: renamed from: ۦٖ */
    public final C0863 f7770 = new C0863(new C2339[16]);

    /* JADX INFO: renamed from: ۥؔ */
    public boolean f7746 = true;

    /* JADX INFO: renamed from: ۦۣ */
    public long f7775 = AbstractC0671.m1494(0, 0, 0, 0, 15);

    /* JADX INFO: renamed from: ۥ٘ */
    public final C1584 f7753 = new C1584(this, 1);

    /* JADX INFO: renamed from: ۥٛ */
    public final C1584 f7755 = new C1584(this, 0);

    /* JADX INFO: renamed from: ۥ۟ */
    public long f7759 = 0;

    /* JADX INFO: renamed from: ۥؙ */
    public final C1584 f7748 = new C1584(this, 2);

    public C2339(C1233 c1233) {
        this.f7752 = c1233;
    }

    @Override // p000.InterfaceC0155
    public final void requestLayout() {
        this.f7752.f4243.m1336(false);
    }

    @Override // p000.InterfaceC1827
    /* JADX INFO: renamed from: ۥؙ */
    public final int mo3596(int i) {
        C1233 c1233 = this.f7752;
        if (AbstractC2765.m5126(c1233.f4243)) {
            return c1233.f4240.mo3596(i);
        }
        m4383();
        return c1233.m2603().mo3596(i);
    }

    @Override // p000.InterfaceC1827
    /* JADX INFO: renamed from: ۥُ */
    public final AbstractC0275 mo3597(long j) {
        int i;
        C1233 c1233 = this.f7752;
        C0605 c0605 = c1233.f4243;
        C0605 c0606 = c1233.f4243;
        if (c0605.f2252 == 3) {
            c0605.m1318();
        }
        if (AbstractC2765.m5126(c0606)) {
            C2921 c2921 = c1233.f4240;
            c2921.f9815 = 3;
            c2921.mo3597(j);
        }
        C0605 c0605M1356 = c0606.m1356();
        if (c0605M1356 != null) {
            C1233 c1234 = c0605M1356.f2261;
            if (this.f7776 != 3 && !c0606.f2249) {
                AbstractC3480.m6278("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int iM6632 = AbstractC3761.m6632(c1234.f4244);
            if (iM6632 != 0) {
                i = 2;
                if (iM6632 != 2) {
                    C1078.m2276("Measurable could be only measured from the parent's measure or layout block. Parents state is ".concat(AbstractC5078.m8682(c1234.f4244)));
                    return null;
                }
            } else {
                i = 1;
            }
            this.f7776 = i;
        } else {
            this.f7776 = 3;
        }
        m4385(j);
        return this;
    }

    @Override // p000.InterfaceC1827
    /* JADX INFO: renamed from: ۥّ */
    public final int mo3598(int i) {
        C1233 c1233 = this.f7752;
        if (AbstractC2765.m5126(c1233.f4243)) {
            return c1233.f4240.mo3598(i);
        }
        m4383();
        return c1233.m2603().mo3598(i);
    }

    @Override // p000.InterfaceC0155
    /* JADX INFO: renamed from: ۥْ */
    public final void mo327() {
        boolean zM4385;
        this.f7774 = true;
        C0143 c0143 = this.f7768;
        c0143.m317();
        boolean z = this.f7762;
        C1233 c1233 = this.f7752;
        if (z) {
            C0863 c0863M1329 = c1233.f4243.m1329();
            Object[] objArr = c0863M1329.f3182;
            int i = c0863M1329.f3180;
            for (int i2 = 0; i2 < i; i2++) {
                C0605 c0605 = (C0605) objArr[i2];
                boolean zM1324 = c0605.m1324();
                C1233 c1234 = c0605.f2261;
                if (zM1324 && c0605.m1325() == 1) {
                    C2339 c2339 = c1234.f4252;
                    C3693 c3693 = c2339.f7769 ? new C3693(c2339.f983) : null;
                    if (c3693 != null) {
                        if (c0605.f2252 == 3) {
                            c0605.m1318();
                        }
                        zM4385 = c1234.f4252.m4385(c3693.f12325);
                    } else {
                        zM4385 = false;
                    }
                    if (zM4385) {
                        C0605.m1312(c1233.f4243, false, 7);
                    }
                }
            }
        }
        if (this.f7766 || (!this.f7747 && !mo333().f12092 && this.f7762)) {
            this.f7762 = false;
            int i3 = c1233.f4244;
            c1233.f4244 = 3;
            c1233.m2607(false);
            C0605 c0606 = c1233.f4243;
            C1775 snapshotObserver = ((ViewTreeObserverOnGlobalLayoutListenerC0850) AbstractC5359.m8951(c0606)).getSnapshotObserver();
            snapshotObserver.getClass();
            snapshotObserver.f5926.m9077(c0606, C3948.f13203, this.f7755);
            c1233.f4244 = i3;
            this.f7766 = false;
        }
        if (c0143.f571) {
            c0143.f566 = true;
        }
        if (c0143.f568 && c0143.m314()) {
            c0143.m320();
        }
        this.f7774 = false;
    }

    /* JADX INFO: renamed from: ۥٗ */
    public final void m4381() {
        this.f7764 = true;
        C1233 c1233 = this.f7752;
        C0605 c0605M1356 = c1233.f4243.m1356();
        float f = mo333().f4532;
        C0605 c0605 = c1233.f4243;
        C2457 c2457 = c0605.f2256;
        AbstractC1311 abstractC1311 = (AbstractC1311) c2457.f8201;
        C2935 c2935 = (C2935) c2457.f8206;
        while (abstractC1311 != c2935) {
            C2355 c2355 = (C2355) abstractC1311;
            f += c2355.f4532;
            abstractC1311 = c2355.f4530;
        }
        if (f != this.f7761) {
            this.f7761 = f;
            if (c0605M1356 != null) {
                c0605M1356.m1366();
            }
            if (c0605M1356 != null) {
                c0605M1356.m1319();
            }
        }
        if (!mo333().f12092) {
            boolean z = this.f7758;
            if (!z || this.f7768.m319()) {
                m4382();
            }
            if (z) {
                ((C2935) c0605.f2256.f8206).m9785();
            } else {
                if (c0605M1356 != null) {
                    c0605M1356.m1319();
                }
                if (this.f7771 && c0605M1356 != null) {
                    c0605M1356.m1336(false);
                }
            }
        }
        if (c0605M1356 != null) {
            C1233 c1234 = c0605M1356.f2261;
            if (!this.f7771 && c1234.f4244 == 3) {
                if (this.f7757 != Integer.MAX_VALUE) {
                    AbstractC3480.m6278("Place was called on a node which was placed already");
                }
                int i = c1234.f4248;
                this.f7757 = i;
                c1234.f4248 = i + 1;
            }
        } else {
            this.f7757 = 0;
        }
        mo327();
    }

    @Override // p000.InterfaceC0155
    /* JADX INFO: renamed from: ۥ٘ */
    public final int mo328() {
        return this.f7757;
    }

    /* JADX INFO: renamed from: ۥٚ */
    public final void m4382() {
        boolean z = this.f7758;
        this.f7758 = true;
        C1233 c1233 = this.f7752;
        C0605 c0605 = c1233.f4243;
        C2457 c2457 = c0605.f2256;
        if (!z) {
            ((C2935) c2457.f8206).m9785();
            ((ViewTreeObserverOnGlobalLayoutListenerC0850) AbstractC5359.m8951(c0605)).getRectManager().m9136(c1233.f4243);
            if (c0605.m1324()) {
                C0605.m1312(c0605, true, 6);
            } else if (c0605.f2261.f4238) {
                C0605.m1313(c0605, true, 6);
            }
        }
        AbstractC1311 abstractC1311 = ((C2935) c2457.f8206).f4530;
        for (AbstractC1311 abstractC1312 = (AbstractC1311) c2457.f8201; !AbstractC3831.m6874(abstractC1312, abstractC1311) && abstractC1312 != null; abstractC1312 = abstractC1312.f4530) {
            if (abstractC1312.f4533) {
                abstractC1312.m9779();
            }
        }
        C0863 c0863M1329 = c0605.m1329();
        Object[] objArr = c0863M1329.f3182;
        int i = c0863M1329.f3180;
        for (int i2 = 0; i2 < i; i2++) {
            C0605 c0606 = (C0605) objArr[i2];
            if (c0606.m1362() != Integer.MAX_VALUE) {
                c0606.f2261.f4252.m4382();
                C0605.m1311(c0606);
            }
        }
    }

    @Override // p000.InterfaceC0155
    /* JADX INFO: renamed from: ۥٛ */
    public final void mo329() {
        C0605.m1312(this.f7752.f4243, false, 7);
    }

    /* JADX INFO: renamed from: ۥۚ */
    public final void m4383() {
        int i;
        C1233 c1233 = this.f7752;
        C0605.m1312(c1233.f4243, false, 7);
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

    @Override // p000.InterfaceC1827
    /* JADX INFO: renamed from: ۥ۟ */
    public final int mo3599(int i) {
        C1233 c1233 = this.f7752;
        if (AbstractC2765.m5126(c1233.f4243)) {
            return c1233.f4240.mo3599(i);
        }
        m4383();
        return c1233.m2603().mo3599(i);
    }

    /* JADX INFO: renamed from: ۥ۠ */
    public final void m4384() {
        C1233 c1233 = this.f7752;
        C0605 c0605 = c1233.f4243;
        C0605 c0606 = c1233.f4243;
        if (!c0605.m1342() || c1233.f4245 <= 0) {
            return;
        }
        C1233 c1234 = c0606.f2261;
        if ((c1234.f4247 || c1234.f4249) && !c1234.f4252.f7762) {
            c0606.m1336(false);
        }
        C0863 c0863M1329 = c0606.m1329();
        Object[] objArr = c0863M1329.f3182;
        int i = c0863M1329.f3180;
        for (int i2 = 0; i2 < i; i2++) {
            ((C0605) objArr[i2]).f2261.f4252.m4384();
        }
    }

    @Override // p000.AbstractC0275
    /* JADX INFO: renamed from: ۥۡ */
    public final int mo567(AbstractC4642 abstractC4642) {
        C1233 c1233 = this.f7752;
        C0605 c0605M1356 = c1233.f4243.m1356();
        int i = c0605M1356 != null ? c0605M1356.f2261.f4244 : 0;
        C0143 c0143 = this.f7768;
        if (i == 1) {
            c0143.f565 = true;
        } else {
            C0605 c0605M1357 = c1233.f4243.m1356();
            if ((c0605M1357 != null ? c0605M1357.f2261.f4244 : 0) == 3) {
                c0143.f571 = true;
            }
        }
        this.f7747 = true;
        int iMo567 = c1233.m2603().mo567(abstractC4642);
        this.f7747 = false;
        return iMo567;
    }

    @Override // p000.InterfaceC0155
    /* JADX INFO: renamed from: ۥۣ */
    public final C0143 mo330() {
        return this.f7768;
    }

    @Override // p000.AbstractC0275
    /* JADX INFO: renamed from: ۥۥ */
    public final int mo568() {
        return this.f7752.m2603().mo568();
    }

    @Override // p000.AbstractC0275
    /* JADX INFO: renamed from: ۥۨ */
    public final int mo569() {
        return this.f7752.m2603().mo569();
    }

    /* JADX INFO: renamed from: ۦؐ */
    public final boolean m4385(long j) {
        C1233 c1233 = this.f7752;
        C0605 c0605 = c1233.f4243;
        C0605 c0606 = c1233.f4243;
        try {
            if (c0605.f2242) {
                AbstractC3480.m6279("measure is called on a deactivated node");
            }
            InterfaceC2043 interfaceC2043M8951 = AbstractC5359.m8951(c0606);
            C0605 c0605M1356 = c0606.m1356();
            boolean z = true;
            c0606.f2249 = c0606.f2249 || (c0605M1356 != null && c0605M1356.f2249);
            if (!c0606.m1324() && C3693.m6547(this.f983, j)) {
                ((ViewTreeObserverOnGlobalLayoutListenerC0850) interfaceC2043M8951).m1792(c0606, false);
                c0606.m1337();
                return false;
            }
            this.f7768.f567 = false;
            C0863 c0863M1329 = c0606.m1329();
            Object[] objArr = c0863M1329.f3182;
            int i = c0863M1329.f3180;
            for (int i2 = 0; i2 < i; i2++) {
                ((C0605) objArr[i2]).f2261.f4252.f7768.f565 = false;
            }
            this.f7769 = true;
            long j2 = c1233.m2603().f982;
            m573(j);
            if (c1233.f4244 != 5) {
                AbstractC3480.m6278("layout state is not idle before measure starts");
            }
            this.f7775 = j;
            c1233.f4244 = 1;
            this.f7765 = false;
            C1775 snapshotObserver = ((ViewTreeObserverOnGlobalLayoutListenerC0850) AbstractC5359.m8951(c0606)).getSnapshotObserver();
            C1584 c1584 = this.f7753;
            snapshotObserver.getClass();
            snapshotObserver.f5926.m9077(c0606, C3948.f13183, c1584);
            if (c1233.f4244 == 1) {
                this.f7762 = true;
                this.f7766 = true;
                c1233.f4244 = 5;
            }
            if (C4207.m7431(c1233.m2603().f982, j2) && c1233.m2603().f985 == this.f985 && c1233.m2603().f984 == this.f984) {
                z = false;
            }
            m572((((long) c1233.m2603().f984) & 4294967295L) | (((long) c1233.m2603().f985) << 32));
            return z;
        } catch (Throwable th) {
            c0605.m1367(th);
            throw null;
        }
    }

    /* JADX INFO: renamed from: ۦؓ */
    public final List m4386() {
        C1233 c1233 = this.f7752;
        c1233.f4243.m1338();
        boolean z = this.f7746;
        C0863 c0863 = this.f7770;
        if (!z) {
            return c0863.m1842();
        }
        C0605 c0605 = c1233.f4243;
        C0863 c0863M1329 = c0605.m1329();
        Object[] objArr = c0863M1329.f3182;
        int i = c0863M1329.f3180;
        for (int i2 = 0; i2 < i; i2++) {
            C0605 c0606 = (C0605) objArr[i2];
            if (c0863.f3180 <= i2) {
                c0863.m1843(c0606.f2261.f4252);
            } else {
                C2339 c2339 = c0606.f2261.f4252;
                Object[] objArr2 = c0863.f3182;
                Object obj = objArr2[i2];
                objArr2[i2] = c2339;
            }
        }
        c0863.m1847(((C0863) ((C3482) c0605.m1361()).f11560).f3180, c0863.f3180);
        this.f7746 = false;
        return c0863.m1842();
    }

    @Override // p000.InterfaceC0155
    /* JADX INFO: renamed from: ۦؚ */
    public final void mo331(C2932 c2932) {
        C0863 c0863M1329 = this.f7752.f4243.m1329();
        Object[] objArr = c0863M1329.f3182;
        int i = c0863M1329.f3180;
        for (int i2 = 0; i2 < i; i2++) {
            c2932.mo211(((C0605) objArr[i2]).f2261.f4252);
        }
    }

    @Override // p000.InterfaceC4262
    /* JADX INFO: renamed from: ۦٌ */
    public final void mo4387(boolean z) {
        C1233 c1233 = this.f7752;
        if (z != c1233.m2603().f12093) {
            c1233.m2603().f12093 = z;
            this.f7760 = true;
        }
    }

    /* JADX INFO: renamed from: ۦَ */
    public final void m4388() {
        if (this.f7758) {
            this.f7758 = false;
            C1233 c1233 = this.f7752;
            C0605 c0605 = c1233.f4243;
            C0605 c0606 = c1233.f4243;
            ((ViewTreeObserverOnGlobalLayoutListenerC0850) AbstractC5359.m8951(c0605)).getRectManager().m9141(c0606);
            C2457 c2457 = c0606.f2256;
            AbstractC1311 abstractC1311 = ((C2935) c2457.f8206).f4530;
            for (AbstractC1311 abstractC1312 = (AbstractC1311) c2457.f8201; !AbstractC3831.m6874(abstractC1312, abstractC1311) && abstractC1312 != null; abstractC1312 = abstractC1312.f4530) {
                abstractC1312.m9796();
                abstractC1312.m9774();
            }
            C0863 c0863M1329 = c0606.m1329();
            Object[] objArr = c0863M1329.f3182;
            int i = c0863M1329.f3180;
            for (int i2 = 0; i2 < i; i2++) {
                ((C0605) objArr[i2]).f2261.f4252.m4388();
            }
        }
    }

    @Override // p000.AbstractC0275, p000.InterfaceC1827
    /* JADX INFO: renamed from: ۦِ */
    public final Object mo570() {
        return this.f7751;
    }

    /* JADX INFO: renamed from: ۦٔ */
    public final void m4389(long j, float f, InterfaceC4745 interfaceC4745) {
        C1233 c1233 = this.f7752;
        C0605 c0605 = c1233.f4243;
        C0605 c0606 = c1233.f4243;
        if (c0605.f2242) {
            AbstractC3480.m6279("place is called on a deactivated node");
        }
        c1233.f4244 = 3;
        this.f7745 = j;
        this.f7750 = f;
        this.f7763 = interfaceC4745;
        this.f7764 = false;
        InterfaceC2043 interfaceC2043M8951 = AbstractC5359.m8951(c0606);
        if (this.f7762 || !this.f7758) {
            this.f7768.f574 = false;
            c1233.m2600(false);
            this.f7756 = interfaceC4745;
            this.f7759 = j;
            this.f7749 = f;
            C1775 snapshotObserver = ((ViewTreeObserverOnGlobalLayoutListenerC0850) interfaceC2043M8951).getSnapshotObserver();
            snapshotObserver.getClass();
            snapshotObserver.f5926.m9077(c0606, C3948.f13192, this.f7748);
        } else {
            AbstractC1311 abstractC1311M2603 = c1233.m2603();
            abstractC1311M2603.m9791(C0873.m1861(j, abstractC1311M2603.f981), f, interfaceC4745);
            m4381();
        }
        c1233.f4244 = 5;
        if (c1233.m2603().f12092 && (c1233.f4249 || c1233.f4247)) {
            requestLayout();
        }
        this.f7754 = true;
    }

    @Override // p000.AbstractC0275
    /* JADX INFO: renamed from: ۦٝ */
    public final void mo571(long j, float f, InterfaceC4745 interfaceC4745) throws Throwable {
        C1233 c1233 = this.f7752;
        C0605 c0605 = c1233.f4243;
        C0605 c0606 = c1233.f4243;
        try {
            this.f7767 = true;
            if (!C0873.m1863(j, this.f7745) || interfaceC4745 != this.f7763 || this.f7760) {
                if (c1233.f4249 || c1233.f4247 || this.f7760) {
                    this.f7762 = true;
                    this.f7760 = false;
                }
            }
            C2921 c2921 = c1233.f4240;
            if (c2921 != null) {
                C1233 c1234 = c2921.f9804;
                if (c2921.f9803 == 3 && !AbstractC2765.m5126(c1234.f4243)) {
                    c1234.f4237 = true;
                }
            }
            C2921 c2922 = c1233.f4240;
            if (c2922 != null && c2922.m5511()) {
                AbstractC1311 abstractC1311 = c1233.m2603().f4514;
                AbstractC1842 placementScope = abstractC1311 != null ? abstractC1311.f12090 : ((ViewTreeObserverOnGlobalLayoutListenerC0850) AbstractC5359.m8951(c0606)).getPlacementScope();
                C2921 c2923 = c1233.f4240;
                C0605 c0605M1356 = c0606.m1356();
                if (c0605M1356 != null) {
                    c0605M1356.f2261.f4242 = 0;
                }
                c2923.f9807 = Integer.MAX_VALUE;
                AbstractC1842.m3626(placementScope, c2923, (int) (j >> 32), (int) (4294967295L & j));
            }
            C2921 c2924 = c1233.f4240;
            if (c2924 != null && !c2924.f9801) {
                AbstractC3480.m6278("Error: Placement happened before lookahead.");
            }
            m4389(j, f, interfaceC4745);
        } catch (Throwable th) {
            c0605.m1367(th);
            throw null;
        }
    }

    @Override // p000.InterfaceC0155
    /* JADX INFO: renamed from: ۦ۟ */
    public final InterfaceC0155 mo332() {
        C1233 c1233;
        C0605 c0605M1356 = this.f7752.f4243.m1356();
        if (c0605M1356 == null || (c1233 = c0605M1356.f2261) == null) {
            return null;
        }
        return c1233.f4252;
    }

    @Override // p000.InterfaceC1827
    /* JADX INFO: renamed from: ۦۣ */
    public final int mo3600(int i) {
        C1233 c1233 = this.f7752;
        if (AbstractC2765.m5126(c1233.f4243)) {
            return c1233.f4240.mo3600(i);
        }
        m4383();
        return c1233.m2603().mo3600(i);
    }

    @Override // p000.InterfaceC0155
    /* JADX INFO: renamed from: ۦۨ */
    public final C2935 mo333() {
        return (C2935) this.f7752.f4243.f2256.f8206;
    }
}
