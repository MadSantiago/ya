package p000;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: ۦۡؑٝؒ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5441 extends AbstractMap {

    /* JADX INFO: renamed from: ۥٖ */
    public static final C1206 f17952 = new C1206(18);

    /* JADX INFO: renamed from: ۥَ */
    public String f17953;

    /* JADX INFO: renamed from: ۥْ */
    public final C1354 f17954;

    /* JADX INFO: renamed from: ۥٓ */
    public Integer f17955;

    /* JADX INFO: renamed from: ۦ۟ */
    public final int[] f17956;

    /* JADX INFO: renamed from: ۦۨ */
    public final Object[] f17957;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractMap, ۦۡؑٝؒ] */
    /* JADX WARN: Type inference failed for: r0v1, types: [ۦۡؑٝؒ] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public C5441(C5441 c5441, C5441 c5442) {
        Object obj;
        Object[] objArr;
        ?? abstractMap = new AbstractMap();
        abstractMap.f17954 = new C1354(abstractMap, -1);
        abstractMap.f17955 = null;
        abstractMap.f17953 = null;
        int size = c5442.size() + c5441.size();
        int i = c5441.f17956[c5441.size()] + c5442.f17956[c5442.size()];
        int i2 = size + 1;
        Object[] objArr2 = new Object[i];
        int[] iArr = new int[i2];
        int i3 = 0;
        iArr[0] = size;
        Map.Entry entryM9117 = c5441.m9117(0);
        Map.Entry entryM9118 = c5442.m9117(0);
        int i4 = 0;
        int i5 = 0;
        int iM9118 = size;
        int i6 = 0;
        while (true) {
            if (entryM9117 == null && entryM9118 == null) {
                break;
            }
            i6++;
            if (entryM9117 != null) {
                if (entryM9118 != null) {
                    int iCompareTo = ((String) entryM9117.getKey()).compareTo((String) entryM9118.getKey());
                    if (iCompareTo == 0) {
                        int i7 = i4 + 1;
                        int i8 = i5 + 1;
                        objArr2[i6] = new AbstractMap.SimpleImmutableEntry((String) entryM9117.getKey(), new C1354(abstractMap, i6));
                        C1354 c1354 = (C1354) entryM9117.getValue();
                        C1354 c1355 = (C1354) entryM9118.getValue();
                        int i9 = 0;
                        int i10 = 0;
                        abstractMap = abstractMap;
                        while (true) {
                            int iM2863 = c1354.m2863();
                            C5441 c5443 = c1354.f4658;
                            if (i9 >= iM2863 - c1354.m2862() && i10 >= c1355.m2863() - c1355.m2862()) {
                                break;
                            }
                            int iCompare = i9 == c1354.m2863() - c1354.m2862() ? 1 : i10 == c1355.m2863() - c1355.m2862() ? -1 : 0;
                            if (iCompare == 0) {
                                C1206 c1206 = C5324.f17569;
                                iCompare = C5324.f17569.compare(c5443.f17957[c1354.m2862() + i9], c1355.f4658.f17957[c1355.m2862() + i10]);
                            }
                            if (iCompare < 0) {
                                i9++;
                                obj = c5443.f17957[c1354.m2862() + i9];
                            } else {
                                int i11 = i10 + 1;
                                Object obj2 = c1355.f4658.f17957[c1355.m2862() + i10];
                                if (iCompare == 0) {
                                    i10 = i11;
                                    obj = obj2;
                                    i9++;
                                } else {
                                    i10 = i11;
                                    obj = obj2;
                                    i9 = i9;
                                }
                            }
                            objArr2[iM9118] = obj;
                            abstractMap = this;
                            iM9118++;
                        }
                        iArr[i6] = iM9118;
                        entryM9117 = c5441.m9117(i8);
                        entryM9118 = c5442.m9117(i7);
                        i5 = i8;
                        i4 = i7;
                        i3 = 0;
                    } else {
                        if (iCompareTo < 0) {
                        }
                        i3 = 0;
                        abstractMap = this;
                    }
                }
                i5++;
                iM9118 = m9118(entryM9117, i6, iM9118, objArr2, iArr);
                entryM9117 = c5441.m9117(i5);
                i3 = 0;
                abstractMap = this;
            }
            Map.Entry entry = entryM9117;
            i4++;
            int iM9119 = m9118(entryM9118, i6, iM9118, objArr2, iArr);
            entryM9118 = c5442.m9117(i4);
            iM9118 = iM9119;
            entryM9117 = entry;
            i3 = 0;
            abstractMap = this;
        }
        int i12 = iArr[i3];
        int i13 = i12 - i6;
        if (i13 != 0) {
            for (int i14 = i3; i14 <= i6; i14++) {
                iArr[i14] = iArr[i14] - i13;
            }
            int i15 = iArr[i6];
            int i16 = i15 - i6;
            if (m9116(i, i15)) {
                objArr = new Object[i15];
                System.arraycopy(objArr2, i3, objArr, i3, i6);
            } else {
                objArr = objArr2;
            }
            System.arraycopy(objArr2, i12, objArr, i6, i16);
            objArr2 = objArr;
        }
        abstractMap.f17957 = objArr2;
        int i17 = iArr[i3] + 1;
        abstractMap.f17956 = m9116(i2, i17) ? Arrays.copyOf(iArr, i17) : iArr;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static boolean m9116(int i, int i2) {
        return i > 16 && i * 9 > i2 * 10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return this.f17954;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        Integer numValueOf = this.f17955;
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(super.hashCode());
            this.f17955 = numValueOf;
        }
        return numValueOf.intValue();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        String str = this.f17953;
        if (str != null) {
            return str;
        }
        String string = super.toString();
        this.f17953 = string;
        return string;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final Map.Entry m9117(int i) {
        if (i < this.f17956[0]) {
            return (Map.Entry) this.f17957[i];
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final int m9118(Map.Entry entry, int i, int i2, Object[] objArr, int[] iArr) {
        C1354 c1354 = (C1354) entry.getValue();
        int iM2863 = c1354.m2863() - c1354.m2862();
        System.arraycopy(c1354.f4658.f17957, c1354.m2862(), objArr, i2, iM2863);
        objArr[i] = new AbstractMap.SimpleImmutableEntry((String) entry.getKey(), new C1354(this, i));
        int i3 = i2 + iM2863;
        iArr[i + 1] = i3;
        return i3;
    }

    public C5441() {
        List list = Collections.EMPTY_LIST;
        this.f17954 = new C1354(this, -1);
        this.f17955 = null;
        this.f17953 = null;
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            int size = list.size();
            Object[] objArr = new Object[size];
            Iterator it2 = list.iterator();
            if (!it2.hasNext()) {
                int[] iArr = {0};
                this.f17957 = m9116(size, 0) ? Arrays.copyOf(objArr, 0) : objArr;
                this.f17956 = iArr;
                return;
            }
            throw AbstractC5078.m8675(it2);
        }
        throw AbstractC5078.m8675(it);
    }
}
