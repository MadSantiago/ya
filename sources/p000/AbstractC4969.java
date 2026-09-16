package p000;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: renamed from: ۦۗؕؗۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4969 {
    /* JADX INFO: renamed from: ۥۣ */
    public static C2639 m8350(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        C2639 c2639M4953 = C2639.m4953(rootWindowInsets, null);
        C3470 c3470 = c2639M4953.f8768;
        c3470.mo2743(c2639M4953);
        View rootView = view.getRootView();
        c3470.mo2746(rootView);
        c3470.mo2756(rootView);
        c3470.mo2740();
        return c2639M4953;
    }
}
