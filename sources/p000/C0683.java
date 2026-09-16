package p000;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* JADX INFO: renamed from: ۥؘؖٞ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0683 extends AbstractC1359 {

    /* JADX INFO: renamed from: ۥؗ */
    public final OnBackInvokedDispatcher f2492;

    /* JADX INFO: renamed from: ۥُ */
    public final OnBackInvokedCallback f2493;

    /* JADX INFO: renamed from: ۥّ */
    public boolean f2494;

    /* JADX INFO: renamed from: ۦؑ */
    public final int f2495;

    public C0683(OnBackInvokedDispatcher onBackInvokedDispatcher, int i) {
        this.f2492 = onBackInvokedDispatcher;
        this.f2495 = i;
        this.f2493 = Build.VERSION.SDK_INT == 33 ? new C4723(2, this) : new C2642(this);
    }

    @Override // p000.AbstractC1359
    /* JADX INFO: renamed from: ۥۗ */
    public final void mo1516(boolean z) {
        OnBackInvokedCallback onBackInvokedCallback = this.f2493;
        if (z && !this.f2494) {
            this.f2492.registerOnBackInvokedCallback(this.f2495, onBackInvokedCallback);
            this.f2494 = true;
        } else {
            if (z || !this.f2494) {
                return;
            }
            this.f2492.unregisterOnBackInvokedCallback(onBackInvokedCallback);
            this.f2494 = false;
        }
    }
}
