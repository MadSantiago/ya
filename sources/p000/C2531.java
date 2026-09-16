package p000;

import android.text.Layout;
import java.io.Serializable;

/* JADX INFO: renamed from: ۥؚ۠ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2531 implements InterfaceC4745 {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ Object f8381;

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ Object f8382;

    /* JADX INFO: renamed from: ۥٓ */
    public final /* synthetic */ Serializable f8383;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ long f8384;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f8385 = 1;

    public /* synthetic */ C2531(long j, float[] fArr, C4763 c4763, C1916 c1916) {
        this.f8384 = j;
        this.f8382 = fArr;
        this.f8383 = c4763;
        this.f8381 = c1916;
    }

    @Override // p000.InterfaceC4745
    /* JADX INFO: renamed from: ۦؚ */
    public final Object mo211(Object obj) {
        long j;
        C2358 c2358;
        float[] fArr;
        int i;
        float fM6901;
        float fM6902;
        int i2 = this.f8385;
        C2358 c2359 = C2358.f7817;
        Object obj2 = this.f8381;
        Serializable serializable = this.f8383;
        Object obj3 = this.f8382;
        switch (i2) {
            case 0:
                C2793 c2793 = (C2793) obj3;
                C5450 c5450 = (C5450) serializable;
                long j2 = this.f8384;
                C1516 c1516 = (C1516) obj2;
                C2497 c2497 = (C2497) obj;
                c2497.m4644();
                float f = c2793.f9343;
                float f2 = c2793.f9342;
                C2004 c2004 = c2497.f8304;
                ((C5086) c2004.f6603.f9378).m8699(f, f2);
                try {
                    InterfaceC2442.m4559(c2497, (C1955) c5450.f17965, j2, 0L, 0.0f, c1516, 0, 890);
                    return c2359;
                } finally {
                    ((C5086) c2004.f6603.f9378).m8699(-f, -f2);
                }
            default:
                float[] fArr2 = (float[]) obj3;
                C4763 c4763 = (C4763) serializable;
                C1916 c1916 = (C1916) obj2;
                C0158 c0158 = (C0158) obj;
                int i3 = c0158.f600;
                C4303 c4303 = c0158.f601;
                int iM6108 = c0158.f597;
                long j3 = this.f8384;
                int iM6109 = i3 > C3346.m6109(j3) ? c0158.f600 : C3346.m6109(j3);
                if (iM6108 >= C3346.m6108(j3)) {
                    iM6108 = C3346.m6108(j3);
                }
                long jM5145 = AbstractC2765.m5145(c0158.m342(iM6109), c0158.m342(iM6108));
                int i4 = c4763.f15714;
                C0739 c0739 = c4303.f14237;
                int iM61010 = C3346.m6109(jM5145);
                int iM61011 = C3346.m6108(jM5145);
                Layout layout = c0739.f2683;
                int length = layout.getText().length();
                if (iM61010 < 0) {
                    AbstractC3767.m6644("startOffset must be > 0");
                }
                if (iM61010 >= length) {
                    AbstractC3767.m6644("startOffset must be less than text length");
                }
                if (iM61011 <= iM61010) {
                    AbstractC3767.m6644("endOffset must be greater than startOffset");
                }
                if (iM61011 > length) {
                    AbstractC3767.m6644("endOffset must be smaller or equal to text length");
                }
                if (fArr2.length - i4 < (iM61011 - iM61010) * 4) {
                    AbstractC3767.m6644("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4");
                }
                int iM1636 = c0739.m1636(iM61010);
                int iM1637 = c0739.m1636(iM61011 - 1);
                C3871 c3871 = new C3871(c0739);
                if (iM1636 <= iM1637) {
                    while (true) {
                        int lineStart = layout.getLineStart(iM1636);
                        j = jM5145;
                        int iM1628 = c0739.m1628(iM1636);
                        int iMax = Math.max(iM61010, lineStart);
                        int iMin = Math.min(iM61011, iM1628);
                        float fM1630 = c0739.m1630(iM1636);
                        float fM1627 = c0739.m1627(iM1636);
                        c2358 = c2359;
                        fArr = fArr2;
                        boolean z = false;
                        boolean z2 = layout.getParagraphDirection(iM1636) == 1;
                        int i5 = i4;
                        int i6 = iMax;
                        while (i6 < iMin) {
                            boolean zIsRtlCharAt = layout.isRtlCharAt(i6);
                            if (!z2 || zIsRtlCharAt) {
                                if (z2 && zIsRtlCharAt) {
                                    z = false;
                                    float fM6903 = c3871.m6901(i6, false, false, false);
                                    i = iMin;
                                    fM6901 = c3871.m6901(i6 + 1, true, true, false);
                                    fM6902 = fM6903;
                                } else {
                                    i = iMin;
                                    z = false;
                                    if (z2 || !zIsRtlCharAt) {
                                        fM6901 = c3871.m6901(i6, false, false, false);
                                        fM6902 = c3871.m6901(i6 + 1, true, true, false);
                                    } else {
                                        fM6902 = c3871.m6901(i6, false, false, true);
                                        fM6901 = c3871.m6901(i6 + 1, true, true, true);
                                    }
                                }
                                fArr[i5] = fM6901;
                                fArr[i5 + 1] = fM1630;
                                fArr[i5 + 2] = fM6902;
                                fArr[i5 + 3] = fM1627;
                                i5 += 4;
                                i6++;
                                iMin = i;
                            } else {
                                fM6901 = c3871.m6901(i6, z, z, true);
                                i = iMin;
                                fM6902 = c3871.m6901(i6 + 1, true, true, true);
                            }
                            z = false;
                            fArr[i5] = fM6901;
                            fArr[i5 + 1] = fM1630;
                            fArr[i5 + 2] = fM6902;
                            fArr[i5 + 3] = fM1627;
                            i5 += 4;
                            i6++;
                            iMin = i;
                        }
                        if (iM1636 != iM1637) {
                            iM1636++;
                            jM5145 = j;
                            i4 = i5;
                            c2359 = c2358;
                            fArr2 = fArr;
                        }
                    }
                } else {
                    j = jM5145;
                    c2358 = c2359;
                    fArr = fArr2;
                }
                int iM6113 = (C3346.m6113(j) * 4) + c4763.f15714;
                for (int i7 = c4763.f15714; i7 < iM6113; i7 += 4) {
                    int i8 = i7 + 1;
                    float f3 = fArr[i8];
                    float f4 = c1916.f6312;
                    fArr[i8] = f3 + f4;
                    int i9 = i7 + 3;
                    fArr[i9] = fArr[i9] + f4;
                }
                c4763.f15714 = iM6113;
                c1916.f6312 = c4303.m7592() + c1916.f6312;
                return c2358;
        }
    }

    public /* synthetic */ C2531(C2793 c2793, C5450 c5450, long j, C1516 c1516) {
        this.f8382 = c2793;
        this.f8383 = c5450;
        this.f8384 = j;
        this.f8381 = c1516;
    }
}
