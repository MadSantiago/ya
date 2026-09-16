package p000;

import java.util.Iterator;

/* JADX INFO: renamed from: ۦۣۣۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5630 implements InterfaceC0806 {

    /* JADX INFO: renamed from: ۥؗ */
    public final InterfaceC4745 f18558;

    /* JADX INFO: renamed from: ۥۗ */
    public final InterfaceC0806 f18559;

    /* JADX INFO: renamed from: ۥۣ */
    public final /* synthetic */ int f18560;

    public /* synthetic */ C5630(InterfaceC0806 interfaceC0806, InterfaceC4745 interfaceC4745, int i) {
        this.f18560 = i;
        this.f18559 = interfaceC0806;
        this.f18558 = interfaceC4745;
    }

    @Override // p000.InterfaceC0806
    public final Iterator iterator() {
        switch (this.f18560) {
            case 0:
                return new C2448(this);
            default:
                return new C0782(this);
        }
    }
}
