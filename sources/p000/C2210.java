package p000;

import android.os.Trace;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: ۥٕۙؓۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2210 extends AbstractC5381 implements InterfaceC4933, InterfaceC0951, InterfaceC5671 {

    /* JADX INFO: renamed from: ۥؔ */
    public C0729 f7318;

    /* JADX INFO: renamed from: ۥً */
    public String f7319;

    /* JADX INFO: renamed from: ۥٕ */
    public InterfaceC4434 f7320;

    /* JADX INFO: renamed from: ۥۙ */
    public int f7321;

    /* JADX INFO: renamed from: ۥۦ */
    public int f7322;

    /* JADX INFO: renamed from: ۦؖ */
    public int f7323;

    /* JADX INFO: renamed from: ۦؗ */
    public HashMap f7324;

    /* JADX INFO: renamed from: ۦؙ */
    public boolean f7325;

    /* JADX INFO: renamed from: ۦُ */
    public C0216 f7326;

    /* JADX INFO: renamed from: ۦٖ */
    public C3259 f7327;

    /* JADX INFO: renamed from: ۦٚ */
    public C3564 f7328;

    /* JADX INFO: renamed from: ۥؑ */
    public final C0216 m4273() {
        C3564 c3564 = this.f7328;
        C0216 c0216 = this.f7326;
        if (c0216 != null) {
            return c0216;
        }
        C0216 c0217 = new C0216(this.f7319, c3564, this.f7320, this.f7321, this.f7325, this.f7323, this.f7322);
        this.f7326 = c0217;
        return c0217;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0010  */
    @Override // p000.InterfaceC4933
    /* JADX INFO: renamed from: ۥً */
    public final int mo1554(AbstractC3625 abstractC3625, InterfaceC1827 interfaceC1827, int i) {
        C0216 c0216M4273;
        C0729 c0729 = this.f7318;
        if (c0729 == null) {
            c0216M4273 = m4273();
        } else {
            if (!c0729.f2660) {
                c0729 = null;
            }
            if (c0729 == null || (c0216M4273 = c0729.f2663) == null) {
                c0216M4273 = m4273();
            }
        }
        c0216M4273.m473(abstractC3625);
        return c0216M4273.m472(i, abstractC3625.getLayoutDirection());
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0015 A[Catch: all -> 0x0094, TryCatch #0 {all -> 0x0094, blocks: (B:3:0x0005, B:5:0x0009, B:10:0x0011, B:13:0x0019, B:15:0x0028, B:16:0x002b, B:18:0x0031, B:20:0x003d, B:21:0x0044, B:22:0x006f, B:12:0x0015), top: B:28:0x0005 }] */
    @Override // p000.InterfaceC4933
    /* JADX INFO: renamed from: ۥُ */
    public final InterfaceC5370 mo931(InterfaceC2427 interfaceC2427, InterfaceC1827 interfaceC1827, long j) {
        C0216 c0216M4273;
        Trace.beginSection("TextStringSimpleNode::measure");
        try {
            C0729 c0729 = this.f7318;
            if (c0729 == null) {
                c0216M4273 = m4273();
            } else {
                if (!c0729.f2660) {
                    c0729 = null;
                }
                if (c0729 == null || (c0216M4273 = c0729.f2663) == null) {
                    c0216M4273 = m4273();
                }
            }
            c0216M4273.m473(interfaceC2427);
            boolean zM471 = c0216M4273.m471(j, interfaceC2427.getLayoutDirection());
            InterfaceC4655 interfaceC4655 = c0216M4273.f817;
            if (interfaceC4655 != null) {
                interfaceC4655.mo2997();
            }
            C4303 c4303 = c0216M4273.f813;
            long j2 = c0216M4273.f811;
            if (zM471) {
                AbstractC5537.m9245(this, 2).m9779();
                HashMap map = this.f7324;
                if (map == null) {
                    map = new HashMap(2);
                    this.f7324 = map;
                }
                map.put(AbstractC2811.f9384, Integer.valueOf(Math.round(c4303.f14237.m1632(0))));
                C2779 c2779 = AbstractC2811.f9383;
                C0739 c0739 = c4303.f14237;
                map.put(c2779, Integer.valueOf(Math.round(c0739.m1632(c0739.f2693 - 1))));
            }
            int i = (int) (j2 >> 32);
            int i2 = (int) (j2 & 4294967295L);
            return interfaceC2427.mo755(i, i2, this.f7324, new C2785(interfaceC1827.mo3597(C5063.m8609(i, i, i2, i2)), 9));
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0016  */
    @Override // p000.InterfaceC0951
    /* JADX INFO: renamed from: ۥٛ */
    public final void mo1726(C2497 c2497) {
        C0216 c0216M4273;
        if (this.f17786) {
            C0729 c0729 = this.f7318;
            if (c0729 == null) {
                c0216M4273 = m4273();
            } else {
                if (!c0729.f2660) {
                    c0729 = null;
                }
                if (c0729 == null || (c0216M4273 = c0729.f2663) == null) {
                    c0216M4273 = m4273();
                }
            }
            C4303 c4303 = c0216M4273.f813;
            if (c4303 == null) {
                AbstractC4690.m8037("Internal Error: ParagraphLayoutCache could not provide a Paragraph during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: (layoutCache=" + this.f7326 + ", textSubstitution=" + this.f7318 + ')');
                C1078.m2274();
                return;
            }
            InterfaceC3212 interfaceC3212M5353 = c2497.f8304.f6603.m5353();
            boolean z = c0216M4273.f815;
            if (z) {
                long j = c0216M4273.f811;
                interfaceC3212M5353.mo2092();
                interfaceC3212M5353.mo2084(0.0f, 0.0f, (int) (j >> 32), (int) (j & 4294967295L), 1);
            }
            try {
                C3564 c3564 = this.f7328;
                C0553 c0553 = c3564.f11803;
                C1690 c1690 = c0553.f1992;
                if (c1690 == null) {
                    c1690 = C1690.f5635;
                }
                C1690 c1691 = c1690;
                C5906 c5906 = c0553.f1997;
                if (c5906 == null) {
                    c5906 = C5906.f19486;
                }
                C5906 c5907 = c5906;
                AbstractC0213 abstractC0213 = c0553.f1998;
                if (abstractC0213 == null) {
                    abstractC0213 = C1548.f5235;
                }
                AbstractC0213 abstractC0214 = abstractC0213;
                AbstractC0548 abstractC0548Mo3547 = c0553.f1989.mo3547();
                if (abstractC0548Mo3547 != null) {
                    c4303.m7595(interfaceC3212M5353, abstractC0548Mo3547, c3564.f11803.f1989.mo3549(), c5907, c1691, abstractC0214);
                } else {
                    long jM6359 = C1327.f4591;
                    if (jM6359 == 16) {
                        jM6359 = c3564.m6359() != 16 ? c3564.m6359() : C1327.f4588;
                    }
                    c4303.m7591(interfaceC3212M5353, jM6359, c5907, c1691, abstractC0214);
                }
            } finally {
                if (z) {
                    interfaceC3212M5353.mo2095();
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0010  */
    @Override // p000.InterfaceC4933
    /* JADX INFO: renamed from: ۥ۟ */
    public final int mo1555(AbstractC3625 abstractC3625, InterfaceC1827 interfaceC1827, int i) {
        C0216 c0216M4273;
        C0729 c0729 = this.f7318;
        if (c0729 == null) {
            c0216M4273 = m4273();
        } else {
            if (!c0729.f2660) {
                c0729 = null;
            }
            if (c0729 == null || (c0216M4273 = c0729.f2663) == null) {
                c0216M4273 = m4273();
            }
        }
        c0216M4273.m473(abstractC3625);
        return AbstractC1434.m3058(c0216M4273.m470(abstractC3625.getLayoutDirection()).mo2999());
    }

    @Override // p000.AbstractC5381
    /* JADX INFO: renamed from: ۦؘ */
    public final boolean mo786() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [ۦٌُٝؔ] */
    /* JADX WARN: Type inference failed for: r0v2, types: [ۦؕؑۡۢ] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    @Override // p000.InterfaceC5671
    /* JADX INFO: renamed from: ۦٟ */
    public final void mo790(InterfaceC1066 interfaceC1066) {
        C3259 c3259 = this.f7327;
        ?? r0 = c3259;
        if (c3259 == null) {
            final int i = 0;
            ?? r1 = new InterfaceC4745(this) { // from class: ۦؕؑۡۢ

                /* JADX INFO: renamed from: ۦ۟ */
                public final /* synthetic */ C2210 f10935;

                {
                    this.f10935 = this;
                }

                /* JADX WARN: Code duplicated, block: B:23:0x00ba  */
                @Override // p000.InterfaceC4745
                /* JADX INFO: renamed from: ۦؚ */
                public final Object mo211(Object obj) {
                    InterfaceC2880 interfaceC2880;
                    C3828 c3828;
                    int i2 = i;
                    boolean z = true;
                    C2210 c2210 = this.f10935;
                    switch (i2) {
                        case 0:
                            List list = (List) obj;
                            C0216 c0216M4273 = c2210.m4273();
                            C3564 c3564M6356 = C3564.m6356(c2210.f7328, C1327.f4591, 0L, null, 0L, 0, 0L, 16777214);
                            EnumC2459 enumC2459 = c0216M4273.f819;
                            C3828 c3829 = null;
                            if (enumC2459 == null || (interfaceC2880 = c0216M4273.f814) == null) {
                                c3828 = null;
                            } else {
                                C1249 c1249 = new C1249(c0216M4273.f809);
                                if (c0216M4273.f813 == null || c0216M4273.f817 == null) {
                                    c3828 = null;
                                } else {
                                    long j = c0216M4273.f818 & (-8589934589L);
                                    int i3 = c0216M4273.f804;
                                    boolean z2 = c0216M4273.f803;
                                    int i4 = c0216M4273.f810;
                                    InterfaceC4434 interfaceC4434 = c0216M4273.f801;
                                    C2340 c2340 = C2340.f7777;
                                    c3828 = new C3828(new C2537(c1249, c3564M6356, c2340, i3, z2, i4, interfaceC2880, enumC2459, interfaceC4434, j), new C2276(new C1414(c1249, c3564M6356, c2340, interfaceC2880, interfaceC4434), j, c0216M4273.f804, c0216M4273.f810), c0216M4273.f811);
                                }
                            }
                            if (c3828 != null) {
                                list.add(c3828);
                                c3829 = c3828;
                            }
                            return Boolean.valueOf(c3829 != null);
                        case 1:
                            String str = ((C1249) obj).f4307;
                            C0729 c0729 = c2210.f7318;
                            if (c0729 == null) {
                                C0729 c07210 = new C0729(c2210.f7319, str);
                                C0216 c0216 = new C0216(str, c2210.f7328, c2210.f7320, c2210.f7321, c2210.f7325, c2210.f7323, c2210.f7322);
                                c0216.m473(c2210.m4273().f814);
                                c07210.f2663 = c0216;
                                c2210.f7318 = c07210;
                            } else if (!AbstractC3831.m6874(str, c0729.f2661)) {
                                c0729.f2661 = str;
                                C0216 c0217 = c0729.f2663;
                                if (c0217 != null) {
                                    C3564 c3564 = c2210.f7328;
                                    InterfaceC4434 interfaceC4435 = c2210.f7320;
                                    int i5 = c2210.f7321;
                                    boolean z3 = c2210.f7325;
                                    int i6 = c2210.f7323;
                                    int i7 = c2210.f7322;
                                    c0217.f809 = str;
                                    c0217.f807 = c3564;
                                    c0217.f801 = interfaceC4435;
                                    c0217.f810 = i5;
                                    c0217.f803 = z3;
                                    c0217.f804 = i6;
                                    c0217.f816 = i7;
                                    c0217.f802 = (c0217.f802 << 2) | 2;
                                    c0217.m469();
                                }
                            }
                            AbstractC0186.m412(c2210);
                            C5063.m8642(c2210);
                            AbstractC5378.m9047(c2210);
                            return Boolean.TRUE;
                        default:
                            boolean zBooleanValue = ((Boolean) obj).booleanValue();
                            C0729 c07211 = c2210.f7318;
                            if (c07211 == null) {
                                z = false;
                            } else {
                                c07211.f2660 = zBooleanValue;
                                AbstractC0186.m412(c2210);
                                C5063.m8642(c2210);
                                AbstractC5378.m9047(c2210);
                            }
                            return Boolean.valueOf(z);
                    }
                }
            };
            this.f7327 = r1;
            r0 = r1;
        }
        C1249 c1249 = new C1249(this.f7319);
        InterfaceC0504[] interfaceC0504Arr = AbstractC3992.f13322;
        interfaceC1066.mo2266(AbstractC2771.f9198, Collections.singletonList(c1249));
        C0729 c0729 = this.f7318;
        if (c0729 != null) {
            boolean z = c0729.f2660;
            C3059 c3059 = AbstractC2771.f9204;
            InterfaceC0504[] interfaceC0504Arr2 = AbstractC3992.f13322;
            InterfaceC0504 interfaceC0504 = interfaceC0504Arr2[17];
            interfaceC1066.mo2266(c3059, Boolean.valueOf(z));
            C1249 c12410 = new C1249(c0729.f2661);
            C3059 c30510 = AbstractC2771.f9227;
            InterfaceC0504 interfaceC0505 = interfaceC0504Arr2[16];
            interfaceC1066.mo2266(c30510, c12410);
        }
        final int i2 = 1;
        interfaceC1066.mo2266(AbstractC0208.f777, new C0078(null, new InterfaceC4745(this) { // from class: ۦؕؑۡۢ

            /* JADX INFO: renamed from: ۦ۟ */
            public final /* synthetic */ C2210 f10935;

            {
                this.f10935 = this;
            }

            /* JADX WARN: Code duplicated, block: B:23:0x00ba  */
            @Override // p000.InterfaceC4745
            /* JADX INFO: renamed from: ۦؚ */
            public final Object mo211(Object obj) {
                InterfaceC2880 interfaceC2880;
                C3828 c3828;
                int i3 = i2;
                boolean z2 = true;
                C2210 c2210 = this.f10935;
                switch (i3) {
                    case 0:
                        List list = (List) obj;
                        C0216 c0216M4273 = c2210.m4273();
                        C3564 c3564M6356 = C3564.m6356(c2210.f7328, C1327.f4591, 0L, null, 0L, 0, 0L, 16777214);
                        EnumC2459 enumC2459 = c0216M4273.f819;
                        C3828 c3829 = null;
                        if (enumC2459 == null || (interfaceC2880 = c0216M4273.f814) == null) {
                            c3828 = null;
                        } else {
                            C1249 c12411 = new C1249(c0216M4273.f809);
                            if (c0216M4273.f813 == null || c0216M4273.f817 == null) {
                                c3828 = null;
                            } else {
                                long j = c0216M4273.f818 & (-8589934589L);
                                int i4 = c0216M4273.f804;
                                boolean z3 = c0216M4273.f803;
                                int i5 = c0216M4273.f810;
                                InterfaceC4434 interfaceC4434 = c0216M4273.f801;
                                C2340 c2340 = C2340.f7777;
                                c3828 = new C3828(new C2537(c12411, c3564M6356, c2340, i4, z3, i5, interfaceC2880, enumC2459, interfaceC4434, j), new C2276(new C1414(c12411, c3564M6356, c2340, interfaceC2880, interfaceC4434), j, c0216M4273.f804, c0216M4273.f810), c0216M4273.f811);
                            }
                        }
                        if (c3828 != null) {
                            list.add(c3828);
                            c3829 = c3828;
                        }
                        return Boolean.valueOf(c3829 != null);
                    case 1:
                        String str = ((C1249) obj).f4307;
                        C0729 c07210 = c2210.f7318;
                        if (c07210 == null) {
                            C0729 c07211 = new C0729(c2210.f7319, str);
                            C0216 c0216 = new C0216(str, c2210.f7328, c2210.f7320, c2210.f7321, c2210.f7325, c2210.f7323, c2210.f7322);
                            c0216.m473(c2210.m4273().f814);
                            c07211.f2663 = c0216;
                            c2210.f7318 = c07211;
                        } else if (!AbstractC3831.m6874(str, c07210.f2661)) {
                            c07210.f2661 = str;
                            C0216 c0217 = c07210.f2663;
                            if (c0217 != null) {
                                C3564 c3564 = c2210.f7328;
                                InterfaceC4434 interfaceC4435 = c2210.f7320;
                                int i6 = c2210.f7321;
                                boolean z4 = c2210.f7325;
                                int i7 = c2210.f7323;
                                int i8 = c2210.f7322;
                                c0217.f809 = str;
                                c0217.f807 = c3564;
                                c0217.f801 = interfaceC4435;
                                c0217.f810 = i6;
                                c0217.f803 = z4;
                                c0217.f804 = i7;
                                c0217.f816 = i8;
                                c0217.f802 = (c0217.f802 << 2) | 2;
                                c0217.m469();
                            }
                        }
                        AbstractC0186.m412(c2210);
                        C5063.m8642(c2210);
                        AbstractC5378.m9047(c2210);
                        return Boolean.TRUE;
                    default:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        C0729 c07212 = c2210.f7318;
                        if (c07212 == null) {
                            z2 = false;
                        } else {
                            c07212.f2660 = zBooleanValue;
                            AbstractC0186.m412(c2210);
                            C5063.m8642(c2210);
                            AbstractC5378.m9047(c2210);
                        }
                        return Boolean.valueOf(z2);
                }
            }
        }));
        final int i3 = 2;
        interfaceC1066.mo2266(AbstractC0208.f778, new C0078(null, new InterfaceC4745(this) { // from class: ۦؕؑۡۢ

            /* JADX INFO: renamed from: ۦ۟ */
            public final /* synthetic */ C2210 f10935;

            {
                this.f10935 = this;
            }

            /* JADX WARN: Code duplicated, block: B:23:0x00ba  */
            @Override // p000.InterfaceC4745
            /* JADX INFO: renamed from: ۦؚ */
            public final Object mo211(Object obj) {
                InterfaceC2880 interfaceC2880;
                C3828 c3828;
                int i4 = i3;
                boolean z2 = true;
                C2210 c2210 = this.f10935;
                switch (i4) {
                    case 0:
                        List list = (List) obj;
                        C0216 c0216M4273 = c2210.m4273();
                        C3564 c3564M6356 = C3564.m6356(c2210.f7328, C1327.f4591, 0L, null, 0L, 0, 0L, 16777214);
                        EnumC2459 enumC2459 = c0216M4273.f819;
                        C3828 c3829 = null;
                        if (enumC2459 == null || (interfaceC2880 = c0216M4273.f814) == null) {
                            c3828 = null;
                        } else {
                            C1249 c12411 = new C1249(c0216M4273.f809);
                            if (c0216M4273.f813 == null || c0216M4273.f817 == null) {
                                c3828 = null;
                            } else {
                                long j = c0216M4273.f818 & (-8589934589L);
                                int i5 = c0216M4273.f804;
                                boolean z3 = c0216M4273.f803;
                                int i6 = c0216M4273.f810;
                                InterfaceC4434 interfaceC4434 = c0216M4273.f801;
                                C2340 c2340 = C2340.f7777;
                                c3828 = new C3828(new C2537(c12411, c3564M6356, c2340, i5, z3, i6, interfaceC2880, enumC2459, interfaceC4434, j), new C2276(new C1414(c12411, c3564M6356, c2340, interfaceC2880, interfaceC4434), j, c0216M4273.f804, c0216M4273.f810), c0216M4273.f811);
                            }
                        }
                        if (c3828 != null) {
                            list.add(c3828);
                            c3829 = c3828;
                        }
                        return Boolean.valueOf(c3829 != null);
                    case 1:
                        String str = ((C1249) obj).f4307;
                        C0729 c07210 = c2210.f7318;
                        if (c07210 == null) {
                            C0729 c07211 = new C0729(c2210.f7319, str);
                            C0216 c0216 = new C0216(str, c2210.f7328, c2210.f7320, c2210.f7321, c2210.f7325, c2210.f7323, c2210.f7322);
                            c0216.m473(c2210.m4273().f814);
                            c07211.f2663 = c0216;
                            c2210.f7318 = c07211;
                        } else if (!AbstractC3831.m6874(str, c07210.f2661)) {
                            c07210.f2661 = str;
                            C0216 c0217 = c07210.f2663;
                            if (c0217 != null) {
                                C3564 c3564 = c2210.f7328;
                                InterfaceC4434 interfaceC4435 = c2210.f7320;
                                int i7 = c2210.f7321;
                                boolean z4 = c2210.f7325;
                                int i8 = c2210.f7323;
                                int i9 = c2210.f7322;
                                c0217.f809 = str;
                                c0217.f807 = c3564;
                                c0217.f801 = interfaceC4435;
                                c0217.f810 = i7;
                                c0217.f803 = z4;
                                c0217.f804 = i8;
                                c0217.f816 = i9;
                                c0217.f802 = (c0217.f802 << 2) | 2;
                                c0217.m469();
                            }
                        }
                        AbstractC0186.m412(c2210);
                        C5063.m8642(c2210);
                        AbstractC5378.m9047(c2210);
                        return Boolean.TRUE;
                    default:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        C0729 c07212 = c2210.f7318;
                        if (c07212 == null) {
                            z2 = false;
                        } else {
                            c07212.f2660 = zBooleanValue;
                            AbstractC0186.m412(c2210);
                            C5063.m8642(c2210);
                            AbstractC5378.m9047(c2210);
                        }
                        return Boolean.valueOf(z2);
                }
            }
        }));
        interfaceC1066.mo2266(AbstractC0208.f785, new C0078(null, new C0463(12, this)));
        AbstractC3992.m7134(interfaceC1066, r0);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0010  */
    @Override // p000.InterfaceC4933
    /* JADX INFO: renamed from: ۦۙ */
    public final int mo1556(AbstractC3625 abstractC3625, InterfaceC1827 interfaceC1827, int i) {
        C0216 c0216M4273;
        C0729 c0729 = this.f7318;
        if (c0729 == null) {
            c0216M4273 = m4273();
        } else {
            if (!c0729.f2660) {
                c0729 = null;
            }
            if (c0729 == null || (c0216M4273 = c0729.f2663) == null) {
                c0216M4273 = m4273();
            }
        }
        c0216M4273.m473(abstractC3625);
        return AbstractC1434.m3058(c0216M4273.m470(abstractC3625.getLayoutDirection()).mo2987());
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0010  */
    @Override // p000.InterfaceC4933
    /* JADX INFO: renamed from: ۦ۟ */
    public final int mo1557(AbstractC3625 abstractC3625, InterfaceC1827 interfaceC1827, int i) {
        C0216 c0216M4273;
        C0729 c0729 = this.f7318;
        if (c0729 == null) {
            c0216M4273 = m4273();
        } else {
            if (!c0729.f2660) {
                c0729 = null;
            }
            if (c0729 == null || (c0216M4273 = c0729.f2663) == null) {
                c0216M4273 = m4273();
            }
        }
        c0216M4273.m473(abstractC3625);
        return c0216M4273.m472(i, abstractC3625.getLayoutDirection());
    }
}
