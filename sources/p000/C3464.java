package p000;

import android.R;
import android.app.RemoteAction;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.textclassifier.TextClassification;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import ru.bluecat.yandexmapspatcher.p003ui.App;

/* JADX INFO: renamed from: ۦؘّؑۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3464 implements InterfaceC4745 {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ Object f11492;

    /* JADX INFO: renamed from: ۥٓ */
    public final /* synthetic */ Object f11493;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ Object f11494;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f11495;

    public /* synthetic */ C3464(C3134 c3134, String str, String str2, C3637 c3637) {
        this.f11495 = 8;
        this.f11494 = str;
        this.f11492 = str2;
        this.f11493 = c3637;
    }

    /* JADX WARN: Code duplicated, block: B:69:0x01e1  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.InterfaceC4745
    /* JADX INFO: renamed from: ۦؚ */
    public final Object mo211(Object obj) throws Throwable {
        InterfaceC3212 interfaceC3212;
        long j;
        C5837 c5837;
        C2331 c2331;
        int i = this.f11495;
        int i2 = 25;
        int i3 = 3;
        InterfaceC0443 interfaceC0443 = null;
        final int i4 = 0;
        C2358 c2358 = C2358.f7817;
        int i5 = 1;
        Object obj2 = this.f11493;
        Object obj3 = this.f11492;
        Object obj4 = this.f11494;
        switch (i) {
            case 0:
                C5825 c5825 = (C5825) obj4;
                C3411 c3411 = (C3411) obj3;
                C5662 c5662 = (C5662) obj2;
                C5535 c5535 = (C5535) obj;
                AbstractC3831.m6878(c5535, c5825.f19169);
                C4852 c4852 = c5535.f18269;
                Object objM9637 = c5825.m9637(c4852.getValue());
                if (!AbstractC3831.m6874(objM9637, c4852.getValue())) {
                    c5825.f19169.f11359.setValue(objM9637);
                    c3411.f11359.setValue(objM9637);
                    c5535.m9211();
                    c5662.f18631 = true;
                }
                return c2358;
            case 1:
                C1916 c1916 = (C1916) obj4;
                C5765 c5765 = (C5765) obj3;
                C5535 c5536 = (C5535) obj;
                float fFloatValue = ((Number) c5536.f18269.getValue()).floatValue() - c1916.f6312;
                float fM1711 = c5765.f19005.m1711();
                c5765.m9576(fM1711 + fFloatValue);
                float fAbs = Math.abs(fM1711 - c5765.f19005.m1711());
                c1916.f6312 = ((Number) c5536.f18269.getValue()).floatValue();
                ((C1916) obj2).f6312 = ((Number) c5536.f18273.f4358.mo211(c5536.f18270)).floatValue();
                if (Math.abs(fFloatValue - fAbs) > 0.5f) {
                    c5536.m9211();
                }
                return c2358;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                C1225 c1225 = new C1225(5, (InterfaceC4643) obj3, (C4153) obj2);
                InterfaceC0504[] interfaceC0504Arr = AbstractC3992.f13322;
                ((InterfaceC1066) obj).mo2266(AbstractC0208.f762, new C0078((String) obj4, c1225));
                return c2358;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                C2567 c2567 = (C2567) obj4;
                InterfaceC3196 interfaceC3196 = (InterfaceC3196) obj3;
                C3594 c3594 = (C3594) obj2;
                float fFloatValue2 = ((Float) obj).floatValue();
                float f = c2567.f8571 ? 1.0f : -1.0f;
                C4545 c4545 = c2567.f8578;
                long jM7867 = c4545.m7867(c4545.m7870(f * fFloatValue2));
                C4545 c4546 = c3594.f11951;
                float fM7874 = c4545.m7874(c4545.m7867(c4546.m7866(c4546.f15021, jM7867, 1))) * f;
                if (Math.abs(fM7874) < Math.abs(fFloatValue2)) {
                    CancellationException cancellationException = new CancellationException("Scroll animation cancelled because scroll was not consumed (" + fM7874 + " < " + fFloatValue2 + ')');
                    cancellationException.initCause(null);
                    interfaceC3196.mo871(cancellationException);
                }
                return c2358;
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                C5837 c5838 = (C5837) obj4;
                C5745 c5745 = (C5745) obj3;
                InterfaceC4120 interfaceC4120 = (InterfaceC4120) obj2;
                InterfaceC2442 interfaceC2442 = (InterfaceC2442) obj;
                C2449 c2449M9648 = c5838.m9648();
                if (c2449M9648 != null) {
                    InterfaceC3212 interfaceC3212M5353 = interfaceC2442.mo3908().m5353();
                    long j2 = ((C3346) c5838.f19219.getValue()).f11197;
                    long j3 = ((C3346) c5838.f19233.getValue()).f11197;
                    C3828 c3828 = c2449M9648.f8158;
                    C2276 c2276 = c3828.f12696;
                    C2537 c2537 = c3828.f12697;
                    C0376 c0376 = c5838.f19228;
                    long j4 = c5838.f19220;
                    if (!C3346.m6107(j2)) {
                        c0376.m818(j4);
                        int iMo4319 = interfaceC4120.mo4319(C3346.m6109(j2));
                        int iMo43110 = interfaceC4120.mo4319(C3346.m6108(j2));
                        if (iMo4319 != iMo43110) {
                            interfaceC3212M5353.mo2096(c3828.m6830(iMo4319, iMo43110), c0376);
                        }
                    } else if (!C3346.m6107(j3)) {
                        long jM6359 = c2537.f8428.m6359();
                        C1327 c1327 = new C1327(jM6359);
                        if (jM6359 == 16) {
                            c1327 = null;
                        }
                        long j5 = c1327 != null ? c1327.f4595 : C1327.f4588;
                        c0376.m818(C1327.m2826(j5, C1327.m2823(j5) * 0.2f, 14));
                        int iMo43111 = interfaceC4120.mo4319(C3346.m6109(j3));
                        int iMo43112 = interfaceC4120.mo4319(C3346.m6108(j3));
                        if (iMo43111 != iMo43112) {
                            interfaceC3212M5353.mo2096(c3828.m6830(iMo43111, iMo43112), c0376);
                        }
                    } else if (!C3346.m6107(c5745.f18943)) {
                        c0376.m818(j4);
                        long j6 = c5745.f18943;
                        int iMo43113 = interfaceC4120.mo4319(C3346.m6109(j6));
                        int iMo43114 = interfaceC4120.mo4319(C3346.m6108(j6));
                        if (iMo43113 != iMo43114) {
                            interfaceC3212M5353.mo2096(c3828.m6830(iMo43113, iMo43114), c0376);
                        }
                    }
                    boolean z = c3828.m6829() && c2537.f8427 != 3;
                    if (z) {
                        long j7 = c3828.f12693;
                        C2793 c2793M9368 = AbstractC5568.m9368(0L, (((long) Float.floatToRawIntBits((int) (j7 >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j7 & 4294967295L))) & 4294967295L));
                        interfaceC3212M5353.mo2092();
                        InterfaceC3212.m5901(interfaceC3212M5353, c2793M9368);
                    }
                    C0553 c0553 = c2537.f8428.f11803;
                    C1690 c1690 = c0553.f1992;
                    InterfaceC5561 interfaceC5561 = c0553.f1989;
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
                    try {
                        AbstractC0548 abstractC0548Mo3547 = interfaceC5561.mo3547();
                        C1752 c1752 = C1752.f5825;
                        try {
                            if (abstractC0548Mo3547 != null) {
                                interfaceC3212 = interfaceC3212M5353;
                                C2276.m4327(c2276, interfaceC3212, abstractC0548Mo3547, interfaceC5561 != c1752 ? interfaceC5561.mo3549() : 1.0f, c5907, c1691, abstractC0214);
                            } else {
                                interfaceC3212 = interfaceC3212M5353;
                                C2276.m4328(c2276, interfaceC3212, interfaceC5561 != c1752 ? interfaceC5561.mo3548() : C1327.f4588, c5907, c1691, abstractC0214);
                            }
                            if (z) {
                                interfaceC3212.mo2095();
                            }
                        } catch (Throwable th) {
                            th = th;
                            if (z) {
                                interfaceC3212M5353.mo2095();
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                return c2358;
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                C1916 c1917 = (C1916) obj4;
                C5535 c5537 = (C5535) obj;
                float fFloatValue3 = ((Number) c5537.f18269.getValue()).floatValue() - c1917.f6312;
                float fMo927 = ((C5113) obj3).mo927(fFloatValue3);
                c1917.f6312 = ((Number) c5537.f18269.getValue()).floatValue();
                ((C1916) obj2).f6312 = ((Number) c5537.f18273.f4358.mo211(c5537.f18270)).floatValue();
                if (Math.abs(fFloatValue3 - fMo927) > 0.5f) {
                    c5537.m9211();
                }
                return c2358;
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                Context context = (Context) obj3;
                C0843 c0843 = (C0843) obj2;
                C0767 c0767 = (C0767) obj;
                List list = ((C1197) obj4).f4126;
                int size = list.size();
                int i6 = 0;
                while (i6 < size) {
                    AbstractC2395 abstractC2395 = (AbstractC2395) list.get(i6);
                    if (abstractC2395 instanceof C3064) {
                        C3064 c3064 = (C3064) abstractC2395;
                        C0767.m1658(c0767, new C4164(i3, c3064), c3064.f10302 == 0 ? interfaceC0443 : new C0857(-1930700965, new C2403(i4, c3064), true), new C1225(10, c3064, c0843), 6);
                    } else if (abstractC2395 instanceof C2102) {
                        if (Build.VERSION.SDK_INT >= 28) {
                            C2102 c2102 = (C2102) abstractC2395;
                            if (context != null) {
                                int i7 = c2102.f6921;
                                TextClassification textClassification = c2102.f6922;
                                if (i7 < 0) {
                                    C4164 c4164 = new C4164(i2, textClassification);
                                    Drawable icon = textClassification.getIcon();
                                    C0767.m1658(c0767, c4164, icon != null ? new C0857(-1123224187, new C2403(i3, icon), true) : null, new C1225(24, context, textClassification), 6);
                                } else {
                                    RemoteAction remoteAction = (RemoteAction) textClassification.getActions().get(i7);
                                    C0767.m1658(c0767, new C4164(26, remoteAction), ((i7 == 0) || remoteAction.shouldShowIcon()) ? new C0857(-1261173016, new C2403(4, remoteAction), true) : null, new C0463(9, remoteAction), 6);
                                }
                            }
                        }
                    } else if (abstractC2395 instanceof C1727) {
                        c0767.f2783.add(AbstractC2133.f7000);
                    }
                    i6++;
                    interfaceC0443 = null;
                    i4 = 0;
                }
                return c2358;
            case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                C4757 c4757 = (C4757) obj3;
                AbstractC0275 abstractC0275 = (AbstractC0275) obj2;
                AbstractC1842 abstractC1842 = (AbstractC1842) obj;
                boolean zMo323 = ((InterfaceC2427) obj4).mo323();
                C4536 c4536 = c4757.f15697;
                float fM6157 = zMo323 ? c4536.m7862().m6157(c4757.f15697.f14991.getValue()) : c4536.m7858();
                EnumC1616 enumC1616 = c4757.f15698;
                float f2 = enumC1616 == EnumC1616.f5424 ? fM6157 : 0.0f;
                float f3 = enumC1616 == EnumC1616.f5425 ? fM6157 : 0.0f;
                abstractC1842.f6113 = true;
                AbstractC1842.m3626(abstractC1842, abstractC0275, AbstractC2776.m5235(f2), AbstractC2776.m5235(f3));
                abstractC1842.f6113 = false;
                return c2358;
            case 8:
                String str = (String) obj4;
                String str2 = (String) obj3;
                C3637 c3637 = (C3637) obj2;
                C1337 c1337 = (C1337) obj;
                Object obj5 = 0L;
                C3637 c3638 = C3134.f10552;
                Object objM2849 = c1337.m2849(c3638);
                String str3 = "";
                if (objM2849 == null) {
                    objM2849 = "";
                }
                if (((String) objM2849).equals(str)) {
                    C3637 c3637M5814 = C3134.m5814(c1337, str);
                    if (c3637M5814 != null && !c3637M5814.f12167.equals(str2)) {
                        C3637 c3637M5815 = C3134.m5814(c1337, str);
                        if (c3637M5815 != null) {
                            Object hashSet = new HashSet();
                            Object objM28410 = c1337.m2849(c3637M5815);
                            if (objM28410 != null) {
                                hashSet = objM28410;
                            }
                            HashSet hashSet2 = new HashSet((Collection) hashSet);
                            hashSet2.remove(str);
                            if (hashSet2.isEmpty()) {
                                c1337.m2850();
                                c1337.f4620.remove(c3637M5815);
                            } else {
                                c1337.m2852(c3637M5815, hashSet2);
                            }
                        }
                        Object hashSet3 = new HashSet();
                        Object objM28411 = c1337.m2849(c3637);
                        if (objM28411 != null) {
                            hashSet3 = objM28411;
                        }
                        HashSet hashSet4 = new HashSet((Collection) hashSet3);
                        hashSet4.add(str);
                        c1337.m2852(c3637, hashSet4);
                    }
                } else {
                    C3637 c3639 = C3134.f10550;
                    Object objM28412 = c1337.m2849(c3639);
                    if (objM28412 == null) {
                        objM28412 = obj5;
                    }
                    long jLongValue = ((Long) objM28412).longValue();
                    long j8 = 1;
                    if (jLongValue + 1 == 30) {
                        Object objM28413 = c1337.m2849(c3639);
                        long jLongValue2 = ((Long) (objM28413 != null ? objM28413 : 0L)).longValue();
                        Set hashSet5 = new HashSet();
                        String str4 = null;
                        for (Map.Entry entry : c1337.m2851().entrySet()) {
                            if (entry.getValue() instanceof Set) {
                                Set<String> set = (Set) entry.getValue();
                                for (String str5 : set) {
                                    long j9 = j8;
                                    if (str4 == null || str4.compareTo(str5) > 0) {
                                        str3 = ((C3637) entry.getKey()).f12167;
                                        str4 = str5;
                                        hashSet5 = set;
                                    }
                                    j8 = j9;
                                }
                            }
                            j8 = j8;
                        }
                        j = j8;
                        HashSet hashSet6 = new HashSet(hashSet5);
                        hashSet6.remove(str4);
                        c1337.m2852(new C3637(str3), hashSet6);
                        jLongValue = jLongValue2 - j;
                        c1337.m2852(c3639, Long.valueOf(jLongValue));
                    } else {
                        j = 1;
                    }
                    Object hashSet7 = new HashSet();
                    Object objM28414 = c1337.m2849(c3637);
                    if (objM28414 != null) {
                        hashSet7 = objM28414;
                    }
                    HashSet hashSet8 = new HashSet((Collection) hashSet7);
                    hashSet8.add(str);
                    c1337.m2852(c3637, hashSet8);
                    c1337.m2852(c3639, Long.valueOf(jLongValue + j));
                    c1337.m2852(c3638, str);
                }
                return null;
            case 9:
                InterfaceC4367 interfaceC4367 = (InterfaceC4367) obj4;
                ArrayList arrayList = (ArrayList) obj3;
                List list2 = (List) obj2;
                AbstractC1842 abstractC1843 = (AbstractC1842) obj;
                abstractC1843.f6113 = true;
                int size2 = arrayList.size();
                for (int i8 = 0; i8 < size2; i8++) {
                    ((C5851) arrayList.get(i8)).m9676(abstractC1843);
                }
                int size3 = list2.size();
                for (int i9 = 0; i9 < size3; i9++) {
                    ((C5851) list2.get(i9)).m9676(abstractC1843);
                }
                abstractC1843.f6113 = false;
                interfaceC4367.getValue();
                return c2358;
            case 10:
                C1705 c1705 = (C1705) obj3;
                AbstractC2765.m5135((InterfaceC4643) obj4, null, 0, new C4248(c1705, ((Float) obj).floatValue(), null), 3).mo859(new C5688(c1705, (InterfaceC4448) obj2, 1));
                return c2358;
            case 11:
                InterfaceC1291 interfaceC1291 = (InterfaceC1291) obj3;
                C1911 c1911 = (C1911) obj2;
                C2497 c2497 = (C2497) obj;
                long j10 = ((C3291) ((C4660) obj4).get()).f11025;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
                if (fIntBitsToFloat > 0.0f) {
                    float fMo741 = c2497.mo741(4.0f);
                    C2004 c2004 = c2497.f8304;
                    float fMo742 = c2497.mo741(interfaceC1291.mo1102(c2497.getLayoutDirection()));
                    float fM3748 = c1911.m3748(AbstractC2776.m5235(fIntBitsToFloat), AbstractC2776.m5235((Float.intBitsToFloat((int) (c2004.mo4567() >> 32)) - fMo742) - c2497.mo741(interfaceC1291.mo1101(c2497.getLayoutDirection()))), c2497.getLayoutDirection()) + fMo742;
                    float f4 = fIntBitsToFloat / 2.0f;
                    float f5 = fM3748 + f4;
                    float f6 = (f5 - f4) - fMo741;
                    float f7 = f6 < 0.0f ? 0.0f : f6;
                    float f8 = f5 + f4 + fMo741;
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (c2004.mo4567() >> 32));
                    float f9 = f8 > fIntBitsToFloat2 ? fIntBitsToFloat2 : f8;
                    float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j10 & 4294967295L));
                    float f10 = (-fIntBitsToFloat3) / 2.0f;
                    float f11 = fIntBitsToFloat3 / 2.0f;
                    C2808 c2808 = c2004.f6603;
                    long jM5355 = c2808.m5355();
                    c2808.m5353().mo2092();
                    try {
                        ((C2808) ((C5086) c2808.f9378).f16877).m5353().mo2084(f7, f10, f9, f11, 0);
                        c2497.m4644();
                    } finally {
                        c2808.m5353().mo2095();
                        c2808.m5351(jM5355);
                    }
                } else {
                    c2497.m4644();
                }
                return c2358;
            case 12:
                C5108 c5108 = (C5108) obj4;
                C2950 c2950 = (C2950) obj2;
                C3262 c3262 = c5108.f16953;
                if (c3262.m6018(obj3)) {
                    C2316.m4357(obj3, " was used multiple times ", "Key ");
                    return null;
                }
                c5108.f16954.remove(obj3);
                c3262.m6023(obj3, c2950);
                return new C1777(c5108, obj3, c2950);
            case 13:
                C5470 c5470 = (C5470) obj4;
                C0178 c0178 = (C0178) obj3;
                C5662 c5663 = (C5662) obj2;
                C3536 c3536 = (C3536) obj;
                long j11 = c3536.f11726;
                C3635 c3635 = (C3635) c5470.f18037;
                if (c3635.m6483() && c3635.m6479().f18944.f4307.length() != 0 && (c5837 = c3635.f12150) != null && c5837.m9648() != null) {
                    c5470.m9157(c3635.m6479(), j11, false, c0178);
                    i4 = 1;
                }
                if (i4 != 0) {
                    c3536.m6327();
                    c5663.f18631 = true;
                }
                return c2358;
            case 14:
                C3557 c3557 = (C3557) obj4;
                InterfaceC4367 interfaceC4368 = (InterfaceC4367) obj2;
                ((InterfaceC4367) obj3).setValue(Boolean.FALSE);
                String str6 = ((C5745) interfaceC4368.getValue()).f18944.f4307;
                if (str6.length() != 0 && Long.parseLong(str6) >= 1000) {
                    c3557.getClass();
                    App app = App.f407;
                    C1443 c1443 = AbstractC2776.m5217().f410;
                    c1443.getClass();
                    C2518 c2518 = new C2518(c1443);
                    c2518.m4661(Long.valueOf(Long.parseLong(str6)), AbstractC2539.f8449.f5219);
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
                } else {
                    c3557.getClass();
                    interfaceC4368.setValue(C3557.m6354());
                }
                return c2358;
            case 15:
                C5662 c5664 = (C5662) obj2;
                C2331 c2332 = (C2331) obj4;
                C0553 c0554 = (C0553) obj3;
                C2331 c2333 = (C2331) obj;
                if (c5664.f18631) {
                    Object obj6 = c2333.f7719;
                    int i10 = c2333.f7717;
                    int i11 = c2333.f7718;
                    if ((obj6 instanceof C0553) && i11 == c2332.f7718 && i10 == c2332.f7717) {
                        if (c0554 == null) {
                            c0554 = new C0553(0L, 0L, (C1626) null, (C5827) null, (C2848) null, (AbstractC0903) null, (String) null, 0L, (C3917) null, (C5647) null, (C5668) null, 0L, (C1690) null, (C5906) null, 65535);
                        }
                        c2331 = new C2331(i11, i10, c0554);
                    } else {
                        c2331 = c2333;
                    }
                } else {
                    c2331 = c2333;
                }
                c5664.f18631 = c2332.equals(c2333);
                return c2331;
            case 16:
                InterfaceC4745 interfaceC4745 = (InterfaceC4745) obj3;
                C2829 c2829 = (C2829) ((C5450) obj2).f17965;
                C5745 c5745M8417 = ((C5002) obj4).m8417((List) obj);
                if (c2829 != null) {
                    c2829.m5393(null, c5745M8417);
                }
                interfaceC4745.mo211(c5745M8417);
                return c2358;
            default:
                final C3635 c3636 = (C3635) obj4;
                InterfaceC4643 interfaceC4643 = (InterfaceC4643) obj3;
                Context context2 = (Context) obj2;
                C5091 c5091 = (C5091) obj;
                C2730 c2730 = c5091.f16885;
                C2730 c2731 = c5091.f16885;
                C1727 c1727 = C1727.f5753;
                c2730.m5079(c1727);
                EnumC1062 enumC1062 = EnumC1062.Autofill;
                boolean z2 = (C3346.m6107(c3636.m6479().f18943) || !c3636.m6476() || c3636.f12158 == null) ? false : true;
                C1225 c1226 = new C1225(i2, interfaceC4643, new C3742(c3636, interfaceC0443, i5));
                Resources resources = context2.getResources();
                int i12 = 11;
                C1708 c1708 = new C1708(i12, c1226, interfaceC0443);
                if (z2) {
                    c2731.m5079(new C3064(AbstractC0993.f3546, resources.getString(R.string.cut), R.attr.actionModeCutDrawable, c1708));
                }
                EnumC1062 enumC1063 = EnumC1062.Autofill;
                boolean z3 = (C3346.m6107(c3636.m6479().f18943) || c3636.f12158 == null) ? false : true;
                C1225 c1227 = new C1225(i2, interfaceC4643, new C3742(c3636, interfaceC0443, 2));
                Resources resources2 = context2.getResources();
                C1708 c1709 = new C1708(i12, c1227, interfaceC0443);
                if (z3) {
                    c2731.m5079(new C3064(AbstractC0993.f3543, resources2.getString(R.string.copy), R.attr.actionModeCopyDrawable, c1709));
                }
                EnumC1062 enumC1064 = EnumC1062.Autofill;
                boolean z4 = c3636.m6476() && ((Boolean) c3636.f12146.getValue()).booleanValue() && c3636.f12158 != null;
                C1225 c1228 = new C1225(i2, interfaceC4643, new C3742(c3636, interfaceC0443, i3));
                Resources resources3 = context2.getResources();
                C1708 c17010 = new C1708(i12, c1228, interfaceC0443);
                if (z4) {
                    c2731.m5079(new C3064(AbstractC0993.f3544, resources3.getString(R.string.paste), R.attr.actionModePasteDrawable, c17010));
                }
                EnumC1062 enumC1065 = EnumC1062.Autofill;
                boolean z5 = C3346.m6113(c3636.m6479().f18943) != c3636.m6479().f18944.f4307.length();
                InterfaceC4448 interfaceC4448 = new InterfaceC4448() { // from class: ۦۣؓؗ
                    @Override // p000.InterfaceC4448
                    /* JADX INFO: renamed from: ۥۣ */
                    public final Object mo449() {
                        int i13 = i4;
                        C2358 c2359 = C2358.f7817;
                        C3635 c36310 = c3636;
                        switch (i13) {
                            case 0:
                                return Boolean.valueOf(!c36310.f12136);
                            case 1:
                                C5745 c5745M6468 = C3635.m6468(c36310.m6479().f18944, AbstractC2765.m5145(0, c36310.m6479().f18944.f4307.length()));
                                c36310.f12138.mo211(c5745M6468);
                                long j12 = c5745M6468.f18943;
                                c36310.f12160 = new C3346(j12);
                                c36310.f12144 = C5745.m9570(c36310.f12144, null, j12, 5);
                                c36310.m6471(true);
                                return c2359;
                            default:
                                InterfaceC4448 interfaceC4449 = c36310.f12141;
                                if (interfaceC4449 != null) {
                                    interfaceC4449.mo449();
                                }
                                return c2359;
                        }
                    }
                };
                final int i13 = 1;
                InterfaceC4448 interfaceC4449 = new InterfaceC4448() { // from class: ۦۣؓؗ
                    @Override // p000.InterfaceC4448
                    /* JADX INFO: renamed from: ۥۣ */
                    public final Object mo449() {
                        int i14 = i13;
                        C2358 c2359 = C2358.f7817;
                        C3635 c36310 = c3636;
                        switch (i14) {
                            case 0:
                                return Boolean.valueOf(!c36310.f12136);
                            case 1:
                                C5745 c5745M6468 = C3635.m6468(c36310.m6479().f18944, AbstractC2765.m5145(0, c36310.m6479().f18944.f4307.length()));
                                c36310.f12138.mo211(c5745M6468);
                                long j12 = c5745M6468.f18943;
                                c36310.f12160 = new C3346(j12);
                                c36310.f12144 = C5745.m9570(c36310.f12144, null, j12, 5);
                                c36310.m6471(true);
                                return c2359;
                            default:
                                InterfaceC4448 interfaceC44410 = c36310.f12141;
                                if (interfaceC44410 != null) {
                                    interfaceC44410.mo449();
                                }
                                return c2359;
                        }
                    }
                };
                Resources resources4 = context2.getResources();
                C1708 c17011 = new C1708(i12, interfaceC4449, interfaceC4448);
                if (z5) {
                    c2731.m5079(new C3064(AbstractC0993.f3542, resources4.getString(R.string.selectAll), R.attr.actionModeSelectAllDrawable, c17011));
                }
                EnumC1062 enumC1066 = EnumC1062.Autofill;
                if (c3636.m6476() && C3346.m6107(c3636.m6479().f18943)) {
                    i4 = 1;
                }
                final int i14 = 2;
                InterfaceC4448 interfaceC44410 = new InterfaceC4448() { // from class: ۦۣؓؗ
                    @Override // p000.InterfaceC4448
                    /* JADX INFO: renamed from: ۥۣ */
                    public final Object mo449() {
                        int i15 = i14;
                        C2358 c2359 = C2358.f7817;
                        C3635 c36310 = c3636;
                        switch (i15) {
                            case 0:
                                return Boolean.valueOf(!c36310.f12136);
                            case 1:
                                C5745 c5745M6468 = C3635.m6468(c36310.m6479().f18944, AbstractC2765.m5145(0, c36310.m6479().f18944.f4307.length()));
                                c36310.f12138.mo211(c5745M6468);
                                long j12 = c5745M6468.f18943;
                                c36310.f12160 = new C3346(j12);
                                c36310.f12144 = C5745.m9570(c36310.f12144, null, j12, 5);
                                c36310.m6471(true);
                                return c2359;
                            default:
                                InterfaceC4448 interfaceC44411 = c36310.f12141;
                                if (interfaceC44411 != null) {
                                    interfaceC44411.mo449();
                                }
                                return c2359;
                        }
                    }
                };
                Resources resources5 = context2.getResources();
                C1708 c17012 = new C1708(i12, interfaceC44410, interfaceC0443);
                if (i4 != 0) {
                    c2731.m5079(new C3064(enumC1066.f3744, resources5.getString(enumC1066.f3743), enumC1066.f3742, c17012));
                }
                c2731.m5079(c1727);
                return c2358;
        }
    }

    public /* synthetic */ C3464(C2567 c2567, C4174 c4174, InterfaceC3196 interfaceC3196, C3594 c3594) {
        this.f11495 = 3;
        this.f11494 = c2567;
        this.f11492 = interfaceC3196;
        this.f11493 = c3594;
    }

    public /* synthetic */ C3464(InterfaceC4367 interfaceC4367, ArrayList arrayList, List list, boolean z) {
        this.f11495 = 9;
        this.f11494 = interfaceC4367;
        this.f11492 = arrayList;
        this.f11493 = list;
    }

    public /* synthetic */ C3464(C5662 c5662, C2331 c2331, C0553 c0553) {
        this.f11495 = 15;
        this.f11493 = c5662;
        this.f11494 = c2331;
        this.f11492 = c0553;
    }

    public /* synthetic */ C3464(C1916 c1916, C5113 c5113, C1916 c1917, C3645 c3645) {
        this.f11495 = 5;
        this.f11494 = c1916;
        this.f11492 = c5113;
        this.f11493 = c1917;
    }

    public /* synthetic */ C3464(Object obj, Object obj2, Object obj3, int i) {
        this.f11495 = i;
        this.f11494 = obj;
        this.f11492 = obj2;
        this.f11493 = obj3;
    }
}
