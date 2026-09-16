package p000;

import android.os.Trace;
import android.view.Choreographer;
import android.view.Display;
import android.view.View;
import java.util.PriorityQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: ۦُۧؓٝ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC5815 implements InterfaceC0762, View.OnAttachStateChangeListener, Runnable, Choreographer.FrameCallback {

    /* JADX INFO: renamed from: ۦۛ */
    public static long f19139;

    /* JADX INFO: renamed from: ۥْ */
    public boolean f19141;

    /* JADX INFO: renamed from: ۥٖ */
    public boolean f19143;

    /* JADX INFO: renamed from: ۦٗ */
    public long f19144;

    /* JADX INFO: renamed from: ۦۨ */
    public final View f19146;

    /* JADX INFO: renamed from: ۦ۟ */
    public final PriorityQueue f19145 = new PriorityQueue(11, new C1068(0));

    /* JADX INFO: renamed from: ۥٓ */
    public final Choreographer f19142 = Choreographer.getInstance();

    /* JADX INFO: renamed from: ۥَ */
    public final C0203 f19140 = new C0203();

    /* JADX WARN: Code duplicated, block: B:10:0x0040  */
    public ViewOnAttachStateChangeListenerC5815(View view) {
        float refreshRate;
        this.f19146 = view;
        if (f19139 == 0) {
            Display display = view.getDisplay();
            if (!view.isInEditMode() && display != null) {
                refreshRate = display.getRefreshRate();
                refreshRate = refreshRate < 30.0f ? 60.0f : refreshRate;
            }
            f19139 = (long) (1.0E9f / refreshRate);
        }
        view.addOnAttachStateChangeListener(this);
        if (view.isAttachedToWindow()) {
            this.f19143 = true;
        }
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        if (this.f19143) {
            this.f19144 = j;
            this.f19146.post(this);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f19143 = true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f19143 = false;
        this.f19146.removeCallbacks(this);
        this.f19142.removeFrameCallback(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        PriorityQueue priorityQueue = this.f19145;
        if (!priorityQueue.isEmpty() && this.f19141 && this.f19143) {
            View view = this.f19146;
            if (view.getWindowVisibility() == 0) {
                long nanos = TimeUnit.MILLISECONDS.toNanos(view.getDrawingTime());
                boolean z = System.nanoTime() > (2 * f19139) + nanos;
                C0203 c0203 = this.f19140;
                c0203.f750 = z;
                c0203.f749 = Math.max(this.f19144, nanos) + f19139;
                boolean zM9625 = false;
                while (!priorityQueue.isEmpty() && !zM9625) {
                    if (c0203.f750) {
                        Trace.beginSection("compose:lazy:prefetch:idle_frame");
                        try {
                            zM9625 = m9625();
                            Trace.endSection();
                        } catch (Throwable th) {
                            Trace.endSection();
                            throw th;
                        }
                    } else {
                        zM9625 = m9625();
                    }
                }
                if (zM9625) {
                    this.f19142.postFrameCallback(this);
                } else {
                    this.f19141 = false;
                }
                AbstractC2765.m5128(0L, "compose:lazy:prefetch:available_time_nanos");
                return;
            }
        }
        this.f19141 = false;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final boolean m9625() {
        C0203 c0203 = this.f19140;
        long jM468 = c0203.m468();
        AbstractC2765.m5128(jM468, "compose:lazy:prefetch:available_time_nanos");
        boolean z = true;
        if (jM468 > 0) {
            PriorityQueue priorityQueue = this.f19145;
            if (!((C1054) priorityQueue.peek()).f3724.m5394(c0203)) {
                priorityQueue.poll();
                z = false;
            }
            c0203.f750 = false;
        }
        return z;
    }

    @Override // p000.InterfaceC0762
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo1151(C2830 c2830) {
        this.f19145.add(new C1054(1, c2830));
        if (this.f19141) {
            return;
        }
        this.f19141 = true;
        this.f19146.post(this);
    }
}
