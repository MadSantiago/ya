package p000;

import java.util.Objects;

/* JADX INFO: renamed from: ۦ٘ؔؔٛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC4424 implements Runnable {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ AbstractC3695 f14595;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ long f14596;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f14597 = 0;

    public RunnableC4424(C4961 c4961, long j) {
        this.f14596 = j;
        Objects.requireNonNull(c4961);
        this.f14595 = c4961;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f14597;
        long j = this.f14596;
        AbstractC3695 abstractC3695 = this.f14595;
        switch (i) {
            case 0:
                ((C4961) abstractC3695).m8340(j);
                break;
            default:
                C5266 c5266 = (C5266) abstractC3695;
                C4961 c4961 = ((C5371) c5266.f18660).f17725;
                C5371.m9022(c4961);
                c4961.m8339(j);
                c5266.f17353 = null;
                break;
        }
    }

    public RunnableC4424(C5266 c5266, long j) {
        this.f14596 = j;
        Objects.requireNonNull(c5266);
        this.f14595 = c5266;
    }
}
