package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import ru.bluecat.yandexmapspatcher.R;

/* JADX INFO: renamed from: ۥۦٍۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2839 extends CheckedTextView {

    /* JADX INFO: renamed from: ۥْ */
    public final C5350 f9481;

    /* JADX INFO: renamed from: ۥٓ */
    public C4212 f9482;

    /* JADX INFO: renamed from: ۦ۟ */
    public final C2186 f9483;

    /* JADX INFO: renamed from: ۦۨ */
    public final C3467 f9484;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2839(Context context, AttributeSet attributeSet) {
        int resourceId;
        int resourceId2;
        super(context, attributeSet, R.attr.checkedTextViewStyle);
        AbstractC2720.m5070(context);
        AbstractC5216.m8834(this, getContext());
        C5350 c5350 = new C5350(this);
        this.f9481 = c5350;
        c5350.m8938(attributeSet, R.attr.checkedTextViewStyle);
        c5350.m8939();
        C2186 c2186 = new C2186(this);
        this.f9483 = c2186;
        c2186.m4251(attributeSet, R.attr.checkedTextViewStyle);
        this.f9484 = new C3467(this);
        Context context2 = getContext();
        int[] iArr = AbstractC5618.f18522;
        C5460 c5460M9119 = C5460.m9119(context2, attributeSet, iArr, R.attr.checkedTextViewStyle);
        TypedArray typedArray = (TypedArray) c5460M9119.f17999;
        AbstractC3608.m6435(this, getContext(), iArr, attributeSet, (TypedArray) c5460M9119.f17999, R.attr.checkedTextViewStyle);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    setCheckMarkDrawable(AbstractC4225.m7464(getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                    if (typedArray.hasValue(0)) {
                        setCheckMarkDrawable(AbstractC4225.m7464(getContext(), resourceId));
                    }
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                setCheckMarkDrawable(AbstractC4225.m7464(getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                setCheckMarkTintList(c5460M9119.m9120(2));
            }
            if (typedArray.hasValue(3)) {
                setCheckMarkTintMode(AbstractC3522.m6315(typedArray.getInt(3, -1), null));
            }
            c5460M9119.m9126();
            getEmojiTextViewHelper().m7434(attributeSet, R.attr.checkedTextViewStyle);
        } catch (Throwable th) {
            c5460M9119.m9126();
            throw th;
        }
    }

    private C4212 getEmojiTextViewHelper() {
        C4212 c4212 = this.f9482;
        if (c4212 != null) {
            return c4212;
        }
        C4212 c4213 = new C4212(this);
        this.f9482 = c4213;
        return c4213;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C5350 c5350 = this.f9481;
        if (c5350 != null) {
            c5350.m8939();
        }
        C2186 c2186 = this.f9483;
        if (c2186 != null) {
            c2186.m4253();
        }
        C3467 c3467 = this.f9484;
        if (c3467 != null) {
            c3467.m6244();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof ActionModeCallbackC5077 ? ((ActionModeCallbackC5077) customSelectionActionModeCallback).f16838 : customSelectionActionModeCallback;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C2186 c2186 = this.f9483;
        if (c2186 != null) {
            return c2186.m4252();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C2186 c2186 = this.f9483;
        if (c2186 != null) {
            return c2186.m4254();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        C3467 c3467 = this.f9484;
        if (c3467 != null) {
            return (ColorStateList) c3467.f11505;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        C3467 c3467 = this.f9484;
        if (c3467 != null) {
            return (PorterDuff.Mode) c3467.f11504;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f9481.m8942();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f9481.m8937();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        AbstractC2164.m4200(inputConnectionOnCreateInputConnection, editorInfo, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().m7433(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C2186 c2186 = this.f9483;
        if (c2186 != null) {
            c2186.m4258();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C2186 c2186 = this.f9483;
        if (c2186 != null) {
            c2186.m4257(i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        C3467 c3467 = this.f9484;
        if (c3467 != null) {
            if (c3467.f11502) {
                c3467.f11502 = false;
            } else {
                c3467.f11502 = true;
                c3467.m6244();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C5350 c5350 = this.f9481;
        if (c5350 != null) {
            c5350.m8939();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C5350 c5350 = this.f9481;
        if (c5350 != null) {
            c5350.m8939();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC4554.m7914(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().m7432(z);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C2186 c2186 = this.f9483;
        if (c2186 != null) {
            c2186.m4244(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C2186 c2186 = this.f9483;
        if (c2186 != null) {
            c2186.m4240(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        C3467 c3467 = this.f9484;
        if (c3467 != null) {
            c3467.f11505 = colorStateList;
            c3467.f11501 = true;
            c3467.m6244();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        C3467 c3467 = this.f9484;
        if (c3467 != null) {
            c3467.f11504 = mode;
            c3467.f11506 = true;
            c3467.m6244();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C5350 c5350 = this.f9481;
        c5350.m8947(colorStateList);
        c5350.m8939();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C5350 c5350 = this.f9481;
        c5350.m8943(mode);
        c5350.m8939();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C5350 c5350 = this.f9481;
        if (c5350 != null) {
            c5350.m8948(context, i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(AbstractC4225.m7464(getContext(), i));
    }
}
