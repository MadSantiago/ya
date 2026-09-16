package p000;

import android.content.Context;
import android.text.Layout;
import android.text.TextUtils;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: ۥؚّٕؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1414 implements InterfaceC4895, InterfaceC4655, InterfaceC5641 {

    /* JADX INFO: renamed from: ۥَ */
    public Object f4867;

    /* JADX INFO: renamed from: ۥْ */
    public Object f4868;

    /* JADX INFO: renamed from: ۥٓ */
    public Object f4869;

    /* JADX INFO: renamed from: ۥٖ */
    public Object f4870;

    /* JADX INFO: renamed from: ۦ۟ */
    public Object f4871;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f4872;

    public C1414(C1249 c1249, C3564 c3564, List list, InterfaceC2880 interfaceC2880, InterfaceC4434 interfaceC4434) {
        int i;
        C1249 c12410 = c1249;
        C3564 c3565 = c3564;
        this.f4872 = 5;
        this.f4871 = c12410;
        this.f4868 = list;
        final int i2 = 0;
        this.f4869 = AbstractC3933.m7095(3, new InterfaceC4448(this) { // from class: ۥٗؓؓؖ

            /* JADX INFO: renamed from: ۦ۟ */
            public final /* synthetic */ C1414 f5156;

            {
                this.f5156 = this;
            }

            @Override // p000.InterfaceC4448
            /* JADX INFO: renamed from: ۥۣ */
            public final Object mo449() {
                int i3 = i2;
                Object obj = null;
                int i4 = 1;
                C1414 c1414 = this.f5156;
                switch (i3) {
                    case 0:
                        ArrayList arrayList = (ArrayList) c1414.f4870;
                        if (!arrayList.isEmpty()) {
                            Object obj2 = arrayList.get(0);
                            float fMo2999 = ((C0425) obj2).f1539.mo2999();
                            int iM4181 = AbstractC2164.m4181(arrayList);
                            if (1 <= iM4181) {
                                while (true) {
                                    Object obj3 = arrayList.get(i4);
                                    float fMo29910 = ((C0425) obj3).f1539.mo2999();
                                    if (Float.compare(fMo2999, fMo29910) < 0) {
                                        obj2 = obj3;
                                        fMo2999 = fMo29910;
                                    }
                                    if (i4 != iM4181) {
                                        i4++;
                                    }
                                }
                            }
                            obj = obj2;
                        }
                        C0425 c0425 = (C0425) obj;
                        return Float.valueOf(c0425 != null ? c0425.f1539.mo2999() : 0.0f);
                    default:
                        ArrayList arrayList2 = (ArrayList) c1414.f4870;
                        if (!arrayList2.isEmpty()) {
                            Object obj4 = arrayList2.get(0);
                            float fM9537 = ((C0425) obj4).f1539.f18298.m9537();
                            int iM4182 = AbstractC2164.m4181(arrayList2);
                            if (1 <= iM4182) {
                                while (true) {
                                    Object obj5 = arrayList2.get(i4);
                                    float fM9538 = ((C0425) obj5).f1539.f18298.m9537();
                                    if (Float.compare(fM9537, fM9538) < 0) {
                                        obj4 = obj5;
                                        fM9537 = fM9538;
                                    }
                                    if (i4 != iM4182) {
                                        i4++;
                                    }
                                }
                            }
                            obj = obj4;
                        }
                        C0425 c0426 = (C0425) obj;
                        return Float.valueOf(c0426 != null ? c0426.f1539.f18298.m9537() : 0.0f);
                }
            }
        });
        final int i3 = 1;
        this.f4867 = AbstractC3933.m7095(3, new InterfaceC4448(this) { // from class: ۥٗؓؓؖ

            /* JADX INFO: renamed from: ۦ۟ */
            public final /* synthetic */ C1414 f5156;

            {
                this.f5156 = this;
            }

            @Override // p000.InterfaceC4448
            /* JADX INFO: renamed from: ۥۣ */
            public final Object mo449() {
                int i4 = i3;
                Object obj = null;
                int i5 = 1;
                C1414 c1414 = this.f5156;
                switch (i4) {
                    case 0:
                        ArrayList arrayList = (ArrayList) c1414.f4870;
                        if (!arrayList.isEmpty()) {
                            Object obj2 = arrayList.get(0);
                            float fMo2999 = ((C0425) obj2).f1539.mo2999();
                            int iM4181 = AbstractC2164.m4181(arrayList);
                            if (1 <= iM4181) {
                                while (true) {
                                    Object obj3 = arrayList.get(i5);
                                    float fMo29910 = ((C0425) obj3).f1539.mo2999();
                                    if (Float.compare(fMo2999, fMo29910) < 0) {
                                        obj2 = obj3;
                                        fMo2999 = fMo29910;
                                    }
                                    if (i5 != iM4181) {
                                        i5++;
                                    }
                                }
                            }
                            obj = obj2;
                        }
                        C0425 c0425 = (C0425) obj;
                        return Float.valueOf(c0425 != null ? c0425.f1539.mo2999() : 0.0f);
                    default:
                        ArrayList arrayList2 = (ArrayList) c1414.f4870;
                        if (!arrayList2.isEmpty()) {
                            Object obj4 = arrayList2.get(0);
                            float fM9537 = ((C0425) obj4).f1539.f18298.m9537();
                            int iM4182 = AbstractC2164.m4181(arrayList2);
                            if (1 <= iM4182) {
                                while (true) {
                                    Object obj5 = arrayList2.get(i5);
                                    float fM9538 = ((C0425) obj5).f1539.f18298.m9537();
                                    if (Float.compare(fM9537, fM9538) < 0) {
                                        obj4 = obj5;
                                        fM9537 = fM9538;
                                    }
                                    if (i5 != iM4182) {
                                        i5++;
                                    }
                                }
                            }
                            obj = obj4;
                        }
                        C0425 c0426 = (C0425) obj;
                        return Float.valueOf(c0426 != null ? c0426.f1539.f18298.m9537() : 0.0f);
                }
            }
        });
        C0477 c0477 = c3565.f11802;
        C1249 c12411 = AbstractC5556.f18338;
        ArrayList arrayList = c12410.f4306;
        String str = c12410.f4307;
        C2340 c2340 = C2340.f7777;
        List listM2055 = arrayList != null ? AbstractC0973.m2055(arrayList, new C1206(6)) : c2340;
        ArrayList arrayList2 = new ArrayList();
        C5219 c5219 = new C5219();
        int size = listM2055.size();
        int i4 = 0;
        int i5 = 0;
        while (i4 < size) {
            C2331 c2331 = (C2331) listM2055.get(i4);
            C2331 c2331M4373 = C2331.m4373(c2331, c0477.m1026((C0477) c2331.f7719), i2, 14);
            Object obj = c2331M4373.f7719;
            int i6 = c2331M4373.f7717;
            int i7 = c2331M4373.f7718;
            while (i5 < i7 && !c5219.isEmpty()) {
                C2331 c2332 = (C2331) c5219.last();
                listM2055 = listM2055;
                int i8 = c2332.f7717;
                c2340 = c2340;
                Object obj2 = c2332.f7719;
                if (i7 < i8) {
                    arrayList2.add(new C2331(i5, i7, obj2));
                    i5 = i7;
                } else {
                    int i9 = size;
                    arrayList2.add(new C2331(i5, i8, obj2));
                    i5 = c2332.f7717;
                    while (!c5219.isEmpty() && i5 == ((C2331) c5219.last()).f7717) {
                        c5219.removeLast();
                    }
                    size = i9;
                }
            }
            List list2 = listM2055;
            C2340 c2341 = c2340;
            int i10 = size;
            if (i5 < i7) {
                arrayList2.add(new C2331(i5, i7, c0477));
                i5 = i7;
            }
            C2331 c2333 = (C2331) c5219.m8841();
            if (c2333 != null) {
                int i11 = c2333.f7717;
                Object obj3 = c2333.f7719;
                int i12 = c2333.f7718;
                if (i12 == i7 && i11 == i6) {
                    c5219.removeLast();
                    c5219.addLast(new C2331(i7, i6, ((C0477) obj3).m1026((C0477) obj)));
                } else if (i12 == i11) {
                    arrayList2.add(new C2331(i12, i11, obj3));
                    c5219.removeLast();
                    c5219.addLast(new C2331(i7, i6, obj));
                } else {
                    if (i11 < i6) {
                        C0178.m393();
                        throw null;
                    }
                    c5219.addLast(new C2331(i7, i6, ((C0477) obj3).m1026((C0477) obj)));
                }
            } else {
                c5219.addLast(new C2331(i7, i6, obj));
            }
            i4++;
            listM2055 = list2;
            c2340 = c2341;
            size = i10;
            i2 = 0;
        }
        C2340 c2342 = c2340;
        while (i5 <= str.length() && !c5219.isEmpty()) {
            C2331 c2334 = (C2331) c5219.last();
            Object obj4 = c2334.f7719;
            int i13 = c2334.f7717;
            arrayList2.add(new C2331(i5, i13, obj4));
            while (!c5219.isEmpty() && i13 == ((C2331) c5219.last()).f7717) {
                c5219.removeLast();
            }
            i5 = i13;
        }
        if (i5 < str.length()) {
            arrayList2.add(new C2331(i5, str.length(), c0477));
        }
        if (arrayList2.isEmpty()) {
            i = 0;
            arrayList2.add(new C2331(0, 0, c0477));
        } else {
            i = 0;
        }
        ArrayList arrayList3 = new ArrayList(arrayList2.size());
        int i14 = i;
        for (int size2 = arrayList2.size(); i14 < size2; size2 = size2) {
            C2331 c2335 = (C2331) arrayList2.get(i14);
            int i15 = c2335.f7718;
            int i16 = c2335.f7717;
            String strSubstring = i15 != i16 ? str.substring(i15, i16) : "";
            List listM9311 = AbstractC5556.m9311(c12410, i15, i16, new C0086(2));
            C1249 c12412 = new C1249(strSubstring, listM9311 == null ? c2342 : listM9311);
            C0477 c0478 = (C0477) c2335.f7719;
            if (c0478.f1734 == 0) {
                c0478 = new C0477(c0478.f1736, c0477.f1734, c0478.f1731, c0478.f1737, c0478.f1732, c0478.f1733, c0478.f1739, c0478.f1735, c0478.f1738);
            }
            C3564 c3566 = new C3564(c3565.f11803, c0477.m1026(c0478));
            List list3 = c12412.f4308;
            List list4 = list3 == null ? c2342 : list3;
            List list5 = (List) this.f4868;
            ArrayList arrayList4 = new ArrayList(list5.size());
            int size3 = list5.size();
            int i17 = 0;
            while (i17 < size3) {
                C2331 c2336 = (C2331) list5.get(i17);
                int i18 = c2336.f7718;
                C0477 c0479 = c0477;
                int i19 = c2336.f7717;
                if (AbstractC5556.m9310(i15, i16, i18, i19)) {
                    if (i15 > i18 || i19 > i16) {
                        AbstractC3767.m6644("placeholder can not overlap with paragraph.");
                    }
                    arrayList4.add(new C2331(i18 - i15, i19 - i15, c2336.f7719));
                }
                i17++;
                list5 = list5;
                c0477 = c0479;
            }
            arrayList3.add(new C0425(new C5541(strSubstring, c3566, list4, arrayList4, interfaceC4434, interfaceC2880), i15, i16));
            i14++;
            c12410 = c1249;
            c3565 = c3564;
            str = str;
        }
        this.f4870 = arrayList3;
    }

    @Override // p000.InterfaceC4895
    public Object get() {
        switch (this.f4872) {
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                return new C1934((Executor) ((InterfaceC4895) this.f4871).get(), (C0567) ((InterfaceC4895) this.f4868).get(), (C2808) ((C2808) this.f4869).get(), (C1835) ((InterfaceC4895) this.f4867).get(), (C1835) ((InterfaceC4895) this.f4870).get());
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                return new C5669((C3729) ((InterfaceC5641) this.f4871).get(), (InterfaceC2361) ((InterfaceC5641) this.f4868).get(), (C5899) ((InterfaceC5641) this.f4869).get(), (C1769) ((InterfaceC5641) this.f4867).get(), (C4589) ((InterfaceC5641) this.f4870).get());
            default:
                return new C3086((C0377) ((C3121) this.f4871).f10451, (InterfaceC2361) ((InterfaceC5641) this.f4868).get(), (C1802) ((InterfaceC5641) this.f4869).get(), (C2352) ((InterfaceC5641) this.f4867).get(), (InterfaceC3534) ((InterfaceC5641) this.f4870).get());
        }
    }

    /* JADX INFO: renamed from: ۥؓ */
    public void m2985(Throwable th) {
        ((C2263) this.f4870).mo219(th, Boolean.TRUE);
    }

    /* JADX INFO: renamed from: ۥؖ */
    public void m2986(Object obj, String str) {
        ((LinkedHashMap) this.f4871).put(str, obj);
        C4994 c4994 = (C4994) ((LinkedHashMap) this.f4869).get(str);
        if (c4994 != null) {
            c4994.m8387(obj);
        }
        C4994 c4995 = (C4994) ((LinkedHashMap) this.f4867).get(str);
        if (c4995 != null) {
            c4995.m8387(obj);
        }
    }

    @Override // p000.InterfaceC4655
    /* JADX INFO: renamed from: ۥؗ */
    public float mo2987() {
        return ((Number) ((InterfaceC5130) this.f4867).getValue()).floatValue();
    }

    /* JADX INFO: renamed from: ۥً */
    public void m2988(Class cls, Object obj) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f4870;
        if (obj == null) {
            linkedHashMap.remove(cls);
            return;
        }
        if (linkedHashMap.isEmpty()) {
            this.f4870 = new LinkedHashMap();
        }
        ((LinkedHashMap) this.f4870).put(cls, cls.cast(obj));
    }

    /* JADX INFO: renamed from: ۥَ */
    public int m2989(int i, int i2) {
        while (i > i2) {
            char cCharAt = ((Layout) this.f4871).getText().charAt(i - 1);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != 5760 && ((AbstractC3831.m6879(cCharAt, 8192) < 0 || AbstractC3831.m6879(cCharAt, 8202) > 0 || cCharAt == 8199) && cCharAt != 8287 && cCharAt != 12288)) {
                return i;
            }
            i--;
        }
        return i;
    }

    /* JADX INFO: renamed from: ۥُ */
    public void m2990(InterfaceC5349 interfaceC5349, Class cls) {
        ((ArrayList) this.f4867).add(new C3869(interfaceC5349, cls));
    }

    /* JADX INFO: renamed from: ۥّ */
    public InterfaceC1663 m2991(AbstractC1182 abstractC1182, InterfaceC4448 interfaceC4448) {
        int i;
        int i2;
        int i3;
        C4763 c4763 = new C4763();
        c4763.f15714 = -1;
        synchronized (this.f4871) {
            Throwable th = (Throwable) this.f4868;
            if (th != null) {
                abstractC1182.mo2503(th);
                return C0373.f1365;
            }
            C5592 c5592 = (C5592) this.f4869;
            do {
                i = c5592.get();
                i2 = i + 1;
            } while (!c5592.compareAndSet(i, i2));
            int i4 = 0;
            boolean z = (134217727 & i2) == 1;
            c4763.f15714 = (i2 >>> 27) & 15;
            ((C2730) this.f4867).m5079(abstractC1182);
            if (z) {
                try {
                    interfaceC4448.mo449();
                } catch (Throwable th2) {
                    synchronized (this.f4871) {
                        try {
                            if (((Throwable) this.f4868) == null) {
                                this.f4868 = th2;
                                C2730 c2730 = (C2730) this.f4867;
                                Object[] objArr = c2730.f9041;
                                int i5 = c2730.f9040;
                                for (int i6 = 0; i6 < i5; i6++) {
                                    ((AbstractC1182) objArr[i6]).mo2503(th2);
                                }
                                ((C2730) this.f4867).m5080();
                                C5592 c5593 = (C5592) this.f4869;
                                do {
                                    i3 = c5593.get();
                                } while (!c5593.compareAndSet(i3, ((((i3 >>> 27) & 15) + 1) & 15) << 27));
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
            }
            return new C3369(new C1597(abstractC1182, this, c4763, i4));
        }
    }

    /* JADX INFO: renamed from: ۥْ */
    public int m2992(int i) {
        if (i == 0) {
            return 0;
        }
        return ((Number) ((ArrayList) this.f4868).get(i - 1)).intValue();
    }

    /* JADX INFO: renamed from: ۥٓ */
    public void m2993(String str, String str2) {
        ((C5086) this.f4869).m8695(str, str2);
    }

    /* JADX INFO: renamed from: ۥٖ */
    public void m2994(List list) {
        Object next;
        LinkedHashSet<C0287> linkedHashSet = new LinkedHashSet();
        C5219 c5219 = new C5219(new C5076(list));
        while (!c5219.isEmpty()) {
            C0287 c0287 = (C0287) c5219.removeLast();
            if (linkedHashSet.add(c0287)) {
                Iterator it = new C5736(c0287.f1066).iterator();
                while (true) {
                    ListIterator listIterator = (ListIterator) ((C2158) it).f7121;
                    if (listIterator.hasPrevious()) {
                        C0287 c0288 = (C0287) listIterator.previous();
                        if (!linkedHashSet.contains(c0288)) {
                            c5219.addLast(c0288);
                        }
                    }
                }
            }
        }
        C2808 c2808 = (C2808) this.f4867;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) c2808.f9377;
        for (C0287 c0289 : linkedHashSet) {
            for (Map.Entry entry : c0289.f1065.entrySet()) {
                String str = (String) entry.getKey();
                AbstractC4766 abstractC4766 = (AbstractC4766) entry.getValue();
                C0114 c0114 = abstractC4766.f15717;
                C1414 c1414 = (C1414) c2808.f9378;
                ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) c2808.f9376;
                if (((AbstractC4766) concurrentHashMap2.get(str)) != null) {
                    c0114.toString();
                    AbstractC3761.m6627(5, 3);
                    Iterator it2 = concurrentHashMap.values().iterator();
                    do {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                    } while (!((C2301) next).f15717.equals(c0114));
                    if (((C2301) next) != null) {
                        concurrentHashMap.remove(Integer.valueOf(c0114.hashCode()));
                    }
                }
                ((C3223) c1414.f4871).m5948("(+) index '" + str + "' -> '" + c0114 + '\'');
                concurrentHashMap2.put(str, abstractC4766);
            }
            for (C2301 c2301 : c0289.f1067) {
                concurrentHashMap.put(Integer.valueOf(c2301.f15717.hashCode()), c2301);
            }
        }
        C1489 c1489 = (C1489) this.f4869;
        c1489.getClass();
        Iterator it3 = linkedHashSet.iterator();
        while (it3.hasNext()) {
            ((Set) c1489.f5057).addAll(((C0287) it3.next()).f1069);
        }
    }

    /* JADX INFO: renamed from: ۥٙ */
    public void m2995(C2937 c2937, InterfaceC4070 interfaceC4070) {
        C4046 c4046 = (C4046) this.f4870;
        C1360 c1360 = (C1360) this.f4871;
        String str = (String) this.f4868;
        InterfaceC2456 interfaceC2456 = (InterfaceC2456) this.f4867;
        if (interfaceC2456 == null) {
            C0178.m387("Null transformer");
            return;
        }
        C1329 c1329 = (C1329) this.f4869;
        C1934 c1934 = c4046.f13488;
        C1360 c1360M2866 = c1360.m2866(c2937.f9869);
        C2457 c2457 = new C2457();
        c2457.f8208 = new HashMap();
        c2457.f8210 = Long.valueOf(c4046.f13490.mo7674());
        c2457.f8204 = Long.valueOf(c4046.f13489.mo7674());
        c2457.f8203 = str;
        c2457.f8202 = new C1273(c1329, (byte[]) interfaceC2456.apply(c2937.f9870));
        c2457.f8206 = null;
        c1934.f6394.execute(new RunnableC3679(c1934, c1360M2866, interfaceC4070, c2457.m4587(), 0));
    }

    /* JADX INFO: renamed from: ۥۖ */
    public InterfaceC2003 m2996(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        List list = (List) this.f4867;
        int iIndexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i = iIndexOf; i < size; i++) {
            InterfaceC2003 interfaceC2003Mo1241 = ((AbstractC5084) list.get(i)).mo1241(type);
            if (interfaceC2003Mo1241 != null) {
                return interfaceC2003Mo1241;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate RequestBody converter for ");
        sb.append(type);
        sb.append(".\n  Tried:");
        int size2 = list.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(((AbstractC5084) list.get(iIndexOf)).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // p000.InterfaceC4655
    /* JADX INFO: renamed from: ۥۗ */
    public boolean mo2997() {
        ArrayList arrayList = (ArrayList) this.f4870;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((C0425) arrayList.get(i)).f1539.mo2997()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۜ */
    public C2813 m2998() {
        C0774 c0774 = (C0774) this.f4871;
        if (c0774 == null) {
            C1078.m2276("url == null");
            return null;
        }
        String str = (String) this.f4868;
        C4714 c4714M8701 = ((C5086) this.f4869).m8701();
        AbstractC2577 abstractC2577 = (AbstractC2577) this.f4867;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f4870;
        byte[] bArr = AbstractC4031.f13451;
        return new C2813(c0774, str, c4714M8701, abstractC2577, linkedHashMap.isEmpty() ? C0204.f751 : Collections.unmodifiableMap(new LinkedHashMap(linkedHashMap)));
    }

    @Override // p000.InterfaceC4655
    /* JADX INFO: renamed from: ۥۣ */
    public float mo2999() {
        return ((Number) ((InterfaceC5130) this.f4869).getValue()).floatValue();
    }

    /* JADX INFO: renamed from: ۥۧ */
    public void m3000(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        List list = (List) this.f4867;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC5084) list.get(i)).getClass();
        }
    }

    /* JADX INFO: renamed from: ۦؑ */
    public void m3001(C1227 c1227, Class cls) {
        ((ArrayList) this.f4868).add(new C3869(c1227, cls));
    }

    /* JADX INFO: renamed from: ۦؚ */
    public void m3002(InterfaceC4745 interfaceC4745) {
        int i;
        synchronized (this.f4871) {
            try {
                C2730 c2730 = (C2730) this.f4867;
                this.f4867 = (C2730) this.f4870;
                this.f4870 = c2730;
                C5592 c5592 = (C5592) this.f4869;
                do {
                    i = c5592.get();
                } while (!c5592.compareAndSet(i, ((((i >>> 27) & 15) + 1) & 15) << 27));
                int i2 = c2730.f9040;
                for (int i3 = 0; i3 < i2; i3++) {
                    interfaceC4745.mo211(c2730.m5076(i3));
                }
                c2730.m5080();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۦٌ */
    public Object[] m3003() {
        return (Object[]) ((C0514) this.f4869).mo449();
    }

    /* JADX INFO: renamed from: ۦِ */
    public InterfaceC2387 m3004(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        List list = (List) this.f4870;
        int iIndexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i = iIndexOf; i < size; i++) {
            InterfaceC2387 interfaceC2387Mo3798 = ((AbstractC2329) list.get(i)).mo3798(type, annotationArr);
            if (interfaceC2387Mo3798 != null) {
                return interfaceC2387Mo3798;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate call adapter for ");
        sb.append(type);
        sb.append(".\n  Tried:");
        int size2 = list.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(((AbstractC2329) list.get(iIndexOf)).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX INFO: renamed from: ۦٕ */
    public InterfaceC2003 m3005(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        List list = (List) this.f4867;
        int iIndexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i = iIndexOf; i < size; i++) {
            InterfaceC2003 interfaceC2003Mo1240 = ((AbstractC5084) list.get(i)).mo1240(type, annotationArr, this);
            if (interfaceC2003Mo1240 != null) {
                return interfaceC2003Mo1240;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate ResponseBody converter for ");
        sb.append(type);
        sb.append(".\n  Tried:");
        int size2 = list.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(((AbstractC5084) list.get(iIndexOf)).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX INFO: renamed from: ۦٗ */
    public void m3006(String str, AbstractC2577 abstractC2577) {
        if (str.length() <= 0) {
            C1078.m2272("method.isEmpty() == true");
            return;
        }
        if (abstractC2577 == null) {
            if (str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT")) {
                C1078.m2273(AbstractC3761.m6629("method ", str, " must have a request body."));
                return;
            }
        } else if (!AbstractC1605.m3335(str)) {
            C1078.m2273(AbstractC3761.m6629("method ", str, " must not have a request body."));
            return;
        }
        this.f4868 = str;
        this.f4867 = abstractC2577;
    }

    /* JADX INFO: renamed from: ۦٛ */
    public void m3007(C1035 c1035) {
        String string = c1035.toString();
        int length = string.length();
        C5086 c5086 = (C5086) this.f4869;
        if (length == 0) {
            c5086.m8689("Cache-Control");
        } else {
            c5086.m8695("Cache-Control", string);
        }
    }

    /* JADX INFO: renamed from: ۦۗ */
    public void m3008() {
        C3223 c3223 = (C3223) this.f4871;
        c3223.m5948("Create eager instances ...");
        long jM2659 = AbstractC1266.m2659();
        C2808 c2808 = (C2808) this.f4867;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) c2808.f9377;
        C2301[] c2301Arr = (C2301[]) concurrentHashMap.values().toArray(new C2301[0]);
        ArrayList arrayListM4212 = AbstractC2164.m4212(Arrays.copyOf(c2301Arr, c2301Arr.length));
        concurrentHashMap.clear();
        C1414 c1414 = (C1414) c2808.f9378;
        C1414 c1415 = new C1414((C3223) c1414.f4871, (C2354) ((C1489) c1414.f4869).f5056, AbstractC5041.m8557(AbstractC4225.class), (InterfaceC1796) null, (C0735) null);
        Iterator it = arrayListM4212.iterator();
        while (it.hasNext()) {
            ((C2301) it.next()).mo4355(c1415);
        }
        c3223.m5948("Created eager instances in " + (C5805.m9621(AbstractC1232.m2597(jM2659), EnumC3021.MICROSECONDS) / 1000.0d) + " ms");
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0076  */
    /* JADX INFO: renamed from: ۦۙ */
    public Bidi m3009(int i) {
        Bidi bidi;
        Layout layout = (Layout) this.f4871;
        ArrayList arrayList = (ArrayList) this.f4868;
        ArrayList arrayList2 = (ArrayList) this.f4869;
        boolean[] zArr = (boolean[]) this.f4867;
        if (zArr[i]) {
            return (Bidi) arrayList2.get(i);
        }
        int iIntValue = i == 0 ? 0 : ((Number) arrayList.get(i - 1)).intValue();
        int iIntValue2 = ((Number) arrayList.get(i)).intValue();
        int i2 = iIntValue2 - iIntValue;
        char[] cArr = (char[]) this.f4870;
        if (cArr == null || cArr.length < i2) {
            cArr = new char[i2];
        }
        char[] cArr2 = cArr;
        TextUtils.getChars(layout.getText(), iIntValue, iIntValue2, cArr2, 0);
        if (Bidi.requiresBidi(cArr2, 0, i2)) {
            bidi = new Bidi(cArr2, 0, null, 0, i2, layout.getParagraphDirection(layout.getLineForOffset(m2992(i))) == -1 ? 1 : 0);
            if (bidi.getRunCount() == 1) {
                bidi = null;
            }
        } else {
            bidi = null;
        }
        arrayList2.set(i, bidi);
        zArr[i] = true;
        if (bidi != null) {
            char[] cArr3 = (char[]) this.f4870;
            cArr2 = cArr2 == cArr3 ? null : cArr3;
        }
        this.f4870 = cArr2;
        return bidi;
    }

    /* JADX INFO: renamed from: ۦۚ */
    public float m3010(int i, boolean z) {
        Layout layout = (Layout) this.f4871;
        int lineEnd = layout.getLineEnd(layout.getLineForOffset(i));
        if (i > lineEnd) {
            i = lineEnd;
        }
        return z ? layout.getPrimaryHorizontal(i) : layout.getSecondaryHorizontal(i);
    }

    /* JADX INFO: renamed from: ۦۛ */
    public void m3011(String str) {
        ((C5086) this.f4869).m8689(str);
    }

    /* JADX INFO: renamed from: ۦ۟ */
    public int m3012(int i, boolean z) {
        ArrayList arrayList = (ArrayList) this.f4868;
        int iM4186 = AbstractC2164.m4186(arrayList, Integer.valueOf(i));
        int i2 = iM4186 < 0 ? -(iM4186 + 1) : iM4186 + 1;
        if (z && i2 > 0) {
            int i3 = i2 - 1;
            if (i == ((Number) arrayList.get(i3)).intValue()) {
                return i3;
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: ۦۨ */
    public float m3013(int i, boolean z, boolean z2) {
        int i2;
        int i3;
        Layout layout = (Layout) this.f4871;
        if (!z2) {
            return m3010(i, z);
        }
        int iM4831 = AbstractC2552.m4831(layout, i, z2);
        int lineStart = layout.getLineStart(iM4831);
        int lineEnd = layout.getLineEnd(iM4831);
        if (i != lineStart && i != lineEnd) {
            return m3010(i, z);
        }
        if (i == 0 || i == layout.getText().length()) {
            return m3010(i, z);
        }
        int iM3012 = m3012(i, z2);
        boolean z3 = layout.getParagraphDirection(layout.getLineForOffset(m2992(iM3012))) == -1;
        int iM2989 = m2989(lineEnd, lineStart);
        int iM2992 = m2992(iM3012);
        int i4 = lineStart - iM2992;
        int i5 = iM2989 - iM2992;
        Bidi bidiM3009 = m3009(iM3012);
        Bidi bidiCreateLineBidi = bidiM3009 != null ? bidiM3009.createLineBidi(i4, i5) : null;
        if (bidiCreateLineBidi == null || bidiCreateLineBidi.getRunCount() == 1) {
            boolean zIsRtlCharAt = layout.isRtlCharAt(lineStart);
            if (z || z3 == zIsRtlCharAt) {
                z3 = !z3;
            }
            return i == lineStart ? z3 : !z3 ? layout.getLineLeft(iM4831) : layout.getLineRight(iM4831);
        }
        int runCount = bidiCreateLineBidi.getRunCount();
        C1997[] c1997Arr = new C1997[runCount];
        for (int i6 = 0; i6 < runCount; i6++) {
            c1997Arr[i6] = new C1997(bidiCreateLineBidi.getRunStart(i6) + lineStart, bidiCreateLineBidi.getRunLimit(i6) + lineStart, bidiCreateLineBidi.getRunLevel(i6) % 2 == 1);
        }
        int runCount2 = bidiCreateLineBidi.getRunCount();
        byte[] bArr = new byte[runCount2];
        for (int i7 = 0; i7 < runCount2; i7++) {
            bArr[i7] = (byte) bidiCreateLineBidi.getRunLevel(i7);
        }
        Bidi.reorderVisually(bArr, 0, c1997Arr, 0, runCount);
        if (i == lineStart) {
            int i8 = 0;
            while (true) {
                if (i8 >= runCount) {
                    i3 = -1;
                    break;
                }
                if (c1997Arr[i8].f6582 == i) {
                    i3 = i8;
                    break;
                }
                i8++;
            }
            boolean z4 = (z || z3 == c1997Arr[i3].f6580) ? !z3 : z3;
            if (i3 == 0 && z4) {
                return layout.getLineLeft(iM4831);
            }
            if (i3 != runCount - 1 || z4) {
                return z4 ? layout.getPrimaryHorizontal(c1997Arr[i3 - 1].f6582) : layout.getPrimaryHorizontal(c1997Arr[i3 + 1].f6582);
            }
            return layout.getLineRight(iM4831);
        }
        int iM29810 = i > iM2989 ? m2989(i, lineStart) : i;
        int i9 = 0;
        while (true) {
            if (i9 >= runCount) {
                i2 = -1;
                break;
            }
            if (c1997Arr[i9].f6581 == iM29810) {
                i2 = i9;
                break;
            }
            i9++;
        }
        boolean z5 = (z || z3 == c1997Arr[i2].f6580) ? z3 : !z3;
        if (i2 == 0 && z5) {
            return layout.getLineLeft(iM4831);
        }
        if (i2 != runCount - 1 || z5) {
            return z5 ? layout.getPrimaryHorizontal(c1997Arr[i2 - 1].f6581) : layout.getPrimaryHorizontal(c1997Arr[i2 + 1].f6581);
        }
        return layout.getLineRight(iM4831);
    }

    public /* synthetic */ C1414(boolean z) {
        this.f4872 = 7;
    }

    public C1414(Map map) {
        this.f4872 = 10;
        this.f4871 = new LinkedHashMap(map);
        this.f4868 = new LinkedHashMap();
        this.f4869 = new LinkedHashMap();
        this.f4867 = new LinkedHashMap();
        this.f4870 = new C5444(4, this);
    }

    public C1414(C3223 c3223, C2354 c2354, C3131 c3131, InterfaceC1796 interfaceC1796, C0735 c0735) {
        this.f4872 = 8;
        this.f4871 = c3223;
        this.f4868 = c2354;
        this.f4869 = c3131;
        this.f4867 = interfaceC1796;
        this.f4870 = c0735;
        AbstractC2919.m5505(c3131);
        Objects.toString(interfaceC1796);
    }

    public C1414(Context context, C1489 c1489) {
        this.f4872 = 12;
        C0330 c0330 = new C0330(context.getApplicationContext(), c1489, 0);
        C0330 c0331 = new C0330(context.getApplicationContext(), c1489, 1);
        Context applicationContext = context.getApplicationContext();
        String str = AbstractC5798.f19107;
        C3239 c3239 = new C3239(applicationContext, c1489);
        C0330 c0332 = new C0330(context.getApplicationContext(), c1489, 2);
        this.f4871 = context;
        this.f4868 = c0330;
        this.f4869 = c0331;
        this.f4867 = c3239;
        this.f4870 = c0332;
    }

    public C1414(int i) {
        this.f4872 = i;
        switch (i) {
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                this.f4871 = new C3223(7);
                this.f4868 = new C5002(this);
                this.f4869 = new C1489(this);
                this.f4867 = new C2808(this);
                new ConcurrentHashMap();
                new HashMap();
                this.f4870 = new C5008(2);
                break;
            case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                this.f4870 = new LinkedHashMap();
                this.f4868 = "GET";
                this.f4869 = new C5086(24);
                break;
            default:
                this.f4871 = new Object();
                this.f4869 = new C5592(0);
                this.f4867 = new C2730();
                this.f4870 = new C2730();
                break;
        }
    }

    public C1414(Layout layout) {
        this.f4872 = 4;
        this.f4871 = layout;
        ArrayList arrayList = new ArrayList();
        int length = 0;
        do {
            int iM1521 = AbstractC0684.m1521('\n', length, 4, ((Layout) this.f4871).getText());
            length = iM1521 < 0 ? ((Layout) this.f4871).getText().length() : iM1521 + 1;
            arrayList.add(Integer.valueOf(length));
        } while (length < ((Layout) this.f4871).getText().length());
        this.f4868 = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList2.add(null);
        }
        this.f4869 = arrayList2;
        this.f4867 = new boolean[((ArrayList) this.f4868).size()];
        ((ArrayList) this.f4868).size();
    }

    public /* synthetic */ C1414(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.f4872 = i;
        this.f4871 = obj;
        this.f4868 = obj2;
        this.f4869 = obj3;
        this.f4867 = obj4;
        this.f4870 = obj5;
    }

    public C1414(C2561 c2561, C0774 c0774, List list, List list2) {
        this.f4872 = 9;
        this.f4871 = new ConcurrentHashMap();
        this.f4868 = c2561;
        this.f4869 = c0774;
        this.f4867 = list;
        this.f4870 = list2;
    }

    public C1414(C0117 c0117) {
        this.f4872 = 1;
        this.f4871 = new ArrayList(c0117.f467);
        this.f4868 = new ArrayList(c0117.f466);
        this.f4869 = new ArrayList(c0117.f464);
        this.f4867 = new ArrayList(c0117.f468);
        this.f4870 = new ArrayList(c0117.f465);
    }
}
