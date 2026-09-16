package p000;

/* JADX INFO: renamed from: ۥٖۛؒ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2310 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ C5648 f7648;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f7649;

    public /* synthetic */ C2310(C5648 c5648, int i) {
        this.f7649 = i;
        this.f7648 = c5648;
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        int i = this.f7649;
        C2358 c2358 = C2358.f7817;
        C4036 c4036 = C2850.f9517;
        C5648 c5648 = this.f7648;
        switch (i) {
            case 0:
                C5362 c5362 = (C5362) obj;
                int iIntValue = ((Integer) obj2).intValue();
                new C4441(new long[]{6694631522458198113L, 4163886806042381115L, -1339645847464829877L, -6460840385312205280L, 2729341241575606903L, 8263211591887417359L, -1653912425649623960L}).toString();
                if (!c5362.m9011(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c5362.m8982();
                } else {
                    new C4441(new long[]{-1188119906071294215L, 2063017185427618935L, -4037067387596355516L, 8183294884630290034L, 309128603613467425L}).toString();
                    boolean zM8977 = c5362.m8977(c5648);
                    Object objM8999 = c5362.m8999();
                    if (zM8977 || objM8999 == c4036) {
                        objM8999 = new C4052(c5648, 4);
                        c5362.m8987(objM8999);
                    }
                    AbstractC3933.m7096((InterfaceC4448) objM8999, null, false, null, null, null, AbstractC2765.f9156, c5362, 805306368, 510);
                }
                break;
            default:
                C5362 c5363 = (C5362) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                new C4441(new long[]{6412815514245778924L, 963018661455057218L, -6696279271515290903L, -7363492341407932311L, -2871819571475474253L, -2208170201311748522L, 4578031569426574867L}).toString();
                if (!c5363.m9011(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    c5363.m8982();
                } else {
                    new C4441(new long[]{-8180071036668575786L, -4461439875503957391L, 145920217124472865L, -7444912140539394029L, -8342675198376218227L}).toString();
                    boolean zM8978 = c5363.m8977(c5648);
                    Object objM89910 = c5363.m8999();
                    if (zM8978 || objM89910 == c4036) {
                        objM89910 = new C4052(c5648, 5);
                        c5363.m8987(objM89910);
                    }
                    AbstractC3933.m7096((InterfaceC4448) objM89910, null, false, null, null, null, AbstractC2765.f9178, c5363, 805306368, 510);
                }
                break;
        }
        return c2358;
    }
}
