package p000;

/* JADX INFO: renamed from: ۦٍُؗۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3807 extends AbstractC0868 implements InterfaceC2609 {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ C0322 f12634;

    /* JADX INFO: renamed from: ۥْ */
    public int f12635;

    /* JADX INFO: renamed from: ۥٓ */
    public /* synthetic */ C1531 f12636;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3807(C0322 c0322, InterfaceC0443 interfaceC0443) {
        super(3, interfaceC0443);
        this.f12634 = c0322;
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٖ */
    public final Object mo218(Object obj) {
        C0322 c0322 = this.f12634;
        C3915 c3915 = (C3915) c0322.f1178;
        C1531 c1531 = this.f12636;
        int i = this.f12635;
        if (i == 0) {
            AbstractC0186.m409(obj);
            byte bM7016 = c3915.m7016();
            if (bM7016 == 1) {
                return c0322.m691(true);
            }
            if (bM7016 == 0) {
                return c0322.m691(false);
            }
            if (bM7016 != 6) {
                if (bM7016 == 8) {
                    return c0322.m706();
                }
                C3915.m6997(c3915, "Can't begin reading element, unexpected token", 0, null, 6);
                throw null;
            }
            this.f12636 = null;
            this.f12635 = 1;
            obj = c0322.m690(c1531, this);
            EnumC2282 enumC2282 = EnumC2282.f7590;
            if (obj == enumC2282) {
                return enumC2282;
            }
        } else {
            if (i != 1) {
                C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC0186.m409(obj);
        }
        return (AbstractC0695) obj;
    }

    @Override // p000.InterfaceC2609
    /* JADX INFO: renamed from: ۦۙ */
    public final Object mo1173(Object obj, Object obj2, Object obj3) {
        C3807 c3807 = new C3807(this.f12634, (InterfaceC0443) obj3);
        c3807.f12636 = (C1531) obj;
        return c3807.mo218(C2358.f7817);
    }
}
