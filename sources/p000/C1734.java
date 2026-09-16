package p000;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.ScrollCaptureSession;
import androidx.work.Worker;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

/* JADX INFO: renamed from: ۥٚؖؔۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1734 extends AbstractC2426 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ int f5763;

    /* JADX INFO: renamed from: ۥٖ */
    public int f5764;

    /* JADX INFO: renamed from: ۥۖ */
    public Object f5765;

    /* JADX INFO: renamed from: ۦٕ */
    public final /* synthetic */ Object f5766;

    /* JADX INFO: renamed from: ۦٗ */
    public Object f5767;

    /* JADX INFO: renamed from: ۦۛ */
    public Object f5768;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1734(Object obj, Object obj2, Object obj3, Object obj4, InterfaceC0443 interfaceC0443, int i) {
        super(2, interfaceC0443);
        this.f5763 = i;
        this.f5767 = obj;
        this.f5768 = obj2;
        this.f5765 = obj3;
        this.f5766 = obj4;
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٓ */
    public final InterfaceC0443 mo217(InterfaceC0443 interfaceC0443, Object obj) {
        int i = this.f5763;
        Object obj2 = this.f5766;
        switch (i) {
            case 0:
                C1734 c1734 = new C1734((InterfaceC4745) this.f5768, (C3969) this.f5765, (C4306) obj2, interfaceC0443, 0);
                c1734.f5767 = obj;
                return c1734;
            case 1:
                return new C1734(this.f5767, (C5825) this.f5768, (InterfaceC4367) this.f5765, (InterfaceC4367) obj2, interfaceC0443, 1);
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                return new C1734((ScrollCaptureCallbackC2259) this.f5767, (ScrollCaptureSession) this.f5768, (Rect) this.f5765, (Consumer) obj2, interfaceC0443, 2);
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                return new C1734((Activity) this.f5765, (InterfaceC4448) obj2, interfaceC0443, 3);
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                C1734 c1735 = new C1734((InterfaceC4707) this.f5768, (C4994) this.f5765, (Float) obj2, interfaceC0443, 4);
                c1735.f5767 = obj;
                return c1735;
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                return new C1734((C1901) this.f5767, (InterfaceC4707) this.f5768, (C4994) this.f5765, (Float) obj2, interfaceC0443, 5);
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                return new C1734((C0385) this.f5765, (InterfaceC5731) obj2, interfaceC0443, 6);
            case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                return new C1734((C1769) this.f5767, (Map) this.f5768, (C5030) this.f5765, (C5215) obj2, interfaceC0443, 7);
            case 8:
                C1734 c1736 = new C1734((InterfaceC4745) this.f5768, (AtomicReference) this.f5765, (InterfaceC5731) obj2, interfaceC0443, 8);
                c1736.f5767 = obj;
                return c1736;
            case 9:
                C1734 c1737 = new C1734((C5484) obj2, interfaceC0443);
                c1737.f5767 = obj;
                return c1737;
            case 10:
                C1734 c1738 = new C1734((C3757) this.f5768, (int[]) this.f5765, (String[]) obj2, interfaceC0443, 10);
                c1738.f5767 = obj;
                return c1738;
            case 11:
                return new C1734((C5450) this.f5767, (C0469) this.f5768, (InterfaceC4507) this.f5765, (C0786) obj2, interfaceC0443, 11);
            default:
                return new C1734((Worker) this.f5767, (C4142) this.f5768, (C3114) this.f5765, (Context) obj2, interfaceC0443, 12);
        }
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0231 A[Catch: all -> 0x0205, TryCatch #3 {all -> 0x0205, blocks: (B:95:0x0201, B:104:0x0227, B:106:0x0231, B:110:0x0248, B:101:0x0218), top: B:324:0x01f7 }] */
    /* JADX WARN: Code duplicated, block: B:108:0x0243  */
    /* JADX WARN: Code duplicated, block: B:109:0x0244  */
    /* JADX WARN: Code duplicated, block: B:113:0x025a  */
    /* JADX WARN: Code duplicated, block: B:141:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:145:0x02da  */
    /* JADX WARN: Code duplicated, block: B:361:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:370:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v16, types: [ۦؒؑۡۦ] */
    /* JADX WARN: Type inference failed for: r2v19, types: [ۦؒؑۡۦ] */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v65 */
    /* JADX WARN: Type inference failed for: r2v66 */
    /* JADX WARN: Type inference failed for: r2v67 */
    /* JADX WARN: Type inference failed for: r2v68 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:113:0x025a -> B:104:0x0227). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٖ */
    public final java.lang.Object mo218(java.lang.Object r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1752
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1734.mo218(java.lang.Object):java.lang.Object");
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) throws Throwable {
        int i = this.f5763;
        EnumC2282 enumC2282 = EnumC2282.f7590;
        C2358 c2358 = C2358.f7817;
        switch (i) {
            case 0:
                ((C1734) mo217((InterfaceC0443) obj2, (C0717) obj)).mo218(c2358);
                return enumC2282;
            case 1:
                return ((C1734) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(c2358);
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                return ((C1734) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(c2358);
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                return ((C1734) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(c2358);
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                return ((C1734) mo217((InterfaceC0443) obj2, (EnumC0484) obj)).mo218(c2358);
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                return ((C1734) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(c2358);
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                return ((C1734) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(c2358);
            case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                return ((C1734) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(c2358);
            case 8:
                return ((C1734) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(c2358);
            case 9:
                return ((C1734) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(c2358);
            case 10:
                ((C1734) mo217((InterfaceC0443) obj2, (InterfaceC4161) obj)).mo218(c2358);
                return enumC2282;
            case 11:
                return ((C1734) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(c2358);
            default:
                return ((C1734) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(c2358);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1734(Object obj, InterfaceC0400 interfaceC0400, InterfaceC0443 interfaceC0443, int i) {
        super(2, interfaceC0443);
        this.f5763 = i;
        this.f5765 = obj;
        this.f5766 = interfaceC0400;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1734(Object obj, Object obj2, Object obj3, InterfaceC0443 interfaceC0443, int i) {
        super(2, interfaceC0443);
        this.f5763 = i;
        this.f5768 = obj;
        this.f5765 = obj2;
        this.f5766 = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1734(C5484 c5484, InterfaceC0443 interfaceC0443) {
        super(2, interfaceC0443);
        this.f5763 = 9;
        this.f5766 = c5484;
    }
}
