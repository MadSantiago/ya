package p000;

import android.os.Trace;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: ۥؘۢؗۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2640 extends AbstractC5381 implements InterfaceC4933, InterfaceC0951, InterfaceC5671 {

    /* JADX INFO: renamed from: ۥؔ */
    public InterfaceC4745 f8769;

    /* JADX INFO: renamed from: ۥً */
    public C1249 f8770;

    /* JADX INFO: renamed from: ۥٕ */
    public InterfaceC4434 f8771;

    /* JADX INFO: renamed from: ۥ٘ */
    public C2563 f8772;

    /* JADX INFO: renamed from: ۥٛ */
    public C1987 f8773;

    /* JADX INFO: renamed from: ۥۙ */
    public InterfaceC4745 f8774;

    /* JADX INFO: renamed from: ۥۦ */
    public int f8775;

    /* JADX INFO: renamed from: ۦؖ */
    public boolean f8776;

    /* JADX INFO: renamed from: ۦؗ */
    public int f8777;

    /* JADX INFO: renamed from: ۦؙ */
    public int f8778;

    /* JADX INFO: renamed from: ۦُ */
    public List f8779;

    /* JADX INFO: renamed from: ۦٖ */
    public InterfaceC4745 f8780;

    /* JADX INFO: renamed from: ۦٚ */
    public C3564 f8781;

    /* JADX INFO: renamed from: ۦۜ */
    public Map f8782;

    /* JADX INFO: renamed from: ۦۣ */
    public C2379 f8783;

    /* JADX INFO: renamed from: ۥؑ */
    public final C2379 m4956() {
        C2379 c2379 = this.f8783;
        if (c2379 != null) {
            return c2379;
        }
        C2379 c23710 = new C2379(this.f8770, this.f8781, this.f8771, this.f8778, this.f8776, this.f8775, this.f8777, this.f8779);
        this.f8783 = c23710;
        return c23710;
    }

    @Override // p000.InterfaceC4933
    /* JADX INFO: renamed from: ۥً */
    public final int mo1554(AbstractC3625 abstractC3625, InterfaceC1827 interfaceC1827, int i) {
        return m4957(abstractC3625).m4455(i, abstractC3625.getLayoutDirection());
    }

    @Override // p000.InterfaceC4933
    /* JADX INFO: renamed from: ۥُ */
    public final InterfaceC5370 mo931(InterfaceC2427 interfaceC2427, InterfaceC1827 interfaceC1827, long j) {
        Trace.beginSection("TextAnnotatedStringNode:measure");
        try {
            C2379 c2379M4957 = m4957(interfaceC2427);
            boolean zM4451 = c2379M4957.m4451(j, interfaceC2427.getLayoutDirection());
            C3828 c3828 = c2379M4957.f7883;
            if (c3828 == null) {
                throw new IllegalStateException("Internal Error: MultiParagraphLayoutCache could not provide TextLayoutResult during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: " + c2379M4957);
            }
            long j2 = c3828.f12693;
            c3828.f12696.f7563.mo2997();
            if (zM4451) {
                AbstractC5537.m9245(this, 2).m9779();
                InterfaceC4745 interfaceC4745 = this.f8774;
                if (interfaceC4745 != null) {
                    interfaceC4745.mo211(c3828);
                }
                Map linkedHashMap = this.f8782;
                if (linkedHashMap == null) {
                    linkedHashMap = new LinkedHashMap(2);
                }
                linkedHashMap.put(AbstractC2811.f9384, Integer.valueOf(Math.round(c3828.f12698)));
                linkedHashMap.put(AbstractC2811.f9383, Integer.valueOf(Math.round(c3828.f12694)));
                this.f8782 = linkedHashMap;
            }
            InterfaceC4745 interfaceC4746 = this.f8780;
            if (interfaceC4746 != null) {
                interfaceC4746.mo211(c3828.f12695);
            }
            int i = (int) (j2 >> 32);
            int i2 = (int) (j2 & 4294967295L);
            InterfaceC5370 interfaceC5370Mo755 = interfaceC2427.mo755(i, i2, this.f8782, new C2785(interfaceC1827.mo3597(C5063.m8609(i, i, i2, i2)), 6));
            Trace.endSection();
            return interfaceC5370Mo755;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // p000.InterfaceC0951
    /* JADX INFO: renamed from: ۥٛ */
    public final void mo1726(C2497 c2497) {
        List list;
        if (this.f17786) {
            InterfaceC3212 interfaceC3212M5353 = c2497.f8304.f6603.m5353();
            C2379 c2379M4957 = m4957(c2497);
            C3828 c3828 = c2379M4957.f7883;
            if (c3828 == null) {
                C0178.m390(c2379M4957, "Internal Error: MultiParagraphLayoutCache could not provide TextLayoutResult during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: ");
                return;
            }
            C2276 c2276 = c3828.f12696;
            boolean z = c3828.m6829() && this.f8778 != 3;
            if (z) {
                long j = c3828.f12693;
                C2793 c2793M9368 = AbstractC5568.m9368(0L, (((long) Float.floatToRawIntBits((int) (j >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L));
                interfaceC3212M5353.mo2092();
                InterfaceC3212.m5901(interfaceC3212M5353, c2793M9368);
            }
            try {
                C0553 c0553 = this.f8781.f11803;
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
                    C2276.m4327(c2276, interfaceC3212M5353, abstractC0548Mo3547, this.f8781.f11803.f1989.mo3549(), c5907, c1691, abstractC0214);
                } else {
                    long jM6359 = C1327.f4591;
                    if (jM6359 == 16) {
                        jM6359 = this.f8781.m6359() != 16 ? this.f8781.m6359() : C1327.f4588;
                    }
                    C2276.m4328(c2276, interfaceC3212M5353, jM6359, c5907, c1691, abstractC0214);
                }
                if (z) {
                    interfaceC3212M5353.mo2095();
                }
                C1987 c1987 = this.f8773;
                if (((c1987 == null || !c1987.f6557) ? AbstractC4009.m7176(this.f8770) : false) || !((list = this.f8779) == null || list.isEmpty())) {
                    c2497.m4644();
                }
            } catch (Throwable th) {
                if (!z) {
                    throw th;
                }
                interfaceC3212M5353.mo2095();
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۥٜ */
    public final C2379 m4957(InterfaceC2880 interfaceC2880) {
        C2379 c2379;
        C1987 c1987 = this.f8773;
        if (c1987 != null && c1987.f6557 && (c2379 = c1987.f6560) != null) {
            c2379.m4456(interfaceC2880);
            return c2379;
        }
        C2379 c2379M4956 = m4956();
        c2379M4956.m4456(interfaceC2880);
        return c2379M4956;
    }

    @Override // p000.InterfaceC4933
    /* JADX INFO: renamed from: ۥ۟ */
    public final int mo1555(AbstractC3625 abstractC3625, InterfaceC1827 interfaceC1827, int i) {
        return AbstractC1434.m3058(m4957(abstractC3625).m4452(abstractC3625.getLayoutDirection()).mo2999());
    }

    @Override // p000.AbstractC5381
    /* JADX INFO: renamed from: ۦؘ */
    public final boolean mo786() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [ۦٌُٝؔ] */
    /* JADX WARN: Type inference failed for: r0v2, types: [ۥًۡؕۡ] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    @Override // p000.InterfaceC5671
    /* JADX INFO: renamed from: ۦٟ */
    public final void mo790(InterfaceC1066 interfaceC1066) {
        C2563 c2563 = this.f8772;
        ?? r0 = c2563;
        if (c2563 == null) {
            final int i = 0;
            ?? r1 = new InterfaceC4745(this) { // from class: ۥًۡؕۡ

                /* JADX INFO: renamed from: ۦ۟ */
                public final /* synthetic */ C2640 f8556;

                {
                    this.f8556 = this;
                }

                @Override // p000.InterfaceC4745
                /* JADX INFO: renamed from: ۦؚ */
                public final Object mo211(Object obj) {
                    C3828 c3828;
                    boolean z;
                    int i2 = i;
                    C2640 c2640 = this.f8556;
                    switch (i2) {
                        case 0:
                            List list = (List) obj;
                            C3828 c3829 = c2640.m4956().f7883;
                            if (c3829 != null) {
                                C2537 c2537 = c3829.f12697;
                                c3828 = new C3828(new C2537(c2537.f8430, C3564.m6356(c2640.f8781, C1327.f4591, 0L, null, 0L, 0, 0L, 16777214), c2537.f8425, c2537.f8431, c2537.f8426, c2537.f8427, c2537.f8434, c2537.f8429, c2537.f8433, c2537.f8432), c3829.f12696, c3829.f12693);
                                list.add(c3828);
                            } else {
                                c3828 = null;
                            }
                            return Boolean.valueOf(c3828 != null);
                        case 1:
                            C1249 c1249 = (C1249) obj;
                            C1987 c1987 = c2640.f8773;
                            C2340 c2340 = C2340.f7777;
                            if (c1987 == null) {
                                C1987 c1988 = new C1987(c2640.f8770, c1249);
                                C2379 c2379 = new C2379(c1249, c2640.f8781, c2640.f8771, c2640.f8778, c2640.f8776, c2640.f8775, c2640.f8777, c2340);
                                c2379.m4456(c2640.m4956().f7879);
                                c1988.f6560 = c2379;
                                c2640.f8773 = c1988;
                            } else if (!AbstractC3831.m6874(c1249, c1987.f6558)) {
                                c1987.f6558 = c1249;
                                C2379 c23710 = c1987.f6560;
                                if (c23710 != null) {
                                    c23710.m4457(c1249, c2640.f8781, c2640.f8771, c2640.f8778, c2640.f8776, c2640.f8775, c2640.f8777, c2340);
                                }
                            }
                            AbstractC0186.m412(c2640);
                            C5063.m8642(c2640);
                            AbstractC5378.m9047(c2640);
                            return Boolean.TRUE;
                        default:
                            boolean zBooleanValue = ((Boolean) obj).booleanValue();
                            C1987 c1989 = c2640.f8773;
                            if (c1989 == null) {
                                z = false;
                            } else {
                                InterfaceC4745 interfaceC4745 = c2640.f8769;
                                if (interfaceC4745 != null) {
                                    interfaceC4745.mo211(c1989);
                                }
                                C1987 c19810 = c2640.f8773;
                                if (c19810 != null) {
                                    c19810.f6557 = zBooleanValue;
                                }
                                AbstractC0186.m412(c2640);
                                C5063.m8642(c2640);
                                AbstractC5378.m9047(c2640);
                                z = true;
                            }
                            return Boolean.valueOf(z);
                    }
                }
            };
            this.f8772 = r1;
            r0 = r1;
        }
        C1249 c1249 = this.f8770;
        InterfaceC0504[] interfaceC0504Arr = AbstractC3992.f13322;
        interfaceC1066.mo2266(AbstractC2771.f9198, Collections.singletonList(c1249));
        C1987 c1987 = this.f8773;
        if (c1987 != null) {
            C1249 c12410 = c1987.f6558;
            C3059 c3059 = AbstractC2771.f9227;
            InterfaceC0504[] interfaceC0504Arr2 = AbstractC3992.f13322;
            InterfaceC0504 interfaceC0504 = interfaceC0504Arr2[16];
            interfaceC1066.mo2266(c3059, c12410);
            boolean z = c1987.f6557;
            C3059 c30510 = AbstractC2771.f9204;
            InterfaceC0504 interfaceC0505 = interfaceC0504Arr2[17];
            interfaceC1066.mo2266(c30510, Boolean.valueOf(z));
        }
        final int i2 = 1;
        interfaceC1066.mo2266(AbstractC0208.f777, new C0078(null, new InterfaceC4745(this) { // from class: ۥًۡؕۡ

            /* JADX INFO: renamed from: ۦ۟ */
            public final /* synthetic */ C2640 f8556;

            {
                this.f8556 = this;
            }

            @Override // p000.InterfaceC4745
            /* JADX INFO: renamed from: ۦؚ */
            public final Object mo211(Object obj) {
                C3828 c3828;
                boolean z2;
                int i3 = i2;
                C2640 c2640 = this.f8556;
                switch (i3) {
                    case 0:
                        List list = (List) obj;
                        C3828 c3829 = c2640.m4956().f7883;
                        if (c3829 != null) {
                            C2537 c2537 = c3829.f12697;
                            c3828 = new C3828(new C2537(c2537.f8430, C3564.m6356(c2640.f8781, C1327.f4591, 0L, null, 0L, 0, 0L, 16777214), c2537.f8425, c2537.f8431, c2537.f8426, c2537.f8427, c2537.f8434, c2537.f8429, c2537.f8433, c2537.f8432), c3829.f12696, c3829.f12693);
                            list.add(c3828);
                        } else {
                            c3828 = null;
                        }
                        return Boolean.valueOf(c3828 != null);
                    case 1:
                        C1249 c12411 = (C1249) obj;
                        C1987 c1988 = c2640.f8773;
                        C2340 c2340 = C2340.f7777;
                        if (c1988 == null) {
                            C1987 c1989 = new C1987(c2640.f8770, c12411);
                            C2379 c2379 = new C2379(c12411, c2640.f8781, c2640.f8771, c2640.f8778, c2640.f8776, c2640.f8775, c2640.f8777, c2340);
                            c2379.m4456(c2640.m4956().f7879);
                            c1989.f6560 = c2379;
                            c2640.f8773 = c1989;
                        } else if (!AbstractC3831.m6874(c12411, c1988.f6558)) {
                            c1988.f6558 = c12411;
                            C2379 c23710 = c1988.f6560;
                            if (c23710 != null) {
                                c23710.m4457(c12411, c2640.f8781, c2640.f8771, c2640.f8778, c2640.f8776, c2640.f8775, c2640.f8777, c2340);
                            }
                        }
                        AbstractC0186.m412(c2640);
                        C5063.m8642(c2640);
                        AbstractC5378.m9047(c2640);
                        return Boolean.TRUE;
                    default:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        C1987 c19810 = c2640.f8773;
                        if (c19810 == null) {
                            z2 = false;
                        } else {
                            InterfaceC4745 interfaceC4745 = c2640.f8769;
                            if (interfaceC4745 != null) {
                                interfaceC4745.mo211(c19810);
                            }
                            C1987 c19811 = c2640.f8773;
                            if (c19811 != null) {
                                c19811.f6557 = zBooleanValue;
                            }
                            AbstractC0186.m412(c2640);
                            C5063.m8642(c2640);
                            AbstractC5378.m9047(c2640);
                            z2 = true;
                        }
                        return Boolean.valueOf(z2);
                }
            }
        }));
        final int i3 = 2;
        interfaceC1066.mo2266(AbstractC0208.f778, new C0078(null, new InterfaceC4745(this) { // from class: ۥًۡؕۡ

            /* JADX INFO: renamed from: ۦ۟ */
            public final /* synthetic */ C2640 f8556;

            {
                this.f8556 = this;
            }

            @Override // p000.InterfaceC4745
            /* JADX INFO: renamed from: ۦؚ */
            public final Object mo211(Object obj) {
                C3828 c3828;
                boolean z2;
                int i4 = i3;
                C2640 c2640 = this.f8556;
                switch (i4) {
                    case 0:
                        List list = (List) obj;
                        C3828 c3829 = c2640.m4956().f7883;
                        if (c3829 != null) {
                            C2537 c2537 = c3829.f12697;
                            c3828 = new C3828(new C2537(c2537.f8430, C3564.m6356(c2640.f8781, C1327.f4591, 0L, null, 0L, 0, 0L, 16777214), c2537.f8425, c2537.f8431, c2537.f8426, c2537.f8427, c2537.f8434, c2537.f8429, c2537.f8433, c2537.f8432), c3829.f12696, c3829.f12693);
                            list.add(c3828);
                        } else {
                            c3828 = null;
                        }
                        return Boolean.valueOf(c3828 != null);
                    case 1:
                        C1249 c12411 = (C1249) obj;
                        C1987 c1988 = c2640.f8773;
                        C2340 c2340 = C2340.f7777;
                        if (c1988 == null) {
                            C1987 c1989 = new C1987(c2640.f8770, c12411);
                            C2379 c2379 = new C2379(c12411, c2640.f8781, c2640.f8771, c2640.f8778, c2640.f8776, c2640.f8775, c2640.f8777, c2340);
                            c2379.m4456(c2640.m4956().f7879);
                            c1989.f6560 = c2379;
                            c2640.f8773 = c1989;
                        } else if (!AbstractC3831.m6874(c12411, c1988.f6558)) {
                            c1988.f6558 = c12411;
                            C2379 c23710 = c1988.f6560;
                            if (c23710 != null) {
                                c23710.m4457(c12411, c2640.f8781, c2640.f8771, c2640.f8778, c2640.f8776, c2640.f8775, c2640.f8777, c2340);
                            }
                        }
                        AbstractC0186.m412(c2640);
                        C5063.m8642(c2640);
                        AbstractC5378.m9047(c2640);
                        return Boolean.TRUE;
                    default:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        C1987 c19810 = c2640.f8773;
                        if (c19810 == null) {
                            z2 = false;
                        } else {
                            InterfaceC4745 interfaceC4745 = c2640.f8769;
                            if (interfaceC4745 != null) {
                                interfaceC4745.mo211(c19810);
                            }
                            C1987 c19811 = c2640.f8773;
                            if (c19811 != null) {
                                c19811.f6557 = zBooleanValue;
                            }
                            AbstractC0186.m412(c2640);
                            C5063.m8642(c2640);
                            AbstractC5378.m9047(c2640);
                            z2 = true;
                        }
                        return Boolean.valueOf(z2);
                }
            }
        }));
        interfaceC1066.mo2266(AbstractC0208.f785, new C0078(null, new C0463(8, this)));
        AbstractC3992.m7134(interfaceC1066, r0);
    }

    @Override // p000.InterfaceC4933
    /* JADX INFO: renamed from: ۦۙ */
    public final int mo1556(AbstractC3625 abstractC3625, InterfaceC1827 interfaceC1827, int i) {
        return AbstractC1434.m3058(m4957(abstractC3625).m4452(abstractC3625.getLayoutDirection()).mo2987());
    }

    @Override // p000.InterfaceC4933
    /* JADX INFO: renamed from: ۦ۟ */
    public final int mo1557(AbstractC3625 abstractC3625, InterfaceC1827 interfaceC1827, int i) {
        return m4957(abstractC3625).m4455(i, abstractC3625.getLayoutDirection());
    }
}
