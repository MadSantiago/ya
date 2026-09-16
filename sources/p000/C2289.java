package p000;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import ru.bluecat.yandexmapspatcher.R;

/* JADX INFO: renamed from: ۥؘۚؗٚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class C2289 {

    /* JADX INFO: renamed from: ۥؗ */
    public final boolean f7599;

    /* JADX INFO: renamed from: ۥُ */
    public View f7600;

    /* JADX INFO: renamed from: ۥۗ */
    public final MenuC4903 f7602;

    /* JADX INFO: renamed from: ۥۜ */
    public InterfaceC3370 f7603;

    /* JADX INFO: renamed from: ۥۣ */
    public final Context f7604;

    /* JADX INFO: renamed from: ۦؑ */
    public final int f7605;

    /* JADX INFO: renamed from: ۦِ */
    public PopupWindow.OnDismissListener f7606;

    /* JADX INFO: renamed from: ۦٛ */
    public AbstractC1875 f7607;

    /* JADX INFO: renamed from: ۦۙ */
    public boolean f7609;

    /* JADX INFO: renamed from: ۥّ */
    public int f7601 = 8388611;

    /* JADX INFO: renamed from: ۦۗ */
    public final C0940 f7608 = new C0940(this);

    public C2289(Context context, MenuC4903 menuC4903, View view, boolean z, int i, int i2) {
        this.f7604 = context;
        this.f7602 = menuC4903;
        this.f7600 = view;
        this.f7599 = z;
        this.f7605 = i;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public void mo1894() {
        this.f7607 = null;
        PopupWindow.OnDismissListener onDismissListener = this.f7606;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final boolean m4342() {
        AbstractC1875 abstractC1875 = this.f7607;
        return abstractC1875 != null && abstractC1875.mo1018();
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final AbstractC1875 m4343() {
        AbstractC1875 viewOnKeyListenerC2416 = this.f7607;
        if (viewOnKeyListenerC2416 == null) {
            Context context = this.f7604;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            int iMin = Math.min(point.x, point.y);
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width);
            Context context2 = this.f7604;
            if (iMin >= dimensionPixelSize) {
                viewOnKeyListenerC2416 = new ViewOnKeyListenerC5614(context2, this.f7600, this.f7605, this.f7599);
            } else {
                viewOnKeyListenerC2416 = new ViewOnKeyListenerC2416(context2, this.f7602, this.f7600, this.f7605, this.f7599);
            }
            viewOnKeyListenerC2416.mo3732(this.f7602);
            viewOnKeyListenerC2416.mo3730(this.f7608);
            viewOnKeyListenerC2416.mo3734(this.f7600);
            viewOnKeyListenerC2416.mo4534(this.f7603);
            viewOnKeyListenerC2416.mo3736(this.f7609);
            viewOnKeyListenerC2416.mo3735(this.f7601);
            this.f7607 = viewOnKeyListenerC2416;
        }
        return viewOnKeyListenerC2416;
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final void m4344(int i, int i2, boolean z, boolean z2) {
        AbstractC1875 abstractC1875M4343 = m4343();
        abstractC1875M4343.mo3727(z2);
        if (z) {
            if ((Gravity.getAbsoluteGravity(this.f7601, this.f7600.getLayoutDirection()) & 7) == 5) {
                i -= this.f7600.getWidth();
            }
            abstractC1875M4343.mo3729(i);
            abstractC1875M4343.mo3731(i2);
            int i3 = (int) ((this.f7604.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            abstractC1875M4343.f6224 = new Rect(i - i3, i2 - i3, i + i3, i2 + i3);
        }
        abstractC1875M4343.mo1020();
    }
}
