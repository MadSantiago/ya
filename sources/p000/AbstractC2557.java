package p000;

import java.util.List;

/* JADX INFO: renamed from: ۥٌِۡؔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2557 {

    /* JADX INFO: renamed from: ۥؗ */
    public InterfaceC2880 f8529;

    /* JADX INFO: renamed from: ۥُ */
    public final C5002 f8530 = new C5002(24);

    /* JADX INFO: renamed from: ۥۗ */
    public final InterfaceC5731 f8531;

    /* JADX INFO: renamed from: ۥۣ */
    public final C4545 f8532;

    /* JADX INFO: renamed from: ۦؑ */
    public boolean f8533;

    public AbstractC2557(C4545 c4545, InterfaceC5731 interfaceC5731, InterfaceC2880 interfaceC2880) {
        this.f8532 = c4545;
        this.f8531 = interfaceC5731;
        this.f8529 = interfaceC2880;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static void m4835(C5639 c5639) {
        List list = c5639.f18583;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((C3536) list.get(i)).m6327();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: ۥۗ */
    public final Object m4836(InterfaceC5731 interfaceC5731, AbstractC0772 abstractC0772) throws Throwable {
        C3330 c3330;
        if (abstractC0772 instanceof C3330) {
            c3330 = (C3330) abstractC0772;
            int i = c3330.f11143;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3330.f11143 = i - Integer.MIN_VALUE;
            } else {
                c3330 = new C3330(this, abstractC0772);
            }
        } else {
            c3330 = new C3330(this, abstractC0772);
        }
        Object obj = c3330.f11142;
        int i2 = c3330.f11143;
        InterfaceC0443 interfaceC0443 = null;
        if (i2 == 0) {
            AbstractC0186.m409(obj);
            this.f8533 = true;
            C5030 c5030 = new C5030(this, interfaceC5731, interfaceC0443, 6);
            c3330.f11143 = 1;
            C2344 c2344 = new C2344(c3330, c3330.f2791);
            Object objM1066 = AbstractC0487.m1066(c2344, true, c2344, c5030);
            EnumC2282 enumC2282 = EnumC2282.f7590;
            if (objM1066 == enumC2282) {
                return enumC2282;
            }
        } else {
            if (i2 != 1) {
                C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC0186.m409(obj);
        }
        this.f8533 = false;
        return C2358.f7817;
    }
}
