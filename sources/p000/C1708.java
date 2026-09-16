package p000;

import android.view.View;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: ۥٚؑۡۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1708 implements InterfaceC4745 {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ Object f5679;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ Object f5680;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f5681;

    public /* synthetic */ C1708(int i, Object obj, Object obj2) {
        this.f5681 = i;
        this.f5680 = obj;
        this.f5679 = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x01a1  */
    @Override // p000.InterfaceC4745
    /* JADX INFO: renamed from: ۦؚ */
    public final Object mo211(Object obj) {
        C0917 c0917Mo1682;
        C0917 c0917Mo1683;
        C0917 c0917Mo1684;
        C3828 c3828;
        C0935 c0935M6830;
        C2537 c2537;
        int i = 4;
        C0553 c0553M1242 = null;
        c0553M1242 = null;
        boolean z = true;
        switch (this.f5681) {
            case 0:
                InterfaceC5372 interfaceC5372 = (InterfaceC5372) this.f5680;
                InterfaceC5372 interfaceC5373 = (InterfaceC5372) this.f5679;
                InterfaceC2442 interfaceC2442 = (InterfaceC2442) obj;
                float fMo741 = interfaceC2442.mo741(2.0f);
                float f = fMo741 / 2.0f;
                InterfaceC2442.m4560(interfaceC2442, ((C1327) interfaceC5372.getValue()).f4595, interfaceC2442.mo741(10.0f) - f, 0L, new C3579(fMo741, 0.0f, 0, 0, 30), 108);
                if (C4497.m7827(((C4497) interfaceC5373.getValue()).f14871, 0.0f) > 0) {
                    InterfaceC2442.m4560(interfaceC2442, ((C1327) interfaceC5372.getValue()).f4595, interfaceC2442.mo741(((C4497) interfaceC5373.getValue()).f14871) - f, 0L, C1548.f5235, 108);
                }
                return C2358.f7817;
            case 1:
                C1946 c1946 = (C1946) this.f5680;
                C3639 c3639 = (C3639) this.f5679;
                c1946.m3810(obj);
                if (c3639 != null) {
                    c3639.m6495(obj);
                }
                return C2358.f7817;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                C0469 c0469 = (C0469) this.f5680;
                Throwable th = (Throwable) this.f5679;
                Throwable th2 = (Throwable) obj;
                synchronized (c0469.f1693) {
                    if (th == null) {
                        th = null;
                    } else if (th2 != null) {
                        try {
                            if (th2 instanceof CancellationException) {
                                th2 = null;
                            }
                            if (th2 != null) {
                                AbstractC5537.m9223(th, th2);
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    c0469.f1695 = th;
                    C4994 c4994 = c0469.f1710;
                    EnumC3359 enumC3359 = EnumC3359.f11230;
                    c4994.getClass();
                    c4994.m8388(null, enumC3359);
                }
                return C2358.f7817;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                ((C2997) this.f5680).f10074.setValue(new C5337((InterfaceC4686) this.f5679, (InterfaceC4686) obj));
                return C2358.f7817;
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                C3594 c3594 = (C3594) this.f5680;
                C4545 c4545 = (C4545) this.f5679;
                C4640 c4640 = (C4640) obj;
                float f2 = c4640.f15312 ? -1.0f : 1.0f;
                long j = c4640.f15313;
                c3594.m6402(C1553.m3305(f2, c4545.f15016 == EnumC1616.f5424 ? C1553.m3307(j, 0.0f, 1) : C1553.m3307(j, 0.0f, 2)), 1);
                return C2358.f7817;
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                InterfaceC4745 interfaceC4745 = (InterfaceC4745) this.f5680;
                InterfaceC4367 interfaceC4367 = (InterfaceC4367) this.f5679;
                Boolean bool = (Boolean) obj;
                bool.getClass();
                interfaceC4367.setValue(bool);
                interfaceC4745.mo211(bool);
                return C2358.f7817;
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                ((C3551) this.f5680).f11783.m5813((InterfaceC3879) obj, (C3193) this.f5679);
                return C2358.f7817;
            case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                InterfaceC5372 interfaceC5374 = (InterfaceC5372) this.f5680;
                InterfaceC4367 interfaceC4368 = (InterfaceC4367) this.f5679;
                C3291 c3291 = (C3291) obj;
                float fFloatValue = ((Number) interfaceC5374.getValue()).floatValue();
                float fIntBitsToFloat = Float.intBitsToFloat((int) (c3291.f11025 >> 32)) * fFloatValue;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (c3291.f11025 & 4294967295L)) * fFloatValue;
                if (Float.intBitsToFloat((int) (((C3291) interfaceC4368.getValue()).f11025 >> 32)) != fIntBitsToFloat || Float.intBitsToFloat((int) (((C3291) interfaceC4368.getValue()).f11025 & 4294967295L)) != fIntBitsToFloat2) {
                    interfaceC4368.setValue(new C3291((((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32)));
                }
                return C2358.f7817;
            case 8:
                C5665 c5665 = (C5665) obj;
                return c5665.m9489(new C2932(7, new C1708(9, ((InterfaceC2864) this.f5680).mo1709(c5665.f18635.mo2766(), c5665.f18635.getLayoutDirection(), c5665), (C4505) this.f5679)));
            case 9:
                AbstractC0949.m1927((InterfaceC2442) obj, (AbstractC3925) this.f5680, ((C1327) ((C4505) this.f5679).f14898.get()).f4595);
                return C2358.f7817;
            case 10:
                return new C0235(z ? 1 : 0, (InterfaceC4367) this.f5680, (C2243) this.f5679);
            case 11:
                InterfaceC4448 interfaceC4448 = (InterfaceC4448) this.f5680;
                InterfaceC4448 interfaceC4449 = (InterfaceC4448) this.f5679;
                InterfaceC0647 interfaceC0647 = (InterfaceC0647) obj;
                interfaceC4448.mo449();
                if (interfaceC4449 != null ? ((Boolean) interfaceC4449.mo449()).booleanValue() : true) {
                    interfaceC0647.close();
                }
                return C2358.f7817;
            case 12:
                C2331 c2331 = (C2331) this.f5680;
                C0169 c0169 = ((C0801) this.f5679).f2866;
                C4483 c4483 = (C4483) obj;
                AbstractC4428 abstractC4428 = (AbstractC4428) c2331.f7719;
                C0917 c0917Mo1685 = abstractC4428.mo1682();
                C0553 c0553 = c0917Mo1685 != null ? c0917Mo1685.f3290 : null;
                C0553 c0553M1243 = ((c0169.m360() & 1) == 0 || (c0917Mo1684 = abstractC4428.mo1682()) == null) ? null : c0917Mo1684.f3289;
                if (c0553 != null) {
                    c0553M1243 = c0553.m1242(c0553M1243);
                }
                C0553 c0553M1244 = ((c0169.m360() & 2) == 0 || (c0917Mo1683 = abstractC4428.mo1682()) == null) ? null : c0917Mo1683.f3288;
                if (c0553M1243 != null) {
                    c0553M1244 = c0553M1243.m1242(c0553M1244);
                }
                if ((c0169.m360() & 4) != 0 && (c0917Mo1682 = abstractC4428.mo1682()) != null) {
                    c0553M1242 = c0917Mo1682.f3291;
                }
                if (c0553M1244 != null) {
                    c0553M1242 = c0553M1244.m1242(c0553M1242);
                }
                c4483.f14804 = c4483.f14805.m2637(new C3464(new C5662(), c2331, c0553M1242));
                return C2358.f7817;
            case 13:
                C0165 c0165 = (C0165) this.f5680;
                C2331 c2332 = (C2331) this.f5679;
                C1117 c1117 = (C1117) obj;
                C1249 c1249 = c0165.f621;
                C4852 c4852 = c0165.f622;
                C3828 c3829 = (C3828) c4852.getValue();
                if (AbstractC3831.m6874(c1249, (c3829 == null || (c2537 = c3829.f12697) == null) ? null : c2537.f8430) && (c3828 = (C3828) c4852.getValue()) != null) {
                    C2276 c2276 = c3828.f12696;
                    C2331 c2331M349 = C0165.m349(c2332, c3828);
                    if (c2331M349 == null) {
                        c0935M6830 = null;
                    } else {
                        int i2 = c2331M349.f7717;
                        int i3 = c2331M349.f7718;
                        c0935M6830 = c3828.m6830(i3, i2);
                        C2793 c2793M6826 = c3828.m6826(i3);
                        int i4 = i2 - 1;
                        c0935M6830.m1909(((((long) Float.floatToRawIntBits(c2793M6826.f9342)) & 4294967295L) | (((long) Float.floatToRawIntBits(c2276.m4335(i3) == c2276.m4335(i4) ? Math.min(c3828.m6826(i4).f9343, c2793M6826.f9343) : 0.0f)) << 32)) ^ (-9223372034707292160L));
                    }
                } else {
                    c0935M6830 = null;
                }
                InterfaceC2864 c5411 = c0935M6830 != null ? new C5411(c0935M6830) : null;
                if (c5411 != null) {
                    c1117.m2346(c5411);
                    c1117.m2340(true);
                }
                return C2358.f7817;
            case 14:
                List list = (List) this.f5680;
                List list2 = (List) this.f5679;
                AbstractC1842 abstractC1842 = (AbstractC1842) obj;
                if (list != null) {
                    int size = list.size();
                    for (int i5 = 0; i5 < size; i5++) {
                        C3869 c3869 = (C3869) list.get(i5);
                        AbstractC1842.m3624(abstractC1842, (AbstractC0275) c3869.f12915, ((C0873) c3869.f12914).f3199);
                    }
                }
                if (list2 != null) {
                    int size2 = list2.size();
                    for (int i6 = 0; i6 < size2; i6++) {
                        C3869 c38610 = (C3869) list2.get(i6);
                        AbstractC0275 abstractC0275 = (AbstractC0275) c38610.f12915;
                        InterfaceC4448 interfaceC44410 = (InterfaceC4448) c38610.f12914;
                        AbstractC1842.m3624(abstractC1842, abstractC0275, interfaceC44410 != null ? ((C0873) interfaceC44410.mo449()).f3199 : 0L);
                    }
                }
                return C2358.f7817;
            case 15:
                AbstractC2765.m5135((InterfaceC4643) this.f5680, null, 4, new C0404((C0777) this.f5679, null), 1);
                return new C3279(2);
            case 16:
                C0777 c0777 = (C0777) this.f5680;
                C0777 c0778 = (C0777) this.f5679;
                c0777.f2815.add(c0778);
                return new C0235(3, c0777, c0778);
            case 17:
                return new C0235(i, (C0777) this.f5680, (C5627) this.f5679);
            case 18:
                C0777 c0779 = (C0777) this.f5680;
                C3051 c3051 = (C3051) this.f5679;
                c0779.f2816.add(c3051);
                return new C0235(5, c0779, c3051);
            case 19:
                C4174 c4174 = (C4174) this.f5680;
                InterfaceC4745 interfaceC4746 = (InterfaceC4745) this.f5679;
                ((Long) obj).getClass();
                float f3 = c4174.f13904;
                c4174.f13904 = 0.0f;
                interfaceC4746.mo211(Float.valueOf(f3));
                return C2358.f7817;
            case 20:
                C2816 c2816 = (C2816) this.f5680;
                View view = (View) this.f5679;
                c2816.m5381(view);
                return new C0235(6, c2816, view);
            case 21:
                ((C1076) this.f5680).f3762.m5813((InterfaceC3879) obj, (C3041) this.f5679);
                return C2358.f7817;
            case 22:
                EnumC4972 enumC4972 = (EnumC4972) this.f5680;
                String str = (String) this.f5679;
                InterfaceC3879 interfaceC3879 = (InterfaceC3879) obj;
                InterfaceC0252 interfaceC0252Mo971 = interfaceC3879.mo971("UPDATE workspec SET state=? WHERE id=?");
                try {
                    interfaceC0252Mo971.mo532(AbstractC2552.m4806(enumC4972), 1);
                    interfaceC0252Mo971.mo530(2, str);
                    interfaceC0252Mo971.mo533();
                    return Integer.valueOf(C3133.m5787(interfaceC3879));
                } finally {
                    interfaceC0252Mo971.close();
                }
            case 23:
                C2775 c2775 = (C2775) this.f5680;
                String str2 = (String) this.f5679;
                InterfaceC0252 interfaceC0252Mo972 = ((InterfaceC3879) obj).mo971("UPDATE workspec SET output=? WHERE id=?");
                try {
                    C2775 c2776 = C2775.f9249;
                    interfaceC0252Mo972.mo535(1, AbstractC0993.m2142(c2775));
                    interfaceC0252Mo972.mo530(2, str2);
                    interfaceC0252Mo972.mo533();
                    return C2358.f7817;
                } finally {
                    interfaceC0252Mo972.close();
                }
            case 24:
                ((C0177) this.f5680).f662.m5813((InterfaceC3879) obj, (C4142) this.f5679);
                return C2358.f7817;
            default:
                ((C5301) this.f5680).f17459.m5813((InterfaceC3879) obj, (C0472) this.f5679);
                return C2358.f7817;
        }
    }

    public /* synthetic */ C1708(Object obj, Object obj2, Object obj3, int i) {
        this.f5681 = i;
        this.f5680 = obj2;
        this.f5679 = obj3;
    }
}
