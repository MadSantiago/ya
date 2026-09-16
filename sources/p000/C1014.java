package p000;

import android.view.KeyEvent;

/* JADX INFO: renamed from: ۥَْؖؓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1014 extends AbstractC5381 implements InterfaceC0174 {

    /* JADX INFO: renamed from: ۥً */
    public InterfaceC4745 f3601;

    /* JADX INFO: renamed from: ۦٚ */
    public InterfaceC4745 f3602;

    @Override // p000.InterfaceC0174
    /* JADX INFO: renamed from: ۥۡ */
    public final boolean mo363(KeyEvent keyEvent) {
        InterfaceC4745 interfaceC4745 = this.f3601;
        if (interfaceC4745 != null) {
            return ((Boolean) interfaceC4745.mo211(new C2581(keyEvent))).booleanValue();
        }
        return false;
    }

    @Override // p000.InterfaceC0174
    /* JADX INFO: renamed from: ۦؚ */
    public final boolean mo364(KeyEvent keyEvent) {
        InterfaceC4745 interfaceC4745 = this.f3602;
        if (interfaceC4745 != null) {
            return ((Boolean) interfaceC4745.mo211(new C2581(keyEvent))).booleanValue();
        }
        return false;
    }
}
