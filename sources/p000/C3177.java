package p000;

/* JADX INFO: renamed from: ۦَؓؔۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3177 {

    /* JADX INFO: renamed from: ۥؗ */
    public final long f10675;

    /* JADX INFO: renamed from: ۥۗ */
    public final int f10676;

    /* JADX INFO: renamed from: ۥۣ */
    public final int f10677;

    public C3177(int i, int i2, long j) {
        this.f10677 = i;
        this.f10676 = i2;
        this.f10675 = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3177)) {
            return false;
        }
        C3177 c3177 = (C3177) obj;
        return this.f10677 == c3177.f10677 && this.f10676 == c3177.f10676 && this.f10675 == c3177.f10675;
    }

    public final int hashCode() {
        return Long.hashCode(this.f10675) + AbstractC2049.m3999(this.f10676, AbstractC3761.m6632(this.f10677) * 31, 31);
    }

    public final String toString() {
        return "AnchorInfo(direction=" + AbstractC5078.m8683(this.f10677) + ", offset=" + this.f10676 + ", selectableId=" + this.f10675 + ')';
    }
}
