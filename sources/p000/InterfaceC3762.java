package p000;

/* JADX INFO: renamed from: ۦٍؒؓ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC3762 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final C3507 f12523 = C3507.f11619;

    /* JADX INFO: renamed from: ۥۣ */
    default float mo3531(float f, float f2, float f3) {
        f12523.getClass();
        float f4 = f2 + f;
        if ((f >= 0.0f && f4 <= f3) || (f < 0.0f && f4 > f3)) {
            return 0.0f;
        }
        float f5 = f4 - f3;
        return Math.abs(f) < Math.abs(f5) ? f : f5;
    }
}
