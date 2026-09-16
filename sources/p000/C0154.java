package p000;

/* JADX INFO: renamed from: ۥٕؐٗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0154 implements InterfaceC4886 {

    /* JADX INFO: renamed from: ۥۗ */
    public int f592;

    /* JADX INFO: renamed from: ۥۣ */
    public long f593;

    @Override // p000.InterfaceC4886
    public C3416 toInstant() {
        long j = this.f593;
        C3416 c3416 = C3416.f11373;
        C3416 c3417 = C3416.f11373;
        if (j >= c3417.f11376) {
            C3416 c3418 = C3416.f11374;
            if (j <= c3418.f11376) {
                long j2 = this.f592;
                long j3 = j2 / 1000000000;
                if ((j2 ^ 1000000000) < 0 && j3 * 1000000000 != j2) {
                    j3--;
                }
                long j4 = j + j3;
                if ((j ^ j4) < 0 && (j3 ^ j) >= 0) {
                    return j > 0 ? c3418 : c3417;
                }
                if (j4 >= -31557014167219200L) {
                    if (j4 <= 31556889864403199L) {
                        long j5 = j2 % 1000000000;
                        return new C3416(j4, (int) (j5 + ((((j5 ^ 1000000000) & ((-j5) | j5)) >> 63) & 1000000000)));
                    }
                }
            }
        }
        throw new C0869("The parsed date is outside the range representable by Instant (Unix epoch second " + j + ')');
    }

    /* JADX INFO: renamed from: ۥۗ */
    public synchronized void m325(int i) {
        if ((i >= 200 && i < 300) || i == 401 || i == 404) {
            synchronized (this) {
                this.f592 = 0;
            }
            return;
        } else {
            this.f592++;
            synchronized (this) {
                this.f593 = System.currentTimeMillis() + ((i == 429 || (i >= 500 && i < 600)) ? (long) Math.min(Math.pow(2.0d, this.f592) + ((long) (Math.random() * 1000.0d)), 1800000.0d) : 86400000L);
            }
            return;
        }
        throw th;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public synchronized boolean m326() {
        return this.f592 == 0 || System.currentTimeMillis() > this.f593;
    }
}
