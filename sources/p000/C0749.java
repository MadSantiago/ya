package p000;

/* JADX INFO: renamed from: ۥؙؗؔۥ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0749 extends AbstractC3008 {

    /* JADX INFO: renamed from: ۥؗ */
    public final float f2726;

    public C0749(float f) {
        super(3);
        this.f2726 = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0749) && Float.compare(this.f2726, ((C0749) obj).f2726) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f2726);
    }

    public final String toString() {
        return AbstractC3761.m6639(new StringBuilder("RelativeHorizontalTo(dx="), this.f2726, ')');
    }
}
