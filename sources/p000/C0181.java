package p000;

/* JADX INFO: renamed from: ۥؘَؑؓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0181 {

    /* JADX INFO: renamed from: ۥؗ */
    public static final C0181 f668;

    /* JADX INFO: renamed from: ۥۗ */
    public final AbstractC3831 f669;

    /* JADX INFO: renamed from: ۥۣ */
    public final AbstractC3831 f670;

    static {
        C4905 c4905 = C4905.f16198;
        f668 = new C0181(c4905, c4905);
    }

    public C0181(AbstractC3831 abstractC3831, AbstractC3831 abstractC3832) {
        this.f670 = abstractC3831;
        this.f669 = abstractC3832;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0181)) {
            return false;
        }
        C0181 c0181 = (C0181) obj;
        return this.f670.equals(c0181.f670) && this.f669.equals(c0181.f669);
    }

    public final int hashCode() {
        return this.f669.hashCode() + (this.f670.hashCode() * 31);
    }

    public final String toString() {
        return "Size(width=" + this.f670 + ", height=" + this.f669 + ')';
    }
}
