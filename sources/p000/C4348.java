package p000;

/* JADX INFO: renamed from: ۦِٗؒۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4348 implements InterfaceC3633 {

    /* JADX INFO: renamed from: ۥۣ */
    public final Object f14339;

    public C4348(Object obj) {
        this.f14339 = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4348) && AbstractC3831.m6874(this.f14339, ((C4348) obj).f14339);
    }

    public final int hashCode() {
        Object obj = this.f14339;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "StaticValueHolder(value=" + this.f14339 + ')';
    }

    @Override // p000.InterfaceC3633
    /* JADX INFO: renamed from: ۥۣ */
    public final Object mo3251(C2103 c2103) {
        return this.f14339;
    }
}
