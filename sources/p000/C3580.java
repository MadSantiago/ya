package p000;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: ۦؚۣؑۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3580 {

    /* JADX INFO: renamed from: ۥؗ */
    public boolean f11908;

    /* JADX INFO: renamed from: ۥُ */
    public Object f11909;

    /* JADX INFO: renamed from: ۥّ */
    public Exception f11910;

    /* JADX INFO: renamed from: ۦؑ */
    public volatile boolean f11913;

    /* JADX INFO: renamed from: ۥۣ */
    public final Object f11912 = new Object();

    /* JADX INFO: renamed from: ۥۗ */
    public final C5470 f11911 = new C5470(6);

    /* JADX INFO: renamed from: ۥؗ */
    public final C3580 m6386(Executor executor, InterfaceC2429 interfaceC2429) {
        C3580 c3580 = new C3580();
        this.f11911.m9159(new C3590(executor, interfaceC2429, c3580, 0));
        m6400();
        return c3580;
    }

    /* JADX INFO: renamed from: ۥُ */
    public final Exception m6387() {
        Exception exc;
        synchronized (this.f11912) {
            exc = this.f11910;
        }
        return exc;
    }

    /* JADX INFO: renamed from: ۥّ */
    public final Object m6388() {
        Object obj;
        synchronized (this.f11912) {
            try {
                AbstractC0487.m1082("Task is not yet complete", this.f11908);
                if (this.f11913) {
                    throw new CancellationException("Task is already canceled.");
                }
                Exception exc = this.f11910;
                if (exc != null) {
                    throw new C3441(exc);
                }
                obj = this.f11909;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final void m6389(Executor executor, InterfaceC3744 interfaceC3744) {
        this.f11911.m9159(new C3517(executor, interfaceC3744));
        m6400();
    }

    /* JADX INFO: renamed from: ۥۜ */
    public final boolean m6390() {
        boolean z;
        synchronized (this.f11912) {
            try {
                z = false;
                if (this.f11908 && !this.f11913 && this.f11910 == null) {
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m6391(Executor executor, InterfaceC1463 interfaceC1463) {
        this.f11911.m9159(new C3517(executor, interfaceC1463));
        m6400();
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final C3580 m6392(Executor executor, InterfaceC2429 interfaceC2429) {
        C3580 c3580 = new C3580();
        this.f11911.m9159(new C3590(executor, interfaceC2429, c3580, 1));
        m6400();
        return c3580;
    }

    /* JADX INFO: renamed from: ۦؚ */
    public final void m6393(Exception exc) {
        AbstractC0487.m1048(exc, "Exception must not be null");
        synchronized (this.f11912) {
            m6399();
            this.f11908 = true;
            this.f11910 = exc;
        }
        this.f11911.m9162(this);
    }

    /* JADX INFO: renamed from: ۦٌ */
    public final void m6394() {
        synchronized (this.f11912) {
            try {
                if (this.f11908) {
                    return;
                }
                this.f11908 = true;
                this.f11913 = true;
                this.f11911.m9162(this);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۦِ */
    public final void m6395(Object obj) {
        synchronized (this.f11912) {
            m6399();
            this.f11908 = true;
            this.f11909 = obj;
        }
        this.f11911.m9162(this);
    }

    /* JADX INFO: renamed from: ۦٛ */
    public final C3580 m6396(Executor executor, InterfaceC3814 interfaceC3814) {
        C3580 c3580 = new C3580();
        this.f11911.m9159(new C3517(executor, interfaceC3814, c3580));
        m6400();
        return c3580;
    }

    /* JADX INFO: renamed from: ۦۗ */
    public final boolean m6397(Object obj) {
        synchronized (this.f11912) {
            try {
                if (this.f11908) {
                    return false;
                }
                this.f11908 = true;
                this.f11909 = obj;
                this.f11911.m9162(this);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۦۙ */
    public final boolean m6398() {
        boolean z;
        synchronized (this.f11912) {
            z = this.f11908;
        }
        return z;
    }

    /* JADX INFO: renamed from: ۦۚ */
    public final void m6399() {
        String strConcat;
        if (this.f11908) {
            if (!m6398()) {
                throw new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
            }
            Exception excM6387 = m6387();
            if (excM6387 != null) {
                strConcat = "failure";
            } else if (m6390()) {
                strConcat = "result ".concat(String.valueOf(m6388()));
            } else {
                strConcat = this.f11913 ? "cancellation" : "unknown issue";
            }
        }
    }

    /* JADX INFO: renamed from: ۦۨ */
    public final void m6400() {
        synchronized (this.f11912) {
            try {
                if (this.f11908) {
                    this.f11911.m9162(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
