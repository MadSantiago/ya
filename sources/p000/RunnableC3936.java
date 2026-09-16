package p000;

import android.os.RemoteException;

/* JADX INFO: renamed from: ۦُ۟ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC3936 implements Runnable {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ C5695 f13144;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f13145;

    public /* synthetic */ RunnableC3936(C5695 c5695, int i) {
        this.f13145 = i;
        this.f13144 = c5695;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f13145;
        C5695 c5695 = this.f13144;
        switch (i) {
            case 0:
                c5695.m9511();
                break;
            case 1:
                C5371 c5371 = (C5371) c5695.f18660;
                InterfaceC5253 interfaceC5253 = c5695.f18733;
                if (interfaceC5253 == null) {
                    C3610 c3610 = c5371.f17717;
                    C5371.m9020(c3610);
                    c3610.f12020.m9432("Failed to send Dma consent settings to service");
                } else {
                    try {
                        interfaceC5253.mo6911(c5695.m9517(false));
                        c5695.m9520();
                    } catch (RemoteException e) {
                        C3610 c3611 = c5371.f17717;
                        C5371.m9020(c3611);
                        c3611.f12020.m9430(e, "Failed to send Dma consent settings to the service");
                        return;
                    }
                }
                break;
            default:
                C5371 c5372 = (C5371) c5695.f18660;
                InterfaceC5253 interfaceC5254 = c5695.f18733;
                if (interfaceC5254 == null) {
                    C3610 c3612 = c5372.f17717;
                    C5371.m9020(c3612);
                    c3612.f12020.m9432("Failed to send storage consent settings to service");
                } else {
                    try {
                        interfaceC5254.mo6913(c5695.m9517(false));
                        c5695.m9520();
                    } catch (RemoteException e2) {
                        C3610 c3613 = c5372.f17717;
                        C5371.m9020(c3613);
                        c3613.f12020.m9430(e2, "Failed to send storage consent settings to the service");
                    }
                }
                break;
        }
    }
}
