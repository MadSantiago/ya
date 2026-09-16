package p000;

import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: renamed from: ۥٕٖؗؒ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1420 implements InterfaceC1588 {

    /* JADX INFO: renamed from: ۥؗ */
    public static final C5802 f4888;

    /* JADX INFO: renamed from: ۥۗ */
    public static final C5802 f4889;

    /* JADX INFO: renamed from: ۥۣ */
    public static final C1420 f4890 = new C1420();

    static {
        C0364 c0364 = new C0364(1);
        HashMap map = new HashMap();
        map.put(InterfaceC3552.class, c0364);
        f4889 = new C5802("logSource", Collections.unmodifiableMap(new HashMap(map)));
        C0364 c0365 = new C0364(2);
        HashMap map2 = new HashMap();
        map2.put(InterfaceC3552.class, c0365);
        f4888 = new C5802("logEventDropped", Collections.unmodifiableMap(new HashMap(map2)));
    }

    @Override // p000.InterfaceC1476
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo206(Object obj, Object obj2) {
        C4283 c4283 = (C4283) obj;
        InterfaceC5267 interfaceC5267 = (InterfaceC5267) obj2;
        interfaceC5267.mo6180(f4889, c4283.f14172);
        interfaceC5267.mo6180(f4888, c4283.f14171);
    }
}
