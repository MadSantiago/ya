package p000;

/* JADX INFO: renamed from: ۥۦٟؒۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2787 implements InterfaceC3633 {

    /* JADX INFO: renamed from: ۥۣ */
    public final C4852 f9291;

    public C2787(C4852 c4852) {
        this.f9291 = c4852;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2787) && this.f9291 == ((C2787) obj).f9291;
    }

    public final int hashCode() {
        return this.f9291.hashCode();
    }

    public final String toString() {
        return "DynamicValueHolder(state=" + this.f9291 + ')';
    }

    @Override // p000.InterfaceC3633
    /* JADX INFO: renamed from: ۥۣ */
    public final Object mo3251(C2103 c2103) {
        return this.f9291.getValue();
    }
}
