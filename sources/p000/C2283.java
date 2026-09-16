package p000;

/* JADX INFO: renamed from: ۥٟۚؖۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2283 extends C2536 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۦۛ */
    public final /* synthetic */ int f7591;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2283(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.f7591 = i3;
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        int i = this.f7591;
        C2358 c2358 = C2358.f7817;
        Object obj3 = this.f8424;
        switch (i) {
            case 0:
                C0857 c0857 = (C0857) obj3;
                c0857.m1818(((Number) obj2).intValue(), (C5362) obj);
                break;
            case 1:
                C2677 c2677 = (C2677) obj3;
                AbstractC2765.m5135(c2677.f8873.m6097(), null, 0, new C4020(c2677, ((C0963) obj).f3407, null, 2), 3);
                break;
            default:
                C2677 c2678 = (C2677) obj3;
                AbstractC2765.m5135(c2678.f8873.m6097(), null, 0, new C4020(c2678, ((C0963) obj).f3407, null, 1), 3);
                break;
        }
        return c2358;
    }
}
