package p000;

import java.util.Objects;

/* JADX INFO: renamed from: ۦًۤؒ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC5642 implements Runnable {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ AbstractC0071 f18589;

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ boolean f18590;

    /* JADX INFO: renamed from: ۥٓ */
    public final /* synthetic */ C5695 f18591;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ C5855 f18592;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f18593;

    public RunnableC5642(C5695 c5695, C5855 c5855, boolean z, C1513 c1513) {
        this.f18593 = 2;
        this.f18592 = c5855;
        this.f18590 = z;
        this.f18589 = c1513;
        Objects.requireNonNull(c5695);
        this.f18591 = c5695;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i = this.f18593;
        AbstractC0071 abstractC0071 = this.f18589;
        boolean z = this.f18590;
        C5855 c5855 = this.f18592;
        C5695 c5695 = this.f18591;
        switch (i) {
            case 0:
                InterfaceC5253 interfaceC5253 = c5695.f18733;
                if (interfaceC5253 != null) {
                    c5695.m9513(interfaceC5253, z ? null : (C1477) abstractC0071, c5855);
                    c5695.m9520();
                } else {
                    C3610 c3610 = ((C5371) c5695.f18660).f17717;
                    C5371.m9020(c3610);
                    c3610.f12020.m9432("Discarding data. Failed to set user property");
                }
                break;
            case 1:
                InterfaceC5253 interfaceC5254 = c5695.f18733;
                if (interfaceC5254 != null) {
                    c5695.m9513(interfaceC5254, z ? null : (C2679) abstractC0071, c5855);
                    c5695.m9520();
                } else {
                    C3610 c3611 = ((C5371) c5695.f18660).f17717;
                    C5371.m9020(c3611);
                    c3611.f12020.m9432("Discarding data. Failed to send event to service");
                }
                break;
            default:
                InterfaceC5253 interfaceC5255 = c5695.f18733;
                if (interfaceC5255 != null) {
                    c5695.m9513(interfaceC5255, z ? null : (C1513) abstractC0071, c5855);
                    c5695.m9520();
                } else {
                    C3610 c3612 = ((C5371) c5695.f18660).f17717;
                    C5371.m9020(c3612);
                    c3612.f12020.m9432("Discarding data. Failed to send conditional user property to service");
                }
                break;
        }
    }

    public /* synthetic */ RunnableC5642(C5695 c5695, C5855 c5855, boolean z, AbstractC0071 abstractC0071, int i) {
        this.f18593 = i;
        this.f18592 = c5855;
        this.f18590 = z;
        this.f18589 = abstractC0071;
        this.f18591 = c5695;
    }
}
