package p000;

/* JADX INFO: renamed from: ۥ٘ؗۡؓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1614 extends AbstractC2426 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ int f5414 = 1;

    /* JADX INFO: renamed from: ۥٖ */
    public C5450 f5415;

    /* JADX INFO: renamed from: ۥۖ */
    public /* synthetic */ Object f5416;

    /* JADX INFO: renamed from: ۦٕ */
    public final /* synthetic */ AbstractC4485 f5417;

    /* JADX INFO: renamed from: ۦٗ */
    public C5450 f5418;

    /* JADX INFO: renamed from: ۦۛ */
    public int f5419;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1614(C5450 c5450, AbstractC4485 abstractC4485, InterfaceC0443 interfaceC0443) {
        super(2, interfaceC0443);
        this.f5418 = c5450;
        this.f5417 = abstractC4485;
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٓ */
    public final InterfaceC0443 mo217(InterfaceC0443 interfaceC0443, Object obj) {
        int i = this.f5414;
        AbstractC4485 abstractC4485 = this.f5417;
        switch (i) {
            case 0:
                C1614 c1614 = new C1614(this.f5418, abstractC4485, interfaceC0443);
                c1614.f5416 = obj;
                return c1614;
            default:
                C1614 c1615 = new C1614(abstractC4485, interfaceC0443);
                c1615.f5416 = obj;
                return c1615;
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003a A[PHI: r0 r3
  0x003a: PHI (r0v13 ۦؙۡؒۘ) = (r0v5 ۦؙۡؒۘ), (r0v17 ۦؙۡؒۘ) binds: [B:14:0x0037, B:37:0x00af] A[DONT_GENERATE, DONT_INLINE]
  0x003a: PHI (r3v15 ۦٖٛؗٔ) = (r3v13 ۦٖٛؗٔ), (r3v16 ۦٖٛؗٔ) binds: [B:14:0x0037, B:37:0x00af] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x005e A[PHI: r7
  0x005e: PHI (r7v14 ۦٖٛؗٔ) = (r7v7 ۦٖٛؗٔ), (r7v10 ۦٖٛؗٔ), (r7v10 ۦٖٛؗٔ), (r7v10 ۦٖٛؗٔ), (r7v12 ۦٖٛؗٔ), (r7v15 ۦٖٛؗٔ) binds: [B:19:0x0056, B:46:0x00cc, B:48:0x00d9, B:42:0x00c5, B:31:0x0089, B:12:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x0064  */
    /* JADX WARN: Code duplicated, block: B:24:0x006d  */
    /* JADX WARN: Code duplicated, block: B:27:0x007d  */
    /* JADX WARN: Code duplicated, block: B:32:0x008b  */
    /* JADX WARN: Code duplicated, block: B:35:0x009d  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ca A[Catch: CancellationException -> 0x00c8, TryCatch #2 {CancellationException -> 0x00c8, blocks: (B:39:0x00b2, B:41:0x00b8, B:45:0x00ca, B:47:0x00ce), top: B:85:0x00b2 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00ce A[Catch: CancellationException -> 0x00c8, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x00c8, blocks: (B:39:0x00b2, B:41:0x00b8, B:45:0x00ca, B:47:0x00ce), top: B:85:0x00b2 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0110  */
    /* JADX WARN: Code duplicated, block: B:89:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0089 -> B:20:0x005e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00c5 -> B:20:0x005e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00cc -> B:20:0x005e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00d9 -> B:20:0x005e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x00e7 -> B:12:0x002f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:75:0x0133 -> B:76:0x0134). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x0137 -> B:78:0x0139). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٖ */
    public final java.lang.Object mo218(java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 342
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1614.mo218(java.lang.Object):java.lang.Object");
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        int i = this.f5414;
        C2358 c2358 = C2358.f7817;
        switch (i) {
            case 0:
                return ((C1614) mo217((InterfaceC0443) obj2, (InterfaceC4745) obj)).mo218(c2358);
            default:
                return ((C1614) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(c2358);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1614(AbstractC4485 abstractC4485, InterfaceC0443 interfaceC0443) {
        super(2, interfaceC0443);
        this.f5417 = abstractC4485;
    }
}
