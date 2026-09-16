package p000;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: ۦؚٖؕۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4303 {

    /* JADX INFO: renamed from: ۥؗ */
    public final long f14232;

    /* JADX INFO: renamed from: ۥُ */
    public final CharSequence f14233;

    /* JADX INFO: renamed from: ۥّ */
    public final List f14234;

    /* JADX INFO: renamed from: ۥۗ */
    public final int f14235;

    /* JADX INFO: renamed from: ۥۣ */
    public final C5541 f14236;

    /* JADX INFO: renamed from: ۦؑ */
    public final C0739 f14237;

    /* JADX WARN: Code duplicated, block: B:129:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:132:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:133:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:135:0x0215  */
    /* JADX WARN: Code duplicated, block: B:137:0x022d  */
    /* JADX WARN: Code duplicated, block: B:139:0x0231 A[LOOP:1: B:138:0x022f->B:139:0x0231, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:142:0x025c  */
    /* JADX WARN: Code duplicated, block: B:143:0x0260  */
    /* JADX WARN: Code duplicated, block: B:145:0x0278  */
    /* JADX WARN: Code duplicated, block: B:147:0x028e  */
    /* JADX WARN: Code duplicated, block: B:148:0x0290  */
    /* JADX WARN: Code duplicated, block: B:151:0x029b  */
    /* JADX WARN: Code duplicated, block: B:153:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:154:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:157:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:158:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:181:0x030d  */
    /* JADX WARN: Code duplicated, block: B:62:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:69:0x00de  */
    /* JADX WARN: Code duplicated, block: B:98:0x0141  */
    /* JADX WARN: Instruction removed from duplicated block: B:137:0x022d, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    public C4303(C5541 c5541, int i, int i2, long j) throws Throwable {
        int i3;
        int i4;
        TextUtils.TruncateAt truncateAt;
        Throwable th;
        TextUtils.TruncateAt truncateAt2;
        C0739 c0739M7593;
        int i5;
        C4303 c4303;
        int i6;
        Layout layout;
        Spanned spanned;
        C3544[] c3544Arr;
        Object[] objArr;
        CharSequence charSequence;
        Spanned spanned2;
        Object[] spans;
        ArrayList arrayList;
        int length;
        int i7;
        List list;
        int spanEnd;
        int iM1636;
        boolean z;
        boolean z2;
        boolean z3;
        int i8;
        int i9;
        CharSequence charSequence2 = c5541.f18301;
        this.f14236 = c5541;
        this.f14235 = i;
        this.f14232 = j;
        if (C3693.m6555(j) != 0 || C3693.m6557(j) != 0) {
            AbstractC3767.m6644("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        int i10 = 1;
        if (i < 1) {
            AbstractC3767.m6644("maxLines should be greater than 0");
        }
        C3564 c3564 = c5541.f18302;
        if (i2 == 2 && !C5023.m8440(c3564.f11803.f1988, AbstractC4489.m7788(0)) && !C5023.m8440(c3564.f11803.f1988, C5023.f16620) && (i9 = c3564.f11802.f1736) != 0 && i9 != 5 && i9 != 4 && charSequence2.length() != 0) {
            Spannable spannableString = charSequence2 instanceof Spannable ? (Spannable) charSequence2 : null;
            spannableString = spannableString == null ? new SpannableString(charSequence2) : spannableString;
            if (!AbstractC1631.m3407(spannableString, C5495.class)) {
                spannableString.setSpan(new C5495(), spannableString.length() - 1, spannableString.length() - 1, 33);
            }
            charSequence2 = spannableString;
        }
        CharSequence charSequence3 = charSequence2;
        this.f14233 = charSequence3;
        C0477 c0477 = c3564.f11802;
        C0553 c0553 = c3564.f11803;
        int i11 = c0477.f1736;
        int i12 = i11 == 1 ? (char) 3 : i11 == 2 ? (char) 4 : i11 == 3 ? (char) 2 : (i11 != 5 && i11 == 6) ? (char) 1 : (char) 0;
        int i13 = i11 == 4 ? 1 : 0;
        char c = c0477.f1735 == 2 ? Build.VERSION.SDK_INT <= 32 ? (char) 2 : (char) 4 : (char) 0;
        int i14 = c0477.f1739;
        int i15 = i14 & 255;
        if (i15 == 1) {
            i3 = 0;
        } else if (i15 == 2) {
            i3 = 1;
        } else if (i15 == 3) {
            i3 = 2;
        } else {
            i3 = 0;
        }
        int i16 = (i14 >> 8) & 255;
        if (i16 == 1) {
            i4 = 0;
        } else if (i16 == 2) {
            i4 = 1;
        } else if (i16 == 3) {
            i4 = 2;
        } else if (i16 == 4) {
            i4 = 3;
        } else {
            i4 = 0;
        }
        int i17 = (i14 >> 16) & 255;
        int i18 = (i17 != 1 && i17 == 2) ? 1 : 0;
        if (i2 != 2) {
            if (i2 == 5) {
                truncateAt2 = TextUtils.TruncateAt.MIDDLE;
            } else {
                truncateAt = i2 == 4 ? TextUtils.TruncateAt.START : null;
                th = null;
            }
            c0739M7593 = m7593(i12, i13, truncateAt, i, c, i3, i4, i18, charSequence3);
            Layout layout2 = c0739M7593.f2683;
            if (Build.VERSION.SDK_INT < 35 || c5541.f18300.getLetterSpacing() == 0.0f || (!(i2 == 4 || i2 == 5) || layout2.getEllipsisCount(0) <= 0)) {
                i5 = 2;
                c4303 = this;
                i6 = i;
            } else {
                int ellipsisStart = layout2.getEllipsisStart(0);
                int ellipsisCount = layout2.getEllipsisCount(0) + ellipsisStart;
                CharSequence charSequenceSubSequence = charSequence3.subSequence(0, ellipsisStart);
                CharSequence charSequenceSubSequence2 = charSequence3.subSequence(ellipsisCount, charSequence3.length());
                CharSequence[] charSequenceArr = new CharSequence[3];
                charSequenceArr[0] = charSequenceSubSequence;
                charSequenceArr[i10] = "…";
                i5 = 2;
                charSequenceArr[2] = charSequenceSubSequence2;
                c4303 = this;
                i6 = i;
                c0739M7593 = c4303.m7593(i12, i13, truncateAt, i6, c, i3, i4, i18, TextUtils.concat(charSequenceArr));
            }
            int i19 = c0739M7593.f2693;
            if (i2 == i5 || c0739M7593.m1631() <= C3693.m6551(j) || i6 <= i10) {
                c4303.f14237 = c0739M7593;
            } else {
                int iM6551 = C3693.m6551(j);
                for (int i20 = 0; i20 < i19; i20++) {
                    if (c0739M7593.m1627(i20) > iM6551) {
                        i19 = i20;
                        break;
                    }
                }
                if (i19 >= 0 && i19 != c4303.f14235) {
                    c0739M7593 = c4303.m7593(i12, i13, truncateAt, i19 < 1 ? 1 : i19, c, i3, i4, i18, c4303.f14233);
                }
                c4303.f14237 = c0739M7593;
            }
            C0553 c0554 = c0553;
            c4303.f14236.f18300.m3934(c0554.f1989.mo3547(), (((long) Float.floatToRawIntBits(c4303.m7592())) & 4294967295L) | (((long) Float.floatToRawIntBits(c4303.m7594())) << 32), c0554.f1989.mo3549());
            layout = c0739M7593.f2683;
            if (layout.getText() instanceof Spanned) {
                spanned = (Spanned) layout.getText();
                if (spanned.nextSpanTransition(-1, spanned.length(), C3544.class) != spanned.length()) {
                    c3544Arr = (C3544[]) ((Spanned) layout.getText()).getSpans(0, layout.getText().length(), C3544.class);
                } else {
                    objArr = th;
                }
            } else {
                objArr = th;
            }
            if (objArr != 0) {
                objArr = c3544Arr;
                for (C3544 c3544 : objArr) {
                    c3544.f11772.setValue(new C3291((((long) Float.floatToRawIntBits(c4303.m7592())) & 4294967295L) | (((long) Float.floatToRawIntBits(c4303.m7594())) << 32)));
                }
            }
            objArr = c3544Arr;
            charSequence = c4303.f14233;
            if (charSequence instanceof Spanned) {
                spanned2 = (Spanned) charSequence;
                spans = spanned2.getSpans(0, charSequence.length(), C5889.class);
                arrayList = new ArrayList(spans.length);
                length = spans.length;
                i7 = 0;
                while (i7 < length) {
                    C5889 c5889 = (C5889) spans[i7];
                    int spanStart = spanned2.getSpanStart(c5889);
                    spanEnd = spanned2.getSpanEnd(c5889);
                    iM1636 = c4303.f14237.m1636(spanStart);
                    if (iM1636 >= c4303.f14235) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (c4303.f14237.f2683.getEllipsisCount(iM1636) > 0) {
                        z2 = false;
                    } else if (spanEnd > c4303.f14237.f2683.getEllipsisStart(iM1636) + c4303.f14237.f2683.getLineStart(iM1636)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (spanEnd > c4303.f14237.m1628(iM1636)) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z2 && !z3) {
                        if (!z) {
                            boolean z4 = c4303.f14237.f2683.getParagraphDirection(iM1636) == 1;
                            boolean zIsRtlCharAt = c4303.f14237.f2683.isRtlCharAt(spanStart);
                            if (z4 && !zIsRtlCharAt) {
                                c4303.f14237.m1634(spanStart, false);
                                c5889.m9721();
                                throw th;
                            }
                            if (z4 && zIsRtlCharAt) {
                                c4303.f14237.m1633(spanStart, false);
                                c5889.m9721();
                                throw th;
                            }
                            C0739 c0739 = c4303.f14237;
                            if (zIsRtlCharAt) {
                                c0739.m1634(spanStart, false);
                                c5889.m9721();
                                throw th;
                            }
                            c0739.m1633(spanStart, false);
                            c5889.m9721();
                            throw th;
                        }
                    }
                    arrayList.add(th);
                    i7++;
                    th = th;
                }
                list = arrayList;
            } else {
                list = C2340.f7777;
            }
            c4303.f14234 = list;
        }
        truncateAt2 = TextUtils.TruncateAt.END;
        c0553 = c0553;
        truncateAt = truncateAt2;
        i10 = 1;
        i3 = i3;
        th = null;
        c0739M7593 = m7593(i12, i13, truncateAt, i, c, i3, i4, i18, charSequence3);
        Layout layout3 = c0739M7593.f2683;
        if (Build.VERSION.SDK_INT < 35) {
            i5 = 2;
            c4303 = this;
            i6 = i;
        } else {
            i5 = 2;
            c4303 = this;
            i6 = i;
        }
        int i110 = c0739M7593.f2693;
        if (i2 == i5) {
            c4303.f14237 = c0739M7593;
        } else {
            c4303.f14237 = c0739M7593;
        }
        C0553 c0555 = c0553;
        c4303.f14236.f18300.m3934(c0555.f1989.mo3547(), (((long) Float.floatToRawIntBits(c4303.m7592())) & 4294967295L) | (((long) Float.floatToRawIntBits(c4303.m7594())) << 32), c0555.f1989.mo3549());
        layout = c0739M7593.f2683;
        if (layout.getText() instanceof Spanned) {
            objArr = th;
        } else {
            spanned = (Spanned) layout.getText();
            if (spanned.nextSpanTransition(-1, spanned.length(), C3544.class) != spanned.length()) {
                c3544Arr = (C3544[]) ((Spanned) layout.getText()).getSpans(0, layout.getText().length(), C3544.class);
            } else {
                objArr = th;
            }
        }
        if (objArr != 0) {
            objArr = c3544Arr;
            while (i8 < r1) {
                c3544.f11772.setValue(new C3291((((long) Float.floatToRawIntBits(c4303.m7592())) & 4294967295L) | (((long) Float.floatToRawIntBits(c4303.m7594())) << 32)));
            }
        }
        objArr = c3544Arr;
        charSequence = c4303.f14233;
        if (charSequence instanceof Spanned) {
            list = C2340.f7777;
        } else {
            spanned2 = (Spanned) charSequence;
            spans = spanned2.getSpans(0, charSequence.length(), C5889.class);
            arrayList = new ArrayList(spans.length);
            length = spans.length;
            i7 = 0;
            while (i7 < length) {
                C5889 c58810 = (C5889) spans[i7];
                int spanStart2 = spanned2.getSpanStart(c58810);
                spanEnd = spanned2.getSpanEnd(c58810);
                iM1636 = c4303.f14237.m1636(spanStart2);
                if (iM1636 >= c4303.f14235) {
                    z = true;
                } else {
                    z = false;
                }
                if (c4303.f14237.f2683.getEllipsisCount(iM1636) > 0) {
                    z2 = false;
                } else if (spanEnd > c4303.f14237.f2683.getEllipsisStart(iM1636) + c4303.f14237.f2683.getLineStart(iM1636)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (spanEnd > c4303.f14237.m1628(iM1636)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z2) {
                }
                arrayList.add(th);
                i7++;
                th = th;
            }
            list = arrayList;
        }
        c4303.f14234 = list;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00a6  */
    /* JADX INFO: renamed from: ۥؗ */
    public final long m7589(C2793 c2793, int i, C0178 c0178) {
        InterfaceC3596 c1999;
        int i2;
        int[] iArrM171;
        RectF rectFM7456 = AbstractC4225.m7456(c2793);
        int i3 = 0;
        int i4 = (i != 0 && i == 1) ? 1 : 0;
        C4164 c4164 = new C4164(i3, c0178);
        C0739 c0739 = this.f14237;
        Layout layout = c0739.f2683;
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 34) {
            iArrM171 = AbstractC0002.m171(c0739, rectFM7456, i4, c4164);
        } else {
            C1414 c1414M1626 = c0739.m1626();
            if (i4 == 1) {
                c1999 = new C2346(17, layout.getText(), c0739.m1635());
            } else {
                CharSequence text = layout.getText();
                c1999 = i5 >= 29 ? new C1999(text, c0739.f2686) : new C1370(text);
            }
            InterfaceC3596 interfaceC3596 = c1999;
            int lineForVertical = layout.getLineForVertical((int) rectFM7456.top);
            if (rectFM7456.top <= c0739.m1627(lineForVertical) || (lineForVertical = lineForVertical + 1) < c0739.f2693) {
                int i6 = lineForVertical;
                int lineForVertical2 = layout.getLineForVertical((int) rectFM7456.bottom);
                if (lineForVertical2 != 0 || rectFM7456.bottom >= c0739.m1630(0)) {
                    int iM8636 = C5063.m8636(c0739, layout, c1414M1626, i6, rectFM7456, interfaceC3596, c4164, true);
                    while (true) {
                        i2 = i6;
                        if (iM8636 != -1 || i2 >= lineForVertical2) {
                            break;
                        }
                        i6 = i2 + 1;
                        iM8636 = C5063.m8636(c0739, layout, c1414M1626, i6, rectFM7456, interfaceC3596, c4164, true);
                    }
                    if (iM8636 == -1) {
                        iArrM171 = null;
                    } else {
                        int i7 = lineForVertical2;
                        int iM8637 = C5063.m8636(c0739, layout, c1414M1626, i7, rectFM7456, interfaceC3596, c4164, false);
                        while (iM8637 == -1 && i2 < i7) {
                            i7--;
                            iM8637 = C5063.m8636(c0739, layout, c1414M1626, i7, rectFM7456, interfaceC3596, c4164, false);
                        }
                        if (iM8637 == -1) {
                            iArrM171 = null;
                        } else {
                            iArrM171 = new int[]{interfaceC3596.mo4414(iM8636 + 1), interfaceC3596.mo4411(iM8637 - 1)};
                        }
                    }
                } else {
                    iArrM171 = null;
                }
            } else {
                iArrM171 = null;
            }
        }
        return iArrM171 == null ? C3346.f11196 : AbstractC2765.m5145(iArrM171[0], iArrM171[1]);
    }

    /* JADX INFO: renamed from: ۥُ */
    public final void m7590(InterfaceC3212 interfaceC3212) {
        Canvas canvas = AbstractC5664.f18633;
        Canvas canvas2 = ((C0979) interfaceC3212).f3447;
        C0739 c0739 = this.f14237;
        if (c0739.f2687) {
            canvas2.save();
            canvas2.clipRect(0.0f, 0.0f, m7594(), m7592());
        }
        int i = c0739.f2685;
        if (canvas2.getClipBounds(c0739.f2696)) {
            if (i != 0) {
                canvas2.translate(0.0f, i);
            }
            ThreadLocal threadLocal = AbstractC4204.f13963;
            Object c3909 = threadLocal.get();
            if (c3909 == null) {
                c3909 = new C3909();
                threadLocal.set(c3909);
            }
            C3909 c39010 = (C3909) c3909;
            c39010.f13040 = canvas2;
            try {
                c0739.f2683.draw(c39010);
                c39010.f13040 = null;
                if (i != 0) {
                    canvas2.translate(0.0f, (-1.0f) * i);
                }
            } catch (Throwable th) {
                c39010.f13040 = null;
                throw th;
            }
        }
        if (c0739.f2687) {
            canvas2.restore();
        }
    }

    /* JADX INFO: renamed from: ۥّ */
    public final void m7591(InterfaceC3212 interfaceC3212, long j, C5906 c5906, C1690 c1690, AbstractC0213 abstractC0213) {
        C2017 c2017 = this.f14236.f18300;
        int i = c2017.f6645;
        c2017.m3939(j);
        c2017.m3936(c5906);
        c2017.m3940(c1690);
        c2017.m3935(abstractC0213);
        c2017.m3937(3);
        m7590(interfaceC3212);
        c2017.m3937(i);
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final float m7592() {
        return this.f14237.m1631();
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final C0739 m7593(int i, int i2, TextUtils.TruncateAt truncateAt, int i3, int i4, int i5, int i6, int i7, CharSequence charSequence) {
        C0823 c0823;
        float fM7594 = m7594();
        C5541 c5541 = this.f14236;
        C2017 c2017 = c5541.f18300;
        int i8 = c5541.f18297;
        C5732 c5732 = c5541.f18298;
        C3564 c3564 = c5541.f18302;
        C5393 c5393 = AbstractC4477.f14783;
        C0507 c0507 = c3564.f11801;
        return new C0739(charSequence, fM7594, c2017, i, truncateAt, i8, (c0507 == null || (c0823 = c0507.f1827) == null) ? false : c0823.f2920, i3, i5, i6, i7, i4, i2, c5732);
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final float m7594() {
        return C3693.m6556(this.f14232);
    }

    /* JADX INFO: renamed from: ۦۙ */
    public final void m7595(InterfaceC3212 interfaceC3212, AbstractC0548 abstractC0548, float f, C5906 c5906, C1690 c1690, AbstractC0213 abstractC0213) {
        C2017 c2017 = this.f14236.f18300;
        int i = c2017.f6645;
        float fM7594 = m7594();
        c2017.m3934(abstractC0548, (((long) Float.floatToRawIntBits(m7592())) & 4294967295L) | (Float.floatToRawIntBits(fM7594) << 32), f);
        c2017.m3936(c5906);
        c2017.m3940(c1690);
        c2017.m3935(abstractC0213);
        c2017.m3937(3);
        m7590(interfaceC3212);
        c2017.m3937(i);
    }
}
