package p000;

/* JADX INFO: renamed from: ۥٍٖۡؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2565 {

    /* JADX INFO: renamed from: ۥۗ */
    public final C0969 f8562;

    /* JADX INFO: renamed from: ۥۣ */
    public final C1749 f8563;

    public C2565(C1749 c1749, C0969 c0969) {
        this.f8563 = c1749;
        this.f8562 = c0969;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2565) {
            C2565 c2565 = (C2565) obj;
            if (this.f8563 == c2565.f8563 && this.f8562.equals(c2565.f8562)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f8562.hashCode() + (this.f8563.hashCode() * 31);
    }

    public final String toString() {
        return "Slide(slideOffset=" + this.f8563 + ", animationSpec=" + this.f8562 + ')';
    }
}
