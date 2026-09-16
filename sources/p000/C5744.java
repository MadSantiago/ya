package p000;

/* JADX INFO: renamed from: ۦۦٌٖؒ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5744 extends AbstractC3008 {

    /* JADX INFO: renamed from: ۥؗ */
    public final float f18940;

    /* JADX INFO: renamed from: ۦؑ */
    public final float f18941;

    public C5744(float f, float f2) {
        super(3);
        this.f18940 = f;
        this.f18941 = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5744)) {
            return false;
        }
        C5744 c5744 = (C5744) obj;
        return Float.compare(this.f18940, c5744.f18940) == 0 && Float.compare(this.f18941, c5744.f18941) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f18941) + (Float.hashCode(this.f18940) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MoveTo(x=");
        sb.append(this.f18940);
        sb.append(", y=");
        return AbstractC3761.m6639(sb, this.f18941, ')');
    }
}
