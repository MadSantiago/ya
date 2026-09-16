package p000;

/* JADX INFO: renamed from: ۦًًّ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3686 extends AbstractC1958 {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ AbstractC1958 f12300;

    /* JADX INFO: renamed from: ۥْ */
    public final transient int f12301;

    /* JADX INFO: renamed from: ۥٓ */
    public final transient int f12302;

    public C3686(AbstractC1958 abstractC1958, int i, int i2) {
        this.f12300 = abstractC1958;
        this.f12301 = i;
        this.f12302 = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC0487.m1055(i, this.f12302);
        return this.f12300.get(i + this.f12301);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f12302;
    }

    @Override // p000.AbstractC4453
    /* JADX INFO: renamed from: ۥُ */
    public final int mo6541() {
        return this.f12300.mo6543() + this.f12301 + this.f12302;
    }

    @Override // p000.AbstractC4453
    /* JADX INFO: renamed from: ۥۗ */
    public final Object[] mo6542() {
        return this.f12300.mo6542();
    }

    @Override // p000.AbstractC1958, java.util.List
    /* JADX INFO: renamed from: ۥۜ */
    public final AbstractC1958 subList(int i, int i2) {
        AbstractC0487.m1087(i, i2, this.f12302);
        int i3 = this.f12301;
        return this.f12300.subList(i + i3, i2 + i3);
    }

    @Override // p000.AbstractC4453
    /* JADX INFO: renamed from: ۦؑ */
    public final int mo6543() {
        return this.f12300.mo6543() + this.f12301;
    }
}
