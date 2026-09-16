package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import p000.C0251;
import p000.C0911;
import p000.C1551;
import p000.C4718;
import p000.C5822;
import p000.InterfaceC3685;
import p000.LayoutInflaterFactory2C1852;
import p000.MenuC4903;

/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: ۥَ */
    public TypedValue f106;

    /* JADX INFO: renamed from: ۥْ */
    public TypedValue f107;

    /* JADX INFO: renamed from: ۥٓ */
    public TypedValue f108;

    /* JADX INFO: renamed from: ۥٖ */
    public TypedValue f109;

    /* JADX INFO: renamed from: ۦٗ */
    public final Rect f110;

    /* JADX INFO: renamed from: ۦۛ */
    public InterfaceC3685 f111;

    /* JADX INFO: renamed from: ۦ۟ */
    public TypedValue f112;

    /* JADX INFO: renamed from: ۦۨ */
    public TypedValue f113;

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f110 = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        TypedValue typedValue = this.f106;
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        this.f106 = typedValue2;
        return typedValue2;
    }

    public TypedValue getFixedHeightMinor() {
        TypedValue typedValue = this.f109;
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        this.f109 = typedValue2;
        return typedValue2;
    }

    public TypedValue getFixedWidthMajor() {
        TypedValue typedValue = this.f107;
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        this.f107 = typedValue2;
        return typedValue2;
    }

    public TypedValue getFixedWidthMinor() {
        TypedValue typedValue = this.f108;
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        this.f108 = typedValue2;
        return typedValue2;
    }

    public TypedValue getMinWidthMajor() {
        TypedValue typedValue = this.f113;
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        this.f113 = typedValue2;
        return typedValue2;
    }

    public TypedValue getMinWidthMinor() {
        TypedValue typedValue = this.f112;
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        this.f112 = typedValue2;
        return typedValue2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC3685 interfaceC3685 = this.f111;
        if (interfaceC3685 != null) {
            interfaceC3685.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C4718 c4718;
        super.onDetachedFromWindow();
        InterfaceC3685 interfaceC3685 = this.f111;
        if (interfaceC3685 != null) {
            LayoutInflaterFactory2C1852 layoutInflaterFactory2C1852 = ((C5822) interfaceC3685).f19165;
            ActionBarOverlayLayout actionBarOverlayLayout = layoutInflaterFactory2C1852.f6154;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.m26();
                ActionMenuView actionMenuView = ((C0251) actionBarOverlayLayout.f68).f930.f159;
                if (actionMenuView != null && (c4718 = actionMenuView.f96) != null) {
                    c4718.m8052();
                    C0911 c0911 = c4718.f15564;
                    if (c0911 != null && c0911.m4342()) {
                        c0911.f7607.dismiss();
                    }
                }
            }
            if (layoutInflaterFactory2C1852.f6177 != null) {
                layoutInflaterFactory2C1852.f6147.getDecorView().removeCallbacks(layoutInflaterFactory2C1852.f6180);
                if (layoutInflaterFactory2C1852.f6177.isShowing()) {
                    try {
                        layoutInflaterFactory2C1852.f6177.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                layoutInflaterFactory2C1852.f6177 = null;
            }
            C1551 c1551 = layoutInflaterFactory2C1852.f6182;
            if (c1551 != null) {
                c1551.m3299();
            }
            MenuC4903 menuC4903 = layoutInflaterFactory2C1852.m3641(0).f15261;
            if (menuC4903 != null) {
                menuC4903.m8297(true);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004e  */
    /* JADX WARN: Code duplicated, block: B:22:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x008a  */
    /* JADX WARN: Code duplicated, block: B:38:0x009d  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:58:0x00de  */
    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int iMakeMeasureSpec;
        boolean z;
        int iMakeMeasureSpec2;
        int i3;
        int i4;
        float fraction;
        int i5;
        int i6;
        float fraction2;
        int i7;
        int i8;
        float fraction3;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        boolean z2 = true;
        boolean z3 = displayMetrics.widthPixels < displayMetrics.heightPixels;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        Rect rect = this.f110;
        if (mode != Integer.MIN_VALUE) {
            iMakeMeasureSpec = i;
            z = false;
        } else {
            TypedValue typedValue = z3 ? this.f108 : this.f107;
            if (typedValue == null || (i7 = typedValue.type) == 0) {
                iMakeMeasureSpec = i;
                z = false;
            } else {
                if (i7 == 5) {
                    fraction3 = typedValue.getDimension(displayMetrics);
                } else {
                    if (i7 == 6) {
                        int i9 = displayMetrics.widthPixels;
                        fraction3 = typedValue.getFraction(i9, i9);
                    } else {
                        i8 = 0;
                    }
                    if (i8 > 0) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(i8 - (rect.left + rect.right), View.MeasureSpec.getSize(i)), 1073741824);
                        z = true;
                    } else {
                        iMakeMeasureSpec = i;
                        z = false;
                    }
                }
                i8 = (int) fraction3;
                if (i8 > 0) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(i8 - (rect.left + rect.right), View.MeasureSpec.getSize(i)), 1073741824);
                    z = true;
                } else {
                    iMakeMeasureSpec = i;
                    z = false;
                }
            }
        }
        if (mode2 != Integer.MIN_VALUE) {
            iMakeMeasureSpec2 = i2;
        } else {
            TypedValue typedValue2 = z3 ? this.f106 : this.f109;
            if (typedValue2 == null || (i5 = typedValue2.type) == 0) {
                iMakeMeasureSpec2 = i2;
            } else {
                if (i5 == 5) {
                    fraction2 = typedValue2.getDimension(displayMetrics);
                } else {
                    if (i5 == 6) {
                        int i10 = displayMetrics.heightPixels;
                        fraction2 = typedValue2.getFraction(i10, i10);
                    } else {
                        i6 = 0;
                    }
                    if (i6 > 0) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.min(i6 - (rect.top + rect.bottom), View.MeasureSpec.getSize(i2)), 1073741824);
                    } else {
                        iMakeMeasureSpec2 = i2;
                    }
                }
                i6 = (int) fraction2;
                if (i6 > 0) {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.min(i6 - (rect.top + rect.bottom), View.MeasureSpec.getSize(i2)), 1073741824);
                } else {
                    iMakeMeasureSpec2 = i2;
                }
            }
        }
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec2);
        int measuredWidth = getMeasuredWidth();
        int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        if (z || mode != Integer.MIN_VALUE) {
            z2 = false;
        } else {
            TypedValue typedValue3 = z3 ? this.f112 : this.f113;
            if (typedValue3 == null || (i3 = typedValue3.type) == 0) {
                z2 = false;
            } else {
                if (i3 == 5) {
                    fraction = typedValue3.getDimension(displayMetrics);
                } else {
                    if (i3 == 6) {
                        int i11 = displayMetrics.widthPixels;
                        fraction = typedValue3.getFraction(i11, i11);
                    } else {
                        i4 = 0;
                    }
                    if (i4 > 0) {
                        i4 -= rect.left + rect.right;
                    }
                    if (measuredWidth < i4) {
                        iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
                    } else {
                        z2 = false;
                    }
                }
                i4 = (int) fraction;
                if (i4 > 0) {
                    i4 -= rect.left + rect.right;
                }
                if (measuredWidth < i4) {
                    iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
                } else {
                    z2 = false;
                }
            }
        }
        if (z2) {
            super.onMeasure(iMakeMeasureSpec3, iMakeMeasureSpec2);
        }
    }

    public void setAttachListener(InterfaceC3685 interfaceC3685) {
        this.f111 = interfaceC3685;
    }

    public ContentFrameLayout(Context context) {
        this(context, null);
    }
}
