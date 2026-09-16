package p000;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.io.IOException;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: ۦؚؕۙۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3603 extends AbstractC1602 {

    /* JADX INFO: renamed from: ۦٕ */
    public static final PorterDuff.Mode f11997 = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: ۥَ */
    public boolean f11998;

    /* JADX INFO: renamed from: ۥْ */
    public PorterDuffColorFilter f11999;

    /* JADX INFO: renamed from: ۥٓ */
    public ColorFilter f12000;

    /* JADX INFO: renamed from: ۥٖ */
    public boolean f12001;

    /* JADX INFO: renamed from: ۥۖ */
    public final Rect f12002;

    /* JADX INFO: renamed from: ۦٗ */
    public final float[] f12003;

    /* JADX INFO: renamed from: ۦۛ */
    public final Matrix f12004;

    /* JADX INFO: renamed from: ۦ۟ */
    public C0108 f12005;

    public C3603() {
        this.f12001 = true;
        this.f12003 = new float[9];
        this.f12004 = new Matrix();
        this.f12002 = new Rect();
        C0108 c0108 = new C0108();
        c0108.f425 = null;
        c0108.f431 = f11997;
        c0108.f428 = new C5738();
        this.f12005 = c0108;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f5376;
        if (drawable == null) {
            return false;
        }
        drawable.canApplyTheme();
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f5376;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.f12002;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f12000;
        if (colorFilter == null) {
            colorFilter = this.f11999;
        }
        Matrix matrix = this.f12004;
        canvas.getMatrix(matrix);
        float[] fArr = this.f12003;
        matrix.getValues(fArr);
        float fAbs = Math.abs(fArr[0]);
        float fAbs2 = Math.abs(fArr[4]);
        float fAbs3 = Math.abs(fArr[1]);
        float fAbs4 = Math.abs(fArr[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iWidth = (int) (rect.width() * fAbs);
        int iHeight = (int) (rect.height() * fAbs2);
        int iMin = Math.min(2048, iWidth);
        int iMin2 = Math.min(2048, iHeight);
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(rect.left, rect.top);
        if (isAutoMirrored() && getLayoutDirection() == 1) {
            canvas.translate(rect.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        C0108 c0108 = this.f12005;
        Bitmap bitmap = c0108.f427;
        if (bitmap == null || iMin != bitmap.getWidth() || iMin2 != c0108.f427.getHeight()) {
            c0108.f427 = Bitmap.createBitmap(iMin, iMin2, Bitmap.Config.ARGB_8888);
            c0108.f435 = true;
        }
        boolean z = this.f12001;
        C0108 c0109 = this.f12005;
        if (!z) {
            c0109.f427.eraseColor(0);
            Canvas canvas2 = new Canvas(c0109.f427);
            C5738 c5738 = c0109.f428;
            c5738.m9543(c5738.f18930, C5738.f18917, canvas2, iMin, iMin2);
        } else if (c0109.f435 || c0109.f436 != c0109.f425 || c0109.f429 != c0109.f431 || c0109.f433 != c0109.f426 || c0109.f434 != c0109.f428.getRootAlpha()) {
            C0108 c01010 = this.f12005;
            c01010.f427.eraseColor(0);
            Canvas canvas3 = new Canvas(c01010.f427);
            C5738 c5739 = c01010.f428;
            c5739.m9543(c5739.f18930, C5738.f18917, canvas3, iMin, iMin2);
            C0108 c01011 = this.f12005;
            c01011.f436 = c01011.f425;
            c01011.f429 = c01011.f431;
            c01011.f434 = c01011.f428.getRootAlpha();
            c01011.f433 = c01011.f426;
            c01011.f435 = false;
        }
        C0108 c01012 = this.f12005;
        if (c01012.f428.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (c01012.f432 == null) {
                Paint paint2 = new Paint();
                c01012.f432 = paint2;
                paint2.setFilterBitmap(true);
            }
            c01012.f432.setAlpha(c01012.f428.getRootAlpha());
            c01012.f432.setColorFilter(colorFilter);
            paint = c01012.f432;
        }
        canvas.drawBitmap(c01012.f427, (Rect) null, rect, paint);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f5376;
        return drawable != null ? drawable.getAlpha() : this.f12005.f428.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f5376;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return this.f12005.getChangingConfigurations() | super.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f5376;
        return drawable != null ? drawable.getColorFilter() : this.f12000;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f5376 != null) {
            return new C4942(this.f5376.getConstantState());
        }
        this.f12005.f430 = getChangingConfigurations();
        return this.f12005;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f5376;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f12005.f428.f18928;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f5376;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f12005.f428.f18922;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f5376;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int i;
        int i2;
        int i3;
        int i4;
        Paint.Cap cap;
        Paint.Join join;
        Drawable drawable = this.f5376;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C0108 c0108 = this.f12005;
        c0108.f428 = new C5738();
        TypedArray typedArrayM431 = AbstractC0186.m431(resources, theme, attributeSet, C5063.f16813);
        C0108 c0109 = this.f12005;
        C5738 c5738 = c0109.f428;
        int i5 = !AbstractC0186.m408(xmlPullParser, "tintMode") ? -1 : typedArrayM431.getInt(6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        int i6 = 3;
        if (i5 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i5 != 5) {
            if (i5 != 9) {
                switch (i5) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        c0109.f431 = mode;
        ColorStateList colorStateListM420 = AbstractC0186.m420(typedArrayM431, xmlPullParser, theme);
        if (colorStateListM420 != null) {
            c0109.f425 = colorStateListM420;
        }
        boolean z = c0109.f426;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) {
            z = typedArrayM431.getBoolean(5, z);
        }
        c0109.f426 = z;
        float f = c5738.f18927;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportWidth") != null) {
            f = typedArrayM431.getFloat(7, f);
        }
        c5738.f18927 = f;
        float f2 = c5738.f18929;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportHeight") != null) {
            f2 = typedArrayM431.getFloat(8, f2);
        }
        c5738.f18929 = f2;
        if (c5738.f18927 <= 0.0f) {
            throw new XmlPullParserException(typedArrayM431.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f2 <= 0.0f) {
            throw new XmlPullParserException(typedArrayM431.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        c5738.f18922 = typedArrayM431.getDimension(3, c5738.f18922);
        int i7 = 2;
        float dimension = typedArrayM431.getDimension(2, c5738.f18928);
        c5738.f18928 = dimension;
        if (c5738.f18922 <= 0.0f) {
            throw new XmlPullParserException(typedArrayM431.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (dimension <= 0.0f) {
            throw new XmlPullParserException(typedArrayM431.getPositionDescription() + "<vector> tag requires height > 0");
        }
        float alpha = c5738.getAlpha();
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "alpha") != null) {
            alpha = typedArrayM431.getFloat(4, alpha);
        }
        c5738.setAlpha(alpha);
        String string = typedArrayM431.getString(0);
        if (string != null) {
            c5738.f18926 = string;
            c5738.f18932.put(string, c5738);
        }
        typedArrayM431.recycle();
        c0108.f430 = getChangingConfigurations();
        int i8 = 1;
        c0108.f435 = true;
        C0108 c01010 = this.f12005;
        C5738 c5739 = c01010.f428;
        ArrayDeque arrayDeque = new ArrayDeque();
        C5873 c5873 = c5739.f18930;
        C4461 c4461 = c5739.f18932;
        arrayDeque.push(c5873);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z2 = true;
        while (eventType != i8 && (xmlPullParser.getDepth() >= depth || eventType != i6)) {
            if (eventType == i7) {
                String name = xmlPullParser.getName();
                C5873 c5874 = (C5873) arrayDeque.peek();
                i = depth;
                if ("path".equals(name)) {
                    C1191 c1191 = new C1191();
                    c1191.f4100 = 0.0f;
                    c1191.f4109 = 1.0f;
                    c1191.f4102 = 1.0f;
                    c1191.f4107 = 0.0f;
                    c1191.f4106 = 1.0f;
                    c1191.f4108 = 0.0f;
                    Paint.Cap cap2 = Paint.Cap.BUTT;
                    c1191.f4104 = cap2;
                    Paint.Join join2 = Paint.Join.MITER;
                    c1191.f4105 = join2;
                    c1191.f4110 = 4.0f;
                    TypedArray typedArrayM432 = AbstractC0186.m431(resources, theme, attributeSet, C5063.f16804);
                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                        String string2 = typedArrayM432.getString(0);
                        if (string2 != null) {
                            c1191.f8806 = string2;
                        }
                        String string3 = typedArrayM432.getString(2);
                        if (string3 != null) {
                            c1191.f8807 = AbstractC3933.m7069(string3);
                        }
                        c1191.f4101 = AbstractC0186.m410(typedArrayM432, xmlPullParser, theme, "fillColor", 1);
                        float f3 = c1191.f4102;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") != null) {
                            f3 = typedArrayM432.getFloat(12, f3);
                        }
                        c1191.f4102 = f3;
                        int i9 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") != null ? typedArrayM432.getInt(8, -1) : -1;
                        Paint.Cap cap3 = c1191.f4104;
                        if (i9 == 0) {
                            cap = cap2;
                        } else if (i9 != 1) {
                            cap = i9 != 2 ? cap3 : Paint.Cap.SQUARE;
                        } else {
                            cap = Paint.Cap.ROUND;
                        }
                        c1191.f4104 = cap;
                        int i10 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") != null ? typedArrayM432.getInt(9, -1) : -1;
                        Paint.Join join3 = c1191.f4105;
                        if (i10 == 0) {
                            join = join2;
                        } else if (i10 != 1) {
                            join = i10 != 2 ? join3 : Paint.Join.BEVEL;
                        } else {
                            join = Paint.Join.ROUND;
                        }
                        c1191.f4105 = join;
                        float f4 = c1191.f4110;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") != null) {
                            f4 = typedArrayM432.getFloat(10, f4);
                        }
                        c1191.f4110 = f4;
                        c1191.f4103 = AbstractC0186.m410(typedArrayM432, xmlPullParser, theme, "strokeColor", 3);
                        float f5 = c1191.f4109;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") != null) {
                            f5 = typedArrayM432.getFloat(11, f5);
                        }
                        c1191.f4109 = f5;
                        float f6 = c1191.f4100;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") != null) {
                            f6 = typedArrayM432.getFloat(4, f6);
                        }
                        c1191.f4100 = f6;
                        float f7 = c1191.f4106;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") != null) {
                            f7 = typedArrayM432.getFloat(6, f7);
                        }
                        c1191.f4106 = f7;
                        float f8 = c1191.f4108;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") != null) {
                            f8 = typedArrayM432.getFloat(7, f8);
                        }
                        c1191.f4108 = f8;
                        float f9 = c1191.f4107;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") != null) {
                            f9 = typedArrayM432.getFloat(5, f9);
                        }
                        c1191.f4107 = f9;
                        int i11 = c1191.f8805;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") != null) {
                            i11 = typedArrayM432.getInt(13, i11);
                        }
                        c1191.f8805 = i11;
                    }
                    typedArrayM432.recycle();
                    c5874.f19395.add(c1191);
                    if (c1191.getPathName() != null) {
                        c4461.put(c1191.getPathName(), c1191);
                    }
                    c01010.f430 = c01010.f430;
                    i4 = 1;
                    z2 = false;
                } else {
                    if ("clip-path".equals(name)) {
                        C4364 c4364 = new C4364();
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                            TypedArray typedArrayM433 = AbstractC0186.m431(resources, theme, attributeSet, C5063.f16802);
                            String string4 = typedArrayM433.getString(0);
                            if (string4 != null) {
                                c4364.f8806 = string4;
                            }
                            String string5 = typedArrayM433.getString(1);
                            if (string5 != null) {
                                c4364.f8807 = AbstractC3933.m7069(string5);
                            }
                            c4364.f8805 = !AbstractC0186.m408(xmlPullParser, "fillType") ? 0 : typedArrayM433.getInt(2, 0);
                            typedArrayM433.recycle();
                        }
                        c5874.f19395.add(c4364);
                        if (c4364.getPathName() != null) {
                            c4461.put(c4364.getPathName(), c4364);
                        }
                        c01010.f430 = c01010.f430;
                    } else if ("group".equals(name)) {
                        C5873 c5875 = new C5873();
                        TypedArray typedArrayM434 = AbstractC0186.m431(resources, theme, attributeSet, C5063.f16803);
                        float f10 = c5875.f19392;
                        if (AbstractC0186.m408(xmlPullParser, "rotation")) {
                            f10 = typedArrayM434.getFloat(5, f10);
                        }
                        c5875.f19392 = f10;
                        i4 = 1;
                        c5875.f19398 = typedArrayM434.getFloat(1, c5875.f19398);
                        c5875.f19393 = typedArrayM434.getFloat(2, c5875.f19393);
                        float f11 = c5875.f19394;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleX") != null) {
                            f11 = typedArrayM434.getFloat(3, f11);
                        }
                        c5875.f19394 = f11;
                        float f12 = c5875.f19402;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleY") != null) {
                            f12 = typedArrayM434.getFloat(4, f12);
                        }
                        c5875.f19402 = f12;
                        float f13 = c5875.f19396;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateX") != null) {
                            f13 = typedArrayM434.getFloat(6, f13);
                        }
                        c5875.f19396 = f13;
                        float f14 = c5875.f19400;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateY") != null) {
                            f14 = typedArrayM434.getFloat(7, f14);
                        }
                        c5875.f19400 = f14;
                        String string6 = typedArrayM434.getString(0);
                        if (string6 != null) {
                            c5875.f19401 = string6;
                        }
                        c5875.m9689();
                        typedArrayM434.recycle();
                        c5874.f19395.add(c5875);
                        arrayDeque.push(c5875);
                        if (c5875.getGroupName() != null) {
                            c4461.put(c5875.getGroupName(), c5875);
                        }
                        c01010.f430 = c01010.f430;
                    }
                    i4 = 1;
                }
                i3 = i4;
                i2 = 3;
            } else {
                i = depth;
                i2 = i6;
                i3 = 1;
                if (eventType == i2 && "group".equals(xmlPullParser.getName())) {
                    arrayDeque.pop();
                }
            }
            eventType = xmlPullParser.next();
            i6 = i2;
            i8 = i3;
            depth = i;
            i7 = 2;
        }
        if (z2) {
            throw new XmlPullParserException("no path defined");
        }
        this.f11999 = m6416(c0108.f425, c0108.f431);
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f5376;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f5376;
        return drawable != null ? drawable.isAutoMirrored() : this.f12005.f426;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f5376;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        C0108 c0108 = this.f12005;
        if (c0108 == null) {
            return false;
        }
        C5738 c5738 = c0108.f428;
        Boolean boolValueOf = c5738.f18931;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(c5738.f18930.mo2509());
            c5738.f18931 = boolValueOf;
        }
        if (boolValueOf.booleanValue()) {
            return true;
        }
        ColorStateList colorStateList = this.f12005.f425;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f5376;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f11998 && super.mutate() == this) {
            C0108 c0108 = this.f12005;
            C0108 c0109 = new C0108();
            c0109.f425 = null;
            c0109.f431 = f11997;
            if (c0108 != null) {
                c0109.f430 = c0108.f430;
                C5738 c5738 = new C5738(c0108.f428);
                c0109.f428 = c5738;
                if (c0108.f428.f18919 != null) {
                    c5738.f18919 = new Paint(c0108.f428.f18919);
                }
                if (c0108.f428.f18924 != null) {
                    c0109.f428.f18924 = new Paint(c0108.f428.f18924);
                }
                c0109.f425 = c0108.f425;
                c0109.f431 = c0108.f431;
                c0109.f426 = c0108.f426;
            }
            this.f12005 = c0109;
            this.f11998 = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f5376;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z;
        PorterDuff.Mode mode;
        Drawable drawable = this.f5376;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        C0108 c0108 = this.f12005;
        ColorStateList colorStateList = c0108.f425;
        if (colorStateList == null || (mode = c0108.f431) == null) {
            z = false;
        } else {
            this.f11999 = m6416(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        C5738 c5738 = c0108.f428;
        Boolean boolValueOf = c5738.f18931;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(c5738.f18930.mo2509());
            c5738.f18931 = boolValueOf;
        }
        if (boolValueOf.booleanValue()) {
            boolean zMo2508 = c0108.f428.f18930.mo2508(iArr);
            c0108.f435 |= zMo2508;
            if (zMo2508) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.f5376;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f5376;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.f12005.f428.getRootAlpha() != i) {
            this.f12005.f428.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.f5376;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.f12005.f426 = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f5376;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f12000 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f5376;
        if (drawable != null) {
            drawable.setTint(i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f5376;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
            return;
        }
        C0108 c0108 = this.f12005;
        if (c0108.f425 != colorStateList) {
            c0108.f425 = colorStateList;
            this.f11999 = m6416(colorStateList, c0108.f431);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f5376;
        if (drawable != null) {
            drawable.setTintMode(mode);
            return;
        }
        C0108 c0108 = this.f12005;
        if (c0108.f431 != mode) {
            c0108.f431 = mode;
            this.f11999 = m6416(c0108.f425, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f5376;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f5376;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final PorterDuffColorFilter m6416(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public C3603(C0108 c0108) {
        this.f12001 = true;
        this.f12003 = new float[9];
        this.f12004 = new Matrix();
        this.f12002 = new Rect();
        this.f12005 = c0108;
        this.f11999 = m6416(c0108.f425, c0108.f431);
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f5376;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }
}
