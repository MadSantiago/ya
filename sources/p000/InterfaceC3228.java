package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: ۦٟٕؔؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC3228 {
    /* JADX INFO: renamed from: ۥؗ */
    default int mo3091(InterfaceC0151 interfaceC0151, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(new C5230((InterfaceC1827) list.get(i3), 2, 1, i2));
        }
        return mo771(new C3357(interfaceC0151, interfaceC0151.getLayoutDirection()), arrayList, AbstractC0671.m1494(0, 0, 0, i, 7)).mo619();
    }

    /* JADX INFO: renamed from: ۥۗ */
    default int mo4446(InterfaceC0151 interfaceC0151, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            int i4 = 2;
            arrayList.add(new C5230((InterfaceC1827) list.get(i3), i4, i4, i2));
        }
        return mo771(new C3357(interfaceC0151, interfaceC0151.getLayoutDirection()), arrayList, AbstractC0671.m1494(0, i, 0, 0, 13)).mo618();
    }

    /* JADX INFO: renamed from: ۥۜ */
    default int mo4447(InterfaceC0151 interfaceC0151, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(new C5230((InterfaceC1827) list.get(i3), 1, 2, i2));
        }
        return mo771(new C3357(interfaceC0151, interfaceC0151.getLayoutDirection()), arrayList, AbstractC0671.m1494(0, i, 0, 0, 13)).mo618();
    }

    /* JADX INFO: renamed from: ۦِ */
    default int mo4448(InterfaceC0151 interfaceC0151, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            int i4 = 1;
            arrayList.add(new C5230((InterfaceC1827) list.get(i3), i4, i4, i2));
        }
        return mo771(new C3357(interfaceC0151, interfaceC0151.getLayoutDirection()), arrayList, AbstractC0671.m1494(0, 0, 0, i, 7)).mo619();
    }

    /* JADX INFO: renamed from: ۦۙ */
    InterfaceC5370 mo771(InterfaceC2427 interfaceC2427, List list, long j);
}
