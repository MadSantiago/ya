package p000;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: ۥؙۗؓٞ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2106 extends FilterInputStream {
    public C2106(InputStream inputStream) {
        super(inputStream);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m4087() throws IOException {
        ((FilterInputStream) this).in.close();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
