package p000;

import android.os.StrictMode;
import java.security.SecureRandom;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: ۦۗؔۘٚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4962 {

    /* JADX INFO: renamed from: ۥؗ */
    public static final C4962 f16412;

    /* JADX INFO: renamed from: ۥۗ */
    public final AtomicLong f16413;

    /* JADX INFO: renamed from: ۥۣ */
    public final UUID f16414;

    static {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            f16412 = new C4962(UUID.randomUUID(), new SecureRandom().nextLong());
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    public C4962(UUID uuid, long j) {
        this.f16414 = uuid;
        this.f16413 = new AtomicLong((j ^ 25214903917L) & 281474976710655L);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final long m8343() {
        AtomicLong atomicLong;
        long j;
        long j2;
        long j3;
        do {
            atomicLong = this.f16413;
            j = atomicLong.get();
            j2 = ((j * 25214903917L) + 11) & 281474976710655L;
            j3 = ((25214903917L * j2) + 11) & 281474976710655L;
        } while (!atomicLong.compareAndSet(j, j3));
        return (((long) ((int) (j2 >>> 16))) << 32) + ((long) ((int) (j3 >>> 16)));
    }
}
