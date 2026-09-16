package p000;

/* JADX INFO: renamed from: ۥَؖؕۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0537 {

    /* JADX INFO: renamed from: ۥۣ */
    public final long f1903;

    public final boolean equals(Object obj) {
        if (obj instanceof C0537) {
            return this.f1903 == ((C0537) obj).f1903;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f1903);
    }

    public final String toString() {
        return "IndirectPointerEventData(packedValue=" + this.f1903 + ')';
    }
}
