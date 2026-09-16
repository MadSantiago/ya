package p000;

/* JADX INFO: renamed from: ۥْٕٔؓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1329 {

    /* JADX INFO: renamed from: ۥۣ */
    public final String f4596;

    public C1329(String str) {
        if (str != null) {
            this.f4596 = str;
        } else {
            C0178.m387("name is null");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1329)) {
            return false;
        }
        return this.f4596.equals(((C1329) obj).f4596);
    }

    public final int hashCode() {
        return this.f4596.hashCode() ^ 1000003;
    }

    public final String toString() {
        return AbstractC3761.m6621(new StringBuilder("Encoding{name=\""), this.f4596, "\"}");
    }
}
