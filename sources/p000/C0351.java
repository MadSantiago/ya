package p000;

/* JADX INFO: renamed from: ۥًؓۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0351 implements InterfaceC1400 {

    /* JADX INFO: renamed from: ۥۗ */
    public final int f1282;

    /* JADX INFO: renamed from: ۥۣ */
    public final int f1283;

    public C0351(int i, int i2) {
        this.f1283 = i;
        this.f1282 = i2;
        if (i >= 0 && i2 >= 0) {
            return;
        }
        AbstractC3767.m6644("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i2 + " respectively.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0351)) {
            return false;
        }
        C0351 c0351 = (C0351) obj;
        return this.f1283 == c0351.f1283 && this.f1282 == c0351.f1282;
    }

    public final int hashCode() {
        return (this.f1283 * 31) + this.f1282;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeleteSurroundingTextCommand(lengthBeforeCursor=");
        sb.append(this.f1283);
        sb.append(", lengthAfterCursor=");
        return AbstractC3761.m6638(sb, this.f1282, ')');
    }

    @Override // p000.InterfaceC1400
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo773(C1093 c1093) {
        int i = c1093.f3838;
        C0835 c0835 = c1093.f3841;
        int i2 = this.f1282;
        int iM1730 = i + i2;
        if (((i ^ iM1730) & (i2 ^ iM1730)) < 0) {
            iM1730 = c0835.m1730();
        }
        c1093.m2312(c1093.f3838, Math.min(iM1730, c0835.m1730()));
        int i3 = c1093.f3840;
        int i4 = this.f1283;
        int i5 = i3 - i4;
        if (((i4 ^ i3) & (i3 ^ i5)) < 0) {
            i5 = 0;
        }
        c1093.m2312(Math.max(0, i5), c1093.f3840);
    }
}
