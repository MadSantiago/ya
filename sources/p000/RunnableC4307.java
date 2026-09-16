package p000;

/* JADX INFO: renamed from: ۦٖؕٞ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC4307 implements Runnable {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ C0990 f14246;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f14247;

    public /* synthetic */ RunnableC4307(C0990 c0990, int i) {
        this.f14247 = i;
        this.f14246 = c0990;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f14247;
        C0990 c0990 = this.f14246;
        switch (i) {
            case 0:
                C1391 c1391 = c0990.f3497;
                if (c1391 != null) {
                    c1391.setListSelectionHidden(true);
                    c1391.requestLayout();
                }
                break;
            default:
                C1391 c1392 = c0990.f3497;
                if (c1392 != null && c1392.isAttachedToWindow() && c0990.f3497.getCount() > c0990.f3497.getChildCount() && c0990.f3497.getChildCount() <= c0990.f3492) {
                    c0990.f3515.setInputMethodMode(2);
                    c0990.mo1020();
                    break;
                }
                break;
        }
    }
}
