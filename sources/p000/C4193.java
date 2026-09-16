package p000;

/* JADX INFO: renamed from: ۦٜٔؖۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4193 {

    /* JADX INFO: renamed from: ۥۗ */
    public final C5899 f13939;

    /* JADX INFO: renamed from: ۥۣ */
    public final C5314 f13940;

    public C4193(C5314 c5314, C5899 c5899) {
        this.f13940 = c5314;
        this.f13939 = c5899;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4193)) {
            return false;
        }
        C4193 c4193 = (C4193) obj;
        return this.f13940.equals(c4193.f13940) && this.f13939.equals(c4193.f13939);
    }

    public final int hashCode() {
        return this.f13939.hashCode() + ((this.f13940.hashCode() + (EnumC2157.f7118.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SessionEvent(eventType=" + EnumC2157.f7118 + ", sessionData=" + this.f13940 + ", applicationInfo=" + this.f13939 + ')';
    }
}
