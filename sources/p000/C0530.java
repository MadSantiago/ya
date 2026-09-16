package p000;

/* JADX INFO: renamed from: ۥٖؖؓۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0530 extends AbstractC0772 {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ C5559 f1867;

    /* JADX INFO: renamed from: ۥٓ */
    public /* synthetic */ Object f1868;

    /* JADX INFO: renamed from: ۥٖ */
    public int f1869;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0530(C5559 c5559, AbstractC0772 abstractC0772) {
        super(abstractC0772);
        this.f1867 = c5559;
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٖ */
    public final Object mo218(Object obj) {
        this.f1868 = obj;
        this.f1869 |= Integer.MIN_VALUE;
        Object objM9312 = C5559.m9312(this.f1867, this);
        return objM9312 == EnumC2282.f7590 ? objM9312 : new C2368(objM9312);
    }
}
