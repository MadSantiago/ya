package p000;

/* JADX INFO: renamed from: ۦٍٚؓؓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4539 implements InterfaceC0690 {

    /* JADX INFO: renamed from: ۥۣ */
    public final /* synthetic */ int f15004;

    public /* synthetic */ C4539(int i) {
        this.f15004 = i;
    }

    @Override // p000.InterfaceC0690
    /* JADX INFO: renamed from: ۥؗ */
    public final int mo1541(C3673 c3673, C3673 c3674) {
        switch (this.f15004) {
            case 0:
                return (c3673.f12278 < 2 || c3674.f12278 < 2) ? 0 : 2;
            default:
                return (c3673.f12278 < 2 || c3674.f12278 < 2) ? 0 : 2;
        }
    }

    @Override // p000.InterfaceC0690
    /* JADX INFO: renamed from: ۥُ */
    public final char mo1542() {
        switch (this.f15004) {
            case 0:
                return '~';
            default:
                return '=';
        }
    }

    @Override // p000.InterfaceC0690
    /* JADX INFO: renamed from: ۥۗ */
    public final int mo1543() {
        switch (this.f15004) {
        }
        return 2;
    }

    @Override // p000.InterfaceC0690
    /* JADX INFO: renamed from: ۥۣ */
    public final char mo1544() {
        switch (this.f15004) {
            case 0:
                return '~';
            default:
                return '=';
        }
    }

    @Override // p000.InterfaceC0690
    /* JADX INFO: renamed from: ۦؑ */
    public final void mo1545(C1507 c1507, C1507 c1508, int i) {
        switch (this.f15004) {
            case 0:
                C1876 c1876 = new C1876();
                AbstractC3959 abstractC3959 = (AbstractC3959) c1507.f13234;
                while (abstractC3959 != null && abstractC3959 != c1508) {
                    AbstractC3959 abstractC39510 = (AbstractC3959) abstractC3959.f13234;
                    c1876.m7114(abstractC3959);
                    abstractC3959 = abstractC39510;
                }
                c1507.m7115(c1876);
                break;
            default:
                C2946 c2946 = new C2946();
                AbstractC3959 abstractC39511 = (AbstractC3959) c1507.f13234;
                while (abstractC39511 != null && abstractC39511 != c1508) {
                    AbstractC3959 abstractC39512 = (AbstractC3959) abstractC39511.f13234;
                    c2946.m7114(abstractC39511);
                    abstractC39511 = abstractC39512;
                }
                c1507.m7115(c2946);
                break;
        }
    }
}
