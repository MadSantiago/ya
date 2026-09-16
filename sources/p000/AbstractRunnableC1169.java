package p000;

/* JADX INFO: renamed from: ۥّؕ۟ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractRunnableC1169 implements Runnable, Comparable, InterfaceC4883 {
    private volatile Object _heap;

    /* JADX INFO: renamed from: ۦ۟ */
    public int f4055 = -1;

    /* JADX INFO: renamed from: ۦۨ */
    public long f4056;

    public AbstractRunnableC1169(long j) {
        this.f4056 = j;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = this.f4056 - ((AbstractRunnableC1169) obj).f4056;
        if (j > 0) {
            return 1;
        }
        return j < 0 ? -1 : 0;
    }

    public String toString() {
        return "Delayed[nanos=" + this.f4056 + ']';
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final int m2492(long j, C4041 c4041, AbstractC5596 abstractC5596) {
        synchronized (this) {
            if (this._heap == AbstractC0487.f1777) {
                return 2;
            }
            synchronized (c4041) {
                try {
                    AbstractRunnableC1169[] abstractRunnableC1169Arr = c4041.f9584;
                    AbstractRunnableC1169 abstractRunnableC1169 = abstractRunnableC1169Arr != null ? abstractRunnableC1169Arr[0] : null;
                    int i = AbstractC5596.f18442;
                    if (AbstractC3456.f11473.getIntVolatile(abstractC5596, AbstractC5596.f18440) == 1) {
                        return 1;
                    }
                    if (abstractRunnableC1169 == null) {
                        c4041.f13480 = j;
                    } else {
                        long j2 = abstractRunnableC1169.f4056;
                        if (j2 - j < 0) {
                            j = j2;
                        }
                        long j3 = c4041.f13480;
                        if (j - j3 > 0) {
                            c4041.f13480 = j;
                        } else {
                            j = j3;
                        }
                    }
                    if (this.f4056 - j < 0) {
                        this.f4056 = j;
                    }
                    c4041.m5435(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // p000.InterfaceC4883
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo1376() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                C5536 c5536 = AbstractC0487.f1777;
                if (obj == c5536) {
                    return;
                }
                C4041 c4041 = obj instanceof C4041 ? (C4041) obj : null;
                if (c4041 != null) {
                    synchronized (c4041) {
                        Object obj2 = this._heap;
                        if ((obj2 instanceof AbstractC2868 ? (AbstractC2868) obj2 : null) != null) {
                            c4041.m5433(this.f4055);
                        }
                    }
                }
                this._heap = c5536;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final void m2493(C4041 c4041) {
        if (this._heap != AbstractC0487.f1777) {
            this._heap = c4041;
        } else {
            C1078.m2272("Failed requirement.");
        }
    }
}
