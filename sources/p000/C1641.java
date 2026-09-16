package p000;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: ۥُۣٙؒ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1641 extends C3121 {

    /* JADX INFO: renamed from: ۥْ */
    public View f5484;

    @Override // p000.C3121
    /* JADX INFO: renamed from: ۦٚ */
    public final void mo3458() {
        View view = this.f5484;
        if (view != null && Build.VERSION.SDK_INT < 33) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).isActive();
        }
        WindowInsetsController windowInsetsController = view != null ? view.getWindowInsetsController() : null;
        if (windowInsetsController != null) {
            windowInsetsController.show(WindowInsets.Type.ime());
        }
        super.mo3458();
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [ۦؙِؖ۟] */
    @Override // p000.C3121
    /* JADX INFO: renamed from: ۦۚ */
    public final void mo3459() {
        View view = this.f5484;
        WindowInsetsController windowInsetsController = view != null ? view.getWindowInsetsController() : null;
        if (windowInsetsController == null) {
            super.mo3459();
            return;
        }
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        ?? r3 = new WindowInsetsController.OnControllableInsetsChangedListener() { // from class: ۦؙِؖ۟
            @Override // android.view.WindowInsetsController.OnControllableInsetsChangedListener
            public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController2, int i) {
                atomicBoolean.set((i & 8) != 0);
            }
        };
        windowInsetsController.addOnControllableInsetsChangedListener(r3);
        if (!atomicBoolean.get() && view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
        windowInsetsController.removeOnControllableInsetsChangedListener(r3);
        windowInsetsController.hide(WindowInsets.Type.ime());
    }
}
