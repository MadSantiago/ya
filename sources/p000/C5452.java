package p000;

/* JADX INFO: renamed from: ۦّٕۡؓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5452 implements InterfaceC1367, InterfaceC3195 {

    /* JADX INFO: renamed from: ۥْ */
    public final C1078 f17969;

    /* JADX INFO: renamed from: ۥٓ */
    public final float f17970;

    /* JADX INFO: renamed from: ۦ۟ */
    public final boolean f17971;

    /* JADX INFO: renamed from: ۦۨ */
    public final float f17972;

    public C5452(float f, boolean z, C1078 c1078) {
        this.f17972 = f;
        this.f17971 = z;
        this.f17969 = c1078;
        this.f17970 = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5452)) {
            return false;
        }
        C5452 c5452 = (C5452) obj;
        return C4497.m7826(this.f17972, c5452.f17972) && this.f17971 == c5452.f17971 && AbstractC3831.m6874(this.f17969, c5452.f17969);
    }

    public final int hashCode() {
        int iM8672 = AbstractC5078.m8672(Float.hashCode(this.f17972) * 31, 31, this.f17971);
        C1078 c1078 = this.f17969;
        return iM8672 + (c1078 == null ? 0 : c1078.hashCode());
    }

    public final String toString() {
        return (this.f17971 ? "" : "Absolute") + "Arrangement#spacedAligned(" + ((Object) C4497.m7825(this.f17972)) + ", " + this.f17969 + ')';
    }

    @Override // p000.InterfaceC1367, p000.InterfaceC3195
    /* JADX INFO: renamed from: ۥۣ */
    public final float mo2868() {
        return this.f17970;
    }

    @Override // p000.InterfaceC3195
    /* JADX INFO: renamed from: ۦؚ */
    public final void mo2265(InterfaceC2880 interfaceC2880, int i, int[] iArr, int[] iArr2) {
        mo2869(interfaceC2880, i, iArr, EnumC2459.f8215, iArr2);
    }

    @Override // p000.InterfaceC1367
    /* JADX INFO: renamed from: ۦۗ */
    public final void mo2869(InterfaceC2880 interfaceC2880, int i, int[] iArr, EnumC2459 enumC2459, int[] iArr2) {
        int i2;
        if (iArr.length == 0) {
            return;
        }
        int iMo743 = interfaceC2880.mo743(this.f17972);
        boolean z = this.f17971 && enumC2459 == EnumC2459.f8214;
        if (z) {
            int length = iArr.length;
            int i3 = 0;
            int iMin = 0;
            int i4 = 0;
            while (i3 < length) {
                int iMax = Math.max(0, i - iArr[i3]);
                iArr2[i4] = iMax;
                iMin = Math.min(iMo743, iMax);
                i = iArr2[i4] - iMin;
                i3++;
                i4++;
            }
            i2 = i + iMin;
        } else {
            int length2 = iArr.length;
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            while (i5 < length2) {
                int i9 = iArr[i5];
                int iMin2 = Math.min(i6, i - i9);
                iArr2[i8] = iMin2;
                int iMin3 = Math.min(iMo743, (i - iMin2) - i9);
                int i10 = iArr2[i8] + i9 + iMin3;
                i5++;
                i7 = iMin3;
                i6 = i10;
                i8++;
            }
            i2 = i - (i6 - i7);
        }
        if (this.f17969 == null || i2 <= 0) {
            return;
        }
        int iRound = Math.round((1.0f + (enumC2459 == EnumC2459.f8215 ? -1.0f : 1.0f)) * (i2 / 2.0f));
        if (z) {
            iRound -= i2;
        }
        if (iRound != 0) {
            int length3 = iArr2.length;
            for (int i11 = 0; i11 < length3; i11++) {
                iArr2[i11] = iArr2[i11] + iRound;
            }
        }
    }
}
