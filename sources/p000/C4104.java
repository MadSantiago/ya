package p000;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.StatFs;
import java.io.File;

/* JADX INFO: renamed from: ۦٍٓؑٝ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4104 extends AbstractC1127 implements InterfaceC4448 {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ C2808 f13691;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ int f13692;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4104(C2808 c2808, int i) {
        super(0);
        this.f13692 = i;
        this.f13691 = c2808;
    }

    @Override // p000.InterfaceC4448
    /* JADX INFO: renamed from: ۥۣ */
    public final Object mo449() {
        int largeMemoryClass;
        C3269 c3269;
        switch (this.f13692) {
            case 0:
                Context context = (Context) this.f13691.f9378;
                Bitmap.Config config = AbstractC0080.f15150;
                double d = 0.2d;
                try {
                    if (((ActivityManager) context.getSystemService(ActivityManager.class)).isLowRamDevice()) {
                        d = 0.15d;
                    }
                } catch (Exception unused) {
                }
                int i = 0;
                C0322 c0322 = new C0322(10, (byte) 0);
                if (d > 0.0d) {
                    Bitmap.Config config2 = AbstractC0080.f15150;
                    try {
                        ActivityManager activityManager = (ActivityManager) context.getSystemService(ActivityManager.class);
                        largeMemoryClass = (context.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
                    } catch (Exception unused2) {
                        largeMemoryClass = 256;
                    }
                    i = (int) (d * ((double) largeMemoryClass) * 1024.0d * 1024.0d);
                    break;
                }
                return new C4475(i > 0 ? new C2346(i, c0322) : new C5086(23, c0322), c0322);
            default:
                C1397 c1397 = C1397.f4793;
                Context context2 = (Context) this.f13691.f9378;
                synchronized (c1397) {
                    try {
                        c3269 = C1397.f4795;
                        if (c3269 == null) {
                            C0867 c0867 = AbstractC1567.f5283;
                            C0649 c0649 = AbstractC0912.f3276;
                            ExecutorC4540 executorC4540 = ExecutorC4540.f15006;
                            Bitmap.Config config3 = AbstractC0080.f15150;
                            File cacheDir = context2.getCacheDir();
                            if (cacheDir == null) {
                                throw new IllegalStateException("cacheDir == null");
                            }
                            cacheDir.mkdirs();
                            File fileM6566 = AbstractC3706.m6566(cacheDir);
                            String str = C5051.f16766;
                            C5051 c5051M8379 = C4992.m8379(fileM6566);
                            long jM7941 = 10485760;
                            try {
                                File file = c5051M8379.toFile();
                                file.mkdir();
                                StatFs statFs = new StatFs(file.getAbsolutePath());
                                jM7941 = AbstractC4554.m7941((long) (0.02d * statFs.getBlockCountLong() * statFs.getBlockSizeLong()), 10485760L, 262144000L);
                                break;
                            } catch (Exception unused3) {
                            }
                            C3269 c32610 = new C3269(jM7941, c0867, c5051M8379);
                            C1397.f4795 = c32610;
                            c3269 = c32610;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return c3269;
        }
    }
}
