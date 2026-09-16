package p000;

import android.os.Build;
import android.view.ViewConfiguration;
import java.util.List;

/* JADX INFO: renamed from: ۦؑؔؕۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3031 extends AbstractC2557 {

    /* JADX INFO: renamed from: ۥّ */
    public final C5086 f10193;

    /* JADX INFO: renamed from: ۥۜ */
    public C2127 f10194;

    /* JADX INFO: renamed from: ۦۙ */
    public final C5559 f10195;

    public C3031(C4545 c4545, C5086 c5086, C2283 c2283, InterfaceC2880 interfaceC2880) {
        super(c4545, c2283, interfaceC2880);
        this.f10193 = c5086;
        this.f10195 = AbstractC1631.m3405(Integer.MAX_VALUE, 0, 6);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: ۥُ */
    public static final Object m5619(C3031 c3031, C5450 c5450, C1916 c1916, C4545 c4545, C5450 c5451, long j, AbstractC0772 abstractC0772) {
        C5124 c5124;
        C1916 c1917;
        C4545 c4546;
        C5450 c5452;
        boolean z;
        if (abstractC0772 instanceof C5124) {
            c5124 = (C5124) abstractC0772;
            int i = c5124.f16984;
            if ((i & Integer.MIN_VALUE) != 0) {
                c5124.f16984 = i - Integer.MIN_VALUE;
            } else {
                c5124 = new C5124(abstractC0772);
            }
        } else {
            c5124 = new C5124(abstractC0772);
        }
        Object objM5252 = c5124.f16983;
        int i2 = c5124.f16984;
        InterfaceC0443 interfaceC0443 = null;
        if (i2 == 0) {
            AbstractC0186.m409(objM5252);
            if (j < 0) {
                return Boolean.FALSE;
            }
            C2718 c2718 = new C2718(c3031, interfaceC0443, 11);
            c5124.f16981 = c3031;
            c5124.f16980 = c5450;
            c5124.f16982 = c1916;
            c5124.f16985 = c4545;
            c5124.f16986 = c5451;
            c5124.f16984 = 1;
            objM5252 = AbstractC2776.m5252(j, c2718, c5124);
            EnumC2282 enumC2282 = EnumC2282.f7590;
            if (objM5252 == enumC2282) {
                return enumC2282;
            }
            c1917 = c1916;
            c4546 = c4545;
            c5452 = c5451;
        } else {
            if (i2 != 1) {
                C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            C5450 c5453 = c5124.f16986;
            C4545 c4547 = c5124.f16985;
            c1917 = c5124.f16982;
            C5450 c5454 = c5124.f16980;
            C3031 c3032 = c5124.f16981;
            AbstractC0186.m409(objM5252);
            c5452 = c5453;
            c4546 = c4547;
            c5450 = c5454;
            c3031 = c3032;
        }
        C5391 c5391 = (C5391) objM5252;
        if (c5391 != null) {
            boolean z2 = ((C5391) c5450.f17965).f17820;
            long j2 = c5391.f17822;
            c5450.f17965 = new C5391(j2, c5391.f17821, z2);
            c1917.f6312 = c4546.m7873(c4546.m7867(j2));
            c5452.f17965 = AbstractC4554.m7901(0.0f, 0.0f, 30);
            C5002 c5002 = c3031.f8530;
            long j3 = c5391.f17821;
            long j4 = c5391.f17822;
            ((C5426) c5002.f16551).m9102(Float.intBitsToFloat((int) (j4 >> 32)), j3);
            ((C5426) c5002.f16550).m9102(Float.intBitsToFloat((int) (j4 & 4294967295L)), j3);
            z = !C4773.m8133(c1917.f6312);
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: ۦۙ */
    public static C5391 m5620(C5559 c5559) {
        C5391 c5391 = null;
        C0156 c0156M1924 = AbstractC0949.m1924(new C1294(new C4222(c5559, 0), 0 == true ? 1 : 0, 2));
        while (c0156M1924.hasNext()) {
            C5391 c5391M9081 = (C5391) c0156M1924.next();
            if (c5391 != null) {
                c5391M9081 = c5391.m9081(c5391M9081);
            }
            c5391 = c5391M9081;
        }
        return c5391;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final float m5621(C3594 c3594, float f) {
        C4545 c4545 = this.f8532;
        long jM7870 = c4545.m7870(c4545.m7872(f));
        C4545 c4546 = c3594.f11951;
        return c4545.m7874(c4545.m7867(c4546.m7866(c4546.f15021, jM7870, 1)));
    }

    /* JADX INFO: renamed from: ۥّ */
    public final boolean m5622(C5639 c5639) {
        long j;
        InterfaceC2880 interfaceC2880 = this.f8529;
        ViewConfiguration viewConfiguration = (ViewConfiguration) this.f10193.f16877;
        int i = Build.VERSION.SDK_INT;
        float f = -(i > 26 ? viewConfiguration.getScaledVerticalScrollFactor() : interfaceC2880.mo741(64.0f));
        float f2 = -(i > 26 ? viewConfiguration.getScaledHorizontalScrollFactor() : interfaceC2880.mo741(64.0f));
        List list = c5639.f18583;
        C1553 c1553 = new C1553(0L);
        int size = list.size();
        boolean zMo1391 = false;
        int i2 = 0;
        while (true) {
            j = c1553.f5241;
            if (i2 >= size) {
                break;
            }
            c1553 = new C1553(C1553.m3304(j, ((C3536) list.get(i2)).f11736));
            i2++;
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) * f2)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) * f)) & 4294967295L);
        C4545 c4545 = this.f8532;
        float fM7873 = c4545.m7873(c4545.m7867(jFloatToRawIntBits));
        if (fM7873 != 0.0f) {
            InterfaceC3096 interfaceC3096 = c4545.f15015;
            zMo1391 = fM7873 > 0.0f ? interfaceC3096.mo1391() : interfaceC3096.mo1399();
        }
        if (zMo1391) {
            return !(this.f10195.mo5597(new C5391(jFloatToRawIntBits, ((C3536) AbstractC0973.m2045(c5639.f18583)).f11730, false)) instanceof C1259);
        }
        return this.f8533;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX INFO: renamed from: ۦؑ */
    public final Object m5623(C4545 c4545, C5391 c5391, float f, float f2, AbstractC0772 abstractC0772) {
        C4053 c4053;
        C2358 c2358;
        C5450 c5450;
        Object obj;
        C1916 c1916;
        float f3;
        C4545 c4546;
        if (abstractC0772 instanceof C4053) {
            c4053 = (C4053) abstractC0772;
            int i = c4053.f13510;
            if ((i & Integer.MIN_VALUE) != 0) {
                c4053.f13510 = i - Integer.MIN_VALUE;
            } else {
                c4053 = new C4053(this, abstractC0772);
            }
        } else {
            c4053 = new C4053(this, abstractC0772);
        }
        C4053 c4054 = c4053;
        Object obj2 = c4054.f13511;
        int i2 = c4054.f13510;
        C5002 c5002 = this.f8530;
        C2358 c2359 = C2358.f7817;
        Object obj3 = EnumC2282.f7590;
        if (i2 == 0) {
            AbstractC0186.m409(obj2);
            C5450 c5451 = new C5450();
            c5451.f17965 = c5391;
            c2358 = c2359;
            long j = c5391.f17821;
            long j2 = c5391.f17822;
            ((C5426) c5002.f16551).m9102(Float.intBitsToFloat((int) (j2 >> 32)), j);
            ((C5426) c5002.f16550).m9102(Float.intBitsToFloat((int) (j2 & 4294967295L)), j);
            C5391 c5391M5620 = m5620(this.f10195);
            if (c5391M5620 != null) {
                long j3 = c5391M5620.f17821;
                long j4 = c5391M5620.f17822;
                ((C5426) c5002.f16551).m9102(Float.intBitsToFloat((int) (j4 >> 32)), j3);
                ((C5426) c5002.f16550).m9102(Float.intBitsToFloat((int) (j4 & 4294967295L)), j3);
                c5450 = c5451;
                c5450.f17965 = ((C5391) c5450.f17965).m9081(c5391M5620);
            } else {
                c5450 = c5451;
            }
            C1916 c1917 = new C1916();
            float fM7874 = c4545.m7874(c4545.m7867(((C5391) c5450.f17965).f17822));
            c1917.f6312 = fM7874;
            if (!C4773.m8133(fM7874)) {
                C5450 c5452 = new C5450();
                c5452.f17965 = AbstractC4554.m7901(0.0f, 0.0f, 30);
                obj = obj3;
                InterfaceC5731 c2330 = new C2330(c1917, c5452, c5450, f, this, f2, c4545, null);
                c4054.f13508 = c4545;
                c4054.f13507 = c1917;
                c4054.f13509 = f2;
                c4054.f13510 = 1;
                if (m4836(c2330, c4054) != obj) {
                    c1916 = c1917;
                    f3 = f2;
                    c4546 = c4545;
                }
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                AbstractC0186.m409(obj2);
                return c2359;
            }
            C1078.m2276("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        f3 = c4054.f13509;
        c1916 = c4054.f13507;
        c4546 = c4054.f13508;
        AbstractC0186.m409(obj2);
        obj = obj3;
        c2358 = c2359;
        long jM7091 = AbstractC3933.m7091(((C5426) c5002.f16551).m9101(Float.MAX_VALUE), ((C5426) c5002.f16550).m9101(Float.MAX_VALUE));
        if (jM7091 == 0) {
            float fM7872 = c4546.m7872(Math.signum(c1916.f6312)) * Math.min(Math.abs(c1916.f6312) / 100.0f, f3) * 1000.0f;
            if (fM7872 == 0.0f) {
                jM7091 = 0;
            } else {
                jM7091 = c4546.f15016 == EnumC1616.f5424 ? AbstractC3933.m7091(fM7872, 0.0f) : AbstractC3933.m7091(0.0f, fM7872);
            }
        }
        C0963 c0963 = new C0963(jM7091);
        c4054.f13508 = null;
        c4054.f13507 = null;
        c4054.f13510 = 2;
        return this.f8531.mo219(c0963, c4054) == obj ? obj : c2358;
    }
}
