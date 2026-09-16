package p000;

/* JADX INFO: renamed from: ۦٕۙٔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final enum C5139 extends EnumC3840 {
    public C5139() {
        super("CdataSection", 66);
    }

    @Override // p000.EnumC3840
    /* JADX INFO: renamed from: ۥؗ */
    public final void mo542(C4271 c4271, C3884 c3884) {
        String strM6954;
        StringBuilder sb = c4271.f14142;
        String[] strArr = c3884.f12993;
        char[] cArr = c3884.f12994;
        int iM6969 = c3884.m6969("]]>");
        if (iM6969 != -1) {
            strM6954 = C3884.m6954(cArr, strArr, c3884.f12990, iM6969);
            c3884.f12990 += iM6969;
        } else {
            c3884.m6958();
            int i = c3884.f12990;
            strM6954 = C3884.m6954(cArr, strArr, i, c3884.f12989 - i);
            c3884.f12990 = c3884.f12989;
        }
        sb.append(strM6954);
        if (c3884.m6966("]]>") || c3884.m6964()) {
            String string = sb.toString();
            C0571 c0571 = new C0571(5);
            c0571.f15307 = string;
            c4271.m7575(c0571);
            c4271.f14137 = EnumC3840.f12856;
        }
    }
}
