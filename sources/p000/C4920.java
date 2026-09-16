package p000;

/* JADX INFO: renamed from: ۦۖؕٞۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4920 extends AbstractC0868 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥَ */
    public int f16223;

    /* JADX INFO: renamed from: ۥْ */
    public long[] f16224;

    /* JADX INFO: renamed from: ۥٓ */
    public int f16225;

    /* JADX INFO: renamed from: ۥٖ */
    public int f16226;

    /* JADX INFO: renamed from: ۦٗ */
    public /* synthetic */ Object f16227;

    /* JADX INFO: renamed from: ۦۛ */
    public final /* synthetic */ C5570 f16228;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4920(C5570 c5570, InterfaceC0443 interfaceC0443) {
        super(2, interfaceC0443);
        this.f16228 = c5570;
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٓ */
    public final InterfaceC0443 mo217(InterfaceC0443 interfaceC0443, Object obj) {
        C4920 c4920 = new C4920(this.f16228, interfaceC0443);
        c4920.f16227 = obj;
        return c4920;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0078  */
    /* JADX WARN: Code duplicated, block: B:24:0x0080  */
    /* JADX WARN: Code duplicated, block: B:27:0x0095  */
    /* JADX WARN: Code duplicated, block: B:30:0x009a  */
    /* JADX WARN: Code duplicated, block: B:32:0x009e  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:36:0x00bc  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x007e -> B:26:0x0093). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00bc -> B:37:0x00be). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:27:0x0095
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٖ */
    public final java.lang.Object mo218(java.lang.Object r23) {
        /*
            r22 = this;
            r0 = r22
            ۦًۢٔ r1 = r0.f16228
            long r2 = r1.f18396
            long r4 = r1.f18393
            long r6 = r1.f18395
            int r8 = r0.f16226
            r9 = 0
            r12 = 64
            r13 = 3
            r14 = 2
            r16 = 0
            r18 = 1
            r10 = 1
            ۥٟۚؕۨ r11 = p000.EnumC2282.f7590
            if (r8 == 0) goto L4b
            if (r8 == r10) goto L3c
            if (r8 == r14) goto L32
            if (r8 != r13) goto L2c
            int r1 = r0.f16225
            java.lang.Object r6 = r0.f16227
            ۥؐٛۦ r6 = (p000.C0156) r6
            p000.AbstractC0186.m409(r23)
            r7 = r13
            goto Lbe
        L2c:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            p000.C1078.m2276(r0)
            return r9
        L32:
            int r1 = r0.f16225
            java.lang.Object r8 = r0.f16227
            ۥؐٛۦ r8 = (p000.C0156) r8
            p000.AbstractC0186.m409(r23)
            goto L93
        L3c:
            int r1 = r0.f16223
            int r8 = r0.f16225
            long[] r15 = r0.f16224
            java.lang.Object r13 = r0.f16227
            ۥؐٛۦ r13 = (p000.C0156) r13
            p000.AbstractC0186.m409(r23)
            int r8 = r8 + r10
            goto L59
        L4b:
            p000.AbstractC0186.m409(r23)
            java.lang.Object r8 = r0.f16227
            r13 = r8
            ۥؐٛۦ r13 = (p000.C0156) r13
            long[] r15 = r1.f18394
            if (r15 == 0) goto L70
            int r1 = r15.length
            r8 = 0
        L59:
            if (r8 >= r1) goto L70
            r2 = r15[r8]
            java.lang.Long r4 = new java.lang.Long
            r4.<init>(r2)
            r0.f16227 = r13
            r0.f16224 = r15
            r0.f16225 = r8
            r0.f16223 = r1
            r0.f16226 = r10
            r13.m336(r0, r4)
            return r11
        L70:
            int r1 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r1 == 0) goto L96
            r8 = r13
            r1 = 0
        L76:
            if (r1 >= r12) goto L95
            long r20 = r18 << r1
            long r20 = r6 & r20
            int r13 = (r20 > r16 ? 1 : (r20 == r16 ? 0 : -1))
            if (r13 == 0) goto L93
            long r2 = (long) r1
            long r4 = r4 + r2
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r4)
            r0.f16227 = r8
            r0.f16224 = r9
            r0.f16225 = r1
            r0.f16226 = r14
            r8.m336(r0, r2)
            return r11
        L93:
            int r1 = r1 + r10
            goto L76
        L95:
            r13 = r8
        L96:
            int r1 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r1 == 0) goto Lc1
            r6 = r13
            r15 = 0
        L9c:
            if (r15 >= r12) goto Lc1
            long r7 = r18 << r15
            long r7 = r7 & r2
            int r1 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r1 == 0) goto Lbc
            long r1 = (long) r15
            long r4 = r4 + r1
            r1 = 64
            long r4 = r4 + r1
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r4)
            r0.f16227 = r6
            r0.f16224 = r9
            r0.f16225 = r15
            r7 = 3
            r0.f16226 = r7
            r6.m336(r0, r1)
            return r11
        Lbc:
            r7 = 3
            r1 = r15
        Lbe:
            int r15 = r1 + 1
            goto L9c
        Lc1:
            ۥۜؑؒؑ r0 = p000.C2358.f7817
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C4920.mo218(java.lang.Object):java.lang.Object");
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        return ((C4920) mo217((InterfaceC0443) obj2, (C0156) obj)).mo218(C2358.f7817);
    }
}
