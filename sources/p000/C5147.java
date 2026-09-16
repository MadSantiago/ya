package p000;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: renamed from: ۦٜۚؑۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5147 implements Map, Serializable {

    /* JADX INFO: renamed from: ۦٗ */
    public static final C5147 f17050 = new C5147(0, null, new Object[0]);

    /* JADX INFO: renamed from: ۥَ */
    public final transient Object[] f17051;

    /* JADX INFO: renamed from: ۥْ */
    public transient C2299 f17052;

    /* JADX INFO: renamed from: ۥٓ */
    public final transient Object f17053;

    /* JADX INFO: renamed from: ۥٖ */
    public final transient int f17054;

    /* JADX INFO: renamed from: ۦ۟ */
    public transient C2555 f17055;

    /* JADX INFO: renamed from: ۦۨ */
    public transient C0725 f17056;

    public C5147(int i, Object obj, Object[] objArr) {
        this.f17053 = obj;
        this.f17051 = objArr;
        this.f17054 = i;
    }

    /* JADX WARN: Code duplicated, block: B:74:0x0199  */
    /* JADX WARN: Code duplicated, block: B:76:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:77:0x01b6  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object[]] */
    /* JADX INFO: renamed from: ۥۣ */
    public static C5147 m8751(int i, Object[] objArr, C3510 c3510) {
        boolean z;
        int i2;
        char c;
        ?? r3;
        char c2;
        short[] sArr;
        boolean z2;
        int i3;
        ?? r16;
        boolean z3;
        ?? r4;
        Object[] objArr2;
        C0479 c0479;
        boolean z4;
        int i4 = i;
        Object[] objArrCopyOf = objArr;
        if (i4 == 0) {
            return f17050;
        }
        C0479 c04710 = null;
        ?? r5 = 0;
        C0479 c04711 = null;
        C0479 c04712 = null;
        boolean z5 = false;
        int i5 = 1;
        if (i4 == 1) {
            Objects.requireNonNull(objArrCopyOf[0]);
            Objects.requireNonNull(objArrCopyOf[1]);
            return new C5147(1, null, objArrCopyOf);
        }
        AbstractC0949.m1963(i4, objArrCopyOf.length >> 1);
        int iM8195 = AbstractC4821.m8195(i4);
        char c3 = 2;
        if (i4 != 1) {
            int i6 = iM8195 - 1;
            if (iM8195 <= 128) {
                byte[] bArr = new byte[iM8195];
                Arrays.fill(bArr, (byte) -1);
                int i7 = 0;
                int i8 = 0;
                while (i7 < i4) {
                    int i9 = i7 * 2;
                    int i10 = i8 * 2;
                    Object obj = objArrCopyOf[i9];
                    Objects.requireNonNull(obj);
                    Object obj2 = objArrCopyOf[i9 ^ i5];
                    Objects.requireNonNull(obj2);
                    int iM4206 = AbstractC2164.m4206(obj.hashCode());
                    while (true) {
                        int i11 = iM4206 & i6;
                        z2 = z5;
                        i3 = i5;
                        int i12 = bArr[i11] & 255;
                        if (i12 == 255) {
                            bArr[i11] = (byte) i10;
                            if (i8 < i7) {
                                objArrCopyOf[i10] = obj;
                                objArrCopyOf[i10 ^ 1] = obj2;
                            }
                            i8++;
                            break;
                        }
                        if (obj.equals(objArrCopyOf[i12 == true ? 1 : 0])) {
                            int i13 = ~i12;
                            Object obj3 = objArrCopyOf[i13 == true ? 1 : 0];
                            Objects.requireNonNull(obj3);
                            c04711 = new C0479(obj, obj2, obj3);
                            objArrCopyOf[i13 == true ? 1 : 0] = obj2;
                            break;
                        }
                        iM4206 = i11 + 1;
                        z5 = z2;
                        i5 = i3;
                    }
                    i7++;
                    z5 = z2;
                    i5 = i3;
                }
                z = z5;
                i2 = i5;
                if (i8 == i4) {
                    r5 = bArr;
                    z4 = z;
                } else {
                    sArr = new Object[3];
                    sArr[z ? 1 : 0] = bArr;
                    sArr[i2] = Integer.valueOf(i8);
                    sArr[2] = c04711;
                    r5 = sArr;
                    z4 = z;
                }
            } else {
                z = false;
                i2 = 1;
                if (iM8195 <= 32768) {
                    sArr = new short[iM8195];
                    Arrays.fill(sArr, (short) -1);
                    int i14 = 0;
                    for (int i15 = 0; i15 < i4; i15++) {
                        int i16 = i15 * 2;
                        int i17 = i14 * 2;
                        Object obj4 = objArrCopyOf[i16];
                        Objects.requireNonNull(obj4);
                        Object obj5 = objArrCopyOf[i16 ^ 1];
                        Objects.requireNonNull(obj5);
                        int iM4207 = AbstractC2164.m4206(obj4.hashCode());
                        while (true) {
                            int i18 = iM4207 & i6;
                            int i19 = sArr[i18] & 65535;
                            if (i19 == 65535) {
                                sArr[i18] = (short) i17;
                                if (i14 < i15) {
                                    objArrCopyOf[i17] = obj4;
                                    objArrCopyOf[i17 ^ 1] = obj5;
                                }
                                i14++;
                                break;
                            }
                            if (obj4.equals(objArrCopyOf[i19 == true ? 1 : 0])) {
                                int i20 = ~i19;
                                Object obj6 = objArrCopyOf[i20 == true ? 1 : 0];
                                Objects.requireNonNull(obj6);
                                c04712 = new C0479(obj4, obj5, obj6);
                                objArrCopyOf[i20 == true ? 1 : 0] = obj5;
                                break;
                            }
                            iM4207 = i18 + 1;
                        }
                    }
                    if (i14 == i4) {
                        r5 = sArr;
                        z4 = z;
                    } else {
                        r5 = new Object[]{sArr, Integer.valueOf(i14), c04712};
                        z4 = z;
                    }
                } else {
                    int[] iArr = new int[iM8195];
                    Arrays.fill(iArr, -1);
                    int i21 = 0;
                    int i22 = 0;
                    while (i21 < i4) {
                        int i23 = i21 * 2;
                        int i24 = i22 * 2;
                        Object obj7 = objArrCopyOf[i23];
                        Objects.requireNonNull(obj7);
                        Object obj8 = objArrCopyOf[i23 ^ 1];
                        Objects.requireNonNull(obj8);
                        int iM4208 = AbstractC2164.m4206(obj7.hashCode());
                        while (true) {
                            int i25 = iM4208 & i6;
                            int i26 = iArr[i25];
                            if (i26 == -1) {
                                iArr[i25] = i24;
                                if (i22 < i21) {
                                    objArrCopyOf[i24] = obj7;
                                    objArrCopyOf[i24 ^ 1] = obj8;
                                }
                                i22++;
                                c2 = c3;
                                break;
                            }
                            c2 = c3;
                            if (obj7.equals(objArrCopyOf[i26])) {
                                int i27 = i26 ^ 1;
                                Object obj9 = objArrCopyOf[i27];
                                Objects.requireNonNull(obj9);
                                c04710 = new C0479(obj7, obj8, obj9);
                                objArrCopyOf[i27] = obj8;
                                break;
                            }
                            iM4208 = i25 + 1;
                            c3 = c2;
                        }
                        i21++;
                        c3 = c2;
                    }
                    c = c3;
                    if (i22 == i4) {
                        r3 = iArr;
                        r16 = z;
                    } else {
                        Object[] objArr3 = new Object[3];
                        objArr3[0] = iArr;
                        objArr3[1] = Integer.valueOf(i22);
                        objArr3[c] = c04710;
                        r3 = objArr3;
                        r16 = z;
                    }
                }
            }
            z3 = r3 instanceof Object[];
            r4 = r3;
            if (z3) {
                objArr2 = (Object[]) r3;
                c0479 = (C0479) objArr2[c];
                if (c3510 != null) {
                    throw c0479.m1027();
                }
                c3510.f11624 = c0479;
                Object obj10 = objArr2[r16];
                int iIntValue = ((Integer) objArr2[i2]).intValue();
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue * 2);
                r4 = obj10;
                i4 = iIntValue;
            }
            return new C5147(i4, r4, objArrCopyOf);
        }
        Objects.requireNonNull(objArrCopyOf[0]);
        Objects.requireNonNull(objArrCopyOf[1]);
        z4 = false;
        i2 = 1;
        c = 2;
        r3 = r5;
        r16 = z4;
        z3 = r3 instanceof Object[];
        r4 = r3;
        if (z3) {
            objArr2 = (Object[]) r3;
            c0479 = (C0479) objArr2[c];
            if (c3510 != null) {
                throw c0479.m1027();
            }
            c3510.f11624 = c0479;
            Object obj11 = objArr2[r16];
            int iIntValue2 = ((Integer) objArr2[i2]).intValue();
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue2 * 2);
            r4 = obj11;
            i4 = iIntValue2;
        }
        return new C5147(i4, r4, objArrCopyOf);
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        C2299 c2299 = this.f17052;
        if (c2299 == null) {
            c2299 = new C2299(this.f17051, 1, this.f17054);
            this.f17052 = c2299;
        }
        return c2299.contains(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        C0725 c0725 = this.f17056;
        if (c0725 != null) {
            return c0725;
        }
        C0725 c0726 = new C0725(this, this.f17051, this.f17054);
        this.f17056 = c0726;
        return c0726;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        return ((AbstractC4821) entrySet()).equals(((Map) obj).entrySet());
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0003  */
    @Override // java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        if (obj == null) {
            obj2 = null;
        } else {
            Object[] objArr = this.f17051;
            if (this.f17054 == 1) {
                Object obj3 = objArr[0];
                Objects.requireNonNull(obj3);
                if (obj3.equals(obj)) {
                    obj2 = objArr[1];
                    Objects.requireNonNull(obj2);
                } else {
                    obj2 = null;
                }
            } else {
                Object obj4 = this.f17053;
                if (obj4 == null) {
                    obj2 = null;
                } else if (obj4 instanceof byte[]) {
                    byte[] bArr = (byte[]) obj4;
                    int length = bArr.length - 1;
                    int iM4206 = AbstractC2164.m4206(obj.hashCode());
                    while (true) {
                        int i = iM4206 & length;
                        int i2 = bArr[i] & 255;
                        if (i2 == 255) {
                            break;
                        }
                        if (obj.equals(objArr[i2])) {
                            obj2 = objArr[i2 ^ 1];
                        } else {
                            iM4206 = i + 1;
                        }
                    }
                    obj2 = null;
                } else if (obj4 instanceof short[]) {
                    short[] sArr = (short[]) obj4;
                    int length2 = sArr.length - 1;
                    int iM4207 = AbstractC2164.m4206(obj.hashCode());
                    while (true) {
                        int i3 = iM4207 & length2;
                        int i4 = sArr[i3] & 65535;
                        if (i4 == 65535) {
                            break;
                        }
                        if (obj.equals(objArr[i4])) {
                            obj2 = objArr[i4 ^ 1];
                        } else {
                            iM4207 = i3 + 1;
                        }
                    }
                    obj2 = null;
                } else {
                    int[] iArr = (int[]) obj4;
                    int length3 = iArr.length - 1;
                    int iM4208 = AbstractC2164.m4206(obj.hashCode());
                    while (true) {
                        int i5 = iM4208 & length3;
                        int i6 = iArr[i5];
                        if (i6 == -1) {
                            break;
                        }
                        if (obj.equals(objArr[i6])) {
                            obj2 = objArr[i6 ^ 1];
                        } else {
                            iM4208 = i5 + 1;
                        }
                    }
                    obj2 = null;
                }
            }
        }
        if (obj2 == null) {
            return null;
        }
        return obj2;
    }

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        C0725 c0725 = this.f17056;
        if (c0725 == null) {
            c0725 = new C0725(this, this.f17051, this.f17054);
            this.f17056 = c0725;
        }
        return AbstractC2552.m4829(c0725);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        C2555 c2555 = this.f17055;
        if (c2555 != null) {
            return c2555;
        }
        C2555 c2556 = new C2555(this, new C2299(this.f17051, 0, this.f17054));
        this.f17055 = c2556;
        return c2556;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final int size() {
        return this.f17054;
    }

    public final String toString() {
        int i = this.f17054;
        AbstractC3933.m7099(i, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(((long) i) * 8, 1073741824L));
        sb.append('{');
        AbstractC0219 it = ((C0725) entrySet()).iterator();
        boolean z = true;
        while (true) {
            C1868 c1868 = (C1868) it;
            if (!c1868.hasNext()) {
                sb.append('}');
                return sb.toString();
            }
            Map.Entry entry = (Map.Entry) c1868.next();
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        C2299 c2299 = this.f17052;
        if (c2299 != null) {
            return c2299;
        }
        C2299 c22910 = new C2299(this.f17051, 1, this.f17054);
        this.f17052 = c22910;
        return c22910;
    }
}
