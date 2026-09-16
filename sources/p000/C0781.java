package p000;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: ۥؚؔۡؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0781 extends OutputStream {

    /* JADX INFO: renamed from: ۦۨ */
    public final FileOutputStream f2823;

    public C0781(FileOutputStream fileOutputStream) {
        this.f2823 = fileOutputStream;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        this.f2823.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        this.f2823.write(i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        this.f2823.write(bArr);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        this.f2823.write(bArr, i, i2);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
