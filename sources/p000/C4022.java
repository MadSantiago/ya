package p000;

/* JADX INFO: renamed from: ۦّؔؔٛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4022 {

    /* JADX INFO: renamed from: ۥؗ */
    public final Object[] f13413;

    /* JADX INFO: renamed from: ۥۗ */
    public final String f13414;

    /* JADX INFO: renamed from: ۥۣ */
    public final AbstractC0066 f13415;

    /* JADX INFO: renamed from: ۦؑ */
    public final int f13416;

    public C4022(AbstractC0318 abstractC0318, String str, Object[] objArr) {
        this.f13415 = abstractC0318;
        this.f13414 = str;
        this.f13413 = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f13416 = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char cCharAt2 = str.charAt(i3);
            if (cCharAt2 < 55296) {
                this.f13416 = i | (cCharAt2 << i2);
                return;
            } else {
                i |= (cCharAt2 & 8191) << i2;
                i2 += 13;
                i3 = i4;
            }
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final int m7194() {
        int i = this.f13416;
        if ((i & 1) != 0) {
            return 1;
        }
        return (i & 4) == 4 ? 3 : 2;
    }
}
