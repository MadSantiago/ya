package p000;

/* JADX INFO: renamed from: ۦٜٖٚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final enum C4588 extends EnumC3840 {
    public C4588() {
        super("RCDATAEndTagOpen", 11);
    }

    @Override // p000.EnumC3840
    /* JADX INFO: renamed from: ۥؗ */
    public final void mo542(C4271 c4271, C3884 c3884) {
        if (!c3884.m6970()) {
            c4271.m7567("</");
            c4271.f14137 = EnumC3840.f12797;
            return;
        }
        c4271.m7569(false);
        AbstractC4435 abstractC4435 = c4271.f14148;
        char cM6965 = c3884.m6965();
        abstractC4435.getClass();
        abstractC4435.m7732(String.valueOf(cM6965));
        c4271.f14142.append(c3884.m6965());
        c4271.m7568(EnumC3840.f12789);
    }
}
