package p000;

import java.util.HashMap;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: ۦؚۨؓؐ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class CallableC5867 implements Callable {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ String f19377;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ C3040 f19378;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f19379;

    public /* synthetic */ CallableC5867(C3040 c3040, String str, int i) {
        this.f19379 = i;
        this.f19378 = c3040;
        this.f19377 = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.f19379;
        String str = this.f19377;
        C3040 c3040 = this.f19378;
        switch (i) {
            case 0:
                return new C2651(new CallableC5867(c3040, str, 1));
            case 1:
                C1159 c1159 = c3040.f19371.f16670;
                C5034.m8484(c1159);
                C2976 c2976M2429 = c1159.m2429(str);
                HashMap map = new HashMap();
                map.put("platform", "android");
                map.put("package_name", str);
                ((C5371) c3040.f18660).f17715.m1160();
                map.put("gmp_version", 161000L);
                if (c2976M2429 != null) {
                    String strM5571 = c2976M2429.m5571();
                    if (strM5571 != null) {
                        map.put("app_version", strM5571);
                    }
                    map.put("app_version_int", Long.valueOf(c2976M2429.m5541()));
                    map.put("dynamite_version", Long.valueOf(c2976M2429.m5544()));
                }
                return map;
            default:
                C2346 c2346 = new C2346(24, c3040, str, false);
                C2825 c2825 = new C2825(0, "internal.remoteConfig");
                c2825.f3771.put("getValue", new C2651(c2825, c2346));
                return c2825;
        }
    }
}
