package p000;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: renamed from: ۦِۛؔؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC5228 implements Runnable {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ ServiceConnectionC0769 f17252;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ InterfaceC5253 f17253;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f17254;

    public /* synthetic */ RunnableC5228(ServiceConnectionC0769 serviceConnectionC0769, InterfaceC5253 interfaceC5253, int i) {
        this.f17254 = i;
        this.f17253 = interfaceC5253;
        this.f17252 = serviceConnectionC0769;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f17254) {
            case 0:
                ServiceConnectionC0769 serviceConnectionC0769 = this.f17252;
                synchronized (serviceConnectionC0769) {
                    try {
                        serviceConnectionC0769.f2787 = false;
                        C5695 c5695 = serviceConnectionC0769.f2785;
                        if (!c5695.m9515()) {
                            C3610 c3610 = ((C5371) c5695.f18660).f17717;
                            C5371.m9020(c3610);
                            c3610.f12023.m9432("Connected to service");
                            InterfaceC5253 interfaceC5253 = this.f17253;
                            c5695.mo6517();
                            c5695.f18733 = interfaceC5253;
                            c5695.m9520();
                            c5695.m9512();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
            default:
                ServiceConnectionC0769 serviceConnectionC07610 = this.f17252;
                synchronized (serviceConnectionC07610) {
                    try {
                        serviceConnectionC07610.f2787 = false;
                        C5695 c5696 = serviceConnectionC07610.f2785;
                        if (!c5696.m9515()) {
                            C3610 c3611 = ((C5371) c5696.f18660).f17717;
                            C5371.m9020(c3611);
                            c3611.f12015.m9432("Connected to remote service");
                            InterfaceC5253 interfaceC5254 = this.f17253;
                            c5696.mo6517();
                            c5696.f18733 = interfaceC5254;
                            c5696.m9520();
                            c5696.m9512();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                C5695 c5697 = this.f17252.f2785;
                ScheduledExecutorService scheduledExecutorService = c5697.f18737;
                if (scheduledExecutorService != null) {
                    scheduledExecutorService.shutdownNow();
                    c5697.f18737 = null;
                    return;
                }
                return;
        }
    }
}
