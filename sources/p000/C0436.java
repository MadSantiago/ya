package p000;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* JADX INFO: renamed from: ۥًؕؑۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0436 implements LineHeightSpan {

    /* JADX INFO: renamed from: ۥؖ */
    public int f1597;

    /* JADX INFO: renamed from: ۥَ */
    public final float f1598;

    /* JADX INFO: renamed from: ۥْ */
    public final boolean f1599;

    /* JADX INFO: renamed from: ۥٓ */
    public final boolean f1600;

    /* JADX INFO: renamed from: ۥٖ */
    public final int f1601;

    /* JADX INFO: renamed from: ۥٙ */
    public int f1602;

    /* JADX INFO: renamed from: ۦ۟ */
    public final int f1607;

    /* JADX INFO: renamed from: ۦۨ */
    public final float f1608;

    /* JADX INFO: renamed from: ۦٗ */
    public int f1605 = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: ۦۛ */
    public int f1606 = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: ۥۖ */
    public int f1603 = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: ۦٕ */
    public int f1604 = Integer.MIN_VALUE;

    public C0436(float f, int i, boolean z, boolean z2, float f2, int i2) {
        this.f1608 = f;
        this.f1607 = i;
        this.f1599 = z;
        this.f1600 = z2;
        this.f1598 = f2;
        this.f1601 = i2;
        if ((0.0f > f2 || f2 > 1.0f) && f2 != -1.0f) {
            AbstractC3767.m6643("topRatio should be in [0..1] range or -1");
        }
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        double dCeil;
        int i5 = fontMetricsInt.descent;
        int i6 = fontMetricsInt.ascent;
        if (i5 - i6 <= 0) {
            return;
        }
        boolean z = i == 0;
        boolean z2 = i2 == this.f1607;
        int i7 = this.f1601;
        boolean z3 = this.f1600;
        boolean z4 = this.f1599;
        if (z && z2 && z4 && z3 && i7 != 2) {
            return;
        }
        if (this.f1605 == Integer.MIN_VALUE) {
            int i8 = i5 - i6;
            int iCeil = (int) Math.ceil(this.f1608);
            int i9 = iCeil - i8;
            if (i7 != 1 || i9 > 0) {
                float fAbs = this.f1598;
                if (fAbs == -1.0f) {
                    fAbs = Math.abs(fontMetricsInt.ascent) / (fontMetricsInt.descent - fontMetricsInt.ascent);
                }
                if (i9 <= 0) {
                    dCeil = Math.ceil(i9 * fAbs);
                } else {
                    dCeil = Math.ceil((1.0f - fAbs) * i9);
                }
                int i10 = (int) dCeil;
                int i11 = fontMetricsInt.descent;
                int i12 = i10 + i11;
                this.f1603 = i12;
                int i13 = i12 - iCeil;
                this.f1606 = i13;
                if (i7 == 0 || i9 >= 0) {
                    if (z4) {
                        i13 = fontMetricsInt.ascent;
                    }
                    this.f1605 = i13;
                    if (z3) {
                        i12 = i11;
                    }
                    this.f1604 = i12;
                    this.f1602 = fontMetricsInt.ascent - i13;
                    this.f1597 = i12 - i11;
                } else if (i7 == 2) {
                    int i14 = fontMetricsInt.ascent;
                    this.f1605 = z4 ? Math.max(i14, i13) : Math.min(i14, i13);
                    int i15 = fontMetricsInt.descent;
                    int i16 = this.f1603;
                    this.f1604 = z3 ? Math.min(i15, i16) : Math.max(i15, i16);
                    this.f1602 = 0;
                    this.f1597 = 0;
                }
            } else {
                int i17 = fontMetricsInt.ascent;
                this.f1606 = i17;
                int i18 = fontMetricsInt.descent;
                this.f1603 = i18;
                this.f1605 = i17;
                this.f1604 = i18;
                this.f1602 = 0;
                this.f1597 = 0;
            }
        }
        fontMetricsInt.ascent = z ? this.f1605 : this.f1606;
        fontMetricsInt.descent = z2 ? this.f1604 : this.f1603;
    }
}
