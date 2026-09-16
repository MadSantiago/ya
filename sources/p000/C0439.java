package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: ۥُؕؒ٘, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0439 extends AbstractC0071 {
    public static final Parcelable.Creator<C0439> CREATOR = new C5229(10);

    /* JADX INFO: renamed from: ۥَ */
    public final byte[][] f1611;

    /* JADX INFO: renamed from: ۥْ */
    public final byte[][] f1612;

    /* JADX INFO: renamed from: ۥٓ */
    public final byte[][] f1613;

    /* JADX INFO: renamed from: ۥٖ */
    public final byte[][] f1614;

    /* JADX INFO: renamed from: ۥۖ */
    public final int[] f1615;

    /* JADX INFO: renamed from: ۦٕ */
    public final byte[][] f1616;

    /* JADX INFO: renamed from: ۦٗ */
    public final int[] f1617;

    /* JADX INFO: renamed from: ۦۛ */
    public final byte[][] f1618;

    /* JADX INFO: renamed from: ۦ۟ */
    public final byte[] f1619;

    /* JADX INFO: renamed from: ۦۨ */
    public final String f1620;

    public C0439(String str, byte[] bArr, byte[][] bArr2, byte[][] bArr3, byte[][] bArr4, byte[][] bArr5, int[] iArr, byte[][] bArr6, int[] iArr2, byte[][] bArr7) {
        this.f1620 = str;
        this.f1619 = bArr;
        this.f1612 = bArr2;
        this.f1613 = bArr3;
        this.f1611 = bArr4;
        this.f1614 = bArr5;
        this.f1617 = iArr;
        this.f1618 = bArr6;
        this.f1615 = iArr2;
        this.f1616 = bArr7;
    }

    /* JADX INFO: renamed from: ۥُ */
    public static Set m956(byte[][] bArr) {
        int length;
        if (bArr == null || (length = bArr.length) == 0) {
            return Collections.EMPTY_SET;
        }
        HashSet hashSetM4803 = AbstractC2552.m4803(length);
        for (byte[] bArr2 : bArr) {
            AbstractC0487.m1047(bArr2);
            hashSetM4803.add(Base64.encodeToString(bArr2, 3));
        }
        return hashSetM4803;
    }

    /* JADX INFO: renamed from: ۥّ */
    public static List m957(int[] iArr) {
        if (iArr == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(iArr.length >> 1);
        for (int i = 0; i < iArr.length; i += 2) {
            arrayList.add(new C4538(iArr[i], iArr[i + 1]));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static void m958(StringBuilder sb, String str, byte[][] bArr) {
        sb.append(str);
        sb.append("=");
        if (bArr == null) {
            sb.append("null");
            return;
        }
        sb.append("(");
        boolean z = true;
        int i = 0;
        while (i < bArr.length) {
            byte[] bArr2 = bArr[i];
            if (!z) {
                sb.append(", ");
            }
            sb.append("'");
            AbstractC0487.m1047(bArr2);
            sb.append(Base64.encodeToString(bArr2, 3));
            sb.append("'");
            i++;
            z = false;
        }
        sb.append(")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.HashSet] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.HashSet] */
    public final boolean equals(Object obj) {
        Object objM4803;
        Object objM4804;
        int length;
        int length2;
        if (obj instanceof C0439) {
            C0439 c0439 = (C0439) obj;
            if (AbstractC3925.m7026(this.f1620, c0439.f1620) && AbstractC3925.m7026(m959(), c0439.m959()) && AbstractC3925.m7026(m956(this.f1612), m956(c0439.f1612)) && AbstractC3925.m7026(m956(this.f1613), m956(c0439.f1613)) && AbstractC3925.m7026(m956(this.f1611), m956(c0439.f1611)) && AbstractC3925.m7026(m956(this.f1614), m956(c0439.f1614))) {
                int[] iArr = this.f1617;
                if (iArr == null || (length2 = iArr.length) == 0) {
                    objM4803 = Collections.EMPTY_SET;
                } else {
                    objM4803 = AbstractC2552.m4803(length2);
                    for (int i : iArr) {
                        objM4803.add(Integer.valueOf(i));
                    }
                }
                int[] iArr2 = c0439.f1617;
                if (iArr2 == null || (length = iArr2.length) == 0) {
                    objM4804 = Collections.EMPTY_SET;
                } else {
                    objM4804 = AbstractC2552.m4803(length);
                    for (int i2 : iArr2) {
                        objM4804.add(Integer.valueOf(i2));
                    }
                }
                if (AbstractC3925.m7026(objM4803, objM4804) && AbstractC3925.m7026(m957(this.f1615), m957(c0439.f1615)) && AbstractC3925.m7026(m956(this.f1616), m956(c0439.f1616))) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExperimentTokens");
        sb.append("(");
        String str = this.f1620;
        sb.append(str == null ? "null" : AbstractC3761.m6622(new StringBuilder(str.length() + 2), "'", str, "'"));
        sb.append(", direct==");
        byte[] bArr = this.f1619;
        if (bArr == null) {
            sb.append("null");
        } else {
            sb.append("'");
            sb.append(Base64.encodeToString(bArr, 3));
            sb.append("'");
        }
        sb.append(", ");
        m958(sb, "GAIA=", this.f1612);
        sb.append(", ");
        m958(sb, "PSEUDO=", this.f1613);
        sb.append(", ");
        m958(sb, "ALWAYS=", this.f1611);
        sb.append(", ");
        m958(sb, "OTHER=", this.f1614);
        sb.append(", weak=");
        sb.append(Arrays.toString(this.f1617));
        sb.append(", ");
        m958(sb, "directs=", this.f1618);
        sb.append(", genDims=");
        sb.append(Arrays.toString(m957(this.f1615).toArray()));
        sb.append(", ");
        m958(sb, "external=", this.f1616);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM7800 = AbstractC4489.m7800(parcel, 20293);
        AbstractC4489.m7775(parcel, 2, this.f1620);
        AbstractC4489.m7786(parcel, 3, this.f1619);
        AbstractC4489.m7796(parcel, 4, this.f1612);
        AbstractC4489.m7796(parcel, 5, this.f1613);
        AbstractC4489.m7796(parcel, 6, this.f1611);
        AbstractC4489.m7796(parcel, 7, this.f1614);
        AbstractC4489.m7787(parcel, 8, this.f1617);
        AbstractC4489.m7796(parcel, 9, this.f1618);
        AbstractC4489.m7787(parcel, 10, this.f1615);
        AbstractC4489.m7796(parcel, 11, this.f1616);
        AbstractC4489.m7790(parcel, iM7800);
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final Set m959() {
        ArrayList arrayList = new ArrayList();
        byte[][] bArr = this.f1618;
        if (bArr != null) {
            Collections.addAll(arrayList, bArr);
        }
        byte[] bArr2 = this.f1619;
        if (bArr2 != null) {
            arrayList.add(bArr2);
        }
        return m956((byte[][]) arrayList.toArray(new byte[0][]));
    }
}
