package p000;

import java.util.Date;
import java.util.HashMap;

/* JADX INFO: renamed from: ۥؗٞۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0639 implements InterfaceC5539 {

    /* JADX INFO: renamed from: ۥٖ */
    public static final C1766 f2391;

    /* JADX INFO: renamed from: ۦٗ */
    public static final C1766 f2392;

    /* JADX INFO: renamed from: ۥْ */
    public final C0872 f2394;

    /* JADX INFO: renamed from: ۥٓ */
    public boolean f2395;

    /* JADX INFO: renamed from: ۦ۟ */
    public final HashMap f2396;

    /* JADX INFO: renamed from: ۦۨ */
    public final HashMap f2397;

    /* JADX INFO: renamed from: ۥَ */
    public static final C0872 f2390 = new C0872(0);

    /* JADX INFO: renamed from: ۦۛ */
    public static final C0503 f2393 = new C0503();

    /* JADX WARN: Type inference failed for: r0v1, types: [ۥٛؓؕ٘] */
    /* JADX WARN: Type inference failed for: r0v2, types: [ۥٛؓؕ٘] */
    static {
        final int i = 0;
        f2391 = new InterfaceC3531() { // from class: ۥٛؓؕ٘
            @Override // p000.InterfaceC1476
            /* JADX INFO: renamed from: ۥۣ */
            public final void mo206(Object obj, Object obj2) {
                switch (i) {
                    case 0:
                        ((InterfaceC4944) obj2).mo6178((String) obj);
                        break;
                    default:
                        ((InterfaceC4944) obj2).mo6175(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
        final int i2 = 1;
        f2392 = new InterfaceC3531() { // from class: ۥٛؓؕ٘
            @Override // p000.InterfaceC1476
            /* JADX INFO: renamed from: ۥۣ */
            public final void mo206(Object obj, Object obj2) {
                switch (i2) {
                    case 0:
                        ((InterfaceC4944) obj2).mo6178((String) obj);
                        break;
                    default:
                        ((InterfaceC4944) obj2).mo6175(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
    }

    public C0639() {
        HashMap map = new HashMap();
        this.f2397 = map;
        HashMap map2 = new HashMap();
        this.f2396 = map2;
        this.f2394 = f2390;
        this.f2395 = false;
        map2.put(String.class, f2391);
        map.remove(String.class);
        map2.put(Boolean.class, f2392);
        map.remove(Boolean.class);
        map2.put(Date.class, f2393);
        map.remove(Date.class);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC5539 m1457(Class cls, InterfaceC1588 interfaceC1588) {
        this.f2397.put(cls, interfaceC1588);
        this.f2396.remove(cls);
        return this;
    }
}
