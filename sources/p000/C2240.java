package p000;

import android.graphics.Rect;
import android.view.Choreographer;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: renamed from: ۥؘٜۙؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2240 implements InterfaceC1637 {

    /* JADX INFO: renamed from: ۥؗ */
    public final ExecutorC3559 f7414;

    /* JADX INFO: renamed from: ۥُ */
    public InterfaceC4745 f7415;

    /* JADX INFO: renamed from: ۥّ */
    public InterfaceC4745 f7416;

    /* JADX INFO: renamed from: ۥۗ */
    public final C2808 f7417;

    /* JADX INFO: renamed from: ۥۜ */
    public C2350 f7418;

    /* JADX INFO: renamed from: ۥۣ */
    public final View f7419;

    /* JADX INFO: renamed from: ۦؑ */
    public boolean f7420;

    /* JADX INFO: renamed from: ۦؚ */
    public final C2541 f7421;

    /* JADX INFO: renamed from: ۦٌ */
    public final C0863 f7422;

    /* JADX INFO: renamed from: ۦِ */
    public final InterfaceC5130 f7423;

    /* JADX INFO: renamed from: ۦٛ */
    public final ArrayList f7424;

    /* JADX INFO: renamed from: ۦۗ */
    public Rect f7425;

    /* JADX INFO: renamed from: ۦۙ */
    public C5745 f7426;

    /* JADX INFO: renamed from: ۦۚ */
    public RunnableC0029 f7427;

    public C2240(View view, ViewTreeObserverOnGlobalLayoutListenerC0850 viewTreeObserverOnGlobalLayoutListenerC0850) {
        C2808 c2808 = new C2808(view);
        ExecutorC3559 executorC3559 = new ExecutorC3559(Choreographer.getInstance());
        this.f7419 = view;
        this.f7417 = c2808;
        this.f7414 = executorC3559;
        this.f7415 = C3948.f13196;
        this.f7416 = C3948.f13194;
        this.f7426 = new C5745(C3346.f11196, "", 4);
        this.f7418 = C2350.f7790;
        this.f7424 = new ArrayList();
        this.f7423 = AbstractC3933.m7095(3, new C5285(23, this));
        this.f7421 = new C2541(viewTreeObserverOnGlobalLayoutListenerC0850, c2808);
        this.f7422 = new C0863(new EnumC2261[16]);
    }

    @Override // p000.InterfaceC1637
    /* JADX INFO: renamed from: ۥؗ */
    public final void mo3442(C5745 c5745, C5745 c5746) {
        boolean z = (C3346.m6110(this.f7426.f18943, c5746.f18943) && AbstractC3831.m6874(this.f7426.f18942, c5746.f18942)) ? false : true;
        this.f7426 = c5746;
        int size = this.f7424.size();
        for (int i = 0; i < size; i++) {
            InputConnectionC1187 inputConnectionC1187 = (InputConnectionC1187) ((WeakReference) this.f7424.get(i)).get();
            if (inputConnectionC1187 != null) {
                inputConnectionC1187.f4082 = c5746;
            }
        }
        C2541 c2541 = this.f7421;
        synchronized (c2541.f8469) {
            c2541.f8480 = null;
            c2541.f8478 = null;
            c2541.f8482 = null;
            c2541.f8479 = C1931.f6377;
            c2541.f8484 = null;
            c2541.f8486 = null;
        }
        if (AbstractC3831.m6874(c5745, c5746)) {
            if (z) {
                C2808 c2808 = this.f7417;
                int iM6109 = C3346.m6109(c5746.f18943);
                int iM6108 = C3346.m6108(c5746.f18943);
                C3346 c3346 = this.f7426.f18942;
                int iM61010 = c3346 != null ? C3346.m6109(c3346.f11197) : -1;
                C3346 c3347 = this.f7426.f18942;
                ((InputMethodManager) ((InterfaceC5130) c2808.f9376).getValue()).updateSelection((View) c2808.f9378, iM6109, iM6108, iM61010, c3347 != null ? C3346.m6108(c3347.f11197) : -1);
                return;
            }
            return;
        }
        if (c5745 != null && (!AbstractC3831.m6874(c5745.f18944.f4307, c5746.f18944.f4307) || (C3346.m6110(c5745.f18943, c5746.f18943) && !AbstractC3831.m6874(c5745.f18942, c5746.f18942)))) {
            C2808 c2809 = this.f7417;
            ((InputMethodManager) ((InterfaceC5130) c2809.f9376).getValue()).restartInput((View) c2809.f9378);
            return;
        }
        int size2 = this.f7424.size();
        for (int i2 = 0; i2 < size2; i2++) {
            InputConnectionC1187 inputConnectionC1188 = (InputConnectionC1187) ((WeakReference) this.f7424.get(i2)).get();
            if (inputConnectionC1188 != null) {
                C5745 c5747 = this.f7426;
                C2808 c28010 = this.f7417;
                if (inputConnectionC1188.f4080) {
                    inputConnectionC1188.f4082 = c5747;
                    if (inputConnectionC1188.f4078) {
                        ((InputMethodManager) ((InterfaceC5130) c28010.f9376).getValue()).updateExtractedText((View) c28010.f9378, inputConnectionC1188.f4077, C4773.m8156(c5747));
                    }
                    C3346 c3348 = c5747.f18942;
                    long j = c5747.f18943;
                    int iM61011 = c3348 != null ? C3346.m6109(c3348.f11197) : -1;
                    C3346 c3349 = c5747.f18942;
                    ((InputMethodManager) ((InterfaceC5130) c28010.f9376).getValue()).updateSelection((View) c28010.f9378, C3346.m6109(j), C3346.m6108(j), iM61011, c3349 != null ? C3346.m6108(c3349.f11197) : -1);
                }
            }
        }
    }

    @Override // p000.InterfaceC1637
    /* JADX INFO: renamed from: ۥُ */
    public final void mo3443() {
        m4289(EnumC2261.f7514);
    }

    @Override // p000.InterfaceC1637
    /* JADX INFO: renamed from: ۥّ */
    public final void mo3444() {
        this.f7420 = false;
        this.f7415 = C3948.f13197;
        this.f7416 = C3948.f13199;
        this.f7425 = null;
        m4289(EnumC2261.f7515);
    }

    @Override // p000.InterfaceC1637
    /* JADX INFO: renamed from: ۥۗ */
    public final void mo3445() {
        m4289(EnumC2261.f7516);
    }

    @Override // p000.InterfaceC1637
    /* JADX INFO: renamed from: ۥۜ */
    public final void mo3446(C5745 c5745, C2350 c2350, C3464 c3464, C5149 c5149) {
        this.f7420 = true;
        this.f7426 = c5745;
        this.f7418 = c2350;
        this.f7415 = c3464;
        this.f7416 = c5149;
        m4289(EnumC2261.f7516);
    }

    @Override // p000.InterfaceC1637
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo3447(C5745 c5745, InterfaceC4120 interfaceC4120, C3828 c3828, C5757 c5757, C2793 c2793, C2793 c2794) {
        C2541 c2541 = this.f7421;
        synchronized (c2541.f8469) {
            try {
                c2541.f8480 = c5745;
                c2541.f8478 = interfaceC4120;
                c2541.f8482 = c3828;
                c2541.f8479 = c5757;
                c2541.f8484 = c2793;
                c2541.f8486 = c2794;
                if (c2541.f8470 || c2541.f8477) {
                    c2541.m4770();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.InterfaceC1637
    /* JADX INFO: renamed from: ۦؑ */
    public final void mo3448() {
        m4289(EnumC2261.f7513);
    }

    /* JADX INFO: renamed from: ۦٛ */
    public final void m4289(EnumC2261 enumC2261) {
        this.f7422.m1843(enumC2261);
        if (this.f7427 == null) {
            RunnableC0029 runnableC0029 = new RunnableC0029(22, this);
            this.f7414.execute(runnableC0029);
            this.f7427 = runnableC0029;
        }
    }

    @Override // p000.InterfaceC1637
    /* JADX INFO: renamed from: ۦۙ */
    public final void mo3449(C2793 c2793) {
        Rect rect;
        this.f7425 = new Rect(AbstractC2776.m5235(c2793.f9343), AbstractC2776.m5235(c2793.f9342), AbstractC2776.m5235(c2793.f9341), AbstractC2776.m5235(c2793.f9344));
        if (!this.f7424.isEmpty() || (rect = this.f7425) == null) {
            return;
        }
        this.f7419.requestRectangleOnScreen(new Rect(rect));
    }
}
