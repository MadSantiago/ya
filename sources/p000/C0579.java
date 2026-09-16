package p000;

import java.util.concurrent.CountDownLatch;

/* JADX INFO: renamed from: ۥَٖؗؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0579 {

    /* JADX INFO: renamed from: ۥۗ */
    public C2702 f2072 = null;

    /* JADX INFO: renamed from: ۥۣ */
    public final CountDownLatch f2073;

    public C0579(CountDownLatch countDownLatch) {
        this.f2073 = countDownLatch;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0579)) {
            return false;
        }
        C0579 c0579 = (C0579) obj;
        return this.f2073.equals(c0579.f2073) && AbstractC3831.m6874(this.f2072, c0579.f2072);
    }

    public final int hashCode() {
        int iHashCode = this.f2073.hashCode() * 31;
        C2702 c2702 = this.f2072;
        return iHashCode + (c2702 == null ? 0 : c2702.hashCode());
    }

    public final String toString() {
        return "Dependency(latch=" + this.f2073 + ", subscriber=" + this.f2072 + ')';
    }
}
