package p000;

/* JADX INFO: renamed from: ۥؘٖٝؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final enum C1914 extends EnumC3840 {
    public C1914() {
        super("MarkupDeclarationOpen", 43);
    }

    @Override // p000.EnumC3840
    /* JADX INFO: renamed from: ۥؗ */
    public final void mo542(C4271 c4271, C3884 c3884) {
        if (c3884.m6966("--")) {
            c4271.f14151.mo975();
            c4271.f14137 = EnumC3840.f12816;
        } else if (c3884.m6962("DOCTYPE")) {
            c4271.f14137 = EnumC3840.f12788;
        } else if (c3884.m6966("[CDATA[")) {
            c4271.m7564();
            c4271.f14137 = EnumC3840.f12812;
        } else {
            c4271.m7571(this);
            c4271.m7568(EnumC3840.f12809);
        }
    }
}
