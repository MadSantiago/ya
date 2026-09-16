package p000;

/* JADX INFO: renamed from: ۦۣۘۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5074 extends C1007 {

    /* JADX INFO: renamed from: ۥَ */
    public final transient byte[][] f16831;

    /* JADX INFO: renamed from: ۥٖ */
    public final transient int[] f16832;

    public C5074(byte[][] bArr, int[] iArr) {
        super(C1007.f3595.f3598);
        this.f16831 = bArr;
        this.f16832 = iArr;
    }

    @Override // p000.C1007
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1007) {
            C1007 c1007 = (C1007) obj;
            if (c1007.mo2205() == mo2205() && mo2211(0, c1007, mo2205())) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.C1007
    public final int hashCode() {
        int i = this.f3597;
        if (i != 0) {
            return i;
        }
        byte[][] bArr = this.f16831;
        int length = bArr.length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            int[] iArr = this.f16832;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            byte[] bArr2 = bArr[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr2[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        this.f3597 = i3;
        return i3;
    }

    @Override // p000.C1007
    public final String toString() {
        return m8660().toString();
    }

    @Override // p000.C1007
    /* JADX INFO: renamed from: ۥؗ */
    public final String mo2203() {
        return m8660().mo2203();
    }

    @Override // p000.C1007
    /* JADX INFO: renamed from: ۥّ */
    public final byte[] mo2204() {
        return m8661();
    }

    /* JADX INFO: renamed from: ۥْ */
    public final C1007 m8660() {
        return new C1007(m8661());
    }

    @Override // p000.C1007
    /* JADX INFO: renamed from: ۥۗ */
    public final int mo2205() {
        return this.f16832[this.f16831.length - 1];
    }

    @Override // p000.C1007
    /* JADX INFO: renamed from: ۥۜ */
    public final int mo2206(byte[] bArr) {
        return m8660().mo2206(bArr);
    }

    @Override // p000.C1007
    /* JADX INFO: renamed from: ۦؑ */
    public final int mo2208(int i, byte[] bArr) {
        return m8660().mo2208(i, bArr);
    }

    @Override // p000.C1007
    /* JADX INFO: renamed from: ۦٌ */
    public final C1007 mo2209() {
        return m8660().mo2209();
    }

    @Override // p000.C1007
    /* JADX INFO: renamed from: ۦِ */
    public final boolean mo2210(int i, byte[] bArr, int i2, int i3) {
        if (i >= 0 && i <= mo2205() - i3 && i2 >= 0 && i2 <= bArr.length - i3) {
            int i4 = i3 + i;
            int iM5795 = C3133.m5795(this, i);
            while (i < i4) {
                int[] iArr = this.f16832;
                int i5 = iM5795 == 0 ? 0 : iArr[iM5795 - 1];
                int i6 = iArr[iM5795] - i5;
                byte[][] bArr2 = this.f16831;
                int i7 = iArr[bArr2.length + iM5795];
                int iMin = Math.min(i4, i6 + i5) - i;
                if (C5063.m8651(bArr2[iM5795], (i - i5) + i7, bArr, i2, iMin)) {
                    i2 += iMin;
                    i += iMin;
                    iM5795++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // p000.C1007
    /* JADX INFO: renamed from: ۦٛ */
    public final boolean mo2211(int i, C1007 c1007, int i2) {
        if (i >= 0 && i <= mo2205() - i2) {
            int i3 = i2 + i;
            int iM5795 = C3133.m5795(this, i);
            int i4 = 0;
            while (i < i3) {
                int[] iArr = this.f16832;
                int i5 = iM5795 == 0 ? 0 : iArr[iM5795 - 1];
                int i6 = iArr[iM5795] - i5;
                byte[][] bArr = this.f16831;
                int i7 = iArr[bArr.length + iM5795];
                int iMin = Math.min(i3, i6 + i5) - i;
                if (c1007.mo2210(i4, bArr[iM5795], (i - i5) + i7, iMin)) {
                    i4 += iMin;
                    i += iMin;
                    iM5795++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // p000.C1007
    /* JADX INFO: renamed from: ۦۗ */
    public final C1007 mo2212(int i, int i2) {
        if (i2 == -1234567890) {
            i2 = mo2205();
        }
        if (i < 0) {
            C1078.m2273(AbstractC5078.m8681(i, "beginIndex=", " < 0"));
            return null;
        }
        if (i2 > mo2205()) {
            StringBuilder sbM8680 = AbstractC5078.m8680(i2, "endIndex=", " > length(");
            sbM8680.append(mo2205());
            sbM8680.append(')');
            throw new IllegalArgumentException(sbM8680.toString().toString());
        }
        int i3 = i2 - i;
        if (i3 < 0) {
            C1078.m2273(AbstractC5078.m8679("endIndex=", i2, i, " < beginIndex="));
            return null;
        }
        if (i == 0 && i2 == mo2205()) {
            return this;
        }
        if (i == i2) {
            return C1007.f3595;
        }
        int iM5795 = C3133.m5795(this, i);
        int iM5796 = C3133.m5795(this, i2 - 1);
        byte[][] bArr = this.f16831;
        byte[][] bArr2 = (byte[][]) AbstractC0246.m514(bArr, iM5795, iM5796 + 1);
        int[] iArr = new int[bArr2.length * 2];
        int[] iArr2 = this.f16832;
        if (iM5795 <= iM5796) {
            int i4 = iM5795;
            int i5 = 0;
            while (true) {
                iArr[i5] = Math.min(iArr2[i4] - i, i3);
                int i6 = i5 + 1;
                iArr[i5 + bArr2.length] = iArr2[bArr.length + i4];
                if (i4 == iM5796) {
                    break;
                }
                i4++;
                i5 = i6;
            }
        }
        int i7 = iM5795 != 0 ? iArr2[iM5795 - 1] : 0;
        int length = bArr2.length;
        iArr[length] = (i - i7) + iArr[length];
        return new C5074(bArr2, iArr);
    }

    @Override // p000.C1007
    /* JADX INFO: renamed from: ۦۙ */
    public final byte mo2213(int i) {
        byte[][] bArr = this.f16831;
        int length = bArr.length - 1;
        int[] iArr = this.f16832;
        C5063.m8614(iArr[length], i, 1L);
        int iM5795 = C3133.m5795(this, i);
        return bArr[iM5795][(i - (iM5795 == 0 ? 0 : iArr[iM5795 - 1])) + iArr[bArr.length + iM5795]];
    }

    /* JADX INFO: renamed from: ۦ۟ */
    public final byte[] m8661() {
        byte[] bArr = new byte[mo2205()];
        byte[][] bArr2 = this.f16831;
        int length = bArr2.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int[] iArr = this.f16832;
            int i4 = iArr[length + i];
            int i5 = iArr[i];
            int i6 = i5 - i2;
            System.arraycopy(bArr2[i], i4, bArr, i3, (i4 + i6) - i4);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    @Override // p000.C1007
    /* JADX INFO: renamed from: ۦۨ */
    public final void mo2215(C1270 c1270, int i) {
        int iM5795 = C3133.m5795(this, 0);
        int i2 = 0;
        while (i2 < i) {
            int[] iArr = this.f16832;
            int i3 = iM5795 == 0 ? 0 : iArr[iM5795 - 1];
            int i4 = iArr[iM5795] - i3;
            byte[][] bArr = this.f16831;
            int i5 = iArr[bArr.length + iM5795];
            int iMin = Math.min(i, i4 + i3) - i2;
            int i6 = (i2 - i3) + i5;
            C3341 c3341 = new C3341(bArr[iM5795], i6, i6 + iMin, true);
            C3341 c3342 = c1270.f4341;
            if (c3342 == null) {
                c3341.f11180 = c3341;
                c3341.f11176 = c3341;
                c1270.f4341 = c3341;
            } else {
                c3342.f11180.m6102(c3341);
            }
            i2 += iMin;
            iM5795++;
        }
        c1270.f4340 += (long) i;
    }
}
