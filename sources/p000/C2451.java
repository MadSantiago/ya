package p000;

/* JADX INFO: renamed from: ۥ۟ؔۛٞ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2451 {

    /* JADX INFO: renamed from: ۥۗ */
    public final Object f8164;

    /* JADX INFO: renamed from: ۥۣ */
    public final Object f8165;

    public C2451(Object obj, Object obj2) {
        this.f8165 = obj;
        this.f8164 = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2451)) {
            return false;
        }
        C2451 c2451 = (C2451) obj;
        return AbstractC3831.m6874(this.f8165, c2451.f8165) && AbstractC3831.m6874(this.f8164, c2451.f8164);
    }

    public final int hashCode() {
        Object obj = this.f8165;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.f8164;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final boolean m4575(Object obj, Object obj2) {
        return obj.equals(this.f8165) && obj2.equals(this.f8164);
    }
}
