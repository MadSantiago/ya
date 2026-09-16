package p000;

/* JADX INFO: renamed from: ۦِؕ۠٘, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final enum C3978 extends EnumC3840 {
    public C3978() {
        super("ScriptDataDoubleEscapedDash", 29);
    }

    @Override // p000.EnumC3840
    /* JADX INFO: renamed from: ۥؗ */
    public final void mo542(C4271 c4271, C3884 c3884) {
        char cM6961 = c3884.m6961();
        C4426 c4426 = EnumC3840.f12802;
        if (cM6961 == 0) {
            c4271.m7571(this);
            c4271.m7565((char) 65533);
            c4271.f14137 = c4426;
        } else if (cM6961 == '-') {
            c4271.m7565(cM6961);
            c4271.f14137 = EnumC3840.f12817;
        } else if (cM6961 == '<') {
            c4271.m7565(cM6961);
            c4271.f14137 = EnumC3840.f12824;
        } else if (cM6961 != 65535) {
            c4271.m7565(cM6961);
            c4271.f14137 = c4426;
        } else {
            c4271.m7570(this);
            c4271.f14137 = EnumC3840.f12856;
        }
    }
}
