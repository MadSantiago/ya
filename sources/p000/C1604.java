package p000;

/* JADX INFO: renamed from: ۥ٘ؖ۟ؐ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1604 implements InterfaceC0738 {

    /* JADX INFO: renamed from: ۥؗ */
    public final C0969 f5380;

    /* JADX INFO: renamed from: ۥۗ */
    public final C5468 f5381;

    /* JADX INFO: renamed from: ۥۣ */
    public final C3369 f5382;

    /* JADX INFO: renamed from: ۦؑ */
    public final C5294 f5383 = AbstractC2927.f9841;

    public C1604(C3369 c3369, C5468 c5468, C0969 c0969) {
        this.f5382 = c3369;
        this.f5381 = c5468;
        this.f5380 = c0969;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1604) {
            C1604 c1604 = (C1604) obj;
            return c1604.f5380.equals(this.f5380) && AbstractC3831.m6874(c1604.f5381, this.f5381) && c1604.f5382 == this.f5382;
        }
        return false;
    }

    public final int hashCode() {
        return this.f5382.hashCode() + ((this.f5381.hashCode() + (this.f5380.hashCode() * 31)) * 31);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: ۥؗ */
    public final Object m3327(InterfaceC1437 interfaceC1437, float f, InterfaceC4745 interfaceC4745, AbstractC0772 abstractC0772) {
        C2892 c2892;
        if (abstractC0772 instanceof C2892) {
            c2892 = (C2892) abstractC0772;
            int i = c2892.f9644;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2892.f9644 = i - Integer.MIN_VALUE;
            } else {
                c2892 = new C2892(this, abstractC0772);
            }
        } else {
            c2892 = new C2892(this, abstractC0772);
        }
        Object objM3328 = c2892.f9643;
        int i2 = c2892.f9644;
        if (i2 == 0) {
            AbstractC0186.m409(objM3328);
            c2892.f9644 = 1;
            objM3328 = m3328(interfaceC1437, f, interfaceC4745, c2892);
            Object obj = EnumC2282.f7590;
            if (objM3328 == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC0186.m409(objM3328);
        }
        C3241 c3241 = (C3241) objM3328;
        return new Float(c3241.f10883.floatValue() != 0.0f ? ((Number) c3241.f10882.m6174()).floatValue() : 0.0f);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: ۥۗ */
    public final Object m3328(InterfaceC1437 interfaceC1437, float f, InterfaceC4745 interfaceC4745, AbstractC0772 abstractC0772) {
        C2888 c2888;
        InterfaceC4745 interfaceC4746;
        if (abstractC0772 instanceof C2888) {
            c2888 = (C2888) abstractC0772;
            int i = c2888.f9636;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2888.f9636 = i - Integer.MIN_VALUE;
            } else {
                c2888 = new C2888(this, abstractC0772);
            }
        } else {
            c2888 = new C2888(this, abstractC0772);
        }
        Object objM5144 = c2888.f9633;
        int i2 = c2888.f9636;
        if (i2 == 0) {
            AbstractC0186.m409(objM5144);
            C1304 c1304 = new C1304(this, f, interfaceC4745, interfaceC1437, null);
            c2888.f9634 = interfaceC4745;
            c2888.f9636 = 1;
            objM5144 = AbstractC2765.m5144(this.f5383, c1304, c2888);
            EnumC2282 enumC2282 = EnumC2282.f7590;
            if (objM5144 == enumC2282) {
                return enumC2282;
            }
            interfaceC4746 = interfaceC4745;
        } else {
            if (i2 != 1) {
                C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            interfaceC4746 = c2888.f9634;
            AbstractC0186.m409(objM5144);
        }
        C3241 c3241 = (C3241) objM5144;
        interfaceC4746.mo211(new Float(0.0f));
        return c3241;
    }

    @Override // p000.InterfaceC0738
    /* JADX INFO: renamed from: ۥۣ */
    public Object mo1625(C5113 c5113, float f, InterfaceC0443 interfaceC0443) {
        return m3327(c5113, f, AbstractC1631.f5465, (AbstractC0772) interfaceC0443);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: ۦؑ */
    public final Object m3329(InterfaceC1437 interfaceC1437, float f, float f2, C1603 c1603, AbstractC0772 abstractC0772) {
        C5182 c5182;
        InterfaceC4205 c1039;
        if (abstractC0772 instanceof C5182) {
            c5182 = (C5182) abstractC0772;
            int i = c5182.f17142;
            if ((i & Integer.MIN_VALUE) != 0) {
                c5182.f17142 = i - Integer.MIN_VALUE;
            } else {
                c5182 = new C5182(this, abstractC0772);
            }
        } else {
            c5182 = new C5182(this, abstractC0772);
        }
        C5182 c5183 = c5182;
        Object objMo2247 = c5183.f17141;
        int i2 = c5183.f17142;
        if (i2 == 0) {
            AbstractC0186.m409(objMo2247);
            if (Math.abs(f) == 0.0f || Math.abs(f2) == 0.0f) {
                return AbstractC4554.m7901(f, f2, 28);
            }
            c5183.f17142 = 1;
            C5468 c5468 = this.f5381;
            if (Math.abs(((C3893) new C1489(18, c5468.f18029).m3173(new C3893(0.0f), new C3893(f2))).f13013) >= Math.abs(f)) {
                c1039 = new C4228(17, c5468);
            } else {
                c1039 = new C1039(14, this.f5380);
            }
            objMo2247 = c1039.mo2247(interfaceC1437, new Float(f), new Float(f2), c1603, c5183);
            EnumC2282 enumC2282 = EnumC2282.f7590;
            if (objMo2247 == enumC2282) {
                return enumC2282;
            }
        } else {
            if (i2 != 1) {
                C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC0186.m409(objMo2247);
        }
        return ((C3241) objMo2247).f10882;
    }
}
