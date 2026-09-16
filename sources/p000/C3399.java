package p000;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: ۦَؗؑۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3399 extends AbstractC0734 {

    /* JADX INFO: renamed from: ۥۜ */
    public static boolean f11311 = false;

    /* JADX INFO: renamed from: ۦِ */
    public static boolean f11312 = false;

    /* JADX INFO: renamed from: ۦٛ */
    public static Constructor f11313;

    /* JADX INFO: renamed from: ۦۙ */
    public static Field f11314;

    /* JADX INFO: renamed from: ۥُ */
    public WindowInsets f11315;

    /* JADX INFO: renamed from: ۥّ */
    public C5364 f11316;

    public C3399() {
        this.f11315 = m6153();
    }

    /* JADX INFO: renamed from: ۦِ */
    private static WindowInsets m6153() {
        if (!f11311) {
            try {
                f11314 = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e);
            }
            f11311 = true;
        }
        Field field = f11314;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e2) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e2);
            }
        }
        if (!f11312) {
            try {
                f11313 = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e3) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e3);
            }
            f11312 = true;
        }
        Constructor constructor = f11313;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e4) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e4);
            }
        }
        return null;
    }

    @Override // p000.AbstractC0734
    /* JADX INFO: renamed from: ۥّ */
    public void mo1616(C5364 c5364) {
        this.f11316 = c5364;
    }

    @Override // p000.AbstractC0734
    /* JADX INFO: renamed from: ۥۗ */
    public C2639 mo1617() {
        m1619();
        C2639 c2639M4953 = C2639.m4953(this.f11315, null);
        C5364[] c5364Arr = this.f2673;
        C3470 c3470 = c2639M4953.f8768;
        c3470.mo2744(c5364Arr);
        c3470.mo3534(this.f11316);
        c3470.mo2755(null);
        c3470.mo2745(this.f2672);
        c3470.mo2737(this.f2675);
        return c2639M4953;
    }

    @Override // p000.AbstractC0734
    /* JADX INFO: renamed from: ۥۜ */
    public void mo1618(C5364 c5364) {
        WindowInsets windowInsets = this.f11315;
        if (windowInsets != null) {
            this.f11315 = windowInsets.replaceSystemWindowInsets(c5364.f17695, c5364.f17694, c5364.f17693, c5364.f17696);
        }
    }

    public C3399(C2639 c2639) {
        super(c2639);
        this.f11315 = c2639.m4955();
    }
}
