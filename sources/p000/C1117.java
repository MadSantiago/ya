package p000;

/* JADX INFO: renamed from: ۥِؖۙؐ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1117 implements InterfaceC2880 {

    /* JADX INFO: renamed from: ۥؓ */
    public InterfaceC2880 f3915;

    /* JADX INFO: renamed from: ۥؖ */
    public long f3916;

    /* JADX INFO: renamed from: ۥً */
    public int f3917;

    /* JADX INFO: renamed from: ۥَ */
    public float f3918;

    /* JADX INFO: renamed from: ۥٖ */
    public long f3921;

    /* JADX INFO: renamed from: ۥٙ */
    public boolean f3922;

    /* JADX INFO: renamed from: ۥۖ */
    public long f3923;

    /* JADX INFO: renamed from: ۥۧ */
    public EnumC2459 f3924;

    /* JADX INFO: renamed from: ۦٕ */
    public InterfaceC2864 f3925;

    /* JADX INFO: renamed from: ۦٗ */
    public long f3926;

    /* JADX INFO: renamed from: ۦٚ */
    public AbstractC3925 f3927;

    /* JADX INFO: renamed from: ۦۛ */
    public float f3928;

    /* JADX INFO: renamed from: ۦۨ */
    public int f3930;

    /* JADX INFO: renamed from: ۦ۟ */
    public float f3929 = 1.0f;

    /* JADX INFO: renamed from: ۥْ */
    public float f3919 = 1.0f;

    /* JADX INFO: renamed from: ۥٓ */
    public float f3920 = 1.0f;

    public C1117() {
        long j = AbstractC1938.f6398;
        this.f3921 = j;
        this.f3926 = j;
        this.f3928 = 8.0f;
        this.f3923 = AbstractC5477.f18071;
        this.f3925 = AbstractC2552.f8518;
        this.f3916 = 9205357640488583168L;
        this.f3915 = AbstractC4554.m7884();
        this.f3924 = EnumC2459.f8215;
        this.f3917 = 3;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final void m2338(float f) {
        if (this.f3920 == f) {
            return;
        }
        this.f3930 |= 4;
        this.f3920 = f;
    }

    /* JADX INFO: renamed from: ۥُ */
    public final void m2339(long j) {
        long j2 = this.f3921;
        int i = C1327.f4593;
        if (C4462.m7744(j2, j)) {
            return;
        }
        this.f3930 |= 64;
        this.f3921 = j;
    }

    /* JADX INFO: renamed from: ۥّ */
    public final void m2340(boolean z) {
        if (this.f3922 != z) {
            this.f3930 |= 16384;
            this.f3922 = z;
        }
    }

    @Override // p000.InterfaceC2880
    /* JADX INFO: renamed from: ۥۗ */
    public final float mo746() {
        return this.f3915.mo746();
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m2341() {
        m2347(1.0f);
        m2345(1.0f);
        m2338(1.0f);
        m2344(0.0f);
        long j = AbstractC1938.f6398;
        m2339(j);
        m2342(j);
        if (this.f3928 != 8.0f) {
            this.f3930 |= 2048;
            this.f3928 = 8.0f;
        }
        m2343(AbstractC5477.f18071);
        m2346(AbstractC2552.f8518);
        m2340(false);
        if (this.f3917 != 3) {
            this.f3930 |= 524288;
            this.f3917 = 3;
        }
        this.f3916 = 9205357640488583168L;
        this.f3927 = null;
        this.f3930 = 0;
    }

    /* JADX INFO: renamed from: ۦؚ */
    public final void m2342(long j) {
        long j2 = this.f3926;
        int i = C1327.f4593;
        if (C4462.m7744(j2, j)) {
            return;
        }
        this.f3930 |= 128;
        this.f3926 = j;
    }

    /* JADX INFO: renamed from: ۦٌ */
    public final void m2343(long j) {
        long j2 = this.f3923;
        int i = AbstractC5477.f18070;
        if (j2 == j) {
            return;
        }
        this.f3930 |= 4096;
        this.f3923 = j;
    }

    /* JADX INFO: renamed from: ۦِ */
    public final void m2344(float f) {
        if (this.f3918 == f) {
            return;
        }
        this.f3930 |= 32;
        this.f3918 = f;
    }

    /* JADX INFO: renamed from: ۦٛ */
    public final void m2345(float f) {
        if (this.f3919 == f) {
            return;
        }
        this.f3930 |= 2;
        this.f3919 = f;
    }

    /* JADX INFO: renamed from: ۦۗ */
    public final void m2346(InterfaceC2864 interfaceC2864) {
        if (AbstractC3831.m6874(this.f3925, interfaceC2864)) {
            return;
        }
        this.f3930 |= 8192;
        this.f3925 = interfaceC2864;
    }

    /* JADX INFO: renamed from: ۦۙ */
    public final void m2347(float f) {
        if (this.f3929 == f) {
            return;
        }
        this.f3930 |= 1;
        this.f3929 = f;
    }

    @Override // p000.InterfaceC2880
    /* JADX INFO: renamed from: ۦۚ */
    public final float mo754() {
        return this.f3915.mo754();
    }
}
