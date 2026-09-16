package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import ru.bluecat.yandexmapspatcher.R;

/* JADX INFO: renamed from: ۥ۟ؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnKeyListenerC2416 extends AbstractC1875 implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* JADX INFO: renamed from: ۥؓ */
    public View f8052;

    /* JADX INFO: renamed from: ۥؖ */
    public View f8053;

    /* JADX INFO: renamed from: ۥً */
    public ViewTreeObserver f8054;

    /* JADX INFO: renamed from: ۥَ */
    public final boolean f8055;

    /* JADX INFO: renamed from: ۥْ */
    public final MenuC4903 f8056;

    /* JADX INFO: renamed from: ۥٓ */
    public final C0789 f8057;

    /* JADX INFO: renamed from: ۥٕ */
    public boolean f8058;

    /* JADX INFO: renamed from: ۥٖ */
    public final int f8059;

    /* JADX INFO: renamed from: ۥٙ */
    public PopupWindow.OnDismissListener f8060;

    /* JADX INFO: renamed from: ۥۙ */
    public int f8062;

    /* JADX INFO: renamed from: ۥۧ */
    public InterfaceC3370 f8063;

    /* JADX INFO: renamed from: ۦؖ */
    public boolean f8064;

    /* JADX INFO: renamed from: ۦٗ */
    public final int f8067;

    /* JADX INFO: renamed from: ۦٚ */
    public boolean f8068;

    /* JADX INFO: renamed from: ۦۛ */
    public final C4144 f8069;

    /* JADX INFO: renamed from: ۦ۟ */
    public final Context f8070;

    /* JADX INFO: renamed from: ۥۖ */
    public final ViewTreeObserverOnGlobalLayoutListenerC2902 f8061 = new ViewTreeObserverOnGlobalLayoutListenerC2902(3, this);

    /* JADX INFO: renamed from: ۦٕ */
    public final ViewOnAttachStateChangeListenerC3944 f8066 = new ViewOnAttachStateChangeListenerC3944(2, this);

    /* JADX INFO: renamed from: ۦؙ */
    public int f8065 = 0;

    public ViewOnKeyListenerC2416(Context context, MenuC4903 menuC4903, View view, int i, boolean z) {
        this.f8070 = context;
        this.f8056 = menuC4903;
        this.f8055 = z;
        this.f8057 = new C0789(menuC4903, LayoutInflater.from(context), z, R.layout.abc_popup_menu_item_layout);
        this.f8067 = i;
        Resources resources = context.getResources();
        this.f8059 = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f8053 = view;
        this.f8069 = new C4144(context, null, i, 0);
        menuC4903.m8303(this, context);
    }

    @Override // p000.InterfaceC0470
    public final void dismiss() {
        if (mo1018()) {
            this.f8069.dismiss();
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f8068 = true;
        this.f8056.m8297(true);
        ViewTreeObserver viewTreeObserver = this.f8054;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f8054 = this.f8052.getViewTreeObserver();
            }
            this.f8054.removeGlobalOnLayoutListener(this.f8061);
            this.f8054 = null;
        }
        this.f8052.removeOnAttachStateChangeListener(this.f8066);
        PopupWindow.OnDismissListener onDismissListener = this.f8060;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // p000.AbstractC1875
    /* JADX INFO: renamed from: ۥَ */
    public final void mo3727(boolean z) {
        this.f8064 = z;
    }

    @Override // p000.InterfaceC3442
    /* JADX INFO: renamed from: ۥُ */
    public final void mo4534(InterfaceC3370 interfaceC3370) {
        this.f8063 = interfaceC3370;
    }

    @Override // p000.AbstractC1875
    /* JADX INFO: renamed from: ۥْ */
    public final void mo3729(int i) {
        this.f8069.f3500 = i;
    }

    @Override // p000.AbstractC1875
    /* JADX INFO: renamed from: ۥٓ */
    public final void mo3730(PopupWindow.OnDismissListener onDismissListener) {
        this.f8060 = onDismissListener;
    }

    @Override // p000.AbstractC1875
    /* JADX INFO: renamed from: ۥٖ */
    public final void mo3731(int i) {
        this.f8069.m2109(i);
    }

    @Override // p000.InterfaceC0470
    /* JADX INFO: renamed from: ۥۗ */
    public final boolean mo1018() {
        return !this.f8068 && this.f8069.f3515.isShowing();
    }

    @Override // p000.InterfaceC0470
    /* JADX INFO: renamed from: ۥۜ */
    public final C1391 mo1019() {
        return this.f8069.f3497;
    }

    @Override // p000.InterfaceC3442
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo4535(MenuC4903 menuC4903, boolean z) {
        if (menuC4903 != this.f8056) {
            return;
        }
        dismiss();
        InterfaceC3370 interfaceC3370 = this.f8063;
        if (interfaceC3370 != null) {
            interfaceC3370.mo2765(menuC4903, z);
        }
    }

    @Override // p000.InterfaceC0470
    /* JADX INFO: renamed from: ۦؑ */
    public final void mo1020() {
        View view;
        if (mo1018()) {
            return;
        }
        if (this.f8068 || (view = this.f8053) == null) {
            C1078.m2276("StandardMenuPopup cannot be used without an anchor");
            return;
        }
        this.f8052 = view;
        C4144 c4144 = this.f8069;
        C2245 c2245 = c4144.f3515;
        C2245 c2246 = c4144.f3515;
        c2245.setOnDismissListener(this);
        c4144.f3513 = this;
        c4144.f3493 = true;
        c2246.setFocusable(true);
        View view2 = this.f8052;
        boolean z = this.f8054 == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f8054 = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f8061);
        }
        view2.addOnAttachStateChangeListener(this.f8066);
        c4144.f3495 = view2;
        c4144.f3494 = this.f8065;
        boolean z2 = this.f8058;
        Context context = this.f8070;
        C0789 c0789 = this.f8057;
        if (!z2) {
            this.f8062 = AbstractC1875.m3725(c0789, context, this.f8059);
            this.f8058 = true;
        }
        c4144.m2105(this.f8062);
        c2246.setInputMethodMode(2);
        Rect rect = this.f6224;
        c4144.f3511 = rect != null ? new Rect(rect) : null;
        c4144.mo1020();
        C1391 c1391 = c4144.f3497;
        c1391.setOnKeyListener(this);
        if (this.f8064) {
            MenuC4903 menuC4903 = this.f8056;
            if (menuC4903.f16185 != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c1391, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(menuC4903.f16185);
                }
                frameLayout.setEnabled(false);
                c1391.addHeaderView(frameLayout, null, false);
            }
        }
        c4144.mo2104(c0789);
        c4144.mo1020();
    }

    @Override // p000.InterfaceC3442
    /* JADX INFO: renamed from: ۦِ */
    public final boolean mo4536(SubMenuC4103 subMenuC4103) {
        boolean z;
        if (subMenuC4103.hasVisibleItems()) {
            C2289 c2289 = new C2289(this.f8070, subMenuC4103, this.f8052, this.f8055, this.f8067, 0);
            InterfaceC3370 interfaceC3370 = this.f8063;
            c2289.f7603 = interfaceC3370;
            AbstractC1875 abstractC1875 = c2289.f7607;
            if (abstractC1875 != null) {
                abstractC1875.mo4534(interfaceC3370);
            }
            int size = subMenuC4103.f16175.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    z = false;
                    break;
                }
                MenuItem item = subMenuC4103.getItem(i);
                if (item.isVisible() && item.getIcon() != null) {
                    z = true;
                    break;
                }
                i++;
            }
            c2289.f7609 = z;
            AbstractC1875 abstractC1876 = c2289.f7607;
            if (abstractC1876 != null) {
                abstractC1876.mo3736(z);
            }
            c2289.f7606 = this.f8060;
            this.f8060 = null;
            this.f8056.m8297(false);
            C4144 c4144 = this.f8069;
            int width = c4144.f3500;
            int iM2110 = c4144.m2110();
            if ((Gravity.getAbsoluteGravity(this.f8065, this.f8053.getLayoutDirection()) & 7) == 5) {
                width += this.f8053.getWidth();
            }
            if (!c2289.m4342()) {
                if (c2289.f7600 != null) {
                    c2289.m4344(width, iM2110, true, true);
                }
            }
            InterfaceC3370 interfaceC3371 = this.f8063;
            if (interfaceC3371 != null) {
                interfaceC3371.mo2761(subMenuC4103);
            }
            return true;
        }
        return false;
    }

    @Override // p000.InterfaceC3442
    /* JADX INFO: renamed from: ۦۗ */
    public final boolean mo4537() {
        return false;
    }

    @Override // p000.InterfaceC3442
    /* JADX INFO: renamed from: ۦۙ */
    public final void mo4538() {
        this.f8058 = false;
        C0789 c0789 = this.f8057;
        if (c0789 != null) {
            c0789.notifyDataSetChanged();
        }
    }

    @Override // p000.AbstractC1875
    /* JADX INFO: renamed from: ۦۚ */
    public final void mo3734(View view) {
        this.f8053 = view;
    }

    @Override // p000.AbstractC1875
    /* JADX INFO: renamed from: ۦ۟ */
    public final void mo3735(int i) {
        this.f8065 = i;
    }

    @Override // p000.AbstractC1875
    /* JADX INFO: renamed from: ۦۨ */
    public final void mo3736(boolean z) {
        this.f8057.f2839 = z;
    }

    @Override // p000.AbstractC1875
    /* JADX INFO: renamed from: ۦؚ */
    public final void mo3732(MenuC4903 menuC4903) {
    }
}
