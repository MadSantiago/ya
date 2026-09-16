package p000;

/* JADX INFO: renamed from: ۥ٘ؓؓۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final enum C1561 extends EnumC3840 {
    public C1561() {
        super("AttributeValue_doubleQuoted", 37);
    }

    @Override // p000.EnumC3840
    /* JADX INFO: renamed from: ۥؗ */
    public final void mo542(C4271 c4271, C3884 c3884) {
        String strM6967 = c3884.m6967(EnumC3840.f12832);
        int length = strM6967.length();
        AbstractC4435 abstractC4435 = c4271.f14148;
        if (length > 0) {
            abstractC4435.m7729(strM6967);
        } else {
            abstractC4435.f14623 = true;
        }
        char cM6961 = c3884.m6961();
        if (cM6961 == 0) {
            c4271.m7571(this);
            c4271.f14148.m7735((char) 65533);
            return;
        }
        if (cM6961 == '\"') {
            c4271.f14137 = EnumC3840.f12850;
            return;
        }
        if (cM6961 != '&') {
            if (cM6961 != 65535) {
                c4271.f14148.m7735(cM6961);
                return;
            } else {
                c4271.m7570(this);
                c4271.f14137 = EnumC3840.f12856;
                return;
            }
        }
        int[] iArrM7563 = c4271.m7563('\"', true);
        AbstractC4435 abstractC4436 = c4271.f14148;
        if (iArrM7563 != null) {
            abstractC4436.m7733(iArrM7563);
        } else {
            abstractC4436.m7735('&');
        }
    }
}
