package p000;

/* JADX INFO: renamed from: ۥٕؔۦٛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1404 extends AbstractC2426 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥَ */
    public /* synthetic */ Object f4833;

    /* JADX INFO: renamed from: ۥٖ */
    public final /* synthetic */ long f4834;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1404(long j, InterfaceC0443 interfaceC0443) {
        super(2, interfaceC0443);
        this.f4834 = j;
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٓ */
    public final InterfaceC0443 mo217(InterfaceC0443 interfaceC0443, Object obj) {
        C1404 c1404 = new C1404(this.f4834, interfaceC0443);
        c1404.f4833 = obj;
        return c1404;
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٖ */
    public final Object mo218(Object obj) {
        AbstractC0186.m409(obj);
        C4545 c4545 = ((C3594) this.f4833).f11951;
        c4545.m7866(c4545.f15021, this.f4834, 1);
        return C2358.f7817;
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        C1404 c1404 = (C1404) mo217((InterfaceC0443) obj2, (C3594) obj);
        C2358 c2358 = C2358.f7817;
        c1404.mo218(c2358);
        return c2358;
    }
}
