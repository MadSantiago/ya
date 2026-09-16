package p000;

/* JADX INFO: renamed from: ۥؘؑؕؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0643 {

    /* JADX INFO: renamed from: ۥۗ */
    public C1516 f2408;

    /* JADX INFO: renamed from: ۥۣ */
    public C0376 f2409;

    /* JADX INFO: renamed from: ۥؗ */
    public float f2407 = 1.0f;

    /* JADX INFO: renamed from: ۦؑ */
    public EnumC2459 f2410 = EnumC2459.f8215;

    /* JADX INFO: renamed from: ۥؗ */
    public final void m1460(InterfaceC2442 interfaceC2442, long j, float f, C1516 c1516) {
        if (this.f2407 != f) {
            mo1463(f);
            this.f2407 = f;
        }
        if (!AbstractC3831.m6874(this.f2408, c1516)) {
            mo1462(c1516);
            this.f2408 = c1516;
        }
        EnumC2459 layoutDirection = interfaceC2442.getLayoutDirection();
        if (this.f2410 != layoutDirection) {
            this.f2410 = layoutDirection;
        }
        int i = (int) (j >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (interfaceC2442.mo4567() >> 32)) - Float.intBitsToFloat(i);
        int i2 = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (interfaceC2442.mo4567() & 4294967295L)) - Float.intBitsToFloat(i2);
        ((C5086) interfaceC2442.mo3908().f9378).m8688(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2);
        if (f > 0.0f) {
            try {
                if (Float.intBitsToFloat(i) > 0.0f && Float.intBitsToFloat(i2) > 0.0f) {
                    mo1461(interfaceC2442);
                }
            } finally {
                ((C5086) interfaceC2442.mo3908().f9378).m8688(-0.0f, -0.0f, -fIntBitsToFloat, -fIntBitsToFloat2);
            }
        }
    }

    /* JADX INFO: renamed from: ۥُ */
    public abstract void mo1461(InterfaceC2442 interfaceC2442);

    /* JADX INFO: renamed from: ۥۗ */
    public abstract void mo1462(C1516 c1516);

    /* JADX INFO: renamed from: ۥۣ */
    public abstract void mo1463(float f);

    /* JADX INFO: renamed from: ۦؑ */
    public abstract long mo1464();
}
