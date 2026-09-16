package p000;

import java.util.List;

/* JADX INFO: renamed from: ۥٍؖۗۦ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0970 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ C2384 f3425;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ List f3426;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f3427;

    public /* synthetic */ C0970(List list, C2384 c2384, int i, int i2) {
        this.f3427 = i2;
        this.f3426 = list;
        this.f3425 = c2384;
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        int i = this.f3427;
        C2358 c2358 = C2358.f7817;
        C2384 c2384 = this.f3425;
        List list = this.f3426;
        C5362 c5362 = (C5362) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                AbstractC4489.m7792(list, c2384, c5362, AbstractC3831.m6835(7));
                break;
            default:
                AbstractC4489.m7815(list, c2384, c5362, AbstractC3831.m6835(7));
                break;
        }
        return c2358;
    }
}
