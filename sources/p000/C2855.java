package p000;

/* JADX INFO: renamed from: ۥۧؓؕؔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2855 extends AbstractC3008 {

    /* JADX INFO: renamed from: ۥؗ */
    public final float f9559;

    /* JADX INFO: renamed from: ۥُ */
    public final float f9560;

    /* JADX INFO: renamed from: ۥّ */
    public final float f9561;

    /* JADX INFO: renamed from: ۦؑ */
    public final float f9562;

    public C2855(float f, float f2, float f3, float f4) {
        super(1);
        this.f9559 = f;
        this.f9562 = f2;
        this.f9560 = f3;
        this.f9561 = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2855)) {
            return false;
        }
        C2855 c2855 = (C2855) obj;
        return Float.compare(this.f9559, c2855.f9559) == 0 && Float.compare(this.f9562, c2855.f9562) == 0 && Float.compare(this.f9560, c2855.f9560) == 0 && Float.compare(this.f9561, c2855.f9561) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f9561) + AbstractC3761.m6635(this.f9560, AbstractC3761.m6635(this.f9562, Float.hashCode(this.f9559) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QuadTo(x1=");
        sb.append(this.f9559);
        sb.append(", y1=");
        sb.append(this.f9562);
        sb.append(", x2=");
        sb.append(this.f9560);
        sb.append(", y2=");
        return AbstractC3761.m6639(sb, this.f9561, ')');
    }
}
