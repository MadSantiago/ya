package p000;

/* JADX INFO: renamed from: ۥۜؑۘؐ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final enum C2364 extends EnumC3840 {
    public C2364() {
        super("DoctypeSystemIdentifier_singleQuoted", 63);
    }

    @Override // p000.EnumC3840
    /* JADX INFO: renamed from: ۥؗ */
    public final void mo542(C4271 c4271, C3884 c3884) {
        C5506 c5506 = c4271.f14146;
        char cM6961 = c3884.m6961();
        if (cM6961 == 0) {
            c4271.m7571(this);
            c5506.f18182.append((char) 65533);
            return;
        }
        if (cM6961 == '\'') {
            c4271.f14137 = EnumC3840.f12846;
            return;
        }
        C4338 c4338 = EnumC3840.f12856;
        if (cM6961 == '>') {
            c4271.m7571(this);
            c4271.m7572();
            c4271.f14137 = c4338;
        } else {
            if (cM6961 != 65535) {
                c5506.f18182.append(cM6961);
                return;
            }
            c4271.m7570(this);
            c4271.m7572();
            c4271.f14137 = c4338;
        }
    }
}
