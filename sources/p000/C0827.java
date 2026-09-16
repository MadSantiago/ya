package p000;

import android.os.Handler;
import android.view.View;
import android.view.Window;

/* JADX INFO: renamed from: ۥًؓ٘۟, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0827 extends AbstractC0993 implements InterfaceC4680, InterfaceC4507, InterfaceC3983, InterfaceC5366 {

    /* JADX INFO: renamed from: ۥً */
    public final AbstractActivityC2747 f2924;

    /* JADX INFO: renamed from: ۥٕ */
    public final C2790 f2925;

    /* JADX INFO: renamed from: ۥۙ */
    public final /* synthetic */ AbstractActivityC2747 f2926;

    /* JADX INFO: renamed from: ۥۧ */
    public final AbstractActivityC2747 f2927;

    /* JADX INFO: renamed from: ۦٚ */
    public final Handler f2928;

    public C0827(AbstractActivityC2747 abstractActivityC2747) {
        this.f2926 = abstractActivityC2747;
        Handler handler = new Handler();
        this.f2927 = abstractActivityC2747;
        this.f2924 = abstractActivityC2747;
        this.f2928 = handler;
        this.f2925 = new C2790();
    }

    @Override // p000.InterfaceC4507
    /* JADX INFO: renamed from: ۥّ */
    public final AbstractC1434 mo110() {
        return this.f2926.f9088;
    }

    @Override // p000.AbstractC0993
    /* JADX INFO: renamed from: ۥٛ */
    public final View mo1305(int i) {
        return this.f2926.findViewById(i);
    }

    @Override // p000.InterfaceC3983
    /* JADX INFO: renamed from: ۥۗ */
    public final C2346 mo648() {
        return (C2346) this.f2926.f5091.f7785;
    }

    @Override // p000.AbstractC0993
    /* JADX INFO: renamed from: ۥۤ */
    public final boolean mo1306() {
        Window window = this.f2926.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // p000.InterfaceC4680
    /* JADX INFO: renamed from: ۦؑ */
    public final C3160 mo651() {
        return this.f2926.mo651();
    }

    @Override // p000.InterfaceC5366
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo1721() {
    }
}
