package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import java.util.Collections;
import java.util.List;
import p000.C1811;
import p000.C1984;
import p000.C2621;
import p000.C3393;
import p000.C3600;

/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: ۥۣ */
    public static final String f272 = C1984.m3875("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        C1984 c1984M3874 = C1984.m3874();
        String str = f272;
        c1984M3874.m3878(str, "Requesting diagnostics");
        try {
            C3600 c3600M6413 = C3600.m6413(context);
            List listSingletonList = Collections.singletonList((C2621) new C3393(0, DiagnosticsWorker.class).m6151());
            if (listSingletonList.isEmpty()) {
                throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
            }
            new C1811(c3600M6413, null, 2, listSingletonList, 0).m3592();
        } catch (IllegalStateException e) {
            C1984.m3874().m3879(str, "WorkManager is not initialized", e);
        }
    }
}
