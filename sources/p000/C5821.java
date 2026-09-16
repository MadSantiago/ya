package p000;

/* JADX INFO: renamed from: ۦّۧؔۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5821 implements InterfaceC3028 {

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ C5277 f19164;

    public C5821(C5277 c5277) {
        this.f19164 = c5277;
    }

    @Override // p000.InterfaceC3028
    /* JADX INFO: renamed from: ۥ٘ */
    public final long mo2943(int i, long j, long j2) {
        C5277 c5277 = this.f19164;
        C5765 c5765 = c5277.f17393;
        if (!((Boolean) c5277.f17394.mo449()).booleanValue()) {
            return 0L;
        }
        int i2 = (int) (j & 4294967295L);
        c5765.f19006.m1710(Float.intBitsToFloat(i2) + c5765.f19006.m1711());
        int i3 = (int) (j2 & 4294967295L);
        if (Float.intBitsToFloat(i3) < 0.0f || Float.intBitsToFloat(i2) < 0.0f) {
            float fM1711 = c5765.f19005.m1711();
            c5765.m9576(Float.intBitsToFloat(i2) + c5765.f19005.m1711());
            return (((long) Float.floatToRawIntBits(c5765.f19005.m1711() - fM1711)) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
        }
        if (Float.intBitsToFloat(i3) <= 0.0f) {
            return 0L;
        }
        float fM1712 = c5765.f19005.m1711();
        c5765.m9576(Float.intBitsToFloat(i3) + c5765.f19005.m1711());
        return (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(c5765.f19005.m1711() - fM1712)) & 4294967295L);
    }

    @Override // p000.InterfaceC3028
    /* JADX INFO: renamed from: ۦٌ */
    public final long mo2946(long j, int i) {
        C5277 c5277 = this.f19164;
        C5765 c5765 = c5277.f17393;
        if (!((Boolean) c5277.f17394.mo449()).booleanValue()) {
            return 0L;
        }
        int i2 = (int) (4294967295L & j);
        if (Float.intBitsToFloat(i2) > 0.0f) {
            return 0L;
        }
        float fM1711 = c5765.f19005.m1711();
        c5765.m9576(Float.intBitsToFloat(i2) + c5765.f19005.m1711());
        if (fM1711 == c5765.f19005.m1711()) {
            return 0L;
        }
        return C1553.m3307(j, 0.0f, 2);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    @Override // p000.InterfaceC3028
    /* JADX INFO: renamed from: ۦۜ */
    public final Object mo2947(long j, long j2, InterfaceC0443 interfaceC0443) {
        C0577 c0577;
        long j3;
        long j4;
        C5277 c5277 = this.f19164;
        C5765 c5765 = c5277.f17393;
        if (interfaceC0443 instanceof C0577) {
            c0577 = (C0577) interfaceC0443;
            int i = c0577.f2063;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0577.f2063 = i - Integer.MIN_VALUE;
            } else {
                c0577 = new C0577(this, (AbstractC0772) interfaceC0443);
            }
        } else {
            c0577 = new C0577(this, (AbstractC0772) interfaceC0443);
        }
        C0577 c0578 = c0577;
        Object objMo2947 = c0578.f2060;
        int i2 = c0578.f2063;
        Object obj = EnumC2282.f7590;
        if (i2 != 0) {
            if (i2 == 1) {
                j3 = c0578.f2061;
                AbstractC0186.m409(objMo2947);
            } else {
                if (i2 != 2) {
                    C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j4 = c0578.f2061;
                AbstractC0186.m409(objMo2947);
            }
            return new C0963(C0963.m1996(j4, ((C0963) objMo2947).f3407));
        }
        AbstractC0186.m409(objMo2947);
        if (C0963.m1995(j2) > 0.0f) {
            c5765.f19006.m1710(0.0f);
        }
        c0578.f2061 = j2;
        c0578.f2063 = 1;
        objMo2947 = super.mo2947(j, j2, c0578);
        if (objMo2947 != obj) {
            j3 = j2;
        }
        return obj;
        long j5 = ((C0963) objMo2947).f3407;
        float fM1995 = C0963.m1995(j3);
        C5468 c5468 = c5277.f17390;
        InterfaceC3347 interfaceC3347 = c5277.f17392;
        c0578.f2061 = j5;
        c0578.f2063 = 2;
        objMo2947 = AbstractC2264.m4310(c5765, fM1995, c5468, interfaceC3347, c0578);
        if (objMo2947 != obj) {
            j4 = j5;
            return new C0963(C0963.m1996(j4, ((C0963) objMo2947).f3407));
        }
        return obj;
    }
}
