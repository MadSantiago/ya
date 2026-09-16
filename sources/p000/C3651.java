package p000;

/* JADX INFO: renamed from: ۦًٖؒٛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3651 implements InterfaceC0738 {

    /* JADX INFO: renamed from: ۥۗ */
    public final C2384 f12214;

    /* JADX INFO: renamed from: ۥۣ */
    public final C1604 f12215;

    public C3651(C1604 c1604, C2384 c2384) {
        this.f12215 = c1604;
        this.f12214 = c2384;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p000.InterfaceC0738
    /* JADX INFO: renamed from: ۥۣ */
    public final Object mo1625(C5113 c5113, float f, InterfaceC0443 interfaceC0443) {
        C3942 c3942;
        if (interfaceC0443 instanceof C3942) {
            c3942 = (C3942) interfaceC0443;
            int i = c3942.f13156;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3942.f13156 = i - Integer.MIN_VALUE;
            } else {
                c3942 = new C3942(this, (AbstractC0772) interfaceC0443);
            }
        } else {
            c3942 = new C3942(this, (AbstractC0772) interfaceC0443);
        }
        Object objM3327 = c3942.f13155;
        int i2 = c3942.f13156;
        InterfaceC0443 interfaceC0444 = null;
        if (i2 == 0) {
            AbstractC0186.m409(objM3327);
            C0091 c0091 = new C0091(23, this, c5113);
            c3942.f13156 = 1;
            objM3327 = this.f12215.m3327(c5113, f, c0091, c3942);
            EnumC2282 enumC2282 = EnumC2282.f7590;
            if (objM3327 == enumC2282) {
                return enumC2282;
            }
        } else {
            if (i2 != 1) {
                C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC0186.m409(objM3327);
        }
        float fFloatValue = ((Number) objM3327).floatValue();
        C2384 c2384 = this.f12214;
        if (c2384.m1401() != 0.0f && Math.abs(c2384.m1401()) < 0.001d) {
            int iM1405 = c2384.m1405();
            if (c2384.f2357.mo1397()) {
                AbstractC2765.m5135(((C2257) c2384.f2351.getValue()).f7484, null, 0, new C3159(c2384, interfaceC0444, 2), 3);
            }
            c2384.m1396(iM1405, 0.0f, false);
        } else {
            new Float(c2384.m1401());
        }
        return new Float(fFloatValue);
    }
}
