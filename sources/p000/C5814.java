package p000;

import android.util.Base64;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.UUID;

/* JADX INFO: renamed from: ۦۧؓٚۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5814 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final byte f19138 = Byte.parseByte("01110000", 2);

    /* JADX INFO: renamed from: ۥۗ */
    public static final byte f19137 = Byte.parseByte("00001111", 2);

    /* JADX INFO: renamed from: ۥۣ */
    public static String m9624() {
        UUID uuidRandomUUID = UUID.randomUUID();
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[17]);
        byteBufferWrap.putLong(uuidRandomUUID.getMostSignificantBits());
        byteBufferWrap.putLong(uuidRandomUUID.getLeastSignificantBits());
        byte[] bArrArray = byteBufferWrap.array();
        byte b = bArrArray[0];
        bArrArray[16] = b;
        bArrArray[0] = (byte) ((b & f19137) | f19138);
        return new String(Base64.encode(bArrArray, 11), Charset.defaultCharset()).substring(0, 22);
    }
}
