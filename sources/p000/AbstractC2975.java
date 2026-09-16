package p000;

/* JADX INFO: renamed from: ۦؐؓ٘ٞ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2975 implements InterfaceC0622 {

    /* JADX INFO: renamed from: ۦۨ */
    public final C5592 f9967 = new C5592(0);

    /* JADX INFO: renamed from: ۥۜ */
    public final void m5525(int i) {
        C5592 c5592;
        int i2;
        do {
            c5592 = this.f9967;
            i2 = c5592.get();
            if ((i2 & i) != 0) {
                return;
            }
        } while (!c5592.compareAndSet(i2, i2 | i));
    }

    /* JADX INFO: renamed from: ۦۙ */
    public final boolean m5526(int i) {
        return (this.f9967.get() & i) != 0;
    }
}
