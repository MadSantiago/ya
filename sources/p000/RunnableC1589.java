package p000;

import java.util.Set;

/* JADX INFO: renamed from: ۥؚ٘ؕ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1589 implements Runnable {

    /* JADX INFO: renamed from: ۥْ */
    public final boolean f5342;

    /* JADX INFO: renamed from: ۥٓ */
    public final int f5343;

    /* JADX INFO: renamed from: ۦ۟ */
    public final C2666 f5344;

    /* JADX INFO: renamed from: ۦۨ */
    public final C3654 f5345;

    public RunnableC1589(C3654 c3654, C2666 c2666, boolean z, int i) {
        this.f5345 = c3654;
        this.f5344 = c2666;
        this.f5342 = z;
        this.f5343 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zM6530;
        C5789 c5789M6532;
        boolean z = this.f5342;
        C3654 c3654 = this.f5345;
        C2666 c2666 = this.f5344;
        if (z) {
            int i = this.f5343;
            c3654.getClass();
            String str = c2666.f8830.f6202;
            synchronized (c3654.f12236) {
                c5789M6532 = c3654.m6532(str);
            }
            zM6530 = C3654.m6530(str, c5789M6532, i);
        } else {
            int i2 = this.f5343;
            c3654.getClass();
            String str2 = c2666.f8830.f6202;
            synchronized (c3654.f12236) {
                try {
                    if (c3654.f12229.get(str2) != null) {
                        C1984.m3874().m3878(C3654.f12226, "Ignored stopWork. WorkerWrapper " + str2 + " is in foreground");
                    } else {
                        Set set = (Set) c3654.f12231.get(str2);
                        if (set != null && set.contains(c2666)) {
                            zM6530 = C3654.m6530(str2, c3654.m6532(str2), i2);
                        }
                    }
                    zM6530 = false;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        C1984.m3874().m3878(C1984.m3875("StopWorkRunnable"), "StopWorkRunnable for " + this.f5344.f8830.f6202 + "; Processor.stopWork = " + zM6530);
    }
}
