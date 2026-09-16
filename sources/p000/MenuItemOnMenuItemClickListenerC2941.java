package p000;

import android.view.MenuItem;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: ۥٍُۨؗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class MenuItemOnMenuItemClickListenerC2941 implements MenuItem.OnMenuItemClickListener {

    /* JADX INFO: renamed from: ۦؑ */
    public static final Class[] f9875 = {MenuItem.class};

    /* JADX INFO: renamed from: ۥؗ */
    public Object f9876;

    /* JADX INFO: renamed from: ۥۗ */
    public Object f9877;

    /* JADX INFO: renamed from: ۥۣ */
    public final /* synthetic */ int f9878 = 0;

    public MenuItemOnMenuItemClickListenerC2941(MenuItemC0784 menuItemC0784, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f9876 = menuItemC0784;
        this.f9877 = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        boolean zBooleanValue;
        switch (this.f9878) {
            case 0:
                Object obj = this.f9877;
                Method method = (Method) this.f9876;
                try {
                    if (method.getReturnType() == Boolean.TYPE) {
                        zBooleanValue = ((Boolean) method.invoke(obj, menuItem)).booleanValue();
                    } else {
                        method.invoke(obj, menuItem);
                        zBooleanValue = true;
                    }
                    return zBooleanValue;
                } catch (Exception e) {
                    C5028.m8450(e);
                    return false;
                }
            default:
                return ((MenuItem.OnMenuItemClickListener) this.f9877).onMenuItemClick(((MenuItemC0784) this.f9876).m5982(menuItem));
        }
    }

    public /* synthetic */ MenuItemOnMenuItemClickListenerC2941() {
    }
}
