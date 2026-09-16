package p000;

/* JADX INFO: renamed from: ۥْۡؒؔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2544 extends AbstractC3008 {

    /* JADX INFO: renamed from: ۥؗ */
    public final float f8494;

    /* JADX INFO: renamed from: ۦؑ */
    public final float f8495;

    public C2544(float f, float f2) {
        super(3);
        this.f8494 = f;
        this.f8495 = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2544)) {
            return false;
        }
        C2544 c2544 = (C2544) obj;
        return Float.compare(this.f8494, c2544.f8494) == 0 && Float.compare(this.f8495, c2544.f8495) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f8495) + (Float.hashCode(this.f8494) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeLineTo(dx=");
        sb.append(this.f8494);
        sb.append(", dy=");
        return AbstractC3761.m6639(sb, this.f8495, ')');
    }
}
