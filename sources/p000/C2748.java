package p000;

import java.io.IOException;
import java.math.RoundingMode;
import java.util.Arrays;

/* JADX INFO: renamed from: ۥۥؕٞۥ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class C2748 {

    /* JADX INFO: renamed from: ۥؗ */
    public static final C5839 f9093;

    /* JADX INFO: renamed from: ۥۗ */
    public final Character f9094;

    /* JADX INFO: renamed from: ۥۣ */
    public final C5170 f9095;

    static {
        new C5839("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
        f9093 = new C5839("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
        new C2748("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new C2748("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        new C5884();
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0017  */
    public C2748(C5170 c5170, Character ch) {
        boolean z;
        this.f9095 = c5170;
        if (ch != null) {
            char cCharValue = ch.charValue();
            byte[] bArr = c5170.f17118;
            if (cCharValue >= bArr.length || bArr[cCharValue] == -1) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = true;
        }
        AbstractC0949.m1960(z, "Padding character %s was already in alphabet", ch);
        this.f9094 = ch;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2748) {
            C2748 c2748 = (C2748) obj;
            if (this.f9095.equals(c2748.f9095) && AbstractC2776.m5240(this.f9094, c2748.f9094)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9094}) ^ Arrays.hashCode(this.f9095.f17115);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        C5170 c5170 = this.f9095;
        sb.append(c5170.f17116);
        if (8 % c5170.f17117 != 0) {
            Character ch = this.f9094;
            if (ch == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(ch);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۥؗ */
    public void mo5105(StringBuilder sb, byte[] bArr, int i) {
        int i2 = 0;
        AbstractC0949.m1968(0, i, bArr.length);
        while (i2 < i) {
            C5170 c5170 = this.f9095;
            m5106(sb, bArr, i2, Math.min(c5170.f17114, i - i2));
            i2 += c5170.f17114;
        }
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final void m5106(StringBuilder sb, byte[] bArr, int i, int i2) {
        AbstractC0949.m1968(i, i + i2, bArr.length);
        C5170 c5170 = this.f9095;
        int i3 = c5170.f17114;
        int i4 = c5170.f17117;
        int i5 = 0;
        AbstractC0949.m1941(i2 <= i3);
        long j = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            j = (j | ((long) (bArr[i + i6] & 255))) << 8;
        }
        int i7 = ((i2 + 1) * 8) - i4;
        while (i5 < i2 * 8) {
            sb.append(c5170.f17115[((int) (j >>> (i7 - i5))) & c5170.f17112]);
            i5 += i4;
        }
        Character ch = this.f9094;
        if (ch != null) {
            while (i5 < c5170.f17114 * 8) {
                sb.append(ch.charValue());
                i5 += i4;
            }
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final String m5107(byte[] bArr) {
        int length = bArr.length;
        AbstractC0949.m1968(0, length, bArr.length);
        C5170 c5170 = this.f9095;
        int i = c5170.f17113;
        int i2 = c5170.f17114;
        RoundingMode roundingMode = RoundingMode.CEILING;
        StringBuilder sb = new StringBuilder(C3133.m5802(length, i2) * i);
        try {
            mo5105(sb, bArr, length);
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public C2748(String str, String str2) {
        this(new C5170(str, str2.toCharArray()), (Character) '=');
    }
}
