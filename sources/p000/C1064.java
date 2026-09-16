package p000;

/* JADX INFO: renamed from: ۥُّؖۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1064 implements InterfaceC3195 {

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f3745 = 1;

    public final String toString() {
        switch (this.f3745) {
            case 0:
                return "Arrangement#Bottom";
            default:
                return "Arrangement#Top";
        }
    }

    @Override // p000.InterfaceC3195
    /* JADX INFO: renamed from: ۦؚ */
    public final void mo2265(InterfaceC2880 interfaceC2880, int i, int[] iArr, int[] iArr2) {
        int i2 = 0;
        switch (this.f3745) {
            case 0:
                int i3 = 0;
                for (int i4 : iArr) {
                    i3 += i4;
                }
                int length = iArr.length;
                int i5 = i - i3;
                int i6 = 0;
                while (i2 < length) {
                    int i7 = iArr[i2];
                    iArr2[i6] = i5;
                    i5 += i7;
                    i2++;
                    i6++;
                }
                break;
            default:
                int length2 = iArr.length;
                int i8 = 0;
                int i9 = 0;
                while (i2 < length2) {
                    int i10 = iArr[i2];
                    iArr2[i8] = i9;
                    i9 += i10;
                    i2++;
                    i8++;
                }
                break;
        }
    }
}
