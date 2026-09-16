package p000;

/* JADX INFO: renamed from: ۦِٝؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3994 implements InterfaceC1400 {

    /* JADX INFO: renamed from: ۥۗ */
    public final int f13325;

    /* JADX INFO: renamed from: ۥۣ */
    public final int f13326;

    public C3994(int i, int i2) {
        this.f13326 = i;
        this.f13325 = i2;
        if (i >= 0 && i2 >= 0) {
            return;
        }
        AbstractC3767.m6644("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i2 + " respectively.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3994)) {
            return false;
        }
        C3994 c3994 = (C3994) obj;
        return this.f13326 == c3994.f13326 && this.f13325 == c3994.f13325;
    }

    public final int hashCode() {
        return (this.f13326 * 31) + this.f13325;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=");
        sb.append(this.f13326);
        sb.append(", lengthAfterCursor=");
        return AbstractC3761.m6638(sb, this.f13325, ')');
    }

    @Override // p000.InterfaceC1400
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo773(C1093 c1093) {
        int i = 0;
        for (int i2 = 0; i2 < this.f13326; i2++) {
            int i3 = i + 1;
            int i4 = c1093.f3840;
            if (i4 <= i3) {
                i = i4;
                break;
            }
            i = (Character.isHighSurrogate(c1093.m2310((i4 - i3) + (-1))) && Character.isLowSurrogate(c1093.m2310(c1093.f3840 - i3))) ? i + 2 : i3;
        }
        int iM1730 = 0;
        for (int i5 = 0; i5 < this.f13325; i5++) {
            int i6 = iM1730 + 1;
            int i7 = c1093.f3838;
            C0835 c0835 = c1093.f3841;
            if (i7 + i6 >= c0835.m1730()) {
                iM1730 = c0835.m1730() - c1093.f3838;
                break;
            }
            iM1730 = (Character.isHighSurrogate(c1093.m2310((c1093.f3838 + i6) + (-1))) && Character.isLowSurrogate(c1093.m2310(c1093.f3838 + i6))) ? iM1730 + 2 : i6;
        }
        int i8 = c1093.f3838;
        c1093.m2312(i8, iM1730 + i8);
        int i9 = c1093.f3840;
        c1093.m2312(i9 - i, i9);
    }
}
