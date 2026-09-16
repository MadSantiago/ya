package p000;

import android.os.Build;

/* JADX INFO: renamed from: ۦۜؔؑۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5281 implements InterfaceC4745 {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ InterfaceC4367 f17404;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ InterfaceC2880 f17405;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f17406;

    public /* synthetic */ C5281(InterfaceC2880 interfaceC2880, InterfaceC4367 interfaceC4367, int i) {
        this.f17406 = i;
        this.f17405 = interfaceC2880;
        this.f17404 = interfaceC4367;
    }

    @Override // p000.InterfaceC4745
    /* JADX INFO: renamed from: ۦؚ */
    public final Object mo211(Object obj) {
        int i = this.f17406;
        InterfaceC4367 interfaceC4367 = this.f17404;
        InterfaceC2880 interfaceC2880 = this.f17405;
        switch (i) {
            case 0:
                C2288 c2288 = new C2288(4, (InterfaceC4448) obj);
                C5281 c5281 = new C5281(interfaceC2880, interfaceC4367, 1);
                if (AbstractC4533.m7855()) {
                    return AbstractC4533.m7855() ? new C0510(c2288, c5281, Build.VERSION.SDK_INT == 28 ? C1529.f5183 : C5120.f16971) : C4217.f13994;
                }
                throw new UnsupportedOperationException("Magnifier is only supported on API level 28 and higher.");
            default:
                C1495 c1495 = (C1495) obj;
                interfaceC4367.setValue(new C4207((((long) interfaceC2880.mo743(C1495.m3176(c1495.f5067))) & 4294967295L) | (((long) interfaceC2880.mo743(C1495.m3175(c1495.f5067))) << 32)));
                return C2358.f7817;
        }
    }
}
