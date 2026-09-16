package p000;

import java.io.Closeable;

/* JADX INFO: renamed from: ۦِۛؗؐ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5245 implements Closeable {

    /* JADX INFO: renamed from: ۦ۟ */
    public static final C2452 f17313 = new C2452(3);

    /* JADX INFO: renamed from: ۦۨ */
    public int f17314;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.f17314;
        if (i <= 0) {
            throw new AssertionError("Mismatched calls to RecursionDepth (possible error in core library)");
        }
        this.f17314 = i - 1;
    }
}
