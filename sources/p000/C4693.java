package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import ru.bluecat.yandexmapspatcher.R;

/* JADX INFO: renamed from: ۦٜٖؕۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4693 extends C5653 {

    /* JADX INFO: renamed from: ۥؓ */
    public Drawable f15463;

    /* JADX INFO: renamed from: ۥؖ */
    public Drawable f15464;

    /* JADX INFO: renamed from: ۥً */
    public ColorStateList f15465;

    /* JADX INFO: renamed from: ۥَ */
    public final LinkedHashSet f15466;

    /* JADX INFO: renamed from: ۥٕ */
    public PorterDuff.Mode f15467;

    /* JADX INFO: renamed from: ۥٖ */
    public final LinkedHashSet f15468;

    /* JADX INFO: renamed from: ۥٙ */
    public CharSequence f15469;

    /* JADX INFO: renamed from: ۥۖ */
    public boolean f15470;

    /* JADX INFO: renamed from: ۥۙ */
    public int f15471;

    /* JADX INFO: renamed from: ۥۦ */
    public CharSequence f15472;

    /* JADX INFO: renamed from: ۥۧ */
    public boolean f15473;

    /* JADX INFO: renamed from: ۦؖ */
    public boolean f15474;

    /* JADX INFO: renamed from: ۦؗ */
    public CompoundButton.OnCheckedChangeListener f15475;

    /* JADX INFO: renamed from: ۦؙ */
    public int[] f15476;

    /* JADX INFO: renamed from: ۦُ */
    public final C3494 f15477;

    /* JADX INFO: renamed from: ۦٕ */
    public boolean f15478;

    /* JADX INFO: renamed from: ۦٖ */
    public final C2165 f15479;

    /* JADX INFO: renamed from: ۦٗ */
    public ColorStateList f15480;

    /* JADX INFO: renamed from: ۦٚ */
    public ColorStateList f15481;

    /* JADX INFO: renamed from: ۦۛ */
    public boolean f15482;

    /* JADX INFO: renamed from: ۥؔ */
    public static final int[] f15459 = {R.attr.state_indeterminate};

    /* JADX INFO: renamed from: ۦۜ */
    public static final int[] f15461 = {R.attr.state_error};

    /* JADX INFO: renamed from: ۦۣ */
    public static final int[][] f15462 = {new int[]{android.R.attr.state_enabled, R.attr.state_error}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* JADX INFO: renamed from: ۥ٘ */
    public static final int f15460 = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");

    public C4693(Context context, AttributeSet attributeSet) {
        ColorStateList colorStateList;
        int resourceId;
        int resourceId2;
        ColorStateList colorStateListM7481;
        int resourceId3;
        ColorStateList colorStateListM7482;
        int resourceId4;
        int resourceId5;
        super(AbstractC2765.m5150(context, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox, new int[0]), attributeSet);
        this.f15466 = new LinkedHashSet();
        this.f15468 = new LinkedHashSet();
        Context context2 = getContext();
        C3494 c3494 = new C3494(context2);
        Resources resources = context2.getResources();
        Resources.Theme theme = context2.getTheme();
        ThreadLocal threadLocal = AbstractC2365.f7832;
        Drawable drawable = resources.getDrawable(R.drawable.mtrl_checkbox_button_checked_unchecked, theme);
        c3494.f5376 = drawable;
        drawable.setCallback(c3494.f11595);
        new C5342(c3494.f5376.getConstantState());
        this.f15477 = c3494;
        this.f15479 = new C2165(this);
        Context context3 = getContext();
        this.f15464 = getButtonDrawable();
        this.f15465 = getSuperButtonTintList();
        setSupportButtonTintList(null);
        C5063.m8618(context3, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        int[] iArr = AbstractC0980.f3453;
        C5063.m8620(context3, attributeSet, iArr, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context3.obtainStyledAttributes(attributeSet, iArr, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        this.f15463 = (!typedArrayObtainStyledAttributes.hasValue(2) || (resourceId5 = typedArrayObtainStyledAttributes.getResourceId(2, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(2) : AbstractC4225.m7464(context3, resourceId5);
        if (this.f15464 != null && AbstractC2776.m5219(context3.getTheme(), R.attr.isMaterial3Theme, false)) {
            int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(0, 0);
            int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
            if (resourceId6 == f15460 && resourceId7 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.f15464 = AbstractC4225.m7464(context3, R.drawable.mtrl_checkbox_button);
                this.f15473 = true;
                if (this.f15463 == null) {
                    this.f15463 = AbstractC4225.m7464(context3, R.drawable.mtrl_checkbox_button_icon);
                }
            }
        }
        if ((!typedArrayObtainStyledAttributes.hasValue(3) || (resourceId4 = typedArrayObtainStyledAttributes.getResourceId(3, 0)) == 0 || (colorStateList = AbstractC4225.m7481(context3, resourceId4)) == null) && (!typedArrayObtainStyledAttributes.hasValue(3) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(3, 0)) == 0 || (colorStateList = AbstractC4225.m7481(context3, resourceId)) == null)) {
            colorStateList = typedArrayObtainStyledAttributes.getColorStateList(3);
        }
        this.f15481 = colorStateList;
        int i = typedArrayObtainStyledAttributes.getInt(4, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f15467 = AbstractC2774.m5172(i);
        this.f15482 = typedArrayObtainStyledAttributes.getBoolean(11, false);
        this.f15470 = typedArrayObtainStyledAttributes.getBoolean(6, true);
        this.f15478 = typedArrayObtainStyledAttributes.getBoolean(9, false);
        this.f15469 = typedArrayObtainStyledAttributes.getText(8);
        if (typedArrayObtainStyledAttributes.hasValue(7)) {
            setCheckedState(typedArrayObtainStyledAttributes.getInt(7, 0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(10)) {
            setRippleColor((!typedArrayObtainStyledAttributes.hasValue(10) || (resourceId3 = typedArrayObtainStyledAttributes.getResourceId(10, 0)) == 0 || (colorStateListM7482 = AbstractC4225.m7481(context3, resourceId3)) == null) ? (!typedArrayObtainStyledAttributes.hasValue(10) || (resourceId2 = typedArrayObtainStyledAttributes.getResourceId(10, 0)) == 0 || (colorStateListM7481 = AbstractC4225.m7481(context3, resourceId2)) == null) ? typedArrayObtainStyledAttributes.getColorStateList(10) : colorStateListM7481 : colorStateListM7482);
        }
        typedArrayObtainStyledAttributes.recycle();
        m8041();
    }

    private String getButtonStateDescription() {
        int i = this.f15471;
        if (i == 1) {
            return getResources().getString(R.string.mtrl_checkbox_state_description_checked);
        }
        return i == 0 ? getResources().getString(R.string.mtrl_checkbox_state_description_unchecked) : getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        ColorStateList colorStateList = this.f15480;
        if (colorStateList != null) {
            return colorStateList;
        }
        int iM4191 = AbstractC2164.m4191(this, R.attr.colorControlActivated);
        int iM4192 = AbstractC2164.m4191(this, R.attr.colorError);
        int iM4193 = AbstractC2164.m4191(this, R.attr.colorSurface);
        int iM4194 = AbstractC2164.m4191(this, R.attr.colorOnSurface);
        ColorStateList colorStateList2 = new ColorStateList(f15462, new int[]{AbstractC2164.m4208(1.0f, iM4193, iM4192), AbstractC2164.m4208(1.0f, iM4193, iM4191), AbstractC2164.m4208(0.54f, iM4193, iM4194), AbstractC2164.m4208(0.38f, iM4193, iM4194), AbstractC2164.m4208(0.38f, iM4193, iM4194)});
        this.f15480 = colorStateList2;
        return colorStateList2;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f15465;
        if (colorStateList != null) {
            return colorStateList;
        }
        return super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
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

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.f15464;
    }

    public Drawable getButtonIconDrawable() {
        return this.f15463;
    }

    public ColorStateList getButtonIconTintList() {
        return this.f15481;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f15467;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.f15465;
    }

    public int getCheckedState() {
        return this.f15471;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.f15469;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.f15471 == 1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f15482 && this.f15465 == null && this.f15481 == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrCopyOf;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f15459);
        }
        if (this.f15478) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f15461);
        }
        for (int i2 = 0; i2 < iArrOnCreateDrawableState.length; i2++) {
            int i3 = iArrOnCreateDrawableState[i2];
            if (i3 == 16842912) {
                iArrCopyOf = iArrOnCreateDrawableState;
            } else if (i3 == 0) {
                iArrCopyOf = (int[]) iArrOnCreateDrawableState.clone();
                iArrCopyOf[i2] = 16842912;
            }
            this.f15476 = iArrCopyOf;
            return iArrOnCreateDrawableState;
        }
        iArrCopyOf = Arrays.copyOf(iArrOnCreateDrawableState, iArrOnCreateDrawableState.length + 1);
        iArrCopyOf[iArrOnCreateDrawableState.length] = 16842912;
        this.f15476 = iArrCopyOf;
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable buttonDrawable;
        if (!this.f15470 || !TextUtils.isEmpty(getText()) || (buttonDrawable = getButtonDrawable()) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - buttonDrawable.getIntrinsicWidth()) / 2) * (getLayoutDirection() == 1 ? -1 : 1);
        int iSave = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(iSave);
        if (getBackground() != null) {
            Rect bounds = buttonDrawable.getBounds();
            getBackground().setHotspotBounds(bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.f15478) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.f15469));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0686)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0686 c0686 = (C0686) parcelable;
        super.onRestoreInstanceState(c0686.getSuperState());
        setCheckedState(c0686.f2498);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        C0686 c0686 = new C0686(super.onSaveInstanceState());
        c0686.f2498 = getCheckedState();
        return c0686;
    }

    @Override // p000.C5653, android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(AbstractC4225.m7464(getContext(), i));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.f15463 = drawable;
        m8041();
    }

    public void setButtonIconDrawableResource(int i) {
        setButtonIconDrawable(AbstractC4225.m7464(getContext(), i));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.f15481 == colorStateList) {
            return;
        }
        this.f15481 = colorStateList;
        m8041();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.f15467 == mode) {
            return;
        }
        this.f15467 = mode;
        m8041();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.f15465 == colorStateList) {
            return;
        }
        this.f15465 = colorStateList;
        m8041();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        m8041();
    }

    public void setCenterIfNoTextEnabled(boolean z) {
        this.f15470 = z;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        setCheckedState(z ? 1 : 0);
    }

    public void setCheckedState(int i) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.f15471 != i) {
            this.f15471 = i;
            super.setChecked(i == 1);
            refreshDrawableState();
            if (Build.VERSION.SDK_INT >= 30 && this.f15472 == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (this.f15474) {
                return;
            }
            this.f15474 = true;
            LinkedHashSet linkedHashSet = this.f15468;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    throw AbstractC5078.m8675(it);
                }
            }
            if (this.f15471 != 2 && (onCheckedChangeListener = this.f15475) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            AutofillManager autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class);
            if (autofillManager != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.f15474 = false;
        }
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.f15469 = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i) {
        setErrorAccessibilityLabel(i != 0 ? getResources().getText(i) : null);
    }

    public void setErrorShown(boolean z) {
        if (this.f15478 == z) {
            return;
        }
        this.f15478 = z;
        refreshDrawableState();
        Iterator it = this.f15466.iterator();
        if (it.hasNext()) {
            throw AbstractC5078.m8675(it);
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f15475 = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.f15472 = charSequence;
        if (charSequence != null) {
            super.setStateDescription(charSequence);
        } else {
            if (Build.VERSION.SDK_INT < 30 || charSequence != null) {
                return;
            }
            super.setStateDescription(getButtonStateDescription());
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f15482 = z;
        if (z) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m8041() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        C5684 c5684;
        Drawable drawableMutate = this.f15464;
        ColorStateList colorStateList3 = this.f15465;
        PorterDuff.Mode buttonTintMode = getButtonTintMode();
        if (drawableMutate == null) {
            drawableMutate = null;
        } else if (colorStateList3 != null) {
            drawableMutate = drawableMutate.mutate();
            if (buttonTintMode != null) {
                drawableMutate.setTintMode(buttonTintMode);
            }
        }
        this.f15464 = drawableMutate;
        Drawable drawableMutate2 = this.f15463;
        ColorStateList colorStateList4 = this.f15481;
        PorterDuff.Mode mode = this.f15467;
        if (drawableMutate2 == null) {
            drawableMutate2 = null;
        } else if (colorStateList4 != null) {
            drawableMutate2 = drawableMutate2.mutate();
            if (mode != null) {
                drawableMutate2.setTintMode(mode);
            }
        }
        this.f15463 = drawableMutate2;
        int i = 1;
        if (this.f15473) {
            C3494 c3494 = this.f15477;
            if (c3494 != null) {
                C2580 c2580 = c3494.f11596;
                Drawable drawable = c3494.f5376;
                C2165 c2165 = this.f15479;
                if (drawable != null) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable;
                    C0904 c0904 = c2165.f7144;
                    if (c0904 == null) {
                        c0904 = new C0904(c2165);
                        c2165.f7144 = c0904;
                    }
                    animatedVectorDrawable.unregisterAnimationCallback(c0904);
                }
                ArrayList arrayList = c3494.f11592;
                if (arrayList != null && c2165 != null) {
                    arrayList.remove(c2165);
                    if (c3494.f11592.size() == 0 && (c5684 = c3494.f11594) != null) {
                        c2580.f8622.removeListener(c5684);
                        c3494.f11594 = null;
                    }
                }
                Drawable drawable2 = c3494.f5376;
                if (drawable2 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable2;
                    C0904 c0905 = c2165.f7144;
                    if (c0905 == null) {
                        c0905 = new C0904(c2165);
                        c2165.f7144 = c0905;
                    }
                    animatedVectorDrawable2.registerAnimationCallback(c0905);
                } else if (c2165 != null) {
                    ArrayList arrayList2 = c3494.f11592;
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        c3494.f11592 = arrayList2;
                    }
                    if (!arrayList2.contains(c2165)) {
                        c3494.f11592.add(c2165);
                        C5684 c5685 = c3494.f11594;
                        if (c5685 == null) {
                            c5685 = new C5684(i, c3494);
                            c3494.f11594 = c5685;
                        }
                        c2580.f8622.addListener(c5685);
                    }
                }
            }
            Drawable drawable3 = this.f15464;
            if ((drawable3 instanceof AnimatedStateListDrawable) && c3494 != null) {
                ((AnimatedStateListDrawable) drawable3).addTransition(R.id.checked, R.id.unchecked, c3494, false);
                ((AnimatedStateListDrawable) this.f15464).addTransition(R.id.indeterminate, R.id.unchecked, c3494, false);
            }
        }
        Drawable drawable4 = this.f15464;
        if (drawable4 != null && (colorStateList2 = this.f15465) != null) {
            drawable4.setTintList(colorStateList2);
        }
        Drawable drawable5 = this.f15463;
        if (drawable5 != null && (colorStateList = this.f15481) != null) {
            drawable5.setTintList(colorStateList);
        }
        Drawable drawable6 = this.f15464;
        Drawable drawable7 = this.f15463;
        if (drawable6 == null) {
            drawable6 = drawable7;
        } else if (drawable7 != null) {
            int intrinsicWidth = drawable7.getIntrinsicWidth();
            if (intrinsicWidth == -1) {
                intrinsicWidth = drawable6.getIntrinsicWidth();
            }
            int intrinsicHeight = drawable7.getIntrinsicHeight();
            if (intrinsicHeight == -1) {
                intrinsicHeight = drawable6.getIntrinsicHeight();
            }
            if (intrinsicWidth > drawable6.getIntrinsicWidth() || intrinsicHeight > drawable6.getIntrinsicHeight()) {
                float f = intrinsicWidth / intrinsicHeight;
                if (f >= drawable6.getIntrinsicWidth() / drawable6.getIntrinsicHeight()) {
                    int intrinsicWidth2 = drawable6.getIntrinsicWidth();
                    intrinsicHeight = (int) (intrinsicWidth2 / f);
                    intrinsicWidth = intrinsicWidth2;
                } else {
                    intrinsicHeight = drawable6.getIntrinsicHeight();
                    intrinsicWidth = (int) (f * intrinsicHeight);
                }
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable6, drawable7});
            layerDrawable.setLayerSize(1, intrinsicWidth, intrinsicHeight);
            layerDrawable.setLayerGravity(1, 17);
            drawable6 = layerDrawable;
        }
        super.setButtonDrawable(drawable6);
        refreshDrawableState();
    }

    @Override // p000.C5653, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.f15464 = drawable;
        this.f15473 = false;
        m8041();
    }
}
