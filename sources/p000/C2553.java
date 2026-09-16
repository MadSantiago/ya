package p000;

/* JADX INFO: renamed from: ۥۡؓ۠ٔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2553 implements InterfaceC5561 {

    /* JADX INFO: renamed from: ۥۗ */
    public final float f8520;

    /* JADX INFO: renamed from: ۥۣ */
    public final C0714 f8521;

    public C2553(C0714 c0714, float f) {
        this.f8521 = c0714;
        this.f8520 = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2553) {
            C2553 c2553 = (C2553) obj;
            if (this.f8521 == c2553.f8521 && Float.compare(this.f8520, c2553.f8520) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f8520) + (this.f8521.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BrushStyle(value=");
        sb.append(this.f8521);
        sb.append(", alpha=");
        return AbstractC3761.m6639(sb, this.f8520, ')');
    }

    @Override // p000.InterfaceC5561
    /* JADX INFO: renamed from: ۥؗ */
    public final AbstractC0548 mo3547() {
        return this.f8521;
    }

    @Override // p000.InterfaceC5561
    /* JADX INFO: renamed from: ۥۗ */
    public final long mo3548() {
        int i = C1327.f4593;
        return C1327.f4591;
    }

    @Override // p000.InterfaceC5561
    /* JADX INFO: renamed from: ۥۣ */
    public final float mo3549() {
        return this.f8520;
    }
}
