package p000;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: ۦٖۡؕٓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5474 {

    /* JADX INFO: renamed from: ۥؗ */
    public static final WeakHashMap f18061;

    /* JADX INFO: renamed from: ۥۗ */
    public static final C5518 f18062;

    /* JADX INFO: renamed from: ۥۣ */
    public static final AtomicReference f18063;

    /* JADX INFO: renamed from: ۦؑ */
    public static final C2452 f18064;

    static {
        AbstractC4821.m8196(5, "androidx.fragment.app.FragmentViewLifecycleOwner.handleLifecycleEvent", "com.google.android.libraries.logging.logger.transmitters.clearcut", "com.google.android.libraries.performance.primes.transmitter.clearcut", "com.google.android.libraries.performance.primes.metrics.crash.CrashMetricServiceImpl", "com.google.android.libraries.performance.primes.metrics.crash.applicationexit.ApplicationExitMetricServiceImpl");
        f18063 = new AtomicReference(C2745.f9080);
        f18062 = new C5518(22);
        f18061 = new WeakHashMap();
        f18064 = new C2452(5);
        new ArrayDeque();
        new ArrayDeque();
    }

    /* JADX INFO: renamed from: ۥؗ */
    public static C1037 m9168() {
        return (C1037) f18064.get();
    }

    /* JADX WARN: Code duplicated, block: B:32:0x006c  */
    /* JADX INFO: renamed from: ۥۗ */
    public static AbstractC0866 m9169(C1037 c1037, AbstractC0866 abstractC0866) {
        boolean zEquals;
        c1037.getClass();
        AbstractC0866 abstractC0867 = c1037.f3670;
        if (abstractC0867 != abstractC0866) {
            if (abstractC0867 == null) {
                if (Build.VERSION.SDK_INT >= 29) {
                    zEquals = Trace.isEnabled();
                } else {
                    AbstractC4795.f15815.getClass();
                    f18062.getClass();
                    String str = "false";
                    try {
                        str = (String) AbstractC5029.f16643.invoke(null, "tiktok_systrace", "false");
                    } catch (Exception e) {
                        Log.e("SystemProperties", "get error", e);
                    }
                    zEquals = str.equals("true");
                }
                c1037.f3671 = zEquals;
            }
            if (c1037.f3671) {
                if (abstractC0867 != null) {
                    if (abstractC0866 != null) {
                        if (abstractC0867.f3189 == abstractC0866 && !C3133.m5797(abstractC0867)) {
                            Trace.endSection();
                        } else if (abstractC0867 == abstractC0866.f3189 && !C3133.m5797(abstractC0866)) {
                            C3133.m5801(abstractC0866);
                        }
                    }
                    C3133.m5794(abstractC0867);
                    if (abstractC0866 != null) {
                        C3133.m5796(abstractC0866);
                    }
                } else if (abstractC0866 != null) {
                    C3133.m5796(abstractC0866);
                }
            }
            if (abstractC0867 != abstractC0866) {
                c1037.f3670 = abstractC0866;
                return abstractC0867;
            }
        }
        return abstractC0866;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static AbstractC0866 m9170() {
        C1037 c1037M9168 = m9168();
        AbstractC0866 abstractC0866 = c1037M9168.f3670;
        if (abstractC0866 != null && abstractC0866 != C2303.f7636) {
            return abstractC0866;
        }
        C3754 c3754 = C0531.f1870;
        C4962 c4962 = C4962.f16412;
        long jM8343 = c4962.m8343() & (-61441);
        long jM8344 = c4962.m8343() >>> 2;
        UUID uuid = c4962.f16414;
        UUID uuid2 = new UUID(jM8343 ^ uuid.getMostSignificantBits(), jM8344 ^ uuid.getLeastSignificantBits());
        String strM1854 = AbstractC0866.m1854(uuid2);
        AbstractC4821 abstractC4821 = (AbstractC4821) f18063.get();
        if (!abstractC4821.isEmpty()) {
            abstractC4821.forEach(new C1683());
        }
        C3754 c3755 = C0531.f1870;
        return new C0531("<missing root>", uuid2, strM1854, c1037M9168);
    }
}
