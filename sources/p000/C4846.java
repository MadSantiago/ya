package p000;

/* JADX INFO: renamed from: ۦٟؓؖۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4846 extends AbstractC2426 implements InterfaceC4745 {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ int f15951;

    /* JADX INFO: renamed from: ۥٖ */
    public int f15952;

    /* JADX INFO: renamed from: ۦٗ */
    public final /* synthetic */ Object f15953;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4846(Object obj, InterfaceC0443 interfaceC0443, int i) {
        super(1, interfaceC0443);
        this.f15951 = i;
        this.f15953 = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a7, code lost:
    
        if (r14 == r4) goto L38;
     */
    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٖ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo218(java.lang.Object r15) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 324
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C4846.mo218(java.lang.Object):java.lang.Object");
    }

    @Override // p000.InterfaceC4745
    /* JADX INFO: renamed from: ۦؚ */
    public final Object mo211(Object obj) {
        int i = this.f15951;
        C2358 c2358 = C2358.f7817;
        Object obj2 = this.f15953;
        InterfaceC0443 interfaceC0443 = (InterfaceC0443) obj;
        switch (i) {
            case 0:
                return new C4846((C5280) obj2, interfaceC0443, 0).mo218(c2358);
            case 1:
                return new C4846((C1807) obj2, interfaceC0443, 1).mo218(c2358);
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                return new C4846((C3635) obj2, interfaceC0443, 2).mo218(c2358);
            default:
                return new C4846((C4153) obj2, interfaceC0443, 3).mo218(c2358);
        }
    }
}
