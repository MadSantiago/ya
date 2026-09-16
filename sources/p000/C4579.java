package p000;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: ۦٚؗٛٛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4579 extends AbstractC4028 {

    /* JADX INFO: renamed from: ۦؑ */
    public static final /* synthetic */ int f15109 = 0;

    /* JADX INFO: renamed from: ۥؗ */
    public final AtomicLong f15110 = new AtomicLong(-1);

    static {
        new C1609(1);
    }

    @Override // p000.AbstractC4028
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo525() {
        AtomicLong atomicLong = this.f15110;
        atomicLong.set(Math.max(-atomicLong.get(), 0L));
    }
}
