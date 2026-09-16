package p000;

import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: ۥٍٗۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1551 {

    /* JADX INFO: renamed from: ۥۣ */
    public final WeakReference f5238;

    public C1551(View view) {
        this.f5238 = new WeakReference(view);
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final void m3297(long j) {
        View view = (View) this.f5238.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
    }

    /* JADX INFO: renamed from: ۥُ */
    public final void m3298(float f) {
        View view = (View) this.f5238.get();
        if (view != null) {
            view.animate().translationY(f);
        }
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final void m3299() {
        View view = (View) this.f5238.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m3300(float f) {
        View view = (View) this.f5238.get();
        if (view != null) {
            view.animate().alpha(f);
        }
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final void m3301(InterfaceC1953 interfaceC1953) {
        View view = (View) this.f5238.get();
        if (view != null) {
            if (interfaceC1953 != null) {
                view.animate().setListener(new C5684(interfaceC1953, view));
            } else {
                view.animate().setListener(null);
            }
        }
    }
}
