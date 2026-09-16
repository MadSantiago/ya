package p000;

import java.util.List;

/* JADX INFO: renamed from: ۥٕ */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0023 extends AbstractC2426 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ int f4720;

    /* JADX INFO: renamed from: ۥٖ */
    public int f4721;

    /* JADX INFO: renamed from: ۦٗ */
    public /* synthetic */ Object f4722;

    /* JADX INFO: renamed from: ۦۛ */
    public final /* synthetic */ Object f4723;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0023(Object obj, Object obj2, InterfaceC0443 interfaceC0443, int i) {
        super(2, interfaceC0443);
        this.f4720 = i;
        this.f4722 = obj;
        this.f4723 = obj2;
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٓ */
    public final InterfaceC0443 mo217(InterfaceC0443 interfaceC0443, Object obj) {
        int i = this.f4720;
        Object obj2 = this.f4723;
        switch (i) {
            case 0:
                return new C0023((C2243) this.f4722, (C0266) obj2, interfaceC0443, 0);
            case 1:
                return new C0023((C2243) this.f4722, (C5116) obj2, interfaceC0443, 1);
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                return new C0023((C3969) this.f4722, (C5002) obj2, interfaceC0443, 2);
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                C0023 c0023 = new C0023((C0717) obj2, interfaceC0443, 3);
                c0023.f4722 = obj;
                return c0023;
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                C0023 c0024 = new C0023((C2453) obj2, interfaceC0443, 4);
                c0024.f4722 = obj;
                return c0024;
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                C0023 c0025 = new C0023((AbstractC0818) obj2, interfaceC0443, 5);
                c0025.f4722 = obj;
                return c0025;
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                return new C0023((EnumC4125) this.f4722, (C4153) obj2, interfaceC0443, 6);
            case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                return new C0023((C0485) this.f4722, (C2793) obj2, interfaceC0443, 7);
            case 8:
                return new C0023((C3957) this.f4722, (C1597) obj2, interfaceC0443, 8);
            case 9:
                return new C0023((C2243) this.f4722, (C1347) obj2, interfaceC0443, 9);
            case 10:
                C0023 c0026 = new C0023((AbstractC0938) obj2, interfaceC0443, 10);
                c0026.f4722 = obj;
                return c0026;
            case 11:
                C0023 c0027 = new C0023((AbstractC2029) obj2, interfaceC0443, 11);
                c0027.f4722 = obj;
                return c0027;
            case 12:
                return new C0023((InterfaceC4707) this.f4722, (C2475) obj2, interfaceC0443, 12);
            case 13:
                C0023 c0028 = new C0023((InterfaceC4783) obj2, interfaceC0443, 13);
                c0028.f4722 = obj;
                return c0028;
            case 14:
                return new C0023((ScrollCaptureCallbackC2259) this.f4722, (Runnable) obj2, interfaceC0443, 14);
            case 15:
                return new C0023((InterfaceC5731) this.f4722, (C5880) obj2, interfaceC0443, 15);
            case 16:
                return new C0023((InterfaceC5731) this.f4722, (C5450) obj2, interfaceC0443, 16);
            case 17:
                return new C0023((InterfaceC4038) this.f4722, (C3635) obj2, interfaceC0443, 17);
            case 18:
                return new C0023((InterfaceC3196) this.f4722, (C4521) obj2, interfaceC0443, 18);
            case 19:
                C0023 c0029 = new C0023((List) obj2, interfaceC0443, 19);
                c0029.f4722 = obj;
                return c0029;
            case 20:
                return new C0023((InterfaceC5731) this.f4722, (C4127) obj2, interfaceC0443, 20);
            case 21:
                C0023 c00210 = new C0023((C4482) obj2, interfaceC0443, 21);
                c00210.f4722 = obj;
                return c00210;
            case 22:
                return new C0023((C2483) this.f4722, (C0061) obj2, interfaceC0443, 22);
            case 23:
                return new C0023((C3261) this.f4722, (C1111) obj2, interfaceC0443, 23);
            case 24:
                return new C0023((C1044) this.f4722, (C1890) obj2, interfaceC0443, 24);
            case 25:
                return new C0023((C1044) this.f4722, (InterfaceC2714) obj2, interfaceC0443, 25);
            case 26:
                return new C0023((C2243) this.f4722, (InterfaceC4367) obj2, interfaceC0443, 26);
            case 27:
                return new C0023((C3990) this.f4722, (InterfaceC4745) obj2, interfaceC0443, 27);
            case 28:
                return new C0023((C3990) this.f4722, (C3637) obj2, interfaceC0443, 28);
            default:
                return new C0023((InterfaceC4038) this.f4722, (C2384) obj2, interfaceC0443, 29);
        }
    }

    /* JADX WARN: Code duplicated, block: B:361:0x0675  */
    /* JADX WARN: Code duplicated, block: B:363:0x0683  */
    /* JADX WARN: Code duplicated, block: B:365:0x068d  */
    /* JADX WARN: Code duplicated, block: B:369:0x069c  */
    /* JADX WARN: Code duplicated, block: B:371:0x06a9  */
    /* JADX WARN: Code duplicated, block: B:374:0x06b1  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:184:0x0348 -> B:187:0x034c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:364:0x068b -> B:366:0x068f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٖ */
    public final java.lang.Object mo218(java.lang.Object r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2038
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0023.mo218(java.lang.Object):java.lang.Object");
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) throws Throwable {
        int i = this.f4720;
        EnumC2282 enumC2282 = EnumC2282.f7590;
        C2358 c2358 = C2358.f7817;
        switch (i) {
            case 0:
                return ((C0023) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(c2358);
            case 1:
                return ((C0023) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(c2358);
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                return ((C0023) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(c2358);
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                ((C0023) mo217((InterfaceC0443) obj2, (C4785) obj)).mo218(c2358);
                return enumC2282;
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                return ((C0023) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(c2358);
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                return ((C0023) mo217((InterfaceC0443) obj2, (C3002) obj)).mo218(c2358);
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                return ((C0023) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(c2358);
            case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                return ((C0023) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(c2358);
            case 8:
                return ((C0023) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(c2358);
            case 9:
                return ((C0023) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(c2358);
            case 10:
                return ((C0023) mo217((InterfaceC0443) obj2, (C3002) obj)).mo218(c2358);
            case 11:
                return ((C0023) mo217((InterfaceC0443) obj2, (InterfaceC4161) obj)).mo218(c2358);
            case 12:
                return ((C0023) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(c2358);
            case 13:
                return ((C0023) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(c2358);
            case 14:
                return ((C0023) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(c2358);
            case 15:
                return ((C0023) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(c2358);
            case 16:
                return ((C0023) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(c2358);
            case 17:
                return ((C0023) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(c2358);
            case 18:
                ((C0023) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(c2358);
                return enumC2282;
            case 19:
                return ((C0023) mo217((InterfaceC0443) obj2, (C1058) obj)).mo218(c2358);
            case 20:
                return ((C0023) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(c2358);
            case 21:
                return ((C0023) mo217((InterfaceC0443) obj2, (C1429) obj)).mo218(c2358);
            case 22:
                return ((C0023) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(c2358);
            case 23:
                return ((C0023) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(c2358);
            case 24:
                return ((C0023) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(c2358);
            case 25:
                return ((C0023) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(c2358);
            case 26:
                return ((C0023) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(c2358);
            case 27:
                return ((C0023) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(c2358);
            case 28:
                return ((C0023) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(c2358);
            default:
                return ((C0023) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(c2358);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0023(Object obj, InterfaceC0443 interfaceC0443, int i) {
        super(2, interfaceC0443);
        this.f4720 = i;
        this.f4723 = obj;
    }
}
