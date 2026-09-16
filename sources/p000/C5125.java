package p000;

import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* JADX INFO: renamed from: ۦۙؖۘۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5125 implements HostnameVerifier {

    /* JADX INFO: renamed from: ۥۣ */
    public static final C5125 f16987 = new C5125();

    /* JADX WARN: Code duplicated, block: B:59:0x00e1  */
    /* JADX INFO: renamed from: ۥؗ */
    public static boolean m8744(String str, X509Certificate x509Certificate) {
        boolean zEquals;
        int length;
        if (AbstractC4031.f13449.f16581.matcher(str).matches()) {
            String strM5186 = AbstractC2774.m5186(str);
            List listM8746 = m8746(x509Certificate, 7);
            if (!listM8746.isEmpty()) {
                Iterator it = listM8746.iterator();
                while (it.hasNext()) {
                    if (AbstractC3831.m6874(strM5186, AbstractC2774.m5186((String) it.next()))) {
                        return true;
                    }
                }
            }
            return false;
        }
        if (m8745(str)) {
            str = str.toLowerCase(Locale.US);
        }
        List<String> listM8747 = m8746(x509Certificate, 2);
        if (!listM8747.isEmpty()) {
            for (String lowerCase : listM8747) {
                if (str.length() == 0 || str.startsWith(".") || str.endsWith("..") || lowerCase == null || lowerCase.length() == 0 || lowerCase.startsWith(".") || lowerCase.endsWith("..")) {
                    zEquals = false;
                } else {
                    String strConcat = !str.endsWith(".") ? str.concat(".") : str;
                    if (!lowerCase.endsWith(".")) {
                        lowerCase = lowerCase.concat(".");
                    }
                    if (m8745(lowerCase)) {
                        lowerCase = lowerCase.toLowerCase(Locale.US);
                    }
                    if (!AbstractC0684.m1527(lowerCase, "*", false)) {
                        zEquals = strConcat.equals(lowerCase);
                    } else if (!lowerCase.startsWith("*.") || AbstractC0684.m1521('*', 1, 4, lowerCase) != -1 || strConcat.length() < lowerCase.length() || "*.".equals(lowerCase)) {
                        zEquals = false;
                    } else {
                        String strSubstring = lowerCase.substring(1);
                        if (strConcat.endsWith(strSubstring) && ((length = strConcat.length() - strSubstring.length()) <= 0 || AbstractC0684.m1531('.', length - 1, 4, strConcat) == -1)) {
                            zEquals = true;
                        } else {
                            zEquals = false;
                        }
                    }
                }
                if (zEquals) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static boolean m8745(String str) {
        long j;
        int length = str.length();
        int length2 = str.length();
        if (length2 < 0) {
            C1078.m2273(AbstractC5078.m8681(length2, "endIndex < beginIndex: ", " < 0"));
            return false;
        }
        if (length2 > str.length()) {
            StringBuilder sbM8680 = AbstractC5078.m8680(length2, "endIndex > string.length: ", " > ");
            sbM8680.append(str.length());
            throw new IllegalArgumentException(sbM8680.toString().toString());
        }
        long j2 = 0;
        int i = 0;
        while (i < length2) {
            char cCharAt = str.charAt(i);
            if (cCharAt < 128) {
                j2++;
            } else {
                if (cCharAt < 2048) {
                    j = 2;
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    j = 3;
                } else {
                    int i2 = i + 1;
                    char cCharAt2 = i2 < length2 ? str.charAt(i2) : (char) 0;
                    if (cCharAt > 56319 || cCharAt2 < 56320 || cCharAt2 > 57343) {
                        j2++;
                        i = i2;
                    } else {
                        j2 += 4;
                        i += 2;
                    }
                }
                j2 += j;
            }
            i++;
        }
        return length == ((int) j2);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static List m8746(X509Certificate x509Certificate, int i) {
        Object obj;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames != null) {
                ArrayList arrayList = new ArrayList();
                for (List<?> list : subjectAlternativeNames) {
                    if (list != null && list.size() >= 2 && AbstractC3831.m6874(list.get(0), Integer.valueOf(i)) && (obj = list.get(1)) != null) {
                        arrayList.add((String) obj);
                    }
                }
                return arrayList;
            }
        } catch (CertificateParsingException unused) {
        }
        return C2340.f7777;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        if (m8745(str)) {
            try {
                return m8744(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
            } catch (SSLException unused) {
            }
        }
        return false;
    }
}
