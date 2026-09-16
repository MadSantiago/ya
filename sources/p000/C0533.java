package p000;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: renamed from: ۥٕؖؔؓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class C0533 implements Iterable, Serializable {

    /* JADX INFO: renamed from: ۥْ */
    public static final C0533 f1874 = new C0533(AbstractC3576.f11898);

    /* JADX INFO: renamed from: ۥٓ */
    public static final InterfaceC1646 f1875;

    /* JADX INFO: renamed from: ۦ۟ */
    public final byte[] f1876;

    /* JADX INFO: renamed from: ۦۨ */
    public int f1877 = 0;

    static {
        f1875 = AbstractC2328.m4372() ? new C0373(29) : new C1397(29);
    }

    public C0533(byte[] bArr) {
        bArr.getClass();
        this.f1876 = bArr;
    }

    /* JADX INFO: renamed from: ۥُ */
    public static C0533 m1185(byte[] bArr, int i, int i2) {
        m1186(i, i + i2, bArr.length);
        return new C0533(f1875.mo803(bArr, i, i2));
    }

    /* JADX INFO: renamed from: ۦؑ */
    public static int m1186(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            C1078.m2279(AbstractC5078.m8681(i, "Beginning index: ", " < 0"));
            return 0;
        }
        if (i2 < i) {
            C1078.m2279(AbstractC5078.m8679("Beginning index larger than ending index: ", i, i2, ", "));
            return 0;
        }
        C1078.m2279(AbstractC5078.m8679("End index: ", i2, i3, " >= "));
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0533) || size() != ((C0533) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof C0533)) {
            return obj.equals(this);
        }
        C0533 c0533 = (C0533) obj;
        int i = this.f1877;
        int i2 = c0533.f1877;
        if (i != 0 && i2 != 0 && i != i2) {
            return false;
        }
        int size = size();
        if (size > c0533.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > c0533.size()) {
            StringBuilder sbM8680 = AbstractC5078.m8680(size, "Ran off end of other: 0, ", ", ");
            sbM8680.append(c0533.size());
            throw new IllegalArgumentException(sbM8680.toString());
        }
        byte[] bArr = c0533.f1876;
        int iMo1190 = mo1190() + size;
        int iMo1191 = mo1190();
        int iMo1192 = c0533.mo1190();
        while (iMo1191 < iMo1190) {
            if (this.f1876[iMo1191] != bArr[iMo1192]) {
                return false;
            }
            iMo1191++;
            iMo1192++;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.f1877;
        if (i != 0) {
            return i;
        }
        int size = size();
        int iMo1190 = mo1190();
        int i2 = size;
        for (int i3 = iMo1190; i3 < iMo1190 + size; i3++) {
            i2 = (i2 * 31) + this.f1876[i3];
        }
        if (i2 == 0) {
            i2 = 1;
        }
        this.f1877 = i2;
        return i2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C3703(this);
    }

    public int size() {
        return this.f1876.length;
    }

    public final String toString() {
        String strConcat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            strConcat = C3133.m5808(this);
        } else {
            int iM1186 = m1186(0, 47, size());
            strConcat = C3133.m5808(iM1186 == 0 ? f1874 : new C4211(this.f1876, mo1190(), iM1186)).concat("...");
        }
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(size);
        sb.append(" contents=\"");
        return AbstractC3761.m6621(sb, strConcat, "\">");
    }

    /* JADX INFO: renamed from: ۥّ */
    public void mo1187(int i, byte[] bArr) {
        System.arraycopy(this.f1876, 0, bArr, 0, i);
    }

    /* JADX INFO: renamed from: ۥۗ */
    public byte mo1188(int i) {
        return this.f1876[i];
    }

    /* JADX INFO: renamed from: ۥۜ */
    public byte mo1189(int i) {
        return this.f1876[i];
    }

    /* JADX INFO: renamed from: ۦۙ */
    public int mo1190() {
        return 0;
    }
}
