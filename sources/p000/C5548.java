package p000;

/* JADX INFO: renamed from: ۦُۢؖٛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5548 {

    /* JADX INFO: renamed from: ۥۗ */
    public final int f18324;

    /* JADX INFO: renamed from: ۥۣ */
    public final int f18325;

    public C5548(int i, int i2) {
        this.f18325 = i;
        this.f18324 = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5548)) {
            return false;
        }
        C5548 c5548 = (C5548) obj;
        return this.f18325 == c5548.f18325 && this.f18324 == c5548.f18324;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f18324) + (Integer.hashCode(this.f18325) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CollectionInfo(rowCount=");
        sb.append(this.f18325);
        sb.append(", columnCount=");
        return AbstractC3761.m6638(sb, this.f18324, ')');
    }
}
