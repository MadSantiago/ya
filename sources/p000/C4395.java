package p000;

/* JADX INFO: renamed from: ۦٗ۟ؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4395 extends AbstractC0027 {

    /* JADX INFO: renamed from: ۥؗ */
    public int f14482;

    /* JADX INFO: renamed from: ۥۗ */
    public boolean f14483;

    /* JADX INFO: renamed from: ۥۣ */
    public final AbstractC0123 f14484;

    public C4395(AbstractC0123 abstractC0123) {
        this.f14484 = abstractC0123;
    }

    @Override // p000.AbstractC0027
    /* JADX INFO: renamed from: ۥُ */
    public final AbstractC5360 mo2292() {
        return this.f14484;
    }

    @Override // p000.AbstractC0027
    /* JADX INFO: renamed from: ۥّ */
    public final boolean mo3383() {
        return true;
    }

    @Override // p000.AbstractC0027
    /* JADX INFO: renamed from: ۥۗ */
    public final boolean mo3384(AbstractC5360 abstractC5360) {
        if (!(abstractC5360 instanceof C1011)) {
            return false;
        }
        if (this.f14483 && this.f14482 == 1) {
            this.f14484.f481 = false;
            this.f14483 = false;
        }
        return true;
    }

    @Override // p000.AbstractC0027
    /* JADX INFO: renamed from: ۥۜ */
    public final C3714 mo2293(C1753 c1753) {
        if (c1753.f5832) {
            this.f14483 = true;
            this.f14482 = 0;
        } else if (this.f14483) {
            this.f14482++;
        }
        return C3714.m6571(c1753.f5831);
    }
}
