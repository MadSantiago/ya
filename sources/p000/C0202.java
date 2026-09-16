package p000;

/* JADX INFO: renamed from: ۥؑؕۜؗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0202 implements InterfaceC2755, InterfaceC1550 {

    /* JADX INFO: renamed from: ۥۗ */
    public final /* synthetic */ Object f747;

    /* JADX INFO: renamed from: ۥۣ */
    public final /* synthetic */ int f748;

    public /* synthetic */ C0202(int i, Object obj) {
        this.f748 = i;
        this.f747 = obj;
    }

    @Override // p000.InterfaceC2755
    /* JADX INFO: renamed from: ۥؗ */
    public final InterfaceC3879 mo466() {
        int i = this.f748;
        Object obj = this.f747;
        switch (i) {
            case 0:
                return ((C5880) obj).f19410;
            default:
                return ((C5733) obj).f18903;
        }
    }

    @Override // p000.InterfaceC1550
    /* JADX INFO: renamed from: ۥۗ */
    public final Object mo467(String str, InterfaceC4745 interfaceC4745, AbstractC0772 abstractC0772) {
        int i = this.f748;
        Object obj = this.f747;
        switch (i) {
            case 0:
                return ((C5880) obj).mo467(str, interfaceC4745, abstractC0772);
            default:
                return ((C5733) obj).mo467(str, interfaceC4745, abstractC0772);
        }
    }
}
