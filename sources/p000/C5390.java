package p000;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: renamed from: ۦٍ۠ؓؓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5390 extends AbstractC4071 {
    @Override // p000.AbstractC4150
    /* JADX INFO: renamed from: ۥُ */
    public final int mo4540() {
        return 9410000;
    }

    @Override // p000.AbstractC4150
    /* JADX INFO: renamed from: ۥْ */
    public final C2274[] mo7331() {
        return AbstractC0186.f683;
    }

    @Override // p000.AbstractC4150
    /* JADX INFO: renamed from: ۦٗ */
    public final String mo4541() {
        return "com.google.android.gms.phenotype.internal.IPhenotypeService";
    }

    @Override // p000.AbstractC4150
    /* JADX INFO: renamed from: ۦۚ */
    public final IInterface mo4542(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.phenotype.internal.IPhenotypeService");
        return iInterfaceQueryLocalInterface instanceof C3663 ? (C3663) iInterfaceQueryLocalInterface : new C3663(iBinder, "com.google.android.gms.phenotype.internal.IPhenotypeService", 2);
    }

    @Override // p000.AbstractC4150
    /* JADX INFO: renamed from: ۦۛ */
    public final String mo4543() {
        return "com.google.android.gms.phenotype.service.START";
    }
}
