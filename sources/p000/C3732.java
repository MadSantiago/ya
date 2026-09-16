package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: ۦٌؖؕۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3732 {

    /* JADX INFO: renamed from: ۥؗ */
    public final long f12428;

    /* JADX INFO: renamed from: ۥُ */
    public final long f12429;

    /* JADX INFO: renamed from: ۥّ */
    public final float[] f12430;

    /* JADX INFO: renamed from: ۥۗ */
    public final long f12431;

    /* JADX INFO: renamed from: ۥۣ */
    public final long f12432;

    /* JADX INFO: renamed from: ۦؑ */
    public final long f12433;

    /* JADX INFO: renamed from: ۦۙ */
    public final C3896 f12434;

    public C3732(long j, long j2, long j3, long j4, long j5, float[] fArr, C3896 c3896) {
        this.f12432 = j;
        this.f12431 = j2;
        this.f12428 = j3;
        this.f12433 = j4;
        this.f12429 = j5;
        this.f12430 = fArr;
        this.f12434 = c3896;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x004d  */
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (this == obj) {
            return true;
        }
        if (obj != null && C3732.class == obj.getClass()) {
            C3732 c3732 = (C3732) obj;
            if (this.f12432 == c3732.f12432 && this.f12431 == c3732.f12431 && this.f12429 == c3732.f12429 && C0873.m1863(this.f12428, c3732.f12428) && C0873.m1863(this.f12433, c3732.f12433)) {
                float[] fArr = c3732.f12430;
                float[] fArr2 = this.f12430;
                if (fArr2 == null) {
                    if (fArr == null) {
                        zEquals = true;
                    } else {
                        zEquals = false;
                    }
                } else if (fArr == null) {
                    zEquals = false;
                } else {
                    zEquals = fArr2.equals(fArr);
                }
                return zEquals && this.f12434 == c3732.f12434;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iM6626 = AbstractC3761.m6626(AbstractC3761.m6626(AbstractC3761.m6626(AbstractC3761.m6626(Long.hashCode(this.f12432) * 31, 31, this.f12431), 31, this.f12429), 31, this.f12428), 31, this.f12433);
        float[] fArr = this.f12430;
        return this.f12434.hashCode() + ((iM6626 + (fArr != null ? Arrays.hashCode(fArr) : 0)) * 31);
    }
}
