package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.ImageView;

/* JADX INFO: renamed from: ۥّٙؗٞ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class C1685 extends ImageButton {

    /* JADX INFO: renamed from: ۥْ */
    public boolean f5608;

    /* JADX INFO: renamed from: ۦ۟ */
    public final C3510 f5609;

    /* JADX INFO: renamed from: ۦۨ */
    public final C2186 f5610;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1685(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AbstractC2720.m5070(context);
        this.f5608 = false;
        AbstractC5216.m8834(this, getContext());
        C2186 c2186 = new C2186(this);
        this.f5610 = c2186;
        c2186.m4251(attributeSet, i);
        C3510 c3510 = new C3510(this);
        this.f5609 = c3510;
        c3510.m6305(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C2186 c2186 = this.f5610;
        if (c2186 != null) {
            c2186.m4253();
        }
        C3510 c3510 = this.f5609;
        if (c3510 != null) {
            c3510.m6299();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C2186 c2186 = this.f5610;
        if (c2186 != null) {
            return c2186.m4252();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C2186 c2186 = this.f5610;
        if (c2186 != null) {
            return c2186.m4254();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        C1138 c1138;
        C3510 c3510 = this.f5609;
        if (c3510 == null || (c1138 = (C1138) c3510.f11624) == null) {
            return null;
        }
        return (ColorStateList) c1138.f3979;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        C1138 c1138;
        C3510 c3510 = this.f5609;
        if (c3510 == null || (c1138 = (C1138) c3510.f11624) == null) {
            return null;
        }
        return (PorterDuff.Mode) c1138.f3982;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.f5609.f11621).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C2186 c2186 = this.f5610;
        if (c2186 != null) {
            c2186.m4258();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C2186 c2186 = this.f5610;
        if (c2186 != null) {
            c2186.m4257(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C3510 c3510 = this.f5609;
        if (c3510 != null) {
            c3510.m6299();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        C3510 c3510 = this.f5609;
        if (c3510 != null && drawable != null && !this.f5608) {
            c3510.f11622 = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (c3510 != null) {
            c3510.m6299();
            if (this.f5608) {
                return;
            }
            ImageView imageView = (ImageView) c3510.f11621;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(c3510.f11622);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.f5608 = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        C3510 c3510 = this.f5609;
        ImageView imageView = (ImageView) c3510.f11621;
        if (i != 0) {
            Drawable drawableM7464 = AbstractC4225.m7464(imageView.getContext(), i);
            if (drawableM7464 != null) {
                AbstractC3522.m6316(drawableM7464);
            }
            imageView.setImageDrawable(drawableM7464);
        } else {
            imageView.setImageDrawable(null);
        }
        c3510.m6299();
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C3510 c3510 = this.f5609;
        if (c3510 != null) {
            c3510.m6299();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C2186 c2186 = this.f5610;
        if (c2186 != null) {
            c2186.m4244(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C2186 c2186 = this.f5610;
        if (c2186 != null) {
            c2186.m4240(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C3510 c3510 = this.f5609;
        if (c3510 != null) {
            C1138 c1138 = (C1138) c3510.f11624;
            if (c1138 == null) {
                c1138 = new C1138();
                c3510.f11624 = c1138;
            }
            c1138.f3979 = colorStateList;
            c1138.f3980 = true;
            c3510.m6299();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C3510 c3510 = this.f5609;
        if (c3510 != null) {
            C1138 c1138 = (C1138) c3510.f11624;
            if (c1138 == null) {
                c1138 = new C1138();
                c3510.f11624 = c1138;
            }
            c1138.f3982 = mode;
            c1138.f3981 = true;
            c3510.m6299();
        }
    }
}
