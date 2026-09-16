package p000;

import java.text.BreakIterator;

/* JADX INFO: renamed from: ۦ٘ */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0077 extends AbstractC0057 {

    /* JADX INFO: renamed from: ۥُ */
    public static C0077 f14487;

    /* JADX INFO: renamed from: ۥّ */
    public static C0077 f14488;

    /* JADX INFO: renamed from: ۦۙ */
    public static C0077 f14489;

    /* JADX INFO: renamed from: ۥؗ */
    public final /* synthetic */ int f14490;

    /* JADX INFO: renamed from: ۦؑ */
    public Object f14491;

    @Override // p000.AbstractC0057
    /* JADX INFO: renamed from: ۥُ */
    public final int[] mo3871(int i) {
        int iM4335;
        switch (this.f14490) {
            case 0:
                String str = (String) this.f10925;
                if (str == null) {
                    str = null;
                }
                int length = str.length();
                if (length <= 0 || i >= length) {
                    return null;
                }
                if (i < 0) {
                    i = 0;
                }
                do {
                    BreakIterator breakIterator = (BreakIterator) this.f14491;
                    if (breakIterator == null) {
                        breakIterator = null;
                    }
                    boolean zIsBoundary = breakIterator.isBoundary(i);
                    BreakIterator breakIterator2 = (BreakIterator) this.f14491;
                    if (zIsBoundary) {
                        if (breakIterator2 == null) {
                            breakIterator2 = null;
                        }
                        int iFollowing = breakIterator2.following(i);
                        if (iFollowing == -1) {
                            return null;
                        }
                        return m5980(i, iFollowing);
                    }
                    if (breakIterator2 == null) {
                        breakIterator2 = null;
                    }
                    i = breakIterator2.following(i);
                } while (i != -1);
                return null;
            case 1:
                String str2 = (String) this.f10925;
                if (str2 == null) {
                    str2 = null;
                }
                if (str2.length() <= 0) {
                    return null;
                }
                String str3 = (String) this.f10925;
                if (str3 == null) {
                    str3 = null;
                }
                if (i >= str3.length()) {
                    return null;
                }
                if (i < 0) {
                    i = 0;
                }
                while (!m7691(i) && (!m7691(i) || (i != 0 && m7691(i - 1)))) {
                    BreakIterator breakIterator3 = (BreakIterator) this.f14491;
                    if (breakIterator3 == null) {
                        breakIterator3 = null;
                    }
                    i = breakIterator3.following(i);
                    if (i == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator4 = (BreakIterator) this.f14491;
                if (breakIterator4 == null) {
                    breakIterator4 = null;
                }
                int iFollowing2 = breakIterator4.following(i);
                if (iFollowing2 == -1 || !m7690(iFollowing2)) {
                    return null;
                }
                return m5980(i, iFollowing2);
            default:
                String str4 = (String) this.f10925;
                if (str4 == null) {
                    str4 = null;
                }
                if (str4.length() <= 0) {
                    return null;
                }
                String str5 = (String) this.f10925;
                if (str5 == null) {
                    str5 = null;
                }
                if (i >= str5.length()) {
                    return null;
                }
                C3828 c3828 = (C3828) this.f14491;
                if (i < 0) {
                    if (c3828 == null) {
                        c3828 = null;
                    }
                    iM4335 = c3828.f12696.m4335(0);
                } else {
                    if (c3828 == null) {
                        c3828 = null;
                    }
                    int iM4336 = c3828.f12696.m4335(i);
                    iM4335 = m7688(iM4336, 2) == i ? iM4336 : iM4336 + 1;
                }
                C3828 c3829 = (C3828) this.f14491;
                if (c3829 == null) {
                    c3829 = null;
                }
                if (iM4335 >= c3829.f12696.f7560) {
                    return null;
                }
                return m5980(m7688(iM4335, 2), m7688(iM4335, 1) + 1);
        }
    }

    /* JADX INFO: renamed from: ۦؚ */
    public int m7688(int i, int i2) {
        C3828 c3828 = (C3828) this.f14491;
        if (c3828 == null) {
            c3828 = null;
        }
        int iM6827 = c3828.m6827(i);
        C3828 c3829 = (C3828) this.f14491;
        if (c3829 == null) {
            c3829 = null;
        }
        int iM6831 = c3829.m6831(iM6827);
        C3828 c38210 = (C3828) this.f14491;
        if (i2 != iM6831) {
            return (c38210 != null ? c38210 : null).m6827(i);
        }
        return C3828.m6823(c38210 != null ? c38210 : null, i) - 1;
    }

    /* JADX INFO: renamed from: ۦٌ */
    public void m7689(String str) {
        switch (this.f14490) {
            case 0:
                this.f10925 = str;
                BreakIterator breakIterator = (BreakIterator) this.f14491;
                (breakIterator != null ? breakIterator : null).setText(str);
                break;
            default:
                this.f10925 = str;
                BreakIterator breakIterator2 = (BreakIterator) this.f14491;
                (breakIterator2 != null ? breakIterator2 : null).setText(str);
                break;
        }
    }

    @Override // p000.AbstractC0057
    /* JADX INFO: renamed from: ۦِ */
    public final int[] mo3873(int i) {
        int iM4335;
        switch (this.f14490) {
            case 0:
                String str = (String) this.f10925;
                if (str == null) {
                    str = null;
                }
                int length = str.length();
                if (length <= 0 || i <= 0) {
                    return null;
                }
                if (i > length) {
                    i = length;
                }
                do {
                    BreakIterator breakIterator = (BreakIterator) this.f14491;
                    if (breakIterator == null) {
                        breakIterator = null;
                    }
                    boolean zIsBoundary = breakIterator.isBoundary(i);
                    BreakIterator breakIterator2 = (BreakIterator) this.f14491;
                    if (zIsBoundary) {
                        if (breakIterator2 == null) {
                            breakIterator2 = null;
                        }
                        int iPreceding = breakIterator2.preceding(i);
                        if (iPreceding == -1) {
                            return null;
                        }
                        return m5980(iPreceding, i);
                    }
                    if (breakIterator2 == null) {
                        breakIterator2 = null;
                    }
                    i = breakIterator2.preceding(i);
                } while (i != -1);
                return null;
            case 1:
                String str2 = (String) this.f10925;
                if (str2 == null) {
                    str2 = null;
                }
                int length2 = str2.length();
                if (length2 <= 0 || i <= 0) {
                    return null;
                }
                if (i > length2) {
                    i = length2;
                }
                while (i > 0 && !m7691(i - 1) && !m7690(i)) {
                    BreakIterator breakIterator3 = (BreakIterator) this.f14491;
                    if (breakIterator3 == null) {
                        breakIterator3 = null;
                    }
                    i = breakIterator3.preceding(i);
                    if (i == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator4 = (BreakIterator) this.f14491;
                if (breakIterator4 == null) {
                    breakIterator4 = null;
                }
                int iPreceding2 = breakIterator4.preceding(i);
                if (iPreceding2 == -1 || !m7691(iPreceding2)) {
                    return null;
                }
                if (iPreceding2 == 0 || !m7691(iPreceding2 - 1)) {
                    return m5980(iPreceding2, i);
                }
                return null;
            default:
                String str3 = (String) this.f10925;
                if (str3 == null) {
                    str3 = null;
                }
                if (str3.length() <= 0 || i <= 0) {
                    return null;
                }
                String str4 = (String) this.f10925;
                if (str4 == null) {
                    str4 = null;
                }
                int length3 = str4.length();
                C3828 c3828 = (C3828) this.f14491;
                if (i > length3) {
                    if (c3828 == null) {
                        c3828 = null;
                    }
                    String str5 = (String) this.f10925;
                    if (str5 == null) {
                        str5 = null;
                    }
                    iM4335 = c3828.f12696.m4335(str5.length());
                } else {
                    if (c3828 == null) {
                        c3828 = null;
                    }
                    int iM4336 = c3828.f12696.m4335(i);
                    iM4335 = m7688(iM4336, 1) + 1 == i ? iM4336 : iM4336 - 1;
                }
                if (iM4335 < 0) {
                    return null;
                }
                return m5980(m7688(iM4335, 2), m7688(iM4335, 1) + 1);
        }
    }

    /* JADX INFO: renamed from: ۦۚ */
    public boolean m7690(int i) {
        if (i <= 0 || !m7691(i - 1)) {
            return false;
        }
        String str = (String) this.f10925;
        if (str == null) {
            str = null;
        }
        return i == str.length() || !m7691(i);
    }

    /* JADX INFO: renamed from: ۦۨ */
    public boolean m7691(int i) {
        if (i < 0) {
            return false;
        }
        String str = (String) this.f10925;
        if (str == null) {
            str = null;
        }
        if (i >= str.length()) {
            return false;
        }
        String str2 = (String) this.f10925;
        return Character.isLetterOrDigit((str2 != null ? str2 : null).codePointAt(i));
    }
}
