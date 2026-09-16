package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.core.widget.NestedScrollView;
import java.util.WeakHashMap;
import p000.AbstractC0734;
import p000.AbstractC3608;
import p000.AbstractC4225;
import p000.AbstractC5039;
import p000.C0251;
import p000.C0355;
import p000.C0865;
import p000.C1078;
import p000.C1462;
import p000.C1756;
import p000.C2268;
import p000.C2639;
import p000.C2973;
import p000.C3399;
import p000.C3470;
import p000.C4075;
import p000.C4090;
import p000.C4277;
import p000.C4718;
import p000.C4796;
import p000.C4799;
import p000.C5364;
import p000.C5386;
import p000.C5684;
import p000.InterfaceC0560;
import p000.InterfaceC1031;
import p000.InterfaceC3055;
import p000.InterfaceC3370;
import p000.InterfaceC4870;
import p000.MenuC4903;
import p000.RunnableC1638;
import ru.bluecat.yandexmapspatcher.R;

/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC3055, InterfaceC1031 {

    /* JADX INFO: renamed from: ۥٛ */
    public static final int[] f61 = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};

    /* JADX INFO: renamed from: ۥۤ */
    public static final C2639 f62;

    /* JADX INFO: renamed from: ۦؒ */
    public static final Rect f63;

    /* JADX INFO: renamed from: ۥؓ */
    public final Rect f64;

    /* JADX INFO: renamed from: ۥؔ */
    public final RunnableC1638 f65;

    /* JADX INFO: renamed from: ۥؖ */
    public int f66;

    /* JADX INFO: renamed from: ۥً */
    public final Rect f67;

    /* JADX INFO: renamed from: ۥَ */
    public InterfaceC4870 f68;

    /* JADX INFO: renamed from: ۥْ */
    public ContentFrameLayout f69;

    /* JADX INFO: renamed from: ۥٓ */
    public ActionBarContainer f70;

    /* JADX INFO: renamed from: ۥٕ */
    public C2639 f71;

    /* JADX INFO: renamed from: ۥٖ */
    public Drawable f72;

    /* JADX INFO: renamed from: ۥ٘ */
    public final C0865 f73;

    /* JADX INFO: renamed from: ۥٙ */
    public int f74;

    /* JADX INFO: renamed from: ۥۖ */
    public boolean f75;

    /* JADX INFO: renamed from: ۥۙ */
    public C2639 f76;

    /* JADX INFO: renamed from: ۥۦ */
    public InterfaceC0560 f77;

    /* JADX INFO: renamed from: ۥۧ */
    public final Rect f78;

    /* JADX INFO: renamed from: ۦؖ */
    public C2639 f79;

    /* JADX INFO: renamed from: ۦؗ */
    public OverScroller f80;

    /* JADX INFO: renamed from: ۦؙ */
    public C2639 f81;

    /* JADX INFO: renamed from: ۦُ */
    public ViewPropertyAnimator f82;

    /* JADX INFO: renamed from: ۦٕ */
    public boolean f83;

    /* JADX INFO: renamed from: ۦٖ */
    public final C5684 f84;

    /* JADX INFO: renamed from: ۦٗ */
    public boolean f85;

    /* JADX INFO: renamed from: ۦٚ */
    public final Rect f86;

    /* JADX INFO: renamed from: ۦۛ */
    public boolean f87;

    /* JADX INFO: renamed from: ۦۜ */
    public final RunnableC1638 f88;

    /* JADX INFO: renamed from: ۦ۟ */
    public int f89;

    /* JADX INFO: renamed from: ۦۣ */
    public final C2268 f90;

    /* JADX INFO: renamed from: ۦۨ */
    public int f91;

    static {
        AbstractC0734 c4090;
        int i = Build.VERSION.SDK_INT;
        if (i >= 36) {
            c4090 = new C1462();
        } else if (i >= 35) {
            c4090 = new C5386();
        } else if (i >= 34) {
            c4090 = new C1756();
        } else if (i >= 31) {
            c4090 = new C4277();
        } else if (i >= 30) {
            c4090 = new C2973();
        } else {
            c4090 = i >= 29 ? new C4090() : new C3399();
        }
        c4090.mo1618(C5364.m9014(0, 1, 0, 1));
        f62 = c4090.mo1617();
        f63 = new Rect();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f89 = 0;
        this.f64 = new Rect();
        this.f78 = new Rect();
        this.f67 = new Rect();
        this.f86 = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        C2639 c2639 = C2639.f8767;
        this.f71 = c2639;
        this.f76 = c2639;
        this.f81 = c2639;
        this.f79 = c2639;
        this.f84 = new C5684(0, this);
        this.f65 = new RunnableC1638(this, 0);
        this.f88 = new RunnableC1638(this, 1);
        m20(context);
        this.f90 = new C2268(2, (byte) 0);
        C0865 c0865 = new C0865(context);
        c0865.setWillNotDraw(true);
        this.f73 = c0865;
        addView(c0865);
    }

    /* JADX INFO: renamed from: ۥّ */
    public static boolean m16(View view, Rect rect, boolean z) {
        boolean z2;
        C0355 c0355 = (C0355) view.getLayoutParams();
        int i = ((ViewGroup.MarginLayoutParams) c0355).leftMargin;
        int i2 = rect.left;
        if (i != i2) {
            ((ViewGroup.MarginLayoutParams) c0355).leftMargin = i2;
            z2 = true;
        } else {
            z2 = false;
        }
        int i3 = ((ViewGroup.MarginLayoutParams) c0355).topMargin;
        int i4 = rect.top;
        if (i3 != i4) {
            ((ViewGroup.MarginLayoutParams) c0355).topMargin = i4;
            z2 = true;
        }
        int i5 = ((ViewGroup.MarginLayoutParams) c0355).rightMargin;
        int i6 = rect.right;
        if (i5 != i6) {
            ((ViewGroup.MarginLayoutParams) c0355).rightMargin = i6;
            z2 = true;
        }
        if (z) {
            int i7 = ((ViewGroup.MarginLayoutParams) c0355).bottomMargin;
            int i8 = rect.bottom;
            if (i7 != i8) {
                ((ViewGroup.MarginLayoutParams) c0355).bottomMargin = i8;
                return true;
            }
        }
        return z2;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0355;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int translationY;
        super.draw(canvas);
        if (this.f72 != null) {
            if (this.f70.getVisibility() == 0) {
                translationY = (int) (this.f70.getTranslationY() + this.f70.getBottom() + 0.5f);
            } else {
                translationY = 0;
            }
            this.f72.setBounds(0, translationY, getWidth(), this.f72.getIntrinsicHeight() + translationY);
            this.f72.draw(canvas);
        }
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0355(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0355(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f70;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C2268 c2268 = this.f90;
        return c2268.f7526 | c2268.f7527;
    }

    public CharSequence getTitle() {
        m26();
        return ((C0251) this.f68).f930.getTitle();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        m26();
        C2639 c2639M4953 = C2639.m4953(windowInsets, this);
        C3470 c3470 = c2639M4953.f8768;
        boolean zM16 = m16(this.f70, new Rect(c3470.mo2754().f17695, c3470.mo2754().f17694, c3470.mo2754().f17693, c3470.mo2754().f17696), false);
        WeakHashMap weakHashMap = AbstractC3608.f12013;
        Rect rect = this.f64;
        AbstractC5039.m8555(this, c2639M4953, rect);
        C2639 c2639Mo2741 = c3470.mo2741(rect.left, rect.top, rect.right, rect.bottom);
        this.f71 = c2639Mo2741;
        boolean z = true;
        if (!this.f76.equals(c2639Mo2741)) {
            this.f76 = this.f71;
            zM16 = true;
        }
        Rect rect2 = this.f78;
        if (rect2.equals(rect)) {
            z = zM16;
        } else {
            rect2.set(rect);
        }
        if (z) {
            requestLayout();
        }
        return c3470.mo6260().f8768.mo6091().f8768.mo6093().m4955();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m20(getContext());
        WeakHashMap weakHashMap = AbstractC3608.f12013;
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m27();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                C0355 c0355 = (C0355) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) c0355).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) c0355).topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:24:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:25:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:27:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:28:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:30:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:31:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:33:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:34:0x0104  */
    /* JADX WARN: Code duplicated, block: B:36:0x0108  */
    /* JADX WARN: Code duplicated, block: B:37:0x010e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0112  */
    /* JADX WARN: Code duplicated, block: B:40:0x0118  */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int measuredHeight;
        C2639 c2639;
        int i3;
        AbstractC0734 c3399;
        m26();
        measureChildWithMargins(this.f70, i, 0, i2, 0);
        C0355 c0355 = (C0355) this.f70.getLayoutParams();
        int iMax = Math.max(0, this.f70.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0355).leftMargin + ((ViewGroup.MarginLayoutParams) c0355).rightMargin);
        int iMax2 = Math.max(0, this.f70.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0355).topMargin + ((ViewGroup.MarginLayoutParams) c0355).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.f70.getMeasuredState());
        WeakHashMap weakHashMap = AbstractC3608.f12013;
        boolean z = (getWindowSystemUiVisibility() & 256) != 0;
        if (z) {
            measuredHeight = this.f91;
            if (this.f87 && this.f70.getTabContainer() != null) {
                measuredHeight += this.f91;
            }
        } else {
            measuredHeight = this.f70.getVisibility() != 8 ? this.f70.getMeasuredHeight() : 0;
        }
        Rect rect = this.f64;
        Rect rect2 = this.f67;
        rect2.set(rect);
        this.f81 = this.f71;
        if (this.f85 || z) {
            C5364 c5364M9014 = C5364.m9014(this.f81.f8768.mo2754().f17695, this.f81.f8768.mo2754().f17694 + measuredHeight, this.f81.f8768.mo2754().f17693, this.f81.f8768.mo2754().f17696);
            c2639 = this.f81;
            i3 = Build.VERSION.SDK_INT;
            if (i3 >= 36) {
                c3399 = new C1462(c2639);
            } else if (i3 >= 35) {
                c3399 = new C5386(c2639);
            } else if (i3 >= 34) {
                c3399 = new C1756(c2639);
            } else if (i3 >= 31) {
                c3399 = new C4277(c2639);
            } else if (i3 >= 30) {
                c3399 = new C2973(c2639);
            } else if (i3 >= 29) {
                c3399 = new C4090(c2639);
            } else {
                c3399 = new C3399(c2639);
            }
            c3399.mo1618(c5364M9014);
            this.f81 = c3399.mo1617();
        } else {
            C0865 c0865 = this.f73;
            C2639 c26310 = f62;
            Rect rect3 = this.f86;
            AbstractC5039.m8555(c0865, c26310, rect3);
            if (rect3.equals(f63)) {
                C5364 c5364M9015 = C5364.m9014(this.f81.f8768.mo2754().f17695, this.f81.f8768.mo2754().f17694 + measuredHeight, this.f81.f8768.mo2754().f17693, this.f81.f8768.mo2754().f17696);
                c2639 = this.f81;
                i3 = Build.VERSION.SDK_INT;
                if (i3 >= 36) {
                    c3399 = new C1462(c2639);
                } else if (i3 >= 35) {
                    c3399 = new C5386(c2639);
                } else if (i3 >= 34) {
                    c3399 = new C1756(c2639);
                } else if (i3 >= 31) {
                    c3399 = new C4277(c2639);
                } else if (i3 >= 30) {
                    c3399 = new C2973(c2639);
                } else if (i3 >= 29) {
                    c3399 = new C4090(c2639);
                } else {
                    c3399 = new C3399(c2639);
                }
                c3399.mo1618(c5364M9015);
                this.f81 = c3399.mo1617();
            } else {
                rect2.top += measuredHeight;
                rect2.bottom = rect2.bottom;
                this.f81 = this.f81.f8768.mo2741(0, measuredHeight, 0, 0);
            }
        }
        m16(this.f69, rect2, true);
        if (!this.f79.equals(this.f81)) {
            C2639 c26311 = this.f81;
            this.f79 = c26311;
            AbstractC3608.m6430(this.f69, c26311);
        }
        measureChildWithMargins(this.f69, i, 0, i2, 0);
        C0355 c0356 = (C0355) this.f69.getLayoutParams();
        int iMax3 = Math.max(iMax, this.f69.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0356).leftMargin + ((ViewGroup.MarginLayoutParams) c0356).rightMargin);
        int iMax4 = Math.max(iMax2, this.f69.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0356).topMargin + ((ViewGroup.MarginLayoutParams) c0356).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f69.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + iMax3, getSuggestedMinimumWidth()), i, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax4, getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.f75 || !z) {
            return false;
        }
        this.f80.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f80.getFinalY() > this.f70.getHeight()) {
            m27();
            this.f88.run();
        } else {
            m27();
            this.f65.run();
        }
        this.f83 = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.f74 + i2;
        this.f74 = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        C4075 c4075;
        C4799 c4799;
        this.f90.f7527 = i;
        this.f74 = getActionBarHideOffset();
        m27();
        InterfaceC0560 interfaceC0560 = this.f77;
        if (interfaceC0560 == null || (c4799 = (c4075 = (C4075) interfaceC0560).f13569) == null) {
            return;
        }
        c4799.m8177();
        c4075.f13569 = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f70.getVisibility() != 0) {
            return false;
        }
        return this.f75;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.f75 || this.f83) {
            return;
        }
        if (this.f74 <= this.f70.getHeight()) {
            m27();
            postDelayed(this.f65, 600L);
        } else {
            m27();
            postDelayed(this.f88, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        m26();
        int i2 = this.f66 ^ i;
        this.f66 = i;
        boolean z = (i & 4) == 0;
        boolean z2 = (i & 256) != 0;
        InterfaceC0560 interfaceC0560 = this.f77;
        if (interfaceC0560 != null) {
            C4075 c4075 = (C4075) interfaceC0560;
            c4075.f13591 = !z2;
            if (z || !z2) {
                if (c4075.f13590) {
                    c4075.f13590 = false;
                    c4075.m7260(true);
                }
            } else if (!c4075.f13590) {
                c4075.f13590 = true;
                c4075.m7260(true);
            }
        }
        if ((i2 & 256) == 0 || this.f77 == null) {
            return;
        }
        WeakHashMap weakHashMap = AbstractC3608.f12013;
        requestApplyInsets();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f89 = i;
        InterfaceC0560 interfaceC0560 = this.f77;
        if (interfaceC0560 != null) {
            ((C4075) interfaceC0560).f13588 = i;
        }
    }

    public void setActionBarHideOffset(int i) {
        m27();
        this.f70.setTranslationY(-Math.max(0, Math.min(i, this.f70.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC0560 interfaceC0560) {
        this.f77 = interfaceC0560;
        if (getWindowToken() != null) {
            ((C4075) this.f77).f13588 = this.f89;
            int i = this.f66;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                WeakHashMap weakHashMap = AbstractC3608.f12013;
                requestApplyInsets();
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.f87 = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.f75) {
            this.f75 = z;
            if (z) {
                return;
            }
            m27();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i) {
        m26();
        C0251 c0251 = (C0251) this.f68;
        c0251.f931 = i != 0 ? AbstractC4225.m7464(c0251.f930.getContext(), i) : null;
        c0251.m527();
    }

    public void setLogo(int i) {
        m26();
        C0251 c0251 = (C0251) this.f68;
        c0251.f926 = i != 0 ? AbstractC4225.m7464(c0251.f930.getContext(), i) : null;
        c0251.m527();
    }

    public void setOverlayMode(boolean z) {
        this.f85 = z;
    }

    public void setWindowCallback(Window.Callback callback) {
        m26();
        ((C0251) this.f68).f936 = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        m26();
        C0251 c0251 = (C0251) this.f68;
        if (c0251.f937) {
            return;
        }
        Toolbar toolbar = c0251.f930;
        c0251.f929 = charSequence;
        if ((c0251.f928 & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (c0251.f937) {
                AbstractC3608.m6436(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // p000.InterfaceC1031
    /* JADX INFO: renamed from: ۥؗ */
    public final void mo17(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        mo18(nestedScrollView, i, i2, i3, i4, i5);
    }

    @Override // p000.InterfaceC3055
    /* JADX INFO: renamed from: ۥُ */
    public final void mo18(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(nestedScrollView, i, i2, i3, i4);
        }
    }

    @Override // p000.InterfaceC3055
    /* JADX INFO: renamed from: ۥۗ */
    public final void mo19(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    /* JADX INFO: renamed from: ۥۜ */
    public final void m20(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f61);
        this.f91 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f72 = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.f80 = new OverScroller(context);
    }

    @Override // p000.InterfaceC3055
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo21(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    /* JADX INFO: renamed from: ۦؚ */
    public final void m23(MenuC4903 menuC4903, InterfaceC3370 interfaceC3370) {
        m26();
        C0251 c0251 = (C0251) this.f68;
        Toolbar toolbar = c0251.f930;
        C4718 c4718 = c0251.f933;
        if (c4718 == null) {
            c4718 = new C4718(toolbar.getContext());
            c0251.f933 = c4718;
        }
        c4718.f15554 = interfaceC3370;
        if (menuC4903 == null && toolbar.f159 == null) {
            return;
        }
        toolbar.m42();
        MenuC4903 menuC4904 = toolbar.f159.f101;
        if (menuC4904 == menuC4903) {
            return;
        }
        if (menuC4904 != null) {
            menuC4904.m8300(toolbar.f158);
            menuC4904.m8300(toolbar.f139);
        }
        if (toolbar.f139 == null) {
            toolbar.f139 = new C4796(toolbar);
        }
        c4718.f15557 = true;
        Context context = toolbar.f149;
        if (menuC4903 != null) {
            menuC4903.m8303(c4718, context);
            menuC4903.m8303(toolbar.f139, toolbar.f149);
        } else {
            c4718.mo3733(context, null);
            toolbar.f139.mo3733(toolbar.f149, null);
            c4718.mo4538();
            toolbar.f139.mo4538();
        }
        toolbar.f159.setPopupTheme(toolbar.f130);
        toolbar.f159.setPresenter(c4718);
        toolbar.f158 = c4718;
        toolbar.m45();
    }

    /* JADX INFO: renamed from: ۦِ */
    public final void m24(int i) {
        m26();
        if (i == 2) {
            ((C0251) this.f68).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i == 5) {
            ((C0251) this.f68).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else {
            if (i != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    @Override // p000.InterfaceC3055
    /* JADX INFO: renamed from: ۦٛ */
    public final boolean mo25(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    /* JADX INFO: renamed from: ۦۗ */
    public final void m26() {
        InterfaceC4870 wrapper;
        if (this.f69 == null) {
            this.f69 = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f70 = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback callbackFindViewById = findViewById(R.id.action_bar);
            if (callbackFindViewById instanceof InterfaceC4870) {
                wrapper = (InterfaceC4870) callbackFindViewById;
            } else {
                if (!(callbackFindViewById instanceof Toolbar)) {
                    C1078.m2276("Can't make a decor toolbar out of ".concat(callbackFindViewById.getClass().getSimpleName()));
                    return;
                }
                wrapper = ((Toolbar) callbackFindViewById).getWrapper();
            }
            this.f68 = wrapper;
        }
    }

    /* JADX INFO: renamed from: ۦۙ */
    public final void m27() {
        removeCallbacks(this.f65);
        removeCallbacks(this.f88);
        ViewPropertyAnimator viewPropertyAnimator = this.f82;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0355(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        m26();
        C0251 c0251 = (C0251) this.f68;
        c0251.f931 = drawable;
        c0251.m527();
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // p000.InterfaceC3055
    /* JADX INFO: renamed from: ۦؑ */
    public final void mo22(int i, int i2, int[] iArr, int i3) {
    }
}
