package p000;

import android.view.MenuItem;

/* JADX INFO: renamed from: ۥ۟ؗؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class MenuItemOnActionExpandListenerC2466 implements MenuItem.OnActionExpandListener {

    /* JADX INFO: renamed from: ۥۗ */
    public final /* synthetic */ MenuItemC0784 f8235;

    /* JADX INFO: renamed from: ۥۣ */
    public final MenuItem.OnActionExpandListener f8236;

    public MenuItemOnActionExpandListenerC2466(MenuItemC0784 menuItemC0784, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f8235 = menuItemC0784;
        this.f8236 = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f8236.onMenuItemActionCollapse(this.f8235.m5982(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f8236.onMenuItemActionExpand(this.f8235.m5982(menuItem));
    }
}
