package p000;

/* JADX INFO: renamed from: ۦؚۙؗٙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5129 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ Object f17001;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f17002;

    public /* synthetic */ C5129(int i, Object obj) {
        this.f17002 = i;
        this.f17001 = obj;
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        int i = this.f17002;
        Object obj3 = this.f17001;
        switch (i) {
            case 0:
                return new C0873(((C3039) obj3).mo608(0L, ((C4207) obj).f13969, (EnumC2459) obj2));
            default:
                return new C0873(((long) ((C4274) obj3).m7577(0, (int) (((C4207) obj).f13969 & 4294967295L))) & 4294967295L);
        }
    }
}
