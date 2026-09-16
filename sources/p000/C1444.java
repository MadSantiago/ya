package p000;

/* JADX INFO: renamed from: ۥٖؒٓ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1444 {

    /* JADX INFO: renamed from: ۥۣ */
    public final int f4947;

    public final boolean equals(Object obj) {
        if (obj instanceof C1444) {
            return this.f4947 == ((C1444) obj).f4947;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f4947);
    }

    public final String toString() {
        return "PointerKeyboardModifiers(packedValue=" + this.f4947 + ')';
    }
}
