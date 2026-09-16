package p000;

/* JADX INFO: renamed from: ۦۘ */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0087 extends AbstractC0057 {

    /* JADX INFO: renamed from: ۥؗ */
    public static C0087 f16537;

    @Override // p000.AbstractC0057
    /* JADX INFO: renamed from: ۥُ */
    public final int[] mo3871(int i) {
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
        while (i < length) {
            String str2 = (String) this.f10925;
            if (str2 == null) {
                str2 = null;
            }
            if (str2.charAt(i) != '\n' || m8390(i)) {
                break;
            }
            i++;
        }
        if (i >= length) {
            return null;
        }
        int i2 = i + 1;
        while (i2 < length && !m8389(i2)) {
            i2++;
        }
        return m5980(i, i2);
    }

    /* JADX INFO: renamed from: ۦؚ */
    public final boolean m8389(int i) {
        if (i <= 0) {
            return false;
        }
        String str = (String) this.f10925;
        if (str == null) {
            str = null;
        }
        if (str.charAt(i - 1) == '\n') {
            return false;
        }
        String str2 = (String) this.f10925;
        if (str2 == null) {
            str2 = null;
        }
        if (i == str2.length()) {
            return true;
        }
        String str3 = (String) this.f10925;
        return (str3 != null ? str3 : null).charAt(i) == '\n';
    }

    /* JADX INFO: renamed from: ۦٌ */
    public final boolean m8390(int i) {
        String str = (String) this.f10925;
        if (str == null) {
            str = null;
        }
        if (str.charAt(i) == '\n') {
            return false;
        }
        if (i != 0) {
            String str2 = (String) this.f10925;
            if ((str2 != null ? str2 : null).charAt(i - 1) != '\n') {
                return false;
            }
        }
        return true;
    }

    @Override // p000.AbstractC0057
    /* JADX INFO: renamed from: ۦِ */
    public final int[] mo3873(int i) {
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
        while (i > 0) {
            String str2 = (String) this.f10925;
            if (str2 == null) {
                str2 = null;
            }
            if (str2.charAt(i - 1) != '\n' || m8389(i)) {
                break;
            }
            i--;
        }
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        while (i2 > 0 && !m8390(i2)) {
            i2--;
        }
        return m5980(i2, i);
    }
}
