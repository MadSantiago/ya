package p000;

import android.net.Uri;
import android.view.View;
import android.view.textclassifier.TextClassifier;
import android.webkit.WebView;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: ۦٌٕۘؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5030 extends AbstractC2426 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ int f16644;

    /* JADX INFO: renamed from: ۥٖ */
    public int f16645;

    /* JADX INFO: renamed from: ۦٗ */
    public Object f16646;

    /* JADX INFO: renamed from: ۦۛ */
    public final /* synthetic */ Object f16647;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5030(Object obj, Object obj2, InterfaceC0443 interfaceC0443, int i) {
        super(2, interfaceC0443);
        this.f16644 = i;
        this.f16646 = obj;
        this.f16647 = obj2;
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٓ */
    public final InterfaceC0443 mo217(InterfaceC0443 interfaceC0443, Object obj) {
        int i = this.f16644;
        Object obj2 = this.f16647;
        switch (i) {
            case 0:
                return new C5030((C4306) this.f16646, (C1734) obj2, interfaceC0443, 0);
            case 1:
                return new C5030((Map) this.f16646, (C2247) obj2, interfaceC0443, 1);
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                return new C5030((C5424) this.f16646, (Uri) obj2, interfaceC0443, 2);
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                return new C5030((InterfaceC4311) this.f16646, (C1673) obj2, interfaceC0443, 3);
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                C5030 c5030 = new C5030((C3031) obj2, interfaceC0443, 4);
                c5030.f16646 = obj;
                return c5030;
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                return new C5030((C5151) this.f16646, (C3002) obj2, interfaceC0443, 5);
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                return new C5030((AbstractC2557) this.f16646, (InterfaceC5731) obj2, interfaceC0443, 6);
            case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                C5030 c5031 = new C5030((C5559) obj2, interfaceC0443, 7);
                c5031.f16646 = obj;
                return c5031;
            case 8:
                return new C5030((TextClassifier) this.f16646, (InterfaceC5731) obj2, interfaceC0443, 8);
            case 9:
                C5030 c5032 = new C5030((InterfaceC5731) obj2, interfaceC0443, 9);
                c5032.f16646 = obj;
                return c5032;
            case 10:
                C5030 c5033 = new C5030((C5274) obj2, interfaceC0443, 10);
                c5033.f16646 = obj;
                return c5033;
            case 11:
                return new C5030((C1199) this.f16646, (C0834) obj2, interfaceC0443, 11);
            case 12:
                C5030 c5034 = new C5030((C5669) obj2, interfaceC0443, 12);
                c5034.f16646 = obj;
                return c5034;
            case 13:
                C5030 c5035 = new C5030((C2756) obj2, interfaceC0443, 13);
                c5035.f16646 = obj;
                return c5035;
            case 14:
                return new C5030((C0457) this.f16646, (C2677) obj2, interfaceC0443, 14);
            case 15:
                return new C5030((C1347) this.f16646, (C3557) obj2, interfaceC0443, 15);
            case 16:
                return new C5030((C0909) this.f16646, (C1109) obj2, interfaceC0443, 16);
            case 17:
                return new C5030((C1489) obj2, interfaceC0443, 17);
            case 18:
                return new C5030((InterfaceC4707) this.f16646, (C5305) obj2, interfaceC0443, 18);
            case 19:
                return new C5030((C4752) this.f16646, (InterfaceC3347) obj2, interfaceC0443, 19);
            case 20:
                return new C5030((InterfaceC3196) this.f16646, (C3821) obj2, interfaceC0443, 20);
            case 21:
                return new C5030((C3757) this.f16646, (InterfaceC4448) obj2, interfaceC0443, 21);
            case 22:
                C5030 c5036 = new C5030((InterfaceC4161) obj2, interfaceC0443, 22);
                c5036.f16646 = obj;
                return c5036;
            case 23:
                return new C5030((WebView) this.f16646, (String) obj2, interfaceC0443, 23);
            default:
                return new C5030((C0469) this.f16646, (View) obj2, interfaceC0443, 24);
        }
    }

    /* JADX WARN: Code duplicated, block: B:335:0x0678 A[Catch: all -> 0x0660, PHI: r0
  0x0678: PHI (r0v29 ۦٖٛؗٔ) = (r0v27 ۦٖٛؗٔ), (r0v28 ۦٖٛؗٔ), (r0v33 ۦٖٛؗٔ) binds: [B:334:0x0671, B:341:0x06aa, B:326:0x065c] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #0 {all -> 0x0660, blocks: (B:326:0x065c, B:335:0x0678, B:337:0x0682, B:340:0x068f, B:332:0x066b), top: B:389:0x0652 }] */
    /* JADX WARN: Code duplicated, block: B:337:0x0682 A[Catch: all -> 0x0660, TryCatch #0 {all -> 0x0660, blocks: (B:326:0x065c, B:335:0x0678, B:337:0x0682, B:340:0x068f, B:332:0x066b), top: B:389:0x0652 }] */
    /* JADX WARN: Code duplicated, block: B:339:0x068e  */
    /* JADX WARN: Code duplicated, block: B:340:0x068f A[Catch: all -> 0x0660, PHI: r0 r2
  0x068f: PHI (r0v28 ۦٖٛؗٔ) = (r0v29 ۦٖٛؗٔ), (r0v31 ۦٖٛؗٔ) binds: [B:338:0x068c, B:333:0x066e] A[DONT_GENERATE, DONT_INLINE]
  0x068f: PHI (r2v3 java.lang.Object) = (r2v11 java.lang.Object), (r2v12 java.lang.Object) binds: [B:338:0x068c, B:333:0x066e] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {all -> 0x0660, blocks: (B:326:0x065c, B:335:0x0678, B:337:0x0682, B:340:0x068f, B:332:0x066b), top: B:389:0x0652 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0, types: [ۥَؕؒٝ] */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v5, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v11, types: [ۦًؘؓ] */
    /* JADX WARN: Type inference failed for: r1v76 */
    /* JADX WARN: Type inference failed for: r1v77 */
    /* JADX WARN: Type inference failed for: r1v9, types: [ۦًؘؓ] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:111:0x01c7 -> B:113:0x01cb). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:341:0x06aa -> B:335:0x0678). Please report as a decompilation issue!!! */
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
            Method dump skipped, instruction units count: 2144
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C5030.mo218(java.lang.Object):java.lang.Object");
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) throws Throwable {
        int i = this.f16644;
        EnumC2282 enumC2282 = EnumC2282.f7590;
        C2358 c2358 = C2358.f7817;
        switch (i) {
            case 0:
                ((C5030) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(c2358);
                return enumC2282;
            case 1:
                return ((C5030) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(c2358);
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                return ((C5030) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(c2358);
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                ((C5030) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(c2358);
                return enumC2282;
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                return ((C5030) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(c2358);
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                return ((C5030) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(c2358);
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                return ((C5030) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(c2358);
            case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                return ((C5030) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(c2358);
            case 8:
                return ((C5030) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(c2358);
            case 9:
                return ((C5030) mo217((InterfaceC0443) obj2, (C1337) obj)).mo218(c2358);
            case 10:
                return ((C5030) mo217((InterfaceC0443) obj2, (C1337) obj)).mo218(c2358);
            case 11:
                return ((C5030) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(c2358);
            case 12:
                return ((C5030) mo217((InterfaceC0443) obj2, (JSONObject) obj)).mo218(c2358);
            case 13:
                return ((C5030) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(c2358);
            case 14:
                return ((C5030) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(c2358);
            case 15:
                return ((C5030) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(c2358);
            case 16:
                return ((C5030) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(c2358);
            case 17:
                return ((C5030) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(c2358);
            case 18:
                return ((C5030) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(c2358);
            case 19:
                return ((C5030) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(c2358);
            case 20:
                return ((C5030) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(c2358);
            case 21:
                return ((C5030) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(c2358);
            case 22:
                return ((C5030) mo217((InterfaceC0443) obj2, obj)).mo218(c2358);
            case 23:
                return ((C5030) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(c2358);
            default:
                return ((C5030) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(c2358);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5030(Object obj, InterfaceC0443 interfaceC0443, int i) {
        super(2, interfaceC0443);
        this.f16644 = i;
        this.f16647 = obj;
    }
}
