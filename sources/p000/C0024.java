package p000;

import androidx.appcompat.widget.ActionBarContextView;

/* JADX INFO: renamed from: ۥٖ */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0024 implements InterfaceC1953 {

    /* JADX INFO: renamed from: ۥؗ */
    public final /* synthetic */ ActionBarContextView f4925;

    /* JADX INFO: renamed from: ۥۗ */
    public int f4926;

    /* JADX INFO: renamed from: ۥۣ */
    public boolean f4927 = false;

    public C0024(ActionBarContextView actionBarContextView) {
        this.f4925 = actionBarContextView;
    }

    @Override // p000.InterfaceC1953
    /* JADX INFO: renamed from: ۥؗ */
    public final void mo3065() {
        super/*android.view.View*/.setVisibility(0);
        this.f4927 = false;
    }

    @Override // p000.InterfaceC1953
    /* JADX INFO: renamed from: ۥۗ */
    public final void mo3066() {
        this.f4927 = true;
    }

    @Override // p000.InterfaceC1953
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo526() {
        if (this.f4927) {
            return;
        }
        ActionBarContextView actionBarContextView = this.f4925;
        actionBarContextView.f48 = null;
        super/*android.view.View*/.setVisibility(this.f4926);
    }
}
