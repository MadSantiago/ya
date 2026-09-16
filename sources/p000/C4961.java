package p000;

import android.os.Bundle;
import java.util.Iterator;

/* JADX INFO: renamed from: ۦۣۗؔ٘, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4961 extends AbstractC3695 {

    /* JADX INFO: renamed from: ۥْ */
    public final C4461 f16409;

    /* JADX INFO: renamed from: ۥٓ */
    public long f16410;

    /* JADX INFO: renamed from: ۦ۟ */
    public final C4461 f16411;

    public C4961(C5371 c5371) {
        super(c5371);
        this.f16409 = new C4461(0);
        this.f16411 = new C4461(0);
    }

    /* JADX INFO: renamed from: ۥَ */
    public final void m8337(long j, String str) {
        C5371 c5371 = (C5371) this.f18660;
        if (str == null || str.length() == 0) {
            C3610 c3610 = c5371.f17717;
            C5371.m9020(c3610);
            c3610.f12020.m9432("Ad unit id must be a non-empty string");
        } else {
            C3644 c3644 = c5371.f17733;
            C5371.m9020(c3644);
            c3644.m6515(new RunnableC4634(this, str, j, 1));
        }
    }

    /* JADX INFO: renamed from: ۥٓ */
    public final void m8338(long j, String str) {
        C5371 c5371 = (C5371) this.f18660;
        if (str == null || str.length() == 0) {
            C3610 c3610 = c5371.f17717;
            C5371.m9020(c3610);
            c3610.f12020.m9432("Ad unit id must be a non-empty string");
        } else {
            C3644 c3644 = c5371.f17733;
            C5371.m9020(c3644);
            c3644.m6515(new RunnableC4634(this, str, j, 0));
        }
    }

    /* JADX INFO: renamed from: ۥٖ */
    public final void m8339(long j) {
        C5266 c5266 = ((C5371) this.f18660).f17711;
        C5371.m9023(c5266);
        C0932 c0932M8902 = c5266.m8902(false);
        C4461 c4461 = this.f16411;
        for (String str : (C2163) c4461.keySet()) {
            m8342(str, j - ((Long) c4461.get(str)).longValue(), c0932M8902);
        }
        if (!c4461.isEmpty()) {
            m8341(j - this.f16410, c0932M8902);
        }
        m8340(j);
    }

    /* JADX INFO: renamed from: ۥۖ */
    public final void m8340(long j) {
        C4461 c4461 = this.f16411;
        Iterator it = ((C2163) c4461.keySet()).iterator();
        while (it.hasNext()) {
            c4461.put((String) it.next(), Long.valueOf(j));
        }
        if (c4461.isEmpty()) {
            return;
        }
        this.f16410 = j;
    }

    /* JADX INFO: renamed from: ۦٗ */
    public final void m8341(long j, C0932 c0932) {
        C5371 c5371 = (C5371) this.f18660;
        if (c0932 == null) {
            C3610 c3610 = c5371.f17717;
            C5371.m9020(c3610);
            c3610.f12023.m9432("Not logging ad exposure. No active activity");
        } else if (j < 1000) {
            C3610 c3611 = c5371.f17717;
            C5371.m9020(c3611);
            c3611.f12023.m9430(Long.valueOf(j), "Not logging ad exposure. Less than 1000 ms. exposure");
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j);
            C1512.m3193(c0932, bundle, true);
            C5235 c5235 = c5371.f17709;
            C5371.m9023(c5235);
            c5235.m8879("am", "_xa", bundle);
        }
    }

    /* JADX INFO: renamed from: ۦۛ */
    public final void m8342(String str, long j, C0932 c0932) {
        C5371 c5371 = (C5371) this.f18660;
        if (c0932 == null) {
            C3610 c3610 = c5371.f17717;
            C5371.m9020(c3610);
            c3610.f12023.m9432("Not logging ad unit exposure. No active activity");
        } else {
            if (j < 1000) {
                C3610 c3611 = c5371.f17717;
                C5371.m9020(c3611);
                c3611.f12023.m9430(Long.valueOf(j), "Not logging ad unit exposure. Less than 1000 ms. exposure");
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j);
            C1512.m3193(c0932, bundle, true);
            C5235 c5235 = c5371.f17709;
            C5371.m9023(c5235);
            c5235.m8879("am", "_xu", bundle);
        }
    }
}
