package p000;

import android.net.Uri;
import android.view.InputEvent;
import java.io.File;

/* JADX INFO: renamed from: ۦؙ */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0061 extends AbstractC2426 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ int f11661;

    /* JADX INFO: renamed from: ۥٖ */
    public int f11662;

    /* JADX INFO: renamed from: ۥۖ */
    public final /* synthetic */ Object f11663;

    /* JADX INFO: renamed from: ۦٗ */
    public Object f11664;

    /* JADX INFO: renamed from: ۦۛ */
    public Object f11665;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0061(C2243 c2243, C1044 c1044, InterfaceC0443 interfaceC0443) {
        super(2, interfaceC0443);
        this.f11661 = 17;
        this.f11664 = c2243;
        this.f11663 = c1044;
    }

    /* JADX INFO: renamed from: ۥۖ */
    private final Object m6313(Object obj) {
        int i = this.f11662;
        if (i == 0) {
            AbstractC0186.m409(obj);
            InterfaceC1437 interfaceC1437 = (InterfaceC1437) this.f11664;
            C4545 c4545 = (C4545) this.f11665;
            c4545.f15021 = interfaceC1437;
            InterfaceC5731 interfaceC5731 = (InterfaceC5731) this.f11663;
            C3594 c3594 = c4545.f15017;
            this.f11662 = 1;
            Object objMo219 = interfaceC5731.mo219(c3594, this);
            EnumC2282 enumC2282 = EnumC2282.f7590;
            if (objMo219 == enumC2282) {
                return enumC2282;
            }
        } else {
            if (i != 1) {
                C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC0186.m409(obj);
        }
        return C2358.f7817;
    }

    /* JADX INFO: renamed from: ۦۛ */
    private final Object m6314(Object obj) {
        C3529 c3529;
        int i = this.f11662;
        if (i == 0) {
            AbstractC0186.m409(obj);
            InterfaceC4643 interfaceC4643 = (InterfaceC4643) this.f11664;
            C3529 c35210 = (C3529) this.f11665;
            InterfaceC5731 interfaceC5731 = (InterfaceC5731) this.f11663;
            try {
                this.f11664 = c35210;
                this.f11662 = 1;
                obj = interfaceC5731.mo219(interfaceC4643, this);
                EnumC2282 enumC2282 = EnumC2282.f7590;
                if (obj == enumC2282) {
                    return enumC2282;
                }
                c3529 = c35210;
            } catch (Throwable th) {
                th = th;
                c3529 = c35210;
                obj = new C4535(th);
            }
        } else {
            if (i != 1) {
                C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c3529 = (C3529) this.f11664;
            try {
                AbstractC0186.m409(obj);
            } catch (Throwable th2) {
                th = th2;
                obj = new C4535(th);
            }
        }
        Throwable thM405 = AbstractC0183.m405(obj);
        if (thM405 == null) {
            c3529.m854(obj);
        } else {
            c3529.getClass();
            c3529.m854(new C5036(thM405, false));
        }
        return C2358.f7817;
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٓ */
    public final InterfaceC0443 mo217(InterfaceC0443 interfaceC0443, Object obj) {
        int i = this.f11661;
        Object obj2 = this.f11663;
        switch (i) {
            case 0:
                return new C0061((C2243) this.f11664, (C0199) this.f11665, (InterfaceC4883) obj2, interfaceC0443, 0);
            case 1:
                return new C0061((InterfaceC5731) this.f11664, this.f11665, (InterfaceC4643) obj2, interfaceC0443, 1);
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                C0061 c0061 = new C0061((InterfaceC4448) this.f11665, (InterfaceC5731) obj2, interfaceC0443, 2);
                c0061.f11664 = obj;
                return c0061;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                C0061 c0062 = new C0061((InterfaceC2609) this.f11665, (C4536) obj2, interfaceC0443, 3);
                c0062.f11664 = obj;
                return c0062;
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                C0061 c0063 = new C0061((InterfaceC3275) this.f11665, (C4536) obj2, interfaceC0443, 4);
                c0063.f11664 = obj;
                return c0063;
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                C0061 c0064 = new C0061((C0777) this.f11665, (InterfaceC4367) obj2, interfaceC0443, 5);
                c0064.f11664 = obj;
                return c0064;
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                return new C0061((C4994) this.f11665, (C4153) obj2, interfaceC0443, 6);
            case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                return new C0061((C1705) this.f11664, (C1542) this.f11665, (C1347) obj2, interfaceC0443, 7);
            case 8:
                return new C0061((C3957) this.f11664, (AbstractC1311) this.f11665, (C5304) obj2, interfaceC0443, 8);
            case 9:
                C0061 c0065 = new C0061((InterfaceC4161) this.f11665, (AbstractC0938) obj2, interfaceC0443, 9);
                c0065.f11664 = obj;
                return c0065;
            case 10:
                return new C0061((C5450) this.f11665, (C4736) obj2, interfaceC0443, 10);
            case 11:
                C0061 c0066 = new C0061((C4482) obj2, interfaceC0443, 11);
                c0066.f11665 = obj;
                return c0066;
            case 12:
                C0061 c0067 = new C0061((C4482) this.f11665, (InterfaceC5731) obj2, interfaceC0443, 12);
                c0067.f11664 = obj;
                return c0067;
            case 13:
                C0061 c0068 = new C0061((C1392) this.f11665, (InterfaceC5731) obj2, interfaceC0443, 13);
                c0068.f11664 = obj;
                return c0068;
            case 14:
                return new C0061((C1392) this.f11664, (EnumC4386) this.f11665, (InterfaceC5731) obj2, interfaceC0443, 14);
            case 15:
                C0061 c0069 = new C0061((C1614) this.f11665, (C3923) obj2, interfaceC0443, 15);
                c0069.f11664 = obj;
                return c0069;
            case 16:
                C0061 c00610 = new C0061((C3923) this.f11665, (C0457) obj2, interfaceC0443, 16);
                c00610.f11664 = obj;
                return c00610;
            case 17:
                C0061 c00611 = new C0061((C2243) this.f11664, (C1044) obj2, interfaceC0443);
                c00611.f11665 = obj;
                return c00611;
            case 18:
                return new C0061((C2243) this.f11664, (InterfaceC2714) this.f11665, (InterfaceC4883) obj2, interfaceC0443, 18);
            case 19:
                return new C0061((C5559) obj2, interfaceC0443, 19);
            case 20:
                C0061 c00612 = new C0061((C1502) this.f11665, (C4206) obj2, interfaceC0443, 20);
                c00612.f11664 = obj;
                return c00612;
            case 21:
                return new C0061((C5424) this.f11664, (Uri) this.f11665, (InputEvent) obj2, interfaceC0443, 21);
            case 22:
                return new C0061((String[]) this.f11665, (C5024) obj2, interfaceC0443, 22);
            case 23:
                C0061 c00613 = new C0061((File) obj2, interfaceC0443, 23);
                c00613.f11665 = obj;
                return c00613;
            case 24:
                C0061 c00614 = new C0061((C4628) this.f11665, (C5151) obj2, interfaceC0443, 24);
                c00614.f11664 = obj;
                return c00614;
            case 25:
                C0061 c00615 = new C0061((C4602) this.f11665, (C2404) obj2, interfaceC0443, 25);
                c00615.f11664 = obj;
                return c00615;
            case 26:
                C0061 c00616 = new C0061((C3529) this.f11665, (InterfaceC5731) obj2, interfaceC0443, 26);
                c00616.f11664 = obj;
                return c00616;
            case 27:
                C0061 c00617 = new C0061((C1614) this.f11665, (C4545) obj2, interfaceC0443, 27);
                c00617.f11664 = obj;
                return c00617;
            case 28:
                C0061 c00618 = new C0061((C4545) this.f11665, (InterfaceC5731) obj2, interfaceC0443, 28);
                c00618.f11664 = obj;
                return c00618;
            default:
                C0061 c00619 = new C0061((InterfaceC5372) this.f11665, (C5825) obj2, interfaceC0443, 29);
                c00619.f11664 = obj;
                return c00619;
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0375 */
    /* JADX WARN: Code duplicated, block: B:179:0x0397  */
    /* JADX WARN: Code duplicated, block: B:182:0x03a1 A[Catch: all -> 0x0375, TryCatch #4 {, blocks: (B:170:0x036f, B:180:0x0399, B:182:0x03a1, B:183:0x03ae, B:190:0x03be, B:177:0x038b, B:192:0x03c1, B:194:0x03c6, B:195:0x03c7, B:176:0x0386, B:184:0x03af, B:186:0x03b5), top: B:522:0x0363, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:186:0x03b5 A[Catch: all -> 0x03c5, TRY_LEAVE, TryCatch #3 {all -> 0x03c5, blocks: (B:184:0x03af, B:186:0x03b5), top: B:520:0x03af, outer: #4 }] */
    /* JADX WARN: Code duplicated, block: B:192:0x03c1 A[Catch: all -> 0x0375, TryCatch #4 {, blocks: (B:170:0x036f, B:180:0x0399, B:182:0x03a1, B:183:0x03ae, B:190:0x03be, B:177:0x038b, B:192:0x03c1, B:194:0x03c6, B:195:0x03c7, B:176:0x0386, B:184:0x03af, B:186:0x03b5), top: B:522:0x0363, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:328:0x069b  */
    /* JADX WARN: Code duplicated, block: B:331:0x06a2  */
    /* JADX WARN: Code duplicated, block: B:334:0x06a7  */
    /* JADX WARN: Code duplicated, block: B:401:0x07fe  */
    /* JADX WARN: Code duplicated, block: B:520:0x03af A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:186:0x03b5, B:189:0x03bd], limit reached: 586 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v56, types: [ۦؚٚؓٓ] */
    /* JADX WARN: Type inference failed for: r3v58, types: [ۦۢؗۖؐ] */
    /* JADX WARN: Type inference failed for: r3v59, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v60, types: [ۦؚٚؓٓ] */
    /* JADX WARN: Type inference failed for: r3v86 */
    /* JADX WARN: Type inference failed for: r3v87 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:178:0x0395 -> B:180:0x0399). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٖ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo218(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 2706
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0061.mo218(java.lang.Object):java.lang.Object");
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        int i = this.f11661;
        C2358 c2358 = C2358.f7817;
        switch (i) {
            case 0:
                return ((C0061) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(c2358);
            case 1:
                return ((C0061) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(c2358);
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                return ((C0061) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(c2358);
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                return ((C0061) mo217((InterfaceC0443) obj2, (C3402) obj)).mo218(c2358);
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                return ((C0061) mo217((InterfaceC0443) obj2, (C3869) obj)).mo218(c2358);
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                return ((C0061) mo217((InterfaceC0443) obj2, (C5305) obj)).mo218(c2358);
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                return ((C0061) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(c2358);
            case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                return ((C0061) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(c2358);
            case 8:
                return ((C0061) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(c2358);
            case 9:
                return ((C0061) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(c2358);
            case 10:
                return ((C0061) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(c2358);
            case 11:
                return ((C0061) mo217((InterfaceC0443) obj2, (InterfaceC4161) obj)).mo218(c2358);
            case 12:
                return ((C0061) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(c2358);
            case 13:
                return ((C0061) mo217((InterfaceC0443) obj2, (InterfaceC1437) obj)).mo218(c2358);
            case 14:
                return ((C0061) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(c2358);
            case 15:
                return ((C0061) mo217((InterfaceC0443) obj2, (C0570) obj)).mo218(c2358);
            case 16:
                return ((C0061) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(c2358);
            case 17:
                return ((C0061) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(c2358);
            case 18:
                return ((C0061) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(c2358);
            case 19:
                return ((C0061) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(c2358);
            case 20:
                return ((C0061) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(c2358);
            case 21:
                return ((C0061) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(c2358);
            case 22:
                return ((C0061) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(c2358);
            case 23:
                return ((C0061) mo217((InterfaceC0443) obj2, (C3002) obj)).mo218(c2358);
            case 24:
                return ((C0061) mo217((InterfaceC0443) obj2, (C3002) obj)).mo218(c2358);
            case 25:
                return ((C0061) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(c2358);
            case 26:
                return ((C0061) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(c2358);
            case 27:
                return ((C0061) mo217((InterfaceC0443) obj2, (C3594) obj)).mo218(c2358);
            case 28:
                return ((C0061) mo217((InterfaceC0443) obj2, (InterfaceC1437) obj)).mo218(c2358);
            default:
                return ((C0061) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(c2358);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0061(Object obj, InterfaceC0443 interfaceC0443, int i) {
        super(2, interfaceC0443);
        this.f11661 = i;
        this.f11663 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0061(Object obj, Object obj2, InterfaceC0443 interfaceC0443, int i) {
        super(2, interfaceC0443);
        this.f11661 = i;
        this.f11665 = obj;
        this.f11663 = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0061(Object obj, Object obj2, Object obj3, InterfaceC0443 interfaceC0443, int i) {
        super(2, interfaceC0443);
        this.f11661 = i;
        this.f11664 = obj;
        this.f11665 = obj2;
        this.f11663 = obj3;
    }
}
