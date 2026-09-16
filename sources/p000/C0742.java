package p000;

/* JADX INFO: renamed from: ۥؙؖۖۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0742 implements AutoCloseable, InterfaceC4643 {

    /* JADX INFO: renamed from: ۦۨ */
    public final InterfaceC3534 f2700;

    public C0742(InterfaceC3534 interfaceC3534) {
        this.f2700 = interfaceC3534;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        AbstractC5568.m9380(this.f2700, null);
    }

    @Override // p000.InterfaceC4643
    /* JADX INFO: renamed from: ۦ۟ */
    public final InterfaceC3534 mo1586() {
        return this.f2700;
    }
}
