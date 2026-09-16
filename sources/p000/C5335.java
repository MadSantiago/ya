package p000;

/* JADX INFO: renamed from: ۦٟ۟ؓۥ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5335 extends AbstractC0487 {

    /* JADX INFO: renamed from: ۦؚ */
    public final char f17591;

    public C5335(char c) {
        super(9);
        this.f17591 = c;
    }

    @Override // p000.AbstractC0487
    public final String toString() {
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        char c = this.f17591;
        for (int i = 0; i < 4; i++) {
            cArr[5 - i] = "0123456789ABCDEF".charAt(c & 15);
            c = (char) (c >> 4);
        }
        String strCopyValueOf = String.copyValueOf(cArr);
        StringBuilder sb = new StringBuilder(String.valueOf(strCopyValueOf).length() + 18);
        sb.append("CharMatcher.is('");
        sb.append(strCopyValueOf);
        sb.append("')");
        return sb.toString();
    }

    @Override // p000.AbstractC0487
    /* JADX INFO: renamed from: ۦؙ */
    public final boolean mo1098(char c) {
        return c == this.f17591;
    }
}
