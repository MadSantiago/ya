package p000;

/* JADX INFO: renamed from: ۥۛؒٔۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2309 {

    /* JADX INFO: renamed from: ۥؗ */
    public static final C2309 f7644 = new C2309(2, false);

    /* JADX INFO: renamed from: ۦؑ */
    public static final C2309 f7645 = new C2309(1, true);

    /* JADX INFO: renamed from: ۥۗ */
    public final boolean f7646;

    /* JADX INFO: renamed from: ۥۣ */
    public final int f7647;

    public C2309(int i, boolean z) {
        this.f7647 = i;
        this.f7646 = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2309)) {
            return false;
        }
        C2309 c2309 = (C2309) obj;
        return this.f7647 == c2309.f7647 && this.f7646 == c2309.f7646;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f7646) + (Integer.hashCode(this.f7647) * 31);
    }

    public final String toString() {
        if (equals(f7644)) {
            return "TextMotion.Static";
        }
        return equals(f7645) ? "TextMotion.Animated" : "Invalid";
    }
}
