package p000;

/* JADX INFO: renamed from: ۥٖٙؕٚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final enum C1666 extends EnumC3840 {
    public C1666() {
        super("TagName", 9);
    }

    @Override // p000.EnumC3840
    /* JADX INFO: renamed from: ۥؗ */
    public final void mo542(C4271 c4271, C3884 c3884) {
        int i;
        char c;
        c3884.m6958();
        int i2 = c3884.f12990;
        int i3 = c3884.f12989;
        char[] cArr = c3884.f12994;
        while (true) {
            i = c3884.f12990;
            if (i >= i3 || (c = cArr[i]) == '\t' || c == '\n' || c == '\r' || c == '\f' || c == ' ' || c == '/' || c == '>' || c == 0) {
                break;
            } else {
                c3884.f12990 = i + 1;
            }
        }
        c4271.f14148.m7732(i > i2 ? C3884.m6954(cArr, c3884.f12993, i2, i - i2) : "");
        char cM6961 = c3884.m6961();
        if (cM6961 == 0) {
            c4271.f14148.m7732(EnumC3840.f12837);
            return;
        }
        if (cM6961 != ' ') {
            if (cM6961 == '/') {
                c4271.f14137 = EnumC3840.f12796;
                return;
            }
            C4338 c4338 = EnumC3840.f12856;
            if (cM6961 == '>') {
                c4271.m7574();
                c4271.f14137 = c4338;
                return;
            }
            if (cM6961 == 65535) {
                c4271.m7570(this);
                c4271.f14137 = c4338;
                return;
            } else if (cM6961 != '\t' && cM6961 != '\n' && cM6961 != '\f' && cM6961 != '\r') {
                AbstractC4435 abstractC4435 = c4271.f14148;
                abstractC4435.getClass();
                abstractC4435.m7732(String.valueOf(cM6961));
                return;
            }
        }
        c4271.f14137 = EnumC3840.f12813;
    }
}
