package p000;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;

/* JADX INFO: renamed from: ۦؑؗۡؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3061 extends C3526 {

    /* JADX INFO: renamed from: ۦٗ */
    public static final int[][] f10296 = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* JADX INFO: renamed from: ۥَ */
    public ColorStateList f10297;

    /* JADX INFO: renamed from: ۥٖ */
    public boolean f10298;

    public C3061(Context context, AttributeSet attributeSet) {
        super(AbstractC2765.m5150(context, attributeSet, ru.bluecat.yandexmapspatcher.R.attr.radioButtonStyle, ru.bluecat.yandexmapspatcher.R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]), attributeSet);
        Context context2 = getContext();
        C5063.m8618(context2, attributeSet, ru.bluecat.yandexmapspatcher.R.attr.radioButtonStyle, ru.bluecat.yandexmapspatcher.R.style.Widget_MaterialComponents_CompoundButton_RadioButton);
        int[] iArr = AbstractC0980.f3459;
        C5063.m8620(context2, attributeSet, iArr, ru.bluecat.yandexmapspatcher.R.attr.radioButtonStyle, ru.bluecat.yandexmapspatcher.R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, ru.bluecat.yandexmapspatcher.R.attr.radioButtonStyle, ru.bluecat.yandexmapspatcher.R.style.Widget_MaterialComponents_CompoundButton_RadioButton);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            setButtonTintList(AbstractC4225.m7448(context2, typedArrayObtainStyledAttributes, 0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            setRippleColor(AbstractC4225.m7448(context2, typedArrayObtainStyledAttributes, 1));
        }
        this.f10298 = typedArrayObtainStyledAttributes.getBoolean(2, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        ColorStateList colorStateList = this.f10297;
        if (colorStateList != null) {
            return colorStateList;
        }
        int iM4191 = AbstractC2164.m4191(this, ru.bluecat.yandexmapspatcher.R.attr.colorControlActivated);
        int iM4192 = AbstractC2164.m4191(this, ru.bluecat.yandexmapspatcher.R.attr.colorOnSurface);
        int iM4193 = AbstractC2164.m4191(this, ru.bluecat.yandexmapspatcher.R.attr.colorSurface);
        ColorStateList colorStateList2 = new ColorStateList(f10296, new int[]{AbstractC2164.m4208(1.0f, iM4193, iM4191), AbstractC2164.m4208(0.54f, iM4193, iM4192), AbstractC2164.m4208(0.38f, iM4193, iM4192), AbstractC2164.m4208(0.38f, iM4193, iM4192)});
        this.f10297 = colorStateList2;
        return colorStateList2;
    }

    private void setRippleColor(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return;
        }
        Drawable background = getBackground();
        if (background instanceof DrawableWrapper) {
            background = ((DrawableWrapper) background).getDrawable();
        }
        if (background instanceof RippleDrawable) {
            ((RippleDrawable) background).setColor(colorStateList);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f10298 && getButtonTintList() == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f10298 = z;
        if (z) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }
}
