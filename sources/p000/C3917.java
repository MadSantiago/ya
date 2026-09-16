package p000;

/* JADX INFO: renamed from: ۦُؚؖ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3917 {

    /* JADX INFO: renamed from: ۥۣ */
    public final float f13058;

    public final boolean equals(Object obj) {
        if (obj instanceof C3917) {
            return Float.compare(this.f13058, ((C3917) obj).f13058) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f13058);
    }

    public final String toString() {
        return "BaselineShift(multiplier=" + this.f13058 + ')';
    }
}
