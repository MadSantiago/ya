package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: ۦُّٟؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC4866 {
    /* JADX INFO: renamed from: ۥؗ */
    default int mo4082(InterfaceC0151 interfaceC0151, ArrayList arrayList, int i) {
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list = (List) arrayList.get(i2);
            ArrayList arrayList3 = new ArrayList(list.size());
            int size2 = list.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList3.add(new C5230((InterfaceC1827) list.get(i3), 1, 1, 0));
            }
            arrayList2.add(arrayList3);
        }
        return mo4085(new C3357(interfaceC0151, interfaceC0151.getLayoutDirection()), arrayList2, AbstractC0671.m1494(0, 0, 0, i, 7)).mo619();
    }

    /* JADX INFO: renamed from: ۥُ */
    default int mo4083(InterfaceC0151 interfaceC0151, ArrayList arrayList, int i) {
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list = (List) arrayList.get(i2);
            ArrayList arrayList3 = new ArrayList(list.size());
            int size2 = list.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList3.add(new C5230((InterfaceC1827) list.get(i3), 2, 2, 0));
            }
            arrayList2.add(arrayList3);
        }
        return mo4085(new C3357(interfaceC0151, interfaceC0151.getLayoutDirection()), arrayList2, AbstractC0671.m1494(0, i, 0, 0, 13)).mo618();
    }

    /* JADX INFO: renamed from: ۥۗ */
    default int mo4084(InterfaceC0151 interfaceC0151, ArrayList arrayList, int i) {
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list = (List) arrayList.get(i2);
            ArrayList arrayList3 = new ArrayList(list.size());
            int size2 = list.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList3.add(new C5230((InterfaceC1827) list.get(i3), 2, 1, 0));
            }
            arrayList2.add(arrayList3);
        }
        return mo4085(new C3357(interfaceC0151, interfaceC0151.getLayoutDirection()), arrayList2, AbstractC0671.m1494(0, 0, 0, i, 7)).mo619();
    }

    /* JADX INFO: renamed from: ۥۣ */
    InterfaceC5370 mo4085(InterfaceC2427 interfaceC2427, ArrayList arrayList, long j);

    /* JADX INFO: renamed from: ۦؑ */
    default int mo4086(InterfaceC0151 interfaceC0151, ArrayList arrayList, int i) {
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list = (List) arrayList.get(i2);
            ArrayList arrayList3 = new ArrayList(list.size());
            int size2 = list.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList3.add(new C5230((InterfaceC1827) list.get(i3), 1, 2, 0));
            }
            arrayList2.add(arrayList3);
        }
        return mo4085(new C3357(interfaceC0151, interfaceC0151.getLayoutDirection()), arrayList2, AbstractC0671.m1494(0, i, 0, 0, 13)).mo618();
    }
}
