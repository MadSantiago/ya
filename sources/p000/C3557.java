package p000;

import android.content.Intent;
import android.content.SharedPreferences;
import ru.bluecat.yandexmapspatcher.p003ui.App;
import ru.bluecat.yandexmapspatcher.p003ui.SideActivity;
import ru.bluecat.yandexmapspatcher.services.BackgroundJobService;

/* JADX INFO: renamed from: ۦٌؙؖۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3557 extends AbstractC0941 {

    /* JADX INFO: renamed from: ۥؗ */
    public final C2432 f11791 = new C2432(new C2971(6));

    /* JADX INFO: renamed from: ۥۗ */
    public final C3998 f11792;

    public C3557(C3998 c3998) {
        this.f11792 = c3998;
    }

    /* JADX INFO: renamed from: ۥُ */
    public static void m6353(C1347 c1347, InterfaceC4448 interfaceC4448) {
        if (c1347.contains(EnumC1029.f3635.f3638)) {
            interfaceC4448.mo449();
        }
        EnumC1029 enumC1029 = EnumC1029.f3634;
        if (c1347.contains(enumC1029.f3638)) {
            App app = App.f407;
            App appM5217 = AbstractC2776.m5217();
            C1443 c1443 = appM5217.f410;
            c1443.getClass();
            C2518 c2518 = new C2518(c1443);
            c2518.m4662();
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
            C1443 c1444 = appM5217.f409;
            c1444.getClass();
            C2518 c2519 = new C2518(c1444);
            c2519.m4662();
            SharedPreferences.Editor editor2 = c2519.f8351;
            if (editor2 != null) {
                editor2.apply();
            }
            if (!C1443.f4940 && !c1444.f4943) {
                try {
                    AbstractC2765.m5147(c1444.f4945, c1444.m3070().concat(".xml"));
                } catch (Throwable unused2) {
                }
            }
        }
        SideActivity sideActivity = SideActivity.f416;
        SideActivity sideActivityM7812 = AbstractC4489.m7812();
        Class<BackgroundJobService> clsM9037 = AbstractC5378.m9037(AbstractC5041.m8557(BackgroundJobService.class));
        Intent intent = new Intent(sideActivityM7812, clsM9037 != null ? clsM9037 : BackgroundJobService.class);
        intent.putExtra(new C4441(new long[]{8521282533933641271L, 8444136157571230746L}).toString(), (c1347.contains(enumC1029.f3638) ? new C4441(new long[]{8848502982728478213L, -7454089772495641218L, 3376697158794110531L, 3341624632184383475L, 7582563126276008264L}) : new C4441(new long[]{-6018997281545679446L, -3795874763289073558L, 1191288374247833591L, -4851513801872287430L})).toString());
        intent.putExtra(new C4441(new long[]{-192215006368436777L, -7106172499350026385L}).toString(), 1500L);
        AbstractC4489.m7812().startForegroundService(intent);
    }

    /* JADX INFO: renamed from: ۥّ */
    public static C5745 m6354() {
        App app = App.f407;
        C1443 c1443 = AbstractC2776.m5217().f410;
        C1542 c1542 = AbstractC2539.f8449;
        Object obj = c1542.f5218;
        String str = c1542.f5219;
        boolean z = C1443.f4940;
        String strValueOf = String.valueOf(((Long) c1443.m3068(obj, str)).longValue());
        int length = strValueOf.length();
        return new C5745(AbstractC2765.m5145(length, length), strValueOf, 4);
    }
}
