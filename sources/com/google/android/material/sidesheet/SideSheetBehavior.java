package com.google.android.material.sidesheet;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.LinkedHashSet;
import p000.AbstractC0980;
import p000.AbstractC3831;
import p000.AbstractC4225;
import p000.C1039;
import p000.C1104;
import p000.C3472;
import p000.C4040;
import p000.C4488;
import ru.bluecat.yandexmapspatcher.R;

/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class SideSheetBehavior<V extends View> extends AbstractC3831 {

    /* JADX INFO: renamed from: ۥْ */
    public final C4040 f342;

    /* JADX INFO: renamed from: ۥٓ */
    public int f343;

    /* JADX INFO: renamed from: ۦ۟ */
    public final ColorStateList f344;

    /* JADX INFO: renamed from: ۦۨ */
    public final C3472 f345;

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        new C1039(this);
        this.f343 = 5;
        new LinkedHashSet();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0980.f3463);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.f344 = AbstractC4225.m7448(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            this.f342 = C4040.m7236(context, attributeSet, 0, R.style.Widget_Material3_SideSheet).m9723();
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            typedArrayObtainStyledAttributes.getResourceId(5, -1);
        }
        C4040 c4040 = this.f342;
        if (c4040 != null) {
            C3472 c3472 = new C3472(c4040);
            this.f345 = c3472;
            c3472.f11547.f14831 = new C1104(context);
            c3472.m6276();
            ColorStateList colorStateList = this.f344;
            if (colorStateList != null) {
                C3472 c3473 = this.f345;
                C4488 c4488 = c3473.f11547;
                if (c4488.f14828 != colorStateList) {
                    c4488.f14828 = colorStateList;
                    c3473.onStateChange(c3473.getState());
                }
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f345.setTint(typedValue.data);
            }
        }
        typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        typedArrayObtainStyledAttributes.getBoolean(4, true);
        typedArrayObtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    public SideSheetBehavior() {
        new C1039(this);
        this.f343 = 5;
        new LinkedHashSet();
    }
}
