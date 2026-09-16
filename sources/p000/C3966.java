package p000;

/* JADX INFO: renamed from: ۦًِؔۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3966 {

    /* JADX INFO: renamed from: ۥۗ */
    public final C0547 f13262;

    /* JADX INFO: renamed from: ۥۣ */
    public final float f13263;

    public C3966(float f, C0547 c0547) {
        this.f13263 = f;
        this.f13262 = c0547;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3966)) {
            return false;
        }
        C3966 c3966 = (C3966) obj;
        return C4497.m7826(this.f13263, c3966.f13263) && this.f13262.equals(c3966.f13262);
    }

    public final int hashCode() {
        return this.f13262.hashCode() + (Float.hashCode(this.f13263) * 31);
    }

    public final String toString() {
        return "BorderStroke(width=" + ((Object) C4497.m7825(this.f13263)) + ", brush=" + this.f13262 + ')';
    }
}
