package p000;

import android.view.View;
import android.view.Window;

/* JADX INFO: renamed from: ۦؖؑٞۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3326 extends AbstractC0186 {

    /* JADX INFO: renamed from: ۥْ */
    public final Window f11136;

    public C3326(Window window) {
        this.f11136 = window;
    }

    @Override // p000.AbstractC0186
    /* JADX INFO: renamed from: ۦُ */
    public final void mo447(boolean z) {
        Window window = this.f11136;
        if (!z) {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-17));
        } else {
            window.clearFlags(134217728);
            window.addFlags(Integer.MIN_VALUE);
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() | 16);
        }
    }

    @Override // p000.AbstractC0186
    /* JADX INFO: renamed from: ۦٖ */
    public final void mo448(boolean z) {
        Window window = this.f11136;
        if (!z) {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-8193));
        } else {
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() | 8192);
        }
    }
}
