package p000;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import ru.bluecat.yandexmapspatcher.R;

/* JADX INFO: renamed from: ۦَۘؖۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5050 implements InterfaceC3662, InterfaceC3370 {

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ LayoutInflaterFactory2C1852 f16765;

    public /* synthetic */ C5050(LayoutInflaterFactory2C1852 layoutInflaterFactory2C1852) {
        this.f16765 = layoutInflaterFactory2C1852;
    }

    @Override // p000.InterfaceC3370
    /* JADX INFO: renamed from: ۥْ */
    public boolean mo2761(MenuC4903 menuC4903) {
        Window.Callback callback = this.f16765.f6147.getCallback();
        if (callback == null) {
            return true;
        }
        callback.onMenuOpened(108, menuC4903);
        return true;
    }

    @Override // p000.InterfaceC3370
    /* JADX INFO: renamed from: ۥۣ */
    public void mo2765(MenuC4903 menuC4903, boolean z) {
        this.f16765.m3647(menuC4903);
    }

    @Override // p000.InterfaceC3662
    /* JADX INFO: renamed from: ۦۙ */
    public C2639 mo284(View view, C2639 c2639) {
        int i;
        boolean z;
        C2639 c2639Mo1617;
        AbstractC0734 c4090;
        boolean z2;
        C3470 c3470 = c2639.f8768;
        int i2 = c3470.mo2754().f17694;
        LayoutInflaterFactory2C1852 layoutInflaterFactory2C1852 = this.f16765;
        Context context = layoutInflaterFactory2C1852.f6156;
        int i3 = c3470.mo2754().f17694;
        ActionBarContextView actionBarContextView = layoutInflaterFactory2C1852.f6169;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            i = 0;
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutInflaterFactory2C1852.f6169.getLayoutParams();
            boolean z3 = true;
            if (layoutInflaterFactory2C1852.f6169.isShown()) {
                if (layoutInflaterFactory2C1852.f6191 == null) {
                    layoutInflaterFactory2C1852.f6191 = new Rect();
                    layoutInflaterFactory2C1852.f6179 = new Rect();
                }
                Rect rect = layoutInflaterFactory2C1852.f6191;
                Rect rect2 = layoutInflaterFactory2C1852.f6179;
                rect.set(c3470.mo2754().f17695, c3470.mo2754().f17694, c3470.mo2754().f17693, c3470.mo2754().f17696);
                ViewGroup viewGroup = layoutInflaterFactory2C1852.f6187;
                if (Build.VERSION.SDK_INT >= 29) {
                    boolean z4 = AbstractC4518.f14932;
                    AbstractC5476.m9176(viewGroup, rect, rect2);
                } else {
                    if (!AbstractC4518.f14932) {
                        AbstractC4518.f14932 = true;
                        try {
                            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                            AbstractC4518.f14931 = declaredMethod;
                            if (!declaredMethod.isAccessible()) {
                                AbstractC4518.f14931.setAccessible(true);
                            }
                        } catch (NoSuchMethodException unused) {
                            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
                        }
                    }
                    Method method = AbstractC4518.f14931;
                    if (method != null) {
                        try {
                            method.invoke(viewGroup, rect, rect2);
                        } catch (Exception e) {
                            Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e);
                        }
                    }
                }
                int i4 = rect.top;
                int i5 = rect.left;
                int i6 = rect.right;
                ViewGroup viewGroup2 = layoutInflaterFactory2C1852.f6187;
                WeakHashMap weakHashMap = AbstractC3608.f12013;
                C2639 c2639M8350 = AbstractC4969.m8350(viewGroup2);
                int i7 = c2639M8350 == null ? 0 : c2639M8350.f8768.mo2754().f17695;
                int i8 = c2639M8350 == null ? 0 : c2639M8350.f8768.mo2754().f17693;
                if (marginLayoutParams.topMargin == i4 && marginLayoutParams.leftMargin == i5 && marginLayoutParams.rightMargin == i6) {
                    z2 = false;
                } else {
                    marginLayoutParams.topMargin = i4;
                    marginLayoutParams.leftMargin = i5;
                    marginLayoutParams.rightMargin = i6;
                    z2 = true;
                }
                if (i4 <= 0 || layoutInflaterFactory2C1852.f6155 != null) {
                    View view2 = layoutInflaterFactory2C1852.f6155;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i9 = marginLayoutParams2.height;
                        int i10 = marginLayoutParams.topMargin;
                        if (i9 != i10 || marginLayoutParams2.leftMargin != i7 || marginLayoutParams2.rightMargin != i8) {
                            marginLayoutParams2.height = i10;
                            marginLayoutParams2.leftMargin = i7;
                            marginLayoutParams2.rightMargin = i8;
                            layoutInflaterFactory2C1852.f6155.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view3 = new View(context);
                    layoutInflaterFactory2C1852.f6155 = view3;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = i7;
                    layoutParams.rightMargin = i8;
                    layoutInflaterFactory2C1852.f6187.addView(layoutInflaterFactory2C1852.f6155, -1, layoutParams);
                }
                View view4 = layoutInflaterFactory2C1852.f6155;
                z3 = view4 != null;
                if (z3 && view4.getVisibility() != 0) {
                    View view5 = layoutInflaterFactory2C1852.f6155;
                    view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & 8192) != 0 ? context.getColor(R.color.abc_decor_view_status_guard_light) : context.getColor(R.color.abc_decor_view_status_guard));
                }
                if (!layoutInflaterFactory2C1852.f6164 && z3) {
                    i3 = 0;
                }
                i = 0;
                z = z3;
                z3 = z2;
            } else {
                i = 0;
                if (marginLayoutParams.topMargin != 0) {
                    marginLayoutParams.topMargin = 0;
                    z = false;
                } else {
                    z = false;
                    z3 = false;
                }
            }
            if (z3) {
                layoutInflaterFactory2C1852.f6169.setLayoutParams(marginLayoutParams);
            }
        }
        View view6 = layoutInflaterFactory2C1852.f6155;
        if (view6 != null) {
            view6.setVisibility(z ? i : 8);
        }
        if (i2 != i3) {
            int i11 = c3470.mo2754().f17695;
            int i12 = c3470.mo2754().f17693;
            int i13 = c3470.mo2754().f17696;
            int i14 = Build.VERSION.SDK_INT;
            if (i14 >= 36) {
                c4090 = new C1462(c2639);
            } else if (i14 >= 35) {
                c4090 = new C5386(c2639);
            } else if (i14 >= 34) {
                c4090 = new C1756(c2639);
            } else if (i14 >= 31) {
                c4090 = new C4277(c2639);
            } else if (i14 >= 30) {
                c4090 = new C2973(c2639);
            } else {
                c4090 = i14 >= 29 ? new C4090(c2639) : new C3399(c2639);
            }
            c4090.mo1618(C5364.m9014(i11, i3, i12, i13));
            c2639Mo1617 = c4090.mo1617();
        } else {
            c2639Mo1617 = c2639;
        }
        WeakHashMap weakHashMap2 = AbstractC3608.f12013;
        WindowInsets windowInsetsM4955 = c2639Mo1617.m4955();
        if (windowInsetsM4955 == null) {
            return c2639Mo1617;
        }
        WindowInsets windowInsetsOnApplyWindowInsets = view.onApplyWindowInsets(windowInsetsM4955);
        return !windowInsetsOnApplyWindowInsets.equals(windowInsetsM4955) ? C2639.m4953(windowInsetsOnApplyWindowInsets, view) : c2639Mo1617;
    }
}
