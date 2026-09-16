package p000;

/* JADX INFO: renamed from: ۦٌِؐؔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
final class C2983 extends AbstractC5334 {

    /* JADX INFO: renamed from: ۥؗ */
    public final C3742 f10032;

    /* JADX INFO: renamed from: ۥۗ */
    public final C4846 f10033;

    /* JADX INFO: renamed from: ۥۣ */
    public final C0322 f10034;

    /* JADX INFO: renamed from: ۦؑ */
    public final C3226 f10035;

    public C2983(C0322 c0322, C4846 c4846, C3742 c3742, C3226 c3226) {
        this.f10034 = c0322;
        this.f10033 = c4846;
        this.f10032 = c3742;
        this.f10035 = c3226;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2983)) {
            return false;
        }
        C2983 c2983 = (C2983) obj;
        return this.f10034 == c2983.f10034 && this.f10033 == c2983.f10033 && this.f10032 == c2983.f10032 && this.f10035 == c2983.f10035;
    }

    public final int hashCode() {
        return this.f10035.hashCode() + ((this.f10032.hashCode() + ((this.f10033.hashCode() + (this.f10034.hashCode() * 31)) * 31)) * 31);
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۥّ */
    public final void mo915(AbstractC5381 abstractC5381) {
        C0625 c0625 = (C0625) abstractC5381;
        c0625.f2315.f1178 = null;
        C0322 c0322 = this.f10034;
        c0625.f2315 = c0322;
        c0322.f1178 = c0625;
        c0322.f1179 = c0625.f17786 ? 3 : 2;
        c0625.f2316 = this.f10033;
        c0625.f2320 = this.f10032;
        c0625.f2318 = this.f10035;
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۦؑ */
    public final AbstractC5381 mo916() {
        return new C0625(this.f10034, this.f10033, this.f10032, this.f10035);
    }
}
