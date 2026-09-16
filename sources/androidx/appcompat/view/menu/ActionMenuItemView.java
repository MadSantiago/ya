package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import p000.AbstractC1492;
import p000.AbstractC2101;
import p000.AbstractC5618;
import p000.C1092;
import p000.C3755;
import p000.C3825;
import p000.InterfaceC1580;
import p000.InterfaceC3902;
import p000.InterfaceC5698;
import p000.MenuC4903;

/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class ActionMenuItemView extends C3755 implements InterfaceC3902, View.OnClickListener, InterfaceC5698 {

    /* JADX INFO: renamed from: ۥؓ */
    public AbstractC1492 f2;

    /* JADX INFO: renamed from: ۥؖ */
    public C3825 f3;

    /* JADX INFO: renamed from: ۥً */
    public boolean f4;

    /* JADX INFO: renamed from: ۥٕ */
    public int f5;

    /* JADX INFO: renamed from: ۥٙ */
    public InterfaceC1580 f6;

    /* JADX INFO: renamed from: ۥۖ */
    public CharSequence f7;

    /* JADX INFO: renamed from: ۥۙ */
    public final int f8;

    /* JADX INFO: renamed from: ۥۧ */
    public boolean f9;

    /* JADX INFO: renamed from: ۦٕ */
    public Drawable f10;

    /* JADX INFO: renamed from: ۦٚ */
    public final int f11;

    /* JADX INFO: renamed from: ۦۛ */
    public C1092 f12;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f9 = m4();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC5618.f18509, 0, 0);
        this.f11 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f8 = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f5 = -1;
        setSaveEnabled(false);
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // p000.InterfaceC3902
    public C1092 getItemData() {
        return this.f12;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC1580 interfaceC1580 = this.f6;
        if (interfaceC1580 != null) {
            interfaceC1580.mo6(this.f12);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f9 = m4();
        m2();
    }

    @Override // p000.C3755, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        boolean zIsEmpty = TextUtils.isEmpty(getText());
        if (!zIsEmpty && (i3 = this.f5) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int i4 = this.f11;
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, i4) : i4;
        if (mode != 1073741824 && i4 > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i2);
        }
        if (!zIsEmpty || this.f10 == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f10.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C3825 c3825;
        if (this.f12.hasSubMenu() && (c3825 = this.f3) != null && c3825.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setExpandedFormat(boolean z) {
        if (this.f4 != z) {
            this.f4 = z;
            C1092 c1092 = this.f12;
            if (c1092 != null) {
                MenuC4903 menuC4903 = c1092.f3834;
                menuC4903.f16190 = true;
                menuC4903.m8311(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f10 = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.f8;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (intrinsicHeight * (i / intrinsicWidth));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (intrinsicWidth * (i / intrinsicHeight));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, null, null, null);
        m2();
    }

    public void setItemInvoker(InterfaceC1580 interfaceC1580) {
        this.f6 = interfaceC1580;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.f5 = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(AbstractC1492 abstractC1492) {
        this.f2 = abstractC1492;
    }

    public void setTitle(CharSequence charSequence) {
        this.f7 = charSequence;
        m2();
    }

    @Override // p000.InterfaceC5698
    /* JADX INFO: renamed from: ۥؗ */
    public final boolean mo0() {
        return !TextUtils.isEmpty(getText()) && this.f12.getIcon() == null;
    }

    @Override // p000.InterfaceC5698
    /* JADX INFO: renamed from: ۥۗ */
    public final boolean mo1() {
        return !TextUtils.isEmpty(getText());
    }

    /* JADX INFO: renamed from: ۥۜ */
    public final void m2() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f7);
        if (this.f10 != null && ((this.f12.f3819 & 4) != 4 || (!this.f9 && !this.f4))) {
            z = false;
        }
        boolean z3 = z2 & z;
        setText(z3 ? this.f7 : null);
        CharSequence charSequence = this.f12.f3816;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z3 ? null : this.f12.f3814);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f12.f3817;
        if (TextUtils.isEmpty(charSequence2)) {
            AbstractC2101.m4078(this, z3 ? null : this.f12.f3814);
        } else {
            AbstractC2101.m4078(this, charSequence2);
        }
    }

    @Override // p000.InterfaceC3902
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo3(C1092 c1092) {
        this.f12 = c1092;
        setIcon(c1092.getIcon());
        setTitle(c1092.getTitleCondensed());
        setId(c1092.f3823);
        setVisibility(c1092.isVisible() ? 0 : 8);
        setEnabled(c1092.isEnabled());
        if (c1092.hasSubMenu() && this.f3 == null) {
            this.f3 = new C3825(this);
        }
    }

    /* JADX INFO: renamed from: ۦۙ */
    public final boolean m4() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (i < 480) {
            return (i >= 640 && i2 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public ActionMenuItemView(Context context) {
        this(context, null);
    }
}
