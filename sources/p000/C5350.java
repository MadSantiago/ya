package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: renamed from: ۦِ۟ؖؒ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5350 {

    /* JADX INFO: renamed from: ۥؗ */
    public C1138 f17605;

    /* JADX INFO: renamed from: ۥُ */
    public C1138 f17606;

    /* JADX INFO: renamed from: ۥّ */
    public C1138 f17607;

    /* JADX INFO: renamed from: ۥۗ */
    public C1138 f17608;

    /* JADX INFO: renamed from: ۥۜ */
    public C1138 f17609;

    /* JADX INFO: renamed from: ۥۣ */
    public final TextView f17610;

    /* JADX INFO: renamed from: ۦؑ */
    public C1138 f17611;

    /* JADX INFO: renamed from: ۦؚ */
    public Typeface f17612;

    /* JADX INFO: renamed from: ۦٌ */
    public boolean f17613;

    /* JADX INFO: renamed from: ۦٛ */
    public final C2367 f17615;

    /* JADX INFO: renamed from: ۦۙ */
    public C1138 f17617;

    /* JADX INFO: renamed from: ۦِ */
    public int f17614 = 0;

    /* JADX INFO: renamed from: ۦۗ */
    public int f17616 = -1;

    public C5350(TextView textView) {
        this.f17610 = textView;
        this.f17615 = new C2367(textView);
    }

    /* JADX INFO: renamed from: ۥؗ */
    public static C1138 m8936(Context context, C3465 c3465, int i) {
        ColorStateList colorStateListM312;
        synchronized (c3465) {
            colorStateListM312 = c3465.f11498.m312(context, i);
        }
        if (colorStateListM312 == null) {
            return null;
        }
        C1138 c1138 = new C1138();
        c1138.f3980 = true;
        c1138.f3979 = colorStateListM312;
        return c1138;
    }

    /* JADX INFO: renamed from: ۥُ */
    public final PorterDuff.Mode m8937() {
        C1138 c1138 = this.f17609;
        if (c1138 != null) {
            return (PorterDuff.Mode) c1138.f3982;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:226:0x0393  */
    /* JADX WARN: Code duplicated, block: B:228:0x0398  */
    /* JADX WARN: Code duplicated, block: B:231:0x039f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:232:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:234:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:236:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:238:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:241:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: ۥّ */
    public final void m8938(AttributeSet attributeSet, int i) {
        boolean z;
        boolean z2;
        String string;
        String string2;
        float dimensionPixelSize;
        int i2;
        ColorStateList colorStateList;
        int resourceId;
        int i3;
        int resourceId2;
        TextView textView = this.f17610;
        Context context = textView.getContext();
        C3465 c3465M6241 = C3465.m6241();
        int[] iArr = AbstractC5618.f18519;
        C5460 c5460M9119 = C5460.m9119(context, attributeSet, iArr, i);
        AbstractC3608.m6435(textView, textView.getContext(), iArr, attributeSet, (TypedArray) c5460M9119.f17999, i);
        TypedArray typedArray = (TypedArray) c5460M9119.f17999;
        int resourceId3 = typedArray.getResourceId(0, -1);
        if (typedArray.hasValue(3)) {
            this.f17608 = m8936(context, c3465M6241, typedArray.getResourceId(3, 0));
        }
        if (typedArray.hasValue(1)) {
            this.f17605 = m8936(context, c3465M6241, typedArray.getResourceId(1, 0));
        }
        if (typedArray.hasValue(4)) {
            this.f17611 = m8936(context, c3465M6241, typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(2)) {
            this.f17606 = m8936(context, c3465M6241, typedArray.getResourceId(2, 0));
        }
        if (typedArray.hasValue(5)) {
            this.f17607 = m8936(context, c3465M6241, typedArray.getResourceId(5, 0));
        }
        if (typedArray.hasValue(6)) {
            this.f17617 = m8936(context, c3465M6241, typedArray.getResourceId(6, 0));
        }
        c5460M9119.m9126();
        boolean z3 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = AbstractC5618.f18531;
        if (resourceId3 != -1) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(resourceId3, iArr2);
            C5460 c5460 = new C5460(context, typedArrayObtainStyledAttributes);
            if (z3 || !typedArrayObtainStyledAttributes.hasValue(14)) {
                z = false;
                z2 = false;
            } else {
                z2 = typedArrayObtainStyledAttributes.getBoolean(14, false);
                z = true;
            }
            m8944(context, c5460);
            string2 = typedArrayObtainStyledAttributes.hasValue(15) ? typedArrayObtainStyledAttributes.getString(15) : null;
            string = typedArrayObtainStyledAttributes.hasValue(13) ? typedArrayObtainStyledAttributes.getString(13) : null;
            c5460.m9126();
        } else {
            z = false;
            z2 = false;
            string = null;
            string2 = null;
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        C5460 c5461 = new C5460(context, typedArrayObtainStyledAttributes2);
        if (!z3 && typedArrayObtainStyledAttributes2.hasValue(14)) {
            z2 = typedArrayObtainStyledAttributes2.getBoolean(14, false);
            z = true;
        }
        boolean z4 = z2;
        if (typedArrayObtainStyledAttributes2.hasValue(15)) {
            string2 = typedArrayObtainStyledAttributes2.getString(15);
        }
        if (typedArrayObtainStyledAttributes2.hasValue(13)) {
            string = typedArrayObtainStyledAttributes2.getString(13);
        }
        if (Build.VERSION.SDK_INT >= 28 && typedArrayObtainStyledAttributes2.hasValue(0) && typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        m8944(context, c5461);
        c5461.m9126();
        if (!z3 && z) {
            textView.setAllCaps(z4);
        }
        Typeface typeface = this.f17612;
        if (typeface != null) {
            if (this.f17616 == -1) {
                textView.setTypeface(typeface, this.f17614);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (string != null) {
            AbstractC4765.m8115(textView, string);
        }
        if (string2 != null) {
            AbstractC3204.m5893(textView, AbstractC3204.m5894(string2));
        }
        C2367 c2367 = this.f17615;
        Context context2 = c2367.f7845;
        int[] iArr3 = AbstractC5618.f18527;
        TypedArray typedArrayObtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr3, i, 0);
        TextView textView2 = c2367.f7846;
        AbstractC3608.m6435(textView2, textView2.getContext(), iArr3, attributeSet, typedArrayObtainStyledAttributes3, i);
        if (typedArrayObtainStyledAttributes3.hasValue(5)) {
            c2367.f7843 = typedArrayObtainStyledAttributes3.getInt(5, 0);
        }
        float dimension = typedArrayObtainStyledAttributes3.hasValue(4) ? typedArrayObtainStyledAttributes3.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = typedArrayObtainStyledAttributes3.hasValue(2) ? typedArrayObtainStyledAttributes3.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = typedArrayObtainStyledAttributes3.hasValue(1) ? typedArrayObtainStyledAttributes3.getDimension(1, -1.0f) : -1.0f;
        if (typedArrayObtainStyledAttributes3.hasValue(3) && (resourceId2 = typedArrayObtainStyledAttributes3.getResourceId(3, 0)) > 0) {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes3.getResources().obtainTypedArray(resourceId2);
            int length = typedArrayObtainTypedArray.length();
            int[] iArr4 = new int[length];
            if (length > 0) {
                for (int i4 = 0; i4 < length; i4++) {
                    iArr4[i4] = typedArrayObtainTypedArray.getDimensionPixelSize(i4, -1);
                }
                c2367.f7840 = C2367.m4435(iArr4);
                c2367.m4442();
            }
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes3.recycle();
        if (!c2367.m4441()) {
            c2367.f7843 = 0;
        } else if (c2367.f7843 == 1) {
            if (!c2367.f7848) {
                DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    i3 = 2;
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i3 = 2;
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(i3, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                c2367.m4443(dimension2, dimension3, dimension);
            }
            c2367.m4439();
        }
        if (AbstractC4518.f14930 && c2367.f7843 != 0) {
            int[] iArr5 = c2367.f7840;
            if (iArr5.length > 0) {
                if (AbstractC4765.m8114(textView) != -1.0f) {
                    AbstractC4765.m8113(textView, Math.round(c2367.f7844), Math.round(c2367.f7839), Math.round(c2367.f7838), 0);
                } else {
                    AbstractC4765.m8112(textView, iArr5, 0);
                }
            }
        }
        TypedArray typedArrayObtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, iArr3);
        int resourceId4 = typedArrayObtainStyledAttributes4.getResourceId(8, -1);
        Drawable drawableM6242 = resourceId4 != -1 ? c3465M6241.m6242(context, resourceId4) : null;
        int resourceId5 = typedArrayObtainStyledAttributes4.getResourceId(13, -1);
        Drawable drawableM6243 = resourceId5 != -1 ? c3465M6241.m6242(context, resourceId5) : null;
        int resourceId6 = typedArrayObtainStyledAttributes4.getResourceId(9, -1);
        Drawable drawableM6244 = resourceId6 != -1 ? c3465M6241.m6242(context, resourceId6) : null;
        int resourceId7 = typedArrayObtainStyledAttributes4.getResourceId(6, -1);
        Drawable drawableM6245 = resourceId7 != -1 ? c3465M6241.m6242(context, resourceId7) : null;
        int resourceId8 = typedArrayObtainStyledAttributes4.getResourceId(10, -1);
        Drawable drawableM6246 = resourceId8 != -1 ? c3465M6241.m6242(context, resourceId8) : null;
        int resourceId9 = typedArrayObtainStyledAttributes4.getResourceId(7, -1);
        Drawable drawableM6247 = resourceId9 != -1 ? c3465M6241.m6242(context, resourceId9) : null;
        if (drawableM6246 != null || drawableM6247 != null) {
            Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            if (drawableM6246 == null) {
                drawableM6246 = compoundDrawablesRelative[0];
            }
            if (drawableM6243 == null) {
                drawableM6243 = compoundDrawablesRelative[1];
            }
            if (drawableM6247 == null) {
                drawableM6247 = compoundDrawablesRelative[2];
            }
            if (drawableM6245 == null) {
                drawableM6245 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawableM6246, drawableM6243, drawableM6247, drawableM6245);
        } else if (drawableM6242 != null || drawableM6243 != null || drawableM6244 != null || drawableM6245 != null) {
            Drawable[] compoundDrawablesRelative2 = textView.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative2[0];
            if (drawable == null && compoundDrawablesRelative2[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (drawableM6242 == null) {
                    drawableM6242 = compoundDrawables[0];
                }
                if (drawableM6243 == null) {
                    drawableM6243 = compoundDrawables[1];
                }
                if (drawableM6244 == null) {
                    drawableM6244 = compoundDrawables[2];
                }
                if (drawableM6245 == null) {
                    drawableM6245 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(drawableM6242, drawableM6243, drawableM6244, drawableM6245);
            } else {
                if (drawableM6243 == null) {
                    drawableM6243 = compoundDrawablesRelative2[1];
                }
                if (drawableM6245 == null) {
                    drawableM6245 = compoundDrawablesRelative2[3];
                }
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawableM6243, compoundDrawablesRelative2[2], drawableM6245);
            }
        }
        if (typedArrayObtainStyledAttributes4.hasValue(11)) {
            if (!typedArrayObtainStyledAttributes4.hasValue(11) || (resourceId = typedArrayObtainStyledAttributes4.getResourceId(11, 0)) == 0 || (colorStateList = AbstractC4225.m7481(context, resourceId)) == null) {
                colorStateList = typedArrayObtainStyledAttributes4.getColorStateList(11);
            }
            textView.setCompoundDrawableTintList(colorStateList);
        }
        if (typedArrayObtainStyledAttributes4.hasValue(12)) {
            textView.setCompoundDrawableTintMode(AbstractC3522.m6315(typedArrayObtainStyledAttributes4.getInt(12, -1), null));
        }
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(15, -1);
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(18, -1);
        if (typedArrayObtainStyledAttributes4.hasValue(19)) {
            TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes4.peekValue(19);
            if (typedValuePeekValue == null || typedValuePeekValue.type != 5) {
                dimensionPixelSize = typedArrayObtainStyledAttributes4.getDimensionPixelSize(19, -1);
            } else {
                int i5 = typedValuePeekValue.data;
                i2 = i5 & 15;
                dimensionPixelSize = TypedValue.complexToFloat(i5);
            }
            typedArrayObtainStyledAttributes4.recycle();
            if (dimensionPixelSize2 != -1) {
                AbstractC4554.m7916(textView, dimensionPixelSize2);
            }
            if (dimensionPixelSize3 != -1) {
                AbstractC4554.m7899(textView, dimensionPixelSize3);
            }
            if (dimensionPixelSize != -1.0f) {
                if (i2 == -1) {
                    AbstractC4554.m7905(textView, (int) dimensionPixelSize);
                } else if (Build.VERSION.SDK_INT >= 34) {
                    AbstractC0002.m177(textView, i2, dimensionPixelSize);
                } else {
                    AbstractC4554.m7905(textView, Math.round(TypedValue.applyDimension(i2, dimensionPixelSize, textView.getResources().getDisplayMetrics())));
                }
            }
        }
        dimensionPixelSize = -1.0f;
        i2 = -1;
        typedArrayObtainStyledAttributes4.recycle();
        if (dimensionPixelSize2 != -1) {
            AbstractC4554.m7916(textView, dimensionPixelSize2);
        }
        if (dimensionPixelSize3 != -1) {
            AbstractC4554.m7899(textView, dimensionPixelSize3);
        }
        if (dimensionPixelSize != -1.0f) {
            if (i2 == -1) {
                AbstractC4554.m7905(textView, (int) dimensionPixelSize);
            } else if (Build.VERSION.SDK_INT >= 34) {
                AbstractC0002.m177(textView, i2, dimensionPixelSize);
            } else {
                AbstractC4554.m7905(textView, Math.round(TypedValue.applyDimension(i2, dimensionPixelSize, textView.getResources().getDisplayMetrics())));
            }
        }
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final void m8939() {
        C1138 c1138 = this.f17608;
        TextView textView = this.f17610;
        if (c1138 != null || this.f17605 != null || this.f17611 != null || this.f17606 != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            m8941(compoundDrawables[0], this.f17608);
            m8941(compoundDrawables[1], this.f17605);
            m8941(compoundDrawables[2], this.f17611);
            m8941(compoundDrawables[3], this.f17606);
        }
        if (this.f17607 == null && this.f17617 == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        m8941(compoundDrawablesRelative[0], this.f17607);
        m8941(compoundDrawablesRelative[2], this.f17617);
    }

    /* JADX INFO: renamed from: ۥۜ */
    public final void m8940(int i, int i2, int i3, int i4) {
        C2367 c2367 = this.f17615;
        if (c2367.m4441()) {
            DisplayMetrics displayMetrics = c2367.f7845.getResources().getDisplayMetrics();
            c2367.m4443(TypedValue.applyDimension(i4, i, displayMetrics), TypedValue.applyDimension(i4, i2, displayMetrics), TypedValue.applyDimension(i4, i3, displayMetrics));
            if (c2367.m4439()) {
                c2367.m4440();
            }
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m8941(Drawable drawable, C1138 c1138) {
        if (drawable == null || c1138 == null) {
            return;
        }
        int[] drawableState = this.f17610.getDrawableState();
        PorterDuff.Mode mode = C3465.f11497;
        C0141.m306(drawable, c1138, drawableState);
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final ColorStateList m8942() {
        C1138 c1138 = this.f17609;
        if (c1138 != null) {
            return (ColorStateList) c1138.f3979;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦؚ */
    public final void m8943(PorterDuff.Mode mode) {
        C1138 c1138 = this.f17609;
        if (c1138 == null) {
            c1138 = new C1138();
            this.f17609 = c1138;
        }
        C1138 c1139 = c1138;
        c1138.f3982 = mode;
        c1138.f3981 = mode != null;
        this.f17608 = c1139;
        this.f17605 = c1139;
        this.f17611 = c1139;
        this.f17606 = c1139;
        this.f17607 = c1139;
        this.f17617 = c1139;
    }

    /* JADX INFO: renamed from: ۦٌ */
    public final void m8944(Context context, C5460 c5460) {
        String string;
        int i = this.f17614;
        TypedArray typedArray = (TypedArray) c5460.f17999;
        this.f17614 = typedArray.getInt(2, i);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            int i3 = typedArray.getInt(11, -1);
            this.f17616 = i3;
            if (i3 != -1) {
                this.f17614 &= 2;
            }
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.f17613 = false;
                int i4 = typedArray.getInt(1, 1);
                if (i4 == 1) {
                    this.f17612 = Typeface.SANS_SERIF;
                    return;
                } else if (i4 == 2) {
                    this.f17612 = Typeface.SERIF;
                    return;
                } else {
                    if (i4 != 3) {
                        return;
                    }
                    this.f17612 = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f17612 = null;
        int i5 = typedArray.hasValue(12) ? 12 : 10;
        int i6 = this.f17616;
        int i7 = this.f17614;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceM9122 = c5460.m9122(i5, this.f17614, new C0835(this, i6, i7, new WeakReference(this.f17610)));
                if (typefaceM9122 != null) {
                    if (i2 < 28 || this.f17616 == -1) {
                        this.f17612 = typefaceM9122;
                    } else {
                        this.f17612 = AbstractC1157.m2415(Typeface.create(typefaceM9122, 0), this.f17616, (this.f17614 & 2) != 0);
                    }
                }
                this.f17613 = this.f17612 == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f17612 != null || (string = typedArray.getString(i5)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f17616 == -1) {
            this.f17612 = Typeface.create(string, this.f17614);
        } else {
            this.f17612 = AbstractC1157.m2415(Typeface.create(string, 0), this.f17616, (this.f17614 & 2) != 0);
        }
    }

    /* JADX INFO: renamed from: ۦِ */
    public final void m8945(int i) {
        C2367 c2367 = this.f17615;
        if (c2367.m4441()) {
            if (i == 0) {
                c2367.f7843 = 0;
                c2367.f7844 = -1.0f;
                c2367.f7839 = -1.0f;
                c2367.f7838 = -1.0f;
                c2367.f7840 = new int[0];
                c2367.f7841 = false;
                return;
            }
            if (i != 1) {
                C1078.m2272(AbstractC5078.m8670(i, "Unknown auto-size text type: "));
                return;
            }
            DisplayMetrics displayMetrics = c2367.f7845.getResources().getDisplayMetrics();
            c2367.m4443(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (c2367.m4439()) {
                c2367.m4440();
            }
        }
    }

    /* JADX INFO: renamed from: ۦٛ */
    public final void m8946(int[] iArr, int i) {
        C2367 c2367 = this.f17615;
        if (c2367.m4441()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = c2367.f7845.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArrCopyOf[i2] = Math.round(TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                    }
                }
                c2367.f7840 = C2367.m4435(iArrCopyOf);
                if (!c2367.m4442()) {
                    C1078.m2271(Arrays.toString(iArr), "None of the preset sizes is valid: ");
                    return;
                }
            } else {
                c2367.f7848 = false;
            }
            if (c2367.m4439()) {
                c2367.m4440();
            }
        }
    }

    /* JADX INFO: renamed from: ۦۗ */
    public final void m8947(ColorStateList colorStateList) {
        C1138 c1138 = this.f17609;
        if (c1138 == null) {
            c1138 = new C1138();
            this.f17609 = c1138;
        }
        C1138 c1139 = c1138;
        c1138.f3979 = colorStateList;
        c1138.f3980 = colorStateList != null;
        this.f17608 = c1139;
        this.f17605 = c1139;
        this.f17611 = c1139;
        this.f17606 = c1139;
        this.f17607 = c1139;
        this.f17617 = c1139;
    }

    /* JADX INFO: renamed from: ۦۙ */
    public final void m8948(Context context, int i) {
        String string;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, AbstractC5618.f18531);
        C5460 c5460 = new C5460(context, typedArrayObtainStyledAttributes);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(14);
        TextView textView = this.f17610;
        if (zHasValue) {
            textView.setAllCaps(typedArrayObtainStyledAttributes.getBoolean(14, false));
        }
        if (typedArrayObtainStyledAttributes.hasValue(0) && typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        m8944(context, c5460);
        if (typedArrayObtainStyledAttributes.hasValue(13) && (string = typedArrayObtainStyledAttributes.getString(13)) != null) {
            AbstractC4765.m8115(textView, string);
        }
        c5460.m9126();
        Typeface typeface = this.f17612;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f17614);
        }
    }
}
