package p000;

import android.os.Bundle;
import android.os.SystemClock;

/* JADX INFO: renamed from: ۥَؗؖۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0616 {

    /* JADX INFO: renamed from: ۥؗ */
    public final C5300 f2298;

    /* JADX INFO: renamed from: ۥۗ */
    public long f2299;

    /* JADX INFO: renamed from: ۥۣ */
    public long f2300;

    /* JADX INFO: renamed from: ۦؑ */
    public final /* synthetic */ C4423 f2301;

    public C0616(C4423 c4423) {
        this.f2301 = c4423;
        C5371 c5371 = (C5371) c4423.f18660;
        this.f2298 = new C5300(this, c5371, 0);
        c5371.f17719.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.f2300 = jElapsedRealtime;
        this.f2299 = jElapsedRealtime;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final boolean m1382(boolean z, boolean z2, long j) {
        C4423 c4423 = this.f2301;
        c4423.mo6517();
        c4423.m7643();
        C5371 c5371 = (C5371) c4423.f18660;
        boolean zM9024 = c5371.m9024();
        C3610 c3610 = c5371.f17717;
        if (zM9024) {
            C4474 c4474 = c5371.f17713;
            C5371.m9021(c4474);
            C4173 c4173 = c4474.f14772;
            c5371.f17719.getClass();
            c4173.m7370(System.currentTimeMillis());
        }
        long j2 = j - this.f2300;
        if (!z && j2 < 1000) {
            C5371.m9020(c3610);
            c3610.f12023.m9430(Long.valueOf(j2), "Screen exposed for less than 1000 ms. Event not sent. time");
            return false;
        }
        if (!z2) {
            j2 = j - this.f2299;
            this.f2299 = j;
        }
        C5371.m9020(c3610);
        c3610.f12023.m9430(Long.valueOf(j2), "Recording user engagement, ms");
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j2);
        boolean z3 = !c5371.f17715.m1161();
        C5266 c5266 = c5371.f17711;
        C5371.m9023(c5266);
        C1512.m3193(c5266.m8902(z3), bundle, true);
        if (!z2) {
            C5235 c5235 = c5371.f17709;
            C5371.m9023(c5235);
            c5235.m8879("auto", "_e", bundle);
        }
        this.f2300 = j;
        C5300 c5300 = this.f2298;
        c5300.m2198();
        c5300.m2199(((Long) AbstractC4936.f16350.m4592(null)).longValue());
        return true;
    }
}
