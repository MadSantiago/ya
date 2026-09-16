package p000;

import java.io.Serializable;

/* JADX INFO: renamed from: ۥۤؒٝۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2665 implements Comparable, Serializable {

    /* JADX INFO: renamed from: ۥْ */
    public static final C2665 f8827 = new C2665(0, 0);

    /* JADX INFO: renamed from: ۦ۟ */
    public final long f8828;

    /* JADX INFO: renamed from: ۦۨ */
    public final long f8829;

    public C2665(long j, long j2) {
        this.f8829 = j;
        this.f8828 = j2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C2665 c2665 = (C2665) obj;
        long j = c2665.f8829;
        long j2 = this.f8829;
        return j2 != j ? Long.compareUnsigned(j2, j) : Long.compareUnsigned(this.f8828, c2665.f8828);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2665)) {
            return false;
        }
        C2665 c2665 = (C2665) obj;
        return this.f8829 == c2665.f8829 && this.f8828 == c2665.f8828;
    }

    public final int hashCode() {
        return Long.hashCode(this.f8829 ^ this.f8828);
    }

    public final String toString() {
        byte[] bArr = new byte[36];
        AbstractC5537.m9253(this.f8829, bArr, 0, 0, 4);
        bArr[8] = 45;
        AbstractC5537.m9253(this.f8829, bArr, 9, 4, 6);
        bArr[13] = 45;
        AbstractC5537.m9253(this.f8829, bArr, 14, 6, 8);
        bArr[18] = 45;
        AbstractC5537.m9253(this.f8828, bArr, 19, 0, 2);
        bArr[23] = 45;
        AbstractC5537.m9253(this.f8828, bArr, 24, 2, 8);
        return new String(bArr, AbstractC4637.f15306);
    }
}
