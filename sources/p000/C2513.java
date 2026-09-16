package p000;

/* JADX INFO: renamed from: ۥٖ۠ؕۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2513 implements Comparable {

    /* JADX INFO: renamed from: ۦۨ */
    public final byte f8338;

    public /* synthetic */ C2513(byte b) {
        this.f8338 = b;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return AbstractC3831.m6879(this.f8338 & 255, ((C2513) obj).f8338 & 255);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2513) {
            return this.f8338 == ((C2513) obj).f8338;
        }
        return false;
    }

    public final int hashCode() {
        return Byte.hashCode(this.f8338);
    }

    public final String toString() {
        return String.valueOf(this.f8338 & 255);
    }
}
