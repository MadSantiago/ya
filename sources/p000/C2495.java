package p000;

import android.graphics.Bitmap;

/* JADX INFO: renamed from: ۥ۠ؒ۠ؒ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2495 extends AbstractC2426 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ int f8293;

    /* JADX INFO: renamed from: ۥٖ */
    public int f8294;

    /* JADX INFO: renamed from: ۥٙ */
    public final /* synthetic */ Object f8295;

    /* JADX INFO: renamed from: ۥۖ */
    public Object f8296;

    /* JADX INFO: renamed from: ۦٕ */
    public /* synthetic */ Object f8297;

    /* JADX INFO: renamed from: ۦٗ */
    public Object f8298;

    /* JADX INFO: renamed from: ۦۛ */
    public Object f8299;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2495(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, InterfaceC0443 interfaceC0443, int i) {
        super(2, interfaceC0443);
        this.f8293 = i;
        this.f8298 = obj;
        this.f8299 = obj2;
        this.f8296 = obj3;
        this.f8297 = obj4;
        this.f8295 = obj5;
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٓ */
    public final InterfaceC0443 mo217(InterfaceC0443 interfaceC0443, Object obj) {
        int i = this.f8293;
        Object obj2 = this.f8295;
        switch (i) {
            case 0:
                C2495 c2495 = new C2495((C0717) this.f8299, (InterfaceC4745) this.f8296, (C3969) this.f8297, (C4306) obj2, interfaceC0443, 0);
                c2495.f8298 = obj;
                return c2495;
            case 1:
                return new C2495((C5837) this.f8298, (InterfaceC4367) this.f8299, (C1568) this.f8296, (C3635) this.f8297, (C2350) obj2, interfaceC0443, 1);
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                return new C2495((C0489) this.f8298, (C5745) this.f8299, (C5837) this.f8296, (C2449) this.f8297, (InterfaceC4120) obj2, interfaceC0443, 2);
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                return new C2495((C0834) this.f8298, (C1199) this.f8299, (C0181) this.f8296, (C4931) this.f8297, (Bitmap) obj2, interfaceC0443, 3);
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                C2495 c2496 = new C2495((C0469) this.f8296, (C4602) this.f8297, (C2404) obj2, interfaceC0443, 4);
                c2496.f8298 = obj;
                return c2496;
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                C2495 c2497 = new C2495((InterfaceC4448) obj2, interfaceC0443);
                c2497.f8297 = obj;
                return c2497;
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                C2495 c2498 = new C2495((InterfaceC4038) this.f8299, (C2695) this.f8296, (C2136) this.f8297, (C3821) obj2, interfaceC0443, 6);
                c2498.f8298 = obj;
                return c2498;
            default:
                C2495 c2499 = new C2495((C5484) this.f8296, (C4545) this.f8297, (C5450) obj2, interfaceC0443, 7);
                c2499.f8298 = obj;
                return c2499;
        }
    }

    /* JADX WARN: Code duplicated, block: B:116:0x0303 A[Catch: all -> 0x0226, TryCatch #2 {all -> 0x0226, blocks: (B:75:0x0221, B:110:0x02f0, B:111:0x02f6, B:113:0x02fb, B:114:0x02fc, B:116:0x0303, B:118:0x0311, B:120:0x0317, B:123:0x031d, B:125:0x0321, B:126:0x0325, B:127:0x0328, B:128:0x032b, B:147:0x037b, B:148:0x037c, B:112:0x02f7), top: B:250:0x0212, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:118:0x0311 A[Catch: all -> 0x0226, TryCatch #2 {all -> 0x0226, blocks: (B:75:0x0221, B:110:0x02f0, B:111:0x02f6, B:113:0x02fb, B:114:0x02fc, B:116:0x0303, B:118:0x0311, B:120:0x0317, B:123:0x031d, B:125:0x0321, B:126:0x0325, B:127:0x0328, B:128:0x032b, B:147:0x037b, B:148:0x037c, B:112:0x02f7), top: B:250:0x0212, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:120:0x0317 A[Catch: all -> 0x0226, TryCatch #2 {all -> 0x0226, blocks: (B:75:0x0221, B:110:0x02f0, B:111:0x02f6, B:113:0x02fb, B:114:0x02fc, B:116:0x0303, B:118:0x0311, B:120:0x0317, B:123:0x031d, B:125:0x0321, B:126:0x0325, B:127:0x0328, B:128:0x032b, B:147:0x037b, B:148:0x037c, B:112:0x02f7), top: B:250:0x0212, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:121:0x031a  */
    /* JADX WARN: Code duplicated, block: B:130:0x0348  */
    /* JADX WARN: Code duplicated, block: B:251:0x02f7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:54:0x01d4 A[Catch: all -> 0x0175, PHI: r5 r6 r7 r8
  0x01d4: PHI (r5v38 java.lang.Object) = (r5v37 java.lang.Object), (r5v42 java.lang.Object) binds: [B:52:0x01d1, B:45:0x018d] A[DONT_GENERATE, DONT_INLINE]
  0x01d4: PHI (r6v14 ۦؚٚؓٓ) = (r6v13 ۦؚٚؓٓ), (r6v18 ۦؚٚؓٓ) binds: [B:52:0x01d1, B:45:0x018d] A[DONT_GENERATE, DONT_INLINE]
  0x01d4: PHI (r7v25 ??) = (r7v45 ??), (r7v46 ??) binds: [B:52:0x01d1, B:45:0x018d] A[DONT_GENERATE, DONT_INLINE]
  0x01d4: PHI (r8v29 ۦٔؑۢٞ) = (r8v28 ۦٔؑۢٞ), (r8v33 ۦٔؑۢٞ) binds: [B:52:0x01d1, B:45:0x018d] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {all -> 0x0175, blocks: (B:45:0x018d, B:54:0x01d4, B:51:0x01c3, B:56:0x01de, B:39:0x0171, B:48:0x01ad), top: B:248:0x015a }] */
    /* JADX WARN: Code duplicated, block: B:56:0x01de A[Catch: all -> 0x0175, TRY_LEAVE, TryCatch #1 {all -> 0x0175, blocks: (B:45:0x018d, B:54:0x01d4, B:51:0x01c3, B:56:0x01de, B:39:0x0171, B:48:0x01ad), top: B:248:0x015a }] */
    /* JADX WARN: Code duplicated, block: B:60:0x01f0  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11, types: [int] */
    /* JADX WARN: Type inference failed for: r2v12, types: [ۦٍ۟ؑۨ] */
    /* JADX WARN: Type inference failed for: r2v28, types: [java.lang.Object, ۦٍ۟ؑۨ] */
    /* JADX WARN: Type inference failed for: r2v30, types: [ۦٍ۟ؑۨ] */
    /* JADX WARN: Type inference failed for: r2v41 */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object, ۦًؘؓ] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v22, types: [ۦٜؒؕۙ] */
    /* JADX WARN: Type inference failed for: r7v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v25, types: [java.lang.Object, ۦٜؒؕۙ] */
    /* JADX WARN: Type inference failed for: r7v45 */
    /* JADX WARN: Type inference failed for: r7v46 */
    /* JADX WARN: Type inference failed for: r7v47 */
    /* JADX WARN: Type inference failed for: r7v48 */
    /* JADX WARN: Type inference failed for: r7v49 */
    /* JADX WARN: Type inference failed for: r7v50 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0081 -> B:16:0x0083). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x01dc -> B:51:0x01c3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x01f0 -> B:51:0x01c3). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٖ */
    public final java.lang.Object mo218(java.lang.Object r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1384
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C2495.mo218(java.lang.Object):java.lang.Object");
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) throws Throwable {
        int i = this.f8293;
        EnumC2282 enumC2282 = EnumC2282.f7590;
        C2358 c2358 = C2358.f7817;
        switch (i) {
            case 0:
                ((C2495) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(c2358);
                return enumC2282;
            case 1:
                return ((C2495) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(c2358);
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                return ((C2495) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(c2358);
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                return ((C2495) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(c2358);
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                return ((C2495) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(c2358);
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                ((C2495) mo217((InterfaceC0443) obj2, (InterfaceC4161) obj)).mo218(c2358);
                return enumC2282;
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                return ((C2495) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(c2358);
            default:
                return ((C2495) mo217((InterfaceC0443) obj2, (C3594) obj)).mo218(c2358);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2495(Object obj, InterfaceC0400 interfaceC0400, Object obj2, Object obj3, InterfaceC0443 interfaceC0443, int i) {
        super(2, interfaceC0443);
        this.f8293 = i;
        this.f8299 = obj;
        this.f8296 = interfaceC0400;
        this.f8297 = obj2;
        this.f8295 = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2495(Object obj, Object obj2, Object obj3, InterfaceC0443 interfaceC0443, int i) {
        super(2, interfaceC0443);
        this.f8293 = i;
        this.f8296 = obj;
        this.f8297 = obj2;
        this.f8295 = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2495(InterfaceC4448 interfaceC4448, InterfaceC0443 interfaceC0443) {
        super(2, interfaceC0443);
        this.f8293 = 5;
        this.f8295 = interfaceC4448;
    }
}
