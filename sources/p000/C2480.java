package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: ۥٟ۠ؑؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2480 implements InterfaceC3228 {

    /* JADX INFO: renamed from: ۥۣ */
    public final /* synthetic */ int f8271;

    /* JADX INFO: renamed from: ۥۗ */
    public static final C2480 f8265 = new C2480(0);

    /* JADX INFO: renamed from: ۥؗ */
    public static final C2480 f8262 = new C2480(1);

    /* JADX INFO: renamed from: ۦؑ */
    public static final C2480 f8267 = new C2480(2);

    /* JADX INFO: renamed from: ۥُ */
    public static final C2480 f8263 = new C2480(3);

    /* JADX INFO: renamed from: ۥّ */
    public static final C2480 f8264 = new C2480(4);

    /* JADX INFO: renamed from: ۦۙ */
    public static final C3018 f8270 = new C3018(29);

    /* JADX INFO: renamed from: ۥۜ */
    public static final C2480 f8266 = new C2480(5);

    /* JADX INFO: renamed from: ۦٛ */
    public static final C2480 f8269 = new C2480(6);

    /* JADX INFO: renamed from: ۦِ */
    public static final C2480 f8268 = new C2480(7);

    public /* synthetic */ C2480(int i) {
        this.f8271 = i;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static final void m4638(ArrayList arrayList, C4763 c4763, InterfaceC2427 interfaceC2427, ArrayList arrayList2, ArrayList arrayList3, C4763 c4764, ArrayList arrayList4, C4763 c4765, C4763 c4766) {
        if (!arrayList.isEmpty()) {
            c4763.f15714 = interfaceC2427.mo743(12.0f) + c4763.f15714;
        }
        arrayList.add(0, AbstractC0973.m2039(arrayList2));
        arrayList3.add(Integer.valueOf(c4764.f15714));
        arrayList4.add(Integer.valueOf(c4763.f15714));
        c4763.f15714 += c4764.f15714;
        c4765.f15714 = Math.max(c4765.f15714, c4766.f15714);
        arrayList2.clear();
        c4766.f15714 = 0;
        c4764.f15714 = 0;
    }

    @Override // p000.InterfaceC3228
    /* JADX INFO: renamed from: ۦۙ */
    public final InterfaceC5370 mo771(InterfaceC2427 interfaceC2427, List list, long j) {
        ArrayList arrayList;
        int i = this.f8271;
        C0204 c0204 = C0204.f751;
        switch (i) {
            case 0:
                ArrayList arrayList2 = new ArrayList(list.size());
                int size = list.size();
                int iM6557 = 0;
                int iM6555 = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    AbstractC0275 abstractC0275Mo3597 = ((InterfaceC1827) list.get(i2)).mo3597(j);
                    iM6557 = Math.max(iM6557, abstractC0275Mo3597.f985);
                    iM6555 = Math.max(iM6555, abstractC0275Mo3597.f984);
                    arrayList2.add(abstractC0275Mo3597);
                }
                if (list.isEmpty()) {
                    iM6557 = C3693.m6557(j);
                    iM6555 = C3693.m6555(j);
                }
                return interfaceC2427.mo755(iM6557, iM6555, c0204, new C4738(0, arrayList2));
            case 1:
                int size2 = list.size();
                if (size2 == 0) {
                    return interfaceC2427.mo755(0, 0, c0204, C1931.f6367);
                }
                if (size2 == 1) {
                    AbstractC0275 abstractC0275Mo3598 = ((InterfaceC1827) list.get(0)).mo3597(j);
                    return interfaceC2427.mo755(abstractC0275Mo3598.f985, abstractC0275Mo3598.f984, c0204, new C0778(abstractC0275Mo3598, 1));
                }
                ArrayList arrayList3 = new ArrayList(list.size());
                int size3 = list.size();
                int iMax = 0;
                int iMax2 = 0;
                for (int i3 = 0; i3 < size3; i3++) {
                    AbstractC0275 abstractC0275Mo3599 = ((InterfaceC1827) list.get(i3)).mo3597(j);
                    iMax = Math.max(iMax, abstractC0275Mo3599.f985);
                    iMax2 = Math.max(iMax2, abstractC0275Mo3599.f984);
                    arrayList3.add(abstractC0275Mo3599);
                }
                return interfaceC2427.mo755(iMax, iMax2, c0204, new C4738(1, arrayList3));
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                ArrayList arrayList4 = new ArrayList(list.size());
                int size4 = list.size();
                for (int i4 = 0; i4 < size4; i4++) {
                    arrayList4.add(((InterfaceC1827) list.get(i4)).mo3597(j));
                }
                return interfaceC2427.mo755(C3693.m6556(j), C3693.m6551(j), c0204, new C2810(0, arrayList4));
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                return interfaceC2427.mo755(C3693.m6557(j), C3693.m6555(j), c0204, new C0086(10));
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                return interfaceC2427.mo755(C3693.m6556(j), C3693.m6551(j), c0204, f8270);
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                return interfaceC2427.mo755(C3693.m6557(j), C3693.m6555(j), c0204, new C2582(23));
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                ArrayList arrayList5 = new ArrayList(list.size());
                int size5 = list.size();
                int iMax3 = 0;
                int iMax4 = 0;
                for (int i5 = 0; i5 < size5; i5++) {
                    AbstractC0275 abstractC0275Mo35910 = ((InterfaceC1827) list.get(i5)).mo3597(j);
                    iMax3 = Math.max(iMax3, abstractC0275Mo35910.f985);
                    iMax4 = Math.max(iMax4, abstractC0275Mo35910.f984);
                    arrayList5.add(abstractC0275Mo35910);
                }
                return interfaceC2427.mo755(iMax3, iMax4, c0204, new C2810(2, arrayList5));
            case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                return interfaceC2427.mo755(C3693.m6558(j) ? C3693.m6556(j) : 0, C3693.m6549(j) ? C3693.m6551(j) : 0, c0204, new C4215(22));
            default:
                ArrayList arrayList6 = new ArrayList();
                ArrayList arrayList7 = new ArrayList();
                ArrayList arrayList8 = new ArrayList();
                C4763 c4763 = new C4763();
                C4763 c4764 = new C4763();
                ArrayList arrayList9 = new ArrayList();
                C4763 c4765 = new C4763();
                int i6 = 0;
                C4763 c4766 = new C4763();
                int size6 = list.size();
                while (i6 < size6) {
                    AbstractC0275 abstractC0275Mo35911 = ((InterfaceC1827) list.get(i6)).mo3597(j);
                    int i7 = i6;
                    if (!arrayList9.isEmpty()) {
                        ArrayList arrayList10 = arrayList6;
                        if (interfaceC2427.mo743(8.0f) + c4765.f15714 + abstractC0275Mo35911.f985 <= C3693.m6556(j)) {
                            arrayList6 = arrayList10;
                        } else {
                            arrayList6 = arrayList10;
                            m4638(arrayList6, c4764, interfaceC2427, arrayList9, arrayList7, c4766, arrayList8, c4763, c4765);
                        }
                    }
                    if (!arrayList9.isEmpty()) {
                        c4765.f15714 = interfaceC2427.mo743(8.0f) + c4765.f15714;
                    }
                    arrayList9.add(abstractC0275Mo35911);
                    c4765.f15714 += abstractC0275Mo35911.f985;
                    c4766.f15714 = Math.max(c4766.f15714, abstractC0275Mo35911.f984);
                    i6 = i7 + 1;
                    arrayList6 = arrayList6;
                }
                ArrayList arrayList11 = arrayList6;
                if (arrayList9.isEmpty()) {
                    arrayList = arrayList11;
                } else {
                    arrayList = arrayList11;
                    m4638(arrayList, c4764, interfaceC2427, arrayList9, arrayList7, c4766, arrayList8, c4763, c4765);
                }
                int iMax5 = Math.max(c4763.f15714, C3693.m6557(j));
                return interfaceC2427.mo755(iMax5, Math.max(c4764.f15714, C3693.m6555(j)), c0204, new C3298(arrayList, interfaceC2427, iMax5, arrayList8));
        }
    }
}
