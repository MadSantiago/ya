package p000;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: ۥٌؐؖۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0142 implements Runnable {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ C5235 f562;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ long f563;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f564;

    public RunnableC0142(C5235 c5235, long j, int i) {
        this.f564 = i;
        switch (i) {
            case 1:
                this.f563 = j;
                this.f562 = c5235;
                break;
            default:
                this.f563 = j;
                Objects.requireNonNull(c5235);
                this.f562 = c5235;
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f564;
        long j = this.f563;
        C5235 c5235 = this.f562;
        switch (i) {
            case 0:
                C5371 c5371 = (C5371) c5235.f18660;
                C4474 c4474 = c5371.f17713;
                C5371.m9021(c4474);
                c4474.f14760.m7370(j);
                C3610 c3610 = c5371.f17717;
                C5371.m9020(c3610);
                c3610.f12015.m9430(Long.valueOf(j), "Session timeout duration set");
                break;
            default:
                c5235.mo6517();
                c5235.m7643();
                C5371 c5372 = (C5371) c5235.f18660;
                C3610 c3611 = c5372.f17717;
                C5371.m9020(c3611);
                c3611.f12015.m9432("Resetting analytics data (FE)");
                C4423 c4423 = c5372.f17735;
                C5371.m9023(c4423);
                c4423.mo6517();
                C0616 c0616 = c4423.f14593;
                c0616.f2298.m2198();
                ((C5371) c0616.f2301.f18660).f17719.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                c0616.f2300 = jElapsedRealtime;
                c0616.f2299 = jElapsedRealtime;
                c5372.m9029().m3857();
                boolean z = !c5372.m9024();
                C4474 c4475 = c5372.f17713;
                C5371.m9021(c4475);
                c4475.f14759.m7370(j);
                C5371 c5373 = (C5371) c4475.f18660;
                C4474 c4476 = c5373.f17713;
                C5371.m9021(c4476);
                if (!TextUtils.isEmpty(c4476.f14766.m2974())) {
                    c4475.f14766.m2971(null);
                }
                c4475.f14772.m7370(0L);
                c4475.f14758.m7370(0L);
                if (!c5373.f17715.m1157()) {
                    c4475.m7752(z);
                }
                c4475.f14768.m2971(null);
                c4475.f14770.m7370(0L);
                c4475.f14752.m3144(null);
                C5695 c5695M9028 = c5372.m9028();
                c5695M9028.mo6517();
                c5695M9028.m7643();
                C5855 c5855M9517 = c5695M9028.m9517(false);
                c5695M9028.m9508();
                ((C5371) c5695M9028.f18660).m9026().m9084();
                c5695M9028.m9509(new RunnableC4292(c5695M9028, c5855M9517, 0));
                C5371.m9023(c4423);
                c4423.f14590.m6584();
                c5235.f17277 = z;
                c5372.m9028().m9519(new AtomicReference());
                break;
        }
    }
}
