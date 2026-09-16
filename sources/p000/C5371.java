package p000;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* JADX INFO: renamed from: ۦّٕ۠ؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5371 implements InterfaceC1150 {

    /* JADX INFO: renamed from: ۥٝ */
    public static volatile C5371 f17708;

    /* JADX INFO: renamed from: ۥؓ */
    public final C5235 f17709;

    /* JADX INFO: renamed from: ۥؔ */
    public volatile Boolean f17710;

    /* JADX INFO: renamed from: ۥؖ */
    public final C5266 f17711;

    /* JADX INFO: renamed from: ۥً */
    public final C2382 f17712;

    /* JADX INFO: renamed from: ۥَ */
    public final C4474 f17713;

    /* JADX INFO: renamed from: ۥْ */
    public final C4452 f17714;

    /* JADX INFO: renamed from: ۥٓ */
    public final C0515 f17715;

    /* JADX INFO: renamed from: ۥٕ */
    public C5403 f17716;

    /* JADX INFO: renamed from: ۥٖ */
    public final C3610 f17717;

    /* JADX INFO: renamed from: ۥ٘ */
    public int f17718;

    /* JADX INFO: renamed from: ۥٙ */
    public final C1397 f17719;

    /* JADX INFO: renamed from: ۥۖ */
    public final C1512 f17721;

    /* JADX INFO: renamed from: ۥۙ */
    public C5695 f17722;

    /* JADX INFO: renamed from: ۥۤ */
    public final long f17723;

    /* JADX INFO: renamed from: ۥۦ */
    public C4666 f17724;

    /* JADX INFO: renamed from: ۥۧ */
    public final C4961 f17725;

    /* JADX INFO: renamed from: ۦؒ */
    public final long f17726;

    /* JADX INFO: renamed from: ۦؖ */
    public C1968 f17727;

    /* JADX INFO: renamed from: ۦؙ */
    public C2753 f17729;

    /* JADX INFO: renamed from: ۦُ */
    public Boolean f17730;

    /* JADX INFO: renamed from: ۦٕ */
    public final C4004 f17731;

    /* JADX INFO: renamed from: ۦٖ */
    public long f17732;

    /* JADX INFO: renamed from: ۦٗ */
    public final C3644 f17733;

    /* JADX INFO: renamed from: ۦٚ */
    public final String f17734;

    /* JADX INFO: renamed from: ۦۛ */
    public final C4423 f17735;

    /* JADX INFO: renamed from: ۦۜ */
    public volatile boolean f17736;

    /* JADX INFO: renamed from: ۦ۟ */
    public final boolean f17737;

    /* JADX INFO: renamed from: ۦۣ */
    public int f17738;

    /* JADX INFO: renamed from: ۦۨ */
    public final Context f17739;

    /* JADX INFO: renamed from: ۦؗ */
    public boolean f17728 = false;

    /* JADX INFO: renamed from: ۥٛ */
    public final AtomicInteger f17720 = new AtomicInteger(0);

    public C5371(C0540 c0540) {
        Context applicationContext;
        long jCurrentTimeMillis;
        long jElapsedRealtime;
        boolean z = false;
        Context context = c0540.f1940;
        C4452 c4452 = new C4452(7);
        this.f17714 = c4452;
        AbstractC2774.f9247 = c4452;
        this.f17739 = context;
        this.f17737 = c0540.f1936;
        this.f17710 = c0540.f1938;
        this.f17734 = c0540.f1939;
        int i = 1;
        this.f17736 = true;
        if (AbstractC5271.f17368 == null) {
            Object obj = AbstractC5271.f17369;
            synchronized (obj) {
                try {
                    if (AbstractC5271.f17368 == null) {
                        synchronized (obj) {
                            try {
                                C3367 c3367 = AbstractC5271.f17368;
                                Context applicationContext2 = context.getApplicationContext();
                                if (applicationContext2 == null) {
                                    applicationContext2 = context;
                                }
                                if (c3367 == null || c3367.f11246 != applicationContext2) {
                                    if (c3367 != null) {
                                        Iterator it = AbstractC3503.f11611.values().iterator();
                                        if (it.hasNext()) {
                                            if (it.next() != null) {
                                                throw new ClassCastException();
                                            }
                                            throw null;
                                        }
                                        AbstractC2396.m4515();
                                    }
                                    AbstractC5271.f17368 = new C3367(applicationContext2, AbstractC3933.m7074(new C0272(applicationContext2, 4)));
                                    AbstractC5271.f17367.incrementAndGet();
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        this.f17719 = C1397.f4800;
        C1543 c1543 = new C1543(context, AbstractC4288.f14178, InterfaceC2601.f8692, C1540.f5214);
        String strConcat = "com.google.android.gms.measurement#".concat(String.valueOf(context.getPackageName()));
        C5470 c5470M9153 = C5470.m9153();
        c5470M9153.f18034 = new C2346(27, strConcat, new String[0]);
        c1543.m7829(0, c5470M9153.m9158());
        AtomicReference atomicReference = C0996.f3557;
        if (atomicReference.get() == null) {
            try {
                applicationContext = context.getApplicationContext();
            } catch (NullPointerException unused) {
                C0996.m2176();
                AbstractC1631.m3424(Level.WARNING, (Executor) C0996.f3555.get(), null, "context.getApplicationContext() yielded NullPointerException", new Object[0]);
                applicationContext = null;
            }
            if (applicationContext != null) {
                while (!atomicReference.compareAndSet(null, applicationContext) && atomicReference.get() == null) {
                }
            }
        }
        Long l = c0540.f1937;
        if (l != null) {
            jCurrentTimeMillis = l.longValue();
        } else {
            this.f17719.getClass();
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        this.f17723 = jCurrentTimeMillis;
        Long l2 = c0540.f1942;
        if (l2 != null) {
            jElapsedRealtime = l2.longValue();
        } else {
            this.f17719.getClass();
            jElapsedRealtime = SystemClock.elapsedRealtime();
        }
        this.f17726 = jElapsedRealtime;
        C0515 c0515 = new C0515(this);
        c0515.f1841 = C4369.f14384;
        this.f17715 = c0515;
        C4474 c4474 = new C4474(this);
        c4474.m505();
        this.f17713 = c4474;
        C3610 c3610 = new C3610(this);
        c3610.m505();
        this.f17717 = c3610;
        C1512 c1512 = new C1512(this);
        c1512.m505();
        this.f17721 = c1512;
        this.f17731 = new C4004(new C3385(c0540, this));
        this.f17725 = new C4961(this);
        C5266 c5266 = new C5266(this);
        c5266.m7642();
        this.f17711 = c5266;
        C5235 c5235 = new C5235(this);
        c5235.m7642();
        this.f17709 = c5235;
        C4423 c4423 = new C4423(this);
        c4423.m7642();
        this.f17735 = c4423;
        C2382 c2382 = new C2382(this);
        ((C5371) c2382.f18660).f17738++;
        c2382.m505();
        this.f17712 = c2382;
        C3644 c3644 = new C3644(this);
        c3644.m505();
        this.f17733 = c3644;
        C1302 c1302 = c0540.f1941;
        boolean z2 = c1302 == null || c1302.f4472 == 0;
        if (this.f17739.getApplicationContext() instanceof Application) {
            m9023(c5235);
            if (((C5371) c5235.f18660).f17739.getApplicationContext() instanceof Application) {
                Application application = (Application) ((C5371) c5235.f18660).f17739.getApplicationContext();
                C3183 c3183 = c5235.f17271;
                if (c3183 == null) {
                    c3183 = new C3183(i, c5235);
                    c5235.f17271 = c3183;
                }
                if (z2) {
                    application.unregisterActivityLifecycleCallbacks(c3183);
                    application.registerActivityLifecycleCallbacks(c5235.f17271);
                    C3610 c3611 = ((C5371) c5235.f18660).f17717;
                    m9020(c3611);
                    c3611.f12023.m9432("Registered activity lifecycle callback");
                }
            }
        } else {
            m9020(c3610);
            c3610.f12022.m9432("Application context is not an Application");
        }
        c3644.m6515(new RunnableC4985(23, this, c0540, z));
    }

    /* JADX INFO: renamed from: ۥْ */
    public static C5371 m9019(Context context, C1302 c1302, Long l, Long l2) {
        Bundle bundle;
        if (c1302 != null) {
            Bundle bundle2 = c1302.f4471;
            c1302 = new C1302(c1302.f4473, c1302.f4472, c1302.f4470, bundle2, null);
        }
        AbstractC0487.m1047(context);
        AbstractC0487.m1047(context.getApplicationContext());
        if (f17708 == null) {
            synchronized (C5371.class) {
                try {
                    if (f17708 == null) {
                        f17708 = new C5371(new C0540(context, c1302, l, l2));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else if (c1302 != null && (bundle = c1302.f4471) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            AbstractC0487.m1047(f17708);
            f17708.f17710 = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled"));
        }
        AbstractC0487.m1047(f17708);
        return f17708;
    }

    /* JADX INFO: renamed from: ۦؚ */
    public static final void m9020(AbstractC0243 abstractC0243) {
        if (abstractC0243 == null) {
            C1078.m2276("Component not created");
        } else {
            if (abstractC0243.f911) {
                return;
            }
            C1078.m2276("Component not initialized: ".concat(String.valueOf(abstractC0243.getClass())));
        }
    }

    /* JADX INFO: renamed from: ۦِ */
    public static final void m9021(AbstractC5676 abstractC5676) {
        if (abstractC5676 != null) {
            return;
        }
        C1078.m2276("Component not created");
    }

    /* JADX INFO: renamed from: ۦٛ */
    public static final void m9022(AbstractC3695 abstractC3695) {
        if (abstractC3695 != null) {
            return;
        }
        C1078.m2276("Component not created");
    }

    /* JADX INFO: renamed from: ۦۗ */
    public static final void m9023(AbstractC4351 abstractC4351) {
        if (abstractC4351 == null) {
            C1078.m2276("Component not created");
        } else {
            if (abstractC4351.f14347) {
                return;
            }
            C1078.m2276("Component not initialized: ".concat(String.valueOf(abstractC4351.getClass())));
        }
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final boolean m9024() {
        return m9027() == 0;
    }

    @Override // p000.InterfaceC1150
    /* JADX INFO: renamed from: ۥُ */
    public final Context mo2402() {
        return this.f17739;
    }

    @Override // p000.InterfaceC1150
    /* JADX INFO: renamed from: ۥّ */
    public final C1397 mo2403() {
        return this.f17719;
    }

    @Override // p000.InterfaceC1150
    /* JADX INFO: renamed from: ۥۗ */
    public final C3610 mo2404() {
        C3610 c3610 = this.f17717;
        m9020(c3610);
        return c3610;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0035  */
    /* JADX WARN: Code duplicated, block: B:24:0x0074  */
    /* JADX WARN: Code duplicated, block: B:27:0x007d  */
    /* JADX INFO: renamed from: ۥۜ */
    public final boolean m9025() {
        C1512 c1512;
        Context context;
        boolean z = false;
        if (!this.f17728) {
            C1078.m2276("AppMeasurement is not initialized");
            return false;
        }
        C3644 c3644 = this.f17733;
        m9020(c3644);
        c3644.mo6517();
        Boolean bool = this.f17730;
        C1397 c1397 = this.f17719;
        if (bool == null || this.f17732 == 0) {
            c1397.getClass();
            this.f17732 = SystemClock.elapsedRealtime();
            c1512 = this.f17721;
            m9021(c1512);
            if (c1512.m3216("android.permission.INTERNET") && c1512.m3216("android.permission.ACCESS_NETWORK_STATE")) {
                context = this.f17739;
                if (C3866.m6899(context).m563() || this.f17715.m1158() || (C1512.m3186(context) && C1512.m3199(context))) {
                    z = true;
                }
            }
            this.f17730 = Boolean.valueOf(z);
            if (z) {
                this.f17730 = Boolean.valueOf(c1512.m3218(m9029().m3855()));
            }
        } else if (!bool.booleanValue()) {
            c1397.getClass();
            if (Math.abs(SystemClock.elapsedRealtime() - this.f17732) > 1000) {
                c1397.getClass();
                this.f17732 = SystemClock.elapsedRealtime();
                c1512 = this.f17721;
                m9021(c1512);
                if (c1512.m3216("android.permission.INTERNET")) {
                    context = this.f17739;
                    if (C3866.m6899(context).m563()) {
                        z = true;
                    } else {
                        z = true;
                    }
                }
                this.f17730 = Boolean.valueOf(z);
                if (z) {
                    this.f17730 = Boolean.valueOf(c1512.m3218(m9029().m3855()));
                }
            }
        }
        return this.f17730.booleanValue();
    }

    @Override // p000.InterfaceC1150
    /* JADX INFO: renamed from: ۥۣ */
    public final C4452 mo2405() {
        return this.f17714;
    }

    @Override // p000.InterfaceC1150
    /* JADX INFO: renamed from: ۦؑ */
    public final C3644 mo2406() {
        C3644 c3644 = this.f17733;
        m9020(c3644);
        return c3644;
    }

    /* JADX INFO: renamed from: ۦٌ */
    public final C5403 m9026() {
        m9023(this.f17716);
        return this.f17716;
    }

    /* JADX INFO: renamed from: ۦۙ */
    public final int m9027() {
        C3644 c3644 = this.f17733;
        m9020(c3644);
        c3644.mo6517();
        C0515 c0515 = this.f17715;
        if (c0515.m1157()) {
            return 1;
        }
        m9020(c3644);
        c3644.mo6517();
        if (!this.f17736) {
            return 8;
        }
        C4474 c4474 = this.f17713;
        m9021(c4474);
        c4474.mo6517();
        Boolean boolValueOf = c4474.m7755().contains("measurement_enabled") ? Boolean.valueOf(c4474.m7755().getBoolean("measurement_enabled", true)) : null;
        if (boolValueOf != null) {
            return boolValueOf.booleanValue() ? 0 : 3;
        }
        C4452 c4452 = ((C5371) c0515.f18660).f17714;
        Boolean boolM1166 = c0515.m1166("firebase_analytics_collection_enabled");
        if (boolM1166 != null) {
            return boolM1166.booleanValue() ? 0 : 4;
        }
        return (this.f17710 == null || this.f17710.booleanValue()) ? 0 : 7;
    }

    /* JADX INFO: renamed from: ۦۚ */
    public final C5695 m9028() {
        m9023(this.f17722);
        return this.f17722;
    }

    /* JADX INFO: renamed from: ۦ۟ */
    public final C1968 m9029() {
        m9023(this.f17727);
        return this.f17727;
    }

    /* JADX INFO: renamed from: ۦۨ */
    public final C2753 m9030() {
        m9020(this.f17729);
        return this.f17729;
    }
}
