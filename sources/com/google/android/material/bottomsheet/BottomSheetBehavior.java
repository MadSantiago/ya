package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import p000.AbstractC0980;
import p000.AbstractC3831;
import p000.AbstractC4225;
import p000.C1078;
import p000.C1104;
import p000.C2664;
import p000.C3472;
import p000.C4040;
import p000.C4228;
import p000.C4488;
import ru.bluecat.yandexmapspatcher.R;

/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends AbstractC3831 {

    /* JADX INFO: renamed from: ۥؖ */
    public int f310;

    /* JADX INFO: renamed from: ۥَ */
    public final ColorStateList f311;

    /* JADX INFO: renamed from: ۥْ */
    public boolean f312;

    /* JADX INFO: renamed from: ۥٓ */
    public final C3472 f313;

    /* JADX INFO: renamed from: ۥٖ */
    public final boolean f314;

    /* JADX INFO: renamed from: ۥٙ */
    public final boolean f315;

    /* JADX INFO: renamed from: ۥۖ */
    public final ValueAnimator f316;

    /* JADX INFO: renamed from: ۦٕ */
    public final int f317;

    /* JADX INFO: renamed from: ۦٗ */
    public final C4040 f318;

    /* JADX INFO: renamed from: ۦۛ */
    public boolean f319;

    /* JADX INFO: renamed from: ۦ۟ */
    public int f320;

    /* JADX INFO: renamed from: ۦۨ */
    public final boolean f321;

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i;
        int i2;
        this.f321 = true;
        new C4228(this);
        this.f310 = 4;
        new ArrayList();
        new ArrayList();
        new SparseIntArray();
        new SparseIntArray();
        new SparseIntArray();
        new Rect();
        context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0980.f3454);
        int i3 = 3;
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.f311 = AbstractC4225.m7448(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(24)) {
            this.f318 = C4040.m7236(context, attributeSet, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal).m9723();
        }
        C4040 c4040 = this.f318;
        if (c4040 != null) {
            C3472 c3472 = new C3472(c4040);
            this.f313 = c3472;
            c3472.f11547.f14831 = new C1104(context);
            c3472.m6276();
            ColorStateList colorStateList = this.f311;
            if (colorStateList != null) {
                C3472 c3473 = this.f313;
                C4488 c4488 = c3473.f11547;
                if (c4488.f14828 != colorStateList) {
                    c4488.f14828 = colorStateList;
                    c3473.onStateChange(c3473.getState());
                }
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f313.setTint(typedValue.data);
            }
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f316 = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.f316.addUpdateListener(new C2664(this));
        typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            typedArrayObtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(12);
        if (typedValuePeekValue == null || (i2 = typedValuePeekValue.data) != -1) {
            m122(typedArrayObtainStyledAttributes.getDimensionPixelSize(12, -1));
        } else {
            m122(i2);
        }
        boolean z = typedArrayObtainStyledAttributes.getBoolean(10, false);
        if (this.f315 != z) {
            this.f315 = z;
            if (!z && this.f310 == 5 && this.f310 != 4) {
                this.f310 = 4;
            }
        }
        typedArrayObtainStyledAttributes.getBoolean(16, false);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(8, true);
        if (this.f321 != z2) {
            this.f321 = z2;
            if (!z2 || (i = this.f310) != 6) {
                i3 = this.f310;
                i = i3;
            }
            if (i == i3) {
                i3 = i;
            } else {
                this.f310 = i3;
            }
            m123(i3);
        }
        typedArrayObtainStyledAttributes.getBoolean(15, false);
        typedArrayObtainStyledAttributes.getBoolean(5, true);
        typedArrayObtainStyledAttributes.getBoolean(6, true);
        typedArrayObtainStyledAttributes.getInt(13, 0);
        float f = typedArrayObtainStyledAttributes.getFloat(9, 0.5f);
        if (f <= 0.0f || f >= 1.0f) {
            C1078.m2272("ratio must be a float value between 0 and 1");
            throw null;
        }
        TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(7);
        if (typedValuePeekValue2 == null || typedValuePeekValue2.type != 16) {
            int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(7, 0);
            if (dimensionPixelOffset < 0) {
                C1078.m2272("offset must be greater than or equal to 0");
                throw null;
            }
            this.f317 = dimensionPixelOffset;
            m123(this.f310);
        } else {
            int i4 = typedValuePeekValue2.data;
            if (i4 < 0) {
                C1078.m2272("offset must be greater than or equal to 0");
                throw null;
            }
            this.f317 = i4;
            m123(this.f310);
        }
        typedArrayObtainStyledAttributes.getInt(14, 500);
        typedArrayObtainStyledAttributes.getBoolean(11, false);
        typedArrayObtainStyledAttributes.getBoolean(4, true);
        typedArrayObtainStyledAttributes.getBoolean(20, false);
        typedArrayObtainStyledAttributes.getBoolean(21, false);
        typedArrayObtainStyledAttributes.getBoolean(22, false);
        typedArrayObtainStyledAttributes.getBoolean(23, true);
        typedArrayObtainStyledAttributes.getBoolean(17, false);
        typedArrayObtainStyledAttributes.getBoolean(18, false);
        typedArrayObtainStyledAttributes.getBoolean(19, false);
        this.f314 = typedArrayObtainStyledAttributes.getBoolean(26, true);
        typedArrayObtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    /* JADX INFO: renamed from: ۥِ */
    public final void m122(int i) {
        boolean z = this.f312;
        if (i == -1) {
            if (z) {
                return;
            }
            this.f312 = true;
        } else if (z || this.f320 != i) {
            this.f312 = false;
            this.f320 = Math.max(0, i);
        }
    }

    /* JADX INFO: renamed from: ۥۘ */
    public final void m123(int i) {
        C3472 c3472;
        if (i == 2) {
            return;
        }
        boolean z = this.f310 == 3 && this.f314;
        if (this.f319 == z || (c3472 = this.f313) == null) {
            return;
        }
        this.f319 = z;
        ValueAnimator valueAnimator = this.f316;
        if (valueAnimator != null) {
            if (valueAnimator.isRunning()) {
                valueAnimator.reverse();
                return;
            } else {
                valueAnimator.setFloatValues(c3472.f11547.f14838, z ? 0.0f : 1.0f);
                valueAnimator.start();
                return;
            }
        }
        if (valueAnimator != null && valueAnimator.isRunning()) {
            valueAnimator.cancel();
        }
        float f = this.f319 ? 0.0f : 1.0f;
        C4488 c4488 = c3472.f11547;
        if (c4488.f14838 != f) {
            c4488.f14838 = f;
            c3472.f11528 = true;
            c3472.f11543 = true;
            c3472.invalidateSelf();
        }
    }

    public BottomSheetBehavior() {
        this.f321 = true;
        new C4228(this);
        this.f310 = 4;
        new ArrayList();
        new ArrayList();
        new SparseIntArray();
        new SparseIntArray();
        new SparseIntArray();
        new Rect();
    }
}
