package p000;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: ۦۥُؓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class ComponentCallbacks2C5722 implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* JADX INFO: renamed from: ۥَ */
    public static final ComponentCallbacks2C5722 f18829 = new ComponentCallbacks2C5722();

    /* JADX INFO: renamed from: ۦۨ */
    public final AtomicBoolean f18833 = new AtomicBoolean();

    /* JADX INFO: renamed from: ۦ۟ */
    public final AtomicBoolean f18832 = new AtomicBoolean();

    /* JADX INFO: renamed from: ۥْ */
    public final ArrayList f18830 = new ArrayList();

    /* JADX INFO: renamed from: ۥٓ */
    public boolean f18831 = false;

    /* JADX INFO: renamed from: ۥۣ */
    public static void m9534(Application application) {
        ComponentCallbacks2C5722 componentCallbacks2C5722 = f18829;
        synchronized (componentCallbacks2C5722) {
            try {
                if (!componentCallbacks2C5722.f18831) {
                    application.registerActivityLifecycleCallbacks(componentCallbacks2C5722);
                    application.registerComponentCallbacks(componentCallbacks2C5722);
                    componentCallbacks2C5722.f18831 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean zCompareAndSet = this.f18833.compareAndSet(true, false);
        this.f18832.set(true);
        if (zCompareAndSet) {
            m9535(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        boolean zCompareAndSet = this.f18833.compareAndSet(true, false);
        this.f18832.set(true);
        if (zCompareAndSet) {
            m9535(false);
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        if (i == 20 && this.f18833.compareAndSet(false, true)) {
            this.f18832.set(true);
            m9535(true);
        }
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final void m9535(boolean z) {
        synchronized (f18829) {
            try {
                Iterator it = this.f18830.iterator();
                while (it.hasNext()) {
                    ((InterfaceC1613) it.next()).mo324(z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
