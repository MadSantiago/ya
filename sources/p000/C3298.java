package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: ۦؕؗٞ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3298 implements InterfaceC4745 {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ Object f11038;

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ Object f11039;

    /* JADX INFO: renamed from: ۥٓ */
    public final /* synthetic */ Object f11040;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ int f11041;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f11042 = 0;

    public /* synthetic */ C3298(C5704 c5704, C0888 c0888, C1254 c1254, int i) {
        this.f11039 = c5704;
        this.f11040 = c0888;
        this.f11038 = c1254;
        this.f11041 = i;
    }

    @Override // p000.InterfaceC4745
    /* JADX INFO: renamed from: ۦؚ */
    public final Object mo211(Object obj) {
        int i = this.f11042;
        EnumC2459 enumC2459 = EnumC2459.f8215;
        int i2 = 0;
        C2358 c2358 = C2358.f7817;
        Object obj2 = this.f11038;
        int i3 = this.f11041;
        Object obj3 = this.f11040;
        Object obj4 = this.f11039;
        switch (i) {
            case 0:
                ArrayList arrayList = (ArrayList) obj4;
                InterfaceC2427 interfaceC2427 = (InterfaceC2427) obj2;
                ArrayList arrayList2 = (ArrayList) obj3;
                AbstractC1842 abstractC1842 = (AbstractC1842) obj;
                int size = arrayList.size();
                int i4 = 0;
                while (i4 < size) {
                    List list = (List) arrayList.get(i4);
                    int size2 = list.size();
                    int[] iArr = new int[size2];
                    int i5 = i2;
                    while (i5 < size2) {
                        iArr[i5] = ((AbstractC0275) list.get(i5)).f985 + (i5 < AbstractC2164.m4181(list) ? interfaceC2427.mo743(8.0f) : i2);
                        i5++;
                    }
                    int[] iArr2 = new int[size2];
                    if (interfaceC2427.getLayoutDirection() == enumC2459) {
                        int i6 = i2;
                        int i7 = i6;
                        while (i6 < size2) {
                            i7 += iArr[i6];
                            i6++;
                        }
                        int i8 = i3 - i7;
                        int i9 = i2;
                        int i10 = i9;
                        while (i9 < size2) {
                            int i11 = iArr[i9];
                            iArr2[i10] = i8;
                            i8 += i11;
                            i9++;
                            i10++;
                        }
                    } else {
                        int i12 = i2;
                        for (int i13 = size2 - 1; -1 < i13; i13--) {
                            int i14 = iArr[i13];
                            iArr2[i13] = i12;
                            i12 += i14;
                        }
                    }
                    int size3 = list.size();
                    for (int i15 = i2; i15 < size3; i15++) {
                        AbstractC1842.m3626(abstractC1842, (AbstractC0275) list.get(i15), iArr2[i15], ((Number) arrayList2.get(i4)).intValue());
                    }
                    i4++;
                    i2 = 0;
                }
                return c2358;
            case 1:
                C0888 c0888 = (C0888) obj3;
                C1254 c1254 = (C1254) obj2;
                if (obj == ((C5704) obj4)) {
                    C1078.m2276("A derived state calculation cannot read itself");
                    return null;
                }
                if (obj instanceof InterfaceC0622) {
                    int i16 = c0888.f3230 - i3;
                    int iM2654 = c1254.m2654(obj);
                    c1254.m2655(Math.min(i16, iM2654 >= 0 ? c1254.f4315[iM2654] : Integer.MAX_VALUE), obj);
                }
                return c2358;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                C2434 c2434 = (C2434) obj4;
                InterfaceC2427 interfaceC2428 = (InterfaceC2427) obj2;
                AbstractC0275 abstractC0275 = (AbstractC0275) obj3;
                AbstractC1842 abstractC1843 = (AbstractC1842) obj;
                int i17 = c2434.f8101;
                C4950 c4950 = c2434.f8102;
                C3263 c3263 = c2434.f8100;
                C2449 c2449 = (C2449) c2434.f8103.mo449();
                c4950.m8332(EnumC1616.f5424, AbstractC0993.m2139(abstractC1843, i17, c3263, c2449 != null ? c2449.f8158 : null, interfaceC2428.getLayoutDirection() == EnumC2459.f8214, abstractC0275.f985), i3, abstractC0275.f985);
                AbstractC1842.m3623(abstractC1843, abstractC0275, Math.round(-c4950.f16381.m1711()), 0);
                return c2358;
            default:
                AbstractC0275[] abstractC0275Arr = (AbstractC0275[]) obj4;
                C3668 c3668 = (C3668) obj3;
                int[] iArr3 = (int[]) obj2;
                AbstractC1842 abstractC1844 = (AbstractC1842) obj;
                int length = abstractC0275Arr.length;
                int i18 = 0;
                while (i2 < length) {
                    AbstractC0275 abstractC0276 = abstractC0275Arr[i2];
                    int i19 = i18 + 1;
                    Object objMo570 = abstractC0276.mo570();
                    C0522 c0522 = objMo570 instanceof C0522 ? (C0522) objMo570 : null;
                    C2772 c2772 = c0522 != null ? c0522.f1850 : null;
                    AbstractC1842.m3626(abstractC1844, abstractC0276, iArr3[i18], c2772 != null ? c2772.f9237.m3748(abstractC0276.f984, i3, enumC2459) : c3668.f12262.m7577(abstractC0276.f984, i3));
                    i2++;
                    i18 = i19;
                }
                return c2358;
        }
    }

    public /* synthetic */ C3298(C2434 c2434, InterfaceC2427 interfaceC2427, AbstractC0275 abstractC0275, int i) {
        this.f11039 = c2434;
        this.f11038 = interfaceC2427;
        this.f11040 = abstractC0275;
        this.f11041 = i;
    }

    public /* synthetic */ C3298(ArrayList arrayList, InterfaceC2427 interfaceC2427, int i, ArrayList arrayList2) {
        this.f11039 = arrayList;
        this.f11038 = interfaceC2427;
        this.f11041 = i;
        this.f11040 = arrayList2;
    }

    public /* synthetic */ C3298(AbstractC0275[] abstractC0275Arr, C3668 c3668, int i, int[] iArr) {
        this.f11039 = abstractC0275Arr;
        this.f11040 = c3668;
        this.f11041 = i;
        this.f11038 = iArr;
    }
}
