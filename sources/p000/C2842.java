package p000;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: ۥۧؑؒٝ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2842 extends AbstractC1605 {

    /* JADX INFO: renamed from: ۥَ */
    public final C1199 f9494;

    /* JADX INFO: renamed from: ۥٓ */
    public final C4228 f9495;

    public C2842(C4228 c4228, C1199 c1199) {
        this.f9495 = c4228;
        this.f9494 = c1199;
    }

    @Override // p000.AbstractC1605
    /* JADX INFO: renamed from: ۥؓ */
    public final void mo3375(C0838 c0838) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        C3369 c3369 = new C3369(0, c0838, atomicBoolean);
        C2255 c2255 = new C2255((Context) this.f9495.f14025);
        c2255.f7471 = c0838.f2993;
        C0834 c0834M4298 = c2255.m4298();
        C2255 c2256 = new C2255(c0834M4298, c0834M4298.f2963);
        c2256.f7477 = c3369;
        c2256.f7475 = null;
        c2256.f7479 = null;
        c2256.f7478 = 0;
        C0834 c0834M4299 = c2256.m4298();
        C1199 c1199 = this.f9494;
        C0378 c0378 = new C0378(AbstractC2765.m5120(c1199.f4133, new C5030(c1199, c0834M4299, null, 11)));
        if (atomicBoolean.get()) {
            return;
        }
        atomicBoolean.set(true);
        C2922.f9822.put(c0838, c0378);
    }

    @Override // p000.AbstractC1605
    /* JADX INFO: renamed from: ۥّ */
    public final void mo3376(C0838 c0838) {
        C0378 c0378 = (C0378) C2922.f9822.remove(c0838);
        if (c0378 != null) {
            C2926 c2926 = c0378.f1415;
            if (c2926.mo866()) {
                c2926.mo871(null);
            }
        }
    }
}
