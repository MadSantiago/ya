package p000;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.WindowManager;

/* JADX INFO: renamed from: ۥٙؖ۠ٗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1678 implements InterfaceC4230, InterfaceC4861 {

    /* JADX INFO: renamed from: ۦۨ */
    public static final C1678 f5592 = new C1678();

    /* JADX INFO: renamed from: ۦ۟ */
    public static final C1678 f5591 = new C1678();

    @Override // p000.InterfaceC4861
    /* JADX INFO: renamed from: ۥُ */
    public C2546 mo2963(ContextWrapper contextWrapper, InterfaceC4230 interfaceC4230) {
        WindowManager windowManager = contextWrapper.isUiContext() ? (WindowManager) contextWrapper.getSystemService(WindowManager.class) : (WindowManager) contextWrapper.getApplicationContext().getSystemService(WindowManager.class);
        return new C2546(windowManager.getCurrentWindowMetrics().getBounds(), windowManager.getCurrentWindowMetrics().getDensity());
    }

    @Override // p000.InterfaceC4861
    /* JADX INFO: renamed from: ۥّ */
    public C2546 mo2964(Activity activity, InterfaceC4230 interfaceC4230) {
        InterfaceC1027.f3628.getClass();
        return new C2546(new C2999(C3012.m5602().mo805(activity)), interfaceC4230.mo2767(activity));
    }

    @Override // p000.InterfaceC4230
    /* JADX INFO: renamed from: ۦۙ */
    public float mo2767(Context context) {
        return ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getDensity();
    }
}
