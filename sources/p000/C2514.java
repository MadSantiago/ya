package p000;

import android.graphics.Path;

/* JADX INFO: renamed from: ۥِٜ۠ؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2514 implements InterfaceC4745 {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ Object f8339;

    /* JADX INFO: renamed from: ۥٓ */
    public final /* synthetic */ int f8340;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ int f8341;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f8342;

    public /* synthetic */ C2514(int i, AbstractC0275 abstractC0275, int i2) {
        this.f8342 = 1;
        this.f8341 = i;
        this.f8339 = abstractC0275;
        this.f8340 = i2;
    }

    @Override // p000.InterfaceC4745
    /* JADX INFO: renamed from: ۦؚ */
    public final Object mo211(Object obj) {
        int i = this.f8342;
        C2358 c2358 = C2358.f7817;
        int i2 = this.f8340;
        int i3 = this.f8341;
        Object obj2 = this.f8339;
        switch (i) {
            case 0:
                AbstractC1842.m3626((AbstractC1842) obj, (AbstractC0275) obj2, i3, i2);
                break;
            case 1:
                AbstractC0275 abstractC0275 = (AbstractC0275) obj2;
                AbstractC1842.m3626((AbstractC1842) obj, abstractC0275, AbstractC2776.m5235((i3 - abstractC0275.f985) / 2.0f), AbstractC2776.m5235((i2 - abstractC0275.f984) / 2.0f));
                break;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                AbstractC1842.m3626((AbstractC1842) obj, (AbstractC0275) obj2, i3, i2);
                break;
            default:
                C0935 c0935 = (C0935) obj2;
                C0158 c0158 = (C0158) obj;
                C4303 c4303 = c0158.f601;
                int iM342 = c0158.m342(i3);
                int iM343 = c0158.m342(i2);
                CharSequence charSequence = c4303.f14233;
                if (iM342 < 0 || iM342 > iM343 || iM343 > charSequence.length()) {
                    AbstractC3767.m6644("start(" + iM342 + ") or end(" + iM343 + ") is out of range [0.." + charSequence.length() + "], or start > end!");
                }
                Path path = new Path();
                C0739 c0739 = c4303.f14237;
                c0739.f2683.getSelectionPath(iM342, iM343, path);
                int i4 = c0739.f2685;
                if (i4 != 0 && !path.isEmpty()) {
                    path.offset(0.0f, i4);
                }
                C0935 c0936 = new C0935(path);
                c0936.m1909((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(c0158.f599)) & 4294967295L));
                C0935.m1905(c0935, c0936);
                break;
        }
        return c2358;
    }

    public /* synthetic */ C2514(Object obj, int i, int i2, int i3) {
        this.f8342 = i3;
        this.f8339 = obj;
        this.f8341 = i;
        this.f8340 = i2;
    }
}
