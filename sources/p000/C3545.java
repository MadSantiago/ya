package p000;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: ۦؙٜؔۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3545 extends AbstractC3925 {

    /* JADX INFO: renamed from: ۥۖ */
    public ArrayList f11776 = new ArrayList();

    /* JADX INFO: renamed from: ۦۛ */
    public String f11777;

    @Override // p000.AbstractC3925
    /* JADX INFO: renamed from: ۦٕ */
    public final int mo1447(C2024 c2024) throws IllegalAccessException {
        if (this.f11777 == null) {
            throw new IllegalAccessException("groupName not be null");
        }
        if (this.f11776.isEmpty()) {
            throw new IllegalAccessException("matchers not be empty");
        }
        int iM3946 = c2024.m3946(this.f11777);
        ArrayList arrayList = this.f11776;
        ArrayList arrayList2 = new ArrayList(AbstractC5573.m9402(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(((C2203) it.next()).mo1447(c2024)));
        }
        int iM3958 = c2024.m3958(AbstractC0973.m2050(arrayList2));
        c2024.m3948(2);
        c2024.m3952(1, iM3958);
        c2024.m3952(0, iM3946);
        int iM3950 = c2024.m3950();
        c2024.m3955(iM3950);
        return iM3950;
    }
}
