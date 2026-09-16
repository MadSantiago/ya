package p000;

import java.io.OutputStream;

/* JADX INFO: renamed from: ۦّٛۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4652 extends OutputStream {

    /* JADX INFO: renamed from: ۦۨ */
    public long f15345;

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        int i3;
        if (i < 0 || i > bArr.length || i2 < 0 || (i3 = i + i2) > bArr.length || i3 < 0) {
            throw new IndexOutOfBoundsException();
        }
        this.f15345 += (long) i2;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.f15345 += (long) bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.f15345++;
    }
}
