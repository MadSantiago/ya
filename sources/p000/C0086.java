package p000;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.luckypray.dexkit.DexKitBridge;
import ru.bluecat.yandexmapspatcher.R;
import ru.bluecat.yandexmapspatcher.p003ui.App;
import ru.bluecat.yandexmapspatcher.search.EnvironmentInitializer;

/* JADX INFO: renamed from: ۦۗ */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0086 implements InterfaceC4745 {

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f16357;

    public /* synthetic */ C0086(int i) {
        this.f16357 = i;
    }

    @Override // p000.InterfaceC4745
    /* JADX INFO: renamed from: ۦؚ */
    public final Object mo211(Object obj) {
        Object c4535;
        int i = this.f16357;
        List list = C2340.f7777;
        final int i2 = 1;
        final int i3 = 2;
        final int i4 = 0;
        int i5 = 3;
        C2358 c2358 = C2358.f7817;
        switch (i) {
            case 0:
                C4801 c4801 = (C4801) obj;
                C4801.m8179(c4801, AbstractC0949.f3360);
                C4801.m8179(c4801, AbstractC0949.f3370);
                C4801.m8179(c4801, AbstractC0949.f3362);
                C4801.m8179(c4801, AbstractC0949.f3363);
                C4801.m8179(c4801, AbstractC0949.f3377);
                C4801.m8179(c4801, AbstractC0949.f3368);
                return c2358;
            case 1:
                ((Long) obj).getClass();
                return c2358;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                return Boolean.valueOf(!(((InterfaceC1116) obj) instanceof C0477));
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                App app = App.f407;
                ((C2518) obj).m4661(new C4441(new long[]{-4947269056081944079L, -4001305603410346291L}).toString(), AbstractC2539.f8442.f5219);
                return c2358;
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                Application application = (Application) obj;
                if (EnvironmentInitializer.f405.m167(application)) {
                    C4524 c4524 = C4524.f14953;
                    c4524.getClass();
                    final C2808 c2808 = new C2808(c4524, application, new C3152(application.getDataDir() + "/shared_prefs", new C4441(new long[]{-3891634715992643052L, 7093148446942232728L, -4288196912278985337L, -5770878437814149526L}).toString()), 9);
                    c4524.m7248().m3172(new C4441(new long[]{-3168712034568121867L, 2480585804390897918L, -1181026097928606733L, -2897684440142952330L}).toString(), new InterfaceC4745() { // from class: ۦُٖؗۘ
                        @Override // p000.InterfaceC4745
                        /* JADX INFO: renamed from: ۦؚ */
                        public final Object mo211(Object obj2) throws IOException {
                            ArrayList arrayList;
                            int i6 = i3;
                            C2358 c2359 = C2358.f7817;
                            C2808 c2809 = c2808;
                            switch (i6) {
                                case 0:
                                    C0971 c0971 = C0971.f3428;
                                    c0971.getClass();
                                    C1488 c1488 = (C1488) c0971.m2035(C1488.Companion.serializer(), (String) obj2);
                                    if (c1488.f5053.contains(EnumC1029.f3635.f3638)) {
                                        AbstractC1333[] abstractC1333ArrListFiles = new C3152(c1488.f5054).listFiles();
                                        if (abstractC1333ArrListFiles != null) {
                                            arrayList = new ArrayList();
                                            for (AbstractC1333 abstractC1333 : abstractC1333ArrListFiles) {
                                                if (AbstractC0684.m1527(abstractC1333.getName(), new C4441(new long[]{-2406117337597337049L, -5299362049058460906L}).toString(), false)) {
                                                    arrayList.add(abstractC1333);
                                                }
                                            }
                                        } else {
                                            arrayList = null;
                                        }
                                        if (arrayList == null || arrayList.isEmpty()) {
                                            arrayList = null;
                                        }
                                        if (arrayList != null) {
                                            Iterator it = arrayList.iterator();
                                            while (it.hasNext()) {
                                                ((AbstractC1333) it.next()).delete();
                                            }
                                        }
                                    }
                                    if (c1488.f5053.contains(EnumC1029.f3634.f3638)) {
                                        C3152 c3152 = (C3152) c2809.f9377;
                                        C4524 c4525 = (C4524) c2809.f9378;
                                        if (!c3152.exists()) {
                                            c3152 = null;
                                        }
                                        if (c3152 != null) {
                                            c3152.delete();
                                        }
                                        String string = new C4441(new long[]{-1010483097855220406L, -4296007240302435207L, -1800097692186071297L}).toString();
                                        C1443 c1443 = new C1443();
                                        c1443.f4945 = null;
                                        c1443.f4944 = string;
                                        c1443.m3069();
                                        C2518 c2518 = new C2518(c1443);
                                        c2518.m4662();
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
                                        c4525.m7248().m3140("wait_for_listener_value", new C4441(new long[]{-1609894098614026138L, -5165259734910659609L, 5822302806207335282L, 8031217753789287063L}).toString());
                                    }
                                    c2809.m5352(R.string.toast_success);
                                    return c2359;
                                case 1:
                                    C3152 c3153 = new C3152((String) obj2);
                                    C3152 c3154 = c3153.exists() ? c3153 : null;
                                    if (c3154 != null) {
                                        c3154.delete();
                                    }
                                    c2809.m5352(R.string.toast_finish);
                                    return c2359;
                                default:
                                    byte[] bArr = (byte[]) obj2;
                                    FileOutputStream fileOutputStream = new FileOutputStream((C3152) c2809.f9377);
                                    try {
                                        fileOutputStream.write(bArr);
                                        fileOutputStream.close();
                                        ((C4524) c2809.f9378).m7248().m3140("wait_for_listener_value", new C4441(new long[]{759278950249641L, -4010899581717542371L, 258527353524778389L, -1798615259702326682L}).toString());
                                        c2809.m5352(R.string.toast_settings_success);
                                        return c2359;
                                    } catch (Throwable th) {
                                        try {
                                            throw th;
                                        } catch (Throwable th2) {
                                            AbstractC4554.m7932(fileOutputStream, th);
                                            throw th2;
                                        }
                                    }
                            }
                        }
                    });
                    C1489 c1489M7248 = c4524.m7248();
                    C1489.m3097(c1489M7248, new C4441(new long[]{-2024775960944292614L, 5544353804327529857L, -6623472104945617328L, 8733322809257322888L}).toString(), new C0101(11, c1489M7248));
                    c4524.m7248().m3172(new C4441(new long[]{-7677208388883299370L, 2158364227803926471L, 7522865301283717451L, 7924654417411687328L}).toString(), new InterfaceC4745() { // from class: ۦُٖؗۘ
                        @Override // p000.InterfaceC4745
                        /* JADX INFO: renamed from: ۦؚ */
                        public final Object mo211(Object obj2) throws IOException {
                            ArrayList arrayList;
                            int i6 = i4;
                            C2358 c2359 = C2358.f7817;
                            C2808 c2809 = c2808;
                            switch (i6) {
                                case 0:
                                    C0971 c0971 = C0971.f3428;
                                    c0971.getClass();
                                    C1488 c1488 = (C1488) c0971.m2035(C1488.Companion.serializer(), (String) obj2);
                                    if (c1488.f5053.contains(EnumC1029.f3635.f3638)) {
                                        AbstractC1333[] abstractC1333ArrListFiles = new C3152(c1488.f5054).listFiles();
                                        if (abstractC1333ArrListFiles != null) {
                                            arrayList = new ArrayList();
                                            for (AbstractC1333 abstractC1333 : abstractC1333ArrListFiles) {
                                                if (AbstractC0684.m1527(abstractC1333.getName(), new C4441(new long[]{-2406117337597337049L, -5299362049058460906L}).toString(), false)) {
                                                    arrayList.add(abstractC1333);
                                                }
                                            }
                                        } else {
                                            arrayList = null;
                                        }
                                        if (arrayList == null || arrayList.isEmpty()) {
                                            arrayList = null;
                                        }
                                        if (arrayList != null) {
                                            Iterator it = arrayList.iterator();
                                            while (it.hasNext()) {
                                                ((AbstractC1333) it.next()).delete();
                                            }
                                        }
                                    }
                                    if (c1488.f5053.contains(EnumC1029.f3634.f3638)) {
                                        C3152 c3152 = (C3152) c2809.f9377;
                                        C4524 c4525 = (C4524) c2809.f9378;
                                        if (!c3152.exists()) {
                                            c3152 = null;
                                        }
                                        if (c3152 != null) {
                                            c3152.delete();
                                        }
                                        String string = new C4441(new long[]{-1010483097855220406L, -4296007240302435207L, -1800097692186071297L}).toString();
                                        C1443 c1443 = new C1443();
                                        c1443.f4945 = null;
                                        c1443.f4944 = string;
                                        c1443.m3069();
                                        C2518 c2518 = new C2518(c1443);
                                        c2518.m4662();
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
                                        c4525.m7248().m3140("wait_for_listener_value", new C4441(new long[]{-1609894098614026138L, -5165259734910659609L, 5822302806207335282L, 8031217753789287063L}).toString());
                                    }
                                    c2809.m5352(R.string.toast_success);
                                    return c2359;
                                case 1:
                                    C3152 c3153 = new C3152((String) obj2);
                                    C3152 c3154 = c3153.exists() ? c3153 : null;
                                    if (c3154 != null) {
                                        c3154.delete();
                                    }
                                    c2809.m5352(R.string.toast_finish);
                                    return c2359;
                                default:
                                    byte[] bArr = (byte[]) obj2;
                                    FileOutputStream fileOutputStream = new FileOutputStream((C3152) c2809.f9377);
                                    try {
                                        fileOutputStream.write(bArr);
                                        fileOutputStream.close();
                                        ((C4524) c2809.f9378).m7248().m3140("wait_for_listener_value", new C4441(new long[]{759278950249641L, -4010899581717542371L, 258527353524778389L, -1798615259702326682L}).toString());
                                        c2809.m5352(R.string.toast_settings_success);
                                        return c2359;
                                    } catch (Throwable th) {
                                        try {
                                            throw th;
                                        } catch (Throwable th2) {
                                            AbstractC4554.m7932(fileOutputStream, th);
                                            throw th2;
                                        }
                                    }
                            }
                        }
                    });
                    c4524.m7248().m3172(new C4441(new long[]{1948350611206620413L, 888071864519440417L, 3884500932465130023L, 5495955079622552224L}).toString(), new InterfaceC4745() { // from class: ۦُٖؗۘ
                        @Override // p000.InterfaceC4745
                        /* JADX INFO: renamed from: ۦؚ */
                        public final Object mo211(Object obj2) throws IOException {
                            ArrayList arrayList;
                            int i6 = i2;
                            C2358 c2359 = C2358.f7817;
                            C2808 c2809 = c2808;
                            switch (i6) {
                                case 0:
                                    C0971 c0971 = C0971.f3428;
                                    c0971.getClass();
                                    C1488 c1488 = (C1488) c0971.m2035(C1488.Companion.serializer(), (String) obj2);
                                    if (c1488.f5053.contains(EnumC1029.f3635.f3638)) {
                                        AbstractC1333[] abstractC1333ArrListFiles = new C3152(c1488.f5054).listFiles();
                                        if (abstractC1333ArrListFiles != null) {
                                            arrayList = new ArrayList();
                                            for (AbstractC1333 abstractC1333 : abstractC1333ArrListFiles) {
                                                if (AbstractC0684.m1527(abstractC1333.getName(), new C4441(new long[]{-2406117337597337049L, -5299362049058460906L}).toString(), false)) {
                                                    arrayList.add(abstractC1333);
                                                }
                                            }
                                        } else {
                                            arrayList = null;
                                        }
                                        if (arrayList == null || arrayList.isEmpty()) {
                                            arrayList = null;
                                        }
                                        if (arrayList != null) {
                                            Iterator it = arrayList.iterator();
                                            while (it.hasNext()) {
                                                ((AbstractC1333) it.next()).delete();
                                            }
                                        }
                                    }
                                    if (c1488.f5053.contains(EnumC1029.f3634.f3638)) {
                                        C3152 c3152 = (C3152) c2809.f9377;
                                        C4524 c4525 = (C4524) c2809.f9378;
                                        if (!c3152.exists()) {
                                            c3152 = null;
                                        }
                                        if (c3152 != null) {
                                            c3152.delete();
                                        }
                                        String string = new C4441(new long[]{-1010483097855220406L, -4296007240302435207L, -1800097692186071297L}).toString();
                                        C1443 c1443 = new C1443();
                                        c1443.f4945 = null;
                                        c1443.f4944 = string;
                                        c1443.m3069();
                                        C2518 c2518 = new C2518(c1443);
                                        c2518.m4662();
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
                                        c4525.m7248().m3140("wait_for_listener_value", new C4441(new long[]{-1609894098614026138L, -5165259734910659609L, 5822302806207335282L, 8031217753789287063L}).toString());
                                    }
                                    c2809.m5352(R.string.toast_success);
                                    return c2359;
                                case 1:
                                    C3152 c3153 = new C3152((String) obj2);
                                    C3152 c3154 = c3153.exists() ? c3153 : null;
                                    if (c3154 != null) {
                                        c3154.delete();
                                    }
                                    c2809.m5352(R.string.toast_finish);
                                    return c2359;
                                default:
                                    byte[] bArr = (byte[]) obj2;
                                    FileOutputStream fileOutputStream = new FileOutputStream((C3152) c2809.f9377);
                                    try {
                                        fileOutputStream.write(bArr);
                                        fileOutputStream.close();
                                        ((C4524) c2809.f9378).m7248().m3140("wait_for_listener_value", new C4441(new long[]{759278950249641L, -4010899581717542371L, 258527353524778389L, -1798615259702326682L}).toString());
                                        c2809.m5352(R.string.toast_settings_success);
                                        return c2359;
                                    } catch (Throwable th) {
                                        try {
                                            throw th;
                                        } catch (Throwable th2) {
                                            AbstractC4554.m7932(fileOutputStream, th);
                                            throw th2;
                                        }
                                    }
                            }
                        }
                    });
                    String[] strArrM153 = EnvironmentInitializer.m166().m153();
                    if (strArrM153 == null || strArrM153.length == 0 || EnvironmentInitializer.m165().m154(new C4441(new long[]{-8693094737550245943L, 4191946000049208418L, 980162089456906324L}).toString()) != C5787.f19064) {
                        C2137 c2137 = C2137.f7014;
                        c2137.getClass();
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        try {
                            DexKitBridge dexKitBridgeM7847 = C4524.f14954.m7847();
                            c2137.m4171(dexKitBridgeM7847);
                            c2137.m4173(dexKitBridgeM7847);
                            c2137.m4172(dexKitBridgeM7847);
                            C2137.m4170(jCurrentTimeMillis);
                            C4524.f14953.m7846();
                        } catch (Exception e) {
                            ArrayList arrayList = C2503.f8322;
                            C2503.m4656(AbstractC4009.m7184(R.string.obfuscation_search, new Object[0]), e);
                        }
                    } else {
                        c4524.m7846();
                    }
                    break;
                }
                return c2358;
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                C4910 c4910 = (C4910) obj;
                c4910.m8312(AbstractC4593.f15159, (int) (c4910.m8313().mo2799() >> 32));
                c4910.m8312(AbstractC4593.f15161, 0.0f);
                return c2358;
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                return c2358;
            case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                return AbstractC2919.m5505((C3131) obj);
            case 8:
                ((C2497) obj).m4644();
                return c2358;
            case 9:
                C0954 c0954 = (C0954) obj;
                C4524.f14953.getClass();
                C1443 c1443M7845 = C4524.m7845();
                C1542 c1542 = AbstractC2539.f8461;
                Object obj2 = c1542.f5218;
                String str = c1542.f5219;
                boolean z = C1443.f4940;
                Set set = (Set) c1443M7845.m3068(obj2, str);
                c0954.getClass();
                try {
                    c4535 = c0954.m1971()[0];
                    if (c4535 == null) {
                        c4535 = null;
                    }
                } catch (Throwable th) {
                    c4535 = new C4535(th);
                }
                List list2 = (List) (c4535 instanceof C4535 ? null : c4535);
                if (list2 != null) {
                    list = list2;
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : list) {
                    if (set.contains(((Enum) obj3).name())) {
                        arrayList2.add(obj3);
                    }
                }
                new C0322(i4, i5, c0954).m684(arrayList2);
                return c2358;
            case 10:
                return c2358;
            case 11:
                return c2358;
            case 12:
                C2103 c2103 = (C2103) obj;
                C4216 c4216 = AbstractC4354.f14355;
                c2103.getClass();
                if (((Context) C3133.m5778(c2103, c4216)).getPackageManager().hasSystemFeature("android.software.leanback")) {
                    return AbstractC0934.f3324;
                }
                InterfaceC3762.f12523.getClass();
                return C3507.f11617;
            case 13:
                AbstractC3992.m7135((InterfaceC1066) obj, 0);
                return c2358;
            case 14:
                ((C3751) obj).m6591(new C0086(15));
                return c2358;
            case 15:
                C0954 c0955 = (C0954) obj;
                c0955.getClass();
                new C0322(i4, i5, c0955).m683();
                return c2358;
            case 16:
                C0954 c0956 = (C0954) obj;
                c0956.getClass();
                C0322 c0322 = new C0322(c0956.m1971().length - 1, i5, c0956);
                List list3 = (List) c0322.m695();
                if (list3 != null) {
                    list = list3;
                }
                ArrayList arrayList3 = new ArrayList();
                for (Object obj4 : list) {
                    if (!obj4.toString().startsWith(new C4441(new long[]{-5999378040721935966L, -7261741792917890013L}).toString())) {
                        arrayList3.add(obj4);
                    }
                }
                c0322.m684(arrayList3);
                return c2358;
            case 17:
                C0954 c0957 = (C0954) obj;
                Object objM1970 = c0957.m1970();
                if (!(objM1970 instanceof List)) {
                    objM1970 = null;
                }
                List list4 = (List) objM1970;
                if (list4 != null) {
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj5 : list4) {
                        C3121 c3121M7163 = AbstractC4009.m7163(obj5);
                        c3121M7163.m5746();
                        C2244 c2244M5751 = c3121M7163.m5751();
                        c2244M5751.f9027 = new C4441(new long[]{7194094463779206145L, 8995995646584834397L}).toString();
                        C3657 c3657 = (C3657) AbstractC0973.m2058(c2244M5751.m4293());
                        String str2 = c3657 != null ? (String) c3657.m6535(new Object[0]) : null;
                        if (!(str2 != null ? str2.equals(new C4441(new long[]{-3793968642565866645L, 1273442693603861429L, -2616981708953704963L}).toString()) : false)) {
                            arrayList4.add(obj5);
                        }
                    }
                    c0957.m1973(arrayList4);
                }
                return c2358;
            case 18:
                C2672 c2672 = (C2672) obj;
                c2672.getClass();
                c2672.f8854 = new C0094(1024, 1);
                C0637 c0637 = new C0637();
                C5310 c5310 = new C5310();
                C5310.m8924(c5310, new C4441(new long[]{-5427884451864513135L, 2033552217637693637L}).toString());
                C5310.m8925(c5310, new C4441(new long[]{-2965456661886438675L, -8701316305503035185L, -1249578016299350493L}).toString(), 3);
                c0637.m1443(c5310);
                c2672.m4981(c0637);
                return c2358;
            case 19:
                ((C3751) obj).m6592(list);
                return c2358;
            case 20:
                ((C3751) obj).m6592(null);
                return c2358;
            case 21:
                C0637 c0638 = (C0637) obj;
                C5310 c5311 = new C5310();
                C5310.m8924(c5311, new C4441(new long[]{3039322051100716608L, 8466854108413553968L, 8826174083726969586L}).toString());
                c0638.m1443(c5311);
                Class<Boolean> clsM9037 = AbstractC5378.m9037(AbstractC5041.m8557(Boolean.class));
                c0638.m1444(null, clsM9037 != null ? clsM9037 : Boolean.class);
                return c2358;
            case 22:
                C0637 c0639 = (C0637) obj;
                String string = new C4441(new long[]{3183080621874047567L, 6041050535704299944L, -3981111468706566784L, 3803484801030824526L}).toString();
                c0639.getClass();
                C0637.m1442(c0639, string);
                return c2358;
            case 23:
                ((C3751) obj).m6592(null);
                return c2358;
            case 24:
                C0672 c0672 = (C0672) obj;
                C0637 c06310 = new C0637();
                C0637.m1442(c06310, new C4441(new long[]{7899069470260322207L, 7544335484751295091L, 906024876172315721L, 2442756854327069583L}).toString());
                c0672.m1503(c06310);
                C0637 c06311 = new C0637();
                C0637.m1442(c06311, new C4441(new long[]{-1620210083193835177L, 1837436058274262065L, -5321768473706207326L}).toString());
                c0672.m1503(c06311);
                return c2358;
            case 25:
                ((C3751) obj).m6592(null);
                return c2358;
            case 26:
                C2672 c2673 = (C2672) obj;
                C0637 c06312 = new C0637();
                C0637 c06313 = new C0637();
                C0637.m1441(c06313, new C4441(new long[]{-8687480168827816262L, 4292678072973951593L, 1425996515650819396L}).toString(), 4);
                C0672 c0673 = c06312.f2379;
                if (c0673 == null) {
                    c0673 = new C0672();
                }
                c06312.f2379 = c0673;
                c0673.m1503(c06313);
                c2673.m4981(c06312);
                String string2 = new C4441(new long[]{-770203303753830635L, -1732528062422150326L}).toString();
                C4243 c4243 = c2673.f8853;
                if (c4243 == null) {
                    c4243 = new C4243();
                }
                c2673.f8853 = c4243;
                C3098 c3098 = new C3098();
                c3098.f10388 = new C2203(5, string2, false);
                c4243.m7503(c3098);
                return c2358;
            case 27:
                ((C3751) obj).m6592(list);
                return c2358;
            case 28:
                ((C3751) obj).m6592(list);
                return c2358;
            default:
                C0637 c06314 = (C0637) obj;
                Class<List> clsM9038 = AbstractC5378.m9037(AbstractC5041.m8557(List.class));
                c06314.m1445(clsM9038 != null ? clsM9038 : List.class);
                C0637 c06315 = new C0637();
                String string3 = new C4441(new long[]{-6853391405924074196L, 7368808993532367725L, 83369896835032906L}).toString();
                C2672 c2674 = new C2672();
                c2674.m4980(1, string3, false);
                c06315.f2383 = c2674;
                C0672 c0674 = c06314.f2379;
                if (c0674 == null) {
                    c0674 = new C0672();
                }
                c06314.f2379 = c0674;
                c0674.m1503(c06315);
                return c2358;
        }
    }
}
