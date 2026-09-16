package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: ۥؘۜؒؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2367 {

    /* JADX INFO: renamed from: ۦؚ */
    public static final RectF f7836 = new RectF();

    /* JADX INFO: renamed from: ۦٌ */
    public static final ConcurrentHashMap f7837 = new ConcurrentHashMap();

    /* JADX INFO: renamed from: ۥۜ */
    public TextPaint f7842;

    /* JADX INFO: renamed from: ۦِ */
    public final Context f7845;

    /* JADX INFO: renamed from: ۦٛ */
    public final TextView f7846;

    /* JADX INFO: renamed from: ۦۗ */
    public final C3682 f7847;

    /* JADX INFO: renamed from: ۥۣ */
    public int f7843 = 0;

    /* JADX INFO: renamed from: ۥۗ */
    public boolean f7841 = false;

    /* JADX INFO: renamed from: ۥؗ */
    public float f7838 = -1.0f;

    /* JADX INFO: renamed from: ۦؑ */
    public float f7844 = -1.0f;

    /* JADX INFO: renamed from: ۥُ */
    public float f7839 = -1.0f;

    /* JADX INFO: renamed from: ۥّ */
    public int[] f7840 = new int[0];

    /* JADX INFO: renamed from: ۦۙ */
    public boolean f7848 = false;

    public C2367(TextView textView) {
        this.f7846 = textView;
        this.f7845 = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f7847 = new C1140();
        } else {
            this.f7847 = new C3682();
        }
    }

    /* JADX INFO: renamed from: ۥُ */
    public static Object m4434(Object obj, Object obj2, String str) {
        try {
            return m4436(str).invoke(obj, null);
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e);
            return obj2;
        }
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static int[] m4435(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i : iArr) {
                if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                    arrayList.add(Integer.valueOf(i));
                }
            }
            if (length != arrayList.size()) {
                int size = arrayList.size();
                int[] iArr2 = new int[size];
                for (int i2 = 0; i2 < size; i2++) {
                    iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
                }
                return iArr2;
            }
        }
        return iArr;
    }

    /* JADX INFO: renamed from: ۦؑ */
    public static Method m4436(String str) {
        try {
            ConcurrentHashMap concurrentHashMap = f7837;
            Method declaredMethod = (Method) concurrentHashMap.get(str);
            if (declaredMethod != null || (declaredMethod = TextView.class.getDeclaredMethod(str, null)) == null) {
                return declaredMethod;
            }
            declaredMethod.setAccessible(true);
            concurrentHashMap.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final int m4437(RectF rectF) {
        CharSequence transformation;
        int length = this.f7840.length;
        if (length == 0) {
            C1078.m2276("No available text sizes to choose from.");
            return 0;
        }
        int i = length - 1;
        int i2 = 0;
        int i3 = 1;
        while (true) {
            int[] iArr = this.f7840;
            if (i3 > i) {
                return iArr[i2];
            }
            int i4 = (i3 + i) / 2;
            int i5 = iArr[i4];
            TextView textView = this.f7846;
            CharSequence text = textView.getText();
            TransformationMethod transformationMethod = textView.getTransformationMethod();
            CharSequence charSequence = (transformationMethod == null || (transformation = transformationMethod.getTransformation(text, textView)) == null) ? text : transformation;
            int maxLines = textView.getMaxLines();
            TextPaint textPaint = this.f7842;
            if (textPaint == null) {
                this.f7842 = new TextPaint();
            } else {
                textPaint.reset();
            }
            this.f7842.set(textView.getPaint());
            this.f7842.setTextSize(i5);
            StaticLayout staticLayoutM6036 = AbstractC3270.m6036(charSequence, (Layout.Alignment) m4434(textView, Layout.Alignment.ALIGN_NORMAL, "getLayoutAlignment"), Math.round(rectF.right), maxLines, this.f7846, this.f7842, this.f7847);
            if ((maxLines == -1 || (staticLayoutM6036.getLineCount() <= maxLines && staticLayoutM6036.getLineEnd(staticLayoutM6036.getLineCount() - 1) == charSequence.length())) && staticLayoutM6036.getHeight() <= rectF.bottom) {
                int i6 = i4 + 1;
                i2 = i3;
                i3 = i6;
            } else {
                i2 = i4 - 1;
                i = i2;
            }
        }
    }

    /* JADX INFO: renamed from: ۥّ */
    public final boolean m4438() {
        return m4441() && this.f7843 != 0;
    }

    /* JADX INFO: renamed from: ۥۜ */
    public final boolean m4439() {
        if (!m4441() || this.f7843 != 1) {
            this.f7841 = false;
            return false;
        }
        if (!this.f7848 || this.f7840.length == 0) {
            int iFloor = ((int) Math.floor((this.f7839 - this.f7844) / this.f7838)) + 1;
            int[] iArr = new int[iFloor];
            for (int i = 0; i < iFloor; i++) {
                iArr[i] = Math.round((i * this.f7838) + this.f7844);
            }
            this.f7840 = m4435(iArr);
        }
        this.f7841 = true;
        return true;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m4440() {
        if (m4438()) {
            if (this.f7841) {
                if (this.f7846.getMeasuredHeight() <= 0 || this.f7846.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f7847.mo2399(this.f7846) ? 1048576 : (this.f7846.getMeasuredWidth() - this.f7846.getTotalPaddingLeft()) - this.f7846.getTotalPaddingRight();
                int height = (this.f7846.getHeight() - this.f7846.getCompoundPaddingBottom()) - this.f7846.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f7836;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float fM4437 = m4437(rectF);
                        if (fM4437 != this.f7846.getTextSize()) {
                            m4444(0, fM4437);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            this.f7841 = true;
        }
    }

    /* JADX INFO: renamed from: ۦِ */
    public final boolean m4441() {
        return !(this.f7846 instanceof C5396);
    }

    /* JADX INFO: renamed from: ۦٛ */
    public final boolean m4442() {
        int[] iArr = this.f7840;
        int length = iArr.length;
        boolean z = length > 0;
        this.f7848 = z;
        if (z) {
            this.f7843 = 1;
            this.f7844 = iArr[0];
            this.f7839 = iArr[length - 1];
            this.f7838 = -1.0f;
        }
        return z;
    }

    /* JADX INFO: renamed from: ۦۗ */
    public final void m4443(float f, float f2, float f3) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f + "px) is less or equal to (0px)");
        }
        if (f2 <= f) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f2 + "px) is less or equal to minimum auto-size text size (" + f + "px)");
        }
        if (f3 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f3 + "px) is less or equal to (0px)");
        }
        this.f7843 = 1;
        this.f7844 = f;
        this.f7839 = f2;
        this.f7838 = f3;
        this.f7848 = false;
    }

    /* JADX INFO: renamed from: ۦۙ */
    public final void m4444(int i, float f) {
        Context context = this.f7845;
        float fApplyDimension = TypedValue.applyDimension(i, f, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        TextView textView = this.f7846;
        if (fApplyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(fApplyDimension);
            boolean zIsInLayout = textView.isInLayout();
            if (textView.getLayout() != null) {
                this.f7841 = false;
                try {
                    Method methodM4436 = m4436("nullLayouts");
                    if (methodM4436 != null) {
                        methodM4436.invoke(textView, null);
                    }
                } catch (Exception e) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e);
                }
                if (zIsInLayout) {
                    textView.forceLayout();
                } else {
                    textView.requestLayout();
                }
                textView.invalidate();
            }
        }
    }
}
