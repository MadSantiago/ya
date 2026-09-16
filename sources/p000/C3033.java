package p000;

/* JADX INFO: renamed from: ۦْؑؔٚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3033 implements InterfaceC1367 {

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f10198;

    public /* synthetic */ C3033(int i) {
        this.f10198 = i;
    }

    public final String toString() {
        switch (this.f10198) {
            case 0:
                return "AbsoluteArrangement#Left";
            case 1:
                return "AbsoluteArrangement#Right";
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                return "Arrangement#End";
            default:
                return "Arrangement#Start";
        }
    }

    @Override // p000.InterfaceC1367
    /* JADX INFO: renamed from: ۦۗ */
    public final void mo2869(InterfaceC2880 interfaceC2880, int i, int[] iArr, EnumC2459 enumC2459, int[] iArr2) {
        int i2 = this.f10198;
        EnumC2459 enumC24510 = EnumC2459.f8215;
        int i3 = 0;
        switch (i2) {
            case 0:
                int length = iArr.length;
                int i4 = 0;
                int i5 = 0;
                while (i3 < length) {
                    int i6 = iArr[i3];
                    iArr2[i4] = i5;
                    i5 += i6;
                    i3++;
                    i4++;
                }
                break;
            case 1:
                int i7 = 0;
                for (int i8 : iArr) {
                    i7 += i8;
                }
                int i9 = i - i7;
                int length2 = iArr.length;
                int i10 = 0;
                while (i3 < length2) {
                    int i11 = iArr[i3];
                    iArr2[i10] = i9;
                    i9 += i11;
                    i3++;
                    i10++;
                }
                break;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                if (enumC2459 == enumC24510) {
                    int i12 = 0;
                    for (int i13 : iArr) {
                        i12 += i13;
                    }
                    int i14 = i - i12;
                    int length3 = iArr.length;
                    int i15 = 0;
                    while (i3 < length3) {
                        int i16 = iArr[i3];
                        iArr2[i15] = i14;
                        i14 += i16;
                        i3++;
                        i15++;
                    }
                } else {
                    for (int length4 = iArr.length - 1; -1 < length4; length4--) {
                        int i17 = iArr[length4];
                        iArr2[length4] = i3;
                        i3 += i17;
                    }
                }
                break;
            default:
                if (enumC2459 == enumC24510) {
                    int length5 = iArr.length;
                    int i18 = 0;
                    int i19 = 0;
                    while (i3 < length5) {
                        int i20 = iArr[i3];
                        iArr2[i18] = i19;
                        i19 += i20;
                        i3++;
                        i18++;
                    }
                } else {
                    int length6 = iArr.length;
                    int i21 = 0;
                    while (i3 < length6) {
                        i21 += iArr[i3];
                        i3++;
                    }
                    int i22 = i - i21;
                    for (int length7 = iArr.length - 1; -1 < length7; length7--) {
                        int i23 = iArr[length7];
                        iArr2[length7] = i22;
                        i22 += i23;
                    }
                }
                break;
        }
    }
}
