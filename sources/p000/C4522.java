package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;

/* JADX INFO: renamed from: ۦٖٙۥ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4522 extends AbstractC2426 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥؓ */
    public final /* synthetic */ Object f14939;

    /* JADX INFO: renamed from: ۥؖ */
    public /* synthetic */ Object f14940;

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ int f14941;

    /* JADX INFO: renamed from: ۥٖ */
    public int f14942;

    /* JADX INFO: renamed from: ۥٙ */
    public Object f14943;

    /* JADX INFO: renamed from: ۥۖ */
    public Object f14944;

    /* JADX INFO: renamed from: ۦٕ */
    public final /* synthetic */ Object f14945;

    /* JADX INFO: renamed from: ۦٗ */
    public Object f14946;

    /* JADX INFO: renamed from: ۦۛ */
    public final /* synthetic */ Object f14947;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4522(C5284 c5284, C0834 c0834, Object obj, C1765 c1765, C4931 c4931, C5772 c5772, C4562 c4562, InterfaceC0443 interfaceC0443) {
        super(2, interfaceC0443);
        this.f14941 = 1;
        this.f14946 = c5284;
        this.f14947 = c0834;
        this.f14944 = obj;
        this.f14943 = c1765;
        this.f14945 = c4931;
        this.f14940 = c5772;
        this.f14939 = c4562;
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٓ */
    public final InterfaceC0443 mo217(InterfaceC0443 interfaceC0443, Object obj) {
        int i = this.f14941;
        Object obj2 = this.f14945;
        Object obj3 = this.f14947;
        Object obj4 = this.f14939;
        switch (i) {
            case 0:
                return new C4522((C5284) this.f14946, (C5450) this.f14943, (C5450) this.f14940, (C0834) obj3, this.f14944, (C5450) obj4, (C4931) obj2, interfaceC0443);
            case 1:
                return new C4522((C5284) this.f14946, (C0834) obj3, this.f14944, (C1765) this.f14943, (C4931) obj2, (C5772) this.f14940, (C4562) obj4, interfaceC0443);
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                C4522 c4522 = new C4522((EnumC4386) obj4, (C2538) obj3, (InterfaceC4745) obj2, interfaceC0443, 2);
                c4522.f14940 = obj;
                return c4522;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                C4522 c4523 = new C4522((EnumC4386) obj4, (C3375) obj3, (InterfaceC4745) obj2, interfaceC0443, 3);
                c4523.f14940 = obj;
                return c4523;
            default:
                C4522 c4524 = new C4522((ContentResolver) this.f14943, (Uri) this.f14940, (C3397) obj4, (C5559) obj3, (Context) obj2, interfaceC0443);
                c4524.f14944 = obj;
                return c4524;
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0095 -> B:10:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: ConstInlineVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected instance arg in invoke
        	at jadx.core.dex.visitors.ConstInlineVisitor.addExplicitCast(ConstInlineVisitor.java:285)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceArg(ConstInlineVisitor.java:267)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceConst(ConstInlineVisitor.java:177)
        	at jadx.core.dex.visitors.ConstInlineVisitor.checkInsn(ConstInlineVisitor.java:110)
        	at jadx.core.dex.visitors.ConstInlineVisitor.process(ConstInlineVisitor.java:55)
        	at jadx.core.dex.visitors.ConstInlineVisitor.visit(ConstInlineVisitor.java:47)
        */
    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٖ */
    public final java.lang.Object mo218(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 946
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C4522.mo218(java.lang.Object):java.lang.Object");
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        int i = this.f14941;
        C2358 c2358 = C2358.f7817;
        switch (i) {
            case 0:
                return ((C4522) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(c2358);
            case 1:
                return ((C4522) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(c2358);
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                return ((C4522) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(c2358);
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                return ((C4522) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(c2358);
            default:
                return ((C4522) mo217((InterfaceC0443) obj2, (InterfaceC4161) obj)).mo218(c2358);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4522(C5284 c5284, C5450 c5450, C5450 c5451, C0834 c0834, Object obj, C5450 c5452, C4931 c4931, InterfaceC0443 interfaceC0443) {
        super(2, interfaceC0443);
        this.f14941 = 0;
        this.f14946 = c5284;
        this.f14943 = c5450;
        this.f14940 = c5451;
        this.f14947 = c0834;
        this.f14944 = obj;
        this.f14939 = c5452;
        this.f14945 = c4931;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4522(EnumC4386 enumC4386, Object obj, InterfaceC4745 interfaceC4745, InterfaceC0443 interfaceC0443, int i) {
        super(2, interfaceC0443);
        this.f14941 = i;
        this.f14939 = enumC4386;
        this.f14947 = obj;
        this.f14945 = interfaceC4745;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4522(ContentResolver contentResolver, Uri uri, C3397 c3397, C5559 c5559, Context context, InterfaceC0443 interfaceC0443) {
        super(2, interfaceC0443);
        this.f14941 = 4;
        this.f14943 = contentResolver;
        this.f14940 = uri;
        this.f14939 = c3397;
        this.f14947 = c5559;
        this.f14945 = context;
    }
}
