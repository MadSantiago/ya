package p000;

/* JADX INFO: renamed from: ۦٕؗۜؔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4268 implements InterfaceC5561 {

    /* JADX INFO: renamed from: ۥۣ */
    public final long f14130;

    public C4268(long j) {
        this.f14130 = j;
        if (j != 16) {
            return;
        }
        AbstractC3767.m6644("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4268)) {
            return false;
        }
        long j = ((C4268) obj).f14130;
        int i = C1327.f4593;
        return C4462.m7744(this.f14130, j);
    }

    public final int hashCode() {
        int i = C1327.f4593;
        return Long.hashCode(this.f14130);
    }

    public final String toString() {
        return "ColorStyle(value=" + ((Object) C1327.m2827(this.f14130)) + ')';
    }

    @Override // p000.InterfaceC5561
    /* JADX INFO: renamed from: ۥؗ */
    public final AbstractC0548 mo3547() {
        return null;
    }

    @Override // p000.InterfaceC5561
    /* JADX INFO: renamed from: ۥۗ */
    public final long mo3548() {
        return this.f14130;
    }

    @Override // p000.InterfaceC5561
    /* JADX INFO: renamed from: ۥۣ */
    public final float mo3549() {
        return C1327.m2823(this.f14130);
    }
}
