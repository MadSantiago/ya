package p000;

/* JADX INFO: renamed from: ۥؒ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0292 extends AbstractC3008 {

    /* JADX INFO: renamed from: ۥؗ */
    public final float f1073;

    /* JADX INFO: renamed from: ۥُ */
    public final float f1074;

    /* JADX INFO: renamed from: ۥّ */
    public final float f1075;

    /* JADX INFO: renamed from: ۦؑ */
    public final float f1076;

    public C0292(float f, float f2, float f3, float f4) {
        super(2);
        this.f1073 = f;
        this.f1076 = f2;
        this.f1074 = f3;
        this.f1075 = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0292)) {
            return false;
        }
        C0292 c0292 = (C0292) obj;
        return Float.compare(this.f1073, c0292.f1073) == 0 && Float.compare(this.f1076, c0292.f1076) == 0 && Float.compare(this.f1074, c0292.f1074) == 0 && Float.compare(this.f1075, c0292.f1075) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f1075) + AbstractC3761.m6635(this.f1074, AbstractC3761.m6635(this.f1076, Float.hashCode(this.f1073) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReflectiveCurveTo(x1=");
        sb.append(this.f1073);
        sb.append(", y1=");
        sb.append(this.f1076);
        sb.append(", x2=");
        sb.append(this.f1074);
        sb.append(", y2=");
        return AbstractC3761.m6639(sb, this.f1075, ')');
    }
}
