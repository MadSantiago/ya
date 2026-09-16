package p000;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: ۦٜؑؑؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3018 implements InterfaceC4745 {

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f10165;

    public /* synthetic */ C3018(int i) {
        this.f10165 = i;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0165  */
    @Override // p000.InterfaceC4745
    /* JADX INFO: renamed from: ۦؚ */
    public final Object mo211(Object obj) throws IllegalAccessException {
        Object c4535;
        boolean zM1527;
        int i = this.f10165;
        C2340 c2340 = C2340.f7777;
        int i2 = 0;
        int i3 = 3;
        C2358 c2358 = C2358.f7817;
        switch (i) {
            case 0:
                ((C3751) obj).m6592(c2340);
                return c2358;
            case 1:
                C2672 c2672 = (C2672) obj;
                Class<List> clsM9037 = AbstractC5378.m9037(AbstractC5041.m8557(List.class));
                Class cls = clsM9037 != null ? clsM9037 : List.class;
                C4243 c4243 = c2672.f8853;
                if (c4243 == null) {
                    c4243 = new C4243();
                }
                c2672.f8853 = c4243;
                C3098 c3098 = new C3098();
                c3098.m5686(cls);
                c4243.m7503(c3098);
                C4243 c4244 = c2672.f8853;
                if (c4244 == null) {
                    c4244 = new C4243();
                }
                c2672.f8853 = c4244;
                c4244.f14055 = new C0094(1);
                C0672 c0672 = c2672.f8852;
                if (c0672 == null) {
                    c0672 = new C0672();
                }
                c2672.f8852 = c0672;
                c0672.f2470 = new C0094(2);
                return c2358;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                Object obj2 = ((C0514) ((C0954) obj).f3387.f4868).f1837.thisObject;
                if (obj2 == null) {
                    C1078.m2276("HookParam instance got null! Is this a static member?");
                    return null;
                }
                C3121 c3121M7163 = AbstractC4009.m7163(obj2);
                c3121M7163.m5746();
                C2749 c2749M5747 = c3121M7163.m5747();
                c2749M5747.f9027 = new C4441(new long[]{-8912193513082027876L, 3301993547285394233L}).toString();
                C1865 c1865 = (C1865) AbstractC0973.m2058(c2749M5747.m5108());
                if (c1865 == null) {
                    C2058.f6777.m3886();
                } else if (AbstractC3831.m6874(c1865.m3715(), new C4441(new long[]{-3621266433192658113L, -5912817299163119750L}).toString())) {
                    c1865.m3377();
                    c1865.f6208.set(c1865.f10320, null);
                }
                return c2358;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                C0637 c0637 = (C0637) obj;
                String string = new C4441(new long[]{-5285445244283149995L, -1070360692390980199L, -2392048942027391207L}).toString();
                c0637.getClass();
                C0637.m1442(c0637, string);
                return c2358;
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                return c2358;
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                C3190 c3190 = (C3190) ((InterfaceC0289) obj);
                c3190.f10716 = false;
                AbstractC0186.m412(c3190);
                return Boolean.FALSE;
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                return ((C2572) ((C1046) obj).f3702.getValue()).f8589;
            case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                return Boolean.valueOf(Modifier.isPublic(((Constructor) obj).getModifiers()));
            case 8:
                return c2358;
            case 9:
                Map.Entry entry = (Map.Entry) obj;
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" : ");
                if (value instanceof Object[]) {
                    value = Arrays.toString((Object[]) value);
                }
                sb.append(value);
                return sb.toString();
            case 10:
                C2470 c2470 = (C2470) obj;
                Class<Object> cls2 = Object.class;
                Class<Object> clsM9038 = AbstractC5378.m9037(AbstractC5041.m8557(cls2));
                if (clsM9038 == null) {
                    clsM9038 = cls2;
                }
                c2470.m4633(clsM9038);
                Class<Object> clsM9039 = AbstractC5378.m9037(AbstractC5041.m8557(cls2));
                c2470.m4633(clsM9039 != null ? clsM9039 : Object.class);
                Class<String> clsM90310 = AbstractC5378.m9037(AbstractC5041.m8557(String.class));
                c2470.m4633(clsM90310 != null ? clsM90310 : String.class);
                C2470.m4631(c2470, new C4441(new long[]{5006755233859151327L, 8184310888374467242L}).toString());
                Class<Boolean> clsM90311 = AbstractC5378.m9037(AbstractC5041.m8557(Boolean.class));
                c2470.m4633(clsM90311 != null ? clsM90311 : Boolean.class);
                return c2358;
            case 11:
                C0954 c0954 = (C0954) obj;
                c0954.getClass();
                C0322 c0322 = new C0322(i2, i3, c0954);
                try {
                    c4535 = c0954.m1971()[2];
                    if (c4535 == null) {
                        c4535 = null;
                    }
                } catch (Throwable th) {
                    c4535 = new C4535(th);
                }
                String str2 = (String) (c4535 instanceof C4535 ? null : c4535);
                if (str2 == null) {
                    str2 = "";
                }
                if (str2.equals(new C4441(new long[]{-7968176585102565244L, 4354304326549344307L, 4015142882246602086L, 2564118876561377273L, 3610862137737856094L}).toString())) {
                    c0322.m694();
                }
                return c2358;
            case 12:
                List list = (List) obj;
                return new C2384(((Integer) list.get(0)).intValue(), ((Float) list.get(1)).floatValue(), new C3940(0, list));
            case 13:
                AbstractC3992.m7136((InterfaceC1066) obj);
                return c2358;
            case 14:
                return AbstractC1650.m3461((String) obj);
            case 15:
                return AbstractC1650.m3464((Class) obj);
            case 16:
                return AbstractC1650.m3464((Class) obj);
            case 17:
                C0954 c0955 = (C0954) obj;
                Object objM1970 = c0955.m1970();
                if (!(objM1970 instanceof List)) {
                    objM1970 = null;
                }
                List list2 = (List) objM1970;
                if (list2 != null) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : list2) {
                        C3121 c3121M7164 = AbstractC4009.m7163(obj3);
                        c3121M7164.m5746();
                        C2244 c2244M5751 = c3121M7164.m5751();
                        c2244M5751.f9027 = new C4441(new long[]{-1848076496025385286L, 1165623231036955589L, 6163053155789989959L}).toString();
                        C3657 c3657 = (C3657) AbstractC0973.m2058(c2244M5751.m4293());
                        Object objM6534 = c3657 != null ? c3657.m6534(new Object[0]) : null;
                        if (objM6534 != null) {
                            C3121 c3121M7165 = AbstractC4009.m7163(objM6534);
                            c3121M7165.m5746();
                            C2244 c2244M5752 = c3121M7165.m5751();
                            c2244M5752.f9027 = new C4441(new long[]{-2266556479613932778L, 5528866262965765373L}).toString();
                            C3657 c3658 = (C3657) AbstractC0973.m2058(c2244M5752.m4293());
                            String str3 = c3658 != null ? (String) c3658.m6535(new Object[0]) : null;
                            if (str3 != null) {
                                zM1527 = AbstractC0684.m1527(str3, new C4441(new long[]{-1430519817631243050L, -8183259656162409603L}).toString(), false);
                            } else {
                                zM1527 = false;
                            }
                        } else {
                            zM1527 = false;
                        }
                        if (!zM1527) {
                            arrayList.add(obj3);
                        }
                    }
                    c0955.m1973(arrayList);
                }
                return c2358;
            case 18:
                ((C3751) obj).m6592(null);
                return c2358;
            case 19:
                C0637 c0638 = (C0637) obj;
                String string2 = new C4441(new long[]{9090992575325810053L, -5184134832320811407L, 4214650522543967321L}).toString();
                c0638.getClass();
                C0637.m1442(c0638, string2);
                return c2358;
            case 20:
                ((C3751) obj).m6591(new C3018(22));
                return c2358;
            case 21:
                C0637 c0639 = (C0637) obj;
                C3018 c3018 = new C3018(23);
                c0639.getClass();
                C5310 c5310 = new C5310();
                c3018.mo211(c5310);
                c0639.m1443(c5310);
                c0639.m1449(new C3018(24));
                return c2358;
            case 22:
                C0954 c0956 = (C0954) obj;
                c0956.getClass();
                new C0322(c0956.m1971().length - 1, i3, c0956).m694();
                return c2358;
            case 23:
                C5310 c5311 = (C5310) obj;
                String string3 = new C4441(new long[]{6583927680115345599L, 2125819777626531071L, 3753809857322383679L, -8569390241152638688L, 3212108803437879651L}).toString();
                c5311.getClass();
                C5310.m8924(c5311, string3);
                return c2358;
            case 24:
                C0637 c06310 = (C0637) obj;
                String string4 = new C4441(new long[]{3530497732837865193L, -1295188060117915554L, 5046041831517461040L}).toString();
                c06310.getClass();
                C0637.m1442(c06310, string4);
                return c2358;
            case 25:
                ((C3751) obj).m6592(c2340);
                return c2358;
            case 26:
                C0954 c0957 = (C0954) obj;
                c0957.getClass();
                new C0322(c0957.m1971().length - 1, i3, c0957).m684(3600000L);
                return c2358;
            case 27:
                ((C3751) obj).m6594();
                return c2358;
            case 28:
                return Boolean.TRUE;
            default:
                return c2358;
        }
    }
}
