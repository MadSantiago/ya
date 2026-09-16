package p000;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

/* JADX INFO: renamed from: ۥٌٕؓۥ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1394 {
    /* JADX INFO: renamed from: ۥؗ */
    public static void m2954(Object obj, Object obj2) {
        AbstractC5885.m9705(obj).unregisterOnBackInvokedCallback(AbstractC5885.m9702(obj2));
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static OnBackInvokedCallback m2955(Object obj, LayoutInflaterFactory2C1852 layoutInflaterFactory2C1852) {
        Objects.requireNonNull(layoutInflaterFactory2C1852);
        C4723 c4723 = new C4723(1, layoutInflaterFactory2C1852);
        AbstractC5885.m9705(obj).registerOnBackInvokedCallback(1000000, c4723);
        return c4723;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static OnBackInvokedDispatcher m2956(Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }
}
