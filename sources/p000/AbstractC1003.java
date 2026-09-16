package p000;

import android.os.Handler;

/* JADX INFO: renamed from: ۥََؔۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1003 {

    /* JADX INFO: renamed from: ۦؑ */
    public static volatile HandlerC0645 f3582;

    /* JADX INFO: renamed from: ۥؗ */
    public volatile long f3583;

    /* JADX INFO: renamed from: ۥۗ */
    public final RunnableC4985 f3584;

    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC1150 f3585;

    public AbstractC1003(InterfaceC1150 interfaceC1150) {
        AbstractC0487.m1047(interfaceC1150);
        this.f3585 = interfaceC1150;
        this.f3584 = new RunnableC4985(18, this, interfaceC1150, false);
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final void m2198() {
        this.f3583 = 0L;
        m2200().removeCallbacks(this.f3584);
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final void m2199(long j) {
        m2198();
        if (j >= 0) {
            InterfaceC1150 interfaceC1150 = this.f3585;
            interfaceC1150.mo2403().getClass();
            this.f3583 = System.currentTimeMillis();
            if (m2200().postDelayed(this.f3584, j)) {
                return;
            }
            interfaceC1150.mo2404().f12020.m9430(Long.valueOf(j), "Failed to schedule delayed post. time");
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public abstract void mo1720();

    /* JADX INFO: renamed from: ۦؑ */
    public final Handler m2200() {
        HandlerC0645 handlerC0645;
        if (f3582 != null) {
            return f3582;
        }
        synchronized (AbstractC1003.class) {
            try {
                if (f3582 == null) {
                    f3582 = new HandlerC0645(this.f3585.mo2402().getMainLooper(), 2);
                }
                handlerC0645 = f3582;
            } catch (Throwable th) {
                throw th;
            }
        }
        return handlerC0645;
    }
}
