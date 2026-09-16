package p000;

import java.util.Set;

/* JADX INFO: renamed from: ۦٟۣؓؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC4844 {
    /* JADX INFO: renamed from: ۥؗ */
    default Set mo5365(C1166 c1166) {
        return (Set) mo5370(c1166).get();
    }

    /* JADX INFO: renamed from: ۥُ */
    C1510 mo5366(C1166 c1166);

    /* JADX INFO: renamed from: ۥّ */
    InterfaceC2090 mo5367(C1166 c1166);

    /* JADX INFO: renamed from: ۥۗ */
    InterfaceC2090 mo5370(C1166 c1166);

    /* JADX INFO: renamed from: ۥۣ */
    default Object mo5371(Class cls) {
        return mo5376(C1166.m2484(cls));
    }

    /* JADX INFO: renamed from: ۦؑ */
    default InterfaceC2090 mo5372(Class cls) {
        return mo5367(C1166.m2484(cls));
    }

    /* JADX INFO: renamed from: ۦۙ */
    default Object mo5376(C1166 c1166) {
        InterfaceC2090 interfaceC2090Mo5367 = mo5367(c1166);
        if (interfaceC2090Mo5367 == null) {
            return null;
        }
        return interfaceC2090Mo5367.get();
    }
}
