package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import p000.AbstractC2338;
import p000.AbstractC4518;
import p000.C0911;
import p000.C1092;
import p000.C1298;
import p000.C2862;
import p000.C2954;
import p000.C3121;
import p000.C4044;
import p000.C4228;
import p000.C4718;
import p000.InterfaceC1511;
import p000.InterfaceC1580;
import p000.InterfaceC2122;
import p000.InterfaceC5698;
import p000.MenuC4903;

/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class ActionMenuView extends AbstractC2338 implements InterfaceC1580, InterfaceC2122 {

    /* JADX INFO: renamed from: ۥؔ */
    public final int f92;

    /* JADX INFO: renamed from: ۥٕ */
    public Context f93;

    /* JADX INFO: renamed from: ۥۙ */
    public int f94;

    /* JADX INFO: renamed from: ۥۦ */
    public C3121 f95;

    /* JADX INFO: renamed from: ۦؖ */
    public C4718 f96;

    /* JADX INFO: renamed from: ۦؗ */
    public boolean f97;

    /* JADX INFO: renamed from: ۦؙ */
    public boolean f98;

    /* JADX INFO: renamed from: ۦُ */
    public int f99;

    /* JADX INFO: renamed from: ۦٖ */
    public final int f100;

    /* JADX INFO: renamed from: ۦٚ */
    public MenuC4903 f101;

    /* JADX INFO: renamed from: ۦۜ */
    public InterfaceC1511 f102;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.f100 = (int) (56.0f * f);
        this.f92 = (int) (f * 4.0f);
        this.f93 = context;
        this.f94 = 0;
    }

    /* JADX INFO: renamed from: ۦِ */
    public static C2862 m28(ViewGroup.LayoutParams layoutParams) {
        C2862 c2862;
        if (layoutParams == null) {
            return m29();
        }
        if (layoutParams instanceof C2862) {
            C2862 c2863 = (C2862) layoutParams;
            c2862 = new C2862(c2863);
            c2862.f9572 = c2863.f9572;
        } else {
            c2862 = new C2862(layoutParams);
        }
        if (((LinearLayout.LayoutParams) c2862).gravity <= 0) {
            ((LinearLayout.LayoutParams) c2862).gravity = 16;
        }
        return c2862;
    }

    /* JADX INFO: renamed from: ۦٛ */
    public static C2862 m29() {
        C2862 c2862 = new C2862(-2, -2);
        c2862.f9572 = false;
        ((LinearLayout.LayoutParams) c2862).gravity = 16;
        return c2862;
    }

    @Override // p000.AbstractC2338, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C2862;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // p000.AbstractC2338, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m29();
    }

    @Override // p000.AbstractC2338, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C2862(getContext(), attributeSet);
    }

    public Menu getMenu() {
        MenuC4903 menuC4903 = this.f101;
        if (menuC4903 != null) {
            return menuC4903;
        }
        Context context = getContext();
        MenuC4903 menuC4904 = new MenuC4903(context);
        this.f101 = menuC4904;
        menuC4904.f16174 = new C4228(4, this);
        C4718 c4718 = new C4718(context);
        this.f96 = c4718;
        c4718.f15552 = true;
        c4718.f15551 = true;
        c4718.f15554 = new C1298(25);
        this.f101.m8303(c4718, this.f93);
        C4718 c4719 = this.f96;
        c4719.f15571 = this;
        MenuC4903 menuC4905 = c4719.f15555;
        this.f101 = menuC4905;
        return menuC4905;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        C4718 c4718 = this.f96;
        C2954 c2954 = c4718.f15560;
        if (c2954 != null) {
            return c2954.getDrawable();
        }
        if (c4718.f15559) {
            return c4718.f15568;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f94;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C4718 c4718 = this.f96;
        if (c4718 != null) {
            c4718.mo4538();
            if (this.f96.m8051()) {
                this.f96.m8052();
                this.f96.m8053();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C4718 c4718 = this.f96;
        if (c4718 != null) {
            c4718.m8052();
            C0911 c0911 = c4718.f15564;
            if (c0911 == null || !c0911.m4342()) {
                return;
            }
            c0911.f7607.dismiss();
        }
    }

    @Override // p000.AbstractC2338, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width;
        int paddingLeft;
        if (!this.f97) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i5 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i6 = i3 - i;
        int paddingRight = (i6 - getPaddingRight()) - getPaddingLeft();
        boolean z2 = AbstractC4518.f14932;
        boolean z3 = getLayoutDirection() == 1;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                C2862 c2862 = (C2862) childAt.getLayoutParams();
                if (c2862.f9572) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (m32(i9)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z3) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) c2862).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) c2862).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i10 = i5 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i10, width, measuredHeight + i10);
                    paddingRight -= measuredWidth;
                    i7 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) c2862).leftMargin) + ((LinearLayout.LayoutParams) c2862).rightMargin;
                    m32(i9);
                    i8++;
                }
            }
        }
        if (childCount == 1 && i7 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i11 = (i6 / 2) - (measuredWidth2 / 2);
            int i12 = i5 - (measuredHeight2 / 2);
            childAt2.layout(i11, i12, measuredWidth2 + i11, measuredHeight2 + i12);
            return;
        }
        int i13 = i8 - (i7 ^ 1);
        int iMax = Math.max(0, i13 > 0 ? paddingRight / i13 : 0);
        if (z3) {
            int width2 = getWidth() - getPaddingRight();
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt3 = getChildAt(i14);
                C2862 c2863 = (C2862) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c2863.f9572) {
                    int i15 = width2 - ((LinearLayout.LayoutParams) c2863).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i16 = i5 - (measuredHeight3 / 2);
                    childAt3.layout(i15 - measuredWidth3, i16, i15, measuredHeight3 + i16);
                    width2 = i15 - ((measuredWidth3 + ((LinearLayout.LayoutParams) c2863).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt4 = getChildAt(i17);
            C2862 c2864 = (C2862) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c2864.f9572) {
                int i18 = paddingLeft2 + ((LinearLayout.LayoutParams) c2864).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i19 = i5 - (measuredHeight4 / 2);
                childAt4.layout(i18, i19, i18 + measuredWidth4, measuredHeight4 + i19);
                paddingLeft2 = measuredWidth4 + ((LinearLayout.LayoutParams) c2864).rightMargin + iMax + i18;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v41 */
    @Override // p000.AbstractC2338, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        ?? r11;
        int i5;
        int i6;
        MenuC4903 menuC4903;
        boolean z = this.f97;
        boolean z2 = View.MeasureSpec.getMode(i) == 1073741824;
        this.f97 = z2;
        if (z != z2) {
            this.f99 = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.f97 && (menuC4903 = this.f101) != null && size != this.f99) {
            this.f99 = size;
            menuC4903.m8311(true);
        }
        int childCount = getChildCount();
        if (!this.f97 || childCount <= 0) {
            for (int i7 = 0; i7 < childCount; i7++) {
                C2862 c2862 = (C2862) getChildAt(i7).getLayoutParams();
                ((LinearLayout.LayoutParams) c2862).rightMargin = 0;
                ((LinearLayout.LayoutParams) c2862).leftMargin = 0;
            }
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i);
        int size3 = View.MeasureSpec.getSize(i2);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingBottom, -2);
        int i8 = size2 - paddingRight;
        int i9 = this.f100;
        int i10 = i8 / i9;
        int i11 = i8 % i9;
        if (i10 == 0) {
            setMeasuredDimension(i8, 0);
            return;
        }
        int i12 = (i11 / i10) + i9;
        int childCount2 = getChildCount();
        int iMax = 0;
        int i13 = 0;
        int iMax2 = 0;
        int i14 = 0;
        boolean z3 = false;
        int i15 = 0;
        long j = 0;
        while (true) {
            i3 = this.f92;
            if (i14 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i14);
            int i16 = size3;
            int i17 = paddingBottom;
            if (childAt.getVisibility() == 8) {
                i5 = i12;
            } else {
                boolean z4 = childAt instanceof ActionMenuItemView;
                i13++;
                if (z4) {
                    childAt.setPadding(i3, 0, i3, 0);
                }
                C2862 c2863 = (C2862) childAt.getLayoutParams();
                c2863.f9570 = false;
                c2863.f9568 = 0;
                c2863.f9571 = 0;
                c2863.f9573 = false;
                ((LinearLayout.LayoutParams) c2863).leftMargin = 0;
                ((LinearLayout.LayoutParams) c2863).rightMargin = 0;
                c2863.f9569 = z4 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i18 = c2863.f9572 ? 1 : i10;
                C2862 c2864 = (C2862) childAt.getLayoutParams();
                int i19 = i10;
                i5 = i12;
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - i17, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z4 ? (ActionMenuItemView) childAt : null;
                boolean z5 = (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) ? false : true;
                boolean z6 = z5;
                if (i18 <= 0 || (z5 && i18 < 2)) {
                    i6 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i5 * i18, Integer.MIN_VALUE), iMakeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i6 = measuredWidth / i5;
                    if (measuredWidth % i5 != 0) {
                        i6++;
                    }
                    if (z6 && i6 < 2) {
                        i6 = 2;
                    }
                }
                c2864.f9573 = !c2864.f9572 && z6;
                c2864.f9571 = i6;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i6 * i5, 1073741824), iMakeMeasureSpec);
                iMax2 = Math.max(iMax2, i6);
                if (c2863.f9573) {
                    i15++;
                }
                if (c2863.f9572) {
                    z3 = true;
                }
                i10 = i19 - i6;
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                if (i6 == 1) {
                    j |= (long) (1 << i14);
                }
            }
            i14++;
            size3 = i16;
            paddingBottom = i17;
            i12 = i5;
        }
        int i20 = size3;
        int i21 = i10;
        int i22 = i12;
        boolean z7 = z3 && i13 == 2;
        int i23 = i21;
        boolean z8 = false;
        while (true) {
            if (i15 <= 0 || i23 <= 0) {
                i4 = iMax;
                break;
            }
            int i24 = Integer.MAX_VALUE;
            long j2 = 0;
            int i25 = 0;
            int i26 = 0;
            while (i26 < childCount2) {
                int i27 = iMax;
                C2862 c2865 = (C2862) getChildAt(i26).getLayoutParams();
                boolean z9 = z7;
                if (c2865.f9573) {
                    int i28 = c2865.f9571;
                    if (i28 < i24) {
                        j2 = 1 << i26;
                        i24 = i28;
                        i25 = 1;
                    } else if (i28 == i24) {
                        j2 |= 1 << i26;
                        i25++;
                    }
                }
                i26++;
                z7 = z9;
                iMax = i27;
            }
            i4 = iMax;
            boolean z10 = z7;
            j |= j2;
            if (i25 > i23) {
                break;
            }
            int i29 = i24 + 1;
            int i30 = 0;
            while (i30 < childCount2) {
                View childAt2 = getChildAt(i30);
                C2862 c2866 = (C2862) childAt2.getLayoutParams();
                boolean z11 = z3;
                long j3 = 1 << i30;
                if ((j2 & j3) != 0) {
                    if (z10 && c2866.f9569) {
                        r11 = 1;
                        r11 = 1;
                        if (i23 == 1) {
                            childAt2.setPadding(i3 + i22, 0, i3, 0);
                        }
                    } else {
                        r11 = 1;
                    }
                    c2866.f9571 += r11;
                    c2866.f9570 = r11;
                    i23--;
                } else if (c2866.f9571 == i29) {
                    j |= j3;
                }
                i30++;
                z3 = z11;
            }
            z7 = z10;
            iMax = i4;
            z8 = true;
        }
        boolean z12 = !z3 && i13 == 1;
        if (i23 > 0 && j != 0 && (i23 < i13 - 1 || z12 || iMax2 > 1)) {
            float fBitCount = Long.bitCount(j);
            if (!z12) {
                if ((j & 1) != 0 && !((C2862) getChildAt(0).getLayoutParams()).f9569) {
                    fBitCount -= 0.5f;
                }
                int i31 = childCount2 - 1;
                if ((j & ((long) (1 << i31))) != 0 && !((C2862) getChildAt(i31).getLayoutParams()).f9569) {
                    fBitCount -= 0.5f;
                }
            }
            int i32 = fBitCount > 0.0f ? (int) ((i23 * i22) / fBitCount) : 0;
            boolean z13 = z8;
            for (int i33 = 0; i33 < childCount2; i33++) {
                if ((j & ((long) (1 << i33))) != 0) {
                    View childAt3 = getChildAt(i33);
                    C2862 c2867 = (C2862) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        c2867.f9568 = i32;
                        c2867.f9570 = true;
                        if (i33 == 0 && !c2867.f9569) {
                            ((LinearLayout.LayoutParams) c2867).leftMargin = (-i32) / 2;
                        }
                        z13 = true;
                    } else if (c2867.f9572) {
                        c2867.f9568 = i32;
                        c2867.f9570 = true;
                        ((LinearLayout.LayoutParams) c2867).rightMargin = (-i32) / 2;
                        z13 = true;
                    } else {
                        if (i33 != 0) {
                            ((LinearLayout.LayoutParams) c2867).leftMargin = i32 / 2;
                        }
                        if (i33 != childCount2 - 1) {
                            ((LinearLayout.LayoutParams) c2867).rightMargin = i32 / 2;
                        }
                    }
                }
            }
            z8 = z13;
        }
        if (z8) {
            for (int i34 = 0; i34 < childCount2; i34++) {
                View childAt4 = getChildAt(i34);
                C2862 c2868 = (C2862) childAt4.getLayoutParams();
                if (c2868.f9570) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((c2868.f9571 * i22) + c2868.f9568, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i8, mode != 1073741824 ? i4 : i20);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.f96.f15557 = z;
    }

    public void setOnMenuItemClickListener(InterfaceC1511 interfaceC1511) {
        this.f102 = interfaceC1511;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        C4718 c4718 = this.f96;
        C2954 c2954 = c4718.f15560;
        if (c2954 != null) {
            c2954.setImageDrawable(drawable);
        } else {
            c4718.f15559 = true;
            c4718.f15568 = drawable;
        }
    }

    public void setOverflowReserved(boolean z) {
        this.f98 = z;
    }

    public void setPopupTheme(int i) {
        if (this.f94 != i) {
            this.f94 = i;
            if (i == 0) {
                this.f93 = getContext();
            } else {
                this.f93 = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(C4718 c4718) {
        this.f96 = c4718;
        c4718.f15571 = this;
        this.f101 = c4718.f15555;
    }

    @Override // p000.AbstractC2338
    /* JADX INFO: renamed from: ۥُ */
    public final /* bridge */ /* synthetic */ C4044 generateDefaultLayoutParams() {
        return m29();
    }

    @Override // p000.AbstractC2338
    /* JADX INFO: renamed from: ۥّ */
    public final C4044 generateLayoutParams(AttributeSet attributeSet) {
        return new C2862(getContext(), attributeSet);
    }

    @Override // p000.InterfaceC2122
    /* JADX INFO: renamed from: ۥۗ */
    public final void mo5(MenuC4903 menuC4903) {
        this.f101 = menuC4903;
    }

    @Override // p000.InterfaceC1580
    /* JADX INFO: renamed from: ۥۣ */
    public final boolean mo6(C1092 c1092) {
        return this.f101.m8299(c1092, null, 0);
    }

    /* JADX INFO: renamed from: ۦۗ */
    public final boolean m32(int i) {
        boolean zMo1 = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof InterfaceC5698)) {
            zMo1 = ((InterfaceC5698) childAt).mo1();
        }
        return (i <= 0 || !(childAt2 instanceof InterfaceC5698)) ? zMo1 : ((InterfaceC5698) childAt2).mo0() | zMo1;
    }

    @Override // p000.AbstractC2338
    /* JADX INFO: renamed from: ۦۙ */
    public final /* bridge */ /* synthetic */ C4044 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m28(layoutParams);
    }

    @Override // p000.AbstractC2338, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m28(layoutParams);
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }
}
