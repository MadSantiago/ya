package p000;

import android.graphics.RectF;
import android.text.Layout;
import java.util.ArrayList;

/* JADX INFO: renamed from: ۦَؑۦۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3828 {

    /* JADX INFO: renamed from: ۥؗ */
    public final long f12693;

    /* JADX INFO: renamed from: ۥُ */
    public final float f12694;

    /* JADX INFO: renamed from: ۥّ */
    public final ArrayList f12695;

    /* JADX INFO: renamed from: ۥۗ */
    public final C2276 f12696;

    /* JADX INFO: renamed from: ۥۣ */
    public final C2537 f12697;

    /* JADX INFO: renamed from: ۦؑ */
    public final float f12698;

    public C3828(C2537 c2537, C2276 c2276, long j) {
        this.f12697 = c2537;
        this.f12696 = c2276;
        this.f12693 = j;
        ArrayList arrayList = c2276.f7562;
        float fM1632 = 0.0f;
        this.f12698 = arrayList.isEmpty() ? 0.0f : ((C0158) arrayList.get(0)).f601.f14237.m1632(0);
        if (!arrayList.isEmpty()) {
            C0158 c0158 = (C0158) AbstractC0973.m2040(arrayList);
            C0739 c0739 = c0158.f601.f14237;
            fM1632 = c0739.m1632(c0739.f2693 - 1) + c0158.f599;
        }
        this.f12694 = fM1632;
        this.f12695 = c2276.f7565;
    }

    /* JADX INFO: renamed from: ۥُ */
    public static int m6823(C3828 c3828, int i) {
        return c3828.f12696.m4329(i, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3828) {
            C3828 c3828 = (C3828) obj;
            if (AbstractC3831.m6874(this.f12697, c3828.f12697) && this.f12696 == c3828.f12696 && C4207.m7431(this.f12693, c3828.f12693) && this.f12698 == c3828.f12698 && this.f12694 == c3828.f12694 && this.f12695.equals(c3828.f12695)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f12695.hashCode() + AbstractC3761.m6635(this.f12694, AbstractC3761.m6635(this.f12698, AbstractC3761.m6626((this.f12696.hashCode() + (this.f12697.hashCode() * 31)) * 31, 31, this.f12693), 31), 31);
    }

    public final String toString() {
        return "TextLayoutResult(layoutInput=" + this.f12697 + ", multiParagraph=" + this.f12696 + ", size=" + ((Object) C4207.m7430(this.f12693)) + ", firstBaseline=" + this.f12698 + ", lastBaseline=" + this.f12694 + ", placeholderRects=" + this.f12695 + ')';
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final C2793 m6824(int i) {
        C2276 c2276 = this.f12696;
        c2276.m4336(i);
        int length = ((C1249) c2276.f7563.f4871).f4307.length();
        ArrayList arrayList = c2276.f7562;
        C0158 c0158 = (C0158) arrayList.get(i == length ? AbstractC2164.m4181(arrayList) : C3133.m5811(i, arrayList));
        C4303 c4303 = c0158.f601;
        int iM342 = c0158.m342(i);
        CharSequence charSequence = c4303.f14233;
        C0739 c0739 = c4303.f14237;
        if (iM342 < 0 || iM342 > charSequence.length()) {
            StringBuilder sbM8680 = AbstractC5078.m8680(iM342, "offset(", ") is out of bounds [0,");
            sbM8680.append(charSequence.length());
            sbM8680.append(']');
            AbstractC3767.m6644(sbM8680.toString());
        }
        float fM1634 = c0739.m1634(iM342, false);
        int iM1636 = c0739.m1636(iM342);
        return c0158.m341(new C2793(fM1634, c0739.m1630(iM1636), fM1634, c0739.m1627(iM1636)));
    }

    /* JADX INFO: renamed from: ۥّ */
    public final float m6825(int i) {
        C2276 c2276 = this.f12696;
        c2276.m4337(i);
        ArrayList arrayList = c2276.f7562;
        C0158 c0158 = (C0158) arrayList.get(C3133.m5810(i, arrayList));
        C4303 c4303 = c0158.f601;
        int i2 = i - c0158.f602;
        C0739 c0739 = c4303.f14237;
        return c0739.f2683.getLineLeft(i2) + (i2 == c0739.f2693 + (-1) ? c0739.f2690 : 0.0f);
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final C2793 m6826(int i) {
        float fM1633;
        float fM1634;
        float fM1635;
        float fM1636;
        C2276 c2276 = this.f12696;
        c2276.m4338(i);
        ArrayList arrayList = c2276.f7562;
        C0158 c0158 = (C0158) arrayList.get(C3133.m5811(i, arrayList));
        C4303 c4303 = c0158.f601;
        int iM342 = c0158.m342(i);
        CharSequence charSequence = c4303.f14233;
        if (iM342 < 0 || iM342 >= charSequence.length()) {
            StringBuilder sbM8680 = AbstractC5078.m8680(iM342, "offset(", ") is out of bounds [0,");
            sbM8680.append(charSequence.length());
            sbM8680.append(')');
            AbstractC3767.m6644(sbM8680.toString());
        }
        C0739 c0739 = c4303.f14237;
        int iM1636 = c0739.m1636(iM342);
        float fM1630 = c0739.m1630(iM1636);
        float fM1627 = c0739.m1627(iM1636);
        Layout layout = c0739.f2683;
        boolean z = layout.getParagraphDirection(iM1636) == 1;
        boolean zIsRtlCharAt = layout.isRtlCharAt(iM342);
        if (!z || zIsRtlCharAt) {
            if (z && zIsRtlCharAt) {
                fM1635 = c0739.m1633(iM342, false);
                fM1636 = c0739.m1633(iM342 + 1, true);
            } else if (zIsRtlCharAt) {
                fM1635 = c0739.m1634(iM342, false);
                fM1636 = c0739.m1634(iM342 + 1, true);
            } else {
                fM1633 = c0739.m1633(iM342, false);
                fM1634 = c0739.m1633(iM342 + 1, true);
            }
            float f = fM1635;
            fM1633 = fM1636;
            fM1634 = f;
        } else {
            fM1633 = c0739.m1634(iM342, false);
            fM1634 = c0739.m1634(iM342 + 1, true);
        }
        RectF rectF = new RectF(fM1633, fM1630, fM1634, fM1627);
        return c0158.m341(new C2793(rectF.left, rectF.top, rectF.right, rectF.bottom));
    }

    /* JADX INFO: renamed from: ۥۜ */
    public final int m6827(int i) {
        C2276 c2276 = this.f12696;
        c2276.m4337(i);
        ArrayList arrayList = c2276.f7562;
        C0158 c0158 = (C0158) arrayList.get(C3133.m5810(i, arrayList));
        C4303 c4303 = c0158.f601;
        return c4303.f14237.f2683.getLineStart(i - c0158.f602) + c0158.f600;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final int m6828(int i) {
        C2276 c2276 = this.f12696;
        c2276.m4336(i);
        int length = ((C1249) c2276.f7563.f4871).f4307.length();
        ArrayList arrayList = c2276.f7562;
        C0158 c0158 = (C0158) arrayList.get(i == length ? AbstractC2164.m4181(arrayList) : C3133.m5811(i, arrayList));
        return c0158.f601.f14237.f2683.isRtlCharAt(c0158.m342(i)) ? 2 : 1;
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final boolean m6829() {
        long j = this.f12693;
        float f = (int) (j >> 32);
        C2276 c2276 = this.f12696;
        return f < c2276.f7564 || c2276.f7558 || ((float) ((int) (j & 4294967295L))) < c2276.f7559;
    }

    /* JADX INFO: renamed from: ۦِ */
    public final C0935 m6830(int i, int i2) {
        C2276 c2276 = this.f12696;
        C1249 c1249 = (C1249) c2276.f7563.f4871;
        if (i < 0 || i > i2 || i2 > c1249.f4307.length()) {
            AbstractC3767.m6644("Start(" + i + ") or End(" + i2 + ") is out of range [0.." + c1249.f4307.length() + "), or start > end!");
        }
        if (i == i2) {
            return AbstractC0317.m669();
        }
        C0935 c0935M669 = AbstractC0317.m669();
        C3133.m5785(c2276.f7562, AbstractC2765.m5145(i, i2), new C2514(c0935M669, i, i2, 3));
        return c0935M669;
    }

    /* JADX INFO: renamed from: ۦٛ */
    public final int m6831(int i) {
        C2276 c2276 = this.f12696;
        c2276.m4336(i);
        int length = ((C1249) c2276.f7563.f4871).f4307.length();
        ArrayList arrayList = c2276.f7562;
        C0158 c0158 = (C0158) arrayList.get(i == length ? AbstractC2164.m4181(arrayList) : C3133.m5811(i, arrayList));
        C4303 c4303 = c0158.f601;
        int iM342 = c0158.m342(i);
        C0739 c0739 = c4303.f14237;
        return c0739.f2683.getParagraphDirection(c0739.m1636(iM342)) == 1 ? 1 : 2;
    }

    /* JADX INFO: renamed from: ۦۗ */
    public final long m6832(int i) {
        int iM1737;
        int iM1739;
        int iM17310;
        C2276 c2276 = this.f12696;
        c2276.m4336(i);
        int length = ((C1249) c2276.f7563.f4871).f4307.length();
        ArrayList arrayList = c2276.f7562;
        C0158 c0158 = (C0158) arrayList.get(i == length ? AbstractC2164.m4181(arrayList) : C3133.m5811(i, arrayList));
        C4303 c4303 = c0158.f601;
        int iM342 = c0158.m342(i);
        C0835 c0835M1635 = c4303.f14237.m1635();
        if (c0835M1635.m1740(c0835M1635.m1737(iM342))) {
            c0835M1635.m1733(iM342);
            iM1737 = iM342;
            while (iM1737 != -1 && (!c0835M1635.m1740(iM1737) || c0835M1635.m1731(iM1737))) {
                iM1737 = c0835M1635.m1737(iM1737);
            }
        } else {
            c0835M1635.m1733(iM342);
            if (c0835M1635.m1734(iM342)) {
                iM1737 = (!c0835M1635.m1732(iM342) || c0835M1635.m1736(iM342)) ? c0835M1635.m1737(iM342) : iM342;
            } else {
                iM1737 = c0835M1635.m1736(iM342) ? c0835M1635.m1737(iM342) : -1;
            }
        }
        if (iM1737 == -1) {
            iM1737 = iM342;
        }
        if (c0835M1635.m1731(c0835M1635.m1739(iM342))) {
            c0835M1635.m1733(iM342);
            iM1739 = iM342;
            while (iM1739 != -1 && (c0835M1635.m1740(iM1739) || !c0835M1635.m1731(iM1739))) {
                iM1739 = c0835M1635.m1739(iM1739);
            }
        } else {
            c0835M1635.m1733(iM342);
            if (c0835M1635.m1736(iM342)) {
                if (!c0835M1635.m1732(iM342) || c0835M1635.m1734(iM342)) {
                    iM17310 = c0835M1635.m1739(iM342);
                    iM1739 = iM17310;
                } else {
                    iM1739 = iM342;
                }
            } else if (c0835M1635.m1734(iM342)) {
                iM17310 = c0835M1635.m1739(iM342);
                iM1739 = iM17310;
            } else {
                iM1739 = -1;
            }
        }
        if (iM1739 != -1) {
            iM342 = iM1739;
        }
        return c0158.m340(AbstractC2765.m5145(iM1737, iM342), false);
    }

    /* JADX INFO: renamed from: ۦۙ */
    public final float m6833(int i) {
        C2276 c2276 = this.f12696;
        c2276.m4337(i);
        ArrayList arrayList = c2276.f7562;
        C0158 c0158 = (C0158) arrayList.get(C3133.m5810(i, arrayList));
        C4303 c4303 = c0158.f601;
        int i2 = i - c0158.f602;
        C0739 c0739 = c4303.f14237;
        return c0739.f2683.getLineRight(i2) + (i2 == c0739.f2693 + (-1) ? c0739.f2692 : 0.0f);
    }
}
