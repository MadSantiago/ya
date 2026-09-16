package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: ۦٟٔٚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4203 implements InterfaceC0215 {

    /* JADX INFO: renamed from: ۥۣ */
    public final C5275 f13961;

    public C4203(C5275 c5275) {
        this.f13961 = c5275;
    }

    @Override // p000.InterfaceC3347
    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC2707 mo827(C1280 c1280) {
        C5275 c5275 = this.f13961;
        C4912 c4912 = c5275.f17387;
        C4523 c4523 = new C4523(c4912.f18946 + 2);
        C4912 c4913 = new C4912(c4912.f18946);
        int[] iArr = c4912.f18947;
        Object[] objArr = c4912.f18945;
        long[] jArr = c4912.f18948;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((j & 255) < 128) {
                            int i4 = (i << 3) + i3;
                            int i5 = iArr[i4];
                            if (objArr[i4] != null) {
                                C0178.m382();
                                return null;
                            }
                            c4523.m7843(i5);
                            InterfaceC4745 interfaceC4745 = c1280.f4359;
                            throw null;
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        if (!c4912.m9572(0)) {
            int i6 = c4523.f14948;
            if (i6 < 0) {
                AbstractC2552.m4812("Index must be between 0 and size");
                throw null;
            }
            c4523.m7842(i6 + 1);
            int[] iArr2 = c4523.f14949;
            int i7 = c4523.f14948;
            if (i7 != 0) {
                AbstractC0246.m523(1, 0, i7, iArr2, iArr2);
            }
            iArr2[0] = 0;
            c4523.f14948++;
        }
        if (!c4912.m9572(c5275.f17388)) {
            c4523.m7843(c5275.f17388);
        }
        int i8 = c4523.f14948;
        if (i8 != 0) {
            Arrays.sort(c4523.f14949, 0, i8);
        }
        return new C5186(c4523, c4913, c5275.f17388, AbstractC1074.f3759);
    }
}
