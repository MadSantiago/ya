package p000;

import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.util.Log;
import android.view.Choreographer;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Objects;

/* JADX INFO: renamed from: ۦؘؒؕۥ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3472 extends Drawable implements InterfaceC3863 {

    /* JADX INFO: renamed from: ۥٝ */
    public static final C5114[] f11518;

    /* JADX INFO: renamed from: ۦؒ */
    public static final Paint f11519;

    /* JADX INFO: renamed from: ۥؓ */
    public final Region f11520;

    /* JADX INFO: renamed from: ۥؔ */
    public C4040 f11521;

    /* JADX INFO: renamed from: ۥؖ */
    public final RectF f11522;

    /* JADX INFO: renamed from: ۥً */
    public final Paint f11523;

    /* JADX INFO: renamed from: ۥَ */
    public final BitSet f11524;

    /* JADX INFO: renamed from: ۥْ */
    public final AbstractC0162[] f11525;

    /* JADX INFO: renamed from: ۥٓ */
    public final AbstractC0162[] f11526;

    /* JADX INFO: renamed from: ۥٕ */
    public final C5796 f11527;

    /* JADX INFO: renamed from: ۥٖ */
    public boolean f11528;

    /* JADX INFO: renamed from: ۥ٘ */
    public float[] f11529;

    /* JADX INFO: renamed from: ۥٙ */
    public final RectF f11530;

    /* JADX INFO: renamed from: ۥٛ */
    public float[] f11531;

    /* JADX INFO: renamed from: ۥۖ */
    public final Path f11532;

    /* JADX INFO: renamed from: ۥۙ */
    public final C1039 f11533;

    /* JADX INFO: renamed from: ۥۤ */
    public C5322 f11534;

    /* JADX INFO: renamed from: ۥۦ */
    public PorterDuffColorFilter f11535;

    /* JADX INFO: renamed from: ۥۧ */
    public final Region f11536;

    /* JADX INFO: renamed from: ۦؖ */
    public PorterDuffColorFilter f11537;

    /* JADX INFO: renamed from: ۦؗ */
    public final RectF f11538;

    /* JADX INFO: renamed from: ۦؙ */
    public final C0175 f11539;

    /* JADX INFO: renamed from: ۦُ */
    public final boolean f11540;

    /* JADX INFO: renamed from: ۦٕ */
    public final Path f11541;

    /* JADX INFO: renamed from: ۦٖ */
    public boolean f11542;

    /* JADX INFO: renamed from: ۦٗ */
    public boolean f11543;

    /* JADX INFO: renamed from: ۦٚ */
    public final Paint f11544;

    /* JADX INFO: renamed from: ۦۛ */
    public final Matrix f11545;

    /* JADX INFO: renamed from: ۦۜ */
    public C3312 f11546;

    /* JADX INFO: renamed from: ۦ۟ */
    public C4488 f11547;

    /* JADX INFO: renamed from: ۦۣ */
    public final C1714[] f11548;

    /* JADX INFO: renamed from: ۦۨ */
    public final C3121 f11549;

    static {
        Paint paint = new Paint(1);
        f11519 = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        f11518 = new C5114[4];
        int i = 0;
        while (true) {
            C5114[] c5114Arr = f11518;
            if (i >= c5114Arr.length) {
                return;
            }
            c5114Arr[i] = new C5114(i);
            i++;
        }
    }

    public C3472(C4488 c4488) {
        this.f11549 = new C3121(6, this);
        this.f11525 = new AbstractC0162[4];
        this.f11526 = new AbstractC0162[4];
        this.f11524 = new BitSet(8);
        this.f11545 = new Matrix();
        this.f11532 = new Path();
        this.f11541 = new Path();
        this.f11530 = new RectF();
        this.f11522 = new RectF();
        this.f11520 = new Region();
        this.f11536 = new Region();
        Paint paint = new Paint(1);
        this.f11523 = paint;
        Paint paint2 = new Paint(1);
        this.f11544 = paint2;
        this.f11527 = new C5796();
        this.f11539 = C0175.m365();
        this.f11538 = new RectF();
        this.f11540 = true;
        this.f11542 = true;
        this.f11548 = new C1714[4];
        this.f11547 = c4488;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        m6275();
        m6269(getState());
        this.f11533 = new C1039(0, this);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float f;
        RectF rectF;
        Path path;
        PorterDuffColorFilter porterDuffColorFilter = this.f11537;
        Paint paint = this.f11523;
        paint.setColorFilter(porterDuffColorFilter);
        int alpha = paint.getAlpha();
        int i = this.f11547.f14839;
        paint.setAlpha(((i + (i >>> 7)) * alpha) >>> 8);
        PorterDuffColorFilter porterDuffColorFilter2 = this.f11535;
        Paint paint2 = this.f11544;
        paint2.setColorFilter(porterDuffColorFilter2);
        paint2.setStrokeWidth(this.f11547.f14837);
        int alpha2 = paint2.getAlpha();
        int i2 = this.f11547.f14839;
        paint2.setAlpha(((i2 + (i2 >>> 7)) * alpha2) >>> 8);
        boolean z = m6274() || !m6272();
        Paint.Style style = this.f11547.f14842;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            boolean z2 = this.f11528;
            Path path2 = this.f11532;
            if (z2) {
                if (z) {
                    m6267(m6263(), path2);
                }
                this.f11528 = false;
            }
            if (m6274()) {
                canvas.save();
                canvas.translate((int) (((double) this.f11547.f14843) * Math.sin(Math.toRadians(0.0d))), (int) (Math.cos(Math.toRadians(0.0d)) * ((double) this.f11547.f14843)));
                if (this.f11540) {
                    Rect bounds = getBounds();
                    RectF rectF2 = this.f11538;
                    int iWidth = (int) (rectF2.width() - bounds.width());
                    int iHeight = (int) (rectF2.height() - bounds.height());
                    if (iWidth < 0 || iHeight < 0) {
                        throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path. extra width: " + iWidth + " extra height: " + iHeight + " path bounds: " + rectF2);
                    }
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap((this.f11547.f14841 * 2) + ((int) rectF2.width()) + iWidth, (this.f11547.f14841 * 2) + ((int) rectF2.height()) + iHeight, Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(bitmapCreateBitmap);
                    int i3 = bounds.left;
                    f = 0.0f;
                    int i4 = this.f11547.f14841;
                    float f2 = (i3 - i4) - iWidth;
                    float f3 = (bounds.top - i4) - iHeight;
                    canvas2.translate(-f2, -f3);
                    m6268(canvas2);
                    canvas.drawBitmap(bitmapCreateBitmap, f2, f3, (Paint) null);
                    bitmapCreateBitmap.recycle();
                    canvas.restore();
                } else {
                    m6268(canvas);
                    canvas.restore();
                    f = 0.0f;
                }
            } else {
                f = 0.0f;
            }
            C4040 c4040Mo5482 = this.f11547.f14833.mo5482();
            float[] fArr = this.f11529;
            RectF rectFM6263 = m6263();
            float fM6265 = m6265(rectFM6263, c4040Mo5482, fArr);
            if (fM6265 >= f) {
                float f4 = fM6265 * this.f11547.f14838;
                canvas.drawRoundRect(rectFM6263, f4, f4, paint);
            } else {
                canvas.drawPath(path2, paint);
            }
        } else {
            f = 0.0f;
        }
        if (m6266()) {
            boolean z3 = this.f11543;
            RectF rectF3 = this.f11522;
            Path path3 = this.f11541;
            if (z3) {
                C4040 c4040Mo5483 = this.f11547.f14833.mo5482();
                C5892 c5892M7240 = c4040Mo5483.m7240();
                InterfaceC3163 interfaceC3163 = c4040Mo5483.f13469;
                C3121 c3121 = this.f11549;
                c5892M7240.f19429 = c3121.m5741(interfaceC3163);
                c5892M7240.f19430 = c3121.m5741(c4040Mo5483.f13470);
                c5892M7240.f19432 = c3121.m5741(c4040Mo5483.f13472);
                c5892M7240.f19439 = c3121.m5741(c4040Mo5483.f13479);
                this.f11521 = c5892M7240.m9723();
                float[] fArr2 = this.f11529;
                if (fArr2 != null) {
                    if (this.f11531 == null) {
                        this.f11531 = new float[fArr2.length];
                    }
                    float fM6264 = m6264();
                    int i5 = 0;
                    while (true) {
                        float[] fArr3 = this.f11529;
                        if (i5 >= fArr3.length) {
                            break;
                        }
                        this.f11531[i5] = Math.max(f, fArr3[i5] - fM6264);
                        i5++;
                        f = 0.0f;
                    }
                } else {
                    this.f11531 = null;
                }
                if (z) {
                    C4040 c4040 = this.f11521;
                    float[] fArr4 = this.f11531;
                    float f5 = this.f11547.f14838;
                    rectF3.set(m6263());
                    float fM6266 = m6264();
                    rectF3.inset(fM6266, fM6266);
                    this.f11539.m371(c4040, fArr4, f5, rectF3, null, path3);
                    rectF = rectF3;
                    path = path3;
                } else {
                    rectF = rectF3;
                    path = path3;
                }
                this.f11543 = false;
            } else {
                rectF = rectF3;
                path = path3;
            }
            C4040 c4041 = this.f11521;
            float[] fArr5 = this.f11531;
            rectF.set(m6263());
            float fM6267 = m6264();
            rectF.inset(fM6267, fM6267);
            float fM6268 = m6265(rectF, c4041, fArr5);
            if (fM6268 >= 0.0f) {
                float f6 = fM6268 * this.f11547.f14838;
                canvas.drawRoundRect(rectF, f6, f6, paint2);
            } else {
                canvas.drawPath(path, paint2);
            }
        }
        paint.setAlpha(alpha);
        paint2.setAlpha(alpha2);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f11547.f14839;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f11547;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        this.f11547.getClass();
        RectF rectFM6263 = m6263();
        if (rectFM6263.isEmpty()) {
            return;
        }
        float fM6265 = m6265(rectFM6263, this.f11547.f14833.mo5482(), this.f11529);
        if (fM6265 >= 0.0f) {
            outline.setRoundRect(getBounds(), fM6265 * this.f11547.f14838);
            return;
        }
        boolean z = this.f11528;
        Path path = this.f11532;
        if (z) {
            m6267(rectFM6263, path);
            this.f11528 = false;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            AbstractC2212.m4274(outline, path);
            return;
        }
        if (i >= 29) {
            try {
                AbstractC1240.m2629(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            AbstractC1240.m2629(outline, path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.f11547.f14840;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.f11520;
        region.set(bounds);
        RectF rectFM6263 = m6263();
        Path path = this.f11532;
        m6267(rectFM6263, path);
        Region region2 = this.f11536;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f11528 = true;
        this.f11543 = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.f11547.f14829;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        this.f11547.getClass();
        ColorStateList colorStateList2 = this.f11547.f14834;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.f11547.f14828;
        return (colorStateList3 != null && colorStateList3.isStateful()) || this.f11547.f14833.mo5485();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        C4488 c4488 = this.f11547;
        C4488 c4489 = new C4488();
        c4489.f14828 = null;
        c4489.f14834 = null;
        c4489.f14829 = null;
        c4489.f14830 = PorterDuff.Mode.SRC_IN;
        c4489.f14840 = null;
        c4489.f14832 = 1.0f;
        c4489.f14838 = 1.0f;
        c4489.f14839 = 255;
        c4489.f14835 = 0.0f;
        c4489.f14836 = 0.0f;
        c4489.f14841 = 0;
        c4489.f14843 = 0;
        c4489.f14842 = Paint.Style.FILL_AND_STROKE;
        c4489.f14833 = c4488.f14833;
        c4489.f14831 = c4488.f14831;
        c4489.f14837 = c4488.f14837;
        c4489.f14828 = c4488.f14828;
        c4489.f14834 = c4488.f14834;
        c4489.f14830 = c4488.f14830;
        c4489.f14829 = c4488.f14829;
        c4489.f14839 = c4488.f14839;
        c4489.f14832 = c4488.f14832;
        c4489.f14843 = c4488.f14843;
        c4489.f14838 = c4488.f14838;
        c4489.f14835 = c4488.f14835;
        c4489.f14836 = c4488.f14836;
        c4489.f14841 = c4488.f14841;
        c4489.f14842 = c4488.f14842;
        Rect rect = c4488.f14840;
        if (rect != null) {
            c4489.f14840 = new Rect(rect);
        }
        this.f11547 = c4489;
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f11528 = true;
        this.f11543 = true;
        super.onBoundsChange(rect);
        if (!this.f11547.f14833.mo5485() || rect.isEmpty()) {
            return;
        }
        int[] state = getState();
        boolean z = false;
        for (C1714 c1714 : this.f11548) {
            if (c1714 != null && c1714.f5701) {
                z = true;
                break;
            }
        }
        m6270(state, true ^ z);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        if (this.f11547.f14833.mo5485()) {
            m6270(iArr, false);
        }
        boolean z = m6269(iArr) || m6275();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        C4488 c4488 = this.f11547;
        if (c4488.f14839 != i) {
            c4488.f14839 = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f11547.getClass();
        super.invalidateSelf();
    }

    @Override // p000.InterfaceC3863
    public final void setShapeAppearanceModel(C4040 c4040) {
        this.f11547.f14833 = c4040;
        this.f11529 = null;
        this.f11531 = null;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.f11547.f14829 = colorStateList;
        m6275();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        C4488 c4488 = this.f11547;
        if (c4488.f14830 != mode) {
            c4488.f14830 = mode;
            m6275();
            super.invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final int m6262(int i) {
        int i2;
        C4488 c4488 = this.f11547;
        float f = c4488.f14836 + 0.0f + c4488.f14835;
        C1104 c1104 = c4488.f14831;
        if (c1104 == null || !c1104.f3883 || AbstractC1373.m2912(i, 255) != c1104.f3884) {
            return i;
        }
        float f2 = c1104.f3881;
        float fMin = (f2 <= 0.0f || f <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f / f2)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int iAlpha = Color.alpha(i);
        int iM4208 = AbstractC2164.m4208(fMin, AbstractC1373.m2912(i, 255), c1104.f3882);
        if (fMin > 0.0f && (i2 = c1104.f3880) != 0) {
            iM4208 = AbstractC1373.m2910(AbstractC1373.m2912(i2, C1104.f3879), iM4208);
        }
        return AbstractC1373.m2912(iM4208, iAlpha);
    }

    /* JADX INFO: renamed from: ۥُ */
    public final RectF m6263() {
        Rect bounds = getBounds();
        RectF rectF = this.f11530;
        rectF.set(bounds);
        return rectF;
    }

    /* JADX INFO: renamed from: ۥّ */
    public final float m6264() {
        if (m6266()) {
            return this.f11544.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final float m6265(RectF rectF, C4040 c4040, float[] fArr) {
        if (fArr == null) {
            if (c4040.m7239(rectF)) {
                return c4040.f13469.mo5840(rectF);
            }
            return -1.0f;
        }
        if (this.f11542) {
            return fArr[0];
        }
        return -1.0f;
    }

    /* JADX INFO: renamed from: ۥۜ */
    public final boolean m6266() {
        Paint.Style style = this.f11547.f14842;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f11544.getStrokeWidth() > 0.0f;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m6267(RectF rectF, Path path) {
        this.f11539.m371(this.f11547.f14833.mo5482(), this.f11529, this.f11547.f14838, rectF, this.f11533, path);
        if (this.f11547.f14832 != 1.0f) {
            Matrix matrix = this.f11545;
            matrix.reset();
            float f = this.f11547.f14832;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.f11538, true);
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final void m6268(Canvas canvas) {
        if (this.f11524.cardinality() > 0) {
            Log.w("ۦؘؒؕۥ", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i = this.f11547.f14843;
        Path path = this.f11532;
        C5796 c5796 = this.f11527;
        if (i != 0) {
            canvas.drawPath(path, c5796.f19101);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            AbstractC0162 abstractC0162 = this.f11525[i2];
            int i3 = this.f11547.f14841;
            Matrix matrix = AbstractC0162.f617;
            abstractC0162.mo345(matrix, c5796, i3, canvas);
            this.f11526[i2].mo345(matrix, c5796, this.f11547.f14841, canvas);
        }
        if (this.f11540) {
            int iSin = (int) (Math.sin(Math.toRadians(0.0d)) * ((double) this.f11547.f14843));
            int iCos = (int) (Math.cos(Math.toRadians(0.0d)) * ((double) this.f11547.f14843));
            canvas.translate(-iSin, -iCos);
            canvas.drawPath(path, f11519);
            canvas.translate(iSin, iCos);
        }
    }

    /* JADX INFO: renamed from: ۦؚ */
    public final boolean m6269(int[] iArr) {
        boolean z;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.f11547.f14828 == null || color2 == (colorForState2 = this.f11547.f14828.getColorForState(iArr, (color2 = (paint2 = this.f11523).getColor())))) {
            z = false;
        } else {
            paint2.setColor(colorForState2);
            z = true;
        }
        if (this.f11547.f14834 == null || color == (colorForState = this.f11547.f14834.getColorForState(iArr, (color = (paint = this.f11544).getColor())))) {
            return z;
        }
        paint.setColor(colorForState);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0054  */
    /* JADX WARN: Type inference failed for: r6v27, types: [java.lang.Object, ۦۤؖؒۘ] */
    /* JADX INFO: renamed from: ۦٌ */
    public final void m6270(int[] iArr, boolean z) {
        boolean z2;
        InterfaceC3163 interfaceC3163;
        int i;
        RectF rectFM6263 = m6263();
        if (!this.f11547.f14833.mo5485() || rectFM6263.isEmpty()) {
            return;
        }
        boolean z3 = z | (this.f11546 == null);
        if (this.f11529 == null) {
            this.f11529 = new float[4];
        }
        C4040 c4040Mo5483 = this.f11547.f14833.mo5483(iArr);
        float[] fArr = this.f11529;
        if (fArr.length > 1) {
            float f = fArr[0];
            int i2 = 1;
            while (true) {
                if (i2 < fArr.length) {
                    if (fArr[i2] == f) {
                        i2++;
                    }
                } else if (c4040Mo5483.m7239(m6263())) {
                    z2 = true;
                }
                z2 = false;
            }
        } else if (c4040Mo5483.m7239(m6263())) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f11542 = z2;
        if (!z2) {
            this.f11528 = true;
            this.f11543 = true;
        }
        int i3 = 0;
        for (int i4 = 4; i3 < i4; i4 = 4) {
            this.f11539.getClass();
            if (i3 == 1) {
                interfaceC3163 = c4040Mo5483.f13479;
            } else if (i3 != 2) {
                interfaceC3163 = i3 != 3 ? c4040Mo5483.f13470 : c4040Mo5483.f13469;
            } else {
                interfaceC3163 = c4040Mo5483.f13472;
            }
            float fMo5840 = interfaceC3163.mo5840(rectFM6263);
            if (z3) {
                this.f11529[i3] = fMo5840;
            }
            C1714[] c1714Arr = this.f11548;
            C1714 c1714 = c1714Arr[i3];
            if (c1714 != null) {
                if (c1714.f5701) {
                    c1714.f5712 = fMo5840;
                    i = i3;
                } else {
                    C3312 c3312 = c1714.f5707;
                    if (c3312 == null) {
                        c3312 = new C3312(fMo5840);
                        c1714.f5707 = c3312;
                    }
                    double d = fMo5840;
                    c3312.f11094 = d;
                    double d2 = (float) d;
                    i = i3;
                    if (d2 > c1714.f5711) {
                        throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
                    }
                    if (d2 < c1714.f5703) {
                        throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
                    }
                    double dAbs = Math.abs(c1714.f5708 * 0.75f);
                    c3312.f11092 = dAbs;
                    c3312.f11087 = dAbs * 62.5d;
                    if (Thread.currentThread() != ((Looper) C0254.m536().f943.f16550).getThread()) {
                        throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
                    }
                    boolean z4 = c1714.f5701;
                    if (!z4 && !z4) {
                        c1714.f5701 = true;
                        if (!c1714.f5699) {
                            c1714.f5702 = c1714.f5700.mo2267(c1714.f5705);
                        }
                        float f2 = c1714.f5702;
                        if (f2 > c1714.f5711 || f2 < c1714.f5703) {
                            C1078.m2272("Starting value need to be in between min value and max value");
                        } else {
                            C0254 c0254M536 = C0254.m536();
                            ArrayList arrayList = c0254M536.f945;
                            if (arrayList.size() == 0) {
                                ((Choreographer) c0254M536.f943.f16551).postFrameCallback(new ChoreographerFrameCallbackC1810(c0254M536.f948, 0));
                                if (Build.VERSION.SDK_INT >= 33) {
                                    c0254M536.f949 = ValueAnimator.getDurationScale();
                                    final C5002 c5002 = c0254M536.f946;
                                    if (c5002 == null) {
                                        c5002 = new C5002(c0254M536);
                                        c0254M536.f946 = c5002;
                                    }
                                    if (((C5661) c5002.f16551) == null) {
                                        ?? r6 = new ValueAnimator.DurationScaleChangeListener() { // from class: ۦۤؖؒۘ
                                            @Override // android.animation.ValueAnimator.DurationScaleChangeListener
                                            public final void onChanged(float f3) {
                                                ((C0254) c5002.f16550).f949 = f3;
                                            }
                                        };
                                        c5002.f16551 = r6;
                                        ValueAnimator.registerDurationScaleChangeListener(r6);
                                    }
                                }
                            }
                            if (!arrayList.contains(c1714)) {
                                arrayList.add(c1714);
                            }
                        }
                    }
                }
                if (z3) {
                    C1714 c1715 = c1714Arr[i];
                    if (c1715.f5707.f11089 <= 0.0d) {
                        throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
                    }
                    if (Thread.currentThread() != ((Looper) C0254.m536().f943.f16550).getThread()) {
                        throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
                    }
                    if (c1715.f5701) {
                        c1715.f5713 = true;
                    }
                } else {
                    continue;
                }
            } else {
                i = i3;
            }
            i3 = i + 1;
        }
        if (z3) {
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: ۦِ */
    public final void m6271(C3312 c3312) {
        if (this.f11546 == c3312) {
            return;
        }
        this.f11546 = c3312;
        int i = 0;
        while (true) {
            C1714[] c1714Arr = this.f11548;
            if (i >= c1714Arr.length) {
                m6270(getState(), true);
                invalidateSelf();
                return;
            }
            if (c1714Arr[i] == null) {
                c1714Arr[i] = new C1714(this, f11518[i]);
            }
            C1714 c1714 = c1714Arr[i];
            C3312 c3313 = new C3312();
            c3313.m6089((float) c3312.f11089);
            double d = c3312.f11091;
            c3313.m6088((float) (d * d));
            c1714.f5707 = c3313;
            i++;
        }
    }

    /* JADX INFO: renamed from: ۦٛ */
    public final boolean m6272() {
        if (this.f11547.f14833.mo5483(getState()).m7239(m6263())) {
            return this.f11529 == null || this.f11542;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۗ */
    public final void m6273(InterfaceC3388 interfaceC3388) {
        if (interfaceC3388 instanceof C4040) {
            setShapeAppearanceModel((C4040) interfaceC3388);
            return;
        }
        C2909 c2909 = (C2909) interfaceC3388;
        C4488 c4488 = this.f11547;
        if (c4488.f14833 != c2909) {
            c4488.f14833 = c2909;
            m6270(getState(), true);
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: ۦۙ */
    public final boolean m6274() {
        C4488 c4488 = this.f11547;
        c4488.getClass();
        return c4488.f14841 > 0 && !m6272() && !this.f11532.isConvex() && Build.VERSION.SDK_INT < 29;
    }

    /* JADX INFO: renamed from: ۦۚ */
    public final boolean m6275() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f11537;
        PorterDuffColorFilter porterDuffColorFilter3 = this.f11535;
        C4488 c4488 = this.f11547;
        ColorStateList colorStateList = c4488.f14829;
        PorterDuff.Mode mode = c4488.f14830;
        if (colorStateList == null || mode == null) {
            int color = this.f11523.getColor();
            int iM6262 = m6262(color);
            porterDuffColorFilter = iM6262 != color ? new PorterDuffColorFilter(iM6262, PorterDuff.Mode.SRC_IN) : null;
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(m6262(colorStateList.getColorForState(getState(), 0)), mode);
        }
        this.f11537 = porterDuffColorFilter;
        this.f11547.getClass();
        this.f11535 = null;
        this.f11547.getClass();
        return (Objects.equals(porterDuffColorFilter2, this.f11537) && Objects.equals(porterDuffColorFilter3, this.f11535)) ? false : true;
    }

    /* JADX INFO: renamed from: ۦۨ */
    public final void m6276() {
        C4488 c4488 = this.f11547;
        float f = c4488.f14836 + 0.0f;
        c4488.f14841 = (int) Math.ceil(0.75f * f);
        this.f11547.f14843 = (int) Math.ceil(f * 0.25f);
        m6275();
        if (m6274() || !m6272()) {
            invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public C3472(InterfaceC3388 interfaceC3388) {
        this(new C4488(interfaceC3388));
    }

    public C3472(C4040 c4040) {
        this(new C4488(c4040));
    }
}
