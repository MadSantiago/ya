package p000;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: ۦؚْؑؒ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3576 {

    /* JADX INFO: renamed from: ۥۗ */
    public static final byte[] f11898;

    /* JADX INFO: renamed from: ۥۣ */
    public static final Charset f11899;

    static {
        Charset.forName("US-ASCII");
        f11899 = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f11898 = bArr;
        ByteBuffer.wrap(bArr);
        try {
            new C2712(bArr, 0, 0, false).mo5059(0);
        } catch (C3406 e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static int m6384(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static void m6385(Object obj, String str) {
        if (obj != null) {
            return;
        }
        C0178.m387(str);
    }
}
