package p000;

/* JADX INFO: renamed from: ۦّ۟ؗ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5360 extends AbstractC3959 {
    @Override // p000.AbstractC3959
    /* JADX INFO: renamed from: ۥؗ */
    public final AbstractC3959 mo7112() {
        return (AbstractC5360) ((AbstractC3959) this.f13235);
    }

    @Override // p000.AbstractC3959
    /* JADX INFO: renamed from: ۥّ */
    public final void mo7113(AbstractC3959 abstractC3959) {
        if (abstractC3959 instanceof AbstractC5360) {
            this.f13235 = abstractC3959;
        } else {
            C1078.m2272("Parent of block must also be block (can not be inline)");
        }
    }
}
