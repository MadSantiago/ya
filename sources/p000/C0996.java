package p000;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: ۥًََؓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0996 {

    /* JADX INFO: renamed from: ۥؗ */
    public final InterfaceC3077 f3558;

    /* JADX INFO: renamed from: ۥُ */
    public final InterfaceC3077 f3559;

    /* JADX INFO: renamed from: ۥّ */
    public final InterfaceC3077 f3560;

    /* JADX INFO: renamed from: ۥۗ */
    public final Context f3561;

    /* JADX INFO: renamed from: ۥۜ */
    public final InterfaceC3077 f3562;

    /* JADX INFO: renamed from: ۥۣ */
    public final C5460 f3563 = new C5460(16);

    /* JADX INFO: renamed from: ۦؑ */
    public final InterfaceC3077 f3564;

    /* JADX INFO: renamed from: ۦٛ */
    public final C2183 f3565;

    /* JADX INFO: renamed from: ۦۙ */
    public final C3882 f3566;

    /* JADX INFO: renamed from: ۦِ */
    public static final Object f3556 = new Object();

    /* JADX INFO: renamed from: ۦۗ */
    public static final AtomicReference f3557 = new AtomicReference();

    /* JADX INFO: renamed from: ۦؚ */
    public static volatile C0996 f3554 = null;

    /* JADX INFO: renamed from: ۦٌ */
    public static final InterfaceC3077 f3555 = AbstractC3933.m7074(C1745.f5800);

    public C0996(Context context, InterfaceC3077 interfaceC3077, InterfaceC3077 interfaceC3078, InterfaceC3077 interfaceC3079, InterfaceC3077 interfaceC30710, InterfaceC3077 interfaceC30711) {
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        interfaceC3077.getClass();
        interfaceC3078.getClass();
        interfaceC3079.getClass();
        interfaceC30710.getClass();
        interfaceC30711.getClass();
        InterfaceC3077 interfaceC3077M7074 = AbstractC3933.m7074(interfaceC3077);
        InterfaceC3077 interfaceC3077M7075 = AbstractC3933.m7074(interfaceC3078);
        InterfaceC3077 interfaceC3077M7076 = AbstractC3933.m7074(new C2391(14, interfaceC3079));
        InterfaceC3077 interfaceC3077M7077 = AbstractC3933.m7074(interfaceC30710);
        InterfaceC3077 interfaceC3077M7078 = AbstractC3933.m7074(interfaceC30711);
        this.f3561 = applicationContext;
        this.f3558 = interfaceC3077M7074;
        this.f3564 = interfaceC3077M7075;
        this.f3559 = interfaceC3077M7076;
        this.f3560 = interfaceC3077M7077;
        this.f3566 = new C3882(applicationContext, interfaceC3077M7074, interfaceC3077M7077, interfaceC3077M7075);
        this.f3562 = interfaceC3077M7078;
        this.f3565 = new C2183(applicationContext, interfaceC3077M7074, interfaceC3077M7076, interfaceC3077M7075);
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static void m2176() {
        synchronized (AbstractC3925.f13100) {
        }
        if (f3557.get() == null && AbstractC3925.f13095 == null) {
            AbstractC3925.f13095 = new C3754(5);
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final ScheduledExecutorServiceC3499 m2177() {
        return (ScheduledExecutorServiceC3499) this.f3558.get();
    }
}
