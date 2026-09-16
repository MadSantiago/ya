package p000;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.Filterable;
import android.widget.ListAdapter;
import java.util.List;
import ru.bluecat.yandexmapspatcher.R;

/* JADX INFO: renamed from: ۦؚۣؖۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5615 extends C1123 {

    /* JADX INFO: renamed from: ۥؖ */
    public ColorStateList f18499;

    /* JADX INFO: renamed from: ۥَ */
    public final C0990 f18500;

    /* JADX INFO: renamed from: ۥٖ */
    public final AccessibilityManager f18501;

    /* JADX INFO: renamed from: ۥٙ */
    public int f18502;

    /* JADX INFO: renamed from: ۥۖ */
    public final float f18503;

    /* JADX INFO: renamed from: ۦٕ */
    public ColorStateList f18504;

    /* JADX INFO: renamed from: ۦٗ */
    public final int[] f18505;

    /* JADX INFO: renamed from: ۦۛ */
    public final int f18506;

    public C5615(Context context, AttributeSet attributeSet) {
        super(AbstractC2765.m5150(context, attributeSet, R.attr.autoCompleteTextViewStyle, 0, new int[0]), attributeSet);
        this.f18505 = new int[]{android.R.attr.state_selected};
        new Rect();
        Context context2 = getContext();
        C5063.m8618(context2, attributeSet, R.attr.autoCompleteTextViewStyle, R.style.Widget_AppCompat_AutoCompleteTextView);
        int[] iArr = AbstractC0980.f3450;
        C5063.m8620(context2, attributeSet, iArr, R.attr.autoCompleteTextViewStyle, R.style.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, R.attr.autoCompleteTextViewStyle, R.style.Widget_AppCompat_AutoCompleteTextView);
        if (typedArrayObtainStyledAttributes.hasValue(0) && typedArrayObtainStyledAttributes.getInt(0, 0) == 0) {
            setKeyListener(null);
        }
        this.f18506 = typedArrayObtainStyledAttributes.getResourceId(3, R.layout.mtrl_auto_complete_simple_item);
        int i = 1;
        this.f18503 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            this.f18504 = ColorStateList.valueOf(typedArrayObtainStyledAttributes.getColor(2, 0));
        }
        this.f18502 = typedArrayObtainStyledAttributes.getColor(4, 0);
        this.f18499 = AbstractC4225.m7448(context2, typedArrayObtainStyledAttributes, 5);
        this.f18501 = (AccessibilityManager) context2.getSystemService("accessibility");
        C0990 c0990 = new C0990(context2, null, R.attr.listPopupWindowStyle, 0);
        this.f18500 = c0990;
        c0990.f3493 = true;
        C2245 c2245 = c0990.f3515;
        c2245.setFocusable(true);
        c0990.f3495 = this;
        c2245.setInputMethodMode(2);
        c0990.mo2104(getAdapter());
        c0990.f3513 = new C1494(i, this);
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            setSimpleItems(typedArrayObtainStyledAttributes.getResourceId(6, 0));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.widget.AutoCompleteTextView
    public final void dismissDropDown() {
        if (m9463()) {
            this.f18500.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    public ColorStateList getDropDownBackgroundTintList() {
        return this.f18504;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        m9464();
        return super.getHint();
    }

    public float getPopupElevation() {
        return this.f18503;
    }

    public int getSimpleItemSelectedColor() {
        return this.f18502;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.f18499;
    }

    @Override // android.widget.AutoCompleteTextView
    public final boolean isPopupShowing() {
        C0990 c0990 = this.f18500;
        if (c0990 == null || !c0990.f3515.isShowing()) {
            return super.isPopupShowing();
        }
        return true;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m9464();
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f18500.dismiss();
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (isPopupShowing()) {
            return super.onKeyDown(i, keyEvent);
        }
        boolean z = i == 66 || i == 23;
        boolean z2 = i == 62;
        if (getKeyListener() == null ? !(z || z2) : !(z && getMaxLines() == 1)) {
            return super.onKeyDown(i, keyEvent);
        }
        m9464();
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            getAdapter();
            m9464();
            setMeasuredDimension(Math.min(Math.max(measuredWidth, 0), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z) {
        if (m9463()) {
            return;
        }
        super.onWindowFocusChanged(z);
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t) {
        super.setAdapter(t);
        this.f18500.mo2104(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        C0990 c0990 = this.f18500;
        if (c0990 != null) {
            c0990.m2108(drawable);
        }
    }

    public void setDropDownBackgroundTint(int i) {
        setDropDownBackgroundTintList(ColorStateList.valueOf(i));
    }

    public void setDropDownBackgroundTintList(ColorStateList colorStateList) {
        this.f18504 = colorStateList;
        Drawable dropDownBackground = getDropDownBackground();
        if (dropDownBackground instanceof C3472) {
            C3472 c3472 = (C3472) dropDownBackground;
            ColorStateList colorStateList2 = this.f18504;
            C4488 c4488 = c3472.f11547;
            if (c4488.f14828 != colorStateList2) {
                c4488.f14828 = colorStateList2;
                c3472.onStateChange(c3472.getState());
            }
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.f18500.f3499 = getOnItemSelectedListener();
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i) {
        super.setRawInputType(i);
        m9464();
    }

    public void setSimpleItemSelectedColor(int i) {
        this.f18502 = i;
        if (getAdapter() instanceof C5282) {
            ((C5282) getAdapter()).m8917();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.f18499 = colorStateList;
        if (getAdapter() instanceof C5282) {
            ((C5282) getAdapter()).m8917();
        }
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new C5282(this, getContext(), this.f18506, strArr));
    }

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() {
        if (m9463()) {
            this.f18500.mo1020();
        } else {
            super.showDropDown();
        }
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final boolean m9463() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = this.f18501;
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            return true;
        }
        if (accessibilityManager == null || !accessibilityManager.isEnabled() || (enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16)) == null) {
            return false;
        }
        for (AccessibilityServiceInfo accessibilityServiceInfo : enabledAccessibilityServiceList) {
            if (accessibilityServiceInfo.getSettingsActivityName() != null && accessibilityServiceInfo.getSettingsActivityName().contains("SwitchAccess")) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final void m9464() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
        }
    }

    public void setSimpleItems(int i) {
        setSimpleItems(getResources().getStringArray(i));
    }
}
