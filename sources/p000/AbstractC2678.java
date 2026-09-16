package p000;

/* JADX INFO: renamed from: ۥۤؕؒۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2678 {

    /* JADX INFO: renamed from: ۥؗ */
    public static final String[] f8881;

    /* JADX INFO: renamed from: ۥۗ */
    public static final String[] f8882;

    /* JADX INFO: renamed from: ۥۣ */
    public static final C1007 f8883;

    /* JADX INFO: renamed from: ۦؑ */
    public static final String[] f8884;

    static {
        C1007 c1007 = new C1007("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n".getBytes(AbstractC4637.f15306));
        c1007.f3596 = "PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n";
        f8883 = c1007;
        f8882 = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        f8881 = new String[64];
        String[] strArr = new String[256];
        for (int i = 0; i < 256; i++) {
            strArr[i] = AbstractC4031.m7228("%8s", Integer.toBinaryString(i)).replace(' ', '0');
        }
        f8884 = strArr;
        String[] strArr2 = f8881;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i2 = iArr[0];
        strArr2[i2 | 8] = AbstractC3761.m6621(new StringBuilder(), strArr2[i2], "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i3 = 0; i3 < 3; i3++) {
            int i4 = iArr2[i3];
            int i5 = iArr[0];
            String[] strArr3 = f8881;
            int i6 = i5 | i4;
            strArr3[i6] = strArr3[i5] + '|' + strArr3[i4];
            StringBuilder sb = new StringBuilder();
            sb.append(strArr3[i5]);
            sb.append('|');
            strArr3[i6 | 8] = AbstractC3761.m6621(sb, strArr3[i4], "|PADDED");
        }
        int length = f8881.length;
        for (int i7 = 0; i7 < length; i7++) {
            String[] strArr4 = f8881;
            if (strArr4[i7] == null) {
                strArr4[i7] = f8884[i7];
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0064  */
    /* JADX INFO: renamed from: ۥۣ */
    public static String m4984(boolean z, int i, int i2, int i3, int i4) {
        String strM8362;
        String[] strArr = f8882;
        String strM7228 = i3 < strArr.length ? strArr[i3] : AbstractC4031.m7228("0x%02x", Integer.valueOf(i3));
        if (i4 == 0) {
            strM8362 = "";
        } else {
            String[] strArr2 = f8884;
            if (i3 == 2 || i3 == 3) {
                strM8362 = strArr2[i4];
            } else if (i3 == 4 || i3 == 6) {
                strM8362 = i4 == 1 ? "ACK" : strArr2[i4];
            } else if (i3 == 7 || i3 == 8) {
                strM8362 = strArr2[i4];
            } else {
                String[] strArr3 = f8881;
                String str = i4 < strArr3.length ? strArr3[i4] : strArr2[i4];
                if (i3 != 5 || (i4 & 4) == 0) {
                    strM8362 = (i3 != 0 || (i4 & 32) == 0) ? str : AbstractC4981.m8362(str, "PRIORITY", "COMPRESSED");
                } else {
                    strM8362 = AbstractC4981.m8362(str, "HEADERS", "PUSH_PROMISE");
                }
            }
        }
        return AbstractC4031.m7228("%s 0x%08x %5d %-13s %s", z ? "<<" : ">>", Integer.valueOf(i), Integer.valueOf(i2), strM7228, strM8362);
    }
}
