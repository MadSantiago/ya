package p000;

/* JADX INFO: renamed from: ۦؕؖۗؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3292 {

    /* JADX INFO: renamed from: ۥؗ */
    public final int f11026;

    /* JADX INFO: renamed from: ۥۗ */
    public final long f11027;

    /* JADX INFO: renamed from: ۥۣ */
    public final String f11028;

    public AbstractC3292(long j, String str, int i) {
        this.f11028 = str;
        this.f11027 = j;
        this.f11026 = i;
        if (str.length() == 0) {
            C1078.m2272("The name of a color space cannot be null and must contain at least 1 character");
            throw null;
        }
        if (i < -1 || i > 63) {
            C1078.m2272("The id must be between -1 and 63");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractC3292 abstractC3292 = (AbstractC3292) obj;
        if (this.f11026 == abstractC3292.f11026 && this.f11028.equals(abstractC3292.f11028)) {
            return AbstractC5568.m9384(this.f11027, abstractC3292.f11027);
        }
        return false;
    }

    public int hashCode() {
        return AbstractC3761.m6626(this.f11028.hashCode() * 31, 31, this.f11027) + this.f11026;
    }

    public final String toString() {
        return this.f11028 + " (id=" + this.f11026 + ", model=" + ((Object) AbstractC5568.m9361(this.f11027)) + ')';
    }

    /* JADX INFO: renamed from: ۥؗ */
    public boolean mo6055() {
        return false;
    }

    /* JADX INFO: renamed from: ۥُ */
    public abstract float mo6056(float f, float f2, float f3);

    /* JADX INFO: renamed from: ۥّ */
    public abstract long mo6057(float f, float f2, float f3, float f4, AbstractC3292 abstractC3292);

    /* JADX INFO: renamed from: ۥۗ */
    public abstract float mo6058(int i);

    /* JADX INFO: renamed from: ۥۣ */
    public abstract float mo6059(int i);

    /* JADX INFO: renamed from: ۦؑ */
    public abstract long mo6060(float f, float f2, float f3);
}
