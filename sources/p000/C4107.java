package p000;

/* JADX INFO: renamed from: ۦؚٓؒ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4107 implements InterfaceC3498 {

    /* JADX INFO: renamed from: ۥۣ */
    public final float f13696;

    public C4107(float f) {
        this.f13696 = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4107) && C4497.m7826(this.f13696, ((C4107) obj).f13696);
    }

    public final int hashCode() {
        return Float.hashCode(this.f13696);
    }

    public final String toString() {
        return "CornerSize(size = " + this.f13696 + ".dp)";
    }

    @Override // p000.InterfaceC3498
    /* JADX INFO: renamed from: ۥۣ */
    public final float mo4393(long j, InterfaceC2880 interfaceC2880) {
        return interfaceC2880.mo741(this.f13696);
    }
}
