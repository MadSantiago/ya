package p000;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: ۥٕٙؕ٘, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1665 {

    /* JADX INFO: renamed from: ۥۗ */
    public boolean f5549;

    /* JADX INFO: renamed from: ۥۣ */
    public final ArrayList f5550 = new ArrayList();

    /* JADX INFO: renamed from: ۥؗ */
    public final CopyOnWriteArrayList f5548 = new CopyOnWriteArrayList();

    public AbstractC1665(boolean z) {
        this.f5549 = z;
    }

    /* JADX INFO: renamed from: ۥُ */
    public final void m3482(boolean z) {
        this.f5549 = z;
        for (C1585 c1585 : this.f5550) {
            boolean z2 = c1585.f5333 && z;
            if (c1585.f5334 != z2) {
                c1585.f5334 = z2;
                C1489 c1489 = c1585.f5332;
                if (c1489 != null) {
                    ((C5436) c1489.f5057).m9109();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۥۗ */
    public abstract void mo665();

    /* JADX INFO: renamed from: ۥۣ */
    public void mo666() {
    }

    /* JADX INFO: renamed from: ۥؗ */
    public void mo664(C0948 c0948) {
    }

    /* JADX INFO: renamed from: ۦؑ */
    public void mo667(C0948 c0948) {
    }
}
