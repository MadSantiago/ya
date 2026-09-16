package p000;

/* JADX INFO: renamed from: ۦۙؑؔۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5079 extends AbstractC0027 {

    /* JADX INFO: renamed from: ۥؗ */
    public boolean f16845;

    /* JADX INFO: renamed from: ۥۗ */
    public final int f16846;

    /* JADX INFO: renamed from: ۥۣ */
    public final C1011 f16847 = new C1011();

    public C5079(int i) {
        this.f16846 = i;
    }

    @Override // p000.AbstractC0027
    /* JADX INFO: renamed from: ۥُ */
    public final AbstractC5360 mo2292() {
        return this.f16847;
    }

    @Override // p000.AbstractC0027
    /* JADX INFO: renamed from: ۥّ */
    public final boolean mo3383() {
        return true;
    }

    @Override // p000.AbstractC0027
    /* JADX INFO: renamed from: ۥۗ */
    public final boolean mo3384(AbstractC5360 abstractC5360) {
        if (!this.f16845) {
            return true;
        }
        AbstractC5360 abstractC5361 = (AbstractC5360) ((AbstractC3959) this.f16847.f13235);
        if (!(abstractC5361 instanceof AbstractC0123)) {
            return true;
        }
        ((AbstractC0123) abstractC5361).f481 = false;
        return true;
    }

    @Override // p000.AbstractC0027
    /* JADX INFO: renamed from: ۥۜ */
    public final C3714 mo2293(C1753 c1753) {
        if (c1753.f5832) {
            if (((AbstractC3959) this.f16847.f13232) == null) {
                return null;
            }
            AbstractC5360 abstractC5360Mo2292 = c1753.m3554().mo2292();
            this.f16845 = (abstractC5360Mo2292 instanceof C3343) || (abstractC5360Mo2292 instanceof C1011);
            return C3714.m6571(c1753.f5829);
        }
        int i = c1753.f5840;
        int i2 = this.f16846;
        if (i >= i2) {
            return new C3714(-1, c1753.f5828 + i2, false);
        }
        return null;
    }
}
