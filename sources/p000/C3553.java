package p000;

import android.content.SharedPreferences;
import android.os.Build;
import ru.bluecat.yandexmapspatcher.p003ui.App;
import ru.bluecat.yandexmapspatcher.p003ui.SideActivity;

/* JADX INFO: renamed from: ۦؙؕٛؒ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3553 implements InterfaceC4745 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ C3557 f11785;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f11786;

    public /* synthetic */ C3553(C3557 c3557, int i) {
        this.f11786 = i;
        this.f11785 = c3557;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x011e  */
    @Override // p000.InterfaceC4745
    /* JADX INFO: renamed from: ۦؚ */
    public final Object mo211(Object obj) {
        int i = this.f11786;
        final int i2 = 0;
        final int i3 = 3;
        final int i4 = 2;
        final int i5 = 1;
        C2358 c2358 = C2358.f7817;
        final C3557 c3557 = this.f11785;
        switch (i) {
            case 0:
                Boolean bool = (Boolean) obj;
                boolean zBooleanValue = bool.booleanValue();
                c3557.getClass();
                App app = App.f407;
                C1443 c1443 = AbstractC2776.m5217().f409;
                c1443.getClass();
                C2518 c2518 = new C2518(c1443);
                c2518.m4661(bool, AbstractC2539.f8454.f5219);
                SharedPreferences.Editor editor = c2518.f8351;
                if (editor != null) {
                    editor.apply();
                }
                if (!C1443.f4940 && !c1443.f4943) {
                    try {
                        AbstractC2765.m5147(c1443.f4945, c1443.m3070().concat(".xml"));
                        break;
                    } catch (Throwable unused) {
                    }
                }
                AbstractC4489.m7810(zBooleanValue);
                break;
            case 1:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                c3557.getClass();
                if (!zBooleanValue2) {
                    App app2 = App.f407;
                    C1443 c1444 = AbstractC2776.m5217().f410;
                    c1444.getClass();
                    C2518 c2519 = new C2518(c1444);
                    c2519.m4661(Boolean.FALSE, AbstractC2539.f8451.f5219);
                    SharedPreferences.Editor editor2 = c2519.f8351;
                    if (editor2 != null) {
                        editor2.apply();
                    }
                    if (!C1443.f4940 && !c1444.f4943) {
                        try {
                            AbstractC2765.m5147(c1444.f4945, c1444.m3070().concat(".xml"));
                            break;
                        } catch (Throwable unused2) {
                        }
                    }
                    C3469.f11514.getClass();
                    C3469.m6258();
                } else {
                    C3469.f11514.getClass();
                    String str = C3436.f11406;
                    SideActivity sideActivity = SideActivity.f416;
                    SideActivity sideActivityM7812 = AbstractC4489.m7812();
                    int i6 = Build.VERSION.SDK_INT;
                    if (i6 < 33) {
                        C3469.f11514.getClass();
                        C3469.m6257();
                    } else {
                        App app3 = App.f407;
                        App appM3410 = AbstractC1631.m3410();
                        if (i6 < 33) {
                            C3469.f11514.getClass();
                            C3469.m6257();
                        } else {
                            String str2 = C3436.f11406;
                            if (AbstractC4225.m7487(appM3410, str2) != 0) {
                                AbstractC4225.m7463(sideActivityM7812, new String[]{str2}, 1);
                            } else {
                                C3469.f11514.getClass();
                                C3469.m6257();
                            }
                        }
                    }
                }
                break;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                Boolean bool2 = (Boolean) obj;
                bool2.getClass();
                c3557.getClass();
                App app4 = App.f407;
                C1443 c1445 = AbstractC2776.m5217().f410;
                c1445.getClass();
                C2518 c25110 = new C2518(c1445);
                c25110.m4661(bool2, AbstractC2539.f8439.f5219);
                SharedPreferences.Editor editor3 = c25110.f8351;
                if (editor3 != null) {
                    editor3.apply();
                }
                if (!C1443.f4940 && !c1445.f4943) {
                    try {
                        AbstractC2765.m5147(c1445.f4945, c1445.m3070().concat(".xml"));
                        break;
                    } catch (Throwable unused3) {
                    }
                }
                AbstractC2765.m5135(AbstractC2776.m5210(c3557), null, 0, new C4564(i4, null, i4), 3);
                break;
            default:
                C4801 c4801 = (C4801) obj;
                C4801.m8179(c4801, new C0857(-489805598, new InterfaceC2609() { // from class: ۥؚۙؗۗ
                    @Override // p000.InterfaceC2609
                    /* JADX INFO: renamed from: ۦۙ */
                    public final Object mo1173(Object obj2, Object obj3, Object obj4) {
                        int i7 = i4;
                        C2358 c2359 = C2358.f7817;
                        C3557 c3558 = c3557;
                        C5362 c5362 = (C5362) obj3;
                        int iIntValue = ((Integer) obj4).intValue();
                        switch (i7) {
                            case 0:
                                new C4441(new long[]{7949207955881831400L, 2832985155934848688L, 7362301652662769904L, 3383372342479421589L, -4937013481747925585L, 9072733467896576887L}).toString();
                                if (!c5362.m9011(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    c5362.m8982();
                                } else {
                                    AbstractC4225.m7475(c3558, c5362, 8);
                                }
                                break;
                            case 1:
                                new C4441(new long[]{6834444760511643196L, 80583583599267669L, 4863965349927538649L, -7276245613918326195L, -3106829851194035719L, -7870184287745354706L}).toString();
                                if (!c5362.m9011(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    c5362.m8982();
                                } else {
                                    AbstractC4225.m7474(c3558, c5362, 8);
                                }
                                break;
                            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                                new C4441(new long[]{3966297456629511730L, -8394225221295778576L, 2532271922983744300L, 8771338915347074881L, -6133418763699985021L, 3899847408529686590L}).toString();
                                if (!c5362.m9011(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    c5362.m8982();
                                } else {
                                    AbstractC4225.m7489(c3558, c5362, 8);
                                }
                                break;
                            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                                new C4441(new long[]{8713986354023430953L, 1296668774838940503L, 3547005974033355316L, 3495297622615006460L, 2025346060902950464L, -7958184148151653572L}).toString();
                                if (!c5362.m9011(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    c5362.m8982();
                                } else {
                                    AbstractC4225.m7485(c3558, c5362, 8);
                                }
                                break;
                            case C4261.LONG_FIELD_NUMBER /* 4 */:
                                new C4441(new long[]{-880102584468640625L, -662219954464229679L, 5102178589738588126L, 8544399323137589512L, 4144205469540445894L, -6416710925460735049L}).toString();
                                if (!c5362.m9011(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    c5362.m8982();
                                } else {
                                    AbstractC4225.m7477(c3558, c5362, 8);
                                }
                                break;
                            case C4261.STRING_FIELD_NUMBER /* 5 */:
                                new C4441(new long[]{-8840036807015159971L, 4003474682647082880L, -5137016889572071668L, 3718840905876371157L, 7324964743507425762L, -7166102626509955383L}).toString();
                                if (!c5362.m9011(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    c5362.m8982();
                                } else {
                                    AbstractC4225.m7447(c3558, c5362, 8);
                                }
                                break;
                            default:
                                new C4441(new long[]{-25115619733369611L, 8263323213498731850L, -1202966833305227707L, -3866645675075774238L, -8562230573383870386L, -3554982450832147667L}).toString();
                                if (!c5362.m9011(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    c5362.m8982();
                                } else {
                                    AbstractC4225.m7486(c3558, c5362, 8);
                                }
                                break;
                        }
                        return c2359;
                    }
                }, true));
                if (Build.VERSION.SDK_INT >= 31) {
                    C4801.m8179(c4801, new C0857(1834934631, new InterfaceC2609() { // from class: ۥؚۙؗۗ
                        @Override // p000.InterfaceC2609
                        /* JADX INFO: renamed from: ۦۙ */
                        public final Object mo1173(Object obj2, Object obj3, Object obj4) {
                            int i7 = i3;
                            C2358 c2359 = C2358.f7817;
                            C3557 c3558 = c3557;
                            C5362 c5362 = (C5362) obj3;
                            int iIntValue = ((Integer) obj4).intValue();
                            switch (i7) {
                                case 0:
                                    new C4441(new long[]{7949207955881831400L, 2832985155934848688L, 7362301652662769904L, 3383372342479421589L, -4937013481747925585L, 9072733467896576887L}).toString();
                                    if (!c5362.m9011(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        c5362.m8982();
                                    } else {
                                        AbstractC4225.m7475(c3558, c5362, 8);
                                    }
                                    break;
                                case 1:
                                    new C4441(new long[]{6834444760511643196L, 80583583599267669L, 4863965349927538649L, -7276245613918326195L, -3106829851194035719L, -7870184287745354706L}).toString();
                                    if (!c5362.m9011(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        c5362.m8982();
                                    } else {
                                        AbstractC4225.m7474(c3558, c5362, 8);
                                    }
                                    break;
                                case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                                    new C4441(new long[]{3966297456629511730L, -8394225221295778576L, 2532271922983744300L, 8771338915347074881L, -6133418763699985021L, 3899847408529686590L}).toString();
                                    if (!c5362.m9011(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        c5362.m8982();
                                    } else {
                                        AbstractC4225.m7489(c3558, c5362, 8);
                                    }
                                    break;
                                case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                                    new C4441(new long[]{8713986354023430953L, 1296668774838940503L, 3547005974033355316L, 3495297622615006460L, 2025346060902950464L, -7958184148151653572L}).toString();
                                    if (!c5362.m9011(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        c5362.m8982();
                                    } else {
                                        AbstractC4225.m7485(c3558, c5362, 8);
                                    }
                                    break;
                                case C4261.LONG_FIELD_NUMBER /* 4 */:
                                    new C4441(new long[]{-880102584468640625L, -662219954464229679L, 5102178589738588126L, 8544399323137589512L, 4144205469540445894L, -6416710925460735049L}).toString();
                                    if (!c5362.m9011(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        c5362.m8982();
                                    } else {
                                        AbstractC4225.m7477(c3558, c5362, 8);
                                    }
                                    break;
                                case C4261.STRING_FIELD_NUMBER /* 5 */:
                                    new C4441(new long[]{-8840036807015159971L, 4003474682647082880L, -5137016889572071668L, 3718840905876371157L, 7324964743507425762L, -7166102626509955383L}).toString();
                                    if (!c5362.m9011(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        c5362.m8982();
                                    } else {
                                        AbstractC4225.m7447(c3558, c5362, 8);
                                    }
                                    break;
                                default:
                                    new C4441(new long[]{-25115619733369611L, 8263323213498731850L, -1202966833305227707L, -3866645675075774238L, -8562230573383870386L, -3554982450832147667L}).toString();
                                    if (!c5362.m9011(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        c5362.m8982();
                                    } else {
                                        AbstractC4225.m7486(c3558, c5362, 8);
                                    }
                                    break;
                            }
                            return c2359;
                        }
                    }, true));
                }
                C4801.m8179(c4801, AbstractC4489.f14865);
                if (!AbstractC0502.f1818) {
                    final int i7 = 4;
                    C4801.m8179(c4801, new C0857(427088, new InterfaceC2609() { // from class: ۥؚۙؗۗ
                        @Override // p000.InterfaceC2609
                        /* JADX INFO: renamed from: ۦۙ */
                        public final Object mo1173(Object obj2, Object obj3, Object obj4) {
                            int i8 = i7;
                            C2358 c2359 = C2358.f7817;
                            C3557 c3558 = c3557;
                            C5362 c5362 = (C5362) obj3;
                            int iIntValue = ((Integer) obj4).intValue();
                            switch (i8) {
                                case 0:
                                    new C4441(new long[]{7949207955881831400L, 2832985155934848688L, 7362301652662769904L, 3383372342479421589L, -4937013481747925585L, 9072733467896576887L}).toString();
                                    if (!c5362.m9011(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        c5362.m8982();
                                    } else {
                                        AbstractC4225.m7475(c3558, c5362, 8);
                                    }
                                    break;
                                case 1:
                                    new C4441(new long[]{6834444760511643196L, 80583583599267669L, 4863965349927538649L, -7276245613918326195L, -3106829851194035719L, -7870184287745354706L}).toString();
                                    if (!c5362.m9011(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        c5362.m8982();
                                    } else {
                                        AbstractC4225.m7474(c3558, c5362, 8);
                                    }
                                    break;
                                case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                                    new C4441(new long[]{3966297456629511730L, -8394225221295778576L, 2532271922983744300L, 8771338915347074881L, -6133418763699985021L, 3899847408529686590L}).toString();
                                    if (!c5362.m9011(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        c5362.m8982();
                                    } else {
                                        AbstractC4225.m7489(c3558, c5362, 8);
                                    }
                                    break;
                                case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                                    new C4441(new long[]{8713986354023430953L, 1296668774838940503L, 3547005974033355316L, 3495297622615006460L, 2025346060902950464L, -7958184148151653572L}).toString();
                                    if (!c5362.m9011(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        c5362.m8982();
                                    } else {
                                        AbstractC4225.m7485(c3558, c5362, 8);
                                    }
                                    break;
                                case C4261.LONG_FIELD_NUMBER /* 4 */:
                                    new C4441(new long[]{-880102584468640625L, -662219954464229679L, 5102178589738588126L, 8544399323137589512L, 4144205469540445894L, -6416710925460735049L}).toString();
                                    if (!c5362.m9011(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        c5362.m8982();
                                    } else {
                                        AbstractC4225.m7477(c3558, c5362, 8);
                                    }
                                    break;
                                case C4261.STRING_FIELD_NUMBER /* 5 */:
                                    new C4441(new long[]{-8840036807015159971L, 4003474682647082880L, -5137016889572071668L, 3718840905876371157L, 7324964743507425762L, -7166102626509955383L}).toString();
                                    if (!c5362.m9011(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        c5362.m8982();
                                    } else {
                                        AbstractC4225.m7447(c3558, c5362, 8);
                                    }
                                    break;
                                default:
                                    new C4441(new long[]{-25115619733369611L, 8263323213498731850L, -1202966833305227707L, -3866645675075774238L, -8562230573383870386L, -3554982450832147667L}).toString();
                                    if (!c5362.m9011(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        c5362.m8982();
                                    } else {
                                        AbstractC4225.m7486(c3558, c5362, 8);
                                    }
                                    break;
                            }
                            return c2359;
                        }
                    }, true));
                }
                final int i8 = 5;
                C4801.m8179(c4801, new C0857(-928556886, new InterfaceC2609() { // from class: ۥؚۙؗۗ
                    @Override // p000.InterfaceC2609
                    /* JADX INFO: renamed from: ۦۙ */
                    public final Object mo1173(Object obj2, Object obj3, Object obj4) {
                        int i9 = i8;
                        C2358 c2359 = C2358.f7817;
                        C3557 c3558 = c3557;
                        C5362 c5362 = (C5362) obj3;
                        int iIntValue = ((Integer) obj4).intValue();
                        switch (i9) {
                            case 0:
                                new C4441(new long[]{7949207955881831400L, 2832985155934848688L, 7362301652662769904L, 3383372342479421589L, -4937013481747925585L, 9072733467896576887L}).toString();
                                if (!c5362.m9011(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    c5362.m8982();
                                } else {
                                    AbstractC4225.m7475(c3558, c5362, 8);
                                }
                                break;
                            case 1:
                                new C4441(new long[]{6834444760511643196L, 80583583599267669L, 4863965349927538649L, -7276245613918326195L, -3106829851194035719L, -7870184287745354706L}).toString();
                                if (!c5362.m9011(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    c5362.m8982();
                                } else {
                                    AbstractC4225.m7474(c3558, c5362, 8);
                                }
                                break;
                            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                                new C4441(new long[]{3966297456629511730L, -8394225221295778576L, 2532271922983744300L, 8771338915347074881L, -6133418763699985021L, 3899847408529686590L}).toString();
                                if (!c5362.m9011(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    c5362.m8982();
                                } else {
                                    AbstractC4225.m7489(c3558, c5362, 8);
                                }
                                break;
                            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                                new C4441(new long[]{8713986354023430953L, 1296668774838940503L, 3547005974033355316L, 3495297622615006460L, 2025346060902950464L, -7958184148151653572L}).toString();
                                if (!c5362.m9011(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    c5362.m8982();
                                } else {
                                    AbstractC4225.m7485(c3558, c5362, 8);
                                }
                                break;
                            case C4261.LONG_FIELD_NUMBER /* 4 */:
                                new C4441(new long[]{-880102584468640625L, -662219954464229679L, 5102178589738588126L, 8544399323137589512L, 4144205469540445894L, -6416710925460735049L}).toString();
                                if (!c5362.m9011(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    c5362.m8982();
                                } else {
                                    AbstractC4225.m7477(c3558, c5362, 8);
                                }
                                break;
                            case C4261.STRING_FIELD_NUMBER /* 5 */:
                                new C4441(new long[]{-8840036807015159971L, 4003474682647082880L, -5137016889572071668L, 3718840905876371157L, 7324964743507425762L, -7166102626509955383L}).toString();
                                if (!c5362.m9011(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    c5362.m8982();
                                } else {
                                    AbstractC4225.m7447(c3558, c5362, 8);
                                }
                                break;
                            default:
                                new C4441(new long[]{-25115619733369611L, 8263323213498731850L, -1202966833305227707L, -3866645675075774238L, -8562230573383870386L, -3554982450832147667L}).toString();
                                if (!c5362.m9011(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    c5362.m8982();
                                } else {
                                    AbstractC4225.m7486(c3558, c5362, 8);
                                }
                                break;
                        }
                        return c2359;
                    }
                }, true));
                if (AbstractC0502.f1818) {
                    C4801.m8179(c4801, new C0857(-1622422138, new InterfaceC2609() { // from class: ۥؚۙؗۗ
                        @Override // p000.InterfaceC2609
                        /* JADX INFO: renamed from: ۦۙ */
                        public final Object mo1173(Object obj2, Object obj3, Object obj4) {
                            int i9 = i2;
                            C2358 c2359 = C2358.f7817;
                            C3557 c3558 = c3557;
                            C5362 c5362 = (C5362) obj3;
                            int iIntValue = ((Integer) obj4).intValue();
                            switch (i9) {
                                case 0:
                                    new C4441(new long[]{7949207955881831400L, 2832985155934848688L, 7362301652662769904L, 3383372342479421589L, -4937013481747925585L, 9072733467896576887L}).toString();
                                    if (!c5362.m9011(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        c5362.m8982();
                                    } else {
                                        AbstractC4225.m7475(c3558, c5362, 8);
                                    }
                                    break;
                                case 1:
                                    new C4441(new long[]{6834444760511643196L, 80583583599267669L, 4863965349927538649L, -7276245613918326195L, -3106829851194035719L, -7870184287745354706L}).toString();
                                    if (!c5362.m9011(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        c5362.m8982();
                                    } else {
                                        AbstractC4225.m7474(c3558, c5362, 8);
                                    }
                                    break;
                                case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                                    new C4441(new long[]{3966297456629511730L, -8394225221295778576L, 2532271922983744300L, 8771338915347074881L, -6133418763699985021L, 3899847408529686590L}).toString();
                                    if (!c5362.m9011(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        c5362.m8982();
                                    } else {
                                        AbstractC4225.m7489(c3558, c5362, 8);
                                    }
                                    break;
                                case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                                    new C4441(new long[]{8713986354023430953L, 1296668774838940503L, 3547005974033355316L, 3495297622615006460L, 2025346060902950464L, -7958184148151653572L}).toString();
                                    if (!c5362.m9011(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        c5362.m8982();
                                    } else {
                                        AbstractC4225.m7485(c3558, c5362, 8);
                                    }
                                    break;
                                case C4261.LONG_FIELD_NUMBER /* 4 */:
                                    new C4441(new long[]{-880102584468640625L, -662219954464229679L, 5102178589738588126L, 8544399323137589512L, 4144205469540445894L, -6416710925460735049L}).toString();
                                    if (!c5362.m9011(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        c5362.m8982();
                                    } else {
                                        AbstractC4225.m7477(c3558, c5362, 8);
                                    }
                                    break;
                                case C4261.STRING_FIELD_NUMBER /* 5 */:
                                    new C4441(new long[]{-8840036807015159971L, 4003474682647082880L, -5137016889572071668L, 3718840905876371157L, 7324964743507425762L, -7166102626509955383L}).toString();
                                    if (!c5362.m9011(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        c5362.m8982();
                                    } else {
                                        AbstractC4225.m7447(c3558, c5362, 8);
                                    }
                                    break;
                                default:
                                    new C4441(new long[]{-25115619733369611L, 8263323213498731850L, -1202966833305227707L, -3866645675075774238L, -8562230573383870386L, -3554982450832147667L}).toString();
                                    if (!c5362.m9011(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        c5362.m8982();
                                    } else {
                                        AbstractC4225.m7486(c3558, c5362, 8);
                                    }
                                    break;
                            }
                            return c2359;
                        }
                    }, true));
                } else {
                    final int i9 = 6;
                    C4801.m8179(c4801, new C0857(-236190737, new InterfaceC2609() { // from class: ۥؚۙؗۗ
                        @Override // p000.InterfaceC2609
                        /* JADX INFO: renamed from: ۦۙ */
                        public final Object mo1173(Object obj2, Object obj3, Object obj4) {
                            int i10 = i9;
                            C2358 c2359 = C2358.f7817;
                            C3557 c3558 = c3557;
                            C5362 c5362 = (C5362) obj3;
                            int iIntValue = ((Integer) obj4).intValue();
                            switch (i10) {
                                case 0:
                                    new C4441(new long[]{7949207955881831400L, 2832985155934848688L, 7362301652662769904L, 3383372342479421589L, -4937013481747925585L, 9072733467896576887L}).toString();
                                    if (!c5362.m9011(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        c5362.m8982();
                                    } else {
                                        AbstractC4225.m7475(c3558, c5362, 8);
                                    }
                                    break;
                                case 1:
                                    new C4441(new long[]{6834444760511643196L, 80583583599267669L, 4863965349927538649L, -7276245613918326195L, -3106829851194035719L, -7870184287745354706L}).toString();
                                    if (!c5362.m9011(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        c5362.m8982();
                                    } else {
                                        AbstractC4225.m7474(c3558, c5362, 8);
                                    }
                                    break;
                                case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                                    new C4441(new long[]{3966297456629511730L, -8394225221295778576L, 2532271922983744300L, 8771338915347074881L, -6133418763699985021L, 3899847408529686590L}).toString();
                                    if (!c5362.m9011(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        c5362.m8982();
                                    } else {
                                        AbstractC4225.m7489(c3558, c5362, 8);
                                    }
                                    break;
                                case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                                    new C4441(new long[]{8713986354023430953L, 1296668774838940503L, 3547005974033355316L, 3495297622615006460L, 2025346060902950464L, -7958184148151653572L}).toString();
                                    if (!c5362.m9011(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        c5362.m8982();
                                    } else {
                                        AbstractC4225.m7485(c3558, c5362, 8);
                                    }
                                    break;
                                case C4261.LONG_FIELD_NUMBER /* 4 */:
                                    new C4441(new long[]{-880102584468640625L, -662219954464229679L, 5102178589738588126L, 8544399323137589512L, 4144205469540445894L, -6416710925460735049L}).toString();
                                    if (!c5362.m9011(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        c5362.m8982();
                                    } else {
                                        AbstractC4225.m7477(c3558, c5362, 8);
                                    }
                                    break;
                                case C4261.STRING_FIELD_NUMBER /* 5 */:
                                    new C4441(new long[]{-8840036807015159971L, 4003474682647082880L, -5137016889572071668L, 3718840905876371157L, 7324964743507425762L, -7166102626509955383L}).toString();
                                    if (!c5362.m9011(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        c5362.m8982();
                                    } else {
                                        AbstractC4225.m7447(c3558, c5362, 8);
                                    }
                                    break;
                                default:
                                    new C4441(new long[]{-25115619733369611L, 8263323213498731850L, -1202966833305227707L, -3866645675075774238L, -8562230573383870386L, -3554982450832147667L}).toString();
                                    if (!c5362.m9011(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        c5362.m8982();
                                    } else {
                                        AbstractC4225.m7486(c3558, c5362, 8);
                                    }
                                    break;
                            }
                            return c2359;
                        }
                    }, true));
                }
                C4801.m8179(c4801, new C0857(-1165174711, new InterfaceC2609() { // from class: ۥؚۙؗۗ
                    @Override // p000.InterfaceC2609
                    /* JADX INFO: renamed from: ۦۙ */
                    public final Object mo1173(Object obj2, Object obj3, Object obj4) {
                        int i10 = i5;
                        C2358 c2359 = C2358.f7817;
                        C3557 c3558 = c3557;
                        C5362 c5362 = (C5362) obj3;
                        int iIntValue = ((Integer) obj4).intValue();
                        switch (i10) {
                            case 0:
                                new C4441(new long[]{7949207955881831400L, 2832985155934848688L, 7362301652662769904L, 3383372342479421589L, -4937013481747925585L, 9072733467896576887L}).toString();
                                if (!c5362.m9011(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    c5362.m8982();
                                } else {
                                    AbstractC4225.m7475(c3558, c5362, 8);
                                }
                                break;
                            case 1:
                                new C4441(new long[]{6834444760511643196L, 80583583599267669L, 4863965349927538649L, -7276245613918326195L, -3106829851194035719L, -7870184287745354706L}).toString();
                                if (!c5362.m9011(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    c5362.m8982();
                                } else {
                                    AbstractC4225.m7474(c3558, c5362, 8);
                                }
                                break;
                            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                                new C4441(new long[]{3966297456629511730L, -8394225221295778576L, 2532271922983744300L, 8771338915347074881L, -6133418763699985021L, 3899847408529686590L}).toString();
                                if (!c5362.m9011(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    c5362.m8982();
                                } else {
                                    AbstractC4225.m7489(c3558, c5362, 8);
                                }
                                break;
                            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                                new C4441(new long[]{8713986354023430953L, 1296668774838940503L, 3547005974033355316L, 3495297622615006460L, 2025346060902950464L, -7958184148151653572L}).toString();
                                if (!c5362.m9011(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    c5362.m8982();
                                } else {
                                    AbstractC4225.m7485(c3558, c5362, 8);
                                }
                                break;
                            case C4261.LONG_FIELD_NUMBER /* 4 */:
                                new C4441(new long[]{-880102584468640625L, -662219954464229679L, 5102178589738588126L, 8544399323137589512L, 4144205469540445894L, -6416710925460735049L}).toString();
                                if (!c5362.m9011(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    c5362.m8982();
                                } else {
                                    AbstractC4225.m7477(c3558, c5362, 8);
                                }
                                break;
                            case C4261.STRING_FIELD_NUMBER /* 5 */:
                                new C4441(new long[]{-8840036807015159971L, 4003474682647082880L, -5137016889572071668L, 3718840905876371157L, 7324964743507425762L, -7166102626509955383L}).toString();
                                if (!c5362.m9011(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    c5362.m8982();
                                } else {
                                    AbstractC4225.m7447(c3558, c5362, 8);
                                }
                                break;
                            default:
                                new C4441(new long[]{-25115619733369611L, 8263323213498731850L, -1202966833305227707L, -3866645675075774238L, -8562230573383870386L, -3554982450832147667L}).toString();
                                if (!c5362.m9011(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    c5362.m8982();
                                } else {
                                    AbstractC4225.m7486(c3558, c5362, 8);
                                }
                                break;
                        }
                        return c2359;
                    }
                }, true));
                C4801.m8179(c4801, AbstractC4489.f14864);
                break;
        }
        return c2358;
    }
}
