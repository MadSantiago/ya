package p000;

import java.util.List;

/* JADX INFO: renamed from: ۥؕؒٔۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0441 {

    /* JADX INFO: renamed from: ۥؗ */
    public final boolean f1622;

    /* JADX INFO: renamed from: ۥُ */
    public final InterfaceC4434 f1623;

    /* JADX INFO: renamed from: ۥّ */
    public final List f1624;

    /* JADX INFO: renamed from: ۥۗ */
    public final C3564 f1625;

    /* JADX INFO: renamed from: ۥۜ */
    public EnumC2459 f1626;

    /* JADX INFO: renamed from: ۥۣ */
    public final C1249 f1627;

    /* JADX INFO: renamed from: ۦؑ */
    public final InterfaceC2880 f1628;

    /* JADX INFO: renamed from: ۦۙ */
    public C1414 f1629;

    public C0441(C1249 c1249, C3564 c3564, boolean z, InterfaceC2880 interfaceC2880, InterfaceC4434 interfaceC4434, List list) {
        this.f1627 = c1249;
        this.f1625 = c3564;
        this.f1622 = z;
        this.f1628 = interfaceC2880;
        this.f1623 = interfaceC4434;
        this.f1624 = list;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m960(EnumC2459 enumC2459) {
        C1414 c1414 = this.f1629;
        if (c1414 == null || enumC2459 != this.f1626 || c1414.mo2997()) {
            this.f1626 = enumC2459;
            c1414 = new C1414(this.f1627, AbstractC5537.m9238(this.f1625, enumC2459), this.f1624, this.f1628, this.f1623);
        }
        this.f1629 = c1414;
    }
}
