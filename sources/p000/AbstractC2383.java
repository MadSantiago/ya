package p000;

import com.tencent.mmkv.MMKV;
import ru.bluecat.yandexmapspatcher.search.EnvironmentInitializer;

/* JADX INFO: renamed from: ۥؘۜؕۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2383 extends AbstractC4593 {
    /* JADX INFO: renamed from: ۦؖ */
    public static C5836 m4461(C0395 c0395) {
        C3570 c3570;
        MMKV mmkvM166 = EnvironmentInitializer.m166();
        String str = c0395.f1460;
        if (mmkvM166.m150(str)) {
            String strM151 = EnvironmentInitializer.m166().m151(str);
            if (strM151 != null) {
                return new C5836(strM151);
            }
        } else {
            C4524.f14953.getClass();
            C1443 c1443M7845 = C4524.m7845();
            C1542 c1542 = AbstractC2539.f8457;
            Object obj = c1542.f5218;
            String str2 = c1542.f5219;
            boolean z = C1443.f4940;
            if (((Boolean) c1443M7845.m3068(obj, str2)).booleanValue()) {
                c3570 = null;
            } else {
                c3570 = (C3570) C4524.f14954.m7847().m160(c0395.f1458).m6574(c0395.f1461).m6536();
                String str3 = c0395.f1460;
                C5144 c5144 = new C5144(8, str3, c0395.f1459, c3570 != null ? c3570.f11821 : null, null);
                if (c3570 != null) {
                    AbstractC4593.m7966(c5144);
                } else {
                    AbstractC4593.m7980(str3);
                }
            }
            if (c3570 != null) {
                return c3570.m6362();
            }
        }
        return null;
    }
}
