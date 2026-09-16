package p000;

import android.os.StrictMode;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.Collections;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: renamed from: ۦٍٜؑۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4668 implements InterfaceC2090 {

    /* JADX INFO: renamed from: ۥۣ */
    public final /* synthetic */ int f15372;

    public /* synthetic */ C4668(int i) {
        this.f15372 = i;
    }

    @Override // p000.InterfaceC2090
    public final Object get() {
        switch (this.f15372) {
            case 0:
                return Collections.EMPTY_SET;
            case 1:
                C0916 c0916 = ExecutorsRegistrar.f350;
                StrictMode.ThreadPolicy.Builder builderDetectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
                builderDetectNetwork.detectResourceMismatches();
                builderDetectNetwork.detectUnbufferedIo();
                return new ScheduledExecutorServiceC2597(Executors.newFixedThreadPool(4, new ThreadFactoryC3076("Firebase Background", 10, builderDetectNetwork.penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.f351.get());
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                C0916 c0917 = ExecutorsRegistrar.f350;
                return new ScheduledExecutorServiceC2597(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new ThreadFactoryC3076("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.f351.get());
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                C0916 c0918 = ExecutorsRegistrar.f350;
                return new ScheduledExecutorServiceC2597(Executors.newCachedThreadPool(new ThreadFactoryC3076("Firebase Blocking", 11, null)), (ScheduledExecutorService) ExecutorsRegistrar.f351.get());
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                C0916 c0919 = ExecutorsRegistrar.f350;
                return Executors.newSingleThreadScheduledExecutor(new ThreadFactoryC3076("Firebase Scheduler", 0, null));
            default:
                return null;
        }
    }
}
