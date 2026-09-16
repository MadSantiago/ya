package p000;

/* JADX INFO: renamed from: ۦٗؖؑۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4372 extends AbstractC0868 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥَ */
    public int f14406;

    /* JADX INFO: renamed from: ۥْ */
    public C5639 f14407;

    /* JADX INFO: renamed from: ۥٓ */
    public int f14408;

    /* JADX INFO: renamed from: ۥٖ */
    public /* synthetic */ Object f14409;

    /* JADX INFO: renamed from: ۥۖ */
    public final /* synthetic */ C5450 f14410;

    /* JADX INFO: renamed from: ۦٗ */
    public final /* synthetic */ C5662 f14411;

    /* JADX INFO: renamed from: ۦۛ */
    public final /* synthetic */ C5450 f14412;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4372(C5662 c5662, C5450 c5450, C5450 c5451, InterfaceC0443 interfaceC0443) {
        super(2, interfaceC0443);
        this.f14411 = c5662;
        this.f14412 = c5450;
        this.f14410 = c5451;
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٓ */
    public final InterfaceC0443 mo217(InterfaceC0443 interfaceC0443, Object obj) {
        C4372 c4372 = new C4372(this.f14411, this.f14412, this.f14410, interfaceC0443);
        c4372.f14409 = obj;
        return c4372;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0058  */
    /* JADX WARN: Code duplicated, block: B:20:0x0065 A[LOOP:2: B:16:0x0056->B:20:0x0065, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:73:0x0068 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x0069 A[EDGE_INSN: B:74:0x0069->B:22:0x0069 BREAK  A[LOOP:2: B:16:0x0056->B:20:0x0065], SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00af -> B:39:0x00b2). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٖ */
    public final java.lang.Object mo218(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 308
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C4372.mo218(java.lang.Object):java.lang.Object");
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        return ((C4372) mo217((InterfaceC0443) obj2, (C5475) obj)).mo218(C2358.f7817);
    }
}
