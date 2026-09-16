package p000;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: ۦَٜؑۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4665 extends AbstractC3925 {

    /* JADX INFO: renamed from: ۥۖ */
    public int f15368;

    /* JADX INFO: renamed from: ۦۛ */
    public ArrayList f15369;

    @Override // p000.AbstractC3925
    /* JADX INFO: renamed from: ۦٕ */
    public final int mo1447(C2024 c2024) {
        ArrayList arrayList = this.f15369;
        ArrayList arrayList2 = new ArrayList(AbstractC5573.m9402(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Short.valueOf((short) ((Number) it.next()).intValue()));
        }
        int size = arrayList2.size();
        short[] sArr = new short[size];
        Iterator it2 = arrayList2.iterator();
        int i = 0;
        while (it2.hasNext()) {
            sArr[i] = ((Number) it2.next()).shortValue();
            i++;
        }
        c2024.m3944(2, size, 2);
        byte b = 1;
        for (int i2 = size - 1; -1 < i2; i2--) {
            c2024.m3945(sArr[i2]);
        }
        int iM3956 = c2024.m3956();
        int i3 = this.f15368;
        if (i3 == 1) {
            b = 0;
        } else if (i3 != 2) {
            if (i3 == 3) {
                b = 2;
            } else {
                if (i3 != 4) {
                    throw null;
                }
                b = 3;
            }
        }
        c2024.m3948(3);
        c2024.m3952(2, 0);
        c2024.m3952(0, iM3956);
        c2024.m3949(b);
        int iM3950 = c2024.m3950();
        c2024.m3955(iM3950);
        return iM3950;
    }
}
