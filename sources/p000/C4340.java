package p000;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: ۦٗؑٛٗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4340 {

    /* JADX INFO: renamed from: ۥۣ */
    public final ByteBuffer f14324 = ByteBuffer.allocate(23).order(ByteOrder.LITTLE_ENDIAN);

    /* JADX INFO: renamed from: ۥۗ */
    public long f14323 = 0;

    /* JADX INFO: renamed from: ۥؗ */
    public long f14322 = 0;

    /* JADX INFO: renamed from: ۦؑ */
    public int f14325 = 0;

    /* JADX INFO: renamed from: ۥؗ */
    public final C4340 m7634(byte[] bArr) {
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr, 0, bArr.length).order(ByteOrder.LITTLE_ENDIAN);
        int iRemaining = byteBufferOrder.remaining();
        ByteBuffer byteBuffer = this.f14324;
        if (iRemaining <= byteBuffer.remaining()) {
            byteBuffer.put(byteBufferOrder);
            if (byteBuffer.remaining() < 8) {
                m7636();
            }
            return this;
        }
        int iPosition = 16 - byteBuffer.position();
        for (int i = 0; i < iPosition; i++) {
            byteBuffer.put(byteBufferOrder.get());
        }
        m7636();
        while (byteBufferOrder.remaining() >= 16) {
            m7635(byteBufferOrder);
        }
        byteBuffer.put(byteBufferOrder);
        return this;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final void m7635(ByteBuffer byteBuffer) {
        long j = byteBuffer.getLong();
        long j2 = byteBuffer.getLong();
        long jRotateLeft = (Long.rotateLeft(j * (-8663945395140668459L), 31) * 5545529020109919103L) ^ this.f14323;
        this.f14323 = jRotateLeft;
        long jRotateLeft2 = Long.rotateLeft(jRotateLeft, 27);
        long j3 = this.f14322;
        this.f14323 = ((jRotateLeft2 + j3) * 5) + 1390208809;
        long jRotateLeft3 = (Long.rotateLeft(j2 * 5545529020109919103L, 33) * (-8663945395140668459L)) ^ j3;
        this.f14322 = jRotateLeft3;
        this.f14322 = ((Long.rotateLeft(jRotateLeft3, 31) + this.f14323) * 5) + 944331445;
        this.f14325 += 16;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m7636() {
        ByteBuffer byteBuffer = this.f14324;
        byteBuffer.flip();
        while (byteBuffer.remaining() >= 16) {
            m7635(byteBuffer);
        }
        byteBuffer.compact();
    }
}
