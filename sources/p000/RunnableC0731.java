package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: ۥؙؕٔؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0731 implements Runnable {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ C2570 f2665;

    /* JADX INFO: renamed from: ۥٓ */
    public final /* synthetic */ C4965 f2666;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ int f2667;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f2668;

    public RunnableC0731(C4965 c4965, int i, int i2, C2570 c2570) {
        this.f2666 = c4965;
        this.f2668 = i;
        this.f2667 = i2;
        this.f2665 = c2570;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4965 c4965 = this.f2666;
        C2346 c2346 = c4965.f16422;
        if (c2346 != null) {
            ArrayList arrayList = c4965.f16419;
            int i = this.f2668;
            arrayList.remove(i);
            c4965.m8349(i, this.f2667, this.f2665);
            C2139 c2139 = (C2139) c2346.f7785;
            RunnableC3365 runnableC3365 = (RunnableC3365) c2346.f7786;
            c2139.removeCallbacks(runnableC3365);
            c2139.post(runnableC3365);
        }
    }
}
