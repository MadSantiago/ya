package p000;

import android.graphics.Rect;
import android.view.View;
import android.view.WindowManager;

/* JADX INFO: renamed from: ۦ۠ؒؔٞ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5377 extends C1448 {
    @Override // p000.C4992
    /* JADX INFO: renamed from: ۥْ */
    public final void mo8382(View view, Rect rect) {
        rect.set(((WindowManager) view.getContext().getSystemService("window")).getCurrentWindowMetrics().getBounds());
    }
}
