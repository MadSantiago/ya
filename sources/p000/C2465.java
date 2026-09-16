package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;

/* JADX INFO: renamed from: ۥُ۟ؖۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class C2465 extends Button {

    /* JADX INFO: renamed from: ۥْ */
    public C4212 f8232;

    /* JADX INFO: renamed from: ۦ۟ */
    public final C5350 f8233;

    /* JADX INFO: renamed from: ۦۨ */
    public final C2186 f8234;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2465(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AbstractC2720.m5070(context);
        AbstractC5216.m8834(this, getContext());
        C2186 c2186 = new C2186(this);
        this.f8234 = c2186;
        c2186.m4251(attributeSet, i);
        C5350 c5350 = new C5350(this);
        this.f8233 = c5350;
        c5350.m8938(attributeSet, i);
        c5350.m8939();
        getEmojiTextViewHelper().m7434(attributeSet, i);
    }

    private C4212 getEmojiTextViewHelper() {
        C4212 c4212 = this.f8232;
        if (c4212 != null) {
            return c4212;
        }
        C4212 c4213 = new C4212(this);
        this.f8232 = c4213;
        return c4213;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C2186 c2186 = this.f8234;
        if (c2186 != null) {
            c2186.m4253();
        }
        C5350 c5350 = this.f8233;
        if (c5350 != null) {
            c5350.m8939();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (AbstractC4518.f14930) {
            return super.getAutoSizeMaxTextSize();
        }
        C5350 c5350 = this.f8233;
        if (c5350 != null) {
            return Math.round(c5350.f17615.f7839);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (AbstractC4518.f14930) {
            return super.getAutoSizeMinTextSize();
        }
        C5350 c5350 = this.f8233;
        if (c5350 != null) {
            return Math.round(c5350.f17615.f7844);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (AbstractC4518.f14930) {
            return super.getAutoSizeStepGranularity();
        }
        C5350 c5350 = this.f8233;
        if (c5350 != null) {
            return Math.round(c5350.f17615.f7838);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (AbstractC4518.f14930) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C5350 c5350 = this.f8233;
        return c5350 != null ? c5350.f17615.f7840 : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (AbstractC4518.f14930) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C5350 c5350 = this.f8233;
        if (c5350 != null) {
            return c5350.f17615.f7843;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof ActionModeCallbackC5077 ? ((ActionModeCallbackC5077) customSelectionActionModeCallback).f16838 : customSelectionActionModeCallback;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C2186 c2186 = this.f8234;
        if (c2186 != null) {
            return c2186.m4252();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C2186 c2186 = this.f8234;
        if (c2186 != null) {
            return c2186.m4254();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f8233.m8942();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f8233.m8937();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C5350 c5350 = this.f8233;
        if (c5350 == null || AbstractC4518.f14930) {
            return;
        }
        c5350.f17615.m4440();
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        C5350 c5350 = this.f8233;
        if (c5350 != null) {
            C2367 c2367 = c5350.f17615;
            if (AbstractC4518.f14930 || !c2367.m4438()) {
                return;
            }
            c2367.m4440();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().m7433(z);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (AbstractC4518.f14930) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        C5350 c5350 = this.f8233;
        if (c5350 != null) {
            c5350.m8940(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (AbstractC4518.f14930) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        C5350 c5350 = this.f8233;
        if (c5350 != null) {
            c5350.m8946(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (AbstractC4518.f14930) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        C5350 c5350 = this.f8233;
        if (c5350 != null) {
            c5350.m8945(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C2186 c2186 = this.f8234;
        if (c2186 != null) {
            c2186.m4258();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C2186 c2186 = this.f8234;
        if (c2186 != null) {
            c2186.m4257(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC4554.m7914(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().m7432(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((AbstractC0993) getEmojiTextViewHelper().f13981.f14025).mo2169(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z) {
        C5350 c5350 = this.f8233;
        if (c5350 != null) {
            c5350.f17610.setAllCaps(z);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C2186 c2186 = this.f8234;
        if (c2186 != null) {
            c2186.m4244(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C2186 c2186 = this.f8234;
        if (c2186 != null) {
            c2186.m4240(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C5350 c5350 = this.f8233;
        c5350.m8947(colorStateList);
        c5350.m8939();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C5350 c5350 = this.f8233;
        c5350.m8943(mode);
        c5350.m8939();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C5350 c5350 = this.f8233;
        if (c5350 != null) {
            c5350.m8948(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        boolean z = AbstractC4518.f14930;
        if (z) {
            super.setTextSize(i, f);
            return;
        }
        C5350 c5350 = this.f8233;
        if (c5350 != null) {
            C2367 c2367 = c5350.f17615;
            if (z || c2367.m4438()) {
                return;
            }
            c2367.m4444(i, f);
        }
    }
}
