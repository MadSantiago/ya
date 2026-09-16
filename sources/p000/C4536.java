package p000;

import java.util.Iterator;

/* JADX INFO: renamed from: ۦٚؒ۟ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4536 {

    /* JADX INFO: renamed from: ۥؗ */
    public final C0463 f14987;

    /* JADX INFO: renamed from: ۥۗ */
    public final InterfaceC4448 f14990;

    /* JADX INFO: renamed from: ۥۣ */
    public final C2288 f14992;

    /* JADX INFO: renamed from: ۦؑ */
    public final InterfaceC4745 f14993;

    /* JADX INFO: renamed from: ۦؚ */
    public final C4852 f14994;

    /* JADX INFO: renamed from: ۦٌ */
    public final C2099 f14995;

    /* JADX INFO: renamed from: ۦِ */
    public final C0811 f14996;

    /* JADX INFO: renamed from: ۦٛ */
    public final C0811 f14997;

    /* JADX INFO: renamed from: ۦۗ */
    public final C4852 f14998;

    /* JADX INFO: renamed from: ۦۙ */
    public final C4852 f14999;

    /* JADX INFO: renamed from: ۥُ */
    public final C2538 f14988 = new C2538();

    /* JADX INFO: renamed from: ۥّ */
    public final C0861 f14989 = new C0861(this);

    /* JADX INFO: renamed from: ۥۜ */
    public final C5704 f14991 = AbstractC3004.m5600(new C1907(this, 0));

    public C4536(EnumC0845 enumC0845, C2288 c2288, InterfaceC4448 interfaceC4448, C0463 c0463, InterfaceC4745 interfaceC4745) {
        this.f14992 = c2288;
        this.f14990 = interfaceC4448;
        this.f14987 = c0463;
        this.f14993 = interfaceC4745;
        this.f14999 = AbstractC2774.m5183(enumC0845);
        AbstractC3004.m5600(new C1907(this, 1));
        this.f14997 = new C0811(Float.NaN);
        new C5592(0);
        new C5683(AbstractC1538.m3278().mo5118());
        this.f14996 = new C0811(0.0f);
        this.f14998 = AbstractC2774.m5183(null);
        this.f14994 = AbstractC2774.m5183(new C3402(C0204.f751));
        this.f14995 = new C2099(this);
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final Object m7856(float f, float f2, Object obj) {
        C3402 c3402M7862 = m7862();
        float fM6157 = c3402M7862.m6157(obj);
        float fFloatValue = ((Number) this.f14990.mo449()).floatValue();
        if (fM6157 != f && !Float.isNaN(fM6157)) {
            C2288 c2288 = this.f14992;
            if (fM6157 < f) {
                if (f2 >= fFloatValue) {
                    return c3402M7862.m6155(f, true);
                }
                Object objM6155 = c3402M7862.m6155(f, true);
                if (f >= Math.abs(Math.abs(((Number) c2288.mo211(Float.valueOf(Math.abs(c3402M7862.m6157(objM6155) - fM6157)))).floatValue()) + fM6157)) {
                    return objM6155;
                }
            } else {
                if (f2 <= (-fFloatValue)) {
                    return c3402M7862.m6155(f, false);
                }
                Object objM6156 = c3402M7862.m6155(f, false);
                float fAbs = Math.abs(fM6157 - Math.abs(((Number) c2288.mo211(Float.valueOf(Math.abs(fM6157 - c3402M7862.m6157(objM6156))))).floatValue()));
                if (f >= 0.0f ? f <= fAbs : Math.abs(f) >= fAbs) {
                    return objM6156;
                }
            }
        }
        return obj;
    }

    /* JADX INFO: renamed from: ۥُ */
    public final float m7857(float f) {
        Float fValueOf;
        C0811 c0811 = this.f14997;
        float fM1711 = (Float.isNaN(c0811.m1711()) ? 0.0f : c0811.m1711()) + f;
        float fM6154 = m7862().m6154();
        Iterator it = m7862().f11319.values().iterator();
        if (it.hasNext()) {
            float fFloatValue = ((Number) it.next()).floatValue();
            while (it.hasNext()) {
                fFloatValue = Math.max(fFloatValue, ((Number) it.next()).floatValue());
            }
            fValueOf = Float.valueOf(fFloatValue);
        } else {
            fValueOf = null;
        }
        return AbstractC4554.m7922(fM1711, fM6154, fValueOf != null ? fValueOf.floatValue() : Float.NaN);
    }

    /* JADX INFO: renamed from: ۥّ */
    public final float m7858() {
        C0811 c0811 = this.f14997;
        if (!Float.isNaN(c0811.m1711())) {
            return c0811.m1711();
        }
        C1078.m2276("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
        return 0.0f;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۥۗ */
    public final Object m7859(Object obj, EnumC4386 enumC4386, InterfaceC3275 interfaceC3275, AbstractC0772 abstractC0772) {
        C0343 c0343;
        C0811 c0811;
        Object objM6156;
        C0811 c0812;
        if (abstractC0772 instanceof C0343) {
            c0343 = (C0343) abstractC0772;
            int i = c0343.f1272;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0343.f1272 = i - Integer.MIN_VALUE;
            } else {
                c0343 = new C0343(this, abstractC0772);
            }
        } else {
            c0343 = new C0343(this, abstractC0772);
        }
        C0343 c0344 = c0343;
        Object obj2 = c0344.f1271;
        int i2 = c0344.f1272;
        InterfaceC4745 interfaceC4745 = this.f14993;
        InterfaceC0443 interfaceC0443 = null;
        Object obj3 = this.f14997;
        try {
            if (i2 == 0) {
                AbstractC0186.m409(obj2);
                if (m7862().f11319.containsKey(obj)) {
                    C2538 c2538 = this.f14988;
                    try {
                        C4430 c4430 = new C4430(this, obj, interfaceC3275, interfaceC0443, 0);
                        c0344.f1272 = 1;
                        c2538.getClass();
                        c0811 = obj3;
                        try {
                            C4522 c4522 = new C4522(enumC4386, c2538, c4430, interfaceC0443, 2);
                            Object objM7173 = AbstractC4009.m7173(c4522, c0344);
                            EnumC2282 enumC2282 = EnumC2282.f7590;
                            c0812 = c0811;
                            obj3 = c4522;
                            if (objM7173 == enumC2282) {
                                return enumC2282;
                            }
                        } catch (Throwable th) {
                            th = th;
                            m7860(interfaceC0443);
                            objM6156 = m7862().m6156(c0811.m1711());
                            if (objM6156 != null && Math.abs(c0811.m1711() - m7862().m6157(objM6156)) <= 0.5f && ((Boolean) interfaceC4745.mo211(objM6156)).booleanValue()) {
                                m7863(objM6156);
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        interfaceC0443 = null;
                        c0811 = obj3;
                        m7860(interfaceC0443);
                        objM6156 = m7862().m6156(c0811.m1711());
                        if (objM6156 != null) {
                            m7863(objM6156);
                        }
                        throw th;
                    }
                } else {
                    m7863(obj);
                }
                return C2358.f7817;
            }
            if (i2 != 1) {
                C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC0186.m409(obj2);
            c0812 = obj3;
            obj3 = obj3;
            m7860(null);
            Object objM6157 = m7862().m6156(c0812.m1711());
            if (objM6157 != null && Math.abs(c0812.m1711() - m7862().m6157(objM6157)) <= 0.5f && ((Boolean) interfaceC4745.mo211(objM6157)).booleanValue()) {
                m7863(objM6157);
            }
            return C2358.f7817;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX INFO: renamed from: ۥۜ */
    public final void m7860(Object obj) {
        this.f14998.setValue(obj);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: ۥۣ */
    public final Object m7861(EnumC4386 enumC4386, C0629 c0629, AbstractC0772 abstractC0772) {
        C0496 c0496;
        if (abstractC0772 instanceof C0496) {
            c0496 = (C0496) abstractC0772;
            int i = c0496.f1790;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0496.f1790 = i - Integer.MIN_VALUE;
            } else {
                c0496 = new C0496(this, abstractC0772);
            }
        } else {
            c0496 = new C0496(this, abstractC0772);
        }
        Object obj = c0496.f1789;
        int i2 = c0496.f1790;
        InterfaceC4745 interfaceC4745 = this.f14993;
        C0811 c0811 = this.f14997;
        try {
            if (i2 == 0) {
                AbstractC0186.m409(obj);
                C2538 c2538 = this.f14988;
                InterfaceC0443 interfaceC0443 = null;
                C4117 c4117 = new C4117(this, c0629, interfaceC0443, 0);
                c0496.f1790 = 1;
                c2538.getClass();
                Object objM7173 = AbstractC4009.m7173(new C4522(enumC4386, c2538, c4117, interfaceC0443, 2), c0496);
                EnumC2282 enumC2282 = EnumC2282.f7590;
                if (objM7173 == enumC2282) {
                    return enumC2282;
                }
            } else {
                if (i2 != 1) {
                    C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC0186.m409(obj);
            }
            Object objM6156 = m7862().m6156(c0811.m1711());
            if (objM6156 != null && Math.abs(c0811.m1711() - m7862().m6157(objM6156)) <= 0.5f && ((Boolean) interfaceC4745.mo211(objM6156)).booleanValue()) {
                m7863(objM6156);
            }
            return C2358.f7817;
        } catch (Throwable th) {
            Object objM6157 = m7862().m6156(c0811.m1711());
            if (objM6157 == null || Math.abs(c0811.m1711() - m7862().m6157(objM6157)) > 0.5f || !((Boolean) interfaceC4745.mo211(objM6157)).booleanValue()) {
                throw th;
            }
            m7863(objM6157);
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final C3402 m7862() {
        return (C3402) this.f14994.getValue();
    }

    /* JADX INFO: renamed from: ۦۙ */
    public final void m7863(Object obj) {
        this.f14999.setValue(obj);
    }
}
