package p000;

/* JADX INFO: renamed from: ۦؒؕٝۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3122 extends AbstractC2426 implements InterfaceC2609 {

    /* JADX INFO: renamed from: ۥَ */
    public int f10453;

    /* JADX INFO: renamed from: ۥٖ */
    public /* synthetic */ InterfaceC4161 f10454;

    /* JADX INFO: renamed from: ۦٗ */
    public /* synthetic */ int f10455;

    /* JADX INFO: renamed from: ۦۛ */
    public final /* synthetic */ C1901 f10456;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3122(C1901 c1901, InterfaceC0443 interfaceC0443) {
        super(3, interfaceC0443);
        this.f10456 = c1901;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0063  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0042, code lost:
    
        if (r0.mo978(p000.EnumC0484.f1763, r10) == r9) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0081, code lost:
    
        if (r0.mo978(p000.EnumC0484.f1760, r10) == r9) goto L32;
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
            ۦٔؑۢٞ r0 = r10.f10454
            int r1 = r10.f10455
            int r2 = r10.f10453
            r3 = 0
            r4 = 5
            r5 = 4
            r6 = 3
            r7 = 2
            r8 = 1
            ۥٟۚؕۨ r9 = p000.EnumC2282.f7590
            if (r2 == 0) goto L31
            if (r2 == r8) goto L2d
            if (r2 == r7) goto L29
            if (r2 == r6) goto L25
            if (r2 == r5) goto L21
            if (r2 != r4) goto L1b
            goto L2d
        L1b:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            p000.C1078.m2276(r10)
            return r3
        L21:
            p000.AbstractC0186.m409(r11)
            goto L75
        L25:
            p000.AbstractC0186.m409(r11)
            goto L63
        L29:
            p000.AbstractC0186.m409(r11)
            goto L54
        L2d:
            p000.AbstractC0186.m409(r11)
            goto L84
        L31:
            p000.AbstractC0186.m409(r11)
            if (r1 <= 0) goto L45
            r10.f10454 = r3
            r10.f10455 = r1
            r10.f10453 = r8
            ۥؚؕؗؖ r11 = p000.EnumC0484.f1763
            java.lang.Object r10 = r0.mo978(r11, r10)
            if (r10 != r9) goto L84
            goto L83
        L45:
            r10.f10454 = r0
            r10.f10455 = r1
            r10.f10453 = r7
            r7 = 0
            java.lang.Object r11 = p000.AbstractC2765.m5130(r7, r10)
            if (r11 != r9) goto L54
            goto L83
        L54:
            r10.f10454 = r0
            r10.f10455 = r1
            r10.f10453 = r6
            ۥؚؕؗؖ r11 = p000.EnumC0484.f1762
            java.lang.Object r11 = r0.mo978(r11, r10)
            if (r11 != r9) goto L63
            goto L83
        L63:
            r10.f10454 = r0
            r10.f10455 = r1
            r10.f10453 = r5
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.Object r11 = p000.AbstractC2765.m5130(r5, r10)
            if (r11 != r9) goto L75
            goto L83
        L75:
            r10.f10454 = r3
            r10.f10455 = r1
            r10.f10453 = r4
            ۥؚؕؗؖ r11 = p000.EnumC0484.f1760
            java.lang.Object r10 = r0.mo978(r11, r10)
            if (r10 != r9) goto L84
        L83:
            return r9
        L84:
            ۥۜؑؒؑ r10 = p000.C2358.f7817
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C3122.mo218(java.lang.Object):java.lang.Object");
    }

    @Override // p000.InterfaceC2609
    /* JADX INFO: renamed from: ۦۙ */
    public final Object mo1173(Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj2).intValue();
        C3122 c3122 = new C3122(this.f10456, (InterfaceC0443) obj3);
        c3122.f10454 = (InterfaceC4161) obj;
        c3122.f10455 = iIntValue;
        return c3122.mo218(C2358.f7817);
    }
}
