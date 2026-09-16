package p000;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: ۥُؑؑۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC0170 implements Executor {

    /* JADX INFO: renamed from: ۦ۟ */
    public final Object f630;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f631;

    public ExecutorC0170() {
        this.f631 = 4;
        HandlerC0645 handlerC0645 = new HandlerC0645(Looper.getMainLooper());
        Looper.getMainLooper();
        this.f630 = handlerC0645;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.f631;
        Object obj = this.f630;
        switch (i) {
            case 0:
                ((HandlerC0645) obj).post(runnable);
                break;
            case 1:
                ((Executor) obj).execute(new RunnableC3497(runnable, 0));
                break;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                ((Handler) ((C1489) obj).f5058).post(runnable);
                break;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                C3644 c3644 = ((C5371) ((C5235) obj).f18660).f17733;
                C5371.m9020(c3644);
                c3644.m6515(runnable);
                break;
            default:
                ((HandlerC0645) obj).post(runnable);
                break;
        }
    }

    public /* synthetic */ ExecutorC0170(int i, Object obj) {
        this.f631 = i;
        this.f630 = obj;
    }

    public ExecutorC0170(Looper looper) {
        this.f631 = 0;
        this.f630 = new HandlerC0645(looper, 3);
    }
}
