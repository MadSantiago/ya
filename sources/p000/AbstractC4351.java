package p000;

/* JADX INFO: renamed from: ۦٟٗؒۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4351 extends AbstractC3695 {

    /* JADX INFO: renamed from: ۦ۟ */
    public boolean f14347;

    public AbstractC4351(C5371 c5371) {
        super(c5371);
        ((C5371) this.f18660).f17738++;
    }

    /* JADX INFO: renamed from: ۥَ */
    public final void m7642() {
        if (this.f14347) {
            C1078.m2276("Can't initialize twice");
        } else {
            if (mo3853()) {
                return;
            }
            ((C5371) this.f18660).f17720.incrementAndGet();
            this.f14347 = true;
        }
    }

    /* JADX INFO: renamed from: ۥٓ */
    public final void m7643() {
        if (this.f14347) {
            return;
        }
        C1078.m2276("Not initialized");
    }

    /* JADX INFO: renamed from: ۥٖ */
    public abstract boolean mo3853();
}
