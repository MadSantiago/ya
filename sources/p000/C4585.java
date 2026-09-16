package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: ۦَٚؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4585 extends AbstractC1936 {

    /* JADX INFO: renamed from: ۥْ */
    public final byte[] f15131;

    public C4585(byte[] bArr) {
        bArr.getClass();
        this.f15131 = bArr;
    }

    @Override // p000.AbstractC4314
    /* JADX INFO: renamed from: ۥُ */
    public final AbstractC1936 mo7601(int i, int i2) {
        byte[] bArr = this.f15131;
        int iM7600 = AbstractC4314.m7600(0, i2, bArr.length);
        return iM7600 == 0 ? AbstractC4314.f14260 : new C5387(bArr, 0, iM7600);
    }

    @Override // p000.AbstractC4314
    /* JADX INFO: renamed from: ۥّ */
    public final void mo7602(int i, byte[] bArr) {
        System.arraycopy(this.f15131, 0, bArr, 0, i);
    }

    @Override // p000.AbstractC4314
    /* JADX INFO: renamed from: ۥۗ */
    public final byte mo7603(int i) {
        return this.f15131[i];
    }

    @Override // p000.AbstractC4314
    /* JADX INFO: renamed from: ۥۜ */
    public final boolean mo7604(AbstractC4314 abstractC4314) {
        boolean z = abstractC4314 instanceof C4585;
        byte[] bArr = this.f15131;
        if (z) {
            return Arrays.equals(bArr, ((C4585) abstractC4314).f15131);
        }
        boolean z2 = abstractC4314 instanceof C5387;
        if (!z2) {
            return abstractC4314.mo7604(this);
        }
        C5387 c5387 = (C5387) abstractC4314;
        int i = c5387.f17804;
        int length = bArr.length;
        if (length > i) {
            StringBuilder sb = new StringBuilder(String.valueOf(length).length() + 18 + String.valueOf(length).length());
            sb.append("Length too large: ");
            sb.append(length);
            sb.append(length);
            throw new IllegalArgumentException(sb.toString());
        }
        if (length <= i) {
            if (z) {
                return AbstractC4314.m7599(bArr, 0, ((C4585) abstractC4314).f15131, 0, length);
            }
            return z2 ? AbstractC4314.m7599(bArr, 0, c5387.f17805, c5387.f17806, length) : abstractC4314.mo7601(0, length).equals(mo7601(0, length));
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(length).length() + 27 + String.valueOf(i).length());
        sb2.append("Ran off end of other: 0, ");
        sb2.append(length);
        sb2.append(", ");
        sb2.append(i);
        throw new IllegalArgumentException(sb2.toString());
    }

    @Override // p000.AbstractC4314
    /* JADX INFO: renamed from: ۦؑ */
    public final int mo7605() {
        return this.f15131.length;
    }

    @Override // p000.AbstractC4314
    /* JADX INFO: renamed from: ۦٛ */
    public final int mo7606(int i, int i2) {
        return AbstractC1963.m3845(i, this.f15131, 0, i2);
    }

    @Override // p000.AbstractC4314
    /* JADX INFO: renamed from: ۦۙ */
    public final void mo7607(AbstractC0438 abstractC0438) {
        byte[] bArr = this.f15131;
        abstractC0438.mo936(bArr, 0, bArr.length);
    }
}
