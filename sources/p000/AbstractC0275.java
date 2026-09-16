package p000;

/* JADX INFO: renamed from: ۥؒؖۤؒ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0275 {

    /* JADX INFO: renamed from: ۦ۟ */
    public int f984;

    /* JADX INFO: renamed from: ۦۨ */
    public int f985;

    /* JADX INFO: renamed from: ۥْ */
    public long f982 = 0;

    /* JADX INFO: renamed from: ۥٓ */
    public long f983 = AbstractC3458.f11475;

    /* JADX INFO: renamed from: ۥَ */
    public long f981 = 0;

    /* JADX INFO: renamed from: ۥۘ */
    public final void m566() {
        this.f985 = AbstractC4554.m7934((int) (this.f982 >> 32), C3693.m6557(this.f983), C3693.m6556(this.f983));
        int iM7934 = AbstractC4554.m7934((int) (this.f982 & 4294967295L), C3693.m6555(this.f983), C3693.m6551(this.f983));
        this.f984 = iM7934;
        int i = this.f985;
        long j = this.f982;
        this.f981 = (((long) ((i - ((int) (j >> 32))) / 2)) << 32) | (4294967295L & ((long) ((iM7934 - ((int) (j & 4294967295L))) / 2)));
    }

    /* JADX INFO: renamed from: ۥۡ */
    public abstract int mo567(AbstractC4642 abstractC4642);

    /* JADX INFO: renamed from: ۥۥ */
    public int mo568() {
        return (int) (this.f982 & 4294967295L);
    }

    /* JADX INFO: renamed from: ۥۨ */
    public int mo569() {
        return (int) (this.f982 >> 32);
    }

    /* JADX INFO: renamed from: ۦِ */
    public Object mo570() {
        return null;
    }

    /* JADX INFO: renamed from: ۦٝ */
    public abstract void mo571(long j, float f, InterfaceC4745 interfaceC4745);

    /* JADX INFO: renamed from: ۦٞ */
    public final void m572(long j) {
        if (C4207.m7431(this.f982, j)) {
            return;
        }
        this.f982 = j;
        m566();
    }

    /* JADX INFO: renamed from: ۦٟ */
    public final void m573(long j) {
        if (C3693.m6547(this.f983, j)) {
            return;
        }
        this.f983 = j;
        m566();
    }
}
