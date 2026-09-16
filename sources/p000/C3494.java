package p000;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: ۦؘٜؕۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3494 extends AbstractC1602 implements Animatable {

    /* JADX INFO: renamed from: ۥْ */
    public final Context f11593;

    /* JADX INFO: renamed from: ۥٓ */
    public C5684 f11594 = null;

    /* JADX INFO: renamed from: ۥَ */
    public ArrayList f11592 = null;

    /* JADX INFO: renamed from: ۥٖ */
    public final C0733 f11595 = new C0733(0, this);

    /* JADX INFO: renamed from: ۦ۟ */
    public final C2580 f11596 = new C2580();

    public C3494(Context context) {
        this.f11593 = context;
    }

    @Override // p000.AbstractC1602, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f5376;
        if (drawable != null) {
            drawable.applyTheme(theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f5376;
        if (drawable != null) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f5376;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        C2580 c2580 = this.f11596;
        c2580.f8623.draw(canvas);
        if (c2580.f8622.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f5376;
        return drawable != null ? drawable.getAlpha() : this.f11596.f8623.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f5376;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f11596.getClass();
        return changingConfigurations;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f5376;
        return drawable != null ? drawable.getColorFilter() : this.f11596.f8623.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f5376 != null) {
            return new C5342(this.f5376.getConstantState());
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f5376;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f11596.f8623.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f5376;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f11596.f8623.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f5376;
        return drawable != null ? drawable.getOpacity() : this.f11596.f8623.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        C2580 c2580;
        Drawable drawable = this.f5376;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            c2580 = this.f11596;
            if (eventType == 1 || (xmlPullParser.getDepth() < depth && eventType == 3)) {
                break;
            }
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray typedArrayM431 = AbstractC0186.m431(resources, theme, attributeSet, C5063.f16805);
                    int resourceId = typedArrayM431.getResourceId(0, 0);
                    if (resourceId != 0) {
                        C3603 c3603 = new C3603();
                        ThreadLocal threadLocal = AbstractC2365.f7832;
                        c3603.f5376 = resources.getDrawable(resourceId, theme);
                        new C4942(c3603.f5376.getConstantState());
                        c3603.f12001 = false;
                        c3603.setCallback(this.f11595);
                        C3603 c3604 = c2580.f8623;
                        if (c3604 != null) {
                            c3604.setCallback(null);
                        }
                        c2580.f8623 = c3603;
                    }
                    typedArrayM431.recycle();
                } else if ("target".equals(name)) {
                    TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, C5063.f16810);
                    String string = typedArrayObtainAttributes.getString(0);
                    int resourceId2 = typedArrayObtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f11593;
                        if (context == null) {
                            typedArrayObtainAttributes.recycle();
                            C1078.m2276("Context can't be null when inflating animators");
                            return;
                        }
                        Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, resourceId2);
                        animatorLoadAnimator.setTarget(c2580.f8623.f12005.f428.f18932.get(string));
                        if (c2580.f8621 == null) {
                            c2580.f8621 = new ArrayList();
                            c2580.f8624 = new C4461(0);
                        }
                        c2580.f8621.add(animatorLoadAnimator);
                        c2580.f8624.put(animatorLoadAnimator, string);
                    }
                    typedArrayObtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        AnimatorSet animatorSet = c2580.f8622;
        if (animatorSet == null) {
            animatorSet = new AnimatorSet();
            c2580.f8622 = animatorSet;
        }
        animatorSet.playTogether(c2580.f8621);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f5376;
        return drawable != null ? drawable.isAutoMirrored() : this.f11596.f8623.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.f5376;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f11596.f8622.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f5376;
        return drawable != null ? drawable.isStateful() : this.f11596.f8623.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f5376;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f5376;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f11596.f8623.setBounds(rect);
        }
    }

    @Override // p000.AbstractC1602, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.f5376;
        return drawable != null ? drawable.setLevel(i) : this.f11596.f8623.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f5376;
        return drawable != null ? drawable.setState(iArr) : this.f11596.f8623.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f5376;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.f11596.f8623.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.f5376;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.f11596.f8623.setAutoMirrored(z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f5376;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f11596.f8623.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f5376;
        if (drawable != null) {
            drawable.setTint(i);
        } else {
            this.f11596.f8623.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f5376;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        } else {
            this.f11596.f8623.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f5376;
        if (drawable != null) {
            drawable.setTintMode(mode);
        } else {
            this.f11596.f8623.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f5376;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.f11596.f8623.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.f5376;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        C2580 c2580 = this.f11596;
        if (c2580.f8622.isStarted()) {
            return;
        }
        c2580.f8622.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.f5376;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f11596.f8622.end();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
