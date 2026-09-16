package p000;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* JADX INFO: renamed from: ۦٖۨٓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4337 implements InterfaceC4264 {

    /* JADX INFO: renamed from: ۥۗ */
    public final /* synthetic */ AppMeasurementDynamiteService f14319;

    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC0257 f14320;

    public C4337(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC0257 interfaceC0257) {
        this.f14319 = appMeasurementDynamiteService;
        this.f14320 = interfaceC0257;
    }

    @Override // p000.InterfaceC4264
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo4010(String str, String str2, Bundle bundle, long j) {
        try {
            this.f14320.mo538(str, str2, bundle, j);
        } catch (RemoteException e) {
            C5371 c5371 = this.f14319.f309;
            if (c5371 != null) {
                C3610 c3610 = c5371.f17717;
                C5371.m9020(c3610);
                c3610.f12022.m9430(e, "Event listener threw exception");
            }
        }
    }
}
