package p000;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: ۦٍ */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0065 implements InterfaceFutureC4378 {

    /* JADX INFO: renamed from: ۥٖ */
    public static final AbstractC2776 f12491;

    /* JADX INFO: renamed from: ۦٗ */
    public static final Object f12492;

    /* JADX INFO: renamed from: ۥْ */
    public volatile C0060 f12493;

    /* JADX INFO: renamed from: ۦ۟ */
    public volatile C0085 f12494;

    /* JADX INFO: renamed from: ۦۨ */
    public volatile Object f12495;

    /* JADX INFO: renamed from: ۥٓ */
    public static final boolean f12490 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: ۥَ */
    public static final Logger f12489 = Logger.getLogger(AbstractC0065.class.getName());

    static {
        AbstractC2776 c0039;
        try {
            c0039 = new C0070(AtomicReferenceFieldUpdater.newUpdater(C0060.class, Thread.class, "ۥۣ"), AtomicReferenceFieldUpdater.newUpdater(C0060.class, C0060.class, "ۥۗ"), AtomicReferenceFieldUpdater.newUpdater(AbstractC0065.class, C0060.class, "ۥْ"), AtomicReferenceFieldUpdater.newUpdater(AbstractC0065.class, C0085.class, "ۦ۟"), AtomicReferenceFieldUpdater.newUpdater(AbstractC0065.class, Object.class, "ۦۨ"));
            th = null;
        } catch (Throwable th) {
            th = th;
            c0039 = new C0039();
        }
        f12491 = c0039;
        if (th != null) {
            f12489.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f12492 = new Object();
    }

    /* JADX INFO: renamed from: ۥُ */
    public static void m6596(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            f12489.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    /* JADX INFO: renamed from: ۥّ */
    public static Object m6597(Object obj) throws ExecutionException {
        if (obj instanceof C0052) {
            Throwable th = ((C0052) obj).f9916;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof C0042) {
            throw new ExecutionException(((C0042) obj).f8259);
        }
        if (obj == f12492) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: renamed from: ۦؑ */
    public static void m6598(AbstractC0065 abstractC0065) {
        C0060 c0060;
        C0085 c0085;
        C0085 c0086;
        C0085 c0087;
        do {
            c0060 = abstractC0065.f12493;
        } while (!f12491.mo4354(abstractC0065, c0060, C0060.f11481));
        while (true) {
            c0085 = null;
            if (c0060 == null) {
                break;
            }
            Thread thread = c0060.f11483;
            if (thread != null) {
                c0060.f11483 = null;
                LockSupport.unpark(thread);
            }
            c0060 = c0060.f11482;
        }
        abstractC0065.mo6261();
        do {
            c0086 = abstractC0065.f12494;
        } while (!f12491.mo4351(abstractC0065, c0086, C0085.f16062));
        while (true) {
            c0087 = c0085;
            c0085 = c0086;
            if (c0085 == null) {
                break;
            }
            c0086 = c0085.f16063;
            c0085.f16063 = c0087;
        }
        while (c0087 != null) {
            C0085 c0088 = c0087.f16063;
            m6596(c0087.f16065, c0087.f16064);
            c0087 = c0088;
        }
    }

    /* JADX INFO: renamed from: ۦۙ */
    public static Object m6599(InterfaceFutureC4378 interfaceFutureC4378) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = interfaceFutureC4378.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        C0052 c0052;
        Object obj = this.f12495;
        if (obj == null) {
            if (f12490) {
                c0052 = new C0052(new CancellationException("Future.cancel() was called."), z);
            } else {
                c0052 = z ? C0052.f9914 : C0052.f9915;
            }
            if (f12491.mo4352(this, obj, c0052)) {
                m6598(this);
                return true;
            }
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        C0060 c0060 = C0060.f11481;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f12495;
        if (obj != null) {
            return m6597(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            C0060 c0061 = this.f12493;
            if (c0061 != c0060) {
                C0060 c0062 = new C0060();
                while (true) {
                    AbstractC2776 abstractC2776 = f12491;
                    abstractC2776.mo4353(c0062, c0061);
                    if (abstractC2776.mo4354(this, c0061, c0062)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                m6603(c0062);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f12495;
                            if (obj2 != null) {
                                return m6597(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        m6603(c0062);
                        break;
                    }
                    c0061 = this.f12493;
                    if (c0061 == c0060) {
                    }
                }
            }
            return m6597(this.f12495);
        }
        while (nanos > 0) {
            Object obj3 = this.f12495;
            if (obj3 != null) {
                return m6597(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        String strConcat = "Waited " + j + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String strConcat2 = strConcat.concat(" (plus ");
            long j2 = -nanos;
            long jConvert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(jConvert);
            boolean z = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String strConcat3 = strConcat2 + jConvert + " " + lowerCase;
                if (z) {
                    strConcat3 = strConcat3.concat(",");
                }
                strConcat2 = strConcat3.concat(" ");
            }
            if (z) {
                strConcat2 = strConcat2 + nanos2 + " nanoseconds ";
            }
            strConcat = strConcat2.concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(strConcat.concat(" but future completed as timeout expired"));
        }
        throw new TimeoutException(AbstractC3761.m6629(strConcat, " for ", string));
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f12495 instanceof C0052;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f12495 != null;
    }

    public final String toString() {
        String strMo6601;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f12495 instanceof C0052) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            m6600(sb);
        } else {
            try {
                strMo6601 = mo6601();
            } catch (RuntimeException e) {
                strMo6601 = "Exception thrown from implementation: " + e.getClass();
            }
            if (strMo6601 != null && !strMo6601.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(strMo6601);
                sb.append("]");
            } else if (isDone()) {
                m6600(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final void m6600(StringBuilder sb) {
        try {
            Object objM6599 = m6599(this);
            sb.append("SUCCESS, result=[");
            sb.append(objM6599 == this ? "this future" : String.valueOf(objM6599));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append("]");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۥۜ */
    public String mo6601() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    @Override // p000.InterfaceFutureC4378
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo3760(Runnable runnable, Executor executor) {
        executor.getClass();
        C0085 c0085 = this.f12494;
        C0085 c0086 = C0085.f16062;
        if (c0085 != c0086) {
            C0085 c0087 = new C0085(runnable, executor);
            do {
                c0087.f16063 = c0085;
                if (f12491.mo4351(this, c0085, c0087)) {
                    return;
                } else {
                    c0085 = this.f12494;
                }
            } while (c0085 != c0086);
        }
        m6596(runnable, executor);
    }

    /* JADX INFO: renamed from: ۦِ */
    public boolean m6602(Object obj) {
        if (obj == null) {
            obj = f12492;
        }
        if (!f12491.mo4352(this, null, obj)) {
            return false;
        }
        m6598(this);
        return true;
    }

    /* JADX INFO: renamed from: ۦٛ */
    public final void m6603(C0060 c0060) {
        c0060.f11483 = null;
        while (true) {
            C0060 c0061 = this.f12493;
            if (c0061 == C0060.f11481) {
                return;
            }
            C0060 c0062 = null;
            while (c0061 != null) {
                C0060 c0063 = c0061.f11482;
                if (c0061.f11483 != null) {
                    c0062 = c0061;
                } else if (c0062 != null) {
                    c0062.f11482 = c0063;
                    if (c0062.f11483 == null) {
                    }
                } else if (!f12491.mo4354(this, c0061, c0063)) {
                }
                c0061 = c0063;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۦۗ */
    public boolean mo1898(Throwable th) {
        if (!f12491.mo4352(this, null, new C0042(th))) {
            return false;
        }
        m6598(this);
        return true;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public void mo6261() {
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        C0060 c0060 = C0060.f11481;
        if (!Thread.interrupted()) {
            Object obj2 = this.f12495;
            if (obj2 != null) {
                return m6597(obj2);
            }
            C0060 c0061 = this.f12493;
            if (c0061 != c0060) {
                C0060 c0062 = new C0060();
                do {
                    AbstractC2776 abstractC2776 = f12491;
                    abstractC2776.mo4353(c0062, c0061);
                    if (abstractC2776.mo4354(this, c0061, c0062)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f12495;
                            } else {
                                m6603(c0062);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return m6597(obj);
                    }
                    c0061 = this.f12493;
                } while (c0061 != c0060);
            }
            return m6597(this.f12495);
        }
        throw new InterruptedException();
    }
}
