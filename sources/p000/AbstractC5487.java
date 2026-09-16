package p000;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;

/* JADX INFO: renamed from: ۦۡؖۗؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5487 {
    private static volatile Choreographer choreographer;

    /* JADX INFO: renamed from: ۥۣ */
    public static final /* synthetic */ int f18096 = 0;

    static {
        Object c4535;
        try {
            c4535 = new C5136(m9189(Looper.getMainLooper()));
        } catch (Throwable th) {
            c4535 = new C4535(th);
        }
        if (c4535 instanceof C4535) {
            c4535 = null;
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static final Handler m9189(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (Handler) Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }
}
