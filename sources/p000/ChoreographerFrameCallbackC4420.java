package p000;

import android.view.Choreographer;

/* JADX INFO: renamed from: ۦ٘ؓۜؗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class ChoreographerFrameCallbackC4420 implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ InterfaceC4745 f14572;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ C2600 f14573;

    public ChoreographerFrameCallbackC4420(C2600 c2600, C2404 c2404, InterfaceC4745 interfaceC4745) {
        this.f14573 = c2600;
        this.f14572 = interfaceC4745;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        Object c4535;
        try {
            c4535 = this.f14572.mo211(Long.valueOf(j));
        } catch (Throwable th) {
            c4535 = new C4535(th);
        }
        this.f14573.mo335(c4535);
    }
}
