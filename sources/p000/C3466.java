package p000;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;

/* JADX INFO: renamed from: ۦؘؘٖؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3466 extends ActionMode {

    /* JADX INFO: renamed from: ۥۗ */
    public final AbstractC3305 f11499;

    /* JADX INFO: renamed from: ۥۣ */
    public final Context f11500;

    public C3466(Context context, AbstractC3305 abstractC3305) {
        this.f11500 = context;
        this.f11499 = abstractC3305;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f11499.mo6070();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f11499.mo6068();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new MenuC4451(this.f11500, this.f11499.mo6065());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f11499.mo6066();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f11499.mo6067();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f11499.f11067;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f11499.mo6069();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f11499.f11066;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f11499.mo6074();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f11499.mo6073();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f11499.mo6075(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f11499.mo6072(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f11499.f11067 = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f11499.mo6078(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z) {
        this.f11499.mo6077(z);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i) {
        this.f11499.mo6071(i);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i) {
        this.f11499.mo6076(i);
    }
}
