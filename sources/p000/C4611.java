package p000;

/* JADX INFO: renamed from: ۦُٛؓۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4611 extends AbstractC0063 {

    /* JADX INFO: renamed from: ۥۗ */
    public C2600 f15224;

    /* JADX INFO: renamed from: ۥۣ */
    public long f15225;

    @Override // p000.AbstractC0063
    /* JADX INFO: renamed from: ۥۗ */
    public final InterfaceC0443[] mo6443(AbstractC0072 abstractC0072) {
        long j = this.f15225;
        this.f15225 = -1L;
        this.f15224 = null;
        return ((C5845) abstractC0072).m9655(j);
    }

    @Override // p000.AbstractC0063
    /* JADX INFO: renamed from: ۥۣ */
    public final boolean mo6444(AbstractC0072 abstractC0072) {
        C5845 c5845 = (C5845) abstractC0072;
        if (this.f15225 >= 0) {
            return false;
        }
        long j = c5845.f19262;
        if (j < c5845.f19263) {
            c5845.f19263 = j;
        }
        this.f15225 = j;
        return true;
    }
}
