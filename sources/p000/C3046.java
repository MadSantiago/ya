package p000;

/* JADX INFO: renamed from: ۦؑؖؓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3046 extends C1803 {

    /* JADX INFO: renamed from: ۥٓ */
    public static final C3046 f10240 = new C3046(1, 0, 1);

    @Override // p000.C1803
    public final boolean equals(Object obj) {
        if (!(obj instanceof C3046)) {
            return false;
        }
        if (isEmpty() && ((C3046) obj).isEmpty()) {
            return true;
        }
        C3046 c3046 = (C3046) obj;
        return this.f6006 == c3046.f6006 && this.f6005 == c3046.f6005;
    }

    @Override // p000.C1803
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f6006 * 31) + this.f6005;
    }

    @Override // p000.C1803
    public final boolean isEmpty() {
        return this.f6006 > this.f6005;
    }

    @Override // p000.C1803
    public final String toString() {
        return this.f6006 + ".." + this.f6005;
    }
}
