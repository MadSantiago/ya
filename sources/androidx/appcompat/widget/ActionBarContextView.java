package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import p000.AbstractC3305;
import p000.AbstractC3608;
import p000.AbstractC4225;
import p000.AbstractC4518;
import p000.AbstractC5618;
import p000.C0024;
import p000.C0911;
import p000.C1078;
import p000.C1551;
import p000.C4718;
import p000.InterfaceC2122;
import p000.MenuC4903;
import p000.ViewOnClickListenerC3684;
import ru.bluecat.yandexmapspatcher.R;

/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {

    /* JADX INFO: renamed from: ۥؓ */
    public View f41;

    /* JADX INFO: renamed from: ۥؖ */
    public View f42;

    /* JADX INFO: renamed from: ۥً */
    public TextView f43;

    /* JADX INFO: renamed from: ۥَ */
    public int f44;

    /* JADX INFO: renamed from: ۥْ */
    public ActionMenuView f45;

    /* JADX INFO: renamed from: ۥٓ */
    public C4718 f46;

    /* JADX INFO: renamed from: ۥٕ */
    public final int f47;

    /* JADX INFO: renamed from: ۥٖ */
    public C1551 f48;

    /* JADX INFO: renamed from: ۥٙ */
    public View f49;

    /* JADX INFO: renamed from: ۥۖ */
    public CharSequence f50;

    /* JADX INFO: renamed from: ۥۙ */
    public final int f51;

    /* JADX INFO: renamed from: ۥۧ */
    public LinearLayout f52;

    /* JADX INFO: renamed from: ۦؖ */
    public final int f53;

    /* JADX INFO: renamed from: ۦؙ */
    public boolean f54;

    /* JADX INFO: renamed from: ۦٕ */
    public CharSequence f55;

    /* JADX INFO: renamed from: ۦٗ */
    public boolean f56;

    /* JADX INFO: renamed from: ۦٚ */
    public TextView f57;

    /* JADX INFO: renamed from: ۦۛ */
    public boolean f58;

    /* JADX INFO: renamed from: ۦ۟ */
    public final Context f59;

    /* JADX INFO: renamed from: ۦۨ */
    public final C0024 f60;

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        int resourceId;
        super(context, attributeSet, R.attr.actionModeStyle);
        this.f60 = new C0024(this);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f59 = context;
        } else {
            this.f59 = new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC5618.f18521, R.attr.actionModeStyle, 0);
        setBackground((!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(0) : AbstractC4225.m7464(context, resourceId));
        this.f47 = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.f51 = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        this.f44 = typedArrayObtainStyledAttributes.getLayoutDimension(3, 0);
        this.f53 = typedArrayObtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: ۥّ */
    public static int m7(View view, int i, int i2) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, i - view.getMeasuredWidth());
    }

    /* JADX INFO: renamed from: ۦۙ */
    public static int m10(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = ((i3 - measuredHeight) / 2) + i2;
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimatedVisibility() {
        return this.f48 != null ? this.f60.f4926 : getVisibility();
    }

    public int getContentHeight() {
        return this.f44;
    }

    public CharSequence getSubtitle() {
        return this.f55;
    }

    public CharSequence getTitle() {
        return this.f50;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        int i;
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, AbstractC5618.f18520, R.attr.actionBarStyle, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(13, 0));
        typedArrayObtainStyledAttributes.recycle();
        C4718 c4718 = this.f46;
        if (c4718 != null) {
            Configuration configuration2 = c4718.f15572.getResources().getConfiguration();
            int i2 = configuration2.screenWidthDp;
            int i3 = configuration2.screenHeightDp;
            if (configuration2.smallestScreenWidthDp > 600 || i2 > 600 || ((i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960))) {
                i = 5;
            } else if (i2 >= 500 || ((i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640))) {
                i = 4;
            } else {
                i = i2 >= 360 ? 3 : 2;
            }
            c4718.f15570 = i;
            MenuC4903 menuC4903 = c4718.f15555;
            if (menuC4903 != null) {
                menuC4903.m8311(true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C4718 c4718 = this.f46;
        if (c4718 != null) {
            c4718.m8052();
            C0911 c0911 = this.f46.f15564;
            if (c0911 == null || !c0911.m4342()) {
                return;
            }
            c0911.f7607.dismiss();
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f58 = false;
        }
        if (!this.f58) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f58 = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f58 = false;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2 = AbstractC4518.f14932;
        boolean z3 = getLayoutDirection() == 1;
        int paddingRight = z3 ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.f49;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f49.getLayoutParams();
            int i5 = z3 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = z3 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i7 = z3 ? paddingRight - i5 : paddingRight + i5;
            int iM10 = m10(this.f49, i7, paddingTop, paddingTop2, z3) + i7;
            paddingRight = z3 ? iM10 - i6 : iM10 + i6;
        }
        LinearLayout linearLayout = this.f52;
        if (linearLayout != null && this.f41 == null && linearLayout.getVisibility() != 8) {
            paddingRight += m10(this.f52, paddingRight, paddingTop, paddingTop2, z3);
        }
        View view2 = this.f41;
        if (view2 != null) {
            m10(view2, paddingRight, paddingTop, paddingTop2, z3);
        }
        int paddingLeft = z3 ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.f45;
        if (actionMenuView != null) {
            m10(actionMenuView, paddingLeft, paddingTop, paddingTop2, !z3);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            C1078.m2276(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
            return;
        }
        if (View.MeasureSpec.getMode(i2) == 0) {
            C1078.m2276(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = this.f44;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i2);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingBottom;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.f49;
        if (view != null) {
            int iM7 = m7(view, paddingLeft, iMakeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f49.getLayoutParams();
            paddingLeft = iM7 - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f45;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = m7(this.f45, paddingLeft, iMakeMeasureSpec);
        }
        LinearLayout linearLayout = this.f52;
        if (linearLayout != null && this.f41 == null) {
            if (this.f54) {
                this.f52.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.f52.getMeasuredWidth();
                boolean z = measuredWidth <= paddingLeft;
                if (z) {
                    paddingLeft -= measuredWidth;
                }
                this.f52.setVisibility(z ? 0 : 8);
            } else {
                paddingLeft = m7(linearLayout, paddingLeft, iMakeMeasureSpec);
            }
        }
        View view2 = this.f41;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i3 = layoutParams.width;
            int i4 = i3 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i3 >= 0) {
                paddingLeft = Math.min(i3, paddingLeft);
            }
            int i5 = layoutParams.height;
            int i6 = i5 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i5 >= 0) {
                iMin = Math.min(i5, iMin);
            }
            this.f41.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i4), View.MeasureSpec.makeMeasureSpec(iMin, i6));
        }
        if (this.f44 > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            int measuredHeight = getChildAt(i8).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i7) {
                i7 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i7);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f56 = false;
        }
        if (!this.f56) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f56 = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f56 = false;
        return true;
    }

    public void setContentHeight(int i) {
        this.f44 = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f41;
        if (view2 != null) {
            removeView(view2);
        }
        this.f41 = view;
        if (view != null && (linearLayout = this.f52) != null) {
            removeView(linearLayout);
            this.f52 = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f55 = charSequence;
        m14();
    }

    public void setTitle(CharSequence charSequence) {
        this.f50 = charSequence;
        m14();
        AbstractC3608.m6436(this, charSequence);
    }

    public void setTitleOptional(boolean z) {
        if (z != this.f54) {
            requestLayout();
        }
        this.f54 = z;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final void m11(AbstractC3305 abstractC3305) {
        View view = this.f49;
        int i = 0;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.f53, (ViewGroup) this, false);
            this.f49 = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.f49);
        }
        View viewFindViewById = this.f49.findViewById(R.id.action_mode_close_button);
        this.f42 = viewFindViewById;
        viewFindViewById.setOnClickListener(new ViewOnClickListenerC3684(i, abstractC3305));
        MenuC4903 menuC4903Mo6065 = abstractC3305.mo6065();
        C4718 c4718 = this.f46;
        if (c4718 != null) {
            c4718.m8052();
            C0911 c0911 = c4718.f15564;
            if (c0911 != null && c0911.m4342()) {
                c0911.f7607.dismiss();
            }
        }
        C4718 c4719 = new C4718(getContext());
        this.f46 = c4719;
        c4719.f15552 = true;
        c4719.f15551 = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        menuC4903Mo6065.m8303(this.f46, this.f59);
        C4718 c47110 = this.f46;
        InterfaceC2122 interfaceC2122 = c47110.f15571;
        if (interfaceC2122 == null) {
            InterfaceC2122 interfaceC2123 = (InterfaceC2122) c47110.f15556.inflate(c47110.f15558, (ViewGroup) this, false);
            c47110.f15571 = interfaceC2123;
            interfaceC2123.mo5(c47110.f15555);
            c47110.mo4538();
        }
        InterfaceC2122 interfaceC2124 = c47110.f15571;
        if (interfaceC2122 != interfaceC2124) {
            ((ActionMenuView) interfaceC2124).setPresenter(c47110);
        }
        ActionMenuView actionMenuView = (ActionMenuView) interfaceC2124;
        this.f45 = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.f45, layoutParams);
    }

    /* JADX INFO: renamed from: ۥُ */
    public final void m12() {
        removeAllViews();
        this.f41 = null;
        this.f45 = null;
        this.f46 = null;
        View view = this.f42;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    @Override // android.view.View
    /* JADX INFO: renamed from: ۥۜ, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i) {
        if (i != getVisibility()) {
            C1551 c1551 = this.f48;
            if (c1551 != null) {
                c1551.m3299();
            }
            super.setVisibility(i);
        }
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final void m14() {
        if (this.f52 == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f52 = linearLayout;
            this.f43 = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f57 = (TextView) this.f52.findViewById(R.id.action_bar_subtitle);
            int i = this.f47;
            if (i != 0) {
                this.f43.setTextAppearance(getContext(), i);
            }
            int i2 = this.f51;
            if (i2 != 0) {
                this.f57.setTextAppearance(getContext(), i2);
            }
        }
        this.f43.setText(this.f50);
        this.f57.setText(this.f55);
        boolean zIsEmpty = TextUtils.isEmpty(this.f50);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.f55);
        this.f57.setVisibility(!zIsEmpty2 ? 0 : 8);
        this.f52.setVisibility((zIsEmpty && zIsEmpty2) ? 8 : 0);
        if (this.f52.getParent() == null) {
            addView(this.f52);
        }
    }

    /* JADX INFO: renamed from: ۦٛ */
    public final C1551 m15(long j, int i) {
        C1551 c1551 = this.f48;
        if (c1551 != null) {
            c1551.m3299();
        }
        C0024 c0024 = this.f60;
        if (i != 0) {
            C1551 c1551M6432 = AbstractC3608.m6432(this);
            c1551M6432.m3300(0.0f);
            c1551M6432.m3297(j);
            c0024.f4925.f48 = c1551M6432;
            c0024.f4926 = i;
            c1551M6432.m3301(c0024);
            return c1551M6432;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        C1551 c1551M6433 = AbstractC3608.m6432(this);
        c1551M6433.m3300(1.0f);
        c1551M6433.m3297(j);
        c0024.f4925.f48 = c1551M6433;
        c0024.f4926 = i;
        c1551M6433.m3301(c0024);
        return c1551M6433;
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }
}
