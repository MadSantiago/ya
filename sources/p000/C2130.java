package p000;

/* JADX INFO: renamed from: ۥٕۗؗۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2130 extends AbstractC3008 {

    /* JADX INFO: renamed from: ۥؗ */
    public final float f6992;

    /* JADX INFO: renamed from: ۦؑ */
    public final float f6993;

    public C2130(float f, float f2) {
        super(1);
        this.f6992 = f;
        this.f6993 = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2130)) {
            return false;
        }
        C2130 c2130 = (C2130) obj;
        return Float.compare(this.f6992, c2130.f6992) == 0 && Float.compare(this.f6993, c2130.f6993) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f6993) + (Float.hashCode(this.f6992) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReflectiveQuadTo(x=");
        sb.append(this.f6992);
        sb.append(", y=");
        return AbstractC3761.m6639(sb, this.f6993, ')');
    }
}
