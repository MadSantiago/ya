package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;

/* JADX INFO: renamed from: ۥُۛؕؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2324 {

    /* JADX INFO: renamed from: ۥؗ */
    public boolean f7685;

    /* JADX INFO: renamed from: ۥُ */
    public final ArrayList f7686 = new ArrayList();

    /* JADX INFO: renamed from: ۥّ */
    public boolean f7687;

    /* JADX INFO: renamed from: ۥۗ */
    public final String f7688;

    /* JADX INFO: renamed from: ۥۣ */
    public final C2680 f7689;

    /* JADX INFO: renamed from: ۦؑ */
    public AbstractC2797 f7690;

    public C2324(C2680 c2680, String str) {
        this.f7689 = c2680;
        this.f7688 = str;
    }

    public final String toString() {
        return this.f7688;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final void m4367(AbstractC2797 abstractC2797, long j) {
        synchronized (this.f7689) {
            if (!this.f7685) {
                if (m4371(abstractC2797, j, false)) {
                    this.f7689.m4985(this);
                }
            } else if (abstractC2797.f9351) {
                if (C2680.f8891.isLoggable(Level.FINE)) {
                    AbstractC3801.m6744(abstractC2797, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                if (C2680.f8891.isLoggable(Level.FINE)) {
                    AbstractC3801.m6744(abstractC2797, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    /* JADX INFO: renamed from: ۥُ */
    public final void m4368() {
        byte[] bArr = AbstractC4031.f13451;
        synchronized (this.f7689) {
            this.f7685 = true;
            if (m4369()) {
                this.f7689.m4985(this);
            }
        }
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final boolean m4369() {
        AbstractC2797 abstractC2797 = this.f7690;
        if (abstractC2797 != null && abstractC2797.f9351) {
            this.f7687 = true;
        }
        ArrayList arrayList = this.f7686;
        boolean z = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((AbstractC2797) arrayList.get(size)).f9351) {
                AbstractC2797 abstractC2798 = (AbstractC2797) arrayList.get(size);
                if (C2680.f8891.isLoggable(Level.FINE)) {
                    AbstractC3801.m6744(abstractC2798, this, "canceled");
                }
                arrayList.remove(size);
                z = true;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m4370() {
        byte[] bArr = AbstractC4031.f13451;
        synchronized (this.f7689) {
            if (m4369()) {
                this.f7689.m4985(this);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0040  */
    /* JADX WARN: Code duplicated, block: B:20:0x004c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0065  */
    /* JADX WARN: Code duplicated, block: B:28:0x0073 A[LOOP:0: B:23:0x005f->B:28:0x0073, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x0079  */
    /* JADX WARN: Code duplicated, block: B:34:0x0082 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:39:0x0076 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x0077 A[EDGE_INSN: B:40:0x0077->B:30:0x0077 BREAK  A[LOOP:0: B:23:0x005f->B:28:0x0073], SYNTHETIC] */
    /* JADX INFO: renamed from: ۦؑ */
    public final boolean m4371(AbstractC2797 abstractC2797, long j, boolean z) {
        Iterator it;
        int size;
        String strConcat;
        C2324 c2324 = abstractC2797.f9350;
        if (c2324 != this) {
            if (c2324 != null) {
                C1078.m2276("task is in multiple queues");
                return false;
            }
            abstractC2797.f9350 = this;
        }
        long jNanoTime = System.nanoTime();
        long j2 = jNanoTime + j;
        ArrayList arrayList = this.f7686;
        int iIndexOf = arrayList.indexOf(abstractC2797);
        if (iIndexOf == -1) {
            abstractC2797.f9353 = j2;
            if (C2680.f8891.isLoggable(Level.FINE)) {
                if (z) {
                    strConcat = "run again after ".concat(AbstractC3801.m6786(j2 - jNanoTime));
                } else {
                    strConcat = "scheduled after ".concat(AbstractC3801.m6786(j2 - jNanoTime));
                }
                AbstractC3801.m6744(abstractC2797, this, strConcat);
            }
            it = arrayList.iterator();
            size = 0;
            while (true) {
                if (it.hasNext()) {
                    size = -1;
                    break;
                }
                if (((AbstractC2797) it.next()).f9353 - jNanoTime > j) {
                    break;
                }
                size++;
            }
            if (size == -1) {
                size = arrayList.size();
            }
            arrayList.add(size, abstractC2797);
            if (size == 0) {
                return true;
            }
        } else if (abstractC2797.f9353 > j2) {
            arrayList.remove(iIndexOf);
            abstractC2797.f9353 = j2;
            if (C2680.f8891.isLoggable(Level.FINE)) {
                if (z) {
                    strConcat = "run again after ".concat(AbstractC3801.m6786(j2 - jNanoTime));
                } else {
                    strConcat = "scheduled after ".concat(AbstractC3801.m6786(j2 - jNanoTime));
                }
                AbstractC3801.m6744(abstractC2797, this, strConcat);
            }
            it = arrayList.iterator();
            size = 0;
            while (true) {
                if (it.hasNext()) {
                    size = -1;
                    break;
                }
                if (((AbstractC2797) it.next()).f9353 - jNanoTime > j) {
                    break;
                    break;
                }
                size++;
            }
            if (size == -1) {
                size = arrayList.size();
            }
            arrayList.add(size, abstractC2797);
            if (size == 0) {
                return true;
            }
        } else if (C2680.f8891.isLoggable(Level.FINE)) {
            AbstractC3801.m6744(abstractC2797, this, "already scheduled");
            return false;
        }
        return false;
    }
}
