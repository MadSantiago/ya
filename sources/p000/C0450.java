package p000;

import java.util.HashMap;

/* JADX INFO: renamed from: ۥِْؕؓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0450 {

    /* JADX INFO: renamed from: ۥۗ */
    public final HashMap f1642;

    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC5375 f1643;

    public C0450(InterfaceC5375 interfaceC5375, HashMap map) {
        this.f1643 = interfaceC5375;
        this.f1642 = map;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0450)) {
            return false;
        }
        C0450 c0450 = (C0450) obj;
        return this.f1643.equals(c0450.f1643) && this.f1642.equals(c0450.f1642);
    }

    public final int hashCode() {
        return this.f1642.hashCode() ^ ((this.f1643.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.f1643 + ", values=" + this.f1642 + "}";
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final long m973(EnumC4021 enumC4021, long j, int i) {
        long jMo7674 = j - this.f1643.mo7674();
        C5526 c5526 = (C5526) this.f1642.get(enumC4021);
        long j2 = c5526.f18245;
        int i2 = i - 1;
        return Math.min(Math.max((long) (Math.pow(3.0d, i2) * j2 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j2 > 1 ? j2 : 2L) * ((long) i2)))), jMo7674), c5526.f18244);
    }
}
