package p000;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: ۥۢؗؖ٘, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class ComponentCallbacks2C2631 implements ComponentCallbacks2, ViewTreeObserver.OnWindowFocusChangeListener {

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ C5686 f8740;

    public ComponentCallbacks2C2631(C5686 c5686) {
        this.f8740 = c5686;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.f8740.m9503(configuration);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        C5686 c5686 = this.f8740;
        c5686.f18693.f15799.clear();
        C4446 c4446 = c5686.f18708;
        synchronized (c4446) {
            c4446.f14659.m8314();
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        C5686 c5686 = this.f8740;
        c5686.f18693.f15799.clear();
        C4446 c4446 = c5686.f18708;
        synchronized (c4446) {
            c4446.f14659.m8314();
        }
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z) {
        this.f8740.f18691.f10730.setValue(Boolean.valueOf(z));
    }
}
