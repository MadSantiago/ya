package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: ۦۦؘؖٝ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5770 extends AbstractC2426 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥؖ */
    public final /* synthetic */ Object f19014;

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ int f19015;

    /* JADX INFO: renamed from: ۥٖ */
    public Object f19016;

    /* JADX INFO: renamed from: ۥٙ */
    public final /* synthetic */ Object f19017;

    /* JADX INFO: renamed from: ۥۖ */
    public Object f19018;

    /* JADX INFO: renamed from: ۦٕ */
    public /* synthetic */ Object f19019;

    /* JADX INFO: renamed from: ۦٗ */
    public int f19020;

    /* JADX INFO: renamed from: ۦۛ */
    public Object f19021;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5770(InterfaceC4038 interfaceC4038, InterfaceC4745 interfaceC4745, InterfaceC4745 interfaceC4746, InterfaceC2609 interfaceC2609, InterfaceC4745 interfaceC4747, InterfaceC0443 interfaceC0443) {
        super(2, interfaceC0443);
        this.f19015 = 3;
        this.f19021 = interfaceC4038;
        this.f19018 = interfaceC4745;
        this.f19019 = interfaceC4746;
        this.f19017 = interfaceC2609;
        this.f19014 = interfaceC4747;
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٓ */
    public final InterfaceC0443 mo217(InterfaceC0443 interfaceC0443, Object obj) {
        int i = this.f19015;
        Object obj2 = this.f19014;
        Object obj3 = this.f19017;
        switch (i) {
            case 0:
                C5770 c5770 = new C5770((InterfaceC4541) this.f19018, (C5825) this.f19019, (InterfaceC4367) obj3, (InterfaceC4367) obj2, interfaceC0443);
                c5770.f19016 = obj;
                return c5770;
            case 1:
                C5770 c5771 = new C5770((List) obj3, (ArrayList) obj2, interfaceC0443, 1);
                c5771.f19019 = obj;
                return c5771;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                C5770 c5772 = new C5770((C2656) obj3, (InterfaceC4745) obj2, interfaceC0443, 2);
                c5772.f19019 = obj;
                return c5772;
            default:
                C5770 c5773 = new C5770((InterfaceC4038) this.f19021, (InterfaceC4745) this.f19018, (InterfaceC4745) this.f19019, (InterfaceC2609) obj3, (InterfaceC4745) obj2, interfaceC0443);
                c5773.f19016 = obj;
                return c5773;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0221  */
    /* JADX WARN: Code duplicated, block: B:102:0x0223  */
    /* JADX WARN: Code duplicated, block: B:96:0x0209  */
    /* JADX WARN: Code duplicated, block: B:99:0x0213  */
    /* JADX WARN: Type inference failed for: r2v1, types: [int, ۦؒؑۡۦ] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:82:0x01a2 -> B:76:0x017f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:84:0x01cb -> B:76:0x017f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:95:0x0207 -> B:97:0x020b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٖ */
    public final java.lang.Object mo218(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 586
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C5770.mo218(java.lang.Object):java.lang.Object");
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        int i = this.f19015;
        C2358 c2358 = C2358.f7817;
        switch (i) {
            case 0:
                return ((C5770) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(c2358);
            case 1:
                return ((C5770) mo217((InterfaceC0443) obj2, obj)).mo218(c2358);
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                return ((C5770) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(c2358);
            default:
                return ((C5770) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(c2358);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5770(InterfaceC4541 interfaceC4541, C5825 c5825, InterfaceC4367 interfaceC4367, InterfaceC4367 interfaceC4368, InterfaceC0443 interfaceC0443) {
        super(2, interfaceC0443);
        this.f19015 = 0;
        this.f19018 = interfaceC4541;
        this.f19019 = c5825;
        this.f19017 = interfaceC4367;
        this.f19014 = interfaceC4368;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5770(Object obj, Object obj2, InterfaceC0443 interfaceC0443, int i) {
        super(2, interfaceC0443);
        this.f19015 = i;
        this.f19017 = obj;
        this.f19014 = obj2;
    }
}
