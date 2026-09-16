package p000;

import android.view.ViewTreeObserver;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: ۦٚؓۧۦ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4545 {

    /* JADX INFO: renamed from: ۥؗ */
    public InterfaceC0738 f15010;

    /* JADX INFO: renamed from: ۥُ */
    public boolean f15011;

    /* JADX INFO: renamed from: ۥّ */
    public C3323 f15012;

    /* JADX INFO: renamed from: ۥۗ */
    public C2851 f15013;

    /* JADX INFO: renamed from: ۥۜ */
    public final C0197 f15014;

    /* JADX INFO: renamed from: ۥۣ */
    public InterfaceC3096 f15015;

    /* JADX INFO: renamed from: ۦؑ */
    public EnumC1616 f15016;

    /* JADX INFO: renamed from: ۦٛ */
    public boolean f15020;

    /* JADX INFO: renamed from: ۦۙ */
    public final C2677 f15022;

    /* JADX INFO: renamed from: ۦِ */
    public int f15019 = 1;

    /* JADX INFO: renamed from: ۦۗ */
    public InterfaceC1437 f15021 = AbstractC2927.f9842;

    /* JADX INFO: renamed from: ۦؚ */
    public final C3594 f15017 = new C3594(this);

    /* JADX INFO: renamed from: ۦٌ */
    public final C4884 f15018 = new C4884(3, this);

    public C4545(InterfaceC3096 interfaceC3096, C2851 c2851, InterfaceC0738 interfaceC0738, EnumC1616 enumC1616, boolean z, C3323 c3323, C2677 c2677, C0197 c0197) {
        this.f15015 = interfaceC3096;
        this.f15013 = c2851;
        this.f15010 = interfaceC0738;
        this.f15016 = enumC1616;
        this.f15011 = z;
        this.f15012 = c3323;
        this.f15022 = c2677;
        this.f15014 = c0197;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final long m7866(InterfaceC1437 interfaceC1437, long j, int i) {
        C1386 c1386 = this.f15012.f11134;
        C1386 c1386M2944 = c1386 != null ? c1386.m2944() : null;
        long jMo2946 = c1386M2944 != null ? c1386M2944.mo2946(j, i) : 0L;
        long jM3308 = C1553.m3308(j, jMo2946);
        long jM7867 = m7867(m7870(interfaceC1437.mo927(m7874(m7867(this.f15016 == EnumC1616.f5424 ? C1553.m3307(jM3308, 0.0f, 1) : C1553.m3307(jM3308, 0.0f, 2))))));
        C2677 c2677 = this.f15022;
        if (c2677.f17786) {
            ViewTreeObserver viewTreeObserver = ((ViewTreeObserverOnGlobalLayoutListenerC0850) AbstractC5537.m9224(c2677)).getViewTreeObserver();
            try {
                Method declaredMethod = ViewTreeObserverOnGlobalLayoutListenerC0850.f19553;
                if (declaredMethod == null) {
                    declaredMethod = viewTreeObserver.getClass().getDeclaredMethod("dispatchOnScrollChanged", null);
                    declaredMethod.setAccessible(true);
                    ViewTreeObserverOnGlobalLayoutListenerC0850.f19553 = declaredMethod;
                }
                declaredMethod.invoke(viewTreeObserver, null);
            } catch (Exception unused) {
            }
        }
        long jM3309 = C1553.m3308(jM3308, jM7867);
        C1386 c1387 = this.f15012.f11134;
        C1386 c1386M2945 = c1387 != null ? c1387.m2944() : null;
        return C1553.m3304(C1553.m3304(jMo2946, jM7867), c1386M2945 != null ? c1386M2945.mo2943(i, jM7867, jM3309) : 0L);
    }

    /* JADX INFO: renamed from: ۥُ */
    public final long m7867(long j) {
        return this.f15011 ? C1553.m3305(-1.0f, j) : j;
    }

    /* JADX INFO: renamed from: ۥّ */
    public final Object m7868(EnumC4386 enumC4386, InterfaceC5731 interfaceC5731, AbstractC0772 abstractC0772) {
        Object objMo1392 = this.f15015.mo1392(enumC4386, new C0061(this, interfaceC5731, null, 28), abstractC0772);
        return objMo1392 == EnumC2282.f7590 ? objMo1392 : C2358.f7817;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001a  */
    /* JADX WARN: Code duplicated, block: B:21:0x003f  */
    /* JADX WARN: Code duplicated, block: B:23:0x004e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x000d  */
    /* JADX WARN: Code duplicated, block: B:9:0x0014  */
    /* JADX INFO: renamed from: ۥۗ */
    public final Object m7869(long j, boolean z, AbstractC2426 abstractC2426) {
        int i;
        long jM1999;
        C0816 c0816;
        C2851 c2851;
        EnumC2282 enumC2282;
        Object objMo218;
        C2358 c2358 = C2358.f7817;
        if (z) {
            InterfaceC0738 interfaceC0738 = this.f15010;
            C4215 c4215 = AbstractC2927.f9843;
            if (!(interfaceC0738 instanceof C3645)) {
                if (this.f15016 == EnumC1616.f5424) {
                    i = 1;
                } else {
                    i = 2;
                }
                jM1999 = C0963.m1999(j, 0.0f, 0.0f, i);
                c0816 = new C0816(this, null);
                c2851 = this.f15013;
                enumC2282 = EnumC2282.f7590;
                if (c2851 == null && (this.f15015.mo1391() || this.f15015.mo1399())) {
                    Object objM5411 = c2851.m5411(jM1999, c0816, abstractC2426);
                    if (objM5411 == enumC2282) {
                        return objM5411;
                    }
                } else {
                    C0816 c0817 = new C0816(c0816.f2907, abstractC2426);
                    c0817.f2906 = jM1999;
                    objMo218 = c0817.mo218(c2358);
                    if (objMo218 == enumC2282) {
                        return objMo218;
                    }
                }
            }
        } else {
            if (this.f15016 == EnumC1616.f5424) {
                i = 1;
            } else {
                i = 2;
            }
            jM1999 = C0963.m1999(j, 0.0f, 0.0f, i);
            c0816 = new C0816(this, null);
            c2851 = this.f15013;
            enumC2282 = EnumC2282.f7590;
            if (c2851 == null) {
                C0816 c0818 = new C0816(c0816.f2907, abstractC2426);
                c0818.f2906 = jM1999;
                objMo218 = c0818.mo218(c2358);
                if (objMo218 == enumC2282) {
                    return objMo218;
                }
            } else {
                C0816 c0819 = new C0816(c0816.f2907, abstractC2426);
                c0819.f2906 = jM1999;
                objMo218 = c0819.mo218(c2358);
                if (objMo218 == enumC2282) {
                    return objMo218;
                }
            }
        }
        return c2358;
    }

    /* JADX INFO: renamed from: ۥۜ */
    public final long m7870(float f) {
        if (f == 0.0f) {
            return 0L;
        }
        if (this.f15016 == EnumC1616.f5424) {
            return (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
        }
        return (((long) Float.floatToRawIntBits(f)) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: ۥۣ */
    public final Object m7871(long j, AbstractC0772 abstractC0772) throws Throwable {
        C0397 c0397;
        C4545 c4545;
        Throwable th;
        C1314 c1314;
        if (abstractC0772 instanceof C0397) {
            c0397 = (C0397) abstractC0772;
            int i = c0397.f1468;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0397.f1468 = i - Integer.MIN_VALUE;
            } else {
                c0397 = new C0397(this, abstractC0772);
            }
        } else {
            c0397 = new C0397(this, abstractC0772);
        }
        Object obj = c0397.f1465;
        int i2 = c0397.f1468;
        if (i2 != 0) {
            if (i2 != 1) {
                C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c1314 = c0397.f1466;
            try {
                AbstractC0186.m409(obj);
                c4545 = this;
                c4545.f15020 = false;
                return new C0963(c1314.f4535);
            } catch (Throwable th2) {
                th = th2;
                c4545 = this;
                c4545.f15020 = false;
                throw th;
            }
        }
        AbstractC0186.m409(obj);
        C1314 c1315 = new C1314();
        c1315.f4535 = j;
        this.f15020 = true;
        try {
            EnumC4386 enumC4386 = EnumC4386.f14455;
            c4545 = this;
            try {
                C4956 c4956 = new C4956(c4545, c1315, j, null);
                c0397.f1466 = c1315;
                c0397.f1468 = 1;
                Object objM7868 = c4545.m7868(enumC4386, c4956, c0397);
                EnumC2282 enumC2282 = EnumC2282.f7590;
                if (objM7868 == enumC2282) {
                    return enumC2282;
                }
                c1314 = c1315;
                c4545.f15020 = false;
                return new C0963(c1314.f4535);
            } catch (Throwable th3) {
                th = th3;
                th = th;
                c4545.f15020 = false;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            c4545 = this;
        }
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final float m7872(float f) {
        return this.f15011 ? f * (-1.0f) : f;
    }

    /* JADX INFO: renamed from: ۦٛ */
    public final float m7873(long j) {
        int i = (int) (4294967295L & j);
        int i2 = (int) (j >> 32);
        double dAtan2 = (float) Math.atan2(Math.abs(Float.intBitsToFloat(i)), Math.abs(Float.intBitsToFloat(i2)));
        EnumC1616 enumC1616 = this.f15016;
        if (dAtan2 >= 0.7853981633974483d) {
            if (enumC1616 == EnumC1616.f5425) {
                return Float.intBitsToFloat(i);
            }
            return 0.0f;
        }
        if (enumC1616 == EnumC1616.f5424) {
            return Float.intBitsToFloat(i2);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۦۙ */
    public final float m7874(long j) {
        return Float.intBitsToFloat((int) (this.f15016 == EnumC1616.f5424 ? j >> 32 : j & 4294967295L));
    }
}
