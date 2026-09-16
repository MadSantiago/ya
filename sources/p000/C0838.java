package p000;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: ۥًؕؑؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0838 extends Drawable {

    /* JADX INFO: renamed from: ۥؗ */
    public final C5913 f2988;

    /* JADX INFO: renamed from: ۥُ */
    public final Drawable f2989;

    /* JADX INFO: renamed from: ۥّ */
    public Drawable f2990;

    /* JADX INFO: renamed from: ۥۗ */
    public final AbstractC1605 f2991;

    /* JADX INFO: renamed from: ۥۜ */
    public int f2992;

    /* JADX INFO: renamed from: ۥۣ */
    public final String f2993;

    /* JADX INFO: renamed from: ۦؑ */
    public final C4992 f2994;

    /* JADX INFO: renamed from: ۦِ */
    public boolean f2995;

    /* JADX INFO: renamed from: ۦٛ */
    public float f2996;

    /* JADX INFO: renamed from: ۦۗ */
    public boolean f2997 = false;

    /* JADX INFO: renamed from: ۦۙ */
    public C2607 f2998;

    public C0838(String str, AbstractC1605 abstractC1605, C4992 c4992, C5913 c5913) {
        this.f2993 = str;
        this.f2991 = abstractC1605;
        this.f2994 = c4992;
        this.f2988 = c5913;
        abstractC1605.getClass();
        this.f2989 = null;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (m1749()) {
            this.f2990.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        if (m1749()) {
            return this.f2990.getIntrinsicHeight();
        }
        return 1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        if (m1749()) {
            return this.f2990.getIntrinsicWidth();
        }
        return 1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        if (m1749()) {
            return this.f2990.getOpacity();
        }
        return -2;
    }

    public final String toString() {
        return "AsyncDrawable{destination='" + this.f2993 + "', imageSize=" + this.f2988 + ", result=" + this.f2990 + ", canvasWidth=" + this.f2992 + ", textSize=" + this.f2996 + ", waitingForDimensions=" + this.f2995 + '}';
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final void m1747(Drawable.Callback callback) {
        this.f2998 = callback == null ? null : new C2607(this, callback);
        setCallback(callback);
        C2607 c2607 = this.f2998;
        Drawable drawable = this.f2990;
        AbstractC1605 abstractC1605 = this.f2991;
        if (c2607 == null) {
            if (drawable != null) {
                drawable.setCallback(null);
                Object obj = this.f2990;
                if (obj instanceof Animatable) {
                    Animatable animatable = (Animatable) obj;
                    boolean zIsRunning = animatable.isRunning();
                    this.f2997 = zIsRunning;
                    if (zIsRunning) {
                        animatable.stop();
                    }
                }
            }
            abstractC1605.mo3376(this);
            return;
        }
        if (drawable != null && drawable.getCallback() == null) {
            this.f2990.setCallback(this.f2998);
        }
        Drawable drawable2 = this.f2990;
        boolean z = drawable2 == null || drawable2 == this.f2989;
        if (drawable2 != null) {
            drawable2.setCallback(this.f2998);
            Object obj2 = this.f2990;
            if ((obj2 instanceof Animatable) && this.f2997) {
                ((Animatable) obj2).start();
            }
        }
        if (z) {
            abstractC1605.mo3375(this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002b  */
    /* JADX INFO: renamed from: ۥۗ */
    public final void m1748() {
        Rect rect;
        int iM8380;
        Rect rect2;
        if (this.f2992 == 0) {
            this.f2995 = true;
            Drawable drawable = this.f2990;
            if (drawable != null) {
                rect2 = drawable.getBounds();
                if (rect2.isEmpty()) {
                    rect2 = new Rect(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                    if (rect2.isEmpty()) {
                        rect2 = new Rect(0, 0, 1, 1);
                    }
                }
            } else {
                rect2 = new Rect(0, 0, 1, 1);
            }
            setBounds(rect2);
            return;
        }
        this.f2995 = false;
        this.f2994.getClass();
        Rect bounds = this.f2990.getBounds();
        int i = this.f2992;
        float f = this.f2996;
        C5913 c5913 = this.f2988;
        if (c5913 == null) {
            int iWidth = bounds.width();
            if (iWidth > i) {
                bounds = new Rect(0, 0, i, (int) ((bounds.height() / (iWidth / i)) + 0.5f));
            }
        } else {
            C5163 c5163 = c5913.f19500;
            C5163 c5164 = c5913.f19499;
            float fWidth = bounds.width() / bounds.height();
            if (c5163 != null) {
                if ("%".equals(c5163.f17097)) {
                    iM8380 = (int) (((c5163.f17098 / 100.0f) * i) + 0.5f);
                } else {
                    iM8380 = C4992.m8380(c5163, f);
                }
                rect = new Rect(0, 0, iM8380, (c5164 == null || "%".equals(c5164.f17097)) ? (int) ((iM8380 / fWidth) + 0.5f) : C4992.m8380(c5164, f));
            } else if (c5164 != null && !"%".equals(c5164.f17097)) {
                int iM8381 = C4992.m8380(c5164, f);
                rect = new Rect(0, 0, (int) ((iM8381 * fWidth) + 0.5f), iM8381);
            }
            bounds = rect;
        }
        this.f2990.setBounds(bounds);
        this.f2990.setCallback(this.f2998);
        setBounds(bounds);
        invalidateSelf();
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final boolean m1749() {
        return this.f2990 != null;
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final void m1750(Drawable drawable) {
        this.f2997 = false;
        Drawable drawable2 = this.f2990;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f2990 = drawable;
        m1748();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
