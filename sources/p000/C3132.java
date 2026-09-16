package p000;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import java.util.ArrayList;

/* JADX INFO: renamed from: ۦْؒؗٙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3132 extends AbstractC0821 {
    @Override // p000.AbstractC0821
    /* JADX INFO: renamed from: ۥۣ */
    public final Worker mo1718(Context context, String str, WorkerParameters workerParameters) {
        C1414 c1414 = C1397.f4778;
        Object objM4427 = null;
        if (c1414 == null) {
            C1078.m2276("KoinApplication has not been started");
            return null;
        }
        C4671 c4671 = new C4671(str);
        C2354 c2354 = (C2354) ((C1489) c1414.f4869).f5056;
        C3131 c3131M8557 = AbstractC5041.m8557(Worker.class);
        C3223 c3223 = (C3223) c2354.f7802.f4871;
        try {
            objM4427 = c2354.m4427(c3131M8557, c4671, new C0735(2, new ArrayList(new C4604(new Object[]{workerParameters}, false))));
        } catch (C1679 unused) {
            c3223.m5948("* No instance found for type '" + AbstractC2919.m5505(c3131M8557) + "' on scope '" + c2354 + '\'');
        }
        return (Worker) objM4427;
    }
}
