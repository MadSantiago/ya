package p000;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: ۦٍٖؓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4328 extends AbstractC4593 {

    /* JADX INFO: renamed from: ۦۗ */
    public volatile Handler f14300;

    /* JADX INFO: renamed from: ۦٛ */
    public final Object f14299 = new Object();

    /* JADX INFO: renamed from: ۦِ */
    public final ExecutorService f14298 = Executors.newFixedThreadPool(4, new ThreadFactoryC0311());

    /* JADX INFO: renamed from: ۦؖ */
    public static Handler m7628(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return AbstractC2611.m4930(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }
}
