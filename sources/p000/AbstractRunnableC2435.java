package p000;

import android.os.SystemClock;
import java.util.Objects;

/* JADX INFO: renamed from: ۥۣ۟ؓؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractRunnableC2435 implements Runnable {

    /* JADX INFO: renamed from: ۥْ */
    public final boolean f8104;

    /* JADX INFO: renamed from: ۥٓ */
    public final /* synthetic */ C3286 f8105;

    /* JADX INFO: renamed from: ۦ۟ */
    public final long f8106;

    /* JADX INFO: renamed from: ۦۨ */
    public final long f8107;

    public AbstractRunnableC2435(C3286 c3286, boolean z) {
        Objects.requireNonNull(c3286);
        this.f8105 = c3286;
        this.f8107 = System.currentTimeMillis();
        this.f8106 = SystemClock.elapsedRealtime();
        this.f8104 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3286 c3286 = this.f8105;
        if (c3286.f11009) {
            mo2714();
            return;
        }
        try {
            mo2528();
        } catch (Exception e) {
            c3286.m6044(e, false, this.f8104);
            mo2714();
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public abstract void mo2528();

    /* JADX INFO: renamed from: ۥۗ */
    public void mo2714() {
    }
}
