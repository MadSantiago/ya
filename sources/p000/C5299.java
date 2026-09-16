package p000;

import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: renamed from: ۦِۜؗؗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5299 implements InterfaceC4745 {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ Object f17451;

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ Object f17452;

    /* JADX INFO: renamed from: ۥٓ */
    public final /* synthetic */ Object f17453;

    /* JADX INFO: renamed from: ۥٖ */
    public final /* synthetic */ Serializable f17454;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ int f17455;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f17456 = 1;

    public /* synthetic */ C5299(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, C4763 c4763, int i) {
        this.f17452 = arrayList;
        this.f17453 = arrayList2;
        this.f17451 = arrayList3;
        this.f17454 = c4763;
        this.f17455 = i;
    }

    @Override // p000.InterfaceC4745
    /* JADX INFO: renamed from: ۦؚ */
    public final Object mo211(Object obj) {
        int i = this.f17456;
        C2358 c2358 = C2358.f7817;
        int i2 = 0;
        int i3 = this.f17455;
        Object obj2 = this.f17454;
        Object obj3 = this.f17451;
        Object obj4 = this.f17453;
        Object obj5 = this.f17452;
        switch (i) {
            case 0:
                AbstractC0275[] abstractC0275Arr = (AbstractC0275[]) obj5;
                C3113 c3113 = (C3113) obj4;
                InterfaceC2427 interfaceC2427 = (InterfaceC2427) obj3;
                int[] iArr = (int[]) obj2;
                AbstractC1842 abstractC1842 = (AbstractC1842) obj;
                int length = abstractC0275Arr.length;
                int i4 = 0;
                while (i2 < length) {
                    AbstractC0275 abstractC0275 = abstractC0275Arr[i2];
                    int i5 = i4 + 1;
                    Object objMo570 = abstractC0275.mo570();
                    C0522 c0522 = objMo570 instanceof C0522 ? (C0522) objMo570 : null;
                    EnumC2459 layoutDirection = interfaceC2427.getLayoutDirection();
                    C2772 c2772 = c0522 != null ? c0522.f1850 : null;
                    AbstractC1842.m3626(abstractC1842, abstractC0275, c2772 != null ? c2772.f9237.m3748(abstractC0275.f985, i3, layoutDirection) : c3113.f10438.m3748(abstractC0275.f985, i3, layoutDirection), iArr[i4]);
                    i2++;
                    i4 = i5;
                }
                break;
            default:
                ArrayList arrayList = (ArrayList) obj5;
                ArrayList arrayList2 = (ArrayList) obj4;
                ArrayList arrayList3 = (ArrayList) obj3;
                C4763 c4763 = (C4763) obj2;
                AbstractC1842 abstractC1843 = (AbstractC1842) obj;
                int size = arrayList.size();
                for (int i6 = 0; i6 < size; i6++) {
                    AbstractC1842.m3623(abstractC1843, (AbstractC0275) arrayList.get(i6), c4763.f15714 * i6, 0);
                }
                int size2 = arrayList2.size();
                for (int i7 = 0; i7 < size2; i7++) {
                    AbstractC0275 abstractC0276 = (AbstractC0275) arrayList2.get(i7);
                    AbstractC1842.m3623(abstractC1843, abstractC0276, 0, i3 - abstractC0276.f984);
                }
                int size3 = arrayList3.size();
                for (int i8 = 0; i8 < size3; i8++) {
                    AbstractC0275 abstractC0277 = (AbstractC0275) arrayList3.get(i8);
                    AbstractC1842.m3623(abstractC1843, abstractC0277, 0, i3 - abstractC0277.f984);
                }
                break;
        }
        return c2358;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ C5299(AbstractC0275[] abstractC0275Arr, C3113 c3113, int i, InterfaceC2427 interfaceC2427, int[] iArr) {
        this.f17452 = abstractC0275Arr;
        this.f17453 = c3113;
        this.f17455 = i;
        this.f17451 = interfaceC2427;
        this.f17454 = iArr;
    }
}
