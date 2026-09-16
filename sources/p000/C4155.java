package p000;

import java.util.Locale;

/* JADX INFO: renamed from: ۦٕٔؑؐ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4155 extends AbstractC0438 {

    /* JADX INFO: renamed from: ۥؗ */
    public final byte[] f13842;

    /* JADX INFO: renamed from: ۥُ */
    public int f13843;

    /* JADX INFO: renamed from: ۦؑ */
    public final int f13844;

    public C4155(int i, byte[] bArr) {
        int length = bArr.length;
        if (((length - i) | i) < 0) {
            Locale locale = Locale.US;
            C1078.m2272(AbstractC5078.m8679("Array range is invalid. Buffer.length=", length, i, ", offset=0, length="));
            throw null;
        }
        this.f13842 = bArr;
        this.f13843 = 0;
        this.f13844 = i;
    }

    @Override // p000.AbstractC0438
    /* JADX INFO: renamed from: ۥؗ */
    public final void mo936(byte[] bArr, int i, int i2) throws C2943 {
        m7349(bArr, i, i2);
    }

    @Override // p000.AbstractC0438
    /* JADX INFO: renamed from: ۥَ */
    public final void mo937(int i) throws C2943 {
        int i2 = this.f13843;
        try {
            byte[] bArr = this.f13842;
            bArr[i2] = (byte) i;
            bArr[i2 + 1] = (byte) (i >> 8);
            bArr[i2 + 2] = (byte) (i >> 16);
            bArr[i2 + 3] = (byte) (i >> 24);
            this.f13843 = i2 + 4;
        } catch (IndexOutOfBoundsException e) {
            throw new C2943(i2, this.f13844, 4, e);
        }
    }

    @Override // p000.AbstractC0438
    /* JADX INFO: renamed from: ۥُ */
    public final void mo938(int i, int i2) throws C2943 {
        mo941(i << 3);
        mo940(i2);
    }

    @Override // p000.AbstractC0438
    /* JADX INFO: renamed from: ۥّ */
    public final void mo939(int i, int i2) throws C2943 {
        mo941(i << 3);
        mo941(i2);
    }

    @Override // p000.AbstractC0438
    /* JADX INFO: renamed from: ۥْ */
    public final void mo940(int i) throws C2943 {
        if (i >= 0) {
            mo941(i);
        } else {
            mo942(i);
        }
    }

    @Override // p000.AbstractC0438
    /* JADX INFO: renamed from: ۥٓ */
    public final void mo941(int i) throws C2943 {
        int i2;
        int i3 = this.f13843;
        while (true) {
            int i4 = i & (-128);
            byte[] bArr = this.f13842;
            if (i4 == 0) {
                i2 = i3 + 1;
                bArr[i3] = (byte) i;
                this.f13843 = i2;
                return;
            } else {
                i2 = i3 + 1;
                try {
                    bArr[i3] = (byte) (i | 128);
                    i >>>= 7;
                    i3 = i2;
                } catch (IndexOutOfBoundsException e) {
                    throw new C2943(i2, this.f13844, 1, e);
                }
            }
            throw new C2943(i2, this.f13844, 1, e);
        }
    }

    @Override // p000.AbstractC0438
    /* JADX INFO: renamed from: ۥٖ */
    public final void mo942(long j) throws C2943 {
        int i;
        int i2 = this.f13843;
        byte[] bArr = this.f13842;
        int i3 = this.f13844;
        if (!AbstractC0438.f1609 || i3 - i2 < 10) {
            while ((j & (-128)) != 0) {
                int i4 = i2 + 1;
                try {
                    bArr[i2] = (byte) (((int) j) | 128);
                    j >>>= 7;
                    i2 = i4;
                } catch (IndexOutOfBoundsException e) {
                    e = e;
                    i = i4;
                    throw new C2943(i, i3, 1, e);
                }
            }
            i = i2 + 1;
            try {
                bArr[i2] = (byte) j;
            } catch (IndexOutOfBoundsException e2) {
                e = e2;
                throw new C2943(i, i3, 1, e);
            }
        } else {
            while ((j & (-128)) != 0) {
                AbstractC0667.m1483(bArr, i2, (byte) (((int) j) | 128));
                j >>>= 7;
                i2++;
            }
            i = i2 + 1;
            AbstractC0667.m1483(bArr, i2, (byte) j);
        }
        this.f13843 = i;
    }

    /* JADX INFO: renamed from: ۥۖ */
    public final void m7349(byte[] bArr, int i, int i2) throws C2943 {
        try {
            System.arraycopy(bArr, i, this.f13842, this.f13843, i2);
            this.f13843 += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new C2943(this.f13843, this.f13844, i2, e);
        }
    }

    @Override // p000.AbstractC0438
    /* JADX INFO: renamed from: ۥۜ */
    public final void mo943(long j, int i) throws C2943 {
        mo941(i << 3);
        mo942(j);
    }

    @Override // p000.AbstractC0438
    /* JADX INFO: renamed from: ۦؑ */
    public final void mo944(int i, int i2) throws C2943 {
        mo941((i << 3) | i2);
    }

    @Override // p000.AbstractC0438
    /* JADX INFO: renamed from: ۦؚ */
    public final void mo945(int i, AbstractC4314 abstractC4314) throws C2943 {
        mo941((i << 3) | 2);
        mo946(abstractC4314);
    }

    @Override // p000.AbstractC0438
    /* JADX INFO: renamed from: ۦٌ */
    public final void mo946(AbstractC4314 abstractC4314) throws C2943 {
        mo941(abstractC4314.mo7605());
        abstractC4314.mo7607(this);
    }

    @Override // p000.AbstractC0438
    /* JADX INFO: renamed from: ۦِ */
    public final void mo947(int i, boolean z) throws C2943 {
        mo941(i << 3);
        mo954(z ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: renamed from: ۦٕ */
    public final int m7350() {
        return this.f13844 - this.f13843;
    }

    @Override // p000.AbstractC0438
    /* JADX INFO: renamed from: ۦٗ */
    public final void mo948(long j) throws C2943 {
        int i = this.f13843;
        try {
            byte[] bArr = this.f13842;
            bArr[i] = (byte) j;
            bArr[i + 1] = (byte) (j >> 8);
            bArr[i + 2] = (byte) (j >> 16);
            bArr[i + 3] = (byte) (j >> 24);
            bArr[i + 4] = (byte) (j >> 32);
            bArr[i + 5] = (byte) (j >> 40);
            bArr[i + 6] = (byte) (j >> 48);
            bArr[i + 7] = (byte) (j >> 56);
            this.f13843 = i + 8;
        } catch (IndexOutOfBoundsException e) {
            throw new C2943(i, this.f13844, 8, e);
        }
    }

    @Override // p000.AbstractC0438
    /* JADX INFO: renamed from: ۦٛ */
    public final void mo949(long j, int i) throws C2943 {
        mo941((i << 3) | 1);
        mo948(j);
    }

    @Override // p000.AbstractC0438
    /* JADX INFO: renamed from: ۦۗ */
    public final void mo950(int i, String str) throws C2943 {
        mo941((i << 3) | 2);
        mo953(str);
    }

    @Override // p000.AbstractC0438
    /* JADX INFO: renamed from: ۦۙ */
    public final void mo951(int i, int i2) throws C2943 {
        mo941((i << 3) | 5);
        mo937(i2);
    }

    @Override // p000.AbstractC0438
    /* JADX INFO: renamed from: ۦۚ */
    public final void mo952(int i, byte[] bArr) throws C2943 {
        mo941(i);
        m7349(bArr, 0, i);
    }

    @Override // p000.AbstractC0438
    /* JADX INFO: renamed from: ۦۛ */
    public final void mo953(String str) throws C2943 {
        int i = this.f13843;
        try {
            int iM935 = AbstractC0438.m935(str.length() * 3);
            int iM936 = AbstractC0438.m935(str.length());
            byte[] bArr = this.f13842;
            if (iM936 != iM935) {
                mo941(AbstractC5011.m8426(str));
                int i2 = this.f13843;
                this.f13843 = AbstractC5011.m8425(str, bArr, i2, bArr.length - i2);
            } else {
                int i3 = i + iM936;
                this.f13843 = i3;
                int iM8425 = AbstractC5011.m8425(str, bArr, i3, bArr.length - i3);
                this.f13843 = i;
                mo941((iM8425 - i) - iM936);
                this.f13843 = iM8425;
            }
        } catch (IndexOutOfBoundsException e) {
            throw new C2943(e);
        }
    }

    @Override // p000.AbstractC0438
    /* JADX INFO: renamed from: ۦ۟ */
    public final void mo954(byte b) throws C2943 {
        int i = this.f13843;
        try {
            int i2 = i + 1;
            try {
                this.f13842[i] = b;
                this.f13843 = i2;
            } catch (IndexOutOfBoundsException e) {
                e = e;
                i = i2;
                throw new C2943(i, this.f13844, 1, e);
            }
        } catch (IndexOutOfBoundsException e2) {
            e = e2;
        }
    }

    @Override // p000.AbstractC0438
    /* JADX INFO: renamed from: ۦۨ */
    public final void mo955(AbstractC3127 abstractC3127) throws C2943 {
        AbstractC5212 abstractC5212 = (AbstractC5212) abstractC3127;
        mo941(abstractC5212.m8830());
        abstractC5212.m8827(this);
    }
}
