package p000;

/* JADX INFO: renamed from: ۥؖؒؒ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0513 extends AbstractC1127 implements InterfaceC4745 {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ C4017 f1835;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ int f1836;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0513(C4017 c4017, int i) {
        super(1);
        this.f1836 = i;
        this.f1835 = c4017;
    }

    @Override // p000.InterfaceC4745
    /* JADX INFO: renamed from: ۦؚ */
    public final Object mo211(Object obj) {
        int i = this.f1836;
        C4017 c4017 = this.f1835;
        switch (i) {
            case 0:
                return Double.valueOf(c4017.f13397.mo399(AbstractC4554.m7921(((Number) obj).doubleValue(), c4017.f13386, c4017.f13387)));
            default:
                return Double.valueOf(AbstractC4554.m7921(c4017.f13395.mo399(((Number) obj).doubleValue()), c4017.f13386, c4017.f13387));
        }
    }
}
