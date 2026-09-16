package p000;

/* JADX INFO: renamed from: ۥۤؒ٘ؒ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final enum C2662 extends EnumC3840 {
    public C2662() {
        super("SelfClosingStartTag", 41);
    }

    @Override // p000.EnumC3840
    /* JADX INFO: renamed from: ۥؗ */
    public final void mo542(C4271 c4271, C3884 c3884) {
        char cM6961 = c3884.m6961();
        C4338 c4338 = EnumC3840.f12856;
        if (cM6961 == '>') {
            c4271.f14148.f14622 = true;
            c4271.m7574();
            c4271.f14137 = c4338;
        } else if (cM6961 == 65535) {
            c4271.m7570(this);
            c4271.f14137 = c4338;
        } else {
            c4271.m7571(this);
            c3884.m6957();
            c4271.f14137 = EnumC3840.f12813;
        }
    }
}
