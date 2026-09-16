package p000;

/* JADX INFO: renamed from: ۥؘَ٘ؓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1562 extends AbstractC0868 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥؓ */
    public final /* synthetic */ C4657 f5254;

    /* JADX INFO: renamed from: ۥؖ */
    public /* synthetic */ Object f5255;

    /* JADX INFO: renamed from: ۥَ */
    public long[] f5256;

    /* JADX INFO: renamed from: ۥْ */
    public C0754 f5257;

    /* JADX INFO: renamed from: ۥٓ */
    public C4657 f5258;

    /* JADX INFO: renamed from: ۥٖ */
    public int f5259;

    /* JADX INFO: renamed from: ۥٙ */
    public int f5260;

    /* JADX INFO: renamed from: ۥۖ */
    public int f5261;

    /* JADX INFO: renamed from: ۥۧ */
    public final /* synthetic */ C0754 f5262;

    /* JADX INFO: renamed from: ۦٕ */
    public long f5263;

    /* JADX INFO: renamed from: ۦٗ */
    public int f5264;

    /* JADX INFO: renamed from: ۦۛ */
    public int f5265;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1562(C4657 c4657, C0754 c0754, InterfaceC0443 interfaceC0443) {
        super(2, interfaceC0443);
        this.f5254 = c4657;
        this.f5262 = c0754;
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٓ */
    public final InterfaceC0443 mo217(InterfaceC0443 interfaceC0443, Object obj) {
        C1562 c1562 = new C1562(this.f5254, this.f5262, interfaceC0443);
        c1562.f5255 = obj;
        return c1562;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0051  */
    /* JADX WARN: Code duplicated, block: B:20:0x0097 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x0099  */
    /* JADX WARN: Code duplicated, block: B:23:0x00a1  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x004f -> B:22:0x009f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0051 -> B:14:0x0064). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x006d -> B:19:0x0094). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٖ */
    public final java.lang.Object mo218(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            int r1 = r0.f5260
            r2 = 0
            r3 = 8
            r4 = 1
            if (r1 == 0) goto L2c
            if (r1 != r4) goto L25
            int r1 = r0.f5261
            int r5 = r0.f5265
            long r6 = r0.f5263
            int r8 = r0.f5264
            int r9 = r0.f5259
            long[] r10 = r0.f5256
            ۦٛۙٛ r11 = r0.f5258
            ۥؙٟؗٝ r12 = r0.f5257
            java.lang.Object r13 = r0.f5255
            ۥؐٛۦ r13 = (p000.C0156) r13
            p000.AbstractC0186.m409(r21)
            goto L94
        L25:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            p000.C1078.m2276(r0)
            r0 = 0
            return r0
        L2c:
            p000.AbstractC0186.m409(r21)
            java.lang.Object r1 = r0.f5255
            ۥؐٛۦ r1 = (p000.C0156) r1
            ۦٛۙٛ r5 = r0.f5254
            ۦًٜؑۙ r6 = r5.f15353
            long[] r6 = r6.f12175
            int r7 = r6.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto La4
            ۥؙٟؗٝ r8 = r0.f5262
            r9 = r2
        L41:
            r10 = r6[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L9f
            int r12 = r9 - r7
            int r12 = ~r12
            int r12 = r12 >>> 31
            int r12 = 8 - r12
            r13 = r1
            r1 = r2
            r18 = r10
            r11 = r5
            r10 = r6
            r5 = r12
            r12 = r8
            r8 = r9
            r9 = r7
            r6 = r18
        L64:
            if (r1 >= r5) goto L97
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r6
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L94
            int r2 = r8 << 3
            int r2 = r2 + r1
            r12.f2739 = r2
            ۦًٜؑۙ r3 = r11.f15353
            java.lang.Object[] r3 = r3.f12174
            r2 = r3[r2]
            r0.f5255 = r13
            r0.f5257 = r12
            r0.f5258 = r11
            r0.f5256 = r10
            r0.f5259 = r9
            r0.f5264 = r8
            r0.f5263 = r6
            r0.f5265 = r5
            r0.f5261 = r1
            r0.f5260 = r4
            r13.m336(r0, r2)
            ۥٟۚؕۨ r0 = p000.EnumC2282.f7590
            return r0
        L94:
            long r6 = r6 >> r3
            int r1 = r1 + r4
            goto L64
        L97:
            if (r5 != r3) goto La4
            r7 = r9
            r6 = r10
            r5 = r11
            r1 = r13
            r9 = r8
            r8 = r12
        L9f:
            if (r9 == r7) goto La4
            int r9 = r9 + 1
            goto L41
        La4:
            ۥۜؑؒؑ r0 = p000.C2358.f7817
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1562.mo218(java.lang.Object):java.lang.Object");
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        return ((C1562) mo217((InterfaceC0443) obj2, (C0156) obj)).mo218(C2358.f7817);
    }
}
