package p000;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: ۥٔ */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractRunnableC0022 extends AbstractC5352 implements Runnable {

    /* JADX INFO: renamed from: ۥٙ */
    public static final /* synthetic */ int f4488 = 0;

    /* JADX INFO: renamed from: ۥۖ */
    public InterfaceFutureC4378 f4489;

    /* JADX INFO: renamed from: ۦٕ */
    public Object f4490;

    public AbstractRunnableC0022(InterfaceFutureC4378 interfaceFutureC4378, Object obj) {
        interfaceFutureC4378.getClass();
        this.f4489 = interfaceFutureC4378;
        this.f4490 = obj;
    }

    /* JADX INFO: renamed from: ۥْ */
    public static C0010 m2771(InterfaceFutureC4378 interfaceFutureC4378, InterfaceC5296 interfaceC5296, Executor executor) {
        executor.getClass();
        C0010 c0010 = new C0010(interfaceFutureC4378, interfaceC5296);
        interfaceFutureC4378.mo3760(c0010, AbstractC0993.m2137(executor, c0010));
        return c0010;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceFutureC4378 interfaceFutureC4378 = this.f4489;
        Object obj = this.f4490;
        if (((this.f6339 instanceof C0043) | (interfaceFutureC4378 == null)) || (obj == null)) {
            return;
        }
        this.f4489 = null;
        if (interfaceFutureC4378.isCancelled()) {
            m3766(interfaceFutureC4378);
            return;
        }
        try {
            try {
                Object objMo1459 = mo1459(obj, AbstractC2552.m4816(interfaceFutureC4378));
                this.f4490 = null;
                mo1458(objMo1459);
            } catch (Throwable th) {
                try {
                    m3763(th);
                } finally {
                    this.f4490 = null;
                }
            }
        } catch (Error e) {
            m3763(e);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (RuntimeException e2) {
            m3763(e2);
        } catch (ExecutionException e3) {
            m3763(e3.getCause());
        }
    }

    @Override // p000.AbstractC0032
    /* JADX INFO: renamed from: ۥؗ */
    public final void mo2772() {
        InterfaceFutureC4378 interfaceFutureC4378 = this.f4489;
        if ((interfaceFutureC4378 != null) & (this.f6339 instanceof C0043)) {
            interfaceFutureC4378.cancel(m3767());
        }
        this.f4489 = null;
        this.f4490 = null;
    }

    /* JADX INFO: renamed from: ۥَ */
    public abstract void mo1458(Object obj);

    /* JADX INFO: renamed from: ۥٓ */
    public abstract Object mo1459(Object obj, Object obj2);

    @Override // p000.AbstractC0032
    /* JADX INFO: renamed from: ۦِ */
    public final String mo2773() {
        String string;
        InterfaceFutureC4378 interfaceFutureC4378 = this.f4489;
        Object obj = this.f4490;
        String strMo2773 = super.mo2773();
        if (interfaceFutureC4378 != null) {
            String strValueOf = String.valueOf(interfaceFutureC4378);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 16);
            sb.append("inputFuture=[");
            sb.append(strValueOf);
            sb.append("], ");
            string = sb.toString();
        } else {
            string = "";
        }
        if (obj == null) {
            if (strMo2773 != null) {
                return strMo2773.length() != 0 ? string.concat(strMo2773) : new String(string);
            }
            return null;
        }
        String strValueOf2 = String.valueOf(obj);
        StringBuilder sb2 = new StringBuilder(strValueOf2.length() + string.length() + 11);
        sb2.append(string);
        sb2.append("function=[");
        sb2.append(strValueOf2);
        sb2.append("]");
        return sb2.toString();
    }
}
