package p000;

import android.os.Build;
import android.view.View;
import java.util.List;

/* JADX INFO: renamed from: ۥؐؔۢٙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0129 extends AbstractC2758 implements Runnable, InterfaceC3662, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: ۥَ */
    public boolean f533;

    /* JADX INFO: renamed from: ۥْ */
    public final C2816 f534;

    /* JADX INFO: renamed from: ۥٓ */
    public boolean f535;

    /* JADX INFO: renamed from: ۥٖ */
    public C2639 f536;

    public RunnableC0129(C2816 c2816) {
        super(!c2816.f9400 ? 1 : 0);
        this.f534 = c2816;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.requestApplyInsets();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f535) {
            this.f535 = false;
            this.f533 = false;
            C2639 c2639 = this.f536;
            if (c2639 != null) {
                C2816 c2816 = this.f534;
                c2816.f9404.m6573(AbstractC0949.m1957(c2639.f8768.mo2752(8)));
                C2816.m5380(c2816, c2639);
                this.f536 = null;
            }
        }
    }

    @Override // p000.AbstractC2758
    /* JADX INFO: renamed from: ۥُ */
    public final void mo280(C0460 c0460) {
        this.f535 = true;
        this.f533 = true;
    }

    @Override // p000.AbstractC2758
    /* JADX INFO: renamed from: ۥّ */
    public final C2639 mo281(C2639 c2639, List list) {
        C2816 c2816 = this.f534;
        C2816.m5380(c2816, c2639);
        return c2816.f9400 ? C2639.f8767 : c2639;
    }

    @Override // p000.AbstractC2758
    /* JADX INFO: renamed from: ۥۜ */
    public final C2346 mo282(C0460 c0460, C2346 c2346) {
        this.f535 = false;
        return c2346;
    }

    @Override // p000.AbstractC2758
    /* JADX INFO: renamed from: ۦؑ */
    public final void mo283(C0460 c0460) {
        this.f535 = false;
        this.f533 = false;
        C2639 c2639 = this.f536;
        if (c0460.f1659.mo8771() > 0 && c2639 != null) {
            C3470 c3470 = c2639.f8768;
            C2816 c2816 = this.f534;
            c2816.f9404.m6573(AbstractC0949.m1957(c3470.mo2752(8)));
            c2816.f9403.m6573(AbstractC0949.m1957(c3470.mo2752(8)));
            C2816.m5380(c2816, c2639);
        }
        this.f536 = null;
    }

    @Override // p000.InterfaceC3662
    /* JADX INFO: renamed from: ۦۙ */
    public final C2639 mo284(View view, C2639 c2639) {
        this.f536 = c2639;
        C2816 c2816 = this.f534;
        C3721 c3721 = c2816.f9403;
        C3470 c3470 = c2639.f8768;
        c3721.m6573(AbstractC0949.m1957(c3470.mo2752(8)));
        if (this.f535) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.f533) {
            c2816.f9404.m6573(AbstractC0949.m1957(c3470.mo2752(8)));
            C2816.m5380(c2816, c2639);
        }
        return c2816.f9400 ? C2639.f8767 : c2639;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
