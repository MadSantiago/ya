package p000;

/* JADX INFO: renamed from: ۥٌٕ۠ؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2486 implements InterfaceC3633 {

    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC4745 f8278;

    public C2486(InterfaceC4745 interfaceC4745) {
        this.f8278 = interfaceC4745;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2486) && this.f8278.equals(((C2486) obj).f8278);
    }

    public final int hashCode() {
        return this.f8278.hashCode();
    }

    public final String toString() {
        return "ComputedValueHolder(compute=" + this.f8278 + ')';
    }

    @Override // p000.InterfaceC3633
    /* JADX INFO: renamed from: ۥۣ */
    public final Object mo3251(C2103 c2103) {
        return this.f8278.mo211(c2103);
    }
}
