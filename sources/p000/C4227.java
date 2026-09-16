package p000;

/* JADX INFO: renamed from: ۦٕؓٙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4227 extends AbstractC3008 {

    /* JADX INFO: renamed from: ۥؗ */
    public final float f14021;

    public C4227(float f) {
        super(3);
        this.f14021 = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4227) && Float.compare(this.f14021, ((C4227) obj).f14021) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f14021);
    }

    public final String toString() {
        return AbstractC3761.m6639(new StringBuilder("RelativeVerticalTo(dy="), this.f14021, ')');
    }
}
