package p000;

/* JADX INFO: renamed from: ۥٌُٓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0921 implements InterfaceC4734 {

    /* JADX INFO: renamed from: ۥۗ */
    public final C1101 f3302;

    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC4734 f3303;

    public C0921(InterfaceC4734 interfaceC4734) {
        this.f3303 = interfaceC4734;
        this.f3302 = new C1101(interfaceC4734.mo193());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C0921.class == obj.getClass() && AbstractC3831.m6874(this.f3303, ((C0921) obj).f3303);
    }

    public final int hashCode() {
        return this.f3303.hashCode();
    }

    @Override // p000.InterfaceC4734
    /* JADX INFO: renamed from: ۥؗ */
    public final InterfaceC0103 mo193() {
        return this.f3302;
    }

    @Override // p000.InterfaceC4734
    /* JADX INFO: renamed from: ۥۗ */
    public final Object mo196(InterfaceC2125 interfaceC2125) {
        if (interfaceC2125.mo4105()) {
            return interfaceC2125.mo4110(this.f3303);
        }
        return null;
    }

    @Override // p000.InterfaceC4734
    /* JADX INFO: renamed from: ۦؑ */
    public final void mo197(C3782 c3782, Object obj) {
        if (obj != null) {
            c3782.m6701(this.f3303, obj);
        } else {
            c3782.m6693();
        }
    }
}
