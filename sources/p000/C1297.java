package p000;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: ۥٓؗ٘ٞ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class C1297 extends C3470 {

    /* JADX INFO: renamed from: ۥْ */
    public static Field f4405 = null;

    /* JADX INFO: renamed from: ۥٓ */
    public static Field f4406 = null;

    /* JADX INFO: renamed from: ۦۚ */
    public static boolean f4407 = false;

    /* JADX INFO: renamed from: ۦ۟ */
    public static Class f4408;

    /* JADX INFO: renamed from: ۦۨ */
    public static Method f4409;

    /* JADX INFO: renamed from: ۥؗ */
    public final WindowInsets f4410;

    /* JADX INFO: renamed from: ۥُ */
    public C5364 f4411;

    /* JADX INFO: renamed from: ۥّ */
    public C2639 f4412;

    /* JADX INFO: renamed from: ۥۜ */
    public int f4413;

    /* JADX INFO: renamed from: ۦؑ */
    public C5364[] f4414;

    /* JADX INFO: renamed from: ۦؚ */
    public Rect[][] f4415;

    /* JADX INFO: renamed from: ۦٌ */
    public Rect[][] f4416;

    /* JADX INFO: renamed from: ۦِ */
    public int f4417;

    /* JADX INFO: renamed from: ۦٛ */
    public C0171 f4418;

    /* JADX INFO: renamed from: ۦۗ */
    public int f4419;

    /* JADX INFO: renamed from: ۦۙ */
    public C5364 f4420;

    public C1297(C2639 c2639, WindowInsets windowInsets) {
        super(c2639);
        this.f4411 = null;
        this.f4415 = new Rect[10][];
        this.f4416 = new Rect[10][];
        this.f4410 = windowInsets;
    }

    /* JADX INFO: renamed from: ۥؔ */
    public static boolean m2728(int i, int i2) {
        return (i & 6) == (i2 & 6);
    }

    /* JADX INFO: renamed from: ۥٕ */
    private static List<Rect> m2729(Rect[][] rectArr, int i) {
        Rect[] rectArr2;
        Rect[] rectArr3 = null;
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0 && (rectArr2 = rectArr[AbstractC4009.m7160(i2)]) != null) {
                if (rectArr3 == null) {
                    rectArr3 = rectArr2;
                } else {
                    Rect[] rectArr4 = new Rect[rectArr3.length + rectArr2.length];
                    System.arraycopy(rectArr3, 0, rectArr4, 0, rectArr3.length);
                    System.arraycopy(rectArr2, 0, rectArr4, rectArr3.length, rectArr2.length);
                    rectArr3 = rectArr4;
                }
            }
        }
        return rectArr3 == null ? Collections.EMPTY_LIST : Arrays.asList(rectArr3);
    }

    /* JADX INFO: renamed from: ۥۙ */
    private Rect[] m2730(C5364 c5364) {
        ArrayList arrayList = new ArrayList();
        int i = c5364.f17695;
        int i2 = c5364.f17696;
        int i3 = c5364.f17693;
        int i4 = c5364.f17694;
        if (i != 0) {
            arrayList.add(new Rect(0, 0, c5364.f17695, this.f4417));
        }
        if (i4 != 0) {
            arrayList.add(new Rect(0, 0, this.f4419, i4));
        }
        if (i3 != 0) {
            int i5 = this.f4419;
            arrayList.add(new Rect(i5 - i3, 0, i5, this.f4417));
        }
        if (i2 != 0) {
            int i6 = this.f4417;
            arrayList.add(new Rect(0, i6 - i2, this.f4419, i6));
        }
        return (Rect[]) arrayList.toArray(new Rect[arrayList.size()]);
    }

    /* JADX INFO: renamed from: ۥۦ */
    private C5364 m2731() {
        C2639 c2639 = this.f4412;
        return c2639 != null ? c2639.f8768.mo6094() : C5364.f17692;
    }

    /* JADX INFO: renamed from: ۦؗ */
    private C5364 m2732(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!f4407) {
            m2734();
        }
        Method method = f4409;
        if (method != null && f4408 != null && f4405 != null) {
            try {
                Object objInvoke = method.invoke(view, null);
                if (objInvoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) f4405.get(f4406.get(objInvoke));
                if (rect != null) {
                    return C5364.m9014(rect.left, rect.top, rect.right, rect.bottom);
                }
                return null;
            } catch (ReflectiveOperationException e) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦؙ */
    private C5364 m2733(int i, boolean z) {
        C5364 c5364M9016 = C5364.f17692;
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                c5364M9016 = C5364.m9016(c5364M9016, m2747(i2, z));
            }
        }
        return c5364M9016;
    }

    /* JADX INFO: renamed from: ۦٖ */
    private static void m2734() {
        try {
            f4409 = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f4408 = cls;
            f4405 = cls.getDeclaredField("mVisibleInsets");
            f4406 = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f4405.setAccessible(true);
            f4406.setAccessible(true);
        } catch (ReflectiveOperationException e) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
        }
        f4407 = true;
    }

    /* JADX INFO: renamed from: ۦٚ */
    private C0171 m2735(View view) {
        Display display;
        if (view == null || (display = view.getDisplay()) == null) {
            return null;
        }
        Point point = new Point();
        display.getRealSize(point);
        if (this.f11516.f8768.mo2742()) {
            return C0171.m361(point.x, point.y, true, 0, 0, 0, 0);
        }
        C2877 c2877M4179 = AbstractC2164.m4179(display, 0);
        C2877 c2877M41710 = AbstractC2164.m4179(display, 1);
        C2877 c2877M41711 = AbstractC2164.m4179(display, 2);
        C2877 c2877M41712 = AbstractC2164.m4179(display, 3);
        return C0171.m361(point.x, point.y, false, c2877M4179 != null ? c2877M4179.f9601 : 0, c2877M41710 != null ? c2877M41710.f9601 : 0, c2877M41711 != null ? c2877M41711.f9601 : 0, c2877M41712 != null ? c2877M41712.f9601 : 0);
    }

    @Override // p000.C3470
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        C1297 c1297 = (C1297) obj;
        return Objects.equals(this.f4420, c1297.f4420) && m2728(this.f4413, c1297.f4413);
    }

    @Override // p000.C3470
    /* JADX INFO: renamed from: ۥؓ */
    public void mo2736(int i) {
        this.f4413 = i;
    }

    @Override // p000.C3470
    /* JADX INFO: renamed from: ۥً */
    public void mo2737(Rect[][] rectArr) {
        Objects.requireNonNull(rectArr);
        this.f4416 = (Rect[][]) rectArr.clone();
    }

    @Override // p000.C3470
    /* JADX INFO: renamed from: ۥُ */
    public void mo2738(C2639 c2639) {
        c2639.f8768.mo2743(this.f4412);
        C5364 c5364 = this.f4420;
        C3470 c3470 = c2639.f8768;
        c3470.mo2750(c5364);
        c3470.mo2736(this.f4413);
        c3470.mo2755(this.f4418);
        c3470.mo2745(this.f4415);
        c3470.mo2737(this.f4416);
    }

    @Override // p000.C3470
    /* JADX INFO: renamed from: ۥّ */
    public List<Rect> mo2739(int i) {
        return m2729(this.f4415, i);
    }

    @Override // p000.C3470
    /* JADX INFO: renamed from: ۥْ */
    public void mo2740() {
        for (int i = 1; i <= 512; i <<= 1) {
            int iM7160 = AbstractC4009.m7160(i);
            this.f4415[iM7160] = m2730(mo2752(i));
            if (i != 8) {
                this.f4416[iM7160] = m2730(mo2749(i));
            }
        }
    }

    @Override // p000.C3470
    /* JADX INFO: renamed from: ۥٓ */
    public C2639 mo2741(int i, int i2, int i3, int i4) {
        AbstractC0734 c4090;
        C2639 c2639M4953 = C2639.m4953(this.f4410, null);
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 36) {
            c4090 = new C1462(c2639M4953);
        } else if (i5 >= 35) {
            c4090 = new C5386(c2639M4953);
        } else if (i5 >= 34) {
            c4090 = new C1756(c2639M4953);
        } else if (i5 >= 31) {
            c4090 = new C4277(c2639M4953);
        } else if (i5 >= 30) {
            c4090 = new C2973(c2639M4953);
        } else {
            c4090 = i5 >= 29 ? new C4090(c2639M4953) : new C3399(c2639M4953);
        }
        c4090.mo1618(C2639.m4954(mo2754(), i, i2, i3, i4));
        c4090.mo1616(C2639.m4954(mo6094(), i, i2, i3, i4));
        return c4090.mo1617();
    }

    @Override // p000.C3470
    /* JADX INFO: renamed from: ۥٖ */
    public boolean mo2742() {
        return this.f4410.isRound();
    }

    @Override // p000.C3470
    /* JADX INFO: renamed from: ۥٙ */
    public void mo2743(C2639 c2639) {
        this.f4412 = c2639;
    }

    @Override // p000.C3470
    /* JADX INFO: renamed from: ۥۖ */
    public void mo2744(C5364[] c5364Arr) {
        this.f4414 = c5364Arr;
    }

    @Override // p000.C3470
    /* JADX INFO: renamed from: ۥۧ */
    public void mo2745(Rect[][] rectArr) {
        Objects.requireNonNull(rectArr);
        this.f4415 = (Rect[][]) rectArr.clone();
    }

    @Override // p000.C3470
    /* JADX INFO: renamed from: ۦؑ */
    public void mo2746(View view) {
        this.f4419 = view.getWidth();
        this.f4417 = view.getHeight();
        C5364 c5364M2732 = m2732(view);
        if (c5364M2732 == null) {
            c5364M2732 = C5364.f17692;
        }
        mo2750(c5364M2732);
    }

    /* JADX INFO: renamed from: ۦؖ */
    public C5364 m2747(int i, boolean z) {
        C5364 c5364Mo6094;
        int i2;
        C5364 c5364 = C5364.f17692;
        if (i != 1) {
            if (i != 2) {
                if (i == 8) {
                    C5364[] c5364Arr = this.f4414;
                    c5364Mo6094 = c5364Arr != null ? c5364Arr[AbstractC4009.m7160(8)] : null;
                    if (c5364Mo6094 != null) {
                        return c5364Mo6094;
                    }
                    C5364 c5364Mo2754 = mo2754();
                    C5364 c5364M2731 = m2731();
                    int i3 = c5364Mo2754.f17696;
                    if (i3 > c5364M2731.f17696) {
                        return C5364.m9014(0, 0, 0, i3);
                    }
                    C5364 c5365 = this.f4420;
                    if (c5365 != null && !c5365.equals(c5364) && (i2 = this.f4420.f17696) > c5364M2731.f17696) {
                        return C5364.m9014(0, 0, 0, i2);
                    }
                } else {
                    if (i == 16) {
                        return mo3535();
                    }
                    if (i == 32) {
                        return mo3536();
                    }
                    if (i == 64) {
                        return mo3537();
                    }
                    if (i == 128) {
                        C2639 c2639 = this.f4412;
                        C1798 c1798Mo6259 = c2639 != null ? c2639.f8768.mo6259() : mo6259();
                        if (c1798Mo6259 != null) {
                            int i4 = Build.VERSION.SDK_INT;
                            return C5364.m9014(i4 >= 28 ? AbstractC2611.m4932(c1798Mo6259.f5996) : 0, i4 >= 28 ? AbstractC2611.m4939(c1798Mo6259.f5996) : 0, i4 >= 28 ? AbstractC2611.m4933(c1798Mo6259.f5996) : 0, i4 >= 28 ? AbstractC2611.m4937(c1798Mo6259.f5996) : 0);
                        }
                    }
                }
            } else {
                if (z) {
                    C5364 c5364M2732 = m2731();
                    C5364 c5364Mo6095 = mo6094();
                    return C5364.m9014(Math.max(c5364M2732.f17695, c5364Mo6095.f17695), 0, Math.max(c5364M2732.f17693, c5364Mo6095.f17693), Math.max(c5364M2732.f17696, c5364Mo6095.f17696));
                }
                if ((this.f4413 & 2) == 0) {
                    C5364 c5364Mo2755 = mo2754();
                    C2639 c26310 = this.f4412;
                    c5364Mo6094 = c26310 != null ? c26310.f8768.mo6094() : null;
                    int iMin = c5364Mo2755.f17696;
                    if (c5364Mo6094 != null) {
                        iMin = Math.min(iMin, c5364Mo6094.f17696);
                    }
                    return C5364.m9014(c5364Mo2755.f17695, 0, c5364Mo2755.f17693, iMin);
                }
            }
        } else {
            if (z) {
                return C5364.m9014(0, Math.max(m2731().f17694, mo2754().f17694), 0, 0);
            }
            if ((this.f4413 & 4) == 0) {
                return C5364.m9014(0, mo2754().f17694, 0, 0);
            }
        }
        return c5364;
    }

    /* JADX INFO: renamed from: ۦُ */
    public boolean m2748(int i) {
        if (i != 1 && i != 2) {
            if (i == 4) {
                return false;
            }
            if (i != 8 && i != 128) {
                return true;
            }
        }
        return !m2747(i, false).equals(C5364.f17692);
    }

    @Override // p000.C3470
    /* JADX INFO: renamed from: ۦِ */
    public C5364 mo2749(int i) {
        return m2733(i, true);
    }

    @Override // p000.C3470
    /* JADX INFO: renamed from: ۦٕ */
    public void mo2750(C5364 c5364) {
        this.f4420 = c5364;
    }

    @Override // p000.C3470
    /* JADX INFO: renamed from: ۦٗ */
    public boolean mo2751(int i) {
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0 && !m2748(i2)) {
                return false;
            }
        }
        return true;
    }

    @Override // p000.C3470
    /* JADX INFO: renamed from: ۦٛ */
    public C5364 mo2752(int i) {
        return m2733(i, false);
    }

    @Override // p000.C3470
    /* JADX INFO: renamed from: ۦۙ */
    public List<Rect> mo2753(int i) {
        return m2729(this.f4416, i);
    }

    @Override // p000.C3470
    /* JADX INFO: renamed from: ۦۚ */
    public final C5364 mo2754() {
        C5364 c5364 = this.f4411;
        if (c5364 != null) {
            return c5364;
        }
        WindowInsets windowInsets = this.f4410;
        C5364 c5364M9014 = C5364.m9014(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        this.f4411 = c5364M9014;
        return c5364M9014;
    }

    @Override // p000.C3470
    /* JADX INFO: renamed from: ۦۛ */
    public void mo2755(C0171 c0171) {
        this.f4418 = c0171;
    }

    @Override // p000.C3470
    /* JADX INFO: renamed from: ۦ۟ */
    public void mo2756(View view) {
        this.f4418 = m2735(view);
    }

    public C1297(C2639 c2639, C1297 c1297) {
        this(c2639, new WindowInsets(c1297.f4410));
    }
}
