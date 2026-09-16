package p000;

/* JADX INFO: renamed from: ۥۣۢؑۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2598 extends RuntimeException {

    /* JADX INFO: renamed from: ۦۨ */
    public final transient InterfaceC3534 f8681;

    public C2598(InterfaceC3534 interfaceC3534) {
        this.f8681 = interfaceC3534;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return String.valueOf(this.f8681);
    }
}
