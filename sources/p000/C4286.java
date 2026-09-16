package p000;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: ۦٌؚٖؓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4286 implements InterfaceFutureC4378 {

    /* JADX INFO: renamed from: ۦۨ */
    public final Object f14175;

    /* JADX INFO: renamed from: ۦ۟ */
    public static final C4286 f14174 = new C4286(null);

    /* JADX INFO: renamed from: ۥْ */
    public static final Logger f14173 = Logger.getLogger(C4286.class.getName());

    public C4286(Object obj) {
        this.f14175 = obj;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.f14175;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        String string = super.toString();
        String strValueOf = String.valueOf(this.f14175);
        StringBuilder sb = new StringBuilder(strValueOf.length() + String.valueOf(string).length() + 27);
        sb.append(string);
        sb.append("[status=SUCCESS, result=[");
        sb.append(strValueOf);
        sb.append("]]");
        return sb.toString();
    }

    @Override // p000.InterfaceFutureC4378
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo3760(Runnable runnable, Executor executor) {
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
            f14173.log(level, sb.toString(), (Throwable) e);
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f14175;
    }
}
