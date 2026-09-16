package p000;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: ۦؗؖۚٝ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3438 extends C3380 {
    public C3438(InputStream inputStream) {
        super(inputStream);
        if (inputStream.markSupported()) {
            this.f11272.mark(Integer.MAX_VALUE);
        } else {
            C1078.m2272("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
            throw null;
        }
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final void m6222(long j) throws IOException {
        int i = this.f11271;
        if (i > j) {
            this.f11271 = 0;
            this.f11272.reset();
        } else {
            j -= (long) i;
        }
        m6146((int) j);
    }

    public C3438(byte[] bArr) {
        super(bArr);
        this.f11272.mark(Integer.MAX_VALUE);
    }
}
