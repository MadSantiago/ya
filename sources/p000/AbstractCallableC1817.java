package p000;

import android.content.Context;
import android.content.ContextWrapper;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: ۥٜؓؑ٘, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractCallableC1817 extends ContextWrapper implements Callable {

    /* JADX INFO: renamed from: ۦۨ */
    public static final /* synthetic */ int f6041 = 0;

    static {
        try {
            Class.forName("android.os.ServiceManager").getDeclaredMethod("getService", String.class);
            ContextWrapper.class.getDeclaredMethod("attachBaseContext", Context.class).setAccessible(true);
        } catch (Exception e) {
            C5028.m8450(e);
        }
    }
}
