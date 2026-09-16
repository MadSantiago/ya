package p000;

import java.nio.charset.Charset;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: ۥًٖؒؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0822 {

    /* JADX INFO: renamed from: ۥؗ */
    public final String[] f2915;

    /* JADX INFO: renamed from: ۥۗ */
    public final String f2916;

    /* JADX INFO: renamed from: ۥۣ */
    public final String f2917;

    /* JADX INFO: renamed from: ۦؑ */
    public static final Pattern f2914 = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* JADX INFO: renamed from: ۥُ */
    public static final Pattern f2913 = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    public C0822(String str, String str2, String[] strArr) {
        this.f2917 = str;
        this.f2916 = str2;
        this.f2915 = strArr;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0822) && AbstractC3831.m6874(((C0822) obj).f2917, this.f2917);
    }

    public final int hashCode() {
        return this.f2917.hashCode();
    }

    public final String toString() {
        return this.f2917;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final Charset m1719(Charset charset) {
        String str;
        String[] strArr = this.f2915;
        int i = 0;
        int iM8638 = C5063.m8638(0, strArr.length - 1, 2);
        if (iM8638 < 0) {
            str = null;
            break;
        }
        while (true) {
            if (!AbstractC4981.m8360(strArr[i], "charset")) {
                if (i == iM8638) {
                    str = null;
                    break;
                }
                i += 2;
            } else {
                str = strArr[i + 1];
                break;
            }
        }
        if (str == null) {
            return charset;
        }
        try {
            return Charset.forName(str);
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }
}
