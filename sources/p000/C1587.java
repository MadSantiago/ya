package p000;

/* JADX INFO: renamed from: ۥؚ٘ؕۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1587 {

    /* JADX INFO: renamed from: ۥۣ */
    public final C5034 f5341;

    /* JADX INFO: renamed from: ۥۗ */
    public int f5340 = 1;

    /* JADX INFO: renamed from: ۥؗ */
    public long f5339 = m3326();

    public C1587(C5034 c5034) {
        this.f5341 = c5034;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final long m3326() {
        C5034 c5034 = this.f5341;
        AbstractC0487.m1047(c5034);
        long jLongValue = ((Long) AbstractC4936.f16343.m4592(null)).longValue();
        long jLongValue2 = ((Long) AbstractC4936.f16288.m4592(null)).longValue();
        for (int i = 1; i < this.f5340; i++) {
            jLongValue += jLongValue;
            if (jLongValue >= jLongValue2) {
                break;
            }
        }
        c5034.mo2403().getClass();
        return Math.min(jLongValue, jLongValue2) + System.currentTimeMillis();
    }
}
