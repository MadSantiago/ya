package p000;

/* JADX INFO: renamed from: ۦؚٚؔۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4550 {

    /* JADX INFO: renamed from: ۥۗ */
    public final String f15030;

    /* JADX INFO: renamed from: ۥۣ */
    public final String f15031;

    public C4550(String str, String str2) {
        this.f15031 = str;
        if (str2 != null) {
            this.f15030 = str2;
        } else {
            C0178.m387("Null version");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4550)) {
            return false;
        }
        C4550 c4550 = (C4550) obj;
        return this.f15031.equals(c4550.f15031) && this.f15030.equals(c4550.f15030);
    }

    public final int hashCode() {
        return this.f15030.hashCode() ^ ((this.f15031.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LibraryVersion{libraryName=");
        sb.append(this.f15031);
        sb.append(", version=");
        return AbstractC3761.m6621(sb, this.f15030, "}");
    }
}
