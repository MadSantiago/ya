package p000;

/* JADX INFO: renamed from: ۥؘُ۟٘, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2474 extends AbstractC5865 {

    /* JADX INFO: renamed from: ۥْ */
    public boolean f8250;

    public AbstractC2474(C5034 c5034) {
        super(c5034);
        this.f19371.f16679++;
    }

    /* JADX INFO: renamed from: ۥَ */
    public final void m4636() {
        if (this.f8250) {
            C1078.m2276("Can't initialize twice");
            return;
        }
        mo2428();
        this.f19371.f16688++;
        this.f8250 = true;
    }

    /* JADX INFO: renamed from: ۥٓ */
    public final void m4637() {
        if (this.f8250) {
            return;
        }
        C1078.m2276("Not initialized");
    }

    /* JADX INFO: renamed from: ۥٖ */
    public abstract void mo2428();
}
