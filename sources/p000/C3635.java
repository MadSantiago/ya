package p000;

import android.content.ClipDescription;
import java.util.ArrayList;

/* JADX INFO: renamed from: ۦًُؑؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3635 {

    /* JADX INFO: renamed from: ۥؓ */
    public boolean f12136;

    /* JADX INFO: renamed from: ۥؖ */
    public final C5470 f12137;

    /* JADX INFO: renamed from: ۥَ */
    public int f12139;

    /* JADX INFO: renamed from: ۥّ */
    public InterfaceC4448 f12141;

    /* JADX INFO: renamed from: ۥْ */
    public final C4852 f12142;

    /* JADX INFO: renamed from: ۥٓ */
    public final C4852 f12143;

    /* JADX INFO: renamed from: ۥٖ */
    public C5745 f12144;

    /* JADX INFO: renamed from: ۥٙ */
    public final C3278 f12145;

    /* JADX INFO: renamed from: ۥۖ */
    public final C4852 f12146;

    /* JADX INFO: renamed from: ۥۜ */
    public InterfaceC4643 f12148;

    /* JADX INFO: renamed from: ۥۣ */
    public final C3260 f12149;

    /* JADX INFO: renamed from: ۦؑ */
    public C5837 f12150;

    /* JADX INFO: renamed from: ۦؚ */
    public final C4852 f12151;

    /* JADX INFO: renamed from: ۦٌ */
    public final C4852 f12152;

    /* JADX INFO: renamed from: ۦِ */
    public InterfaceC1922 f12153;

    /* JADX INFO: renamed from: ۦٕ */
    public final C0322 f12154;

    /* JADX INFO: renamed from: ۦٗ */
    public C5470 f12155;

    /* JADX INFO: renamed from: ۦٛ */
    public InterfaceC2007 f12156;

    /* JADX INFO: renamed from: ۦۗ */
    public C3985 f12157;

    /* JADX INFO: renamed from: ۦۙ */
    public InterfaceC1625 f12158;

    /* JADX INFO: renamed from: ۦۚ */
    public long f12159;

    /* JADX INFO: renamed from: ۦۛ */
    public C3346 f12160;

    /* JADX INFO: renamed from: ۦ۟ */
    public long f12161;

    /* JADX INFO: renamed from: ۦۨ */
    public C3346 f12162;

    /* JADX INFO: renamed from: ۥۗ */
    public InterfaceC4120 f12147 = AbstractC3933.f13127;

    /* JADX INFO: renamed from: ۥؗ */
    public InterfaceC4745 f12138 = new C1657(22);

    /* JADX INFO: renamed from: ۥُ */
    public final C4852 f12140 = AbstractC2774.m5183(new C5745(0, (String) null, 7));

    public C3635(C3260 c3260) {
        this.f12149 = c3260;
        Boolean bool = Boolean.TRUE;
        this.f12151 = AbstractC2774.m5183(bool);
        this.f12152 = AbstractC2774.m5183(bool);
        this.f12159 = 0L;
        this.f12161 = 0L;
        this.f12142 = AbstractC2774.m5183(null);
        this.f12143 = AbstractC2774.m5183(null);
        this.f12139 = -1;
        this.f12144 = new C5745(0L, (String) null, 7);
        this.f12146 = AbstractC2774.m5183(Boolean.FALSE);
        C0322 c0322 = new C0322((char) 0, 13);
        c0322.f1179 = 1;
        this.f12154 = c0322;
        this.f12145 = new C3278(this);
        this.f12137 = new C5470(this);
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static C5745 m6468(C1249 c1249, long j) {
        return new C5745(c1249, j, (C3346) null);
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final void m6469() {
        InterfaceC4643 interfaceC4643 = this.f12148;
        if (interfaceC4643 != null) {
            AbstractC2765.m5135(interfaceC4643, null, 4, new C3592(this, null, 1), 1);
        }
    }

    /* JADX INFO: renamed from: ۥَ */
    public final void m6470() {
        C5837 c5837;
        InterfaceC0884 interfaceC0884;
        AbstractC3191 abstractC3191M7473 = AbstractC4225.m7473();
        InterfaceC0443 interfaceC0443 = null;
        InterfaceC4745 interfaceC4745Mo4945 = abstractC3191M7473 != null ? abstractC3191M7473.mo4945() : null;
        AbstractC3191 abstractC3191M7452 = AbstractC4225.m7452(abstractC3191M7473);
        try {
            if (!m6483() || ((c5837 = this.f12150) != null && !((Boolean) c5837.f19225.getValue()).booleanValue())) {
                AbstractC4225.m7466(abstractC3191M7473, abstractC3191M7452, interfaceC4745Mo4945);
                return;
            }
            AbstractC4225.m7466(abstractC3191M7473, abstractC3191M7452, interfaceC4745Mo4945);
            C0322 c0322 = this.f12154;
            if (c0322.f1179 == 1) {
                AbstractC4690.m8035("ToolbarRequester is not initialized.");
            }
            C0625 c0625 = (C0625) c0322.f1178;
            if (c0625 == null || !c0625.f17786) {
                return;
            }
            C2127 c2127 = c0625.f2317;
            if ((c2127 == null || !c2127.mo866()) && (interfaceC0884 = (InterfaceC0884) AbstractC2552.m4807(c0625, AbstractC0405.f1487)) != null) {
                c0625.f2317 = AbstractC2765.m5135(c0625.m9076(), null, 4, new C5416(c0625, interfaceC0884, interfaceC0443, 3), 1);
            }
        } catch (Throwable th) {
            AbstractC4225.m7466(abstractC3191M7473, abstractC3191M7452, interfaceC4745Mo4945);
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۥُ */
    public final void m6471(boolean z) {
        C3985 c3985;
        C5837 c5837 = this.f12150;
        if (c5837 != null && !c5837.m9646() && (c3985 = this.f12157) != null) {
            C3985.m7129(c3985);
        }
        this.f12144 = m6479();
        m6482(z);
        m6474(EnumC1546.f5231);
    }

    /* JADX INFO: renamed from: ۥّ */
    public final C3869 m6472() {
        String str;
        C3346 c3346;
        C1249 c1249M6484 = m6484();
        if (c1249M6484 == null || (str = c1249M6484.f4307) == null || (c3346 = this.f12160) == null) {
            return null;
        }
        long j = c3346.f11197;
        return new C3869(str, new C3346(AbstractC2765.m5145(this.f12147.mo4319((int) (j >> 32)), this.f12147.mo4319((int) (j & 4294967295L)))));
    }

    /* JADX INFO: renamed from: ۥْ */
    public final void m6473(EnumC2925 enumC2925) {
        this.f12142.setValue(enumC2925);
    }

    /* JADX INFO: renamed from: ۥٓ */
    public final void m6474(EnumC1546 enumC1546) {
        C5837 c5837 = this.f12150;
        if (c5837 != null) {
            if (c5837.m9647() == enumC1546) {
                c5837 = null;
            }
            if (c5837 != null) {
                c5837.f19241.setValue(enumC1546);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: ۥٖ */
    public final Object m6475(AbstractC0772 abstractC0772) {
        C4733 c4733;
        if (abstractC0772 instanceof C4733) {
            c4733 = (C4733) abstractC0772;
            int i = c4733.f15625;
            if ((i & Integer.MIN_VALUE) != 0) {
                c4733.f15625 = i - Integer.MIN_VALUE;
            } else {
                c4733 = new C4733(this, abstractC0772);
            }
        } else {
            c4733 = new C4733(this, abstractC0772);
        }
        Object objValueOf = c4733.f15622;
        int i2 = c4733.f15625;
        if (i2 == 0) {
            AbstractC0186.m409(objValueOf);
            InterfaceC1625 interfaceC1625 = this.f12158;
            if (interfaceC1625 != null) {
                c4733.f15623 = this;
                c4733.f15625 = 1;
                ClipDescription primaryClipDescription = ((C2471) interfaceC1625).f8246.m1656().getPrimaryClipDescription();
                objValueOf = Boolean.valueOf(primaryClipDescription != null && primaryClipDescription.hasMimeType("text/*"));
                Object obj = EnumC2282.f7590;
                if (objValueOf == obj) {
                    return obj;
                }
            }
            return C2358.f7817;
        }
        if (i2 != 1) {
            C1078.m2276("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        this = c4733.f15623;
        AbstractC0186.m409(objValueOf);
        Boolean bool = (Boolean) objValueOf;
        bool.getClass();
        this.f12146.setValue(bool);
        return C2358.f7817;
    }

    /* JADX INFO: renamed from: ۥۜ */
    public final boolean m6476() {
        return ((Boolean) this.f12151.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final C2127 m6477(boolean z) {
        InterfaceC4643 interfaceC4643 = this.f12148;
        if (interfaceC4643 != null) {
            return AbstractC2765.m5135(interfaceC4643, null, 4, new C4747(this, z, null), 1);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final void m6478(C1553 c1553) {
        if (!C3346.m6107(m6479().f18943)) {
            C5837 c5837 = this.f12150;
            C2449 c2449M9648 = c5837 != null ? c5837.m9648() : null;
            int iM6108 = (c1553 == null || c2449M9648 == null) ? C3346.m6108(m6479().f18943) : this.f12147.mo4318(c2449M9648.m4572(c1553.f5241, true));
            C5745 c5745M9570 = C5745.m9570(m6479(), null, AbstractC2765.m5145(iM6108, iM6108), 5);
            this.f12138.mo211(c5745M9570);
            this.f12160 = new C3346(c5745M9570.f18943);
        }
        m6474((c1553 == null || m6479().f18944.f4307.length() <= 0) ? EnumC1546.f5232 : EnumC1546.f5229);
        m6482(false);
    }

    /* JADX INFO: renamed from: ۦؚ */
    public final C5745 m6479() {
        return (C5745) this.f12140.getValue();
    }

    /* JADX INFO: renamed from: ۦٌ */
    public final void m6480() {
        C2127 c2127;
        C0625 c0625 = (C0625) this.f12154.f1178;
        if (c0625 == null || (c2127 = c0625.f2317) == null) {
            return;
        }
        c2127.mo871(null);
        c0625.f2317 = null;
    }

    /* JADX INFO: renamed from: ۦِ */
    public final long m6481(boolean z) {
        C2449 c2449M9648;
        long j;
        C5837 c5837 = this.f12150;
        if (c5837 == null || (c2449M9648 = c5837.m9648()) == null) {
            return 9205357640488583168L;
        }
        C3828 c3828 = c2449M9648.f8158;
        C2276 c2276 = c3828.f12696;
        C1249 c1249M6484 = m6484();
        if (c1249M6484 == null) {
            return 9205357640488583168L;
        }
        if (!AbstractC3831.m6874(c1249M6484.f4307, c3828.f12697.f8430.f4307)) {
            return 9205357640488583168L;
        }
        C5745 c5745M6479 = m6479();
        if (z) {
            long j2 = c5745M6479.f18943;
            int i = C3346.f11195;
            j = j2 >> 32;
        } else {
            long j3 = c5745M6479.f18943;
            int i2 = C3346.f11195;
            j = j3 & 4294967295L;
        }
        int iMo4319 = this.f12147.mo4319((int) j);
        boolean zM6114 = C3346.m6114(m6479().f18943);
        long j4 = c3828.f12693;
        int iM4335 = c2276.m4335(iMo4319);
        if (iM4335 >= c2276.f7560) {
            return 9205357640488583168L;
        }
        boolean z2 = c3828.m6828(((!z || zM6114) && (z || !zM6114)) ? Math.max(iMo4319 + (-1), 0) : iMo4319) == c3828.m6831(iMo4319);
        c2276.m4336(iMo4319);
        int length = ((C1249) c2276.f7563.f4871).f4307.length();
        ArrayList arrayList = c2276.f7562;
        C0158 c0158 = (C0158) arrayList.get(iMo4319 == length ? AbstractC2164.m4181(arrayList) : C3133.m5811(iMo4319, arrayList));
        C4303 c4303 = c0158.f601;
        int iM342 = c0158.m342(iMo4319);
        C0739 c0739 = c4303.f14237;
        return (((long) Float.floatToRawIntBits(AbstractC4554.m7922(c2276.m4332(iM4335), 0.0f, (int) (j4 & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(AbstractC4554.m7922(z2 ? c0739.m1634(iM342, false) : c0739.m1633(iM342, false), 0.0f, (int) (j4 >> 32)))) << 32);
    }

    /* JADX INFO: renamed from: ۦٗ */
    public final void m6482(boolean z) {
        C5837 c5837 = this.f12150;
        if (c5837 != null) {
            c5837.f19235.setValue(Boolean.valueOf(z));
        }
        if (z) {
            m6470();
        } else {
            m6480();
        }
    }

    /* JADX INFO: renamed from: ۦٛ */
    public final boolean m6483() {
        return ((Boolean) this.f12152.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: ۦۗ */
    public final C1249 m6484() {
        C5837 c5837 = this.f12150;
        if (c5837 != null) {
            return c5837.f19232.f1627;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۙ */
    public final C1553 m6485() {
        return (C1553) this.f12143.getValue();
    }

    /* JADX INFO: renamed from: ۦۚ */
    public final void m6486(C3346 c3346) {
        C1249 c1249M6484;
        String str;
        InterfaceC4643 interfaceC4643;
        if (c3346 == null) {
            return;
        }
        long j = c3346.f11197;
        InterfaceC2007 interfaceC2007 = this.f12156;
        if (interfaceC2007 == null || (c1249M6484 = m6484()) == null || (str = c1249M6484.f4307) == null) {
            return;
        }
        InterfaceC4120 interfaceC4120 = this.f12147;
        long jM5145 = AbstractC2765.m5145(interfaceC4120.mo4319((int) (j >> 32)), interfaceC4120.mo4319((int) (j & 4294967295L)));
        if (str.length() <= 0 || C3346.m6107(jM5145) || (interfaceC4643 = this.f12148) == null) {
            return;
        }
        AbstractC2765.m5135(interfaceC4643, null, 0, new C0136(interfaceC2007, str, jM5145, c3346, this, interfaceC4120, null), 3);
    }

    /* JADX INFO: renamed from: ۦۛ */
    public final long m6487(C5745 c5745, long j, boolean z, boolean z2, C0178 c0178, boolean z3, C4255 c4255) {
        C2449 c2449M9648;
        long j2;
        int i;
        long j3;
        C2032 c2032;
        C2032 c2033;
        boolean z4;
        boolean z5;
        InterfaceC1922 interfaceC1922;
        C3177 c3177M6764;
        C3177 c3177;
        C3177 c3178;
        C5837 c5837 = this.f12150;
        if (c5837 == null || (c2449M9648 = c5837.m9648()) == null) {
            return C3346.f11196;
        }
        InterfaceC4120 interfaceC4120 = this.f12147;
        long j4 = c5745.f18943;
        C1249 c1249 = c5745.f18944;
        int i2 = C3346.f11195;
        long jM5145 = AbstractC2765.m5145(interfaceC4120.mo4319((int) (j4 >> 32)), this.f12147.mo4319((int) (j4 & 4294967295L)));
        int iM4572 = c2449M9648.m4572(j, false);
        int i3 = (z2 || z) ? iM4572 : (int) (jM5145 >> 32);
        if (!z2 || z) {
            j2 = 4294967295L;
            i = iM4572;
        } else {
            j2 = 4294967295L;
            i = (int) (jM5145 & 4294967295L);
        }
        C5470 c5470 = this.f12155;
        int i4 = -1;
        if (z || c5470 == null) {
            j3 = j2;
        } else {
            j3 = j2;
            int i5 = this.f12139;
            if (i5 != -1) {
                i4 = i5;
            }
        }
        C3828 c3828 = c2449M9648.f8158;
        if (z) {
            c2032 = null;
        } else {
            int i6 = (int) (jM5145 >> 32);
            int i7 = (int) (jM5145 & j3);
            c2032 = new C2032(new C3177(AbstractC5378.m9043(c3828, i6), i6, 1L), new C3177(AbstractC5378.m9043(c3828, i7), i7, 1L), C3346.m6114(jM5145));
        }
        C5470 c5471 = new C5470(2, c2032, new C4902(i3, i, i4, c3828), z2);
        if (c2032 != null && c5470 != null && z2 == c5470.f18035) {
            C4902 c4902 = (C4902) c5470.f18037;
            if (i3 == c4902.f16168 && i == c4902.f16166) {
                return j4;
            }
        }
        this.f12155 = c5471;
        this.f12139 = iM4572;
        switch (c0178.f665) {
            case 14:
                C4902 c4903 = (C4902) c5471.f18037;
                c2033 = new C2032(c4903.m8262(c4903.f16168), c4903.m8262(c4903.f16166), c5471.m9161() == 1);
                break;
            case 15:
                c2033 = AbstractC3801.m6766(c5471, C1397.f4790);
                break;
            case 16:
                c2033 = AbstractC3801.m6766(c5471, C1298.f4438);
                break;
            default:
                c2033 = (C2032) c5471.f18034;
                C4902 c4904 = (C4902) c5471.f18037;
                if (c2033 != null) {
                    C3177 c3179 = c2033.f6692;
                    C3177 c31710 = c2033.f6693;
                    if (c5471.f18035) {
                        c3177M6764 = AbstractC3801.m6764(c5471, c4904, c31710);
                        c3178 = c3179;
                        c3179 = c31710;
                        c3177 = c3177M6764;
                    } else {
                        c3177M6764 = AbstractC3801.m6764(c5471, c4904, c3179);
                        c3177 = c31710;
                        c3178 = c3177M6764;
                    }
                    if (!AbstractC3831.m6874(c3177M6764, c3179)) {
                        c2033 = AbstractC3801.m6794(new C2032(c3177, c3178, c5471.m9161() == 1 || (c5471.m9161() == 3 && c3177.f10676 > c3178.f10676)), c5471);
                    }
                } else {
                    c2033 = AbstractC3801.m6766(c5471, C1397.f4790);
                }
                break;
        }
        long jM5146 = AbstractC2765.m5145(this.f12147.mo4318(c2033.f6693.f10676), this.f12147.mo4318(c2033.f6692.f10676));
        if (C3346.m6110(jM5146, j4)) {
            return j4;
        }
        boolean z6 = C3346.m6114(jM5146) != C3346.m6114(j4) && C3346.m6110(AbstractC2765.m5145((int) (jM5146 & j3), (int) (jM5146 >> 32)), j4);
        boolean z7 = C3346.m6107(jM5146) && C3346.m6107(j4);
        if (z3 && c1249.f4307.length() > 0 && !z6 && !z7 && c4255 != null && (interfaceC1922 = this.f12153) != null) {
            ((C1651) interfaceC1922).m3465(c4255.f14099);
        }
        this.f12138.mo211(m6468(c1249, jM5146));
        this.f12160 = new C3346(jM5146);
        if (!z3) {
            m6482(!C3346.m6107(jM5146));
        }
        C5837 c5838 = this.f12150;
        if (c5838 != null) {
            c5838.f19225.setValue(Boolean.valueOf(z3));
        }
        C5837 c5839 = this.f12150;
        if (c5839 != null) {
            c5839.f19236.setValue(Boolean.valueOf(!C3346.m6107(jM5146) && AbstractC2552.m4821(this, true)));
        }
        C5837 c58310 = this.f12150;
        if (c58310 != null) {
            if (C3346.m6107(jM5146)) {
                z4 = false;
            } else {
                z4 = false;
                if (AbstractC2552.m4821(this, false)) {
                    z5 = true;
                }
                c58310.f19243.setValue(Boolean.valueOf(z5));
            }
            z5 = z4;
            c58310.f19243.setValue(Boolean.valueOf(z5));
        } else {
            z4 = false;
        }
        C5837 c58311 = this.f12150;
        if (c58311 != null) {
            if (C3346.m6107(jM5146) && AbstractC2552.m4821(this, true)) {
                z4 = true;
            }
            c58311.f19246.setValue(Boolean.valueOf(z4));
        }
        return jM5146;
    }

    /* JADX INFO: renamed from: ۦ۟ */
    public final void m6488(C1553 c1553) {
        this.f12143.setValue(c1553);
    }

    /* JADX INFO: renamed from: ۦۨ */
    public final void m6489() {
        InterfaceC4643 interfaceC4643 = this.f12148;
        if (interfaceC4643 != null) {
            AbstractC2765.m5135(interfaceC4643, null, 4, new C3592(this, null, 2), 1);
        }
    }
}
