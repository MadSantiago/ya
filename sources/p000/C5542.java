package p000;

/* JADX INFO: renamed from: ۦٖۢؕٓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5542 extends AbstractC0868 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥَ */
    public /* synthetic */ Object f18304;

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ int f18305 = 0;

    /* JADX INFO: renamed from: ۥٓ */
    public int f18306;

    /* JADX INFO: renamed from: ۥٖ */
    public Object f18307;

    /* JADX INFO: renamed from: ۥۖ */
    public final /* synthetic */ InterfaceC0400 f18308;

    /* JADX INFO: renamed from: ۦٕ */
    public final /* synthetic */ Object f18309;

    /* JADX INFO: renamed from: ۦٗ */
    public final /* synthetic */ Object f18310;

    /* JADX INFO: renamed from: ۦۛ */
    public final /* synthetic */ InterfaceC0400 f18311;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5542(C0062 c0062, C3032 c3032, C4164 c4164, C1374 c1374, C0091 c0091, InterfaceC0443 interfaceC0443) {
        super(2, interfaceC0443);
        this.f18307 = c0062;
        this.f18310 = c3032;
        this.f18311 = c4164;
        this.f18308 = c1374;
        this.f18309 = c0091;
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٓ */
    public final InterfaceC0443 mo217(InterfaceC0443 interfaceC0443, Object obj) {
        int i = this.f18305;
        Object obj2 = this.f18309;
        InterfaceC0400 interfaceC0400 = this.f18308;
        InterfaceC0400 interfaceC0401 = this.f18311;
        Object obj3 = this.f18310;
        switch (i) {
            case 0:
                C5542 c5542 = new C5542((C0062) this.f18307, (C3032) obj3, (C4164) interfaceC0401, (C1374) interfaceC0400, (C0091) obj2, interfaceC0443);
                c5542.f18304 = obj;
                return c5542;
            default:
                C5542 c5543 = new C5542((InterfaceC4643) obj3, (C2695) interfaceC0401, (C2136) interfaceC0400, (C3821) obj2, interfaceC0443);
                c5543.f18304 = obj;
                return c5543;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0090, code lost:
    
        if (r3 == r9) goto L20;
     */
    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٖ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo218(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C5542.mo218(java.lang.Object):java.lang.Object");
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        int i = this.f18305;
        C2358 c2358 = C2358.f7817;
        C5475 c5475 = (C5475) obj;
        InterfaceC0443 interfaceC0443 = (InterfaceC0443) obj2;
        switch (i) {
            case 0:
                break;
        }
        return ((C5542) mo217(interfaceC0443, c5475)).mo218(c2358);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5542(InterfaceC4643 interfaceC4643, C2695 c2695, C2136 c2136, C3821 c3821, InterfaceC0443 interfaceC0443) {
        super(2, interfaceC0443);
        this.f18310 = interfaceC4643;
        this.f18311 = c2695;
        this.f18308 = c2136;
        this.f18309 = c3821;
    }
}
