package p000;

import android.net.ConnectivityManager;

/* JADX INFO: renamed from: ۦۚؑ۟ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5151 implements InterfaceC5721 {

    /* JADX INFO: renamed from: ۥۣ */
    public final ConnectivityManager f17064;

    public C5151(ConnectivityManager connectivityManager) {
        this.f17064 = connectivityManager;
    }

    @Override // p000.InterfaceC5721
    /* JADX INFO: renamed from: ۥۗ */
    public final C3189 mo1716(C4628 c4628) {
        return new C3189(new C0061(c4628, this, null, 24), C4794.f15814, -2, 1);
    }

    @Override // p000.InterfaceC5721
    /* JADX INFO: renamed from: ۥۣ */
    public final boolean mo1303(C4142 c4142) {
        return c4142.f13791.m8012() != null;
    }
}
