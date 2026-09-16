package p000;

import android.graphics.Rect;
import android.view.WindowInsets;
import java.util.List;

/* JADX INFO: renamed from: ۦۦّؒؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5741 extends C1983 {
    public C5741(C2639 c2639, WindowInsets windowInsets) {
        super(c2639, windowInsets);
    }

    @Override // p000.C1297, p000.C3470
    /* JADX INFO: renamed from: ۥّ */
    public List<Rect> mo2739(int i) {
        return this.f4410.getBoundingRects(AbstractC4401.m7692(i));
    }

    @Override // p000.C1297, p000.C3470
    /* JADX INFO: renamed from: ۦۙ */
    public List<Rect> mo2753(int i) {
        return this.f4410.getBoundingRectsIgnoringVisibility(AbstractC4401.m7692(i));
    }

    public C5741(C2639 c2639, C5741 c5741) {
        super(c2639, c5741);
    }

    @Override // p000.C1297, p000.C3470
    /* JADX INFO: renamed from: ۥْ */
    public void mo2740() {
    }
}
