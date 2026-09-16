package p000;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: ۥٞؖٔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1963 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final byte[] f6474;

    static {
        byte[] bArr = new byte[0];
        f6474 = bArr;
        ByteBuffer.wrap(bArr);
        int i = 0 + 0;
        try {
            if (i < 0) {
                throw new C5463("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
            }
            if (i > Integer.MAX_VALUE) {
                throw new C5463("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
        } catch (C5463 e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static int m3845(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }
}
