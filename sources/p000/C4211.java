package p000;

/* JADX INFO: renamed from: ۦٕؑۘۥ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4211 extends C0533 {

    /* JADX INFO: renamed from: ۥَ */
    public final int f13979;

    /* JADX INFO: renamed from: ۥٖ */
    public final int f13980;

    public C4211(byte[] bArr, int i, int i2) {
        super(bArr);
        C0533.m1186(i, i + i2, bArr.length);
        this.f13979 = i;
        this.f13980 = i2;
    }

    @Override // p000.C0533
    public final int size() {
        return this.f13980;
    }

    @Override // p000.C0533
    /* JADX INFO: renamed from: ۥّ */
    public final void mo1187(int i, byte[] bArr) {
        System.arraycopy(this.f1876, this.f13979, bArr, 0, i);
    }

    @Override // p000.C0533
    /* JADX INFO: renamed from: ۥۗ */
    public final byte mo1188(int i) {
        int i2 = this.f13980;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.f1876[this.f13979 + i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(AbstractC5078.m8670(i, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(AbstractC5078.m8679("Index > length: ", i, i2, ", "));
    }

    @Override // p000.C0533
    /* JADX INFO: renamed from: ۥۜ */
    public final byte mo1189(int i) {
        return this.f1876[this.f13979 + i];
    }

    @Override // p000.C0533
    /* JADX INFO: renamed from: ۦۙ */
    public final int mo1190() {
        return this.f13979;
    }
}
