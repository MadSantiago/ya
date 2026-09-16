package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Logger;

/* JADX INFO: renamed from: ۥَّۤؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2680 {

    /* JADX INFO: renamed from: ۥۜ */
    public static final C2680 f8890 = new C2680(new C3121(new ThreadFactoryC1581(AbstractC3761.m6621(new StringBuilder(), AbstractC4031.f13453, " TaskRunner"), true)));

    /* JADX INFO: renamed from: ۦٛ */
    public static final Logger f8891 = Logger.getLogger(C2680.class.getName());

    /* JADX INFO: renamed from: ۥؗ */
    public boolean f8892;

    /* JADX INFO: renamed from: ۥۣ */
    public final C3121 f8896;

    /* JADX INFO: renamed from: ۦؑ */
    public long f8897;

    /* JADX INFO: renamed from: ۥۗ */
    public int f8895 = 10000;

    /* JADX INFO: renamed from: ۥُ */
    public final ArrayList f8893 = new ArrayList();

    /* JADX INFO: renamed from: ۥّ */
    public final ArrayList f8894 = new ArrayList();

    /* JADX INFO: renamed from: ۦۙ */
    public final RunnableC3365 f8898 = new RunnableC3365(11, this);

    public C2680(C3121 c3121) {
        this.f8896 = c3121;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final void m4985(C2324 c2324) {
        byte[] bArr = AbstractC4031.f13451;
        if (c2324.f7690 == null) {
            boolean zIsEmpty = c2324.f7686.isEmpty();
            ArrayList arrayList = this.f8894;
            if (zIsEmpty) {
                arrayList.remove(c2324);
            } else if (!arrayList.contains(c2324)) {
                arrayList.add(c2324);
            }
        }
        if (this.f8892) {
            notify();
        } else {
            ((ThreadPoolExecutor) this.f8896.f10451).execute(this.f8898);
        }
    }

    /* JADX INFO: renamed from: ۥُ */
    public final void m4986(AbstractC2797 abstractC2797) {
        byte[] bArr = AbstractC4031.f13451;
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(abstractC2797.f9352);
        try {
            long jMo583 = abstractC2797.mo583();
            synchronized (this) {
                m4988(abstractC2797, jMo583);
            }
        } finally {
            synchronized (this) {
                m4988(abstractC2797, -1L);
                threadCurrentThread.setName(name);
            }
        }
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final AbstractC2797 m4987() {
        boolean z;
        byte[] bArr = AbstractC4031.f13451;
        while (true) {
            ArrayList arrayList = this.f8894;
            if (arrayList.isEmpty()) {
                break;
            }
            long jNanoTime = System.nanoTime();
            Iterator it = arrayList.iterator();
            long jMin = Long.MAX_VALUE;
            AbstractC2797 abstractC2797 = null;
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                AbstractC2797 abstractC2798 = (AbstractC2797) ((C2324) it.next()).f7686.get(0);
                long jMax = Math.max(0L, abstractC2798.f9353 - jNanoTime);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (abstractC2797 != null) {
                        z = true;
                        break;
                    }
                    abstractC2797 = abstractC2798;
                }
            }
            ArrayList arrayList2 = this.f8893;
            if (abstractC2797 != null) {
                byte[] bArr2 = AbstractC4031.f13451;
                abstractC2797.f9353 = -1L;
                C2324 c2324 = abstractC2797.f9350;
                c2324.f7686.remove(abstractC2797);
                arrayList.remove(c2324);
                c2324.f7690 = abstractC2797;
                arrayList2.add(c2324);
                if (z || (!this.f8892 && !arrayList.isEmpty())) {
                    ((ThreadPoolExecutor) this.f8896.f10451).execute(this.f8898);
                }
                return abstractC2797;
            }
            if (this.f8892) {
                if (jMin >= this.f8897 - jNanoTime) {
                    break;
                }
                notify();
                break;
            }
            this.f8892 = true;
            this.f8897 = jNanoTime + jMin;
            try {
                try {
                    long j = jMin / 1000000;
                    long j2 = jMin - (1000000 * j);
                    if (j > 0 || jMin > 0) {
                        wait(j, (int) j2);
                    }
                } catch (InterruptedException unused) {
                    for (int size = arrayList2.size() - 1; -1 < size; size--) {
                        ((C2324) arrayList2.get(size)).m4369();
                    }
                    for (int size2 = arrayList.size() - 1; -1 < size2; size2--) {
                        C2324 c2325 = (C2324) arrayList.get(size2);
                        c2325.m4369();
                        if (c2325.f7686.isEmpty()) {
                            arrayList.remove(size2);
                        }
                    }
                }
                this.f8892 = false;
            } catch (Throwable th) {
                this.f8892 = false;
                throw th;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m4988(AbstractC2797 abstractC2797, long j) {
        byte[] bArr = AbstractC4031.f13451;
        C2324 c2324 = abstractC2797.f9350;
        if (c2324.f7690 != abstractC2797) {
            C1078.m2276("Check failed.");
            return;
        }
        boolean z = c2324.f7687;
        c2324.f7687 = false;
        c2324.f7690 = null;
        this.f8893.remove(c2324);
        if (j != -1 && !z && !c2324.f7685) {
            c2324.m4371(abstractC2797, j, true);
        }
        if (c2324.f7686.isEmpty()) {
            return;
        }
        this.f8894.add(c2324);
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final C2324 m4989() {
        int i;
        synchronized (this) {
            i = this.f8895;
            this.f8895 = i + 1;
        }
        return new C2324(this, AbstractC5078.m8670(i, "Q"));
    }
}
