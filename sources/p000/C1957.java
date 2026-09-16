package p000;

import android.os.Build;

/* JADX INFO: renamed from: ۥٞؕٛ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1957 implements InterfaceC5619 {
    public final boolean equals(Object obj) {
        return obj instanceof C1957;
    }

    public final int hashCode() {
        return C1957.class.hashCode();
    }

    @Override // p000.InterfaceC5619
    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC0633 mo3837(C2089 c2089, C1765 c1765) {
        InterfaceC4473 interfaceC4473Mo2610 = c2089.f6883.mo2610();
        if (!interfaceC4473Mo2610.mo2694(0L, AbstractC3631.f12122) && !interfaceC4473Mo2610.mo2694(0L, AbstractC3631.f12124) && (!interfaceC4473Mo2610.mo2694(0L, AbstractC3631.f12119) || !interfaceC4473Mo2610.mo2694(8L, AbstractC3631.f12125) || !interfaceC4473Mo2610.mo2694(12L, AbstractC3631.f12120) || !interfaceC4473Mo2610.mo2697(17L) || ((byte) (interfaceC4473Mo2610.mo2685().m2670(16L) & 2)) <= 0)) {
            if (Build.VERSION.SDK_INT < 30 || !interfaceC4473Mo2610.mo2694(4L, AbstractC3631.f12121)) {
                return null;
            }
            if (!interfaceC4473Mo2610.mo2694(8L, AbstractC3631.f12127) && !interfaceC4473Mo2610.mo2694(8L, AbstractC3631.f12123) && !interfaceC4473Mo2610.mo2694(8L, AbstractC3631.f12126)) {
                return null;
            }
        }
        return new C0983(c2089.f6883, c1765);
    }
}
