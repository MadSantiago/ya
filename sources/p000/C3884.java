package p000;

import java.io.IOException;
import java.io.StringReader;
import java.util.Arrays;

/* JADX INFO: renamed from: ۦُؑ٘ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3884 {

    /* JADX INFO: renamed from: ۥؗ */
    public int f12989;

    /* JADX INFO: renamed from: ۥُ */
    public int f12990;

    /* JADX INFO: renamed from: ۥّ */
    public int f12991;

    /* JADX INFO: renamed from: ۥۗ */
    public final StringReader f12992;

    /* JADX INFO: renamed from: ۥۜ */
    public final String[] f12993;

    /* JADX INFO: renamed from: ۥۣ */
    public final char[] f12994;

    /* JADX INFO: renamed from: ۦؑ */
    public int f12995;

    /* JADX INFO: renamed from: ۦۙ */
    public int f12996;

    public C3884(String str) {
        StringReader stringReader = new StringReader(str);
        str.getClass();
        this.f12993 = new String[128];
        if (!stringReader.markSupported()) {
            C1078.m2272("Must be true");
            throw null;
        }
        this.f12992 = stringReader;
        this.f12994 = new char[4096];
        m6958();
    }

    /* JADX INFO: renamed from: ۥؗ */
    public static String m6954(char[] cArr, String[] strArr, int i, int i2) {
        if (i2 > 12) {
            return new String(cArr, i, i2);
        }
        if (i2 < 1) {
            return "";
        }
        int i3 = 0;
        int i4 = i;
        int i5 = 0;
        int i6 = 0;
        while (i5 < i2) {
            i6 = (i6 * 31) + cArr[i4];
            i5++;
            i4++;
        }
        int length = i6 & (strArr.length - 1);
        String str = strArr[length];
        if (str == null) {
            String str2 = new String(cArr, i, i2);
            strArr[length] = str2;
            return str2;
        }
        if (i2 == str.length()) {
            int i7 = i;
            int i8 = i2;
            while (true) {
                int i9 = i8 - 1;
                if (i8 == 0) {
                    return str;
                }
                int i10 = i7 + 1;
                int i11 = i3 + 1;
                if (cArr[i7] == str.charAt(i3)) {
                    i7 = i10;
                    i8 = i9;
                    i3 = i11;
                }
            }
        }
        String str3 = new String(cArr, i, i2);
        strArr[length] = str3;
        return str3;
    }

    public final String toString() {
        int i = this.f12990;
        return new String(this.f12994, i, this.f12989 - i);
    }

    /* JADX INFO: renamed from: ۥُ */
    public final String m6955() {
        char[] cArr;
        char c;
        m6958();
        int i = this.f12990;
        while (true) {
            int i2 = this.f12990;
            int i3 = this.f12989;
            cArr = this.f12994;
            if (i2 >= i3 || (((c = cArr[i2]) < 'A' || c > 'Z') && ((c < 'a' || c > 'z') && !Character.isLetter(c)))) {
                break;
            }
            this.f12990++;
        }
        return m6954(cArr, this.f12993, i, this.f12990 - i);
    }

    /* JADX INFO: renamed from: ۥّ */
    public final String m6956(char c) {
        char[] cArr;
        int i;
        m6958();
        int i2 = this.f12990;
        while (true) {
            int i3 = this.f12989;
            cArr = this.f12994;
            if (i2 >= i3) {
                i = -1;
                break;
            }
            if (c == cArr[i2]) {
                i = i2 - this.f12990;
                break;
            }
            i2++;
        }
        String[] strArr = this.f12993;
        if (i != -1) {
            String strM6954 = m6954(cArr, strArr, this.f12990, i);
            this.f12990 += i;
            return strM6954;
        }
        m6958();
        int i4 = this.f12990;
        String strM6955 = m6954(cArr, strArr, i4, this.f12989 - i4);
        this.f12990 = this.f12989;
        return strM6955;
    }

    /* JADX INFO: renamed from: ۥْ */
    public final void m6957() {
        this.f12990--;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final void m6958() {
        StringReader stringReader = this.f12992;
        int i = this.f12990;
        if (i < this.f12995) {
            return;
        }
        try {
            stringReader.skip(i);
            stringReader.mark(4096);
            int i2 = stringReader.read(this.f12994);
            stringReader.reset();
            if (i2 != -1) {
                this.f12989 = i2;
                this.f12991 += this.f12990;
                this.f12990 = 0;
                this.f12996 = 0;
                if (i2 > 3072) {
                    i2 = 3072;
                }
                this.f12995 = i2;
            }
        } catch (IOException e) {
            throw new C1228(e);
        }
    }

    /* JADX INFO: renamed from: ۥۜ */
    public final String m6959(char... cArr) {
        char[] cArr2;
        m6958();
        int i = this.f12990;
        int i2 = this.f12989;
        while (true) {
            int i3 = this.f12990;
            cArr2 = this.f12994;
            if (i3 >= i2 || Arrays.binarySearch(cArr, cArr2[i3]) >= 0) {
                break;
            }
            this.f12990++;
        }
        int i4 = this.f12990;
        return i4 > i ? m6954(cArr2, this.f12993, i, i4 - i) : "";
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m6960() {
        this.f12990++;
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final char m6961() {
        m6958();
        int i = this.f12990;
        char c = i >= this.f12989 ? (char) 65535 : this.f12994[i];
        this.f12990 = i + 1;
        return c;
    }

    /* JADX INFO: renamed from: ۦؚ */
    public final boolean m6962(String str) {
        m6958();
        int length = str.length();
        if (length <= this.f12989 - this.f12990) {
            for (int i = 0; i < length; i++) {
                if (Character.toUpperCase(str.charAt(i)) == Character.toUpperCase(this.f12994[this.f12990 + i])) {
                }
            }
            this.f12990 = str.length() + this.f12990;
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦٌ */
    public final boolean m6963(char c) {
        return !m6964() && this.f12994[this.f12990] == c;
    }

    /* JADX INFO: renamed from: ۦِ */
    public final boolean m6964() {
        m6958();
        return this.f12990 >= this.f12989;
    }

    /* JADX INFO: renamed from: ۦٛ */
    public final char m6965() {
        m6958();
        int i = this.f12990;
        if (i >= this.f12989) {
            return (char) 65535;
        }
        return this.f12994[i];
    }

    /* JADX INFO: renamed from: ۦۗ */
    public final boolean m6966(String str) {
        m6958();
        m6958();
        int length = str.length();
        if (length <= this.f12989 - this.f12990) {
            for (int i = 0; i < length; i++) {
                if (str.charAt(i) == this.f12994[this.f12990 + i]) {
                }
            }
            this.f12990 = str.length() + this.f12990;
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۙ */
    public final String m6967(char... cArr) {
        int i;
        char[] cArr2;
        m6958();
        int i2 = this.f12990;
        int i3 = this.f12989;
        loop0: while (true) {
            i = this.f12990;
            cArr2 = this.f12994;
            if (i >= i3) {
                break;
            }
            for (char c : cArr) {
                int i4 = this.f12990;
                if (cArr2[i4] == c) {
                    i = i4;
                    break loop0;
                }
            }
            this.f12990++;
        }
        return i > i2 ? m6954(cArr2, this.f12993, i2, i - i2) : "";
    }

    /* JADX INFO: renamed from: ۦۚ */
    public final boolean m6968(char... cArr) {
        if (!m6964()) {
            m6958();
            char c = this.f12994[this.f12990];
            for (char c2 : cArr) {
                if (c2 == c) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦ۟ */
    public final int m6969(String str) {
        m6958();
        char cCharAt = str.charAt(0);
        int i = this.f12990;
        while (i < this.f12989) {
            char[] cArr = this.f12994;
            if (cCharAt != cArr[i]) {
                do {
                    i++;
                    if (i >= this.f12989) {
                        break;
                    }
                } while (cCharAt != cArr[i]);
            }
            int i2 = i + 1;
            int length = (str.length() + i2) - 1;
            int i3 = this.f12989;
            if (i < i3 && length <= i3) {
                int i4 = i2;
                for (int i5 = 1; i4 < length && str.charAt(i5) == cArr[i4]; i5++) {
                    i4++;
                }
                if (i4 == length) {
                    return i - this.f12990;
                }
            }
            i = i2;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۦۨ */
    public final boolean m6970() {
        if (m6964()) {
            return false;
        }
        char c = this.f12994[this.f12990];
        if (c < 'A' || c > 'Z') {
            return (c >= 'a' && c <= 'z') || Character.isLetter(c);
        }
        return true;
    }
}
