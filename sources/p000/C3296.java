package p000;

import java.util.Locale;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: ۦٍؕؗؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3296 extends AbstractC0027 {

    /* JADX INFO: renamed from: ۥۣ */
    public final C3343 f11036 = new C3343();

    /* JADX INFO: renamed from: ۥۗ */
    public final C4531 f11035 = new C4531();

    @Override // p000.AbstractC0027
    /* JADX INFO: renamed from: ۥؗ */
    public final boolean mo3382() {
        return true;
    }

    @Override // p000.AbstractC0027
    /* JADX INFO: renamed from: ۥُ */
    public final AbstractC5360 mo2292() {
        return this.f11036;
    }

    @Override // p000.AbstractC0027
    /* JADX INFO: renamed from: ۥۜ */
    public final C3714 mo2293(C1753 c1753) {
        if (c1753.f5832) {
            return null;
        }
        return C3714.m6571(c1753.f5831);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x003c  */
    @Override // p000.AbstractC0027
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo2294(CharSequence charSequence) {
        int iM1940;
        int i;
        C4531 c4531 = this.f11035;
        StringBuilder sb = c4531.f14976;
        if (sb.length() != 0) {
            sb.append('\n');
        }
        sb.append(charSequence);
        int iM7885 = 0;
        while (iM7885 < charSequence.length()) {
            int iM6632 = AbstractC3761.m6632(c4531.f14978);
            if (iM6632 == 0) {
                int iM7886 = AbstractC4554.m7885(charSequence, iM7885, charSequence.length());
                if (iM7886 >= charSequence.length() || charSequence.charAt(iM7886) != '[') {
                    iM7885 = -1;
                } else {
                    c4531.f14978 = 2;
                    c4531.f14979 = new StringBuilder();
                    iM7885 = iM7886 + 1;
                    if (iM7885 >= charSequence.length()) {
                        c4531.f14979.append('\n');
                    }
                }
            } else if (iM6632 == 1) {
                iM1940 = AbstractC0949.m1940(iM7885, charSequence);
                if (iM1940 == -1) {
                    iM7885 = -1;
                } else {
                    c4531.f14979.append(charSequence, iM7885, iM1940);
                    if (iM1940 >= charSequence.length()) {
                        c4531.f14979.append('\n');
                        iM7885 = iM1940;
                    } else if (charSequence.charAt(iM1940) != ']' || (i = iM1940 + 1) >= charSequence.length() || charSequence.charAt(i) != ':' || c4531.f14979.length() > 999) {
                        iM7885 = -1;
                    } else {
                        String string = c4531.f14979.toString();
                        Pattern pattern = AbstractC0883.f3219;
                        String strReplaceAll = AbstractC0883.f3217.matcher(string.trim().toLowerCase(Locale.ROOT)).replaceAll(" ");
                        if (strReplaceAll.isEmpty()) {
                            iM7885 = -1;
                        } else {
                            c4531.f14974 = strReplaceAll;
                            c4531.f14978 = 3;
                            iM7885 = AbstractC4554.m7885(charSequence, iM1940 + 2, charSequence.length());
                        }
                    }
                }
            } else if (iM6632 == 2) {
                int iM7887 = AbstractC4554.m7885(charSequence, iM7885, charSequence.length());
                int iM1932 = AbstractC0949.m1932(iM7887, charSequence);
                if (iM1932 != -1) {
                    c4531.f14975 = charSequence.charAt(iM7887) == '<' ? charSequence.subSequence(iM7887 + 1, iM1932 - 1).toString() : charSequence.subSequence(iM7887, iM1932).toString();
                    iM7885 = AbstractC4554.m7885(charSequence, iM1932, charSequence.length());
                    if (iM7885 >= charSequence.length()) {
                        c4531.f14980 = true;
                        sb.setLength(0);
                    } else if (iM7885 == iM1932) {
                        iM7885 = -1;
                    }
                    c4531.f14978 = 4;
                } else {
                    iM7885 = -1;
                }
            } else if (iM6632 == 3) {
                iM7885 = AbstractC4554.m7885(charSequence, iM7885, charSequence.length());
                if (iM7885 >= charSequence.length()) {
                    c4531.f14978 = 1;
                } else {
                    c4531.f14981 = (char) 0;
                    char cCharAt = charSequence.charAt(iM7885);
                    if (cCharAt == '\"' || cCharAt == '\'') {
                        c4531.f14981 = cCharAt;
                    } else if (cCharAt == '(') {
                        c4531.f14981 = ')';
                    }
                    if (c4531.f14981 != 0) {
                        c4531.f14978 = 5;
                        c4531.f14977 = new StringBuilder();
                        iM7885++;
                        if (iM7885 == charSequence.length()) {
                            c4531.f14977.append('\n');
                        }
                    } else {
                        c4531.m7853();
                        c4531.f14978 = 1;
                    }
                }
            } else if (iM6632 == 4) {
                iM1940 = AbstractC0949.m1951(charSequence, iM7885, c4531.f14981);
                if (iM1940 == -1) {
                    iM7885 = -1;
                } else {
                    c4531.f14977.append(charSequence.subSequence(iM7885, iM1940));
                    if (iM1940 >= charSequence.length()) {
                        c4531.f14977.append('\n');
                        iM7885 = iM1940;
                    } else {
                        iM7885 = AbstractC4554.m7885(charSequence, iM1940 + 1, charSequence.length());
                        if (iM7885 != charSequence.length()) {
                            iM7885 = -1;
                        } else {
                            c4531.f14980 = true;
                            c4531.m7853();
                            sb.setLength(0);
                            c4531.f14978 = 1;
                        }
                    }
                }
            } else if (iM6632 == 5) {
                return;
            }
            if (iM7885 == -1) {
                c4531.f14978 = 6;
                return;
            }
        }
    }

    @Override // p000.AbstractC0027
    /* JADX INFO: renamed from: ۦؑ */
    public final void mo2295() {
        if (this.f11035.f14976.length() == 0) {
            this.f11036.m7116();
        }
    }

    @Override // p000.AbstractC0027
    /* JADX INFO: renamed from: ۦۙ */
    public final void mo3385(C5049 c5049) {
        StringBuilder sb = this.f11035.f14976;
        if (sb.length() > 0) {
            c5049.m8565(sb.toString(), this.f11036);
        }
    }
}
