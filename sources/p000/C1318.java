package p000;

/* JADX INFO: renamed from: ۥّٔؒٗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1318 {

    /* JADX INFO: renamed from: ۥؗ */
    public final float f4539;

    /* JADX INFO: renamed from: ۥُ */
    public final long f4540;

    /* JADX INFO: renamed from: ۥۗ */
    public final float f4541;

    /* JADX INFO: renamed from: ۥۣ */
    public final int f4542;

    /* JADX INFO: renamed from: ۦؑ */
    public final float f4543;

    public C1318(int i, float f, float f2, float f3, long j) {
        this.f4542 = i;
        this.f4541 = f;
        this.f4539 = f2;
        this.f4543 = f3;
        this.f4540 = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1318.class == obj.getClass()) {
            C1318 c1318 = (C1318) obj;
            return this.f4539 == c1318.f4539 && this.f4543 == c1318.f4543 && this.f4541 == c1318.f4541 && this.f4542 == c1318.f4542 && this.f4540 == c1318.f4540;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f4540) + AbstractC2049.m3999(this.f4542, AbstractC3761.m6635(this.f4541, AbstractC3761.m6635(this.f4543, Float.hashCode(this.f4539) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "NavigationEvent(touchX=" + this.f4539 + ", touchY=" + this.f4543 + ", progress=" + this.f4541 + ", swipeEdge=" + this.f4542 + ", frameTimeMillis=" + this.f4540 + ')';
    }
}
