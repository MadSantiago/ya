package p000;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: renamed from: ۦؙٖؗ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4314 implements Iterable, Serializable {

    /* JADX INFO: renamed from: ۦ۟ */
    public static final C4585 f14260 = new C4585(AbstractC1963.f6474);

    /* JADX INFO: renamed from: ۦۨ */
    public int f14261 = 0;

    static {
        int i = AbstractC5529.f18251;
    }

    /* JADX INFO: renamed from: ۦِ */
    public static C4585 m7597(byte[] bArr, int i, int i2) {
        try {
            return m7598(bArr, i, i2);
        } catch (C5463 e) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
        }
    }

    /* JADX INFO: renamed from: ۦۗ */
    public static C4585 m7598(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return f14260;
        }
        m7600(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new C4585(bArr2);
    }

    /* JADX INFO: renamed from: ۦ۟ */
    public static /* synthetic */ boolean m7599(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        int i4 = i + i3;
        m7600(i, i4, bArr.length);
        m7600(i2, i3 + i2, bArr2.length);
        while (i < i4) {
            if (bArr[i] != bArr2[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    /* JADX INFO: renamed from: ۦۨ */
    public static int m7600(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 21);
            sb.append("Beginning index: ");
            sb.append(i);
            sb.append(" < 0");
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (i2 < i) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 44 + String.valueOf(i2).length());
            sb2.append("Beginning index larger than ending index: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder(String.valueOf(i2).length() + 15 + String.valueOf(i3).length());
        sb3.append("End index: ");
        sb3.append(i2);
        sb3.append(" >= ");
        sb3.append(i3);
        throw new IndexOutOfBoundsException(sb3.toString());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC4314)) {
            return false;
        }
        AbstractC4314 abstractC4314 = (AbstractC4314) obj;
        int iMo7605 = mo7605();
        if (iMo7605 != abstractC4314.mo7605()) {
            return false;
        }
        if (iMo7605 == 0) {
            return true;
        }
        int i = this.f14261;
        int i2 = abstractC4314.f14261;
        if (i == 0 || i2 == 0 || i == i2) {
            return mo7604(abstractC4314);
        }
        return false;
    }

    public final int hashCode() {
        int iMo7606 = this.f14261;
        if (iMo7606 == 0) {
            int iMo7605 = mo7605();
            iMo7606 = mo7606(iMo7605, iMo7605);
            if (iMo7606 == 0) {
                iMo7606 = 1;
            }
            this.f14261 = iMo7606;
        }
        return iMo7606;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new C3703(this);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int iMo7605 = mo7605();
        String strM5215 = mo7605() <= 50 ? AbstractC2776.m5215(m7608()) : AbstractC2776.m5215(mo7601(0, 47).m7608()).concat("...");
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(iMo7605);
        sb.append(" contents=\"");
        return AbstractC3761.m6621(sb, strM5215, "\">");
    }

    /* JADX INFO: renamed from: ۥُ */
    public abstract AbstractC1936 mo7601(int i, int i2);

    /* JADX INFO: renamed from: ۥّ */
    public abstract void mo7602(int i, byte[] bArr);

    /* JADX INFO: renamed from: ۥۗ */
    public abstract byte mo7603(int i);

    /* JADX INFO: renamed from: ۥۜ */
    public abstract boolean mo7604(AbstractC4314 abstractC4314);

    /* JADX INFO: renamed from: ۦؑ */
    public abstract int mo7605();

    /* JADX INFO: renamed from: ۦٛ */
    public abstract int mo7606(int i, int i2);

    /* JADX INFO: renamed from: ۦۙ */
    public abstract void mo7607(AbstractC0438 abstractC0438);

    /* JADX INFO: renamed from: ۦۚ */
    public final byte[] m7608() {
        int iMo7605 = mo7605();
        if (iMo7605 == 0) {
            return AbstractC1963.f6474;
        }
        byte[] bArr = new byte[iMo7605];
        mo7602(iMo7605, bArr);
        return bArr;
    }
}
