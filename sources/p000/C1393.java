package p000;

/* JADX INFO: renamed from: ۥٕؓؑٓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1393 implements InterfaceC1291 {

    /* JADX INFO: renamed from: ۥؗ */
    public final float f4769;

    /* JADX INFO: renamed from: ۥۗ */
    public final float f4770;

    /* JADX INFO: renamed from: ۥۣ */
    public final float f4771;

    /* JADX INFO: renamed from: ۦؑ */
    public final float f4772;

    public C1393(float f, float f2, float f3, float f4) {
        this.f4771 = f;
        this.f4770 = f2;
        this.f4769 = f3;
        this.f4772 = f4;
        if (!((f >= 0.0f) & (f2 >= 0.0f) & (f3 >= 0.0f)) || !(f4 >= 0.0f)) {
            AbstractC5233.m8862("Padding must be non-negative");
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1393)) {
            return false;
        }
        C1393 c1393 = (C1393) obj;
        return C4497.m7826(this.f4771, c1393.f4771) && C4497.m7826(this.f4770, c1393.f4770) && C4497.m7826(this.f4769, c1393.f4769) && C4497.m7826(this.f4772, c1393.f4772);
    }

    public final int hashCode() {
        return Float.hashCode(this.f4772) + AbstractC3761.m6635(this.f4769, AbstractC3761.m6635(this.f4770, Float.hashCode(this.f4771) * 31, 31), 31);
    }

    public final String toString() {
        return "PaddingValues(start=" + ((Object) C4497.m7825(this.f4771)) + ", top=" + ((Object) C4497.m7825(this.f4770)) + ", end=" + ((Object) C4497.m7825(this.f4769)) + ", bottom=" + ((Object) C4497.m7825(this.f4772)) + ')';
    }

    @Override // p000.InterfaceC1291
    /* JADX INFO: renamed from: ۥؗ */
    public final float mo1100() {
        return this.f4772;
    }

    @Override // p000.InterfaceC1291
    /* JADX INFO: renamed from: ۥۗ */
    public final float mo1101(EnumC2459 enumC2459) {
        return enumC2459 == EnumC2459.f8215 ? this.f4769 : this.f4771;
    }

    @Override // p000.InterfaceC1291
    /* JADX INFO: renamed from: ۥۣ */
    public final float mo1102(EnumC2459 enumC2459) {
        return enumC2459 == EnumC2459.f8215 ? this.f4771 : this.f4769;
    }

    @Override // p000.InterfaceC1291
    /* JADX INFO: renamed from: ۦؑ */
    public final float mo1103() {
        return this.f4770;
    }
}
