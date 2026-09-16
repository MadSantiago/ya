package p000;

import java.util.List;

/* JADX INFO: renamed from: ۦٍؘؗۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3502 extends AbstractC2370 {

    /* JADX INFO: renamed from: ۥؗ */
    public final /* synthetic */ InterfaceC5731 f11609;

    /* JADX INFO: renamed from: ۥۗ */
    public final /* synthetic */ C0851 f11610;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3502(C0851 c0851, InterfaceC5731 interfaceC5731, String str) {
        super(str);
        this.f11610 = c0851;
        this.f11609 = interfaceC5731;
    }

    @Override // p000.InterfaceC3228
    /* JADX INFO: renamed from: ۦۙ */
    public final InterfaceC5370 mo771(InterfaceC2427 interfaceC2427, List list, long j) {
        C0851 c0851 = this.f11610;
        C4509 c4509 = c0851.f3153;
        c4509.f14905 = interfaceC2427.getLayoutDirection();
        c4509.f14904 = interfaceC2427.mo746();
        c4509.f14902 = interfaceC2427.mo754();
        boolean zMo323 = interfaceC2427.mo323();
        InterfaceC5731 interfaceC5731 = this.f11609;
        if (zMo323 || c0851.f3155.f2271 == null) {
            c0851.f3145 = 0;
            InterfaceC5370 interfaceC5370 = (InterfaceC5370) interfaceC5731.mo219(c4509, new C3693(j));
            return new C2723(interfaceC5370, c0851, c0851.f3145, interfaceC5370, 1);
        }
        c0851.f3143 = 0;
        InterfaceC5370 interfaceC5371 = (InterfaceC5370) interfaceC5731.mo219(c0851.f3148, new C3693(j));
        return new C2723(interfaceC5371, c0851, c0851.f3143, interfaceC5371, 0);
    }
}
