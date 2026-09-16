package p000;

import android.os.Process;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: ۦؑؕ۠ٝ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3042 {

    /* JADX INFO: renamed from: ۥۣ */
    public final String f10230;

    /* JADX INFO: renamed from: ۥۗ */
    public static final String f10229 = AbstractC2133.m4144(UUID.randomUUID().toString() + System.currentTimeMillis());

    /* JADX INFO: renamed from: ۥؗ */
    public static final AtomicLong f10228 = new AtomicLong(0);

    public C3042() {
        long time = new Date().getTime();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.putInt((int) (time / 1000));
        byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
        byteBufferAllocate.position(0);
        byte[] bArrArray = byteBufferAllocate.array();
        byte b = bArrArray[0];
        byte b2 = bArrArray[1];
        byte b3 = bArrArray[2];
        byte b4 = bArrArray[3];
        byte[] bArrM5644 = m5644(time % 1000);
        byte b5 = bArrM5644[0];
        byte b6 = bArrM5644[1];
        byte[] bArrM5645 = m5644(f10228.incrementAndGet());
        byte b7 = bArrM5645[0];
        byte b8 = bArrM5645[1];
        byte[] bArrM5646 = m5644(Integer.valueOf(Process.myPid()).shortValue());
        String strM4135 = AbstractC2133.m4135(new byte[]{b, b2, b3, b4, b5, b6, b7, b8, bArrM5646[0], bArrM5646[1]});
        Locale locale = Locale.US;
        this.f10230 = String.format(locale, "%s%s%s%s", strM4135.substring(0, 12), strM4135.substring(12, 16), strM4135.subSequence(16, 20), f10229.substring(0, 12)).toUpperCase(locale);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static byte[] m5644(long j) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(2);
        byteBufferAllocate.putShort((short) j);
        byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
        byteBufferAllocate.position(0);
        return byteBufferAllocate.array();
    }

    public final String toString() {
        return this.f10230;
    }
}
