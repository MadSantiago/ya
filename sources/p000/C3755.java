package p000;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: renamed from: ۦٍُؑۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class C3755 extends TextView {

    /* JADX INFO: renamed from: ۥَ */
    public boolean f12496;

    /* JADX INFO: renamed from: ۥْ */
    public final C5002 f12497;

    /* JADX INFO: renamed from: ۥٓ */
    public C4212 f12498;

    /* JADX INFO: renamed from: ۥٖ */
    public C5086 f12499;

    /* JADX INFO: renamed from: ۦٗ */
    public Future f12500;

    /* JADX INFO: renamed from: ۦ۟ */
    public final C5350 f12501;

    /* JADX INFO: renamed from: ۦۨ */
    public final C2186 f12502;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3755(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AbstractC2720.m5070(context);
        this.f12496 = false;
        this.f12499 = null;
        AbstractC5216.m8834(this, getContext());
        C2186 c2186 = new C2186(this);
        this.f12502 = c2186;
        c2186.m4251(attributeSet, i);
        C5350 c5350 = new C5350(this);
        this.f12501 = c5350;
        c5350.m8938(attributeSet, i);
        c5350.m8939();
        C5002 c5002 = new C5002(9, false);
        c5002.f16551 = this;
        this.f12497 = c5002;
        getEmojiTextViewHelper().m7434(attributeSet, i);
    }

    private C4212 getEmojiTextViewHelper() {
        C4212 c4212 = this.f12498;
        if (c4212 != null) {
            return c4212;
        }
        C4212 c4213 = new C4212(this);
        this.f12498 = c4213;
        return c4213;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C2186 c2186 = this.f12502;
        if (c2186 != null) {
            c2186.m4253();
        }
        C5350 c5350 = this.f12501;
        if (c5350 != null) {
            c5350.m8939();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (AbstractC4518.f14930) {
            return super.getAutoSizeMaxTextSize();
        }
        C5350 c5350 = this.f12501;
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
        C5350 c5350 = this.f12501;
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
        C5350 c5350 = this.f12501;
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
        C5350 c5350 = this.f12501;
        return c5350 != null ? c5350.f17615.f7840 : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (AbstractC4518.f14930) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C5350 c5350 = this.f12501;
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

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public InterfaceC2262 getSuperCaller() {
        C5086 c5086 = this.f12499;
        if (c5086 != null) {
            return c5086;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            C3474 c3474 = new C3474(this);
            this.f12499 = c3474;
            return c3474;
        }
        if (i >= 28) {
            C5398 c5398 = new C5398(this);
            this.f12499 = c5398;
            return c5398;
        }
        C5086 c5087 = new C5086(5, this);
        this.f12499 = c5087;
        return c5087;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C2186 c2186 = this.f12502;
        if (c2186 != null) {
            return c2186.m4252();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C2186 c2186 = this.f12502;
        if (c2186 != null) {
            return c2186.m4254();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f12501.m8942();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f12501.m8937();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        Future future = this.f12500;
        if (future != null) {
            try {
                this.f12500 = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                AbstractC4554.m7881(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C5002 c5002;
        if (Build.VERSION.SDK_INT >= 28 || (c5002 = this.f12497) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) c5002.f16550;
        return textClassifier == null ? AbstractC0899.m1885((TextView) c5002.f16551) : textClassifier;
    }

    public C1844 getTextMetricsParamsCompat() {
        return AbstractC4554.m7881(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f12501.getClass();
        if (Build.VERSION.SDK_INT < 30 && inputConnectionOnCreateInputConnection != null) {
            AbstractC0487.m1062(editorInfo, getText());
        }
        AbstractC2164.m4200(inputConnectionOnCreateInputConnection, editorInfo, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 || i >= 33 || !onCheckIsTextEditor()) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C5350 c5350 = this.f12501;
        if (c5350 == null || AbstractC4518.f14930) {
            return;
        }
        c5350.f17615.m4440();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        Future future = this.f12500;
        if (future != null) {
            try {
                this.f12500 = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                AbstractC4554.m7881(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        C5350 c5350 = this.f12501;
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
        C5350 c5350 = this.f12501;
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
        C5350 c5350 = this.f12501;
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
        C5350 c5350 = this.f12501;
        if (c5350 != null) {
            c5350.m8945(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C2186 c2186 = this.f12502;
        if (c2186 != null) {
            c2186.m4258();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C2186 c2186 = this.f12502;
        if (c2186 != null) {
            c2186.m4257(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C5350 c5350 = this.f12501;
        if (c5350 != null) {
            c5350.m8939();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C5350 c5350 = this.f12501;
        if (c5350 != null) {
            c5350.m8939();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? AbstractC4225.m7464(context, i) : null, i2 != 0 ? AbstractC4225.m7464(context, i2) : null, i3 != 0 ? AbstractC4225.m7464(context, i3) : null, i4 != 0 ? AbstractC4225.m7464(context, i4) : null);
        C5350 c5350 = this.f12501;
        if (c5350 != null) {
            c5350.m8939();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? AbstractC4225.m7464(context, i) : null, i2 != 0 ? AbstractC4225.m7464(context, i2) : null, i3 != 0 ? AbstractC4225.m7464(context, i3) : null, i4 != 0 ? AbstractC4225.m7464(context, i4) : null);
        C5350 c5350 = this.f12501;
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

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((AbstractC0993) getEmojiTextViewHelper().f13981.f14025).mo2169(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().mo4306(i);
        } else {
            AbstractC4554.m7916(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().mo4304(i);
        } else {
            AbstractC4554.m7899(this, i);
        }
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i, float f) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34) {
            getSuperCaller().mo4305(i, f);
        } else if (i2 >= 34) {
            AbstractC0002.m177(this, i, f);
        } else {
            AbstractC4554.m7905(this, Math.round(TypedValue.applyDimension(i, f, getResources().getDisplayMetrics())));
        }
    }

    public void setPrecomputedText(AbstractC0244 abstractC0244) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        AbstractC4554.m7881(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C2186 c2186 = this.f12502;
        if (c2186 != null) {
            c2186.m4244(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C2186 c2186 = this.f12502;
        if (c2186 != null) {
            c2186.m4240(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C5350 c5350 = this.f12501;
        c5350.m8947(colorStateList);
        c5350.m8939();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C5350 c5350 = this.f12501;
        c5350.m8943(mode);
        c5350.m8939();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C5350 c5350 = this.f12501;
        if (c5350 != null) {
            c5350.m8948(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C5002 c5002;
        if (Build.VERSION.SDK_INT >= 28 || (c5002 = this.f12497) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c5002.f16550 = textClassifier;
        }
    }

    public void setTextFuture(Future<AbstractC0244> future) {
        this.f12500 = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(C1844 c1844) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = c1844.f6121;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i = 7;
            }
        }
        setTextDirection(i);
        getPaint().set(c1844.f6122);
        setBreakStrategy(c1844.f6120);
        setHyphenationFrequency(c1844.f6123);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        boolean z = AbstractC4518.f14930;
        if (z) {
            super.setTextSize(i, f);
            return;
        }
        C5350 c5350 = this.f12501;
        if (c5350 != null) {
            C2367 c2367 = c5350.f17615;
            if (z || c2367.m4438()) {
                return;
            }
            c2367.m4444(i, f);
        }
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i) {
        Typeface typefaceCreate;
        if (this.f12496) {
            return;
        }
        if (typeface == null || i <= 0) {
            typefaceCreate = null;
        } else {
            Context context = getContext();
            AbstractC1434 abstractC1434 = AbstractC3211.f10770;
            if (context == null) {
                C1078.m2272("Context cannot be null");
                return;
            }
            typefaceCreate = Typeface.create(typeface, i);
        }
        this.f12496 = true;
        if (typefaceCreate != null) {
            typeface = typefaceCreate;
        }
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.f12496 = false;
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        AbstractC4554.m7905(this, i);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C5350 c5350 = this.f12501;
        if (c5350 != null) {
            c5350.m8939();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C5350 c5350 = this.f12501;
        if (c5350 != null) {
            c5350.m8939();
        }
    }

    public C3755(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }
}
