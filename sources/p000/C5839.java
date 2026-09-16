package p000;

/* JADX INFO: renamed from: ۦۧؗؒۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5839 extends C2748 {
    /* JADX WARN: Illegal instructions before constructor call */
    public C5839(String str, String str2) {
        char[] charArray = str2.toCharArray();
        super(new C5170(str, charArray), (Character) '=');
        AbstractC0949.m1941(charArray.length == 64);
    }

    @Override // p000.C2748
    /* JADX INFO: renamed from: ۥؗ */
    public final void mo5105(StringBuilder sb, byte[] bArr, int i) {
        int i2 = 0;
        AbstractC0949.m1968(0, i, bArr.length);
        for (int i3 = i; i3 >= 3; i3 -= 3) {
            int i4 = i2 + 2;
            int i5 = ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2] & 255) << 16);
            i2 += 3;
            int i6 = i5 | (bArr[i4] & 255);
            C5170 c5170 = this.f9095;
            char[] cArr = c5170.f17115;
            char[] cArr2 = c5170.f17115;
            sb.append(cArr[i6 >>> 18]);
            sb.append(cArr2[(i6 >>> 12) & 63]);
            sb.append(cArr2[(i6 >>> 6) & 63]);
            sb.append(cArr2[i6 & 63]);
        }
        if (i2 < i) {
            m5106(sb, bArr, i2, i - i2);
        }
    }
}
