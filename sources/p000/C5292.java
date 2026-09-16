package p000;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: ۦۜؕٗ٘, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5292 extends AbstractC4878 {

    /* JADX INFO: renamed from: ۦۛ */
    public ArrayList f17429;

    @Override // p000.AbstractC3925
    /* JADX INFO: renamed from: ۦٕ */
    public final int mo1447(C2024 c2024) throws IllegalAccessException {
        ArrayList arrayList = this.f17429;
        if (arrayList == null) {
            throw new IllegalAccessException("searchGroups not be empty");
        }
        ArrayList arrayList2 = new ArrayList(AbstractC5573.m9402(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((C3545) it.next()).f11777);
        }
        if (AbstractC0973.m2052(arrayList2).size() < this.f17429.size()) {
            throw new IllegalAccessException("groupName must be unique");
        }
        ArrayList arrayList3 = this.f17429;
        ArrayList arrayList4 = new ArrayList(AbstractC5573.m9402(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(Integer.valueOf(((C3545) it2.next()).mo1447(c2024)));
        }
        int iM3958 = c2024.m3958(AbstractC0973.m2050(arrayList4));
        c2024.m3948(6);
        c2024.m3952(5, iM3958);
        c2024.m3952(4, 0);
        c2024.m3952(3, 0);
        c2024.m3952(1, 0);
        c2024.m3952(0, 0);
        int iM3950 = c2024.m3950();
        c2024.m3955(iM3950);
        return iM3950;
    }
}
