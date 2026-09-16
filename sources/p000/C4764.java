package p000;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* JADX INFO: renamed from: ۦٝؗؕ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class C4764 extends AbstractC0186 {

    /* JADX INFO: renamed from: ۥْ */
    public final WindowInsetsController f15715;

    /* JADX INFO: renamed from: ۥٓ */
    public final Window f15716;

    public C4764(Window window) {
        this.f15715 = window.getInsetsController();
        this.f15716 = window;
    }

    /* JADX INFO: renamed from: ۥ٘ */
    public final void m8111(int i, int i2, boolean z) {
        Window window = this.f15716;
        if (window == null) {
            WindowInsetsController windowInsetsController = this.f15715;
            if (z) {
                windowInsetsController.setSystemBarsAppearance(i2, i2);
                return;
            } else {
                windowInsetsController.setSystemBarsAppearance(0, i2);
                return;
            }
        }
        if (z) {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
        } else {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility((~i) & decorView2.getSystemUiVisibility());
        }
    }

    @Override // p000.AbstractC0186
    /* JADX INFO: renamed from: ۦُ */
    public void mo447(boolean z) {
        m8111(16, 16, z);
    }

    @Override // p000.AbstractC0186
    /* JADX INFO: renamed from: ۦٖ */
    public void mo448(boolean z) {
        m8111(8192, 8, z);
    }
}
