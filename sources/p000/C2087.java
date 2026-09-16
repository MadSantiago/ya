package p000;

import android.content.ServiceConnection;
import android.util.Pair;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: ۥۖٝۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2087 extends Pair {
    /* JADX INFO: renamed from: ۥۣ */
    public final void m4027(ServiceConnection serviceConnection) {
        ((Executor) ((Pair) this).second).execute(new RunnableC5689(20, this, serviceConnection));
    }
}
