package p000;

/* JADX INFO: renamed from: ۥٖٜٜؒ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1446 {

    /* JADX INFO: renamed from: ۥؗ */
    public final float f4950;

    /* JADX INFO: renamed from: ۥۗ */
    public final float f4951;

    /* JADX INFO: renamed from: ۥۣ */
    public final float f4952;

    /* JADX INFO: renamed from: ۦؑ */
    public final float f4953;

    public C1446(float f, float f2, float f3, float f4) {
        this.f4952 = f;
        this.f4951 = f2;
        this.f4950 = f3;
        this.f4953 = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C1446)) {
            return false;
        }
        C1446 c1446 = (C1446) obj;
        return C4497.m7826(this.f4952, c1446.f4952) && C4497.m7826(this.f4951, c1446.f4951) && C4497.m7826(this.f4950, c1446.f4950) && C4497.m7826(this.f4953, c1446.f4953) && C4497.m7826(0.0f, 0.0f);
    }

    public final int hashCode() {
        return Float.hashCode(0.0f) + AbstractC3761.m6635(this.f4953, AbstractC3761.m6635(this.f4950, AbstractC3761.m6635(this.f4951, Float.hashCode(this.f4952) * 31, 31), 31), 31);
    }
}
