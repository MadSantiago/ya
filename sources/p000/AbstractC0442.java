package p000;

/* JADX INFO: renamed from: ۥؕؒٗ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0442 implements InterfaceC3832 {

    /* JADX INFO: renamed from: ۦۨ */
    public final InterfaceC3832 f1630;

    public AbstractC0442(InterfaceC3832 interfaceC3832) {
        this.f1630 = interfaceC3832;
    }

    @Override // p000.InterfaceC3832, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f1630.close();
    }

    @Override // p000.InterfaceC3832, java.io.Flushable
    public void flush() {
        this.f1630.flush();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.f1630 + ')';
    }

    @Override // p000.InterfaceC3832
    /* JADX INFO: renamed from: ۥّ */
    public final C2014 mo961() {
        return this.f1630.mo961();
    }

    @Override // p000.InterfaceC3832
    /* JADX INFO: renamed from: ۥۜ */
    public void mo962(C1270 c1270, long j) {
        this.f1630.mo962(c1270, j);
    }
}
