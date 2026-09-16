package com.google.android.material.focus;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.view.animation.OvershootInterpolator;
import java.io.IOException;
import java.lang.ref.WeakReference;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p000.AbstractC0980;
import p000.AbstractC2776;
import p000.C0074;
import p000.C0175;
import p000.C1207;
import p000.C1235;
import p000.C1298;
import p000.C3472;
import p000.C4040;
import p000.C4928;
import p000.C5684;
import p000.InterfaceC3388;

/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class FocusRingDrawable extends DrawableWrapper {

    /* JADX INFO: renamed from: ۥؓ */
    public boolean f327;

    /* JADX INFO: renamed from: ۥؖ */
    public boolean f328;

    /* JADX INFO: renamed from: ۥً */
    public C1207 f329;

    /* JADX INFO: renamed from: ۥَ */
    public final Path f330;

    /* JADX INFO: renamed from: ۥْ */
    public final Rect f331;

    /* JADX INFO: renamed from: ۥٓ */
    public final Path f332;

    /* JADX INFO: renamed from: ۥٖ */
    public final Matrix f333;

    /* JADX INFO: renamed from: ۥٙ */
    public float f334;

    /* JADX INFO: renamed from: ۥۖ */
    public float f335;

    /* JADX INFO: renamed from: ۥۧ */
    public boolean f336;

    /* JADX INFO: renamed from: ۦٕ */
    public ObjectAnimator f337;

    /* JADX INFO: renamed from: ۦٗ */
    public final C0175 f338;

    /* JADX INFO: renamed from: ۦۛ */
    public WeakReference f339;

    /* JADX INFO: renamed from: ۦ۟ */
    public final RectF f340;

    /* JADX INFO: renamed from: ۦۨ */
    public final Paint f341;

    /* JADX INFO: renamed from: ۦٚ */
    public static final ColorDrawable f326 = new ColorDrawable(0);

    /* JADX INFO: renamed from: ۥٕ */
    public static final int[] f323 = {R.attr.state_focused, R.attr.state_window_focused};

    /* JADX INFO: renamed from: ۥۙ */
    public static final OvershootInterpolator f324 = new OvershootInterpolator(4.0f);

    /* JADX INFO: renamed from: ۦؙ */
    public static final C1235 f325 = new C1235("interpolation");

    public FocusRingDrawable(C1207 c1207, Resources resources) {
        super(null);
        Paint paint = new Paint(1);
        this.f341 = paint;
        this.f340 = new RectF();
        this.f331 = new Rect();
        this.f332 = new Path();
        this.f330 = new Path();
        this.f333 = new Matrix();
        this.f338 = C0175.m365();
        this.f335 = -1.0f;
        this.f334 = 1.0f;
        this.f327 = false;
        this.f336 = false;
        C1207 c1208 = new C1207(c1207);
        this.f329 = c1208;
        Drawable.ConstantState constantState = c1208.f4168;
        if (constantState != null) {
            setDrawable(resources != null ? constantState.newDrawable(resources) : constantState.newDrawable());
        }
        paint.setStyle(Paint.Style.STROKE);
        if (Float.isNaN(this.f329.f4172)) {
            return;
        }
        paint.setStrokeWidth(this.f329.f4172);
    }

    /* JADX INFO: renamed from: ۥؗ */
    public static int m125(TypedArray typedArray, int i) {
        if (typedArray.getType(i) != 2) {
            return Integer.MIN_VALUE;
        }
        TypedValue typedValue = new TypedValue();
        if (typedArray.getValue(i, typedValue)) {
            return typedValue.data;
        }
        return Integer.MIN_VALUE;
    }

    /* JADX INFO: renamed from: ۥُ */
    public static float m126(float f, Resources.Theme theme, int i, TypedArray typedArray, int i2, int i3) {
        if (!Float.isNaN(f)) {
            return f;
        }
        Resources resources = theme.getResources();
        if (i != Float.MIN_VALUE) {
            TypedValue typedValue = new TypedValue();
            if (theme.resolveAttribute(i, typedValue, true)) {
                return typedValue.getDimension(resources.getDisplayMetrics());
            }
        }
        float dimension = typedArray.getDimension(i2, Float.NaN);
        if (!Float.isNaN(dimension)) {
            return dimension;
        }
        if (i3 == 0) {
            return Float.NaN;
        }
        return resources.getDimension(i3);
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        m130(theme);
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0049  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c9  */
    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float fMax;
        Drawable drawable;
        int radius;
        super.draw(canvas);
        C1207 c1207 = this.f329;
        if (c1207.f4158 && this.f327) {
            float f = c1207.f4180;
            float f2 = c1207.f4172 / 2.0f;
            float f3 = this.f334;
            float f4 = (f2 * f3) + f;
            float f5 = ((c1207.f4170 / 2.0f) * f3) + f + c1207.f4163;
            Path path = this.f330;
            if (path.isEmpty()) {
                WeakReference weakReference = this.f339;
                if (weakReference == null || weakReference.get() == null) {
                    path = null;
                } else {
                    path = ((C3472) this.f339.get()).f11532;
                    if (path.isEmpty()) {
                        path = null;
                    }
                }
            }
            Path path2 = path;
            C1207 c1208 = this.f329;
            if (path2 != null) {
                m128(canvas, path2, f5, c1208.f4170, c1208.f4167);
                C1207 c1209 = this.f329;
                m128(canvas, path2, f4, c1209.f4172, c1209.f4161);
                return;
            }
            if (Float.isNaN(c1208.f4178)) {
                fMax = this.f335;
                if (fMax < 0.0f) {
                    WeakReference weakReference2 = this.f339;
                    if (weakReference2 == null || weakReference2.get() == null) {
                        drawable = getDrawable();
                        if ((drawable instanceof RippleDrawable) || (radius = ((RippleDrawable) drawable).getRadius()) < 0) {
                            fMax = 0.0f;
                        } else {
                            fMax = radius;
                        }
                    } else {
                        C3472 c3472 = (C3472) this.f339.get();
                        float fM6265 = c3472.m6265(c3472.m6263(), c3472.f11547.f14833.mo5482(), c3472.f11529);
                        if (fM6265 >= 0.0f) {
                            fM6265 *= c3472.f11547.f14838;
                        }
                        if (fM6265 >= 0.0f) {
                            fMax = Math.max(0.0f, fM6265 - (this.f329.f4172 / 2.0f));
                        } else {
                            drawable = getDrawable();
                            if (drawable instanceof RippleDrawable) {
                                fMax = 0.0f;
                            } else {
                                fMax = 0.0f;
                            }
                        }
                    }
                }
            } else {
                fMax = this.f329.f4178;
            }
            float fMax2 = Math.max(0.0f, fMax - (this.f329.f4172 / 2.0f));
            C1207 c12010 = this.f329;
            float f6 = c12010.f4170;
            int i = c12010.f4167;
            RectF rectF = this.f340;
            m129(rectF);
            rectF.inset(f5, f5);
            float f7 = f6 * this.f334;
            Paint paint = this.f341;
            paint.setStrokeWidth(f7);
            paint.setColor(i);
            canvas.drawRoundRect(rectF, fMax2, fMax2, paint);
            C1207 c12011 = this.f329;
            float f8 = c12011.f4172;
            int i2 = c12011.f4161;
            m129(rectF);
            rectF.inset(f4, f4);
            paint.setStrokeWidth(f8 * this.f334);
            paint.setColor(i2);
            canvas.drawRoundRect(rectF, fMax, fMax, paint);
        }
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        C1207 c1207 = this.f329;
        if (c1207.f4168 == null) {
            return null;
        }
        c1207.f4166 = getChangingConfigurations();
        return this.f329;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean hasFocusStateSpecified() {
        try {
            return super.hasFocusStateSpecified() || this.f329.f4158;
        } catch (NoSuchMethodError unused) {
            return this.f329.f4158;
        }
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        super.inflate(resources, xmlPullParser, attributeSet, theme);
        int[] iArr = AbstractC0980.f3449;
        TypedArray typedArrayObtainStyledAttributes = theme != null ? theme.obtainStyledAttributes(attributeSet, iArr, 0, 0) : resources.obtainAttributes(attributeSet, iArr);
        this.f329.f4169 = m125(typedArrayObtainStyledAttributes, 0);
        if (this.f329.f4169 == Integer.MIN_VALUE && typedArrayObtainStyledAttributes.hasValue(0)) {
            C1207 c1207 = this.f329;
            c1207.f4158 = typedArrayObtainStyledAttributes.getBoolean(0, c1207.f4158);
            this.f329.f4160 = true;
        }
        this.f329.f4177 = m125(typedArrayObtainStyledAttributes, 5);
        C1207 c1208 = this.f329;
        if (c1208.f4177 == Integer.MIN_VALUE) {
            c1208.f4161 = typedArrayObtainStyledAttributes.getColor(5, Integer.MIN_VALUE);
        }
        this.f329.f4175 = m125(typedArrayObtainStyledAttributes, 1);
        C1207 c1209 = this.f329;
        if (c1209.f4175 == Integer.MIN_VALUE) {
            c1209.f4167 = typedArrayObtainStyledAttributes.getColor(1, Integer.MIN_VALUE);
        }
        this.f329.f4176 = m125(typedArrayObtainStyledAttributes, 6);
        C1207 c12010 = this.f329;
        if (c12010.f4176 == Integer.MIN_VALUE) {
            c12010.f4172 = typedArrayObtainStyledAttributes.getDimension(6, Float.NaN);
        }
        this.f329.f4171 = m125(typedArrayObtainStyledAttributes, 3);
        C1207 c12011 = this.f329;
        if (c12011.f4171 == Integer.MIN_VALUE) {
            c12011.f4170 = typedArrayObtainStyledAttributes.getDimension(3, Float.NaN);
        }
        this.f329.f4171 = m125(typedArrayObtainStyledAttributes, 3);
        C1207 c12012 = this.f329;
        if (c12012.f4171 == Integer.MIN_VALUE) {
            c12012.f4170 = typedArrayObtainStyledAttributes.getDimension(3, Float.NaN);
        }
        this.f329.f4181 = m125(typedArrayObtainStyledAttributes, 7);
        C1207 c12013 = this.f329;
        if (c12013.f4181 == Integer.MIN_VALUE) {
            c12013.f4178 = typedArrayObtainStyledAttributes.getDimension(7, Float.NaN);
        }
        this.f329.f4162 = m125(typedArrayObtainStyledAttributes, 4);
        C1207 c12014 = this.f329;
        if (c12014.f4162 == Integer.MIN_VALUE) {
            c12014.f4180 = typedArrayObtainStyledAttributes.getDimension(4, Float.NaN);
        }
        this.f329.f4159 = m125(typedArrayObtainStyledAttributes, 2);
        C1207 c12015 = this.f329;
        if (c12015.f4159 == Integer.MIN_VALUE) {
            c12015.f4163 = typedArrayObtainStyledAttributes.getDimension(2, Float.NaN);
        }
        this.f329.f4179 = m125(typedArrayObtainStyledAttributes, 8);
        this.f329.f4174 = typedArrayObtainStyledAttributes.getType(8) == 1 ? typedArrayObtainStyledAttributes.getResourceId(8, Integer.MIN_VALUE) : Integer.MIN_VALUE;
        typedArrayObtainStyledAttributes.recycle();
        int depth = xmlPullParser.getDepth();
        Drawable drawableCreateFromXmlInner = null;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1 || (next == 3 && xmlPullParser.getDepth() <= depth)) {
                break;
            } else if (next == 2) {
                drawableCreateFromXmlInner = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
            }
        }
        if (drawableCreateFromXmlInner != null) {
            setDrawable(drawableCreateFromXmlInner);
            this.f329.f4168 = drawableCreateFromXmlInner.getConstantState();
        } else {
            ColorDrawable colorDrawable = f326;
            setDrawable(colorDrawable);
            this.f329.f4168 = colorDrawable.getConstantState();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isProjected() {
        Drawable drawable = getDrawable();
        return drawable != null && drawable.isProjected();
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return super.isStateful() || this.f329.f4158;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        super.jumpToCurrentState();
        ObjectAnimator objectAnimator = this.f337;
        if (objectAnimator != null) {
            objectAnimator.end();
            this.f337 = null;
        }
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.f336 && super.mutate() == this) {
            this.f329 = new C1207(this.f329);
            Drawable drawable = getDrawable();
            if (drawable != null) {
                this.f329.f4168 = drawable.getConstantState();
            }
            this.f336 = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        float[] cornerRadii;
        float cornerRadius;
        C4040 c4040;
        super.onBoundsChange(rect);
        C1207 c1207 = this.f329;
        if (c1207.f4158) {
            InterfaceC3388 interfaceC3388 = c1207.f4164;
            if (interfaceC3388 != null) {
                m127(interfaceC3388);
                return;
            }
            Drawable drawable = getDrawable();
            int i = 0;
            InterfaceC3388 interfaceC3389 = null;
            if (drawable instanceof ShapeDrawable) {
                Outline outline = new Outline();
                ((ShapeDrawable) drawable).getOutline(outline);
                if (outline.getRadius() > 0.0f) {
                    C4928 c4928 = new C4928();
                    C4928 c4929 = new C4928();
                    C4928 c49210 = new C4928();
                    C4928 c49211 = new C4928();
                    C1298 c1298 = new C1298(i);
                    C1298 c1299 = new C1298(i);
                    C1298 c12910 = new C1298(i);
                    C1298 c12911 = new C1298(i);
                    float radius = outline.getRadius();
                    C0074 c0074 = new C0074(radius);
                    C0074 c0075 = new C0074(radius);
                    C0074 c0076 = new C0074(radius);
                    C0074 c0077 = new C0074(radius);
                    c4040 = new C4040();
                    c4040.f13473 = c4928;
                    c4040.f13471 = c4929;
                    c4040.f13468 = c49210;
                    c4040.f13474 = c49211;
                    c4040.f13469 = c0074;
                    c4040.f13470 = c0075;
                    c4040.f13479 = c0076;
                    c4040.f13472 = c0077;
                    c4040.f13477 = c1298;
                    c4040.f13476 = c1299;
                    c4040.f13478 = c12910;
                    c4040.f13475 = c12911;
                    interfaceC3389 = c4040;
                }
            } else if (drawable instanceof GradientDrawable) {
                GradientDrawable gradientDrawable = (GradientDrawable) drawable;
                try {
                    cornerRadii = gradientDrawable.getCornerRadii();
                } catch (NullPointerException unused) {
                    cornerRadii = null;
                }
                if (cornerRadii != null) {
                    C4928 c49212 = new C4928();
                    C4928 c49213 = new C4928();
                    C4928 c49214 = new C4928();
                    C4928 c49215 = new C4928();
                    C1298 c12912 = new C1298(i);
                    C1298 c12913 = new C1298(i);
                    C1298 c12914 = new C1298(i);
                    C1298 c12915 = new C1298(i);
                    C0074 c0078 = new C0074(Math.min(cornerRadii[0], cornerRadii[1]));
                    C0074 c0079 = new C0074(Math.min(cornerRadii[2], cornerRadii[3]));
                    C0074 c00710 = new C0074(Math.min(cornerRadii[4], cornerRadii[5]));
                    C0074 c00711 = new C0074(Math.min(cornerRadii[6], cornerRadii[7]));
                    c4040 = new C4040();
                    c4040.f13473 = c49212;
                    c4040.f13471 = c49213;
                    c4040.f13468 = c49214;
                    c4040.f13474 = c49215;
                    c4040.f13469 = c0078;
                    c4040.f13470 = c0079;
                    c4040.f13479 = c00710;
                    c4040.f13472 = c00711;
                    c4040.f13477 = c12912;
                    c4040.f13476 = c12913;
                    c4040.f13478 = c12914;
                    c4040.f13475 = c12915;
                    interfaceC3389 = c4040;
                } else {
                    try {
                        cornerRadius = gradientDrawable.getCornerRadius();
                    } catch (NullPointerException unused2) {
                        cornerRadius = -1.0f;
                    }
                    if (cornerRadius > 0.0f) {
                        C4928 c49216 = new C4928();
                        C4928 c49217 = new C4928();
                        C4928 c49218 = new C4928();
                        C4928 c49219 = new C4928();
                        C1298 c12916 = new C1298(i);
                        C1298 c12917 = new C1298(i);
                        C1298 c12918 = new C1298(i);
                        C1298 c12919 = new C1298(i);
                        C0074 c00712 = new C0074(cornerRadius);
                        C0074 c00713 = new C0074(cornerRadius);
                        C0074 c00714 = new C0074(cornerRadius);
                        C0074 c00715 = new C0074(cornerRadius);
                        C4040 c4041 = new C4040();
                        c4041.f13473 = c49216;
                        c4041.f13471 = c49217;
                        c4041.f13468 = c49218;
                        c4041.f13474 = c49219;
                        c4041.f13469 = c00712;
                        c4041.f13470 = c00713;
                        c4041.f13479 = c00714;
                        c4041.f13472 = c00715;
                        c4041.f13477 = c12916;
                        c4041.f13476 = c12917;
                        c4041.f13478 = c12918;
                        c4041.f13475 = c12919;
                        interfaceC3389 = c4041;
                    }
                }
            }
            if (interfaceC3389 != null) {
                m127(interfaceC3389);
            } else {
                this.f335 = -1.0f;
                this.f330.reset();
            }
        }
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        C1207 c1207 = this.f329;
        if (!c1207.f4158) {
            this.f327 = false;
            return super.onStateChange(iArr);
        }
        boolean zStateSetMatches = StateSet.stateSetMatches(c1207.f4173, iArr);
        boolean z = this.f327 != zStateSetMatches;
        this.f327 = zStateSetMatches;
        if (z && iArr.length > 0 && !this.f328) {
            ObjectAnimator objectAnimator = this.f337;
            if (objectAnimator != null) {
                objectAnimator.cancel();
                this.f337 = null;
            }
            if (zStateSetMatches) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f325, 0.0f, 1.0f);
                objectAnimatorOfFloat.setDuration(300L);
                objectAnimatorOfFloat.setInterpolator(f324);
                objectAnimatorOfFloat.addListener(new C5684(2, this));
                this.f337 = objectAnimatorOfFloat;
                objectAnimatorOfFloat.start();
            } else {
                this.f334 = 1.0f;
            }
        }
        this.f328 = iArr.length == 0;
        return super.onStateChange(iArr) || z;
    }

    /* JADX INFO: renamed from: ۥّ */
    public final void m127(InterfaceC3388 interfaceC3388) {
        RectF rectF = this.f340;
        m129(rectF);
        C4040 c4040Mo5483 = interfaceC3388.mo5483(f323);
        boolean zM7239 = c4040Mo5483.m7239(rectF);
        Path path = this.f330;
        if (!zM7239) {
            this.f338.m371(c4040Mo5483, null, 1.0f, rectF, null, path);
            this.f335 = -1.0f;
            return;
        }
        C1207 c1207 = this.f329;
        float f = ((c1207.f4172 / 2.0f) * this.f334) + c1207.f4180;
        rectF.inset(f, f);
        this.f335 = c4040Mo5483.f13469.mo5840(rectF);
        path.reset();
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final void m128(Canvas canvas, Path path, float f, float f2, int i) {
        RectF rectF = this.f340;
        m129(rectF);
        float f3 = f * 2.0f;
        float fWidth = 1.0f - (f3 / rectF.width());
        float fHeight = 1.0f - (f3 / rectF.height());
        Matrix matrix = this.f333;
        matrix.reset();
        matrix.postScale(fWidth, fHeight, rectF.centerX(), rectF.centerY());
        Path path2 = this.f332;
        path.transform(matrix, path2);
        float f4 = f2 * this.f334;
        Paint paint = this.f341;
        paint.setStrokeWidth(f4);
        paint.setColor(i);
        canvas.drawPath(path2, paint);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m129(RectF rectF) {
        Rect rect = this.f329.f4165;
        if (rect != null) {
            rectF.set(rect);
            return;
        }
        WeakReference weakReference = this.f339;
        if (weakReference != null && weakReference.get() != null) {
            rectF.set(((C3472) this.f339.get()).getBounds());
            return;
        }
        if (!(getDrawable() instanceof RippleDrawable)) {
            rectF.set(getBounds());
            return;
        }
        RippleDrawable rippleDrawable = (RippleDrawable) getDrawable();
        Rect rect2 = this.f331;
        rippleDrawable.getHotspotBounds(rect2);
        int radius = rippleDrawable.getRadius();
        if (radius > 0) {
            rect2.inset(Math.max(0, (rect2.width() / 2) - radius), Math.max(0, (rect2.height() / 2) - radius));
        }
        rectF.set(rect2);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0052  */
    /* JADX WARN: Code duplicated, block: B:32:0x0074  */
    /* JADX INFO: renamed from: ۦؑ */
    public final void m130(Resources.Theme theme) {
        TypedValue typedValueM5253;
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(AbstractC0980.f3449);
        int i = this.f329.f4169;
        if (i != Integer.MIN_VALUE && (typedValueM5253 = AbstractC2776.m5253(theme, i)) != null) {
            C1207 c1207 = this.f329;
            c1207.f4158 = typedValueM5253.data != 0;
            c1207.f4160 = true;
        }
        C1207 c1208 = this.f329;
        if (!c1208.f4160) {
            c1208.f4158 = AbstractC2776.m5219(theme, ru.bluecat.yandexmapspatcher.R.attr.focusRingsEnabled, c1208.f4158);
        }
        C1207 c1209 = this.f329;
        if (c1209.f4158) {
            int color = c1209.f4161;
            int i2 = c1209.f4177;
            if (color == Integer.MIN_VALUE) {
                if (i2 != Integer.MIN_VALUE) {
                    TypedValue typedValue = new TypedValue();
                    if (theme.resolveAttribute(i2, typedValue, true)) {
                        color = typedValue.data;
                    } else {
                        color = typedArrayObtainStyledAttributes.getColor(5, -16777216);
                    }
                } else {
                    color = typedArrayObtainStyledAttributes.getColor(5, -16777216);
                }
            }
            c1209.f4161 = color;
            C1207 c12010 = this.f329;
            int color2 = c12010.f4167;
            int i3 = c12010.f4175;
            if (color2 == Integer.MIN_VALUE) {
                if (i3 != Integer.MIN_VALUE) {
                    TypedValue typedValue2 = new TypedValue();
                    if (theme.resolveAttribute(i3, typedValue2, true)) {
                        color2 = typedValue2.data;
                    } else {
                        color2 = typedArrayObtainStyledAttributes.getColor(1, -1);
                    }
                } else {
                    color2 = typedArrayObtainStyledAttributes.getColor(1, -1);
                }
            }
            c12010.f4167 = color2;
            C1207 c12011 = this.f329;
            c12011.f4172 = m126(c12011.f4172, theme, c12011.f4176, typedArrayObtainStyledAttributes, 6, ru.bluecat.yandexmapspatcher.R.dimen.mtrl_focus_ring_outer_stroke_width);
            C1207 c12012 = this.f329;
            c12012.f4170 = m126(c12012.f4170, theme, c12012.f4171, typedArrayObtainStyledAttributes, 3, ru.bluecat.yandexmapspatcher.R.dimen.mtrl_focus_ring_inner_stroke_width);
            C1207 c12013 = this.f329;
            c12013.f4178 = m126(c12013.f4178, theme, c12013.f4181, typedArrayObtainStyledAttributes, 7, 0);
            C1207 c12014 = this.f329;
            c12014.f4180 = m126(c12014.f4180, theme, c12014.f4162, typedArrayObtainStyledAttributes, 4, 0);
            if (Float.isNaN(this.f329.f4180)) {
                this.f329.f4180 = 0.0f;
            }
            C1207 c12015 = this.f329;
            c12015.f4163 = m126(c12015.f4163, theme, c12015.f4159, typedArrayObtainStyledAttributes, 2, ru.bluecat.yandexmapspatcher.R.dimen.mtrl_focus_ring_inner_stroke_inset);
            C1207 c12016 = this.f329;
            int i4 = c12016.f4174;
            int[] iArr = AbstractC0980.f3464;
            if (i4 != Integer.MIN_VALUE) {
                c12016.f4164 = C4040.m7237(theme.obtainStyledAttributes(i4, iArr), new C0074(0.0f)).m9723();
            } else {
                int i5 = c12016.f4179;
                if (i5 == Integer.MIN_VALUE) {
                    i5 = ru.bluecat.yandexmapspatcher.R.attr.focusRingsShapeAppearance;
                }
                TypedValue typedValueM5254 = AbstractC2776.m5253(theme, i5);
                if (typedValueM5254 != null) {
                    this.f329.f4164 = C4040.m7237(theme.obtainStyledAttributes(typedValueM5254.resourceId, iArr), new C0074(0.0f)).m9723();
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.f341;
        paint.setStyle(style);
        if (Float.isNaN(this.f329.f4172)) {
            return;
        }
        paint.setStrokeWidth(this.f329.f4172);
    }

    public FocusRingDrawable(Context context, Drawable drawable) {
        super(drawable);
        this.f341 = new Paint(1);
        this.f340 = new RectF();
        this.f331 = new Rect();
        this.f332 = new Path();
        this.f330 = new Path();
        this.f333 = new Matrix();
        this.f338 = C0175.m365();
        this.f335 = -1.0f;
        this.f334 = 1.0f;
        this.f327 = false;
        this.f336 = false;
        C1207 c1207 = new C1207(null);
        this.f329 = c1207;
        if (drawable != null) {
            c1207.f4168 = drawable.getConstantState();
        }
        m130(context.getTheme());
    }

    public FocusRingDrawable() {
        super(null);
        this.f341 = new Paint(1);
        this.f340 = new RectF();
        this.f331 = new Rect();
        this.f332 = new Path();
        this.f330 = new Path();
        this.f333 = new Matrix();
        this.f338 = C0175.m365();
        this.f335 = -1.0f;
        this.f334 = 1.0f;
        this.f327 = false;
        this.f336 = false;
        this.f329 = new C1207(null);
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
