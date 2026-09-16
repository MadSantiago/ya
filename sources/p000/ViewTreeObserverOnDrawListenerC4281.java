package p000;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: ۦٖؑٚؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnDrawListenerC4281 implements ViewTreeObserver.OnDrawListener, Runnable, Executor {

    /* JADX INFO: renamed from: ۥْ */
    public boolean f14164;

    /* JADX INFO: renamed from: ۥٓ */
    public final /* synthetic */ AbstractActivityC1500 f14165;

    /* JADX INFO: renamed from: ۦ۟ */
    public Runnable f14166;

    /* JADX INFO: renamed from: ۦۨ */
    public final long f14167 = SystemClock.uptimeMillis() + 10000;

    public ViewTreeObserverOnDrawListenerC4281(AbstractActivityC1500 abstractActivityC1500) {
        this.f14165 = abstractActivityC1500;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f14166 = runnable;
        View decorView = this.f14165.getWindow().getDecorView();
        if (!this.f14164) {
            decorView.postOnAnimation(new RunnableC0029(8, this));
        } else if (AbstractC3831.m6874(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z;
        Runnable runnable = this.f14166;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.f14167) {
                this.f14164 = false;
                this.f14165.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.f14166 = null;
        C1300 c1300 = (C1300) this.f14165.f5100.getValue();
        synchronized (c1300.f4464) {
            z = c1300.f4463;
        }
        if (z) {
            this.f14164 = false;
            this.f14165.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f14165.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m7579(View view) {
        if (this.f14164) {
            return;
        }
        this.f14164 = true;
        view.getViewTreeObserver().addOnDrawListener(this);
    }
}
