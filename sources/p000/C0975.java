package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: ۥٍۣؗ٘, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0975 {

    /* JADX INFO: renamed from: ۥؗ */
    public final /* synthetic */ C2750 f3436;

    /* JADX INFO: renamed from: ۥۗ */
    public final ArrayList f3437 = new ArrayList();

    /* JADX INFO: renamed from: ۥۣ */
    public final int f3438;

    public C0975(C2750 c2750, int i) {
        this.f3436 = c2750;
        this.f3438 = i;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m2081(int i) {
        C2750 c2750 = this.f3436;
        C1405 c1405 = c2750.f9097;
        if (c1405 == null) {
            return;
        }
        this.f3437.add(new C2830(c1405, i, c2750.f9100, null));
    }
}
