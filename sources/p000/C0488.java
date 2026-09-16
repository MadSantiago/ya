package p000;

/* JADX INFO: renamed from: ۥؕؗۥٔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0488 {

    /* JADX INFO: renamed from: ۥۗ */
    public final String f1779;

    /* JADX INFO: renamed from: ۥۣ */
    public final Object f1780;

    public C0488(Object obj, String str) {
        this.f1780 = obj;
        this.f1779 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0488)) {
            return false;
        }
        C0488 c0488 = (C0488) obj;
        return this.f1780 == c0488.f1780 && this.f1779.equals(c0488.f1779);
    }

    public final int hashCode() {
        return this.f1779.hashCode() + (System.identityHashCode(this.f1780) * 31);
    }
}
