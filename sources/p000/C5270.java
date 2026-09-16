package p000;

import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;

/* JADX INFO: renamed from: ۦٖۜؒٝ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5270 extends InputStream {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ C4030 f17364;

    /* JADX INFO: renamed from: ۦ۟ */
    public int f17365;

    /* JADX INFO: renamed from: ۦۨ */
    public int f17366;

    public C5270(C4030 c4030, C2268 c2268) {
        this.f17364 = c4030;
        this.f17366 = c4030.m7202(c2268.f7527 + 4);
        this.f17365 = c2268.f7526;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (bArr == null) {
            C0178.m387("buffer");
            return 0;
        }
        if ((i | i2) < 0 || i2 > bArr.length - i) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i3 = this.f17365;
        if (i3 <= 0) {
            return -1;
        }
        if (i2 > i3) {
            i2 = i3;
        }
        int i4 = this.f17366;
        C4030 c4030 = this.f17364;
        c4030.m7204(i4, bArr, i, i2);
        this.f17366 = c4030.m7202(this.f17366 + i2);
        this.f17365 -= i2;
        return i2;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        C4030 c4030 = this.f17364;
        RandomAccessFile randomAccessFile = c4030.f13446;
        if (this.f17365 == 0) {
            return -1;
        }
        randomAccessFile.seek(this.f17366);
        int i = randomAccessFile.read();
        this.f17366 = c4030.m7202(this.f17366 + 1);
        this.f17365--;
        return i;
    }
}
