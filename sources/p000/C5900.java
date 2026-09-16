package p000;

import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: renamed from: ۦًۨؗٗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5900 implements InterfaceC1588 {

    /* JADX INFO: renamed from: ۥۗ */
    public static final C5802 f19452;

    /* JADX INFO: renamed from: ۥۣ */
    public static final C5900 f19453 = new C5900();

    static {
        C0364 c0364 = new C0364(1);
        HashMap map = new HashMap();
        map.put(InterfaceC3552.class, c0364);
        f19452 = new C5802("storageMetrics", Collections.unmodifiableMap(new HashMap(map)));
    }

    @Override // p000.InterfaceC1476
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo206(Object obj, Object obj2) {
        ((InterfaceC5267) obj2).mo6180(f19452, ((C2190) obj).f7268);
    }
}
