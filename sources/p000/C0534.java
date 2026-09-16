package p000;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: renamed from: ۥّؖؔۦ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0534 implements InterfaceC3053 {

    /* JADX INFO: renamed from: ۥۖ */
    public static final C3224 f1878 = new C3224();

    /* JADX INFO: renamed from: ۥؗ */
    public final C3379 f1879;

    /* JADX INFO: renamed from: ۥَ */
    public float f1880;

    /* JADX INFO: renamed from: ۥُ */
    public final Resources f1881;

    /* JADX INFO: renamed from: ۥّ */
    public final Rect f1882;

    /* JADX INFO: renamed from: ۥْ */
    public boolean f1883;

    /* JADX INFO: renamed from: ۥٓ */
    public float f1884;

    /* JADX INFO: renamed from: ۥٖ */
    public float f1885;

    /* JADX INFO: renamed from: ۥۗ */
    public final AbstractC2717 f1886;

    /* JADX INFO: renamed from: ۥۜ */
    public int f1887;

    /* JADX INFO: renamed from: ۦؑ */
    public final C3052 f1888;

    /* JADX INFO: renamed from: ۦؚ */
    public boolean f1889;

    /* JADX INFO: renamed from: ۦٌ */
    public boolean f1890;

    /* JADX INFO: renamed from: ۦِ */
    public long f1891;

    /* JADX INFO: renamed from: ۦٗ */
    public long f1892;

    /* JADX INFO: renamed from: ۦٛ */
    public int f1893;

    /* JADX INFO: renamed from: ۦۗ */
    public boolean f1894;

    /* JADX INFO: renamed from: ۦۙ */
    public Paint f1895;

    /* JADX INFO: renamed from: ۦۚ */
    public int f1896;

    /* JADX INFO: renamed from: ۦۛ */
    public long f1897;

    /* JADX INFO: renamed from: ۦ۟ */
    public float f1898;

    /* JADX INFO: renamed from: ۦۨ */
    public int f1899;

    public C0534(AbstractC2717 abstractC2717) {
        C3379 c3379 = new C3379();
        C2004 c2004 = new C2004();
        this.f1886 = abstractC2717;
        this.f1879 = c3379;
        C3052 c3052 = new C3052(abstractC2717, c3379, c2004);
        this.f1888 = c3052;
        this.f1881 = abstractC2717.getResources();
        this.f1882 = new Rect();
        abstractC2717.addView(c3052);
        c3052.setClipBounds(null);
        this.f1891 = 0L;
        View.generateViewId();
        this.f1896 = 3;
        this.f1899 = 0;
        this.f1898 = 1.0f;
        this.f1884 = 1.0f;
        this.f1880 = 1.0f;
        long j = C1327.f4588;
        this.f1892 = j;
        this.f1897 = j;
    }

    @Override // p000.InterfaceC3053
    /* JADX INFO: renamed from: ۥؓ */
    public final void mo1191(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f1897 = j;
            this.f1888.setOutlineSpotShadowColor(AbstractC4225.m7470(j));
        }
    }

    @Override // p000.InterfaceC3053
    /* JADX INFO: renamed from: ۥؔ */
    public final long mo1192() {
        return this.f1892;
    }

    @Override // p000.InterfaceC3053
    /* JADX INFO: renamed from: ۥؖ */
    public final void mo1193() {
        this.f1888.setRotation(0.0f);
    }

    @Override // p000.InterfaceC3053
    /* JADX INFO: renamed from: ۥؗ */
    public final void mo1194(float f) {
        this.f1898 = f;
        this.f1888.setAlpha(f);
    }

    @Override // p000.InterfaceC3053
    /* JADX INFO: renamed from: ۥً */
    public final Matrix mo1195() {
        return this.f1888.getMatrix();
    }

    @Override // p000.InterfaceC3053
    /* JADX INFO: renamed from: ۥَ */
    public final void mo1196(InterfaceC3212 interfaceC3212) {
        Rect rect;
        boolean z = this.f1894;
        C3052 c3052 = this.f1888;
        if (z) {
            if ((this.f1890 || c3052.getClipToOutline()) && !this.f1889) {
                rect = this.f1882;
                rect.left = 0;
                rect.top = 0;
                rect.right = c3052.getWidth();
                rect.bottom = c3052.getHeight();
            } else {
                rect = null;
            }
            c3052.setClipBounds(rect);
        }
        Canvas canvas = AbstractC5664.f18633;
        if (((C0979) interfaceC3212).f3447.isHardwareAccelerated()) {
            this.f1886.m5069(interfaceC3212, c3052, c3052.getDrawingTime());
        }
    }

    @Override // p000.InterfaceC3053
    /* JADX INFO: renamed from: ۥُ */
    public final void mo1197(float f) {
        this.f1885 = f;
        this.f1888.setElevation(f);
    }

    @Override // p000.InterfaceC3053
    /* JADX INFO: renamed from: ۥّ */
    public final float mo1198() {
        return 0.0f;
    }

    @Override // p000.InterfaceC3053
    /* JADX INFO: renamed from: ۥْ */
    public final float mo1199() {
        return 0.0f;
    }

    @Override // p000.InterfaceC3053
    /* JADX INFO: renamed from: ۥٓ */
    public final void mo1200() {
        this.f1888.setTranslationX(0.0f);
    }

    @Override // p000.InterfaceC3053
    /* JADX INFO: renamed from: ۥٕ */
    public final float mo1201() {
        return 0.0f;
    }

    @Override // p000.InterfaceC3053
    /* JADX INFO: renamed from: ۥٖ */
    public final void mo1202(boolean z) {
        boolean z2 = false;
        this.f1890 = z && !this.f1889;
        this.f1894 = true;
        if (z && this.f1889) {
            z2 = true;
        }
        this.f1888.setClipToOutline(z2);
    }

    @Override // p000.InterfaceC3053
    /* JADX INFO: renamed from: ۥٙ */
    public final void mo1203(int i) {
        this.f1899 = i;
        m1229();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p000.InterfaceC3053
    /* JADX INFO: renamed from: ۥۖ */
    public final void mo1204(InterfaceC2880 interfaceC2880, EnumC2459 enumC2459, C4893 c4893, C2932 c2932) {
        C3052 c3052 = this.f1888;
        ViewParent parent = c3052.getParent();
        AbstractC2717 abstractC2717 = this.f1886;
        if (parent == null) {
            abstractC2717.addView(c3052);
        }
        c3052.f10285 = interfaceC2880;
        c3052.f10286 = enumC2459;
        c3052.f10283 = c2932;
        c3052.f10284 = c4893;
        if (c3052.isAttachedToWindow()) {
            c3052.setVisibility(4);
            c3052.setVisibility(0);
            try {
                C0979 c0979 = this.f1879.f11267;
                C3224 c3224 = f1878;
                Canvas canvas = c0979.f3447;
                c0979.f3447 = c3224;
                abstractC2717.m5069(c0979, c3052, c3052.getDrawingTime());
                c0979.f3447 = canvas;
            } catch (ClassCastException unused) {
            }
        }
    }

    @Override // p000.InterfaceC3053
    /* JADX INFO: renamed from: ۥۗ */
    public final void mo1205() {
        this.f1888.setRotationX(0.0f);
    }

    @Override // p000.InterfaceC3053
    /* JADX INFO: renamed from: ۥۙ */
    public final void mo1206(float f) {
        this.f1888.setCameraDistance(f * this.f1881.getDisplayMetrics().densityDpi);
    }

    @Override // p000.InterfaceC3053
    /* JADX INFO: renamed from: ۥۜ */
    public final void mo1207() {
        this.f1888.setRotationY(0.0f);
    }

    @Override // p000.InterfaceC3053
    /* JADX INFO: renamed from: ۥۣ */
    public final float mo1208() {
        return this.f1898;
    }

    @Override // p000.InterfaceC3053
    /* JADX INFO: renamed from: ۥۦ */
    public final float mo1209() {
        return this.f1880;
    }

    @Override // p000.InterfaceC3053
    /* JADX INFO: renamed from: ۥۧ */
    public final void mo1210(float f) {
        this.f1880 = f;
        this.f1888.setScaleY(f);
    }

    @Override // p000.InterfaceC3053
    /* JADX INFO: renamed from: ۦؑ */
    public final float mo1211() {
        return this.f1884;
    }

    @Override // p000.InterfaceC3053
    /* JADX INFO: renamed from: ۦؗ */
    public final float mo1212() {
        return 0.0f;
    }

    @Override // p000.InterfaceC3053
    /* JADX INFO: renamed from: ۦؙ */
    public final float mo1213() {
        return this.f1885;
    }

    @Override // p000.InterfaceC3053
    /* JADX INFO: renamed from: ۦؚ */
    public final void mo1214() {
        Paint paint = this.f1895;
        if (paint == null) {
            paint = new Paint();
            this.f1895 = paint;
        }
        paint.setColorFilter(null);
        m1229();
    }

    @Override // p000.InterfaceC3053
    /* JADX INFO: renamed from: ۦٌ */
    public final void mo1215(float f) {
        this.f1884 = f;
        this.f1888.setScaleX(f);
    }

    @Override // p000.InterfaceC3053
    /* JADX INFO: renamed from: ۦُ */
    public final int mo1216() {
        return this.f1896;
    }

    @Override // p000.InterfaceC3053
    /* JADX INFO: renamed from: ۦِ */
    public final void mo1217(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f1892 = j;
            this.f1888.setOutlineAmbientShadowColor(AbstractC4225.m7470(j));
        }
    }

    @Override // p000.InterfaceC3053
    /* JADX INFO: renamed from: ۦٕ */
    public final C1516 mo1218() {
        return null;
    }

    @Override // p000.InterfaceC3053
    /* JADX INFO: renamed from: ۦٖ */
    public final void mo1219(long j) {
        long j2 = 9223372034707292159L & j;
        C3052 c3052 = this.f1888;
        if (j2 != 9205357640488583168L) {
            this.f1883 = false;
            c3052.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
            c3052.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
        } else {
            if (Build.VERSION.SDK_INT >= 28) {
                c3052.resetPivot();
                return;
            }
            this.f1883 = true;
            c3052.setPivotX(((int) (this.f1891 >> 32)) / 2.0f);
            c3052.setPivotY(((int) (this.f1891 & 4294967295L)) / 2.0f);
        }
    }

    @Override // p000.InterfaceC3053
    /* JADX INFO: renamed from: ۦٗ */
    public final int mo1220() {
        return this.f1899;
    }

    @Override // p000.InterfaceC3053
    /* JADX INFO: renamed from: ۦٚ */
    public final void mo1221(int i, int i2, long j) {
        boolean zM7431 = C4207.m7431(this.f1891, j);
        C3052 c3052 = this.f1888;
        if (zM7431) {
            int i3 = this.f1887;
            if (i3 != i) {
                c3052.offsetLeftAndRight(i - i3);
            }
            int i4 = this.f1893;
            if (i4 != i2) {
                c3052.offsetTopAndBottom(i2 - i4);
            }
        } else {
            if (this.f1890 || c3052.getClipToOutline()) {
                this.f1894 = true;
            }
            int i5 = (int) (j >> 32);
            int i6 = (int) (4294967295L & j);
            c3052.layout(i, i2, i + i5, i2 + i6);
            this.f1891 = j;
            if (this.f1883) {
                c3052.setPivotX(i5 / 2.0f);
                c3052.setPivotY(i6 / 2.0f);
            }
        }
        this.f1887 = i;
        this.f1893 = i2;
    }

    @Override // p000.InterfaceC3053
    /* JADX INFO: renamed from: ۦٛ */
    public final long mo1222() {
        return this.f1897;
    }

    @Override // p000.InterfaceC3053
    /* JADX INFO: renamed from: ۦۗ */
    public final void mo1223(Outline outline, long j) {
        C3052 c3052 = this.f1888;
        c3052.f10279 = outline;
        c3052.invalidateOutline();
        if ((this.f1890 || c3052.getClipToOutline()) && outline != null) {
            c3052.setClipToOutline(true);
            if (this.f1890) {
                this.f1890 = false;
                this.f1894 = true;
            }
        }
        this.f1889 = outline != null;
    }

    @Override // p000.InterfaceC3053
    /* JADX INFO: renamed from: ۦۙ */
    public final void mo1224() {
        this.f1888.setTranslationY(0.0f);
    }

    @Override // p000.InterfaceC3053
    /* JADX INFO: renamed from: ۦۚ */
    public final void mo1225(int i) {
        this.f1896 = i;
        Paint paint = this.f1895;
        if (paint == null) {
            paint = new Paint();
            this.f1895 = paint;
        }
        paint.setXfermode(new PorterDuffXfermode(AbstractC3801.m6797(i)));
        m1229();
    }

    @Override // p000.InterfaceC3053
    /* JADX INFO: renamed from: ۦۛ */
    public final float mo1226() {
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۦۜ */
    public final void m1227(int i) {
        Paint paint = this.f1895;
        C3052 c3052 = this.f1888;
        boolean z = true;
        if (i == 1) {
            c3052.setLayerType(2, paint);
        } else if (i == 2) {
            c3052.setLayerType(0, paint);
            z = false;
        } else {
            c3052.setLayerType(0, paint);
        }
        c3052.setCanUseCompositingLayer$ui_graphics(z);
    }

    @Override // p000.InterfaceC3053
    /* JADX INFO: renamed from: ۦ۟ */
    public final void mo1228() {
        this.f1886.removeViewInLayout(this.f1888);
    }

    /* JADX INFO: renamed from: ۦۣ */
    public final void m1229() {
        int i = this.f1899;
        if (i != 1 && this.f1896 == 3) {
            m1227(i);
        } else {
            m1227(1);
        }
    }

    @Override // p000.InterfaceC3053
    /* JADX INFO: renamed from: ۦۨ */
    public final float mo1230() {
        return this.f1888.getCameraDistance() / this.f1881.getDisplayMetrics().densityDpi;
    }
}
