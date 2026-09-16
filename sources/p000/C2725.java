package p000;

/* JADX INFO: renamed from: ۥۥَؓؒ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2725 implements InterfaceC0690 {

    /* JADX INFO: renamed from: ۥۣ */
    public final char f9030;

    public C2725(char c) {
        this.f9030 = c;
    }

    @Override // p000.InterfaceC0690
    /* JADX INFO: renamed from: ۥؗ */
    public final int mo1541(C3673 c3673, C3673 c3674) {
        if (c3673.f12277 || c3674.f12271) {
            int i = c3674.f12275;
            if (i % 3 != 0 && (c3673.f12275 + i) % 3 == 0) {
                return 0;
            }
        }
        return (c3673.f12278 < 2 || c3674.f12278 < 2) ? 1 : 2;
    }

    @Override // p000.InterfaceC0690
    /* JADX INFO: renamed from: ۥُ */
    public final char mo1542() {
        return this.f9030;
    }

    @Override // p000.InterfaceC0690
    /* JADX INFO: renamed from: ۥۗ */
    public final int mo1543() {
        return 1;
    }

    @Override // p000.InterfaceC0690
    /* JADX INFO: renamed from: ۥۣ */
    public final char mo1544() {
        return this.f9030;
    }

    @Override // p000.InterfaceC0690
    /* JADX INFO: renamed from: ۦؑ */
    public final void mo1545(C1507 c1507, C1507 c1508, int i) {
        String.valueOf(this.f9030);
        AbstractC3959 c3475 = i == 1 ? new C3475() : new C3157();
        AbstractC3959 abstractC3959 = (AbstractC3959) c1507.f13234;
        while (abstractC3959 != null && abstractC3959 != c1508) {
            AbstractC3959 abstractC39510 = (AbstractC3959) abstractC3959.f13234;
            c3475.m7114(abstractC3959);
            abstractC3959 = abstractC39510;
        }
        c1507.m7115(c3475);
    }
}
