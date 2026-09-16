package p000;

/* JADX INFO: renamed from: ۦَؕۨٚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3854 extends AbstractC3008 {

    /* JADX INFO: renamed from: ۥؗ */
    public final float f12876;

    /* JADX INFO: renamed from: ۦؑ */
    public final float f12877;

    public C3854(float f, float f2) {
        super(1);
        this.f12876 = f;
        this.f12877 = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3854)) {
            return false;
        }
        C3854 c3854 = (C3854) obj;
        return Float.compare(this.f12876, c3854.f12876) == 0 && Float.compare(this.f12877, c3854.f12877) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f12877) + (Float.hashCode(this.f12876) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeReflectiveQuadTo(dx=");
        sb.append(this.f12876);
        sb.append(", dy=");
        return AbstractC3761.m6639(sb, this.f12877, ')');
    }
}
