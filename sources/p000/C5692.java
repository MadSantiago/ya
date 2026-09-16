package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.Arrays;

/* JADX INFO: renamed from: ۦۥؑٛۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5692 extends AbstractC0071 implements Comparable {
    public static final Parcelable.Creator<C5692> CREATOR = new C5229(11);

    /* JADX INFO: renamed from: ۥَ */
    public final String f18721;

    /* JADX INFO: renamed from: ۥْ */
    public final boolean f18722;

    /* JADX INFO: renamed from: ۥٓ */
    public final double f18723;

    /* JADX INFO: renamed from: ۥٖ */
    public final byte[] f18724;

    /* JADX INFO: renamed from: ۥۖ */
    public final int f18725;

    /* JADX INFO: renamed from: ۦٗ */
    public final int f18726;

    /* JADX INFO: renamed from: ۦۛ */
    public final int f18727;

    /* JADX INFO: renamed from: ۦ۟ */
    public final long f18728;

    /* JADX INFO: renamed from: ۦۨ */
    public final String f18729;

    public C5692(String str, long j, boolean z, double d, String str2, byte[] bArr, int i, int i2, int i3) {
        this.f18729 = str;
        this.f18728 = j;
        this.f18722 = z;
        this.f18723 = d;
        this.f18721 = str2;
        this.f18724 = bArr;
        this.f18726 = i;
        this.f18727 = i2;
        this.f18725 = i3;
    }

    /* JADX WARN: Code duplicated, block: B:64:0x00a5 A[RETURN] */
    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        int i;
        C5692 c5692 = (C5692) obj;
        int iCompareTo = this.f18729.compareTo(c5692.f18729);
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int i2 = c5692.f18726;
        int i3 = this.f18726;
        if (i3 < i2) {
            i = -1;
        } else {
            i = i3 != i2 ? 1 : 0;
        }
        if (i != 0) {
            return i;
        }
        if (i3 == 1) {
            long j = this.f18728;
            long j2 = c5692.f18728;
            if (j >= j2) {
                if (j == j2) {
                    return 0;
                }
                return 1;
            }
            return -1;
        }
        if (i3 == 2) {
            boolean z = c5692.f18722;
            boolean z2 = this.f18722;
            if (z2 != z) {
                if (z2) {
                    return 1;
                }
                return -1;
            }
            return 0;
        }
        if (i3 == 3) {
            return Double.compare(this.f18723, c5692.f18723);
        }
        if (i3 == 4) {
            String str = c5692.f18721;
            String str2 = this.f18721;
            if (str2 != str) {
                if (str2 != null) {
                    if (str != null) {
                        return str2.compareTo(str);
                    }
                    return 1;
                }
                return -1;
            }
            return 0;
        }
        if (i3 != 5) {
            throw new AssertionError(AbstractC5078.m8673(i3, "Invalid enum value: ", new StringBuilder(String.valueOf(i3).length() + 20)));
        }
        byte[] bArr = c5692.f18724;
        byte[] bArr2 = this.f18724;
        if (bArr2 != bArr) {
            if (bArr2 != null) {
                if (bArr != null) {
                    int i4 = 0;
                    while (true) {
                        int length = bArr.length;
                        int length2 = bArr2.length;
                        if (i4 >= Math.min(length2, length)) {
                            if (length2 < length) {
                                return -1;
                            }
                            return length2 != length ? 1 : 0;
                        }
                        int i5 = bArr2[i4] - bArr[i4];
                        if (i5 != 0) {
                            return i5;
                        }
                        i4++;
                    }
                }
                return 1;
            }
            return -1;
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5692) {
            C5692 c5692 = (C5692) obj;
            if (AbstractC3925.m7026(this.f18729, c5692.f18729)) {
                int i = c5692.f18726;
                int i2 = this.f18726;
                if (i2 == i && this.f18727 == c5692.f18727 && this.f18725 == c5692.f18725) {
                    if (i2 == 1) {
                        return this.f18728 == c5692.f18728;
                    }
                    if (i2 == 2) {
                        return this.f18722 == c5692.f18722;
                    }
                    if (i2 == 3) {
                        return this.f18723 == c5692.f18723;
                    }
                    if (i2 == 4) {
                        return AbstractC3925.m7026(this.f18721, c5692.f18721);
                    }
                    if (i2 == 5) {
                        return Arrays.equals(this.f18724, c5692.f18724);
                    }
                    throw new AssertionError(AbstractC5078.m8673(i2, "Invalid enum value: ", new StringBuilder(String.valueOf(i2).length() + 20)));
                }
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        m9504(sb);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.f18729;
        boolean z = str == null;
        int iM7800 = AbstractC4489.m7800(parcel, 20293);
        if (!z) {
            AbstractC4489.m7775(parcel, 2, str);
        }
        long j = this.f18728;
        if (j != 0) {
            AbstractC4489.m7797(parcel, 3, 8);
            parcel.writeLong(j);
        }
        if (this.f18722) {
            AbstractC4489.m7797(parcel, 4, 4);
            parcel.writeInt(1);
        }
        double d = this.f18723;
        if (d != 0.0d) {
            AbstractC4489.m7797(parcel, 5, 8);
            parcel.writeDouble(d);
        }
        String str2 = this.f18721;
        if (str2 != null) {
            AbstractC4489.m7775(parcel, 6, str2);
        }
        byte[] bArr = this.f18724;
        if (bArr != null) {
            AbstractC4489.m7786(parcel, 7, bArr);
        }
        int i2 = this.f18726;
        if (i2 != 0) {
            AbstractC4489.m7797(parcel, 8, 4);
            parcel.writeInt(i2);
        }
        int i3 = this.f18727;
        if (i3 != 0) {
            AbstractC4489.m7797(parcel, 9, 4);
            parcel.writeInt(i3);
        }
        int i4 = this.f18725;
        if (i4 != 0) {
            AbstractC4489.m7797(parcel, 10, 4);
            parcel.writeInt(i4);
        }
        AbstractC4489.m7790(parcel, iM7800);
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final void m9504(StringBuilder sb) {
        sb.append("Flag(");
        String str = this.f18729;
        sb.append(str);
        sb.append(", ");
        int i = this.f18726;
        if (i == 1) {
            sb.append(this.f18728);
        } else if (i == 2) {
            sb.append(this.f18722);
        } else if (i == 3) {
            sb.append(this.f18723);
        } else if (i == 4) {
            sb.append("'");
            String str2 = this.f18721;
            AbstractC0487.m1047(str2);
            sb.append(str2);
            sb.append("'");
        } else {
            if (i != 5) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 16 + String.valueOf(i).length());
                sb2.append("Invalid type: ");
                sb2.append(str);
                sb2.append(", ");
                sb2.append(i);
                throw new AssertionError(sb2.toString());
            }
            sb.append("'");
            byte[] bArr = this.f18724;
            AbstractC0487.m1047(bArr);
            sb.append(Base64.encodeToString(bArr, 3));
            sb.append("'");
        }
        sb.append(", ");
        sb.append(i);
        sb.append(", ");
        sb.append(this.f18727);
        sb.append(", ");
        sb.append(this.f18725);
        sb.append(")");
    }
}
