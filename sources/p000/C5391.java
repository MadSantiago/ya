package p000;

/* JADX INFO: renamed from: ۦ۠ؓٔۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5391 {

    /* JADX INFO: renamed from: ۥؗ */
    public final boolean f17820;

    /* JADX INFO: renamed from: ۥۗ */
    public final long f17821;

    /* JADX INFO: renamed from: ۥۣ */
    public final long f17822;

    public C5391(long j, long j2, boolean z) {
        this.f17822 = j;
        this.f17821 = j2;
        this.f17820 = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5391)) {
            return false;
        }
        C5391 c5391 = (C5391) obj;
        return C1553.m3306(this.f17822, c5391.f17822) && this.f17821 == c5391.f17821 && this.f17820 == c5391.f17820;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f17820) + AbstractC3761.m6626(Long.hashCode(this.f17822) * 31, 31, this.f17821);
    }

    public final String toString() {
        return "MouseWheelScrollDelta(value=" + ((Object) C1553.m3309(this.f17822)) + ", timeMillis=" + this.f17821 + ", shouldApplyImmediately=" + this.f17820 + ')';
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final C5391 m9081(C5391 c5391) {
        return new C5391(C1553.m3304(this.f17822, c5391.f17822), Math.max(this.f17821, c5391.f17821), this.f17820);
    }
}
