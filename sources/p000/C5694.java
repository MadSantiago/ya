package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: ۦۥؚْؒ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5694 implements InterfaceC4866 {

    /* JADX INFO: renamed from: ۥۣ */
    public final /* synthetic */ C4960 f18730;

    public C5694(C4960 c4960) {
        this.f18730 = c4960;
    }

    @Override // p000.InterfaceC4866
    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC5370 mo4085(InterfaceC2427 interfaceC2427, ArrayList arrayList, long j) {
        List list = (List) arrayList.get(0);
        List list2 = (List) arrayList.get(1);
        List list3 = (List) arrayList.get(2);
        int iM6556 = C3693.m6556(j);
        int size = list.size();
        C4763 c4763 = new C4763();
        if (size > 0) {
            c4763.f15714 = iM6556 / size;
        }
        Integer numValueOf = 0;
        int size2 = list.size();
        for (int i = 0; i < size2; i++) {
            numValueOf = Integer.valueOf(Math.max(((InterfaceC1827) list.get(i)).mo3598(c4763.f15714), numValueOf.intValue()));
        }
        int iIntValue = numValueOf.intValue();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            C4497 c4497 = new C4497(interfaceC2427.mo756(Math.min(((InterfaceC1827) list.get(i2)).mo3599(iIntValue), c4763.f15714)) - (AbstractC5844.f19255 * 2.0f));
            C4497 c4498 = new C4497(24.0f);
            if (c4497.compareTo(c4498) < 0) {
                c4497 = c4498;
            }
            arrayList2.add(new C2733(interfaceC2427.mo756(c4763.f15714) * i2, interfaceC2427.mo756(c4763.f15714), c4497.f14871));
        }
        this.f18730.f16408.setValue(arrayList2);
        ArrayList arrayList3 = new ArrayList(list.size());
        int size3 = list.size();
        for (int i3 = 0; i3 < size3; i3++) {
            InterfaceC1827 interfaceC1827 = (InterfaceC1827) list.get(i3);
            int i4 = c4763.f15714;
            arrayList3.add(interfaceC1827.mo3597(C3693.m6552(i4, i4, iIntValue, iIntValue)));
        }
        ArrayList arrayList4 = new ArrayList(list2.size());
        int i5 = 0;
        for (int size4 = list2.size(); i5 < size4; size4 = size4) {
            arrayList4.add(((InterfaceC1827) list2.get(i5)).mo3597(C3693.m6550(j, 0, 0, 0, 0, 11)));
            i5++;
        }
        ArrayList arrayList5 = new ArrayList(list3.size());
        int size5 = list3.size();
        for (int i6 = 0; i6 < size5; i6++) {
            InterfaceC1827 interfaceC1828 = (InterfaceC1827) list3.get(i6);
            int i7 = c4763.f15714;
            arrayList5.add(interfaceC1828.mo3597(C3693.m6552(i7, i7, 0, iIntValue)));
        }
        return interfaceC2427.mo755(iM6556, iIntValue, C0204.f751, new C5299(arrayList3, arrayList4, arrayList5, c4763, iIntValue));
    }
}
