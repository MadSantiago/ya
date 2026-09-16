package p000;

/* JADX INFO: renamed from: ۥٍۛؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2345 implements InterfaceC3498 {

    /* JADX INFO: renamed from: ۥۣ */
    public final float f7784;

    public C2345(float f) {
        this.f7784 = f;
        if (f < 0.0f || f > 100.0f) {
            AbstractC4690.m8038("The percent should be in the range of [0, 100]");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2345) && Float.compare(this.f7784, ((C2345) obj).f7784) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f7784);
    }

    public final String toString() {
        return "CornerSize(size = " + this.f7784 + "%)";
    }

    @Override // p000.InterfaceC3498
    /* JADX INFO: renamed from: ۥۣ */
    public final float mo4393(long j, InterfaceC2880 interfaceC2880) {
        return (this.f7784 / 100.0f) * C3291.m6052(j);
    }
}
