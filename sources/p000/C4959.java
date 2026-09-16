package p000;

/* JADX INFO: renamed from: ۦۗؔؕٗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1172
public final class C4959 {
    public static final C4285 Companion = new C4285();

    /* JADX INFO: renamed from: ۥؗ */
    public final long f16404;

    /* JADX INFO: renamed from: ۥۗ */
    public final long f16405;

    /* JADX INFO: renamed from: ۥۣ */
    public final long f16406;

    public /* synthetic */ C4959(int i, long j, long j2, long j3) {
        if (1 != (i & 1)) {
            AbstractC5568.m9392(i, 1, C3253.f10923.mo193());
            throw null;
        }
        this.f16406 = j;
        this.f16405 = (i & 2) == 0 ? j * 1000 : j2;
        if ((i & 4) == 0) {
            this.f16404 = j / 1000;
        } else {
            this.f16404 = j3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4959) && this.f16406 == ((C4959) obj).f16406;
    }

    public final int hashCode() {
        return Long.hashCode(this.f16406);
    }

    public final String toString() {
        return "Time(ms=" + this.f16406 + ')';
    }

    public C4959(long j) {
        this.f16406 = j;
        this.f16405 = j * 1000;
        this.f16404 = j / 1000;
    }
}
