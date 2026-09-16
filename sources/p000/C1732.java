package p000;

/* JADX INFO: renamed from: ۥٚؕۥۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1732 extends AbstractC3008 {

    /* JADX INFO: renamed from: ۥؗ */
    public final float f5761;

    public C1732(float f) {
        super(3);
        this.f5761 = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1732) && Float.compare(this.f5761, ((C1732) obj).f5761) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f5761);
    }

    public final String toString() {
        return AbstractC3761.m6639(new StringBuilder("VerticalTo(y="), this.f5761, ')');
    }
}
