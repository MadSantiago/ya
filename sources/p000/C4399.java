package p000;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: ۦ٘ؑؐۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4399 extends AbstractC1127 implements InterfaceC4745 {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ C2453 f14492;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ int f14493;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4399(C2453 c2453, int i) {
        super(1);
        this.f14493 = i;
        this.f14492 = c2453;
    }

    @Override // p000.InterfaceC4745
    /* JADX INFO: renamed from: ۦؚ */
    public final Object mo211(Object obj) {
        int i = this.f14493;
        C2358 c2358 = C2358.f7817;
        C2453 c2453 = this.f14492;
        switch (i) {
            case 0:
                c2453.m4577(((InterfaceC2015) obj).mo2804());
                break;
            case 1:
                C4207 c4207 = (C4207) obj;
                long j = c4207.f13969;
                c2453.m9801setPopupContentSizefhxjrPA(c4207);
                c2453.m4578();
                break;
            default:
                InterfaceC4448 interfaceC4448 = (InterfaceC4448) obj;
                Handler handler = c2453.getHandler();
                if ((handler != null ? handler.getLooper() : null) != Looper.myLooper()) {
                    Handler handler2 = c2453.getHandler();
                    if (handler2 != null) {
                        handler2.post(new RunnableC1056(5, interfaceC4448));
                    }
                } else {
                    interfaceC4448.mo449();
                }
                break;
        }
        return c2358;
    }
}
