package p000;

/* JADX INFO: renamed from: ۥَٕؔۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1006 implements InterfaceC1588 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final C1006 f3593 = new C1006();

    /* JADX INFO: renamed from: ۥۗ */
    public static final C5802 f3592 = C5802.m9613("processName");

    /* JADX INFO: renamed from: ۥؗ */
    public static final C5802 f3590 = C5802.m9613("pid");

    /* JADX INFO: renamed from: ۦؑ */
    public static final C5802 f3594 = C5802.m9613("importance");

    /* JADX INFO: renamed from: ۥُ */
    public static final C5802 f3591 = C5802.m9613("defaultProcess");

    @Override // p000.InterfaceC1476
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo206(Object obj, Object obj2) {
        AbstractC1355 abstractC1355 = (AbstractC1355) obj;
        InterfaceC5267 interfaceC5267 = (InterfaceC5267) obj2;
        interfaceC5267.mo6180(f3592, ((C5498) abstractC1355).f18158);
        C5498 c5498 = (C5498) abstractC1355;
        interfaceC5267.mo6176(f3590, c5498.f18157);
        interfaceC5267.mo6176(f3594, c5498.f18156);
        interfaceC5267.mo6181(f3591, c5498.f18159);
    }
}
