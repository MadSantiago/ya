package p000;

import java.util.Objects;

/* JADX INFO: renamed from: ۥؙِۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2702 {

    /* JADX INFO: renamed from: ۥۗ */
    public final C2808 f8960;

    /* JADX INFO: renamed from: ۥۣ */
    public final C1377 f8961;

    public C2702(C1377 c1377, C2711 c2711) {
        this.f8961 = c1377;
        this.f8960 = new C2808(c2711);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m5026(String str) {
        C2808 c2808 = this.f8960;
        synchronized (c2808) {
            if (!Objects.equals((String) c2808.f9376, str)) {
                C2808.m5330((C2711) c2808.f9378, str, (String) c2808.f9377);
                c2808.f9376 = str;
            }
        }
    }
}
