package p000;

import java.util.Map;

/* JADX INFO: renamed from: ۥ۟ؒؑٝ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2427 extends InterfaceC0151 {
    /* JADX INFO: renamed from: ۥۤ */
    InterfaceC5370 mo748(int i, int i2, Map map, InterfaceC4745 interfaceC4745, InterfaceC4745 interfaceC4746);

    /* JADX INFO: renamed from: ۦۤ */
    default InterfaceC5370 mo755(int i, int i2, Map map, InterfaceC4745 interfaceC4745) {
        return mo748(i, i2, map, null, interfaceC4745);
    }
}
