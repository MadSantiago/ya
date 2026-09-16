package p000;

import java.util.Locale;
import java.util.Objects;
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

/* JADX INFO: renamed from: ۥٞ */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0032 implements InterfaceFutureC4378 {

    /* JADX INFO: renamed from: ۥَ */
    public static final Logger f6333;

    /* JADX INFO: renamed from: ۥٓ */
    public static final boolean f6334;

    /* JADX INFO: renamed from: ۥٖ */
    public static final AbstractC5537 f6335;

    /* JADX INFO: renamed from: ۦٗ */
    public static final Object f6336;

    /* JADX INFO: renamed from: ۥْ */
    public volatile C0083 f6337;

    /* JADX INFO: renamed from: ۦ۟ */
    public volatile C0050 f6338;

    /* JADX INFO: renamed from: ۦۨ */
    public volatile Object f6339;

    static {
        boolean z;
        Throwable th;
        AbstractC5537 c0036;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        f6334 = z;
        f6333 = Logger.getLogger(AbstractC0032.class.getName());
        Throwable th2 = null;
        try {
            c0036 = new C0082();
            th = null;
        } catch (Throwable th3) {
            th = th3;
            try {
                c0036 = new C0093(AtomicReferenceFieldUpdater.newUpdater(C0083.class, Thread.class, "ۥۣ"), AtomicReferenceFieldUpdater.newUpdater(C0083.class, C0083.class, "ۥۗ"), AtomicReferenceFieldUpdater.newUpdater(AbstractC0032.class, C0083.class, "ۥْ"), AtomicReferenceFieldUpdater.newUpdater(AbstractC0032.class, C0050.class, "ۦ۟"), AtomicReferenceFieldUpdater.newUpdater(AbstractC0032.class, Object.class, "ۦۨ"));
            } catch (Throwable th4) {
                th2 = th4;
                c0036 = new C0036();
            }
        }
        f6335 = c0036;
        if (th2 != null) {
            Logger logger = f6333;
            Level level = Level.SEVERE;
            logger.log(level, "UnsafeAtomicHelper is broken!", th);
            logger.log(level, "SafeAtomicHelper is broken!", th2);
        }
        f6336 = new Object();
    }

    /* JADX INFO: renamed from: ۥُ */
    public static void m3755(AbstractC0032 abstractC0032) {
        C0050 c0050 = null;
        while (true) {
            for (C0083 c0083Mo4164 = f6335.mo4164(abstractC0032); c0083Mo4164 != null; c0083Mo4164 = c0083Mo4164.f15753) {
                Thread thread = c0083Mo4164.f15754;
                if (thread != null) {
                    c0083Mo4164.f15754 = null;
                    LockSupport.unpark(thread);
                }
            }
            abstractC0032.mo2772();
            C0050 c0051 = c0050;
            C0050 c0050Mo4166 = f6335.mo4166(abstractC0032);
            C0050 c0052 = c0051;
            while (c0050Mo4166 != null) {
                C0050 c0053 = c0050Mo4166.f9657;
                c0050Mo4166.f9657 = c0052;
                c0052 = c0050Mo4166;
                c0050Mo4166 = c0053;
            }
            while (c0052 != null) {
                c0050 = c0052.f9657;
                Runnable runnable = c0052.f9659;
                Objects.requireNonNull(runnable);
                if (runnable instanceof RunnableC0018) {
                    RunnableC0018 runnableC0018 = (RunnableC0018) runnable;
                    abstractC0032 = runnableC0018.f3770;
                    if (abstractC0032.f6339 == runnableC0018) {
                        if (f6335.mo4167(abstractC0032, runnableC0018, m3757(runnableC0018.f3769))) {
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = c0052.f9658;
                    Objects.requireNonNull(executor);
                    m3756(runnable, executor);
                }
                c0052 = c0050;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۥّ */
    public static void m3756(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Level level = Level.SEVERE;
            String strValueOf = String.valueOf(runnable);
            String strValueOf2 = String.valueOf(executor);
            StringBuilder sb = new StringBuilder(strValueOf2.length() + strValueOf.length() + 57);
            sb.append("RuntimeException while executing runnable ");
            sb.append(strValueOf);
            sb.append(" with executor ");
            sb.append(strValueOf2);
            f6333.log(level, sb.toString(), (Throwable) e);
        }
    }

    /* JADX INFO: renamed from: ۥۜ */
    public static Object m3757(InterfaceFutureC4378 interfaceFutureC4378) {
        Object obj;
        Throwable thM3768;
        if (interfaceFutureC4378 instanceof InterfaceC0056) {
            Object c0043 = ((AbstractC0032) interfaceFutureC4378).f6339;
            if (c0043 instanceof C0043) {
                C0043 c0044 = (C0043) c0043;
                if (c0044.f8391) {
                    c0043 = c0044.f8390 != null ? new C0043(c0044.f8390, false) : C0043.f8389;
                }
            }
            Objects.requireNonNull(c0043);
            return c0043;
        }
        if ((interfaceFutureC4378 instanceof AbstractC0032) && (thM3768 = ((AbstractC0032) interfaceFutureC4378).m3768()) != null) {
            return new C0047(thM3768);
        }
        boolean zIsCancelled = interfaceFutureC4378.isCancelled();
        boolean z = true;
        if ((!f6334) && zIsCancelled) {
            C0043 c0045 = C0043.f8389;
            Objects.requireNonNull(c0045);
            return c0045;
        }
        boolean z2 = false;
        while (true) {
            try {
                try {
                    obj = interfaceFutureC4378.get();
                    break;
                } catch (CancellationException e) {
                    if (zIsCancelled) {
                        return new C0043(e, false);
                    }
                    String strValueOf = String.valueOf(interfaceFutureC4378);
                    StringBuilder sb = new StringBuilder(strValueOf.length() + 77);
                    sb.append("get() threw CancellationException, despite reporting isCancelled() == false: ");
                    sb.append(strValueOf);
                    return new C0047(new IllegalArgumentException(sb.toString(), e));
                } catch (ExecutionException e2) {
                    if (!zIsCancelled) {
                        return new C0047(e2.getCause());
                    }
                    String strValueOf2 = String.valueOf(interfaceFutureC4378);
                    StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 84);
                    sb2.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
                    sb2.append(strValueOf2);
                    return new C0043(new IllegalArgumentException(sb2.toString(), e2), false);
                } catch (Throwable th) {
                    return new C0047(th);
                }
            } catch (InterruptedException unused) {
                z2 = z;
            } catch (Throwable th2) {
                if (z2) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        if (!zIsCancelled) {
            return obj == null ? f6336 : obj;
        }
        String strValueOf3 = String.valueOf(interfaceFutureC4378);
        StringBuilder sb3 = new StringBuilder(strValueOf3.length() + 84);
        sb3.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
        sb3.append(strValueOf3);
        return new C0043(new IllegalArgumentException(sb3.toString()), false);
    }

    /* JADX INFO: renamed from: ۦۙ */
    public static Object m3758(Object obj) throws ExecutionException {
        if (obj instanceof C0043) {
            Throwable th = ((C0043) obj).f8390;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof C0047) {
            throw new ExecutionException(((C0047) obj).f8978);
        }
        if (obj == f6336) {
            return null;
        }
        return obj;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        C0043 c0043;
        Object obj = this.f6339;
        if (!(obj == null) && !(obj instanceof RunnableC0018)) {
            return false;
        }
        if (f6334) {
            c0043 = new C0043(new CancellationException("Future.cancel() was called."), z);
        } else {
            c0043 = z ? C0043.f8388 : C0043.f8389;
            Objects.requireNonNull(c0043);
        }
        boolean z2 = false;
        while (true) {
            if (f6335.mo4167(this, obj, c0043)) {
                m3755(this);
                if (obj instanceof RunnableC0018) {
                    InterfaceFutureC4378 interfaceFutureC4378 = ((RunnableC0018) obj).f3769;
                    if (interfaceFutureC4378 instanceof InterfaceC0056) {
                        this = (AbstractC0032) interfaceFutureC4378;
                        obj = this.f6339;
                        if ((obj == null) | (obj instanceof RunnableC0018)) {
                            z2 = true;
                        }
                    } else {
                        interfaceFutureC4378.cancel(z);
                    }
                }
                return true;
            }
            obj = this.f6339;
            if (!(obj instanceof RunnableC0018)) {
                return z2;
            }
        }
    }

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        boolean z;
        long j2;
        C0083 c0083 = C0083.f15752;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f6339;
        if ((obj != null) && (!(obj instanceof RunnableC0018))) {
            return m3758(obj);
        }
        long j3 = 0;
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            C0083 c0084 = this.f6337;
            if (c0084 != c0083) {
                C0083 c0085 = new C0083();
                z = true;
                while (true) {
                    AbstractC5537 abstractC5537 = f6335;
                    abstractC5537.mo4163(c0085, c0084);
                    if (abstractC5537.mo4168(this, c0084, c0085)) {
                        j2 = j3;
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                m3765(c0085);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f6339;
                            if ((obj2 != null) && (!(obj2 instanceof RunnableC0018))) {
                                return m3758(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        m3765(c0085);
                        break;
                    }
                    long j4 = j3;
                    c0084 = this.f6337;
                    if (c0084 != c0083) {
                        j3 = j4;
                    }
                }
            }
            Object obj3 = this.f6339;
            Objects.requireNonNull(obj3);
            return m3758(obj3);
        }
        z = true;
        j2 = 0;
        while (nanos > j2) {
            Object obj4 = this.f6339;
            if ((obj4 != null ? z : false) && (!(obj4 instanceof RunnableC0018))) {
                return m3758(obj4);
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
        String lowerCase2 = timeUnit.toString().toLowerCase(locale);
        StringBuilder sb = new StringBuilder(String.valueOf(lowerCase2).length() + 28);
        sb.append("Waited ");
        sb.append(j);
        sb.append(" ");
        sb.append(lowerCase2);
        String string3 = sb.toString();
        if (nanos + 1000 < j2) {
            String strConcat = string3.concat(" (plus ");
            long j5 = -nanos;
            long jConvert = timeUnit.convert(j5, TimeUnit.NANOSECONDS);
            long nanos2 = j5 - timeUnit.toNanos(jConvert);
            boolean z2 = (jConvert == j2 || nanos2 > 1000) ? z : false;
            if (jConvert > j2) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(lowerCase).length() + strConcat.length() + 21);
                sb2.append(strConcat);
                sb2.append(jConvert);
                sb2.append(" ");
                sb2.append(lowerCase);
                String string4 = sb2.toString();
                if (z2) {
                    string4 = string4.concat(",");
                }
                strConcat = string4.concat(" ");
            }
            if (z2) {
                StringBuilder sb3 = new StringBuilder(strConcat.length() + 33);
                sb3.append(strConcat);
                sb3.append(nanos2);
                sb3.append(" nanoseconds ");
                strConcat = sb3.toString();
            }
            string3 = strConcat.concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(string3.concat(" but future completed as timeout expired"));
        }
        StringBuilder sb4 = new StringBuilder(String.valueOf(string).length() + string3.length() + 5);
        sb4.append(string3);
        sb4.append(" for ");
        sb4.append(string);
        throw new TimeoutException(sb4.toString());
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f6339 instanceof C0043;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        Object obj = this.f6339;
        return (!(obj instanceof RunnableC0018)) & (obj != null);
    }

    public String toString() {
        String string;
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            m3759(sb);
        } else {
            int length = sb.length();
            sb.append("PENDING");
            Object obj = this.f6339;
            if (obj instanceof RunnableC0018) {
                sb.append(", setFuture=[");
                InterfaceFutureC4378 interfaceFutureC4378 = ((RunnableC0018) obj).f3769;
                try {
                    if (interfaceFutureC4378 == this) {
                        sb.append("this future");
                    } else {
                        sb.append(interfaceFutureC4378);
                    }
                } catch (RuntimeException e) {
                    e = e;
                    sb.append("Exception thrown from implementation: ");
                    sb.append(e.getClass());
                } catch (StackOverflowError e2) {
                    e = e2;
                    sb.append("Exception thrown from implementation: ");
                    sb.append(e.getClass());
                }
                sb.append("]");
            } else {
                try {
                    string = mo2773();
                    int i = AbstractC4239.f14045;
                    if (string == null || string.isEmpty()) {
                        string = null;
                    }
                } catch (RuntimeException | StackOverflowError e3) {
                    String strValueOf = String.valueOf(e3.getClass());
                    StringBuilder sb2 = new StringBuilder(strValueOf.length() + 38);
                    sb2.append("Exception thrown from implementation: ");
                    sb2.append(strValueOf);
                    string = sb2.toString();
                }
                if (string != null) {
                    sb.append(", info=[");
                    sb.append(string);
                    sb.append("]");
                }
            }
            if (isDone()) {
                sb.delete(length, sb.length());
                m3759(sb);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final void m3759(StringBuilder sb) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                try {
                    obj = get();
                    break;
                } catch (CancellationException unused) {
                    sb.append("CANCELLED");
                    return;
                } catch (RuntimeException e) {
                    sb.append("UNKNOWN, cause=[");
                    sb.append(e.getClass());
                    sb.append(" thrown from get()]");
                    return;
                } catch (ExecutionException e2) {
                    sb.append("FAILURE, cause=[");
                    sb.append(e2.getCause());
                    sb.append("]");
                    return;
                }
            } catch (InterruptedException unused2) {
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
        sb.append("SUCCESS, result=[");
        m3761(sb, obj);
        sb.append("]");
    }

    @Override // p000.InterfaceFutureC4378
    /* JADX INFO: renamed from: ۥۣ */
    public void mo3760(Runnable runnable, Executor executor) {
        C0050 c0050;
        C0050 c0051 = C0050.f9656;
        AbstractC0949.m1953(executor, "Executor was null.");
        if (!isDone() && (c0050 = this.f6338) != c0051) {
            C0050 c0052 = new C0050(runnable, executor);
            do {
                c0052.f9657 = c0050;
                if (f6335.mo4169(this, c0050, c0052)) {
                    return;
                } else {
                    c0050 = this.f6338;
                }
            } while (c0050 != c0051);
        }
        m3756(runnable, executor);
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final void m3761(StringBuilder sb, Object obj) {
        if (obj == null) {
            sb.append("null");
        } else {
            if (obj == this) {
                sb.append("this future");
                return;
            }
            sb.append(obj.getClass().getName());
            sb.append("@");
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }

    /* JADX INFO: renamed from: ۦؚ */
    public boolean m3762(Object obj) {
        if (obj == null) {
            obj = f6336;
        }
        if (!f6335.mo4167(this, null, obj)) {
            return false;
        }
        m3755(this);
        return true;
    }

    /* JADX INFO: renamed from: ۦٌ */
    public boolean m3763(Throwable th) {
        th.getClass();
        if (!f6335.mo4167(this, null, new C0047(th))) {
            return false;
        }
        m3755(this);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۦِ */
    public String mo2773() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        long delay = ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS);
        StringBuilder sb = new StringBuilder(41);
        sb.append("remaining delay=[");
        sb.append(delay);
        sb.append(" ms]");
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۦۗ */
    public final void m3765(C0083 c0083) {
        c0083.f15754 = null;
        while (true) {
            C0083 c0084 = this.f6337;
            if (c0084 == C0083.f15752) {
                return;
            }
            C0083 c0085 = null;
            while (c0084 != null) {
                C0083 c0086 = c0084.f15753;
                if (c0084.f15754 != null) {
                    c0085 = c0084;
                } else if (c0085 != null) {
                    c0085.f15753 = c0086;
                    if (c0085.f15754 == null) {
                    }
                } else if (!f6335.mo4168(this, c0084, c0086)) {
                }
                c0084 = c0086;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0048  */
    /* JADX INFO: renamed from: ۦۚ */
    public boolean m3766(InterfaceFutureC4378 interfaceFutureC4378) {
        C0047 c0047;
        interfaceFutureC4378.getClass();
        Object obj = this.f6339;
        if (obj != null) {
            if (obj instanceof C0043) {
                interfaceFutureC4378.cancel(((C0043) obj).f8391);
            }
        } else if (interfaceFutureC4378.isDone()) {
            if (f6335.mo4167(this, null, m3757(interfaceFutureC4378))) {
                m3755(this);
                return true;
            }
        } else {
            RunnableC0018 runnableC0018 = new RunnableC0018(this, interfaceFutureC4378);
            if (f6335.mo4167(this, null, runnableC0018)) {
                try {
                    interfaceFutureC4378.mo3760(runnableC0018, EnumC0486.f1767);
                    return true;
                } catch (Throwable th) {
                    try {
                        c0047 = new C0047(th);
                    } catch (Throwable unused) {
                        c0047 = C0047.f8977;
                    }
                    f6335.mo4167(this, runnableC0018, c0047);
                    return true;
                }
            }
            obj = this.f6339;
            if (obj instanceof C0043) {
                interfaceFutureC4378.cancel(((C0043) obj).f8391);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦ۟ */
    public final boolean m3767() {
        Object obj = this.f6339;
        return (obj instanceof C0043) && ((C0043) obj).f8391;
    }

    /* JADX INFO: renamed from: ۦۨ */
    public final Throwable m3768() {
        if (!(this instanceof InterfaceC0056)) {
            return null;
        }
        Object obj = this.f6339;
        if (obj instanceof C0047) {
            return ((C0047) obj).f8978;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public void mo2772() {
    }

    /* JADX INFO: renamed from: ۦٛ */
    public void m3764() {
    }

    @Override // java.util.concurrent.Future
    public Object get() throws InterruptedException {
        Object obj;
        C0083 c0083 = C0083.f15752;
        if (!Thread.interrupted()) {
            Object obj2 = this.f6339;
            if ((obj2 != null) & (!(obj2 instanceof RunnableC0018))) {
                return m3758(obj2);
            }
            C0083 c0084 = this.f6337;
            if (c0084 != c0083) {
                C0083 c0085 = new C0083();
                do {
                    AbstractC5537 abstractC5537 = f6335;
                    abstractC5537.mo4163(c0085, c0084);
                    if (abstractC5537.mo4168(this, c0084, c0085)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f6339;
                            } else {
                                m3765(c0085);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof RunnableC0018))));
                        return m3758(obj);
                    }
                    c0084 = this.f6337;
                } while (c0084 != c0083);
            }
            Object obj3 = this.f6339;
            Objects.requireNonNull(obj3);
            return m3758(obj3);
        }
        throw new InterruptedException();
    }
}
