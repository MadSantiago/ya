package p000;

/* JADX INFO: renamed from: ۦُ٘ؔؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final enum C4426 extends EnumC3840 {
    public C4426() {
        super("ScriptDataDoubleEscaped", 28);
    }

    @Override // p000.EnumC3840
    /* JADX INFO: renamed from: ۥؗ */
    public final void mo542(C4271 c4271, C3884 c3884) {
        char cM6965 = c3884.m6965();
        if (cM6965 == 0) {
            c4271.m7571(this);
            c3884.m6960();
            c4271.m7565((char) 65533);
        } else if (cM6965 == '-') {
            c4271.m7565(cM6965);
            c4271.m7568(EnumC3840.f12805);
        } else if (cM6965 == '<') {
            c4271.m7565(cM6965);
            c4271.m7568(EnumC3840.f12824);
        } else if (cM6965 != 65535) {
            c4271.m7567(c3884.m6967('-', '<', 0));
        } else {
            c4271.m7570(this);
            c4271.f14137 = EnumC3840.f12856;
        }
    }
}
