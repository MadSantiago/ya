package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import p000.AbstractC2101;
import p000.AbstractC3166;
import p000.AbstractC3608;
import p000.AbstractC4225;
import p000.AbstractC4518;
import p000.AbstractC5618;
import p000.C0251;
import p000.C0532;
import p000.C0758;
import p000.C1039;
import p000.C1092;
import p000.C1156;
import p000.C1619;
import p000.C1685;
import p000.C2050;
import p000.C2808;
import p000.C3121;
import p000.C3755;
import p000.C3837;
import p000.C4718;
import p000.C4796;
import p000.C5460;
import p000.InterfaceC1022;
import p000.InterfaceC4870;
import p000.MenuC4903;
import p000.RunnableC0723;
import p000.RunnableC3365;
import p000.ViewOnClickListenerC2046;
import p000.ViewOnClickListenerC3684;
import ru.bluecat.yandexmapspatcher.R;

/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class Toolbar extends ViewGroup {

    /* JADX INFO: renamed from: ۥؓ */
    public int f117;

    /* JADX INFO: renamed from: ۥؔ */
    public CharSequence f118;

    /* JADX INFO: renamed from: ۥؖ */
    public int f119;

    /* JADX INFO: renamed from: ۥؙ */
    public final C1039 f120;

    /* JADX INFO: renamed from: ۥؚ */
    public ArrayList f121;

    /* JADX INFO: renamed from: ۥً */
    public final int f122;

    /* JADX INFO: renamed from: ۥَ */
    public C0532 f123;

    /* JADX INFO: renamed from: ۥِ */
    public OnBackInvokedDispatcher f124;

    /* JADX INFO: renamed from: ۥْ */
    public C3755 f125;

    /* JADX INFO: renamed from: ۥٓ */
    public C1685 f126;

    /* JADX INFO: renamed from: ۥٕ */
    public int f127;

    /* JADX INFO: renamed from: ۥٖ */
    public final Drawable f128;

    /* JADX INFO: renamed from: ۥ٘ */
    public boolean f129;

    /* JADX INFO: renamed from: ۥٙ */
    public int f130;

    /* JADX INFO: renamed from: ۥٛ */
    public boolean f131;

    /* JADX INFO: renamed from: ۥٝ */
    public final int[] f132;

    /* JADX INFO: renamed from: ۥۖ */
    public View f133;

    /* JADX INFO: renamed from: ۥۘ */
    public boolean f134;

    /* JADX INFO: renamed from: ۥۙ */
    public int f135;

    /* JADX INFO: renamed from: ۥ۟ */
    public final C2808 f136;

    /* JADX INFO: renamed from: ۥۡ */
    public C0251 f137;

    /* JADX INFO: renamed from: ۥۤ */
    public final ArrayList f138;

    /* JADX INFO: renamed from: ۥۥ */
    public C4796 f139;

    /* JADX INFO: renamed from: ۥۦ */
    public int f140;

    /* JADX INFO: renamed from: ۥۧ */
    public final int f141;

    /* JADX INFO: renamed from: ۥۨ */
    public boolean f142;

    /* JADX INFO: renamed from: ۦؒ */
    public final ArrayList f143;

    /* JADX INFO: renamed from: ۦؔ */
    public final RunnableC3365 f144;

    /* JADX INFO: renamed from: ۦؖ */
    public C0758 f145;

    /* JADX INFO: renamed from: ۦؗ */
    public int f146;

    /* JADX INFO: renamed from: ۦؙ */
    public int f147;

    /* JADX INFO: renamed from: ۦُ */
    public final int f148;

    /* JADX INFO: renamed from: ۦٕ */
    public Context f149;

    /* JADX INFO: renamed from: ۦٖ */
    public CharSequence f150;

    /* JADX INFO: renamed from: ۦٗ */
    public final CharSequence f151;

    /* JADX INFO: renamed from: ۦٚ */
    public int f152;

    /* JADX INFO: renamed from: ۦۛ */
    public C1685 f153;

    /* JADX INFO: renamed from: ۦۜ */
    public ColorStateList f154;

    /* JADX INFO: renamed from: ۦ۟ */
    public C3755 f155;

    /* JADX INFO: renamed from: ۦ۠ */
    public OnBackInvokedCallback f156;

    /* JADX INFO: renamed from: ۦۣ */
    public ColorStateList f157;

    /* JADX INFO: renamed from: ۦۧ */
    public C4718 f158;

    /* JADX INFO: renamed from: ۦۨ */
    public ActionMenuView f159;

    public Toolbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.f148 = 8388627;
        this.f138 = new ArrayList();
        this.f143 = new ArrayList();
        this.f132 = new int[2];
        this.f136 = new C2808(new RunnableC0723(this, 1));
        this.f121 = new ArrayList();
        this.f120 = new C1039(15, this);
        this.f144 = new RunnableC3365(12, this);
        Context context2 = getContext();
        int[] iArr = AbstractC5618.f18517;
        C5460 c5460M9119 = C5460.m9119(context2, attributeSet, iArr, R.attr.toolbarStyle);
        AbstractC3608.m6435(this, context, iArr, attributeSet, (TypedArray) c5460M9119.f17999, R.attr.toolbarStyle);
        TypedArray typedArray = (TypedArray) c5460M9119.f17999;
        this.f119 = typedArray.getResourceId(28, 0);
        this.f117 = typedArray.getResourceId(19, 0);
        this.f148 = typedArray.getInteger(0, 8388627);
        this.f141 = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.f147 = dimensionPixelOffset;
        this.f135 = dimensionPixelOffset;
        this.f127 = dimensionPixelOffset;
        this.f152 = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.f152 = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.f127 = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.f135 = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.f147 = dimensionPixelOffset5;
        }
        this.f122 = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        m48();
        C0758 c0758 = this.f145;
        c0758.f2755 = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            c0758.f2752 = dimensionPixelSize;
            c0758.f2756 = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            c0758.f2753 = dimensionPixelSize2;
            c0758.f2754 = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            c0758.m1645(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.f140 = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.f146 = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.f128 = c5460M9119.m9123(4);
        this.f151 = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.f149 = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable drawableM9123 = c5460M9119.m9123(16);
        if (drawableM9123 != null) {
            setNavigationIcon(drawableM9123);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable drawableM9124 = c5460M9119.m9123(11);
        if (drawableM9124 != null) {
            setLogo(drawableM9124);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(c5460M9119.m9120(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(c5460M9119.m9120(20));
        }
        if (typedArray.hasValue(14)) {
            getMenuInflater().inflate(typedArray.getResourceId(14, 0), getMenu());
        }
        c5460M9119.m9126();
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i = 0; i < menu.size(); i++) {
            arrayList.add(menu.getItem(i));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new C3837(getContext());
    }

    /* JADX INFO: renamed from: ۥۜ */
    public static C1156 m35() {
        C1156 c1156 = new C1156(-2, -2);
        c1156.f4012 = 0;
        c1156.f4013 = 8388627;
        return c1156;
    }

    /* JADX INFO: renamed from: ۦؚ */
    public static int m36(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* JADX INFO: renamed from: ۦٛ */
    public static C1156 m37(ViewGroup.LayoutParams layoutParams) {
        boolean z = layoutParams instanceof C1156;
        if (z) {
            C1156 c1156 = (C1156) layoutParams;
            C1156 c1157 = new C1156(c1156);
            c1157.f4012 = 0;
            c1157.f4012 = c1156.f4012;
            return c1157;
        }
        if (z) {
            C1156 c1158 = new C1156((C1156) layoutParams);
            c1158.f4012 = 0;
            return c1158;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            C1156 c1159 = new C1156(layoutParams);
            c1159.f4012 = 0;
            return c1159;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        C1156 c11510 = new C1156(marginLayoutParams);
        c11510.f4012 = 0;
        ((ViewGroup.MarginLayoutParams) c11510).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) c11510).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) c11510).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) c11510).bottomMargin = marginLayoutParams.bottomMargin;
        return c11510;
    }

    /* JADX INFO: renamed from: ۦۗ */
    public static int m38(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C1156);
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m35();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        C1156 c1156 = new C1156(context, attributeSet);
        c1156.f4013 = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC5618.f18518);
        c1156.f4013 = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        c1156.f4012 = 0;
        return c1156;
    }

    public CharSequence getCollapseContentDescription() {
        C1685 c1685 = this.f153;
        if (c1685 != null) {
            return c1685.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        C1685 c1685 = this.f153;
        if (c1685 != null) {
            return c1685.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        C0758 c0758 = this.f145;
        if (c0758 != null) {
            return c0758.f2758 ? c0758.f2756 : c0758.f2754;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.f146;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        C0758 c0758 = this.f145;
        if (c0758 != null) {
            return c0758.f2756;
        }
        return 0;
    }

    public int getContentInsetRight() {
        C0758 c0758 = this.f145;
        if (c0758 != null) {
            return c0758.f2754;
        }
        return 0;
    }

    public int getContentInsetStart() {
        C0758 c0758 = this.f145;
        if (c0758 != null) {
            return c0758.f2758 ? c0758.f2754 : c0758.f2756;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.f140;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        MenuC4903 menuC4903;
        ActionMenuView actionMenuView = this.f159;
        return (actionMenuView == null || (menuC4903 = actionMenuView.f101) == null || !menuC4903.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.f146, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f140, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        C0532 c0532 = this.f123;
        if (c0532 != null) {
            return c0532.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        C0532 c0532 = this.f123;
        if (c0532 != null) {
            return c0532.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        m41();
        return this.f159.getMenu();
    }

    public View getNavButtonView() {
        return this.f126;
    }

    public CharSequence getNavigationContentDescription() {
        C1685 c1685 = this.f126;
        if (c1685 != null) {
            return c1685.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        C1685 c1685 = this.f126;
        if (c1685 != null) {
            return c1685.getDrawable();
        }
        return null;
    }

    public C4718 getOuterActionMenuPresenter() {
        return this.f158;
    }

    public Drawable getOverflowIcon() {
        m41();
        return this.f159.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f149;
    }

    public int getPopupTheme() {
        return this.f130;
    }

    public CharSequence getSubtitle() {
        return this.f118;
    }

    public final TextView getSubtitleTextView() {
        return this.f125;
    }

    public CharSequence getTitle() {
        return this.f150;
    }

    public int getTitleMarginBottom() {
        return this.f147;
    }

    public int getTitleMarginEnd() {
        return this.f127;
    }

    public int getTitleMarginStart() {
        return this.f152;
    }

    public int getTitleMarginTop() {
        return this.f135;
    }

    public final TextView getTitleTextView() {
        return this.f155;
    }

    public InterfaceC4870 getWrapper() {
        Drawable drawable;
        C0251 c0251 = this.f137;
        if (c0251 == null) {
            c0251 = new C0251();
            c0251.f938 = 0;
            c0251.f930 = this;
            c0251.f929 = getTitle();
            c0251.f935 = getSubtitle();
            c0251.f937 = c0251.f929 != null;
            c0251.f927 = getNavigationIcon();
            C5460 c5460M9119 = C5460.m9119(getContext(), null, AbstractC5618.f18520, R.attr.actionBarStyle);
            TypedArray typedArray = (TypedArray) c5460M9119.f17999;
            c0251.f939 = c5460M9119.m9123(15);
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                c0251.f937 = true;
                c0251.f929 = text;
                if ((c0251.f928 & 8) != 0) {
                    setTitle(text);
                    if (c0251.f937) {
                        AbstractC3608.m6436(getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                c0251.f935 = text2;
                if ((c0251.f928 & 8) != 0) {
                    setSubtitle(text2);
                }
            }
            Drawable drawableM9123 = c5460M9119.m9123(20);
            if (drawableM9123 != null) {
                c0251.f926 = drawableM9123;
                c0251.m527();
            }
            Drawable drawableM9124 = c5460M9119.m9123(17);
            if (drawableM9124 != null) {
                c0251.f931 = drawableM9124;
                c0251.m527();
            }
            if (c0251.f927 == null && (drawable = c0251.f939) != null) {
                c0251.f927 = drawable;
                if ((c0251.f928 & 4) != 0) {
                    setNavigationIcon(drawable);
                } else {
                    setNavigationIcon((Drawable) null);
                }
            }
            c0251.m529(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View viewInflate = LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) this, false);
                View view = c0251.f925;
                if (view != null && (c0251.f928 & 16) != 0) {
                    removeView(view);
                }
                c0251.f925 = viewInflate;
                if (viewInflate != null && (c0251.f928 & 16) != 0) {
                    addView(viewInflate);
                }
                c0251.m529(c0251.f928 | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                layoutParams.height = layoutDimension;
                setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                int iMax = Math.max(dimensionPixelOffset, 0);
                int iMax2 = Math.max(dimensionPixelOffset2, 0);
                m48();
                this.f145.m1645(iMax, iMax2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = getContext();
                this.f119 = resourceId2;
                C3755 c3755 = this.f155;
                if (c3755 != null) {
                    c3755.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = getContext();
                this.f117 = resourceId3;
                C3755 c3756 = this.f125;
                if (c3756 != null) {
                    c3756.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                setPopupTheme(resourceId4);
            }
            c5460M9119.m9126();
            if (R.string.abc_action_bar_up_description != c0251.f938) {
                c0251.f938 = R.string.abc_action_bar_up_description;
                if (TextUtils.isEmpty(getNavigationContentDescription())) {
                    int i = c0251.f938;
                    c0251.f934 = i != 0 ? getContext().getString(i) : null;
                    c0251.m528();
                }
            }
            c0251.f934 = getNavigationContentDescription();
            setNavigationOnClickListener(new ViewOnClickListenerC2046(c0251));
            this.f137 = c0251;
        }
        return c0251;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m45();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f144);
        m45();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f131 = false;
        }
        if (!this.f131) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f131 = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f131 = false;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x024b  */
    /* JADX WARN: Code duplicated, block: B:102:0x024e  */
    /* JADX WARN: Code duplicated, block: B:103:0x0270  */
    /* JADX WARN: Code duplicated, block: B:105:0x0273  */
    /* JADX WARN: Code duplicated, block: B:108:0x0285 A[LOOP:0: B:107:0x0283->B:108:0x0285, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:111:0x029d A[LOOP:1: B:110:0x029b->B:111:0x029d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:114:0x02bd A[LOOP:2: B:113:0x02bb->B:114:0x02bd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:118:0x0303 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:119:0x0305  */
    /* JADX WARN: Code duplicated, block: B:120:0x0309  */
    /* JADX WARN: Code duplicated, block: B:123:0x0310 A[LOOP:3: B:122:0x030e->B:123:0x0310, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:20:0x0060  */
    /* JADX WARN: Code duplicated, block: B:22:0x0064  */
    /* JADX WARN: Code duplicated, block: B:23:0x0069  */
    /* JADX WARN: Code duplicated, block: B:26:0x0075  */
    /* JADX WARN: Code duplicated, block: B:28:0x0079  */
    /* JADX WARN: Code duplicated, block: B:29:0x007e  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:47:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:48:0x0115  */
    /* JADX WARN: Code duplicated, block: B:51:0x011b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x011d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0120  */
    /* JADX WARN: Code duplicated, block: B:55:0x0124  */
    /* JADX WARN: Code duplicated, block: B:56:0x0127  */
    /* JADX WARN: Code duplicated, block: B:59:0x0139  */
    /* JADX WARN: Code duplicated, block: B:61:0x0141 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:68:0x015a  */
    /* JADX WARN: Code duplicated, block: B:70:0x015e  */
    /* JADX WARN: Code duplicated, block: B:72:0x016f  */
    /* JADX WARN: Code duplicated, block: B:73:0x0171  */
    /* JADX WARN: Code duplicated, block: B:75:0x017d  */
    /* JADX WARN: Code duplicated, block: B:77:0x0189  */
    /* JADX WARN: Code duplicated, block: B:78:0x0193  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:82:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:85:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:86:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:88:0x01df  */
    /* JADX WARN: Code duplicated, block: B:89:0x0203  */
    /* JADX WARN: Code duplicated, block: B:91:0x0206  */
    /* JADX WARN: Code duplicated, block: B:93:0x020e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:94:0x0210  */
    /* JADX WARN: Code duplicated, block: B:96:0x0214  */
    /* JADX WARN: Code duplicated, block: B:99:0x0228  */
    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iM54;
        int iM53;
        int iMax;
        int iMin;
        boolean zM40;
        boolean zM41;
        int measuredHeight;
        C3755 c3755;
        C3755 c3756;
        C1156 c1156;
        C1156 c1157;
        int i5;
        boolean z2;
        int i6;
        int i7;
        int paddingTop;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int iMax2;
        int i14;
        int i15;
        int i16;
        int i17;
        ArrayList arrayList;
        int size;
        int iM55;
        int i18;
        int size2;
        int i19;
        int i20;
        int size3;
        int i21;
        int i22;
        int measuredWidth;
        int i23;
        int i24;
        int i25;
        int size4;
        C0532 c0532;
        View view;
        ActionMenuView actionMenuView;
        C1685 c1685;
        boolean z3 = getLayoutDirection() == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i26 = width - paddingRight;
        int[] iArr = this.f132;
        iArr[1] = 0;
        iArr[0] = 0;
        WeakHashMap weakHashMap = AbstractC3608.f12013;
        int minimumHeight = getMinimumHeight();
        int iMin2 = minimumHeight >= 0 ? Math.min(minimumHeight, i4 - i2) : 0;
        if (m40(this.f126)) {
            C1685 c1686 = this.f126;
            if (z3) {
                iM53 = m53(c1686, i26, iMin2, iArr);
                iM54 = paddingLeft;
            } else {
                iM54 = m54(c1686, paddingLeft, iMin2, iArr);
            }
            if (m40(this.f153)) {
                c1685 = this.f153;
                if (z3) {
                    iM53 = m53(c1685, iM53, iMin2, iArr);
                } else {
                    iM54 = m54(c1685, iM54, iMin2, iArr);
                }
            }
            if (m40(this.f159)) {
                actionMenuView = this.f159;
                if (z3) {
                    iM54 = m54(actionMenuView, iM54, iMin2, iArr);
                } else {
                    iM53 = m53(actionMenuView, iM53, iMin2, iArr);
                }
            }
            int currentContentInsetLeft = getCurrentContentInsetLeft();
            int currentContentInsetRight = getCurrentContentInsetRight();
            iArr[0] = Math.max(0, currentContentInsetLeft - iM54);
            iArr[1] = Math.max(0, currentContentInsetRight - (i26 - iM53));
            iMax = Math.max(iM54, currentContentInsetLeft);
            iMin = Math.min(iM53, i26 - currentContentInsetRight);
            if (m40(this.f133)) {
                view = this.f133;
                if (z3) {
                    iMin = m53(view, iMin, iMin2, iArr);
                } else {
                    iMax = m54(view, iMax, iMin2, iArr);
                }
            }
            if (m40(this.f123)) {
                c0532 = this.f123;
                if (z3) {
                    iMin = m53(c0532, iMin, iMin2, iArr);
                } else {
                    iMax = m54(c0532, iMax, iMin2, iArr);
                }
            }
            zM40 = m40(this.f155);
            zM41 = m40(this.f125);
            if (zM40) {
                C1156 c1158 = (C1156) this.f155.getLayoutParams();
                measuredHeight = this.f155.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c1158).topMargin + ((ViewGroup.MarginLayoutParams) c1158).bottomMargin;
            } else {
                measuredHeight = 0;
            }
            if (zM41) {
                C1156 c1159 = (C1156) this.f125.getLayoutParams();
                measuredHeight = this.f125.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c1159).topMargin + ((ViewGroup.MarginLayoutParams) c1159).bottomMargin + measuredHeight;
            }
            if (zM40 || zM41) {
                if (zM40) {
                    c3755 = this.f155;
                } else {
                    c3755 = this.f125;
                }
                if (zM41) {
                    c3756 = this.f125;
                } else {
                    c3756 = this.f155;
                }
                c1156 = (C1156) c3755.getLayoutParams();
                c1157 = (C1156) c3756.getLayoutParams();
                i5 = measuredHeight;
                z2 = (!zM40 && this.f155.getMeasuredWidth() > 0) || (zM41 && this.f125.getMeasuredWidth() > 0);
                i6 = this.f148 & 112;
                i7 = iMax;
                if (i6 == 48) {
                    paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) c1156).topMargin + this.f135;
                } else if (i6 != 80) {
                    iMax2 = (((height - paddingTop2) - paddingBottom) - i5) / 2;
                    i14 = ((ViewGroup.MarginLayoutParams) c1156).topMargin + this.f135;
                    if (iMax2 < i14) {
                        iMax2 = i14;
                    } else {
                        i15 = (((height - paddingBottom) - i5) - iMax2) - paddingTop2;
                        i16 = ((ViewGroup.MarginLayoutParams) c1156).bottomMargin;
                        i17 = this.f147;
                        if (i15 < i16 + i17) {
                            iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) c1157).bottomMargin + i17) - i15));
                        }
                    }
                    paddingTop = paddingTop2 + iMax2;
                } else {
                    paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) c1157).bottomMargin) - this.f147) - i5;
                }
                if (z3) {
                    if (z2) {
                        i11 = this.f152;
                    } else {
                        i11 = 0;
                    }
                    int i27 = i11 - iArr[1];
                    iMin -= Math.max(0, i27);
                    iArr[1] = Math.max(0, -i27);
                    if (zM40) {
                        C1156 c11510 = (C1156) this.f155.getLayoutParams();
                        int measuredWidth2 = iMin - this.f155.getMeasuredWidth();
                        int measuredHeight2 = this.f155.getMeasuredHeight() + paddingTop;
                        this.f155.layout(measuredWidth2, paddingTop, iMin, measuredHeight2);
                        i12 = measuredWidth2 - this.f127;
                        paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) c11510).bottomMargin;
                    } else {
                        i12 = iMin;
                    }
                    if (zM41) {
                        int i28 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C1156) this.f125.getLayoutParams())).topMargin;
                        this.f125.layout(iMin - this.f125.getMeasuredWidth(), i28, iMin, this.f125.getMeasuredHeight() + i28);
                        i13 = iMin - this.f127;
                    } else {
                        i13 = iMin;
                    }
                    if (z2) {
                        iMin = Math.min(i12, i13);
                    }
                    iMax = i7;
                } else {
                    if (z2) {
                        i8 = this.f152;
                    } else {
                        i8 = 0;
                    }
                    int i29 = i8 - iArr[0];
                    iMax = Math.max(0, i29) + i7;
                    iArr[0] = Math.max(0, -i29);
                    if (zM40) {
                        C1156 c11511 = (C1156) this.f155.getLayoutParams();
                        int measuredWidth3 = this.f155.getMeasuredWidth() + iMax;
                        int measuredHeight3 = this.f155.getMeasuredHeight() + paddingTop;
                        this.f155.layout(iMax, paddingTop, measuredWidth3, measuredHeight3);
                        i9 = measuredWidth3 + this.f127;
                        paddingTop = measuredHeight3 + ((ViewGroup.MarginLayoutParams) c11511).bottomMargin;
                    } else {
                        i9 = iMax;
                    }
                    if (zM41) {
                        int i30 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C1156) this.f125.getLayoutParams())).topMargin;
                        int measuredWidth4 = this.f125.getMeasuredWidth() + iMax;
                        this.f125.layout(iMax, i30, measuredWidth4, this.f125.getMeasuredHeight() + i30);
                        i10 = measuredWidth4 + this.f127;
                    } else {
                        i10 = iMax;
                    }
                    if (z2) {
                        iMax = Math.max(i9, i10);
                    }
                }
            }
            arrayList = this.f138;
            m47(3, arrayList);
            size = arrayList.size();
            iM55 = iMax;
            for (i18 = 0; i18 < size; i18++) {
                iM55 = m54((View) arrayList.get(i18), iM55, iMin2, iArr);
            }
            m47(5, arrayList);
            size2 = arrayList.size();
            for (i19 = 0; i19 < size2; i19++) {
                iMin = m53((View) arrayList.get(i19), iMin, iMin2, iArr);
            }
            m47(1, arrayList);
            int i31 = iArr[0];
            i20 = iArr[1];
            size3 = arrayList.size();
            i21 = i31;
            i22 = 0;
            measuredWidth = 0;
            while (i22 < size3) {
                View view2 = (View) arrayList.get(i22);
                C1156 c11512 = (C1156) view2.getLayoutParams();
                int i32 = i20;
                int i33 = ((ViewGroup.MarginLayoutParams) c11512).leftMargin - i21;
                int i34 = ((ViewGroup.MarginLayoutParams) c11512).rightMargin - i32;
                int iMax3 = Math.max(0, i33);
                int iMax4 = Math.max(0, i34);
                int iMax5 = Math.max(0, -i33);
                int iMax6 = Math.max(0, -i34);
                measuredWidth += view2.getMeasuredWidth() + iMax3 + iMax4;
                i22++;
                i21 = iMax5;
                i20 = iMax6;
            }
            i24 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (measuredWidth / 2);
            i25 = measuredWidth + i24;
            if (i24 >= iM55) {
                if (i25 > iMin) {
                    iM55 = i24 - (i25 - iMin);
                } else {
                    iM55 = i24;
                }
            }
            size4 = arrayList.size();
            for (i23 = 0; i23 < size4; i23++) {
                iM55 = m54((View) arrayList.get(i23), iM55, iMin2, iArr);
            }
            arrayList.clear();
        }
        iM54 = paddingLeft;
        iM53 = i26;
        if (m40(this.f153)) {
            c1685 = this.f153;
            if (z3) {
                iM53 = m53(c1685, iM53, iMin2, iArr);
            } else {
                iM54 = m54(c1685, iM54, iMin2, iArr);
            }
        }
        if (m40(this.f159)) {
            actionMenuView = this.f159;
            if (z3) {
                iM54 = m54(actionMenuView, iM54, iMin2, iArr);
            } else {
                iM53 = m53(actionMenuView, iM53, iMin2, iArr);
            }
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - iM54);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i26 - iM53));
        iMax = Math.max(iM54, currentContentInsetLeft2);
        iMin = Math.min(iM53, i26 - currentContentInsetRight2);
        if (m40(this.f133)) {
            view = this.f133;
            if (z3) {
                iMin = m53(view, iMin, iMin2, iArr);
            } else {
                iMax = m54(view, iMax, iMin2, iArr);
            }
        }
        if (m40(this.f123)) {
            c0532 = this.f123;
            if (z3) {
                iMin = m53(c0532, iMin, iMin2, iArr);
            } else {
                iMax = m54(c0532, iMax, iMin2, iArr);
            }
        }
        zM40 = m40(this.f155);
        zM41 = m40(this.f125);
        if (zM40) {
            C1156 c11513 = (C1156) this.f155.getLayoutParams();
            measuredHeight = this.f155.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c11513).topMargin + ((ViewGroup.MarginLayoutParams) c11513).bottomMargin;
        } else {
            measuredHeight = 0;
        }
        if (zM41) {
            C1156 c11514 = (C1156) this.f125.getLayoutParams();
            measuredHeight = this.f125.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c11514).topMargin + ((ViewGroup.MarginLayoutParams) c11514).bottomMargin + measuredHeight;
        }
        if (zM40) {
            if (zM40) {
                c3755 = this.f155;
            } else {
                c3755 = this.f125;
            }
            if (zM41) {
                c3756 = this.f125;
            } else {
                c3756 = this.f155;
            }
            c1156 = (C1156) c3755.getLayoutParams();
            c1157 = (C1156) c3756.getLayoutParams();
            i5 = measuredHeight;
            if (zM40) {
            }
            i6 = this.f148 & 112;
            i7 = iMax;
            if (i6 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) c1156).topMargin + this.f135;
            } else if (i6 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - i5) / 2;
                i14 = ((ViewGroup.MarginLayoutParams) c1156).topMargin + this.f135;
                if (iMax2 < i14) {
                    iMax2 = i14;
                } else {
                    i15 = (((height - paddingBottom) - i5) - iMax2) - paddingTop2;
                    i16 = ((ViewGroup.MarginLayoutParams) c1156).bottomMargin;
                    i17 = this.f147;
                    if (i15 < i16 + i17) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) c1157).bottomMargin + i17) - i15));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) c1157).bottomMargin) - this.f147) - i5;
            }
            if (z3) {
                if (z2) {
                    i11 = this.f152;
                } else {
                    i11 = 0;
                }
                int i210 = i11 - iArr[1];
                iMin -= Math.max(0, i210);
                iArr[1] = Math.max(0, -i210);
                if (zM40) {
                    C1156 c11515 = (C1156) this.f155.getLayoutParams();
                    int measuredWidth5 = iMin - this.f155.getMeasuredWidth();
                    int measuredHeight4 = this.f155.getMeasuredHeight() + paddingTop;
                    this.f155.layout(measuredWidth5, paddingTop, iMin, measuredHeight4);
                    i12 = measuredWidth5 - this.f127;
                    paddingTop = measuredHeight4 + ((ViewGroup.MarginLayoutParams) c11515).bottomMargin;
                } else {
                    i12 = iMin;
                }
                if (zM41) {
                    int i211 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C1156) this.f125.getLayoutParams())).topMargin;
                    this.f125.layout(iMin - this.f125.getMeasuredWidth(), i211, iMin, this.f125.getMeasuredHeight() + i211);
                    i13 = iMin - this.f127;
                } else {
                    i13 = iMin;
                }
                if (z2) {
                    iMin = Math.min(i12, i13);
                }
                iMax = i7;
            } else {
                if (z2) {
                    i8 = this.f152;
                } else {
                    i8 = 0;
                }
                int i212 = i8 - iArr[0];
                iMax = Math.max(0, i212) + i7;
                iArr[0] = Math.max(0, -i212);
                if (zM40) {
                    C1156 c11516 = (C1156) this.f155.getLayoutParams();
                    int measuredWidth6 = this.f155.getMeasuredWidth() + iMax;
                    int measuredHeight5 = this.f155.getMeasuredHeight() + paddingTop;
                    this.f155.layout(iMax, paddingTop, measuredWidth6, measuredHeight5);
                    i9 = measuredWidth6 + this.f127;
                    paddingTop = measuredHeight5 + ((ViewGroup.MarginLayoutParams) c11516).bottomMargin;
                } else {
                    i9 = iMax;
                }
                if (zM41) {
                    int i35 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C1156) this.f125.getLayoutParams())).topMargin;
                    int measuredWidth7 = this.f125.getMeasuredWidth() + iMax;
                    this.f125.layout(iMax, i35, measuredWidth7, this.f125.getMeasuredHeight() + i35);
                    i10 = measuredWidth7 + this.f127;
                } else {
                    i10 = iMax;
                }
                if (z2) {
                    iMax = Math.max(i9, i10);
                }
            }
        } else {
            if (zM40) {
                c3755 = this.f155;
            } else {
                c3755 = this.f125;
            }
            if (zM41) {
                c3756 = this.f125;
            } else {
                c3756 = this.f155;
            }
            c1156 = (C1156) c3755.getLayoutParams();
            c1157 = (C1156) c3756.getLayoutParams();
            i5 = measuredHeight;
            if (zM40) {
            }
            i6 = this.f148 & 112;
            i7 = iMax;
            if (i6 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) c1156).topMargin + this.f135;
            } else if (i6 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - i5) / 2;
                i14 = ((ViewGroup.MarginLayoutParams) c1156).topMargin + this.f135;
                if (iMax2 < i14) {
                    iMax2 = i14;
                } else {
                    i15 = (((height - paddingBottom) - i5) - iMax2) - paddingTop2;
                    i16 = ((ViewGroup.MarginLayoutParams) c1156).bottomMargin;
                    i17 = this.f147;
                    if (i15 < i16 + i17) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) c1157).bottomMargin + i17) - i15));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) c1157).bottomMargin) - this.f147) - i5;
            }
            if (z3) {
                if (z2) {
                    i11 = this.f152;
                } else {
                    i11 = 0;
                }
                int i213 = i11 - iArr[1];
                iMin -= Math.max(0, i213);
                iArr[1] = Math.max(0, -i213);
                if (zM40) {
                    C1156 c11517 = (C1156) this.f155.getLayoutParams();
                    int measuredWidth8 = iMin - this.f155.getMeasuredWidth();
                    int measuredHeight6 = this.f155.getMeasuredHeight() + paddingTop;
                    this.f155.layout(measuredWidth8, paddingTop, iMin, measuredHeight6);
                    i12 = measuredWidth8 - this.f127;
                    paddingTop = measuredHeight6 + ((ViewGroup.MarginLayoutParams) c11517).bottomMargin;
                } else {
                    i12 = iMin;
                }
                if (zM41) {
                    int i214 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C1156) this.f125.getLayoutParams())).topMargin;
                    this.f125.layout(iMin - this.f125.getMeasuredWidth(), i214, iMin, this.f125.getMeasuredHeight() + i214);
                    i13 = iMin - this.f127;
                } else {
                    i13 = iMin;
                }
                if (z2) {
                    iMin = Math.min(i12, i13);
                }
                iMax = i7;
            } else {
                if (z2) {
                    i8 = this.f152;
                } else {
                    i8 = 0;
                }
                int i215 = i8 - iArr[0];
                iMax = Math.max(0, i215) + i7;
                iArr[0] = Math.max(0, -i215);
                if (zM40) {
                    C1156 c11518 = (C1156) this.f155.getLayoutParams();
                    int measuredWidth9 = this.f155.getMeasuredWidth() + iMax;
                    int measuredHeight7 = this.f155.getMeasuredHeight() + paddingTop;
                    this.f155.layout(iMax, paddingTop, measuredWidth9, measuredHeight7);
                    i9 = measuredWidth9 + this.f127;
                    paddingTop = measuredHeight7 + ((ViewGroup.MarginLayoutParams) c11518).bottomMargin;
                } else {
                    i9 = iMax;
                }
                if (zM41) {
                    int i36 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C1156) this.f125.getLayoutParams())).topMargin;
                    int measuredWidth10 = this.f125.getMeasuredWidth() + iMax;
                    this.f125.layout(iMax, i36, measuredWidth10, this.f125.getMeasuredHeight() + i36);
                    i10 = measuredWidth10 + this.f127;
                } else {
                    i10 = iMax;
                }
                if (z2) {
                    iMax = Math.max(i9, i10);
                }
            }
        }
        arrayList = this.f138;
        m47(3, arrayList);
        size = arrayList.size();
        iM55 = iMax;
        while (i18 < size) {
            iM55 = m54((View) arrayList.get(i18), iM55, iMin2, iArr);
        }
        m47(5, arrayList);
        size2 = arrayList.size();
        while (i19 < size2) {
            iMin = m53((View) arrayList.get(i19), iMin, iMin2, iArr);
        }
        m47(1, arrayList);
        int i37 = iArr[0];
        i20 = iArr[1];
        size3 = arrayList.size();
        i21 = i37;
        i22 = 0;
        measuredWidth = 0;
        while (i22 < size3) {
            View view3 = (View) arrayList.get(i22);
            C1156 c11519 = (C1156) view3.getLayoutParams();
            int i38 = i20;
            int i39 = ((ViewGroup.MarginLayoutParams) c11519).leftMargin - i21;
            int i310 = ((ViewGroup.MarginLayoutParams) c11519).rightMargin - i38;
            int iMax7 = Math.max(0, i39);
            int iMax8 = Math.max(0, i310);
            int iMax9 = Math.max(0, -i39);
            int iMax10 = Math.max(0, -i310);
            measuredWidth += view3.getMeasuredWidth() + iMax7 + iMax8;
            i22++;
            i21 = iMax9;
            i20 = iMax10;
        }
        i24 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (measuredWidth / 2);
        i25 = measuredWidth + i24;
        if (i24 >= iM55) {
            if (i25 > iMin) {
                iM55 = i24 - (i25 - iMin);
            } else {
                iM55 = i24;
            }
        }
        size4 = arrayList.size();
        while (i23 < size4) {
            iM55 = m54((View) arrayList.get(i23), iM55, iMin2, iArr);
        }
        arrayList.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        byte b;
        byte b2;
        int iM38;
        int iMax;
        int iCombineMeasuredStates;
        int iM39;
        int iM36;
        int iCombineMeasuredStates2;
        int iMax2;
        boolean z = AbstractC4518.f14932;
        int i3 = 0;
        if (getLayoutDirection() == 1) {
            b2 = true;
            b = 0;
        } else {
            b = 1;
            b2 = false;
        }
        if (m40(this.f126)) {
            m44(this.f126, i, 0, i2, this.f122);
            iM38 = m38(this.f126) + this.f126.getMeasuredWidth();
            iMax = Math.max(0, m36(this.f126) + this.f126.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.f126.getMeasuredState());
        } else {
            iM38 = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (m40(this.f153)) {
            m44(this.f153, i, 0, i2, this.f122);
            iM38 = m38(this.f153) + this.f153.getMeasuredWidth();
            iMax = Math.max(iMax, m36(this.f153) + this.f153.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f153.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, iM38);
        int iMax4 = Math.max(0, currentContentInsetStart - iM38);
        byte b3 = b2;
        int[] iArr = this.f132;
        iArr[b3 == true ? 1 : 0] = iMax4;
        if (m40(this.f159)) {
            m44(this.f159, i, iMax3, i2, this.f122);
            iM39 = m38(this.f159) + this.f159.getMeasuredWidth();
            iMax = Math.max(iMax, m36(this.f159) + this.f159.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f159.getMeasuredState());
        } else {
            iM39 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax5 = iMax3 + Math.max(currentContentInsetEnd, iM39);
        iArr[b] = Math.max(0, currentContentInsetEnd - iM39);
        if (m40(this.f133)) {
            iMax5 += m43(this.f133, i, iMax5, i2, 0, iArr);
            iMax = Math.max(iMax, m36(this.f133) + this.f133.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f133.getMeasuredState());
        }
        if (m40(this.f123)) {
            iMax5 += m43(this.f123, i, iMax5, i2, 0, iArr);
            iMax = Math.max(iMax, m36(this.f123) + this.f123.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f123.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (((C1156) childAt.getLayoutParams()).f4012 == 0 && m40(childAt)) {
                iMax5 += m43(childAt, i, iMax5, i2, 0, iArr);
                int iMax6 = Math.max(iMax, m36(childAt) + childAt.getMeasuredHeight());
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
                iMax = iMax6;
            } else {
                iMax5 = iMax5;
            }
        }
        int i5 = iMax5;
        int i6 = this.f135 + this.f147;
        int i7 = this.f152 + this.f127;
        if (m40(this.f155)) {
            m43(this.f155, i, i5 + i7, i2, i6, iArr);
            int iM310 = m38(this.f155) + this.f155.getMeasuredWidth();
            iM36 = m36(this.f155) + this.f155.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f155.getMeasuredState());
            iMax2 = iM310;
        } else {
            iM36 = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
        }
        if (m40(this.f125)) {
            iMax2 = Math.max(iMax2, m43(this.f125, i, i5 + i7, i2, i6 + iM36, iArr));
            iM36 += m36(this.f125) + this.f125.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.f125.getMeasuredState());
        }
        int iMax7 = Math.max(iMax, iM36);
        int paddingRight = getPaddingRight() + getPaddingLeft() + i5 + iMax2;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + iMax7;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, (-16777216) & iCombineMeasuredStates2);
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16);
        if (!this.f142) {
            i3 = iResolveSizeAndState2;
            break;
        }
        int childCount2 = getChildCount();
        for (int i8 = 0; i8 < childCount2; i8++) {
            View childAt2 = getChildAt(i8);
            if (m40(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                i3 = iResolveSizeAndState2;
                break;
            }
        }
        setMeasuredDimension(iResolveSizeAndState, i3);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof C1619)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1619 c1619 = (C1619) parcelable;
        super.onRestoreInstanceState(c1619.f17201);
        ActionMenuView actionMenuView = this.f159;
        MenuC4903 menuC4903 = actionMenuView != null ? actionMenuView.f101 : null;
        int i = c1619.f5427;
        if (i != 0 && this.f139 != null && menuC4903 != null && (menuItemFindItem = menuC4903.findItem(i)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (c1619.f5428) {
            RunnableC3365 runnableC3365 = this.f144;
            removeCallbacks(runnableC3365);
            post(runnableC3365);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        m48();
        C0758 c0758 = this.f145;
        boolean z = i == 1;
        if (z == c0758.f2758) {
            return;
        }
        c0758.f2758 = z;
        if (!c0758.f2755) {
            c0758.f2756 = c0758.f2752;
            c0758.f2754 = c0758.f2753;
            return;
        }
        if (z) {
            int i2 = c0758.f2757;
            if (i2 == Integer.MIN_VALUE) {
                i2 = c0758.f2752;
            }
            c0758.f2756 = i2;
            int i3 = c0758.f2751;
            if (i3 == Integer.MIN_VALUE) {
                i3 = c0758.f2753;
            }
            c0758.f2754 = i3;
            return;
        }
        int i4 = c0758.f2751;
        if (i4 == Integer.MIN_VALUE) {
            i4 = c0758.f2752;
        }
        c0758.f2756 = i4;
        int i5 = c0758.f2757;
        if (i5 == Integer.MIN_VALUE) {
            i5 = c0758.f2753;
        }
        c0758.f2754 = i5;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C4718 c4718;
        C1092 c1092;
        C1619 c1619 = new C1619(super.onSaveInstanceState());
        C4796 c4796 = this.f139;
        if (c4796 != null && (c1092 = c4796.f15817) != null) {
            c1619.f5427 = c1092.f3823;
        }
        ActionMenuView actionMenuView = this.f159;
        c1619.f5428 = (actionMenuView == null || (c4718 = actionMenuView.f96) == null || !c4718.m8051()) ? false : true;
        return c1619;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f129 = false;
        }
        if (!this.f129) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f129 = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f129 = false;
        return true;
    }

    public void setBackInvokedCallbackEnabled(boolean z) {
        if (this.f134 != z) {
            this.f134 = z;
            m45();
        }
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m39();
        }
        C1685 c1685 = this.f153;
        if (c1685 != null) {
            c1685.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            m39();
            this.f153.setImageDrawable(drawable);
        } else {
            C1685 c1685 = this.f153;
            if (c1685 != null) {
                c1685.setImageDrawable(this.f128);
            }
        }
    }

    public void setCollapsible(boolean z) {
        this.f142 = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f146) {
            this.f146 = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f140) {
            this.f140 = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(Drawable drawable) {
        C0532 c0532 = this.f123;
        if (drawable != null) {
            if (c0532 == null) {
                c0532 = new C0532(getContext(), null, 0);
                this.f123 = c0532;
            }
            if (!m52(c0532)) {
                m46(this.f123, true);
            }
        } else if (c0532 != null && m52(c0532)) {
            removeView(this.f123);
            this.f143.remove(this.f123);
        }
        C0532 c0533 = this.f123;
        if (c0533 != null) {
            c0533.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f123 == null) {
            this.f123 = new C0532(getContext(), null, 0);
        }
        C0532 c0532 = this.f123;
        if (c0532 != null) {
            c0532.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m51();
        }
        C1685 c1685 = this.f126;
        if (c1685 != null) {
            c1685.setContentDescription(charSequence);
            AbstractC2101.m4078(this.f126, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            m51();
            if (!m52(this.f126)) {
                m46(this.f126, true);
            }
        } else {
            C1685 c1685 = this.f126;
            if (c1685 != null && m52(c1685)) {
                removeView(this.f126);
                this.f143.remove(this.f126);
            }
        }
        C1685 c1686 = this.f126;
        if (c1686 != null) {
            c1686.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        m51();
        this.f126.setOnClickListener(onClickListener);
    }

    public void setOverflowIcon(Drawable drawable) {
        m41();
        this.f159.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.f130 != i) {
            this.f130 = i;
            if (i == 0) {
                this.f149 = getContext();
            } else {
                this.f149 = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        C3755 c3755 = this.f125;
        if (!zIsEmpty) {
            if (c3755 == null) {
                Context context = getContext();
                C3755 c3756 = new C3755(context, null);
                this.f125 = c3756;
                c3756.setSingleLine();
                this.f125.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f117;
                if (i != 0) {
                    this.f125.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f157;
                if (colorStateList != null) {
                    this.f125.setTextColor(colorStateList);
                }
            }
            if (!m52(this.f125)) {
                m46(this.f125, true);
            }
        } else if (c3755 != null && m52(c3755)) {
            removeView(this.f125);
            this.f143.remove(this.f125);
        }
        C3755 c3757 = this.f125;
        if (c3757 != null) {
            c3757.setText(charSequence);
        }
        this.f118 = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f157 = colorStateList;
        C3755 c3755 = this.f125;
        if (c3755 != null) {
            c3755.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        C3755 c3755 = this.f155;
        if (!zIsEmpty) {
            if (c3755 == null) {
                Context context = getContext();
                C3755 c3756 = new C3755(context, null);
                this.f155 = c3756;
                c3756.setSingleLine();
                this.f155.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f119;
                if (i != 0) {
                    this.f155.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f154;
                if (colorStateList != null) {
                    this.f155.setTextColor(colorStateList);
                }
            }
            if (!m52(this.f155)) {
                m46(this.f155, true);
            }
        } else if (c3755 != null && m52(c3755)) {
            removeView(this.f155);
            this.f143.remove(this.f155);
        }
        C3755 c3757 = this.f155;
        if (c3757 != null) {
            c3757.setText(charSequence);
        }
        this.f150 = charSequence;
    }

    public void setTitleMarginBottom(int i) {
        this.f147 = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.f127 = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.f152 = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.f135 = i;
        requestLayout();
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f154 = colorStateList;
        C3755 c3755 = this.f155;
        if (c3755 != null) {
            c3755.setTextColor(colorStateList);
        }
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final void m39() {
        if (this.f153 == null) {
            C1685 c1685 = new C1685(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.f153 = c1685;
            c1685.setImageDrawable(this.f128);
            this.f153.setContentDescription(this.f151);
            C1156 c1156M35 = m35();
            c1156M35.f4013 = (this.f141 & 112) | 8388611;
            c1156M35.f4012 = 2;
            this.f153.setLayoutParams(c1156M35);
            this.f153.setOnClickListener(new ViewOnClickListenerC3684(2, this));
        }
    }

    /* JADX INFO: renamed from: ۥَ */
    public final boolean m40(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    /* JADX INFO: renamed from: ۥُ */
    public final void m41() {
        m42();
        ActionMenuView actionMenuView = this.f159;
        if (actionMenuView.f101 == null) {
            MenuC4903 menuC4903 = (MenuC4903) actionMenuView.getMenu();
            if (this.f139 == null) {
                this.f139 = new C4796(this);
            }
            this.f159.setExpandedActionViewsExclusive(true);
            menuC4903.m8303(this.f139, this.f149);
            m45();
        }
    }

    /* JADX INFO: renamed from: ۥّ */
    public final void m42() {
        if (this.f159 == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f159 = actionMenuView;
            actionMenuView.setPopupTheme(this.f130);
            this.f159.setOnMenuItemClickListener(this.f120);
            ActionMenuView actionMenuView2 = this.f159;
            C3121 c3121 = new C3121(26, this);
            actionMenuView2.getClass();
            actionMenuView2.f95 = c3121;
            C1156 c1156M35 = m35();
            c1156M35.f4013 = (this.f141 & 112) | 8388613;
            this.f159.setLayoutParams(c1156M35);
            m46(this.f159, false);
        }
    }

    /* JADX INFO: renamed from: ۥْ */
    public final int m43(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i6) + Math.max(0, i5);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + iMax + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    /* JADX INFO: renamed from: ۥٓ */
    public final void m44(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i4 >= 0) {
            if (mode != 0) {
                i4 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i4);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    /* JADX INFO: renamed from: ۥٖ */
    public final void m45() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherM5845 = AbstractC3166.m5845(this);
            C4796 c4796 = this.f139;
            int i = 0;
            boolean z = (c4796 == null || c4796.f15817 == null || onBackInvokedDispatcherM5845 == null || !isAttachedToWindow() || !this.f134) ? false : true;
            if (!z || this.f124 != null) {
                if (z || (onBackInvokedDispatcher = this.f124) == null) {
                    return;
                }
                AbstractC3166.m5846(onBackInvokedDispatcher, this.f156);
                this.f124 = null;
                return;
            }
            OnBackInvokedCallback onBackInvokedCallbackM5844 = this.f156;
            if (onBackInvokedCallbackM5844 == null) {
                onBackInvokedCallbackM5844 = AbstractC3166.m5844(new RunnableC0723(this, i));
                this.f156 = onBackInvokedCallbackM5844;
            }
            AbstractC3166.m5843(onBackInvokedDispatcherM5845, onBackInvokedCallbackM5844);
            this.f124 = onBackInvokedDispatcherM5845;
        }
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final void m46(View view, boolean z) {
        C1156 c1156M37;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            c1156M37 = m35();
        } else {
            c1156M37 = !checkLayoutParams(layoutParams) ? m37(layoutParams) : (C1156) layoutParams;
        }
        c1156M37.f4012 = 1;
        if (!z || this.f133 == null) {
            addView(view, c1156M37);
        } else {
            view.setLayoutParams(c1156M37);
            this.f143.add(view);
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m47(int i, ArrayList arrayList) {
        boolean z = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection());
        arrayList.clear();
        if (!z) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                C1156 c1156 = (C1156) childAt.getLayoutParams();
                if (c1156.f4012 == 0 && m40(childAt)) {
                    int i3 = c1156.f4013;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i3, layoutDirection) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = layoutDirection == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i4 = childCount - 1; i4 >= 0; i4--) {
            View childAt2 = getChildAt(i4);
            C1156 c1157 = (C1156) childAt2.getLayoutParams();
            if (c1157.f4012 == 0 && m40(childAt2)) {
                int i5 = c1157.f4013;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i5, layoutDirection2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final void m48() {
        if (this.f145 == null) {
            C0758 c0758 = new C0758();
            c0758.f2756 = 0;
            c0758.f2754 = 0;
            c0758.f2751 = Integer.MIN_VALUE;
            c0758.f2757 = Integer.MIN_VALUE;
            c0758.f2752 = 0;
            c0758.f2753 = 0;
            c0758.f2758 = false;
            c0758.f2755 = false;
            this.f145 = c0758;
        }
    }

    /* JADX INFO: renamed from: ۦٌ */
    public final void m49() {
        Iterator it = this.f121.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        getMenuInflater();
        Iterator it2 = ((CopyOnWriteArrayList) this.f136.f9376).iterator();
        while (it2.hasNext()) {
            ((C2050) it2.next()).f6760.m5308();
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f121 = currentMenuItems2;
    }

    /* JADX INFO: renamed from: ۦِ */
    public final int m50(View view, int i) {
        C1156 c1156 = (C1156) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i3 = c1156.f4013 & 112;
        if (i3 != 16 && i3 != 48 && i3 != 80) {
            i3 = this.f148 & 112;
        }
        if (i3 == 48) {
            return getPaddingTop() - i2;
        }
        if (i3 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) c1156).bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i4 = ((ViewGroup.MarginLayoutParams) c1156).topMargin;
        if (iMax < i4) {
            iMax = i4;
        } else {
            int i5 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i6 = ((ViewGroup.MarginLayoutParams) c1156).bottomMargin;
            if (i5 < i6) {
                iMax = Math.max(0, iMax - (i6 - i5));
            }
        }
        return paddingTop + iMax;
    }

    /* JADX INFO: renamed from: ۦۙ */
    public final void m51() {
        if (this.f126 == null) {
            this.f126 = new C1685(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            C1156 c1156M35 = m35();
            c1156M35.f4013 = (this.f141 & 112) | 8388611;
            this.f126.setLayoutParams(c1156M35);
        }
    }

    /* JADX INFO: renamed from: ۦۚ */
    public final boolean m52(View view) {
        return view.getParent() == this || this.f143.contains(view);
    }

    /* JADX INFO: renamed from: ۦ۟ */
    public final int m53(View view, int i, int i2, int[] iArr) {
        C1156 c1156 = (C1156) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) c1156).rightMargin - iArr[1];
        int iMax = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int iM50 = m50(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iM50, iMax, view.getMeasuredHeight() + iM50);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) c1156).leftMargin);
    }

    /* JADX INFO: renamed from: ۦۨ */
    public final int m54(View view, int i, int i2, int[] iArr) {
        C1156 c1156 = (C1156) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) c1156).leftMargin - iArr[0];
        int iMax = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        int iM50 = m50(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iM50, iMax + measuredWidth, view.getMeasuredHeight() + iM50);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) c1156).rightMargin + iMax;
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(AbstractC4225.m7464(getContext(), i));
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m37(layoutParams);
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setOnMenuItemClickListener(InterfaceC1022 interfaceC1022) {
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(AbstractC4225.m7464(getContext(), i));
    }

    public void setLogo(int i) {
        setLogo(AbstractC4225.m7464(getContext(), i));
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public Toolbar(Context context) {
        this(context, null);
    }
}
