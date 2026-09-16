package p000;

import android.view.Choreographer;
import java.util.ArrayList;

/* JADX INFO: renamed from: ۥؚٖؕٙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class ChoreographerFrameCallbackC0788 implements Choreographer.FrameCallback, Runnable {

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ C5418 f2838;

    public ChoreographerFrameCallbackC0788(C5418 c5418) {
        this.f2838 = c5418;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.f2838.f17884.removeCallbacks(this);
        this.f2838.m9091();
        C5418 c5418 = this.f2838;
        synchronized (c5418.f17885) {
            if (c5418.f17888) {
                c5418.f17888 = false;
                ArrayList arrayList = c5418.f17886;
                c5418.f17886 = c5418.f17890;
                c5418.f17890 = arrayList;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((Choreographer.FrameCallback) arrayList.get(i)).doFrame(j);
                }
                arrayList.clear();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f2838.m9091();
        C5418 c5418 = this.f2838;
        synchronized (c5418.f17885) {
            if (c5418.f17886.isEmpty()) {
                c5418.f17892.removeFrameCallback(this);
                c5418.f17888 = false;
            }
        }
    }
}
