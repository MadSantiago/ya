package p000;

import java.util.concurrent.ScheduledFuture;

/* JADX INFO: renamed from: ۥۣؗؕۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0612 implements InterfaceC4883 {

    /* JADX INFO: renamed from: ۦۨ */
    public final ScheduledFuture f2289;

    public C0612(ScheduledFuture scheduledFuture) {
        this.f2289 = scheduledFuture;
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.f2289 + ']';
    }

    @Override // p000.InterfaceC4883
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo1376() {
        this.f2289.cancel(false);
    }
}
