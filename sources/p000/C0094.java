package p000;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: ۦۡ */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0094 extends AbstractC3925 {

    /* JADX INFO: renamed from: ۥۖ */
    public int f17930;

    /* JADX INFO: renamed from: ۦٕ */
    public int f17931;

    /* JADX INFO: renamed from: ۦۛ */
    public final /* synthetic */ int f17932 = 1;

    public C0094(int i) {
        this.f17930 = i;
        this.f17931 = i;
    }

    @Override // p000.AbstractC3925
    /* JADX INFO: renamed from: ۦٕ */
    public final int mo1447(C2024 c2024) {
        byte b = 1;
        switch (this.f17932) {
            case 0:
                int i = this.f17930;
                if (i == 0) {
                    C1078.m2272("modifiers must not be 0");
                    return 0;
                }
                int i2 = this.f17931;
                if (i2 == 1) {
                    b = 0;
                } else if (i2 != 2) {
                    throw null;
                }
                c2024.m3948(2);
                if (i != 0) {
                    c2024.m3954(4, 0);
                    ByteBuffer byteBuffer = (ByteBuffer) c2024.f6672;
                    int i3 = c2024.f6668 - 4;
                    c2024.f6668 = i3;
                    byteBuffer.putInt(i3, i);
                    ((int[]) c2024.f6671)[0] = c2024.m3953();
                }
                c2024.m3949(b);
                int iM3950 = c2024.m3950();
                c2024.m3955(iM3950);
                return iM3950;
            default:
                int i4 = this.f17930;
                int i5 = this.f17931;
                c2024.m3948(2);
                if (i5 != 0) {
                    c2024.m3954(4, 0);
                    ByteBuffer byteBuffer2 = (ByteBuffer) c2024.f6672;
                    int i6 = c2024.f6668 - 4;
                    c2024.f6668 = i6;
                    byteBuffer2.putInt(i6, i5);
                    ((int[]) c2024.f6671)[1] = c2024.m3953();
                }
                if (i4 != 0) {
                    c2024.m3954(4, 0);
                    ByteBuffer byteBuffer3 = (ByteBuffer) c2024.f6672;
                    int i7 = c2024.f6668 - 4;
                    c2024.f6668 = i7;
                    byteBuffer3.putInt(i7, i4);
                    ((int[]) c2024.f6671)[0] = c2024.m3953();
                }
                int iM3951 = c2024.m3950();
                c2024.m3955(iM3951);
                return iM3951;
        }
    }

    public /* synthetic */ C0094() {
    }

    public C0094(int i, int i2) {
        this.f17930 = i;
        this.f17931 = i2;
    }
}
