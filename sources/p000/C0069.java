package p000;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: ۦِ */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0069 extends CancellationException {

    /* JADX INFO: renamed from: ۦۨ */
    public final transient InterfaceC4161 f13147;

    public C0069(InterfaceC4161 interfaceC4161) {
        super("Flow was aborted, no more elements needed");
        this.f13147 = interfaceC4161;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
