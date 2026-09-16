package p000;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import java.util.function.Consumer;

/* JADX INFO: renamed from: ۥٍۚؒ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class ScrollCaptureCallbackC2259 implements ScrollCaptureCallback {

    /* JADX INFO: renamed from: ۥؗ */
    public final C0926 f7506;

    /* JADX INFO: renamed from: ۥُ */
    public final C3950 f7507;

    /* JADX INFO: renamed from: ۥّ */
    public final C3871 f7508;

    /* JADX INFO: renamed from: ۥۗ */
    public final C4730 f7509;

    /* JADX INFO: renamed from: ۥۣ */
    public final C3129 f7510;

    /* JADX INFO: renamed from: ۦؑ */
    public final ViewTreeObserverOnGlobalLayoutListenerC0850 f7511;

    public ScrollCaptureCallbackC2259(C3129 c3129, C4730 c4730, C3950 c3950, C0926 c0926, ViewTreeObserverOnGlobalLayoutListenerC0850 viewTreeObserverOnGlobalLayoutListenerC0850) {
        this.f7510 = c3129;
        this.f7509 = c4730;
        this.f7506 = c0926;
        this.f7511 = viewTreeObserverOnGlobalLayoutListenerC0850;
        this.f7507 = new C3950(c3950.f13208.mo860(C5294.f17438));
        this.f7508 = new C3871(c4730.f15613 - c4730.f15611, new C4248(this, null));
    }

    public final void onScrollCaptureEnd(Runnable runnable) {
        AbstractC2765.m5135(this.f7507, C4816.f15876, 0, new C0023(this, runnable, null, 14), 2);
    }

    public final void onScrollCaptureImageRequest(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Rect rect, Consumer consumer) {
        C2127 c2127M5135 = AbstractC2765.m5135(this.f7507, null, 0, new C1734(this, scrollCaptureSession, rect, consumer, null, 2), 3);
        c2127M5135.mo859(new C2932(9, cancellationSignal));
        cancellationSignal.setOnCancelListener(new C1951(0, c2127M5135));
    }

    public final void onScrollCaptureSearch(CancellationSignal cancellationSignal, Consumer consumer) {
        consumer.accept(AbstractC4225.m7444(this.f7509));
    }

    public final void onScrollCaptureStart(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Runnable runnable) {
        this.f7508.f12922 = 0.0f;
        this.f7506.f3310.setValue(Boolean.TRUE);
        runnable.run();
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: ۥۣ */
    public final Object m4301(ScrollCaptureSession scrollCaptureSession, C4730 c4730, AbstractC0772 abstractC0772) {
        C0483 c0483;
        int i;
        int i2;
        ScrollCaptureSession scrollCaptureSessionM8103;
        int i3;
        C4730 c4731;
        int i4;
        int iM7934;
        int iM7935;
        int i5;
        int i6;
        Canvas canvasLockHardwareCanvas;
        if (abstractC0772 instanceof C0483) {
            c0483 = (C0483) abstractC0772;
            int i7 = c0483.f1757;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                c0483.f1757 = i7 - Integer.MIN_VALUE;
            } else {
                c0483 = new C0483(this, abstractC0772);
            }
        } else {
            c0483 = new C0483(this, abstractC0772);
        }
        Object obj = c0483.f1759;
        int i8 = c0483.f1757;
        C3871 c3871 = this.f7508;
        EnumC2282 enumC2282 = EnumC2282.f7590;
        if (i8 == 0) {
            AbstractC0186.m409(obj);
            i = c4730.f15611;
            i2 = c4730.f15613;
            c0483.f1754 = scrollCaptureSession;
            c0483.f1753 = c4730;
            c0483.f1755 = i;
            c0483.f1758 = i2;
            c0483.f1757 = 1;
            int i9 = c3871.f12923;
            if (i > i2) {
                C1078.m2273(AbstractC5078.m8679("Expected min=", i, i2, " ≤ max="));
                return null;
            }
            int i10 = i2 - i;
            if (i10 > i9) {
                C1078.m2273(AbstractC5078.m8679("Expected range (", i10, i9, ") to be ≤ viewportSize="));
                return null;
            }
            float f = i;
            float f2 = c3871.f12922;
            Object obj2 = C2358.f7817;
            if (f < f2 || i2 > i9 + f2) {
                Object objM6900 = c3871.m6900((((i10 / 2) + i) - (i9 / 2)) - f2, c0483);
                if (objM6900 != enumC2282) {
                    objM6900 = obj2;
                }
                if (objM6900 == enumC2282) {
                    obj2 = objM6900;
                }
            }
            if (obj2 != enumC2282) {
            }
            return enumC2282;
        }
        if (i8 == 1) {
            int i11 = c0483.f1758;
            int i12 = c0483.f1755;
            C4730 c4732 = c0483.f1753;
            ScrollCaptureSession scrollCaptureSessionM8104 = AbstractC4759.m8103(c0483.f1754);
            AbstractC0186.m409(obj);
            i = i12;
            c4730 = c4732;
            i2 = i11;
            scrollCaptureSession = scrollCaptureSessionM8104;
        } else {
            if (i8 != 2) {
                C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i3 = c0483.f1758;
            i4 = c0483.f1755;
            c4731 = c0483.f1753;
            scrollCaptureSessionM8103 = AbstractC4759.m8103(c0483.f1754);
            AbstractC0186.m409(obj);
        }
        iM7934 = AbstractC4554.m7934(i4 - AbstractC2776.m5235(c3871.f12922), 0, c3871.f12923);
        iM7935 = AbstractC4554.m7934(i3 - AbstractC2776.m5235(c3871.f12922), 0, c3871.f12923);
        i5 = c4731.f15612;
        i6 = c4731.f15610;
        if (iM7934 == iM7935) {
            return C4730.f15609;
        }
        canvasLockHardwareCanvas = scrollCaptureSessionM8103.getSurface().lockHardwareCanvas();
        try {
            canvasLockHardwareCanvas.save();
            canvasLockHardwareCanvas.translate(-i5, -iM7934);
            C4730 c4733 = this.f7509;
            canvasLockHardwareCanvas.translate(-c4733.f15612, -c4733.f15611);
            this.f7511.getRootView().draw(canvasLockHardwareCanvas);
            int iM5235 = AbstractC2776.m5235(c3871.f12922);
            return new C4730(i5, iM7934 + iM5235, i6, iM7935 + iM5235);
        } finally {
            scrollCaptureSessionM8103.getSurface().unlockCanvasAndPost(canvasLockHardwareCanvas);
        }
        C1931 c1931 = C1931.f6371;
        c0483.f1754 = scrollCaptureSession;
        c0483.f1753 = c4730;
        c0483.f1755 = i;
        c0483.f1758 = i2;
        c0483.f1757 = 2;
        if (AbstractC2133.m4131(c0483.f2791).m4526(c1931, c0483) != enumC2282) {
            scrollCaptureSessionM8103 = scrollCaptureSession;
            i3 = i2;
            c4731 = c4730;
            i4 = i;
            iM7934 = AbstractC4554.m7934(i4 - AbstractC2776.m5235(c3871.f12922), 0, c3871.f12923);
            iM7935 = AbstractC4554.m7934(i3 - AbstractC2776.m5235(c3871.f12922), 0, c3871.f12923);
            i5 = c4731.f15612;
            i6 = c4731.f15610;
            if (iM7934 == iM7935) {
                return C4730.f15609;
            }
            canvasLockHardwareCanvas = scrollCaptureSessionM8103.getSurface().lockHardwareCanvas();
            canvasLockHardwareCanvas.save();
            canvasLockHardwareCanvas.translate(-i5, -iM7934);
            C4730 c4734 = this.f7509;
            canvasLockHardwareCanvas.translate(-c4734.f15612, -c4734.f15611);
            this.f7511.getRootView().draw(canvasLockHardwareCanvas);
            int iM5236 = AbstractC2776.m5235(c3871.f12922);
            return new C4730(i5, iM7934 + iM5236, i6, iM7935 + iM5236);
        }
        return enumC2282;
    }
}
