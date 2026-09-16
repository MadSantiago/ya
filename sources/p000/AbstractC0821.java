package p000;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

/* JADX INFO: renamed from: ۥًٕؒٔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0821 {
    /* JADX INFO: renamed from: ۥۗ */
    public final Worker m1717(Context context, String str, WorkerParameters workerParameters) {
        Worker workerMo1718 = mo1718(context, str, workerParameters);
        if (workerMo1718 == null) {
            try {
                try {
                    workerMo1718 = (Worker) Class.forName(str).asSubclass(Worker.class).getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
                } catch (Throwable th) {
                    C1984.m3874().m3879(AbstractC4572.f15080, "Could not instantiate ".concat(str), th);
                    throw th;
                }
            } catch (Throwable th2) {
                C1984.m3874().m3879(AbstractC4572.f15080, "Invalid class: ".concat(str), th2);
                throw th2;
            }
        }
        if (!workerMo1718.f246) {
            return workerMo1718;
        }
        throw new IllegalStateException("WorkerFactory (" + getClass().getName() + ") returned an instance of a ListenableWorker (" + str + ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.");
    }

    /* JADX INFO: renamed from: ۥۣ */
    public abstract Worker mo1718(Context context, String str, WorkerParameters workerParameters);
}
