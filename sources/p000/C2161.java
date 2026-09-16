package p000;

/* JADX INFO: renamed from: ۥۘؔۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2161 extends AbstractC0643 {

    /* JADX INFO: renamed from: ۥُ */
    public final C4852 f7128 = AbstractC2774.m5183(new C3291(0));

    /* JADX INFO: renamed from: ۥّ */
    public final C4852 f7129 = AbstractC2774.m5183(Boolean.FALSE);

    /* JADX INFO: renamed from: ۥۜ */
    public final C4852 f7130;

    /* JADX INFO: renamed from: ۦِ */
    public C1516 f7131;

    /* JADX INFO: renamed from: ۦٛ */
    public float f7132;

    /* JADX INFO: renamed from: ۦۙ */
    public final C3532 f7133;

    public C2161(C1412 c1412) {
        C3532 c3532 = new C3532(c1412);
        c3532.f11706 = new C5285(24, this);
        this.f7133 = c3532;
        this.f7130 = new C4852(C2358.f7817, C0373.f1364);
        this.f7132 = 1.0f;
    }

    @Override // p000.AbstractC0643
    /* JADX INFO: renamed from: ۥُ */
    public final void mo1461(InterfaceC2442 interfaceC2442) {
        C1516 c1516 = this.f7131;
        C3532 c3532 = this.f7133;
        if (c1516 == null) {
            c1516 = (C1516) c3532.f11715.getValue();
        }
        if (((Boolean) this.f7129.getValue()).booleanValue() && interfaceC2442.getLayoutDirection() == EnumC2459.f8214) {
            long jMo4568 = interfaceC2442.mo4568();
            C2808 c2808Mo3908 = interfaceC2442.mo3908();
            long jM5355 = c2808Mo3908.m5355();
            c2808Mo3908.m5353().mo2092();
            try {
                ((C5086) c2808Mo3908.f9378).m8702(-1.0f, 1.0f, jMo4568);
                c3532.m6321(interfaceC2442, this.f7132, c1516);
                c2808Mo3908.m5353().mo2095();
                c2808Mo3908.m5351(jM5355);
            } catch (Throwable th) {
                c2808Mo3908.m5353().mo2095();
                c2808Mo3908.m5351(jM5355);
                throw th;
            }
        } else {
            c3532.m6321(interfaceC2442, this.f7132, c1516);
        }
        this.f7130.getValue();
    }

    @Override // p000.AbstractC0643
    /* JADX INFO: renamed from: ۥۗ */
    public final void mo1462(C1516 c1516) {
        this.f7131 = c1516;
    }

    @Override // p000.AbstractC0643
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo1463(float f) {
        this.f7132 = f;
    }

    @Override // p000.AbstractC0643
    /* JADX INFO: renamed from: ۦؑ */
    public final long mo1464() {
        return ((C3291) this.f7128.getValue()).f11025;
    }
}
