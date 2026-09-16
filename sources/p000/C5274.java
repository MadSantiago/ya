package p000;

/* JADX INFO: renamed from: ۦٌۜؒۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5274 extends AbstractC2426 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ int f17384;

    /* JADX INFO: renamed from: ۥٖ */
    public /* synthetic */ Object f17385;

    /* JADX INFO: renamed from: ۦٗ */
    public final /* synthetic */ InterfaceC4745 f17386;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5274(InterfaceC0443 interfaceC0443, InterfaceC4745 interfaceC4745, int i) {
        super(2, interfaceC0443);
        this.f17384 = i;
        this.f17386 = interfaceC4745;
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٓ */
    public final InterfaceC0443 mo217(InterfaceC0443 interfaceC0443, Object obj) {
        int i = this.f17384;
        InterfaceC4745 interfaceC4745 = this.f17386;
        switch (i) {
            case 0:
                C5274 c5274 = new C5274(interfaceC0443, interfaceC4745, 0);
                c5274.f17385 = obj;
                return c5274;
            case 1:
                C5274 c5275 = new C5274(interfaceC0443, interfaceC4745, 1);
                c5275.f17385 = obj;
                return c5275;
            default:
                C5274 c5276 = new C5274(interfaceC4745, interfaceC0443);
                c5276.f17385 = obj;
                return c5276;
        }
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٖ */
    public final Object mo218(Object obj) {
        int i = this.f17384;
        InterfaceC4745 interfaceC4745 = this.f17386;
        switch (i) {
            case 0:
                AbstractC0186.m409(obj);
                return interfaceC4745.mo211(((C0202) this.f17385).mo466());
            case 1:
                AbstractC0186.m409(obj);
                return interfaceC4745.mo211(((C0202) this.f17385).mo466());
            default:
                AbstractC0186.m409(obj);
                interfaceC4745.mo211((C1337) this.f17385);
                return C2358.f7817;
        }
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        int i = this.f17384;
        C2358 c2358 = C2358.f7817;
        switch (i) {
            case 0:
                return ((C5274) mo217((InterfaceC0443) obj2, (C0202) obj)).mo218(c2358);
            case 1:
                return ((C5274) mo217((InterfaceC0443) obj2, (C0202) obj)).mo218(c2358);
            default:
                ((C5274) mo217((InterfaceC0443) obj2, (C1337) obj)).mo218(c2358);
                return c2358;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5274(InterfaceC4745 interfaceC4745, InterfaceC0443 interfaceC0443) {
        super(2, interfaceC0443);
        this.f17384 = 2;
        this.f17386 = interfaceC4745;
    }
}
