package p000;

/* JADX INFO: renamed from: ۥَٕؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0565 extends AbstractC0868 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥَ */
    public /* synthetic */ Object f2030;

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ int f2031;

    /* JADX INFO: renamed from: ۥٓ */
    public int f2032;

    /* JADX INFO: renamed from: ۥٖ */
    public final /* synthetic */ Object f2033;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0565(Object obj, InterfaceC0443 interfaceC0443, int i) {
        super(2, interfaceC0443);
        this.f2031 = i;
        this.f2033 = obj;
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٓ */
    public final InterfaceC0443 mo217(InterfaceC0443 interfaceC0443, Object obj) {
        int i = this.f2031;
        Object obj2 = this.f2033;
        switch (i) {
            case 0:
                C0565 c0565 = new C0565((C2851) obj2, interfaceC0443, 0);
                c0565.f2030 = obj;
                return c0565;
            case 1:
                C0565 c0566 = new C0565((EnumC3834) obj2, interfaceC0443, 1);
                c0566.f2030 = obj;
                return c0566;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                C0565 c0567 = new C0565((InterfaceC4745) obj2, interfaceC0443, 2);
                c0567.f2030 = obj;
                return c0567;
            default:
                C0565 c0568 = new C0565((C5149) obj2, interfaceC0443, 3);
                c0568.f2030 = obj;
                return c0568;
        }
    }

    /* JADX WARN: Code duplicated, block: B:62:0x0134  */
    /* JADX WARN: Code duplicated, block: B:65:0x0146 A[LOOP:1: B:61:0x0132->B:65:0x0146, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:80:0x014a A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0037 -> B:13:0x003a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x0104 -> B:54:0x0108). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٖ */
    public final java.lang.Object mo218(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 372
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0565.mo218(java.lang.Object):java.lang.Object");
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        int i = this.f2031;
        C2358 c2358 = C2358.f7817;
        C5475 c5475 = (C5475) obj;
        InterfaceC0443 interfaceC0443 = (InterfaceC0443) obj2;
        switch (i) {
            case 0:
                return ((C0565) mo217(interfaceC0443, c5475)).mo218(c2358);
            case 1:
                return ((C0565) mo217(interfaceC0443, c5475)).mo218(c2358);
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                return ((C0565) mo217(interfaceC0443, c5475)).mo218(c2358);
            default:
                ((C0565) mo217(interfaceC0443, c5475)).mo218(c2358);
                return EnumC2282.f7590;
        }
    }
}
