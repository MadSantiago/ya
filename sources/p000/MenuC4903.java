package p000;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: ۦۖؓۢۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class MenuC4903 implements Menu {

    /* JADX INFO: renamed from: ۥٙ */
    public static final int[] f16171 = {1, 4, 5, 3, 2, 0};

    /* JADX INFO: renamed from: ۥؗ */
    public boolean f16172;

    /* JADX INFO: renamed from: ۥُ */
    public InterfaceC0614 f16174;

    /* JADX INFO: renamed from: ۥّ */
    public final ArrayList f16175;

    /* JADX INFO: renamed from: ۥۗ */
    public final Resources f16180;

    /* JADX INFO: renamed from: ۥۜ */
    public boolean f16181;

    /* JADX INFO: renamed from: ۥۣ */
    public final Context f16182;

    /* JADX INFO: renamed from: ۦؑ */
    public final boolean f16183;

    /* JADX INFO: renamed from: ۦٌ */
    public CharSequence f16185;

    /* JADX INFO: renamed from: ۦِ */
    public final ArrayList f16186;

    /* JADX INFO: renamed from: ۦٕ */
    public boolean f16187;

    /* JADX INFO: renamed from: ۦٛ */
    public final ArrayList f16189;

    /* JADX INFO: renamed from: ۦۗ */
    public boolean f16190;

    /* JADX INFO: renamed from: ۦۙ */
    public final ArrayList f16191;

    /* JADX INFO: renamed from: ۦۚ */
    public Drawable f16192;

    /* JADX INFO: renamed from: ۦۛ */
    public C1092 f16193;

    /* JADX INFO: renamed from: ۦۨ */
    public View f16195;

    /* JADX INFO: renamed from: ۦؚ */
    public int f16184 = 0;

    /* JADX INFO: renamed from: ۦ۟ */
    public boolean f16194 = false;

    /* JADX INFO: renamed from: ۥْ */
    public boolean f16176 = false;

    /* JADX INFO: renamed from: ۥٓ */
    public boolean f16177 = false;

    /* JADX INFO: renamed from: ۥَ */
    public boolean f16173 = false;

    /* JADX INFO: renamed from: ۥٖ */
    public final ArrayList f16178 = new ArrayList();

    /* JADX INFO: renamed from: ۦٗ */
    public final CopyOnWriteArrayList f16188 = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: ۥۖ */
    public boolean f16179 = false;

    public MenuC4903(Context context) {
        boolean zM4935;
        boolean z = false;
        this.f16182 = context;
        Resources resources = context.getResources();
        this.f16180 = resources;
        this.f16175 = new ArrayList();
        this.f16191 = new ArrayList();
        this.f16181 = true;
        this.f16189 = new ArrayList();
        this.f16186 = new ArrayList();
        this.f16190 = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            if (Build.VERSION.SDK_INT >= 28) {
                zM4935 = AbstractC2611.m4935(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                zM4935 = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (zM4935) {
                z = true;
            }
        }
        this.f16183 = z;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return m8305(0, 0, 0, this.f16180.getString(i));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        PackageManager packageManager = this.f16182.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i6 = 0; i6 < size; i6++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i6);
            int i7 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i7 < 0 ? intent : intentArr[i7]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            C1092 c1092M8305 = m8305(i, i2, i3, resolveInfo.loadLabel(packageManager));
            c1092M8305.setIcon(resolveInfo.loadIcon(packageManager));
            c1092M8305.f3833 = intent2;
            if (menuItemArr != null && (i5 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i5] = c1092M8305;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C1092 c1092M8305 = m8305(i, i2, i3, charSequence);
        SubMenuC4103 subMenuC4103 = new SubMenuC4103(this.f16182, this, c1092M8305);
        c1092M8305.f3837 = subMenuC4103;
        subMenuC4103.setHeaderTitle(c1092M8305.f3814);
        return subMenuC4103;
    }

    @Override // android.view.Menu
    public final void clear() {
        C1092 c1092 = this.f16193;
        if (c1092 != null) {
            mo7307(c1092);
        }
        this.f16175.clear();
        m8311(true);
    }

    public final void clearHeader() {
        this.f16192 = null;
        this.f16185 = null;
        this.f16195 = null;
        m8311(false);
    }

    @Override // android.view.Menu
    public final void close() {
        m8297(true);
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        MenuItem menuItemFindItem;
        ArrayList arrayList = this.f16175;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1092 c1092 = (C1092) arrayList.get(i2);
            if (c1092.f3823 == i) {
                return c1092;
            }
            if (c1092.hasSubMenu() && (menuItemFindItem = c1092.f3837.findItem(i)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return (MenuItem) this.f16175.get(i);
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.f16187) {
            return true;
        }
        ArrayList arrayList = this.f16175;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((C1092) arrayList.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return m8309(i, keyEvent) != null;
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return m8299(findItem(i), null, i2);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        C1092 c1092M8309 = m8309(i, keyEvent);
        boolean zM8299 = c1092M8309 != null ? m8299(c1092M8309, null, i2) : false;
        if ((i2 & 2) != 0) {
            m8297(true);
        }
        return zM8299;
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        ArrayList arrayList = this.f16175;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (((C1092) arrayList.get(i3)).f3821 == i) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 >= 0) {
            int size2 = arrayList.size() - i3;
            while (true) {
                int i4 = i2 + 1;
                if (i2 >= size2 || ((C1092) arrayList.get(i3)).f3821 != i) {
                    break;
                }
                if (i3 >= 0 && i3 < arrayList.size()) {
                    arrayList.remove(i3);
                }
                i2 = i4;
            }
            m8311(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        ArrayList arrayList = this.f16175;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (((C1092) arrayList.get(i2)).f3823 == i) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 < 0 || i2 >= arrayList.size()) {
            return;
        }
        arrayList.remove(i2);
        m8311(true);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        ArrayList arrayList = this.f16175;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1092 c1092 = (C1092) arrayList.get(i2);
            if (c1092.f3821 == i) {
                c1092.f3829 = (c1092.f3829 & (-5)) | (z2 ? 4 : 0);
                c1092.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.f16179 = z;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z) {
        ArrayList arrayList = this.f16175;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1092 c1092 = (C1092) arrayList.get(i2);
            if (c1092.f3821 == i) {
                c1092.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z) {
        ArrayList arrayList = this.f16175;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            C1092 c1092 = (C1092) arrayList.get(i2);
            if (c1092.f3821 == i) {
                int i3 = c1092.f3829;
                int i4 = (i3 & (-9)) | (z ? 0 : 8);
                c1092.f3829 = i4;
                if (i3 != i4) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            m8311(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.f16172 = z;
        m8311(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f16175.size();
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final void m8297(boolean z) {
        if (this.f16173) {
            return;
        }
        this.f16173 = true;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f16188;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            InterfaceC3442 interfaceC3442 = (InterfaceC3442) weakReference.get();
            if (interfaceC3442 == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                interfaceC3442.mo4535(this, z);
            }
        }
        this.f16173 = false;
    }

    /* JADX INFO: renamed from: ۥَ */
    public final void m8298(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(mo7309());
        int size = this.f16175.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((SubMenuC4103) item.getSubMenu()).m8298(bundle);
            }
        }
        int i2 = bundle.getInt("android:menu:expandedactionview");
        if (i2 <= 0 || (menuItemFindItem = findItem(i2)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    /* JADX INFO: renamed from: ۥُ */
    public boolean mo7305(MenuC4903 menuC4903, MenuItem menuItem) {
        InterfaceC0614 interfaceC0614 = this.f16174;
        return interfaceC0614 != null && interfaceC0614.mo1377(menuC4903, menuItem);
    }

    /* JADX INFO: renamed from: ۥّ */
    public boolean mo7306(C1092 c1092) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f16188;
        boolean zMo3728 = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        m8302();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            InterfaceC3442 interfaceC3442 = (InterfaceC3442) weakReference.get();
            if (interfaceC3442 != null) {
                zMo3728 = interfaceC3442.mo3728(c1092);
                if (zMo3728) {
                    break;
                }
            } else {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        m8310();
        if (zMo3728) {
            this.f16193 = c1092;
        }
        return zMo3728;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001a  */
    /* JADX WARN: Code duplicated, block: B:32:0x0051  */
    /* JADX WARN: Code duplicated, block: B:35:0x0058  */
    /* JADX WARN: Code duplicated, block: B:37:0x005f  */
    /* JADX WARN: Code duplicated, block: B:38:0x0064  */
    /* JADX WARN: Code duplicated, block: B:45:0x0075  */
    /* JADX WARN: Code duplicated, block: B:47:0x0079  */
    /* JADX WARN: Code duplicated, block: B:50:0x0082  */
    /* JADX WARN: Code duplicated, block: B:53:0x0094  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x00c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x00c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x00ac A[SYNTHETIC] */
    /* JADX INFO: renamed from: ۥْ */
    public final boolean m8299(MenuItem menuItem, InterfaceC3442 interfaceC3442, int i) {
        ActionProviderVisibilityListenerC2187 actionProviderVisibilityListenerC2187;
        boolean zExpandActionView;
        ActionProviderVisibilityListenerC2187 actionProviderVisibilityListenerC2188;
        boolean z;
        SubMenuC4103 subMenuC4103;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList;
        InterfaceC3442 interfaceC3443;
        C1092 c1092 = (C1092) menuItem;
        boolean zMo4536 = false;
        if (c1092 == null || !c1092.isEnabled()) {
            return false;
        }
        MenuC4903 menuC4903 = c1092.f3834;
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = c1092.f3836;
        if ((onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(c1092)) && !menuC4903.mo7305(menuC4903, c1092)) {
            Intent intent = c1092.f3833;
            if (intent != null) {
                try {
                    menuC4903.f16182.startActivity(intent);
                } catch (ActivityNotFoundException e) {
                    Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e);
                    actionProviderVisibilityListenerC2187 = c1092.f3809;
                    if (actionProviderVisibilityListenerC2187 == null) {
                    }
                    zExpandActionView = false;
                    actionProviderVisibilityListenerC2188 = c1092.f3809;
                    if (actionProviderVisibilityListenerC2188 == null) {
                        z = false;
                    } else {
                        z = false;
                    }
                    if (c1092.m2302()) {
                        zExpandActionView |= c1092.expandActionView();
                        if (zExpandActionView) {
                            m8297(true);
                        }
                    } else if (c1092.hasSubMenu()) {
                        if ((i & 4) == 0) {
                            m8297(false);
                        }
                        if (!c1092.hasSubMenu()) {
                            SubMenuC4103 subMenuC4104 = new SubMenuC4103(this.f16182, this, c1092);
                            c1092.f3837 = subMenuC4104;
                            subMenuC4104.setHeaderTitle(c1092.f3814);
                        }
                        subMenuC4103 = c1092.f3837;
                        if (z) {
                            actionProviderVisibilityListenerC2188.f7252.onPrepareSubMenu(subMenuC4103);
                        }
                        copyOnWriteArrayList = this.f16188;
                        if (!copyOnWriteArrayList.isEmpty()) {
                            if (interfaceC3442 != null) {
                            }
                            for (WeakReference weakReference : copyOnWriteArrayList) {
                                interfaceC3443 = (InterfaceC3442) weakReference.get();
                                if (interfaceC3443 == null) {
                                    copyOnWriteArrayList.remove(weakReference);
                                } else if (!zMo4536) {
                                    zMo4536 = interfaceC3443.mo4536(subMenuC4103);
                                }
                            }
                        }
                        zExpandActionView |= zMo4536;
                        if (!zExpandActionView) {
                            m8297(true);
                        }
                    } else {
                        if ((i & 4) == 0) {
                            m8297(false);
                        }
                        if (!c1092.hasSubMenu()) {
                            SubMenuC4103 subMenuC4105 = new SubMenuC4103(this.f16182, this, c1092);
                            c1092.f3837 = subMenuC4105;
                            subMenuC4105.setHeaderTitle(c1092.f3814);
                        }
                        subMenuC4103 = c1092.f3837;
                        if (z) {
                            actionProviderVisibilityListenerC2188.f7252.onPrepareSubMenu(subMenuC4103);
                        }
                        copyOnWriteArrayList = this.f16188;
                        if (!copyOnWriteArrayList.isEmpty()) {
                            zMo4536 = interfaceC3442 != null ? interfaceC3442.mo4536(subMenuC4103) : false;
                            while (r8.hasNext()) {
                                interfaceC3443 = (InterfaceC3442) weakReference.get();
                                if (interfaceC3443 == null) {
                                    copyOnWriteArrayList.remove(weakReference);
                                } else if (!zMo4536) {
                                    zMo4536 = interfaceC3443.mo4536(subMenuC4103);
                                }
                            }
                        }
                        zExpandActionView |= zMo4536;
                        if (!zExpandActionView) {
                            m8297(true);
                        }
                    }
                    return zExpandActionView;
                }
                zExpandActionView = true;
            } else {
                actionProviderVisibilityListenerC2187 = c1092.f3809;
                if (actionProviderVisibilityListenerC2187 == null && actionProviderVisibilityListenerC2187.f7252.onPerformDefaultAction()) {
                    zExpandActionView = true;
                } else {
                    zExpandActionView = false;
                }
            }
        } else {
            zExpandActionView = true;
        }
        actionProviderVisibilityListenerC2188 = c1092.f3809;
        if (actionProviderVisibilityListenerC2188 == null && actionProviderVisibilityListenerC2188.f7252.hasSubMenu()) {
            z = true;
        } else {
            z = false;
        }
        if (c1092.m2302()) {
            zExpandActionView |= c1092.expandActionView();
            if (zExpandActionView) {
                m8297(true);
            }
        } else if (c1092.hasSubMenu() || z) {
            if ((i & 4) == 0) {
                m8297(false);
            }
            if (!c1092.hasSubMenu()) {
                SubMenuC4103 subMenuC4106 = new SubMenuC4103(this.f16182, this, c1092);
                c1092.f3837 = subMenuC4106;
                subMenuC4106.setHeaderTitle(c1092.f3814);
            }
            subMenuC4103 = c1092.f3837;
            if (z) {
                actionProviderVisibilityListenerC2188.f7252.onPrepareSubMenu(subMenuC4103);
            }
            copyOnWriteArrayList = this.f16188;
            if (!copyOnWriteArrayList.isEmpty()) {
                if (interfaceC3442 != null) {
                }
                while (r8.hasNext()) {
                    interfaceC3443 = (InterfaceC3442) weakReference.get();
                    if (interfaceC3443 == null) {
                        copyOnWriteArrayList.remove(weakReference);
                    } else if (!zMo4536) {
                        zMo4536 = interfaceC3443.mo4536(subMenuC4103);
                    }
                }
            }
            zExpandActionView |= zMo4536;
            if (!zExpandActionView) {
                m8297(true);
            }
        } else if ((i & 1) == 0) {
            m8297(true);
        }
        return zExpandActionView;
    }

    /* JADX INFO: renamed from: ۥٓ */
    public final void m8300(InterfaceC3442 interfaceC3442) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f16188;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            InterfaceC3442 interfaceC3443 = (InterfaceC3442) weakReference.get();
            if (interfaceC3443 == null || interfaceC3443 == interfaceC3442) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    /* JADX INFO: renamed from: ۥٖ */
    public final void m8301(Bundle bundle) {
        int size = this.f16175.size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((SubMenuC4103) item.getSubMenu()).m8301(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(mo7309(), sparseArray);
        }
    }

    /* JADX INFO: renamed from: ۥۖ */
    public final void m8302() {
        if (this.f16194) {
            return;
        }
        this.f16194 = true;
        this.f16176 = false;
        this.f16177 = false;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final void m8303(InterfaceC3442 interfaceC3442, Context context) {
        this.f16188.add(new WeakReference(interfaceC3442));
        interfaceC3442.mo3733(context, this);
        this.f16190 = true;
    }

    /* JADX INFO: renamed from: ۥۜ */
    public final void m8304(ArrayList arrayList, int i, KeyEvent keyEvent) {
        boolean zMo7311 = mo7311();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            ArrayList arrayList2 = this.f16175;
            int size = arrayList2.size();
            for (int i2 = 0; i2 < size; i2++) {
                C1092 c1092 = (C1092) arrayList2.get(i2);
                if (c1092.hasSubMenu()) {
                    c1092.f3837.m8304(arrayList, i, keyEvent);
                }
                char c = zMo7311 ? c1092.f3828 : c1092.f3822;
                if ((modifiers & 69647) == ((zMo7311 ? c1092.f3832 : c1092.f3831) & 69647) && c != 0) {
                    char[] cArr = keyData.meta;
                    if ((c == cArr[0] || c == cArr[2] || (zMo7311 && c == '\b' && i == 67)) && c1092.isEnabled()) {
                        arrayList.add(c1092);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final C1092 m8305(int i, int i2, int i3, CharSequence charSequence) {
        int i4;
        int i5 = ((-65536) & i3) >> 16;
        if (i5 < 0 || i5 >= 6) {
            C1078.m2272("order does not contain a valid category.");
            return null;
        }
        int i6 = (f16171[i5] << 16) | (65535 & i3);
        C1092 c1092 = new C1092(this, i, i2, i3, i6, charSequence, this.f16184);
        ArrayList arrayList = this.f16175;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((C1092) arrayList.get(size)).f3825 <= i6) {
                i4 = size + 1;
                arrayList.add(i4, c1092);
                m8311(true);
                return c1092;
            }
        }
        i4 = 0;
        arrayList.add(i4, c1092);
        m8311(true);
        return c1092;
    }

    /* JADX INFO: renamed from: ۦؑ */
    public boolean mo7307(C1092 c1092) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f16188;
        boolean zMo3726 = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f16193 == c1092) {
            m8302();
            for (WeakReference weakReference : copyOnWriteArrayList) {
                InterfaceC3442 interfaceC3442 = (InterfaceC3442) weakReference.get();
                if (interfaceC3442 != null) {
                    zMo3726 = interfaceC3442.mo3726(c1092);
                    if (zMo3726) {
                        break;
                    }
                } else {
                    copyOnWriteArrayList.remove(weakReference);
                }
            }
            m8310();
            if (zMo3726) {
                this.f16193 = null;
            }
        }
        return zMo3726;
    }

    /* JADX INFO: renamed from: ۦؚ */
    public final ArrayList m8306() {
        boolean z = this.f16181;
        ArrayList arrayList = this.f16191;
        if (!z) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f16175;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            C1092 c1092 = (C1092) arrayList2.get(i);
            if (c1092.isVisible()) {
                arrayList.add(c1092);
            }
        }
        this.f16181 = false;
        this.f16190 = true;
        return arrayList;
    }

    /* JADX INFO: renamed from: ۦٌ */
    public boolean mo7308() {
        return this.f16179;
    }

    /* JADX INFO: renamed from: ۦِ */
    public String mo7309() {
        return "android:menu:actionviewstates";
    }

    /* JADX INFO: renamed from: ۦٗ */
    public final void m8307(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        if (view != null) {
            this.f16195 = view;
            this.f16185 = null;
            this.f16192 = null;
        } else {
            if (i > 0) {
                this.f16185 = this.f16180.getText(i);
            } else if (charSequence != null) {
                this.f16185 = charSequence;
            }
            if (i2 > 0) {
                this.f16192 = this.f16182.getDrawable(i2);
            } else if (drawable != null) {
                this.f16192 = drawable;
            }
            this.f16195 = null;
        }
        m8311(false);
    }

    /* JADX INFO: renamed from: ۦٛ */
    public final void m8308() {
        ArrayList arrayListM8306 = m8306();
        if (this.f16190) {
            CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f16188;
            boolean zMo4537 = false;
            for (WeakReference weakReference : copyOnWriteArrayList) {
                InterfaceC3442 interfaceC3442 = (InterfaceC3442) weakReference.get();
                if (interfaceC3442 == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zMo4537 |= interfaceC3442.mo4537();
                }
            }
            ArrayList arrayList = this.f16189;
            ArrayList arrayList2 = this.f16186;
            if (zMo4537) {
                arrayList.clear();
                arrayList2.clear();
                int size = arrayListM8306.size();
                for (int i = 0; i < size; i++) {
                    C1092 c1092 = (C1092) arrayListM8306.get(i);
                    if ((c1092.f3829 & 32) == 32) {
                        arrayList.add(c1092);
                    } else {
                        arrayList2.add(c1092);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(m8306());
            }
            this.f16190 = false;
        }
    }

    /* JADX INFO: renamed from: ۦۙ */
    public final C1092 m8309(int i, KeyEvent keyEvent) {
        ArrayList arrayList = this.f16178;
        arrayList.clear();
        m8304(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (C1092) arrayList.get(0);
        }
        boolean zMo7311 = mo7311();
        for (int i2 = 0; i2 < size; i2++) {
            C1092 c1092 = (C1092) arrayList.get(i2);
            char c = zMo7311 ? c1092.f3828 : c1092.f3822;
            char[] cArr = keyData.meta;
            if ((c == cArr[0] && (metaState & 2) == 0) || ((c == cArr[2] && (metaState & 2) != 0) || (zMo7311 && c == '\b' && i == 67))) {
                return c1092;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۚ */
    public boolean mo7311() {
        return this.f16172;
    }

    /* JADX INFO: renamed from: ۦۛ */
    public final void m8310() {
        this.f16194 = false;
        if (this.f16176) {
            this.f16176 = false;
            m8311(this.f16177);
        }
    }

    /* JADX INFO: renamed from: ۦ۟ */
    public final void m8311(boolean z) {
        if (this.f16194) {
            this.f16176 = true;
            if (z) {
                this.f16177 = true;
                return;
            }
            return;
        }
        if (z) {
            this.f16181 = true;
            this.f16190 = true;
        }
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f16188;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        m8302();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            InterfaceC3442 interfaceC3442 = (InterfaceC3442) weakReference.get();
            if (interfaceC3442 == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                interfaceC3442.mo4538();
            }
        }
        m8310();
    }

    /* JADX INFO: renamed from: ۦۨ */
    public boolean mo7312() {
        return this.f16183;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return m8305(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return m8305(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return m8305(i, i2, i3, this.f16180.getString(i4));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.f16180.getString(i));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.f16180.getString(i4));
    }

    /* JADX INFO: renamed from: ۦۗ */
    public MenuC4903 mo7310() {
        return this;
    }
}
