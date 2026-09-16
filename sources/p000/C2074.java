package p000;

import ru.bluecat.yandexmapspatcher.R;

/* JADX INFO: renamed from: ۥۣۖؖ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2074 implements InterfaceC5601, InterfaceC1648 {

    /* JADX INFO: renamed from: ۥَ */
    public C0857 f6844 = AbstractC2940.f9874;

    /* JADX INFO: renamed from: ۥْ */
    public boolean f6845;

    /* JADX INFO: renamed from: ۥٓ */
    public AbstractC1434 f6846;

    /* JADX INFO: renamed from: ۦ۟ */
    public final C1946 f6847;

    /* JADX INFO: renamed from: ۦۨ */
    public final ViewTreeObserverOnGlobalLayoutListenerC0850 f6848;

    public C2074(ViewTreeObserverOnGlobalLayoutListenerC0850 viewTreeObserverOnGlobalLayoutListenerC0850, C1946 c1946) {
        this.f6848 = viewTreeObserverOnGlobalLayoutListenerC0850;
        this.f6847 = c1946;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final void m4017() {
        if (!this.f6845) {
            this.f6845 = true;
            this.f6848.getView().setTag(R.id.wrapped_composition_tag, null);
            AbstractC1434 abstractC1434 = this.f6846;
            if (abstractC1434 != null) {
                abstractC1434.mo2389(this);
            }
            this.f6846 = null;
        }
        this.f6847.m3825();
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final void m4018(InterfaceC5731 interfaceC5731) {
        this.f6848.setOnReadyForComposition(new C5544(12, this, (C0857) interfaceC5731));
    }

    @Override // p000.InterfaceC1648
    /* JADX INFO: renamed from: ۦ۟ */
    public final void mo1683(InterfaceC4507 interfaceC4507, EnumC1924 enumC1924) {
        if (enumC1924 == EnumC1924.ON_DESTROY) {
            m4017();
        } else {
            if (enumC1924 != EnumC1924.ON_CREATE || this.f6845) {
                return;
            }
            m4018(this.f6844);
        }
    }
}
