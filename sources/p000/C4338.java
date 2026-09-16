package p000;

/* JADX INFO: renamed from: ۦؘُٗؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final enum C4338 extends EnumC3840 {
    public C4338() {
        super("Data", 0);
    }

    @Override // p000.EnumC3840
    /* JADX INFO: renamed from: ۥؗ */
    public final void mo542(C4271 c4271, C3884 c3884) {
        int i;
        char c;
        char cM6965 = c3884.m6965();
        if (cM6965 == 0) {
            c4271.m7571(this);
            c4271.m7565(c3884.m6961());
            return;
        }
        if (cM6965 == '&') {
            c4271.m7568(EnumC3840.f12849);
            return;
        }
        if (cM6965 == '<') {
            c4271.m7568(EnumC3840.f12841);
            return;
        }
        if (cM6965 == 65535) {
            c4271.m7575(new C0454());
            return;
        }
        c3884.m6958();
        int i2 = c3884.f12990;
        int i3 = c3884.f12989;
        char[] cArr = c3884.f12994;
        while (true) {
            i = c3884.f12990;
            if (i >= i3 || (c = cArr[i]) == '&' || c == '<' || c == 0) {
                break;
            } else {
                c3884.f12990 = i + 1;
            }
        }
        c4271.m7567(i > i2 ? C3884.m6954(cArr, c3884.f12993, i2, i - i2) : "");
    }
}
