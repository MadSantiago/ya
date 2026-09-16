package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: ۥًِٙؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1661 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ ArrayList f5524;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ C1542 f5525;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f5526;

    public /* synthetic */ C1661(C1542 c1542, ArrayList arrayList, int i, int i2) {
        this.f5526 = i2;
        this.f5525 = c1542;
        this.f5524 = arrayList;
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        int i = this.f5526;
        C2358 c2358 = C2358.f7817;
        ArrayList arrayList = this.f5524;
        C1542 c1542 = this.f5525;
        C5362 c5362 = (C5362) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                AbstractC3801.m6746(c1542, arrayList, c5362, AbstractC3831.m6835(1));
                break;
            default:
                AbstractC2774.m5185(c1542, arrayList, c5362, AbstractC3831.m6835(1));
                break;
        }
        return c2358;
    }
}
