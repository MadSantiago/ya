package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: ۦؚؚٟؗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3620 extends AbstractC5682 {

    /* JADX INFO: renamed from: ۥؗ */
    public static final C3620 f12065 = new C3620(0, 1, 1);

    @Override // p000.AbstractC5682
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo182(C4902 c4902, InterfaceC4790 interfaceC4790, C0126 c0126, C0175 c0175, InterfaceC4617 interfaceC4617) {
        C0863 c0863;
        C5863 c5863 = (C5863) c4902.m8252(0);
        C3262 c3262 = (C3262) c0175.f657;
        if (c3262 == null || ((C3366) c3262.m6027(c5863)) == null) {
            return;
        }
        ArrayList arrayList = (ArrayList) c0175.f659;
        if (arrayList != null && (c0863 = (C0863) arrayList.remove(arrayList.size() - 1)) != null) {
            c0175.f656 = c0863;
        }
        c3262.m6026(c5863);
    }
}
