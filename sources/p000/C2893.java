package p000;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;

/* JADX INFO: renamed from: ۥٖٕۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2893 extends MultiAutoCompleteTextView {

    /* JADX INFO: renamed from: ۥٓ */
    public static final int[] f9645 = {R.attr.popupBackground};

    /* JADX INFO: renamed from: ۥْ */
    public final C5002 f9646;

    /* JADX INFO: renamed from: ۦ۟ */
    public final C5350 f9647;

    /* JADX INFO: renamed from: ۦۨ */
    public final C2186 f9648;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2893(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, ru.bluecat.yandexmapspatcher.R.attr.autoCompleteTextViewStyle);
        AbstractC2720.m5070(context);
        AbstractC5216.m8834(this, getContext());
        C5460 c5460M9119 = C5460.m9119(getContext(), attributeSet, f9645, ru.bluecat.yandexmapspatcher.R.attr.autoCompleteTextViewStyle);
        if (((TypedArray) c5460M9119.f17999).hasValue(0)) {
            setDropDownBackgroundDrawable(c5460M9119.m9123(0));
        }
        c5460M9119.m9126();
        C2186 c2186 = new C2186(this);
        this.f9648 = c2186;
        c2186.m4251(attributeSet, ru.bluecat.yandexmapspatcher.R.attr.autoCompleteTextViewStyle);
        C5350 c5350 = new C5350(this);
        this.f9647 = c5350;
        c5350.m8938(attributeSet, ru.bluecat.yandexmapspatcher.R.attr.autoCompleteTextViewStyle);
        c5350.m8939();
        C5002 c5002 = new C5002(this, 8);
        this.f9646 = c5002;
        c5002.mo5327(attributeSet, ru.bluecat.yandexmapspatcher.R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = isFocusable();
        boolean zIsClickable = isClickable();
        boolean zIsLongClickable = isLongClickable();
        int inputType = getInputType();
        KeyListener keyListenerM8393 = c5002.m8393(keyListener);
        if (keyListenerM8393 == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerM8393);
        setRawInputType(inputType);
        setFocusable(zIsFocusable);
        setClickable(zIsClickable);
        setLongClickable(zIsLongClickable);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C2186 c2186 = this.f9648;
        if (c2186 != null) {
            c2186.m4253();
        }
        C5350 c5350 = this.f9647;
        if (c5350 != null) {
            c5350.m8939();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C2186 c2186 = this.f9648;
        if (c2186 != null) {
            return c2186.m4252();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C2186 c2186 = this.f9648;
        if (c2186 != null) {
            return c2186.m4254();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f9647.m8942();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f9647.m8937();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        AbstractC2164.m4200(inputConnectionOnCreateInputConnection, editorInfo, this);
        return this.f9646.m8414(inputConnectionOnCreateInputConnection);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C2186 c2186 = this.f9648;
        if (c2186 != null) {
            c2186.m4258();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C2186 c2186 = this.f9648;
        if (c2186 != null) {
            c2186.m4257(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C5350 c5350 = this.f9647;
        if (c5350 != null) {
            c5350.m8939();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C5350 c5350 = this.f9647;
        if (c5350 != null) {
            c5350.m8939();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(AbstractC4225.m7464(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.f9646.m8407(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f9646.m8393(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C2186 c2186 = this.f9648;
        if (c2186 != null) {
            c2186.m4244(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C2186 c2186 = this.f9648;
        if (c2186 != null) {
            c2186.m4240(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C5350 c5350 = this.f9647;
        c5350.m8947(colorStateList);
        c5350.m8939();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C5350 c5350 = this.f9647;
        c5350.m8943(mode);
        c5350.m8939();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C5350 c5350 = this.f9647;
        if (c5350 != null) {
            c5350.m8948(context, i);
        }
    }
}
