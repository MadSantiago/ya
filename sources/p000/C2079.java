package p000;

/* JADX INFO: renamed from: ۥٕۖؗۥ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2079 extends AbstractC2426 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ int f6858;

    /* JADX INFO: renamed from: ۥٖ */
    public int f6859;

    /* JADX INFO: renamed from: ۦٗ */
    public final /* synthetic */ long f6860;

    /* JADX INFO: renamed from: ۦۛ */
    public final /* synthetic */ Object f6861;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2079(long j, Object obj, InterfaceC0443 interfaceC0443, int i) {
        super(2, interfaceC0443);
        this.f6858 = i;
        this.f6860 = j;
        this.f6861 = obj;
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٓ */
    public final InterfaceC0443 mo217(InterfaceC0443 interfaceC0443, Object obj) {
        int i = this.f6858;
        Object obj2 = this.f6861;
        switch (i) {
            case 0:
                return new C2079((AbstractC2535) obj2, this.f6860, interfaceC0443, 0);
            case 1:
                return new C2079(this.f6860, (String) obj2, interfaceC0443, 1);
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                return new C2079((C5825) obj2, this.f6860, interfaceC0443, 2);
            default:
                return new C2079(this.f6860, (C5475) obj2, interfaceC0443, 3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        if (p000.AbstractC2765.m5130(8, r12) == r5) goto L16;
     */
    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٖ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo218(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C2079.mo218(java.lang.Object):java.lang.Object");
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        int i = this.f6858;
        C2358 c2358 = C2358.f7817;
        InterfaceC4643 interfaceC4643 = (InterfaceC4643) obj;
        InterfaceC0443 interfaceC0443 = (InterfaceC0443) obj2;
        switch (i) {
            case 0:
                break;
            case 1:
                break;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                break;
        }
        return ((C2079) mo217(interfaceC0443, interfaceC4643)).mo218(c2358);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2079(Object obj, long j, InterfaceC0443 interfaceC0443, int i) {
        super(2, interfaceC0443);
        this.f6858 = i;
        this.f6861 = obj;
        this.f6860 = j;
    }
}
