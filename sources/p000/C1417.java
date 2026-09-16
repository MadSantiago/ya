package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: ۥٕؖۙٝ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1417 {

    /* JADX INFO: renamed from: ۥۗ */
    public final C2274 f4880;

    /* JADX INFO: renamed from: ۥۣ */
    public final C5001 f4881;

    public /* synthetic */ C1417(C5001 c5001, C2274 c2274) {
        this.f4881 = c5001;
        this.f4880 = c2274;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C1417)) {
            return false;
        }
        C1417 c1417 = (C1417) obj;
        return AbstractC2164.m4207(this.f4881, c1417.f4881) && AbstractC2164.m4207(this.f4880, c1417.f4880);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4881, this.f4880});
    }

    public final String toString() {
        C3369 c3369 = new C3369(this);
        c3369.m6135(this.f4881, "key");
        c3369.m6135(this.f4880, "feature");
        return c3369.toString();
    }
}
