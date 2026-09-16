package p000;

/* JADX INFO: renamed from: ۦؒؕۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3124 implements InterfaceC0862 {

    /* JADX INFO: renamed from: ۥؗ */
    public final long f10463;

    /* JADX INFO: renamed from: ۥۗ */
    public final InterfaceC3015 f10464;

    /* JADX INFO: renamed from: ۥۣ */
    public final int f10465;

    /* JADX INFO: renamed from: ۦؑ */
    public final long f10466 = 0;

    public C3124(int i, InterfaceC3015 interfaceC3015) {
        this.f10465 = i;
        this.f10464 = interfaceC3015;
        this.f10463 = ((long) i) * 1000000;
    }

    @Override // p000.InterfaceC0862
    /* JADX INFO: renamed from: ۥؗ */
    public final float mo1836(long j, float f, float f2, float f3) {
        long j2 = j - this.f10466;
        if (j2 < 0) {
            j2 = 0;
        }
        long j3 = this.f10463;
        long j4 = j2 > j3 ? j3 : j2;
        if (j4 == 0) {
            return f3;
        }
        return (mo1838(j4, f, f2, f3) - mo1838(j4 - 1000000, f, f2, f3)) * 1000.0f;
    }

    @Override // p000.InterfaceC0862
    /* JADX INFO: renamed from: ۥۗ */
    public final float mo1838(long j, float f, float f2, float f3) {
        long j2 = j - this.f10466;
        if (j2 < 0) {
            j2 = 0;
        }
        long j3 = this.f10463;
        if (j2 > j3) {
            j2 = j3;
        }
        float fMo1642 = this.f10464.mo1642(this.f10465 == 0 ? 1.0f : j2 / j3);
        return (f2 * fMo1642) + ((1.0f - fMo1642) * f);
    }

    @Override // p000.InterfaceC0862
    /* JADX INFO: renamed from: ۦؑ */
    public final long mo1839(float f, float f2, float f3) {
        return this.f10466 + this.f10463;
    }
}
