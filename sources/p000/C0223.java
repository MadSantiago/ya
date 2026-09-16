package p000;

import android.util.Base64;
import java.util.List;

/* JADX INFO: renamed from: ۥؚٟؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0223 {

    /* JADX INFO: renamed from: ۥؗ */
    public final String f827;

    /* JADX INFO: renamed from: ۥُ */
    public final String f828;

    /* JADX INFO: renamed from: ۥّ */
    public final String f829;

    /* JADX INFO: renamed from: ۥۗ */
    public final String f830;

    /* JADX INFO: renamed from: ۥۣ */
    public final String f831;

    /* JADX INFO: renamed from: ۦؑ */
    public final List f832;

    /* JADX INFO: renamed from: ۦۙ */
    public final String f833;

    public C0223(String str, String str2, String str3, List list, String str4, String str5) {
        str.getClass();
        this.f831 = str;
        str2.getClass();
        this.f830 = str2;
        this.f827 = str3;
        list.getClass();
        this.f832 = list;
        this.f828 = str4;
        this.f829 = str5;
        StringBuilder sb = new StringBuilder(str);
        sb.append("-");
        sb.append(str2);
        sb.append("-");
        sb.append(str3);
        sb.append("-");
        sb.append(str4);
        if (str5 != null) {
            int length = str5.length();
            int iCharCount = 0;
            while (iCharCount < length) {
                int iCodePointAt = str5.codePointAt(iCharCount);
                if (!Character.isWhitespace(iCodePointAt)) {
                    sb.append("-VF");
                    break;
                }
                iCharCount += Character.charCount(iCodePointAt);
            }
        }
        this.f833 = sb.toString();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FontRequest {mProviderAuthority: ");
        sb.append(this.f831);
        sb.append(", mProviderPackage: ");
        sb.append(this.f830);
        sb.append(", mQuery: ");
        sb.append(this.f827);
        sb.append(", mSystemFont: ");
        sb.append(this.f828);
        sb.append(", mVariationSettings: ");
        StringBuilder sb2 = new StringBuilder(AbstractC3761.m6621(sb, this.f829, ", mCertificates:"));
        int i = 0;
        while (true) {
            List list = this.f832;
            if (i >= list.size()) {
                sb2.append("}mCertificatesArray: 0");
                return sb2.toString();
            }
            sb2.append(" [");
            List list2 = (List) list.get(i);
            for (int i2 = 0; i2 < list2.size(); i2++) {
                sb2.append(" \"");
                sb2.append(Base64.encodeToString((byte[]) list2.get(i2), 0));
                sb2.append("\"");
            }
            sb2.append(" ]");
            i++;
        }
    }
}
