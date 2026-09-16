package p000;

import android.net.Uri;

/* JADX INFO: renamed from: ۥَ۟ؑؗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2417 implements InterfaceC5349 {

    /* JADX INFO: renamed from: ۥۗ */
    public final C2432 f8071;

    /* JADX INFO: renamed from: ۥۣ */
    public final C2432 f8072;

    public C2417(C2432 c2432, C2432 c2433) {
        this.f8072 = c2432;
        this.f8071 = c2433;
    }

    @Override // p000.InterfaceC5349
    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC5288 mo920(Object obj, C1765 c1765) {
        Uri uri = (Uri) obj;
        if (AbstractC3831.m6874(uri.getScheme(), "http") || AbstractC3831.m6874(uri.getScheme(), "https")) {
            return new C0276(uri.toString(), c1765, this.f8072, this.f8071);
        }
        return null;
    }
}
