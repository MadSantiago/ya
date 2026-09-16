package p000;

/* JADX INFO: renamed from: ۦٗؖؐٙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4371 extends AbstractC2426 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ int f14403;

    /* JADX INFO: renamed from: ۥٖ */
    public int f14404;

    /* JADX INFO: renamed from: ۦٗ */
    public final /* synthetic */ C4482 f14405;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4371(C4482 c4482, InterfaceC0443 interfaceC0443, int i) {
        super(2, interfaceC0443);
        this.f14403 = i;
        this.f14405 = c4482;
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٓ */
    public final InterfaceC0443 mo217(InterfaceC0443 interfaceC0443, Object obj) {
        int i = this.f14403;
        C4482 c4482 = this.f14405;
        switch (i) {
            case 0:
                return new C4371(c4482, interfaceC0443, 0);
            case 1:
                return new C4371(c4482, interfaceC0443, 1);
            default:
                return new C4371(c4482, interfaceC0443, 2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0049, code lost:
    
        if (r10 == r6) goto L22;
     */
    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٖ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo218(java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            int r0 = r9.f14403
            ۥۜؑؒؑ r1 = p000.C2358.f7817
            r2 = -1
            r3 = 2
            r4 = 0
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            ۥٟۚؕۨ r6 = p000.EnumC2282.f7590
            ۦؚٙؔؐ r7 = r9.f14405
            r8 = 1
            switch(r0) {
                case 0: goto L9e;
                case 1: goto L57;
                default: goto L11;
            }
        L11:
            ۦۙؑۙؑ r0 = r7.f14796
            int r1 = r9.f14404
            if (r1 == 0) goto L29
            if (r1 == r8) goto L23
            if (r1 != r3) goto L1f
            p000.AbstractC0186.m409(r10)
            goto L4d
        L1f:
            p000.C1078.m2276(r5)
            goto L56
        L23:
            p000.AbstractC0186.m409(r10)     // Catch: java.lang.Throwable -> L27
            goto L42
        L27:
            r9 = move-exception
            goto L51
        L29:
            p000.AbstractC0186.m409(r10)
            ۥٟؓۥؚ r10 = r0.m8693()
            boolean r10 = r10 instanceof p000.C4027
            if (r10 == 0) goto L39
            ۥٟؓۥؚ r4 = r0.m8693()
            goto L56
        L39:
            r9.f14404 = r8     // Catch: java.lang.Throwable -> L27
            java.lang.Object r10 = r7.m7764(r9)     // Catch: java.lang.Throwable -> L27
            if (r10 != r6) goto L42
            goto L4b
        L42:
            r9.f14404 = r3
            r10 = 0
            java.lang.Object r10 = r7.m7760(r10, r9)
            if (r10 != r6) goto L4d
        L4b:
            r4 = r6
            goto L56
        L4d:
            r4 = r10
            ۥٟؓۥؚ r4 = (p000.AbstractC1996) r4
            goto L56
        L51:
            ۥٍٕؑٚ r4 = new ۥٍٕؑٚ
            r4.<init>(r2, r9)
        L56:
            return r4
        L57:
            int r0 = r9.f14404
            if (r0 == 0) goto L6c
            if (r0 == r8) goto L68
            if (r0 != r3) goto L63
            p000.AbstractC0186.m409(r10)
            goto L9d
        L63:
            p000.C1078.m2276(r5)
            r1 = r4
            goto L9d
        L68:
            p000.AbstractC0186.m409(r10)
            goto L82
        L6c:
            p000.AbstractC0186.m409(r10)
            ۥؚٖٗ r10 = r7.f14801
            r9.f14404 = r8
            java.lang.Object r10 = r10.f5057
            ۦؙؚؒۦ r10 = (p000.C3529) r10
            java.lang.Object r10 = r10.m6320(r9)
            if (r10 != r6) goto L7e
            goto L7f
        L7e:
            r10 = r1
        L7f:
            if (r10 != r6) goto L82
            goto L9c
        L82:
            ۦؚۧؕؖ r10 = r7.m7761()
            ۦٜٕؗٙ r10 = r10.mo5824()
            ۦٜٕؗٙ r10 = p000.AbstractC4593.m7989(r10, r2)
            ۥؕؓۨ٘ r0 = new ۥؕؓۨ٘
            r2 = 3
            r0.<init>(r2, r7)
            r9.f14404 = r3
            java.lang.Object r9 = r10.mo1575(r0, r9)
            if (r9 != r6) goto L9d
        L9c:
            r1 = r6
        L9d:
            return r1
        L9e:
            int r0 = r9.f14404
            if (r0 == 0) goto Lad
            if (r0 != r8) goto La8
            p000.AbstractC0186.m409(r10)
            goto Lb9
        La8:
            p000.C1078.m2276(r5)
            r1 = r4
            goto Lb9
        Lad:
            p000.AbstractC0186.m409(r10)
            r9.f14404 = r8
            java.lang.Object r9 = r7.m7759(r9)
            if (r9 != r6) goto Lb9
            r1 = r6
        Lb9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C4371.mo218(java.lang.Object):java.lang.Object");
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        int i = this.f14403;
        C2358 c2358 = C2358.f7817;
        switch (i) {
            case 0:
                return ((C4371) mo217((InterfaceC0443) obj2, (InterfaceC4161) obj)).mo218(c2358);
            case 1:
                return ((C4371) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(c2358);
            default:
                return ((C4371) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(c2358);
        }
    }
}
