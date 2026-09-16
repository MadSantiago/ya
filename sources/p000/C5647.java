package p000;

/* JADX INFO: renamed from: ۦٕۤؓۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5647 {

    /* JADX INFO: renamed from: ۥؗ */
    public static final C5647 f18598 = new C5647(1.0f, 0.0f);

    /* JADX INFO: renamed from: ۥۗ */
    public final float f18599;

    /* JADX INFO: renamed from: ۥۣ */
    public final float f18600;

    public C5647(float f, float f2) {
        this.f18600 = f;
        this.f18599 = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5647)) {
            return false;
        }
        C5647 c5647 = (C5647) obj;
        return this.f18600 == c5647.f18600 && this.f18599 == c5647.f18599;
    }

    public final int hashCode() {
        return Float.hashCode(this.f18599) + (Float.hashCode(this.f18600) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextGeometricTransform(scaleX=");
        sb.append(this.f18600);
        sb.append(", skewX=");
        return AbstractC3761.m6639(sb, this.f18599, ')');
    }
}
