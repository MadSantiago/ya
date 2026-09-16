package p000;

/* JADX INFO: renamed from: ۥّؒؒٚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0243 extends AbstractC5676 {

    /* JADX INFO: renamed from: ۦ۟ */
    public boolean f911;

    public AbstractC0243(C5371 c5371) {
        super(c5371);
        ((C5371) this.f18660).f17738++;
    }

    /* JADX INFO: renamed from: ۥَ */
    public final void m503() {
        if (this.f911) {
            return;
        }
        C1078.m2276("Not initialized");
    }

    /* JADX INFO: renamed from: ۥٓ */
    public abstract boolean mo504();

    /* JADX INFO: renamed from: ۥٖ */
    public final void m505() {
        if (this.f911) {
            C1078.m2276("Can't initialize twice");
        } else {
            if (mo504()) {
                return;
            }
            ((C5371) this.f18660).f17720.incrementAndGet();
            this.f911 = true;
        }
    }
}
