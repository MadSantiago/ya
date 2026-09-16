package p000;

import android.os.Handler;
import android.view.Choreographer;
import java.util.ArrayList;

/* JADX INFO: renamed from: ۦ۠ؗؓٗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5418 extends AbstractC2132 {

    /* JADX INFO: renamed from: ۥْ */
    public final Handler f17884;

    /* JADX INFO: renamed from: ۥٙ */
    public final C2404 f17887;

    /* JADX INFO: renamed from: ۥۖ */
    public boolean f17888;

    /* JADX INFO: renamed from: ۦۛ */
    public boolean f17891;

    /* JADX INFO: renamed from: ۦ۟ */
    public final Choreographer f17892;

    /* JADX INFO: renamed from: ۥؖ */
    public static final C2432 f17882 = new C2432(C3218.f10775);

    /* JADX INFO: renamed from: ۥؓ */
    public static final C2452 f17881 = new C2452(0);

    /* JADX INFO: renamed from: ۥٓ */
    public final Object f17885 = new Object();

    /* JADX INFO: renamed from: ۥَ */
    public final C5219 f17883 = new C5219();

    /* JADX INFO: renamed from: ۥٖ */
    public ArrayList f17886 = new ArrayList();

    /* JADX INFO: renamed from: ۦٗ */
    public ArrayList f17890 = new ArrayList();

    /* JADX INFO: renamed from: ۦٕ */
    public final ChoreographerFrameCallbackC0788 f17889 = new ChoreographerFrameCallbackC0788(this);

    public C5418(Choreographer choreographer, Handler handler) {
        this.f17892 = choreographer;
        this.f17884 = handler;
        this.f17887 = new C2404(choreographer, this);
    }

    @Override // p000.AbstractC2132
    /* JADX INFO: renamed from: ۥؚ */
    public final void mo1466(InterfaceC3534 interfaceC3534, Runnable runnable) {
        synchronized (this.f17885) {
            this.f17883.addLast(runnable);
            if (!this.f17891) {
                this.f17891 = true;
                this.f17884.post(this.f17889);
                if (!this.f17888) {
                    this.f17888 = true;
                    this.f17892.postFrameCallback(this.f17889);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۥۥ */
    public final void m9091() {
        Runnable runnable;
        boolean z;
        do {
            synchronized (this.f17885) {
                C5219 c5219 = this.f17883;
                runnable = (Runnable) (c5219.isEmpty() ? null : c5219.removeFirst());
            }
            while (runnable != null) {
                runnable.run();
                synchronized (this.f17885) {
                    C5219 c52110 = this.f17883;
                    runnable = (Runnable) (c52110.isEmpty() ? null : c52110.removeFirst());
                }
            }
            synchronized (this.f17885) {
                if (this.f17883.isEmpty()) {
                    z = false;
                    this.f17891 = false;
                } else {
                    z = true;
                }
            }
        } while (z);
    }
}
