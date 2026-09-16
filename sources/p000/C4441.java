package p000;

import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: renamed from: ۦؚ٘ؖٓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4441 {

    /* JADX INFO: renamed from: ۥۗ */
    public static final Charset f14641 = Charset.forName("UTF8");

    /* JADX INFO: renamed from: ۥۣ */
    public final long[] f14642;

    public C4441(long[] jArr) {
        long[] jArr2 = (long[]) jArr.clone();
        this.f14642 = jArr2;
        jArr2[0] = jArr[0];
    }

    public final void finalize() throws Throwable {
        Arrays.fill(this.f14642, 0L);
        super.finalize();
    }

    public final String toString() {
        return (String) new CallableC4308(this).call();
    }
}
