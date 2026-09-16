package p000;

/* JADX INFO: renamed from: ۦٜؒؒؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4670 {

    /* JADX INFO: renamed from: ۥؗ */
    public static final C0599 f15389;

    /* JADX INFO: renamed from: ۥۗ */
    public static final C0599 f15390;

    /* JADX INFO: renamed from: ۥۣ */
    public static final C4216 f15391 = new C4216(0, new C2971(0));

    static {
        long j = C1327.f4591;
        f15390 = new C0599(Float.NaN, j, true);
        f15389 = new C0599(Float.NaN, j, false);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static C0599 m8032(float f, int i, long j, boolean z) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            f = Float.NaN;
        }
        if ((i & 4) != 0) {
            j = C1327.f4591;
        }
        if (C4497.m7826(f, Float.NaN) && C4462.m7744(j, C1327.f4591)) {
            return z ? f15390 : f15389;
        }
        return new C0599(f, j, z);
    }
}
