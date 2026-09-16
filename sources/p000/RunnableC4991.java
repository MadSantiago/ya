package p000;

import android.os.Trace;
import android.view.View;

/* JADX INFO: renamed from: ۦُۗۥ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC4991 implements Runnable {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ Object f16516;

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ Object f16517;

    /* JADX INFO: renamed from: ۥٓ */
    public final /* synthetic */ Object f16518;

    /* JADX INFO: renamed from: ۥٖ */
    public final /* synthetic */ Object f16519;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ Object f16520;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f16521;

    public /* synthetic */ RunnableC4991(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.f16521 = i;
        this.f16520 = obj;
        this.f16517 = obj2;
        this.f16518 = obj3;
        this.f16516 = obj4;
        this.f16519 = obj5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5038 c5038Mo4466;
        int i = this.f16521;
        Object obj = this.f16519;
        Object obj2 = this.f16516;
        Object obj3 = this.f16518;
        Object obj4 = this.f16517;
        Object obj5 = this.f16520;
        switch (i) {
            case 0:
                C3564 c3564 = (C3564) obj5;
                EnumC2459 enumC2459 = (EnumC2459) obj4;
                String str = (String) obj3;
                InterfaceC2880 interfaceC2880 = (InterfaceC2880) obj2;
                InterfaceC4434 interfaceC4434 = (InterfaceC4434) obj;
                Trace.beginSection("BackgroundTextMeasurement");
                try {
                    AbstractC3191 abstractC3191M3278 = AbstractC1538.m3278();
                    C5038 c5038 = abstractC3191M3278 instanceof C5038 ? (C5038) abstractC3191M3278 : null;
                    if (c5038 == null || (c5038Mo4466 = c5038.mo4466(null, null)) == null) {
                        throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
                    }
                    try {
                        AbstractC3191 abstractC3191M5883 = c5038Mo4466.m5883();
                        try {
                            C3564 c3564M9238 = AbstractC5537.m9238(c3564, enumC2459);
                            C2340 c2340 = C2340.f7777;
                            C5541 c5541 = new C5541(str, c3564M9238, c2340, c2340, interfaceC4434, interfaceC2880);
                            c5541.mo2987();
                            c5541.mo2999();
                            AbstractC3191.m5876(abstractC3191M5883);
                            c5038Mo4466.mo2658().mo8225();
                            c5038Mo4466.mo2657();
                            Trace.endSection();
                            return;
                        } catch (Throwable th) {
                            AbstractC3191.m5876(abstractC3191M5883);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            c5038Mo4466.mo2657();
                            throw th3;
                        }
                    }
                } catch (Throwable th4) {
                    Trace.endSection();
                    throw th4;
                }
            default:
                C3566 c3566 = (C3566) obj4;
                C3566 c3567 = (C3566) obj3;
                View view = (View) obj;
                ((C2559) obj5).mo338(c3566, c3567, ((AbstractActivityC1500) obj2).getWindow(), view, ((Boolean) c3566.f11809.mo211(view.getResources())).booleanValue(), ((Boolean) c3567.f11809.mo211(view.getResources())).booleanValue());
                return;
        }
    }
}
