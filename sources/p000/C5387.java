package p000;

/* JADX INFO: renamed from: ۦً۠ؒۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5387 extends AbstractC1936 {

    /* JADX INFO: renamed from: ۥَ */
    public final int f17804;

    /* JADX INFO: renamed from: ۥْ */
    public final byte[] f17805;

    /* JADX INFO: renamed from: ۥٓ */
    public final int f17806;

    public C5387(byte[] bArr, int i, int i2) {
        AbstractC4314.m7600(i, i + i2, bArr.length);
        this.f17805 = bArr;
        this.f17806 = i;
        this.f17804 = i2;
    }

    @Override // p000.AbstractC4314
    /* JADX INFO: renamed from: ۥُ */
    public final AbstractC1936 mo7601(int i, int i2) {
        int iM7600 = AbstractC4314.m7600(i, i2, this.f17804);
        if (iM7600 == 0) {
            return AbstractC4314.f14260;
        }
        return new C5387(this.f17805, this.f17806 + i, iM7600);
    }

    @Override // p000.AbstractC4314
    /* JADX INFO: renamed from: ۥّ */
    public final void mo7602(int i, byte[] bArr) {
        System.arraycopy(this.f17805, this.f17806, bArr, 0, i);
    }

    @Override // p000.AbstractC4314
    /* JADX INFO: renamed from: ۥۗ */
    public final byte mo7603(int i) {
        return this.f17805[this.f17806 + i];
    }

    @Override // p000.AbstractC4314
    /* JADX INFO: renamed from: ۥۜ */
    public final boolean mo7604(AbstractC4314 abstractC4314) {
        boolean z = abstractC4314 instanceof C4585;
        if (!z && !(abstractC4314 instanceof C5387)) {
            return abstractC4314.mo7604(this);
        }
        int iMo7605 = abstractC4314.mo7605();
        int i = this.f17804;
        if (i > iMo7605) {
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 18 + String.valueOf(i).length());
            sb.append("Length too large: ");
            sb.append(i);
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        if (i <= abstractC4314.mo7605()) {
            byte[] bArr = this.f17805;
            int i2 = this.f17806;
            if (z) {
                return AbstractC4314.m7599(bArr, i2, ((C4585) abstractC4314).f15131, 0, i);
            }
            if (!(abstractC4314 instanceof C5387)) {
                return abstractC4314.mo7601(0, i).equals(mo7601(i2, i + i2));
            }
            C5387 c5387 = (C5387) abstractC4314;
            return AbstractC4314.m7599(bArr, i2, c5387.f17805, c5387.f17806, i);
        }
        int iMo7606 = abstractC4314.mo7605();
        StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 27 + String.valueOf(iMo7606).length());
        sb2.append("Ran off end of other: 0, ");
        sb2.append(i);
        sb2.append(", ");
        sb2.append(iMo7606);
        throw new IllegalArgumentException(sb2.toString());
    }

    @Override // p000.AbstractC4314
    /* JADX INFO: renamed from: ۦؑ */
    public final int mo7605() {
        return this.f17804;
    }

    @Override // p000.AbstractC4314
    /* JADX INFO: renamed from: ۦٛ */
    public final int mo7606(int i, int i2) {
        return AbstractC1963.m3845(i, this.f17805, this.f17806, i2);
    }

    @Override // p000.AbstractC4314
    /* JADX INFO: renamed from: ۦۙ */
    public final void mo7607(AbstractC0438 abstractC0438) {
        abstractC0438.mo936(this.f17805, this.f17806, this.f17804);
    }
}
