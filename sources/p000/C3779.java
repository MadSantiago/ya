package p000;

/* JADX INFO: renamed from: ۦٌٍؔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3779 implements InterfaceC5372 {

    /* JADX INFO: renamed from: ۦ۟ */
    public int f12553;

    /* JADX INFO: renamed from: ۦۨ */
    public final C4852 f12554;

    public C3779(int i) {
        int i2 = (i / 30) * 30;
        this.f12554 = new C4852(AbstractC4554.m7917(Math.max(i2 - 100, 0), i2 + 130), C1298.f4439);
        this.f12553 = i;
    }

    @Override // p000.InterfaceC5372
    public final Object getValue() {
        return (C3046) this.f12554.getValue();
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final void m6681(int i) {
        if (i != this.f12553) {
            this.f12553 = i;
            int i2 = (i / 30) * 30;
            this.f12554.setValue(AbstractC4554.m7917(Math.max(i2 - 100, 0), i2 + 130));
        }
    }
}
