package p000;

/* JADX INFO: renamed from: ۦٜؐۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final enum C3010 extends EnumC3840 {
    public C3010() {
        super("ScriptDataLessthanSign", 16);
    }

    @Override // p000.EnumC3840
    /* JADX INFO: renamed from: ۥؗ */
    public final void mo542(C4271 c4271, C3884 c3884) {
        char cM6961 = c3884.m6961();
        if (cM6961 == '!') {
            c4271.m7567("<!");
            c4271.f14137 = EnumC3840.f12830;
        } else if (cM6961 == '/') {
            c4271.m7564();
            c4271.f14137 = EnumC3840.f12799;
        } else {
            c4271.m7567("<");
            c3884.m6957();
            c4271.f14137 = EnumC3840.f12800;
        }
    }
}
