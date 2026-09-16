package p000;

import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import ru.bluecat.yandexmapspatcher.p003ui.App;

/* JADX INFO: renamed from: ۦۖؑؒٙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4884 implements InterfaceC4745 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ Object f16066;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f16067;

    public /* synthetic */ C4884(C4884 c4884, C0037 c0037) {
        this.f16067 = 19;
        this.f16066 = c4884;
    }

    @Override // p000.InterfaceC4745
    /* JADX INFO: renamed from: ۦؚ */
    public final Object mo211(Object obj) {
        C5837 c5837;
        int i = this.f16067;
        boolean z = true;
        Object obj2 = this.f16066;
        switch (i) {
            case 0:
                ((C3352) obj2).f11213 = (C0956) obj;
                return C2358.f7817;
            case 1:
                InterfaceC0814 interfaceC0814 = ((C5108) obj2).f16951;
                return Boolean.valueOf(interfaceC0814 != null ? interfaceC0814.mo1712(obj) : true);
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                C3945 c3945 = (C3945) obj2;
                float fFloatValue = ((Float) obj).floatValue();
                C0169 c0169 = c3945.f13176;
                float fM360 = c0169.m360() + fFloatValue + c3945.f13173;
                float fM7922 = AbstractC4554.m7922(fM360, 0.0f, c3945.f13172.m360());
                z = fM360 == fM7922;
                float fM361 = fM7922 - c0169.m360();
                int iRound = Math.round(fM361);
                c0169.m359(c0169.m360() + iRound);
                c3945.f13173 = fM361 - iRound;
                if (!z) {
                    fFloatValue = fM361;
                }
                return Float.valueOf(fFloatValue);
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                C4545 c4545 = (C4545) obj2;
                return new C1553(c4545.m7866(c4545.f15021, ((C1553) obj).f5241, c4545.f15019));
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                C5470 c5470 = (C5470) obj2;
                C3536 c3536 = (C3536) obj;
                long j = c3536.f11726;
                C3635 c3635 = (C3635) c5470.f18037;
                if (!c3635.m6483() || c3635.m6479().f18944.f4307.length() == 0 || (c5837 = c3635.f12150) == null || c5837.m9648() == null) {
                    z = false;
                } else {
                    c5470.m9157(c3635.m6479(), j, false, C0373.f1375);
                }
                if (z) {
                    c3536.m6327();
                }
                return C2358.f7817;
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                return ((C0062) obj2).mo449();
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                final boolean zBooleanValue = ((Boolean) obj).booleanValue();
                ((C1443) obj2).m3071(new InterfaceC4745() { // from class: ۥِۨؗۤ
                    @Override // p000.InterfaceC4745
                    /* JADX INFO: renamed from: ۦؚ */
                    public final Object mo211(Object obj3) {
                        C2518 c2518 = (C2518) obj3;
                        C1542 c1542 = AbstractC2539.f8437;
                        boolean z2 = zBooleanValue;
                        c2518.m4661(Boolean.valueOf(z2), c1542.f5219);
                        if (!z2) {
                            c2518.m4661(Boolean.FALSE, AbstractC2539.f8444.f5219);
                        }
                        return C2358.f7817;
                    }
                });
                return C2358.f7817;
            case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                AbstractC4134 abstractC4134 = (AbstractC4134) obj2;
                Throwable th = (Throwable) obj;
                C4524.f14953.getClass();
                LinkedHashMap linkedHashMap = C4524.f14956;
                if (!linkedHashMap.containsKey(abstractC4134.mo223())) {
                    String strMo223 = abstractC4134.mo223();
                    C0971 c0971 = C0971.f3428;
                    C1185 c1185 = new C1185(2, AbstractC4009.m7184(abstractC4134.mo222(), new Object[0]));
                    c0971.getClass();
                    linkedHashMap.put(strMo223, c0971.m2034(C1185.Companion.serializer(), c1185));
                    ArrayList arrayList = C2503.f8322;
                    C2503.m4656(abstractC4134.mo223(), th);
                }
                return C2358.f7817;
            case 8:
                AbstractC4134 abstractC4135 = (AbstractC4134) obj2;
                Throwable th2 = (Throwable) obj;
                C4524.f14953.getClass();
                LinkedHashMap linkedHashMap2 = C4524.f14956;
                if (!linkedHashMap2.containsKey(abstractC4135.mo223())) {
                    String strMo224 = abstractC4135.mo223();
                    C0971 c0972 = C0971.f3428;
                    C1185 c1186 = new C1185(2, AbstractC4009.m7184(abstractC4135.mo222(), new Object[0]));
                    c0972.getClass();
                    linkedHashMap2.put(strMo224, c0972.m2034(C1185.Companion.serializer(), c1186));
                    ArrayList arrayList2 = C2503.f8322;
                    C2503.m4656(abstractC4135.mo223(), th2);
                }
                return C2358.f7817;
            case 9:
                C4683 c4683 = (C4683) obj2;
                InterfaceC4783 interfaceC4783 = c4683.f15427;
                if (!AbstractC3831.m6874(interfaceC4783, interfaceC4783)) {
                    AbstractC0371.m794("Requested a SingleSubscriptionSnapshotFlowManager to manage multiple subscriptions");
                }
                C3639 c3639 = c4683.f15424;
                Object obj3 = c4683.f15425;
                if (c3639 != null) {
                    if (obj3 != null) {
                        AbstractC0371.m794("workingSoleWatchedObject must be null when workingWatchSet is non-null");
                    }
                    c3639.m6495(obj);
                } else if (obj3 == null) {
                    c4683.f15425 = obj;
                } else {
                    C3639 c36310 = AbstractC5705.f18789;
                    C3639 c36311 = new C3639();
                    c36311.m6495(obj3);
                    c36311.m6495(obj);
                    c4683.f15424 = c36311;
                    c4683.f15425 = null;
                }
                return C2358.f7817;
            case 10:
                ((C0811) obj2).m1710(((Float) obj).floatValue());
                return C2358.f7817;
            case 11:
                ((C0169) obj2).m359(((Integer) obj).intValue());
                return C2358.f7817;
            case 12:
                ((C0925) obj2).m1900(((Long) obj).longValue());
                return C2358.f7817;
            case 13:
                ((C4852) obj2).setValue(obj);
                return C2358.f7817;
            case 14:
                C5389 c5389 = (C5389) obj2;
                synchronized (c5389.f17819) {
                    C5471 c5471 = c5389.f17818;
                    Object obj4 = c5471.f18041;
                    int i2 = c5471.f18044;
                    C1254 c1254 = c5471.f18038;
                    if (c1254 == null) {
                        c1254 = new C1254();
                        c5471.f18038 = c1254;
                        c5471.f18040.m6023(obj4, c1254);
                    }
                    c5471.m9164(obj, i2, obj4, c1254);
                }
                return C2358.f7817;
            case 15:
                C5535 c5535 = (C5535) obj;
                ((InterfaceC5731) obj2).mo219(c5535.f18269.getValue(), AbstractC3831.f12709.f4358.mo211(c5535.f18270));
                return C2358.f7817;
            case 16:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                App app = App.f407;
                C1443 c1443 = AbstractC2776.m5217().f409;
                c1443.getClass();
                C2518 c2518 = new C2518(c1443);
                c2518.m4661(bool, ((C1542) obj2).f5219);
                C2358 c2358 = C2358.f7817;
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
                return c2358;
            case 17:
                Drawable drawable = (Drawable) obj2;
                InterfaceC2442 interfaceC2442 = (InterfaceC2442) obj;
                InterfaceC3212 interfaceC3212M5353 = interfaceC2442.mo3908().m5353();
                drawable.setBounds(0, 0, (int) Float.intBitsToFloat((int) (interfaceC2442.mo4567() >> 32)), (int) Float.intBitsToFloat((int) (interfaceC2442.mo4567() & 4294967295L)));
                Canvas canvas = AbstractC5664.f18633;
                drawable.draw(((C0979) interfaceC3212M5353).f3447);
                return C2358.f7817;
            case 18:
                ((InterfaceC4745) obj).mo211((C5091) obj2);
                return C2358.f7817;
            case 19:
                C4884 c4884 = (C4884) obj2;
                InterfaceC0289 interfaceC0289 = (InterfaceC0289) obj;
                if (interfaceC0289 instanceof C2333) {
                    c4884.mo211(((C2333) interfaceC0289).f7722);
                    return Boolean.TRUE;
                }
                C1078.m2276("TextContextMenuDataNode.TraverseKey key must only be attached to instances of TextContextMenuDataNode.");
                return null;
            case 20:
                C4950 c4950 = (C4950) obj2;
                float fFloatValue2 = ((Float) obj).floatValue();
                C0811 c0811 = c4950.f16381;
                float fM1711 = c0811.m1711() + fFloatValue2;
                C0811 c0812 = c4950.f16380;
                if (fM1711 > c0812.m1711()) {
                    fFloatValue2 = c0812.m1711() - c0811.m1711();
                } else if (fM1711 < 0.0f) {
                    fFloatValue2 = -c0811.m1711();
                }
                c0811.m1710(c0811.m1711() + fFloatValue2);
                return Float.valueOf(fFloatValue2);
            case 21:
                C0917 c0917 = (C0917) obj2;
                C2331 c2331 = (C2331) obj;
                InterfaceC1116 interfaceC1116 = (InterfaceC1116) c2331.f7719;
                if (interfaceC1116 instanceof C0780) {
                    C0780 c0780 = (C0780) interfaceC1116;
                    if (c0780.f2821 == null) {
                        return C2331.m4373(c2331, new C0780(c0780.f2822, c0917), 0, 14);
                    }
                }
                if (!(interfaceC1116 instanceof C2458)) {
                    return c2331;
                }
                C2458 c2458 = (C2458) interfaceC1116;
                return c2458.f8211 == null ? C2331.m4373(c2331, new C2458(c2458.f8212, c0917), 0, 14) : c2331;
            case 22:
                C2018 c2018 = (C2018) obj2;
                C1917 c1917 = (C1917) obj;
                C1917.m3751(c1917, "first", c2018.f6656.mo193());
                C1917.m3751(c1917, "second", c2018.f6655.mo193());
                C1917.m3751(c1917, "third", c2018.f6654.mo193());
                return C2358.f7817;
            case 23:
                ((C0398) obj2).mo211(Boolean.valueOf(AbstractC3831.m6874((String) obj, C2993.f10062)));
                return C2358.f7817;
            default:
                return obj2;
        }
    }

    public /* synthetic */ C4884(int i, Object obj) {
        this.f16067 = i;
        this.f16066 = obj;
    }
}
