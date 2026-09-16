package p000;

/* JADX INFO: renamed from: ۦٛؗۡؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4648 extends AbstractC0868 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥَ */
    public int f15331;

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ int f15332 = 0;

    /* JADX INFO: renamed from: ۥٓ */
    public long f15333;

    /* JADX INFO: renamed from: ۥٖ */
    public /* synthetic */ Object f15334;

    /* JADX INFO: renamed from: ۦٗ */
    public final /* synthetic */ Object f15335;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4648(long j, C1314 c1314, InterfaceC0443 interfaceC0443) {
        super(2, interfaceC0443);
        this.f15333 = j;
        this.f15335 = c1314;
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٓ */
    public final InterfaceC0443 mo217(InterfaceC0443 interfaceC0443, Object obj) {
        int i = this.f15332;
        Object obj2 = this.f15335;
        switch (i) {
            case 0:
                C4648 c4648 = new C4648(this.f15333, (C1314) obj2, interfaceC0443);
                c4648.f15334 = obj;
                return c4648;
            default:
                C4648 c4649 = new C4648((C3536) obj2, interfaceC0443);
                c4649.f15334 = obj;
                return c4649;
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0045  */
    /* JADX WARN: Code duplicated, block: B:15:0x004f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0043 -> B:13:0x0047). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:12:0x0045
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٖ */
    public final java.lang.Object mo218(java.lang.Object r10) {
        /*
            r9 = this;
            int r0 = r9.f15332
            java.lang.Object r1 = r9.f15335
            r2 = 0
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            ۥٟۚؕۨ r4 = p000.EnumC2282.f7590
            r5 = 1
            switch(r0) {
                case 0: goto L51;
                default: goto Ld;
            }
        Ld:
            int r0 = r9.f15331
            if (r0 == 0) goto L21
            if (r0 != r5) goto L1d
            long r0 = r9.f15333
            java.lang.Object r2 = r9.f15334
            ۦٜٖۡؕ r2 = (p000.C5475) r2
            p000.AbstractC0186.m409(r10)
            goto L47
        L1d:
            p000.C1078.m2276(r3)
            goto L50
        L21:
            p000.AbstractC0186.m409(r10)
            java.lang.Object r10 = r9.f15334
            ۦٜٖۡؕ r10 = (p000.C5475) r10
            ۦؙؓۘ r1 = (p000.C3536) r1
            long r0 = r1.f11730
            ۥ۠ؔۤۡ r2 = r10.m9175()
            r2.getClass()
            r2 = 40
            long r2 = r2 + r0
            r0 = r2
            r2 = r10
        L38:
            r9.f15334 = r2
            r9.f15333 = r0
            r9.f15331 = r5
            r10 = 3
            java.lang.Object r10 = p000.AbstractC3257.m6008(r2, r9, r10)
            if (r10 != r4) goto L47
            r2 = r4
            goto L50
        L47:
            ۦؙؓۘ r10 = (p000.C3536) r10
            long r6 = r10.f11730
            int r3 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r3 < 0) goto L38
            r2 = r10
        L50:
            return r2
        L51:
            ۥٔؑۤٔ r1 = (p000.C1314) r1
            int r0 = r9.f15331
            if (r0 == 0) goto L65
            if (r0 != r5) goto L61
            java.lang.Object r9 = r9.f15334
            ۦٜٖۡؕ r9 = (p000.C5475) r9
            p000.AbstractC0186.m409(r10)
            goto L84
        L61:
            p000.C1078.m2276(r3)
            goto Lb6
        L65:
            p000.AbstractC0186.m409(r10)
            java.lang.Object r10 = r9.f15334
            ۦٜٖۡؕ r10 = (p000.C5475) r10
            long r2 = r9.f15333
            ۦْٕٔؒ r0 = new ۦْٕٔؒ
            r6 = 18
            r0.<init>(r6, r1)
            r9.f15334 = r10
            r9.f15331 = r5
            java.lang.Object r9 = p000.AbstractC0719.m1587(r10, r2, r0, r9)
            if (r9 != r4) goto L81
            r2 = r4
            goto Lb6
        L81:
            r8 = r10
            r10 = r9
            r9 = r8
        L84:
            ۦؙؓۘ r10 = (p000.C3536) r10
            if (r10 == 0) goto L9c
            long r0 = r1.f4535
            r2 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            long r0 = r0 & r2
            r2 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r10 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r10 == 0) goto L9c
            ۦؙٜٚؔ r2 = p000.EnumC4549.f15028
            goto Lb6
        L9c:
            ۥْٖ۟ؓ r9 = r9.f18065
            ۦۤؑۗٛ r9 = r9.f8120
            java.util.List r9 = r9.f18583
            java.lang.Object r9 = p000.AbstractC0973.m2045(r9)
            ۦؙؓۘ r9 = (p000.C3536) r9
            boolean r10 = p000.AbstractC3801.m6754(r9)
            if (r10 == 0) goto Lb4
            r9.m6327()
            ۦؙٜٚؔ r2 = p000.EnumC4549.f15029
            goto Lb6
        Lb4:
            ۦؙٜٚؔ r2 = p000.EnumC4549.f15027
        Lb6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C4648.mo218(java.lang.Object):java.lang.Object");
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        int i = this.f15332;
        C2358 c2358 = C2358.f7817;
        C5475 c5475 = (C5475) obj;
        InterfaceC0443 interfaceC0443 = (InterfaceC0443) obj2;
        switch (i) {
            case 0:
                break;
        }
        return ((C4648) mo217(interfaceC0443, c5475)).mo218(c2358);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4648(C3536 c3536, InterfaceC0443 interfaceC0443) {
        super(2, interfaceC0443);
        this.f15335 = c3536;
    }
}
