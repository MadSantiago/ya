package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: ۦْٜٕؗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4705 extends BroadcastReceiver {

    /* JADX INFO: renamed from: ۥؗ */
    public final /* synthetic */ C1223 f15516;

    /* JADX INFO: renamed from: ۥُ */
    public final /* synthetic */ Executor f15517;

    /* JADX INFO: renamed from: ۥۗ */
    public final /* synthetic */ Context f15518;

    /* JADX INFO: renamed from: ۥۣ */
    public final /* synthetic */ AtomicBoolean f15519;

    /* JADX INFO: renamed from: ۦؑ */
    public final /* synthetic */ C3743 f15520;

    public C4705(AtomicBoolean atomicBoolean, Context context, C1223 c1223, C3743 c3743, Executor executor) {
        this.f15519 = atomicBoolean;
        this.f15518 = context;
        this.f15516 = c1223;
        this.f15520 = c3743;
        this.f15517 = executor;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.f15519.compareAndSet(false, true)) {
            try {
                this.f15518.unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                Log.w("DirectBootUtils", "Failed to unregister receiver", e);
            }
            C1223 c1223 = this.f15516;
            C3743 c3743 = this.f15520;
            Executor executor = this.f15517;
            RunnableFutureC1595 runnableFutureC1595 = new RunnableFutureC1595();
            runnableFutureC1595.f5353 = new RunnableC3314(runnableFutureC1595, c3743);
            executor.execute(runnableFutureC1595);
            c1223.m3766(runnableFutureC1595);
        }
    }
}
