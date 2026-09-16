package p000;

/* JADX INFO: renamed from: ۥٜٕۧؔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2866 implements Comparable {

    /* JADX INFO: renamed from: ۦۨ */
    public final short f9577;

    public /* synthetic */ C2866(short s) {
        this.f9577 = s;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return AbstractC3831.m6879(this.f9577 & 65535, ((C2866) obj).f9577 & 65535);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2866) {
            return this.f9577 == ((C2866) obj).f9577;
        }
        return false;
    }

    public final int hashCode() {
        return Short.hashCode(this.f9577);
    }

    public final String toString() {
        return String.valueOf(this.f9577 & 65535);
    }
}
