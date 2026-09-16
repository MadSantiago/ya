package p000;

/* JADX INFO: renamed from: ۥ۟ؑٙۥ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final enum C2422 extends EnumC3840 {
    public C2422() {
        super("BeforeAttributeName", 33);
    }

    @Override // p000.EnumC3840
    /* JADX INFO: renamed from: ۥؗ */
    public final void mo542(C4271 c4271, C3884 c3884) {
        char cM6961 = c3884.m6961();
        C0800 c0800 = EnumC3840.f12791;
        if (cM6961 == 0) {
            c4271.m7571(this);
            c4271.f14148.m7730();
            c3884.m6957();
            c4271.f14137 = c0800;
            return;
        }
        if (cM6961 != ' ') {
            if (cM6961 != '\"' && cM6961 != '\'') {
                if (cM6961 == '/') {
                    c4271.f14137 = EnumC3840.f12796;
                    return;
                }
                C4338 c4338 = EnumC3840.f12856;
                if (cM6961 == 65535) {
                    c4271.m7570(this);
                    c4271.f14137 = c4338;
                    return;
                }
                if (cM6961 == '\t' || cM6961 == '\n' || cM6961 == '\f' || cM6961 == '\r') {
                    return;
                }
                switch (cM6961) {
                    case '<':
                    case '=':
                        break;
                    case '>':
                        c4271.m7574();
                        c4271.f14137 = c4338;
                        break;
                    default:
                        c4271.f14148.m7730();
                        c3884.m6957();
                        c4271.f14137 = c0800;
                        break;
                }
                return;
            }
            c4271.m7571(this);
            c4271.f14148.m7730();
            c4271.f14148.m7728(cM6961);
            c4271.f14137 = c0800;
        }
    }
}
