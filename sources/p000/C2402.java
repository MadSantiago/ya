package p000;

import android.app.Activity;
import android.content.ContextWrapper;
import android.graphics.Rect;
import android.view.WindowManager;

/* JADX INFO: renamed from: ۥٍۜؗٔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2402 implements InterfaceC1027, InterfaceC4861 {

    /* JADX INFO: renamed from: ۦۨ */
    public static final C2402 f8007 = new C2402();

    /* JADX INFO: renamed from: ۦ۟ */
    public static final C2402 f8006 = new C2402();

    @Override // p000.InterfaceC4861
    /* JADX INFO: renamed from: ۥُ */
    public C2546 mo2963(ContextWrapper contextWrapper, InterfaceC4230 interfaceC4230) {
        WindowManager windowManager = (WindowManager) contextWrapper.getSystemService(WindowManager.class);
        return new C2546(windowManager.getCurrentWindowMetrics().getBounds(), contextWrapper.getResources().getDisplayMetrics().density);
    }

    @Override // p000.InterfaceC4861
    /* JADX INFO: renamed from: ۥّ */
    public C2546 mo2964(Activity activity, InterfaceC4230 interfaceC4230) {
        InterfaceC1027.f3628.getClass();
        return new C2546(new C2999(C3012.m5602().mo805(activity)), interfaceC4230.mo2767(activity));
    }

    @Override // p000.InterfaceC1027
    /* JADX INFO: renamed from: ۦٛ */
    public Rect mo805(Activity activity) {
        return ((WindowManager) activity.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getBounds();
    }
}
