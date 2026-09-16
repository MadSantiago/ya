package p000;

/* JADX INFO: renamed from: ۥّۛؑۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2301 extends AbstractC4766 {

    /* JADX INFO: renamed from: ۥۗ */
    public volatile Object f7633;

    @Override // p000.AbstractC4766
    /* JADX INFO: renamed from: ۥۗ */
    public final Object mo4355(C1414 c1414) {
        if (this.f7633 == null) {
            synchronized (this) {
                if (!(this.f7633 != null)) {
                    this.f7633 = mo4356(c1414);
                }
            }
        }
        Object obj = this.f7633;
        if (obj != null) {
            return obj;
        }
        C1078.m2276("Single instance created couldn't return value");
        return null;
    }

    @Override // p000.AbstractC4766
    /* JADX INFO: renamed from: ۥۣ */
    public final Object mo4356(C1414 c1414) {
        if (this.f7633 == null) {
            return super.mo4356(c1414);
        }
        Object obj = this.f7633;
        if (obj != null) {
            return obj;
        }
        C1078.m2276("Single instance created couldn't return value");
        return null;
    }
}
