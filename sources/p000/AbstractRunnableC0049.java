package p000;

import java.util.concurrent.ExecutionException;

/* JADX INFO: renamed from: ۥۧ */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractRunnableC0049 extends AbstractC5352 implements Runnable {

    /* JADX INFO: renamed from: ۥؖ */
    public static final /* synthetic */ int f9490 = 0;

    /* JADX INFO: renamed from: ۥٙ */
    public Object f9491;

    /* JADX INFO: renamed from: ۥۖ */
    public InterfaceFutureC4378 f9492;

    /* JADX INFO: renamed from: ۦٕ */
    public Class f9493;

    public AbstractRunnableC0049(InterfaceFutureC4378 interfaceFutureC4378, Class cls, Object obj) {
        this.f9492 = interfaceFutureC4378;
        this.f9493 = cls;
        this.f9491 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object objM4816;
        InterfaceFutureC4378 interfaceFutureC4378 = this.f9492;
        Class cls = this.f9493;
        Object obj = this.f9491;
        if (((obj == null) || ((interfaceFutureC4378 == null) | (cls == null))) || (this.f6339 instanceof C0043)) {
            return;
        }
        this.f9492 = null;
        try {
            th = interfaceFutureC4378 instanceof AbstractC0032 ? ((AbstractC0032) interfaceFutureC4378).m3768() : null;
            objM4816 = th == null ? AbstractC2552.m4816(interfaceFutureC4378) : null;
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause == null) {
                String strValueOf = String.valueOf(interfaceFutureC4378.getClass());
                String strValueOf2 = String.valueOf(e.getClass());
                StringBuilder sb = new StringBuilder(strValueOf2.length() + strValueOf.length() + 35);
                sb.append("Future type ");
                sb.append(strValueOf);
                sb.append(" threw ");
                sb.append(strValueOf2);
                sb.append(" without a cause");
                cause = new NullPointerException(sb.toString());
            }
            th = cause;
        } catch (Throwable th) {
            th = th;
        }
        if (th == null) {
            m3762(objM4816);
            return;
        }
        if (!cls.isInstance(th)) {
            m3766(interfaceFutureC4378);
            return;
        }
        try {
            Object objMo614 = mo614(obj, th);
            this.f9493 = null;
            this.f9491 = null;
            mo615(objMo614);
        } catch (Throwable th2) {
            try {
                m3763(th2);
            } finally {
                this.f9493 = null;
                this.f9491 = null;
            }
        }
    }

    @Override // p000.AbstractC0032
    /* JADX INFO: renamed from: ۥؗ */
    public final void mo2772() {
        InterfaceFutureC4378 interfaceFutureC4378 = this.f9492;
        if ((interfaceFutureC4378 != null) & (this.f6339 instanceof C0043)) {
            interfaceFutureC4378.cancel(m3767());
        }
        this.f9492 = null;
        this.f9493 = null;
        this.f9491 = null;
    }

    /* JADX INFO: renamed from: ۥْ */
    public abstract Object mo614(Object obj, Throwable th);

    /* JADX INFO: renamed from: ۥٓ */
    public abstract void mo615(Object obj);

    @Override // p000.AbstractC0032
    /* JADX INFO: renamed from: ۦِ */
    public final String mo2773() {
        String string;
        InterfaceFutureC4378 interfaceFutureC4378 = this.f9492;
        Class cls = this.f9493;
        Object obj = this.f9491;
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
        if (cls == null || obj == null) {
            if (strMo2773 != null) {
                return strMo2773.length() != 0 ? string.concat(strMo2773) : new String(string);
            }
            return null;
        }
        String strValueOf2 = String.valueOf(cls);
        String strValueOf3 = String.valueOf(obj);
        StringBuilder sb2 = new StringBuilder(strValueOf3.length() + strValueOf2.length() + string.length() + 29);
        sb2.append(string);
        sb2.append("exceptionType=[");
        sb2.append(strValueOf2);
        sb2.append("], fallback=[");
        return AbstractC3761.m6621(sb2, strValueOf3, "]");
    }
}
