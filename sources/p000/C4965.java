package p000;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: ۦۗؔۤۦ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4965 extends ReplacementSpan {

    /* JADX INFO: renamed from: ۥَ */
    public final boolean f16418;

    /* JADX INFO: renamed from: ۥْ */
    public final ArrayList f16419;

    /* JADX INFO: renamed from: ۥٖ */
    public final boolean f16421;

    /* JADX INFO: renamed from: ۥٙ */
    public C2346 f16422;

    /* JADX INFO: renamed from: ۥۖ */
    public int f16423;

    /* JADX INFO: renamed from: ۦٕ */
    public int f16424;

    /* JADX INFO: renamed from: ۦ۟ */
    public final List f16427;

    /* JADX INFO: renamed from: ۦۨ */
    public final C2268 f16428;

    /* JADX INFO: renamed from: ۦٗ */
    public final Rect f16425 = new Rect();

    /* JADX INFO: renamed from: ۦۛ */
    public final Paint f16426 = new Paint(1);

    /* JADX INFO: renamed from: ۥٓ */
    public final TextPaint f16420 = new TextPaint();

    public C4965(C2268 c2268, ArrayList arrayList, boolean z, boolean z2) {
        this.f16428 = c2268;
        this.f16427 = arrayList;
        this.f16419 = new ArrayList(arrayList.size());
        this.f16418 = z;
        this.f16421 = z2;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        int i6;
        boolean z;
        C2346 c2346;
        Paint.Style style = Paint.Style.FILL;
        C2268 c2268 = this.f16428;
        int i7 = c2268.f7527;
        int iM7050 = AbstractC3925.m7050(canvas, charSequence);
        int i8 = this.f16423;
        boolean z2 = this.f16418;
        ArrayList arrayList = this.f16419;
        if (i8 != iM7050) {
            this.f16423 = iM7050;
            boolean z3 = paint instanceof TextPaint;
            TextPaint textPaint = this.f16420;
            if (z3) {
                textPaint.set((TextPaint) paint);
            } else {
                textPaint.set(paint);
            }
            textPaint.setFakeBoldText(z2);
            List list = this.f16427;
            int size = ((int) (((this.f16423 * 1.0f) / list.size()) + 0.5f)) - (i7 * 2);
            arrayList.clear();
            int size2 = list.size();
            int i9 = 0;
            while (i9 < size2) {
                m8349(i9, size, (C2570) list.get(i9));
                i9++;
                list = list;
            }
        }
        int size3 = arrayList.size();
        int i10 = this.f16423;
        int i11 = (int) (((i10 * 1.0f) / size3) + 0.5f);
        int i12 = i11 - (i10 / size3);
        Paint paint2 = this.f16426;
        if (z2) {
            i6 = i12;
            paint2.setColor(0);
            paint2.setStyle(Paint.Style.FILL);
        } else {
            i6 = i12;
            if (this.f16421) {
                paint2.setColor(AbstractC2774.m5177(paint2.getColor(), 22));
                paint2.setStyle(Paint.Style.FILL);
            } else {
                paint2.setColor(0);
                paint2.setStyle(Paint.Style.FILL);
            }
        }
        int color = paint2.getColor();
        Rect rect = this.f16425;
        if (color != 0) {
            int iSave = canvas.save();
            try {
                rect.set(0, 0, this.f16423, i5 - i3);
                canvas.translate(f, i3);
                canvas.drawRect(rect, paint2);
                canvas.restoreToCount(iSave);
            } catch (Throwable th) {
                canvas.restoreToCount(iSave);
                throw th;
            }
        }
        paint2.set(paint);
        paint2.setColor(AbstractC2774.m5177(paint2.getColor(), 75));
        paint2.setStyle(style);
        int strokeWidth = c2268.f7526;
        if (strokeWidth == -1) {
            strokeWidth = (int) (paint2.getStrokeWidth() + 0.5f);
        }
        int i13 = strokeWidth;
        boolean z4 = i13 > 0;
        int i14 = i5 - i3;
        int i15 = (i14 - this.f16424) / 4;
        if (z4) {
            C3583[] c3583Arr = (C3583[]) ((Spanned) charSequence).getSpans(i, i2, C3583.class);
            if (c3583Arr == null || c3583Arr.length <= 0 || !AbstractC1605.m3357(charSequence, c3583Arr[0], i)) {
                z = false;
            } else {
                rect.set((int) f, i3, this.f16423, i3 + i13);
                canvas.drawRect(rect, paint2);
                z = true;
            }
            rect.set((int) f, i5 - i13, this.f16423, i5);
            canvas.drawRect(rect, paint2);
        } else {
            z = false;
        }
        int i16 = i13 / 2;
        int i17 = z ? i13 : 0;
        int i18 = i14 - i13;
        int i19 = 0;
        int height = 0;
        while (true) {
            int i20 = size3;
            if (i19 >= i20) {
                break;
            }
            ArrayList arrayList2 = arrayList;
            Layout layout = (Layout) arrayList2.get(i19);
            boolean z5 = z4;
            int iSave2 = canvas.save();
            int i21 = i15;
            size3 = i20;
            try {
                canvas.translate(f + (i19 * i11), i3);
                if (z5) {
                    if (i19 == 0) {
                        rect.set(0, i17, i13, i18);
                    } else {
                        rect.set(-i16, i17, i16, i18);
                    }
                    canvas.drawRect(rect, paint2);
                    if (i19 == size3 - 1) {
                        rect.set((i11 - i13) - i6, i17, i11 - i6, i18);
                        canvas.drawRect(rect, paint2);
                    }
                }
                int i22 = i7;
                int i23 = i17;
                canvas.translate(i22, i22 + i21);
                layout.draw(canvas);
                if (layout.getHeight() > height) {
                    height = layout.getHeight();
                }
                canvas.restoreToCount(iSave2);
                i19++;
                z4 = z5;
                arrayList = arrayList2;
                i17 = i23;
                i7 = i22;
                i15 = i21;
            } catch (Throwable th2) {
                canvas.restoreToCount(iSave2);
                throw th2;
            }
        }
        if (this.f16424 == height || (c2346 = this.f16422) == null) {
            return;
        }
        C2139 c2139 = (C2139) c2346.f7785;
        RunnableC3365 runnableC3365 = (RunnableC3365) c2346.f7786;
        c2139.removeCallbacks(runnableC3365);
        c2139.post(runnableC3365);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        ArrayList arrayList = this.f16419;
        if (arrayList.size() > 0 && fontMetricsInt != null) {
            Iterator it = arrayList.iterator();
            int i3 = 0;
            while (it.hasNext()) {
                int height = ((Layout) it.next()).getHeight();
                if (height > i3) {
                    i3 = height;
                }
            }
            this.f16424 = i3;
            int i4 = -((this.f16428.f7527 * 2) + i3);
            fontMetricsInt.ascent = i4;
            fontMetricsInt.descent = 0;
            fontMetricsInt.top = i4;
            fontMetricsInt.bottom = 0;
        }
        return this.f16423;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m8349(int i, int i2, C2570 c2570) {
        RunnableC0731 runnableC0731 = new RunnableC0731(this, i, i2, c2570);
        C4694 c4694 = c2570.f8580;
        int i3 = c2570.f8581;
        int i4 = 1;
        StaticLayout staticLayout = new StaticLayout(c4694, this.f16420, i2, i3 != 1 ? i3 != 2 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        C1541[] c1541Arr = (C1541[]) c4694.getSpans(0, c4694.length(), C1541.class);
        if (c1541Arr != null) {
            for (C1541 c1541 : c1541Arr) {
                c4694.removeSpan(c1541);
            }
        }
        c4694.setSpan(new C1541(staticLayout), 0, c4694.length(), 18);
        C4478[] c4478Arr = (C4478[]) c4694.getSpans(0, c4694.length(), C4478.class);
        if (c4478Arr != null && c4478Arr.length > 0) {
            for (C4478 c4478 : c4478Arr) {
                C0838 c0838 = c4478.f14785;
                if (c0838.getCallback() == null) {
                    c0838.m1747(new C0733(i4, runnableC0731));
                }
            }
        }
        this.f16419.add(i, staticLayout);
    }
}
