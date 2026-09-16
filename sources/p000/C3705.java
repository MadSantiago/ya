package p000;

/* JADX INFO: renamed from: ۦٌؘؘؒ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final enum C3705 extends EnumC3840 {
    public C3705() {
        super("DoctypeName", 52);
    }

    @Override // p000.EnumC3840
    /* JADX INFO: renamed from: ۥؗ */
    public final void mo542(C4271 c4271, C3884 c3884) {
        C5506 c5506 = c4271.f14146;
        if (c3884.m6970()) {
            c5506.f18181.append(c3884.m6955());
            return;
        }
        char cM6961 = c3884.m6961();
        if (cM6961 == 0) {
            c4271.m7571(this);
            c5506.f18181.append((char) 65533);
            return;
        }
        if (cM6961 != ' ') {
            C4338 c4338 = EnumC3840.f12856;
            if (cM6961 == '>') {
                c4271.m7572();
                c4271.f14137 = c4338;
                return;
            } else if (cM6961 == 65535) {
                c4271.m7570(this);
                c4271.m7572();
                c4271.f14137 = c4338;
                return;
            } else if (cM6961 != '\t' && cM6961 != '\n' && cM6961 != '\f' && cM6961 != '\r') {
                c5506.f18181.append(cM6961);
                return;
            }
        }
        c4271.f14137 = EnumC3840.f12804;
    }
}
