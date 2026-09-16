package p000;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: ۦؘٖۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3518 {

    /* JADX INFO: renamed from: ۥؗ */
    public static final String f11648;

    /* JADX INFO: renamed from: ۥُ */
    public static final C3518 f11649;

    /* JADX INFO: renamed from: ۥّ */
    public static final C3518 f11650;

    /* JADX INFO: renamed from: ۦؑ */
    public static final Set f11651;

    /* JADX INFO: renamed from: ۥۗ */
    public final String f11652;

    /* JADX INFO: renamed from: ۥۣ */
    public final String f11653;

    static {
        String strM8135 = C4773.m8135("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f11648 = strM8135;
        String strM8136 = C4773.m8135("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        String strM8137 = C4773.m8135("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f11651 = Collections.unmodifiableSet(new HashSet(Arrays.asList(new C1329("proto"), new C1329("json"))));
        f11649 = new C3518(strM8135, null);
        f11650 = new C3518(strM8136, strM8137);
    }

    public C3518(String str, String str2) {
        this.f11653 = str;
        this.f11652 = str2;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static C3518 m6310(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (!str.startsWith("1$")) {
            C1078.m2272("Version marker missing from extras");
            return null;
        }
        String[] strArrSplit = str.substring(2).split(Pattern.quote("\\"), 2);
        if (strArrSplit.length != 2) {
            C1078.m2272("Extra is not a valid encoded LegacyFlgDestination");
            return null;
        }
        String str2 = strArrSplit[0];
        if (str2.isEmpty()) {
            C1078.m2272("Missing endpoint in CCTDestination extras");
            return null;
        }
        String str3 = strArrSplit[1];
        return new C3518(str2, str3.isEmpty() ? null : str3);
    }
}
