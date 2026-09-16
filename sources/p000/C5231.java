package p000;

import android.view.ScrollFeedbackProvider;
import androidx.core.widget.NestedScrollView;

/* JADX INFO: renamed from: ۦۛؕؕؔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5231 implements InterfaceC4708 {

    /* JADX INFO: renamed from: ۦۨ */
    public final ScrollFeedbackProvider f17260;

    public C5231(NestedScrollView nestedScrollView) {
        this.f17260 = ScrollFeedbackProvider.createProvider(nestedScrollView);
    }

    @Override // p000.InterfaceC4708
    public final void onScrollLimit(int i, int i2, int i3, boolean z) {
        this.f17260.onScrollLimit(i, i2, i3, z);
    }

    @Override // p000.InterfaceC4708
    public final void onScrollProgress(int i, int i2, int i3, int i4) {
        this.f17260.onScrollProgress(i, i2, i3, i4);
    }
}
