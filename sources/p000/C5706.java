package p000;

/* JADX INFO: renamed from: ۦۥؔؕۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5706 implements Comparable {

    /* JADX INFO: renamed from: ۦۨ */
    public final int f18790;

    public /* synthetic */ C5706(int i) {
        this.f18790 = i;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return AbstractC3831.m6879(this.f18790 ^ Integer.MIN_VALUE, ((C5706) obj).f18790 ^ Integer.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5706) {
            return this.f18790 == ((C5706) obj).f18790;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f18790);
    }

    public final String toString() {
        return String.valueOf(((long) this.f18790) & 4294967295L);
    }
}
