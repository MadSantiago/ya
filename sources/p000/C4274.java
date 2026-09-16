package p000;

/* JADX INFO: renamed from: ۦٕٕٙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4274 {

    /* JADX INFO: renamed from: ۥۣ */
    public final float f14155;

    public C4274(float f) {
        this.f14155 = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4274) && Float.compare(this.f14155, ((C4274) obj).f14155) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f14155);
    }

    public final String toString() {
        return AbstractC3761.m6639(new StringBuilder("Vertical(bias="), this.f14155, ')');
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final int m7577(int i, int i2) {
        return Math.round((1.0f + this.f14155) * ((i2 - i) / 2.0f));
    }
}
