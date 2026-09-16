package p000;

/* JADX INFO: renamed from: ۦٜۣؖ٘, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4701 implements InterfaceC4448 {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ Object f15506;

    /* JADX INFO: renamed from: ۥٓ */
    public final /* synthetic */ Object f15507;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ int f15508;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f15509 = 0;

    public /* synthetic */ C4701(int i, InterfaceC4643 interfaceC4643, C2384 c2384) {
        this.f15506 = interfaceC4643;
        this.f15507 = c2384;
        this.f15508 = i;
    }

    @Override // p000.InterfaceC4448
    /* JADX INFO: renamed from: ۥۣ */
    public final Object mo449() {
        int i = this.f15509;
        int i2 = this.f15508;
        Object obj = this.f15507;
        Object obj2 = this.f15506;
        int i3 = 0;
        switch (i) {
            case 0:
                String str = (String) obj2;
                C2505 c2505 = (C2505) obj;
                InterfaceC0103[] interfaceC0103Arr = new InterfaceC0103[i2];
                for (int i4 = 0; i4 < i2; i4++) {
                    interfaceC0103Arr[i4] = AbstractC1631.m3426(str + '.' + c2505.f15433[i4], C3626.f12101, new InterfaceC0103[0]);
                }
                return interfaceC0103Arr;
            default:
                AbstractC2765.m5135((InterfaceC4643) obj2, null, 0, new C0700((C2384) obj, i2, null, i3), 3);
                return C2358.f7817;
        }
    }

    public /* synthetic */ C4701(int i, String str, C2505 c2505) {
        this.f15508 = i;
        this.f15506 = str;
        this.f15507 = c2505;
    }
}
