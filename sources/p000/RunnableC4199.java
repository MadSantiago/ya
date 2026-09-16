package p000;

import android.os.SystemClock;
import java.util.Objects;

/* JADX INFO: renamed from: ۦّٔؗ٘, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC4199 implements Runnable {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ C4423 f13956;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ long f13957;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f13958;

    public RunnableC4199(C4423 c4423, long j, int i) {
        this.f13958 = i;
        switch (i) {
            case 1:
                this.f13957 = j;
                Objects.requireNonNull(c4423);
                this.f13956 = c4423;
                break;
            default:
                this.f13957 = j;
                Objects.requireNonNull(c4423);
                this.f13956 = c4423;
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x00a9  */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f13958;
        C4423 c4423 = this.f13956;
        switch (i) {
            case 0:
                C0616 c0616 = c4423.f14593;
                c4423.mo6517();
                c4423.m7719();
                C5371 c5371 = (C5371) c4423.f18660;
                C3610 c3610 = c5371.f17717;
                C5371.m9020(c3610);
                C5590 c5590 = c3610.f12023;
                long j = this.f13957;
                c5590.m9430(Long.valueOf(j), "Activity resumed, time");
                C0515 c0515 = c5371.f17715;
                if (c0515.m1162(null, AbstractC4936.f16330)) {
                    if (c0515.m1161() || c4423.f14592) {
                        c0616.f2301.mo6517();
                        c0616.f2298.m2198();
                        c0616.f2300 = j;
                        c0616.f2299 = j;
                    }
                } else if (c0515.m1161()) {
                    c0616.f2301.mo6517();
                    c0616.f2298.m2198();
                    c0616.f2300 = j;
                    c0616.f2299 = j;
                } else {
                    C4474 c4474 = c5371.f17713;
                    C5371.m9021(c4474);
                    if (c4474.f14767.m8175()) {
                        c0616.f2301.mo6517();
                        c0616.f2298.m2198();
                        c0616.f2300 = j;
                        c0616.f2299 = j;
                    }
                }
                C4898 c4898 = c4423.f14594;
                C4423 c4424 = (C4423) c4898.f16142;
                c4424.mo6517();
                RunnableC0766 runnableC0766 = (RunnableC0766) c4898.f16143;
                if (runnableC0766 != null) {
                    c4424.f14591.removeCallbacks(runnableC0766);
                }
                C4474 c4475 = ((C5371) c4424.f18660).f17713;
                C5371.m9021(c4475);
                c4475.f14767.m8174(false);
                c4424.mo6517();
                c4424.f14592 = false;
                C3743 c3743 = c4423.f14590;
                C4423 c4425 = (C4423) c3743.f12466;
                c4425.mo6517();
                C5371 c5372 = (C5371) c4425.f18660;
                boolean zM9024 = c5372.m9024();
                C1397 c1397 = c5372.f17719;
                if (zM9024) {
                    c1397.getClass();
                    c3743.m6580(System.currentTimeMillis(), c5372.f17715.m1162(null, AbstractC4936.f19565) ? SystemClock.elapsedRealtime() : 0L);
                    break;
                }
                break;
            default:
                c4423.mo6517();
                c4423.m7719();
                C5371 c5373 = (C5371) c4423.f18660;
                C3610 c3611 = c5373.f17717;
                C5371.m9020(c3611);
                C5590 c5591 = c3611.f12023;
                long j2 = this.f13957;
                c5591.m9430(Long.valueOf(j2), "Activity paused, time");
                C4898 c4899 = c4423.f14594;
                C4423 c4426 = (C4423) c4899.f16142;
                ((C5371) c4426.f18660).f17719.getClass();
                RunnableC0766 runnableC0767 = new RunnableC0766(c4899, System.currentTimeMillis(), j2);
                c4899.f16143 = runnableC0767;
                c4426.f14591.postDelayed(runnableC0767, 2000L);
                if (c5373.f17715.m1161()) {
                    c4423.f14593.f2298.m2198();
                }
                break;
        }
    }
}
