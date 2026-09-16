package p000;

import java.lang.reflect.Proxy;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: ۥًٍٝؔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1880 {

    /* JADX INFO: renamed from: ۥۗ */
    public final C4994 f6235 = AbstractC1605.m3349(new C3584(false, new C3103(new C4441(new long[]{1199977602925463339L}).toString(), new C4441(new long[]{-3944591278197594418L}).toString(), new C4441(new long[]{-1943792417097318741L}).toString(), -1)));

    /* JADX INFO: renamed from: ۥۣ */
    public String f6236;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: ۥۣ */
    public final Object m3739(AbstractC0772 abstractC0772) {
        C3118 c3118;
        C2670 c2670;
        C4994 c4994;
        Object value;
        if (abstractC0772 instanceof C3118) {
            c3118 = (C3118) abstractC0772;
            int i = c3118.f10447;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3118.f10447 = i - Integer.MIN_VALUE;
            } else {
                c3118 = new C3118(this, abstractC0772);
            }
        } else {
            c3118 = new C3118(this, abstractC0772);
        }
        Object objM300 = c3118.f10446;
        int i2 = c3118.f10447;
        int i3 = 7;
        int i4 = 0;
        if (i2 == 0) {
            AbstractC0186.m409(objM300);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            String string = new C4441(new long[]{1791346683140332412L, 8798334052965540841L, 6277553480246759936L, 3485785980214833847L}).toString();
            C3303 c3303 = new C3303();
            c3303.m6062(null, string);
            C0774 c0774M6064 = c3303.m6064();
            ArrayList arrayList3 = c0774M6064.f2797;
            if (!"".equals(arrayList3.get(arrayList3.size() - 1))) {
                C0178.m385(c0774M6064, "baseUrl must end in /: ");
                return null;
            }
            C0971 c0971 = C0971.f3428;
            Pattern pattern = C0822.f2914;
            arrayList.add(new C2815(AbstractC5378.m9040(new C4441(new long[]{-8569223227684425211L, -5581534207710447532L, 4633967247570590538L, -2794600842745387795L, -6152352520338218087L}).toString()), new C1039(i3, c0971)));
            C2561 c2561 = new C2561();
            ExecutorC5176 executorC5176 = AbstractC4057.f13518;
            C1298 c1298 = AbstractC4057.f13516;
            ArrayList arrayList4 = new ArrayList(arrayList2);
            List listMo2759 = c1298.mo2759(executorC5176);
            arrayList4.addAll(listMo2759);
            List listMo2762 = c1298.mo2762();
            ArrayList arrayList5 = new ArrayList(arrayList.size() + 1 + listMo2762.size());
            arrayList5.add(new C0551(i4));
            arrayList5.addAll(arrayList);
            arrayList5.addAll(listMo2762);
            List listUnmodifiableList = Collections.unmodifiableList(arrayList5);
            List listUnmodifiableList2 = Collections.unmodifiableList(arrayList4);
            listMo2759.size();
            C1414 c1414 = new C1414(c2561, c0774M6064, listUnmodifiableList, listUnmodifiableList2);
            Class<InterfaceC0135> clsM9037 = AbstractC5378.m9037(AbstractC5041.m8557(InterfaceC0135.class));
            Class cls = clsM9037 != null ? clsM9037 : InterfaceC0135.class;
            if (!cls.isInterface()) {
                C1078.m2272("API declarations must be interfaces.");
                return null;
            }
            ArrayDeque arrayDeque = new ArrayDeque(1);
            arrayDeque.add(cls);
            while (!arrayDeque.isEmpty()) {
                Class<InterfaceC0135> cls2 = (Class) arrayDeque.removeFirst();
                if (cls2.getTypeParameters().length != 0) {
                    StringBuilder sb = new StringBuilder("Type parameters are unsupported on ");
                    sb.append(cls2.getName());
                    if (cls2 != cls) {
                        sb.append(" which is an interface of ");
                        sb.append(cls.getName());
                    }
                    throw new IllegalArgumentException(sb.toString());
                }
                Collections.addAll(arrayDeque, cls2.getInterfaces());
            }
            InterfaceC0135 interfaceC0135 = (InterfaceC0135) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new C2655(c1414, cls));
            c3118.f10447 = 1;
            objM300 = interfaceC0135.m300(c3118);
            EnumC2282 enumC2282 = EnumC2282.f7590;
            if (objM300 == enumC2282) {
                return enumC2282;
            }
        } else {
            if (i2 != 1) {
                C0178.m389(new C4441(new long[]{-8689581506528888200L, 7262465117971756737L, -7877596691777881729L, 7129938060712733734L, 5826685312285242401L, 9138012098947372505L, 3648360278783896977L}));
                return null;
            }
            AbstractC0186.m409(objM300);
        }
        C4633 c4633 = (C4633) objM300;
        if (!c4633.f15293.m4177()) {
            c4633 = null;
        }
        if (c4633 == null || (c2670 = (C2670) c4633.f15292) == null) {
            return null;
        }
        String str = ((C5032) c2670.f8846.get(0)).f16660;
        String str2 = c2670.f8849;
        String str3 = c2670.f8847;
        C3103 c3103 = new C3103(str, str2, str3, Integer.parseInt((String) AbstractC0684.m1524(c2670.f8848, new String[]{new C4441(new long[]{9133654232441248034L, -940851322245531851L}).toString()}).get(0)));
        this.f6236 = str3;
        do {
            c4994 = this.f6235;
            value = c4994.getValue();
        } while (!c4994.m8386(value, C3584.m6401((C3584) value, false, c3103, 1)));
        return new Integer(c3103.f10404);
    }
}
