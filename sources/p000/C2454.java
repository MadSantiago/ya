package p000;

/* JADX INFO: renamed from: ۥؚ۟ؕۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2454 implements InterfaceC4598 {

    /* JADX INFO: renamed from: ۥَ */
    public boolean f8187;

    /* JADX INFO: renamed from: ۥْ */
    public C3341 f8188;

    /* JADX INFO: renamed from: ۥٓ */
    public int f8189;

    /* JADX INFO: renamed from: ۥٖ */
    public long f8190;

    /* JADX INFO: renamed from: ۦ۟ */
    public final C1270 f8191;

    /* JADX INFO: renamed from: ۦۨ */
    public final InterfaceC4473 f8192;

    public C2454(InterfaceC4473 interfaceC4473) {
        this.f8192 = interfaceC4473;
        C1270 c1270Mo2685 = interfaceC4473.mo2685();
        this.f8191 = c1270Mo2685;
        C3341 c3341 = c1270Mo2685.f4341;
        this.f8188 = c3341;
        this.f8189 = c3341 != null ? c3341.f11177 : -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f8187 = true;
    }

    @Override // p000.InterfaceC4598
    /* JADX INFO: renamed from: ۥؖ */
    public final long mo406(C1270 c1270, long j) {
        C3341 c3341;
        C3341 c3342;
        if (j < 0) {
            C1078.m2273(AbstractC3761.m6634(j, "byteCount < 0: "));
            return 0L;
        }
        if (this.f8187) {
            C1078.m2276("closed");
            return 0L;
        }
        C3341 c3343 = this.f8188;
        C1270 c1271 = this.f8191;
        if (c3343 != null && (c3343 != (c3342 = c1271.f4341) || this.f8189 != c3342.f11177)) {
            C1078.m2276("Peek source is invalid because upstream source was used");
            return 0L;
        }
        if (j == 0) {
            return 0L;
        }
        if (!this.f8192.mo2697(this.f8190 + 1)) {
            return -1L;
        }
        if (this.f8188 == null && (c3341 = c1271.f4341) != null) {
            this.f8188 = c3341;
            this.f8189 = c3341.f11177;
        }
        long jMin = Math.min(j, c1271.f4340 - this.f8190);
        this.f8191.m2672(c1270, this.f8190, jMin);
        this.f8190 += jMin;
        return jMin;
    }

    @Override // p000.InterfaceC4598, p000.InterfaceC3832
    /* JADX INFO: renamed from: ۥّ */
    public final C2014 mo961() {
        return this.f8192.mo961();
    }
}
