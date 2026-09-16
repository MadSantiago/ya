package p000;

import androidx.compose.p002ui.tooling.PreviewActivity;

/* JADX INFO: renamed from: ۦ۟ */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0092 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ String f17499;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ String f17500;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f17501;

    public /* synthetic */ C0092(int i, String str, String str2) {
        this.f17501 = i;
        this.f17500 = str;
        this.f17499 = str2;
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) throws Exception {
        int i = this.f17501;
        C2358 c2358 = C2358.f7817;
        String str = this.f17499;
        String str2 = this.f17500;
        switch (i) {
            case 0:
                C5362 c5362 = (C5362) obj;
                int iIntValue = ((Integer) obj2).intValue();
                new C4441(new long[]{3663747486572449028L, -8729566781595395326L, -2670847805554782047L, -3369327017544673001L, 1608024326949482582L, 1288704344948400884L}).toString();
                if (!c5362.m9011(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c5362.m8982();
                } else {
                    AbstractC0495.m1105(AbstractC3761.m6629(str2, " - ", str), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c5362, 0, 0, 262142);
                }
                break;
            default:
                C5362 c5363 = (C5362) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i2 = PreviewActivity.f164;
                if (!c5363.m9011(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    c5363.m8982();
                } else {
                    AbstractC1434.m3038(str2, str, c5363, new Object[0]);
                }
                break;
        }
        return c2358;
    }
}
