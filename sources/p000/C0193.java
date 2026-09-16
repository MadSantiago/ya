package p000;

import android.graphics.Rect;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;

/* JADX INFO: renamed from: ۥِؑؔؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0193 extends AbstractC1361 implements InterfaceC0280 {

    /* JADX INFO: renamed from: ۥَ */
    public final String f712;

    /* JADX INFO: renamed from: ۥْ */
    public final ViewTreeObserverOnGlobalLayoutListenerC0850 f713;

    /* JADX INFO: renamed from: ۥٓ */
    public final C5461 f714;

    /* JADX INFO: renamed from: ۥٖ */
    public final Rect f715 = new Rect();

    /* JADX INFO: renamed from: ۥۖ */
    public boolean f716;

    /* JADX INFO: renamed from: ۦٗ */
    public final AutofillId f717;

    /* JADX INFO: renamed from: ۦۛ */
    public final C0482 f718;

    /* JADX INFO: renamed from: ۦ۟ */
    public final C5505 f719;

    /* JADX INFO: renamed from: ۦۨ */
    public final C3121 f720;

    public C0193(C3121 c3121, C5505 c5505, ViewTreeObserverOnGlobalLayoutListenerC0850 viewTreeObserverOnGlobalLayoutListenerC0850, C5461 c5461, String str) {
        this.f720 = c3121;
        this.f719 = c5505;
        this.f713 = viewTreeObserverOnGlobalLayoutListenerC0850;
        this.f714 = c5461;
        this.f712 = str;
        viewTreeObserverOnGlobalLayoutListenerC0850.setImportantForAutofill(1);
        AutofillId autofillId = viewTreeObserverOnGlobalLayoutListenerC0850.getAutofillId();
        if (autofillId == null) {
            throw AbstractC3761.m6633("Required value was null.");
        }
        this.f717 = autofillId;
        this.f718 = new C0482();
    }

    @Override // p000.InterfaceC0280
    /* JADX INFO: renamed from: ۥؗ */
    public final void mo456(C3468 c3468, C3468 c3469) {
        C0605 c0605M9270;
        C2542 c2542M1331;
        C0605 c0605M9271;
        C2542 c2542M1332;
        if (c3468 != null && (c0605M9271 = AbstractC5537.m9270(c3468)) != null && (c2542M1332 = c0605M9271.m1331()) != null) {
            C3262 c3262 = c2542M1332.f8490;
            if (c3262.m6018(AbstractC0208.f784) || c3262.m6018(AbstractC0208.f773)) {
                ((AutofillManager) this.f720.f10451).notifyViewExited(this.f713, c0605M9271.f2273);
            }
        }
        if (c3469 == null || (c0605M9270 = AbstractC5537.m9270(c3469)) == null || (c2542M1331 = c0605M9270.m1331()) == null) {
            return;
        }
        C3262 c3263 = c2542M1331.f8490;
        if (c3263.m6018(AbstractC0208.f784) || c3263.m6018(AbstractC0208.f773)) {
            int i = c0605M9270.f2273;
            this.f714.f18006.m6298(i, new C4179(this, i));
        }
    }
}
