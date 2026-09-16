package p000;

import androidx.appcompat.widget.Toolbar;

/* JADX INFO: renamed from: ۥؙٕؔؒ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0723 implements Runnable {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ Toolbar f2638;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f2639;

    public /* synthetic */ RunnableC0723(Toolbar toolbar, int i) {
        this.f2639 = i;
        this.f2638 = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f2639;
        Toolbar toolbar = this.f2638;
        switch (i) {
            case 0:
                C4796 c4796 = toolbar.f139;
                C1092 c1092 = c4796 == null ? null : c4796.f15817;
                if (c1092 != null) {
                    c1092.collapseActionView();
                }
                break;
            default:
                toolbar.m49();
                break;
        }
    }
}
