package p000;

/* JADX INFO: renamed from: ۦٙؕۡۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4495 extends AbstractC3750 {

    /* JADX INFO: renamed from: ۥۣ */
    public final int f14869;

    public C4495(int i) {
        this.f14869 = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4495) && this.f14869 == ((C4495) obj).f14869;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f14869);
    }

    public final String toString() {
        return AbstractC3761.m6638(new StringBuilder("ConstraintsNotMet(reason="), this.f14869, ')');
    }
}
