package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: ۦۣؒؕ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5582 extends AbstractC5682 {

    /* JADX INFO: renamed from: ۥؗ */
    public static final C5582 f18409 = new C5582(0, 1, 1);

    @Override // p000.AbstractC5682
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo182(C4902 c4902, InterfaceC4790 interfaceC4790, C0126 c0126, C0175 c0175, InterfaceC4617 interfaceC4617) {
        C5863 c5863 = (C5863) c4902.m8252(0);
        C3262 c3262 = (C3262) c0175.f657;
        C3366 c3366 = c3262 != null ? (C3366) c3262.m6027(c5863) : null;
        if (c3366 != null) {
            ArrayList arrayList = (ArrayList) c0175.f659;
            if (arrayList == null) {
                arrayList = new ArrayList();
                c0175.f659 = arrayList;
            }
            arrayList.add((C0863) c0175.f656);
            c0175.f656 = c3366.f11243;
        }
    }
}
