package p000;

import java.util.Set;

/* JADX INFO: renamed from: ۥٟ۠ؕؐ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2517 extends AbstractC5682 {

    /* JADX INFO: renamed from: ۥؗ */
    public static final C2517 f8349 = new C2517(0, 1, 1);

    @Override // p000.AbstractC5682
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo182(C4902 c4902, InterfaceC4790 interfaceC4790, C0126 c0126, C0175 c0175, InterfaceC4617 interfaceC4617) {
        C5863 c5863 = (C5863) c4902.m8252(0);
        Set set = (Set) c0175.f655;
        if (set == null) {
            return;
        }
        C3366 c3366 = new C3366(set);
        C3262 c3262 = (C3262) c0175.f657;
        if (c3262 == null) {
            long[] jArr = AbstractC5064.f16815;
            c3262 = new C3262();
            c0175.f657 = c3262;
        }
        c3262.m6023(c5863, c3366);
        ((C0863) c0175.f656).m1843(new C1670(c3366, -1));
    }
}
