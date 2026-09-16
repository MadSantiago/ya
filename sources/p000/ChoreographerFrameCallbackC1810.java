package p000;

import android.view.Choreographer;

/* JADX INFO: renamed from: ۥٜؒٚٔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ChoreographerFrameCallbackC1810 implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ Runnable f6026;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f6027;

    public /* synthetic */ ChoreographerFrameCallbackC1810(Runnable runnable, int i) {
        this.f6027 = i;
        this.f6026 = runnable;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        int i = this.f6027;
        Runnable runnable = this.f6026;
        switch (i) {
            case 0:
                ((RunnableC0029) runnable).run();
                break;
            default:
                runnable.run();
                break;
        }
    }
}
