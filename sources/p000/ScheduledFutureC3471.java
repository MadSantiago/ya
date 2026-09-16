package p000;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: ۦؘؒؒۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class ScheduledFutureC3471 extends AbstractC0065 implements ScheduledFuture {

    /* JADX INFO: renamed from: ۦۛ */
    public final ScheduledFuture f11517;

    public ScheduledFutureC3471(InterfaceC2482 interfaceC2482) {
        this.f11517 = interfaceC2482.mo4641(new C4228(19, this));
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.f11517.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f11517.getDelay(timeUnit);
    }

    @Override // p000.AbstractC0065
    /* JADX INFO: renamed from: ۥؗ */
    public final void mo6261() {
        ScheduledFuture scheduledFuture = this.f11517;
        Object obj = this.f12495;
        scheduledFuture.cancel((obj instanceof C0052) && ((C0052) obj).f9917);
    }
}
