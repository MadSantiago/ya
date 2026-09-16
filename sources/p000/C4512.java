package p000;

/* JADX INFO: renamed from: ۦؚٙؗٗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4512 implements InterfaceC4396 {

    /* JADX INFO: renamed from: ۥْ */
    public long f14908 = 0;

    /* JADX INFO: renamed from: ۦ۟ */
    public final InterfaceC3457 f14909;

    /* JADX INFO: renamed from: ۦۨ */
    public final InterfaceC5807 f14910;

    public C4512(InterfaceC5807 interfaceC5807, InterfaceC3457 interfaceC3457) {
        this.f14910 = interfaceC5807;
        this.f14909 = interfaceC3457;
    }

    @Override // p000.InterfaceC4396
    /* JADX INFO: renamed from: ۥؗ */
    public final long mo7596(C4730 c4730, long j, EnumC2459 enumC2459, long j2) {
        long jMo4099 = this.f14909.mo4099();
        if ((9223372034707292159L & jMo4099) == 9205357640488583168L) {
            jMo4099 = this.f14908;
        }
        this.f14908 = jMo4099;
        return C0873.m1861(C0873.m1861(c4730.m8055(), C5063.m8635(jMo4099)), this.f14910.mo608(j2, 0L, enumC2459));
    }
}
