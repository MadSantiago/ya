package p000;

import android.widget.AbsListView;

/* JADX INFO: renamed from: ۦۦؓؗۥ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5750 implements AbsListView.OnScrollListener {

    /* JADX INFO: renamed from: ۥۣ */
    public final /* synthetic */ C0990 f18964;

    public C5750(C0990 c0990) {
        this.f18964 = c0990;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        C0990 c0990 = this.f18964;
        RunnableC4307 runnableC4307 = c0990.f3503;
        C2245 c2245 = c0990.f3515;
        if (i != 1 || c2245.getInputMethodMode() == 2 || c2245.getContentView() == null) {
            return;
        }
        c0990.f3507.removeCallbacks(runnableC4307);
        runnableC4307.run();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }
}
