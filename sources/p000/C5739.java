package p000;

import android.text.TextUtils;
import java.util.Iterator;

/* JADX INFO: renamed from: ۦۦؚؒؐ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5739 implements Iterator {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ C4907 f18933;

    /* JADX INFO: renamed from: ۥْ */
    public final int f18934;

    /* JADX INFO: renamed from: ۥٓ */
    public int f18935;

    /* JADX INFO: renamed from: ۦۨ */
    public final C2936 f18937 = new C2936();

    /* JADX INFO: renamed from: ۦ۟ */
    public final StringBuilder f18936 = new StringBuilder();

    public C5739(C4907 c4907) {
        this.f18933 = c4907;
        this.f18934 = c4907.f16199.length();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        C2936 c2936 = this.f18937;
        c2936.f9867 = "";
        c2936.f9866 = "";
        StringBuilder sb = this.f18936;
        sb.setLength(0);
        int i = this.f18935;
        String strTrim = null;
        boolean z = false;
        String strTrim2 = null;
        while (true) {
            int i2 = this.f18934;
            if (i >= i2) {
                if (strTrim == null || sb.length() <= 0) {
                    break;
                    break;
                }
                String strTrim3 = sb.toString().trim();
                c2936.f9867 = strTrim;
                c2936.f9866 = strTrim3;
                this.f18935 = i2;
                break;
            }
            char cCharAt = this.f18933.f16199.charAt(i);
            if (strTrim == null) {
                if (':' == cCharAt) {
                    if (sb.length() > 0) {
                        strTrim = sb.toString().trim();
                    }
                    sb.setLength(0);
                } else if (';' == cCharAt) {
                    sb.setLength(0);
                } else if (Character.isWhitespace(cCharAt)) {
                    if (sb.length() > 0) {
                        z = true;
                    }
                } else if (z) {
                    sb.setLength(0);
                    sb.append(cCharAt);
                    z = false;
                } else {
                    sb.append(cCharAt);
                }
            } else if (strTrim2 != null) {
                continue;
            } else if (Character.isWhitespace(cCharAt)) {
                if (sb.length() > 0) {
                    sb.append(cCharAt);
                }
            } else if (';' == cCharAt) {
                strTrim2 = sb.toString().trim();
                sb.setLength(0);
                if (!TextUtils.isEmpty(strTrim) && !TextUtils.isEmpty(strTrim2)) {
                    this.f18935 = i + 1;
                    c2936.f9867 = strTrim;
                    c2936.f9866 = strTrim2;
                    break;
                }
            } else {
                sb.append(cCharAt);
            }
            i++;
        }
        return (TextUtils.isEmpty(c2936.f9867) || TextUtils.isEmpty(c2936.f9866)) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C2936 c2936 = this.f18937;
        String str = c2936.f9867;
        String str2 = c2936.f9866;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            return c2936;
        }
        C0178.m381();
        return null;
    }
}
