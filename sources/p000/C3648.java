package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: ۦًؒٙؐ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3648 extends AbstractC0134 {

    /* JADX INFO: renamed from: ۥۗ */
    public final byte[] f12207;

    /* JADX INFO: renamed from: ۥۣ */
    public final byte[] f12208;

    public C3648(byte[] bArr, byte[] bArr2) {
        this.f12208 = bArr;
        this.f12207 = bArr2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0134) {
            AbstractC0134 abstractC0134 = (AbstractC0134) obj;
            boolean z = abstractC0134 instanceof C3648;
            C3648 c3648 = (C3648) abstractC0134;
            if (Arrays.equals(this.f12208, z ? c3648.f12208 : c3648.f12208)) {
                C3648 c3649 = (C3648) abstractC0134;
                if (Arrays.equals(this.f12207, z ? c3649.f12207 : c3649.f12207)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f12207) ^ ((Arrays.hashCode(this.f12208) ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "ExperimentIds{clearBlob=" + Arrays.toString(this.f12208) + ", encryptedBlob=" + Arrays.toString(this.f12207) + "}";
    }
}
