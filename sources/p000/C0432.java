package p000;

/* JADX INFO: renamed from: ۥؔۦۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final enum C0432 extends EnumC3840 {
    public C0432() {
        super("RCDATAEndTagName", 12);
    }

    /* JADX INFO: renamed from: ۥُ */
    public static void m929(C4271 c4271, C3884 c3884) {
        c4271.m7567("</".concat(c4271.f14142.toString()));
        c3884.m6957();
        c4271.f14137 = EnumC3840.f12797;
    }

    @Override // p000.EnumC3840
    /* JADX INFO: renamed from: ۥؗ */
    public final void mo542(C4271 c4271, C3884 c3884) {
        if (c3884.m6970()) {
            String strM6955 = c3884.m6955();
            c4271.f14148.m7732(strM6955);
            c4271.f14142.append(strM6955);
            return;
        }
        char cM6961 = c3884.m6961();
        if (cM6961 == '\t' || cM6961 == '\n' || cM6961 == '\f' || cM6961 == '\r' || cM6961 == ' ') {
            if (c4271.m7576()) {
                c4271.f14137 = EnumC3840.f12813;
                return;
            } else {
                m929(c4271, c3884);
                return;
            }
        }
        if (cM6961 == '/') {
            if (c4271.m7576()) {
                c4271.f14137 = EnumC3840.f12796;
                return;
            } else {
                m929(c4271, c3884);
                return;
            }
        }
        if (cM6961 != '>') {
            m929(c4271, c3884);
        } else if (!c4271.m7576()) {
            m929(c4271, c3884);
        } else {
            c4271.m7574();
            c4271.f14137 = EnumC3840.f12856;
        }
    }
}
