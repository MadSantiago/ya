package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.AbsSeekBar;
import ru.bluecat.yandexmapspatcher.R;

/* JADX INFO: renamed from: ۥۦٟؕؒ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2806 extends C5002 {

    /* JADX INFO: renamed from: ۥٖ */
    public final C0296 f9362;

    /* JADX INFO: renamed from: ۥٙ */
    public boolean f9363;

    /* JADX INFO: renamed from: ۥۖ */
    public PorterDuff.Mode f9364;

    /* JADX INFO: renamed from: ۦٕ */
    public boolean f9365;

    /* JADX INFO: renamed from: ۦٗ */
    public Drawable f9366;

    /* JADX INFO: renamed from: ۦۛ */
    public ColorStateList f9367;

    public C2806(C0296 c0296) {
        super((AbsSeekBar) c0296);
        this.f9367 = null;
        this.f9364 = null;
        this.f9365 = false;
        this.f9363 = false;
        this.f9362 = c0296;
    }

    @Override // p000.C5002
    /* JADX INFO: renamed from: ۥؓ */
    public final void mo5327(AttributeSet attributeSet, int i) {
        super.mo5327(attributeSet, R.attr.seekBarStyle);
        C0296 c0296 = this.f9362;
        Context context = c0296.getContext();
        int[] iArr = AbstractC5618.f18529;
        C5460 c5460M9119 = C5460.m9119(context, attributeSet, iArr, R.attr.seekBarStyle);
        TypedArray typedArray = (TypedArray) c5460M9119.f17999;
        AbstractC3608.m6435(c0296, c0296.getContext(), iArr, attributeSet, (TypedArray) c5460M9119.f17999, R.attr.seekBarStyle);
        Drawable drawableM9121 = c5460M9119.m9121(0);
        if (drawableM9121 != null) {
            c0296.setThumb(drawableM9121);
        }
        Drawable drawableM9123 = c5460M9119.m9123(1);
        Drawable drawable = this.f9366;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f9366 = drawableM9123;
        if (drawableM9123 != null) {
            drawableM9123.setCallback(c0296);
            drawableM9123.setLayoutDirection(c0296.getLayoutDirection());
            if (drawableM9123.isStateful()) {
                drawableM9123.setState(c0296.getDrawableState());
            }
            m5328();
        }
        c0296.invalidate();
        if (typedArray.hasValue(3)) {
            this.f9364 = AbstractC3522.m6315(typedArray.getInt(3, -1), this.f9364);
            this.f9363 = true;
        }
        if (typedArray.hasValue(2)) {
            this.f9367 = c5460M9119.m9120(2);
            this.f9365 = true;
        }
        c5460M9119.m9126();
        m5328();
    }

    /* JADX INFO: renamed from: ۦۜ */
    public final void m5328() {
        Drawable drawable = this.f9366;
        if (drawable != null) {
            if (this.f9365 || this.f9363) {
                Drawable drawableMutate = drawable.mutate();
                this.f9366 = drawableMutate;
                if (this.f9365) {
                    drawableMutate.setTintList(this.f9367);
                }
                if (this.f9363) {
                    this.f9366.setTintMode(this.f9364);
                }
                if (this.f9366.isStateful()) {
                    this.f9366.setState(this.f9362.getDrawableState());
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۦۣ */
    public final void m5329(Canvas canvas) {
        if (this.f9366 != null) {
            C0296 c0296 = this.f9362;
            int max = c0296.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f9366.getIntrinsicWidth();
                int intrinsicHeight = this.f9366.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f9366.setBounds(-i, -i2, i, i2);
                float width = ((c0296.getWidth() - c0296.getPaddingLeft()) - c0296.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(c0296.getPaddingLeft(), c0296.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.f9366.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }
}
