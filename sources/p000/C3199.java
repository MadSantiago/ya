package p000;

/* JADX INFO: renamed from: ۦٖؓٗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3199 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final char[] f10739 = new char[117];

    /* JADX INFO: renamed from: ۥۗ */
    public static final byte[] f10738 = new byte[126];

    static {
        for (int i = 0; i < 32; i++) {
        }
        m5892('b', 8);
        m5892('t', 9);
        m5892('n', 10);
        m5892('f', 12);
        m5892('r', 13);
        m5892('/', 47);
        m5892('\"', 34);
        m5892('\\', 92);
        byte[] bArr = f10738;
        for (int i2 = 0; i2 < 33; i2++) {
            bArr[i2] = 127;
        }
        bArr[9] = 3;
        bArr[10] = 3;
        bArr[13] = 3;
        bArr[32] = 3;
        bArr[44] = 4;
        bArr[58] = 5;
        bArr[123] = 6;
        bArr[125] = 7;
        bArr[91] = 8;
        bArr[93] = 9;
        bArr[34] = 1;
        bArr[92] = 2;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static void m5892(char c, int i) {
        if (c != 'u') {
            f10739[c] = (char) i;
        }
    }
}
