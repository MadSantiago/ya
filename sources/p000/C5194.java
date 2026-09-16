package p000;

import java.util.Arrays;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: ۦۚؖ۟ؗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5194 implements Comparable {

    /* JADX INFO: renamed from: ۥْ */
    public static final /* synthetic */ long f17181 = AbstractC3456.f11473.objectFieldOffset(C5194.class.getDeclaredField("ۦ۟"));

    /* JADX INFO: renamed from: ۦ۟ */
    public volatile Object f17182;

    /* JADX INFO: renamed from: ۦۨ */
    public final String f17183;

    public /* synthetic */ C5194(String str, byte[] bArr) {
        this.f17183 = str;
        this.f17182 = bArr;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return this.f17183.compareTo((String) obj);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final /* synthetic */ void m8803(byte[] bArr) {
        byte[][] bArr2;
        C5194 c5194;
        int i = 0;
        while (true) {
            Object obj = this.f17182;
            if (!(obj instanceof byte[])) {
                byte[][] bArr3 = (byte[][]) obj;
                while (true) {
                    int length = bArr3.length;
                    if (i >= length) {
                        bArr2 = (byte[][]) Arrays.copyOf(bArr3, length + 1);
                        bArr2[length] = bArr;
                        break;
                    } else if (Arrays.equals(bArr, bArr3[i])) {
                        return;
                    } else {
                        i++;
                    }
                }
            } else {
                byte[] bArr4 = (byte[]) obj;
                if (Arrays.equals(bArr, bArr4)) {
                    return;
                }
                i = 1;
                bArr2 = new byte[][]{bArr4, bArr};
            }
            byte[][] bArr5 = bArr2;
            while (true) {
                Unsafe unsafe = AbstractC3456.f11473;
                long j = f17181;
                c5194 = this;
                if (unsafe.compareAndSwapObject(c5194, j, obj, bArr5)) {
                    return;
                }
                if (unsafe.getObjectVolatile(c5194, j) != obj) {
                    break;
                } else {
                    this = c5194;
                }
            }
            this = c5194;
        }
    }
}
