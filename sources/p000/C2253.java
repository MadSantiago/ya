package p000;

import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: ۥۚؑ۟۟, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2253 implements Closeable {

    /* JADX INFO: renamed from: ۦۨ */
    public final String[] f7469;

    public C2253(String[] strArr) {
        this.f7469 = strArr;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m4297(OutputStream outputStream) throws IOException {
        for (String str : this.f7469) {
            outputStream.write(str.getBytes(StandardCharsets.UTF_8));
            outputStream.write(10);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
