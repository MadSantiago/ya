package p000;

/* JADX INFO: renamed from: ۥؒؒ٘ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0242 extends AbstractC0868 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥؓ */
    public final /* synthetic */ Object f900;

    /* JADX INFO: renamed from: ۥؖ */
    public Object f901;

    /* JADX INFO: renamed from: ۥَ */
    public int f902;

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ int f903;

    /* JADX INFO: renamed from: ۥٓ */
    public long[] f904;

    /* JADX INFO: renamed from: ۥٖ */
    public int f905;

    /* JADX INFO: renamed from: ۥٙ */
    public /* synthetic */ Object f906;

    /* JADX INFO: renamed from: ۥۖ */
    public long f907;

    /* JADX INFO: renamed from: ۦٕ */
    public int f908;

    /* JADX INFO: renamed from: ۦٗ */
    public int f909;

    /* JADX INFO: renamed from: ۦۛ */
    public int f910;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0242(Object obj, InterfaceC0443 interfaceC0443, int i) {
        super(2, interfaceC0443);
        this.f903 = i;
        this.f900 = obj;
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٓ */
    public final InterfaceC0443 mo217(InterfaceC0443 interfaceC0443, Object obj) {
        int i = this.f903;
        Object obj2 = this.f900;
        switch (i) {
            case 0:
                C0242 c0242 = new C0242((C0304) obj2, interfaceC0443, 0);
                c0242.f906 = obj;
                return c0242;
            case 1:
                C0242 c0243 = new C0242((C0304) obj2, interfaceC0443, 1);
                c0243.f906 = obj;
                return c0243;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                C0242 c0244 = new C0242((C0675) obj2, interfaceC0443, 2);
                c0244.f906 = obj;
                return c0244;
            default:
                C0242 c0245 = new C0242((C3753) obj2, interfaceC0443, 3);
                c0245.f906 = obj;
                return c0245;
        }
    }

    /* JADX WARN: Code duplicated, block: B:77:0x0223  */
    /* JADX WARN: Code duplicated, block: B:85:0x0270 A[DONT_INVERT, PHI: r1 r4 r5 r6 r8
  0x0270: PHI (r1v6 ۥؐٛۦ) = (r1v4 ۥؐٛۦ), (r1v8 ۥؐٛۦ) binds: [B:76:0x0221, B:84:0x026b] A[DONT_GENERATE, DONT_INLINE]
  0x0270: PHI (r4v4 long[]) = (r4v2 long[]), (r4v6 long[]) binds: [B:76:0x0221, B:84:0x026b] A[DONT_GENERATE, DONT_INLINE]
  0x0270: PHI (r5v4 int) = (r5v2 int), (r5v6 int) binds: [B:76:0x0221, B:84:0x026b] A[DONT_GENERATE, DONT_INLINE]
  0x0270: PHI (r6v2 int) = (r6v1 int), (r6v4 int) binds: [B:76:0x0221, B:84:0x026b] A[DONT_GENERATE, DONT_INLINE]
  0x0270: PHI (r8v4 ۥؓؓؓ٘) = (r8v2 ۥؓؓؓ٘), (r8v6 ۥؓؓؓ٘) binds: [B:76:0x0221, B:84:0x026b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:86:0x0272  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x006d -> B:22:0x00ac). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x006f -> B:15:0x007e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0084 -> B:19:0x00a2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00fe -> B:43:0x013e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0100 -> B:36:0x0111). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0117 -> B:40:0x0135). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x0190 -> B:64:0x01d0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x0192 -> B:57:0x01a3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x01a9 -> B:61:0x01c7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x0221 -> B:85:0x0270). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x0223 -> B:78:0x0235). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x023b -> B:82:0x0266). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٖ */
    public final java.lang.Object mo218(java.lang.Object r26) {
        /*
            Method dump skipped, instruction units count: 640
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0242.mo218(java.lang.Object):java.lang.Object");
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        int i = this.f903;
        C2358 c2358 = C2358.f7817;
        C0156 c0156 = (C0156) obj;
        InterfaceC0443 interfaceC0443 = (InterfaceC0443) obj2;
        switch (i) {
            case 0:
                break;
            case 1:
                break;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                break;
        }
        return ((C0242) mo217(interfaceC0443, c0156)).mo218(c2358);
    }
}
