package p000;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: ۥٟؕ۟ؔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class C2014 {

    /* JADX INFO: renamed from: ۦؑ */
    public static final C2994 f6633 = new C2994();

    /* JADX INFO: renamed from: ۥؗ */
    public long f6634;

    /* JADX INFO: renamed from: ۥۗ */
    public long f6635;

    /* JADX INFO: renamed from: ۥۣ */
    public boolean f6636;

    /* JADX INFO: renamed from: ۥؗ */
    public long mo3917() {
        if (this.f6636) {
            return this.f6635;
        }
        C1078.m2276("No deadline");
        return 0L;
    }

    /* JADX INFO: renamed from: ۥُ */
    public boolean mo3918() {
        return this.f6636;
    }

    /* JADX INFO: renamed from: ۥّ */
    public void mo3919() throws InterruptedIOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.f6636 && this.f6635 - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    /* JADX INFO: renamed from: ۥۗ */
    public C2014 mo3920() {
        this.f6634 = 0L;
        return this;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public C2014 mo3921() {
        this.f6636 = false;
        return this;
    }

    /* JADX INFO: renamed from: ۦؑ */
    public C2014 mo3922(long j) {
        this.f6636 = true;
        this.f6635 = j;
        return this;
    }

    /* JADX INFO: renamed from: ۦۙ */
    public C2014 mo3923(long j) {
        if (j >= 0) {
            this.f6634 = TimeUnit.MILLISECONDS.toNanos(j);
            return this;
        }
        C1078.m2273(AbstractC3761.m6634(j, "timeout < 0: "));
        return null;
    }
}
