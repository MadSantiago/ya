package p000;

/* JADX INFO: renamed from: ۥُٓؔۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1277 {

    /* JADX INFO: renamed from: ۥۣ */
    public int f4355;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1277) && this.f4355 == ((C1277) obj).f4355;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f4355);
    }

    public final String toString() {
        return AbstractC3761.m6638(new StringBuilder("DeltaCounter(count="), this.f4355, ')');
    }
}
