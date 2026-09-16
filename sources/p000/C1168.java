package p000;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: ۥّٜؕٗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1168 extends AbstractC0438 {

    /* JADX INFO: renamed from: ۥؗ */
    public final byte[] f4051;

    /* JADX INFO: renamed from: ۥُ */
    public int f4052;

    /* JADX INFO: renamed from: ۥّ */
    public final OutputStream f4053;

    /* JADX INFO: renamed from: ۦؑ */
    public final int f4054;

    public C1168(OutputStream outputStream, int i) {
        if (outputStream == null) {
            C0178.m387("out");
            throw null;
        }
        this.f4053 = outputStream;
        if (i < 0) {
            C1078.m2272("bufferSize must be >= 0");
            throw null;
        }
        byte[] bArr = new byte[Math.max(i, 20)];
        this.f4051 = bArr;
        this.f4054 = bArr.length;
    }

    /* JADX INFO: renamed from: ۥؓ */
    public final void m2485(int i) throws IOException {
        if (this.f4054 - this.f4052 < i) {
            m2490();
        }
    }

    /* JADX INFO: renamed from: ۥؖ */
    public final void m2486(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f4052;
        int i4 = this.f4054;
        int i5 = i4 - i3;
        byte[] bArr2 = this.f4051;
        if (i5 >= i2) {
            System.arraycopy(bArr, i, bArr2, i3, i2);
            this.f4052 += i2;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i3, i5);
        int i6 = i + i5;
        this.f4052 = i4;
        m2490();
        int i7 = i2 - i5;
        if (i7 > i4) {
            this.f4053.write(bArr, i6, i7);
        } else {
            System.arraycopy(bArr, i6, bArr2, 0, i7);
            this.f4052 = i7;
        }
    }

    @Override // p000.AbstractC0438
    /* JADX INFO: renamed from: ۥؗ */
    public final void mo936(byte[] bArr, int i, int i2) throws IOException {
        m2486(bArr, i, i2);
    }

    /* JADX INFO: renamed from: ۥً */
    public final void m2487(int i) {
        boolean z = AbstractC0438.f1609;
        byte[] bArr = this.f4051;
        if (z) {
            while (true) {
                int i2 = i & (-128);
                int i3 = this.f4052;
                if (i2 == 0) {
                    this.f4052 = i3 + 1;
                    AbstractC0667.m1483(bArr, i3, (byte) i);
                    return;
                } else {
                    this.f4052 = i3 + 1;
                    AbstractC0667.m1483(bArr, i3, (byte) (i | 128));
                    i >>>= 7;
                }
            }
        } else {
            while (true) {
                int i4 = i & (-128);
                int i5 = this.f4052;
                if (i4 == 0) {
                    this.f4052 = i5 + 1;
                    bArr[i5] = (byte) i;
                    return;
                } else {
                    this.f4052 = i5 + 1;
                    bArr[i5] = (byte) (i | 128);
                    i >>>= 7;
                }
            }
        }
    }

    @Override // p000.AbstractC0438
    /* JADX INFO: renamed from: ۥَ */
    public final void mo937(int i) throws IOException {
        m2485(4);
        m2491(i);
    }

    @Override // p000.AbstractC0438
    /* JADX INFO: renamed from: ۥُ */
    public final void mo938(int i, int i2) throws IOException {
        m2485(20);
        m2487(i << 3);
        if (i2 >= 0) {
            m2487(i2);
        } else {
            m2489(i2);
        }
    }

    @Override // p000.AbstractC0438
    /* JADX INFO: renamed from: ۥّ */
    public final void mo939(int i, int i2) throws IOException {
        m2485(20);
        m2487(i << 3);
        m2487(i2);
    }

    @Override // p000.AbstractC0438
    /* JADX INFO: renamed from: ۥْ */
    public final void mo940(int i) throws IOException {
        if (i >= 0) {
            mo941(i);
        } else {
            mo942(i);
        }
    }

    @Override // p000.AbstractC0438
    /* JADX INFO: renamed from: ۥٓ */
    public final void mo941(int i) throws IOException {
        m2485(5);
        m2487(i);
    }

    @Override // p000.AbstractC0438
    /* JADX INFO: renamed from: ۥٖ */
    public final void mo942(long j) throws IOException {
        m2485(10);
        m2489(j);
    }

    /* JADX INFO: renamed from: ۥٙ */
    public final void m2488(long j) {
        int i = this.f4052;
        byte[] bArr = this.f4051;
        bArr[i] = (byte) j;
        bArr[i + 1] = (byte) (j >> 8);
        bArr[i + 2] = (byte) (j >> 16);
        bArr[i + 3] = (byte) (j >> 24);
        bArr[i + 4] = (byte) (j >> 32);
        bArr[i + 5] = (byte) (j >> 40);
        bArr[i + 6] = (byte) (j >> 48);
        bArr[i + 7] = (byte) (j >> 56);
        this.f4052 = i + 8;
    }

    /* JADX INFO: renamed from: ۥۖ */
    public final void m2489(long j) {
        boolean z = AbstractC0438.f1609;
        byte[] bArr = this.f4051;
        if (z) {
            while (true) {
                long j2 = j & (-128);
                int i = (int) j;
                int i2 = this.f4052;
                if (j2 == 0) {
                    this.f4052 = i2 + 1;
                    AbstractC0667.m1483(bArr, i2, (byte) i);
                    return;
                } else {
                    this.f4052 = i2 + 1;
                    AbstractC0667.m1483(bArr, i2, (byte) (i | 128));
                    j >>>= 7;
                }
            }
        } else {
            while (true) {
                long j3 = j & (-128);
                int i3 = (int) j;
                int i4 = this.f4052;
                if (j3 == 0) {
                    this.f4052 = i4 + 1;
                    bArr[i4] = (byte) i3;
                    return;
                } else {
                    this.f4052 = i4 + 1;
                    bArr[i4] = (byte) (i3 | 128);
                    j >>>= 7;
                }
            }
        }
    }

    @Override // p000.AbstractC0438
    /* JADX INFO: renamed from: ۥۜ */
    public final void mo943(long j, int i) throws IOException {
        m2485(20);
        m2487(i << 3);
        m2489(j);
    }

    /* JADX INFO: renamed from: ۥۧ */
    public final void m2490() throws IOException {
        this.f4053.write(this.f4051, 0, this.f4052);
        this.f4052 = 0;
    }

    @Override // p000.AbstractC0438
    /* JADX INFO: renamed from: ۦؑ */
    public final void mo944(int i, int i2) throws IOException {
        mo941((i << 3) | i2);
    }

    @Override // p000.AbstractC0438
    /* JADX INFO: renamed from: ۦؚ */
    public final void mo945(int i, AbstractC4314 abstractC4314) throws IOException {
        mo941((i << 3) | 2);
        mo946(abstractC4314);
    }

    @Override // p000.AbstractC0438
    /* JADX INFO: renamed from: ۦٌ */
    public final void mo946(AbstractC4314 abstractC4314) throws IOException {
        mo941(abstractC4314.mo7605());
        abstractC4314.mo7607(this);
    }

    @Override // p000.AbstractC0438
    /* JADX INFO: renamed from: ۦِ */
    public final void mo947(int i, boolean z) throws IOException {
        m2485(11);
        m2487(i << 3);
        int i2 = this.f4052;
        this.f4051[i2] = z ? (byte) 1 : (byte) 0;
        this.f4052 = i2 + 1;
    }

    /* JADX INFO: renamed from: ۦٕ */
    public final void m2491(int i) {
        int i2 = this.f4052;
        byte[] bArr = this.f4051;
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >> 8);
        bArr[i2 + 2] = (byte) (i >> 16);
        bArr[i2 + 3] = (byte) (i >> 24);
        this.f4052 = i2 + 4;
    }

    @Override // p000.AbstractC0438
    /* JADX INFO: renamed from: ۦٗ */
    public final void mo948(long j) throws IOException {
        m2485(8);
        m2488(j);
    }

    @Override // p000.AbstractC0438
    /* JADX INFO: renamed from: ۦٛ */
    public final void mo949(long j, int i) throws IOException {
        m2485(18);
        m2487((i << 3) | 1);
        m2488(j);
    }

    @Override // p000.AbstractC0438
    /* JADX INFO: renamed from: ۦۗ */
    public final void mo950(int i, String str) throws IOException {
        mo941((i << 3) | 2);
        mo953(str);
    }

    @Override // p000.AbstractC0438
    /* JADX INFO: renamed from: ۦۙ */
    public final void mo951(int i, int i2) throws IOException {
        m2485(14);
        m2487((i << 3) | 5);
        m2491(i2);
    }

    @Override // p000.AbstractC0438
    /* JADX INFO: renamed from: ۦۚ */
    public final void mo952(int i, byte[] bArr) throws IOException {
        mo941(i);
        m2486(bArr, 0, i);
    }

    @Override // p000.AbstractC0438
    /* JADX INFO: renamed from: ۦۛ */
    public final void mo953(String str) throws IOException {
        int length = str.length() * 3;
        int iM935 = AbstractC0438.m935(length);
        int i = iM935 + length;
        int i2 = this.f4054;
        if (i > i2) {
            byte[] bArr = new byte[length];
            int iM8425 = AbstractC5011.m8425(str, bArr, 0, length);
            mo941(iM8425);
            m2486(bArr, 0, iM8425);
            return;
        }
        if (i > i2 - this.f4052) {
            m2490();
        }
        int iM936 = AbstractC0438.m935(str.length());
        int i3 = this.f4052;
        byte[] bArr2 = this.f4051;
        try {
            if (iM936 == iM935) {
                int i4 = i3 + iM936;
                this.f4052 = i4;
                int iM8426 = AbstractC5011.m8425(str, bArr2, i4, i2 - i4);
                this.f4052 = i3;
                m2487((iM8426 - i3) - iM936);
                this.f4052 = iM8426;
            } else {
                int iM8427 = AbstractC5011.m8426(str);
                m2487(iM8427);
                this.f4052 = AbstractC5011.m8425(str, bArr2, this.f4052, iM8427);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new C2943(e);
        }
    }

    @Override // p000.AbstractC0438
    /* JADX INFO: renamed from: ۦ۟ */
    public final void mo954(byte b) throws IOException {
        if (this.f4052 == this.f4054) {
            m2490();
        }
        int i = this.f4052;
        this.f4051[i] = b;
        this.f4052 = i + 1;
    }

    @Override // p000.AbstractC0438
    /* JADX INFO: renamed from: ۦۨ */
    public final void mo955(AbstractC3127 abstractC3127) throws IOException {
        AbstractC5212 abstractC5212 = (AbstractC5212) abstractC3127;
        mo941(abstractC5212.m8830());
        abstractC5212.m8827(this);
    }
}
