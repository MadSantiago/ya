package p000;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: ۦۨؒ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class C5858 extends C2014 {

    /* JADX INFO: renamed from: ۥۜ */
    public static final ReentrantLock f19344;

    /* JADX INFO: renamed from: ۦؚ */
    public static C5858 f19345;

    /* JADX INFO: renamed from: ۦِ */
    public static final long f19346;

    /* JADX INFO: renamed from: ۦٛ */
    public static final Condition f19347;

    /* JADX INFO: renamed from: ۦۗ */
    public static final long f19348;

    /* JADX INFO: renamed from: ۥُ */
    public int f19349;

    /* JADX INFO: renamed from: ۥّ */
    public C5858 f19350;

    /* JADX INFO: renamed from: ۦۙ */
    public long f19351;

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        f19344 = reentrantLock;
        f19347 = reentrantLock.newCondition();
        f19346 = 60000L;
        f19348 = 60000000000L;
    }

    /* JADX INFO: renamed from: ۥۜ */
    public final void m9679() {
        long j = this.f6634;
        boolean z = this.f6636;
        if (j != 0 || z) {
            ReentrantLock reentrantLock = f19344;
            reentrantLock.lock();
            try {
                if (this.f19349 != 0) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.f19349 = 1;
                AbstractC0186.m427(this, j, z);
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۦٛ */
    public final boolean m9680() {
        ReentrantLock reentrantLock = f19344;
        reentrantLock.lock();
        try {
            int i = this.f19349;
            this.f19349 = 0;
            if (i != 1) {
                boolean z = i == 2;
                reentrantLock.unlock();
                return z;
            }
            C5858 c5858 = f19345;
            while (c5858 != null) {
                C5858 c5859 = c5858.f19350;
                if (c5859 == this) {
                    c5858.f19350 = this.f19350;
                    this.f19350 = null;
                    reentrantLock.unlock();
                    return false;
                }
                c5858 = c5859;
            }
            throw new IllegalStateException("node was not found in the queue");
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۦِ */
    public void mo2853() {
    }
}
