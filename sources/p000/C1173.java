package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: ۥٌّۣؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1173 implements Iterable, InterfaceC2150, InterfaceC4687 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final TreeMap f4059;

    /* JADX INFO: renamed from: ۦۨ */
    public final TreeMap f4060;

    public C1173(List list) {
        this();
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                m2494(i, (InterfaceC2150) list.get(i));
            }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1173)) {
            return false;
        }
        C1173 c1173 = (C1173) obj;
        if (m2495() != c1173.m2495()) {
            return false;
        }
        TreeMap treeMap = this.f4060;
        if (treeMap.isEmpty()) {
            return c1173.f4060.isEmpty();
        }
        for (int iIntValue = ((Integer) treeMap.firstKey()).intValue(); iIntValue <= ((Integer) treeMap.lastKey()).intValue(); iIntValue++) {
            if (!m2496(iIntValue).equals(c1173.m2496(iIntValue))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.f4060.hashCode() * 31;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0939(2, this);
    }

    public final String toString() {
        return m2499(",");
    }

    /* JADX INFO: renamed from: ۥَ */
    public final void m2494(int i, InterfaceC2150 interfaceC2150) {
        if (i > 32468) {
            C1078.m2276("Array too large");
            return;
        }
        if (i < 0) {
            C1078.m2279(AbstractC5078.m8673(i, "Out of bounds index: ", new StringBuilder(String.valueOf(i).length() + 21)));
            return;
        }
        TreeMap treeMap = this.f4060;
        if (interfaceC2150 == null) {
            treeMap.remove(Integer.valueOf(i));
        } else {
            treeMap.put(Integer.valueOf(i), interfaceC2150);
        }
    }

    @Override // p000.InterfaceC2150
    /* JADX INFO: renamed from: ۥُ */
    public final Iterator mo1606() {
        return new C2528(this, this.f4060.keySet().iterator(), this.f4059.keySet().iterator());
    }

    @Override // p000.InterfaceC2150
    /* JADX INFO: renamed from: ۥّ */
    public final String mo1607() {
        return m2499(",");
    }

    /* JADX INFO: renamed from: ۥْ */
    public final int m2495() {
        TreeMap treeMap = this.f4060;
        if (treeMap.isEmpty()) {
            return 0;
        }
        return ((Integer) treeMap.lastKey()).intValue() + 1;
    }

    /* JADX INFO: renamed from: ۥٓ */
    public final InterfaceC2150 m2496(int i) {
        InterfaceC2150 interfaceC2150;
        if (i < m2495()) {
            return (!m2497(i) || (interfaceC2150 = (InterfaceC2150) this.f4060.get(Integer.valueOf(i))) == null) ? InterfaceC2150.f7060 : interfaceC2150;
        }
        C1078.m2279("Attempting to get element outside of current array");
        return null;
    }

    /* JADX INFO: renamed from: ۥٖ */
    public final boolean m2497(int i) {
        if (i >= 0) {
            TreeMap treeMap = this.f4060;
            if (i <= ((Integer) treeMap.lastKey()).intValue()) {
                return treeMap.containsKey(Integer.valueOf(i));
            }
        }
        C1078.m2279(AbstractC5078.m8673(i, "Out of bounds index: ", new StringBuilder(String.valueOf(i).length() + 21)));
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:100:0x0204  */
    /* JADX WARN: Code duplicated, block: B:102:0x020e  */
    /* JADX WARN: Code duplicated, block: B:104:0x0213  */
    /* JADX WARN: Code duplicated, block: B:106:0x0237  */
    /* JADX WARN: Code duplicated, block: B:107:0x023d  */
    /* JADX WARN: Code duplicated, block: B:110:0x0248  */
    /* JADX WARN: Code duplicated, block: B:112:0x0267  */
    /* JADX WARN: Code duplicated, block: B:113:0x026d  */
    /* JADX WARN: Code duplicated, block: B:117:0x027c A[LOOP:2: B:115:0x0277->B:117:0x027c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:119:0x028b  */
    /* JADX WARN: Code duplicated, block: B:121:0x0291  */
    /* JADX WARN: Code duplicated, block: B:124:0x029d  */
    /* JADX WARN: Code duplicated, block: B:126:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:128:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:130:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:133:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:136:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:139:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:141:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:143:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:145:0x0301  */
    /* JADX WARN: Code duplicated, block: B:147:0x0314  */
    /* JADX WARN: Code duplicated, block: B:148:0x0318  */
    /* JADX WARN: Code duplicated, block: B:149:0x031e  */
    /* JADX WARN: Code duplicated, block: B:153:0x0337 A[LOOP:3: B:151:0x0331->B:153:0x0337, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:155:0x0345  */
    /* JADX WARN: Code duplicated, block: B:157:0x034b  */
    /* JADX WARN: Code duplicated, block: B:159:0x0362  */
    /* JADX WARN: Code duplicated, block: B:162:0x0369  */
    /* JADX WARN: Code duplicated, block: B:165:0x0375  */
    /* JADX WARN: Code duplicated, block: B:173:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:174:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:176:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:178:0x03cb  */
    /* JADX WARN: Code duplicated, block: B:181:0x03d5 A[LOOP:5: B:179:0x03cf->B:181:0x03d5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:184:0x03fa  */
    /* JADX WARN: Code duplicated, block: B:186:0x0402  */
    /* JADX WARN: Code duplicated, block: B:188:0x040c  */
    /* JADX WARN: Code duplicated, block: B:190:0x040f  */
    /* JADX WARN: Code duplicated, block: B:192:0x0415  */
    /* JADX WARN: Code duplicated, block: B:198:0x0432  */
    /* JADX WARN: Code duplicated, block: B:199:0x0435  */
    /* JADX WARN: Code duplicated, block: B:202:0x0441  */
    /* JADX WARN: Code duplicated, block: B:204:0x0449  */
    /* JADX WARN: Code duplicated, block: B:207:0x0455  */
    /* JADX WARN: Code duplicated, block: B:209:0x045f  */
    /* JADX WARN: Code duplicated, block: B:211:0x0467  */
    /* JADX WARN: Code duplicated, block: B:213:0x047e  */
    /* JADX WARN: Code duplicated, block: B:215:0x0484  */
    /* JADX WARN: Code duplicated, block: B:217:0x048a  */
    /* JADX WARN: Code duplicated, block: B:219:0x0492  */
    /* JADX WARN: Code duplicated, block: B:221:0x0497  */
    /* JADX WARN: Code duplicated, block: B:223:0x049f  */
    /* JADX WARN: Code duplicated, block: B:225:0x04a5  */
    /* JADX WARN: Code duplicated, block: B:228:0x04b4  */
    /* JADX WARN: Code duplicated, block: B:230:0x04c6 A[LOOP:6: B:226:0x04ae->B:230:0x04c6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:235:0x04e3 A[LOOP:7: B:233:0x04dd->B:235:0x04e3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:239:0x0507 A[LOOP:8: B:237:0x0501->B:239:0x0507, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:242:0x052c  */
    /* JADX WARN: Code duplicated, block: B:244:0x0534  */
    /* JADX WARN: Code duplicated, block: B:246:0x053e  */
    /* JADX WARN: Code duplicated, block: B:249:0x055c  */
    /* JADX WARN: Code duplicated, block: B:251:0x0578  */
    /* JADX WARN: Code duplicated, block: B:252:0x0580  */
    /* JADX WARN: Code duplicated, block: B:255:0x0590  */
    /* JADX WARN: Code duplicated, block: B:256:0x0597  */
    /* JADX WARN: Code duplicated, block: B:259:0x059c  */
    /* JADX WARN: Code duplicated, block: B:261:0x05a2  */
    /* JADX WARN: Code duplicated, block: B:263:0x05ae  */
    /* JADX WARN: Code duplicated, block: B:272:0x05d2  */
    /* JADX WARN: Code duplicated, block: B:274:0x05da  */
    /* JADX WARN: Code duplicated, block: B:276:0x05f1  */
    /* JADX WARN: Code duplicated, block: B:279:0x05f8  */
    /* JADX WARN: Code duplicated, block: B:281:0x05ff  */
    /* JADX WARN: Code duplicated, block: B:283:0x0604  */
    /* JADX WARN: Code duplicated, block: B:285:0x060c  */
    /* JADX WARN: Code duplicated, block: B:287:0x0612  */
    /* JADX WARN: Code duplicated, block: B:289:0x0618  */
    /* JADX WARN: Code duplicated, block: B:291:0x063a  */
    /* JADX WARN: Code duplicated, block: B:292:0x0645  */
    /* JADX WARN: Code duplicated, block: B:294:0x064b  */
    /* JADX WARN: Code duplicated, block: B:297:0x065f  */
    /* JADX WARN: Code duplicated, block: B:299:0x067d  */
    /* JADX WARN: Code duplicated, block: B:302:0x0686 A[LOOP:10: B:300:0x067e->B:302:0x0686, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:305:0x069e A[LOOP:11: B:305:0x069e->B:321:0x06f0, LOOP_START, PHI: r9 r35
  0x069e: PHI (r9v3 int) = (r9v2 int), (r9v4 int) binds: [B:304:0x069c, B:321:0x06f0] A[DONT_GENERATE, DONT_INLINE]
  0x069e: PHI (r35v1 java.util.TreeMap) = (r35v0 java.util.TreeMap), (r35v4 java.util.TreeMap) binds: [B:304:0x069c, B:321:0x06f0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:307:0x06a4  */
    /* JADX WARN: Code duplicated, block: B:309:0x06b2  */
    /* JADX WARN: Code duplicated, block: B:311:0x06b8  */
    /* JADX WARN: Code duplicated, block: B:313:0x06be  */
    /* JADX WARN: Code duplicated, block: B:314:0x06c4  */
    /* JADX WARN: Code duplicated, block: B:316:0x06d0  */
    /* JADX WARN: Code duplicated, block: B:318:0x06de  */
    /* JADX WARN: Code duplicated, block: B:326:0x0716 A[LOOP:13: B:326:0x0716->B:328:0x0719, LOOP_START, PHI: r0
  0x0716: PHI (r0v33 int) = (r0v32 int), (r0v34 int) binds: [B:296:0x065d, B:328:0x0719] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:328:0x0719 A[LOOP:13: B:326:0x0716->B:328:0x0719, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:330:0x072b  */
    /* JADX WARN: Code duplicated, block: B:332:0x0733  */
    /* JADX WARN: Code duplicated, block: B:334:0x0739  */
    /* JADX WARN: Code duplicated, block: B:336:0x0744  */
    /* JADX WARN: Code duplicated, block: B:338:0x075a  */
    /* JADX WARN: Code duplicated, block: B:340:0x0760  */
    /* JADX WARN: Code duplicated, block: B:342:0x0766  */
    /* JADX WARN: Code duplicated, block: B:345:0x0784 A[LOOP:14: B:343:0x077e->B:345:0x0784, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:347:0x079b  */
    /* JADX WARN: Code duplicated, block: B:348:0x07a0  */
    /* JADX WARN: Code duplicated, block: B:350:0x07a8  */
    /* JADX WARN: Code duplicated, block: B:352:0x07b4  */
    /* JADX WARN: Code duplicated, block: B:355:0x07be  */
    /* JADX WARN: Code duplicated, block: B:357:0x07d0  */
    /* JADX WARN: Code duplicated, block: B:362:0x07e4 A[LOOP:16: B:360:0x07de->B:362:0x07e4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:366:0x0807  */
    /* JADX WARN: Code duplicated, block: B:368:0x080f  */
    /* JADX WARN: Code duplicated, block: B:370:0x081f  */
    /* JADX WARN: Code duplicated, block: B:379:0x01ef A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:390:0x04ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:399:0x070f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:400:0x06f5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:405:0x06e6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:409:0x07ff A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:410:0x07fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:411:0x07d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x0128  */
    /* JADX WARN: Code duplicated, block: B:56:0x012e  */
    /* JADX WARN: Code duplicated, block: B:58:0x0138  */
    /* JADX WARN: Code duplicated, block: B:61:0x0150  */
    /* JADX WARN: Code duplicated, block: B:63:0x0173  */
    /* JADX WARN: Code duplicated, block: B:65:0x0179  */
    /* JADX WARN: Code duplicated, block: B:67:0x017d  */
    /* JADX WARN: Code duplicated, block: B:68:0x0185  */
    /* JADX WARN: Code duplicated, block: B:72:0x0190  */
    /* JADX WARN: Code duplicated, block: B:80:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:82:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:84:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:87:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:89:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:91:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:94:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:96:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:98:0x01fe  */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x02dc, code lost:
    
        if (p000.AbstractC4593.m7982(r7, r2, (p000.C2929) r0, java.lang.Boolean.FALSE, java.lang.Boolean.TRUE).m2495() != r7.m2495()) goto L171;
     */
    @Override // p000.InterfaceC2150
    /* JADX INFO: renamed from: ۥۜ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p000.InterfaceC2150 mo1608(java.lang.String r37, p000.C1489 r38, java.util.ArrayList r39) {
        /*
            Method dump skipped, instruction units count: 2168
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1173.mo1608(java.lang.String, ۥؚٖٗ, java.util.ArrayList):ۥُۘؓۜ");
    }

    @Override // p000.InterfaceC2150
    /* JADX INFO: renamed from: ۦؑ */
    public final Boolean mo1609() {
        return Boolean.TRUE;
    }

    @Override // p000.InterfaceC4687
    /* JADX INFO: renamed from: ۦِ */
    public final InterfaceC2150 mo2281(String str) {
        InterfaceC2150 interfaceC2150;
        if ("length".equals(str)) {
            return new C5563(Double.valueOf(m2495()));
        }
        return (!mo2282(str) || (interfaceC2150 = (InterfaceC2150) this.f4059.get(str)) == null) ? InterfaceC2150.f7060 : interfaceC2150;
    }

    /* JADX INFO: renamed from: ۦٗ */
    public final void m2498(int i) {
        TreeMap treeMap = this.f4060;
        int iIntValue = ((Integer) treeMap.lastKey()).intValue();
        if (i > iIntValue || i < 0) {
            return;
        }
        treeMap.remove(Integer.valueOf(i));
        if (i == iIntValue) {
            int i2 = i - 1;
            Integer numValueOf = Integer.valueOf(i2);
            if (treeMap.containsKey(numValueOf) || i2 < 0) {
                return;
            }
            treeMap.put(numValueOf, InterfaceC2150.f7060);
            return;
        }
        while (true) {
            i++;
            if (i > ((Integer) treeMap.lastKey()).intValue()) {
                return;
            }
            Integer numValueOf2 = Integer.valueOf(i);
            InterfaceC2150 interfaceC2150 = (InterfaceC2150) treeMap.get(numValueOf2);
            if (interfaceC2150 != null) {
                treeMap.put(Integer.valueOf(i - 1), interfaceC2150);
                treeMap.remove(numValueOf2);
            }
        }
    }

    @Override // p000.InterfaceC2150
    /* JADX INFO: renamed from: ۦٛ */
    public final Double mo1610() {
        TreeMap treeMap = this.f4060;
        if (treeMap.size() == 1) {
            return m2496(0).mo1610();
        }
        return treeMap.size() <= 0 ? Double.valueOf(0.0d) : Double.valueOf(Double.NaN);
    }

    @Override // p000.InterfaceC4687
    /* JADX INFO: renamed from: ۦۗ */
    public final boolean mo2282(String str) {
        return "length".equals(str) || this.f4059.containsKey(str);
    }

    @Override // p000.InterfaceC4687
    /* JADX INFO: renamed from: ۦۙ */
    public final void mo2283(String str, InterfaceC2150 interfaceC2150) {
        TreeMap treeMap = this.f4059;
        if (interfaceC2150 == null) {
            treeMap.remove(str);
        } else {
            treeMap.put(str, interfaceC2150);
        }
    }

    @Override // p000.InterfaceC2150
    /* JADX INFO: renamed from: ۦۚ */
    public final InterfaceC2150 mo1611() {
        C1173 c1173 = new C1173();
        for (Map.Entry entry : this.f4060.entrySet()) {
            boolean z = entry.getValue() instanceof InterfaceC4687;
            TreeMap treeMap = c1173.f4060;
            if (z) {
                treeMap.put((Integer) entry.getKey(), (InterfaceC2150) entry.getValue());
            } else {
                treeMap.put((Integer) entry.getKey(), ((InterfaceC2150) entry.getValue()).mo1611());
            }
        }
        return c1173;
    }

    /* JADX INFO: renamed from: ۦۛ */
    public final String m2499(String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        if (!this.f4060.isEmpty()) {
            int i = 0;
            while (true) {
                str2 = str == null ? "" : str;
                if (i >= m2495()) {
                    break;
                }
                InterfaceC2150 interfaceC2150M2496 = m2496(i);
                sb.append(str2);
                if (!(interfaceC2150M2496 instanceof C4607) && !(interfaceC2150M2496 instanceof C4493)) {
                    sb.append(interfaceC2150M2496.mo1607());
                }
                i++;
            }
            sb.delete(0, str2.length());
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۦ۟ */
    public final Iterator m2500() {
        return this.f4060.keySet().iterator();
    }

    /* JADX INFO: renamed from: ۦۨ */
    public final List m2501() {
        ArrayList arrayList = new ArrayList(m2495());
        for (int i = 0; i < m2495(); i++) {
            arrayList.add(m2496(i));
        }
        return arrayList;
    }

    public C1173() {
        this.f4060 = new TreeMap();
        this.f4059 = new TreeMap();
    }
}
