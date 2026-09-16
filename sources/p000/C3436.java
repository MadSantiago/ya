package p000;

import android.os.Build;
import ru.bluecat.yandexmapspatcher.p003ui.App;

/* JADX INFO: renamed from: ۦٟؗؖٙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3436 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final String f11406 = new C4441(new long[]{-1756803592037579884L, -9134702347281967776L, -2026430326020595081L, -6160963274387531477L, -2691844446134827112L, -6454448920931386501L}).toString();

    /* JADX INFO: renamed from: ۥۣ */
    public static void m6220(AbstractActivityC2747 abstractActivityC2747, int i, InterfaceC4448 interfaceC4448) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 33) {
            interfaceC4448.mo449();
            return;
        }
        App app = App.f407;
        App appM3410 = AbstractC1631.m3410();
        if (i2 >= 33) {
            String str = f11406;
            if (AbstractC4225.m7487(appM3410, str) != 0) {
                AbstractC4225.m7463(abstractActivityC2747, new String[]{str}, i);
                return;
            }
        }
        interfaceC4448.mo449();
    }
}
