package p000;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: ۦٍَٟؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3795 extends AbstractC3305 implements InterfaceC0614 {

    /* JADX INFO: renamed from: ۥَ */
    public C5002 f12599;

    /* JADX INFO: renamed from: ۥْ */
    public final Context f12600;

    /* JADX INFO: renamed from: ۥٓ */
    public final MenuC4903 f12601;

    /* JADX INFO: renamed from: ۥٖ */
    public WeakReference f12602;

    /* JADX INFO: renamed from: ۦٗ */
    public final /* synthetic */ C4075 f12603;

    public C3795(C4075 c4075, Context context, C5002 c5002) {
        this.f12603 = c4075;
        this.f12600 = context;
        this.f12599 = c5002;
        MenuC4903 menuC4903 = new MenuC4903(context);
        menuC4903.f16184 = 1;
        this.f12601 = menuC4903;
        menuC4903.f16174 = this;
    }

    @Override // p000.AbstractC3305
    /* JADX INFO: renamed from: ۥؗ */
    public final MenuC4903 mo6065() {
        return this.f12601;
    }

    @Override // p000.AbstractC3305
    /* JADX INFO: renamed from: ۥُ */
    public final MenuInflater mo6066() {
        return new C3837(this.f12600);
    }

    @Override // p000.AbstractC3305
    /* JADX INFO: renamed from: ۥّ */
    public final CharSequence mo6067() {
        return this.f12603.f13571.getSubtitle();
    }

    @Override // p000.AbstractC3305
    /* JADX INFO: renamed from: ۥۗ */
    public final View mo6068() {
        WeakReference weakReference = this.f12602;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // p000.AbstractC3305
    /* JADX INFO: renamed from: ۥۜ */
    public final CharSequence mo6069() {
        return this.f12603.f13571.getTitle();
    }

    @Override // p000.AbstractC3305
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo6070() {
        C4075 c4075 = this.f12603;
        if (c4075.f13585 != this) {
            return;
        }
        if (c4075.f13590) {
            c4075.f13582 = this;
            c4075.f13586 = this.f12599;
        } else {
            this.f12599.m8398(this);
        }
        this.f12599 = null;
        c4075.m7262(false);
        ActionBarContextView actionBarContextView = c4075.f13571;
        if (actionBarContextView.f49 == null) {
            actionBarContextView.m12();
        }
        c4075.f13568.setHideOnContentScrollEnabled(c4075.f13584);
        c4075.f13585 = null;
    }

    @Override // p000.InterfaceC0614
    /* JADX INFO: renamed from: ۦؑ */
    public final boolean mo1377(MenuC4903 menuC4903, MenuItem menuItem) {
        C5002 c5002 = this.f12599;
        if (c5002 != null) {
            return ((C1489) c5002.f16551).m3132(this, menuItem);
        }
        return false;
    }

    @Override // p000.AbstractC3305
    /* JADX INFO: renamed from: ۦؚ */
    public final void mo6071(int i) {
        mo6072(this.f12603.f13578.getResources().getString(i));
    }

    @Override // p000.AbstractC3305
    /* JADX INFO: renamed from: ۦٌ */
    public final void mo6072(CharSequence charSequence) {
        this.f12603.f13571.setSubtitle(charSequence);
    }

    @Override // p000.AbstractC3305
    /* JADX INFO: renamed from: ۦِ */
    public final boolean mo6073() {
        return this.f12603.f13571.f54;
    }

    @Override // p000.AbstractC3305
    /* JADX INFO: renamed from: ۦٛ */
    public final void mo6074() {
        if (this.f12603.f13585 != this) {
            return;
        }
        MenuC4903 menuC4903 = this.f12601;
        menuC4903.m8302();
        try {
            this.f12599.m8408(this, menuC4903);
        } finally {
            menuC4903.m8310();
        }
    }

    @Override // p000.AbstractC3305
    /* JADX INFO: renamed from: ۦۗ */
    public final void mo6075(View view) {
        this.f12603.f13571.setCustomView(view);
        this.f12602 = new WeakReference(view);
    }

    @Override // p000.InterfaceC0614
    /* JADX INFO: renamed from: ۦۙ */
    public final void mo1378(MenuC4903 menuC4903) {
        if (this.f12599 == null) {
            return;
        }
        mo6074();
        C4718 c4718 = this.f12603.f13571.f46;
        if (c4718 != null) {
            c4718.m8053();
        }
    }

    @Override // p000.AbstractC3305
    /* JADX INFO: renamed from: ۦۚ */
    public final void mo6076(int i) {
        mo6078(this.f12603.f13578.getResources().getString(i));
    }

    @Override // p000.AbstractC3305
    /* JADX INFO: renamed from: ۦ۟ */
    public final void mo6077(boolean z) {
        this.f11066 = z;
        this.f12603.f13571.setTitleOptional(z);
    }

    @Override // p000.AbstractC3305
    /* JADX INFO: renamed from: ۦۨ */
    public final void mo6078(CharSequence charSequence) {
        this.f12603.f13571.setTitle(charSequence);
    }
}
