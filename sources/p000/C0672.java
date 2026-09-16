package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: ۥؘؔٔۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0672 extends AbstractC3925 {

    /* JADX INFO: renamed from: ۥۖ */
    public C0094 f2470;

    /* JADX INFO: renamed from: ۦۛ */
    public List f2471;

    @Override // p000.AbstractC3925
    /* JADX INFO: renamed from: ۦٕ */
    public final int mo1447(C2024 c2024) {
        int iM3958;
        List list = this.f2471;
        if (list != null) {
            ArrayList arrayList = new ArrayList(AbstractC5573.m9402(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((C0637) it.next()).mo1447(c2024)));
            }
            iM3958 = c2024.m3958(AbstractC0973.m2050(arrayList));
        } else {
            iM3958 = 0;
        }
        C0094 c0094 = this.f2470;
        int iMo1447 = c0094 != null ? c0094.mo1447(c2024) : 0;
        c2024.m3948(3);
        c2024.m3952(2, iMo1447);
        c2024.m3952(0, iM3958);
        c2024.m3949((byte) 0);
        int iM3950 = c2024.m3950();
        c2024.m3955(iM3950);
        return iM3950;
    }

    /* JADX INFO: renamed from: ۦۜ */
    public final void m1503(C0637 c0637) {
        List arrayList = this.f2471;
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        this.f2471 = arrayList;
        arrayList.add(c0637);
    }
}
