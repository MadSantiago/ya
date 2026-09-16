package p000;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;

/* JADX INFO: renamed from: ۦَُٜؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class FragmentC3857 extends Fragment {

    /* JADX INFO: renamed from: ۦۨ */
    public static final /* synthetic */ int f12886 = 0;

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m6892(EnumC1924.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        m6892(EnumC1924.ON_DESTROY);
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        m6892(EnumC1924.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        m6892(EnumC1924.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        m6892(EnumC1924.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        m6892(EnumC1924.ON_STOP);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m6892(EnumC1924 enumC1924) {
        if (Build.VERSION.SDK_INT < 29) {
            AbstractC2298.m4349(getActivity(), enumC1924);
        }
    }

    /* JADX INFO: renamed from: ۦَُٜؖ$ۥۣ */
    /* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
    public static final class C0067 implements Application.ActivityLifecycleCallbacks {
        public static final C3288 Companion = new C3288();

        public static final void registerIn(Activity activity) {
            Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new C0067());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            int i = FragmentC3857.f12886;
            AbstractC2298.m4349(activity, EnumC1924.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            int i = FragmentC3857.f12886;
            AbstractC2298.m4349(activity, EnumC1924.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            int i = FragmentC3857.f12886;
            AbstractC2298.m4349(activity, EnumC1924.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            int i = FragmentC3857.f12886;
            AbstractC2298.m4349(activity, EnumC1924.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            int i = FragmentC3857.f12886;
            AbstractC2298.m4349(activity, EnumC1924.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            int i = FragmentC3857.f12886;
            AbstractC2298.m4349(activity, EnumC1924.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }
    }
}
