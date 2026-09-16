package p000;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;

/* JADX INFO: renamed from: ۥٜۚؗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2298 {
    /* JADX INFO: renamed from: ۥۗ */
    public static void m4348(AbstractActivityC1700 abstractActivityC1700) {
        if (Build.VERSION.SDK_INT >= 29) {
            FragmentC3857.C0067.Companion.getClass();
            abstractActivityC1700.registerActivityLifecycleCallbacks(new FragmentC3857.C0067());
        }
        FragmentManager fragmentManager = abstractActivityC1700.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new FragmentC3857(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۥۣ */
    public static void m4349(Activity activity, EnumC1924 enumC1924) {
        if (activity instanceof InterfaceC4507) {
            AbstractC1434 abstractC1434Mo110 = ((InterfaceC4507) activity).mo110();
            if (abstractC1434Mo110 instanceof C4170) {
                ((C4170) abstractC1434Mo110).m7369(enumC1924);
            }
        }
    }
}
