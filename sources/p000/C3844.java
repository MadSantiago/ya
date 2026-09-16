package p000;

/* JADX INFO: renamed from: ۦَْؔۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3844 implements InterfaceC3762 {
    @Override // p000.InterfaceC3762
    /* JADX INFO: renamed from: ۥۣ */
    public final float mo3531(float f, float f2, float f3) {
        float fAbs = Math.abs((f2 + f) - f);
        float f4 = (0.3f * f3) - (0.0f * fAbs);
        float f5 = f3 - f4;
        if ((fAbs <= f3) && f5 < fAbs) {
            f4 = f3 - fAbs;
        }
        return f - f4;
    }
}
