package p000;

/* JADX INFO: renamed from: ۦۗؖٔۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4977 {

    /* JADX INFO: renamed from: ۥۗ */
    public final int f16463;

    /* JADX INFO: renamed from: ۥۣ */
    public final C3963 f16464;

    public C4977(C3963 c3963, int i) {
        this.f16464 = c3963;
        this.f16463 = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4977)) {
            return false;
        }
        C4977 c4977 = (C4977) obj;
        return this.f16464.equals(c4977.f16464) && this.f16463 == c4977.f16463;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f16463) + (this.f16464.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImageVectorEntry(imageVector=");
        sb.append(this.f16464);
        sb.append(", configFlags=");
        return AbstractC3761.m6638(sb, this.f16463, ')');
    }
}
