package p000;

import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: ۦٟؓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4843 {

    /* JADX INFO: renamed from: ۥؗ */
    public static final C4992 f15948 = new C4992(4);

    /* JADX INFO: renamed from: ۥۗ */
    public final AtomicReference f15949 = new AtomicReference(null);

    /* JADX INFO: renamed from: ۥۣ */
    public final C1510 f15950;

    public C4843(C1510 c1510) {
        this.f15950 = c1510;
        c1510.m3185(new C5322(1, this));
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final boolean m8213() {
        C4843 c4843 = (C4843) this.f15949.get();
        return c4843 != null && c4843.m8213();
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final boolean m8214() {
        C4843 c4843 = (C4843) this.f15949.get();
        return c4843 != null && c4843.m8214();
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final C4992 m8215() {
        C4843 c4843 = (C4843) this.f15949.get();
        return c4843 == null ? f15948 : c4843.m8215();
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final void m8216(String str, long j, C1556 c1556) {
        String strM6628 = AbstractC3761.m6628("Deferring native open session: ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", strM6628, null);
        }
        this.f15950.m3185(new C5562(str, j, c1556));
    }
}
