package p000;

/* JADX INFO: renamed from: ۥؙٙؑۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1623 extends AbstractC0868 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥَ */
    public /* synthetic */ Object f5430;

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ int f5431;

    /* JADX INFO: renamed from: ۥٓ */
    public int f5432;

    /* JADX INFO: renamed from: ۥٖ */
    public Object f5433;

    /* JADX INFO: renamed from: ۦٗ */
    public Object f5434;

    /* JADX INFO: renamed from: ۦۛ */
    public final /* synthetic */ Object f5435;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1623(C3510 c3510, C5470 c5470, InterfaceC1126 interfaceC1126, InterfaceC0443 interfaceC0443) {
        super(2, interfaceC0443);
        this.f5431 = 2;
        this.f5433 = c3510;
        this.f5434 = c5470;
        this.f5435 = interfaceC1126;
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٓ */
    public final InterfaceC0443 mo217(InterfaceC0443 interfaceC0443, Object obj) {
        int i = this.f5431;
        Object obj2 = this.f5435;
        switch (i) {
            case 0:
                C1623 c1623 = new C1623((InterfaceC4643) this.f5434, (C4153) obj2, interfaceC0443);
                c1623.f5430 = obj;
                return c1623;
            case 1:
                C1623 c1624 = new C1623((C2384) obj2, interfaceC0443, 1);
                c1624.f5430 = obj;
                return c1624;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                C1623 c1625 = new C1623((C3510) this.f5433, (C5470) this.f5434, (InterfaceC1126) obj2, interfaceC0443);
                c1625.f5430 = obj;
                return c1625;
            default:
                C1623 c1626 = new C1623((C1135) obj2, interfaceC0443, 3);
                c1626.f5430 = obj;
                return c1626;
        }
    }

    /* JADX WARN: Code duplicated, block: B:243:0x0440  */
    /* JADX WARN: Code duplicated, block: B:245:0x0444  */
    /* JADX WARN: Code duplicated, block: B:246:0x0454  */
    /* JADX WARN: Code duplicated, block: B:248:0x045a  */
    /* JADX WARN: Code duplicated, block: B:249:0x045e  */
    /* JADX WARN: Code duplicated, block: B:302:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:136:0x0238 -> B:138:0x023c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:220:0x03bd -> B:222:0x03c1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:239:0x042d -> B:241:0x0430). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00cb -> B:38:0x00cf). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:231:0x03fa
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٖ */
    public final java.lang.Object mo218(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 1132
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1623.mo218(java.lang.Object):java.lang.Object");
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        int i = this.f5431;
        C2358 c2358 = C2358.f7817;
        C5475 c5475 = (C5475) obj;
        InterfaceC0443 interfaceC0443 = (InterfaceC0443) obj2;
        switch (i) {
            case 0:
                ((C1623) mo217(interfaceC0443, c5475)).mo218(c2358);
                return EnumC2282.f7590;
            case 1:
                return ((C1623) mo217(interfaceC0443, c5475)).mo218(c2358);
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                return ((C1623) mo217(interfaceC0443, c5475)).mo218(c2358);
            default:
                return ((C1623) mo217(interfaceC0443, c5475)).mo218(c2358);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1623(InterfaceC4643 interfaceC4643, C4153 c4153, InterfaceC0443 interfaceC0443) {
        super(2, interfaceC0443);
        this.f5431 = 0;
        this.f5434 = interfaceC4643;
        this.f5435 = c4153;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1623(Object obj, InterfaceC0443 interfaceC0443, int i) {
        super(2, interfaceC0443);
        this.f5431 = i;
        this.f5435 = obj;
    }
}
