package p000;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: renamed from: ۥِ۟ؑؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2421 extends AbstractC4150 {
    @Override // p000.AbstractC4150
    /* JADX INFO: renamed from: ۥُ */
    public final int mo4540() {
        return 12451000;
    }

    @Override // p000.AbstractC4150
    /* JADX INFO: renamed from: ۦٗ */
    public final String mo4541() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    @Override // p000.AbstractC4150
    /* JADX INFO: renamed from: ۦۚ */
    public final /* synthetic */ IInterface mo4542(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        return iInterfaceQueryLocalInterface instanceof InterfaceC5253 ? (InterfaceC5253) iInterfaceQueryLocalInterface : new C3873(iBinder);
    }

    @Override // p000.AbstractC4150
    /* JADX INFO: renamed from: ۦۛ */
    public final String mo4543() {
        return "com.google.android.gms.measurement.START";
    }
}
