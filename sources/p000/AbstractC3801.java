package p000;

import android.graphics.BlendMode;
import android.graphics.PorterDuff;
import android.os.Build;
import android.view.DragEvent;
import android.view.View;
import de.robv.android.xposed.XposedBridge;
import java.lang.reflect.Member;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import ru.bluecat.yandexmapspatcher.R;
import ru.bluecat.yandexmapspatcher.p003ui.App;
import ru.bluecat.yandexmapspatcher.p003ui.MainActivity;

/* JADX INFO: renamed from: ۦٍؖٝۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3801 {

    /* JADX INFO: renamed from: ۥۜ */
    public static String f12618 = "YukiHookAPI";

    /* JADX INFO: renamed from: ۥۣ */
    public static final C1206 f12619 = new C1206(8);

    /* JADX INFO: renamed from: ۥۗ */
    public static final int[] f12617 = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};

    /* JADX INFO: renamed from: ۥؗ */
    public static final int[] f12614 = {1, 2, 4, 5, 7, 8, 10, 11, 13, 14};

    /* JADX INFO: renamed from: ۦؑ */
    public static final int[] f12620 = {3, 6};

    /* JADX INFO: renamed from: ۥُ */
    public static final int[] f12615 = {1, 2, 4, 5, 7, 8};

    /* JADX INFO: renamed from: ۥّ */
    public static final StackTraceElement[] f12616 = new StackTraceElement[0];

    /* JADX INFO: renamed from: ۦۙ */
    public static final Object f12622 = new Object();

    /* JADX INFO: renamed from: ۦٛ */
    public static final Integer[] f12621 = {1000, 1001, 1002, 1003};

    /* JADX INFO: renamed from: ۥؓ */
    public static final InterfaceC4680 m6743(View view) {
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_view_model_store_owner);
            InterfaceC4680 interfaceC4680 = tag instanceof InterfaceC4680 ? (InterfaceC4680) tag : null;
            if (interfaceC4680 != null) {
                return interfaceC4680;
            }
            Object objM7476 = AbstractC4225.m7476(view);
            view = objM7476 instanceof View ? (View) objM7476 : null;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥؔ */
    public static final void m6744(AbstractC2797 abstractC2797, C2324 c2324, String str) {
        C2680.f8891.fine(c2324.f7688 + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + abstractC2797.f9352);
    }

    /* JADX INFO: renamed from: ۥؖ */
    public static InterfaceC4137 m6745(InterfaceC4137 interfaceC4137, InterfaceC2218 interfaceC2218) {
        if (AbstractC3831.m6874(interfaceC4137.getKey(), interfaceC2218)) {
            return interfaceC4137;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public static final void m6746(final C1542 c1542, final ArrayList arrayList, C5362 c5362, int i) {
        int i2;
        C5362 c5363 = c5362;
        c5363.m8979(-1372899577);
        new C4441(new long[]{1795174189208112659L, 6806783718178070682L, -4976433067561926530L, 7819616777134152730L, -1425186941577485088L, -5639104132726164455L, -7496765500659097643L, 3315027378413779852L, -3273565372978440404L, -5669565722360618031L, 5525218259268658892L, -1679184671433221442L, 2821472312337535392L, 539714385882767473L, -2909562159038185180L, -7703461785419560113L, -62121950187013062L}).toString();
        int i3 = i | (c5363.m8988(R.string.main_colored_tabs_title) ? 4 : 2) | (c5363.m8988(R.string.main_colored_tabs_summary) ? 32 : 16) | (c5363.m8988(R.string.main_tabs_title) ? 256 : 128) | (c5363.m8977(c1542) ? 2048 : 1024) | (c5363.m8963(arrayList) ? 16384 : 8192);
        int i4 = 1;
        if (c5363.m9011(i3 & 1, (i3 & 9363) != 9362)) {
            int i5 = 6;
            new C4441(new long[]{-6292018161499758544L, -6092147473527726295L, -9107544479704732172L, -6311104685620253100L, 2644333837674763283L, -6899880547626299654L}).toString();
            Object objM8999 = c5363.m8999();
            C4036 c4036 = C2850.f9517;
            if (objM8999 == c4036) {
                objM8999 = AbstractC2774.m5183(Boolean.FALSE);
                c5363.m8987(objM8999);
            }
            final InterfaceC4367 interfaceC4367 = (InterfaceC4367) objM8999;
            new C4441(new long[]{-8165646667913284625L, -2457894658195218938L, -7830246416874208043L, -6093087067163022914L, -5925015695539717077L, -492379854396540207L}).toString();
            Object objM89910 = c5363.m8999();
            if (objM89910 == c4036) {
                objM89910 = new C0681(interfaceC4367, 3);
                c5363.m8987(objM89910);
            }
            AbstractC1434.m3045(R.string.main_colored_tabs_title, R.string.main_colored_tabs_summary, null, (InterfaceC4448) objM89910, c5363, (i3 & 14) | 3072 | (i3 & 112), 4);
            if (((Boolean) interfaceC4367.getValue()).booleanValue()) {
                c5363.m8957(922669425);
                new C4441(new long[]{1394400441758705225L, 5013788131377115352L, -9212405347067913872L, -1856256879668455374L, -487871627228388763L, 9121234084811041157L, 43205433017868561L, -7398832104804932599L, 6736652154924663458L, -1048007543442250333L, 7021966092222285940L, -2008414900627979819L, -3212600829538362941L, -1321569169374070241L, -4625252512582205651L, 8016021087169391557L, 3348771783903529470L}).toString();
                final C1347 c1347 = new C1347();
                App app = App.f407;
                C1443 c1443 = AbstractC2776.m5217().f409;
                Object obj = c1542.f5218;
                String str = c1542.f5219;
                boolean z = C1443.f4940;
                c1347.addAll((Set) c1443.m3068(obj, str));
                new C4441(new long[]{8905209084946215048L, 8005216729597247327L, -3453768228457880157L, 2237584675298971822L, 4778618501900707946L, 7317513078850217314L, 7527336727979969160L, -3815731931255931050L, 1725638118804024955L, -266400866552476101L}).toString();
                new C4441(new long[]{8571309047328744424L, -8202885888543040382L, 4359323009562790271L, 7243983292147299631L, -7402038089876801580L}).toString();
                Object objM89911 = c5363.m8999();
                if (objM89911 == c4036) {
                    objM89911 = AbstractC3925.m7061(c5363);
                    c5363.m8987(objM89911);
                }
                final InterfaceC4643 interfaceC4643 = (InterfaceC4643) objM89911;
                final C1705 c1705M3016 = AbstractC1418.m3016(c5363, 6, 2);
                C4216 c4216 = AbstractC2853.f9544;
                new C4441(new long[]{2056759062551563390L, 5383792047497585686L, -2060759588383438312L, -6745909157349498438L, -6797129923984623071L, -1386503670941267493L, -253570388078802598L}).toString();
                InterfaceC2880 interfaceC2880 = (InterfaceC2880) c5363.m8997(c4216);
                WeakHashMap weakHashMap = C2816.f9398;
                int i6 = AbstractC1434.m3061(c5363).f9402.m1866().f17694;
                C4216 c4217 = AbstractC2853.f9551;
                new C4441(new long[]{-3313010607207398708L, 7501015941782413835L, -8284728271427861977L, 1049359795168627142L, -7456608776060504417L, -8303296969162517555L, 2927248130365471145L}).toString();
                final float fMo756 = interfaceC2880.mo756((((int) (((C3194) ((InterfaceC0930) c5363.m8997(c4217))).m5891() & 4294967295L)) - i6) - 287);
                C0879 c0879 = AbstractC1434.m3061(c5363).f9401;
                InterfaceC2880 interfaceC2881 = (InterfaceC2880) c5363.m8997(c4216);
                final float fMo757 = interfaceC2881.mo756(c0879.mo1869(interfaceC2881));
                new C4441(new long[]{-345111588204245321L, -8115735383068848773L, -5227595418626595550L, -8520491809443727319L, -2725753704901995965L, 8199459279413778678L}).toString();
                boolean zM8977 = c5363.m8977(interfaceC4643) | c5363.m8963(c1705M3016);
                Object objM89912 = c5363.m8999();
                if (zM8977 || objM89912 == c4036) {
                    objM89912 = new C5597(interfaceC4643, c1705M3016, interfaceC4367, i4);
                    c5363.m8987(objM89912);
                }
                AbstractC1418.m3018((InterfaceC4448) objM89912, null, c1705M3016, 0.0f, false, null, AbstractC2873.m5440((C2917) c5363.m8997(AbstractC0118.f470)), 0L, 0L, AbstractC0487.f1771, new C0064(i5), null, AbstractC3925.m7034(2046602688, new InterfaceC2609() { // from class: ۦٕؔۤ۟
                    @Override // p000.InterfaceC2609
                    /* JADX INFO: renamed from: ۦۙ */
                    public final Object mo1173(Object obj2, Object obj3, Object obj4) {
                        Object obj5;
                        final C1347 c1348;
                        C5362 c5364 = (C5362) obj3;
                        int iIntValue = ((Integer) obj4).intValue();
                        new C4441(new long[]{2498257452999866671L, -7381144151472176375L, 4983770425417437544L, 3738957153554407928L, -4958358804402807847L, 2537400050452622013L, 1881595801645905190L, 2062060174682992983L}).toString();
                        if (c5364.m9011(iIntValue & 1, (iIntValue & 17) != 16)) {
                            C1911 c1911 = C1298.f4426;
                            InterfaceC0705 interfaceC0705M7907 = AbstractC4554.m7907(AbstractC5568.m9381(AbstractC4410.m7700(AbstractC4410.m7707(AbstractC4410.f14521, 1), 0.0f, fMo756, 1), 20.0f, 0.0f, 20.0f, fMo757 + 10.0f, 2), AbstractC4554.m7939(c5364));
                            new C4441(new long[]{9024122346502542479L, 7810733263396373006L, -3922509809869818642L, -4931628551377993459L, 5829379939472794039L, -8239590172547887904L, 4481506778621032542L, 1405378803092006768L, 3531344640659820308L, -6742800820903582804L, -8127101877090978208L, 4509685293299371307L, 2881725971958180953L, 2361074823420627560L, -4129953666274082941L}).toString();
                            C3113 c3113M9197 = AbstractC5501.m9197(AbstractC4225.f14009, c1911, c5364, 48);
                            new C4441(new long[]{-5575338901314066113L, 756700017114550137L, -8873641345217517933L, 1407486483525370101L, -5625797840134589145L, -8218909877042151128L, 5300591588807927384L, -7788300936752788245L, 1821758198821221866L, 175891445608258703L, 6979072145014670926L, -5347288242996644898L}).toString();
                            int iHashCode = Long.hashCode(c5364.f17657);
                            C2103 c2103M8994 = c5364.m8994();
                            InterfaceC0705 interfaceC0705M2161 = AbstractC0993.m2161(c5364, interfaceC0705M7907);
                            InterfaceC4576.f15106.getClass();
                            C3709 c3709 = C0849.f3049;
                            new C4441(new long[]{48695531921695112L, 7879496601604481284L, 7886609501671102048L, -817712978136612431L, -5019527784524910737L, 7911000534278736582L, -2049138326909018838L, 5165808323186505346L, -4023117354894095291L, 8788009089279751786L, 8359909228388470851L, 2233104336386216297L}).toString();
                            c5364.m8983();
                            if (c5364.f17668) {
                                c5364.m9005(c3709);
                            } else {
                                c5364.m8972();
                            }
                            AbstractC0993.m2127(C0849.f3048, c5364, c3113M9197);
                            AbstractC0993.m2127(C0849.f3047, c5364, c2103M8994);
                            AbstractC0993.m2127(C0849.f3053, c5364, Integer.valueOf(iHashCode));
                            AbstractC0993.m2146(c5364, C0849.f3050);
                            AbstractC0993.m2127(C0849.f3052, c5364, interfaceC0705M2161);
                            new C4441(new long[]{-6458742989368016857L, -3363709148137619073L, 6998553351211424568L, 2332981173899131151L, -4908255254972990805L}).toString();
                            new C4441(new long[]{-4717442242471918829L, -2115909085048357029L, 1599426590350602458L, 571249531834296288L, -3175194881273258447L, 6646784507701663551L, 2629270524238019369L, -3096899801188455139L, -1545949020171806027L, -7527758719804333205L, 3632632438646949074L, 3140176820598701244L, -843106529733230168L, -7283526996429469367L}).toString();
                            AbstractC0495.m1105(C3133.m5804(R.string.main_tabs_title, c5364), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((C4413) c5364.m8997(AbstractC4957.f16399)).f14551, c5364, 0, 0, 131070);
                            new C4441(new long[]{203511153429002586L, 6903467782590689207L, 6353460292433164679L, 2914062131765680804L, -8308344594466138744L, 422205585196570809L, -7803239479895347979L, 1497689618831126057L, 3522594019826772179L}).toString();
                            MainActivity mainActivity = MainActivity.f411;
                            MainActivity mainActivityM9214 = AbstractC5537.m9214();
                            c5364.m8997(AbstractC4354.f14356);
                            InterfaceC2880 interfaceC2882 = (InterfaceC2880) c5364.m8997(AbstractC2853.f9544);
                            InterfaceC4840.f15945.getClass();
                            C2604 c2604 = C0218.f820;
                            int i7 = Build.VERSION.SDK_INT;
                            long jMo752 = interfaceC2882.mo752(AbstractC4225.m7460((i7 >= 34 ? C1678.f5591 : i7 >= 30 ? C2402.f8006 : C1397.f4801).mo2964(mainActivityM9214, c2604.f8696).m4790()).m5316());
                            Set set = C1606.f5402;
                            Set set2 = C3332.f11151;
                            float fM3175 = C1495.m3175(jMo752);
                            if (C4497.m7827(fM3175, 0.0f) < 0) {
                                C1078.m2272("Width must not be negative");
                                return null;
                            }
                            if (set.isEmpty()) {
                                C1078.m2272("Must support at least one size class");
                                return null;
                            }
                            List list = C1606.f5401;
                            int size = list.size();
                            int i8 = 0;
                            int i9 = 0;
                            while (true) {
                                if (i8 >= size) {
                                    obj5 = null;
                                    break;
                                }
                                C1606 c1606 = (C1606) list.get(i8);
                                obj5 = null;
                                int i10 = c1606.f5403;
                                if (set.contains(c1606)) {
                                    Set set3 = C1606.f5402;
                                    if (C4497.m7827(fM3175, AbstractC1631.m3432(i10)) >= 0) {
                                        i9 = i10;
                                        break;
                                    }
                                    i9 = i10;
                                }
                                i8++;
                            }
                            Set set4 = C3332.f11151;
                            float fM3176 = C1495.m3176(jMo752);
                            if (C4497.m7827(fM3176, 0.0f) < 0) {
                                C1078.m2272("Width must not be negative");
                                return obj5;
                            }
                            if (set2.isEmpty()) {
                                C1078.m2272("Must support at least one size class");
                                return obj5;
                            }
                            List list2 = C3332.f11150;
                            int size2 = list2.size();
                            for (int i11 = 0; i11 < size2; i11++) {
                                C3332 c3332 = (C3332) list2.get(i11);
                                int i12 = c3332.f11152;
                                if (set2.contains(c3332)) {
                                    Set set5 = C3332.f11151;
                                    if (C4497.m7827(fM3176, AbstractC1605.m3353(i12)) >= 0) {
                                        break;
                                    }
                                }
                            }
                            Set set6 = C1606.f5402;
                            int i13 = i9 == 0 ? 2 : 3;
                            c5364.m8957(1314362);
                            new C4441(new long[]{-9054350526315013416L, 1586904708159358799L, 8046448396723793455L}).toString();
                            ArrayList arrayList2 = arrayList;
                            int size3 = arrayList2.size();
                            ArrayList arrayList3 = new ArrayList((size3 / i13) + (size3 % i13 == 0 ? 0 : 1));
                            for (int i14 = 0; i14 >= 0 && i14 < size3; i14 += i13) {
                                int i15 = size3 - i14;
                                if (i13 <= i15) {
                                    i15 = i13;
                                }
                                ArrayList arrayList4 = new ArrayList(i15);
                                for (int i16 = 0; i16 < i15; i16++) {
                                    arrayList4.add(arrayList2.get(i16 + i14));
                                }
                                arrayList3.add(arrayList4);
                            }
                            Iterator it = arrayList3.iterator();
                            while (true) {
                                boolean zHasNext = it.hasNext();
                                c1348 = c1347;
                                if (!zHasNext) {
                                    break;
                                }
                                AbstractC3801.m6770((List) it.next(), c1348, c5364, 0);
                            }
                            c5364.m9009(false);
                            AbstractC4009.m7154(AbstractC5568.m9381(C4217.f13994, 0.0f, 0.0f, 0.0f, 12.0f, 7), 0.0f, 0L, c5364, 6, 6);
                            InterfaceC0705 interfaceC0705M9381 = AbstractC5568.m9381(AbstractC4410.f14521, 12.0f, 0.0f, 12.0f, 0.0f, 10);
                            new C4441(new long[]{5974850912239428888L, -5330510908743104780L, 3545155976230388909L, 184807910967903065L, -5238256504875828881L, -7816435427246373626L, 427289644762030632L, 8445302072441717588L, -380353486764284440L, 2273546993166953121L, -5108796846448474503L, 6908322148988153848L, 2379563497945723695L, 3018899704957176535L}).toString();
                            C3668 c3668M6047 = AbstractC3287.m6047(AbstractC4225.f14014, C1298.f4433, c5364, 0);
                            new C4441(new long[]{-359360904363519852L, 6897718847652994070L, -176610055231019383L, -1064100726740809517L, 4072254287783230352L, -3325052457614769301L, -1813595358995869423L, -2199907931996028737L, 8953023750737752740L, -352719370174194174L, -952045321973076448L, 8364065373620882297L}).toString();
                            int iHashCode2 = Long.hashCode(c5364.f17657);
                            C2103 c2103M8995 = c5364.m8994();
                            InterfaceC0705 interfaceC0705M2162 = AbstractC0993.m2161(c5364, interfaceC0705M9381);
                            InterfaceC4576.f15106.getClass();
                            C3709 c37010 = C0849.f3049;
                            new C4441(new long[]{1548273726627992607L, -8829415209833209699L, -3831797965044607483L, 2213228040675454444L, 2964263116093524511L, -8134707464725611276L, -1302019261623382021L, -8693789060116616508L, 2810009983493174117L, 462511771627695526L, 4990872890098302508L, -5137903312350319107L}).toString();
                            c5364.m8983();
                            if (c5364.f17668) {
                                c5364.m9005(c37010);
                            } else {
                                c5364.m8972();
                            }
                            AbstractC0993.m2127(C0849.f3048, c5364, c3668M6047);
                            AbstractC0993.m2127(C0849.f3047, c5364, c2103M8995);
                            AbstractC0993.m2127(C0849.f3053, c5364, Integer.valueOf(iHashCode2));
                            AbstractC0993.m2146(c5364, C0849.f3050);
                            AbstractC0993.m2127(C0849.f3052, c5364, interfaceC0705M2162);
                            new C4441(new long[]{842281948888096116L, 627248857821088832L, -1442141489590943758L, 1895846345894725974L, 1741960713057684477L}).toString();
                            new C4441(new long[]{-8783184783658493752L, -1216436511589513362L, 4661235092300720849L, -2112739847445504533L, 3736809776783786859L, -1577981791519575189L, 64456922313055981L, 1512985305049252569L, -6902296342830823731L, 197242085376420868L, -5093674968378458826L}).toString();
                            InterfaceC0705 interfaceC0705M9382 = AbstractC5568.m9381(C0196.m457(), 0.0f, 0.0f, 8.0f, 0.0f, 11);
                            new C4441(new long[]{-2115991013030059981L, -959008228531691639L, -7971887329166130196L, -2047158595906618475L, 2854987807956114744L, 4879494458437511681L}).toString();
                            final InterfaceC4643 interfaceC4644 = interfaceC4643;
                            boolean zM8978 = c5364.m8977(interfaceC4644);
                            final C1705 c1705 = c1705M3016;
                            boolean zM8963 = zM8978 | c5364.m8963(c1705);
                            Object objM89913 = c5364.m8999();
                            final InterfaceC4367 interfaceC4368 = interfaceC4367;
                            C4036 c4037 = C2850.f9517;
                            if (zM8963 || objM89913 == c4037) {
                                objM89913 = new C5597(interfaceC4644, c1705, interfaceC4368, 0);
                                c5364.m8987(objM89913);
                            }
                            AbstractC3933.m7084((InterfaceC4448) objM89913, interfaceC0705M9382, false, null, null, null, null, AbstractC0487.f1768, c5364, 805306368, 508);
                            InterfaceC0705 interfaceC0705M9383 = AbstractC5568.m9381(C0196.m457(), 8.0f, 0.0f, 0.0f, 0.0f, 14);
                            new C4441(new long[]{-4219180074140702502L, 3086361970862116705L, -1680142437184141568L, 5777232695338138333L, -6496169178988934848L, -3923683913199053651L}).toString();
                            boolean zM8979 = c5364.m8977(interfaceC4644);
                            final C1542 c1543 = c1542;
                            boolean zM89710 = c5364.m8977(c1543) | zM8979 | c5364.m8963(c1348) | c5364.m8963(c1705);
                            Object objM89914 = c5364.m8999();
                            if (zM89710 || objM89914 == c4037) {
                                InterfaceC4448 interfaceC4448 = new InterfaceC4448() { // from class: ۦؑٓۜ
                                    @Override // p000.InterfaceC4448
                                    /* JADX INFO: renamed from: ۥۣ */
                                    public final Object mo449() {
                                        C1705 c1706 = c1705;
                                        AbstractC2765.m5135(interfaceC4644, null, 0, new C0061(c1706, c1543, c1348, null, 7), 3).mo859(new C1859(c1706, interfaceC4368, 0));
                                        return C2358.f7817;
                                    }
                                };
                                c5364.m8987(interfaceC4448);
                                objM89914 = interfaceC4448;
                            }
                            AbstractC3933.m7084((InterfaceC4448) objM89914, interfaceC0705M9383, false, null, null, null, null, AbstractC0487.f1773, c5364, 805306368, 508);
                            c5364.m9009(true);
                            c5364.m9009(true);
                        } else {
                            c5364.m8982();
                        }
                        return C2358.f7817;
                    }
                }, c5363), c5362, 0);
                c5363 = c5362;
                i2 = 0;
                c5363.m9009(false);
            } else {
                i2 = 0;
                c5363.m8957(925815739);
                c5363.m9009(false);
            }
        } else {
            i2 = 0;
            c5363.m8982();
        }
        C5863 c5863M8965 = c5363.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new C1661(c1542, arrayList, i, i2);
        }
    }

    /* JADX INFO: renamed from: ۥؙ */
    public static final long m6747(C3536 c3536, boolean z) {
        long jM3308 = C1553.m3308(c3536.f11726, c3536.f11739);
        if (z || !c3536.m6326()) {
            return jM3308;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۥؚ */
    public static final int m6748(int i, String str) {
        return (str.charAt(i + 1) - '0') + ((str.charAt(i) - '0') * 10);
    }

    /* JADX INFO: renamed from: ۥً */
    public static final long m6749(C5086 c5086) {
        DragEvent dragEvent = (DragEvent) c5086.f16877;
        float x = dragEvent.getX();
        float y = dragEvent.getY();
        return (((long) Float.floatToRawIntBits(x)) << 32) | (((long) Float.floatToRawIntBits(y)) & 4294967295L);
    }

    /* JADX INFO: renamed from: ۥَ */
    public static final InterfaceC4367 m6750(InterfaceC4311 interfaceC4311, C5362 c5362) {
        Object value = interfaceC4311.getValue();
        Object obj = C4794.f15814;
        boolean zM8977 = c5362.m8977(obj) | c5362.m8977(interfaceC4311);
        Object objM8999 = c5362.m8999();
        InterfaceC0443 interfaceC0443 = null;
        Object obj2 = C2850.f9517;
        if (zM8977 || objM8999 == obj2) {
            objM8999 = new C5416(obj, interfaceC4311, interfaceC0443, 0);
            c5362.m8987(objM8999);
        }
        InterfaceC5731 interfaceC5731 = (InterfaceC5731) objM8999;
        Object objM89910 = c5362.m8999();
        if (objM89910 == obj2) {
            objM89910 = AbstractC2774.m5183(value);
            c5362.m8987(objM89910);
        }
        InterfaceC4367 interfaceC4367 = (InterfaceC4367) objM89910;
        boolean zM8978 = c5362.m8977(interfaceC5731);
        Object objM89911 = c5362.m8999();
        if (zM8978 || objM89911 == obj2) {
            objM89911 = new C3180(interfaceC5731, interfaceC4367, interfaceC0443, 1);
            c5362.m8987(objM89911);
        }
        AbstractC3925.m7031(interfaceC4311, obj, (InterfaceC5731) objM89911, c5362);
        return interfaceC4367;
    }

    /* JADX INFO: renamed from: ۥُ */
    public static final void m6751(Object obj, int i, C3833 c3833, C0857 c0857, C5362 c5362, int i2) {
        int i3;
        c5362.m8979(872548579);
        if ((i2 & 6) == 0) {
            i3 = (c5362.m8977(obj) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= c5362.m8988(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= c5362.m8977(c3833) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= c5362.m8977(c0857) ? 2048 : 1024;
        }
        if (c5362.m9011(i3 & 1, (i3 & 1171) != 1170)) {
            boolean zM8963 = c5362.m8963(obj) | c5362.m8963(c3833);
            Object objM8999 = c5362.m8999();
            Object obj2 = C2850.f9517;
            if (zM8963 || objM8999 == obj2) {
                objM8999 = new C1506(obj, c3833);
                c5362.m8987(objM8999);
            }
            C1506 c1506 = (C1506) objM8999;
            c1506.f5113 = i;
            C4852 c4852 = c1506.f5119;
            AbstractC2266 abstractC2266 = AbstractC3186.f10707;
            C1506 c1507 = (C1506) c5362.m8997(abstractC2266);
            AbstractC3191 abstractC3191M7473 = AbstractC4225.m7473();
            InterfaceC4745 interfaceC4745Mo4945 = abstractC3191M7473 != null ? abstractC3191M7473.mo4945() : null;
            AbstractC3191 abstractC3191M7452 = AbstractC4225.m7452(abstractC3191M7473);
            try {
                if (c1507 != ((C1506) c4852.getValue())) {
                    c4852.setValue(c1507);
                    if (c1506.f5118 > 0) {
                        C1506 c1508 = c1506.f5114;
                        if (c1508 != null) {
                            c1508.m3182();
                        }
                        if (c1507 != null) {
                            c1507.m3183();
                        } else {
                            c1507 = null;
                        }
                        c1506.f5114 = c1507;
                    }
                }
                AbstractC4225.m7466(abstractC3191M7473, abstractC3191M7452, interfaceC4745Mo4945);
                boolean zM8964 = c5362.m8963(c1506);
                Object objM89910 = c5362.m8999();
                if (zM8964 || objM89910 == obj2) {
                    objM89910 = new C0091(14, c1506);
                    c5362.m8987(objM89910);
                }
                AbstractC3925.m7028(c1506, (InterfaceC4745) objM89910, c5362);
                C4773.m8137(abstractC2266.mo4313(c1506), c0857, c5362, ((i3 >> 6) & 112) | 8);
            } catch (Throwable th) {
                AbstractC4225.m7466(abstractC3191M7473, abstractC3191M7452, interfaceC4745Mo4945);
                throw th;
            }
        } else {
            c5362.m8982();
        }
        C5863 c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new C2070(obj, i, c3833, c0857, i2);
        }
    }

    /* JADX INFO: renamed from: ۥِ */
    public static final String m6752(int i, String str) {
        if (str.length() <= i) {
            return str.toString();
        }
        return str.subSequence(0, i).toString() + "...";
    }

    /* JADX INFO: renamed from: ۥّ */
    public static final long m6753(float f, float f2) {
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
        int i = AbstractC5477.f18070;
        return jFloatToRawIntBits;
    }

    /* JADX INFO: renamed from: ۥْ */
    public static final boolean m6754(C3536 c3536) {
        return c3536.f11731 && !c3536.f11733;
    }

    /* JADX INFO: renamed from: ۥٓ */
    public static final float[] m6755(float[] fArr, float[] fArr2, float[] fArr3) {
        m6760(fArr, fArr2);
        m6760(fArr, fArr3);
        float[] fArr4 = {fArr3[0] / fArr2[0], fArr3[1] / fArr2[1], fArr3[2] / fArr2[2]};
        float[] fArrM6781 = m6781(fArr);
        float f = fArr4[0];
        float f2 = fArr[0] * f;
        float f3 = fArr4[1];
        float f4 = fArr[1] * f3;
        float f5 = fArr4[2];
        return m6758(fArrM6781, new float[]{f2, f4, fArr[2] * f5, fArr[3] * f, fArr[4] * f3, fArr[5] * f5, f * fArr[6], f3 * fArr[7], f5 * fArr[8]});
    }

    /* JADX INFO: renamed from: ۥٕ */
    public static final void m6756(C3915 c3915, String str) {
        c3915.m7012(c3915.f13054 - 1, "Trailing comma before the end of JSON ".concat(str), "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingComma = true' in 'Json {}' builder to support them.");
        throw null;
    }

    /* JADX INFO: renamed from: ۥٖ */
    public static final boolean m6757(C5780 c5780, C5780 c5781) {
        if (c5780 == c5781) {
            return true;
        }
        return Math.abs(c5780.f19046 - c5781.f19046) < 0.001f && Math.abs(c5780.f19045 - c5781.f19045) < 0.001f;
    }

    /* JADX INFO: renamed from: ۥ٘ */
    public static final float[] m6758(float[] fArr, float[] fArr2) {
        float[] fArr3 = new float[9];
        if (fArr.length < 9 || fArr2.length < 9) {
            return fArr3;
        }
        float f = fArr[0] * fArr2[0];
        float f2 = fArr[3];
        float f3 = fArr2[1];
        float f4 = fArr[6];
        float f5 = fArr2[2];
        fArr3[0] = (f4 * f5) + (f2 * f3) + f;
        float f6 = fArr[1];
        float f7 = fArr2[0];
        float f8 = fArr[4];
        float f9 = fArr[7];
        float f10 = f9 * f5;
        fArr3[1] = f10 + (f3 * f8) + (f6 * f7);
        float f11 = fArr[2] * f7;
        float f12 = fArr[5];
        float f13 = (fArr2[1] * f12) + f11;
        float f14 = fArr[8];
        fArr3[2] = (f5 * f14) + f13;
        float f15 = fArr[0];
        float f16 = fArr2[3] * f15;
        float f17 = fArr2[4];
        float f18 = (f2 * f17) + f16;
        float f19 = fArr2[5];
        fArr3[3] = (f4 * f19) + f18;
        float f20 = fArr[1];
        float f21 = fArr2[3];
        float f22 = f8 * f17;
        fArr3[4] = (f9 * f19) + f22 + (f20 * f21);
        float f23 = fArr[2];
        float f24 = f19 * f14;
        fArr3[5] = f24 + (f12 * fArr2[4]) + (f21 * f23);
        float f25 = f15 * fArr2[6];
        float f26 = fArr[3];
        float f27 = fArr2[7];
        float f28 = (f26 * f27) + f25;
        float f29 = fArr2[8];
        fArr3[6] = (f4 * f29) + f28;
        float f30 = fArr2[6];
        float f31 = f9 * f29;
        fArr3[7] = f31 + (fArr[4] * f27) + (f20 * f30);
        float f32 = f14 * f29;
        fArr3[8] = f32 + (fArr[5] * fArr2[7]) + (f23 * f30);
        return fArr3;
    }

    /* JADX INFO: renamed from: ۥٙ */
    public static final void m6759(StringBuilder sb, StringBuilder sb2, int i) {
        if (i < 10) {
            sb.append('0');
        }
        sb2.append(i);
    }

    /* JADX INFO: renamed from: ۥٛ */
    public static final float[] m6760(float[] fArr, float[] fArr2) {
        if (fArr.length < 9 || fArr2.length < 3) {
            return fArr2;
        }
        float f = fArr2[0];
        float f2 = fArr2[1];
        float f3 = fArr2[2];
        fArr2[0] = (fArr[6] * f3) + (fArr[3] * f2) + (fArr[0] * f);
        fArr2[1] = (fArr[7] * f3) + (fArr[4] * f2) + (fArr[1] * f);
        fArr2[2] = (fArr[8] * f3) + (fArr[5] * f2) + (fArr[2] * f);
        return fArr2;
    }

    /* JADX INFO: renamed from: ۥٝ */
    public static final C2936 m6761(String str, String str2, int i, InterfaceC4745 interfaceC4745) {
        char cCharAt = str.charAt(i);
        if (((Boolean) interfaceC4745.mo211(Character.valueOf(cCharAt))).booleanValue()) {
            return null;
        }
        return m6767(str, "Expected " + str2 + ", but got '" + cCharAt + "' at position " + i);
    }

    /* JADX INFO: renamed from: ۥۖ */
    public static final String m6762(int i, String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder();
        if (i >= 0) {
            sb.append("Unexpected JSON token at offset " + i + ": ");
        }
        sb.append(str);
        if (str2 != null && !AbstractC0684.m1534(str2)) {
            sb.append(" at path: ");
            sb.append(str2);
        }
        if (str3 != null && !AbstractC0684.m1534(str3)) {
            sb.append("\n" + str3);
        }
        if (str4 != null) {
            sb.append("\nJSON input: ");
            sb.append(str4);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static final void m6763(InterfaceC4745 interfaceC4745, final C0857 c0857, C5362 c5362, int i) {
        c5362.m8979(-1189157796);
        new C4441(new long[]{7650713914362856584L, 6711987812926507936L, 7960405605449888121L, -4923251359738200293L, 7917454209155582995L, -5868174751971915680L, 3005137377854040448L, 8523268268743516609L, -2497684951185914175L, -6807491564700782331L, -1161191296904619911L, -3436055736655660682L, -7690625787998919318L, 1539721741514925020L, -2104423074264799209L, -8104010728512549378L, 7725887906183413037L, 4196353052663489190L, -8194854919129206926L, 213415901301551698L, 6812205159550188355L, 1952619137967234820L, -1298891478832972670L, -7391604827025810571L, 5021673801489770926L}).toString();
        int i2 = i | (c5362.m8977(interfaceC4745) ? 4 : 2);
        if (c5362.m9011(i2 & 1, (i2 & 19) != 18)) {
            new C4441(new long[]{-1987907318265894581L, -6503551552788733802L, -1792314574002505213L, 7979975368439550760L, -8789624545561289314L, 4868959699454370779L, -4976072714888590223L, -1121355883077756498L, -5481308644301881608L, 560491854030497833L}).toString();
            new C4441(new long[]{1251674300341946182L, 7717179093058118964L, 4663676304246363386L, -787927826159762962L, 7202379908515740803L}).toString();
            Object objM8999 = c5362.m8999();
            Object obj = C2850.f9517;
            if (objM8999 == obj) {
                objM8999 = AbstractC3925.m7061(c5362);
                c5362.m8987(objM8999);
            }
            final InterfaceC4643 interfaceC4643 = (InterfaceC4643) objM8999;
            final C1705 c1705M3016 = AbstractC1418.m3016(c5362, 6, 2);
            AbstractC2266 abstractC2266 = AbstractC2853.f9544;
            new C4441(new long[]{6099673974441801244L, 928853307897028430L, -6902098796428552937L, -4443617693263839442L, 1314143850504962097L, -6906456874174552937L, 1660416700130347733L}).toString();
            InterfaceC2880 interfaceC2880 = (InterfaceC2880) c5362.m8997(abstractC2266);
            WeakHashMap weakHashMap = C2816.f9398;
            int i3 = AbstractC1434.m3061(c5362).f9402.m1866().f17694;
            AbstractC2266 abstractC2267 = AbstractC2853.f9551;
            new C4441(new long[]{5372550692813456578L, 4069213285395652725L, 3188146866923158233L, 1190600127502171960L, 810123953237490204L, 6871441015308705038L, -2271918020388393416L}).toString();
            final float fMo756 = interfaceC2880.mo756((((int) (((C3194) ((InterfaceC0930) c5362.m8997(abstractC2267))).m5891() & 4294967295L)) - i3) - 287);
            C0879 c0879 = AbstractC1434.m3061(c5362).f9401;
            InterfaceC2880 interfaceC2881 = (InterfaceC2880) c5362.m8997(abstractC2266);
            final float fMo757 = interfaceC2881.mo756(c0879.mo1869(interfaceC2881));
            new C4441(new long[]{44438717051862144L, -4598335107297147017L, -2739802282494212335L, -3022895282541002902L, -447181774664877211L, -1991584471940279157L}).toString();
            boolean zM8977 = c5362.m8977(interfaceC4643) | c5362.m8963(c1705M3016) | ((i2 & 14) == 4);
            Object objM89910 = c5362.m8999();
            if (zM8977 || objM89910 == obj) {
                objM89910 = new C1597(interfaceC4643, c1705M3016, interfaceC4745, 2);
                c5362.m8987(objM89910);
            }
            AbstractC1418.m3018((InterfaceC4448) objM89910, null, c1705M3016, 0.0f, false, null, AbstractC2873.m5440((C2917) c5362.m8997(AbstractC0118.f470)), 0L, 0L, AbstractC0487.f1769, new C0064(8), null, AbstractC3925.m7034(1490566462, new InterfaceC2609() { // from class: ۥَٖؑۗ
                @Override // p000.InterfaceC2609
                /* JADX INFO: renamed from: ۦۙ */
                public final Object mo1173(Object obj2, Object obj3, Object obj4) {
                    C5362 c5363 = (C5362) obj3;
                    int iIntValue = ((Integer) obj4).intValue();
                    new C4441(new long[]{-1355503798139550127L, -1276528223220146944L, -1028904670676008175L, 4904694759571958520L, 5341571492435733822L, -6531483608810229216L}).toString();
                    if (c5363.m9011(iIntValue & 1, (iIntValue & 17) != 16)) {
                        c0857.mo1173(new C4417(interfaceC4643, c1705M3016, fMo757, fMo756), c5363, 0);
                    } else {
                        c5363.m8982();
                    }
                    return C2358.f7817;
                }
            }, c5362), c5362, 0);
        } else {
            c5362.m8982();
        }
        C5863 c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new C4762(i, 1, interfaceC4745, c0857);
        }
    }

    /* JADX INFO: renamed from: ۥۘ */
    public static final C3177 m6764(final C5470 c5470, final C4902 c4902, C3177 c3177) {
        int i = c4902.f16166;
        int i2 = c4902.f16168;
        boolean z = c5470.f18035;
        final int i3 = z ? i2 : i;
        C3828 c3828 = (C3828) c4902.f16167;
        int i4 = c4902.f16170;
        final InterfaceC5130 interfaceC5130M7095 = AbstractC3933.m7095(3, new InterfaceC4448() { // from class: ۦٖۙؒۚ
            @Override // p000.InterfaceC4448
            /* JADX INFO: renamed from: ۥۣ */
            public final Object mo449() {
                return Integer.valueOf(((C3828) c4902.f16167).f12696.m4335(i3));
            }
        });
        final int i5 = z ? i : i2;
        InterfaceC5130 interfaceC5130M7096 = AbstractC3933.m7095(3, new InterfaceC4448() { // from class: ۦَؘۙؖ
            @Override // p000.InterfaceC4448
            /* JADX INFO: renamed from: ۥۣ */
            public final Object mo449() {
                C4902 c4903 = c4902;
                C3828 c3829 = (C3828) c4903.f16167;
                int iIntValue = ((Number) interfaceC5130M7095.getValue()).intValue();
                C5470 c5471 = c5470;
                boolean z2 = c5471.f18035;
                boolean z3 = c5471.m9161() == 1;
                int i6 = i3;
                long jM6832 = c3829.m6832(i6);
                C2276 c2276 = c3829.f12696;
                int i7 = C3346.f11195;
                int iM6827 = (int) (jM6832 >> 32);
                int i8 = c2276.f7560;
                if (c2276.m4335(iM6827) != iIntValue) {
                    iM6827 = iIntValue >= i8 ? c3829.m6827(i8 - 1) : c3829.m6827(iIntValue);
                }
                int iM4329 = (int) (jM6832 & 4294967295L);
                if (c2276.m4335(iM4329) != iIntValue) {
                    iM4329 = iIntValue >= i8 ? c2276.m4329(i8 - 1, false) : c2276.m4329(iIntValue, false);
                }
                int i9 = i5;
                if (iM6827 == i9) {
                    return c4903.m8262(iM4329);
                }
                if (iM4329 == i9) {
                    return c4903.m8262(iM6827);
                }
                if (!(z2 ^ z3) ? i6 >= iM6827 : i6 > iM4329) {
                    iM6827 = iM4329;
                }
                return c4903.m8262(iM6827);
            }
        });
        if (1 != c3177.f10675) {
            return (C3177) interfaceC5130M7096.getValue();
        }
        if (i3 == i4) {
            return c3177;
        }
        if (((Number) interfaceC5130M7095.getValue()).intValue() != c3828.f12696.m4335(i4)) {
            return (C3177) interfaceC5130M7096.getValue();
        }
        int i6 = c3177.f10676;
        long jM6832 = c3828.m6832(i6);
        if (i4 != -1) {
            if (i3 != i4) {
                if (!((i2 >= i && i2 > i) ^ z)) {
                }
            }
            return c4902.m8262(i3);
        }
        int i7 = C3346.f11195;
        return (i6 == ((int) (jM6832 >> 32)) || i6 == ((int) (4294967295L & jM6832))) ? (C3177) interfaceC5130M7096.getValue() : c4902.m8262(i3);
    }

    /* JADX INFO: renamed from: ۥۙ */
    public static /* synthetic */ void m6765(C3915 c3915) {
        m6756(c3915, "object");
        throw null;
    }

    /* JADX INFO: renamed from: ۥۜ */
    public static final C2032 m6766(C5470 c5470, InterfaceC1655 interfaceC1655) {
        int iM9161 = c5470.m9161();
        C4902 c4902 = (C4902) c5470.f18037;
        boolean z = iM9161 == 1;
        return new C2032(m6790(c4902, z, true, interfaceC1655), m6790(c4902, z, false, interfaceC1655), z);
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static final C2936 m6767(String str, String str2) {
        return new C2936(str2 + " when parsing an Instant from \"" + m6752(64, str) + '\"', str);
    }

    /* JADX INFO: renamed from: ۥۡ */
    public static void m6768(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException(AbstractC3761.m6629(obj == null ? "null" : obj.getClass().getName(), " cannot be cast to ", str));
        AbstractC3831.m6853(classCastException, AbstractC3801.class.getName());
        throw classCastException;
    }

    /* JADX INFO: renamed from: ۥۢ */
    public static int m6769(int i) {
        int[] iArr = {1, 2, 3};
        for (int i2 = 0; i2 < 3; i2++) {
            int i3 = iArr[i2];
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            if (i4 == i) {
                return i3;
            }
        }
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [int] */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r6v1, types: [ۦ۟ؗٙ۟] */
    /* JADX WARN: Type inference failed for: r6v2, types: [ۦ۟ؗٙ۟] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX INFO: renamed from: ۥۣ */
    public static final void m6770(List list, C1347 c1347, C5362 c5362, int i) {
        ?? r2;
        ?? r6;
        Object obj;
        C5362 c5363 = c5362;
        C3033 c3033 = AbstractC4225.f14014;
        c5363.m8979(490568114);
        int i2 = 12;
        new C4441(new long[]{93794726036012258L, 4018977712101503211L, -2447995872933581356L, -6273028956414902775L, -7696886905277547917L, 2715798192178775810L, 440365212165401997L, 4877500918974139839L, -1441305534575358679L, -266913723428404228L, -7208660985124128733L, -5233812092472065615L}).toString();
        int i3 = 32;
        int i4 = i | (c5363.m8963(list) ? 4 : 2) | (c5363.m8963(c1347) ? 32 : 16);
        boolean z = false;
        int i5 = 1;
        if (c5363.m9011(i4 & 1, (i4 & 19) != 18)) {
            C4182 c4182 = AbstractC4410.f14521;
            int i6 = 14;
            new C4441(new long[]{-8376718691982725051L, 4531095635276609363L, -6075781805508999427L, -540651981816833880L, 7148796839759277100L, 6145611891897796985L, 8816283370573081427L, -917794309399192716L, 2988495361838926593L, 8705076383179847219L, -1047756529239342100L, -6513485078567932822L, -7831700720351658660L, 5591873108532180938L}).toString();
            C3668 c3668M6047 = AbstractC3287.m6047(c3033, C1298.f4433, c5363, 0);
            new C4441(new long[]{4209267918105478074L, -1118115844058129007L, -6185921782441093910L, 2081192521699682452L, 1610585271326382782L, -8677384109345136257L, -7705013046689832318L, 6826436803573636227L, -8869754155730688641L, 3466756040369762821L, -720452320845340629L, 3247387869918939547L}).toString();
            int iHashCode = Long.hashCode(c5363.f17657);
            C2103 c2103M8994 = c5363.m8994();
            InterfaceC0705 interfaceC0705M2161 = AbstractC0993.m2161(c5363, c4182);
            InterfaceC4576.f15106.getClass();
            C3709 c3709 = C0849.f3049;
            new C4441(new long[]{7810666271815833517L, -3006655122250115136L, 6778620106245683990L, -1789525202613194709L, -7884216357327181775L, 7959833543654214044L, -6349552454331978011L, -8173588350087986000L, -5399557213520585844L, -4194573528695918942L, 2279370715294628842L, -4523968550408777642L}).toString();
            c5363.m8983();
            if (c5363.f17668) {
                c5363.m9005(c3709);
            } else {
                c5363.m8972();
            }
            AbstractC0993.m2127(C0849.f3048, c5363, c3668M6047);
            AbstractC0993.m2127(C0849.f3047, c5363, c2103M8994);
            AbstractC0993.m2127(C0849.f3053, c5363, Integer.valueOf(iHashCode));
            AbstractC0993.m2146(c5363, C0849.f3050);
            AbstractC0993.m2127(C0849.f3052, c5363, interfaceC0705M2161);
            int i7 = 5;
            new C4441(new long[]{2651970578959698442L, 4891557457878978367L, 7455029642535635863L, -1636248751575023491L, 7510597741778233501L}).toString();
            new C4441(new long[]{4992049819729608159L, 4145296428233022858L, 7771937035521140852L, -3413737881084610182L, 2759813447904036871L}).toString();
            c5363.m8957(-555904052);
            new C4441(new long[]{-4541336576671127003L, 6839737426178327151L, -3530706399781724959L, 5164975926057912248L, -3679455668460418128L}).toString();
            Iterator it = list.iterator();
            ?? r7 = c5363;
            while (it.hasNext()) {
                C3973 c3973 = (C3973) it.next();
                boolean zContains = c1347.contains(c3973.f13283);
                C4274 c4274 = C1298.f4423;
                InterfaceC0705 interfaceC0705M7709 = AbstractC4410.m7709(174.0f);
                C2155 c2155 = new C2155(i5);
                new C4441(new long[]{-6432763943938848602L, -92002714704368589L, -8451850425616618572L, -4802107899124397606L, 7189045926098209343L, 270284182797252388L}).toString();
                int i8 = ((i4 & 112) == i3 ? i5 : 0) | (r7.m8963(c3973) ? 1 : 0);
                Object objM8999 = r7.m8999();
                if (i8 != 0 || objM8999 == C2850.f9517) {
                    obj = objM8999;
                    C0079 c0079 = new C0079(8, c1347, c3973);
                    r7.m8987(c0079);
                    obj = c0079;
                }
                obj = objM8999;
                InterfaceC0705 interfaceC0705M9215 = AbstractC5537.m9215(interfaceC0705M7709, zContains, c2155, (InterfaceC4745) obj, 10);
                long[] jArr = new long[i6];
                // fill-array-data instruction
                jArr[0] = 7501677849847001470L;
                jArr[1] = 3781357155158879806L;
                jArr[2] = 3912537294466881625L;
                jArr[3] = -7130638072102823849L;
                jArr[4] = 7809132061069593750L;
                jArr[5] = -8400905383866528670L;
                jArr[6] = -1840796026829028109L;
                jArr[7] = 1324427945022615048L;
                jArr[8] = 7383385300603733900L;
                jArr[9] = 8132212368576288820L;
                jArr[10] = 8854931943701078670L;
                jArr[11] = -8312167628834034511L;
                jArr[12] = -6934014434997459701L;
                jArr[13] = 6452524184632147884L;
                new C4441(jArr).toString();
                C3668 c3668M6048 = AbstractC3287.m6047(c3033, c4274, r7, 54);
                long[] jArr2 = new long[i2];
                // fill-array-data instruction
                jArr2[0] = 2675993927132434494L;
                jArr2[1] = 2926747259327588920L;
                jArr2[2] = -4931714814884094311L;
                jArr2[3] = -3490017142560560811L;
                jArr2[4] = 1782039425017777392L;
                jArr2[5] = -9157385988590244616L;
                jArr2[6] = -766896745719145837L;
                jArr2[7] = 7688116889506828495L;
                jArr2[8] = -8089199319918164977L;
                jArr2[9] = -7181300736707821504L;
                jArr2[10] = -666049809940616196L;
                jArr2[11] = 4364744716224335017L;
                new C4441(jArr2).toString();
                int iHashCode2 = Long.hashCode(r7.f17657);
                C2103 c2103M8995 = r7.m8994();
                InterfaceC0705 interfaceC0705M2162 = AbstractC0993.m2161(r7, interfaceC0705M9215);
                InterfaceC4576.f15106.getClass();
                C3709 c37010 = C0849.f3049;
                long[] jArr3 = new long[i2];
                // fill-array-data instruction
                jArr3[0] = -9181517404515147L;
                jArr3[1] = 5096016792458944230L;
                jArr3[2] = -5334953210710541314L;
                jArr3[3] = -1862556803708177327L;
                jArr3[4] = -6693519214103601525L;
                jArr3[5] = 528254919360268878L;
                jArr3[6] = -524613664836957071L;
                jArr3[7] = -8128689663219033673L;
                jArr3[8] = 5316812436490087550L;
                jArr3[9] = -4437354927771431150L;
                jArr3[10] = -1078222419145522330L;
                jArr3[11] = -8003270104149681585L;
                new C4441(jArr3).toString();
                r7.m8983();
                if (r7.f17668) {
                    r7.m9005(c37010);
                } else {
                    r7.m8972();
                }
                AbstractC0993.m2127(C0849.f3048, r7, c3668M6048);
                AbstractC0993.m2127(C0849.f3047, r7, c2103M8995);
                AbstractC0993.m2127(C0849.f3053, r7, Integer.valueOf(iHashCode2));
                AbstractC0993.m2146(r7, C0849.f3050);
                AbstractC0993.m2127(C0849.f3052, r7, interfaceC0705M2162);
                long[] jArr4 = new long[i7];
                // fill-array-data instruction
                jArr4[0] = -8367073902126765285L;
                jArr4[1] = 8101420282392832083L;
                jArr4[2] = -6959187382787308511L;
                jArr4[3] = 2647192358623240754L;
                jArr4[4] = -8629397482326607869L;
                new C4441(jArr4).toString();
                new C4441(new long[]{-4703370869843103743L, 5533384721172854796L, 1089294007347549456L, 1772109924071815191L, 8986086546611064360L, 7871270182599777341L, 890688464784296194L, -1942143059425117439L, -8829363765951409290L, 4289507377870566171L, -5352340766376259622L}).toString();
                C4773.m8132(zContains, AbstractC5568.m9376(C4217.f13994, 12.0f), false, null, r7, 432);
                AbstractC0495.m1105(C3133.m5804(c3973.f13282, r7), null, 0L, 0L, null, 0L, null, 0L, 0, false, 1, 0, ((C4413) r7.m8997(AbstractC4957.f16399)).f14550, c5362, 0, 24576, 114686);
                C5362 c5364 = c5362;
                c5364.m9009(true);
                i5 = 1;
                c3033 = c3033;
                i7 = i7;
                i2 = i2;
                i3 = 32;
                i6 = i6;
                z = false;
                r7 = c5364;
            }
            boolean z2 = z;
            r7.m9009(z2);
            r7.m9009(i5);
            r2 = z2;
            r6 = r7;
        } else {
            r2 = 0;
            c5363.m8982();
            r6 = c5363;
        }
        C5863 c5863M8965 = r6.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new C4762(i, r2, list, c1347);
        }
    }

    /* JADX INFO: renamed from: ۥۤ */
    public static final boolean m6771(C1347 c1347, InterfaceC4745 interfaceC4745) {
        int i;
        AbstractC0073 abstractC0073;
        Object objMo211;
        AbstractC3191 abstractC3191M3278;
        boolean zM6791;
        do {
            synchronized (f12622) {
                C5594 c5594 = (C5594) AbstractC1538.m3272(c1347.f4636);
                i = c5594.f18437;
                abstractC0073 = c5594.f18435;
            }
            C4250 c4250Mo629 = abstractC0073.mo629();
            objMo211 = interfaceC4745.mo211(c4250Mo629);
            AbstractC0073 abstractC0073M7514 = c4250Mo629.m7514();
            if (AbstractC3831.m6874(abstractC0073M7514, abstractC0073)) {
                break;
            }
            C5594 c5595 = c1347.f4636;
            synchronized (AbstractC1538.f5203) {
                abstractC3191M3278 = AbstractC1538.m3278();
                zM6791 = m6791((C5594) AbstractC1538.m3276(c5595, c1347, abstractC3191M3278), i, abstractC0073M7514, true);
            }
            AbstractC1538.m3281(abstractC3191M3278, c1347);
        } while (!zM6791);
        return ((Boolean) objMo211).booleanValue();
    }

    /* JADX INFO: renamed from: ۥۥ */
    public static Class m6772(String str) {
        Object c4535;
        Class<AbstractC1605> cls = AbstractC1605.class;
        String str2 = "[" + str + "][" + ((Object) null) + "]";
        LinkedHashMap linkedHashMap = AbstractC4873.f16035;
        Class cls2 = (Class) linkedHashMap.get(str2);
        if (cls2 != null) {
            return cls2;
        }
        try {
            C1967.f6501.getClass();
            Class<AbstractC1605> clsM9037 = AbstractC5378.m9037(AbstractC5041.m8557(cls));
            if (clsM9037 == null) {
                clsM9037 = cls;
            }
            ClassLoader classLoader = clsM9037.getClassLoader();
            if (classLoader == null) {
                throw new IllegalStateException("Operating system not supported");
            }
            c4535 = Class.forName(str, false, classLoader);
            linkedHashMap.put(str2, c4535);
            if (c4535 instanceof C4535) {
                c4535 = null;
            }
            Class cls3 = (Class) c4535;
            if (cls3 != null) {
                return cls3;
            }
            C1967.f6501.getClass();
            Class<AbstractC1605> clsM9038 = AbstractC5378.m9037(AbstractC5041.m8557(cls));
            ClassLoader classLoader2 = (clsM9038 != null ? clsM9038 : AbstractC1605.class).getClassLoader();
            if (classLoader2 == null) {
                C1078.m2276("Operating system not supported");
                return null;
            }
            String[] strArr = {AbstractC3761.m6629("name:[", str, "]")};
            String strConcat = "";
            int i = 0;
            while (true) {
                strConcat = strConcat.concat(" ");
                if (i == 30) {
                    break;
                }
                i++;
            }
            String strConcat2 = strConcat.concat(" -> ");
            String str3 = strArr[0];
            throw new NoClassDefFoundError("Can't find this Class in [" + classLoader2 + "]:\n" + ((Object) (AbstractC0684.m1534(str3) ? "" : AbstractC3761.m6629(strConcat2, str3, "\n"))) + "Generated by YukiHookAPI#ReflectionTool");
        } catch (Throwable th) {
            c4535 = new C4535(th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: ۥۦ */
    public static final Object m6773(C0655 c0655, C2476 c2476, Throwable th, AbstractC0772 abstractC0772) {
        C2948 c2948;
        if (abstractC0772 instanceof C2948) {
            c2948 = (C2948) abstractC0772;
            int i = c2948.f9889;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2948.f9889 = i - Integer.MIN_VALUE;
            } else {
                c2948 = new C2948(abstractC0772);
            }
        } else {
            c2948 = new C2948(abstractC0772);
        }
        Object obj = c2948.f9887;
        int i2 = c2948.f9889;
        try {
            if (i2 == 0) {
                AbstractC0186.m409(obj);
                c2948.f9888 = th;
                c2948.f9889 = 1;
                Object objMo1173 = c2476.mo1173(c0655, th, c2948);
                Object obj2 = EnumC2282.f7590;
                if (objMo1173 == obj2) {
                    return obj2;
                }
            } else {
                if (i2 != 1) {
                    C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                th = c2948.f9888;
                AbstractC0186.m409(obj);
            }
            return C2358.f7817;
        } catch (Throwable th2) {
            if (th != null && th != th2) {
                AbstractC5537.m9223(th2, th);
            }
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ۥۧ */
    public static C4995 m6774(InterfaceC1636 interfaceC1636) {
        C4206 c4206 = new C4206();
        c4206.f13965 = new C0914();
        C4995 c4995 = new C4995(c4206);
        c4206.f13966 = c4995;
        c4206.f13967 = interfaceC1636.getClass();
        try {
            Object objMo3441 = interfaceC1636.mo3441(c4206);
            if (objMo3441 == null) {
                return c4995;
            }
            c4206.f13967 = objMo3441;
            return c4995;
        } catch (Exception e) {
            c4995.f16533.mo1898(e);
            return c4995;
        }
    }

    /* JADX INFO: renamed from: ۥۨ */
    public static final Class m6775(Class cls) {
        boolean zM6874 = AbstractC3831.m6874(cls, C2358.class);
        Class cls2 = Void.TYPE;
        if (!zM6874 && !AbstractC3831.m6874(cls, Void.class)) {
            if (!AbstractC3831.m6874(cls, cls2 == null ? m6772("void") : cls2)) {
                boolean zM6875 = AbstractC3831.m6874(cls, Boolean.class);
                Class cls3 = Boolean.TYPE;
                if (!zM6875) {
                    if (!AbstractC3831.m6874(cls, cls3 == null ? m6772("boolean") : cls3)) {
                        boolean zM6876 = AbstractC3831.m6874(cls, Integer.class);
                        Class cls4 = Integer.TYPE;
                        if (!zM6876) {
                            if (!AbstractC3831.m6874(cls, cls4 == null ? m6772("int") : cls4)) {
                                boolean zM6877 = AbstractC3831.m6874(cls, Float.class);
                                Class cls5 = Float.TYPE;
                                if (!zM6877) {
                                    if (!AbstractC3831.m6874(cls, cls5 == null ? m6772("float") : cls5)) {
                                        boolean zM6878 = AbstractC3831.m6874(cls, Double.class);
                                        Class cls6 = Double.TYPE;
                                        if (!zM6878) {
                                            if (!AbstractC3831.m6874(cls, cls6 == null ? m6772("double") : cls6)) {
                                                boolean zM6879 = AbstractC3831.m6874(cls, Long.class);
                                                Class cls7 = Long.TYPE;
                                                if (!zM6879) {
                                                    if (!AbstractC3831.m6874(cls, cls7 == null ? m6772("long") : cls7)) {
                                                        boolean zM68710 = AbstractC3831.m6874(cls, Short.class);
                                                        Class cls8 = Short.TYPE;
                                                        if (!zM68710) {
                                                            if (!AbstractC3831.m6874(cls, cls8 == null ? m6772("short") : cls8)) {
                                                                boolean zM68711 = AbstractC3831.m6874(cls, Character.class);
                                                                Class cls9 = Character.TYPE;
                                                                if (!zM68711) {
                                                                    if (!AbstractC3831.m6874(cls, cls9 == null ? m6772("char") : cls9)) {
                                                                        boolean zM68712 = AbstractC3831.m6874(cls, Byte.class);
                                                                        Class cls10 = Byte.TYPE;
                                                                        if (!zM68712) {
                                                                            if (!AbstractC3831.m6874(cls, cls10 == null ? m6772("byte") : cls10)) {
                                                                                return cls;
                                                                            }
                                                                        }
                                                                        return cls10 == null ? m6772("byte") : cls10;
                                                                    }
                                                                }
                                                                return cls9 == null ? m6772("char") : cls9;
                                                            }
                                                        }
                                                        return cls8 == null ? m6772("short") : cls8;
                                                    }
                                                }
                                                return cls7 == null ? m6772("long") : cls7;
                                            }
                                        }
                                        return cls6 == null ? m6772("double") : cls6;
                                    }
                                }
                                return cls5 == null ? m6772("float") : cls5;
                            }
                        }
                        return cls4 == null ? m6772("int") : cls4;
                    }
                }
                return cls3 == null ? m6772("boolean") : cls3;
            }
        }
        return cls2 == null ? m6772("void") : cls2;
    }

    /* JADX INFO: renamed from: ۦؑ */
    public static final void m6776(int i, C5362 c5362) {
        c5362.m8979(-1676959659);
        new C4441(new long[]{-8704665857211022096L, -7458022033621180034L, -8529547417067857152L, -5446225937421978910L, -5711498225543837065L, 4235575417819649393L, -3975344249779656675L, -3387917453417025602L, 6715749051014665350L, 411901666510764830L, -8669392171499505544L}).toString();
        if (c5362.m9011(i & 1, i != 0)) {
            AbstractC0701.m1560(AbstractC5568.m9381(C4217.f13994, 0.0f, 11.0f, 0.0f, 6.0f, 5), ((C1831) c5362.m8997(AbstractC0265.f964)).f6082, C1327.m2826(((C2917) c5362.m8997(AbstractC0118.f470)).f9732, 0.4f, 14), 0L, 0.0f, 0.0f, AbstractC0487.f1770, c5362, 12582918, 120);
        } else {
            c5362.m8982();
        }
        C5863 c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new C0064(i, 7);
        }
    }

    /* JADX INFO: renamed from: ۦؒ */
    public static final String m6777(Number number, String str) {
        StringBuilder sb = new StringBuilder("Unexpected special floating-point value ");
        sb.append(number);
        return AbstractC3761.m6621(sb, str != null ? AbstractC3761.m6629(" with key ", str, ". ") : ". ", "By default, non-finite floating point values are prohibited because they do not conform JSON specification.");
    }

    /* JADX INFO: renamed from: ۦؔ */
    public static final void m6778(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException("index (" + i + ") is out of bound of [0, " + i2 + ')');
        }
    }

    /* JADX INFO: renamed from: ۦؖ */
    public static Object m6779(Member member, Object obj, Object[] objArr) {
        Object c4535;
        boolean zBooleanValue = false;
        int i = AbstractC2776.f9251[0];
        if (AbstractC1630.f5457[AbstractC3761.m6632(i)] == 1) {
            try {
                XposedBridge.getXposedVersion();
                c4535 = Boolean.TRUE;
            } catch (Throwable th) {
                c4535 = new C4535(th);
            }
            if (c4535 instanceof C4535) {
                c4535 = null;
            }
            Boolean bool = (Boolean) c4535;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            }
        }
        if (!zBooleanValue) {
            i = 2;
        }
        int iM6632 = AbstractC3761.m6632(i);
        if (iM6632 == 0) {
            return XposedBridge.invokeOriginalMethod(member, obj, objArr);
        }
        if (iM6632 != 1) {
            C1078.m2275();
            return null;
        }
        C1078.m2276("YukiHookAPI cannot support current Hook API or cannot found any available Hook APIs in current environment");
        return null;
    }

    /* JADX INFO: renamed from: ۦؗ */
    public static boolean m6780(int i, Object obj) {
        int iMo1856;
        if (obj instanceof InterfaceC0400) {
            if (obj instanceof InterfaceC3720) {
                iMo1856 = ((InterfaceC3720) obj).mo1856();
            } else if (obj instanceof InterfaceC4448) {
                iMo1856 = 0;
            } else if (obj instanceof InterfaceC4745) {
                iMo1856 = 1;
            } else if (obj instanceof InterfaceC5731) {
                iMo1856 = 2;
            } else if (obj instanceof InterfaceC2609) {
                iMo1856 = 3;
            } else if (obj instanceof InterfaceC3275) {
                iMo1856 = 4;
            } else if (obj instanceof InterfaceC4237) {
                iMo1856 = 5;
            } else if (obj instanceof InterfaceC2051) {
                iMo1856 = 6;
            } else if (obj instanceof InterfaceC3210) {
                iMo1856 = 7;
            } else if (obj instanceof InterfaceC2425) {
                iMo1856 = 8;
            } else if (obj instanceof InterfaceC0799) {
                iMo1856 = 9;
            } else if (obj instanceof InterfaceC3460) {
                iMo1856 = 10;
            } else if (obj instanceof InterfaceC3321) {
                iMo1856 = 11;
            } else if (obj instanceof InterfaceC1016) {
                iMo1856 = 13;
            } else if (obj instanceof InterfaceC4213) {
                iMo1856 = 14;
            } else if (obj instanceof InterfaceC0116) {
                iMo1856 = 15;
            } else if (obj instanceof InterfaceC4394) {
                iMo1856 = 16;
            } else if (obj instanceof InterfaceC5252) {
                iMo1856 = 17;
            } else if (obj instanceof InterfaceC5400) {
                iMo1856 = 18;
            } else if (obj instanceof InterfaceC1617) {
                iMo1856 = 19;
            } else if (obj instanceof InterfaceC4352) {
                iMo1856 = 20;
            } else {
                iMo1856 = obj instanceof InterfaceC4751 ? 21 : -1;
            }
            if (iMo1856 == i) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦؙ */
    public static final float[] m6781(float[] fArr) {
        float f = fArr[0];
        float f2 = fArr[3];
        float f3 = fArr[6];
        float f4 = fArr[1];
        float f5 = fArr[4];
        float f6 = fArr[7];
        float f7 = fArr[2];
        float f8 = fArr[5];
        float f9 = fArr[8];
        float f10 = (f5 * f9) - (f6 * f8);
        float f11 = (f6 * f7) - (f4 * f9);
        float f12 = (f4 * f8) - (f5 * f7);
        float f13 = (f3 * f12) + (f2 * f11) + (f * f10);
        float[] fArr2 = new float[fArr.length];
        fArr2[0] = f10 / f13;
        fArr2[1] = f11 / f13;
        fArr2[2] = f12 / f13;
        fArr2[3] = ((f3 * f8) - (f2 * f9)) / f13;
        fArr2[4] = ((f9 * f) - (f3 * f7)) / f13;
        fArr2[5] = ((f7 * f2) - (f8 * f)) / f13;
        fArr2[6] = ((f2 * f6) - (f3 * f5)) / f13;
        fArr2[7] = ((f3 * f4) - (f6 * f)) / f13;
        fArr2[8] = ((f * f5) - (f2 * f4)) / f13;
        return fArr2;
    }

    /* JADX INFO: renamed from: ۦؚ */
    public static void m6782(int i, Object obj) {
        if (obj == null || m6780(i, obj)) {
            return;
        }
        m6768(obj, "kotlin.jvm.functions.Function" + i);
        throw null;
    }

    /* JADX INFO: renamed from: ۦٌ */
    public static final C3177 m6783(C3177 c3177, C4902 c4902, int i) {
        return new C3177(((C3828) c4902.f16167).m6828(i), i, c3177.f10675);
    }

    /* JADX INFO: renamed from: ۦُ */
    public static final boolean m6784(float[] fArr) {
        return fArr.length >= 16 && fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[3] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[7] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f && fArr[11] == 0.0f && fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f;
    }

    /* JADX INFO: renamed from: ۦِ */
    public static Map m6785(Object obj) {
        if ((obj instanceof InterfaceC3984) && !(obj instanceof InterfaceC1993)) {
            m6768(obj, "kotlin.collections.MutableMap");
            throw null;
        }
        try {
            return (Map) obj;
        } catch (ClassCastException e) {
            AbstractC3831.m6853(e, AbstractC3801.class.getName());
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۦٕ */
    public static final String m6786(long j) {
        String str;
        if (j <= -999500000) {
            str = ((j - 500000000) / 1000000000) + " s ";
        } else if (j <= -999500) {
            str = ((j - 500000) / 1000000) + " ms";
        } else if (j <= 0) {
            str = ((j - 500) / 1000) + " µs";
        } else if (j < 999500) {
            str = ((j + 500) / 1000) + " µs";
        } else if (j < 999500000) {
            str = ((j + 500000) / 1000000) + " ms";
        } else {
            str = ((j + 500000000) / 1000000000) + " s ";
        }
        return String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
    }

    /* JADX INFO: renamed from: ۦٖ */
    public static final boolean m6787(C3536 c3536, long j, long j2) {
        int i = c3536.f11737 == 1 ? 1 : 0;
        long j3 = c3536.f11726;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L));
        float f = i;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j2 >> 32)) * f;
        float f2 = ((int) (j >> 32)) + fIntBitsToFloat3;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j2 & 4294967295L)) * f;
        return (fIntBitsToFloat > f2) | (fIntBitsToFloat < (-fIntBitsToFloat3)) | (fIntBitsToFloat2 < (-fIntBitsToFloat4)) | (fIntBitsToFloat2 > ((int) (j & 4294967295L)) + fIntBitsToFloat4);
    }

    /* JADX INFO: renamed from: ۦٗ */
    public static final C0269 m6788(AbstractC3292 abstractC3292, AbstractC3292 abstractC3293) {
        if (abstractC3292 == abstractC3293) {
            return new C1176(abstractC3292, abstractC3292, 1);
        }
        return (AbstractC5568.m9384(abstractC3292.f11027, 12884901888L) && AbstractC5568.m9384(abstractC3293.f11027, 12884901888L)) ? new C1818((C4017) abstractC3292, (C4017) abstractC3293) : new C0269(abstractC3292, abstractC3293, 0);
    }

    /* JADX INFO: renamed from: ۦٚ */
    public static final int m6789(C1821 c1821, Object obj, int i) {
        int i2 = c1821.f6049;
        if (i2 == 0) {
            return -1;
        }
        try {
            int iM4217 = AbstractC2164.m4217(i2, i, c1821.f6051);
            if (iM4217 < 0 || AbstractC3831.m6874(obj, c1821.f6050[iM4217])) {
                return iM4217;
            }
            int i3 = iM4217 + 1;
            while (i3 < i2 && c1821.f6051[i3] == i) {
                if (AbstractC3831.m6874(obj, c1821.f6050[i3])) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = iM4217 - 1; i4 >= 0 && c1821.f6051[i4] == i; i4--) {
                if (AbstractC3831.m6874(obj, c1821.f6050[i4])) {
                    return i4;
                }
            }
            return ~i3;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX INFO: renamed from: ۦٛ */
    public static final C3177 m6790(C4902 c4902, boolean z, boolean z2, InterfaceC1655 interfaceC1655) {
        long j;
        long jMo2764 = interfaceC1655.mo2764(c4902, z2 ? c4902.f16168 : c4902.f16166);
        if (z ^ z2) {
            int i = C3346.f11195;
            j = jMo2764 >> 32;
        } else {
            int i2 = C3346.f11195;
            j = 4294967295L & jMo2764;
        }
        return c4902.m8262((int) j);
    }

    /* JADX INFO: renamed from: ۦۗ */
    public static final boolean m6791(C5594 c5594, int i, AbstractC0073 abstractC0073, boolean z) {
        boolean z2;
        synchronized (f12622) {
            try {
                int i2 = c5594.f18437;
                if (i2 == i) {
                    c5594.f18435 = abstractC0073;
                    z2 = true;
                    if (z) {
                        c5594.f18436++;
                    }
                    c5594.f18437 = i2 + 1;
                } else {
                    z2 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z2;
    }

    /* JADX INFO: renamed from: ۦۙ */
    public static AbstractC3292 m6792(AbstractC3292 abstractC3292) {
        C5780 c5780 = AbstractC5568.f18381;
        C4228 c4228 = C4228.f14024;
        if (AbstractC5568.m9384(abstractC3292.f11027, 12884901888L)) {
            C4017 c4017 = (C4017) abstractC3292;
            C5780 c5781 = c4017.f13390;
            if (!m6757(c5781, c5780)) {
                return new C4017(c4017.f11028, c4017.f13389, c5780, m6758(m6755((float[]) c4228.f14025, c5781.m9595(), c5780.m9595()), c4017.f13394), c4017.f13395, c4017.f13397, c4017.f13386, c4017.f13387, c4017.f13396, -1);
            }
        }
        return abstractC3292;
    }

    /* JADX INFO: renamed from: ۦۚ */
    public static final boolean m6793(C3536 c3536) {
        return (c3536.m6326() || c3536.f11731 || !c3536.f11733) ? false : true;
    }

    /* JADX INFO: renamed from: ۦۛ */
    public static final C2032 m6794(C2032 c2032, C5470 c5470) {
        int iFollowing;
        C4902 c4902 = (C4902) c5470.f18037;
        if (c2032 != null) {
            C3177 c3177 = c2032.f6693;
            long j = c3177.f10675;
            C3177 c3178 = c2032.f6692;
            if (j != c3178.f10675) {
                boolean z = c2032.f6691;
                if ((z ? c3177 : c3178).f10676 != 0) {
                    return c2032;
                }
                if (z) {
                    c3177 = c3178;
                }
                if (((C3828) c4902.f16167).f12697.f8430.f4307.length() != c3177.f10676) {
                    return c2032;
                }
            } else if (c3177.f10676 != c3178.f10676) {
                return c2032;
            }
        }
        C2032 c2033 = (C2032) c5470.f18034;
        String str = ((C3828) c4902.f16167).f12697.f8430.f4307;
        if (c2033 == null || str.length() == 0) {
            return c2032;
        }
        boolean z2 = c5470.f18035;
        String str2 = ((C3828) c4902.f16167).f12697.f8430.f4307;
        int i = c4902.f16168;
        int length = str2.length();
        if (i == 0) {
            BreakIterator characterInstance = BreakIterator.getCharacterInstance();
            characterInstance.setText(str2);
            int iFollowing2 = characterInstance.following(0);
            return z2 ? C2032.m3982(c2032, m6783(c2032.f6693, c4902, iFollowing2), null, true, 2) : C2032.m3982(c2032, null, m6783(c2032.f6692, c4902, iFollowing2), false, 1);
        }
        if (i == length) {
            BreakIterator characterInstance2 = BreakIterator.getCharacterInstance();
            characterInstance2.setText(str2);
            int iPreceding = characterInstance2.preceding(length);
            return z2 ? C2032.m3982(c2032, m6783(c2032.f6693, c4902, iPreceding), null, false, 2) : C2032.m3982(c2032, null, m6783(c2032.f6692, c4902, iPreceding), true, 1);
        }
        boolean z3 = c2033.f6691;
        if (z2 ^ z3) {
            BreakIterator characterInstance3 = BreakIterator.getCharacterInstance();
            characterInstance3.setText(str2);
            iFollowing = characterInstance3.preceding(i);
        } else {
            BreakIterator characterInstance4 = BreakIterator.getCharacterInstance();
            characterInstance4.setText(str2);
            iFollowing = characterInstance4.following(i);
        }
        return z2 ? C2032.m3982(c2032, m6783(c2032.f6693, c4902, iFollowing), null, z3, 2) : C2032.m3982(c2032, null, m6783(c2032.f6692, c4902, iFollowing), z3, 1);
    }

    /* JADX INFO: renamed from: ۦۜ */
    public static final CharSequence m6795(int i, CharSequence charSequence) {
        if (charSequence.length() >= 200) {
            if (i != -1) {
                int i2 = i - 30;
                int i3 = i + 30;
                String str = i2 <= 0 ? "" : ".....";
                String str2 = i3 >= charSequence.length() ? "" : ".....";
                StringBuilder sb = new StringBuilder(str);
                if (i2 < 0) {
                    i2 = 0;
                }
                int length = charSequence.length();
                if (i3 > length) {
                    i3 = length;
                }
                sb.append(charSequence.subSequence(i2, i3).toString());
                sb.append(str2);
                return sb.toString();
            }
            int length2 = charSequence.length() - 60;
            if (length2 > 0) {
                return "....." + charSequence.subSequence(length2, charSequence.length()).toString();
            }
        }
        return charSequence;
    }

    /* JADX INFO: renamed from: ۦ۟ */
    public static final boolean m6796(C3536 c3536) {
        return (c3536.m6326() || !c3536.f11731 || c3536.f11733) ? false : true;
    }

    /* JADX INFO: renamed from: ۦ۠ */
    public static final PorterDuff.Mode m6797(int i) {
        if (i == 0) {
            return PorterDuff.Mode.CLEAR;
        }
        if (i == 1) {
            return PorterDuff.Mode.SRC;
        }
        if (i == 2) {
            return PorterDuff.Mode.DST;
        }
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 4) {
            return PorterDuff.Mode.DST_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 6) {
            return PorterDuff.Mode.DST_IN;
        }
        if (i == 7) {
            return PorterDuff.Mode.SRC_OUT;
        }
        if (i == 8) {
            return PorterDuff.Mode.DST_OUT;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        if (i == 10) {
            return PorterDuff.Mode.DST_ATOP;
        }
        if (i == 11) {
            return PorterDuff.Mode.XOR;
        }
        if (i == 12) {
            return PorterDuff.Mode.ADD;
        }
        if (i == 14) {
            return PorterDuff.Mode.SCREEN;
        }
        if (i == 15) {
            return PorterDuff.Mode.OVERLAY;
        }
        if (i == 16) {
            return PorterDuff.Mode.DARKEN;
        }
        if (i == 17) {
            return PorterDuff.Mode.LIGHTEN;
        }
        return i == 13 ? PorterDuff.Mode.MULTIPLY : PorterDuff.Mode.SRC_OVER;
    }

    /* JADX INFO: renamed from: ۦۣ */
    public static InterfaceC3534 m6798(InterfaceC4137 interfaceC4137, InterfaceC2218 interfaceC2218) {
        return AbstractC3831.m6874(interfaceC4137.getKey(), interfaceC2218) ? C4794.f15814 : interfaceC4137;
    }

    /* JADX INFO: renamed from: ۦۧ */
    public static final BlendMode m6799(int i) {
        if (i == 0) {
            return BlendMode.CLEAR;
        }
        if (i == 1) {
            return BlendMode.SRC;
        }
        if (i == 2) {
            return BlendMode.DST;
        }
        if (i == 3) {
            return BlendMode.SRC_OVER;
        }
        if (i == 4) {
            return BlendMode.DST_OVER;
        }
        if (i == 5) {
            return BlendMode.SRC_IN;
        }
        if (i == 6) {
            return BlendMode.DST_IN;
        }
        if (i == 7) {
            return BlendMode.SRC_OUT;
        }
        if (i == 8) {
            return BlendMode.DST_OUT;
        }
        if (i == 9) {
            return BlendMode.SRC_ATOP;
        }
        if (i == 10) {
            return BlendMode.DST_ATOP;
        }
        if (i == 11) {
            return BlendMode.XOR;
        }
        if (i == 12) {
            return BlendMode.PLUS;
        }
        if (i == 13) {
            return BlendMode.MODULATE;
        }
        if (i == 14) {
            return BlendMode.SCREEN;
        }
        if (i == 15) {
            return BlendMode.OVERLAY;
        }
        if (i == 16) {
            return BlendMode.DARKEN;
        }
        if (i == 17) {
            return BlendMode.LIGHTEN;
        }
        if (i == 18) {
            return BlendMode.COLOR_DODGE;
        }
        if (i == 19) {
            return BlendMode.COLOR_BURN;
        }
        if (i == 20) {
            return BlendMode.HARD_LIGHT;
        }
        if (i == 21) {
            return BlendMode.SOFT_LIGHT;
        }
        if (i == 22) {
            return BlendMode.DIFFERENCE;
        }
        if (i == 23) {
            return BlendMode.EXCLUSION;
        }
        if (i == 24) {
            return BlendMode.MULTIPLY;
        }
        if (i == 25) {
            return BlendMode.HUE;
        }
        if (i == 26) {
            return BlendMode.SATURATION;
        }
        if (i == 27) {
            return BlendMode.COLOR;
        }
        return i == 28 ? BlendMode.LUMINOSITY : BlendMode.SRC_OVER;
    }

    /* JADX INFO: renamed from: ۦۨ */
    public static final boolean m6800(C3536 c3536) {
        return !c3536.f11731 && c3536.f11733;
    }
}
