package p000;

/* JADX INFO: renamed from: ۥٍۣٝؗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1911 {

    /* JADX INFO: renamed from: ۥۣ */
    public final float f6303;

    public C1911(float f) {
        this.f6303 = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1911) && Float.compare(this.f6303, ((C1911) obj).f6303) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f6303);
    }

    public final String toString() {
        return AbstractC3761.m6639(new StringBuilder("Horizontal(bias="), this.f6303, ')');
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final int m3748(int i, int i2, EnumC2459 enumC2459) {
        float f = (i2 - i) / 2.0f;
        EnumC2459 enumC24510 = EnumC2459.f8215;
        float f2 = this.f6303;
        if (enumC2459 != enumC24510) {
            f2 *= -1.0f;
        }
        return Math.round((1.0f + f2) * f);
    }
}
