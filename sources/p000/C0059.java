package p000;

/* JADX INFO: renamed from: ۦؗ */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0059 extends AbstractC2426 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ int f11299;

    /* JADX INFO: renamed from: ۥٖ */
    public int f11300;

    /* JADX INFO: renamed from: ۥۖ */
    public final /* synthetic */ AbstractC0006 f11301;

    /* JADX INFO: renamed from: ۦٗ */
    public final /* synthetic */ C2243 f11302;

    /* JADX INFO: renamed from: ۦۛ */
    public final /* synthetic */ C3656 f11303;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0059(C2243 c2243, C3656 c3656, AbstractC0006 abstractC0006, InterfaceC0443 interfaceC0443, int i) {
        super(2, interfaceC0443);
        this.f11299 = i;
        this.f11302 = c2243;
        this.f11303 = c3656;
        this.f11301 = abstractC0006;
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٓ */
    public final InterfaceC0443 mo217(InterfaceC0443 interfaceC0443, Object obj) {
        switch (this.f11299) {
            case 0:
                return new C0059(this.f11302, this.f11303, this.f11301, interfaceC0443, 0);
            default:
                return new C0059(this.f11302, this.f11303, this.f11301, interfaceC0443, 1);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        if (r3.m4292(r9, r10) == r6) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006d, code lost:
    
        if (r3.m4292(r9, r10) == r6) goto L31;
     */
    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٖ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo218(java.lang.Object r11) {
        /*
            r10 = this;
            int r0 = r10.f11299
            ۥۜؑؒؑ r1 = p000.C2358.f7817
            ۥؔ r2 = r10.f11301
            ۥۙٛۡ r3 = r10.f11302
            r4 = 0
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            ۥٟۚؕۨ r6 = p000.EnumC2282.f7590
            r7 = 1
            r8 = 2
            ۦًًؙؓ r9 = r10.f11303
            switch(r0) {
                case 0: goto L44;
                default: goto L14;
            }
        L14:
            int r0 = r10.f11300
            if (r0 == 0) goto L29
            if (r0 == r7) goto L25
            if (r0 != r8) goto L20
            p000.AbstractC0186.m409(r11)
            goto L41
        L20:
            p000.C1078.m2276(r5)
            r1 = r4
            goto L43
        L25:
            p000.AbstractC0186.m409(r11)
            goto L37
        L29:
            p000.AbstractC0186.m409(r11)
            long r4 = p000.AbstractC4899.f16144
            r10.f11300 = r7
            java.lang.Object r11 = p000.AbstractC2765.m5130(r4, r10)
            if (r11 != r6) goto L37
            goto L3f
        L37:
            r10.f11300 = r8
            java.lang.Object r10 = r3.m4292(r9, r10)
            if (r10 != r6) goto L41
        L3f:
            r1 = r6
            goto L43
        L41:
            r2.f1326 = r9
        L43:
            return r1
        L44:
            int r0 = r10.f11300
            if (r0 == 0) goto L59
            if (r0 == r7) goto L55
            if (r0 != r8) goto L50
            p000.AbstractC0186.m409(r11)
            goto L71
        L50:
            p000.C1078.m2276(r5)
            r1 = r4
            goto L73
        L55:
            p000.AbstractC0186.m409(r11)
            goto L67
        L59:
            p000.AbstractC0186.m409(r11)
            long r4 = p000.AbstractC4899.f16144
            r10.f11300 = r7
            java.lang.Object r11 = p000.AbstractC2765.m5130(r4, r10)
            if (r11 != r6) goto L67
            goto L6f
        L67:
            r10.f11300 = r8
            java.lang.Object r10 = r3.m4292(r9, r10)
            if (r10 != r6) goto L71
        L6f:
            r1 = r6
            goto L73
        L71:
            r2.f1329 = r9
        L73:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0059.mo218(java.lang.Object):java.lang.Object");
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        int i = this.f11299;
        C2358 c2358 = C2358.f7817;
        InterfaceC4643 interfaceC4643 = (InterfaceC4643) obj;
        InterfaceC0443 interfaceC0443 = (InterfaceC0443) obj2;
        switch (i) {
            case 0:
                break;
        }
        return ((C0059) mo217(interfaceC0443, interfaceC4643)).mo218(c2358);
    }
}
