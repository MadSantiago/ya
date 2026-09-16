package p000;

import android.view.View;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

/* JADX INFO: renamed from: ۦؓؓٓۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3166 {
    /* JADX INFO: renamed from: ۥؗ */
    public static void m5843(Object obj, Object obj2) {
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj2);
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static OnBackInvokedCallback m5844(Runnable runnable) {
        Objects.requireNonNull(runnable);
        return new C4723(3, runnable);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static OnBackInvokedDispatcher m5845(View view) {
        return view.findOnBackInvokedDispatcher();
    }

    /* JADX INFO: renamed from: ۦؑ */
    public static void m5846(Object obj, Object obj2) {
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
