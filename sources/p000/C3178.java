package p000;

import android.view.View;

/* JADX INFO: renamed from: ۦؓؔۤۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3178 extends AbstractC5381 implements InterfaceC5448 {
    @Override // p000.InterfaceC5448
    /* JADX INFO: renamed from: ۥؙ */
    public final void mo5853(InterfaceC0133 interfaceC0133) {
        View viewM7159 = AbstractC4009.m7159(this);
        interfaceC0133.mo299(this.f17791.f17786 && AbstractC4009.m7159(this).hasFocusable());
        View viewFindFocus = viewM7159.findFocus();
        if (viewFindFocus != null) {
            interfaceC0133.mo296(AbstractC2840.m5405(viewFindFocus, viewM7159));
        }
    }
}
