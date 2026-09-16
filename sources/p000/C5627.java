package p000;

/* JADX INFO: renamed from: ۦۣٚۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5627 {

    /* JADX INFO: renamed from: ۥؗ */
    public final /* synthetic */ C0777 f18552;

    /* JADX INFO: renamed from: ۥۗ */
    public final C4852 f18553 = AbstractC2774.m5183(null);

    /* JADX INFO: renamed from: ۥۣ */
    public final C1280 f18554;

    public C5627(C0777 c0777, C1280 c1280, String str) {
        this.f18552 = c0777;
        this.f18554 = c1280;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final C5290 m9474(InterfaceC4745 interfaceC4745, InterfaceC4745 interfaceC4746) {
        C4852 c4852 = this.f18553;
        C5290 c5290 = (C5290) c4852.getValue();
        C0777 c0777 = this.f18552;
        if (c5290 == null) {
            Object objMo211 = interfaceC4746.mo211(c0777.m1671());
            Object objMo212 = interfaceC4746.mo211(c0777.m1671());
            C1280 c1280 = this.f18554;
            AbstractC1814 abstractC1814 = (AbstractC1814) c1280.f4359.mo211(objMo212);
            abstractC1814.mo2175();
            C3051 c3051 = new C3051(c0777, objMo211, abstractC1814, c1280);
            c5290 = new C5290(this, c3051, interfaceC4745, interfaceC4746);
            c4852.setValue(c5290);
            c0777.f2816.add(c3051);
        }
        c5290.f17424 = interfaceC4746;
        c5290.f17426 = interfaceC4745;
        c5290.m8922(c0777.m1673());
        return c5290;
    }
}
