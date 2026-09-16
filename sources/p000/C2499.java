package p000;

import android.view.Choreographer;

/* JADX INFO: renamed from: ۥ۠ؓٗۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2499 extends AbstractC2426 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ int f8305;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2499(int i, InterfaceC0443 interfaceC0443, int i2) {
        super(i, interfaceC0443);
        this.f8305 = i2;
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٓ */
    public final InterfaceC0443 mo217(InterfaceC0443 interfaceC0443, Object obj) {
        switch (this.f8305) {
            case 0:
                return new C2499(2, interfaceC0443, 0);
            case 1:
                return new C2499(2, interfaceC0443, 1);
            default:
                return new C2499(2, interfaceC0443, 2);
        }
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٖ */
    public final Object mo218(Object obj) {
        int i = this.f8305;
        C2358 c2358 = C2358.f7817;
        switch (i) {
            case 0:
                AbstractC0186.m409(obj);
                return Choreographer.getInstance();
            case 1:
                AbstractC0186.m409(obj);
                return c2358;
            default:
                AbstractC0186.m409(obj);
                return c2358;
        }
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        int i = this.f8305;
        C2358 c2358 = C2358.f7817;
        switch (i) {
            case 0:
                return ((C2499) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(c2358);
            case 1:
                ((C2499) mo217((InterfaceC0443) obj2, (InterfaceC1437) obj)).mo218(c2358);
                return c2358;
            default:
                ((C2499) mo217((InterfaceC0443) obj2, (InterfaceC4161) obj)).mo218(c2358);
                return c2358;
        }
    }
}
