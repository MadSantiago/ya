package p000;

/* JADX INFO: renamed from: ۦٍِۨؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5884 extends C2748 {

    /* JADX INFO: renamed from: ۦؑ */
    public final char[] f19414;

    /* JADX WARN: Illegal instructions before constructor call */
    public C5884() {
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        super(new C5170("base16()", cArr), (Character) null);
        this.f19414 = new char[512];
        for (int i = 0; i < 256; i++) {
            char[] cArr2 = this.f19414;
            cArr2[i] = cArr[i >>> 4];
            cArr2[i | 256] = cArr[i & 15];
        }
    }

    @Override // p000.C2748
    /* JADX INFO: renamed from: ۥؗ */
    public final void mo5105(StringBuilder sb, byte[] bArr, int i) {
        AbstractC0949.m1968(0, i, bArr.length);
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = bArr[i2] & 255;
            char[] cArr = this.f19414;
            sb.append(cArr[i3]);
            sb.append(cArr[i3 | 256]);
        }
    }
}
