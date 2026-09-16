package p000;

import android.graphics.Matrix;
import android.graphics.Shader;
import android.text.Layout;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: ۥۣۚؔۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2276 {

    /* JADX INFO: renamed from: ۥؗ */
    public final boolean f7558;

    /* JADX INFO: renamed from: ۥُ */
    public final float f7559;

    /* JADX INFO: renamed from: ۥّ */
    public final int f7560;

    /* JADX INFO: renamed from: ۥۗ */
    public final int f7561;

    /* JADX INFO: renamed from: ۥۜ */
    public final ArrayList f7562;

    /* JADX INFO: renamed from: ۥۣ */
    public final C1414 f7563;

    /* JADX INFO: renamed from: ۦؑ */
    public final float f7564;

    /* JADX INFO: renamed from: ۦۙ */
    public final ArrayList f7565;

    public C2276(C1414 c1414, long j, int i, int i2) {
        int i3;
        boolean z;
        int i4;
        int iM6551;
        int i5;
        this.f7563 = c1414;
        this.f7561 = i;
        if (C3693.m6557(j) != 0 || C3693.m6555(j) != 0) {
            AbstractC3767.m6644("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) c1414.f4870;
        int size = arrayList2.size();
        float f = 0.0f;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            if (i6 >= size) {
                i3 = 0;
                z = false;
                break;
            }
            C0425 c0425 = (C0425) arrayList2.get(i6);
            C5541 c5541 = c0425.f1539;
            int iM6556 = C3693.m6556(j);
            if (C3693.m6553(j)) {
                i4 = i6;
                iM6551 = C3693.m6551(j) - ((int) Math.ceil(f));
                if (iM6551 < 0) {
                    iM6551 = 0;
                }
            } else {
                i4 = i6;
                iM6551 = C3693.m6551(j);
            }
            i3 = 0;
            C4303 c4303 = new C4303(c5541, this.f7561 - i7, i2, AbstractC0671.m1494(0, iM6556, 0, iM6551, 5));
            float fM7592 = c4303.m7592() + f;
            C0739 c0739 = c4303.f14237;
            int i8 = i7 + c0739.f2693;
            arrayList.add(new C0158(c4303, c0425.f1538, c0425.f1537, i7, i8, f, fM7592));
            if (!c0739.f2687) {
                if (i8 == this.f7561) {
                    i5 = i4;
                    if (i5 != AbstractC2164.m4181((ArrayList) this.f7563.f4870)) {
                    }
                } else {
                    i5 = i4;
                }
                i6 = i5 + 1;
                i7 = i8;
                f = fM7592;
            }
            z = true;
            i7 = i8;
            f = fM7592;
            break;
        }
        this.f7559 = f;
        this.f7560 = i7;
        this.f7558 = z;
        this.f7562 = arrayList;
        this.f7564 = C3693.m6556(j);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i9 = i3; i9 < size2; i9++) {
            C0158 c0158 = (C0158) arrayList.get(i9);
            List list = c0158.f601.f14234;
            ArrayList arrayList4 = new ArrayList(list.size());
            int size3 = list.size();
            for (int i10 = i3; i10 < size3; i10++) {
                C2793 c2793 = (C2793) list.get(i10);
                arrayList4.add(c2793 != null ? c0158.m341(c2793) : null);
            }
            AbstractC3649.m6529(arrayList4, arrayList3);
        }
        if (arrayList3.size() < ((List) this.f7563.f4868).size()) {
            int size4 = ((List) this.f7563.f4868).size() - arrayList3.size();
            ArrayList arrayList5 = new ArrayList(size4);
            for (int i11 = i3; i11 < size4; i11++) {
                arrayList5.add(null);
            }
            arrayList3 = AbstractC0973.m2049(arrayList3, arrayList5);
        }
        this.f7565 = arrayList3;
    }

    /* JADX INFO: renamed from: ۦِ */
    public static void m4327(C2276 c2276, InterfaceC3212 interfaceC3212, AbstractC0548 abstractC0548, float f, C5906 c5906, C1690 c1690, AbstractC0213 abstractC0213) {
        interfaceC3212.mo2092();
        ArrayList arrayList = c2276.f7562;
        if (arrayList.size() <= 1 || (abstractC0548 instanceof C0547)) {
            AbstractC2133.m4147(c2276, interfaceC3212, abstractC0548, f, c5906, c1690, abstractC0213);
        } else {
            if (!(abstractC0548 instanceof C0714)) {
                C1078.m2275();
                return;
            }
            int size = arrayList.size();
            float fMax = 0.0f;
            float fM7592 = 0.0f;
            for (int i = 0; i < size; i++) {
                C0158 c0158 = (C0158) arrayList.get(i);
                fM7592 += c0158.f601.m7592();
                fMax = Math.max(fMax, c0158.f601.m7594());
            }
            Float.floatToRawIntBits(fMax);
            Float.floatToRawIntBits(fM7592);
            Shader shader = ((C0714) abstractC0548).f2616;
            Matrix matrix = new Matrix();
            shader.getLocalMatrix(matrix);
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                C4303 c4303 = ((C0158) arrayList.get(i2)).f601;
                c4303.m7595(interfaceC3212, new C0714(shader), f, c5906, c1690, abstractC0213);
                interfaceC3212.mo2085(0.0f, c4303.m7592());
                matrix.setTranslate(0.0f, -c4303.m7592());
                shader.setLocalMatrix(matrix);
            }
        }
        interfaceC3212.mo2095();
    }

    /* JADX INFO: renamed from: ۦٛ */
    public static void m4328(C2276 c2276, InterfaceC3212 interfaceC3212, long j, C5906 c5906, C1690 c1690, AbstractC0213 abstractC0213) {
        interfaceC3212.mo2092();
        ArrayList arrayList = c2276.f7562;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0158 c0158 = (C0158) arrayList.get(i);
            c0158.f601.m7591(interfaceC3212, j, c5906, c1690, abstractC0213);
            interfaceC3212.mo2085(0.0f, c0158.f601.m7592());
        }
        interfaceC3212.mo2095();
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final int m4329(int i, boolean z) {
        int iM1628;
        m4337(i);
        ArrayList arrayList = this.f7562;
        C0158 c0158 = (C0158) arrayList.get(C3133.m5810(i, arrayList));
        C4303 c4303 = c0158.f601;
        int i2 = i - c0158.f602;
        C0739 c0739 = c4303.f14237;
        if (z) {
            Layout layout = c0739.f2683;
            ThreadLocal threadLocal = AbstractC4204.f13963;
            if (layout.getEllipsisCount(i2) <= 0 || c0739.f2684 != TextUtils.TruncateAt.END) {
                C1414 c1414M1626 = c0739.m1626();
                Layout layout2 = (Layout) c1414M1626.f4871;
                iM1628 = c1414M1626.m2989(layout2.getLineEnd(i2), layout2.getLineStart(i2));
            } else {
                iM1628 = layout.getEllipsisStart(i2) + layout.getLineStart(i2);
            }
        } else {
            iM1628 = c0739.m1628(i2);
        }
        return iM1628 + c0158.f600;
    }

    /* JADX INFO: renamed from: ۥُ */
    public final int m4330(float f) {
        int lineForVertical;
        ArrayList arrayList = this.f7562;
        C0158 c0158 = (C0158) arrayList.get(C3133.m5784(arrayList, f));
        int i = c0158.f597 - c0158.f600;
        int i2 = c0158.f602;
        if (i == 0) {
            return i2;
        }
        C4303 c4303 = c0158.f601;
        float f2 = f - c0158.f599;
        C0739 c0739 = c4303.f14237;
        int i3 = (int) f2;
        int i4 = c0739.f2693;
        if (i4 <= 0) {
            lineForVertical = 0;
        } else {
            lineForVertical = c0739.f2683.getLineForVertical(i3 - c0739.f2685);
            int i5 = i4 - 1;
            if (lineForVertical > i5) {
                lineForVertical = i5;
            }
        }
        return lineForVertical + i2;
    }

    /* JADX INFO: renamed from: ۥّ */
    public final float m4331(int i) {
        m4337(i);
        ArrayList arrayList = this.f7562;
        C0158 c0158 = (C0158) arrayList.get(C3133.m5810(i, arrayList));
        C4303 c4303 = c0158.f601;
        return c4303.f14237.m1630(i - c0158.f602) + c0158.f599;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final float m4332(int i) {
        m4337(i);
        ArrayList arrayList = this.f7562;
        C0158 c0158 = (C0158) arrayList.get(C3133.m5810(i, arrayList));
        C4303 c4303 = c0158.f601;
        return c4303.f14237.m1627(i - c0158.f602) + c0158.f599;
    }

    /* JADX INFO: renamed from: ۥۜ */
    public final long m4333(C2793 c2793, int i, C0178 c0178) {
        long jM340;
        long j;
        float f = c2793.f9342;
        ArrayList arrayList = this.f7562;
        int iM5784 = C3133.m5784(arrayList, f);
        float f2 = ((C0158) arrayList.get(iM5784)).f603;
        float f3 = c2793.f9344;
        if (f2 >= f3 || iM5784 == AbstractC2164.m4181(arrayList)) {
            C0158 c0158 = (C0158) arrayList.get(iM5784);
            return c0158.m340(c0158.f601.m7589(c0158.m339(c2793), i, c0178), true);
        }
        int iM5785 = C3133.m5784(arrayList, f3);
        long jM341 = C3346.f11196;
        while (true) {
            jM340 = C3346.f11196;
            if (!C3346.m6110(jM341, jM340) || iM5784 > iM5785) {
                break;
            }
            C0158 c0159 = (C0158) arrayList.get(iM5784);
            jM341 = c0159.m340(c0159.f601.m7589(c0159.m339(c2793), i, c0178), true);
            iM5784++;
        }
        if (C3346.m6110(jM341, jM340)) {
            return jM340;
        }
        while (true) {
            j = C3346.f11196;
            if (!C3346.m6110(jM340, j) || iM5784 > iM5785) {
                break;
            }
            C0158 c01510 = (C0158) arrayList.get(iM5785);
            jM340 = c01510.m340(c01510.f601.m7589(c01510.m339(c2793), i, c0178), true);
            iM5785--;
        }
        return C3346.m6110(jM340, j) ? jM341 : AbstractC2765.m5145((int) (jM341 >> 32), (int) (4294967295L & jM340));
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m4334(long j, float[] fArr) {
        m4338(C3346.m6109(j));
        m4336(C3346.m6108(j));
        C4763 c4763 = new C4763();
        c4763.f15714 = 0;
        C3133.m5785(this.f7562, j, new C2531(j, fArr, c4763, new C1916()));
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final int m4335(int i) {
        int iM5811;
        int length = ((C1249) this.f7563.f4871).f4307.length();
        ArrayList arrayList = this.f7562;
        if (i >= length) {
            iM5811 = AbstractC2164.m4181(arrayList);
        } else {
            iM5811 = i < 0 ? 0 : C3133.m5811(i, arrayList);
        }
        C0158 c0158 = (C0158) arrayList.get(iM5811);
        return c0158.f601.f14237.m1636(c0158.m342(i)) + c0158.f602;
    }

    /* JADX INFO: renamed from: ۦؚ */
    public final void m4336(int i) {
        C1249 c1249 = (C1249) this.f7563.f4871;
        if (i < 0 || i > c1249.f4307.length()) {
            StringBuilder sbM8680 = AbstractC5078.m8680(i, "offset(", ") is out of bounds [0, ");
            sbM8680.append(c1249.f4307.length());
            sbM8680.append(']');
            AbstractC3767.m6644(sbM8680.toString());
        }
    }

    /* JADX INFO: renamed from: ۦٌ */
    public final void m4337(int i) {
        boolean z = false;
        int i2 = this.f7560;
        if (i >= 0 && i < i2) {
            z = true;
        }
        if (z) {
            return;
        }
        AbstractC3767.m6644("lineIndex(" + i + ") is out of bounds [0, " + i2 + ')');
    }

    /* JADX INFO: renamed from: ۦۗ */
    public final void m4338(int i) {
        C1249 c1249 = (C1249) this.f7563.f4871;
        if (i < 0 || i >= c1249.f4307.length()) {
            StringBuilder sbM8680 = AbstractC5078.m8680(i, "offset(", ") is out of bounds [0, ");
            sbM8680.append(c1249.f4307.length());
            sbM8680.append(')');
            AbstractC3767.m6644(sbM8680.toString());
        }
    }

    /* JADX INFO: renamed from: ۦۙ */
    public final int m4339(long j) {
        int offsetForHorizontal;
        int i = (int) (j & 4294967295L);
        float fIntBitsToFloat = Float.intBitsToFloat(i);
        ArrayList arrayList = this.f7562;
        C0158 c0158 = (C0158) arrayList.get(C3133.m5784(arrayList, fIntBitsToFloat));
        int i2 = c0158.f597;
        int i3 = c0158.f600;
        if (i2 - i3 == 0) {
            return i3;
        }
        C4303 c4303 = c0158.f601;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat(i) - c0158.f599;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & 4294967295L);
        C0739 c0739 = c4303.f14237;
        int iIntBitsToFloat = (int) Float.intBitsToFloat((int) (4294967295L & jFloatToRawIntBits));
        Layout layout = c0739.f2683;
        int lineForVertical = layout.getLineForVertical(iIntBitsToFloat - c0739.f2685);
        if (lineForVertical >= c0739.f2693) {
            offsetForHorizontal = layout.getText().length();
        } else {
            offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, (c0739.m1629(lineForVertical) * (-1.0f)) + Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)));
        }
        return offsetForHorizontal + i3;
    }
}
