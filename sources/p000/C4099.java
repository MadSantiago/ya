package p000;

import java.lang.reflect.Method;
import java.util.Objects;

/* JADX INFO: renamed from: ۦْۧۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4099 extends AbstractC4489 {

    /* JADX INFO: renamed from: ۥؔ */
    public final String f13676;

    /* JADX INFO: renamed from: ۦُ */
    public final Method f13677;

    /* JADX INFO: renamed from: ۦٖ */
    public final int f13678;

    /* JADX INFO: renamed from: ۦۜ */
    public final boolean f13679;

    public C4099(Method method, int i, String str, boolean z) {
        this.f13677 = method;
        this.f13678 = i;
        Objects.requireNonNull(str, "name == null");
        this.f13676 = str;
        this.f13679 = z;
    }

    @Override // p000.AbstractC4489
    /* JADX INFO: renamed from: ۦٛ */
    public final void mo963(C1781 c1781, Object obj) {
        String strM2669;
        String str = this.f13676;
        if (obj == null) {
            throw AbstractC4554.m7926(this.f13677, this.f13678, AbstractC3761.m6629("Path parameter \"", str, "\" value must not be null."), new Object[0]);
        }
        String string = obj.toString();
        if (c1781.f5937 == null) {
            throw new AssertionError();
        }
        int length = string.length();
        int iCharCount = 0;
        while (true) {
            if (iCharCount >= length) {
                strM2669 = string;
                break;
            }
            int iCodePointAt = string.codePointAt(iCharCount);
            boolean z = this.f13679;
            int i = 47;
            int i2 = -1;
            int i3 = 127;
            int i4 = 32;
            if (iCodePointAt < 32 || iCodePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(iCodePointAt) != -1 || (!z && (iCodePointAt == 47 || iCodePointAt == 37))) {
                C1270 c1270 = new C1270();
                c1270.m2687(0, iCharCount, string);
                C1270 c1271 = null;
                while (iCharCount < length) {
                    int iCodePointAt2 = string.codePointAt(iCharCount);
                    if (!z || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
                        if (iCodePointAt2 < i4 || iCodePointAt2 >= i3 || " \"<>^`{}|\\?#".indexOf(iCodePointAt2) != i2 || (!z && (iCodePointAt2 == i || iCodePointAt2 == 37))) {
                            if (c1271 == null) {
                                c1271 = new C1270();
                            }
                            c1271.m2684(iCodePointAt2);
                            long j = c1271.f4340;
                            long j2 = 0;
                            while (j2 < j) {
                                byte bM2670 = c1271.m2670(j2);
                                c1270.m2680(37);
                                char[] cArr = C1781.f5935;
                                c1270.m2680(cArr[((bM2670 & 255) >> 4) & 15]);
                                c1270.m2680(cArr[bM2670 & 15]);
                                j2++;
                                c1271 = c1271;
                            }
                            c1271.m2678();
                        } else {
                            c1270.m2684(iCodePointAt2);
                        }
                    }
                    iCharCount += Character.charCount(iCodePointAt2);
                    i = 47;
                    i2 = -1;
                    i3 = 127;
                    i4 = 32;
                }
                strM2669 = c1270.m2669();
                break;
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        String strReplace = c1781.f5937.replace("{" + str + "}", strM2669);
        if (C1781.f5936.matcher(strReplace).matches()) {
            C1078.m2272("@Path parameters shouldn't perform path traversal ('.' or '..'): ".concat(string));
        } else {
            c1781.f5937 = strReplace;
        }
    }
}
