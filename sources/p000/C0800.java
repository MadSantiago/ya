package p000;

/* JADX INFO: renamed from: ۥؚؗۗ٘, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final enum C0800 extends EnumC3840 {
    public C0800() {
        super("AttributeName", 34);
    }

    @Override // p000.EnumC3840
    /* JADX INFO: renamed from: ۥؗ */
    public final void mo542(C4271 c4271, C3884 c3884) {
        String strM6959 = c3884.m6959(EnumC3840.f12836);
        AbstractC4435 abstractC4435 = c4271.f14148;
        String str = abstractC4435.f14620;
        if (str != null) {
            strM6959 = str.concat(strM6959);
        }
        abstractC4435.f14620 = strM6959;
        char cM6961 = c3884.m6961();
        if (cM6961 == 0) {
            c4271.m7571(this);
            c4271.f14148.m7728((char) 65533);
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
                if (cM6961 != '\t' && cM6961 != '\n' && cM6961 != '\f' && cM6961 != '\r') {
                    switch (cM6961) {
                        case '<':
                            break;
                        case '=':
                            c4271.f14137 = EnumC3840.f12815;
                            break;
                        case '>':
                            c4271.m7574();
                            c4271.f14137 = c4338;
                            break;
                        default:
                            c4271.f14148.m7728(cM6961);
                            break;
                    }
                    return;
                }
            }
            c4271.m7571(this);
            c4271.f14148.m7728(cM6961);
            return;
        }
        c4271.f14137 = EnumC3840.f12790;
    }
}
