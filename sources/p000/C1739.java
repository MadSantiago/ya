package p000;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: ۥٚؗؐۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1739 extends InputStream {

    /* JADX INFO: renamed from: ۦ۟ */
    public int f5773 = 1073741824;

    /* JADX INFO: renamed from: ۦۨ */
    public final InputStream f5774;

    public C1739(InputStream inputStream) {
        this.f5774 = inputStream;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f5773;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f5774.close();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        int i = this.f5774.read();
        if (i == -1) {
            this.f5773 = 0;
        }
        return i;
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        return this.f5774.skip(j);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        int i = this.f5774.read(bArr);
        if (i == -1) {
            this.f5773 = 0;
        }
        return i;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f5774.read(bArr, i, i2);
        if (i3 == -1) {
            this.f5773 = 0;
        }
        return i3;
    }
}
