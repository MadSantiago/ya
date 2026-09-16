package p000;

/* JADX INFO: renamed from: ۥْْؗۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1233 {

    /* JADX INFO: renamed from: ۥؗ */
    public boolean f4237;

    /* JADX INFO: renamed from: ۥُ */
    public boolean f4238;

    /* JADX INFO: renamed from: ۥّ */
    public boolean f4239;

    /* JADX INFO: renamed from: ۥْ */
    public C2921 f4240;

    /* JADX INFO: renamed from: ۥۗ */
    public boolean f4241;

    /* JADX INFO: renamed from: ۥۜ */
    public int f4242;

    /* JADX INFO: renamed from: ۥۣ */
    public final C0605 f4243;

    /* JADX INFO: renamed from: ۦؚ */
    public int f4245;

    /* JADX INFO: renamed from: ۦٌ */
    public boolean f4246;

    /* JADX INFO: renamed from: ۦِ */
    public boolean f4247;

    /* JADX INFO: renamed from: ۦٛ */
    public int f4248;

    /* JADX INFO: renamed from: ۦۗ */
    public boolean f4249;

    /* JADX INFO: renamed from: ۦۙ */
    public boolean f4250;

    /* JADX INFO: renamed from: ۦۚ */
    public boolean f4251;

    /* JADX INFO: renamed from: ۦۨ */
    public int f4253;

    /* JADX INFO: renamed from: ۦؑ */
    public int f4244 = 5;

    /* JADX INFO: renamed from: ۦ۟ */
    public final C2339 f4252 = new C2339(this);

    public C1233(C0605 c0605) {
        this.f4243 = c0605;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final void m2598(long j) {
        C2921 c2921 = this.f4240;
        if (c2921 != null) {
            C1233 c1233 = c2921.f9804;
            c1233.f4244 = 2;
            C0605 c0605 = c1233.f4243;
            c1233.f4238 = false;
            c2921.f9800 = j;
            C1775 snapshotObserver = ((ViewTreeObserverOnGlobalLayoutListenerC0850) AbstractC5359.m8951(c0605)).getSnapshotObserver();
            C4913 c4913 = c2921.f9820;
            snapshotObserver.getClass();
            snapshotObserver.f5926.m9077(c0605, C3948.f13184, c4913);
            c1233.f4239 = true;
            c1233.f4250 = true;
            boolean zM5126 = AbstractC2765.m5126(c0605);
            C2339 c2339 = c1233.f4252;
            if (zM5126) {
                c2339.f7762 = true;
                c2339.f7766 = true;
            } else {
                c2339.f7765 = true;
            }
            c1233.f4244 = 5;
        }
    }

    /* JADX INFO: renamed from: ۥُ */
    public final void m2599(int i) {
        int i2 = this.f4253;
        this.f4253 = i;
        if ((i2 == 0) != (i == 0)) {
            C0605 c0605M1356 = this.f4243.m1356();
            C1233 c1233 = c0605M1356 != null ? c0605M1356.f2261 : null;
            if (c1233 != null) {
                int i3 = c1233.f4253;
                if (i == 0) {
                    c1233.m2599(i3 - 1);
                } else {
                    c1233.m2599(i3 + 1);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۥّ */
    public final void m2600(boolean z) {
        if (this.f4249 != z) {
            this.f4249 = z;
            if (z && !this.f4247) {
                m2604(this.f4245 + 1);
            } else {
                if (z || this.f4247) {
                    return;
                }
                m2604(this.f4245 - 1);
            }
        }
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final void m2601() {
        int i = this.f4243.f2261.f4244;
        if (i == 3 || i == 4) {
            if (this.f4252.f7774) {
                m2607(true);
            } else {
                m2600(true);
            }
        }
        if (i == 4) {
            C2921 c2921 = this.f4240;
            if (c2921 == null || !c2921.f9809) {
                m2602(true);
            } else {
                m2606(true);
            }
        }
    }

    /* JADX INFO: renamed from: ۥۜ */
    public final void m2602(boolean z) {
        if (this.f4251 != z) {
            this.f4251 = z;
            if (z && !this.f4246) {
                m2599(this.f4253 + 1);
            } else {
                if (z || this.f4246) {
                    return;
                }
                m2599(this.f4253 - 1);
            }
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final AbstractC1311 m2603() {
        return (AbstractC1311) this.f4243.f2256.f8201;
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final void m2604(int i) {
        int i2 = this.f4245;
        this.f4245 = i;
        if ((i2 == 0) != (i == 0)) {
            C0605 c0605M1356 = this.f4243.m1356();
            C1233 c1233 = c0605M1356 != null ? c0605M1356.f2261 : null;
            if (c1233 != null) {
                int i3 = c1233.f4245;
                if (i == 0) {
                    c1233.m2604(i3 - 1);
                } else {
                    c1233.m2604(i3 + 1);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۦِ */
    public final void m2605() {
        C2339 c2339 = this.f4252;
        C1233 c1233 = c2339.f7752;
        Object obj = c2339.f7751;
        C0605 c0605 = this.f4243;
        if ((obj != null || c1233.m2603().mo570() != null) && c2339.f7772) {
            c2339.f7772 = false;
            c2339.f7751 = c1233.m2603().mo570();
            C0605 c0605M1356 = c0605.m1356();
            if (c0605M1356 != null) {
                C0605.m1312(c0605M1356, false, 7);
            }
        }
        C2921 c2921 = this.f4240;
        if (c2921 != null) {
            C1233 c1234 = c2921.f9804;
            if (!(c2921.f9816 == null && c1234.m2603().mo2793().f6744.mo570() == null) && c2921.f9814) {
                c2921.f9814 = false;
                c2921.f9816 = c1234.m2603().mo2793().f6744.mo570();
                if (AbstractC2765.m5126(c0605)) {
                    C0605 c0605M1357 = c0605.m1356();
                    if (c0605M1357 != null) {
                        C0605.m1312(c0605M1357, false, 7);
                        return;
                    }
                    return;
                }
                C0605 c0605M1358 = c0605.m1356();
                if (c0605M1358 != null) {
                    C0605.m1313(c0605M1358, false, 7);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۦٛ */
    public final void m2606(boolean z) {
        if (this.f4246 != z) {
            this.f4246 = z;
            if (z && !this.f4251) {
                m2599(this.f4253 + 1);
            } else {
                if (z || this.f4251) {
                    return;
                }
                m2599(this.f4253 - 1);
            }
        }
    }

    /* JADX INFO: renamed from: ۦۙ */
    public final void m2607(boolean z) {
        if (this.f4247 != z) {
            this.f4247 = z;
            if (z && !this.f4249) {
                m2604(this.f4245 + 1);
            } else {
                if (z || this.f4249) {
                    return;
                }
                m2604(this.f4245 - 1);
            }
        }
    }
}
