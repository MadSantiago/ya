package p000;

import android.graphics.Rect;
import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: ۦِؔٝؓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3969 implements InterfaceC1637 {

    /* JADX INFO: renamed from: ۥؗ */
    public C2734 f13269;

    /* JADX INFO: renamed from: ۥۗ */
    public C2127 f13270;

    /* JADX INFO: renamed from: ۥۣ */
    public C4306 f13271;

    /* JADX INFO: renamed from: ۦؑ */
    public C5845 f13272;

    @Override // p000.InterfaceC1637
    /* JADX INFO: renamed from: ۥؗ */
    public final void mo3442(C5745 c5745, C5745 c5746) {
        C2734 c2734 = this.f13269;
        if (c2734 != null) {
            boolean z = (C3346.m6110(c2734.f9052.f18943, c5746.f18943) && AbstractC3831.m6874(c2734.f9052.f18942, c5746.f18942)) ? false : true;
            c2734.f9052 = c5746;
            int size = c2734.f9057.size();
            for (int i = 0; i < size; i++) {
                InputConnectionC4504 inputConnectionC4504 = (InputConnectionC4504) ((WeakReference) c2734.f9057.get(i)).get();
                if (inputConnectionC4504 != null) {
                    inputConnectionC4504.f14897 = c5746;
                }
            }
            C5723 c5723 = c2734.f9056;
            synchronized (c5723.f18834) {
                c5723.f18844 = null;
                c5723.f18842 = null;
                c5723.f18846 = null;
                c5723.f18843 = null;
                c5723.f18848 = null;
            }
            if (AbstractC3831.m6874(c5745, c5746)) {
                if (z) {
                    C5002 c5002 = c2734.f9051;
                    int iM6109 = C3346.m6109(c5746.f18943);
                    int iM6108 = C3346.m6108(c5746.f18943);
                    C3346 c3346 = c2734.f9052.f18942;
                    int iM61010 = c3346 != null ? C3346.m6109(c3346.f11197) : -1;
                    C3346 c3347 = c2734.f9052.f18942;
                    c5002.m8400().updateSelection((View) c5002.f16551, iM6109, iM6108, iM61010, c3347 != null ? C3346.m6108(c3347.f11197) : -1);
                    return;
                }
                return;
            }
            if (c5745 != null && (!AbstractC3831.m6874(c5745.f18944.f4307, c5746.f18944.f4307) || (C3346.m6110(c5745.f18943, c5746.f18943) && !AbstractC3831.m6874(c5745.f18942, c5746.f18942)))) {
                C5002 c5003 = c2734.f9051;
                c5003.m8400().restartInput((View) c5003.f16551);
                return;
            }
            int size2 = c2734.f9057.size();
            for (int i2 = 0; i2 < size2; i2++) {
                InputConnectionC4504 inputConnectionC4505 = (InputConnectionC4504) ((WeakReference) c2734.f9057.get(i2)).get();
                if (inputConnectionC4505 != null) {
                    C5745 c5747 = c2734.f9052;
                    C5002 c5004 = c2734.f9051;
                    if (inputConnectionC4505.f14896) {
                        inputConnectionC4505.f14897 = c5747;
                        if (inputConnectionC4505.f14895) {
                            c5004.m8400().updateExtractedText((View) c5004.f16551, inputConnectionC4505.f14891, AbstractC2164.m4214(c5747));
                        }
                        C3346 c3348 = c5747.f18942;
                        long j = c5747.f18943;
                        int iM61011 = c3348 != null ? C3346.m6109(c3348.f11197) : -1;
                        C3346 c3349 = c5747.f18942;
                        c5004.m8400().updateSelection((View) c5004.f16551, C3346.m6109(j), C3346.m6108(j), iM61011, c3349 != null ? C3346.m6108(c3349.f11197) : -1);
                    }
                }
            }
        }
    }

    @Override // p000.InterfaceC1637
    /* JADX INFO: renamed from: ۥُ */
    public final void mo3443() {
        InterfaceC3508 interfaceC3508;
        C4306 c4306 = this.f13271;
        if (c4306 == null || (interfaceC3508 = (InterfaceC3508) AbstractC2552.m4807(c4306, AbstractC2853.f9539)) == null) {
            return;
        }
        ((C3773) interfaceC3508).m6677();
    }

    @Override // p000.InterfaceC1637
    /* JADX INFO: renamed from: ۥّ */
    public final void mo3444() {
        C2127 c2127 = this.f13270;
        if (c2127 != null) {
            c2127.mo871(null);
        }
        this.f13270 = null;
        InterfaceC4005 interfaceC4005M7125 = m7125();
        if (interfaceC4005M7125 != null) {
            C5845 c5845 = (C5845) interfaceC4005M7125;
            synchronized (c5845) {
                c5845.m9660(c5845.m9656() + ((long) c5845.f19261), c5845.f19263, c5845.m9656() + ((long) c5845.f19261), c5845.m9656() + ((long) c5845.f19261) + ((long) c5845.f19258));
            }
        }
    }

    @Override // p000.InterfaceC1637
    /* JADX INFO: renamed from: ۥۗ */
    public final void mo3445() {
        m7124(null);
    }

    @Override // p000.InterfaceC1637
    /* JADX INFO: renamed from: ۥۜ */
    public final void mo3446(C5745 c5745, C2350 c2350, C3464 c3464, C5149 c5149) {
        m7124(new C0644(c5745, this, c2350, c3464, c5149, 0));
    }

    @Override // p000.InterfaceC1637
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo3447(C5745 c5745, InterfaceC4120 interfaceC4120, C3828 c3828, C5757 c5757, C2793 c2793, C2793 c2794) {
        C2734 c2734 = this.f13269;
        if (c2734 != null) {
            C5723 c5723 = c2734.f9056;
            synchronized (c5723.f18834) {
                try {
                    c5723.f18844 = c5745;
                    c5723.f18842 = interfaceC4120;
                    c5723.f18846 = c3828;
                    c5723.f18843 = c2793;
                    c5723.f18848 = c2794;
                    if (c5723.f18835 || c5723.f18841) {
                        c5723.m9536();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // p000.InterfaceC1637
    /* JADX INFO: renamed from: ۦؑ */
    public final void mo3448() {
        InterfaceC3508 interfaceC3508;
        C4306 c4306 = this.f13271;
        if (c4306 == null || (interfaceC3508 = (InterfaceC3508) AbstractC2552.m4807(c4306, AbstractC2853.f9539)) == null) {
            return;
        }
        ((C3773) interfaceC3508).m6676();
    }

    /* JADX INFO: renamed from: ۦِ */
    public final void m7124(C0644 c0644) {
        C4306 c4306 = this.f13271;
        if (c4306 == null) {
            return;
        }
        C2127 c2127 = null;
        this.f13270 = c4306.f17786 ? AbstractC2765.m5135(c4306.m9076(), null, 4, new C5030(c4306, new C1734(c0644, this, c4306, c2127, 0), c2127, 0), 1) : null;
    }

    /* JADX INFO: renamed from: ۦٛ */
    public final InterfaceC4005 m7125() {
        C5845 c5845 = this.f13272;
        if (c5845 != null) {
            return c5845;
        }
        if (!AbstractC2138.f7016) {
            return null;
        }
        C5845 c5845M9356 = AbstractC5568.m9356(1, 0, 3);
        this.f13272 = c5845M9356;
        return c5845M9356;
    }

    /* JADX INFO: renamed from: ۦۗ */
    public final void m7126(C4306 c4306) {
        if (this.f13271 != c4306) {
            AbstractC4690.m8035("Expected textInputModifierNode to be " + c4306 + " but was " + this.f13271);
        }
        this.f13271 = null;
    }

    @Override // p000.InterfaceC1637
    /* JADX INFO: renamed from: ۦۙ */
    public final void mo3449(C2793 c2793) {
        Rect rect;
        C2734 c2734 = this.f13269;
        if (c2734 != null) {
            c2734.f9055 = new Rect(AbstractC2776.m5235(c2793.f9343), AbstractC2776.m5235(c2793.f9342), AbstractC2776.m5235(c2793.f9341), AbstractC2776.m5235(c2793.f9344));
            if (!c2734.f9057.isEmpty() || (rect = c2734.f9055) == null) {
                return;
            }
            c2734.f9053.requestRectangleOnScreen(new Rect(rect));
        }
    }
}
