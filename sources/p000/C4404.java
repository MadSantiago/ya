package p000;

import java.util.List;

/* JADX INFO: renamed from: ۦّ٘ؑٞ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4404 implements InterfaceC3228 {

    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC4866 f14502;

    public C4404(InterfaceC4866 interfaceC4866) {
        this.f14502 = interfaceC4866;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4404) && AbstractC3831.m6874(this.f14502, ((C4404) obj).f14502);
    }

    public final int hashCode() {
        return this.f14502.hashCode();
    }

    public final String toString() {
        return "MultiContentMeasurePolicyImpl(measurePolicy=" + this.f14502 + ')';
    }

    @Override // p000.InterfaceC3228
    /* JADX INFO: renamed from: ۥؗ */
    public final int mo3091(InterfaceC0151 interfaceC0151, List list, int i) {
        return this.f14502.mo4084(interfaceC0151, AbstractC2774.m5180(interfaceC0151), i);
    }

    @Override // p000.InterfaceC3228
    /* JADX INFO: renamed from: ۥۗ */
    public final int mo4446(InterfaceC0151 interfaceC0151, List list, int i) {
        return this.f14502.mo4083(interfaceC0151, AbstractC2774.m5180(interfaceC0151), i);
    }

    @Override // p000.InterfaceC3228
    /* JADX INFO: renamed from: ۥۜ */
    public final int mo4447(InterfaceC0151 interfaceC0151, List list, int i) {
        return this.f14502.mo4086(interfaceC0151, AbstractC2774.m5180(interfaceC0151), i);
    }

    @Override // p000.InterfaceC3228
    /* JADX INFO: renamed from: ۦِ */
    public final int mo4448(InterfaceC0151 interfaceC0151, List list, int i) {
        return this.f14502.mo4082(interfaceC0151, AbstractC2774.m5180(interfaceC0151), i);
    }

    @Override // p000.InterfaceC3228
    /* JADX INFO: renamed from: ۦۙ */
    public final InterfaceC5370 mo771(InterfaceC2427 interfaceC2427, List list, long j) {
        return this.f14502.mo4085(interfaceC2427, AbstractC2774.m5180(interfaceC2427), j);
    }
}
