package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import p000.AbstractC0179;
import p000.AbstractC5618;
import p000.C5237;
import ru.bluecat.yandexmapspatcher.R;

/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* JADX INFO: renamed from: ۥَ */
    public Drawable f32;

    /* JADX INFO: renamed from: ۥْ */
    public View f33;

    /* JADX INFO: renamed from: ۥٓ */
    public Drawable f34;

    /* JADX INFO: renamed from: ۥٖ */
    public Drawable f35;

    /* JADX INFO: renamed from: ۥۖ */
    public final int f36;

    /* JADX INFO: renamed from: ۦٗ */
    public final boolean f37;

    /* JADX INFO: renamed from: ۦۛ */
    public boolean f38;

    /* JADX INFO: renamed from: ۦ۟ */
    public View f39;

    /* JADX INFO: renamed from: ۦۨ */
    public boolean f40;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new C5237(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC5618.f18520);
        boolean z = false;
        this.f34 = typedArrayObtainStyledAttributes.getDrawable(0);
        this.f32 = typedArrayObtainStyledAttributes.getDrawable(2);
        this.f36 = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f37 = true;
            this.f35 = typedArrayObtainStyledAttributes.getDrawable(1);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.f37 ? !(this.f34 != null || this.f32 != null) : this.f35 == null) {
            z = true;
        }
        setWillNotDraw(z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f34;
        if (drawable != null && drawable.isStateful()) {
            this.f34.setState(getDrawableState());
        }
        Drawable drawable2 = this.f32;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f32.setState(getDrawableState());
        }
        Drawable drawable3 = this.f35;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f35.setState(getDrawableState());
    }

    public View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f34;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f32;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f35;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f39 = findViewById(R.id.action_bar);
        this.f33 = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f40 || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        boolean z2 = true;
        if (this.f37) {
            Drawable drawable = this.f35;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z2 = false;
            }
        } else {
            if (this.f34 == null) {
                z2 = false;
            } else if (this.f39.getVisibility() == 0) {
                this.f34.setBounds(this.f39.getLeft(), this.f39.getTop(), this.f39.getRight(), this.f39.getBottom());
            } else {
                View view = this.f33;
                if (view == null || view.getVisibility() != 0) {
                    this.f34.setBounds(0, 0, 0, 0);
                } else {
                    this.f34.setBounds(this.f33.getLeft(), this.f33.getTop(), this.f33.getRight(), this.f33.getBottom());
                }
            }
            this.f38 = false;
        }
        if (z2) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        if (this.f39 == null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && (i3 = this.f36) >= 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i3, View.MeasureSpec.getSize(i2)), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.f39 == null) {
            return;
        }
        View.MeasureSpec.getMode(i2);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f34;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f34);
        }
        this.f34 = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f39;
            if (view != null) {
                this.f34.setBounds(view.getLeft(), this.f39.getTop(), this.f39.getRight(), this.f39.getBottom());
            }
        }
        boolean z = false;
        if (!this.f37 ? !(this.f34 != null || this.f32 != null) : this.f35 == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f35;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f35);
        }
        this.f35 = drawable;
        boolean z = this.f37;
        boolean z2 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z && (drawable2 = this.f35) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z ? !(this.f34 != null || this.f32 != null) : this.f35 == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.f32;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f32);
        }
        this.f32 = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f38 && this.f32 != null) {
                throw null;
            }
        }
        boolean z = false;
        if (!this.f37 ? !(this.f34 != null || this.f32 != null) : this.f35 == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setTransitioning(boolean z) {
        this.f40 = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f34;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.f32;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.f35;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.f34;
        boolean z = this.f37;
        if (drawable == drawable2 && !z) {
            return true;
        }
        if (drawable == this.f32 && this.f38) {
            return true;
        }
        return (drawable == this.f35 && z) || super.verifyDrawable(drawable);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    public void setTabContainer(AbstractC0179 abstractC0179) {
    }

    public ActionBarContainer(Context context) {
        this(context, null);
    }
}
