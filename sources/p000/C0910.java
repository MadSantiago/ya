package p000;

import androidx.datastore.core.NativeSharedCounter;

/* JADX INFO: renamed from: ۥٌؖۙٔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0910 extends AbstractC2426 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ int f3272;

    /* JADX INFO: renamed from: ۥٖ */
    public final /* synthetic */ C5155 f3273;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0910(C5155 c5155, InterfaceC0443 interfaceC0443, int i) {
        super(2, interfaceC0443);
        this.f3272 = i;
        this.f3273 = c5155;
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٓ */
    public final InterfaceC0443 mo217(InterfaceC0443 interfaceC0443, Object obj) {
        int i = this.f3272;
        C5155 c5155 = this.f3273;
        switch (i) {
            case 0:
                return new C0910(c5155, interfaceC0443, 0);
            default:
                return new C0910(c5155, interfaceC0443, 1);
        }
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٖ */
    public final Object mo218(Object obj) {
        int i = this.f3272;
        NativeSharedCounter nativeSharedCounter = C4138.f13769;
        C5155 c5155 = this.f3273;
        AbstractC0186.m409(obj);
        switch (i) {
            case 0:
                return new Integer(nativeSharedCounter.nativeGetCounterValue(((C4138) c5155.f17078.getValue()).f13770));
            default:
                return new Integer(nativeSharedCounter.nativeIncrementAndGetCounterValue(((C4138) c5155.f17078.getValue()).f13770));
        }
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        int i = this.f3272;
        C2358 c2358 = C2358.f7817;
        InterfaceC4643 interfaceC4643 = (InterfaceC4643) obj;
        InterfaceC0443 interfaceC0443 = (InterfaceC0443) obj2;
        switch (i) {
            case 0:
                break;
        }
        return ((C0910) mo217(interfaceC0443, interfaceC4643)).mo218(c2358);
    }
}
