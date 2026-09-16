package p000;

import android.view.ActionMode;
import android.view.View;

/* JADX INFO: renamed from: ۦٌؖۛۦ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3738 implements InterfaceC0884 {

    /* JADX INFO: renamed from: ۥؗ */
    public final InterfaceC4448 f12444;

    /* JADX INFO: renamed from: ۥۗ */
    public final InterfaceC4745 f12447;

    /* JADX INFO: renamed from: ۥۜ */
    public ActionMode f12448;

    /* JADX INFO: renamed from: ۥۣ */
    public final View f12449;

    /* JADX INFO: renamed from: ۦِ */
    public Runnable f12451;

    /* JADX INFO: renamed from: ۦٛ */
    public RunnableC3599 f12452;

    /* JADX INFO: renamed from: ۦؑ */
    public final C3375 f12450 = new C3375();

    /* JADX INFO: renamed from: ۥُ */
    public final C5389 f12445 = new C5389(new C1484(this, 0));

    /* JADX INFO: renamed from: ۥّ */
    public final C1484 f12446 = new C1484(this, 1);

    /* JADX INFO: renamed from: ۦۙ */
    public final C1484 f12453 = new C1484(this, 2);

    public C3738(View view, InterfaceC4745 interfaceC4745, InterfaceC4448 interfaceC4448) {
        this.f12449 = view;
        this.f12447 = interfaceC4745;
        this.f12444 = interfaceC4448;
    }

    @Override // p000.InterfaceC0884
    /* JADX INFO: renamed from: ۥۣ */
    public final Object mo1878(InterfaceC3320 interfaceC3320, AbstractC2426 abstractC2426) {
        InterfaceC0443 interfaceC0443 = null;
        C4117 c4117 = new C4117(this, interfaceC3320, interfaceC0443, 1);
        C3375 c3375 = this.f12450;
        c3375.getClass();
        Object objM7173 = AbstractC4009.m7173(new C4522(EnumC4386.f14455, c3375, c4117, interfaceC0443, 3), abstractC2426);
        return objM7173 == EnumC2282.f7590 ? objM7173 : C2358.f7817;
    }
}
