package p000;

/* JADX INFO: renamed from: ۥۣۚؑؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2254 extends AbstractC3008 {

    /* JADX INFO: renamed from: ۥؗ */
    public final float f7470;

    public C2254(float f) {
        super(3);
        this.f7470 = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2254) && Float.compare(this.f7470, ((C2254) obj).f7470) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f7470);
    }

    public final String toString() {
        return AbstractC3761.m6639(new StringBuilder("HorizontalTo(x="), this.f7470, ')');
    }
}
