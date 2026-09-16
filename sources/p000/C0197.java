package p000;

/* JADX INFO: renamed from: ۥۣؑؔٞ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0197 implements InterfaceC4448 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ C2677 f725;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f726;

    public /* synthetic */ C0197(C2677 c2677, int i) {
        this.f726 = i;
        this.f725 = c2677;
    }

    @Override // p000.InterfaceC4448
    /* JADX INFO: renamed from: ۥۣ */
    public final Object mo449() {
        int i = this.f726;
        C2677 c2677 = this.f725;
        switch (i) {
            case 0:
                return Boolean.valueOf(c2677.f17786);
            default:
                C3468 c3468 = c2677.f8870;
                if (!c3468.f17791.f17786) {
                    return null;
                }
                EnumC4125 enumC4125M6254 = c3468.m6254();
                int iOrdinal = enumC4125M6254.ordinal();
                if (iOrdinal != 0 && iOrdinal != 1 && iOrdinal != 2) {
                    if (iOrdinal == 3) {
                        return null;
                    }
                    C1078.m2275();
                    return null;
                }
                if (enumC4125M6254.m7315()) {
                    return c3468.m6248(null);
                }
                C3468 c3468M3926 = ((C2016) ((ViewTreeObserverOnGlobalLayoutListenerC0850) AbstractC5537.m9224(c3468)).getFocusOwner()).m3926();
                if (c3468M3926 != null) {
                    return c3468M3926.m6248(AbstractC5537.m9247(c3468));
                }
                return null;
        }
    }
}
