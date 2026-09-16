package p000;

import java.util.Map;

/* JADX INFO: renamed from: ۥٕؑۘٝ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1382 implements InterfaceC4734 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final C1382 f4733 = new C1382();

    /* JADX INFO: renamed from: ۥۗ */
    public static final C2026 f4732 = C2026.f6683;

    @Override // p000.InterfaceC4734
    /* JADX INFO: renamed from: ۥؗ */
    public final InterfaceC0103 mo193() {
        return f4732;
    }

    @Override // p000.InterfaceC4734
    /* JADX INFO: renamed from: ۥۗ */
    public final Object mo196(InterfaceC2125 interfaceC2125) {
        AbstractC4593.m7968(interfaceC2125);
        return new C2945((Map) new C5209(C2258.f7505, C3107.f10419).m3302(interfaceC2125));
    }

    @Override // p000.InterfaceC4734
    /* JADX INFO: renamed from: ۦؑ */
    public final void mo197(C3782 c3782, Object obj) {
        C2945 c2945 = (C2945) obj;
        AbstractC4593.m7969(c3782);
        C2258 c2258 = C2258.f7505;
        C3107 c3107 = C3107.f10419;
        C4398 c4398 = new C4398(C2258.f7504, C3107.f10418);
        c2945.size();
        C3782 c3782M6691 = c3782.m6691(c4398);
        int i = 0;
        for (Map.Entry entry : c2945.f9885.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i2 = i + 1;
            c3782M6691.m6699(c4398, i, c2258, key);
            i += 2;
            c3782M6691.m6699(c4398, i2, c3107, value);
        }
        c3782M6691.m6683();
    }
}
