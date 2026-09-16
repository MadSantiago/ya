package p000;

/* JADX INFO: renamed from: ۥَؙٕؗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0752 {

    /* JADX INFO: renamed from: ۥۗ */
    public float f2734;

    /* JADX INFO: renamed from: ۥۣ */
    public long f2735;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0752)) {
            return false;
        }
        C0752 c0752 = (C0752) obj;
        return this.f2735 == c0752.f2735 && Float.compare(this.f2734, c0752.f2734) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f2734) + (Long.hashCode(this.f2735) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataPointAtTime(time=");
        sb.append(this.f2735);
        sb.append(", dataPoint=");
        return AbstractC3761.m6639(sb, this.f2734, ')');
    }
}
