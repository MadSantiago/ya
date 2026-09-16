package p000;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: ۥٍۨٛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2953 {

    /* JADX INFO: renamed from: ۥۗ */
    public static final Map f9908;

    /* JADX INFO: renamed from: ۥۣ */
    public static final C4123[] f9909;

    static {
        C4123 c4123 = new C4123(C4123.f13734, "");
        C1007 c1007 = C4123.f13731;
        C4123 c4124 = new C4123(c1007, "GET");
        C4123 c4125 = new C4123(c1007, "POST");
        C1007 c1008 = C4123.f13735;
        C4123 c4126 = new C4123(c1008, "/");
        C4123 c4127 = new C4123(c1008, "/index.html");
        C1007 c1009 = C4123.f13732;
        C4123 c4128 = new C4123(c1009, "http");
        C4123 c4129 = new C4123(c1009, "https");
        C1007 c10010 = C4123.f13730;
        C4123[] c4123Arr = {c4123, c4124, c4125, c4126, c4127, c4128, c4129, new C4123(c10010, "200"), new C4123(c10010, "204"), new C4123(c10010, "206"), new C4123(c10010, "304"), new C4123(c10010, "400"), new C4123(c10010, "404"), new C4123(c10010, "500"), new C4123("accept-charset", ""), new C4123("accept-encoding", "gzip, deflate"), new C4123("accept-language", ""), new C4123("accept-ranges", ""), new C4123("accept", ""), new C4123("access-control-allow-origin", ""), new C4123("age", ""), new C4123("allow", ""), new C4123("authorization", ""), new C4123("cache-control", ""), new C4123("content-disposition", ""), new C4123("content-encoding", ""), new C4123("content-language", ""), new C4123("content-length", ""), new C4123("content-location", ""), new C4123("content-range", ""), new C4123("content-type", ""), new C4123("cookie", ""), new C4123("date", ""), new C4123("etag", ""), new C4123("expect", ""), new C4123("expires", ""), new C4123("from", ""), new C4123("host", ""), new C4123("if-match", ""), new C4123("if-modified-since", ""), new C4123("if-none-match", ""), new C4123("if-range", ""), new C4123("if-unmodified-since", ""), new C4123("last-modified", ""), new C4123("link", ""), new C4123("location", ""), new C4123("max-forwards", ""), new C4123("proxy-authenticate", ""), new C4123("proxy-authorization", ""), new C4123("range", ""), new C4123("referer", ""), new C4123("refresh", ""), new C4123("retry-after", ""), new C4123("server", ""), new C4123("set-cookie", ""), new C4123("strict-transport-security", ""), new C4123("transfer-encoding", ""), new C4123("user-agent", ""), new C4123("vary", ""), new C4123("via", ""), new C4123("www-authenticate", "")};
        f9909 = c4123Arr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        for (int i = 0; i < 61; i++) {
            if (!linkedHashMap.containsKey(c4123Arr[i].f13738)) {
                linkedHashMap.put(c4123Arr[i].f13738, Integer.valueOf(i));
            }
        }
        f9908 = Collections.unmodifiableMap(linkedHashMap);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static void m5519(C1007 c1007) {
        int iMo2205 = c1007.mo2205();
        for (int i = 0; i < iMo2205; i++) {
            byte bMo2213 = c1007.mo2213(i);
            if (65 <= bMo2213 && bMo2213 < 91) {
                C5028.m8448("PROTOCOL_ERROR response malformed: mixed case name: ".concat(c1007.m2214()));
                return;
            }
        }
    }
}
