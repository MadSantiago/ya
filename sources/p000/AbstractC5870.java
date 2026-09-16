package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: renamed from: ۦٍٖۨؓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5870 {

    /* JADX INFO: renamed from: ۥۗ */
    public static final C5302 f19388;

    /* JADX INFO: renamed from: ۥۣ */
    public static final Comparator[] f19389;

    static {
        Comparator[] comparatorArr = new Comparator[2];
        int i = 0;
        while (i < 2) {
            comparatorArr[i] = new C2504(new C2504(i == 0 ? C1206.f4151 : C1206.f4152));
            i++;
        }
        f19389 = comparatorArr;
        f19388 = C5302.f17466;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00d0  */
    /* JADX INFO: renamed from: ۥۗ */
    public static final ArrayList m9687(C3129 c3129, C2932 c2932, C2932 c2933, List list) {
        int i;
        C4912 c4912 = AbstractC0137.f547;
        C4912 c4913 = new C4912();
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            m9688((C3129) list.get(i2), arrayList, c2932, c2933, c4913);
        }
        char c = c3129.f10471.f2272 == EnumC2459.f8214 ? (char) 1 : (char) 0;
        ArrayList arrayList2 = new ArrayList(arrayList.size() / 2);
        int iM4181 = AbstractC2164.m4181(arrayList);
        if (iM4181 >= 0) {
            int i3 = 0;
            while (true) {
                C3129 c31210 = (C3129) arrayList.get(i3);
                if (i3 == 0) {
                    i = 1;
                    arrayList2.add(new C3869(c31210.m5763(), AbstractC2164.m4193(c31210)));
                    break;
                }
                float f = c31210.m5763().f9342;
                float f2 = c31210.m5763().f9344;
                boolean z = f >= f2;
                int iM4182 = AbstractC2164.m4181(arrayList2);
                if (iM4182 >= 0) {
                    int i4 = 0;
                    while (true) {
                        C2793 c2793 = (C2793) ((C3869) arrayList2.get(i4)).f12915;
                        float f3 = c2793.f9342;
                        i = 1;
                        float f4 = c2793.f9344;
                        boolean z2 = f3 >= f4;
                        if (!z && !z2 && Math.max(f, f3) < Math.min(f2, f4)) {
                            arrayList2.set(i4, new C3869(new C2793(Math.max(c2793.f9343, 0.0f), Math.max(c2793.f9342, f), Math.min(c2793.f9341, Float.POSITIVE_INFINITY), Math.min(f4, f2)), ((C3869) arrayList2.get(i4)).f12914));
                            ((List) ((C3869) arrayList2.get(i4)).f12914).add(c31210);
                            break;
                        }
                        if (i4 != iM4182) {
                            i4++;
                        }
                    }
                } else {
                    i = 1;
                }
                arrayList2.add(new C3869(c31210.m5763(), AbstractC2164.m4193(c31210)));
                break;
                if (i3 == iM4181) {
                    break;
                }
                i3++;
            }
        } else {
            i = 1;
        }
        AbstractC3872.m6902(arrayList2, C1206.f4154);
        ArrayList arrayList3 = new ArrayList();
        Comparator comparator = f19389[c ^ 1];
        int size2 = arrayList2.size();
        for (int i5 = 0; i5 < size2; i5++) {
            C3869 c3869 = (C3869) arrayList2.get(i5);
            AbstractC3872.m6902((List) c3869.f12914, comparator);
            arrayList3.addAll((Collection) c3869.f12914);
        }
        AbstractC3872.m6902(arrayList3, new C2201(i, f19388));
        int size3 = 0;
        while (size3 <= AbstractC2164.m4181(arrayList3)) {
            List list2 = (List) c4913.m9571(((C3129) arrayList3.get(size3)).f10473);
            if (list2 != null) {
                if (((Boolean) c2933.mo211(arrayList3.get(size3))).booleanValue()) {
                    size3++;
                } else {
                    arrayList3.remove(size3);
                }
                arrayList3.addAll(size3, list2);
                size3 += list2.size();
            } else {
                size3++;
            }
        }
        return arrayList3;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static final void m9688(C3129 c3129, ArrayList arrayList, C2932 c2932, C2932 c2933, C4912 c4912) {
        C2542 c2542 = c3129.f10476;
        Object objM6027 = c2542.f8490.m6027(AbstractC2771.f9231);
        if (objM6027 == null) {
            objM6027 = Boolean.FALSE;
        }
        boolean zBooleanValue = ((Boolean) objM6027).booleanValue();
        if ((zBooleanValue || ((Boolean) c2933.mo211(c3129)).booleanValue()) && ((Boolean) c2932.mo211(c3129)).booleanValue()) {
            arrayList.add(c3129);
        }
        if (zBooleanValue) {
            c4912.m8319(c3129.f10473, m9687(c3129, c2932, c2933, C3129.m5756(7, c3129)));
            return;
        }
        List listM5756 = C3129.m5756(7, c3129);
        int size = listM5756.size();
        for (int i = 0; i < size; i++) {
            m9688((C3129) listM5756.get(i), arrayList, c2932, c2933, c4912);
        }
    }
}
