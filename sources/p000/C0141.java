package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;
import android.util.TypedValue;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.WeakHashMap;
import ru.bluecat.yandexmapspatcher.R;

/* JADX INFO: renamed from: ۥؐؖۜۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0141 {

    /* JADX INFO: renamed from: ۥّ */
    public static final PorterDuff.Mode f554 = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: ۥۜ */
    public static final C1709 f555 = new C1709(6);

    /* JADX INFO: renamed from: ۦۙ */
    public static C0141 f556;

    /* JADX INFO: renamed from: ۥؗ */
    public TypedValue f557;

    /* JADX INFO: renamed from: ۥُ */
    public C2813 f558;

    /* JADX INFO: renamed from: ۥۗ */
    public final WeakHashMap f559 = new WeakHashMap(0);

    /* JADX INFO: renamed from: ۥۣ */
    public WeakHashMap f560;

    /* JADX INFO: renamed from: ۦؑ */
    public boolean f561;

    /* JADX INFO: renamed from: ۥؗ */
    public static synchronized C0141 m304() {
        C0141 c0141;
        c0141 = f556;
        if (c0141 == null) {
            c0141 = new C0141();
            f556 = c0141;
        }
        return c0141;
    }

    /* JADX INFO: renamed from: ۥّ */
    public static synchronized PorterDuffColorFilter m305(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        C1709 c1709 = f555;
        c1709.getClass();
        int i2 = (31 + i) * 31;
        porterDuffColorFilter = (PorterDuffColorFilter) c1709.m4035(Integer.valueOf(mode.hashCode() + i2));
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
        }
        return porterDuffColorFilter;
    }

    /* JADX INFO: renamed from: ۦٛ */
    public static void m306(Drawable drawable, C1138 c1138, int[] iArr) {
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z = c1138.f3980;
        if (!z && !c1138.f3981) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilterM305 = null;
        ColorStateList colorStateList = z ? (ColorStateList) c1138.f3979 : null;
        PorterDuff.Mode mode = c1138.f3981 ? (PorterDuff.Mode) c1138.f3982 : f554;
        if (colorStateList != null && mode != null) {
            porterDuffColorFilterM305 = m305(colorStateList.getColorForState(iArr, 0), mode);
        }
        drawable.setColorFilter(porterDuffColorFilterM305);
    }

    /* JADX INFO: renamed from: ۥُ */
    public final synchronized Drawable m307(Context context, int i, boolean z) {
        Drawable drawableM308;
        try {
            if (!this.f561) {
                this.f561 = true;
                Drawable drawableM311 = m311(context, R.drawable.abc_vector_test);
                if (drawableM311 == null || (!(drawableM311 instanceof C3603) && !"android.graphics.drawable.VectorDrawable".equals(drawableM311.getClass().getName()))) {
                    this.f561 = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            drawableM308 = m308(context, i);
            if (drawableM308 == null) {
                drawableM308 = context.getDrawable(i);
            }
            if (drawableM308 != null) {
                drawableM308 = m309(context, i, z, drawableM308);
            }
            if (drawableM308 != null) {
                AbstractC3522.m6316(drawableM308);
            }
        } catch (Throwable th) {
            throw th;
        }
        return drawableM308;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0055  */
    /* JADX INFO: renamed from: ۥۗ */
    public final Drawable m308(Context context, int i) {
        Object obj;
        WeakReference weakReference;
        Drawable drawableNewDrawable;
        LayerDrawable layerDrawableM5362;
        TypedValue typedValue = this.f557;
        if (typedValue == null) {
            typedValue = new TypedValue();
            this.f557 = typedValue;
        }
        context.getResources().getValue(i, typedValue, true);
        long j = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        synchronized (this) {
            C0638 c0638 = (C0638) this.f559.get(context);
            obj = null;
            if (c0638 != null && (weakReference = (WeakReference) c0638.m1450(j)) != null) {
                Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
                if (constantState != null) {
                    drawableNewDrawable = constantState.newDrawable(context.getResources());
                } else {
                    c0638.m1452(j);
                }
            }
            drawableNewDrawable = null;
        }
        if (drawableNewDrawable != null) {
            return drawableNewDrawable;
        }
        if (this.f558 == null) {
            layerDrawableM5362 = null;
        } else if (i == R.drawable.abc_cab_background_top_material) {
            layerDrawableM5362 = new LayerDrawable(new Drawable[]{m311(context, R.drawable.abc_cab_background_internal_bg), m311(context, R.drawable.abc_cab_background_top_mtrl_alpha)});
        } else if (i == R.drawable.abc_ratingbar_material) {
            layerDrawableM5362 = C2813.m5362(this, context, R.dimen.abc_star_big);
        } else if (i == R.drawable.abc_ratingbar_indicator_material) {
            layerDrawableM5362 = C2813.m5362(this, context, R.dimen.abc_star_medium);
        } else if (i == R.drawable.abc_ratingbar_small_material) {
            layerDrawableM5362 = C2813.m5362(this, context, R.dimen.abc_star_small);
        } else {
            layerDrawableM5362 = null;
        }
        if (layerDrawableM5362 == null) {
            return layerDrawableM5362;
        }
        layerDrawableM5362.setChangingConfigurations(typedValue.changingConfigurations);
        synchronized (this) {
            try {
                Drawable.ConstantState constantState2 = layerDrawableM5362.getConstantState();
                if (constantState2 == null) {
                    return layerDrawableM5362;
                }
                C0638 c0639 = (C0638) this.f559.get(context);
                if (c0639 == null) {
                    c0639 = new C0638(obj);
                    this.f559.put(context, c0639);
                }
                c0639.m1451(j, new WeakReference(constantState2));
                return layerDrawableM5362;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۥۜ */
    public final Drawable m309(Context context, int i, boolean z, Drawable drawable) {
        boolean z2;
        int iRound;
        PorterDuffColorFilter porterDuffColorFilterM305;
        ColorStateList colorStateListM312 = m312(context, i);
        PorterDuff.Mode mode = null;
        if (colorStateListM312 != null) {
            Drawable drawableMutate = drawable.mutate();
            drawableMutate.setTintList(colorStateListM312);
            if (this.f558 != null && i == R.drawable.abc_switch_thumb_material) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (mode != null) {
                drawableMutate.setTintMode(mode);
            }
            return drawableMutate;
        }
        C2813 c2813 = this.f558;
        int i2 = R.attr.colorControlNormal;
        if (c2813 != null) {
            if (i == R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
                int iM8832 = AbstractC5216.m8832(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode2 = C3465.f11497;
                C2813.m5364(drawableFindDrawableByLayerId, iM8832, mode2);
                C2813.m5364(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), AbstractC5216.m8832(context, R.attr.colorControlNormal), mode2);
                C2813.m5364(layerDrawable.findDrawableByLayerId(android.R.id.progress), AbstractC5216.m8832(context, R.attr.colorControlActivated), mode2);
                return drawable;
            }
            if (i == R.drawable.abc_ratingbar_material || i == R.drawable.abc_ratingbar_indicator_material || i == R.drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
                int iM8833 = AbstractC5216.m8833(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode3 = C3465.f11497;
                C2813.m5364(drawableFindDrawableByLayerId2, iM8833, mode3);
                C2813.m5364(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), AbstractC5216.m8832(context, R.attr.colorControlActivated), mode3);
                C2813.m5364(layerDrawable2.findDrawableByLayerId(android.R.id.progress), AbstractC5216.m8832(context, R.attr.colorControlActivated), mode3);
                return drawable;
            }
        }
        C2813 c2814 = this.f558;
        boolean z3 = false;
        if (c2814 != null) {
            PorterDuff.Mode mode4 = C3465.f11497;
            if (C2813.m5361((int[]) c2814.f9393, i)) {
                z2 = true;
                iRound = -1;
            } else {
                if (C2813.m5361((int[]) c2814.f9390, i)) {
                    i2 = R.attr.colorControlActivated;
                } else {
                    boolean zM5361 = C2813.m5361((int[]) c2814.f9388, i);
                    i2 = android.R.attr.colorBackground;
                    if (zM5361) {
                        mode4 = PorterDuff.Mode.MULTIPLY;
                    } else if (i == R.drawable.abc_list_divider_mtrl_alpha) {
                        iRound = Math.round(40.8f);
                        i2 = android.R.attr.colorForeground;
                        z2 = true;
                    } else {
                        if (i != R.drawable.abc_dialog_material_background) {
                            z2 = false;
                            i2 = 0;
                        }
                        iRound = -1;
                    }
                }
                z2 = true;
                iRound = -1;
            }
            if (z2) {
                Drawable drawableMutate2 = drawable.mutate();
                int iM8834 = AbstractC5216.m8832(context, i2);
                synchronized (C3465.class) {
                    porterDuffColorFilterM305 = m305(iM8834, mode4);
                }
                drawableMutate2.setColorFilter(porterDuffColorFilterM305);
                if (iRound != -1) {
                    drawableMutate2.setAlpha(iRound);
                }
                z3 = true;
            }
        }
        if (z3 || !z) {
            return drawable;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m310(Context context, int i, ColorStateList colorStateList) {
        WeakHashMap weakHashMap = this.f560;
        if (weakHashMap == null) {
            weakHashMap = new WeakHashMap();
            this.f560 = weakHashMap;
        }
        C1870 c1870 = (C1870) weakHashMap.get(context);
        if (c1870 == null) {
            c1870 = new C1870(0);
            this.f560.put(context, c1870);
        }
        int i2 = c1870.f6215;
        if (i2 != 0 && i <= c1870.f6217[i2 - 1]) {
            c1870.m3722(i, colorStateList);
            return;
        }
        if (i2 >= c1870.f6217.length) {
            int i3 = (i2 + 1) * 4;
            for (int i4 = 4; i4 < 32; i4++) {
                int i5 = (1 << i4) - 12;
                if (i3 <= i5) {
                    i3 = i5;
                    break;
                }
            }
            int i6 = i3 / 4;
            c1870.f6217 = Arrays.copyOf(c1870.f6217, i6);
            c1870.f6216 = Arrays.copyOf(c1870.f6216, i6);
        }
        c1870.f6217[i2] = i;
        c1870.f6216[i2] = colorStateList;
        c1870.f6215 = i2 + 1;
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final synchronized Drawable m311(Context context, int i) {
        return m307(context, i, false);
    }

    /* JADX INFO: renamed from: ۦۙ */
    public final synchronized ColorStateList m312(Context context, int i) {
        ColorStateList colorStateList;
        C1870 c1870;
        WeakHashMap weakHashMap = this.f560;
        ColorStateList colorStateListM5373 = null;
        colorStateList = (weakHashMap == null || (c1870 = (C1870) weakHashMap.get(context)) == null) ? null : (ColorStateList) AbstractC5378.m9050(c1870, i);
        if (colorStateList == null) {
            C2813 c2813 = this.f558;
            if (c2813 != null) {
                colorStateListM5373 = c2813.m5373(context, i);
            }
            if (colorStateListM5373 != null) {
                m310(context, i, colorStateListM5373);
            }
            colorStateList = colorStateListM5373;
        }
        return colorStateList;
    }
}
