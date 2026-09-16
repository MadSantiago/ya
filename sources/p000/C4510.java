package p000;

/* JADX INFO: renamed from: ۦَٙؗ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4510 extends AbstractC3008 {

    /* JADX INFO: renamed from: ۥؗ */
    public final float f14906;

    /* JADX INFO: renamed from: ۦؑ */
    public final float f14907;

    public C4510(float f, float f2) {
        super(3);
        this.f14906 = f;
        this.f14907 = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4510)) {
            return false;
        }
        C4510 c4510 = (C4510) obj;
        return Float.compare(this.f14906, c4510.f14906) == 0 && Float.compare(this.f14907, c4510.f14907) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f14907) + (Float.hashCode(this.f14906) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeMoveTo(dx=");
        sb.append(this.f14906);
        sb.append(", dy=");
        return AbstractC3761.m6639(sb, this.f14907, ')');
    }
}
