package p000;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: ۦۢؓۚؗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnApplyWindowInsetsListenerC5523 implements View.OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: ۥؗ */
    public final /* synthetic */ InterfaceC3662 f18235;

    /* JADX INFO: renamed from: ۥۗ */
    public final /* synthetic */ View f18236;

    /* JADX INFO: renamed from: ۥۣ */
    public C2639 f18237 = null;

    public ViewOnApplyWindowInsetsListenerC5523(View view, InterfaceC3662 interfaceC3662) {
        this.f18236 = view;
        this.f18235 = interfaceC3662;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        C2639 c2639M4953 = C2639.m4953(windowInsets, view);
        int i = Build.VERSION.SDK_INT;
        InterfaceC3662 interfaceC3662 = this.f18235;
        if (i < 30) {
            AbstractC5039.m8556(windowInsets, this.f18236);
            if (c2639M4953.equals(this.f18237)) {
                return interfaceC3662.mo284(view, c2639M4953).m4955();
            }
        }
        this.f18237 = c2639M4953;
        C2639 c2639Mo284 = interfaceC3662.mo284(view, c2639M4953);
        if (i >= 30) {
            return c2639Mo284.m4955();
        }
        WeakHashMap weakHashMap = AbstractC3608.f12013;
        view.requestApplyInsets();
        return c2639Mo284.m4955();
    }
}
