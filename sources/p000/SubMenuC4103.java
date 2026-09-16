package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: renamed from: ۦٜٜٓؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class SubMenuC4103 extends MenuC4903 implements SubMenu {

    /* JADX INFO: renamed from: ۥؓ */
    public final C1092 f13689;

    /* JADX INFO: renamed from: ۥؖ */
    public final MenuC4903 f13690;

    public SubMenuC4103(Context context, MenuC4903 menuC4903, C1092 c1092) {
        super(context);
        this.f13690 = menuC4903;
        this.f13689 = c1092;
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.f13689;
    }

    @Override // p000.MenuC4903, android.view.Menu
    public final void setGroupDividerEnabled(boolean z) {
        this.f13690.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        m8307(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        m8307(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        m8307(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.f13689.setIcon(drawable);
        return this;
    }

    @Override // p000.MenuC4903, android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.f13690.setQwertyMode(z);
    }

    @Override // p000.MenuC4903
    /* JADX INFO: renamed from: ۥُ */
    public final boolean mo7305(MenuC4903 menuC4903, MenuItem menuItem) {
        return super.mo7305(menuC4903, menuItem) || this.f13690.mo7305(menuC4903, menuItem);
    }

    @Override // p000.MenuC4903
    /* JADX INFO: renamed from: ۥّ */
    public final boolean mo7306(C1092 c1092) {
        return this.f13690.mo7306(c1092);
    }

    @Override // p000.MenuC4903
    /* JADX INFO: renamed from: ۦؑ */
    public final boolean mo7307(C1092 c1092) {
        return this.f13690.mo7307(c1092);
    }

    @Override // p000.MenuC4903
    /* JADX INFO: renamed from: ۦٌ */
    public final boolean mo7308() {
        return this.f13690.mo7308();
    }

    @Override // p000.MenuC4903
    /* JADX INFO: renamed from: ۦِ */
    public final String mo7309() {
        int i = this.f13689.f3823;
        if (i == 0) {
            return null;
        }
        return AbstractC5078.m8670(i, "android:menu:actionviewstates:");
    }

    @Override // p000.MenuC4903
    /* JADX INFO: renamed from: ۦۗ */
    public final MenuC4903 mo7310() {
        return this.f13690.mo7310();
    }

    @Override // p000.MenuC4903
    /* JADX INFO: renamed from: ۦۚ */
    public final boolean mo7311() {
        return this.f13690.mo7311();
    }

    @Override // p000.MenuC4903
    /* JADX INFO: renamed from: ۦۨ */
    public final boolean mo7312() {
        return this.f13690.mo7312();
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.f13689.setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        m8307(0, null, i, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        m8307(i, null, 0, null, null);
        return this;
    }
}
