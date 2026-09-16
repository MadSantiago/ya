package p000;

import java.io.Serializable;

/* JADX INFO: renamed from: ۥؗؗٙۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0629 extends AbstractC2426 implements InterfaceC2609 {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ int f2326 = 1;

    /* JADX INFO: renamed from: ۥٖ */
    public int f2327;

    /* JADX INFO: renamed from: ۦٗ */
    public /* synthetic */ Object f2328;

    /* JADX INFO: renamed from: ۦۛ */
    public /* synthetic */ Serializable f2329;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0629(C0861 c0861, C0061 c0061, InterfaceC0443 interfaceC0443) {
        super(3, interfaceC0443);
        this.f2328 = c0861;
        this.f2329 = c0061;
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٖ */
    public final Object mo218(Object obj) {
        AbstractC3750 abstractC3750;
        int i = this.f2326;
        C2358 c2358 = C2358.f7817;
        EnumC2282 enumC2282 = EnumC2282.f7590;
        AbstractC3750 abstractC3751 = null;
        switch (i) {
            case 0:
                int i2 = this.f2327;
                if (i2 != 0) {
                    if (i2 == 1) {
                        AbstractC0186.m409(obj);
                        return c2358;
                    }
                    C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC0186.m409(obj);
                C0570 c0570 = ((C0861) this.f2328).f3179;
                C0061 c0061 = (C0061) this.f2329;
                this.f2327 = 1;
                return c0061.mo219(c0570, this) == enumC2282 ? enumC2282 : c2358;
            default:
                int i3 = this.f2327;
                if (i3 != 0) {
                    if (i3 == 1) {
                        AbstractC0186.m409(obj);
                        return c2358;
                    }
                    C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC0186.m409(obj);
                InterfaceC4161 interfaceC4161 = (InterfaceC4161) this.f2328;
                AbstractC3750[] abstractC3750Arr = (AbstractC3750[]) ((Object[]) this.f2329);
                int length = abstractC3750Arr.length;
                int i4 = 0;
                while (true) {
                    abstractC3750 = C1385.f4736;
                    if (i4 < length) {
                        AbstractC3750 abstractC3752 = abstractC3750Arr[i4];
                        if (AbstractC3831.m6874(abstractC3752, abstractC3750)) {
                            i4++;
                        } else {
                            abstractC3751 = abstractC3752;
                        }
                    }
                }
                if (abstractC3751 != null) {
                    abstractC3750 = abstractC3751;
                }
                this.f2327 = 1;
                return interfaceC4161.mo978(abstractC3750, this) == enumC2282 ? enumC2282 : c2358;
        }
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [java.io.Serializable, java.lang.Object[]] */
    @Override // p000.InterfaceC2609
    /* JADX INFO: renamed from: ۦۙ */
    public final Object mo1173(Object obj, Object obj2, Object obj3) {
        int i = this.f2326;
        C2358 c2358 = C2358.f7817;
        switch (i) {
            case 0:
                return new C0629((C0861) this.f2328, (C0061) this.f2329, (InterfaceC0443) obj3).mo218(c2358);
            default:
                C0629 c0629 = new C0629(3, (InterfaceC0443) obj3);
                c0629.f2328 = (InterfaceC4161) obj;
                c0629.f2329 = (Object[]) obj2;
                return c0629.mo218(c2358);
        }
    }

    public /* synthetic */ C0629(int i, InterfaceC0443 interfaceC0443) {
        super(i, interfaceC0443);
    }
}
