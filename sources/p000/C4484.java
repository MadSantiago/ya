package p000;

/* JADX INFO: renamed from: ۦُٙؔؓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4484 implements InterfaceC2707 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final long f14806;

    /* JADX INFO: renamed from: ۦۨ */
    public final InterfaceC2707 f14807;

    public C4484(InterfaceC2707 interfaceC2707, long j) {
        this.f14807 = interfaceC2707;
        this.f14806 = j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4484)) {
            return false;
        }
        C4484 c4484 = (C4484) obj;
        return c4484.f14806 == this.f14806 && AbstractC3831.m6874(c4484.f14807, this.f14807);
    }

    public final int hashCode() {
        return Long.hashCode(this.f14806) + (this.f14807.hashCode() * 31);
    }

    @Override // p000.InterfaceC2707
    /* JADX INFO: renamed from: ۥَ */
    public final AbstractC1814 mo687(long j, AbstractC1814 abstractC1814, AbstractC1814 abstractC1815, AbstractC1814 abstractC1816) {
        long j2 = this.f14806;
        return j < j2 ? abstractC1816 : this.f14807.mo687(j - j2, abstractC1814, abstractC1815, abstractC1816);
    }

    @Override // p000.InterfaceC2707
    /* JADX INFO: renamed from: ۥۗ */
    public final long mo3123(AbstractC1814 abstractC1814, AbstractC1814 abstractC1815, AbstractC1814 abstractC1816) {
        return this.f14807.mo3123(abstractC1814, abstractC1815, abstractC1816) + this.f14806;
    }

    @Override // p000.InterfaceC2707
    /* JADX INFO: renamed from: ۥۣ */
    public final boolean mo2726() {
        return this.f14807.mo2726();
    }

    @Override // p000.InterfaceC2707
    /* JADX INFO: renamed from: ۦٗ */
    public final AbstractC1814 mo700(long j, AbstractC1814 abstractC1814, AbstractC1814 abstractC1815, AbstractC1814 abstractC1816) {
        long j2 = this.f14806;
        return j < j2 ? abstractC1814 : this.f14807.mo700(j - j2, abstractC1814, abstractC1815, abstractC1816);
    }
}
