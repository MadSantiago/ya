package p000;

/* JADX INFO: renamed from: ۥۨؖۛۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2937 {

    /* JADX INFO: renamed from: ۥۗ */
    public final EnumC4021 f9869;

    /* JADX INFO: renamed from: ۥۣ */
    public final Object f9870;

    public C2937(Object obj, EnumC4021 enumC4021) {
        this.f9870 = obj;
        this.f9869 = enumC4021;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2937)) {
            return false;
        }
        C2937 c2937 = (C2937) obj;
        return this.f9870.equals(c2937.f9870) && this.f9869.equals(c2937.f9869);
    }

    public final int hashCode() {
        return (this.f9869.hashCode() ^ (((1000003 * 1000003) ^ this.f9870.hashCode()) * 1000003)) * (-721379959);
    }

    public final String toString() {
        return "Event{code=null, payload=" + this.f9870 + ", priority=" + this.f9869 + ", productData=null, eventContext=null}";
    }
}
