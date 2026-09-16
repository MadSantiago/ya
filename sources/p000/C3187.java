package p000;

import android.media.MediaDataSource;
import java.io.DataInputStream;
import java.io.IOException;

/* JADX INFO: renamed from: ۦٕؓؖٓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3187 extends MediaDataSource {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ C3438 f10708;

    /* JADX INFO: renamed from: ۦۨ */
    public long f10709;

    public C3187(C3438 c3438) {
        this.f10708 = c3438;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return -1L;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j, byte[] bArr, int i, int i2) {
        C3438 c3438 = this.f10708;
        DataInputStream dataInputStream = c3438.f11272;
        if (i2 == 0) {
            return 0;
        }
        if (j >= 0) {
            try {
                long j2 = this.f10709;
                if (j2 != j) {
                    if (j2 < 0 || j < j2 + ((long) dataInputStream.available())) {
                        c3438.m6222(j);
                        this.f10709 = j;
                    }
                }
                if (i2 > dataInputStream.available()) {
                    i2 = dataInputStream.available();
                }
                int i3 = c3438.read(bArr, i, i2);
                if (i3 >= 0) {
                    this.f10709 += (long) i3;
                    return i3;
                }
            } catch (IOException unused) {
            }
            this.f10709 = -1L;
            return -1;
        }
        return -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
