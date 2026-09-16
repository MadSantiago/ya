package p000;

import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: renamed from: ۦۚؖۛؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5193 implements InterfaceC1588 {

    /* JADX INFO: renamed from: ۥؗ */
    public static final C5802 f17176;

    /* JADX INFO: renamed from: ۥُ */
    public static final C5802 f17177;

    /* JADX INFO: renamed from: ۥۗ */
    public static final C5802 f17178;

    /* JADX INFO: renamed from: ۥۣ */
    public static final C5193 f17179 = new C5193();

    /* JADX INFO: renamed from: ۦؑ */
    public static final C5802 f17180;

    static {
        C0364 c0364 = new C0364(1);
        HashMap map = new HashMap();
        map.put(InterfaceC3552.class, c0364);
        f17178 = new C5802("window", Collections.unmodifiableMap(new HashMap(map)));
        C0364 c0365 = new C0364(2);
        HashMap map2 = new HashMap();
        map2.put(InterfaceC3552.class, c0365);
        f17176 = new C5802("logSourceMetrics", Collections.unmodifiableMap(new HashMap(map2)));
        C0364 c0366 = new C0364(3);
        HashMap map3 = new HashMap();
        map3.put(InterfaceC3552.class, c0366);
        f17180 = new C5802("globalMetrics", Collections.unmodifiableMap(new HashMap(map3)));
        C0364 c0367 = new C0364(4);
        HashMap map4 = new HashMap();
        map4.put(InterfaceC3552.class, c0367);
        f17177 = new C5802("appNamespace", Collections.unmodifiableMap(new HashMap(map4)));
    }

    @Override // p000.InterfaceC1476
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo206(Object obj, Object obj2) {
        C2807 c2807 = (C2807) obj;
        InterfaceC5267 interfaceC5267 = (InterfaceC5267) obj2;
        interfaceC5267.mo6180(f17178, c2807.f9371);
        interfaceC5267.mo6180(f17176, c2807.f9370);
        interfaceC5267.mo6180(f17180, c2807.f9369);
        interfaceC5267.mo6180(f17177, c2807.f9372);
    }
}
