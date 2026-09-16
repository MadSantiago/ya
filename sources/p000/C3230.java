package p000;

import java.util.ArrayList;
import java.util.Iterator;
import ru.bluecat.yandexmapspatcher.R;

/* JADX INFO: renamed from: ۦؔؕ۠۟, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3230 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ InterfaceC4367 f10846;

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ C1347 f10847;

    /* JADX INFO: renamed from: ۥٓ */
    public final /* synthetic */ C1542 f10848;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ ArrayList f10849;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f10850;

    public /* synthetic */ C3230(ArrayList arrayList, C1347 c1347, C1542 c1542, InterfaceC4367 interfaceC4367, int i) {
        this.f10850 = i;
        this.f10849 = arrayList;
        this.f10847 = c1347;
        this.f10848 = c1542;
        this.f10846 = interfaceC4367;
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        int i = this.f10850;
        C2358 c2358 = C2358.f7817;
        switch (i) {
            case 0:
                C5362 c5362 = (C5362) obj;
                int iIntValue = ((Integer) obj2).intValue();
                new C4441(new long[]{6383861399179301784L, 8258862764746726360L, -6024785164465559232L, 8562564919712400432L, -5026869626844072911L, 2094800414648627444L, 1534047055074990748L, 2337959619824742084L}).toString();
                if (!c5362.m9011(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c5362.m8982();
                } else {
                    InterfaceC0705 interfaceC0705M7907 = AbstractC4554.m7907(AbstractC5568.m9377(AbstractC4410.f14521, 20.0f, 20.0f, 20.0f, 15.0f), AbstractC4554.m7939(c5362));
                    new C4441(new long[]{7460113076459269034L, -1109484454059468263L, -1892680556955156555L, -622788292406710120L, -1088314019859807369L, -3387714203261740159L, -3281925565527917784L, 6988102497140693545L, -2407024595778887316L, -8661354791814611041L, -1768143703540734551L, -902487278068638836L, 6123047453036372124L, -8966773252386055419L, 6586777652962488092L}).toString();
                    C3113 c3113M9197 = AbstractC5501.m9197(AbstractC4225.f14009, C1298.f4443, c5362, 0);
                    new C4441(new long[]{5383931641174475647L, 6776736297401562344L, 5937549065051116360L, -2897554966840595779L, -465532115852453891L, -5305659481975664867L, 3480775176928591479L, -8781175417036944103L, 7294259916041942040L, -8774601461642371366L, 504340497831381754L, -2395823450697994212L}).toString();
                    int iHashCode = Long.hashCode(c5362.f17657);
                    C2103 c2103M8994 = c5362.m8994();
                    InterfaceC0705 interfaceC0705M2161 = AbstractC0993.m2161(c5362, interfaceC0705M7907);
                    InterfaceC4576.f15106.getClass();
                    C3709 c3709 = C0849.f3049;
                    new C4441(new long[]{4850625789548144501L, -4175974338878124241L, -1750825996862569296L, -4975204943939636116L, 1805268129430375282L, -8953933103899726584L, 8347110747653150864L, 1079720834724893547L, -3080110353179867566L, -9135534813712442460L, 7738623092149564031L, 5989215361796349931L}).toString();
                    c5362.m8983();
                    if (c5362.f17668) {
                        c5362.m9005(c3709);
                    } else {
                        c5362.m8972();
                    }
                    AbstractC0993.m2127(C0849.f3048, c5362, c3113M9197);
                    AbstractC0993.m2127(C0849.f3047, c5362, c2103M8994);
                    AbstractC0993.m2127(C0849.f3053, c5362, Integer.valueOf(iHashCode));
                    AbstractC0993.m2146(c5362, C0849.f3050);
                    AbstractC0993.m2127(C0849.f3052, c5362, interfaceC0705M2161);
                    int i2 = 5;
                    new C4441(new long[]{8933748532325595345L, -5439735758727316044L, -7157117536427891790L, -8757974450244827014L, 7038065409513011951L}).toString();
                    new C4441(new long[]{3015121035752888498L, 5994145588892043432L, 3813786928967379284L, -7799524457484589687L, -5603024237199155399L, 2774216115117916085L, 8786746081923423073L, 6450272217196026097L, 6921554545038044579L, -4340029550310311803L, -3848473059185621748L, 4779906612636737806L}).toString();
                    AbstractC0495.m1105(C3133.m5804(R.string.organization_dialog_title, c5362), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((C4413) c5362.m8997(AbstractC4957.f16399)).f14539, c5362, 0, 0, 131070);
                    AbstractC1434.m3048(c5362, AbstractC4410.m7703(C4217.f13994, 10.0f));
                    c5362.m8957(1722314602);
                    new C4441(new long[]{-6656676729219300203L, -7653974768857759070L, 8350601047365026687L}).toString();
                    Iterator it = this.f10849.iterator();
                    while (true) {
                        boolean zHasNext = it.hasNext();
                        C1347 c1347 = this.f10847;
                        if (!zHasNext) {
                            c5362.m9009(false);
                            C4182 c4182 = AbstractC4410.f14521;
                            C3033 c3033 = AbstractC4225.f14012;
                            new C4441(new long[]{8328728029834591784L, -3121548825004784467L, -6310694852450672731L, 1640710458348915475L, 6938483837652787201L, 6287844067347308611L, 2688276581865448047L, -5770982753470291236L, 7307465760140790861L, -8787538631773614020L, 6672595103510836456L, -9114504356568318522L, -33542677153217488L, 9111676154700261891L}).toString();
                            C3668 c3668M6047 = AbstractC3287.m6047(c3033, C1298.f4433, c5362, 6);
                            new C4441(new long[]{7738685837116010662L, -5487695985228057053L, 3692545786656967669L, -1544377684683355048L, -8587808801173237904L, -6123053496468533311L, -548869765834375034L, -4881126554963147988L, 3669436626412240282L, 70220542692814264L, 5807217025006903180L, 8159943908603578587L}).toString();
                            int iHashCode2 = Long.hashCode(c5362.f17657);
                            C2103 c2103M8995 = c5362.m8994();
                            InterfaceC0705 interfaceC0705M2162 = AbstractC0993.m2161(c5362, c4182);
                            InterfaceC4576.f15106.getClass();
                            C3709 c37010 = C0849.f3049;
                            new C4441(new long[]{5777555701576739984L, -8286369770511843614L, 737466804426361370L, -3954612476268318261L, 2898924960741632575L, 4822768827467744737L, -4364919496309259242L, -5513436411380638935L, -6403306042585396406L, 1142528618913640393L, 8362052996184881861L, 6952209033466894702L}).toString();
                            c5362.m8983();
                            if (c5362.f17668) {
                                c5362.m9005(c37010);
                            } else {
                                c5362.m8972();
                            }
                            AbstractC0993.m2127(C0849.f3048, c5362, c3668M6047);
                            AbstractC0993.m2127(C0849.f3047, c5362, c2103M8995);
                            AbstractC0993.m2127(C0849.f3053, c5362, Integer.valueOf(iHashCode2));
                            AbstractC0993.m2146(c5362, C0849.f3050);
                            AbstractC0993.m2127(C0849.f3052, c5362, interfaceC0705M2162);
                            new C4441(new long[]{-6906686414032893648L, 4629155080573819421L, -7406653075851819073L, -1265247989129854413L, -7377606006065636695L}).toString();
                            new C4441(new long[]{-7194679913096014041L, -3165023404502829004L, -2734320545693829075L, -526351162044635361L, 729670047678077450L, 1341995991557052235L, -5097200990173718816L, 6956745326549795562L, 6572532921126774240L, 5203577384199984026L, -716427743269644954L, -6952675020797864724L}).toString();
                            new C4441(new long[]{374110103752156794L, 8690202669283151458L, 853225673064238928L, -3975038043399157592L, -3817667905290932262L, -303417799888123532L, 7432463305786527158L}).toString();
                            Object objM8999 = c5362.m8999();
                            InterfaceC4367 interfaceC4367 = this.f10846;
                            C4036 c4036 = C2850.f9517;
                            if (objM8999 == c4036) {
                                objM8999 = new C0681(interfaceC4367, 5);
                                c5362.m8987(objM8999);
                            }
                            AbstractC3933.m7096((InterfaceC4448) objM8999, null, false, null, null, null, AbstractC2552.f8513, c5362, 805306374, 510);
                            AbstractC1434.m3048(c5362, AbstractC4410.m7709(10.0f));
                            new C4441(new long[]{-6515972973584954592L, -2213188182575533350L, 3053716261602974905L, 8416279218391681534L, -2507610705792338025L, 8279961011660279640L, 5961883055617669466L}).toString();
                            C1542 c1542 = this.f10848;
                            boolean zM8977 = c5362.m8977(c1542) | c5362.m8963(c1347);
                            Object objM89910 = c5362.m8999();
                            if (zM8977 || objM89910 == c4036) {
                                objM89910 = new C1597(interfaceC4367, c1542, c1347, i2);
                                c5362.m8987(objM89910);
                            }
                            AbstractC3933.m7096((InterfaceC4448) objM89910, null, false, null, null, null, AbstractC2552.f8519, c5362, 805306368, 510);
                            c5362.m9009(true);
                            c5362.m9009(true);
                        } else {
                            AbstractC2774.m5188((C0379) it.next(), c1347, null, c5362, 0, 4);
                        }
                    }
                }
                break;
            default:
                C5362 c5363 = (C5362) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                new C4441(new long[]{-7255160164716502292L, -5329041959411147030L, -7906788022216578181L, 2501842888301857886L, -6003196330208367450L, 3898210916310004711L, 5686148684043825039L, 1870924276137288945L}).toString();
                if (!c5363.m9011(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    c5363.m8982();
                } else {
                    AbstractC0701.m1560(AbstractC4410.m7709(300.0f), AbstractC0520.m1170(20.0f), 0L, 0L, 1.0f, 5.0f, AbstractC3925.m7034(7527669, new C3230(this.f10849, this.f10847, this.f10848, this.f10846, 0), c5363), c5363, 12804102, 76);
                }
                break;
        }
        return c2358;
    }
}
