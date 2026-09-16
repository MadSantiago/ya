package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: ۥٌٟٓؔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1273 {

    /* JADX INFO: renamed from: ۥۗ */
    public final byte[] f4345;

    /* JADX INFO: renamed from: ۥۣ */
    public final C1329 f4346;

    public C1273(C1329 c1329, byte[] bArr) {
        if (c1329 == null) {
            C0178.m387("encoding is null");
            throw null;
        }
        if (bArr == null) {
            C0178.m387("bytes is null");
            throw null;
        }
        this.f4346 = c1329;
        this.f4345 = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1273)) {
            return false;
        }
        C1273 c1273 = (C1273) obj;
        if (this.f4346.equals(c1273.f4346)) {
            return Arrays.equals(this.f4345, c1273.f4345);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f4345) ^ ((this.f4346.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f4346 + ", bytes=[...]}";
    }
}
