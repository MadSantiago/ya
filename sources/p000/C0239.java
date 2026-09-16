package p000;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;

/* JADX INFO: renamed from: ۥؒؒؓؓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0239 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: ۥْ */
    public final int f891;

    /* JADX INFO: renamed from: ۦ۟ */
    public Activity f894;

    /* JADX INFO: renamed from: ۦۨ */
    public Object f895;

    /* JADX INFO: renamed from: ۥٓ */
    public boolean f892 = false;

    /* JADX INFO: renamed from: ۥَ */
    public boolean f890 = false;

    /* JADX INFO: renamed from: ۥٖ */
    public boolean f893 = false;

    public C0239(Activity activity) {
        this.f894 = activity;
        this.f891 = activity.hashCode();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.f894 == activity) {
            this.f894 = null;
            this.f890 = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (!this.f890 || this.f893 || this.f892) {
            return;
        }
        Object obj = this.f895;
        try {
            Object obj2 = AbstractC4587.f15132.get(activity);
            if (obj2 == obj && activity.hashCode() == this.f891) {
                AbstractC4587.f15138.postAtFrontOfQueue(new RunnableC4985(4, AbstractC4587.f15135.get(activity), obj2));
                this.f893 = true;
                this.f895 = null;
            }
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.f894 == activity) {
            this.f892 = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
