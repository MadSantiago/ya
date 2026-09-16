package p000;

import android.content.SharedPreferences;
import java.util.Collections;
import ru.bluecat.yandexmapspatcher.p003ui.App;

/* JADX INFO: renamed from: ۦؘؑۦؚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3469 {

    /* JADX INFO: renamed from: ۥؗ */
    public static final C2432 f11512;

    /* JADX INFO: renamed from: ۥۗ */
    public static final C3600 f11513;

    /* JADX INFO: renamed from: ۥۣ */
    public static final C3469 f11514;

    static {
        new C4441(new long[]{7797406359975321424L, 567705471738776792L, 5574079962288063035L}).toString();
        f11514 = new C3469();
        App app = App.f407;
        f11513 = C3600.m6413(AbstractC1631.m3410());
        f11512 = new C2432(new C2971(19));
    }

    /* JADX INFO: renamed from: ۥؗ */
    public static void m6256() {
        String string = new C4441(new long[]{2188735382893200538L, -833826734575352024L, -9000772661855792856L}).toString();
        C1320 c1320 = (C1320) f11512.getValue();
        C3600 c3600 = f11513;
        c3600.getClass();
        new C1811(c3600, string, 2, Collections.singletonList(c1320), 0).m3592();
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static void m6257() {
        App app = App.f407;
        C1443 c1443 = AbstractC2776.m5217().f410;
        c1443.getClass();
        C2518 c2518 = new C2518(c1443);
        c2518.m4661(Boolean.TRUE, AbstractC2539.f8451.f5219);
        SharedPreferences.Editor editor = c2518.f8351;
        if (editor != null) {
            editor.apply();
        }
        if (!C1443.f4940 && !c1443.f4943) {
            try {
                AbstractC2765.m5147(c1443.f4945, c1443.m3070().concat(".xml"));
            } catch (Throwable unused) {
            }
        }
        m6256();
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static void m6258() {
        String string = new C4441(new long[]{-2884878868351698254L, -3124716990441146632L, -5250560525713088332L}).toString();
        C3600 c3600 = f11513;
        AbstractC2774.m5184((C4992) c3600.f11989.f9392, "CancelWorkByName_".concat(string), (ExecutorC2205) c3600.f11992.f5059, new C1225(7, string, c3600));
    }
}
