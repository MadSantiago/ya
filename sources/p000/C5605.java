package p000;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: ۦۣؔۚ٘, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5605 extends AbstractC3305 implements InterfaceC0614 {

    /* JADX INFO: renamed from: ۥَ */
    public C5002 f18456;

    /* JADX INFO: renamed from: ۥْ */
    public Context f18457;

    /* JADX INFO: renamed from: ۥٓ */
    public ActionBarContextView f18458;

    /* JADX INFO: renamed from: ۥٖ */
    public WeakReference f18459;

    /* JADX INFO: renamed from: ۦٗ */
    public boolean f18460;

    /* JADX INFO: renamed from: ۦۛ */
    public MenuC4903 f18461;

    @Override // p000.AbstractC3305
    /* JADX INFO: renamed from: ۥؗ */
    public final MenuC4903 mo6065() {
        return this.f18461;
    }

    @Override // p000.AbstractC3305
    /* JADX INFO: renamed from: ۥُ */
    public final MenuInflater mo6066() {
        return new C3837(this.f18458.getContext());
    }

    @Override // p000.AbstractC3305
    /* JADX INFO: renamed from: ۥّ */
    public final CharSequence mo6067() {
        return this.f18458.getSubtitle();
    }

    @Override // p000.AbstractC3305
    /* JADX INFO: renamed from: ۥۗ */
    public final View mo6068() {
        WeakReference weakReference = this.f18459;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // p000.AbstractC3305
    /* JADX INFO: renamed from: ۥۜ */
    public final CharSequence mo6069() {
        return this.f18458.getTitle();
    }

    @Override // p000.AbstractC3305
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo6070() {
        if (this.f18460) {
            return;
        }
        this.f18460 = true;
        this.f18456.m8398(this);
    }

    @Override // p000.InterfaceC0614
    /* JADX INFO: renamed from: ۦؑ */
    public final boolean mo1377(MenuC4903 menuC4903, MenuItem menuItem) {
        return ((C1489) this.f18456.f16551).m3132(this, menuItem);
    }

    @Override // p000.AbstractC3305
    /* JADX INFO: renamed from: ۦؚ */
    public final void mo6071(int i) {
        mo6072(this.f18457.getString(i));
    }

    @Override // p000.AbstractC3305
    /* JADX INFO: renamed from: ۦٌ */
    public final void mo6072(CharSequence charSequence) {
        this.f18458.setSubtitle(charSequence);
    }

    @Override // p000.AbstractC3305
    /* JADX INFO: renamed from: ۦِ */
    public final boolean mo6073() {
        return this.f18458.f54;
    }

    @Override // p000.AbstractC3305
    /* JADX INFO: renamed from: ۦٛ */
    public final void mo6074() {
        this.f18456.m8408(this, this.f18461);
    }

    @Override // p000.AbstractC3305
    /* JADX INFO: renamed from: ۦۗ */
    public final void mo6075(View view) {
        this.f18458.setCustomView(view);
        this.f18459 = view != null ? new WeakReference(view) : null;
    }

    @Override // p000.InterfaceC0614
    /* JADX INFO: renamed from: ۦۙ */
    public final void mo1378(MenuC4903 menuC4903) {
        mo6074();
        C4718 c4718 = this.f18458.f46;
        if (c4718 != null) {
            c4718.m8053();
        }
    }

    @Override // p000.AbstractC3305
    /* JADX INFO: renamed from: ۦۚ */
    public final void mo6076(int i) {
        mo6078(this.f18457.getString(i));
    }

    @Override // p000.AbstractC3305
    /* JADX INFO: renamed from: ۦ۟ */
    public final void mo6077(boolean z) {
        this.f11066 = z;
        this.f18458.setTitleOptional(z);
    }

    @Override // p000.AbstractC3305
    /* JADX INFO: renamed from: ۦۨ */
    public final void mo6078(CharSequence charSequence) {
        this.f18458.setTitle(charSequence);
    }
}
