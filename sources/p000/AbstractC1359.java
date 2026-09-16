package p000;

/* JADX INFO: renamed from: ۥۣٟٔؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1359 {

    /* JADX INFO: renamed from: ۥۗ */
    public boolean f4672;

    /* JADX INFO: renamed from: ۥۣ */
    public C1489 f4673;

    /* JADX INFO: renamed from: ۥۣ */
    public final void m2864() {
        C1489 c1489 = this.f4673;
        if (c1489 == null) {
            C1078.m2276("This input is not added to any dispatcher.");
            return;
        }
        if (!this.f4672) {
            c1489.m3150(this, null);
        }
        C5436 c5436 = (C5436) c1489.f5057;
        C5322 c5322 = (C5322) c1489.f5059;
        if (equals(c5436.f17937) && -1 == c5436.f17945) {
            C1585 c1585M9108 = c5436.f17935;
            if (c1585M9108 == null) {
                c1585M9108 = c5436.m9108(-1);
            }
            c5436.f17935 = null;
            c5436.f17945 = 0;
            c5436.f17937 = null;
            if (c1585M9108 == null) {
                ((C4023) c5322.f17566).f13418.run();
            } else {
                c1585M9108.f5336.mo665();
            }
            c5436.f17938.m8388(null, C3939.f13151);
        }
        this.f4672 = false;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public void mo1516(boolean z) {
    }
}
