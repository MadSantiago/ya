package p000;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* JADX INFO: renamed from: ۥٜؐٙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class C0157 extends C3842 {
    @Override // p000.C2559
    /* JADX INFO: renamed from: ۥۗ */
    public void mo338(C3566 c3566, C3566 c3567, Window window, View view, boolean z, boolean z2) {
        AbstractC0186 c4764;
        AbstractC5378.m9058(window, false);
        window.setStatusBarColor(c3566.m6361(z));
        window.setNavigationBarColor(c3567.m6361(z2));
        window.setStatusBarContrastEnforced(false);
        window.setNavigationBarContrastEnforced(c3567.f11806 == 0);
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            c4764 = new C1554(window);
        } else {
            c4764 = i >= 30 ? new C4764(window) : new C3326(window);
        }
        c4764.mo448(!z);
        c4764.mo447(!z2);
    }
}
