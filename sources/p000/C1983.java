package p000;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: renamed from: ۥؘٟؑ٘, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class C1983 extends C3910 {

    /* JADX INFO: renamed from: ۦٕ */
    public static final C2639 f6548 = C2639.m4953(WindowInsets.CONSUMED, null);

    public C1983(C2639 c2639, WindowInsets windowInsets) {
        super(c2639, windowInsets);
    }

    @Override // p000.C3417, p000.C1297, p000.C3470
    /* JADX INFO: renamed from: ۦِ */
    public C5364 mo2749(int i) {
        return C5364.m9017(this.f4410.getInsetsIgnoringVisibility(AbstractC4401.m7692(i)));
    }

    @Override // p000.C3417, p000.C1297, p000.C3470
    /* JADX INFO: renamed from: ۦٗ */
    public boolean mo2751(int i) {
        return this.f4410.isVisible(AbstractC4401.m7692(i));
    }

    @Override // p000.C3417, p000.C1297, p000.C3470
    /* JADX INFO: renamed from: ۦٛ */
    public C5364 mo2752(int i) {
        return C5364.m9017(this.f4410.getInsets(AbstractC4401.m7692(i)));
    }

    public C1983(C2639 c2639, C1983 c1983) {
        super(c2639, c1983);
    }

    @Override // p000.C1297, p000.C3470
    /* JADX INFO: renamed from: ۦ۟ */
    public void mo2756(View view) {
    }
}
