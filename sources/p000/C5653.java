package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;
import ru.bluecat.yandexmapspatcher.R;

/* JADX INFO: renamed from: ۦؚۤؔٛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class C5653 extends CheckBox implements InterfaceC5779 {

    /* JADX INFO: renamed from: ۥْ */
    public final C5350 f18611;

    /* JADX INFO: renamed from: ۥٓ */
    public C4212 f18612;

    /* JADX INFO: renamed from: ۦ۟ */
    public final C2186 f18613;

    /* JADX INFO: renamed from: ۦۨ */
    public final C3467 f18614;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5653(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.checkboxStyle);
        AbstractC2720.m5070(context);
        AbstractC5216.m8834(this, getContext());
        C3467 c3467 = new C3467(this);
        this.f18614 = c3467;
        c3467.m6246(attributeSet, R.attr.checkboxStyle);
        C2186 c2186 = new C2186(this);
        this.f18613 = c2186;
        c2186.m4251(attributeSet, R.attr.checkboxStyle);
        C5350 c5350 = new C5350(this);
        this.f18611 = c5350;
        c5350.m8938(attributeSet, R.attr.checkboxStyle);
        getEmojiTextViewHelper().m7434(attributeSet, R.attr.checkboxStyle);
    }

    private C4212 getEmojiTextViewHelper() {
        C4212 c4212 = this.f18612;
        if (c4212 != null) {
            return c4212;
        }
        C4212 c4213 = new C4212(this);
        this.f18612 = c4213;
        return c4213;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C2186 c2186 = this.f18613;
        if (c2186 != null) {
            c2186.m4253();
        }
        C5350 c5350 = this.f18611;
        if (c5350 != null) {
            c5350.m8939();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C2186 c2186 = this.f18613;
        if (c2186 != null) {
            return c2186.m4252();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C2186 c2186 = this.f18613;
        if (c2186 != null) {
            return c2186.m4254();
        }
        return null;
    }

    @Override // p000.InterfaceC5779
    public ColorStateList getSupportButtonTintList() {
        C3467 c3467 = this.f18614;
        if (c3467 != null) {
            return (ColorStateList) c3467.f11505;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C3467 c3467 = this.f18614;
        if (c3467 != null) {
            return (PorterDuff.Mode) c3467.f11504;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f18611.m8942();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f18611.m8937();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().m7433(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C2186 c2186 = this.f18613;
        if (c2186 != null) {
            c2186.m4258();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C2186 c2186 = this.f18613;
        if (c2186 != null) {
            c2186.m4257(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C3467 c3467 = this.f18614;
        if (c3467 != null) {
            if (c3467.f11502) {
                c3467.f11502 = false;
            } else {
                c3467.f11502 = true;
                c3467.m6245();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C5350 c5350 = this.f18611;
        if (c5350 != null) {
            c5350.m8939();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C5350 c5350 = this.f18611;
        if (c5350 != null) {
            c5350.m8939();
        }
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().m7432(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((AbstractC0993) getEmojiTextViewHelper().f13981.f14025).mo2169(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C2186 c2186 = this.f18613;
        if (c2186 != null) {
            c2186.m4244(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C2186 c2186 = this.f18613;
        if (c2186 != null) {
            c2186.m4240(mode);
        }
    }

    @Override // p000.InterfaceC5779
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C3467 c3467 = this.f18614;
        if (c3467 != null) {
            c3467.f11505 = colorStateList;
            c3467.f11501 = true;
            c3467.m6245();
        }
    }

    @Override // p000.InterfaceC5779
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C3467 c3467 = this.f18614;
        if (c3467 != null) {
            c3467.f11504 = mode;
            c3467.f11506 = true;
            c3467.m6245();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C5350 c5350 = this.f18611;
        c5350.m8947(colorStateList);
        c5350.m8939();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C5350 c5350 = this.f18611;
        c5350.m8943(mode);
        c5350.m8939();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(AbstractC4225.m7464(getContext(), i));
    }
}
