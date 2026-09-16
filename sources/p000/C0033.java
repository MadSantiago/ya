package p000;

/* JADX INFO: renamed from: ۥٟ */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0033 extends AbstractC0057 {

    /* JADX INFO: renamed from: ۥُ */
    public static C0033 f6543;

    /* JADX INFO: renamed from: ۥؗ */
    public C3828 f6544;

    /* JADX INFO: renamed from: ۦؑ */
    public C3129 f6545;

    @Override // p000.AbstractC0057
    /* JADX INFO: renamed from: ۥُ */
    public final int[] mo3871(int i) {
        int iM4330;
        String str = (String) this.f10925;
        if (str == null) {
            str = null;
        }
        if (str.length() > 0) {
            String str2 = (String) this.f10925;
            if (str2 == null) {
                str2 = null;
            }
            if (i < str2.length()) {
                try {
                    C3129 c3129 = this.f6545;
                    if (c3129 == null) {
                        c3129 = null;
                    }
                    C2793 c2793M5770 = c3129.m5770();
                    int iRound = Math.round(c2793M5770.f9344 - c2793M5770.f9342);
                    if (i <= 0) {
                        i = 0;
                    }
                    C3828 c3828 = this.f6544;
                    if (c3828 == null) {
                        c3828 = null;
                    }
                    int iM4335 = c3828.f12696.m4335(i);
                    C3828 c3829 = this.f6544;
                    if (c3829 == null) {
                        c3829 = null;
                    }
                    float fM4331 = c3829.f12696.m4331(iM4335) + iRound;
                    C3828 c38210 = this.f6544;
                    C3828 c38211 = c38210 == null ? null : c38210;
                    if (c38210 == null) {
                        c38210 = null;
                    }
                    float fM4332 = c38211.f12696.m4331(c38210.f12696.f7560 - 1);
                    C3828 c38212 = this.f6544;
                    if (fM4331 < fM4332) {
                        iM4330 = (c38212 != null ? c38212 : null).f12696.m4330(fM4331);
                    } else {
                        iM4330 = (c38212 != null ? c38212 : null).f12696.f7560;
                    }
                    return m5980(i, m3872(iM4330 - 1, 1) + 1);
                } catch (IllegalStateException unused) {
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦؚ */
    public final int m3872(int i, int i2) {
        C3828 c3828 = this.f6544;
        if (c3828 == null) {
            c3828 = null;
        }
        int iM6827 = c3828.m6827(i);
        C3828 c3829 = this.f6544;
        if (c3829 == null) {
            c3829 = null;
        }
        int iM6831 = c3829.m6831(iM6827);
        C3828 c38210 = this.f6544;
        if (i2 != iM6831) {
            return (c38210 != null ? c38210 : null).m6827(i);
        }
        return C3828.m6823(c38210 != null ? c38210 : null, i) - 1;
    }

    @Override // p000.AbstractC0057
    /* JADX INFO: renamed from: ۦِ */
    public final int[] mo3873(int i) {
        int iM4330;
        String str = (String) this.f10925;
        if (str == null) {
            str = null;
        }
        if (str.length() > 0 && i > 0) {
            try {
                C3129 c3129 = this.f6545;
                if (c3129 == null) {
                    c3129 = null;
                }
                C2793 c2793M5770 = c3129.m5770();
                int iRound = Math.round(c2793M5770.f9344 - c2793M5770.f9342);
                String str2 = (String) this.f10925;
                if (str2 == null) {
                    str2 = null;
                }
                int length = str2.length();
                if (length <= i) {
                    i = length;
                }
                C3828 c3828 = this.f6544;
                if (c3828 == null) {
                    c3828 = null;
                }
                int iM4335 = c3828.f12696.m4335(i);
                C3828 c3829 = this.f6544;
                if (c3829 == null) {
                    c3829 = null;
                }
                float fM4331 = c3829.f12696.m4331(iM4335) - iRound;
                if (fM4331 > 0.0f) {
                    C3828 c38210 = this.f6544;
                    if (c38210 == null) {
                        c38210 = null;
                    }
                    iM4330 = c38210.f12696.m4330(fM4331);
                } else {
                    iM4330 = 0;
                }
                String str3 = (String) this.f10925;
                if (i == (str3 != null ? str3 : null).length() && iM4330 < iM4335) {
                    iM4330++;
                }
                return m5980(m3872(iM4330, 2), i);
            } catch (IllegalStateException unused) {
            }
        }
        return null;
    }
}
