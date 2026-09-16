package p000;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: ۦّؒٛۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4010 extends AbstractC0821 {

    /* JADX INFO: renamed from: ۥۣ */
    public final CopyOnWriteArrayList f13372 = new CopyOnWriteArrayList();

    @Override // p000.AbstractC0821
    /* JADX INFO: renamed from: ۥۣ */
    public final Worker mo1718(Context context, String str, WorkerParameters workerParameters) {
        Iterator it = this.f13372.iterator();
        while (it.hasNext()) {
            try {
                Worker workerMo1718 = ((AbstractC0821) it.next()).mo1718(context, str, workerParameters);
                if (workerMo1718 != null) {
                    return workerMo1718;
                }
            } catch (Throwable th) {
                C1984.m3874().m3879(AbstractC1184.f4071, AbstractC5078.m8669(')', "Unable to instantiate a ListenableWorker (", str), th);
                throw th;
            }
        }
        return null;
    }
}
