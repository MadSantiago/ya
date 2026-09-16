package p000;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import ru.bluecat.yandexmapspatcher.R;
import ru.bluecat.yandexmapspatcher.p003ui.SideActivity;

/* JADX INFO: renamed from: ۦًؑؔٞ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3032 implements InterfaceC2609 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ Object f10196;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f10197;

    public /* synthetic */ C3032(C1387 c1387, C1863 c1863) {
        this.f10197 = 8;
        this.f10196 = c1387;
    }

    @Override // p000.InterfaceC2609
    /* JADX INFO: renamed from: ۦۙ */
    public final Object mo1173(Object obj, Object obj2, Object obj3) {
        int i = this.f10197;
        C4036 c4036 = C2850.f9517;
        int i2 = 4;
        Object c4535 = null;
        boolean z = false;
        z = false;
        z = false;
        boolean z2 = true;
        C2358 c2358 = C2358.f7817;
        Object obj4 = this.f10196;
        switch (i) {
            case 0:
                ((C0091) obj4).mo211((Throwable) obj);
                return c2358;
            case 1:
                C5666 c5666 = (C5666) obj4;
                int iIntValue = ((Integer) obj).intValue();
                int iIntValue2 = ((Integer) obj2).intValue();
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                if (!zBooleanValue) {
                    iIntValue = c5666.f18638.mo4318(iIntValue);
                }
                if (!zBooleanValue) {
                    iIntValue2 = c5666.f18638.mo4318(iIntValue2);
                }
                if (c5666.f18639) {
                    long j = c5666.f18637.f18943;
                    int i3 = C3346.f11195;
                    if (iIntValue != ((int) (j >> 32)) || iIntValue2 != ((int) (j & 4294967295L))) {
                        int iMin = Math.min(iIntValue, iIntValue2);
                        EnumC1546 enumC1546 = EnumC1546.f5232;
                        if (iMin < 0 || Math.max(iIntValue, iIntValue2) > c5666.f18637.f18944.f4307.length()) {
                            C3635 c3635 = c5666.f18640;
                            c3635.m6482(false);
                            c3635.m6474(enumC1546);
                        } else {
                            if (zBooleanValue || iIntValue == iIntValue2) {
                                C3635 c3636 = c5666.f18640;
                                c3636.m6482(false);
                                c3636.m6474(enumC1546);
                            } else {
                                c5666.f18640.m6471(true);
                            }
                            c5666.f18641.f19244.mo211(new C5745(c5666.f18637.f18944, AbstractC2765.m5145(iIntValue, iIntValue2), (C3346) null));
                            z = true;
                        }
                    }
                }
                return Boolean.valueOf(z);
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                ((C4859) obj4).f15986.mo2356(((C3536) obj2).f11726, C0373.f1375);
                return c2358;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                C5269 c5269 = (C5269) obj4;
                C5362 c5362 = (C5362) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                new C4441(new long[]{4933852352004959988L, 4453289984313440230L, 5547858606585661348L, 6165743641615241671L, 4469880930850104051L, 5758519421693264137L, -6206450388415766236L, -4758037818704842677L, -3434695948468397310L, -69423521305985399L}).toString();
                if (c5362.m9011(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    WeakHashMap weakHashMap = C2816.f9398;
                    C0879 c0879 = AbstractC1434.m3061(c5362).f9401;
                    InterfaceC2880 interfaceC2880 = (InterfaceC2880) c5362.m8997(AbstractC2853.f9544);
                    InterfaceC0705 interfaceC0705M9381 = AbstractC5568.m9381(C4217.f13994, 0.0f, 0.0f, interfaceC2880.mo756(c0879.mo1865(interfaceC2880, EnumC2459.f8215)), 0.0f, 11);
                    new C4441(new long[]{-3696413902560571174L, -7668597728279442335L, -5000969450789944065L, -5061241423864390618L, -2016161462251109576L, 7355272223928068425L}).toString();
                    boolean zM8977 = c5362.m8977(c5269);
                    Object objM8999 = c5362.m8999();
                    if (zM8977 || objM8999 == c4036) {
                        objM8999 = new C3530(c5269, z2 ? 1 : 0);
                        c5362.m8987(objM8999);
                    }
                    AbstractC2164.m4197((InterfaceC4448) objM8999, interfaceC0705M9381, null, 0L, 0L, null, C5063.f16806, c5362, 12582912, 124);
                } else {
                    c5362.m8982();
                }
                return c2358;
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                C2384 c2384 = (C2384) obj4;
                C4960 c4960 = (C4960) obj;
                C5362 c5363 = (C5362) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                new C4441(new long[]{-7265194020015933801L, -564169481841175564L, -4075207124510716837L, -1562096453096706408L, 1960338346739522549L, -9077562948733015673L}).toString();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= (iIntValue4 & 8) == 0 ? c5363.m8963(c4960) : c5363.m8977(c4960) ? 4 : 2;
                }
                if (c5363.m9011(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    C1397.f4797.m2967(new C1442(c4960.f16408, c2384.m1405(), false, c4960.f16407), 0.0f, 0L, c5363, 3072);
                } else {
                    c5363.m8982();
                }
                return c2358;
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                C2247 c2247 = (C2247) obj4;
                C5362 c5364 = (C5362) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                new C4441(new long[]{-2376994000852752853L, -7489982823304389144L, -8606762185735443927L, 6919210747340868121L, -3403508087872248779L}).toString();
                if (c5364.m9011(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    C5063.m8627(c2247, c5364, 8);
                } else {
                    c5364.m8982();
                }
                return c2358;
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                EnumC5242 enumC5242 = (EnumC5242) obj4;
                C5362 c5365 = (C5362) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                new C4441(new long[]{-6990775300385356172L, 2762250730979433207L, -6741078471871633748L, -7530337558010832698L, 8291308955096857457L, 5476957621795885192L, 7658159785327243835L}).toString();
                if (c5365.m9011(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    AbstractC0495.m1105(C3133.m5804(AbstractC0246.m513(new EnumC5242[]{EnumC5242.f17306, EnumC5242.f17307}).contains(enumC5242) ? R.string.status_hooks_list : R.string.status_download, c5365), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c5365, 0, 0, 262142);
                } else {
                    c5365.m8982();
                }
                return c2358;
            case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                InterfaceC4367 interfaceC4367 = (InterfaceC4367) obj4;
                C5362 c5366 = (C5362) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                new C4441(new long[]{667168433625910568L, -2176520237829196685L, -5029855098675789697L, -7718136580243170801L, 8806789433459934375L}).toString();
                if (c5366.m9011(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    C5063.m8647((C1966) interfaceC4367.getValue(), c5366, 0);
                } else {
                    c5366.m8982();
                }
                return c2358;
            case 8:
                C1387 c1387 = (C1387) obj4;
                C1387.f4741.set(c1387, null);
                c1387.mo2950(null);
                return c2358;
            case 9:
                ((C5718) obj4).m9532();
                return c2358;
            case 10:
                C5277 c5277 = (C5277) obj4;
                InterfaceC1291 interfaceC1291 = (InterfaceC1291) obj;
                C5362 c5367 = (C5362) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                new C4441(new long[]{6520098642164126105L, 5309529550924363001L, -1092923430971583417L, 5583431858951187758L, -7025226420557881015L, -4157016443694030030L, 4052454169243301489L}).toString();
                if ((iIntValue8 & 6) == 0) {
                    iIntValue8 |= c5367.m8963(interfaceC1291) ? 4 : 2;
                }
                if (c5367.m9011(iIntValue8 & 1, (iIntValue8 & 19) != 18)) {
                    SideActivity sideActivity = SideActivity.f416;
                    String str = AbstractC4489.m7812().f418;
                    if (str == null) {
                        new C4441(new long[]{4261950385277770897L, -1925274571051165917L}).toString();
                        str = null;
                    }
                    if (AbstractC3831.m6874(str, C4548.f15024.f18563)) {
                        c5367.m8957(1576939692);
                        new C4441(new long[]{-4409691675969843050L, 1166468769846646772L, -4064203197909133428L}).toString();
                        AbstractC4225.m7493(interfaceC1291, null, c5367, iIntValue8 & 14);
                        c5367.m9009(false);
                    } else if (AbstractC3831.m6874(str, C0817.f2908.f18563)) {
                        c5367.m8957(1576941846);
                        new C4441(new long[]{3414599542545400862L, -5212867956371698355L, 1536220122594570698L}).toString();
                        AbstractC0993.m2130(interfaceC1291, c5277, c5367, iIntValue8 & 14);
                        c5367.m9009(false);
                    } else {
                        c5367.m8957(1640607378);
                        c5367.m9009(false);
                    }
                } else {
                    c5367.m8982();
                }
                return c2358;
            case 11:
                C3635 c3637 = (C3635) obj4;
                InterfaceC0705 interfaceC0705 = (InterfaceC0705) obj;
                C5362 c5368 = (C5362) obj2;
                ((Integer) obj3).getClass();
                c5368.m8957(1980580247);
                InterfaceC2880 interfaceC2881 = (InterfaceC2880) c5368.m8997(AbstractC2853.f9544);
                Object objM89910 = c5368.m8999();
                Object obj5 = objM89910;
                if (objM89910 == c4036) {
                    C4852 c4852M5183 = AbstractC2774.m5183(new C4207(0L));
                    c5368.m8987(c4852M5183);
                    obj5 = c4852M5183;
                }
                InterfaceC4367 interfaceC4368 = (InterfaceC4367) obj5;
                boolean zM8978 = c5368.m8977(c3637);
                Object objM89911 = c5368.m8999();
                Object obj6 = objM89911;
                if (zM8978 || objM89911 == c4036) {
                    C1225 c1225 = new C1225(26, c3637, interfaceC4368);
                    c5368.m8987(c1225);
                    obj6 = c1225;
                }
                InterfaceC4448 interfaceC4448 = (InterfaceC4448) obj6;
                boolean zM8963 = c5368.m8963(interfaceC2881);
                Object objM89912 = c5368.m8999();
                Object obj7 = objM89912;
                if (zM8963 || objM89912 == c4036) {
                    C5281 c5281 = new C5281(interfaceC2881, interfaceC4368, z ? 1 : 0);
                    c5368.m8987(c5281);
                    obj7 = c5281;
                }
                C0994 c0994 = AbstractC4382.f14447;
                InterfaceC0705 interfaceC0705M2152 = AbstractC0993.m2152(interfaceC0705, new C4513(i2, interfaceC4448, (InterfaceC4745) obj7));
                c5368.m9009(false);
                return interfaceC0705M2152;
            default:
                C2993 c2993 = (C2993) obj4;
                Intent intent = (Intent) obj3;
                String action = intent.getAction();
                if (action != null) {
                    try {
                        ConcurrentHashMap concurrentHashMap = c2993.f10070;
                        if (concurrentHashMap.isEmpty()) {
                            concurrentHashMap = null;
                        }
                        if (concurrentHashMap != null) {
                            ArrayList arrayList = new ArrayList();
                            for (Map.Entry entry : concurrentHashMap.entrySet()) {
                                String str2 = (String) entry.getKey();
                                C3869 c3869 = (C3869) entry.getValue();
                                Object obj8 = c3869.f12915;
                                Activity activity = obj8 instanceof Activity ? (Activity) obj8 : null;
                                if (activity != null && activity.isDestroyed()) {
                                    arrayList.add(str2);
                                } else if (c2993.m5586((Context) c3869.f12915)) {
                                    ((InterfaceC5731) c3869.f12914).mo219(action, intent);
                                }
                            }
                            ArrayList arrayList2 = arrayList.isEmpty() ? null : arrayList;
                            if (arrayList2 != null) {
                                Iterator it = arrayList2.iterator();
                                while (it.hasNext()) {
                                    concurrentHashMap.remove((String) it.next());
                                }
                            }
                            c4535 = concurrentHashMap;
                        }
                    } catch (Throwable th) {
                        c4535 = new C4535(th);
                    }
                    Throwable thM405 = AbstractC0183.m405(c4535);
                    if (thM405 != null) {
                        ArrayList arrayList3 = C2503.f8322;
                        C2503.m4657(4, "Received action \"" + action + "\" failed", thM405);
                    }
                    break;
                }
                return c2358;
        }
    }

    public /* synthetic */ C3032(int i, Object obj) {
        this.f10197 = i;
        this.f10196 = obj;
    }
}
