package p000;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* JADX INFO: renamed from: ۦۖؔۚۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC4911 implements Runnable {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ AppMeasurementDynamiteService f16207;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ InterfaceC3838 f16208;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f16209;

    public /* synthetic */ RunnableC4911(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC3838 interfaceC3838, int i) {
        this.f16209 = i;
        this.f16208 = interfaceC3838;
        this.f16207 = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = false;
        switch (this.f16209) {
            case 0:
                C5695 c5695M9028 = this.f16207.f309.m9028();
                InterfaceC3838 interfaceC3838 = this.f16208;
                c5695M9028.mo6517();
                c5695M9028.m7643();
                c5695M9028.m9509(new RunnableC0624(c5695M9028, c5695M9028.m9517(false), interfaceC3838, 8));
                break;
            default:
                AppMeasurementDynamiteService appMeasurementDynamiteService = this.f16207;
                C1512 c1512 = appMeasurementDynamiteService.f309.f17721;
                C5371.m9021(c1512);
                C5371 c5371 = appMeasurementDynamiteService.f309;
                if (c5371.f17710 != null && c5371.f17710.booleanValue()) {
                    z = true;
                }
                c1512.m3237(this.f16208, z);
                break;
        }
    }
}
