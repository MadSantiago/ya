package p000;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: ۥٔؒۜؐ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1323 {

    /* JADX INFO: renamed from: ۥؗ */
    public final C3906 f4564;

    /* JADX INFO: renamed from: ۥُ */
    public final BitSet f4565;

    /* JADX INFO: renamed from: ۥّ */
    public final C4461 f4566;

    /* JADX INFO: renamed from: ۥۗ */
    public final boolean f4567;

    /* JADX INFO: renamed from: ۥۜ */
    public final /* synthetic */ C1419 f4568;

    /* JADX INFO: renamed from: ۥۣ */
    public final String f4569;

    /* JADX INFO: renamed from: ۦؑ */
    public final BitSet f4570;

    /* JADX INFO: renamed from: ۦۙ */
    public final C4461 f4571;

    public C1323(C1419 c1419, String str, C3906 c3906, BitSet bitSet, BitSet bitSet2, C4461 c4461, C4461 c4462) {
        this.f4568 = c1419;
        this.f4569 = str;
        this.f4570 = bitSet;
        this.f4565 = bitSet2;
        this.f4566 = c4461;
        this.f4571 = new C4461(0);
        for (Integer num : (C2163) c4462.keySet()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) c4462.get(num));
            this.f4571.put(num, arrayList);
        }
        this.f4567 = false;
        this.f4564 = c3906;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final C1971 m2811(int i) {
        List list;
        C2861 c2861M3858 = C1971.m3858();
        c2861M3858.m1979();
        ((C1971) c2861M3858.f3388).m3860(i);
        c2861M3858.m1979();
        ((C1971) c2861M3858.f3388).m3861(this.f4567);
        C3906 c3906 = this.f4564;
        if (c3906 != null) {
            c2861M3858.m1979();
            ((C1971) c2861M3858.f3388).m3866(c3906);
        }
        C3418 c3418M6979 = C3906.m6979();
        ArrayList arrayListM5700 = C3117.m5700(this.f4570);
        c3418M6979.m1979();
        ((C3906) c3418M6979.f3388).m6994(arrayListM5700);
        ArrayList arrayListM5701 = C3117.m5700(this.f4565);
        c3418M6979.m1979();
        ((C3906) c3418M6979.f3388).m6989(arrayListM5701);
        C4461 c4461 = this.f4566;
        ArrayList arrayList = new ArrayList(c4461.f2862);
        for (Integer num : (C2163) c4461.keySet()) {
            int iIntValue = num.intValue();
            Long l = (Long) c4461.get(num);
            if (l != null) {
                C2042 c2042M6376 = C3574.m6376();
                c2042M6376.m1979();
                ((C3574) c2042M6376.f3388).m6380(iIntValue);
                long jLongValue = l.longValue();
                c2042M6376.m1979();
                ((C3574) c2042M6376.f3388).m6381(jLongValue);
                arrayList.add((C3574) c2042M6376.m1977());
            }
        }
        c3418M6979.m1979();
        ((C3906) c3418M6979.f3388).m6987(arrayList);
        C4461 c4462 = this.f4571;
        if (c4462 == null) {
            list = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList2 = new ArrayList(c4462.f2862);
            for (Integer num2 : (C2163) c4462.keySet()) {
                C2009 c2009M6185 = C3415.m6185();
                int iIntValue2 = num2.intValue();
                c2009M6185.m1979();
                ((C3415) c2009M6185.f3388).m6190(iIntValue2);
                List list2 = (List) c4462.get(num2);
                if (list2 != null) {
                    Collections.sort(list2);
                    c2009M6185.m1979();
                    ((C3415) c2009M6185.f3388).m6189(list2);
                }
                arrayList2.add((C3415) c2009M6185.m1977());
            }
            list = arrayList2;
        }
        c3418M6979.m1979();
        ((C3906) c3418M6979.f3388).m6990(list);
        c2861M3858.m1979();
        ((C1971) c2861M3858.f3388).m3859((C3906) c3418M6979.m1977());
        return (C1971) c2861M3858.m1977();
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m2812(C4379 c4379) {
        int iM6332;
        switch (c4379.f14435) {
            case 0:
                iM6332 = ((C3542) c4379.f14434).m6332();
                break;
            default:
                iM6332 = ((C4630) c4379.f14434).m8015();
                break;
        }
        boolean z = true;
        if (c4379.f14427 != null) {
            this.f4565.set(iM6332, true);
        }
        Boolean bool = c4379.f14433;
        if (bool != null) {
            this.f4570.set(iM6332, bool.booleanValue());
        }
        if (c4379.f14428 != null) {
            Integer numValueOf = Integer.valueOf(iM6332);
            C4461 c4461 = this.f4566;
            Long l = (Long) c4461.get(numValueOf);
            long jLongValue = c4379.f14428.longValue() / 1000;
            if (l == null || jLongValue > l.longValue()) {
                c4461.put(numValueOf, Long.valueOf(jLongValue));
            }
        }
        if (c4379.f14429 != null) {
            Integer numValueOf2 = Integer.valueOf(iM6332);
            C4461 c4462 = this.f4571;
            List arrayList = (List) c4462.get(numValueOf2);
            if (arrayList == null) {
                arrayList = new ArrayList();
                c4462.put(numValueOf2, arrayList);
            }
            boolean zM6340 = false;
            switch (c4379.f14435) {
                case 0:
                    z = false;
                    break;
            }
            if (z) {
                arrayList.clear();
            }
            C3642.m6513();
            C5371 c5371 = (C5371) this.f4568.f18660;
            C0515 c0515 = c5371.f17715;
            C2462 c2462 = AbstractC4936.f16255;
            String str = this.f4569;
            if (c0515.m1162(str, c2462)) {
                switch (c4379.f14435) {
                    case 0:
                        zM6340 = ((C3542) c4379.f14434).m6340();
                        break;
                }
                if (zM6340) {
                    arrayList.clear();
                }
            }
            C3642.m6513();
            boolean zM1162 = c5371.f17715.m1162(str, c2462);
            Long l2 = c4379.f14429;
            if (!zM1162) {
                arrayList.add(Long.valueOf(l2.longValue() / 1000));
                return;
            }
            Long lValueOf = Long.valueOf(l2.longValue() / 1000);
            if (arrayList.contains(lValueOf)) {
                return;
            }
            arrayList.add(lValueOf);
        }
    }

    public C1323(C1419 c1419, String str) {
        this.f4568 = c1419;
        this.f4569 = str;
        this.f4567 = true;
        this.f4570 = new BitSet();
        this.f4565 = new BitSet();
        this.f4566 = new C4461(0);
        this.f4571 = new C4461(0);
    }
}
