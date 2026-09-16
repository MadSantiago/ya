package p000;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;

/* JADX INFO: renamed from: ۥِؒۥۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1092 implements InterfaceMenuItemC4632 {

    /* JADX INFO: renamed from: ۥؓ */
    public ActionProviderVisibilityListenerC2187 f3809;

    /* JADX INFO: renamed from: ۥؖ */
    public View f3810;

    /* JADX INFO: renamed from: ۥؗ */
    public final int f3811;

    /* JADX INFO: renamed from: ۥُ */
    public CharSequence f3814;

    /* JADX INFO: renamed from: ۥّ */
    public CharSequence f3815;

    /* JADX INFO: renamed from: ۥْ */
    public CharSequence f3816;

    /* JADX INFO: renamed from: ۥٓ */
    public CharSequence f3817;

    /* JADX INFO: renamed from: ۥٙ */
    public int f3819;

    /* JADX INFO: renamed from: ۥۗ */
    public final int f3821;

    /* JADX INFO: renamed from: ۥۜ */
    public char f3822;

    /* JADX INFO: renamed from: ۥۣ */
    public final int f3823;

    /* JADX INFO: renamed from: ۥۧ */
    public MenuItem.OnActionExpandListener f3824;

    /* JADX INFO: renamed from: ۦؑ */
    public final int f3825;

    /* JADX INFO: renamed from: ۦؚ */
    public Drawable f3826;

    /* JADX INFO: renamed from: ۦِ */
    public char f3828;

    /* JADX INFO: renamed from: ۦۙ */
    public Intent f3833;

    /* JADX INFO: renamed from: ۦۚ */
    public final MenuC4903 f3834;

    /* JADX INFO: renamed from: ۦ۟ */
    public MenuItem.OnMenuItemClickListener f3836;

    /* JADX INFO: renamed from: ۦۨ */
    public SubMenuC4103 f3837;

    /* JADX INFO: renamed from: ۦٛ */
    public int f3831 = 4096;

    /* JADX INFO: renamed from: ۦۗ */
    public int f3832 = 4096;

    /* JADX INFO: renamed from: ۦٌ */
    public int f3827 = 0;

    /* JADX INFO: renamed from: ۥَ */
    public ColorStateList f3813 = null;

    /* JADX INFO: renamed from: ۥٖ */
    public PorterDuff.Mode f3818 = null;

    /* JADX INFO: renamed from: ۦٗ */
    public boolean f3830 = false;

    /* JADX INFO: renamed from: ۦۛ */
    public boolean f3835 = false;

    /* JADX INFO: renamed from: ۥۖ */
    public boolean f3820 = false;

    /* JADX INFO: renamed from: ۦٕ */
    public int f3829 = 16;

    /* JADX INFO: renamed from: ۥً */
    public boolean f3812 = false;

    public C1092(MenuC4903 menuC4903, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f3834 = menuC4903;
        this.f3823 = i2;
        this.f3821 = i;
        this.f3811 = i3;
        this.f3825 = i4;
        this.f3814 = charSequence;
        this.f3819 = i5;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public static void m2301(int i, int i2, String str, StringBuilder sb) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f3819 & 8) == 0) {
            return false;
        }
        if (this.f3810 == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f3824;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f3834.mo7307(this);
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!m2302()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f3824;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f3834.mo7306(this);
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f3810;
        if (view != null) {
            return view;
        }
        ActionProviderVisibilityListenerC2187 actionProviderVisibilityListenerC2187 = this.f3809;
        if (actionProviderVisibilityListenerC2187 == null) {
            return null;
        }
        View viewOnCreateActionView = actionProviderVisibilityListenerC2187.f7252.onCreateActionView(this);
        this.f3810 = viewOnCreateActionView;
        return viewOnCreateActionView;
    }

    @Override // p000.InterfaceMenuItemC4632, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f3832;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f3828;
    }

    @Override // p000.InterfaceMenuItemC4632, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f3816;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f3821;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f3826;
        if (drawable != null) {
            return m2306(drawable);
        }
        int i = this.f3827;
        if (i == 0) {
            return null;
        }
        Drawable drawableM7464 = AbstractC4225.m7464(this.f3834.f16182, i);
        this.f3827 = 0;
        this.f3826 = drawableM7464;
        return m2306(drawableM7464);
    }

    @Override // p000.InterfaceMenuItemC4632, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f3813;
    }

    @Override // p000.InterfaceMenuItemC4632, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f3818;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f3833;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f3823;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // p000.InterfaceMenuItemC4632, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f3831;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f3822;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f3811;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f3837;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f3814;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f3815;
        return charSequence != null ? charSequence : this.f3814;
    }

    @Override // p000.InterfaceMenuItemC4632, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f3817;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f3837 != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f3812;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f3829 & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f3829 & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f3829 & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        ActionProviderVisibilityListenerC2187 actionProviderVisibilityListenerC2187 = this.f3809;
        if (actionProviderVisibilityListenerC2187 == null || !actionProviderVisibilityListenerC2187.f7252.overridesItemVisibility()) {
            return (this.f3829 & 8) == 0;
        }
        return (this.f3829 & 8) == 0 && this.f3809.f7252.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        int i2;
        MenuC4903 menuC4903 = this.f3834;
        Context context = menuC4903.f16182;
        View viewInflate = LayoutInflater.from(context).inflate(i, (ViewGroup) new LinearLayout(context), false);
        this.f3810 = viewInflate;
        this.f3809 = null;
        if (viewInflate != null && viewInflate.getId() == -1 && (i2 = this.f3823) > 0) {
            viewInflate.setId(i2);
        }
        menuC4903.f16190 = true;
        menuC4903.m8311(true);
        return this;
    }

    @Override // p000.InterfaceMenuItemC4632, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.f3828 == c && this.f3832 == i) {
            return this;
        }
        this.f3828 = Character.toLowerCase(c);
        this.f3832 = KeyEvent.normalizeMetaState(i);
        this.f3834.m8311(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        int i = this.f3829;
        int i2 = (z ? 1 : 0) | (i & (-2));
        this.f3829 = i2;
        if (i != i2) {
            this.f3834.m8311(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        int i = this.f3829;
        int i2 = i & 4;
        MenuC4903 menuC4903 = this.f3834;
        if (i2 == 0) {
            int i3 = (i & (-3)) | (z ? 2 : 0);
            this.f3829 = i3;
            if (i != i3) {
                menuC4903.m8311(false);
            }
            return this;
        }
        ArrayList arrayList = menuC4903.f16175;
        int size = arrayList.size();
        menuC4903.m8302();
        for (int i4 = 0; i4 < size; i4++) {
            C1092 c1092 = (C1092) arrayList.get(i4);
            if (c1092.f3821 == this.f3821 && (c1092.f3829 & 4) != 0 && c1092.isCheckable()) {
                boolean z2 = c1092 == this;
                int i5 = c1092.f3829;
                int i6 = (z2 ? 2 : 0) | (i5 & (-3));
                c1092.f3829 = i6;
                if (i5 != i6) {
                    c1092.f3834.m8311(false);
                }
            }
        }
        menuC4903.m8310();
        return this;
    }

    @Override // p000.InterfaceMenuItemC4632, android.view.MenuItem
    public final InterfaceMenuItemC4632 setContentDescription(CharSequence charSequence) {
        this.f3816 = charSequence;
        this.f3834.m8311(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        int i = this.f3829;
        if (z) {
            this.f3829 = i | 16;
        } else {
            this.f3829 = i & (-17);
        }
        this.f3834.m8311(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f3826 = null;
        this.f3827 = i;
        this.f3820 = true;
        this.f3834.m8311(false);
        return this;
    }

    @Override // p000.InterfaceMenuItemC4632, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f3813 = colorStateList;
        this.f3830 = true;
        this.f3820 = true;
        this.f3834.m8311(false);
        return this;
    }

    @Override // p000.InterfaceMenuItemC4632, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f3818 = mode;
        this.f3835 = true;
        this.f3820 = true;
        this.f3834.m8311(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f3833 = intent;
        return this;
    }

    @Override // p000.InterfaceMenuItemC4632, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i) {
        if (this.f3822 == c && this.f3831 == i) {
            return this;
        }
        this.f3822 = c;
        this.f3831 = KeyEvent.normalizeMetaState(i);
        this.f3834.m8311(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f3824 = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f3836 = onMenuItemClickListener;
        return this;
    }

    @Override // p000.InterfaceMenuItemC4632, android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f3822 = c;
        this.f3831 = KeyEvent.normalizeMetaState(i);
        this.f3828 = Character.toLowerCase(c2);
        this.f3832 = KeyEvent.normalizeMetaState(i2);
        this.f3834.m8311(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            C1078.m2272("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
            return;
        }
        this.f3819 = i;
        MenuC4903 menuC4903 = this.f3834;
        menuC4903.f16190 = true;
        menuC4903.m8311(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f3814 = charSequence;
        this.f3834.m8311(false);
        SubMenuC4103 subMenuC4103 = this.f3837;
        if (subMenuC4103 != null) {
            subMenuC4103.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f3815 = charSequence;
        this.f3834.m8311(false);
        return this;
    }

    @Override // p000.InterfaceMenuItemC4632, android.view.MenuItem
    public final InterfaceMenuItemC4632 setTooltipText(CharSequence charSequence) {
        this.f3817 = charSequence;
        this.f3834.m8311(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        int i = this.f3829;
        int i2 = (z ? 0 : 8) | (i & (-9));
        this.f3829 = i2;
        if (i != i2) {
            MenuC4903 menuC4903 = this.f3834;
            menuC4903.f16181 = true;
            menuC4903.m8311(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f3814;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥُ */
    public final boolean m2302() {
        ActionProviderVisibilityListenerC2187 actionProviderVisibilityListenerC2187;
        if ((this.f3819 & 8) != 0) {
            View viewOnCreateActionView = this.f3810;
            if (viewOnCreateActionView == null && (actionProviderVisibilityListenerC2187 = this.f3809) != null) {
                viewOnCreateActionView = actionProviderVisibilityListenerC2187.f7252.onCreateActionView(this);
                this.f3810 = viewOnCreateActionView;
            }
            if (viewOnCreateActionView != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥّ */
    public final void m2303(boolean z) {
        int i = this.f3829;
        if (z) {
            this.f3829 = i | 32;
        } else {
            this.f3829 = i & (-33);
        }
    }

    @Override // p000.InterfaceMenuItemC4632
    /* JADX INFO: renamed from: ۥۗ */
    public final ActionProviderVisibilityListenerC2187 mo2304() {
        return this.f3809;
    }

    @Override // p000.InterfaceMenuItemC4632
    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceMenuItemC4632 mo2305(ActionProviderVisibilityListenerC2187 actionProviderVisibilityListenerC2187) {
        this.f3810 = null;
        this.f3809 = actionProviderVisibilityListenerC2187;
        int i = 1;
        this.f3834.m8311(true);
        ActionProviderVisibilityListenerC2187 actionProviderVisibilityListenerC2188 = this.f3809;
        if (actionProviderVisibilityListenerC2188 != null) {
            actionProviderVisibilityListenerC2188.f7253 = new C1039(i, this);
            actionProviderVisibilityListenerC2188.f7252.setVisibilityListener(actionProviderVisibilityListenerC2188);
        }
        return this;
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final Drawable m2306(Drawable drawable) {
        if (drawable != null && this.f3820 && (this.f3830 || this.f3835)) {
            drawable = drawable.mutate();
            if (this.f3830) {
                drawable.setTintList(this.f3813);
            }
            if (this.f3835) {
                drawable.setTintMode(this.f3818);
            }
            this.f3820 = false;
        }
        return drawable;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f3827 = 0;
        this.f3826 = drawable;
        this.f3820 = true;
        this.f3834.m8311(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        setTitle(this.f3834.f16182.getString(i));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        if (this.f3822 == c) {
            return this;
        }
        this.f3822 = c;
        this.f3834.m8311(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.f3822 = c;
        this.f3828 = Character.toLowerCase(c2);
        this.f3834.m8311(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        if (this.f3828 == c) {
            return this;
        }
        this.f3828 = Character.toLowerCase(c);
        this.f3834.m8311(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i;
        this.f3810 = view;
        this.f3809 = null;
        if (view != null && view.getId() == -1 && (i = this.f3823) > 0) {
            view.setId(i);
        }
        MenuC4903 menuC4903 = this.f3834;
        menuC4903.f16190 = true;
        menuC4903.m8311(true);
        return this;
    }
}
