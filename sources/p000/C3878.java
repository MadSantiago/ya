package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: ۦَۨۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3878 {

    /* JADX INFO: renamed from: ۥؓ */
    public CharSequence f12931;

    /* JADX INFO: renamed from: ۥؖ */
    public ActionProviderVisibilityListenerC2187 f12932;

    /* JADX INFO: renamed from: ۥَ */
    public boolean f12935;

    /* JADX INFO: renamed from: ۥْ */
    public int f12938;

    /* JADX INFO: renamed from: ۥٓ */
    public int f12939;

    /* JADX INFO: renamed from: ۥٕ */
    public final /* synthetic */ C3837 f12940;

    /* JADX INFO: renamed from: ۥٖ */
    public boolean f12941;

    /* JADX INFO: renamed from: ۥٙ */
    public String f12942;

    /* JADX INFO: renamed from: ۥۖ */
    public int f12943;

    /* JADX INFO: renamed from: ۥۜ */
    public boolean f12945;

    /* JADX INFO: renamed from: ۥۣ */
    public final Menu f12946;

    /* JADX INFO: renamed from: ۥۧ */
    public CharSequence f12947;

    /* JADX INFO: renamed from: ۦؚ */
    public CharSequence f12949;

    /* JADX INFO: renamed from: ۦٌ */
    public int f12950;

    /* JADX INFO: renamed from: ۦِ */
    public int f12951;

    /* JADX INFO: renamed from: ۦٕ */
    public String f12952;

    /* JADX INFO: renamed from: ۦٗ */
    public boolean f12953;

    /* JADX INFO: renamed from: ۦٛ */
    public int f12955;

    /* JADX INFO: renamed from: ۦۗ */
    public CharSequence f12956;

    /* JADX INFO: renamed from: ۦۚ */
    public char f12958;

    /* JADX INFO: renamed from: ۦۛ */
    public int f12959;

    /* JADX INFO: renamed from: ۦ۟ */
    public char f12960;

    /* JADX INFO: renamed from: ۦۨ */
    public int f12961;

    /* JADX INFO: renamed from: ۥً */
    public ColorStateList f12934 = null;

    /* JADX INFO: renamed from: ۦٚ */
    public PorterDuff.Mode f12954 = null;

    /* JADX INFO: renamed from: ۥۗ */
    public int f12944 = 0;

    /* JADX INFO: renamed from: ۥؗ */
    public int f12933 = 0;

    /* JADX INFO: renamed from: ۦؑ */
    public int f12948 = 0;

    /* JADX INFO: renamed from: ۥُ */
    public int f12936 = 0;

    /* JADX INFO: renamed from: ۥّ */
    public boolean f12937 = true;

    /* JADX INFO: renamed from: ۦۙ */
    public boolean f12957 = true;

    public C3878(C3837 c3837, Menu menu) {
        this.f12940 = c3837;
        this.f12946 = menu;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final void m6929(MenuItem menuItem) {
        C3837 c3837 = this.f12940;
        Context context = c3837.f12779;
        boolean z = false;
        menuItem.setChecked(this.f12935).setVisible(this.f12941).setEnabled(this.f12953).setCheckable(this.f12939 >= 1).setTitleCondensed(this.f12949).setIcon(this.f12950);
        int i = this.f12959;
        if (i >= 0) {
            menuItem.setShowAsAction(i);
        }
        if (this.f12942 != null) {
            if (context.isRestricted()) {
                C1078.m2276("The android:onClick attribute cannot be used within a restricted context");
                return;
            }
            Object objM6884 = c3837.f12782;
            if (objM6884 == null) {
                objM6884 = C3837.m6884(context);
                c3837.f12782 = objM6884;
            }
            String str = this.f12942;
            MenuItemOnMenuItemClickListenerC2941 menuItemOnMenuItemClickListenerC2941 = new MenuItemOnMenuItemClickListenerC2941();
            menuItemOnMenuItemClickListenerC2941.f9877 = objM6884;
            Class<?> cls = objM6884.getClass();
            try {
                menuItemOnMenuItemClickListenerC2941.f9876 = cls.getMethod(str, MenuItemOnMenuItemClickListenerC2941.f9875);
                menuItem.setOnMenuItemClickListener(menuItemOnMenuItemClickListenerC2941);
            } catch (Exception e) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e);
                throw inflateException;
            }
        }
        if (this.f12939 >= 2) {
            if (menuItem instanceof C1092) {
                C1092 c1092 = (C1092) menuItem;
                c1092.f3829 = (c1092.f3829 & (-5)) | 4;
            } else if (menuItem instanceof MenuItemC0784) {
                MenuItemC0784 menuItemC0784 = (MenuItemC0784) menuItem;
                InterfaceMenuItemC4632 interfaceMenuItemC4632 = menuItemC0784.f2830;
                try {
                    Method declaredMethod = menuItemC0784.f2831;
                    if (declaredMethod == null) {
                        declaredMethod = interfaceMenuItemC4632.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                        menuItemC0784.f2831 = declaredMethod;
                    }
                    declaredMethod.invoke(interfaceMenuItemC4632, Boolean.TRUE);
                } catch (Exception e2) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e2);
                }
            }
        }
        String str2 = this.f12952;
        if (str2 != null) {
            menuItem.setActionView((View) m6930(str2, C3837.f12777, c3837.f12781));
            z = true;
        }
        int i2 = this.f12943;
        if (i2 > 0) {
            if (z) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i2);
            }
        }
        ActionProviderVisibilityListenerC2187 actionProviderVisibilityListenerC2187 = this.f12932;
        if (actionProviderVisibilityListenerC2187 != null) {
            if (menuItem instanceof InterfaceMenuItemC4632) {
                ((InterfaceMenuItemC4632) menuItem).mo2305(actionProviderVisibilityListenerC2187);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.f12931;
        boolean z2 = menuItem instanceof InterfaceMenuItemC4632;
        if (z2) {
            ((InterfaceMenuItemC4632) menuItem).setContentDescription(charSequence);
        } else {
            menuItem.setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f12947;
        if (z2) {
            ((InterfaceMenuItemC4632) menuItem).setTooltipText(charSequence2);
        } else {
            menuItem.setTooltipText(charSequence2);
        }
        char c = this.f12958;
        int i3 = this.f12961;
        if (z2) {
            ((InterfaceMenuItemC4632) menuItem).setAlphabeticShortcut(c, i3);
        } else {
            menuItem.setAlphabeticShortcut(c, i3);
        }
        char c2 = this.f12960;
        int i4 = this.f12938;
        if (z2) {
            ((InterfaceMenuItemC4632) menuItem).setNumericShortcut(c2, i4);
        } else {
            menuItem.setNumericShortcut(c2, i4);
        }
        PorterDuff.Mode mode = this.f12954;
        if (mode != null) {
            if (z2) {
                ((InterfaceMenuItemC4632) menuItem).setIconTintMode(mode);
            } else {
                menuItem.setIconTintMode(mode);
            }
        }
        ColorStateList colorStateList = this.f12934;
        if (colorStateList != null) {
            if (z2) {
                ((InterfaceMenuItemC4632) menuItem).setIconTintList(colorStateList);
            } else {
                menuItem.setIconTintList(colorStateList);
            }
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final Object m6930(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.f12940.f12779.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e);
            return null;
        }
    }
}
