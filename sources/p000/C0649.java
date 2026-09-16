package p000;

/* JADX INFO: renamed from: ۥؘؑۦۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0649 extends AbstractC4391 {

    /* JADX INFO: renamed from: ۥْ */
    public static final C0649 f2423;

    /* JADX INFO: renamed from: ۦ۟ */
    public ExecutorC4838 f2424;

    static {
        int i = AbstractC3095.f10378;
        int i2 = AbstractC3095.f10383;
        long j = AbstractC3095.f10379;
        String str = AbstractC3095.f10382;
        C0649 c0649 = new C0649();
        c0649.f2424 = new ExecutorC4838(j, str, i, i2);
        f2423 = c0649;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // p000.AbstractC2132
    public final String toString() {
        return "Dispatchers.Default";
    }

    @Override // p000.AbstractC2132
    /* JADX INFO: renamed from: ۥؙ */
    public final void mo1465(InterfaceC3534 interfaceC3534, Runnable runnable) {
        ExecutorC4838.m8207(this.f2424, runnable, 2);
    }

    @Override // p000.AbstractC2132
    /* JADX INFO: renamed from: ۥؚ */
    public final void mo1466(InterfaceC3534 interfaceC3534, Runnable runnable) {
        ExecutorC4838.m8207(this.f2424, runnable, 6);
    }
}
