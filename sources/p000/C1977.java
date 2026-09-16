package p000;

/* JADX INFO: renamed from: ۥًٖٞ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final enum C1977 extends EnumC3840 {
    public C1977() {
        super("CommentEnd", 48);
    }

    @Override // p000.EnumC3840
    /* JADX INFO: renamed from: ۥؗ */
    public final void mo542(C4271 c4271, C3884 c3884) {
        C3874 c3874 = c4271.f14151;
        char cM6961 = c3884.m6961();
        C5667 c5667 = EnumC3840.f12843;
        if (cM6961 == 0) {
            c4271.m7571(this);
            StringBuilder sb = c3874.f12924;
            sb.append("--");
            sb.append((char) 65533);
            c4271.f14137 = c5667;
            return;
        }
        if (cM6961 == '!') {
            c4271.m7571(this);
            c4271.f14137 = EnumC3840.f12845;
            return;
        }
        if (cM6961 == '-') {
            c4271.m7571(this);
            c3874.f12924.append('-');
            return;
        }
        C4338 c4338 = EnumC3840.f12856;
        if (cM6961 == '>') {
            c4271.m7573();
            c4271.f14137 = c4338;
        } else if (cM6961 == 65535) {
            c4271.m7570(this);
            c4271.m7573();
            c4271.f14137 = c4338;
        } else {
            c4271.m7571(this);
            StringBuilder sb2 = c3874.f12924;
            sb2.append("--");
            sb2.append(cM6961);
            c4271.f14137 = c5667;
        }
    }
}
