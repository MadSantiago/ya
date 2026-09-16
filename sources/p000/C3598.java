package p000;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: ۦُؚّؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3598 implements Map, Serializable, InterfaceC1993 {

    /* JADX INFO: renamed from: ۥۧ */
    public static final C3598 f11965;

    /* JADX INFO: renamed from: ۥؓ */
    public boolean f11966;

    /* JADX INFO: renamed from: ۥؖ */
    public C0890 f11967;

    /* JADX INFO: renamed from: ۥَ */
    public int f11968;

    /* JADX INFO: renamed from: ۥْ */
    public int[] f11969;

    /* JADX INFO: renamed from: ۥٓ */
    public int[] f11970;

    /* JADX INFO: renamed from: ۥٖ */
    public int f11971;

    /* JADX INFO: renamed from: ۥٙ */
    public C4552 f11972;

    /* JADX INFO: renamed from: ۥۖ */
    public int f11973;

    /* JADX INFO: renamed from: ۦٕ */
    public C0890 f11974;

    /* JADX INFO: renamed from: ۦٗ */
    public int f11975;

    /* JADX INFO: renamed from: ۦۛ */
    public int f11976;

    /* JADX INFO: renamed from: ۦ۟ */
    public Object[] f11977;

    /* JADX INFO: renamed from: ۦۨ */
    public Object[] f11978;

    static {
        C3598 c3598 = new C3598(0);
        c3598.f11966 = true;
        f11965 = c3598;
    }

    public C3598(int i) {
        if (i < 0) {
            C1078.m2272("capacity must be non-negative.");
            throw null;
        }
        Object[] objArr = new Object[i];
        int[] iArr = new int[i];
        int iHighestOneBit = Integer.highestOneBit((i < 1 ? 1 : i) * 3);
        this.f11978 = objArr;
        this.f11977 = null;
        this.f11969 = iArr;
        this.f11970 = new int[iHighestOneBit];
        this.f11968 = 2;
        this.f11971 = 0;
        this.f11975 = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
    }

    @Override // java.util.Map
    public final void clear() {
        m6404();
        int i = this.f11971 - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.f11969;
                int i3 = iArr[i2];
                if (i3 >= 0) {
                    this.f11970[i3] = 0;
                    iArr[i2] = -1;
                }
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        AbstractC1631.m3403(this.f11978, 0, this.f11971);
        Object[] objArr = this.f11977;
        if (objArr != null) {
            AbstractC1631.m3403(objArr, 0, this.f11971);
        }
        this.f11973 = 0;
        this.f11971 = 0;
        this.f11976++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return m6406(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        int i;
        int i2 = this.f11971;
        while (true) {
            i = -1;
            i2--;
            if (i2 >= 0) {
                if (this.f11969[i2] >= 0 && AbstractC3831.m6874(this.f11977[i2], obj)) {
                    i = i2;
                    break;
                }
            } else {
                break;
            }
        }
        return i >= 0;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        C0890 c0890 = this.f11967;
        if (c0890 != null) {
            return c0890;
        }
        C0890 c0891 = new C0890(this, 0);
        this.f11967 = c0891;
        return c0891;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this.f11973 == map.size()) {
                for (Object obj2 : map.entrySet()) {
                    if (obj2 != null) {
                        try {
                            Map.Entry entry = (Map.Entry) obj2;
                            int iM6406 = m6406(entry.getKey());
                            if (!(iM6406 < 0 ? false : AbstractC3831.m6874(this.f11977[iM6406], entry.getValue()))) {
                            }
                        } catch (ClassCastException unused) {
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int iM6406 = m6406(obj);
        if (iM6406 < 0) {
            return null;
        }
        return this.f11977[iM6406];
    }

    @Override // java.util.Map
    public final int hashCode() {
        C0893 c0893 = new C0893(this, 0);
        int i = 0;
        while (c0893.hasNext()) {
            int i2 = c0893.f16403;
            C3598 c3598 = (C3598) c0893.f16401;
            if (i2 >= c3598.f11971) {
                C0178.m381();
                return 0;
            }
            c0893.f16403 = i2 + 1;
            c0893.f16402 = i2;
            Object obj = c3598.f11978[i2];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object obj2 = c3598.f11977[c0893.f16402];
            int iHashCode2 = obj2 != null ? obj2.hashCode() : 0;
            c0893.m8336();
            i += iHashCode ^ iHashCode2;
        }
        return i;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f11973 == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        C0890 c0890 = this.f11974;
        if (c0890 != null) {
            return c0890;
        }
        C0890 c0891 = new C0890(this, 1);
        this.f11974 = c0891;
        return c0891;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        m6404();
        int iM6409 = m6409(obj);
        Object[] objArr = this.f11977;
        if (objArr == null) {
            int length = this.f11978.length;
            if (length < 0) {
                C1078.m2272("capacity must be non-negative.");
                return null;
            }
            objArr = new Object[length];
            this.f11977 = objArr;
        }
        if (iM6409 >= 0) {
            objArr[iM6409] = obj2;
            return null;
        }
        int i = (-iM6409) - 1;
        Object obj3 = objArr[i];
        objArr[i] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        m6404();
        Set<Map.Entry> setEntrySet = map.entrySet();
        if (setEntrySet.isEmpty()) {
            return;
        }
        m6405(setEntrySet.size());
        for (Map.Entry entry : setEntrySet) {
            int iM6409 = m6409(entry.getKey());
            Object[] objArr = this.f11977;
            if (objArr == null) {
                int length = this.f11978.length;
                if (length < 0) {
                    C1078.m2272("capacity must be non-negative.");
                    return;
                } else {
                    objArr = new Object[length];
                    this.f11977 = objArr;
                }
            }
            if (iM6409 >= 0) {
                objArr[iM6409] = entry.getValue();
            } else {
                int i = (-iM6409) - 1;
                if (!AbstractC3831.m6874(entry.getValue(), objArr[i])) {
                    objArr[i] = entry.getValue();
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        m6404();
        int iM6406 = m6406(obj);
        if (iM6406 < 0) {
            return null;
        }
        Object obj2 = this.f11977[iM6406];
        m6411(iM6406);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f11973;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.f11973 * 3) + 2);
        sb.append("{");
        int i = 0;
        C0893 c0893 = new C0893(this, i);
        while (c0893.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            int i2 = c0893.f16403;
            C3598 c3598 = (C3598) c0893.f16401;
            if (i2 >= c3598.f11971) {
                C0178.m381();
                return null;
            }
            c0893.f16403 = i2 + 1;
            c0893.f16402 = i2;
            Object obj = c3598.f11978[i2];
            if (obj == c3598) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object obj2 = c3598.f11977[c0893.f16402];
            if (obj2 == c3598) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            c0893.m8336();
            i++;
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        C4552 c4552 = this.f11972;
        if (c4552 != null) {
            return c4552;
        }
        C4552 c4553 = new C4552(this);
        this.f11972 = c4553;
        return c4553;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final void m6404() {
        if (this.f11966) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: ۥُ */
    public final void m6405(int i) {
        Object[] objArr = this.f11978;
        int length = objArr.length;
        int i2 = this.f11971;
        int i3 = length - i2;
        int i4 = i2 - this.f11973;
        if (i3 < i && i3 + i4 >= i && i4 >= objArr.length / 4) {
            m6410(true);
            return;
        }
        int i5 = i2 + i;
        if (i5 < 0) {
            throw new OutOfMemoryError();
        }
        if (i5 > objArr.length) {
            int length2 = objArr.length;
            int i6 = length2 + (length2 >> 1);
            if (i6 - i5 < 0) {
                i6 = i5;
            }
            if (i6 - 2147483639 > 0) {
                i6 = i5 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            this.f11978 = Arrays.copyOf(objArr, i6);
            Object[] objArr2 = this.f11977;
            this.f11977 = objArr2 != null ? Arrays.copyOf(objArr2, i6) : null;
            this.f11969 = Arrays.copyOf(this.f11969, i6);
            int iHighestOneBit = Integer.highestOneBit((i6 >= 1 ? i6 : 1) * 3);
            if (iHighestOneBit > this.f11970.length) {
                m6408(iHighestOneBit);
            }
        }
    }

    /* JADX INFO: renamed from: ۥّ */
    public final int m6406(Object obj) {
        int iM6412 = m6412(obj);
        int i = this.f11968;
        while (true) {
            int i2 = this.f11970[iM6412];
            if (i2 == 0) {
                return -1;
            }
            int i3 = i2 - 1;
            if (AbstractC3831.m6874(this.f11978[i3], obj)) {
                return i3;
            }
            i--;
            if (i < 0) {
                return -1;
            }
            iM6412 = iM6412 == 0 ? this.f11970.length - 1 : iM6412 - 1;
        }
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final C3598 m6407() {
        m6404();
        this.f11966 = true;
        return this.f11973 > 0 ? this : f11965;
    }

    /* JADX INFO: renamed from: ۥۜ */
    public final void m6408(int i) {
        int[] iArr;
        this.f11976++;
        int i2 = 0;
        if (this.f11971 > this.f11973) {
            m6410(false);
        }
        this.f11970 = new int[i];
        this.f11975 = Integer.numberOfLeadingZeros(i) + 1;
        while (i2 < this.f11971) {
            int i3 = i2 + 1;
            int iM6412 = m6412(this.f11978[i2]);
            int i4 = this.f11968;
            while (true) {
                iArr = this.f11970;
                if (iArr[iM6412] == 0) {
                    break;
                }
                i4--;
                if (i4 < 0) {
                    C1078.m2276("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
                    return;
                }
                iM6412 = iM6412 == 0 ? iArr.length - 1 : iM6412 - 1;
            }
            iArr[iM6412] = i3;
            this.f11969[i2] = iM6412;
            i2 = i3;
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final int m6409(Object obj) {
        m6404();
        while (true) {
            int iM6412 = m6412(obj);
            int i = this.f11968 * 2;
            int length = this.f11970.length / 2;
            if (i > length) {
                i = length;
            }
            int i2 = 0;
            while (true) {
                int[] iArr = this.f11970;
                int i3 = iArr[iM6412];
                if (i3 == 0) {
                    int i4 = this.f11971;
                    Object[] objArr = this.f11978;
                    if (i4 >= objArr.length) {
                        m6405(1);
                        break;
                    }
                    int i5 = i4 + 1;
                    this.f11971 = i5;
                    objArr[i4] = obj;
                    this.f11969[i4] = iM6412;
                    iArr[iM6412] = i5;
                    this.f11973++;
                    this.f11976++;
                    if (i2 > this.f11968) {
                        this.f11968 = i2;
                    }
                    return i4;
                }
                if (AbstractC3831.m6874(this.f11978[i3 - 1], obj)) {
                    return -i3;
                }
                i2++;
                if (i2 > i) {
                    m6408(this.f11970.length * 2);
                    break;
                }
                iM6412 = iM6412 == 0 ? this.f11970.length - 1 : iM6412 - 1;
            }
        }
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final void m6410(boolean z) {
        int i;
        Object[] objArr = this.f11977;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.f11971;
            if (i2 >= i) {
                break;
            }
            int[] iArr = this.f11969;
            int i4 = iArr[i2];
            if (i4 >= 0) {
                Object[] objArr2 = this.f11978;
                objArr2[i3] = objArr2[i2];
                if (objArr != null) {
                    objArr[i3] = objArr[i2];
                }
                if (z) {
                    iArr[i3] = i4;
                    this.f11970[i4] = i3 + 1;
                }
                i3++;
            }
            i2++;
        }
        AbstractC1631.m3403(this.f11978, i3, i);
        if (objArr != null) {
            AbstractC1631.m3403(objArr, i3, this.f11971);
        }
        this.f11971 = i3;
    }

    /* JADX INFO: renamed from: ۦٛ */
    public final void m6411(int i) {
        int i2;
        int i3;
        int iM6412;
        int[] iArr;
        this.f11978[i] = null;
        Object[] objArr = this.f11977;
        if (objArr != null) {
            objArr[i] = null;
        }
        int length = this.f11969[i];
        loop0: while (true) {
            int i4 = length;
            int i5 = 0;
            do {
                length = length == 0 ? this.f11970.length - 1 : length - 1;
                int[] iArr2 = this.f11970;
                i2 = iArr2[length];
                i5++;
                if (i5 > this.f11968) {
                    iArr2[i4] = 0;
                    break loop0;
                } else if (i2 == 0) {
                    iArr2[i4] = 0;
                    break loop0;
                } else {
                    i3 = i2 - 1;
                    iM6412 = m6412(this.f11978[i3]) - length;
                    iArr = this.f11970;
                }
            } while ((iM6412 & (iArr.length - 1)) < i5);
            iArr[i4] = i2;
            this.f11969[i3] = i4;
        }
        this.f11969[i] = -1;
        this.f11973--;
        this.f11976++;
    }

    /* JADX INFO: renamed from: ۦۙ */
    public final int m6412(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.f11975;
    }

    public C3598() {
        this(8);
    }
}
