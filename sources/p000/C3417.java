package p000;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: renamed from: ۦؗؔٔؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class C3417 extends C1719 {

    /* JADX INFO: renamed from: ۥۖ */
    public static final C2639 f11377 = C2639.m4953(WindowInsets.CONSUMED, null);

    public C3417(C2639 c2639, WindowInsets windowInsets) {
        super(c2639, windowInsets);
    }

    @Override // p000.C1297, p000.C3470
    /* JADX INFO: renamed from: ۦِ */
    public C5364 mo2749(int i) {
        return C5364.m9017(this.f4410.getInsetsIgnoringVisibility(AbstractC3815.m6814(i)));
    }

    @Override // p000.C1297, p000.C3470
    /* JADX INFO: renamed from: ۦٗ */
    public boolean mo2751(int i) {
        return this.f4410.isVisible(AbstractC3815.m6814(i));
    }

    @Override // p000.C1297, p000.C3470
    /* JADX INFO: renamed from: ۦٛ */
    public C5364 mo2752(int i) {
        return C5364.m9017(this.f4410.getInsets(AbstractC3815.m6814(i)));
    }

    public C3417(C2639 c2639, C3417 c3417) {
        super(c2639, c3417);
    }

    @Override // p000.C1297, p000.C3470
    /* JADX INFO: renamed from: ۦؑ */
    public final void mo2746(View view) {
    }
}
