package p000;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import ru.bluecat.yandexmapspatcher.R;

/* JADX INFO: renamed from: ۦؖؒۖٚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3337 extends C0990 implements InterfaceC1012 {

    /* JADX INFO: renamed from: ۥٛ */
    public CharSequence f11163;

    /* JADX INFO: renamed from: ۥٝ */
    public int f11164;

    /* JADX INFO: renamed from: ۥ۟ */
    public final /* synthetic */ C3689 f11165;

    /* JADX INFO: renamed from: ۥۤ */
    public C5316 f11166;

    /* JADX INFO: renamed from: ۦؒ */
    public final Rect f11167;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3337(C3689 c3689, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle, 0);
        this.f11165 = c3689;
        this.f11167 = new Rect();
        this.f3495 = c3689;
        this.f3493 = true;
        this.f3515.setFocusable(true);
        this.f3513 = new C1494(0, this);
    }

    /* JADX INFO: renamed from: ۥَ */
    public final void m6100() {
        int i;
        C2245 c2245 = this.f3515;
        Drawable background = c2245.getBackground();
        C3689 c3689 = this.f11165;
        Rect rect = c3689.f12315;
        if (background != null) {
            background.getPadding(rect);
            boolean z = AbstractC4518.f14932;
            i = c3689.getLayoutDirection() == 1 ? rect.right : -rect.left;
        } else {
            i = 0;
            rect.right = 0;
            rect.left = 0;
        }
        int paddingLeft = c3689.getPaddingLeft();
        int paddingRight = c3689.getPaddingRight();
        int width = c3689.getWidth();
        int i2 = c3689.f12314;
        if (i2 == -2) {
            int iM6544 = c3689.m6544(this.f11166, c2245.getBackground());
            int i3 = (c3689.getContext().getResources().getDisplayMetrics().widthPixels - rect.left) - rect.right;
            if (iM6544 > i3) {
                iM6544 = i3;
            }
            m2105(Math.max(iM6544, (width - paddingLeft) - paddingRight));
        } else if (i2 == -1) {
            m2105((width - paddingLeft) - paddingRight);
        } else {
            m2105(i2);
        }
        boolean z2 = AbstractC4518.f14932;
        this.f3500 = c3689.getLayoutDirection() == 1 ? (((width - paddingRight) - this.f3496) - this.f11164) + i : paddingLeft + this.f11164 + i;
    }

    @Override // p000.C0990, p000.InterfaceC1012
    /* JADX INFO: renamed from: ۥْ */
    public final void mo2104(ListAdapter listAdapter) {
        super.mo2104(listAdapter);
        this.f11166 = (C5316) listAdapter;
    }

    @Override // p000.InterfaceC1012
    /* JADX INFO: renamed from: ۦؚ */
    public final void mo2224(int i) {
        this.f11164 = i;
    }

    @Override // p000.InterfaceC1012
    /* JADX INFO: renamed from: ۦۙ */
    public final void mo2228(CharSequence charSequence) {
        this.f11163 = charSequence;
    }

    @Override // p000.InterfaceC1012
    /* JADX INFO: renamed from: ۦۚ */
    public final void mo2229(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        C2245 c2245 = this.f3515;
        boolean zIsShowing = c2245.isShowing();
        m6100();
        c2245.setInputMethodMode(2);
        mo1020();
        C1391 c1391 = this.f3497;
        c1391.setChoiceMode(1);
        c1391.setTextDirection(i);
        c1391.setTextAlignment(i2);
        C3689 c3689 = this.f11165;
        int selectedItemPosition = c3689.getSelectedItemPosition();
        C1391 c1392 = this.f3497;
        if (c2245.isShowing() && c1392 != null) {
            c1392.setListSelectionHidden(false);
            c1392.setSelection(selectedItemPosition);
            if (c1392.getChoiceMode() != 0) {
                c1392.setItemChecked(selectedItemPosition, true);
            }
        }
        if (zIsShowing || (viewTreeObserver = c3689.getViewTreeObserver()) == null) {
            return;
        }
        ViewTreeObserverOnGlobalLayoutListenerC2902 viewTreeObserverOnGlobalLayoutListenerC2902 = new ViewTreeObserverOnGlobalLayoutListenerC2902(1, this);
        viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC2902);
        c2245.setOnDismissListener(new C2530(this, viewTreeObserverOnGlobalLayoutListenerC2902));
    }

    @Override // p000.InterfaceC1012
    /* JADX INFO: renamed from: ۦ۟ */
    public final CharSequence mo2230() {
        return this.f11163;
    }
}
