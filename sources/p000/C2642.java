package p000;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* JADX INFO: renamed from: ۥؘٜۢؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2642 implements OnBackAnimationCallback {

    /* JADX INFO: renamed from: ۥۣ */
    public final /* synthetic */ C0683 f8785;

    public C2642(C0683 c0683) {
        this.f8785 = c0683;
    }

    public final void onBackCancelled() {
        C0683 c0683 = this.f8785;
        C1489 c1489 = c0683.f4673;
        if (c1489 == null) {
            C1078.m2276("This input is not added to any dispatcher.");
            return;
        }
        if (!c0683.f4672) {
            c1489.m3150(c0683, null);
        }
        C5436 c5436 = (C5436) c1489.f5057;
        if (c0683.equals(c5436.f17937) && -1 == c5436.f17945) {
            C1585 c1585M9108 = c5436.f17935;
            if (c1585M9108 == null) {
                c1585M9108 = c5436.m9108(-1);
            }
            c5436.f17935 = null;
            c5436.f17945 = 0;
            c5436.f17937 = null;
            if (c1585M9108 != null) {
                c1585M9108.f5336.mo666();
            }
            c5436.f17938.m8388(null, C3939.f13151);
        }
        c0683.f4672 = false;
    }

    public final void onBackInvoked() {
        this.f8785.m2864();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        C1318 c1318M9237 = AbstractC5537.m9237(backEvent);
        C0683 c0683 = this.f8785;
        C1489 c1489 = c0683.f4673;
        if (c1489 == null) {
            C1078.m2276("This input is not added to any dispatcher.");
            return;
        }
        if (c0683.f4672) {
            C5436 c5436 = (C5436) c1489.f5057;
            if (c0683.equals(c5436.f17937) && -1 == c5436.f17945) {
                C1585 c1585M9108 = c5436.f17935;
                if (c1585M9108 == null) {
                    c1585M9108 = c5436.m9108(-1);
                }
                if (c1585M9108 != null) {
                    c1585M9108.f5336.mo664(new C0948(c1318M9237));
                }
                c5436.f17938.m8388(null, new C1364(c1318M9237));
            }
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        C1318 c1318M9237 = AbstractC5537.m9237(backEvent);
        C0683 c0683 = this.f8785;
        C1489 c1489 = c0683.f4673;
        if (c1489 == null) {
            C1078.m2276("This input is not added to any dispatcher.");
        } else {
            if (c0683.f4672) {
                return;
            }
            c1489.m3150(c0683, c1318M9237);
            c0683.f4672 = true;
        }
    }
}
