package p000;

import android.os.Bundle;
import android.os.SystemClock;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: ۦۜؒؐؓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5266 extends AbstractC4351 {

    /* JADX INFO: renamed from: ۥؖ */
    public final Object f17352;

    /* JADX INFO: renamed from: ۥَ */
    public C0932 f17353;

    /* JADX INFO: renamed from: ۥْ */
    public volatile C0932 f17354;

    /* JADX INFO: renamed from: ۥٓ */
    public volatile C0932 f17355;

    /* JADX INFO: renamed from: ۥٖ */
    public final ConcurrentHashMap f17356;

    /* JADX INFO: renamed from: ۥٙ */
    public boolean f17357;

    /* JADX INFO: renamed from: ۥۖ */
    public volatile C0932 f17358;

    /* JADX INFO: renamed from: ۦٕ */
    public C0932 f17359;

    /* JADX INFO: renamed from: ۦٗ */
    public C3156 f17360;

    /* JADX INFO: renamed from: ۦۛ */
    public volatile boolean f17361;

    public C5266(C5371 c5371) {
        super(c5371);
        this.f17352 = new Object();
        this.f17356 = new ConcurrentHashMap();
    }

    /* JADX INFO: renamed from: ۥؓ */
    public final C0932 m8897(C3156 c3156) {
        AbstractC0487.m1047(c3156);
        Integer numValueOf = Integer.valueOf(c3156.f10637);
        ConcurrentHashMap concurrentHashMap = this.f17356;
        C0932 c0932 = (C0932) concurrentHashMap.get(numValueOf);
        if (c0932 == null) {
            String strM8903 = m8903(c3156.f10636);
            C1512 c1512 = ((C5371) this.f18660).f17721;
            C5371.m9021(c1512);
            C0932 c0933 = new C0932(c1512.m3214(), null, strM8903);
            concurrentHashMap.put(numValueOf, c0933);
            c0932 = c0933;
        }
        return this.f17358 != null ? this.f17358 : c0932;
    }

    /* JADX INFO: renamed from: ۥؖ */
    public final void m8898(C0932 c0932, boolean z, long j) {
        C5371 c5371 = (C5371) this.f18660;
        C4961 c4961 = c5371.f17725;
        C5371.m9022(c4961);
        c5371.f17719.getClass();
        c4961.m8339(SystemClock.elapsedRealtime());
        boolean z2 = c0932 != null && c0932.f3321;
        C4423 c4423 = c5371.f17735;
        C5371.m9023(c4423);
        if (!c4423.f14593.m1382(z2, z, j) || c0932 == null) {
            return;
        }
        c0932.f3321 = false;
    }

    @Override // p000.AbstractC4351
    /* JADX INFO: renamed from: ۥٖ */
    public final boolean mo3853() {
        return false;
    }

    /* JADX INFO: renamed from: ۥٙ */
    public final void m8899(String str, C0932 c0932, boolean z) {
        C0932 c0933;
        C0932 c0934 = this.f17354 == null ? this.f17355 : this.f17354;
        if (c0932.f3319 == null) {
            c0933 = new C0932(c0932.f3320, str != null ? m8903(str) : null, c0932.f3316, c0932.f3317, c0932.f3318, c0932.f3322);
        } else {
            c0933 = c0932;
        }
        this.f17355 = this.f17354;
        this.f17354 = c0933;
        C5371 c5371 = (C5371) this.f18660;
        c5371.f17719.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        C3644 c3644 = c5371.f17733;
        C5371.m9020(c3644);
        c3644.m6515(new RunnableC4480(this, c0933, c0934, jElapsedRealtime, z));
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0033  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b5  */
    /* JADX INFO: renamed from: ۥۖ */
    public final void m8900(C0932 c0932, C0932 c0933, long j, boolean z, Bundle bundle) {
        boolean z2;
        long j2;
        Bundle bundle2;
        boolean z3 = c0932.f3317;
        C5371 c5371 = (C5371) this.f18660;
        mo6517();
        boolean z4 = false;
        if (c0933 != null) {
            if (c0933.f3316 == c0932.f3316 && Objects.equals(c0933.f3319, c0932.f3319) && Objects.equals(c0933.f3320, c0932.f3320)) {
                z2 = false;
            } else {
                z2 = true;
            }
        } else {
            z2 = true;
        }
        if (z && this.f17353 != null) {
            z4 = true;
        }
        if (z2) {
            Bundle bundle3 = bundle != null ? new Bundle(bundle) : new Bundle();
            C1512.m3193(c0932, bundle3, true);
            if (c0933 != null) {
                String str = c0933.f3320;
                if (str != null) {
                    bundle3.putString("_pn", str);
                }
                String str2 = c0933.f3319;
                if (str2 != null) {
                    bundle3.putString("_pc", str2);
                }
                bundle3.putLong("_pi", c0933.f3316);
            }
            if (z4) {
                C4423 c4423 = c5371.f17735;
                C5371.m9023(c4423);
                C0616 c0616 = c4423.f14593;
                long j3 = j - c0616.f2299;
                c0616.f2299 = j;
                if (j3 > 0) {
                    C1512 c1512 = c5371.f17721;
                    C5371.m9021(c1512);
                    c1512.m3209(bundle3, j3);
                }
            }
            C0515 c0515 = c5371.f17715;
            C1397 c1397 = c5371.f17719;
            if (!c0515.m1161()) {
                bundle3.putLong("_mst", 1L);
            }
            String str3 = true != z3 ? "auto" : "app";
            c1397.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (z3) {
                long j4 = c0932.f3318;
                if (j4 != 0) {
                    j2 = j4;
                } else {
                    j2 = jCurrentTimeMillis;
                }
            } else {
                j2 = jCurrentTimeMillis;
            }
            long jElapsedRealtime = c5371.f17715.m1162(null, AbstractC4936.f19565) ? SystemClock.elapsedRealtime() : 0L;
            if (z3) {
                bundle2 = bundle3;
                long j5 = c0932.f3322;
                if (j5 != 0) {
                    jElapsedRealtime = j5;
                }
            } else {
                bundle2 = bundle3;
            }
            C5235 c5235 = c5371.f17709;
            C5371.m9023(c5235);
            c5235.m8869(j2, jElapsedRealtime, bundle2, str3, "_vs");
        }
        if (z4) {
            m8898(this.f17353, true, j);
        }
        this.f17353 = c0932;
        if (z3) {
            this.f17359 = c0932;
        }
        C5695 c5695M9028 = c5371.m9028();
        c5695M9028.mo6517();
        c5695M9028.m7643();
        c5695M9028.m9509(new RunnableC5413(c5695M9028, c0932));
    }

    /* JADX INFO: renamed from: ۦٕ */
    public final void m8901(C3156 c3156, Bundle bundle) {
        Bundle bundle2;
        if (!((C5371) this.f18660).f17715.m1161() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.f17356.put(Integer.valueOf(c3156.f10637), new C0932(bundle2.getLong("id"), bundle2.getString("name"), bundle2.getString("referrer_name")));
    }

    /* JADX INFO: renamed from: ۦٗ */
    public final C0932 m8902(boolean z) {
        m7643();
        mo6517();
        C0932 c0932 = this.f17353;
        return (z && c0932 == null) ? this.f17359 : c0932;
    }

    /* JADX INFO: renamed from: ۦۛ */
    public final String m8903(String str) {
        if (str == null) {
            return "Activity";
        }
        String[] strArrSplit = str.split("\\.");
        int length = strArrSplit.length;
        String str2 = length > 0 ? strArrSplit[length - 1] : "";
        C5371 c5371 = (C5371) this.f18660;
        int length2 = str2.length();
        c5371.f17715.getClass();
        if (length2 <= 500) {
            return str2;
        }
        c5371.f17715.getClass();
        return str2.substring(0, 500);
    }
}
