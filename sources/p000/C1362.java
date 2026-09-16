package p000;

/* JADX INFO: renamed from: ۥؙٔؗٗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1362 extends AbstractC2426 implements InterfaceC2609 {

    /* JADX INFO: renamed from: ۥَ */
    public InterfaceC4161 f4677;

    /* JADX INFO: renamed from: ۥٖ */
    public int f4678;

    /* JADX INFO: renamed from: ۥۖ */
    public final /* synthetic */ InterfaceC5731 f4679;

    /* JADX INFO: renamed from: ۦٗ */
    public /* synthetic */ InterfaceC4161 f4680;

    /* JADX INFO: renamed from: ۦۛ */
    public /* synthetic */ Object f4681;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1362(InterfaceC5731 interfaceC5731, InterfaceC0443 interfaceC0443) {
        super(3, interfaceC0443);
        this.f4679 = interfaceC5731;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
    
        if (r0.mo978(r8, r7) == r6) goto L15;
     */
    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٖ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo218(java.lang.Object r8) {
        /*
            r7 = this;
            ۦٔؑۢٞ r0 = r7.f4680
            java.lang.Object r1 = r7.f4681
            int r2 = r7.f4678
            r3 = 2
            r4 = 1
            r5 = 0
            ۥٟۚؕۨ r6 = p000.EnumC2282.f7590
            if (r2 == 0) goto L21
            if (r2 == r4) goto L1b
            if (r2 != r3) goto L15
            p000.AbstractC0186.m409(r8)
            goto L44
        L15:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p000.C1078.m2276(r7)
            return r5
        L1b:
            ۦٔؑۢٞ r0 = r7.f4677
            p000.AbstractC0186.m409(r8)
            goto L35
        L21:
            p000.AbstractC0186.m409(r8)
            r7.f4680 = r5
            r7.f4681 = r5
            r7.f4677 = r0
            r7.f4678 = r4
            ۦۦؙؑؑ r8 = r7.f4679
            java.lang.Object r8 = r8.mo219(r1, r7)
            if (r8 != r6) goto L35
            goto L43
        L35:
            r7.f4680 = r5
            r7.f4681 = r5
            r7.f4677 = r5
            r7.f4678 = r3
            java.lang.Object r7 = r0.mo978(r8, r7)
            if (r7 != r6) goto L44
        L43:
            return r6
        L44:
            ۥۜؑؒؑ r7 = p000.C2358.f7817
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1362.mo218(java.lang.Object):java.lang.Object");
    }

    @Override // p000.InterfaceC2609
    /* JADX INFO: renamed from: ۦۙ */
    public final Object mo1173(Object obj, Object obj2, Object obj3) {
        C1362 c1362 = new C1362(this.f4679, (InterfaceC0443) obj3);
        c1362.f4680 = (InterfaceC4161) obj;
        c1362.f4681 = obj2;
        return c1362.mo218(C2358.f7817);
    }
}
