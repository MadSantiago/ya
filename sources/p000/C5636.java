package p000;

/* JADX INFO: renamed from: ۦۤؑٗٛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5636 extends AbstractC5682 {

    /* JADX INFO: renamed from: ۥؗ */
    public static final C5636 f18568 = new C5636(0, 3, 1);

    @Override // p000.AbstractC5682
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo182(C4902 c4902, InterfaceC4790 interfaceC4790, C0126 c0126, C0175 c0175, InterfaceC4617 interfaceC4617) {
        C3369 c3369;
        C2575 c2575 = (C2575) c4902.m8252(1);
        C4356 c4356 = (C4356) c4902.m8252(0);
        C0953 c0953 = (C0953) c4902.m8252(2);
        C0126 c0126M4872 = c2575.m4872();
        if (interfaceC4617 != null) {
            try {
                c3369 = new C3369(24, interfaceC4617, c0126);
            } catch (Throwable th) {
                c0126M4872.m234(false);
                throw th;
            }
        } else {
            c3369 = null;
        }
        if (!c0953.f3384.m451()) {
            AbstractC5508.m9201("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
        }
        c0953.f3385.m450(interfaceC4790, c0126M4872, c0175, c3369);
        c0126M4872.m234(true);
        c0126.m250();
        c4356.getClass();
        c0126.m230(c2575, c2575.m4873(c4356));
        c0126.m258();
    }
}
