package p000;

import android.view.textclassifier.TextClassifier;

/* JADX INFO: renamed from: ۦؖ */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0058 extends AbstractC2426 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ int f11119;

    /* JADX INFO: renamed from: ۥٖ */
    public int f11120;

    /* JADX INFO: renamed from: ۥۖ */
    public final /* synthetic */ Object f11121;

    /* JADX INFO: renamed from: ۦٕ */
    public final /* synthetic */ Object f11122;

    /* JADX INFO: renamed from: ۦٗ */
    public final /* synthetic */ long f11123;

    /* JADX INFO: renamed from: ۦۛ */
    public Object f11124;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0058(C5097 c5097, long j, InterfaceC0884 interfaceC0884, C0357 c0357, InterfaceC0443 interfaceC0443) {
        super(2, interfaceC0443);
        this.f11119 = 3;
        this.f11124 = c5097;
        this.f11123 = j;
        this.f11121 = interfaceC0884;
        this.f11122 = c0357;
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٓ */
    public final InterfaceC0443 mo217(InterfaceC0443 interfaceC0443, Object obj) {
        int i = this.f11119;
        Object obj2 = this.f11122;
        Object obj3 = this.f11121;
        switch (i) {
            case 0:
                return new C0058((InterfaceC3196) obj3, this.f11123, (C2243) obj2, interfaceC0443, 0);
            case 1:
                C0058 c0058 = new C0058(this.f11123, interfaceC0443, (C0385) obj3, (CharSequence) obj2);
                c0058.f11124 = obj;
                return c0058;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                C0058 c0059 = new C0058((C4545) obj3, this.f11123, (C1916) obj2, interfaceC0443, 2);
                c0059.f11124 = obj;
                return c0059;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                return new C0058((C5097) this.f11124, this.f11123, (InterfaceC0884) obj3, (C0357) obj2, interfaceC0443);
            default:
                return new C0058((InterfaceC4367) obj3, this.f11123, (C2243) obj2, interfaceC0443, 4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005d  */
    /* JADX WARN: Code duplicated, block: B:94:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004f, code lost:
    
        if (r10.m4292(r4, r13) == r7) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0065, code lost:
    
        if (r10.m4292(r0, r13) == r7) goto L24;
     */
    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٖ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo218(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 362
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0058.mo218(java.lang.Object):java.lang.Object");
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        int i = this.f11119;
        C2358 c2358 = C2358.f7817;
        switch (i) {
            case 0:
                return ((C0058) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(c2358);
            case 1:
                return ((C0058) mo217((InterfaceC0443) obj2, (TextClassifier) obj)).mo218(c2358);
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                return ((C0058) mo217((InterfaceC0443) obj2, (C3594) obj)).mo218(c2358);
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                return ((C0058) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(c2358);
            default:
                return ((C0058) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(c2358);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0058(long j, InterfaceC0443 interfaceC0443, C0385 c0385, CharSequence charSequence) {
        super(2, interfaceC0443);
        this.f11119 = 1;
        this.f11121 = c0385;
        this.f11122 = charSequence;
        this.f11123 = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0058(Object obj, long j, Object obj2, InterfaceC0443 interfaceC0443, int i) {
        super(2, interfaceC0443);
        this.f11119 = i;
        this.f11121 = obj;
        this.f11123 = j;
        this.f11122 = obj2;
    }
}
