package p000;

/* JADX INFO: renamed from: ۦۡؖؑۥ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5480 {

    /* JADX INFO: renamed from: ۥۗ */
    public final long f18077;

    /* JADX INFO: renamed from: ۥۣ */
    public final long f18078;

    public C5480(long j, long j2) {
        this.f18078 = j;
        this.f18077 = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5480)) {
            return false;
        }
        C5480 c5480 = (C5480) obj;
        long j = c5480.f18078;
        int i = C1327.f4593;
        return C4462.m7744(this.f18078, j) && C4462.m7744(this.f18077, c5480.f18077);
    }

    public final int hashCode() {
        int i = C1327.f4593;
        return Long.hashCode(this.f18077) + (Long.hashCode(this.f18078) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionColors(selectionHandleColor=");
        AbstractC5078.m8677(this.f18078, sb, ", selectionBackgroundColor=");
        sb.append((Object) C1327.m2827(this.f18077));
        sb.append(')');
        return sb.toString();
    }
}
