package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* JADX INFO: renamed from: ۦ۟ؔؓؓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5340 extends AbstractC4071 {

    /* JADX INFO: renamed from: ۦۜ */
    public final C3946 f17597;

    public C5340(Context context, Looper looper, C2813 c2813, C3946 c3946, C3184 c3184, C3184 c3185) {
        super(context, looper, 270, c2813, c3184, c3185);
        this.f17597 = c3946;
    }

    @Override // p000.AbstractC4150
    /* JADX INFO: renamed from: ۥُ */
    public final int mo4540() {
        return 203400000;
    }

    @Override // p000.AbstractC4150
    /* JADX INFO: renamed from: ۥْ */
    public final C2274[] mo7331() {
        return AbstractC2774.f9248;
    }

    @Override // p000.AbstractC4150
    /* JADX INFO: renamed from: ۥٓ */
    public final Bundle mo7332() {
        C3946 c3946 = this.f17597;
        c3946.getClass();
        Bundle bundle = new Bundle();
        String str = c3946.f13181;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    @Override // p000.AbstractC4150
    /* JADX INFO: renamed from: ۥۖ */
    public final boolean mo7335() {
        return true;
    }

    @Override // p000.AbstractC4150
    /* JADX INFO: renamed from: ۦٗ */
    public final String mo4541() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // p000.AbstractC4150
    /* JADX INFO: renamed from: ۦۚ */
    public final IInterface mo4542(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return iInterfaceQueryLocalInterface instanceof C3561 ? (C3561) iInterfaceQueryLocalInterface : new C3561(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService", 0);
    }

    @Override // p000.AbstractC4150
    /* JADX INFO: renamed from: ۦۛ */
    public final String mo4543() {
        return "com.google.android.gms.common.telemetry.service.START";
    }
}
