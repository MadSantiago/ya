package p000;

/* JADX INFO: renamed from: ۥُِؗٙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1122 {

    /* JADX INFO: renamed from: ۥۣ */
    public final long f3945 = C1327.f4591;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1122)) {
            return false;
        }
        long j = ((C1122) obj).f3945;
        int i = C1327.f4593;
        return C4462.m7744(this.f3945, j);
    }

    public final int hashCode() {
        int i = C1327.f4593;
        return Long.hashCode(this.f3945) * 31;
    }

    public final String toString() {
        return "RippleConfiguration(color=" + ((Object) C1327.m2827(this.f3945)) + ", rippleAlpha=null)";
    }
}
