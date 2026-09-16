package p000;

/* JADX INFO: renamed from: ۥؚؑۦۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0768 extends Exception {

    /* JADX INFO: renamed from: ۦۨ */
    public final Throwable f2784;

    public C0768(Throwable th, AbstractC2132 abstractC2132, InterfaceC3534 interfaceC3534) {
        super("Coroutine dispatcher " + abstractC2132 + " threw an exception, context = " + interfaceC3534, th);
        this.f2784 = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f2784;
    }
}
