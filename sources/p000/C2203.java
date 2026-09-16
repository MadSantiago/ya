package p000;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: ۥۙؑ۠ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2203 extends AbstractC3925 {

    /* JADX INFO: renamed from: ۥۖ */
    public int f7296;

    /* JADX INFO: renamed from: ۦٕ */
    public final boolean f7297;

    /* JADX INFO: renamed from: ۦۛ */
    public final String f7298;

    public C2203(int i, String str, boolean z) {
        this.f7298 = str;
        this.f7296 = i;
        this.f7297 = z;
    }

    @Override // p000.AbstractC3925
    /* JADX INFO: renamed from: ۦٕ */
    public final int mo1447(C2024 c2024) {
        byte b;
        String str = this.f7298;
        if (str == null) {
            C1078.m2272("value must be specified");
            return 0;
        }
        if (str.length() == 0 && this.f7296 != 5) {
            this.f7296 = 5;
        }
        int iM3946 = c2024.m3946(str);
        int i = this.f7296;
        if (i == 1) {
            b = 0;
        } else if (i == 2) {
            b = 1;
        } else if (i != 3) {
            b = 4;
            if (i == 4) {
                b = 3;
            } else if (i != 5) {
                throw null;
            }
        } else {
            b = 2;
        }
        c2024.m3948(3);
        c2024.m3952(0, iM3946);
        boolean z = this.f7297;
        if (z) {
            c2024.m3954(1, 0);
            ByteBuffer byteBuffer = (ByteBuffer) c2024.f6672;
            int i2 = c2024.f6668 - 1;
            c2024.f6668 = i2;
            byteBuffer.put(i2, z ? (byte) 1 : (byte) 0);
            ((int[]) c2024.f6671)[2] = c2024.m3953();
        }
        c2024.m3949(b);
        int iM3950 = c2024.m3950();
        c2024.m3955(iM3950);
        return iM3950;
    }
}
