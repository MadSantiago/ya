package p000;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: renamed from: ۥؙۢؑۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2593 implements InterfaceMenuItemC4632 {

    /* JADX INFO: renamed from: ۥؗ */
    public Intent f8655;

    /* JADX INFO: renamed from: ۥُ */
    public int f8656;

    /* JADX INFO: renamed from: ۥّ */
    public char f8657;

    /* JADX INFO: renamed from: ۥۗ */
    public CharSequence f8658;

    /* JADX INFO: renamed from: ۥۜ */
    public Drawable f8659;

    /* JADX INFO: renamed from: ۥۣ */
    public CharSequence f8660;

    /* JADX INFO: renamed from: ۦؑ */
    public char f8661;

    /* JADX INFO: renamed from: ۦؚ */
    public ColorStateList f8662;

    /* JADX INFO: renamed from: ۦٌ */
    public PorterDuff.Mode f8663;

    /* JADX INFO: renamed from: ۦِ */
    public CharSequence f8664;

    /* JADX INFO: renamed from: ۦٛ */
    public Context f8665;

    /* JADX INFO: renamed from: ۦۗ */
    public CharSequence f8666;

    /* JADX INFO: renamed from: ۦۙ */
    public int f8667;

    /* JADX INFO: renamed from: ۦۚ */
    public boolean f8668;

    /* JADX INFO: renamed from: ۦ۟ */
    public int f8669;

    /* JADX INFO: renamed from: ۦۨ */
    public boolean f8670;

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        return null;
    }

    @Override // p000.InterfaceMenuItemC4632, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f8667;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f8657;
    }

    @Override // p000.InterfaceMenuItemC4632, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f8664;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f8659;
    }

    @Override // p000.InterfaceMenuItemC4632, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f8662;
    }

    @Override // p000.InterfaceMenuItemC4632, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f8663;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f8655;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return R.id.home;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // p000.InterfaceMenuItemC4632, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f8656;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f8661;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f8660;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f8658;
        return charSequence != null ? charSequence : this.f8660;
    }

    @Override // p000.InterfaceMenuItemC4632, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f8666;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f8669 & 1) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f8669 & 2) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f8669 & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f8669 & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.InterfaceMenuItemC4632, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        this.f8657 = Character.toLowerCase(c);
        this.f8667 = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        this.f8669 = (z ? 1 : 0) | (this.f8669 & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        this.f8669 = (z ? 2 : 0) | (this.f8669 & (-3));
        return this;
    }

    @Override // p000.InterfaceMenuItemC4632, android.view.MenuItem
    public final InterfaceMenuItemC4632 setContentDescription(CharSequence charSequence) {
        this.f8664 = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        this.f8669 = (z ? 16 : 0) | (this.f8669 & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f8659 = this.f8665.getDrawable(i);
        m4892();
        return this;
    }

    @Override // p000.InterfaceMenuItemC4632, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f8662 = colorStateList;
        this.f8668 = true;
        m4892();
        return this;
    }

    @Override // p000.InterfaceMenuItemC4632, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f8663 = mode;
        this.f8670 = true;
        m4892();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f8655 = intent;
        return this;
    }

    @Override // p000.InterfaceMenuItemC4632, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i) {
        this.f8661 = c;
        this.f8656 = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.InterfaceMenuItemC4632, android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f8661 = c;
        this.f8656 = KeyEvent.normalizeMetaState(i);
        this.f8657 = Character.toLowerCase(c2);
        this.f8667 = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        this.f8660 = this.f8665.getResources().getString(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f8658 = charSequence;
        return this;
    }

    @Override // p000.InterfaceMenuItemC4632, android.view.MenuItem
    public final InterfaceMenuItemC4632 setTooltipText(CharSequence charSequence) {
        this.f8666 = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        this.f8669 = (this.f8669 & 8) | (z ? 0 : 8);
        return this;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final void m4892() {
        Drawable drawable = this.f8659;
        if (drawable != null) {
            if (this.f8668 || this.f8670) {
                this.f8659 = drawable;
                Drawable drawableMutate = drawable.mutate();
                this.f8659 = drawableMutate;
                if (this.f8668) {
                    drawableMutate.setTintList(this.f8662);
                }
                if (this.f8670) {
                    this.f8659.setTintMode(this.f8663);
                }
            }
        }
    }

    @Override // p000.InterfaceMenuItemC4632
    /* JADX INFO: renamed from: ۥۗ */
    public final ActionProviderVisibilityListenerC2187 mo2304() {
        return null;
    }

    @Override // p000.InterfaceMenuItemC4632
    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceMenuItemC4632 mo2305(ActionProviderVisibilityListenerC2187 actionProviderVisibilityListenerC2187) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f8664 = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f8666 = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        this.f8661 = c;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f8659 = drawable;
        m4892();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        this.f8657 = Character.toLowerCase(c);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f8660 = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.f8661 = c;
        this.f8657 = Character.toLowerCase(c2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        return this;
    }
}
