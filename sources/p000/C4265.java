package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: ۦٕؗٗۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4265 {

    /* JADX INFO: renamed from: ۥؗ */
    public int f14120;

    /* JADX INFO: renamed from: ۥُ */
    public final C4912 f14121;

    /* JADX INFO: renamed from: ۥّ */
    public final C2432 f14122;

    /* JADX INFO: renamed from: ۥۗ */
    public final int f14123;

    /* JADX INFO: renamed from: ۥۣ */
    public final ArrayList f14124;

    /* JADX INFO: renamed from: ۦؑ */
    public final ArrayList f14125;

    public C4265(int i, ArrayList arrayList) {
        this.f14124 = arrayList;
        this.f14123 = i;
        if (i < 0) {
            AbstractC0371.m795("Invalid start index");
        }
        this.f14125 = new ArrayList();
        C4912 c4912 = new C4912();
        int size = arrayList.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            C4171 c4171 = (C4171) this.f14124.get(i3);
            int i4 = c4171.f13882;
            int i5 = c4171.f13885;
            c4912.m8319(i4, new C2230(i3, i2, i5));
            i2 += i5;
        }
        this.f14121 = c4912;
        this.f14122 = new C2432(new C2767(1, this));
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final boolean m7560(int i, int i2) {
        C2230 c2230;
        int i3;
        int i4;
        C4912 c4912 = this.f14121;
        C2230 c2231 = (C2230) c4912.m9571(i);
        if (c2231 == null) {
            return false;
        }
        int i5 = c2231.f7389;
        int i6 = i2 - c2231.f7388;
        c2231.f7388 = i2;
        if (i6 == 0) {
            return true;
        }
        Object[] objArr = c4912.f18945;
        long[] jArr = c4912.f18948;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i7 = 0;
        while (true) {
            long j = jArr[i7];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i8 = 8 - ((~(i7 - length)) >>> 31);
                for (int i9 = 0; i9 < i8; i9++) {
                    if ((255 & j) < 128 && (i3 = (c2230 = (C2230) objArr[(i7 << 3) + i9]).f7389) >= i5 && c2230 != c2231 && (i4 = i3 + i6) >= 0) {
                        c2230.f7389 = i4;
                    }
                    j >>= 8;
                }
                if (i8 != 8) {
                    return true;
                }
            }
            if (i7 == length) {
                return true;
            }
            i7++;
        }
    }
}
