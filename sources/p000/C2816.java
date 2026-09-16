package p000;

import android.graphics.Path;
import android.os.Build;
import android.view.View;
import java.util.WeakHashMap;
import ru.bluecat.yandexmapspatcher.R;

/* JADX INFO: renamed from: ۥۦؘؖٓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2816 {

    /* JADX INFO: renamed from: ۦۛ */
    public static final WeakHashMap f9398 = new WeakHashMap();

    /* JADX INFO: renamed from: ۥؗ */
    public final C0879 f9399;

    /* JADX INFO: renamed from: ۥَ */
    public final boolean f9400;

    /* JADX INFO: renamed from: ۥُ */
    public final C0879 f9401;

    /* JADX INFO: renamed from: ۥّ */
    public final C0879 f9402;

    /* JADX INFO: renamed from: ۥْ */
    public final C3721 f9403;

    /* JADX INFO: renamed from: ۥٓ */
    public final C3721 f9404;

    /* JADX INFO: renamed from: ۥٖ */
    public int f9405;

    /* JADX INFO: renamed from: ۥۗ */
    public final C0879 f9406;

    /* JADX INFO: renamed from: ۥۜ */
    public final C0879 f9407;

    /* JADX INFO: renamed from: ۥۣ */
    public final C0879 f9408;

    /* JADX INFO: renamed from: ۦؑ */
    public final C0879 f9409;

    /* JADX INFO: renamed from: ۦؚ */
    public final C3721 f9410;

    /* JADX INFO: renamed from: ۦٌ */
    public final C3721 f9411;

    /* JADX INFO: renamed from: ۦِ */
    public final C3721 f9412;

    /* JADX INFO: renamed from: ۦٗ */
    public final RunnableC0129 f9413;

    /* JADX INFO: renamed from: ۦٛ */
    public final C0879 f9414;

    /* JADX INFO: renamed from: ۦۗ */
    public final C4852 f9415;

    /* JADX INFO: renamed from: ۦۙ */
    public final C0879 f9416;

    /* JADX INFO: renamed from: ۦۚ */
    public final C3721 f9417;

    /* JADX INFO: renamed from: ۦ۟ */
    public final C3721 f9418;

    /* JADX INFO: renamed from: ۦۨ */
    public final C3721 f9419;

    public C2816(View view) {
        C0879 c0879 = new C0879(4, "captionBar");
        this.f9408 = c0879;
        C0879 c08710 = new C0879(128, "displayCutout");
        this.f9406 = c08710;
        C0879 c08711 = new C0879(8, "ime");
        this.f9399 = c08711;
        C0879 c08712 = new C0879(32, "mandatorySystemGestures");
        this.f9409 = c08712;
        C0879 c08713 = new C0879(2, "navigationBars");
        this.f9401 = c08713;
        C0879 c08714 = new C0879(1, "statusBars");
        this.f9402 = c08714;
        C0879 c08715 = new C0879(519, "systemBars");
        this.f9416 = c08715;
        C0879 c08716 = new C0879(16, "systemGestures");
        this.f9407 = c08716;
        C0879 c08717 = new C0879(64, "tappableElement");
        this.f9414 = c08717;
        C3721 c3721 = new C3721(new C5295(0, 0, 0, 0), "waterfall");
        this.f9412 = c3721;
        this.f9415 = AbstractC2774.m5183(null);
        new C3080(new C3080(new C3080(c08715, c08711), c08710), new C3080(new C3080(new C3080(c08717, c08712), c08716), c3721));
        this.f9410 = AbstractC1434.m3031(4, "captionBarIgnoringVisibility");
        this.f9411 = AbstractC1434.m3031(2, "navigationBarsIgnoringVisibility");
        this.f9417 = AbstractC1434.m3031(1, "statusBarsIgnoringVisibility");
        this.f9419 = AbstractC1434.m3031(519, "systemBarsIgnoringVisibility");
        this.f9418 = AbstractC1434.m3031(64, "tappableElementIgnoringVisibility");
        this.f9403 = new C3721(new C5295(0, 0, 0, 0), "imeAnimationTarget");
        this.f9404 = new C3721(new C5295(0, 0, 0, 0), "imeAnimationSource");
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        Object tag = view2 != null ? view2.getTag(R.id.consume_window_insets_tag) : null;
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        this.f9400 = bool != null ? bool.booleanValue() : false;
        this.f9413 = new RunnableC0129(this);
        WeakHashMap weakHashMap = AbstractC3608.f12013;
        C2639 c2639M8350 = AbstractC4969.m8350(view);
        if (c2639M8350 != null) {
            C3470 c3470 = c2639M8350.f8768;
            c0879.m1867(c3470.mo2751(4));
            c08710.m1867(c3470.mo2751(128));
            c08711.m1867(c3470.mo2751(8));
            c08712.m1867(c3470.mo2751(32));
            c08713.m1867(c3470.mo2751(2));
            c08714.m1867(c3470.mo2751(1));
            c08715.m1867(c3470.mo2751(519));
            c08716.m1867(c3470.mo2751(16));
            c08717.m1867(c3470.mo2751(64));
        }
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static void m5380(C2816 c2816, C2639 c2639) {
        boolean z = false;
        c2816.f9408.m1871(c2639, 0);
        c2816.f9399.m1871(c2639, 0);
        c2816.f9406.m1871(c2639, 0);
        c2816.f9401.m1871(c2639, 0);
        c2816.f9402.m1871(c2639, 0);
        c2816.f9416.m1871(c2639, 0);
        c2816.f9407.m1871(c2639, 0);
        c2816.f9414.m1871(c2639, 0);
        c2816.f9409.m1871(c2639, 0);
        c2816.f9410.m6573(AbstractC0949.m1957(c2639.f8768.mo2749(4)));
        c2816.f9411.m6573(AbstractC0949.m1957(c2639.f8768.mo2749(2)));
        c2816.f9417.m6573(AbstractC0949.m1957(c2639.f8768.mo2749(1)));
        c2816.f9419.m6573(AbstractC0949.m1957(c2639.f8768.mo2749(519)));
        c2816.f9418.m6573(AbstractC0949.m1957(c2639.f8768.mo2749(64)));
        C1798 c1798Mo6259 = c2639.f8768.mo6259();
        c2816.f9412.m6573(AbstractC0949.m1957(c1798Mo6259 != null ? c1798Mo6259.m3584() : C5364.f17692));
        C0935 c0935 = null;
        if (c1798Mo6259 != null) {
            Path pathM1701 = Build.VERSION.SDK_INT >= 31 ? AbstractC0797.m1701(c1798Mo6259.f5996) : null;
            if (pathM1701 != null) {
                c0935 = new C0935(pathM1701);
            }
        }
        c2816.f9415.setValue(c0935);
        synchronized (AbstractC1538.f5203) {
            C3639 c3639 = AbstractC1538.f5210.f16713;
            if (c3639 != null && c3639.m6494()) {
                z = true;
            }
        }
        if (z) {
            AbstractC1538.m3269();
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m5381(View view) {
        if (this.f9405 == 0) {
            WeakHashMap weakHashMap = AbstractC3608.f12013;
            RunnableC0129 runnableC0129 = this.f9413;
            AbstractC5039.m8554(view, runnableC0129);
            if (view.isAttachedToWindow()) {
                view.requestApplyInsets();
            }
            view.addOnAttachStateChangeListener(runnableC0129);
            C0460.m977(view, runnableC0129);
        }
        this.f9405++;
    }
}
