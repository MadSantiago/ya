package p000;

import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.os.Trace;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* JADX INFO: renamed from: ۥؙْؕۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0739 {

    /* JADX INFO: renamed from: ۥؗ */
    public final boolean f2681;

    /* JADX INFO: renamed from: ۥُ */
    public C0835 f2682;

    /* JADX INFO: renamed from: ۥّ */
    public final Layout f2683;

    /* JADX INFO: renamed from: ۥۗ */
    public final TextUtils.TruncateAt f2684;

    /* JADX INFO: renamed from: ۥۜ */
    public final int f2685;

    /* JADX INFO: renamed from: ۥۣ */
    public final TextPaint f2686;

    /* JADX INFO: renamed from: ۦؑ */
    public final boolean f2687;

    /* JADX INFO: renamed from: ۦؚ */
    public final Paint.FontMetricsInt f2688;

    /* JADX INFO: renamed from: ۦٌ */
    public final int f2689;

    /* JADX INFO: renamed from: ۦِ */
    public final float f2690;

    /* JADX INFO: renamed from: ۦٛ */
    public final int f2691;

    /* JADX INFO: renamed from: ۦۗ */
    public final float f2692;

    /* JADX INFO: renamed from: ۦۙ */
    public final int f2693;

    /* JADX INFO: renamed from: ۦۚ */
    public final C0436[] f2694;

    /* JADX INFO: renamed from: ۦ۟ */
    public C1414 f2695;

    /* JADX INFO: renamed from: ۦۨ */
    public final Rect f2696 = new Rect();

    /* JADX WARN: Code duplicated, block: B:122:0x0212  */
    /* JADX WARN: Code duplicated, block: B:123:0x0214  */
    /* JADX WARN: Code duplicated, block: B:125:0x0219  */
    /* JADX WARN: Code duplicated, block: B:126:0x021b  */
    /* JADX WARN: Code duplicated, block: B:73:0x0159  */
    /* JADX WARN: Code duplicated, block: B:85:0x0170  */
    /* JADX WARN: Code duplicated, block: B:95:0x0199 A[PHI: r14
  0x0199: PHI (r14v7 int) = (r14v6 int), (r14v9 int) binds: [B:100:0x01ab, B:93:0x0192] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v19 */
    /* JADX WARN: Type inference failed for: r26v1, types: [boolean] */
    public C0739(CharSequence charSequence, float f, TextPaint textPaint, int i, TextUtils.TruncateAt truncateAt, int i2, boolean z, int i3, int i4, int i5, int i6, int i7, int i8, C5732 c5732) {
        int i9;
        TextDirectionHeuristic textDirectionHeuristic;
        Layout layoutM1091;
        boolean z2;
        int i10;
        C0436[] c0436Arr;
        int i11;
        int i12;
        int i13;
        long jM7427;
        int i14;
        long j;
        char c;
        int i15;
        long jM7428;
        int i16;
        int i17;
        long jM7429;
        ?? r13;
        boolean zIsFallbackLineSpacingEnabled;
        int topPadding;
        boolean zIsFallbackLineSpacingEnabled2;
        int i18;
        Paint.FontMetricsInt fontMetricsInt;
        boolean z3;
        ?? r15;
        int i19;
        this.f2686 = textPaint;
        this.f2684 = truncateAt;
        this.f2681 = z;
        int length = charSequence.length();
        TextDirectionHeuristic textDirectionHeuristicM7426 = AbstractC4204.m7426(i2);
        Layout.Alignment alignment = AbstractC3400.f11318;
        Layout.Alignment alignment2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? Layout.Alignment.ALIGN_NORMAL : AbstractC3400.f11317 : AbstractC3400.f11318 : Layout.Alignment.ALIGN_CENTER : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        boolean z4 = (charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(-1, length, C1474.class) < length;
        Trace.beginSection("TextLayout:initLayout");
        try {
            BoringLayout.Metrics metricsM9539 = c5732.m9539();
            double d = f;
            int iCeil = (int) Math.ceil(d);
            if (metricsM9539 == null || c5732.m9537() > f || z4) {
                i9 = i3;
                textDirectionHeuristic = textDirectionHeuristicM7426;
                layoutM1091 = AbstractC0487.m1091(charSequence, textPaint, iCeil, charSequence.length(), textDirectionHeuristic, alignment2, i9, truncateAt, (int) Math.ceil(d), i8, z, i4, i5, i6, i7);
                z2 = false;
            } else {
                if (iCeil < 0) {
                    AbstractC3767.m6644("negative width");
                }
                if (iCeil < 0) {
                    AbstractC3767.m6644("negative ellipsized width");
                }
                layoutM1091 = Build.VERSION.SDK_INT >= 33 ? AbstractC5885.m9695(charSequence, textPaint, iCeil, alignment2, metricsM9539, z, truncateAt, iCeil) : new BoringLayout(charSequence, textPaint, iCeil, alignment2, 1.0f, 0.0f, metricsM9539, z, truncateAt, iCeil);
                i9 = i3;
                textDirectionHeuristic = textDirectionHeuristicM7426;
                z2 = true;
            }
            this.f2683 = layoutM1091;
            Trace.endSection();
            int iMin = Math.min(layoutM1091.getLineCount(), i9);
            this.f2693 = iMin;
            int i20 = iMin - 1;
            this.f2687 = iMin >= i9 && (layoutM1091.getEllipsisCount(i20) > 0 || layoutM1091.getLineEnd(i20) != charSequence.length());
            if ((layoutM1091.getText() instanceof Spanned) && (AbstractC1631.m3407((Spanned) layoutM1091.getText(), C0436.class) || layoutM1091.getText().length() <= 0)) {
                i10 = 0;
                c0436Arr = (C0436[]) ((Spanned) layoutM1091.getText()).getSpans(0, layoutM1091.getText().length(), C0436.class);
            } else {
                c0436Arr = null;
                i10 = 0;
            }
            this.f2694 = c0436Arr;
            if (c0436Arr == null) {
                i11 = 2;
                i12 = i10;
            } else {
                C0436 c0436 = c0436Arr.length == 0 ? null : c0436Arr[i10];
                if (c0436 != null) {
                    if (c0436.f1599) {
                        i11 = 2;
                        i19 = c0436.f1601 == 2 ? 1 : i19;
                        i12 = i19;
                    } else {
                        i11 = 2;
                    }
                    i19 = i10;
                    i12 = i19;
                } else {
                    i11 = 2;
                    i12 = i10;
                }
            }
            if (c0436Arr == null) {
                i13 = i10;
            } else {
                C0436 c0437 = c0436Arr.length == 0 ? null : c0436Arr[i10];
                if (c0437 != null && c0437.f1600 && c0437.f1601 == i11) {
                    i13 = 1;
                } else {
                    i13 = i10;
                }
            }
            if (i12 == 0 || i13 == 0) {
                jM7427 = AbstractC4204.f13962;
                if (z) {
                    i14 = 33;
                } else {
                    if (z2) {
                        BoringLayout boringLayout = (BoringLayout) layoutM1091;
                        i14 = 33;
                        if (Build.VERSION.SDK_INT >= 33) {
                            zIsFallbackLineSpacingEnabled2 = boringLayout.isFallbackLineSpacingEnabled();
                        } else {
                            r13 = i10;
                        }
                    } else {
                        i14 = 33;
                        StaticLayout staticLayout = (StaticLayout) layoutM1091;
                        int i21 = Build.VERSION.SDK_INT;
                        if (i21 >= 33) {
                            zIsFallbackLineSpacingEnabled = staticLayout.isFallbackLineSpacingEnabled();
                        } else if (i21 >= 28) {
                            r13 = 1;
                        } else {
                            r13 = i10;
                        }
                    }
                    if (r13 == 0) {
                        r13 = zIsFallbackLineSpacingEnabled;
                        TextPaint paint = layoutM1091.getPaint();
                        CharSequence text = layoutM1091.getText();
                        c = ' ';
                        Rect rectM8607 = C5063.m8607(paint, text, layoutM1091.getLineStart(i10), layoutM1091.getLineEnd(i10));
                        int lineAscent = layoutM1091.getLineAscent(i10);
                        j = 4294967295L;
                        int i22 = rectM8607.top;
                        if (i22 < lineAscent) {
                            r13 = zIsFallbackLineSpacingEnabled2;
                            topPadding = lineAscent - i22;
                        } else {
                            r13 = zIsFallbackLineSpacingEnabled2;
                            topPadding = layoutM1091.getTopPadding();
                        }
                        i15 = 1;
                        rectM8607 = iMin != 1 ? C5063.m8607(paint, text, layoutM1091.getLineStart(i20), layoutM1091.getLineEnd(i20)) : rectM8607;
                        int lineDescent = layoutM1091.getLineDescent(i20);
                        int i23 = rectM8607.bottom;
                        int bottomPadding = i23 > lineDescent ? i23 - lineDescent : layoutM1091.getBottomPadding();
                        jM7428 = (topPadding == 0 && bottomPadding == 0) ? jM7428 : AbstractC4204.m7427(topPadding, bottomPadding);
                        if (i12 != 0) {
                            i16 = i10;
                        } else {
                            i16 = (int) (jM7428 >> c);
                        }
                        if (i13 != 0) {
                            i17 = i10;
                        } else {
                            i17 = (int) (jM7428 & j);
                        }
                        jM7429 = AbstractC4204.m7427(i16, i17);
                    }
                    jM7428 = jM7427;
                    if (i12 != 0) {
                        i16 = i10;
                    } else {
                        i16 = (int) (jM7428 >> c);
                    }
                    if (i13 != 0) {
                        i17 = i10;
                    } else {
                        i17 = (int) (jM7428 & j);
                    }
                    jM7429 = AbstractC4204.m7427(i16, i17);
                }
                r13 = zIsFallbackLineSpacingEnabled;
                r13 = zIsFallbackLineSpacingEnabled2;
                c = ' ';
                j = 4294967295L;
                i15 = 1;
                jM7428 = jM7427;
                if (i12 != 0) {
                    i16 = i10;
                } else {
                    i16 = (int) (jM7428 >> c);
                }
                if (i13 != 0) {
                    i17 = i10;
                } else {
                    i17 = (int) (jM7428 & j);
                }
                jM7429 = AbstractC4204.m7427(i16, i17);
            } else {
                jM7429 = AbstractC4204.f13962;
                jM7427 = jM7429;
                c = ' ';
                j = 4294967295L;
                i15 = 1;
                i14 = 33;
            }
            if (c0436Arr != null) {
                int length2 = c0436Arr.length;
                int iMax = i10;
                int iMax2 = iMax;
                for (int i24 = iMax2; i24 < length2; i24++) {
                    C0436 c0438 = c0436Arr[i24];
                    int i25 = c0438.f1602;
                    iMax = i25 < 0 ? Math.max(iMax, Math.abs(i25)) : iMax;
                    int i26 = c0438.f1597;
                    if (i26 < 0) {
                        iMax2 = Math.max(iMax, Math.abs(i26));
                    }
                }
                jM7427 = (iMax == 0 && iMax2 == 0) ? AbstractC4204.f13962 : AbstractC4204.m7427(iMax, iMax2);
            }
            this.f2685 = Math.max((int) (jM7429 >> c), (int) (jM7427 >> c));
            this.f2691 = Math.max((int) (jM7429 & j), (int) (jM7427 & j));
            TextPaint textPaint2 = this.f2686;
            C0436[] c0436Arr2 = this.f2694;
            int i27 = this.f2693 - i15;
            Layout layout = this.f2683;
            if (layout.getLineStart(i27) != layout.getLineEnd(i27) || c0436Arr2 == null || c0436Arr2.length == 0) {
                i18 = i10;
                fontMetricsInt = null;
            } else {
                SpannableString spannableString = new SpannableString("\u200b");
                C0436 c0439 = (C0436) AbstractC0246.m517(c0436Arr2);
                int length3 = spannableString.length();
                if (i27 == 0 || !(z3 = c0439.f1600)) {
                    boolean z5 = c0439.f1600;
                    z3 = z5 ? 1 : 0;
                    r15 = z5;
                } else {
                    r15 = i10;
                }
                spannableString.setSpan(new C0436(c0439.f1608, length3, r15, z3, c0439.f1598, c0439.f1601), i10, spannableString.length(), i14);
                i18 = i10;
                StaticLayout staticLayoutM1091 = AbstractC0487.m1091(spannableString, textPaint2, Integer.MAX_VALUE, spannableString.length(), textDirectionHeuristic, AbstractC1858.f6197, Integer.MAX_VALUE, null, Integer.MAX_VALUE, 0, this.f2681, 0, 0, 0, 0);
                fontMetricsInt = new Paint.FontMetricsInt();
                fontMetricsInt.ascent = staticLayoutM1091.getLineAscent(i18);
                fontMetricsInt.descent = staticLayoutM1091.getLineDescent(i18);
                fontMetricsInt.top = staticLayoutM1091.getLineTop(i18);
                fontMetricsInt.bottom = staticLayoutM1091.getLineBottom(i18);
            }
            this.f2689 = fontMetricsInt != null ? fontMetricsInt.bottom - ((int) (m1627(i20) - m1630(i20))) : i18;
            this.f2688 = fontMetricsInt;
            Layout layout2 = this.f2683;
            this.f2690 = AbstractC0949.m1964(layout2, i20, layout2.getPaint());
            Layout layout3 = this.f2683;
            this.f2692 = AbstractC0949.m1938(layout3, i20, layout3.getPaint());
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final C1414 m1626() {
        C1414 c1414 = this.f2695;
        if (c1414 != null) {
            return c1414;
        }
        C1414 c1415 = new C1414(this.f2683);
        this.f2695 = c1415;
        return c1415;
    }

    /* JADX INFO: renamed from: ۥُ */
    public final float m1627(int i) {
        Paint.FontMetricsInt fontMetricsInt;
        int i2 = this.f2693;
        int i3 = i2 - 1;
        Layout layout = this.f2683;
        if (i != i3 || (fontMetricsInt = this.f2688) == null) {
            return this.f2685 + layout.getLineBottom(i) + (i == i2 + (-1) ? this.f2691 : 0);
        }
        return layout.getLineBottom(i - 1) + fontMetricsInt.bottom;
    }

    /* JADX INFO: renamed from: ۥّ */
    public final int m1628(int i) {
        ThreadLocal threadLocal = AbstractC4204.f13963;
        Layout layout = this.f2683;
        return (layout.getEllipsisCount(i) <= 0 || this.f2684 != TextUtils.TruncateAt.END) ? layout.getLineEnd(i) : layout.getText().length();
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final float m1629(int i) {
        if (i == this.f2693 - 1) {
            return this.f2690 + this.f2692;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۥۜ */
    public final float m1630(int i) {
        return this.f2683.getLineTop(i) + (i == 0 ? 0 : this.f2685);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final int m1631() {
        boolean z = this.f2687;
        Layout layout = this.f2683;
        return (z ? layout.getLineBottom(this.f2693 - 1) : layout.getHeight()) + this.f2685 + this.f2691 + this.f2689;
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final float m1632(int i) {
        Paint.FontMetricsInt fontMetricsInt;
        return this.f2685 + ((i != this.f2693 + (-1) || (fontMetricsInt = this.f2688) == null) ? this.f2683.getLineBaseline(i) : m1630(i) - fontMetricsInt.ascent);
    }

    /* JADX INFO: renamed from: ۦِ */
    public final float m1633(int i, boolean z) {
        return m1629(m1636(i)) + m1626().m3013(i, false, z);
    }

    /* JADX INFO: renamed from: ۦٛ */
    public final float m1634(int i, boolean z) {
        return m1629(m1636(i)) + m1626().m3013(i, true, z);
    }

    /* JADX INFO: renamed from: ۦۗ */
    public final C0835 m1635() {
        C0835 c0835 = this.f2682;
        if (c0835 != null) {
            return c0835;
        }
        Layout layout = this.f2683;
        C0835 c0836 = new C0835(layout.getText(), layout.getText().length(), this.f2686.getTextLocale());
        this.f2682 = c0836;
        return c0836;
    }

    /* JADX INFO: renamed from: ۦۙ */
    public final int m1636(int i) {
        int i2 = this.f2693;
        if (i2 <= 0) {
            return 0;
        }
        int lineForOffset = this.f2683.getLineForOffset(i);
        int i3 = i2 - 1;
        return lineForOffset > i3 ? i3 : lineForOffset;
    }
}
