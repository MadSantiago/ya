package p000;

/* JADX INFO: renamed from: ۥؐۡؓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0163 {

    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC4745 f619;

    public C0163(InterfaceC4745 interfaceC4745, int i) {
        this.f619 = (i & 1) != 0 ? null : interfaceC4745;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0163) {
            return this.f619 == ((C0163) obj).f619;
        }
        return false;
    }

    public final int hashCode() {
        InterfaceC4745 interfaceC4745 = this.f619;
        return (interfaceC4745 != null ? interfaceC4745.hashCode() : 0) * 28629151;
    }
}
