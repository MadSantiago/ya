package p000;

/* JADX INFO: renamed from: ۦۥٕٕؒ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5696 extends AbstractC2426 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥؓ */
    public final /* synthetic */ InterfaceC4707[] f18739;

    /* JADX INFO: renamed from: ۥؖ */
    public /* synthetic */ Object f18740;

    /* JADX INFO: renamed from: ۥً */
    public final /* synthetic */ C0629 f18741;

    /* JADX INFO: renamed from: ۥَ */
    public Object[] f18742;

    /* JADX INFO: renamed from: ۥٖ */
    public InterfaceC4541 f18743;

    /* JADX INFO: renamed from: ۥٙ */
    public int f18744;

    /* JADX INFO: renamed from: ۥۖ */
    public int f18745;

    /* JADX INFO: renamed from: ۥۧ */
    public final /* synthetic */ C2767 f18746;

    /* JADX INFO: renamed from: ۦٕ */
    public int f18747;

    /* JADX INFO: renamed from: ۦٗ */
    public byte[] f18748;

    /* JADX INFO: renamed from: ۦٚ */
    public final /* synthetic */ InterfaceC4161 f18749;

    /* JADX INFO: renamed from: ۦۛ */
    public int f18750;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5696(InterfaceC4707[] interfaceC4707Arr, C2767 c2767, C0629 c0629, InterfaceC4161 interfaceC4161, InterfaceC0443 interfaceC0443) {
        super(2, interfaceC0443);
        this.f18739 = interfaceC4707Arr;
        this.f18746 = c2767;
        this.f18741 = c0629;
        this.f18749 = interfaceC4161;
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٓ */
    public final InterfaceC0443 mo217(InterfaceC0443 interfaceC0443, Object obj) {
        C5696 c5696 = new C5696(this.f18739, this.f18746, this.f18741, this.f18749, interfaceC0443);
        c5696.f18740 = obj;
        return c5696;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:34:0x00bb A[DONT_INVERT, EDGE_INSN: B:34:0x00bb->B:20:0x0078 BREAK  A[LOOP:0: B:27:0x009c->B:40:?]] */
    /* JADX WARN: Code duplicated, block: B:35:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:39:0x00bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:? A[LOOP:0: B:27:0x009c->B:40:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00e3 -> B:20:0x0078). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٖ */
    public final java.lang.Object mo218(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C5696.mo218(java.lang.Object):java.lang.Object");
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        return ((C5696) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(C2358.f7817);
    }
}
