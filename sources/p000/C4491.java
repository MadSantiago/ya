package p000;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: ۦٙؔۛؓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4491 extends CancellationException {
    public C4491(long j) {
        super("Timed out waiting for " + j + " ms");
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(AbstractC1434.f4914);
        return this;
    }
}
