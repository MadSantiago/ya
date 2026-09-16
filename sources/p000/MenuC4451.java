package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

/* JADX INFO: renamed from: ۦّ٘ؗٞ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class MenuC4451 extends AbstractC0057 implements Menu {

    /* JADX INFO: renamed from: ۥؗ */
    public final MenuC4903 f14668;

    public MenuC4451(Context context, MenuC4903 menuC4903) {
        super(context);
        if (menuC4903 != null) {
            this.f14668 = menuC4903;
        } else {
            C1078.m2272("Wrapped Object can not be null.");
            throw null;
        }
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return m5982(this.f14668.m8305(0, 0, 0, charSequence));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int iAddIntentOptions = this.f14668.addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr[i5] = m5982(menuItemArr2[i5]);
            }
        }
        return iAddIntentOptions;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return this.f14668.addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final void clear() {
        C0796 c0796 = (C0796) this.f10924;
        if (c0796 != null) {
            c0796.clear();
        }
        this.f14668.clear();
    }

    @Override // android.view.Menu
    public final void close() {
        this.f14668.close();
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        return m5982(this.f14668.findItem(i));
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return m5982(this.f14668.getItem(i));
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return this.f14668.hasVisibleItems();
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return this.f14668.isShortcutKey(i, keyEvent);
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return this.f14668.performIdentifierAction(i, i2);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return this.f14668.performShortcut(i, keyEvent, i2);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        if (((C0796) this.f10924) != null) {
            int i2 = 0;
            while (true) {
                C0796 c0796 = (C0796) this.f10924;
                if (i2 >= c0796.f2862) {
                    break;
                }
                if (((InterfaceMenuItemC4632) c0796.m1694(i2)).getGroupId() == i) {
                    ((C0796) this.f10924).m1695(i2);
                    i2--;
                }
                i2++;
            }
        }
        this.f14668.removeGroup(i);
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        if (((C0796) this.f10924) != null) {
            int i2 = 0;
            while (true) {
                C0796 c0796 = (C0796) this.f10924;
                if (i2 >= c0796.f2862) {
                    break;
                }
                if (((InterfaceMenuItemC4632) c0796.m1694(i2)).getItemId() == i) {
                    ((C0796) this.f10924).m1695(i2);
                    break;
                }
                i2++;
            }
        }
        this.f14668.removeItem(i);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        this.f14668.setGroupCheckable(i, z, z2);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z) {
        this.f14668.setGroupEnabled(i, z);
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z) {
        this.f14668.setGroupVisible(i, z);
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.f14668.setQwertyMode(z);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f14668.f16175.size();
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return this.f14668.addSubMenu(i);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return this.f14668.addSubMenu(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return this.f14668.addSubMenu(i, i2, i3, i4);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return m5982(this.f14668.add(i));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return m5982(this.f14668.m8305(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return m5982(this.f14668.add(i, i2, i3, i4));
    }
}
