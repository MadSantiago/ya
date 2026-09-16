package p000;

/* JADX INFO: renamed from: ۦّؓؔۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4014 {

    /* JADX INFO: renamed from: ۥؗ */
    public final InterfaceC4370 f13380;

    /* JADX INFO: renamed from: ۥۗ */
    public final int f13381;

    /* JADX INFO: renamed from: ۥۣ */
    public final int f13382;

    public C4014(int i, int i2, InterfaceC4370 interfaceC4370) {
        this.f13382 = i;
        this.f13381 = i2;
        this.f13380 = interfaceC4370;
        if (i < 0) {
            AbstractC4690.m8038("startIndex should be >= 0");
        }
        if (i2 > 0) {
            return;
        }
        AbstractC4690.m8038("size should be > 0");
    }
}
