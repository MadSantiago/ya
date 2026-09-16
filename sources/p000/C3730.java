package p000;

/* JADX INFO: renamed from: ۦٌٌؕۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3730 {

    /* JADX INFO: renamed from: ۥؗ */
    public final Object[] f12415;

    /* JADX INFO: renamed from: ۥۗ */
    public final String f12416;

    /* JADX INFO: renamed from: ۥۣ */
    public final AbstractC3127 f12417;

    /* JADX INFO: renamed from: ۦؑ */
    public final int f12418;

    public C3730(AbstractC3127 abstractC3127, String str, Object[] objArr) {
        this.f12417 = abstractC3127;
        this.f12416 = str;
        this.f12415 = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f12418 = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i2 = 1;
        int i3 = 13;
        while (true) {
            int i4 = i2 + 1;
            char cCharAt2 = str.charAt(i2);
            if (cCharAt2 < 55296) {
                this.f12418 = i | (cCharAt2 << i3);
                return;
            } else {
                i |= (cCharAt2 & 8191) << i3;
                i3 += 13;
                i2 = i4;
            }
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final int m6576() {
        int i = this.f12418;
        if ((i & 1) != 0) {
            return 1;
        }
        return (i & 4) == 4 ? 3 : 2;
    }
}
