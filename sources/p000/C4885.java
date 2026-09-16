package p000;

/* JADX INFO: renamed from: ۦٟۖؑؓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4885 implements InterfaceC3737 {

    /* JADX INFO: renamed from: ۥۗ */
    public final int f16068;

    public C4885(int i) {
        this.f16068 = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return C4885.class.equals(obj != null ? obj.getClass() : null) && this.f16068 == ((C4885) obj).f16068;
    }

    public final int hashCode() {
        return this.f16068;
    }

    public final String toString() {
        return AbstractC3761.m6638(new StringBuilder("AndroidPointerIcon(type="), this.f16068, ')');
    }
}
