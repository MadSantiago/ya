package p000;

import java.util.LinkedHashSet;

/* JADX INFO: renamed from: ۥٟٕ٘ؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1585 {

    /* JADX INFO: renamed from: ۥؗ */
    public C1489 f5332;

    /* JADX INFO: renamed from: ۥُ */
    public boolean f5333;

    /* JADX INFO: renamed from: ۥۗ */
    public boolean f5334;

    /* JADX INFO: renamed from: ۥۣ */
    public final C0528 f5335;

    /* JADX INFO: renamed from: ۦؑ */
    public final AbstractC1665 f5336;

    public C1585(AbstractC1665 abstractC1665, C0528 c0528) {
        boolean z = abstractC1665.f5549;
        this.f5335 = c0528;
        this.f5334 = z;
        this.f5336 = abstractC1665;
        this.f5333 = true;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final void m3324(boolean z) {
        this.f5333 = z;
        boolean z2 = z && this.f5336.f5549;
        if (this.f5334 == z2) {
            return;
        }
        this.f5334 = z2;
        C1489 c1489 = this.f5332;
        if (c1489 != null) {
            ((C5436) c1489.f5057).m9109();
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m3325() {
        C1489 c1489 = this.f5332;
        if (c1489 == null || !((LinkedHashSet) c1489.f5058).remove(this)) {
            return;
        }
        C5436 c5436 = (C5436) c1489.f5057;
        if (this == c5436.f17935) {
            if (c5436.f17945 == -1) {
                this.f5336.mo666();
            }
            c5436.f17935 = null;
            c5436.f17945 = 0;
            c5436.f17937 = null;
        }
        c5436.f17939.remove(this);
        c5436.f17934.remove(this);
        this.f5332 = null;
        c5436.m9109();
    }
}
