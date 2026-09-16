package p000;

import android.graphics.Typeface;
import android.text.Spannable;
import androidx.compose.p002ui.input.pointer.PointerInputEventHandler;
import java.util.List;
import ru.bluecat.yandexmapspatcher.R;

/* JADX INFO: renamed from: ۦٙؗۙٞ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4513 implements InterfaceC2609 {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ Object f14911;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ Object f14912;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f14913;

    public /* synthetic */ C4513(int i, Object obj, Object obj2) {
        this.f14913 = i;
        this.f14912 = obj;
        this.f14911 = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:83:0x022a  */
    /* JADX WARN: Code duplicated, block: B:84:0x022c  */
    @Override // p000.InterfaceC2609
    /* JADX INFO: renamed from: ۦۙ */
    public final Object mo1173(Object obj, Object obj2, Object obj3) {
        final int i;
        float f;
        Typeface typeface;
        int i2 = this.f14913;
        InterfaceC0443 interfaceC0443 = null;
        C4217 c4217 = C4217.f13994;
        int i3 = 2;
        C4036 c4036 = C2850.f9517;
        C2358 c2358 = C2358.f7817;
        Object obj4 = this.f14911;
        Object obj5 = this.f14912;
        int i4 = 0;
        switch (i2) {
            case 0:
                final C3103 c3103 = (C3103) obj5;
                final C5081 c5081 = (C5081) obj4;
                final C4417 c4417 = (C4417) obj;
                C5362 c5362 = (C5362) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                new C4441(new long[]{1503671037464733623L, -6140134459905419282L, 8507232948519877966L, 6778962533522277121L, -1296048277037691716L, 6906706316722747973L, 2389746453049272914L}).toString();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= (iIntValue & 8) == 0 ? c5362.m8963(c4417) : c5362.m8977(c4417) ? 4 : 2;
                }
                if (!c5362.m9011(iIntValue & 1, (iIntValue & 19) != 18)) {
                    c5362.m8982();
                    return c2358;
                }
                C1911 c1911 = C1298.f4426;
                C4182 c4182 = AbstractC4410.f14521;
                InterfaceC0705 interfaceC0705M7907 = AbstractC4554.m7907(AbstractC5568.m9381(AbstractC4410.m7700(AbstractC4410.m7707(c4182, 1), 0.0f, c4417.f14564, 1), 20.0f, 0.0f, 20.0f, c4417.f14561 + 10.0f, 2), AbstractC4554.m7939(c5362));
                new C4441(new long[]{-8662127354745561770L, -1918179265282091845L, 6027839412061989184L, 6640440700368712548L, -3690133526574236075L, -6662750474405520248L, -8241129410044457824L, -3673102742948076256L, 5717325946641591468L, 5264463003028378858L, -647346774874115471L, 5352334790622673309L, 8633887018307579127L, 3187391607847069580L, -1811083659906881672L}).toString();
                C3113 c3113M9197 = AbstractC5501.m9197(AbstractC4225.f14009, c1911, c5362, 48);
                new C4441(new long[]{-1408339751588896595L, -8084989430441433644L, -4581923920360733791L, 224809428552701204L, -1900578166473085198L, 5644156510320080185L, -6661808687114314180L, 4734239417116569560L, 4965164171208678600L, 8979304576796736279L, 8786027944956373000L, -5530812728239130062L}).toString();
                int iHashCode = Long.hashCode(c5362.f17657);
                C2103 c2103M8994 = c5362.m8994();
                InterfaceC0705 interfaceC0705M2161 = AbstractC0993.m2161(c5362, interfaceC0705M7907);
                InterfaceC4576.f15106.getClass();
                C3709 c3709 = C0849.f3049;
                new C4441(new long[]{4210876647888252896L, -6504235164974605495L, -1494033835226360529L, 2080864575496655481L, 4545463056042605204L, 3123294950042442156L, 3781654865743242499L, 6492311568991905340L, -7477572347860426532L, -2291617956437045892L, 1268745342378465875L, 5010466349229605799L}).toString();
                c5362.m8983();
                if (c5362.f17668) {
                    c5362.m9005(c3709);
                } else {
                    c5362.m8972();
                }
                C3136 c3136 = C0849.f3048;
                AbstractC0993.m2127(c3136, c5362, c3113M9197);
                C3136 c3137 = C0849.f3047;
                AbstractC0993.m2127(c3137, c5362, c2103M8994);
                Integer numValueOf = Integer.valueOf(iHashCode);
                C3136 c3138 = C0849.f3053;
                AbstractC0993.m2127(c3138, c5362, numValueOf);
                C1931 c1931 = C0849.f3050;
                AbstractC0993.m2146(c5362, c1931);
                C3136 c3139 = C0849.f3052;
                AbstractC0993.m2127(c3139, c5362, interfaceC0705M2161);
                new C4441(new long[]{-1216265927808633539L, -7686766494550171468L, 8746205397243364147L, -1100134330989333666L, 2172155398047627604L}).toString();
                new C4441(new long[]{5756175743526942951L, 8151589783765275917L, 7715187395070230869L, 6907355463907383271L, 3668374093734688681L, 6800450500590362785L, -5237475227531334511L, -2549850356600100484L, 4499451631119274655L, -1496973680439294671L, 9063496717770851540L, -661120687069453233L, 8408460110429349305L, 4824402847496411200L, -7925154350061947718L, 8574714385293483415L, 4295758122733582845L, 5867366758001479402L, -1315873124275675350L, -3380291489854682251L, -6419186594229059336L, -4326579665708616000L, -5222996271382917544L, 1554782605328250610L, -7453860951599133587L}).toString();
                String strM5804 = C3133.m5804(R.string.selfupdate_title, c5362);
                C1626 c1626 = C1626.f5442;
                C4216 c4216 = AbstractC4957.f16399;
                AbstractC0495.m1105(strM5804, null, 0L, 0L, c1626, 0L, null, 0L, 0, false, 0, 0, ((C4413) c5362.m8997(c4216)).f14539, c5362, 1572864, 0, 131006);
                AbstractC1434.m3048(c5362, AbstractC4410.m7703(c4217, 6.0f));
                AbstractC0495.m1105(C3133.m5786(R.string.selfupdate_version, new Object[]{c3103.f10401, Integer.valueOf(c3103.f10404)}, c5362), null, 0L, 0L, C1626.f5441, 0L, null, 0L, 0, false, 0, 0, ((C4413) c5362.m8997(c4216)).f14549, c5362, 1572864, 0, 131006);
                AbstractC1434.m3048(c5362, AbstractC4410.m7703(c4217, 3.0f));
                C3621 c3621 = new C3621(C1298.f4443);
                String str = c3103.f10402;
                C4216 c4218 = AbstractC0194.f721;
                new C4441(new long[]{6213944203655554037L, 1902409055348422609L, -5091172720990339153L, -6487221981612521776L, 1513687707013714572L, 7891081395059440797L, 5201450225038935724L}).toString();
                C1327 c1327 = (C1327) c5362.m8997(c4218);
                int i5 = iIntValue;
                AbstractC3933.m7098(str, c3621, ((C2917) c5362.m8997(AbstractC0118.f470)).f9752, 0, new C3564(c1327.f4595, AbstractC4489.m7788(14), C1626.f5439, AbstractC4489.m7817(0.2d), 0, AbstractC4489.m7817(20.0d), new C0507(), new C1220(C5830.f19206, 0, 0), 15073112), 0, false, 0L, 0L, 0L, false, c5362, 0);
                AbstractC1434.m3048(c5362, AbstractC4410.m7703(c4217, 15.0f));
                InterfaceC0705 interfaceC0705M9381 = AbstractC5568.m9381(c4182, 12.0f, 0.0f, 12.0f, 0.0f, 10);
                new C4441(new long[]{6312135659784077639L, 1362615502789543063L, 4044836239242652577L, 6745459328202074213L, -5797247964212923980L, -1936102274258793694L, 3227598063260823971L, 7235303526723021991L, 4768766611259229418L, -7385701498673379802L, 2693444746191279774L, -1548914593342819208L, -4498631375235577450L, 6917889283766619683L}).toString();
                C3668 c3668M6047 = AbstractC3287.m6047(AbstractC4225.f14014, C1298.f4433, c5362, 0);
                new C4441(new long[]{6374750656905974794L, 5294628180841863674L, 4567462554063689525L, -1249891962238069495L, 297190075641570257L, -8704445264434687428L, 2324070897458036226L, -4560395620118961406L, -4065835462372385236L, 3752129704229553538L, 2796269640156877834L, -4768810380283987500L}).toString();
                int iHashCode2 = Long.hashCode(c5362.f17657);
                C2103 c2103M8995 = c5362.m8994();
                InterfaceC0705 interfaceC0705M2162 = AbstractC0993.m2161(c5362, interfaceC0705M9381);
                new C4441(new long[]{1980567475750951912L, -5908411924269095898L, 460842978445169866L, -2356547697350931062L, -3841432624172826600L, -710951537984226711L, -584039156751833230L, 3545418110779363709L, -8791474141637566471L, 838243095425867519L, 2675716403530686435L, 4926665769242229204L}).toString();
                c5362.m8983();
                if (c5362.f17668) {
                    c5362.m9005(c3709);
                } else {
                    c5362.m8972();
                }
                AbstractC0993.m2127(c3136, c5362, c3668M6047);
                AbstractC0993.m2127(c3137, c5362, c2103M8995);
                AbstractC0993.m2127(c3138, c5362, Integer.valueOf(iHashCode2));
                AbstractC0993.m2146(c5362, c1931);
                AbstractC0993.m2127(c3139, c5362, interfaceC0705M2162);
                new C4441(new long[]{8294606098103425173L, -4673907731818250416L, 5317149614242216050L, 8925898210328323268L, 1567356173415594326L}).toString();
                new C4441(new long[]{7261695293502302128L, 4847539079996577136L, -7727561658676657573L, -1173336299330859604L, 1461591317837547896L, 1849426845273698153L, -8515186650390143435L, -7888627983194876765L, 6215011248241532491L, 6934999681394511634L, -2959591722177508866L}).toString();
                InterfaceC0705 interfaceC0705M9382 = AbstractC5568.m9381(C0196.m457(), 0.0f, 0.0f, 8.0f, 0.0f, 11);
                new C4441(new long[]{5242274465474930565L, 5925145861212088499L, 7646963056373979971L, 343730768327116289L, 8586267043159350960L}).toString();
                int i6 = i5 & 14;
                boolean zM8977 = c5362.m8977(c3103) | (i6 == 4 || ((i5 & 8) != 0 && c5362.m8977(c4417))) | c5362.m8977(c5081);
                Object objM8999 = c5362.m8999();
                if (zM8977 || objM8999 == c4036) {
                    i = 0;
                    objM8999 = new InterfaceC4448() { // from class: ۦ٘ؑؑۙ
                        @Override // p000.InterfaceC4448
                        /* JADX INFO: renamed from: ۥۣ */
                        public final Object mo449() {
                            int i7 = i;
                            C2358 c2359 = C2358.f7817;
                            final C5081 c5082 = c5081;
                            C3103 c3104 = c3103;
                            final C4417 c4418 = c4417;
                            final int i8 = 0;
                            switch (i7) {
                                case 0:
                                    AbstractC2765.m5135(c4418.f14563, null, 0, new C2315(c4418, c3104, (InterfaceC0443) null), 3).mo859(new InterfaceC4745() { // from class: ۦٖ٘ؑٙ
                                        @Override // p000.InterfaceC4745
                                        /* JADX INFO: renamed from: ۦؚ */
                                        public final Object mo211(Object obj6) {
                                            Object value;
                                            Object value2;
                                            int i9 = i8;
                                            C2358 c23510 = C2358.f7817;
                                            C5081 c5083 = c5082;
                                            C4417 c4419 = c4418;
                                            switch (i9) {
                                                case 0:
                                                    if (!c4419.f14562.m3525()) {
                                                        C4994 c4994 = c5083.f16852.f6235;
                                                        do {
                                                            value = c4994.getValue();
                                                        } while (!c4994.m8386(value, C3584.m6401((C3584) value, false, null, 2)));
                                                    }
                                                    break;
                                                default:
                                                    if (!c4419.f14562.m3525()) {
                                                        C4994 c4995 = c5083.f16852.f6235;
                                                        do {
                                                            value2 = c4995.getValue();
                                                        } while (!c4995.m8386(value2, C3584.m6401((C3584) value2, false, null, 2)));
                                                    }
                                                    break;
                                            }
                                            return c23510;
                                        }
                                    });
                                    break;
                                default:
                                    final int i9 = 1;
                                    AbstractC2765.m5135(c4418.f14563, null, 0, new C2315(c3104, c4418, (InterfaceC0443) null), 3).mo859(new InterfaceC4745() { // from class: ۦٖ٘ؑٙ
                                        @Override // p000.InterfaceC4745
                                        /* JADX INFO: renamed from: ۦؚ */
                                        public final Object mo211(Object obj6) {
                                            Object value;
                                            Object value2;
                                            int i10 = i9;
                                            C2358 c23510 = C2358.f7817;
                                            C5081 c5083 = c5082;
                                            C4417 c4419 = c4418;
                                            switch (i10) {
                                                case 0:
                                                    if (!c4419.f14562.m3525()) {
                                                        C4994 c4994 = c5083.f16852.f6235;
                                                        do {
                                                            value = c4994.getValue();
                                                        } while (!c4994.m8386(value, C3584.m6401((C3584) value, false, null, 2)));
                                                    }
                                                    break;
                                                default:
                                                    if (!c4419.f14562.m3525()) {
                                                        C4994 c4995 = c5083.f16852.f6235;
                                                        do {
                                                            value2 = c4995.getValue();
                                                        } while (!c4995.m8386(value2, C3584.m6401((C3584) value2, false, null, 2)));
                                                    }
                                                    break;
                                            }
                                            return c23510;
                                        }
                                    });
                                    break;
                            }
                            return c2359;
                        }
                    };
                    c5362.m8987(objM8999);
                } else {
                    i = 0;
                }
                AbstractC3933.m7084((InterfaceC4448) objM8999, interfaceC0705M9382, false, null, null, null, null, AbstractC2765.f9167, c5362, 805306368, 508);
                InterfaceC0705 interfaceC0705M9383 = AbstractC5568.m9381(C0196.m457(), 8.0f, 0.0f, 0.0f, 0.0f, 14);
                new C4441(new long[]{-1492150589079979517L, -8467339394105759402L, -6322319925965694747L, 2878175126429059339L, -4656682587720397175L}).toString();
                int i7 = (c5362.m8977(c3103) ? 1 : 0) | ((i6 == 4 || ((i5 & 8) != 0 && c5362.m8977(c4417))) ? 1 : i) | (c5362.m8977(c5081) ? 1 : 0);
                Object objM89910 = c5362.m8999();
                if (i7 != 0 || objM89910 == c4036) {
                    final int i8 = 1;
                    objM89910 = new InterfaceC4448() { // from class: ۦ٘ؑؑۙ
                        @Override // p000.InterfaceC4448
                        /* JADX INFO: renamed from: ۥۣ */
                        public final Object mo449() {
                            int i9 = i8;
                            C2358 c2359 = C2358.f7817;
                            final C5081 c5082 = c5081;
                            C3103 c3104 = c3103;
                            final C4417 c4418 = c4417;
                            final int i10 = 0;
                            switch (i9) {
                                case 0:
                                    AbstractC2765.m5135(c4418.f14563, null, 0, new C2315(c4418, c3104, (InterfaceC0443) null), 3).mo859(new InterfaceC4745() { // from class: ۦٖ٘ؑٙ
                                        @Override // p000.InterfaceC4745
                                        /* JADX INFO: renamed from: ۦؚ */
                                        public final Object mo211(Object obj6) {
                                            Object value;
                                            Object value2;
                                            int i11 = i10;
                                            C2358 c23510 = C2358.f7817;
                                            C5081 c5083 = c5082;
                                            C4417 c4419 = c4418;
                                            switch (i11) {
                                                case 0:
                                                    if (!c4419.f14562.m3525()) {
                                                        C4994 c4994 = c5083.f16852.f6235;
                                                        do {
                                                            value = c4994.getValue();
                                                        } while (!c4994.m8386(value, C3584.m6401((C3584) value, false, null, 2)));
                                                    }
                                                    break;
                                                default:
                                                    if (!c4419.f14562.m3525()) {
                                                        C4994 c4995 = c5083.f16852.f6235;
                                                        do {
                                                            value2 = c4995.getValue();
                                                        } while (!c4995.m8386(value2, C3584.m6401((C3584) value2, false, null, 2)));
                                                    }
                                                    break;
                                            }
                                            return c23510;
                                        }
                                    });
                                    break;
                                default:
                                    final int i11 = 1;
                                    AbstractC2765.m5135(c4418.f14563, null, 0, new C2315(c3104, c4418, (InterfaceC0443) null), 3).mo859(new InterfaceC4745() { // from class: ۦٖ٘ؑٙ
                                        @Override // p000.InterfaceC4745
                                        /* JADX INFO: renamed from: ۦؚ */
                                        public final Object mo211(Object obj6) {
                                            Object value;
                                            Object value2;
                                            int i12 = i11;
                                            C2358 c23510 = C2358.f7817;
                                            C5081 c5083 = c5082;
                                            C4417 c4419 = c4418;
                                            switch (i12) {
                                                case 0:
                                                    if (!c4419.f14562.m3525()) {
                                                        C4994 c4994 = c5083.f16852.f6235;
                                                        do {
                                                            value = c4994.getValue();
                                                        } while (!c4994.m8386(value, C3584.m6401((C3584) value, false, null, 2)));
                                                    }
                                                    break;
                                                default:
                                                    if (!c4419.f14562.m3525()) {
                                                        C4994 c4995 = c5083.f16852.f6235;
                                                        do {
                                                            value2 = c4995.getValue();
                                                        } while (!c4995.m8386(value2, C3584.m6401((C3584) value2, false, null, 2)));
                                                    }
                                                    break;
                                            }
                                            return c23510;
                                        }
                                    });
                                    break;
                            }
                            return c2359;
                        }
                    };
                    c5362.m8987(objM89910);
                }
                AbstractC3933.m7084((InterfaceC4448) objM89910, interfaceC0705M9383, false, null, null, null, null, AbstractC2765.f9172, c5362, 805306368, 508);
                c5362.m9009(true);
                c5362.m9009(true);
                return c2358;
            case 1:
                InterfaceC4745 interfaceC4745 = (InterfaceC4745) obj5;
                C2450 c2450 = (C2450) obj4;
                C5362 c5363 = (C5362) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                if (c5363.m9011(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    Object objM89911 = c5363.m8999();
                    if (objM89911 == c4036) {
                        objM89911 = new C0767();
                        c5363.m8987(objM89911);
                    }
                    C0767 c0767 = (C0767) objM89911;
                    c0767.f2783.clear();
                    interfaceC4745.mo211(c0767);
                    c0767.m1659(c2450, c5363, 0);
                } else {
                    c5363.m8982();
                }
                return c2358;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                List list = (List) obj5;
                C2384 c2384 = (C2384) obj4;
                InterfaceC1291 interfaceC1291 = (InterfaceC1291) obj;
                C5362 c5364 = (C5362) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                new C4441(new long[]{-2940078427059679232L, 4634193996222930976L, -3914391853140805800L, -2502397669706683849L, -5828516895112652263L, -7251431323583468667L, -4646116145351865508L, -4013059324002141249L}).toString();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= c5364.m8963(interfaceC1291) ? 4 : 2;
                }
                if (c5364.m9011(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    InterfaceC0705 interfaceC0705M9378 = AbstractC5568.m9378(c4217, interfaceC1291);
                    new C4441(new long[]{-2804520133892976249L, -2170864450168384164L, -2082843873329810462L, -4556324289979660008L, 5454671455361637326L, -8959444117890862155L, 4016844764208420859L, 8101174724491796791L, -6830744630850130946L, 7513394562562846935L, -5493689214893389669L, 2794308575877946110L, -7027987468105532205L, -3938716214319431314L, 1154698863998690610L}).toString();
                    C3113 c3113M9198 = AbstractC5501.m9197(AbstractC4225.f14009, C1298.f4443, c5364, 0);
                    new C4441(new long[]{5205134040892040572L, 1462572214108658361L, -1672014719477510627L, 8671033029235966724L, -6191419527018711366L, -1463742942349774113L, -2961943296720917715L, 1210841443115956235L, 1291073270769317121L, -3634447760567565497L, -4019884879652078580L, -799505243421694294L}).toString();
                    int iHashCode3 = Long.hashCode(c5364.f17657);
                    C2103 c2103M8996 = c5364.m8994();
                    InterfaceC0705 interfaceC0705M2163 = AbstractC0993.m2161(c5364, interfaceC0705M9378);
                    InterfaceC4576.f15106.getClass();
                    C3709 c37010 = C0849.f3049;
                    new C4441(new long[]{-3077767372741414771L, -6579548637253195106L, -1012377941348102258L, 7904685184966457192L, 2259373116448130499L, 1431821785097593758L, 7396254272554646949L, 4066155199895487722L, 3390530098326412474L, -6203582186212499050L, -5543272906098077355L, 6365506837163360848L}).toString();
                    c5364.m8983();
                    if (c5364.f17668) {
                        c5364.m9005(c37010);
                    } else {
                        c5364.m8972();
                    }
                    AbstractC0993.m2127(C0849.f3048, c5364, c3113M9198);
                    AbstractC0993.m2127(C0849.f3047, c5364, c2103M8996);
                    AbstractC0993.m2127(C0849.f3053, c5364, Integer.valueOf(iHashCode3));
                    AbstractC0993.m2146(c5364, C0849.f3050);
                    AbstractC0993.m2127(C0849.f3052, c5364, interfaceC0705M2163);
                    new C4441(new long[]{7313597615992121170L, 1495828943337911896L, -1154016632813432923L, 8205743734126782042L, 7194490342508668104L}).toString();
                    new C4441(new long[]{-590836304798536473L, -2959962963898642783L, -7160013642080804070L, 7578419241939516575L, 5940840689618806096L, -4339192937524730751L, -6719907929298139024L}).toString();
                    AbstractC4489.m7815(list, c2384, c5364, 6);
                    AbstractC4489.m7792(list, c2384, c5364, 6);
                    c5364.m9009(true);
                } else {
                    c5364.m8982();
                }
                return c2358;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                C2384 c2385 = (C2384) obj5;
                EnumC2459 enumC2459 = (EnumC2459) obj4;
                float fFloatValue = ((Float) obj).floatValue();
                float fFloatValue2 = ((Float) obj2).floatValue();
                float fFloatValue3 = ((Float) obj3).floatValue();
                boolean zM5789 = C3133.m5789(c2385, fFloatValue);
                if (c2385.m1402().f7485 != EnumC1616.f5425 && enumC2459 != EnumC2459.f8215) {
                    zM5789 = !zM5789;
                }
                int i9 = c2385.m1402().f7490;
                float fM5806 = i9 == 0 ? 0.0f : C3133.m5806(c2385) / i9;
                float f2 = fM5806 - ((int) fM5806);
                if (Math.abs(fFloatValue) >= c2385.f2359.mo741(400.0f)) {
                    i4 = fFloatValue > 0.0f ? 1 : 2;
                }
                if (i4 == 0) {
                    if (Math.abs(f2) <= 0.5f) {
                        float fAbs = Math.abs(fM5806);
                        InterfaceC2880 interfaceC2880 = c2385.f2359;
                        C3843 c3843 = AbstractC0630.f2331;
                        if (fAbs < Math.abs(Math.min(interfaceC2880.mo741(56.0f), c2385.m1408() / 2.0f) / c2385.m1408()) ? Math.abs(fFloatValue2) >= Math.abs(fFloatValue3) : !zM5789) {
                            f = fFloatValue3;
                        } else {
                            f = fFloatValue2;
                        }
                    } else if (zM5789) {
                        f = fFloatValue3;
                    } else {
                        f = fFloatValue2;
                    }
                } else if (i4 == 1) {
                    f = fFloatValue3;
                } else if (i4 == 2) {
                    f = fFloatValue2;
                } else {
                    f = 0.0f;
                }
                return Float.valueOf(f);
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                InterfaceC4448 interfaceC4448 = (InterfaceC4448) obj5;
                InterfaceC4745 interfaceC4746 = (InterfaceC4745) obj4;
                C5362 c5365 = (C5362) obj2;
                ((Integer) obj3).getClass();
                c5365.m8957(759876635);
                Object objM89912 = c5365.m8999();
                Object obj6 = objM89912;
                if (objM89912 == c4036) {
                    C5704 c5704M5600 = AbstractC3004.m5600(interfaceC4448);
                    c5365.m8987(c5704M5600);
                    obj6 = c5704M5600;
                }
                InterfaceC5372 interfaceC5372 = (InterfaceC5372) obj6;
                Object objM89913 = c5365.m8999();
                Object obj7 = objM89913;
                if (objM89913 == c4036) {
                    C1553 c1553 = (C1553) interfaceC5372.getValue();
                    long j = c1553.f5241;
                    C5825 c5825 = new C5825(c1553, AbstractC4382.f14446, new C1553(AbstractC4382.f14445), 8);
                    c5365.m8987(c5825);
                    obj7 = c5825;
                }
                C5825 c5826 = (C5825) obj7;
                boolean zM8978 = c5365.m8977(c5826);
                Object objM89914 = c5365.m8999();
                Object obj8 = objM89914;
                if (zM8978 || objM89914 == c4036) {
                    C0061 c0061 = new C0061(interfaceC5372, c5826, interfaceC0443, 29);
                    c5365.m8987(c0061);
                    obj8 = c0061;
                }
                AbstractC3925.m7030((InterfaceC5731) obj8, c5365, c2358);
                C3411 c3411 = c5826.f19169;
                boolean zM8963 = c5365.m8963(c3411);
                Object objM89915 = c5365.m8999();
                if (zM8963 || objM89915 == c4036) {
                    objM89915 = new C4232(c3411, 0);
                    c5365.m8987(objM89915);
                }
                InterfaceC0705 interfaceC0705 = (InterfaceC0705) interfaceC4746.mo211((InterfaceC4448) objM89915);
                c5365.m9009(false);
                return interfaceC0705;
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                Spannable spannable = (Spannable) obj5;
                C2081 c2081 = (C2081) obj4;
                C0553 c0553 = (C0553) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                int iIntValue5 = ((Integer) obj3).intValue();
                AbstractC0903 abstractC0903 = c0553.f1986;
                C1626 c1627 = c0553.f1984;
                if (c1627 == null) {
                    c1627 = C1626.f5439;
                }
                C5827 c5827 = c0553.f1990;
                i4 = c5827 != null ? c5827.f19197 : 0;
                C2848 c2848 = c0553.f1985;
                int i10 = c2848 != null ? c2848.f9512 : 65535;
                C5541 c5541 = (C5541) c2081.f6863;
                C4879 c4879M2590 = ((C1226) c5541.f18293).m2590(abstractC0903, c1627, i4, i10);
                if (c4879M2590 instanceof C4879) {
                    typeface = (Typeface) c4879M2590.f16042;
                } else {
                    C5460 c5460 = new C5460(c4879M2590, c5541.f18299);
                    c5541.f18299 = c5460;
                    typeface = (Typeface) c5460.f18000;
                }
                spannable.setSpan(new C5799(i3, typeface), iIntValue4, iIntValue5, 33);
                return c2358;
            default:
                C4256 c4256 = (C4256) obj5;
                C2243 c2243 = (C2243) obj4;
                C5362 c5366 = (C5362) obj2;
                ((Integer) obj3).getClass();
                c5366.m8957(-102778667);
                Object objM89916 = c5366.m8999();
                Object obj9 = objM89916;
                if (objM89916 == c4036) {
                    InterfaceC4643 interfaceC4643M7061 = AbstractC3925.m7061(c5366);
                    c5366.m8987(interfaceC4643M7061);
                    obj9 = interfaceC4643M7061;
                }
                InterfaceC4643 interfaceC4643 = (InterfaceC4643) obj9;
                Object objM89917 = c5366.m8999();
                Object obj10 = objM89917;
                if (objM89917 == c4036) {
                    C4852 c4852M5183 = AbstractC2774.m5183(null);
                    c5366.m8987(c4852M5183);
                    obj10 = c4852M5183;
                }
                InterfaceC4367 interfaceC4367 = (InterfaceC4367) obj10;
                InterfaceC4367 interfaceC4367M5175 = AbstractC2774.m5175(c4256, c5366);
                boolean zM8964 = c5366.m8963(c2243);
                Object objM89918 = c5366.m8999();
                Object obj11 = objM89918;
                if (zM8964 || objM89918 == c4036) {
                    C1708 c1708 = new C1708(10, interfaceC4367, c2243);
                    c5366.m8987(c1708);
                    obj11 = c1708;
                }
                AbstractC3925.m7028(c2243, (InterfaceC4745) obj11, c5366);
                boolean zM8979 = c5366.m8977(interfaceC4643) | c5366.m8963(c2243) | c5366.m8963(interfaceC4367M5175);
                Object objM89919 = c5366.m8999();
                Object obj12 = objM89919;
                if (zM8979 || objM89919 == c4036) {
                    C3125 c3125 = new C3125(interfaceC4643, interfaceC4367, c2243, interfaceC4367M5175);
                    c5366.m8987(c3125);
                    obj12 = c3125;
                }
                InterfaceC0705 interfaceC0705M5588 = AbstractC2995.m5588(c4217, c2243, (PointerInputEventHandler) obj12);
                c5366.m9009(false);
                return interfaceC0705M5588;
        }
    }
}
