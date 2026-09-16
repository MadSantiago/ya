package p000;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: renamed from: ۦٍٟٟ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4878 extends AbstractC3925 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        return Arrays.equals(m8228(), ((AbstractC4878) obj).m8228());
    }

    public final int hashCode() {
        int i = -2128831035;
        for (byte b : m8228()) {
            i = (i ^ (b & 255)) * 16777619;
        }
        return i;
    }

    /* JADX INFO: renamed from: ۦۜ */
    public final byte[] m8228() {
        C2024 c2024 = new C2024();
        mo1447(c2024);
        int i = c2024.f6668;
        int iCapacity = ((ByteBuffer) c2024.f6672).capacity() - c2024.f6668;
        if (!c2024.f6664) {
            throw new AssertionError("FlatBuffers: you can only access the serialized buffer after it has been finished by FlatBufferBuilder.finish().");
        }
        byte[] bArr = new byte[iCapacity];
        ((ByteBuffer) c2024.f6672).position(i);
        ((ByteBuffer) c2024.f6672).get(bArr);
        return bArr;
    }
}
