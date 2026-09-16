package p000;

/* JADX INFO: renamed from: ۦؚۨؐ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3634 extends AbstractC0186 {

    /* JADX INFO: renamed from: ۥْ */
    public final AbstractC0186 f12134;

    /* JADX INFO: renamed from: ۥٓ */
    public final int f12135;

    public C3634(AbstractC0186 abstractC0186, int i) {
        this.f12134 = abstractC0186;
        this.f12135 = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3634)) {
            return false;
        }
        C3634 c3634 = (C3634) obj;
        return c3634.f12134.equals(this.f12134) && c3634.f12135 == this.f12135;
    }

    public final int hashCode() {
        return this.f12134.hashCode() + (this.f12135 * 31);
    }
}
