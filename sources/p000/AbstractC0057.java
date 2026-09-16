package p000;

import android.content.Context;
import android.content.IntentFilter;
import android.view.MenuItem;

/* JADX INFO: renamed from: ۦؕ */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0057 {

    /* JADX INFO: renamed from: ۥۗ */
    public Object f10924;

    /* JADX INFO: renamed from: ۥۣ */
    public Object f10925;

    public AbstractC0057() {
        this.f10924 = new int[2];
    }

    /* JADX INFO: renamed from: ۥؗ */
    public void m5979() {
        C0775 c0775 = (C0775) this.f10925;
        if (c0775 != null) {
            try {
                ((LayoutInflaterFactory2C1852) this.f10924).f6156.unregisterReceiver(c0775);
            } catch (IllegalArgumentException unused) {
            }
            this.f10925 = null;
        }
    }

    /* JADX INFO: renamed from: ۥُ */
    public abstract int[] mo3871(int i);

    /* JADX INFO: renamed from: ۥّ */
    public abstract int mo4628();

    /* JADX INFO: renamed from: ۥۜ */
    public int[] m5980(int i, int i2) {
        if (i < 0 || i2 < 0 || i == i2) {
            return null;
        }
        int[] iArr = (int[]) this.f10924;
        iArr[0] = i;
        iArr[1] = i2;
        return iArr;
    }

    /* JADX INFO: renamed from: ۦؑ */
    public abstract IntentFilter mo4629();

    /* JADX INFO: renamed from: ۦِ */
    public abstract int[] mo3873(int i);

    /* JADX INFO: renamed from: ۦٛ */
    public abstract void mo4630();

    /* JADX INFO: renamed from: ۦۗ */
    public void m5981() {
        m5979();
        IntentFilter intentFilterMo4629 = mo4629();
        if (intentFilterMo4629.countActions() == 0) {
            return;
        }
        C0775 c0775 = (C0775) this.f10925;
        if (c0775 == null) {
            c0775 = new C0775(0, this);
            this.f10925 = c0775;
        }
        ((LayoutInflaterFactory2C1852) this.f10924).f6156.registerReceiver(c0775, intentFilterMo4629);
    }

    /* JADX INFO: renamed from: ۦۙ */
    public MenuItem m5982(MenuItem menuItem) {
        if (!(menuItem instanceof InterfaceMenuItemC4632)) {
            return menuItem;
        }
        InterfaceMenuItemC4632 interfaceMenuItemC4632 = (InterfaceMenuItemC4632) menuItem;
        C0796 c0796 = (C0796) this.f10924;
        if (c0796 == null) {
            c0796 = new C0796(0);
            this.f10924 = c0796;
        }
        MenuItem menuItem2 = (MenuItem) c0796.get(interfaceMenuItemC4632);
        if (menuItem2 != null) {
            return menuItem2;
        }
        MenuItemC0784 menuItemC0784 = new MenuItemC0784((Context) this.f10925, interfaceMenuItemC4632);
        ((C0796) this.f10924).put(interfaceMenuItemC4632, menuItemC0784);
        return menuItemC0784;
    }

    public AbstractC0057(Context context) {
        this.f10925 = context;
    }

    public AbstractC0057(LayoutInflaterFactory2C1852 layoutInflaterFactory2C1852) {
        this.f10924 = layoutInflaterFactory2C1852;
    }
}
