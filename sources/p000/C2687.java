package p000;

import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.security.AccessController;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: ۥۤؖٛ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2687 implements InterfaceC1622 {

    /* JADX INFO: renamed from: ۦۚ */
    public static final int[] f8913 = new int[0];

    /* JADX INFO: renamed from: ۦۨ */
    public static final Unsafe f8914;

    /* JADX INFO: renamed from: ۥؗ */
    public final int f8915;

    /* JADX INFO: renamed from: ۥُ */
    public final AbstractC0066 f8916;

    /* JADX INFO: renamed from: ۥّ */
    public final boolean f8917;

    /* JADX INFO: renamed from: ۥۗ */
    public final Object[] f8918;

    /* JADX INFO: renamed from: ۥۜ */
    public final int f8919;

    /* JADX INFO: renamed from: ۥۣ */
    public final int[] f8920;

    /* JADX INFO: renamed from: ۦؑ */
    public final int f8921;

    /* JADX INFO: renamed from: ۦؚ */
    public final C0841 f8922;

    /* JADX INFO: renamed from: ۦٌ */
    public final C0847 f8923;

    /* JADX INFO: renamed from: ۦِ */
    public final C4684 f8924;

    /* JADX INFO: renamed from: ۦٛ */
    public final int f8925;

    /* JADX INFO: renamed from: ۦۗ */
    public final C0750 f8926;

    /* JADX INFO: renamed from: ۦۙ */
    public final int[] f8927;

    static {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new C0051(1));
        } catch (Throwable unused) {
            unsafe = null;
        }
        f8914 = unsafe;
    }

    public C2687(int[] iArr, Object[] objArr, int i, int i2, AbstractC0066 abstractC0066, int[] iArr2, int i3, int i4, C4684 c4684, C0750 c0750, C0841 c0841, C2637 c2637, C0847 c0847) {
        this.f8920 = iArr;
        this.f8918 = objArr;
        this.f8915 = i;
        this.f8921 = i2;
        this.f8917 = abstractC0066 instanceof AbstractC0318;
        this.f8927 = iArr2;
        this.f8919 = i3;
        this.f8925 = i4;
        this.f8924 = c4684;
        this.f8926 = c0750;
        this.f8922 = c0841;
        this.f8916 = abstractC0066;
        this.f8923 = c0847;
    }

    /* JADX INFO: renamed from: ۥؖ */
    public static long m4995(long j, Object obj) {
        return ((Long) AbstractC1194.m2515(j, obj)).longValue();
    }

    /* JADX INFO: renamed from: ۥٙ */
    public static int m4996(long j, Object obj) {
        return ((Integer) AbstractC1194.m2515(j, obj)).intValue();
    }

    /* JADX WARN: Code duplicated, block: B:124:0x026b  */
    /* JADX WARN: Code duplicated, block: B:126:0x0272  */
    /* JADX WARN: Code duplicated, block: B:129:0x0288  */
    /* JADX WARN: Code duplicated, block: B:130:0x028b  */
    /* JADX INFO: renamed from: ۥۖ */
    public static C2687 m4997(C4022 c4022, C4684 c4684, C0750 c0750, C0841 c0841, C2637 c2637, C0847 c0847) {
        int i;
        int iCharAt;
        int i2;
        int i3;
        int i4;
        int[] iArr;
        int i5;
        int i6;
        int i7;
        int i8;
        char cCharAt;
        int i9;
        char cCharAt2;
        int i10;
        char cCharAt3;
        int i11;
        char cCharAt4;
        int i12;
        char cCharAt5;
        int i13;
        char cCharAt6;
        int i14;
        char cCharAt7;
        int i15;
        char cCharAt8;
        int i16;
        int i17;
        int i18;
        int i19;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i20;
        int i21;
        int iObjectFieldOffset3;
        Field fieldM4998;
        char cCharAt9;
        int i22;
        int i23;
        int i24;
        int i25;
        Object obj;
        Field fieldM4999;
        int i26;
        Object obj2;
        Field fieldM49910;
        int i27;
        char cCharAt10;
        int i28;
        int i29;
        char cCharAt11;
        int i30;
        char cCharAt12;
        int i31;
        char cCharAt13;
        if (!(c4022 instanceof C4022)) {
            C0178.m382();
            return null;
        }
        String str = c4022.f13414;
        int length = str.length();
        char c = 55296;
        if (str.charAt(0) >= 55296) {
            int i32 = 1;
            while (true) {
                i = i32 + 1;
                if (str.charAt(i32) < 55296) {
                    break;
                }
                i32 = i;
            }
        } else {
            i = 1;
        }
        int i33 = i + 1;
        int iCharAt2 = str.charAt(i);
        if (iCharAt2 >= 55296) {
            int i34 = iCharAt2 & 8191;
            int i35 = 13;
            while (true) {
                i31 = i33 + 1;
                cCharAt13 = str.charAt(i33);
                if (cCharAt13 < 55296) {
                    break;
                }
                i34 |= (cCharAt13 & 8191) << i35;
                i35 += 13;
                i33 = i31;
            }
            iCharAt2 = i34 | (cCharAt13 << i35);
            i33 = i31;
        }
        if (iCharAt2 == 0) {
            i3 = 0;
            i6 = 0;
            iCharAt = 0;
            i2 = 0;
            i5 = 0;
            i7 = 0;
            iArr = f8913;
            i4 = 0;
        } else {
            int i36 = i33 + 1;
            int iCharAt3 = str.charAt(i33);
            if (iCharAt3 >= 55296) {
                int i37 = iCharAt3 & 8191;
                int i38 = 13;
                while (true) {
                    i15 = i36 + 1;
                    cCharAt8 = str.charAt(i36);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i37 |= (cCharAt8 & 8191) << i38;
                    i38 += 13;
                    i36 = i15;
                }
                iCharAt3 = i37 | (cCharAt8 << i38);
                i36 = i15;
            }
            int i39 = i36 + 1;
            int iCharAt4 = str.charAt(i36);
            if (iCharAt4 >= 55296) {
                int i40 = iCharAt4 & 8191;
                int i41 = 13;
                while (true) {
                    i14 = i39 + 1;
                    cCharAt7 = str.charAt(i39);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i40 |= (cCharAt7 & 8191) << i41;
                    i41 += 13;
                    i39 = i14;
                }
                iCharAt4 = i40 | (cCharAt7 << i41);
                i39 = i14;
            }
            int i42 = i39 + 1;
            int iCharAt5 = str.charAt(i39);
            if (iCharAt5 >= 55296) {
                int i43 = iCharAt5 & 8191;
                int i44 = 13;
                while (true) {
                    i13 = i42 + 1;
                    cCharAt6 = str.charAt(i42);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i43 |= (cCharAt6 & 8191) << i44;
                    i44 += 13;
                    i42 = i13;
                }
                iCharAt5 = i43 | (cCharAt6 << i44);
                i42 = i13;
            }
            int i45 = i42 + 1;
            int iCharAt6 = str.charAt(i42);
            if (iCharAt6 >= 55296) {
                int i46 = iCharAt6 & 8191;
                int i47 = 13;
                while (true) {
                    i12 = i45 + 1;
                    cCharAt5 = str.charAt(i45);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i46 |= (cCharAt5 & 8191) << i47;
                    i47 += 13;
                    i45 = i12;
                }
                iCharAt6 = i46 | (cCharAt5 << i47);
                i45 = i12;
            }
            int i48 = i45 + 1;
            iCharAt = str.charAt(i45);
            if (iCharAt >= 55296) {
                int i49 = iCharAt & 8191;
                int i50 = 13;
                while (true) {
                    i11 = i48 + 1;
                    cCharAt4 = str.charAt(i48);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i49 |= (cCharAt4 & 8191) << i50;
                    i50 += 13;
                    i48 = i11;
                }
                iCharAt = i49 | (cCharAt4 << i50);
                i48 = i11;
            }
            int i51 = i48 + 1;
            int iCharAt7 = str.charAt(i48);
            if (iCharAt7 >= 55296) {
                int i52 = iCharAt7 & 8191;
                int i53 = 13;
                while (true) {
                    i10 = i51 + 1;
                    cCharAt3 = str.charAt(i51);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i52 |= (cCharAt3 & 8191) << i53;
                    i53 += 13;
                    i51 = i10;
                }
                iCharAt7 = i52 | (cCharAt3 << i53);
                i51 = i10;
            }
            int i54 = i51 + 1;
            int iCharAt8 = str.charAt(i51);
            if (iCharAt8 >= 55296) {
                int i55 = iCharAt8 & 8191;
                int i56 = 13;
                while (true) {
                    i9 = i54 + 1;
                    cCharAt2 = str.charAt(i54);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i55 |= (cCharAt2 & 8191) << i56;
                    i56 += 13;
                    i54 = i9;
                }
                iCharAt8 = i55 | (cCharAt2 << i56);
                i54 = i9;
            }
            int i57 = i54 + 1;
            int iCharAt9 = str.charAt(i54);
            if (iCharAt9 >= 55296) {
                int i58 = iCharAt9 & 8191;
                int i59 = 13;
                while (true) {
                    i8 = i57 + 1;
                    cCharAt = str.charAt(i57);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i58 |= (cCharAt & 8191) << i59;
                    i59 += 13;
                    i57 = i8;
                }
                iCharAt9 = i58 | (cCharAt << i59);
                i57 = i8;
            }
            int[] iArr2 = new int[iCharAt9 + iCharAt7 + iCharAt8];
            int i60 = (iCharAt3 * 2) + iCharAt4;
            int i61 = iCharAt7;
            i2 = iCharAt5;
            i3 = i61;
            i4 = iCharAt3;
            i33 = i57;
            iArr = iArr2;
            i5 = iCharAt6;
            i6 = i60;
            i7 = iCharAt9;
        }
        Object[] objArr = c4022.f13413;
        Class<?> cls = c4022.f13415.getClass();
        int[] iArr3 = new int[iCharAt * 3];
        Object[] objArr2 = new Object[iCharAt * 2];
        int i62 = i7 + i3;
        int i63 = i62;
        int i64 = i7;
        int i65 = 0;
        int i66 = 0;
        while (i33 < length) {
            int i67 = i33 + 1;
            int iCharAt10 = str.charAt(i33);
            if (iCharAt10 >= c) {
                int i68 = iCharAt10 & 8191;
                int i69 = i67;
                int i70 = 13;
                while (true) {
                    i30 = i69 + 1;
                    cCharAt12 = str.charAt(i69);
                    if (cCharAt12 < c) {
                        break;
                    }
                    i68 |= (cCharAt12 & 8191) << i70;
                    i70 += 13;
                    i69 = i30;
                }
                iCharAt10 = i68 | (cCharAt12 << i70);
                i16 = i30;
            } else {
                i16 = i67;
            }
            int i71 = i16 + 1;
            int iCharAt11 = str.charAt(i16);
            if (iCharAt11 >= c) {
                int i72 = iCharAt11 & 8191;
                int i73 = i71;
                int i74 = 13;
                while (true) {
                    i29 = i73 + 1;
                    cCharAt11 = str.charAt(i73);
                    i17 = length;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i72 |= (cCharAt11 & 8191) << i74;
                    i74 += 13;
                    i73 = i29;
                    length = i17;
                }
                iCharAt11 = i72 | (cCharAt11 << i74);
                i18 = i29;
            } else {
                i17 = length;
                i18 = i71;
            }
            int i75 = iCharAt11 & 255;
            int i76 = iCharAt10;
            if ((iCharAt11 & 1024) != 0) {
                iArr[i65] = i66;
                i65++;
            }
            int i77 = i4;
            Unsafe unsafe = f8914;
            if (i75 >= 51) {
                int i78 = i18 + 1;
                int iCharAt12 = str.charAt(i18);
                if (iCharAt12 >= 55296) {
                    int i79 = iCharAt12 & 8191;
                    int i80 = i78;
                    int i81 = 13;
                    while (true) {
                        i27 = i80 + 1;
                        cCharAt10 = str.charAt(i80);
                        i28 = i79;
                        if (cCharAt10 < 55296) {
                            break;
                        }
                        i79 = i28 | ((cCharAt10 & 8191) << i81);
                        i81 += 13;
                        i80 = i27;
                    }
                    iCharAt12 = i28 | (cCharAt10 << i81);
                    i23 = i27;
                } else {
                    i23 = i78;
                }
                int i82 = iCharAt12;
                int i83 = i75 - 51;
                int i84 = i23;
                if (i83 == 9 || i83 == 17) {
                    i24 = i6 + 1;
                    objArr2[((i66 / 3) * 2) + 1] = objArr[i6];
                } else {
                    if (i83 == 12 && (AbstractC3761.m6625(c4022.m7194(), 1) || (iCharAt11 & 2048) != 0)) {
                        i24 = i6 + 1;
                        objArr2[((i66 / 3) * 2) + 1] = objArr[i6];
                    }
                    i25 = i82 * 2;
                    obj = objArr[i25];
                    if (obj instanceof Field) {
                        fieldM4999 = (Field) obj;
                    } else {
                        fieldM4999 = m4998(cls, (String) obj);
                        objArr[i25] = fieldM4999;
                    }
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM4999);
                    i26 = i25 + 1;
                    obj2 = objArr[i26];
                    if (obj2 instanceof Field) {
                        fieldM49910 = (Field) obj2;
                    } else {
                        fieldM49910 = m4998(cls, (String) obj2);
                        objArr[i26] = fieldM49910;
                    }
                    iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldM49910);
                    objArr2 = objArr2;
                    i20 = i84;
                    i21 = 0;
                }
                i6 = i24;
                i25 = i82 * 2;
                obj = objArr[i25];
                if (obj instanceof Field) {
                    fieldM4999 = (Field) obj;
                } else {
                    fieldM4999 = m4998(cls, (String) obj);
                    objArr[i25] = fieldM4999;
                }
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM4999);
                i26 = i25 + 1;
                obj2 = objArr[i26];
                if (obj2 instanceof Field) {
                    fieldM49910 = (Field) obj2;
                } else {
                    fieldM49910 = m4998(cls, (String) obj2);
                    objArr[i26] = fieldM49910;
                }
                iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldM49910);
                objArr2 = objArr2;
                i20 = i84;
                i21 = 0;
            } else {
                int i85 = i6 + 1;
                Field fieldM49911 = m4998(cls, (String) objArr[i6]);
                if (i75 == 9 || i75 == 17) {
                    i19 = i85;
                    objArr2[((i66 / 3) * 2) + 1] = fieldM49911.getType();
                } else {
                    if (i75 == 27 || i75 == 49) {
                        i22 = i6 + 2;
                        objArr2[((i66 / 3) * 2) + 1] = objArr[i85];
                    } else if (i75 == 12 || i75 == 30 || i75 == 44) {
                        i19 = i85;
                        if (c4022.m7194() == 1 || (iCharAt11 & 2048) != 0) {
                            i22 = i6 + 2;
                            objArr2[((i66 / 3) * 2) + 1] = objArr[i19];
                        }
                    } else if (i75 == 50) {
                        int i86 = i64 + 1;
                        iArr[i64] = i66;
                        int i87 = (i66 / 3) * 2;
                        i19 = i6 + 2;
                        objArr2[i87] = objArr[i85];
                        if ((iCharAt11 & 2048) != 0) {
                            objArr2[i87 + 1] = objArr[i19];
                            i19 = i6 + 3;
                        }
                        i64 = i86;
                    } else {
                        i19 = i85;
                    }
                    i19 = i22;
                }
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM49911);
                if ((iCharAt11 & 4096) == 0 || i75 > 17) {
                    iObjectFieldOffset2 = 1048575;
                    i20 = i18;
                    i21 = 0;
                } else {
                    int i88 = i18 + 1;
                    int iCharAt13 = str.charAt(i18);
                    if (iCharAt13 >= 55296) {
                        int i89 = iCharAt13 & 8191;
                        int i90 = 13;
                        while (true) {
                            i20 = i88 + 1;
                            cCharAt9 = str.charAt(i88);
                            if (cCharAt9 < 55296) {
                                break;
                            }
                            i89 |= (cCharAt9 & 8191) << i90;
                            i90 += 13;
                            i88 = i20;
                        }
                        iCharAt13 = i89 | (cCharAt9 << i90);
                    } else {
                        i20 = i88;
                    }
                    int i91 = (iCharAt13 / 32) + (i77 * 2);
                    Object obj3 = objArr[i91];
                    if (obj3 instanceof Field) {
                        fieldM4998 = (Field) obj3;
                    } else {
                        fieldM4998 = m4998(cls, (String) obj3);
                        objArr[i91] = fieldM4998;
                    }
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldM4998);
                    i21 = iCharAt13 % 32;
                }
                if (i75 < 18 || i75 > 49) {
                    iObjectFieldOffset3 = iObjectFieldOffset2;
                } else {
                    iArr[i63] = iObjectFieldOffset;
                    iObjectFieldOffset3 = iObjectFieldOffset2;
                    i63++;
                }
                i6 = i19;
            }
            int i92 = i66 + 1;
            iArr3[i66] = i76;
            int i93 = i66 + 2;
            String str2 = str;
            iArr3[i92] = ((iCharAt11 & 512) != 0 ? 536870912 : 0) | ((iCharAt11 & 256) != 0 ? 268435456 : 0) | ((iCharAt11 & 2048) != 0 ? Integer.MIN_VALUE : 0) | (i75 << 20) | iObjectFieldOffset;
            i66 += 3;
            iArr3[i93] = (i21 << 20) | iObjectFieldOffset3;
            objArr2 = objArr2;
            str = str2;
            i33 = i20;
            length = i17;
            i4 = i77;
            iArr3 = iArr3;
            i62 = i62;
            c = 55296;
        }
        return new C2687(iArr3, objArr2, i2, i5, c4022.f13415, iArr, i7, i62, c4684, c0750, c0841, c2637, c0847);
    }

    /* JADX INFO: renamed from: ۥۙ */
    public static Field m4998(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    /* JADX INFO: renamed from: ۥۦ */
    public static int m4999(int i) {
        return (i & 267386880) >>> 20;
    }

    /* JADX INFO: renamed from: ۦٕ */
    public static long m5000(int i) {
        return i & 1048575;
    }

    /* JADX INFO: renamed from: ۦ۟ */
    public static boolean m5001(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC0318) {
            return ((AbstractC0318) obj).m680();
        }
        return true;
    }

    /* JADX INFO: renamed from: ۥؓ */
    public final int m5002(int i) {
        if (i < this.f8915 || i > this.f8921) {
            return -1;
        }
        int[] iArr = this.f8920;
        int length = (iArr.length / 3) - 1;
        int i2 = 0;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = iArr[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:11:0x0025  */
    @Override // p000.InterfaceC1622
    /* JADX INFO: renamed from: ۥؗ */
    public final void mo3386(Object obj, Object obj2) {
        Object obj3;
        if (!m5001(obj)) {
            C0178.m385(obj, "Mutating immutable message: ");
            return;
        }
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.f8920;
            if (i >= iArr.length) {
                AbstractC0499.m1137(this.f8922, obj, obj2);
                return;
            }
            int iM5011 = m5011(i);
            long j = 1048575 & iM5011;
            int i2 = iArr[i];
            switch (m4999(iM5011)) {
                case 0:
                    if (!m5019(i, obj2)) {
                        obj3 = obj;
                    } else {
                        AbstractC5716 abstractC5716 = AbstractC1194.f4116;
                        obj3 = obj;
                        abstractC5716.mo2641(obj3, j, abstractC5716.mo2642(j, obj2));
                        m5012(i, obj3);
                    }
                    break;
                case 1:
                    if (m5019(i, obj2)) {
                        AbstractC5716 abstractC5717 = AbstractC1194.f4116;
                        abstractC5717.mo2647(obj, j, abstractC5717.mo2639(j, obj2));
                        m5012(i, obj);
                    }
                    obj3 = obj;
                    break;
                case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                    if (m5019(i, obj2)) {
                        AbstractC1194.m2524(obj, j, AbstractC1194.m2523(j, obj2));
                        m5012(i, obj);
                    }
                    obj3 = obj;
                    break;
                case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                    if (m5019(i, obj2)) {
                        AbstractC1194.m2524(obj, j, AbstractC1194.m2523(j, obj2));
                        m5012(i, obj);
                    }
                    obj3 = obj;
                    break;
                case C4261.LONG_FIELD_NUMBER /* 4 */:
                    if (m5019(i, obj2)) {
                        AbstractC1194.m2519(AbstractC1194.m2513(j, obj2), j, obj);
                        m5012(i, obj);
                    }
                    obj3 = obj;
                    break;
                case C4261.STRING_FIELD_NUMBER /* 5 */:
                    if (m5019(i, obj2)) {
                        AbstractC1194.m2524(obj, j, AbstractC1194.m2523(j, obj2));
                        m5012(i, obj);
                    }
                    obj3 = obj;
                    break;
                case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (m5019(i, obj2)) {
                        AbstractC1194.m2519(AbstractC1194.m2513(j, obj2), j, obj);
                        m5012(i, obj);
                    }
                    obj3 = obj;
                    break;
                case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (m5019(i, obj2)) {
                        AbstractC5716 abstractC5718 = AbstractC1194.f4116;
                        abstractC5718.mo2645(obj, j, abstractC5718.mo2644(j, obj2));
                        m5012(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (m5019(i, obj2)) {
                        AbstractC1194.m2525(j, obj, AbstractC1194.m2515(j, obj2));
                        m5012(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    m5004(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 10:
                    if (m5019(i, obj2)) {
                        AbstractC1194.m2525(j, obj, AbstractC1194.m2515(j, obj2));
                        m5012(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 11:
                    if (m5019(i, obj2)) {
                        AbstractC1194.m2519(AbstractC1194.m2513(j, obj2), j, obj);
                        m5012(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (m5019(i, obj2)) {
                        AbstractC1194.m2519(AbstractC1194.m2513(j, obj2), j, obj);
                        m5012(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (m5019(i, obj2)) {
                        AbstractC1194.m2519(AbstractC1194.m2513(j, obj2), j, obj);
                        m5012(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (m5019(i, obj2)) {
                        AbstractC1194.m2524(obj, j, AbstractC1194.m2523(j, obj2));
                        m5012(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (m5019(i, obj2)) {
                        AbstractC1194.m2519(AbstractC1194.m2513(j, obj2), j, obj);
                        m5012(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (m5019(i, obj2)) {
                        AbstractC1194.m2524(obj, j, AbstractC1194.m2523(j, obj2));
                        m5012(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 17:
                    m5004(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.f8926.getClass();
                    InterfaceC4997 interfaceC4997M4958 = (InterfaceC4997) AbstractC1194.m2515(j, obj);
                    InterfaceC4997 interfaceC4997 = (InterfaceC4997) AbstractC1194.m2515(j, obj2);
                    int i3 = ((C2645) interfaceC4997M4958).f8789;
                    int i4 = ((C2645) interfaceC4997).f8789;
                    if (i3 > 0 && i4 > 0) {
                        if (!((C2645) interfaceC4997M4958).f8791) {
                            interfaceC4997M4958 = ((C2645) interfaceC4997M4958).m4958(i4 + i3);
                        }
                        ((C2645) interfaceC4997M4958).addAll(interfaceC4997);
                    }
                    if (i3 > 0) {
                        interfaceC4997 = interfaceC4997M4958;
                    }
                    AbstractC1194.m2525(j, obj, interfaceC4997);
                    obj3 = obj;
                    break;
                case 50:
                    Class cls = AbstractC0499.f1810;
                    Object objM2515 = AbstractC1194.m2515(j, obj);
                    Object objM2516 = AbstractC1194.m2515(j, obj2);
                    this.f8923.getClass();
                    AbstractC1194.m2525(j, obj, C0847.m1762(objM2515, objM2516));
                    obj3 = obj;
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (m5005(i2, i, obj2)) {
                        AbstractC1194.m2525(j, obj, AbstractC1194.m2515(j, obj2));
                        m5010(i2, i, obj);
                    }
                    obj3 = obj;
                    break;
                case 60:
                    m5008(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (m5005(i2, i, obj2)) {
                        AbstractC1194.m2525(j, obj, AbstractC1194.m2515(j, obj2));
                        m5010(i2, i, obj);
                    }
                    obj3 = obj;
                    break;
                case 68:
                    m5008(i, obj, obj2);
                    obj3 = obj;
                    break;
                default:
                    obj3 = obj;
                    break;
            }
            i += 3;
            obj = obj3;
        }
    }

    /* JADX INFO: renamed from: ۥً */
    public final void m5003(Object obj, int i, C4902 c4902, InterfaceC1622 interfaceC1622, C2336 c2336) throws C3406 {
        int iMo5039;
        this.f8926.getClass();
        InterfaceC4997 interfaceC4997M1640 = C0750.m1640(i & 1048575, obj);
        AbstractC2758 abstractC2758 = (AbstractC2758) c4902.f16167;
        int i2 = c4902.f16168;
        if ((i2 & 7) != 2) {
            throw C3406.m6170();
        }
        do {
            AbstractC0318 abstractC0318Mo3393 = interfaceC1622.mo3393();
            c4902.m8265(abstractC0318Mo3393, interfaceC1622, c2336);
            interfaceC1622.mo3387(abstractC0318Mo3393);
            ((C2645) interfaceC4997M1640).add(abstractC0318Mo3393);
            if (abstractC2758.mo5040() || c4902.f16170 != 0) {
                return;
            } else {
                iMo5039 = abstractC2758.mo5039();
            }
        } while (iMo5039 == i2);
        c4902.f16170 = iMo5039;
    }

    /* JADX INFO: renamed from: ۥَ */
    public final void m5004(int i, Object obj, Object obj2) {
        if (m5019(i, obj2)) {
            long jM5011 = m5011(i) & 1048575;
            Unsafe unsafe = f8914;
            Object object = unsafe.getObject(obj2, jM5011);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f8920[i] + " is present but null: " + obj2);
            }
            InterfaceC1622 interfaceC1622M5014 = m5014(i);
            if (!m5019(i, obj)) {
                if (m5001(object)) {
                    AbstractC0318 abstractC0318Mo3393 = interfaceC1622M5014.mo3393();
                    interfaceC1622M5014.mo3386(abstractC0318Mo3393, object);
                    unsafe.putObject(obj, jM5011, abstractC0318Mo3393);
                } else {
                    unsafe.putObject(obj, jM5011, object);
                }
                m5012(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jM5011);
            if (!m5001(object2)) {
                AbstractC0318 abstractC0318Mo3394 = interfaceC1622M5014.mo3393();
                interfaceC1622M5014.mo3386(abstractC0318Mo3394, object2);
                unsafe.putObject(obj, jM5011, abstractC0318Mo3394);
                object2 = abstractC0318Mo3394;
            }
            interfaceC1622M5014.mo3386(object2, object);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x007c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0082  */
    /* JADX WARN: Code duplicated, block: B:43:0x008d A[SYNTHETIC] */
    @Override // p000.InterfaceC1622
    /* JADX INFO: renamed from: ۥُ */
    public final void mo3387(Object obj) {
        if (m5001(obj)) {
            if (obj instanceof AbstractC0318) {
                AbstractC0318 abstractC0318 = (AbstractC0318) obj;
                abstractC0318.m679(Integer.MAX_VALUE);
                abstractC0318.memoizedHashCode = 0;
                abstractC0318.m676();
            }
            int[] iArr = this.f8920;
            int length = iArr.length;
            for (int i = 0; i < length; i += 3) {
                int iM5011 = m5011(i);
                long j = 1048575 & iM5011;
                int iM4999 = m4999(iM5011);
                Unsafe unsafe = f8914;
                if (iM4999 != 9) {
                    if (iM4999 != 60 && iM4999 != 68) {
                        switch (iM4999) {
                            case 17:
                                if (m5019(i, obj)) {
                                    m5014(i).mo3387(unsafe.getObject(obj, j));
                                }
                                break;
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                this.f8926.getClass();
                                C2645 c2645 = (C2645) ((InterfaceC4997) AbstractC1194.m2515(j, obj));
                                if (c2645.f8791) {
                                    c2645.f8791 = false;
                                }
                                break;
                            case 50:
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    this.f8923.getClass();
                                    ((C0303) object).f1095 = false;
                                    unsafe.putObject(obj, j, object);
                                }
                                break;
                        }
                    } else if (m5005(iArr[i], i, obj)) {
                        m5014(i).mo3387(unsafe.getObject(obj, j));
                    }
                } else if (m5019(i, obj)) {
                    m5014(i).mo3387(unsafe.getObject(obj, j));
                }
            }
            this.f8922.getClass();
            C5708 c5708 = ((AbstractC0318) obj).unknownFields;
            if (c5708.f18793) {
                c5708.f18793 = false;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:128:0x0331  */
    /* JADX WARN: Code duplicated, block: B:133:0x0340  */
    /* JADX WARN: Code duplicated, block: B:134:0x0352  */
    /* JADX WARN: Code duplicated, block: B:135:0x0363  */
    /* JADX WARN: Code duplicated, block: B:137:0x036c  */
    /* JADX WARN: Code duplicated, block: B:139:0x0375  */
    /* JADX WARN: Code duplicated, block: B:140:0x0382  */
    /* JADX WARN: Code duplicated, block: B:141:0x038e  */
    /* JADX WARN: Code duplicated, block: B:143:0x0392  */
    /* JADX WARN: Code duplicated, block: B:145:0x039f  */
    /* JADX WARN: Code duplicated, block: B:146:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:147:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:148:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:150:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:151:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:152:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:153:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:154:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:155:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:156:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:157:0x0401  */
    /* JADX WARN: Code duplicated, block: B:158:0x040c  */
    /* JADX WARN: Code duplicated, block: B:159:0x0413  */
    /* JADX WARN: Code duplicated, block: B:215:0x0601 A[PHI: r23 r24
  0x0601: PHI (r23v19 int) = 
  (r23v2 int)
  (r23v3 int)
  (r23v4 int)
  (r23v8 int)
  (r23v10 int)
  (r23v11 int)
  (r23v12 int)
  (r23v16 int)
  (r23v20 int)
 binds: [B:274:0x07b8, B:270:0x079a, B:266:0x077c, B:249:0x06ff, B:235:0x0696, B:231:0x067a, B:227:0x065e, B:220:0x0620, B:214:0x05ff] A[DONT_GENERATE, DONT_INLINE]
  0x0601: PHI (r24v18 int) = 
  (r24v2 int)
  (r24v3 int)
  (r24v4 int)
  (r24v8 int)
  (r24v10 int)
  (r24v11 int)
  (r24v12 int)
  (r24v15 int)
  (r24v19 int)
 binds: [B:274:0x07b8, B:270:0x079a, B:266:0x077c, B:249:0x06ff, B:235:0x0696, B:231:0x067a, B:227:0x065e, B:220:0x0620, B:214:0x05ff] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:350:0x033a A[SYNTHETIC] */
    @Override // p000.InterfaceC1622
    /* JADX INFO: renamed from: ۥّ */
    public final int mo3388(AbstractC0318 abstractC0318) {
        int i;
        int iM4047;
        int iM4048;
        int iM4049;
        int iM40410;
        int iM40411;
        int iM40412;
        int iM40413;
        int iM40414;
        int iM4046;
        int iMo677;
        int iM1118;
        int i2;
        int i3;
        int iM40415;
        int size;
        int iM1136;
        int iM40416;
        int iM40417;
        int size2;
        int iM40418;
        int iM40419;
        int iMo678;
        int iM40420;
        int iM40421;
        int size3;
        int iM40422;
        int i4;
        EnumC1497 enumC1497;
        int iM40423;
        int iM40424;
        int size4;
        int iM40425;
        int iM40426;
        int iM40427;
        int iM40428;
        int iM40429;
        int iM40430;
        int iM40431;
        C2687 c2687 = this;
        AbstractC0318 abstractC0319 = abstractC0318;
        int i5 = 1048575;
        int i6 = 1048575;
        int i7 = 0;
        int i8 = 0;
        int iM40432 = 0;
        while (true) {
            int[] iArr = c2687.f8920;
            if (i7 >= iArr.length) {
                c2687.f8922.getClass();
                return abstractC0319.unknownFields.m9525() + iM40432;
            }
            int iM5011 = c2687.m5011(i7);
            int iM4999 = m4999(iM5011);
            int i9 = iArr[i7];
            int i10 = iArr[i7 + 2];
            int i11 = i10 & i5;
            int i12 = 1;
            Unsafe unsafe = f8914;
            if (iM4999 <= 17) {
                if (i11 != i6) {
                    i8 = i11 == i5 ? 0 : unsafe.getInt(abstractC0319, i11);
                    i6 = i11;
                }
                i = 1 << (i10 >>> 20);
            } else {
                i = 0;
            }
            long j = iM5011 & i5;
            if (iM4999 >= EnumC2970.f9956.f9957) {
                int i13 = EnumC2970.f9954.f9957;
            }
            char c = '?';
            switch (iM4999) {
                case 0:
                    if (c2687.m5021(abstractC0319, i7, i6, i8, i)) {
                        iM4047 = C2100.m4047(i9);
                        iMo677 = iM4047 + 8;
                        iM40432 += iMo677;
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 1:
                    if (c2687.m5021(abstractC0319, i7, i6, i8, i)) {
                        iM4048 = C2100.m4047(i9);
                        iM40414 = iM4048 + 4;
                        iM40432 += iM40414;
                    }
                    c2687 = this;
                    abstractC0319 = abstractC0318;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                    if (c2687.m5021(abstractC0319, i7, i6, i8, i)) {
                        long j2 = unsafe.getLong(abstractC0319, j);
                        iM4049 = C2100.m4047(i9);
                        iM40410 = C2100.m4048(j2);
                        iM40432 += iM40410 + iM4049;
                    }
                    c2687 = this;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                    if (c2687.m5021(abstractC0319, i7, i6, i8, i)) {
                        long j3 = unsafe.getLong(abstractC0319, j);
                        iM4049 = C2100.m4047(i9);
                        iM40410 = C2100.m4048(j3);
                        iM40432 += iM40410 + iM4049;
                    }
                    c2687 = this;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case C4261.LONG_FIELD_NUMBER /* 4 */:
                    if (c2687.m5021(abstractC0319, i7, i6, i8, i)) {
                        int i14 = unsafe.getInt(abstractC0319, j);
                        iM40411 = C2100.m4047(i9);
                        iM40412 = C2100.m4048(i14);
                        iM4046 = iM40412 + iM40411;
                        iM40432 += iM4046;
                    }
                    c2687 = this;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case C4261.STRING_FIELD_NUMBER /* 5 */:
                    if (c2687.m5021(abstractC0319, i7, i6, i8, i)) {
                        iM40413 = C2100.m4047(i9);
                        iM40414 = iM40413 + 8;
                        iM40432 += iM40414;
                    }
                    c2687 = this;
                    abstractC0319 = abstractC0318;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (c2687.m5021(abstractC0319, i7, i6, i8, i)) {
                        iM4048 = C2100.m4047(i9);
                        iM40414 = iM4048 + 4;
                        iM40432 += iM40414;
                    }
                    c2687 = this;
                    abstractC0319 = abstractC0318;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (c2687.m5021(abstractC0319, i7, i6, i8, i)) {
                        iM40414 = C2100.m4047(i9) + 1;
                        iM40432 += iM40414;
                    }
                    c2687 = this;
                    abstractC0319 = abstractC0318;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 8:
                    if (c2687.m5021(abstractC0319, i7, i6, i8, i)) {
                        Object object = unsafe.getObject(abstractC0319, j);
                        iM40432 = (object instanceof C0533 ? C2100.m4046(i9, (C0533) object) : C2100.m4050((String) object) + C2100.m4047(i9)) + iM40432;
                    }
                    c2687 = this;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 9:
                    if (c2687.m5021(abstractC0319, i7, i6, i8, i)) {
                        Object object2 = unsafe.getObject(abstractC0319, j);
                        InterfaceC1622 interfaceC1622M5014 = c2687.m5014(i7);
                        Class cls = AbstractC0499.f1810;
                        int iM40433 = C2100.m4047(i9);
                        int iMo679 = ((AbstractC0066) object2).mo677(interfaceC1622M5014);
                        iM40432 += C2100.m4049(iMo679) + iMo679 + iM40433;
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 10:
                    if (c2687.m5021(abstractC0319, i7, i6, i8, i)) {
                        iM4046 = C2100.m4046(i9, (C0533) unsafe.getObject(abstractC0319, j));
                        iM40432 += iM4046;
                    }
                    c2687 = this;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 11:
                    if (c2687.m5021(abstractC0319, i7, i6, i8, i)) {
                        int i15 = unsafe.getInt(abstractC0319, j);
                        iM40411 = C2100.m4047(i9);
                        iM40412 = C2100.m4049(i15);
                        iM4046 = iM40412 + iM40411;
                        iM40432 += iM4046;
                    }
                    c2687 = this;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 12:
                    if (c2687.m5021(abstractC0319, i7, i6, i8, i)) {
                        int i16 = unsafe.getInt(abstractC0319, j);
                        iM40411 = C2100.m4047(i9);
                        iM40412 = C2100.m4048(i16);
                        iM4046 = iM40412 + iM40411;
                        iM40432 += iM4046;
                    }
                    c2687 = this;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 13:
                    if (c2687.m5021(abstractC0319, i7, i6, i8, i)) {
                        iM4048 = C2100.m4047(i9);
                        iM40414 = iM4048 + 4;
                        iM40432 += iM40414;
                    }
                    c2687 = this;
                    abstractC0319 = abstractC0318;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 14:
                    if (c2687.m5021(abstractC0319, i7, i6, i8, i)) {
                        iM40413 = C2100.m4047(i9);
                        iM40414 = iM40413 + 8;
                        iM40432 += iM40414;
                    }
                    c2687 = this;
                    abstractC0319 = abstractC0318;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 15:
                    if (c2687.m5021(abstractC0319, i7, i6, i8, i)) {
                        int i17 = unsafe.getInt(abstractC0319, j);
                        iM40411 = C2100.m4047(i9);
                        iM40412 = C2100.m4049((i17 >> 31) ^ (i17 << 1));
                        iM4046 = iM40412 + iM40411;
                        iM40432 += iM4046;
                    }
                    c2687 = this;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 16:
                    if (c2687.m5021(abstractC0319, i7, i6, i8, i)) {
                        long j4 = unsafe.getLong(abstractC0319, j);
                        iM4049 = C2100.m4047(i9);
                        iM40410 = C2100.m4048((j4 >> 63) ^ (j4 << 1));
                        iM40432 += iM40410 + iM4049;
                    }
                    c2687 = this;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 17:
                    if (c2687.m5021(abstractC0319, i7, i6, i8, i)) {
                        iMo677 = ((AbstractC0066) unsafe.getObject(abstractC0319, j)).mo677(c2687.m5014(i7)) + (C2100.m4047(i9) * 2);
                        iM40432 += iMo677;
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 18:
                    iM1118 = AbstractC0499.m1118(i9, (List) unsafe.getObject(abstractC0319, j));
                    iM40432 += iM1118;
                    i6 = i6;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 19:
                    iM1118 = AbstractC0499.m1127(i9, (List) unsafe.getObject(abstractC0319, j));
                    iM40432 += iM1118;
                    i6 = i6;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 20:
                    i2 = i6;
                    i3 = i8;
                    List list = (List) unsafe.getObject(abstractC0319, j);
                    Class cls2 = AbstractC0499.f1810;
                    if (list.size() == 0) {
                        iM40415 = 0;
                    } else {
                        iM40415 = (C2100.m4047(i9) * list.size()) + AbstractC0499.m1120(list);
                    }
                    iM40432 += iM40415;
                    i6 = i2;
                    i8 = i3;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 21:
                    i2 = i6;
                    i3 = i8;
                    List list2 = (List) unsafe.getObject(abstractC0319, j);
                    Class cls3 = AbstractC0499.f1810;
                    size = list2.size();
                    if (size == 0) {
                        iM40415 = 0;
                    } else {
                        iM1136 = AbstractC0499.m1136(list2);
                        iM40416 = C2100.m4047(i9);
                        iM40415 = (iM40416 * size) + iM1136;
                    }
                    iM40432 += iM40415;
                    i6 = i2;
                    i8 = i3;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 22:
                    i2 = i6;
                    i3 = i8;
                    List list3 = (List) unsafe.getObject(abstractC0319, j);
                    Class cls4 = AbstractC0499.f1810;
                    size = list3.size();
                    if (size == 0) {
                        iM40415 = 0;
                    } else {
                        iM1136 = AbstractC0499.m1130(list3);
                        iM40416 = C2100.m4047(i9);
                        iM40415 = (iM40416 * size) + iM1136;
                    }
                    iM40432 += iM40415;
                    i6 = i2;
                    i8 = i3;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 23:
                    iM1118 = AbstractC0499.m1118(i9, (List) unsafe.getObject(abstractC0319, j));
                    iM40432 += iM1118;
                    i6 = i6;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 24:
                    iM1118 = AbstractC0499.m1127(i9, (List) unsafe.getObject(abstractC0319, j));
                    iM40432 += iM1118;
                    i6 = i6;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 25:
                    i2 = i6;
                    i3 = i8;
                    List list4 = (List) unsafe.getObject(abstractC0319, j);
                    Class cls5 = AbstractC0499.f1810;
                    int size5 = list4.size();
                    iM40432 += size5 == 0 ? 0 : (C2100.m4047(i9) + 1) * size5;
                    i6 = i2;
                    i8 = i3;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 26:
                    i2 = i6;
                    i3 = i8;
                    List list5 = (List) unsafe.getObject(abstractC0319, j);
                    Class cls6 = AbstractC0499.f1810;
                    int size6 = list5.size();
                    if (size6 == 0) {
                        iM40415 = 0;
                    } else {
                        iM40415 = C2100.m4047(i9) * size6;
                        for (int i18 = 0; i18 < size6; i18++) {
                            Object obj = list5.get(i18);
                            if (obj instanceof C0533) {
                                int size7 = ((C0533) obj).size();
                                iM40415 = C2100.m4049(size7) + size7 + iM40415;
                            } else {
                                iM40415 = C2100.m4050((String) obj) + iM40415;
                            }
                        }
                    }
                    iM40432 += iM40415;
                    i6 = i2;
                    i8 = i3;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 27:
                    i2 = i6;
                    i3 = i8;
                    List list6 = (List) unsafe.getObject(abstractC0319, j);
                    InterfaceC1622 interfaceC1622M5015 = c2687.m5014(i7);
                    Class cls7 = AbstractC0499.f1810;
                    int size8 = list6.size();
                    if (size8 == 0) {
                        iM40417 = 0;
                    } else {
                        iM40417 = C2100.m4047(i9) * size8;
                        for (int i19 = 0; i19 < size8; i19++) {
                            int iMo6710 = ((AbstractC0066) list6.get(i19)).mo677(interfaceC1622M5015);
                            iM40417 += C2100.m4049(iMo6710) + iMo6710;
                        }
                    }
                    iM40432 += iM40417;
                    i6 = i2;
                    i8 = i3;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 28:
                    i2 = i6;
                    i3 = i8;
                    List list7 = (List) unsafe.getObject(abstractC0319, j);
                    Class cls8 = AbstractC0499.f1810;
                    int size9 = list7.size();
                    if (size9 == 0) {
                        iM40415 = 0;
                    } else {
                        iM40415 = C2100.m4047(i9) * size9;
                        for (int i20 = 0; i20 < list7.size(); i20++) {
                            int size10 = ((C0533) list7.get(i20)).size();
                            iM40415 += C2100.m4049(size10) + size10;
                        }
                    }
                    iM40432 += iM40415;
                    i6 = i2;
                    i8 = i3;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 29:
                    i2 = i6;
                    i3 = i8;
                    List list8 = (List) unsafe.getObject(abstractC0319, j);
                    Class cls9 = AbstractC0499.f1810;
                    size = list8.size();
                    if (size == 0) {
                        iM40415 = 0;
                    } else {
                        iM1136 = AbstractC0499.m1128(list8);
                        iM40416 = C2100.m4047(i9);
                        iM40415 = (iM40416 * size) + iM1136;
                    }
                    iM40432 += iM40415;
                    i6 = i2;
                    i8 = i3;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 30:
                    i2 = i6;
                    i3 = i8;
                    List list9 = (List) unsafe.getObject(abstractC0319, j);
                    Class cls10 = AbstractC0499.f1810;
                    size = list9.size();
                    if (size == 0) {
                        iM40415 = 0;
                    } else {
                        iM1136 = AbstractC0499.m1129(list9);
                        iM40416 = C2100.m4047(i9);
                        iM40415 = (iM40416 * size) + iM1136;
                    }
                    iM40432 += iM40415;
                    i6 = i2;
                    i8 = i3;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 31:
                    iM1118 = AbstractC0499.m1127(i9, (List) unsafe.getObject(abstractC0319, j));
                    iM40432 += iM1118;
                    i6 = i6;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 32:
                    iM1118 = AbstractC0499.m1118(i9, (List) unsafe.getObject(abstractC0319, j));
                    iM40432 += iM1118;
                    i6 = i6;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 33:
                    i2 = i6;
                    i3 = i8;
                    List list10 = (List) unsafe.getObject(abstractC0319, j);
                    Class cls11 = AbstractC0499.f1810;
                    size = list10.size();
                    if (size == 0) {
                        iM40415 = 0;
                    } else {
                        iM1136 = AbstractC0499.m1121(list10);
                        iM40416 = C2100.m4047(i9);
                        iM40415 = (iM40416 * size) + iM1136;
                    }
                    iM40432 += iM40415;
                    i6 = i2;
                    i8 = i3;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 34:
                    i2 = i6;
                    i3 = i8;
                    List list11 = (List) unsafe.getObject(abstractC0319, j);
                    Class cls12 = AbstractC0499.f1810;
                    size = list11.size();
                    if (size == 0) {
                        iM40415 = 0;
                    } else {
                        iM1136 = AbstractC0499.m1138(list11);
                        iM40416 = C2100.m4047(i9);
                        iM40415 = (iM40416 * size) + iM1136;
                    }
                    iM40432 += iM40415;
                    i6 = i2;
                    i8 = i3;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 35:
                    i2 = i6;
                    i3 = i8;
                    List list12 = (List) unsafe.getObject(abstractC0319, j);
                    Class cls13 = AbstractC0499.f1810;
                    size2 = list12.size() * 8;
                    if (size2 > 0) {
                        iM40418 = C2100.m4047(i9);
                        iM40419 = C2100.m4049(size2);
                        iM40432 += iM40419 + iM40418 + size2;
                    }
                    i6 = i2;
                    i8 = i3;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 36:
                    i2 = i6;
                    i3 = i8;
                    List list13 = (List) unsafe.getObject(abstractC0319, j);
                    Class cls14 = AbstractC0499.f1810;
                    size2 = list13.size() * 4;
                    if (size2 > 0) {
                        iM40418 = C2100.m4047(i9);
                        iM40419 = C2100.m4049(size2);
                        iM40432 += iM40419 + iM40418 + size2;
                    }
                    i6 = i2;
                    i8 = i3;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 37:
                    i2 = i6;
                    i3 = i8;
                    size2 = AbstractC0499.m1120((List) unsafe.getObject(abstractC0319, j));
                    if (size2 > 0) {
                        iM40418 = C2100.m4047(i9);
                        iM40419 = C2100.m4049(size2);
                        iM40432 += iM40419 + iM40418 + size2;
                    }
                    i6 = i2;
                    i8 = i3;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 38:
                    i2 = i6;
                    i3 = i8;
                    size2 = AbstractC0499.m1136((List) unsafe.getObject(abstractC0319, j));
                    if (size2 > 0) {
                        iM40418 = C2100.m4047(i9);
                        iM40419 = C2100.m4049(size2);
                        iM40432 += iM40419 + iM40418 + size2;
                    }
                    i6 = i2;
                    i8 = i3;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 39:
                    i2 = i6;
                    i3 = i8;
                    size2 = AbstractC0499.m1130((List) unsafe.getObject(abstractC0319, j));
                    if (size2 > 0) {
                        iM40418 = C2100.m4047(i9);
                        iM40419 = C2100.m4049(size2);
                        iM40432 += iM40419 + iM40418 + size2;
                    }
                    i6 = i2;
                    i8 = i3;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 40:
                    i2 = i6;
                    i3 = i8;
                    List list14 = (List) unsafe.getObject(abstractC0319, j);
                    Class cls15 = AbstractC0499.f1810;
                    size2 = list14.size() * 8;
                    if (size2 > 0) {
                        iM40418 = C2100.m4047(i9);
                        iM40419 = C2100.m4049(size2);
                        iM40432 += iM40419 + iM40418 + size2;
                    }
                    i6 = i2;
                    i8 = i3;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 41:
                    i2 = i6;
                    i3 = i8;
                    List list15 = (List) unsafe.getObject(abstractC0319, j);
                    Class cls16 = AbstractC0499.f1810;
                    size2 = list15.size() * 4;
                    if (size2 > 0) {
                        iM40418 = C2100.m4047(i9);
                        iM40419 = C2100.m4049(size2);
                        iM40432 += iM40419 + iM40418 + size2;
                    }
                    i6 = i2;
                    i8 = i3;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 42:
                    i2 = i6;
                    i3 = i8;
                    List list16 = (List) unsafe.getObject(abstractC0319, j);
                    Class cls17 = AbstractC0499.f1810;
                    size2 = list16.size();
                    if (size2 > 0) {
                        iM40418 = C2100.m4047(i9);
                        iM40419 = C2100.m4049(size2);
                        iM40432 += iM40419 + iM40418 + size2;
                    }
                    i6 = i2;
                    i8 = i3;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 43:
                    i2 = i6;
                    i3 = i8;
                    size2 = AbstractC0499.m1128((List) unsafe.getObject(abstractC0319, j));
                    if (size2 > 0) {
                        iM40418 = C2100.m4047(i9);
                        iM40419 = C2100.m4049(size2);
                        iM40432 += iM40419 + iM40418 + size2;
                    }
                    i6 = i2;
                    i8 = i3;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 44:
                    i2 = i6;
                    i3 = i8;
                    size2 = AbstractC0499.m1129((List) unsafe.getObject(abstractC0319, j));
                    if (size2 > 0) {
                        iM40418 = C2100.m4047(i9);
                        iM40419 = C2100.m4049(size2);
                        iM40432 += iM40419 + iM40418 + size2;
                    }
                    i6 = i2;
                    i8 = i3;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 45:
                    i2 = i6;
                    i3 = i8;
                    List list17 = (List) unsafe.getObject(abstractC0319, j);
                    Class cls18 = AbstractC0499.f1810;
                    size2 = list17.size() * 4;
                    if (size2 > 0) {
                        iM40418 = C2100.m4047(i9);
                        iM40419 = C2100.m4049(size2);
                        iM40432 += iM40419 + iM40418 + size2;
                    }
                    i6 = i2;
                    i8 = i3;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 46:
                    i2 = i6;
                    i3 = i8;
                    List list18 = (List) unsafe.getObject(abstractC0319, j);
                    Class cls19 = AbstractC0499.f1810;
                    size2 = list18.size() * 8;
                    if (size2 > 0) {
                        iM40418 = C2100.m4047(i9);
                        iM40419 = C2100.m4049(size2);
                        iM40432 += iM40419 + iM40418 + size2;
                    }
                    i6 = i2;
                    i8 = i3;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 47:
                    i2 = i6;
                    i3 = i8;
                    size2 = AbstractC0499.m1121((List) unsafe.getObject(abstractC0319, j));
                    if (size2 > 0) {
                        iM40418 = C2100.m4047(i9);
                        iM40419 = C2100.m4049(size2);
                        iM40432 += iM40419 + iM40418 + size2;
                    }
                    i6 = i2;
                    i8 = i3;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 48:
                    i2 = i6;
                    i3 = i8;
                    size2 = AbstractC0499.m1138((List) unsafe.getObject(abstractC0319, j));
                    if (size2 > 0) {
                        iM40418 = C2100.m4047(i9);
                        iM40419 = C2100.m4049(size2);
                        iM40432 += iM40419 + iM40418 + size2;
                    }
                    i6 = i2;
                    i8 = i3;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 49:
                    i2 = i6;
                    i3 = i8;
                    List list19 = (List) unsafe.getObject(abstractC0319, j);
                    InterfaceC1622 interfaceC1622M5016 = c2687.m5014(i7);
                    Class cls20 = AbstractC0499.f1810;
                    int size11 = list19.size();
                    if (size11 == 0) {
                        iMo678 = 0;
                    } else {
                        iMo678 = 0;
                        for (int i21 = 0; i21 < size11; i21++) {
                            iMo678 += ((AbstractC0066) list19.get(i21)).mo677(interfaceC1622M5016) + (C2100.m4047(i9) * 2);
                        }
                    }
                    iM40432 += iMo678;
                    i6 = i2;
                    i8 = i3;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 50:
                    Object object3 = unsafe.getObject(abstractC0319, j);
                    Object obj2 = c2687.f8918[(i7 / 3) * 2];
                    c2687.f8923.getClass();
                    C0303 c0303 = (C0303) object3;
                    C5405 c5405 = (C5405) obj2;
                    if (c0303.isEmpty()) {
                        iM40420 = 0;
                    } else {
                        iM40420 = 0;
                        for (Map.Entry entry : c0303.entrySet()) {
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            c5405.getClass();
                            int iM40434 = C2100.m4047(i9);
                            C2808 c2808 = c5405.f17850;
                            EnumC1497 enumC1498 = (EnumC1497) c2808.f9378;
                            int i22 = C5052.f16768;
                            int iM40435 = C2100.m4047(i12);
                            char c2 = c;
                            C5329 c5329 = EnumC1497.f5074;
                            if (enumC1498 == c5329) {
                                iM40435 *= 2;
                            }
                            int i23 = i12;
                            int i24 = i6;
                            switch (enumC1498.ordinal()) {
                                case 0:
                                    ((Double) key).getClass();
                                    iM40421 = 8;
                                    i4 = iM40421 + iM40435;
                                    enumC1497 = (EnumC1497) c2808.f9376;
                                    iM40423 = C2100.m4047(2);
                                    if (enumC1497 == c5329) {
                                        iM40423 *= 2;
                                    }
                                    switch (enumC1497.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iM40424 = 8;
                                            int i25 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i25) + i25 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iM40424 = 4;
                                            int i26 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i26) + i26 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                                            iM40424 = C2100.m4048(((Long) value).longValue());
                                            int i27 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i27) + i27 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                                            iM40424 = C2100.m4048(((Long) value).longValue());
                                            int i28 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i28) + i28 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case C4261.LONG_FIELD_NUMBER /* 4 */:
                                            iM40424 = C2100.m4048(((Integer) value).intValue());
                                            int i29 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i29) + i29 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case C4261.STRING_FIELD_NUMBER /* 5 */:
                                            ((Long) value).getClass();
                                            iM40424 = 8;
                                            int i210 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i210) + i210 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                                            ((Integer) value).getClass();
                                            iM40424 = 4;
                                            int i211 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i211) + i211 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                                            ((Boolean) value).getClass();
                                            iM40424 = i23;
                                            int i212 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i212) + i212 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 8:
                                            if (value instanceof C0533) {
                                                size4 = ((C0533) value).size();
                                                iM40425 = C2100.m4049(size4);
                                                iM40424 = size4 + iM40425;
                                            } else {
                                                iM40424 = C2100.m4050((String) value);
                                            }
                                            int i213 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i213) + i213 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 9:
                                            iM40424 = ((AbstractC0318) ((AbstractC0066) value)).mo677(null);
                                            int i214 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i214) + i214 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 10:
                                            size4 = ((AbstractC0318) ((AbstractC0066) value)).mo677(null);
                                            iM40425 = C2100.m4049(size4);
                                            iM40424 = size4 + iM40425;
                                            int i215 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i215) + i215 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 11:
                                            if (value instanceof C0533) {
                                                size4 = ((C0533) value).size();
                                                iM40425 = C2100.m4049(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                iM40425 = C2100.m4049(size4);
                                            }
                                            iM40424 = size4 + iM40425;
                                            int i216 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i216) + i216 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 12:
                                            iM40424 = C2100.m4049(((Integer) value).intValue());
                                            int i217 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i217) + i217 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 13:
                                            iM40424 = C2100.m4048(((Integer) value).intValue());
                                            int i218 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i218) + i218 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iM40424 = 4;
                                            int i219 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i219) + i219 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iM40424 = 8;
                                            int i2110 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i2110) + i2110 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 16:
                                            int iIntValue = ((Integer) value).intValue();
                                            iM40424 = C2100.m4049((iIntValue >> 31) ^ (iIntValue << 1));
                                            int i2111 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i2111) + i2111 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 17:
                                            long jLongValue = ((Long) value).longValue();
                                            iM40424 = C2100.m4048((jLongValue << i23) ^ (jLongValue >> c2));
                                            int i2112 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i2112) + i2112 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 1:
                                    ((Float) key).getClass();
                                    iM40421 = 4;
                                    i4 = iM40421 + iM40435;
                                    enumC1497 = (EnumC1497) c2808.f9376;
                                    iM40423 = C2100.m4047(2);
                                    if (enumC1497 == c5329) {
                                        iM40423 *= 2;
                                    }
                                    switch (enumC1497.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iM40424 = 8;
                                            int i2113 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i2113) + i2113 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iM40424 = 4;
                                            int i2114 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i2114) + i2114 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                                            iM40424 = C2100.m4048(((Long) value).longValue());
                                            int i2115 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i2115) + i2115 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                                            iM40424 = C2100.m4048(((Long) value).longValue());
                                            int i2116 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i2116) + i2116 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case C4261.LONG_FIELD_NUMBER /* 4 */:
                                            iM40424 = C2100.m4048(((Integer) value).intValue());
                                            int i2117 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i2117) + i2117 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case C4261.STRING_FIELD_NUMBER /* 5 */:
                                            ((Long) value).getClass();
                                            iM40424 = 8;
                                            int i2118 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i2118) + i2118 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                                            ((Integer) value).getClass();
                                            iM40424 = 4;
                                            int i2119 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i2119) + i2119 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                                            ((Boolean) value).getClass();
                                            iM40424 = i23;
                                            int i21110 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i21110) + i21110 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 8:
                                            if (value instanceof C0533) {
                                                size4 = ((C0533) value).size();
                                                iM40425 = C2100.m4049(size4);
                                                iM40424 = size4 + iM40425;
                                            } else {
                                                iM40424 = C2100.m4050((String) value);
                                            }
                                            int i21111 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i21111) + i21111 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 9:
                                            iM40424 = ((AbstractC0318) ((AbstractC0066) value)).mo677(null);
                                            int i21112 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i21112) + i21112 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 10:
                                            size4 = ((AbstractC0318) ((AbstractC0066) value)).mo677(null);
                                            iM40425 = C2100.m4049(size4);
                                            iM40424 = size4 + iM40425;
                                            int i21113 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i21113) + i21113 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 11:
                                            if (value instanceof C0533) {
                                                size4 = ((C0533) value).size();
                                                iM40425 = C2100.m4049(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                iM40425 = C2100.m4049(size4);
                                            }
                                            iM40424 = size4 + iM40425;
                                            int i21114 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i21114) + i21114 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 12:
                                            iM40424 = C2100.m4049(((Integer) value).intValue());
                                            int i21115 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i21115) + i21115 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 13:
                                            iM40424 = C2100.m4048(((Integer) value).intValue());
                                            int i21116 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i21116) + i21116 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iM40424 = 4;
                                            int i21117 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i21117) + i21117 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iM40424 = 8;
                                            int i21118 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i21118) + i21118 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 16:
                                            int iIntValue2 = ((Integer) value).intValue();
                                            iM40424 = C2100.m4049((iIntValue2 >> 31) ^ (iIntValue2 << 1));
                                            int i21119 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i21119) + i21119 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 17:
                                            long jLongValue2 = ((Long) value).longValue();
                                            iM40424 = C2100.m4048((jLongValue2 << i23) ^ (jLongValue2 >> c2));
                                            int i211110 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i211110) + i211110 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                                    i8 = i8;
                                    iM40421 = C2100.m4048(((Long) key).longValue());
                                    i4 = iM40421 + iM40435;
                                    enumC1497 = (EnumC1497) c2808.f9376;
                                    iM40423 = C2100.m4047(2);
                                    if (enumC1497 == c5329) {
                                        iM40423 *= 2;
                                    }
                                    switch (enumC1497.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iM40424 = 8;
                                            int i211111 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i211111) + i211111 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iM40424 = 4;
                                            int i211112 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i211112) + i211112 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                                            iM40424 = C2100.m4048(((Long) value).longValue());
                                            int i211113 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i211113) + i211113 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                                            iM40424 = C2100.m4048(((Long) value).longValue());
                                            int i211114 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i211114) + i211114 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case C4261.LONG_FIELD_NUMBER /* 4 */:
                                            iM40424 = C2100.m4048(((Integer) value).intValue());
                                            int i211115 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i211115) + i211115 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case C4261.STRING_FIELD_NUMBER /* 5 */:
                                            ((Long) value).getClass();
                                            iM40424 = 8;
                                            int i211116 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i211116) + i211116 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                                            ((Integer) value).getClass();
                                            iM40424 = 4;
                                            int i211117 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i211117) + i211117 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                                            ((Boolean) value).getClass();
                                            iM40424 = i23;
                                            int i211118 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i211118) + i211118 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 8:
                                            if (value instanceof C0533) {
                                                size4 = ((C0533) value).size();
                                                iM40425 = C2100.m4049(size4);
                                                iM40424 = size4 + iM40425;
                                            } else {
                                                iM40424 = C2100.m4050((String) value);
                                            }
                                            int i211119 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i211119) + i211119 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 9:
                                            iM40424 = ((AbstractC0318) ((AbstractC0066) value)).mo677(null);
                                            int i2111110 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i2111110) + i2111110 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 10:
                                            size4 = ((AbstractC0318) ((AbstractC0066) value)).mo677(null);
                                            iM40425 = C2100.m4049(size4);
                                            iM40424 = size4 + iM40425;
                                            int i2111111 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i2111111) + i2111111 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 11:
                                            if (value instanceof C0533) {
                                                size4 = ((C0533) value).size();
                                                iM40425 = C2100.m4049(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                iM40425 = C2100.m4049(size4);
                                            }
                                            iM40424 = size4 + iM40425;
                                            int i2111112 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i2111112) + i2111112 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 12:
                                            iM40424 = C2100.m4049(((Integer) value).intValue());
                                            int i2111113 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i2111113) + i2111113 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 13:
                                            iM40424 = C2100.m4048(((Integer) value).intValue());
                                            int i2111114 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i2111114) + i2111114 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iM40424 = 4;
                                            int i2111115 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i2111115) + i2111115 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iM40424 = 8;
                                            int i2111116 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i2111116) + i2111116 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 16:
                                            int iIntValue3 = ((Integer) value).intValue();
                                            iM40424 = C2100.m4049((iIntValue3 >> 31) ^ (iIntValue3 << 1));
                                            int i2111117 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i2111117) + i2111117 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 17:
                                            long jLongValue3 = ((Long) value).longValue();
                                            iM40424 = C2100.m4048((jLongValue3 << i23) ^ (jLongValue3 >> c2));
                                            int i2111118 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i2111118) + i2111118 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                                    i8 = i8;
                                    iM40421 = C2100.m4048(((Long) key).longValue());
                                    i4 = iM40421 + iM40435;
                                    enumC1497 = (EnumC1497) c2808.f9376;
                                    iM40423 = C2100.m4047(2);
                                    if (enumC1497 == c5329) {
                                        iM40423 *= 2;
                                    }
                                    switch (enumC1497.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iM40424 = 8;
                                            int i2111119 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i2111119) + i2111119 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iM40424 = 4;
                                            int i21111110 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i21111110) + i21111110 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                                            iM40424 = C2100.m4048(((Long) value).longValue());
                                            int i21111111 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i21111111) + i21111111 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                                            iM40424 = C2100.m4048(((Long) value).longValue());
                                            int i21111112 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i21111112) + i21111112 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case C4261.LONG_FIELD_NUMBER /* 4 */:
                                            iM40424 = C2100.m4048(((Integer) value).intValue());
                                            int i21111113 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i21111113) + i21111113 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case C4261.STRING_FIELD_NUMBER /* 5 */:
                                            ((Long) value).getClass();
                                            iM40424 = 8;
                                            int i21111114 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i21111114) + i21111114 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                                            ((Integer) value).getClass();
                                            iM40424 = 4;
                                            int i21111115 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i21111115) + i21111115 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                                            ((Boolean) value).getClass();
                                            iM40424 = i23;
                                            int i21111116 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i21111116) + i21111116 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 8:
                                            if (value instanceof C0533) {
                                                size4 = ((C0533) value).size();
                                                iM40425 = C2100.m4049(size4);
                                                iM40424 = size4 + iM40425;
                                            } else {
                                                iM40424 = C2100.m4050((String) value);
                                            }
                                            int i21111117 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i21111117) + i21111117 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 9:
                                            iM40424 = ((AbstractC0318) ((AbstractC0066) value)).mo677(null);
                                            int i21111118 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i21111118) + i21111118 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 10:
                                            size4 = ((AbstractC0318) ((AbstractC0066) value)).mo677(null);
                                            iM40425 = C2100.m4049(size4);
                                            iM40424 = size4 + iM40425;
                                            int i21111119 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i21111119) + i21111119 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 11:
                                            if (value instanceof C0533) {
                                                size4 = ((C0533) value).size();
                                                iM40425 = C2100.m4049(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                iM40425 = C2100.m4049(size4);
                                            }
                                            iM40424 = size4 + iM40425;
                                            int i211111110 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i211111110) + i211111110 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 12:
                                            iM40424 = C2100.m4049(((Integer) value).intValue());
                                            int i211111111 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i211111111) + i211111111 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 13:
                                            iM40424 = C2100.m4048(((Integer) value).intValue());
                                            int i211111112 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i211111112) + i211111112 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iM40424 = 4;
                                            int i211111113 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i211111113) + i211111113 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iM40424 = 8;
                                            int i211111114 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i211111114) + i211111114 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 16:
                                            int iIntValue4 = ((Integer) value).intValue();
                                            iM40424 = C2100.m4049((iIntValue4 >> 31) ^ (iIntValue4 << 1));
                                            int i211111115 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i211111115) + i211111115 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 17:
                                            long jLongValue4 = ((Long) value).longValue();
                                            iM40424 = C2100.m4048((jLongValue4 << i23) ^ (jLongValue4 >> c2));
                                            int i211111116 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i211111116) + i211111116 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case C4261.LONG_FIELD_NUMBER /* 4 */:
                                    i8 = i8;
                                    iM40421 = C2100.m4048(((Integer) key).intValue());
                                    i4 = iM40421 + iM40435;
                                    enumC1497 = (EnumC1497) c2808.f9376;
                                    iM40423 = C2100.m4047(2);
                                    if (enumC1497 == c5329) {
                                        iM40423 *= 2;
                                    }
                                    switch (enumC1497.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iM40424 = 8;
                                            int i211111117 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i211111117) + i211111117 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iM40424 = 4;
                                            int i211111118 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i211111118) + i211111118 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                                            iM40424 = C2100.m4048(((Long) value).longValue());
                                            int i211111119 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i211111119) + i211111119 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                                            iM40424 = C2100.m4048(((Long) value).longValue());
                                            int i2111111110 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i2111111110) + i2111111110 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case C4261.LONG_FIELD_NUMBER /* 4 */:
                                            iM40424 = C2100.m4048(((Integer) value).intValue());
                                            int i2111111111 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i2111111111) + i2111111111 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case C4261.STRING_FIELD_NUMBER /* 5 */:
                                            ((Long) value).getClass();
                                            iM40424 = 8;
                                            int i2111111112 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i2111111112) + i2111111112 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                                            ((Integer) value).getClass();
                                            iM40424 = 4;
                                            int i2111111113 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i2111111113) + i2111111113 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                                            ((Boolean) value).getClass();
                                            iM40424 = i23;
                                            int i2111111114 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i2111111114) + i2111111114 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 8:
                                            if (value instanceof C0533) {
                                                size4 = ((C0533) value).size();
                                                iM40425 = C2100.m4049(size4);
                                                iM40424 = size4 + iM40425;
                                            } else {
                                                iM40424 = C2100.m4050((String) value);
                                            }
                                            int i2111111115 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i2111111115) + i2111111115 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 9:
                                            iM40424 = ((AbstractC0318) ((AbstractC0066) value)).mo677(null);
                                            int i2111111116 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i2111111116) + i2111111116 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 10:
                                            size4 = ((AbstractC0318) ((AbstractC0066) value)).mo677(null);
                                            iM40425 = C2100.m4049(size4);
                                            iM40424 = size4 + iM40425;
                                            int i2111111117 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i2111111117) + i2111111117 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 11:
                                            if (value instanceof C0533) {
                                                size4 = ((C0533) value).size();
                                                iM40425 = C2100.m4049(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                iM40425 = C2100.m4049(size4);
                                            }
                                            iM40424 = size4 + iM40425;
                                            int i2111111118 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i2111111118) + i2111111118 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 12:
                                            iM40424 = C2100.m4049(((Integer) value).intValue());
                                            int i2111111119 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i2111111119) + i2111111119 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 13:
                                            iM40424 = C2100.m4048(((Integer) value).intValue());
                                            int i21111111110 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i21111111110) + i21111111110 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iM40424 = 4;
                                            int i21111111111 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i21111111111) + i21111111111 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iM40424 = 8;
                                            int i21111111112 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i21111111112) + i21111111112 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 16:
                                            int iIntValue5 = ((Integer) value).intValue();
                                            iM40424 = C2100.m4049((iIntValue5 >> 31) ^ (iIntValue5 << 1));
                                            int i21111111113 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i21111111113) + i21111111113 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 17:
                                            long jLongValue5 = ((Long) value).longValue();
                                            iM40424 = C2100.m4048((jLongValue5 << i23) ^ (jLongValue5 >> c2));
                                            int i21111111114 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i21111111114) + i21111111114 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case C4261.STRING_FIELD_NUMBER /* 5 */:
                                    ((Long) key).getClass();
                                    iM40421 = 8;
                                    i4 = iM40421 + iM40435;
                                    enumC1497 = (EnumC1497) c2808.f9376;
                                    iM40423 = C2100.m4047(2);
                                    if (enumC1497 == c5329) {
                                        iM40423 *= 2;
                                    }
                                    switch (enumC1497.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iM40424 = 8;
                                            int i21111111115 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i21111111115) + i21111111115 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iM40424 = 4;
                                            int i21111111116 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i21111111116) + i21111111116 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                                            iM40424 = C2100.m4048(((Long) value).longValue());
                                            int i21111111117 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i21111111117) + i21111111117 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                                            iM40424 = C2100.m4048(((Long) value).longValue());
                                            int i21111111118 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i21111111118) + i21111111118 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case C4261.LONG_FIELD_NUMBER /* 4 */:
                                            iM40424 = C2100.m4048(((Integer) value).intValue());
                                            int i21111111119 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i21111111119) + i21111111119 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case C4261.STRING_FIELD_NUMBER /* 5 */:
                                            ((Long) value).getClass();
                                            iM40424 = 8;
                                            int i211111111110 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i211111111110) + i211111111110 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                                            ((Integer) value).getClass();
                                            iM40424 = 4;
                                            int i211111111111 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i211111111111) + i211111111111 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                                            ((Boolean) value).getClass();
                                            iM40424 = i23;
                                            int i211111111112 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i211111111112) + i211111111112 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 8:
                                            if (value instanceof C0533) {
                                                size4 = ((C0533) value).size();
                                                iM40425 = C2100.m4049(size4);
                                                iM40424 = size4 + iM40425;
                                            } else {
                                                iM40424 = C2100.m4050((String) value);
                                            }
                                            int i211111111113 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i211111111113) + i211111111113 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 9:
                                            iM40424 = ((AbstractC0318) ((AbstractC0066) value)).mo677(null);
                                            int i211111111114 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i211111111114) + i211111111114 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 10:
                                            size4 = ((AbstractC0318) ((AbstractC0066) value)).mo677(null);
                                            iM40425 = C2100.m4049(size4);
                                            iM40424 = size4 + iM40425;
                                            int i211111111115 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i211111111115) + i211111111115 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 11:
                                            if (value instanceof C0533) {
                                                size4 = ((C0533) value).size();
                                                iM40425 = C2100.m4049(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                iM40425 = C2100.m4049(size4);
                                            }
                                            iM40424 = size4 + iM40425;
                                            int i211111111116 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i211111111116) + i211111111116 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 12:
                                            iM40424 = C2100.m4049(((Integer) value).intValue());
                                            int i211111111117 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i211111111117) + i211111111117 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 13:
                                            iM40424 = C2100.m4048(((Integer) value).intValue());
                                            int i211111111118 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i211111111118) + i211111111118 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iM40424 = 4;
                                            int i211111111119 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i211111111119) + i211111111119 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iM40424 = 8;
                                            int i2111111111110 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i2111111111110) + i2111111111110 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 16:
                                            int iIntValue6 = ((Integer) value).intValue();
                                            iM40424 = C2100.m4049((iIntValue6 >> 31) ^ (iIntValue6 << 1));
                                            int i2111111111111 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i2111111111111) + i2111111111111 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 17:
                                            long jLongValue6 = ((Long) value).longValue();
                                            iM40424 = C2100.m4048((jLongValue6 << i23) ^ (jLongValue6 >> c2));
                                            int i2111111111112 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i2111111111112) + i2111111111112 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                                    ((Integer) key).getClass();
                                    iM40421 = 4;
                                    i4 = iM40421 + iM40435;
                                    enumC1497 = (EnumC1497) c2808.f9376;
                                    iM40423 = C2100.m4047(2);
                                    if (enumC1497 == c5329) {
                                        iM40423 *= 2;
                                    }
                                    switch (enumC1497.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iM40424 = 8;
                                            int i2111111111113 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i2111111111113) + i2111111111113 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iM40424 = 4;
                                            int i2111111111114 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i2111111111114) + i2111111111114 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                                            iM40424 = C2100.m4048(((Long) value).longValue());
                                            int i2111111111115 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i2111111111115) + i2111111111115 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                                            iM40424 = C2100.m4048(((Long) value).longValue());
                                            int i2111111111116 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i2111111111116) + i2111111111116 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case C4261.LONG_FIELD_NUMBER /* 4 */:
                                            iM40424 = C2100.m4048(((Integer) value).intValue());
                                            int i2111111111117 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i2111111111117) + i2111111111117 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case C4261.STRING_FIELD_NUMBER /* 5 */:
                                            ((Long) value).getClass();
                                            iM40424 = 8;
                                            int i2111111111118 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i2111111111118) + i2111111111118 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                                            ((Integer) value).getClass();
                                            iM40424 = 4;
                                            int i2111111111119 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i2111111111119) + i2111111111119 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                                            ((Boolean) value).getClass();
                                            iM40424 = i23;
                                            int i21111111111110 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i21111111111110) + i21111111111110 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 8:
                                            if (value instanceof C0533) {
                                                size4 = ((C0533) value).size();
                                                iM40425 = C2100.m4049(size4);
                                                iM40424 = size4 + iM40425;
                                            } else {
                                                iM40424 = C2100.m4050((String) value);
                                            }
                                            int i21111111111111 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i21111111111111) + i21111111111111 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 9:
                                            iM40424 = ((AbstractC0318) ((AbstractC0066) value)).mo677(null);
                                            int i21111111111112 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i21111111111112) + i21111111111112 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 10:
                                            size4 = ((AbstractC0318) ((AbstractC0066) value)).mo677(null);
                                            iM40425 = C2100.m4049(size4);
                                            iM40424 = size4 + iM40425;
                                            int i21111111111113 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i21111111111113) + i21111111111113 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 11:
                                            if (value instanceof C0533) {
                                                size4 = ((C0533) value).size();
                                                iM40425 = C2100.m4049(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                iM40425 = C2100.m4049(size4);
                                            }
                                            iM40424 = size4 + iM40425;
                                            int i21111111111114 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i21111111111114) + i21111111111114 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 12:
                                            iM40424 = C2100.m4049(((Integer) value).intValue());
                                            int i21111111111115 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i21111111111115) + i21111111111115 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 13:
                                            iM40424 = C2100.m4048(((Integer) value).intValue());
                                            int i21111111111116 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i21111111111116) + i21111111111116 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iM40424 = 4;
                                            int i21111111111117 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i21111111111117) + i21111111111117 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iM40424 = 8;
                                            int i21111111111118 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i21111111111118) + i21111111111118 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 16:
                                            int iIntValue7 = ((Integer) value).intValue();
                                            iM40424 = C2100.m4049((iIntValue7 >> 31) ^ (iIntValue7 << 1));
                                            int i21111111111119 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i21111111111119) + i21111111111119 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 17:
                                            long jLongValue7 = ((Long) value).longValue();
                                            iM40424 = C2100.m4048((jLongValue7 << i23) ^ (jLongValue7 >> c2));
                                            int i211111111111110 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i211111111111110) + i211111111111110 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                                    i8 = i8;
                                    ((Boolean) key).getClass();
                                    iM40421 = i23;
                                    i4 = iM40421 + iM40435;
                                    enumC1497 = (EnumC1497) c2808.f9376;
                                    iM40423 = C2100.m4047(2);
                                    if (enumC1497 == c5329) {
                                        iM40423 *= 2;
                                    }
                                    switch (enumC1497.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iM40424 = 8;
                                            int i211111111111111 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i211111111111111) + i211111111111111 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iM40424 = 4;
                                            int i211111111111112 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i211111111111112) + i211111111111112 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                                            iM40424 = C2100.m4048(((Long) value).longValue());
                                            int i211111111111113 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i211111111111113) + i211111111111113 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                                            iM40424 = C2100.m4048(((Long) value).longValue());
                                            int i211111111111114 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i211111111111114) + i211111111111114 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case C4261.LONG_FIELD_NUMBER /* 4 */:
                                            iM40424 = C2100.m4048(((Integer) value).intValue());
                                            int i211111111111115 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i211111111111115) + i211111111111115 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case C4261.STRING_FIELD_NUMBER /* 5 */:
                                            ((Long) value).getClass();
                                            iM40424 = 8;
                                            int i211111111111116 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i211111111111116) + i211111111111116 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                                            ((Integer) value).getClass();
                                            iM40424 = 4;
                                            int i211111111111117 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i211111111111117) + i211111111111117 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                                            ((Boolean) value).getClass();
                                            iM40424 = i23;
                                            int i211111111111118 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i211111111111118) + i211111111111118 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 8:
                                            if (value instanceof C0533) {
                                                size4 = ((C0533) value).size();
                                                iM40425 = C2100.m4049(size4);
                                                iM40424 = size4 + iM40425;
                                            } else {
                                                iM40424 = C2100.m4050((String) value);
                                            }
                                            int i211111111111119 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i211111111111119) + i211111111111119 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 9:
                                            iM40424 = ((AbstractC0318) ((AbstractC0066) value)).mo677(null);
                                            int i2111111111111110 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i2111111111111110) + i2111111111111110 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 10:
                                            size4 = ((AbstractC0318) ((AbstractC0066) value)).mo677(null);
                                            iM40425 = C2100.m4049(size4);
                                            iM40424 = size4 + iM40425;
                                            int i2111111111111111 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i2111111111111111) + i2111111111111111 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 11:
                                            if (value instanceof C0533) {
                                                size4 = ((C0533) value).size();
                                                iM40425 = C2100.m4049(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                iM40425 = C2100.m4049(size4);
                                            }
                                            iM40424 = size4 + iM40425;
                                            int i2111111111111112 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i2111111111111112) + i2111111111111112 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 12:
                                            iM40424 = C2100.m4049(((Integer) value).intValue());
                                            int i2111111111111113 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i2111111111111113) + i2111111111111113 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 13:
                                            iM40424 = C2100.m4048(((Integer) value).intValue());
                                            int i2111111111111114 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i2111111111111114) + i2111111111111114 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iM40424 = 4;
                                            int i2111111111111115 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i2111111111111115) + i2111111111111115 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iM40424 = 8;
                                            int i2111111111111116 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i2111111111111116) + i2111111111111116 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 16:
                                            int iIntValue8 = ((Integer) value).intValue();
                                            iM40424 = C2100.m4049((iIntValue8 >> 31) ^ (iIntValue8 << 1));
                                            int i2111111111111117 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i2111111111111117) + i2111111111111117 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 17:
                                            long jLongValue8 = ((Long) value).longValue();
                                            iM40424 = C2100.m4048((jLongValue8 << i23) ^ (jLongValue8 >> c2));
                                            int i2111111111111118 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i2111111111111118) + i2111111111111118 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 8:
                                    i8 = i8;
                                    if (key instanceof C0533) {
                                        size3 = ((C0533) key).size();
                                        iM40422 = C2100.m4049(size3);
                                        iM40421 = iM40422 + size3;
                                    } else {
                                        iM40421 = C2100.m4050((String) key);
                                    }
                                    i4 = iM40421 + iM40435;
                                    enumC1497 = (EnumC1497) c2808.f9376;
                                    iM40423 = C2100.m4047(2);
                                    if (enumC1497 == c5329) {
                                        iM40423 *= 2;
                                    }
                                    switch (enumC1497.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iM40424 = 8;
                                            int i2111111111111119 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i2111111111111119) + i2111111111111119 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iM40424 = 4;
                                            int i21111111111111110 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i21111111111111110) + i21111111111111110 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                                            iM40424 = C2100.m4048(((Long) value).longValue());
                                            int i21111111111111111 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i21111111111111111) + i21111111111111111 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                                            iM40424 = C2100.m4048(((Long) value).longValue());
                                            int i21111111111111112 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i21111111111111112) + i21111111111111112 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case C4261.LONG_FIELD_NUMBER /* 4 */:
                                            iM40424 = C2100.m4048(((Integer) value).intValue());
                                            int i21111111111111113 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i21111111111111113) + i21111111111111113 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case C4261.STRING_FIELD_NUMBER /* 5 */:
                                            ((Long) value).getClass();
                                            iM40424 = 8;
                                            int i21111111111111114 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i21111111111111114) + i21111111111111114 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                                            ((Integer) value).getClass();
                                            iM40424 = 4;
                                            int i21111111111111115 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i21111111111111115) + i21111111111111115 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                                            ((Boolean) value).getClass();
                                            iM40424 = i23;
                                            int i21111111111111116 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i21111111111111116) + i21111111111111116 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 8:
                                            if (value instanceof C0533) {
                                                size4 = ((C0533) value).size();
                                                iM40425 = C2100.m4049(size4);
                                                iM40424 = size4 + iM40425;
                                            } else {
                                                iM40424 = C2100.m4050((String) value);
                                            }
                                            int i21111111111111117 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i21111111111111117) + i21111111111111117 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 9:
                                            iM40424 = ((AbstractC0318) ((AbstractC0066) value)).mo677(null);
                                            int i21111111111111118 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i21111111111111118) + i21111111111111118 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 10:
                                            size4 = ((AbstractC0318) ((AbstractC0066) value)).mo677(null);
                                            iM40425 = C2100.m4049(size4);
                                            iM40424 = size4 + iM40425;
                                            int i21111111111111119 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i21111111111111119) + i21111111111111119 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 11:
                                            if (value instanceof C0533) {
                                                size4 = ((C0533) value).size();
                                                iM40425 = C2100.m4049(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                iM40425 = C2100.m4049(size4);
                                            }
                                            iM40424 = size4 + iM40425;
                                            int i211111111111111110 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i211111111111111110) + i211111111111111110 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 12:
                                            iM40424 = C2100.m4049(((Integer) value).intValue());
                                            int i211111111111111111 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i211111111111111111) + i211111111111111111 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 13:
                                            iM40424 = C2100.m4048(((Integer) value).intValue());
                                            int i211111111111111112 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i211111111111111112) + i211111111111111112 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iM40424 = 4;
                                            int i211111111111111113 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i211111111111111113) + i211111111111111113 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iM40424 = 8;
                                            int i211111111111111114 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i211111111111111114) + i211111111111111114 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 16:
                                            int iIntValue9 = ((Integer) value).intValue();
                                            iM40424 = C2100.m4049((iIntValue9 >> 31) ^ (iIntValue9 << 1));
                                            int i211111111111111115 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i211111111111111115) + i211111111111111115 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 17:
                                            long jLongValue9 = ((Long) value).longValue();
                                            iM40424 = C2100.m4048((jLongValue9 << i23) ^ (jLongValue9 >> c2));
                                            int i211111111111111116 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i211111111111111116) + i211111111111111116 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 9:
                                    i8 = i8;
                                    iM40421 = ((AbstractC0318) ((AbstractC0066) key)).mo677(null);
                                    i4 = iM40421 + iM40435;
                                    enumC1497 = (EnumC1497) c2808.f9376;
                                    iM40423 = C2100.m4047(2);
                                    if (enumC1497 == c5329) {
                                        iM40423 *= 2;
                                    }
                                    switch (enumC1497.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iM40424 = 8;
                                            int i211111111111111117 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i211111111111111117) + i211111111111111117 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iM40424 = 4;
                                            int i211111111111111118 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i211111111111111118) + i211111111111111118 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                                            iM40424 = C2100.m4048(((Long) value).longValue());
                                            int i211111111111111119 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i211111111111111119) + i211111111111111119 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                                            iM40424 = C2100.m4048(((Long) value).longValue());
                                            int i2111111111111111110 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i2111111111111111110) + i2111111111111111110 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case C4261.LONG_FIELD_NUMBER /* 4 */:
                                            iM40424 = C2100.m4048(((Integer) value).intValue());
                                            int i2111111111111111111 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i2111111111111111111) + i2111111111111111111 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case C4261.STRING_FIELD_NUMBER /* 5 */:
                                            ((Long) value).getClass();
                                            iM40424 = 8;
                                            int i2111111111111111112 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i2111111111111111112) + i2111111111111111112 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                                            ((Integer) value).getClass();
                                            iM40424 = 4;
                                            int i2111111111111111113 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i2111111111111111113) + i2111111111111111113 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                                            ((Boolean) value).getClass();
                                            iM40424 = i23;
                                            int i2111111111111111114 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i2111111111111111114) + i2111111111111111114 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 8:
                                            if (value instanceof C0533) {
                                                size4 = ((C0533) value).size();
                                                iM40425 = C2100.m4049(size4);
                                                iM40424 = size4 + iM40425;
                                            } else {
                                                iM40424 = C2100.m4050((String) value);
                                            }
                                            int i2111111111111111115 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i2111111111111111115) + i2111111111111111115 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 9:
                                            iM40424 = ((AbstractC0318) ((AbstractC0066) value)).mo677(null);
                                            int i2111111111111111116 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i2111111111111111116) + i2111111111111111116 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 10:
                                            size4 = ((AbstractC0318) ((AbstractC0066) value)).mo677(null);
                                            iM40425 = C2100.m4049(size4);
                                            iM40424 = size4 + iM40425;
                                            int i2111111111111111117 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i2111111111111111117) + i2111111111111111117 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 11:
                                            if (value instanceof C0533) {
                                                size4 = ((C0533) value).size();
                                                iM40425 = C2100.m4049(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                iM40425 = C2100.m4049(size4);
                                            }
                                            iM40424 = size4 + iM40425;
                                            int i2111111111111111118 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i2111111111111111118) + i2111111111111111118 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 12:
                                            iM40424 = C2100.m4049(((Integer) value).intValue());
                                            int i2111111111111111119 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i2111111111111111119) + i2111111111111111119 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 13:
                                            iM40424 = C2100.m4048(((Integer) value).intValue());
                                            int i21111111111111111110 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i21111111111111111110) + i21111111111111111110 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iM40424 = 4;
                                            int i21111111111111111111 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i21111111111111111111) + i21111111111111111111 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iM40424 = 8;
                                            int i21111111111111111112 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i21111111111111111112) + i21111111111111111112 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 16:
                                            int iIntValue10 = ((Integer) value).intValue();
                                            iM40424 = C2100.m4049((iIntValue10 >> 31) ^ (iIntValue10 << 1));
                                            int i21111111111111111113 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i21111111111111111113) + i21111111111111111113 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 17:
                                            long jLongValue10 = ((Long) value).longValue();
                                            iM40424 = C2100.m4048((jLongValue10 << i23) ^ (jLongValue10 >> c2));
                                            int i21111111111111111114 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i21111111111111111114) + i21111111111111111114 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 10:
                                    i8 = i8;
                                    int iMo6711 = ((AbstractC0318) ((AbstractC0066) key)).mo677(null);
                                    iM40421 = C2100.m4049(iMo6711) + iMo6711;
                                    i4 = iM40421 + iM40435;
                                    enumC1497 = (EnumC1497) c2808.f9376;
                                    iM40423 = C2100.m4047(2);
                                    if (enumC1497 == c5329) {
                                        iM40423 *= 2;
                                    }
                                    switch (enumC1497.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iM40424 = 8;
                                            int i21111111111111111115 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i21111111111111111115) + i21111111111111111115 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iM40424 = 4;
                                            int i21111111111111111116 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i21111111111111111116) + i21111111111111111116 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                                            iM40424 = C2100.m4048(((Long) value).longValue());
                                            int i21111111111111111117 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i21111111111111111117) + i21111111111111111117 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                                            iM40424 = C2100.m4048(((Long) value).longValue());
                                            int i21111111111111111118 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i21111111111111111118) + i21111111111111111118 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case C4261.LONG_FIELD_NUMBER /* 4 */:
                                            iM40424 = C2100.m4048(((Integer) value).intValue());
                                            int i21111111111111111119 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i21111111111111111119) + i21111111111111111119 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case C4261.STRING_FIELD_NUMBER /* 5 */:
                                            ((Long) value).getClass();
                                            iM40424 = 8;
                                            int i211111111111111111110 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i211111111111111111110) + i211111111111111111110 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                                            ((Integer) value).getClass();
                                            iM40424 = 4;
                                            int i211111111111111111111 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i211111111111111111111) + i211111111111111111111 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                                            ((Boolean) value).getClass();
                                            iM40424 = i23;
                                            int i211111111111111111112 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i211111111111111111112) + i211111111111111111112 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 8:
                                            if (value instanceof C0533) {
                                                size4 = ((C0533) value).size();
                                                iM40425 = C2100.m4049(size4);
                                                iM40424 = size4 + iM40425;
                                            } else {
                                                iM40424 = C2100.m4050((String) value);
                                            }
                                            int i211111111111111111113 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i211111111111111111113) + i211111111111111111113 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 9:
                                            iM40424 = ((AbstractC0318) ((AbstractC0066) value)).mo677(null);
                                            int i211111111111111111114 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i211111111111111111114) + i211111111111111111114 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 10:
                                            size4 = ((AbstractC0318) ((AbstractC0066) value)).mo677(null);
                                            iM40425 = C2100.m4049(size4);
                                            iM40424 = size4 + iM40425;
                                            int i211111111111111111115 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i211111111111111111115) + i211111111111111111115 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 11:
                                            if (value instanceof C0533) {
                                                size4 = ((C0533) value).size();
                                                iM40425 = C2100.m4049(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                iM40425 = C2100.m4049(size4);
                                            }
                                            iM40424 = size4 + iM40425;
                                            int i211111111111111111116 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i211111111111111111116) + i211111111111111111116 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 12:
                                            iM40424 = C2100.m4049(((Integer) value).intValue());
                                            int i211111111111111111117 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i211111111111111111117) + i211111111111111111117 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 13:
                                            iM40424 = C2100.m4048(((Integer) value).intValue());
                                            int i211111111111111111118 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i211111111111111111118) + i211111111111111111118 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iM40424 = 4;
                                            int i211111111111111111119 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i211111111111111111119) + i211111111111111111119 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iM40424 = 8;
                                            int i2111111111111111111110 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i2111111111111111111110) + i2111111111111111111110 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 16:
                                            int iIntValue11 = ((Integer) value).intValue();
                                            iM40424 = C2100.m4049((iIntValue11 >> 31) ^ (iIntValue11 << 1));
                                            int i2111111111111111111111 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i2111111111111111111111) + i2111111111111111111111 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 17:
                                            long jLongValue11 = ((Long) value).longValue();
                                            iM40424 = C2100.m4048((jLongValue11 << i23) ^ (jLongValue11 >> c2));
                                            int i2111111111111111111112 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i2111111111111111111112) + i2111111111111111111112 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 11:
                                    i8 = i8;
                                    if (key instanceof C0533) {
                                        size3 = ((C0533) key).size();
                                        iM40422 = C2100.m4049(size3);
                                    } else {
                                        size3 = ((byte[]) key).length;
                                        iM40422 = C2100.m4049(size3);
                                    }
                                    iM40421 = iM40422 + size3;
                                    i4 = iM40421 + iM40435;
                                    enumC1497 = (EnumC1497) c2808.f9376;
                                    iM40423 = C2100.m4047(2);
                                    if (enumC1497 == c5329) {
                                        iM40423 *= 2;
                                    }
                                    switch (enumC1497.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iM40424 = 8;
                                            int i2111111111111111111113 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i2111111111111111111113) + i2111111111111111111113 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iM40424 = 4;
                                            int i2111111111111111111114 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i2111111111111111111114) + i2111111111111111111114 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                                            iM40424 = C2100.m4048(((Long) value).longValue());
                                            int i2111111111111111111115 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i2111111111111111111115) + i2111111111111111111115 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                                            iM40424 = C2100.m4048(((Long) value).longValue());
                                            int i2111111111111111111116 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i2111111111111111111116) + i2111111111111111111116 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case C4261.LONG_FIELD_NUMBER /* 4 */:
                                            iM40424 = C2100.m4048(((Integer) value).intValue());
                                            int i2111111111111111111117 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i2111111111111111111117) + i2111111111111111111117 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case C4261.STRING_FIELD_NUMBER /* 5 */:
                                            ((Long) value).getClass();
                                            iM40424 = 8;
                                            int i2111111111111111111118 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i2111111111111111111118) + i2111111111111111111118 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                                            ((Integer) value).getClass();
                                            iM40424 = 4;
                                            int i2111111111111111111119 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i2111111111111111111119) + i2111111111111111111119 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                                            ((Boolean) value).getClass();
                                            iM40424 = i23;
                                            int i21111111111111111111110 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i21111111111111111111110) + i21111111111111111111110 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 8:
                                            if (value instanceof C0533) {
                                                size4 = ((C0533) value).size();
                                                iM40425 = C2100.m4049(size4);
                                                iM40424 = size4 + iM40425;
                                            } else {
                                                iM40424 = C2100.m4050((String) value);
                                            }
                                            int i21111111111111111111111 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i21111111111111111111111) + i21111111111111111111111 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 9:
                                            iM40424 = ((AbstractC0318) ((AbstractC0066) value)).mo677(null);
                                            int i21111111111111111111112 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i21111111111111111111112) + i21111111111111111111112 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 10:
                                            size4 = ((AbstractC0318) ((AbstractC0066) value)).mo677(null);
                                            iM40425 = C2100.m4049(size4);
                                            iM40424 = size4 + iM40425;
                                            int i21111111111111111111113 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i21111111111111111111113) + i21111111111111111111113 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 11:
                                            if (value instanceof C0533) {
                                                size4 = ((C0533) value).size();
                                                iM40425 = C2100.m4049(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                iM40425 = C2100.m4049(size4);
                                            }
                                            iM40424 = size4 + iM40425;
                                            int i21111111111111111111114 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i21111111111111111111114) + i21111111111111111111114 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 12:
                                            iM40424 = C2100.m4049(((Integer) value).intValue());
                                            int i21111111111111111111115 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i21111111111111111111115) + i21111111111111111111115 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 13:
                                            iM40424 = C2100.m4048(((Integer) value).intValue());
                                            int i21111111111111111111116 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i21111111111111111111116) + i21111111111111111111116 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iM40424 = 4;
                                            int i21111111111111111111117 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i21111111111111111111117) + i21111111111111111111117 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iM40424 = 8;
                                            int i21111111111111111111118 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i21111111111111111111118) + i21111111111111111111118 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 16:
                                            int iIntValue12 = ((Integer) value).intValue();
                                            iM40424 = C2100.m4049((iIntValue12 >> 31) ^ (iIntValue12 << 1));
                                            int i21111111111111111111119 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i21111111111111111111119) + i21111111111111111111119 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 17:
                                            long jLongValue12 = ((Long) value).longValue();
                                            iM40424 = C2100.m4048((jLongValue12 << i23) ^ (jLongValue12 >> c2));
                                            int i211111111111111111111110 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i211111111111111111111110) + i211111111111111111111110 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 12:
                                    i8 = i8;
                                    iM40421 = C2100.m4049(((Integer) key).intValue());
                                    i4 = iM40421 + iM40435;
                                    enumC1497 = (EnumC1497) c2808.f9376;
                                    iM40423 = C2100.m4047(2);
                                    if (enumC1497 == c5329) {
                                        iM40423 *= 2;
                                    }
                                    switch (enumC1497.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iM40424 = 8;
                                            int i211111111111111111111111 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i211111111111111111111111) + i211111111111111111111111 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iM40424 = 4;
                                            int i211111111111111111111112 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i211111111111111111111112) + i211111111111111111111112 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                                            iM40424 = C2100.m4048(((Long) value).longValue());
                                            int i211111111111111111111113 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i211111111111111111111113) + i211111111111111111111113 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                                            iM40424 = C2100.m4048(((Long) value).longValue());
                                            int i211111111111111111111114 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i211111111111111111111114) + i211111111111111111111114 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case C4261.LONG_FIELD_NUMBER /* 4 */:
                                            iM40424 = C2100.m4048(((Integer) value).intValue());
                                            int i211111111111111111111115 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i211111111111111111111115) + i211111111111111111111115 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case C4261.STRING_FIELD_NUMBER /* 5 */:
                                            ((Long) value).getClass();
                                            iM40424 = 8;
                                            int i211111111111111111111116 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i211111111111111111111116) + i211111111111111111111116 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                                            ((Integer) value).getClass();
                                            iM40424 = 4;
                                            int i211111111111111111111117 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i211111111111111111111117) + i211111111111111111111117 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                                            ((Boolean) value).getClass();
                                            iM40424 = i23;
                                            int i211111111111111111111118 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i211111111111111111111118) + i211111111111111111111118 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 8:
                                            if (value instanceof C0533) {
                                                size4 = ((C0533) value).size();
                                                iM40425 = C2100.m4049(size4);
                                                iM40424 = size4 + iM40425;
                                            } else {
                                                iM40424 = C2100.m4050((String) value);
                                            }
                                            int i211111111111111111111119 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i211111111111111111111119) + i211111111111111111111119 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 9:
                                            iM40424 = ((AbstractC0318) ((AbstractC0066) value)).mo677(null);
                                            int i2111111111111111111111110 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i2111111111111111111111110) + i2111111111111111111111110 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 10:
                                            size4 = ((AbstractC0318) ((AbstractC0066) value)).mo677(null);
                                            iM40425 = C2100.m4049(size4);
                                            iM40424 = size4 + iM40425;
                                            int i2111111111111111111111111 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i2111111111111111111111111) + i2111111111111111111111111 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 11:
                                            if (value instanceof C0533) {
                                                size4 = ((C0533) value).size();
                                                iM40425 = C2100.m4049(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                iM40425 = C2100.m4049(size4);
                                            }
                                            iM40424 = size4 + iM40425;
                                            int i2111111111111111111111112 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i2111111111111111111111112) + i2111111111111111111111112 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 12:
                                            iM40424 = C2100.m4049(((Integer) value).intValue());
                                            int i2111111111111111111111113 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i2111111111111111111111113) + i2111111111111111111111113 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 13:
                                            iM40424 = C2100.m4048(((Integer) value).intValue());
                                            int i2111111111111111111111114 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i2111111111111111111111114) + i2111111111111111111111114 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iM40424 = 4;
                                            int i2111111111111111111111115 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i2111111111111111111111115) + i2111111111111111111111115 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iM40424 = 8;
                                            int i2111111111111111111111116 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i2111111111111111111111116) + i2111111111111111111111116 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 16:
                                            int iIntValue13 = ((Integer) value).intValue();
                                            iM40424 = C2100.m4049((iIntValue13 >> 31) ^ (iIntValue13 << 1));
                                            int i2111111111111111111111117 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i2111111111111111111111117) + i2111111111111111111111117 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 17:
                                            long jLongValue13 = ((Long) value).longValue();
                                            iM40424 = C2100.m4048((jLongValue13 << i23) ^ (jLongValue13 >> c2));
                                            int i2111111111111111111111118 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i2111111111111111111111118) + i2111111111111111111111118 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 13:
                                    i8 = i8;
                                    iM40421 = C2100.m4048(((Integer) key).intValue());
                                    i4 = iM40421 + iM40435;
                                    enumC1497 = (EnumC1497) c2808.f9376;
                                    iM40423 = C2100.m4047(2);
                                    if (enumC1497 == c5329) {
                                        iM40423 *= 2;
                                    }
                                    switch (enumC1497.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iM40424 = 8;
                                            int i2111111111111111111111119 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i2111111111111111111111119) + i2111111111111111111111119 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iM40424 = 4;
                                            int i21111111111111111111111110 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i21111111111111111111111110) + i21111111111111111111111110 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                                            iM40424 = C2100.m4048(((Long) value).longValue());
                                            int i21111111111111111111111111 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i21111111111111111111111111) + i21111111111111111111111111 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                                            iM40424 = C2100.m4048(((Long) value).longValue());
                                            int i21111111111111111111111112 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i21111111111111111111111112) + i21111111111111111111111112 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case C4261.LONG_FIELD_NUMBER /* 4 */:
                                            iM40424 = C2100.m4048(((Integer) value).intValue());
                                            int i21111111111111111111111113 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i21111111111111111111111113) + i21111111111111111111111113 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case C4261.STRING_FIELD_NUMBER /* 5 */:
                                            ((Long) value).getClass();
                                            iM40424 = 8;
                                            int i21111111111111111111111114 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i21111111111111111111111114) + i21111111111111111111111114 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                                            ((Integer) value).getClass();
                                            iM40424 = 4;
                                            int i21111111111111111111111115 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i21111111111111111111111115) + i21111111111111111111111115 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                                            ((Boolean) value).getClass();
                                            iM40424 = i23;
                                            int i21111111111111111111111116 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i21111111111111111111111116) + i21111111111111111111111116 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 8:
                                            if (value instanceof C0533) {
                                                size4 = ((C0533) value).size();
                                                iM40425 = C2100.m4049(size4);
                                                iM40424 = size4 + iM40425;
                                            } else {
                                                iM40424 = C2100.m4050((String) value);
                                            }
                                            int i21111111111111111111111117 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i21111111111111111111111117) + i21111111111111111111111117 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 9:
                                            iM40424 = ((AbstractC0318) ((AbstractC0066) value)).mo677(null);
                                            int i21111111111111111111111118 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i21111111111111111111111118) + i21111111111111111111111118 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 10:
                                            size4 = ((AbstractC0318) ((AbstractC0066) value)).mo677(null);
                                            iM40425 = C2100.m4049(size4);
                                            iM40424 = size4 + iM40425;
                                            int i21111111111111111111111119 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i21111111111111111111111119) + i21111111111111111111111119 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 11:
                                            if (value instanceof C0533) {
                                                size4 = ((C0533) value).size();
                                                iM40425 = C2100.m4049(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                iM40425 = C2100.m4049(size4);
                                            }
                                            iM40424 = size4 + iM40425;
                                            int i211111111111111111111111110 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i211111111111111111111111110) + i211111111111111111111111110 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 12:
                                            iM40424 = C2100.m4049(((Integer) value).intValue());
                                            int i211111111111111111111111111 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i211111111111111111111111111) + i211111111111111111111111111 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 13:
                                            iM40424 = C2100.m4048(((Integer) value).intValue());
                                            int i211111111111111111111111112 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i211111111111111111111111112) + i211111111111111111111111112 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iM40424 = 4;
                                            int i211111111111111111111111113 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i211111111111111111111111113) + i211111111111111111111111113 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iM40424 = 8;
                                            int i211111111111111111111111114 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i211111111111111111111111114) + i211111111111111111111111114 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 16:
                                            int iIntValue14 = ((Integer) value).intValue();
                                            iM40424 = C2100.m4049((iIntValue14 >> 31) ^ (iIntValue14 << 1));
                                            int i211111111111111111111111115 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i211111111111111111111111115) + i211111111111111111111111115 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 17:
                                            long jLongValue14 = ((Long) value).longValue();
                                            iM40424 = C2100.m4048((jLongValue14 << i23) ^ (jLongValue14 >> c2));
                                            int i211111111111111111111111116 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i211111111111111111111111116) + i211111111111111111111111116 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 14:
                                    ((Integer) key).getClass();
                                    iM40421 = 4;
                                    i4 = iM40421 + iM40435;
                                    enumC1497 = (EnumC1497) c2808.f9376;
                                    iM40423 = C2100.m4047(2);
                                    if (enumC1497 == c5329) {
                                        iM40423 *= 2;
                                    }
                                    switch (enumC1497.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iM40424 = 8;
                                            int i211111111111111111111111117 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i211111111111111111111111117) + i211111111111111111111111117 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iM40424 = 4;
                                            int i211111111111111111111111118 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i211111111111111111111111118) + i211111111111111111111111118 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                                            iM40424 = C2100.m4048(((Long) value).longValue());
                                            int i211111111111111111111111119 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i211111111111111111111111119) + i211111111111111111111111119 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                                            iM40424 = C2100.m4048(((Long) value).longValue());
                                            int i2111111111111111111111111110 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i2111111111111111111111111110) + i2111111111111111111111111110 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case C4261.LONG_FIELD_NUMBER /* 4 */:
                                            iM40424 = C2100.m4048(((Integer) value).intValue());
                                            int i2111111111111111111111111111 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i2111111111111111111111111111) + i2111111111111111111111111111 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case C4261.STRING_FIELD_NUMBER /* 5 */:
                                            ((Long) value).getClass();
                                            iM40424 = 8;
                                            int i2111111111111111111111111112 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i2111111111111111111111111112) + i2111111111111111111111111112 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                                            ((Integer) value).getClass();
                                            iM40424 = 4;
                                            int i2111111111111111111111111113 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i2111111111111111111111111113) + i2111111111111111111111111113 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                                            ((Boolean) value).getClass();
                                            iM40424 = i23;
                                            int i2111111111111111111111111114 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i2111111111111111111111111114) + i2111111111111111111111111114 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 8:
                                            if (value instanceof C0533) {
                                                size4 = ((C0533) value).size();
                                                iM40425 = C2100.m4049(size4);
                                                iM40424 = size4 + iM40425;
                                            } else {
                                                iM40424 = C2100.m4050((String) value);
                                            }
                                            int i2111111111111111111111111115 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i2111111111111111111111111115) + i2111111111111111111111111115 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 9:
                                            iM40424 = ((AbstractC0318) ((AbstractC0066) value)).mo677(null);
                                            int i2111111111111111111111111116 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i2111111111111111111111111116) + i2111111111111111111111111116 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 10:
                                            size4 = ((AbstractC0318) ((AbstractC0066) value)).mo677(null);
                                            iM40425 = C2100.m4049(size4);
                                            iM40424 = size4 + iM40425;
                                            int i2111111111111111111111111117 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i2111111111111111111111111117) + i2111111111111111111111111117 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 11:
                                            if (value instanceof C0533) {
                                                size4 = ((C0533) value).size();
                                                iM40425 = C2100.m4049(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                iM40425 = C2100.m4049(size4);
                                            }
                                            iM40424 = size4 + iM40425;
                                            int i2111111111111111111111111118 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i2111111111111111111111111118) + i2111111111111111111111111118 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 12:
                                            iM40424 = C2100.m4049(((Integer) value).intValue());
                                            int i2111111111111111111111111119 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i2111111111111111111111111119) + i2111111111111111111111111119 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 13:
                                            iM40424 = C2100.m4048(((Integer) value).intValue());
                                            int i21111111111111111111111111110 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i21111111111111111111111111110) + i21111111111111111111111111110 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iM40424 = 4;
                                            int i21111111111111111111111111111 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i21111111111111111111111111111) + i21111111111111111111111111111 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iM40424 = 8;
                                            int i21111111111111111111111111112 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i21111111111111111111111111112) + i21111111111111111111111111112 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 16:
                                            int iIntValue15 = ((Integer) value).intValue();
                                            iM40424 = C2100.m4049((iIntValue15 >> 31) ^ (iIntValue15 << 1));
                                            int i21111111111111111111111111113 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i21111111111111111111111111113) + i21111111111111111111111111113 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 17:
                                            long jLongValue15 = ((Long) value).longValue();
                                            iM40424 = C2100.m4048((jLongValue15 << i23) ^ (jLongValue15 >> c2));
                                            int i21111111111111111111111111114 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i21111111111111111111111111114) + i21111111111111111111111111114 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 15:
                                    ((Long) key).getClass();
                                    iM40421 = 8;
                                    i4 = iM40421 + iM40435;
                                    enumC1497 = (EnumC1497) c2808.f9376;
                                    iM40423 = C2100.m4047(2);
                                    if (enumC1497 == c5329) {
                                        iM40423 *= 2;
                                    }
                                    switch (enumC1497.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iM40424 = 8;
                                            int i21111111111111111111111111115 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i21111111111111111111111111115) + i21111111111111111111111111115 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iM40424 = 4;
                                            int i21111111111111111111111111116 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i21111111111111111111111111116) + i21111111111111111111111111116 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                                            iM40424 = C2100.m4048(((Long) value).longValue());
                                            int i21111111111111111111111111117 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i21111111111111111111111111117) + i21111111111111111111111111117 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                                            iM40424 = C2100.m4048(((Long) value).longValue());
                                            int i21111111111111111111111111118 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i21111111111111111111111111118) + i21111111111111111111111111118 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case C4261.LONG_FIELD_NUMBER /* 4 */:
                                            iM40424 = C2100.m4048(((Integer) value).intValue());
                                            int i21111111111111111111111111119 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i21111111111111111111111111119) + i21111111111111111111111111119 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case C4261.STRING_FIELD_NUMBER /* 5 */:
                                            ((Long) value).getClass();
                                            iM40424 = 8;
                                            int i211111111111111111111111111110 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i211111111111111111111111111110) + i211111111111111111111111111110 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                                            ((Integer) value).getClass();
                                            iM40424 = 4;
                                            int i211111111111111111111111111111 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i211111111111111111111111111111) + i211111111111111111111111111111 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                                            ((Boolean) value).getClass();
                                            iM40424 = i23;
                                            int i211111111111111111111111111112 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i211111111111111111111111111112) + i211111111111111111111111111112 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 8:
                                            if (value instanceof C0533) {
                                                size4 = ((C0533) value).size();
                                                iM40425 = C2100.m4049(size4);
                                                iM40424 = size4 + iM40425;
                                            } else {
                                                iM40424 = C2100.m4050((String) value);
                                            }
                                            int i211111111111111111111111111113 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i211111111111111111111111111113) + i211111111111111111111111111113 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 9:
                                            iM40424 = ((AbstractC0318) ((AbstractC0066) value)).mo677(null);
                                            int i211111111111111111111111111114 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i211111111111111111111111111114) + i211111111111111111111111111114 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 10:
                                            size4 = ((AbstractC0318) ((AbstractC0066) value)).mo677(null);
                                            iM40425 = C2100.m4049(size4);
                                            iM40424 = size4 + iM40425;
                                            int i211111111111111111111111111115 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i211111111111111111111111111115) + i211111111111111111111111111115 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 11:
                                            if (value instanceof C0533) {
                                                size4 = ((C0533) value).size();
                                                iM40425 = C2100.m4049(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                iM40425 = C2100.m4049(size4);
                                            }
                                            iM40424 = size4 + iM40425;
                                            int i211111111111111111111111111116 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i211111111111111111111111111116) + i211111111111111111111111111116 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 12:
                                            iM40424 = C2100.m4049(((Integer) value).intValue());
                                            int i211111111111111111111111111117 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i211111111111111111111111111117) + i211111111111111111111111111117 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 13:
                                            iM40424 = C2100.m4048(((Integer) value).intValue());
                                            int i211111111111111111111111111118 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i211111111111111111111111111118) + i211111111111111111111111111118 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iM40424 = 4;
                                            int i211111111111111111111111111119 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i211111111111111111111111111119) + i211111111111111111111111111119 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iM40424 = 8;
                                            int i2111111111111111111111111111110 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i2111111111111111111111111111110) + i2111111111111111111111111111110 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 16:
                                            int iIntValue16 = ((Integer) value).intValue();
                                            iM40424 = C2100.m4049((iIntValue16 >> 31) ^ (iIntValue16 << 1));
                                            int i2111111111111111111111111111111 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i2111111111111111111111111111111) + i2111111111111111111111111111111 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 17:
                                            long jLongValue16 = ((Long) value).longValue();
                                            iM40424 = C2100.m4048((jLongValue16 << i23) ^ (jLongValue16 >> c2));
                                            int i2111111111111111111111111111112 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i2111111111111111111111111111112) + i2111111111111111111111111111112 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 16:
                                    int iIntValue17 = ((Integer) key).intValue();
                                    iM40421 = C2100.m4049((iIntValue17 >> 31) ^ (iIntValue17 << 1));
                                    i8 = i8;
                                    i4 = iM40421 + iM40435;
                                    enumC1497 = (EnumC1497) c2808.f9376;
                                    iM40423 = C2100.m4047(2);
                                    if (enumC1497 == c5329) {
                                        iM40423 *= 2;
                                    }
                                    switch (enumC1497.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iM40424 = 8;
                                            int i2111111111111111111111111111113 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i2111111111111111111111111111113) + i2111111111111111111111111111113 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iM40424 = 4;
                                            int i2111111111111111111111111111114 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i2111111111111111111111111111114) + i2111111111111111111111111111114 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                                            iM40424 = C2100.m4048(((Long) value).longValue());
                                            int i2111111111111111111111111111115 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i2111111111111111111111111111115) + i2111111111111111111111111111115 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                                            iM40424 = C2100.m4048(((Long) value).longValue());
                                            int i2111111111111111111111111111116 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i2111111111111111111111111111116) + i2111111111111111111111111111116 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case C4261.LONG_FIELD_NUMBER /* 4 */:
                                            iM40424 = C2100.m4048(((Integer) value).intValue());
                                            int i2111111111111111111111111111117 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i2111111111111111111111111111117) + i2111111111111111111111111111117 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case C4261.STRING_FIELD_NUMBER /* 5 */:
                                            ((Long) value).getClass();
                                            iM40424 = 8;
                                            int i2111111111111111111111111111118 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i2111111111111111111111111111118) + i2111111111111111111111111111118 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                                            ((Integer) value).getClass();
                                            iM40424 = 4;
                                            int i2111111111111111111111111111119 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i2111111111111111111111111111119) + i2111111111111111111111111111119 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                                            ((Boolean) value).getClass();
                                            iM40424 = i23;
                                            int i21111111111111111111111111111110 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i21111111111111111111111111111110) + i21111111111111111111111111111110 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 8:
                                            if (value instanceof C0533) {
                                                size4 = ((C0533) value).size();
                                                iM40425 = C2100.m4049(size4);
                                                iM40424 = size4 + iM40425;
                                            } else {
                                                iM40424 = C2100.m4050((String) value);
                                            }
                                            int i21111111111111111111111111111111 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i21111111111111111111111111111111) + i21111111111111111111111111111111 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 9:
                                            iM40424 = ((AbstractC0318) ((AbstractC0066) value)).mo677(null);
                                            int i21111111111111111111111111111112 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i21111111111111111111111111111112) + i21111111111111111111111111111112 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 10:
                                            size4 = ((AbstractC0318) ((AbstractC0066) value)).mo677(null);
                                            iM40425 = C2100.m4049(size4);
                                            iM40424 = size4 + iM40425;
                                            int i21111111111111111111111111111113 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i21111111111111111111111111111113) + i21111111111111111111111111111113 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 11:
                                            if (value instanceof C0533) {
                                                size4 = ((C0533) value).size();
                                                iM40425 = C2100.m4049(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                iM40425 = C2100.m4049(size4);
                                            }
                                            iM40424 = size4 + iM40425;
                                            int i21111111111111111111111111111114 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i21111111111111111111111111111114) + i21111111111111111111111111111114 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 12:
                                            iM40424 = C2100.m4049(((Integer) value).intValue());
                                            int i21111111111111111111111111111115 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i21111111111111111111111111111115) + i21111111111111111111111111111115 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 13:
                                            iM40424 = C2100.m4048(((Integer) value).intValue());
                                            int i21111111111111111111111111111116 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i21111111111111111111111111111116) + i21111111111111111111111111111116 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iM40424 = 4;
                                            int i21111111111111111111111111111117 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i21111111111111111111111111111117) + i21111111111111111111111111111117 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iM40424 = 8;
                                            int i21111111111111111111111111111118 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i21111111111111111111111111111118) + i21111111111111111111111111111118 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 16:
                                            int iIntValue18 = ((Integer) value).intValue();
                                            iM40424 = C2100.m4049((iIntValue18 >> 31) ^ (iIntValue18 << 1));
                                            int i21111111111111111111111111111119 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i21111111111111111111111111111119) + i21111111111111111111111111111119 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 17:
                                            long jLongValue17 = ((Long) value).longValue();
                                            iM40424 = C2100.m4048((jLongValue17 << i23) ^ (jLongValue17 >> c2));
                                            int i211111111111111111111111111111110 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i211111111111111111111111111111110) + i211111111111111111111111111111110 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 17:
                                    long jLongValue18 = ((Long) key).longValue();
                                    iM40421 = C2100.m4048((jLongValue18 << i23) ^ (jLongValue18 >> c2));
                                    i8 = i8;
                                    i4 = iM40421 + iM40435;
                                    enumC1497 = (EnumC1497) c2808.f9376;
                                    iM40423 = C2100.m4047(2);
                                    if (enumC1497 == c5329) {
                                        iM40423 *= 2;
                                    }
                                    switch (enumC1497.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iM40424 = 8;
                                            int i211111111111111111111111111111111 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i211111111111111111111111111111111) + i211111111111111111111111111111111 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iM40424 = 4;
                                            int i211111111111111111111111111111112 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i211111111111111111111111111111112) + i211111111111111111111111111111112 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                                            iM40424 = C2100.m4048(((Long) value).longValue());
                                            int i211111111111111111111111111111113 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i211111111111111111111111111111113) + i211111111111111111111111111111113 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                                            iM40424 = C2100.m4048(((Long) value).longValue());
                                            int i211111111111111111111111111111114 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i211111111111111111111111111111114) + i211111111111111111111111111111114 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case C4261.LONG_FIELD_NUMBER /* 4 */:
                                            iM40424 = C2100.m4048(((Integer) value).intValue());
                                            int i211111111111111111111111111111115 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i211111111111111111111111111111115) + i211111111111111111111111111111115 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case C4261.STRING_FIELD_NUMBER /* 5 */:
                                            ((Long) value).getClass();
                                            iM40424 = 8;
                                            int i211111111111111111111111111111116 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i211111111111111111111111111111116) + i211111111111111111111111111111116 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                                            ((Integer) value).getClass();
                                            iM40424 = 4;
                                            int i211111111111111111111111111111117 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i211111111111111111111111111111117) + i211111111111111111111111111111117 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                                            ((Boolean) value).getClass();
                                            iM40424 = i23;
                                            int i211111111111111111111111111111118 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i211111111111111111111111111111118) + i211111111111111111111111111111118 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 8:
                                            if (value instanceof C0533) {
                                                size4 = ((C0533) value).size();
                                                iM40425 = C2100.m4049(size4);
                                                iM40424 = size4 + iM40425;
                                            } else {
                                                iM40424 = C2100.m4050((String) value);
                                            }
                                            int i211111111111111111111111111111119 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i211111111111111111111111111111119) + i211111111111111111111111111111119 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 9:
                                            iM40424 = ((AbstractC0318) ((AbstractC0066) value)).mo677(null);
                                            int i2111111111111111111111111111111110 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i2111111111111111111111111111111110) + i2111111111111111111111111111111110 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 10:
                                            size4 = ((AbstractC0318) ((AbstractC0066) value)).mo677(null);
                                            iM40425 = C2100.m4049(size4);
                                            iM40424 = size4 + iM40425;
                                            int i2111111111111111111111111111111111 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i2111111111111111111111111111111111) + i2111111111111111111111111111111111 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 11:
                                            if (value instanceof C0533) {
                                                size4 = ((C0533) value).size();
                                                iM40425 = C2100.m4049(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                iM40425 = C2100.m4049(size4);
                                            }
                                            iM40424 = size4 + iM40425;
                                            int i2111111111111111111111111111111112 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i2111111111111111111111111111111112) + i2111111111111111111111111111111112 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 12:
                                            iM40424 = C2100.m4049(((Integer) value).intValue());
                                            int i2111111111111111111111111111111113 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i2111111111111111111111111111111113) + i2111111111111111111111111111111113 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 13:
                                            iM40424 = C2100.m4048(((Integer) value).intValue());
                                            int i2111111111111111111111111111111114 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i2111111111111111111111111111111114) + i2111111111111111111111111111111114 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iM40424 = 4;
                                            int i2111111111111111111111111111111115 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i2111111111111111111111111111111115) + i2111111111111111111111111111111115 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iM40424 = 8;
                                            int i2111111111111111111111111111111116 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i2111111111111111111111111111111116) + i2111111111111111111111111111111116 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 16:
                                            int iIntValue19 = ((Integer) value).intValue();
                                            iM40424 = C2100.m4049((iIntValue19 >> 31) ^ (iIntValue19 << 1));
                                            int i2111111111111111111111111111111117 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i2111111111111111111111111111111117) + i2111111111111111111111111111111117 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        case 17:
                                            long jLongValue19 = ((Long) value).longValue();
                                            iM40424 = C2100.m4048((jLongValue19 << i23) ^ (jLongValue19 >> c2));
                                            int i2111111111111111111111111111111118 = iM40424 + iM40423 + i4;
                                            iM40420 += C2100.m4049(i2111111111111111111111111111111118) + i2111111111111111111111111111111118 + iM40434;
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            i8 = i8;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                default:
                                    throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                            }
                        }
                    }
                    i2 = i6;
                    i3 = i8;
                    iM40432 += iM40420;
                    i6 = i2;
                    i8 = i3;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 51:
                    if (c2687.m5005(i9, i7, abstractC0319)) {
                        iM4047 = C2100.m4047(i9);
                        iMo677 = iM4047 + 8;
                        iM40432 += iMo677;
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 52:
                    if (c2687.m5005(i9, i7, abstractC0319)) {
                        iM40426 = C2100.m4047(i9);
                        iMo677 = iM40426 + 4;
                        iM40432 += iMo677;
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 53:
                    if (c2687.m5005(i9, i7, abstractC0319)) {
                        long jM4995 = m4995(j, abstractC0319);
                        iM40427 = C2100.m4047(i9);
                        iM40428 = C2100.m4048(jM4995);
                        iM40431 = iM40428 + iM40427;
                        iM40432 += iM40431;
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 54:
                    if (c2687.m5005(i9, i7, abstractC0319)) {
                        long jM4996 = m4995(j, abstractC0319);
                        iM40427 = C2100.m4047(i9);
                        iM40428 = C2100.m4048(jM4996);
                        iM40431 = iM40428 + iM40427;
                        iM40432 += iM40431;
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 55:
                    if (c2687.m5005(i9, i7, abstractC0319)) {
                        int iM4996 = m4996(j, abstractC0319);
                        iM40429 = C2100.m4047(i9);
                        iM40430 = C2100.m4048(iM4996);
                        iMo677 = iM40430 + iM40429;
                        iM40432 += iMo677;
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 56:
                    if (c2687.m5005(i9, i7, abstractC0319)) {
                        iM4047 = C2100.m4047(i9);
                        iMo677 = iM4047 + 8;
                        iM40432 += iMo677;
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 57:
                    if (c2687.m5005(i9, i7, abstractC0319)) {
                        iM40426 = C2100.m4047(i9);
                        iMo677 = iM40426 + 4;
                        iM40432 += iMo677;
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 58:
                    if (c2687.m5005(i9, i7, abstractC0319)) {
                        iMo677 = C2100.m4047(i9) + 1;
                        iM40432 += iMo677;
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 59:
                    if (c2687.m5005(i9, i7, abstractC0319)) {
                        Object object4 = unsafe.getObject(abstractC0319, j);
                        iM40432 = (object4 instanceof C0533 ? C2100.m4046(i9, (C0533) object4) : C2100.m4050((String) object4) + C2100.m4047(i9)) + iM40432;
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 60:
                    if (c2687.m5005(i9, i7, abstractC0319)) {
                        Object object5 = unsafe.getObject(abstractC0319, j);
                        InterfaceC1622 interfaceC1622M5017 = c2687.m5014(i7);
                        Class cls21 = AbstractC0499.f1810;
                        int iM40436 = C2100.m4047(i9);
                        int iMo6712 = ((AbstractC0066) object5).mo677(interfaceC1622M5017);
                        iM40431 = C2100.m4049(iMo6712) + iMo6712 + iM40436;
                        iM40432 += iM40431;
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 61:
                    if (c2687.m5005(i9, i7, abstractC0319)) {
                        iMo677 = C2100.m4046(i9, (C0533) unsafe.getObject(abstractC0319, j));
                        iM40432 += iMo677;
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 62:
                    if (c2687.m5005(i9, i7, abstractC0319)) {
                        int iM4997 = m4996(j, abstractC0319);
                        iM40429 = C2100.m4047(i9);
                        iM40430 = C2100.m4049(iM4997);
                        iMo677 = iM40430 + iM40429;
                        iM40432 += iMo677;
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 63:
                    if (c2687.m5005(i9, i7, abstractC0319)) {
                        int iM4998 = m4996(j, abstractC0319);
                        iM40429 = C2100.m4047(i9);
                        iM40430 = C2100.m4048(iM4998);
                        iMo677 = iM40430 + iM40429;
                        iM40432 += iMo677;
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 64:
                    if (c2687.m5005(i9, i7, abstractC0319)) {
                        iM40426 = C2100.m4047(i9);
                        iMo677 = iM40426 + 4;
                        iM40432 += iMo677;
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 65:
                    if (c2687.m5005(i9, i7, abstractC0319)) {
                        iM4047 = C2100.m4047(i9);
                        iMo677 = iM4047 + 8;
                        iM40432 += iMo677;
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 66:
                    if (c2687.m5005(i9, i7, abstractC0319)) {
                        int iM49910 = m4996(j, abstractC0319);
                        iM40429 = C2100.m4047(i9);
                        iM40430 = C2100.m4049((iM49910 >> 31) ^ (iM49910 << 1));
                        iMo677 = iM40430 + iM40429;
                        iM40432 += iMo677;
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 67:
                    if (c2687.m5005(i9, i7, abstractC0319)) {
                        long jM4997 = m4995(j, abstractC0319);
                        iM40427 = C2100.m4047(i9);
                        iM40428 = C2100.m4048((jM4997 << 1) ^ (jM4997 >> 63));
                        iM40431 = iM40428 + iM40427;
                        iM40432 += iM40431;
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 68:
                    if (c2687.m5005(i9, i7, abstractC0319)) {
                        iMo677 = ((AbstractC0066) unsafe.getObject(abstractC0319, j)).mo677(c2687.m5014(i7)) + (C2100.m4047(i9) * 2);
                        iM40432 += iMo677;
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                default:
                    i7 += 3;
                    i5 = 1048575;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۥْ */
    public final boolean m5005(int i, int i2, Object obj) {
        return AbstractC1194.m2513((long) (this.f8920[i2 + 2] & 1048575), obj) == i;
    }

    /* JADX INFO: renamed from: ۥٓ */
    public final void m5006(Object obj, int i, Object obj2, C2336 c2336, C4902 c4902) throws C1423 {
        long jM5011 = m5011(i) & 1048575;
        Object objM2515 = AbstractC1194.m2515(jM5011, obj);
        C0847 c0847 = this.f8923;
        if (objM2515 == null) {
            c0847.getClass();
            objM2515 = C0303.f1094.m633();
            AbstractC1194.m2525(jM5011, obj, objM2515);
        } else {
            c0847.getClass();
            if (!((C0303) objM2515).f1095) {
                Object objM633 = C0303.f1094.m633();
                C0847.m1762(objM633, objM2515);
                AbstractC1194.m2525(jM5011, obj, objM633);
                objM2515 = objM633;
            }
        }
        c0847.getClass();
        C0303 c0303 = (C0303) objM2515;
        C2808 c2808 = ((C5405) obj2).f17850;
        c4902.m8271(2);
        AbstractC2758 abstractC2758 = (AbstractC2758) c4902.f16167;
        int iMo5059 = abstractC2758.mo5059(abstractC2758.mo5038());
        Object obj3 = c2808.f9377;
        Object objM8290 = "";
        Object objM8291 = obj3;
        while (true) {
            try {
                int iM8273 = c4902.m8273();
                if (iM8273 == Integer.MAX_VALUE || abstractC2758.mo5040()) {
                    break;
                }
                if (iM8273 == 1) {
                    objM8290 = c4902.m8290((EnumC1497) c2808.f9378, null, null);
                } else if (iM8273 != 2) {
                    try {
                        if (!c4902.m8248()) {
                            throw new C3406("Unable to parse map entry.");
                        }
                    } catch (C1423 unused) {
                        if (!c4902.m8248()) {
                            throw new C3406("Unable to parse map entry.");
                        }
                    }
                } else {
                    objM8291 = c4902.m8290((EnumC1497) c2808.f9376, obj3.getClass(), c2336);
                }
            } catch (Throwable th) {
                abstractC2758.mo5063(iMo5059);
                throw th;
            }
        }
        c0303.put(objM8290, objM8291);
        abstractC2758.mo5063(iMo5059);
    }

    /* JADX INFO: renamed from: ۥٕ */
    public final void m5007(int i, C4902 c4902, Object obj) throws C1423 {
        boolean z = (536870912 & i) != 0;
        C0750 c0750 = this.f8926;
        if (z) {
            c0750.getClass();
            c4902.m8283(C0750.m1640(i & 1048575, obj), true);
        } else {
            c0750.getClass();
            c4902.m8283(C0750.m1640(i & 1048575, obj), false);
        }
    }

    /* JADX INFO: renamed from: ۥٖ */
    public final void m5008(int i, Object obj, Object obj2) {
        int[] iArr = this.f8920;
        int i2 = iArr[i];
        if (m5005(i2, i, obj2)) {
            long jM5011 = m5011(i) & 1048575;
            Unsafe unsafe = f8914;
            Object object = unsafe.getObject(obj2, jM5011);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i] + " is present but null: " + obj2);
            }
            InterfaceC1622 interfaceC1622M5014 = m5014(i);
            if (!m5005(i2, i, obj)) {
                if (m5001(object)) {
                    AbstractC0318 abstractC0318Mo3393 = interfaceC1622M5014.mo3393();
                    interfaceC1622M5014.mo3386(abstractC0318Mo3393, object);
                    unsafe.putObject(obj, jM5011, abstractC0318Mo3393);
                } else {
                    unsafe.putObject(obj, jM5011, object);
                }
                m5010(i2, i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jM5011);
            if (!m5001(object2)) {
                AbstractC0318 abstractC0318Mo3394 = interfaceC1622M5014.mo3393();
                interfaceC1622M5014.mo3386(abstractC0318Mo3394, object2);
                unsafe.putObject(obj, jM5011, abstractC0318Mo3394);
                object2 = abstractC0318Mo3394;
            }
            interfaceC1622M5014.mo3386(object2, object);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:118:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:123:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:124:0x0309  */
    /* JADX WARN: Code duplicated, block: B:125:0x031a  */
    /* JADX WARN: Code duplicated, block: B:127:0x0323  */
    /* JADX WARN: Code duplicated, block: B:129:0x032c  */
    /* JADX WARN: Code duplicated, block: B:130:0x0339  */
    /* JADX WARN: Code duplicated, block: B:131:0x0345  */
    /* JADX WARN: Code duplicated, block: B:133:0x0349  */
    /* JADX WARN: Code duplicated, block: B:135:0x0356  */
    /* JADX WARN: Code duplicated, block: B:136:0x035e  */
    /* JADX WARN: Code duplicated, block: B:137:0x036c  */
    /* JADX WARN: Code duplicated, block: B:138:0x0376  */
    /* JADX WARN: Code duplicated, block: B:140:0x037a  */
    /* JADX WARN: Code duplicated, block: B:141:0x0385  */
    /* JADX WARN: Code duplicated, block: B:142:0x038c  */
    /* JADX WARN: Code duplicated, block: B:143:0x0394  */
    /* JADX WARN: Code duplicated, block: B:144:0x039a  */
    /* JADX WARN: Code duplicated, block: B:145:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:146:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:147:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:148:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:149:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:279:0x02f1 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.InterfaceC1622
    /* JADX INFO: renamed from: ۥۗ */
    public final void mo3389(Object obj, C5086 c5086) throws IOException {
        int i;
        int i2;
        C5086 c5087;
        int i3;
        int i4;
        boolean z;
        int iM4048;
        int size;
        int iM4049;
        int iMo677;
        int iM40410;
        int i5;
        int iM4047;
        int iM40411;
        int size2;
        int iM40412;
        C2687 c2687 = this;
        C5086 c5088 = c5086;
        c5088.getClass();
        C2100 c2100 = (C2100) c5088.f16877;
        int[] iArr = c2687.f8920;
        int length = iArr.length;
        int i6 = 1048575;
        int i7 = 1048575;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            int iM5011 = c2687.m5011(i8);
            int i10 = iArr[i8];
            int iM4999 = m4999(iM5011);
            Unsafe unsafe = f8914;
            if (iM4999 <= 17) {
                int i11 = iArr[i8 + 2];
                i = 1;
                int i12 = i11 & i6;
                if (i12 != i7) {
                    i9 = i12 == i6 ? 0 : unsafe.getInt(obj, i12);
                    i7 = i12;
                }
                i2 = 1 << (i11 >>> 20);
            } else {
                i = 1;
                i2 = 0;
            }
            long j = iM5011 & i6;
            switch (iM4999) {
                case 0:
                    c5087 = c5088;
                    if (c2687.m5021(obj, i8, i7, i9, i2)) {
                        c2100.m4060(Double.doubleToRawLongBits(AbstractC1194.f4116.mo2642(j, obj)), i10);
                    }
                    i8 += 3;
                    c5088 = c5087;
                    i6 = 1048575;
                    break;
                case 1:
                    c5087 = c5088;
                    if (c2687.m5021(obj, i8, i7, i9, i2)) {
                        c2100.m4058(i10, Float.floatToRawIntBits(AbstractC1194.f4116.mo2639(j, obj)));
                    }
                    c2687 = this;
                    i8 += 3;
                    c5088 = c5087;
                    i6 = 1048575;
                    break;
                case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                    c5087 = c5088;
                    if (c2687.m5021(obj, i8, i7, i9, i2)) {
                        c2100.m4059(unsafe.getLong(obj, j), i10);
                    }
                    c2687 = this;
                    i8 += 3;
                    c5088 = c5087;
                    i6 = 1048575;
                    break;
                case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                    c5087 = c5088;
                    if (c2687.m5021(obj, i8, i7, i9, i2)) {
                        c2100.m4059(unsafe.getLong(obj, j), i10);
                    }
                    c2687 = this;
                    i8 += 3;
                    c5088 = c5087;
                    i6 = 1048575;
                    break;
                case C4261.LONG_FIELD_NUMBER /* 4 */:
                    c5087 = c5088;
                    if (c2687.m5021(obj, i8, i7, i9, i2)) {
                        c2100.m4075(i10, unsafe.getInt(obj, j));
                    }
                    c2687 = this;
                    i8 += 3;
                    c5088 = c5087;
                    i6 = 1048575;
                    break;
                case C4261.STRING_FIELD_NUMBER /* 5 */:
                    c5087 = c5088;
                    if (c2687.m5021(obj, i8, i7, i9, i2)) {
                        c2100.m4060(unsafe.getLong(obj, j), i10);
                    }
                    c2687 = this;
                    i8 += 3;
                    c5088 = c5087;
                    i6 = 1048575;
                    break;
                case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                    c5087 = c5088;
                    if (c2687.m5021(obj, i8, i7, i9, i2)) {
                        c2100.m4058(i10, unsafe.getInt(obj, j));
                    }
                    c2687 = this;
                    i8 += 3;
                    c5088 = c5087;
                    i6 = 1048575;
                    break;
                case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                    c5087 = c5088;
                    if (c2687.m5021(obj, i8, i7, i9, i2)) {
                        c2100.m4077(i10, AbstractC1194.f4116.mo2644(j, obj));
                    }
                    c2687 = this;
                    i8 += 3;
                    c5088 = c5087;
                    i6 = 1048575;
                    break;
                case 8:
                    c5087 = c5088;
                    if (c2687.m5021(obj, i8, i7, i9, i2)) {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof String) {
                            c2100.m4052(i10, (String) object);
                        } else {
                            c2100.m4076(i10, (C0533) object);
                        }
                    }
                    c2687 = this;
                    i8 += 3;
                    c5088 = c5087;
                    i6 = 1048575;
                    break;
                case 9:
                    c5087 = c5088;
                    if (c2687.m5021(obj, i8, i7, i9, i2)) {
                        c2100.m4061(i10, (AbstractC0066) unsafe.getObject(obj, j), c2687.m5014(i8));
                    }
                    i8 += 3;
                    c5088 = c5087;
                    i6 = 1048575;
                    break;
                case 10:
                    c5087 = c5088;
                    if (c2687.m5021(obj, i8, i7, i9, i2)) {
                        c2100.m4076(i10, (C0533) unsafe.getObject(obj, j));
                    }
                    c2687 = this;
                    i8 += 3;
                    c5088 = c5087;
                    i6 = 1048575;
                    break;
                case 11:
                    c5087 = c5088;
                    if (c2687.m5021(obj, i8, i7, i9, i2)) {
                        c2100.m4054(i10, unsafe.getInt(obj, j));
                    }
                    c2687 = this;
                    i8 += 3;
                    c5088 = c5087;
                    i6 = 1048575;
                    break;
                case 12:
                    c5087 = c5088;
                    if (c2687.m5021(obj, i8, i7, i9, i2)) {
                        c2100.m4075(i10, unsafe.getInt(obj, j));
                    }
                    c2687 = this;
                    i8 += 3;
                    c5088 = c5087;
                    i6 = 1048575;
                    break;
                case 13:
                    c5087 = c5088;
                    if (c2687.m5021(obj, i8, i7, i9, i2)) {
                        c2100.m4058(i10, unsafe.getInt(obj, j));
                    }
                    c2687 = this;
                    i8 += 3;
                    c5088 = c5087;
                    i6 = 1048575;
                    break;
                case 14:
                    c5087 = c5088;
                    if (c2687.m5021(obj, i8, i7, i9, i2)) {
                        c2100.m4060(unsafe.getLong(obj, j), i10);
                    }
                    c2687 = this;
                    i8 += 3;
                    c5088 = c5087;
                    i6 = 1048575;
                    break;
                case 15:
                    c5087 = c5088;
                    if (c2687.m5021(obj, i8, i7, i9, i2)) {
                        int i13 = unsafe.getInt(obj, j);
                        c2100.m4054(i10, (i13 >> 31) ^ (i13 << 1));
                    }
                    c2687 = this;
                    i8 += 3;
                    c5088 = c5087;
                    i6 = 1048575;
                    break;
                case 16:
                    c5087 = c5088;
                    if (c2687.m5021(obj, i8, i7, i9, i2)) {
                        long j2 = unsafe.getLong(obj, j);
                        c2100.m4059((j2 >> 63) ^ (j2 << 1), i10);
                    }
                    c2687 = this;
                    i8 += 3;
                    c5088 = c5087;
                    i6 = 1048575;
                    break;
                case 17:
                    c5087 = c5088;
                    if (c2687.m5021(obj, i8, i7, i9, i2)) {
                        c5087.m8696(i10, unsafe.getObject(obj, j), c2687.m5014(i8));
                    }
                    i8 += 3;
                    c5088 = c5087;
                    i6 = 1048575;
                    break;
                case 18:
                    i7 = i7;
                    i9 = i9;
                    c5087 = c5088;
                    AbstractC0499.m1139(iArr[i8], (List) unsafe.getObject(obj, j), c5087, false);
                    i7 = i7;
                    i9 = i9;
                    i8 += 3;
                    c5088 = c5087;
                    i6 = 1048575;
                    break;
                case 19:
                    i7 = i7;
                    i9 = i9;
                    c5087 = c5088;
                    AbstractC0499.m1123(iArr[i8], (List) unsafe.getObject(obj, j), c5087, false);
                    i7 = i7;
                    i9 = i9;
                    i8 += 3;
                    c5088 = c5087;
                    i6 = 1048575;
                    break;
                case 20:
                    i7 = i7;
                    i9 = i9;
                    c5087 = c5088;
                    AbstractC0499.m1124(iArr[i8], (List) unsafe.getObject(obj, j), c5087, false);
                    i7 = i7;
                    i9 = i9;
                    i8 += 3;
                    c5088 = c5087;
                    i6 = 1048575;
                    break;
                case 21:
                    i7 = i7;
                    i9 = i9;
                    c5087 = c5088;
                    AbstractC0499.m1117(iArr[i8], (List) unsafe.getObject(obj, j), c5087, false);
                    i7 = i7;
                    i9 = i9;
                    i8 += 3;
                    c5088 = c5087;
                    i6 = 1048575;
                    break;
                case 22:
                    i7 = i7;
                    i9 = i9;
                    c5087 = c5088;
                    AbstractC0499.m1119(iArr[i8], (List) unsafe.getObject(obj, j), c5087, false);
                    i7 = i7;
                    i9 = i9;
                    i8 += 3;
                    c5088 = c5087;
                    i6 = 1048575;
                    break;
                case 23:
                    i7 = i7;
                    i9 = i9;
                    c5087 = c5088;
                    AbstractC0499.m1122(iArr[i8], (List) unsafe.getObject(obj, j), c5087, false);
                    i7 = i7;
                    i9 = i9;
                    i8 += 3;
                    c5088 = c5087;
                    i6 = 1048575;
                    break;
                case 24:
                    i7 = i7;
                    i9 = i9;
                    c5087 = c5088;
                    AbstractC0499.m1141(iArr[i8], (List) unsafe.getObject(obj, j), c5087, false);
                    i7 = i7;
                    i9 = i9;
                    i8 += 3;
                    c5088 = c5087;
                    i6 = 1048575;
                    break;
                case 25:
                    i7 = i7;
                    i9 = i9;
                    c5087 = c5088;
                    AbstractC0499.m1132(iArr[i8], (List) unsafe.getObject(obj, j), c5087, false);
                    i7 = i7;
                    i9 = i9;
                    i8 += 3;
                    c5088 = c5087;
                    i6 = 1048575;
                    break;
                case 26:
                    i3 = i7;
                    i4 = i9;
                    c5087 = c5088;
                    int i14 = iArr[i8];
                    List list = (List) unsafe.getObject(obj, j);
                    Class cls = AbstractC0499.f1810;
                    if (list != null && !list.isEmpty()) {
                        for (int i15 = 0; i15 < list.size(); i15++) {
                            c2100.m4052(i14, (String) list.get(i15));
                        }
                    }
                    i7 = i3;
                    i9 = i4;
                    i8 += 3;
                    c5088 = c5087;
                    i6 = 1048575;
                    break;
                case 27:
                    i3 = i7;
                    i4 = i9;
                    c5087 = c5088;
                    int i16 = iArr[i8];
                    List list2 = (List) unsafe.getObject(obj, j);
                    InterfaceC1622 interfaceC1622M5014 = c2687.m5014(i8);
                    Class cls2 = AbstractC0499.f1810;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i17 = 0; i17 < list2.size(); i17++) {
                            c2100.m4061(i16, (AbstractC0066) list2.get(i17), interfaceC1622M5014);
                        }
                    }
                    i7 = i3;
                    i9 = i4;
                    i8 += 3;
                    c5088 = c5087;
                    i6 = 1048575;
                    break;
                case 28:
                    i3 = i7;
                    i4 = i9;
                    c5087 = c5088;
                    int i18 = iArr[i8];
                    List list3 = (List) unsafe.getObject(obj, j);
                    Class cls3 = AbstractC0499.f1810;
                    if (list3 != null && !list3.isEmpty()) {
                        for (int i19 = 0; i19 < list3.size(); i19++) {
                            c2100.m4076(i18, (C0533) list3.get(i19));
                        }
                    }
                    i7 = i3;
                    i9 = i4;
                    i8 += 3;
                    c5088 = c5087;
                    i6 = 1048575;
                    break;
                case 29:
                    c5087 = c5088;
                    z = false;
                    AbstractC0499.m1125(iArr[i8], (List) unsafe.getObject(obj, j), c5087, false);
                    i7 = i7;
                    i9 = i9;
                    i8 += 3;
                    c5088 = c5087;
                    i6 = 1048575;
                    break;
                case 30:
                    c5087 = c5088;
                    z = false;
                    AbstractC0499.m1142(iArr[i8], (List) unsafe.getObject(obj, j), c5087, false);
                    i7 = i7;
                    i9 = i9;
                    i8 += 3;
                    c5088 = c5087;
                    i6 = 1048575;
                    break;
                case 31:
                    c5087 = c5088;
                    z = false;
                    AbstractC0499.m1135(iArr[i8], (List) unsafe.getObject(obj, j), c5087, false);
                    i7 = i7;
                    i9 = i9;
                    i8 += 3;
                    c5088 = c5087;
                    i6 = 1048575;
                    break;
                case 32:
                    c5087 = c5088;
                    z = false;
                    AbstractC0499.m1140(iArr[i8], (List) unsafe.getObject(obj, j), c5087, false);
                    i7 = i7;
                    i9 = i9;
                    i8 += 3;
                    c5088 = c5087;
                    i6 = 1048575;
                    break;
                case 33:
                    c5087 = c5088;
                    z = false;
                    AbstractC0499.m1126(iArr[i8], (List) unsafe.getObject(obj, j), c5087, false);
                    i7 = i7;
                    i9 = i9;
                    i8 += 3;
                    c5088 = c5087;
                    i6 = 1048575;
                    break;
                case 34:
                    c5087 = c5088;
                    z = false;
                    AbstractC0499.m1134(iArr[i8], (List) unsafe.getObject(obj, j), c5087, false);
                    i7 = i7;
                    i9 = i9;
                    i8 += 3;
                    c5088 = c5087;
                    i6 = 1048575;
                    break;
                case 35:
                    i3 = i7;
                    i4 = i9;
                    c5087 = c5088;
                    AbstractC0499.m1139(iArr[i8], (List) unsafe.getObject(obj, j), c5087, i);
                    i7 = i3;
                    i9 = i4;
                    i8 += 3;
                    c5088 = c5087;
                    i6 = 1048575;
                    break;
                case 36:
                    i3 = i7;
                    i4 = i9;
                    c5087 = c5088;
                    AbstractC0499.m1123(iArr[i8], (List) unsafe.getObject(obj, j), c5087, i);
                    i7 = i3;
                    i9 = i4;
                    i8 += 3;
                    c5088 = c5087;
                    i6 = 1048575;
                    break;
                case 37:
                    i3 = i7;
                    i4 = i9;
                    c5087 = c5088;
                    AbstractC0499.m1124(iArr[i8], (List) unsafe.getObject(obj, j), c5087, i);
                    i7 = i3;
                    i9 = i4;
                    i8 += 3;
                    c5088 = c5087;
                    i6 = 1048575;
                    break;
                case 38:
                    i3 = i7;
                    i4 = i9;
                    c5087 = c5088;
                    AbstractC0499.m1117(iArr[i8], (List) unsafe.getObject(obj, j), c5087, i);
                    i7 = i3;
                    i9 = i4;
                    i8 += 3;
                    c5088 = c5087;
                    i6 = 1048575;
                    break;
                case 39:
                    i3 = i7;
                    i4 = i9;
                    c5087 = c5088;
                    AbstractC0499.m1119(iArr[i8], (List) unsafe.getObject(obj, j), c5087, i);
                    i7 = i3;
                    i9 = i4;
                    i8 += 3;
                    c5088 = c5087;
                    i6 = 1048575;
                    break;
                case 40:
                    i3 = i7;
                    i4 = i9;
                    c5087 = c5088;
                    AbstractC0499.m1122(iArr[i8], (List) unsafe.getObject(obj, j), c5087, i);
                    i7 = i3;
                    i9 = i4;
                    i8 += 3;
                    c5088 = c5087;
                    i6 = 1048575;
                    break;
                case 41:
                    i3 = i7;
                    i4 = i9;
                    c5087 = c5088;
                    AbstractC0499.m1141(iArr[i8], (List) unsafe.getObject(obj, j), c5087, i);
                    i7 = i3;
                    i9 = i4;
                    i8 += 3;
                    c5088 = c5087;
                    i6 = 1048575;
                    break;
                case 42:
                    i3 = i7;
                    i4 = i9;
                    c5087 = c5088;
                    AbstractC0499.m1132(iArr[i8], (List) unsafe.getObject(obj, j), c5087, i);
                    i7 = i3;
                    i9 = i4;
                    i8 += 3;
                    c5088 = c5087;
                    i6 = 1048575;
                    break;
                case 43:
                    i3 = i7;
                    i4 = i9;
                    c5087 = c5088;
                    AbstractC0499.m1125(iArr[i8], (List) unsafe.getObject(obj, j), c5087, i);
                    i7 = i3;
                    i9 = i4;
                    i8 += 3;
                    c5088 = c5087;
                    i6 = 1048575;
                    break;
                case 44:
                    i3 = i7;
                    i4 = i9;
                    c5087 = c5088;
                    AbstractC0499.m1142(iArr[i8], (List) unsafe.getObject(obj, j), c5087, i);
                    i7 = i3;
                    i9 = i4;
                    i8 += 3;
                    c5088 = c5087;
                    i6 = 1048575;
                    break;
                case 45:
                    i3 = i7;
                    i4 = i9;
                    c5087 = c5088;
                    AbstractC0499.m1135(iArr[i8], (List) unsafe.getObject(obj, j), c5087, i);
                    i7 = i3;
                    i9 = i4;
                    i8 += 3;
                    c5088 = c5087;
                    i6 = 1048575;
                    break;
                case 46:
                    i3 = i7;
                    i4 = i9;
                    c5087 = c5088;
                    AbstractC0499.m1140(iArr[i8], (List) unsafe.getObject(obj, j), c5087, i);
                    i7 = i3;
                    i9 = i4;
                    i8 += 3;
                    c5088 = c5087;
                    i6 = 1048575;
                    break;
                case 47:
                    i3 = i7;
                    i4 = i9;
                    c5087 = c5088;
                    AbstractC0499.m1126(iArr[i8], (List) unsafe.getObject(obj, j), c5087, i);
                    i7 = i3;
                    i9 = i4;
                    i8 += 3;
                    c5088 = c5087;
                    i6 = 1048575;
                    break;
                case 48:
                    i3 = i7;
                    i4 = i9;
                    c5087 = c5088;
                    AbstractC0499.m1134(iArr[i8], (List) unsafe.getObject(obj, j), c5087, true);
                    i7 = i3;
                    i9 = i4;
                    i8 += 3;
                    c5088 = c5087;
                    i6 = 1048575;
                    break;
                case 49:
                    i3 = i7;
                    i4 = i9;
                    int i20 = iArr[i8];
                    List list4 = (List) unsafe.getObject(obj, j);
                    InterfaceC1622 interfaceC1622M5015 = c2687.m5014(i8);
                    Class cls4 = AbstractC0499.f1810;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i21 = 0; i21 < list4.size(); i21++) {
                            c5086.m8696(i20, list4.get(i21), interfaceC1622M5015);
                        }
                    }
                    c5087 = c5086;
                    i7 = i3;
                    i9 = i4;
                    i8 += 3;
                    c5088 = c5087;
                    i6 = 1048575;
                    break;
                case 50:
                    Object object2 = unsafe.getObject(obj, j);
                    if (object2 != null) {
                        int i22 = 2;
                        Object obj2 = c2687.f8918[(i8 / 3) * 2];
                        c2687.f8923.getClass();
                        C2808 c2808 = ((C5405) obj2).f17850;
                        EnumC1497 enumC1497 = (EnumC1497) c2808.f9376;
                        EnumC1497 enumC1498 = (EnumC1497) c2808.f9378;
                        Iterator it = ((C0303) object2).entrySet().iterator();
                        while (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            c2100.m4066(i10, i22);
                            Object key = entry.getKey();
                            int i23 = i22;
                            Object value = entry.getValue();
                            int i24 = C5052.f16768;
                            int iM40413 = C2100.m4047(i);
                            int i25 = i7;
                            C5329 c5329 = EnumC1497.f5074;
                            if (enumC1498 == c5329) {
                                iM40413 *= 2;
                            }
                            int i26 = i9;
                            Iterator it2 = it;
                            switch (enumC1498.ordinal()) {
                                case 0:
                                    ((Double) key).getClass();
                                    iM4048 = 8;
                                    i5 = iM4048 + iM40413;
                                    iM4047 = C2100.m4047(i23);
                                    if (enumC1497 == c5329) {
                                        iM4047 *= 2;
                                    }
                                    switch (enumC1497.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iM40411 = 8;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key2 = entry.getKey();
                                            Object value2 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key2);
                                            C5052.m8574(c2100, enumC1497, i23, value2);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iM40411 = 4;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key3 = entry.getKey();
                                            Object value3 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key3);
                                            C5052.m8574(c2100, enumC1497, i23, value3);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                                            iM40411 = C2100.m4048(((Long) value).longValue());
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key4 = entry.getKey();
                                            Object value4 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key4);
                                            C5052.m8574(c2100, enumC1497, i23, value4);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                                            iM40411 = C2100.m4048(((Long) value).longValue());
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key5 = entry.getKey();
                                            Object value5 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key5);
                                            C5052.m8574(c2100, enumC1497, i23, value5);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case C4261.LONG_FIELD_NUMBER /* 4 */:
                                            iM40411 = C2100.m4048(((Integer) value).intValue());
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key6 = entry.getKey();
                                            Object value6 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key6);
                                            C5052.m8574(c2100, enumC1497, i23, value6);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case C4261.STRING_FIELD_NUMBER /* 5 */:
                                            ((Long) value).getClass();
                                            iM40411 = 8;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key7 = entry.getKey();
                                            Object value7 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key7);
                                            C5052.m8574(c2100, enumC1497, i23, value7);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                                            ((Integer) value).getClass();
                                            iM40411 = 4;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key8 = entry.getKey();
                                            Object value8 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key8);
                                            C5052.m8574(c2100, enumC1497, i23, value8);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                                            ((Boolean) value).getClass();
                                            iM40411 = i;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key9 = entry.getKey();
                                            Object value9 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key9);
                                            C5052.m8574(c2100, enumC1497, i23, value9);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 8:
                                            if (value instanceof C0533) {
                                                size2 = ((C0533) value).size();
                                                iM40412 = C2100.m4049(size2);
                                                iM40411 = size2 + iM40412;
                                            } else {
                                                iM40411 = C2100.m4050((String) value);
                                            }
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key10 = entry.getKey();
                                            Object value10 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key10);
                                            C5052.m8574(c2100, enumC1497, i23, value10);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 9:
                                            iM40411 = ((AbstractC0318) ((AbstractC0066) value)).mo677(null);
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key11 = entry.getKey();
                                            Object value11 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key11);
                                            C5052.m8574(c2100, enumC1497, i23, value11);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 10:
                                            size2 = ((AbstractC0318) ((AbstractC0066) value)).mo677(null);
                                            iM40412 = C2100.m4049(size2);
                                            iM40411 = size2 + iM40412;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key12 = entry.getKey();
                                            Object value12 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key12);
                                            C5052.m8574(c2100, enumC1497, i23, value12);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 11:
                                            if (value instanceof C0533) {
                                                size2 = ((C0533) value).size();
                                                iM40412 = C2100.m4049(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                iM40412 = C2100.m4049(size2);
                                            }
                                            iM40411 = size2 + iM40412;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key13 = entry.getKey();
                                            Object value13 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key13);
                                            C5052.m8574(c2100, enumC1497, i23, value13);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 12:
                                            iM40411 = C2100.m4049(((Integer) value).intValue());
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key14 = entry.getKey();
                                            Object value14 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key14);
                                            C5052.m8574(c2100, enumC1497, i23, value14);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 13:
                                            iM40411 = C2100.m4048(((Integer) value).intValue());
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key15 = entry.getKey();
                                            Object value15 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key15);
                                            C5052.m8574(c2100, enumC1497, i23, value15);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iM40411 = 4;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key16 = entry.getKey();
                                            Object value16 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key16);
                                            C5052.m8574(c2100, enumC1497, i23, value16);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iM40411 = 8;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key17 = entry.getKey();
                                            Object value17 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key17);
                                            C5052.m8574(c2100, enumC1497, i23, value17);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 16:
                                            int iIntValue = ((Integer) value).intValue();
                                            iM40411 = C2100.m4049((iIntValue >> 31) ^ (iIntValue << 1));
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key18 = entry.getKey();
                                            Object value18 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key18);
                                            C5052.m8574(c2100, enumC1497, i23, value18);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 17:
                                            long jLongValue = ((Long) value).longValue();
                                            iM40411 = C2100.m4048((jLongValue << i) ^ (jLongValue >> 63));
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key19 = entry.getKey();
                                            Object value19 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key19);
                                            C5052.m8574(c2100, enumC1497, i23, value19);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 1:
                                    ((Float) key).getClass();
                                    iM4048 = 4;
                                    i5 = iM4048 + iM40413;
                                    iM4047 = C2100.m4047(i23);
                                    if (enumC1497 == c5329) {
                                        iM4047 *= 2;
                                    }
                                    switch (enumC1497.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iM40411 = 8;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key110 = entry.getKey();
                                            Object value110 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key110);
                                            C5052.m8574(c2100, enumC1497, i23, value110);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iM40411 = 4;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key111 = entry.getKey();
                                            Object value111 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key111);
                                            C5052.m8574(c2100, enumC1497, i23, value111);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                                            iM40411 = C2100.m4048(((Long) value).longValue());
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key112 = entry.getKey();
                                            Object value112 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key112);
                                            C5052.m8574(c2100, enumC1497, i23, value112);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                                            iM40411 = C2100.m4048(((Long) value).longValue());
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key113 = entry.getKey();
                                            Object value113 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key113);
                                            C5052.m8574(c2100, enumC1497, i23, value113);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case C4261.LONG_FIELD_NUMBER /* 4 */:
                                            iM40411 = C2100.m4048(((Integer) value).intValue());
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key114 = entry.getKey();
                                            Object value114 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key114);
                                            C5052.m8574(c2100, enumC1497, i23, value114);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case C4261.STRING_FIELD_NUMBER /* 5 */:
                                            ((Long) value).getClass();
                                            iM40411 = 8;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key115 = entry.getKey();
                                            Object value115 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key115);
                                            C5052.m8574(c2100, enumC1497, i23, value115);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                                            ((Integer) value).getClass();
                                            iM40411 = 4;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key116 = entry.getKey();
                                            Object value116 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key116);
                                            C5052.m8574(c2100, enumC1497, i23, value116);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                                            ((Boolean) value).getClass();
                                            iM40411 = i;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key117 = entry.getKey();
                                            Object value117 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key117);
                                            C5052.m8574(c2100, enumC1497, i23, value117);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 8:
                                            if (value instanceof C0533) {
                                                size2 = ((C0533) value).size();
                                                iM40412 = C2100.m4049(size2);
                                                iM40411 = size2 + iM40412;
                                            } else {
                                                iM40411 = C2100.m4050((String) value);
                                            }
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key118 = entry.getKey();
                                            Object value118 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key118);
                                            C5052.m8574(c2100, enumC1497, i23, value118);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 9:
                                            iM40411 = ((AbstractC0318) ((AbstractC0066) value)).mo677(null);
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key119 = entry.getKey();
                                            Object value119 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key119);
                                            C5052.m8574(c2100, enumC1497, i23, value119);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 10:
                                            size2 = ((AbstractC0318) ((AbstractC0066) value)).mo677(null);
                                            iM40412 = C2100.m4049(size2);
                                            iM40411 = size2 + iM40412;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key1110 = entry.getKey();
                                            Object value1110 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key1110);
                                            C5052.m8574(c2100, enumC1497, i23, value1110);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 11:
                                            if (value instanceof C0533) {
                                                size2 = ((C0533) value).size();
                                                iM40412 = C2100.m4049(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                iM40412 = C2100.m4049(size2);
                                            }
                                            iM40411 = size2 + iM40412;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key1111 = entry.getKey();
                                            Object value1111 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key1111);
                                            C5052.m8574(c2100, enumC1497, i23, value1111);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 12:
                                            iM40411 = C2100.m4049(((Integer) value).intValue());
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key1112 = entry.getKey();
                                            Object value1112 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key1112);
                                            C5052.m8574(c2100, enumC1497, i23, value1112);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 13:
                                            iM40411 = C2100.m4048(((Integer) value).intValue());
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key1113 = entry.getKey();
                                            Object value1113 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key1113);
                                            C5052.m8574(c2100, enumC1497, i23, value1113);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iM40411 = 4;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key1114 = entry.getKey();
                                            Object value1114 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key1114);
                                            C5052.m8574(c2100, enumC1497, i23, value1114);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iM40411 = 8;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key1115 = entry.getKey();
                                            Object value1115 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key1115);
                                            C5052.m8574(c2100, enumC1497, i23, value1115);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 16:
                                            int iIntValue2 = ((Integer) value).intValue();
                                            iM40411 = C2100.m4049((iIntValue2 >> 31) ^ (iIntValue2 << 1));
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key1116 = entry.getKey();
                                            Object value1116 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key1116);
                                            C5052.m8574(c2100, enumC1497, i23, value1116);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 17:
                                            long jLongValue2 = ((Long) value).longValue();
                                            iM40411 = C2100.m4048((jLongValue2 << i) ^ (jLongValue2 >> 63));
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key1117 = entry.getKey();
                                            Object value1117 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key1117);
                                            C5052.m8574(c2100, enumC1497, i23, value1117);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                                    iM4048 = C2100.m4048(((Long) key).longValue());
                                    i5 = iM4048 + iM40413;
                                    iM4047 = C2100.m4047(i23);
                                    if (enumC1497 == c5329) {
                                        iM4047 *= 2;
                                    }
                                    switch (enumC1497.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iM40411 = 8;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key1118 = entry.getKey();
                                            Object value1118 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key1118);
                                            C5052.m8574(c2100, enumC1497, i23, value1118);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iM40411 = 4;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key1119 = entry.getKey();
                                            Object value1119 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key1119);
                                            C5052.m8574(c2100, enumC1497, i23, value1119);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                                            iM40411 = C2100.m4048(((Long) value).longValue());
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key11110 = entry.getKey();
                                            Object value11110 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key11110);
                                            C5052.m8574(c2100, enumC1497, i23, value11110);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                                            iM40411 = C2100.m4048(((Long) value).longValue());
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key11111 = entry.getKey();
                                            Object value11111 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key11111);
                                            C5052.m8574(c2100, enumC1497, i23, value11111);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case C4261.LONG_FIELD_NUMBER /* 4 */:
                                            iM40411 = C2100.m4048(((Integer) value).intValue());
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key11112 = entry.getKey();
                                            Object value11112 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key11112);
                                            C5052.m8574(c2100, enumC1497, i23, value11112);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case C4261.STRING_FIELD_NUMBER /* 5 */:
                                            ((Long) value).getClass();
                                            iM40411 = 8;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key11113 = entry.getKey();
                                            Object value11113 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key11113);
                                            C5052.m8574(c2100, enumC1497, i23, value11113);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                                            ((Integer) value).getClass();
                                            iM40411 = 4;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key11114 = entry.getKey();
                                            Object value11114 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key11114);
                                            C5052.m8574(c2100, enumC1497, i23, value11114);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                                            ((Boolean) value).getClass();
                                            iM40411 = i;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key11115 = entry.getKey();
                                            Object value11115 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key11115);
                                            C5052.m8574(c2100, enumC1497, i23, value11115);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 8:
                                            if (value instanceof C0533) {
                                                size2 = ((C0533) value).size();
                                                iM40412 = C2100.m4049(size2);
                                                iM40411 = size2 + iM40412;
                                            } else {
                                                iM40411 = C2100.m4050((String) value);
                                            }
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key11116 = entry.getKey();
                                            Object value11116 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key11116);
                                            C5052.m8574(c2100, enumC1497, i23, value11116);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 9:
                                            iM40411 = ((AbstractC0318) ((AbstractC0066) value)).mo677(null);
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key11117 = entry.getKey();
                                            Object value11117 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key11117);
                                            C5052.m8574(c2100, enumC1497, i23, value11117);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 10:
                                            size2 = ((AbstractC0318) ((AbstractC0066) value)).mo677(null);
                                            iM40412 = C2100.m4049(size2);
                                            iM40411 = size2 + iM40412;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key11118 = entry.getKey();
                                            Object value11118 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key11118);
                                            C5052.m8574(c2100, enumC1497, i23, value11118);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 11:
                                            if (value instanceof C0533) {
                                                size2 = ((C0533) value).size();
                                                iM40412 = C2100.m4049(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                iM40412 = C2100.m4049(size2);
                                            }
                                            iM40411 = size2 + iM40412;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key11119 = entry.getKey();
                                            Object value11119 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key11119);
                                            C5052.m8574(c2100, enumC1497, i23, value11119);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 12:
                                            iM40411 = C2100.m4049(((Integer) value).intValue());
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key111110 = entry.getKey();
                                            Object value111110 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key111110);
                                            C5052.m8574(c2100, enumC1497, i23, value111110);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 13:
                                            iM40411 = C2100.m4048(((Integer) value).intValue());
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key111111 = entry.getKey();
                                            Object value111111 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key111111);
                                            C5052.m8574(c2100, enumC1497, i23, value111111);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iM40411 = 4;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key111112 = entry.getKey();
                                            Object value111112 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key111112);
                                            C5052.m8574(c2100, enumC1497, i23, value111112);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iM40411 = 8;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key111113 = entry.getKey();
                                            Object value111113 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key111113);
                                            C5052.m8574(c2100, enumC1497, i23, value111113);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 16:
                                            int iIntValue3 = ((Integer) value).intValue();
                                            iM40411 = C2100.m4049((iIntValue3 >> 31) ^ (iIntValue3 << 1));
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key111114 = entry.getKey();
                                            Object value111114 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key111114);
                                            C5052.m8574(c2100, enumC1497, i23, value111114);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 17:
                                            long jLongValue3 = ((Long) value).longValue();
                                            iM40411 = C2100.m4048((jLongValue3 << i) ^ (jLongValue3 >> 63));
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key111115 = entry.getKey();
                                            Object value111115 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key111115);
                                            C5052.m8574(c2100, enumC1497, i23, value111115);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                                    iM4048 = C2100.m4048(((Long) key).longValue());
                                    i5 = iM4048 + iM40413;
                                    iM4047 = C2100.m4047(i23);
                                    if (enumC1497 == c5329) {
                                        iM4047 *= 2;
                                    }
                                    switch (enumC1497.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iM40411 = 8;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key111116 = entry.getKey();
                                            Object value111116 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key111116);
                                            C5052.m8574(c2100, enumC1497, i23, value111116);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iM40411 = 4;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key111117 = entry.getKey();
                                            Object value111117 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key111117);
                                            C5052.m8574(c2100, enumC1497, i23, value111117);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                                            iM40411 = C2100.m4048(((Long) value).longValue());
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key111118 = entry.getKey();
                                            Object value111118 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key111118);
                                            C5052.m8574(c2100, enumC1497, i23, value111118);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                                            iM40411 = C2100.m4048(((Long) value).longValue());
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key111119 = entry.getKey();
                                            Object value111119 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key111119);
                                            C5052.m8574(c2100, enumC1497, i23, value111119);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case C4261.LONG_FIELD_NUMBER /* 4 */:
                                            iM40411 = C2100.m4048(((Integer) value).intValue());
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key1111110 = entry.getKey();
                                            Object value1111110 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key1111110);
                                            C5052.m8574(c2100, enumC1497, i23, value1111110);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case C4261.STRING_FIELD_NUMBER /* 5 */:
                                            ((Long) value).getClass();
                                            iM40411 = 8;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key1111111 = entry.getKey();
                                            Object value1111111 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key1111111);
                                            C5052.m8574(c2100, enumC1497, i23, value1111111);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                                            ((Integer) value).getClass();
                                            iM40411 = 4;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key1111112 = entry.getKey();
                                            Object value1111112 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key1111112);
                                            C5052.m8574(c2100, enumC1497, i23, value1111112);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                                            ((Boolean) value).getClass();
                                            iM40411 = i;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key1111113 = entry.getKey();
                                            Object value1111113 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key1111113);
                                            C5052.m8574(c2100, enumC1497, i23, value1111113);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 8:
                                            if (value instanceof C0533) {
                                                size2 = ((C0533) value).size();
                                                iM40412 = C2100.m4049(size2);
                                                iM40411 = size2 + iM40412;
                                            } else {
                                                iM40411 = C2100.m4050((String) value);
                                            }
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key1111114 = entry.getKey();
                                            Object value1111114 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key1111114);
                                            C5052.m8574(c2100, enumC1497, i23, value1111114);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 9:
                                            iM40411 = ((AbstractC0318) ((AbstractC0066) value)).mo677(null);
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key1111115 = entry.getKey();
                                            Object value1111115 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key1111115);
                                            C5052.m8574(c2100, enumC1497, i23, value1111115);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 10:
                                            size2 = ((AbstractC0318) ((AbstractC0066) value)).mo677(null);
                                            iM40412 = C2100.m4049(size2);
                                            iM40411 = size2 + iM40412;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key1111116 = entry.getKey();
                                            Object value1111116 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key1111116);
                                            C5052.m8574(c2100, enumC1497, i23, value1111116);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 11:
                                            if (value instanceof C0533) {
                                                size2 = ((C0533) value).size();
                                                iM40412 = C2100.m4049(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                iM40412 = C2100.m4049(size2);
                                            }
                                            iM40411 = size2 + iM40412;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key1111117 = entry.getKey();
                                            Object value1111117 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key1111117);
                                            C5052.m8574(c2100, enumC1497, i23, value1111117);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 12:
                                            iM40411 = C2100.m4049(((Integer) value).intValue());
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key1111118 = entry.getKey();
                                            Object value1111118 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key1111118);
                                            C5052.m8574(c2100, enumC1497, i23, value1111118);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 13:
                                            iM40411 = C2100.m4048(((Integer) value).intValue());
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key1111119 = entry.getKey();
                                            Object value1111119 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key1111119);
                                            C5052.m8574(c2100, enumC1497, i23, value1111119);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iM40411 = 4;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key11111110 = entry.getKey();
                                            Object value11111110 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key11111110);
                                            C5052.m8574(c2100, enumC1497, i23, value11111110);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iM40411 = 8;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key11111111 = entry.getKey();
                                            Object value11111111 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key11111111);
                                            C5052.m8574(c2100, enumC1497, i23, value11111111);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 16:
                                            int iIntValue4 = ((Integer) value).intValue();
                                            iM40411 = C2100.m4049((iIntValue4 >> 31) ^ (iIntValue4 << 1));
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key11111112 = entry.getKey();
                                            Object value11111112 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key11111112);
                                            C5052.m8574(c2100, enumC1497, i23, value11111112);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 17:
                                            long jLongValue4 = ((Long) value).longValue();
                                            iM40411 = C2100.m4048((jLongValue4 << i) ^ (jLongValue4 >> 63));
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key11111113 = entry.getKey();
                                            Object value11111113 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key11111113);
                                            C5052.m8574(c2100, enumC1497, i23, value11111113);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case C4261.LONG_FIELD_NUMBER /* 4 */:
                                    iM4048 = C2100.m4048(((Integer) key).intValue());
                                    i5 = iM4048 + iM40413;
                                    iM4047 = C2100.m4047(i23);
                                    if (enumC1497 == c5329) {
                                        iM4047 *= 2;
                                    }
                                    switch (enumC1497.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iM40411 = 8;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key11111114 = entry.getKey();
                                            Object value11111114 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key11111114);
                                            C5052.m8574(c2100, enumC1497, i23, value11111114);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iM40411 = 4;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key11111115 = entry.getKey();
                                            Object value11111115 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key11111115);
                                            C5052.m8574(c2100, enumC1497, i23, value11111115);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                                            iM40411 = C2100.m4048(((Long) value).longValue());
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key11111116 = entry.getKey();
                                            Object value11111116 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key11111116);
                                            C5052.m8574(c2100, enumC1497, i23, value11111116);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                                            iM40411 = C2100.m4048(((Long) value).longValue());
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key11111117 = entry.getKey();
                                            Object value11111117 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key11111117);
                                            C5052.m8574(c2100, enumC1497, i23, value11111117);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case C4261.LONG_FIELD_NUMBER /* 4 */:
                                            iM40411 = C2100.m4048(((Integer) value).intValue());
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key11111118 = entry.getKey();
                                            Object value11111118 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key11111118);
                                            C5052.m8574(c2100, enumC1497, i23, value11111118);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case C4261.STRING_FIELD_NUMBER /* 5 */:
                                            ((Long) value).getClass();
                                            iM40411 = 8;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key11111119 = entry.getKey();
                                            Object value11111119 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key11111119);
                                            C5052.m8574(c2100, enumC1497, i23, value11111119);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                                            ((Integer) value).getClass();
                                            iM40411 = 4;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key111111110 = entry.getKey();
                                            Object value111111110 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key111111110);
                                            C5052.m8574(c2100, enumC1497, i23, value111111110);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                                            ((Boolean) value).getClass();
                                            iM40411 = i;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key111111111 = entry.getKey();
                                            Object value111111111 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key111111111);
                                            C5052.m8574(c2100, enumC1497, i23, value111111111);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 8:
                                            if (value instanceof C0533) {
                                                size2 = ((C0533) value).size();
                                                iM40412 = C2100.m4049(size2);
                                                iM40411 = size2 + iM40412;
                                            } else {
                                                iM40411 = C2100.m4050((String) value);
                                            }
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key111111112 = entry.getKey();
                                            Object value111111112 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key111111112);
                                            C5052.m8574(c2100, enumC1497, i23, value111111112);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 9:
                                            iM40411 = ((AbstractC0318) ((AbstractC0066) value)).mo677(null);
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key111111113 = entry.getKey();
                                            Object value111111113 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key111111113);
                                            C5052.m8574(c2100, enumC1497, i23, value111111113);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 10:
                                            size2 = ((AbstractC0318) ((AbstractC0066) value)).mo677(null);
                                            iM40412 = C2100.m4049(size2);
                                            iM40411 = size2 + iM40412;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key111111114 = entry.getKey();
                                            Object value111111114 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key111111114);
                                            C5052.m8574(c2100, enumC1497, i23, value111111114);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 11:
                                            if (value instanceof C0533) {
                                                size2 = ((C0533) value).size();
                                                iM40412 = C2100.m4049(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                iM40412 = C2100.m4049(size2);
                                            }
                                            iM40411 = size2 + iM40412;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key111111115 = entry.getKey();
                                            Object value111111115 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key111111115);
                                            C5052.m8574(c2100, enumC1497, i23, value111111115);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 12:
                                            iM40411 = C2100.m4049(((Integer) value).intValue());
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key111111116 = entry.getKey();
                                            Object value111111116 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key111111116);
                                            C5052.m8574(c2100, enumC1497, i23, value111111116);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 13:
                                            iM40411 = C2100.m4048(((Integer) value).intValue());
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key111111117 = entry.getKey();
                                            Object value111111117 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key111111117);
                                            C5052.m8574(c2100, enumC1497, i23, value111111117);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iM40411 = 4;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key111111118 = entry.getKey();
                                            Object value111111118 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key111111118);
                                            C5052.m8574(c2100, enumC1497, i23, value111111118);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iM40411 = 8;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key111111119 = entry.getKey();
                                            Object value111111119 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key111111119);
                                            C5052.m8574(c2100, enumC1497, i23, value111111119);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 16:
                                            int iIntValue5 = ((Integer) value).intValue();
                                            iM40411 = C2100.m4049((iIntValue5 >> 31) ^ (iIntValue5 << 1));
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key1111111110 = entry.getKey();
                                            Object value1111111110 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key1111111110);
                                            C5052.m8574(c2100, enumC1497, i23, value1111111110);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 17:
                                            long jLongValue5 = ((Long) value).longValue();
                                            iM40411 = C2100.m4048((jLongValue5 << i) ^ (jLongValue5 >> 63));
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key1111111111 = entry.getKey();
                                            Object value1111111111 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key1111111111);
                                            C5052.m8574(c2100, enumC1497, i23, value1111111111);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case C4261.STRING_FIELD_NUMBER /* 5 */:
                                    ((Long) key).getClass();
                                    iM4048 = 8;
                                    i5 = iM4048 + iM40413;
                                    iM4047 = C2100.m4047(i23);
                                    if (enumC1497 == c5329) {
                                        iM4047 *= 2;
                                    }
                                    switch (enumC1497.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iM40411 = 8;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key1111111112 = entry.getKey();
                                            Object value1111111112 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key1111111112);
                                            C5052.m8574(c2100, enumC1497, i23, value1111111112);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iM40411 = 4;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key1111111113 = entry.getKey();
                                            Object value1111111113 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key1111111113);
                                            C5052.m8574(c2100, enumC1497, i23, value1111111113);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                                            iM40411 = C2100.m4048(((Long) value).longValue());
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key1111111114 = entry.getKey();
                                            Object value1111111114 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key1111111114);
                                            C5052.m8574(c2100, enumC1497, i23, value1111111114);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                                            iM40411 = C2100.m4048(((Long) value).longValue());
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key1111111115 = entry.getKey();
                                            Object value1111111115 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key1111111115);
                                            C5052.m8574(c2100, enumC1497, i23, value1111111115);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case C4261.LONG_FIELD_NUMBER /* 4 */:
                                            iM40411 = C2100.m4048(((Integer) value).intValue());
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key1111111116 = entry.getKey();
                                            Object value1111111116 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key1111111116);
                                            C5052.m8574(c2100, enumC1497, i23, value1111111116);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case C4261.STRING_FIELD_NUMBER /* 5 */:
                                            ((Long) value).getClass();
                                            iM40411 = 8;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key1111111117 = entry.getKey();
                                            Object value1111111117 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key1111111117);
                                            C5052.m8574(c2100, enumC1497, i23, value1111111117);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                                            ((Integer) value).getClass();
                                            iM40411 = 4;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key1111111118 = entry.getKey();
                                            Object value1111111118 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key1111111118);
                                            C5052.m8574(c2100, enumC1497, i23, value1111111118);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                                            ((Boolean) value).getClass();
                                            iM40411 = i;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key1111111119 = entry.getKey();
                                            Object value1111111119 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key1111111119);
                                            C5052.m8574(c2100, enumC1497, i23, value1111111119);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 8:
                                            if (value instanceof C0533) {
                                                size2 = ((C0533) value).size();
                                                iM40412 = C2100.m4049(size2);
                                                iM40411 = size2 + iM40412;
                                            } else {
                                                iM40411 = C2100.m4050((String) value);
                                            }
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key11111111110 = entry.getKey();
                                            Object value11111111110 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key11111111110);
                                            C5052.m8574(c2100, enumC1497, i23, value11111111110);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 9:
                                            iM40411 = ((AbstractC0318) ((AbstractC0066) value)).mo677(null);
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key11111111111 = entry.getKey();
                                            Object value11111111111 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key11111111111);
                                            C5052.m8574(c2100, enumC1497, i23, value11111111111);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 10:
                                            size2 = ((AbstractC0318) ((AbstractC0066) value)).mo677(null);
                                            iM40412 = C2100.m4049(size2);
                                            iM40411 = size2 + iM40412;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key11111111112 = entry.getKey();
                                            Object value11111111112 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key11111111112);
                                            C5052.m8574(c2100, enumC1497, i23, value11111111112);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 11:
                                            if (value instanceof C0533) {
                                                size2 = ((C0533) value).size();
                                                iM40412 = C2100.m4049(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                iM40412 = C2100.m4049(size2);
                                            }
                                            iM40411 = size2 + iM40412;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key11111111113 = entry.getKey();
                                            Object value11111111113 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key11111111113);
                                            C5052.m8574(c2100, enumC1497, i23, value11111111113);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 12:
                                            iM40411 = C2100.m4049(((Integer) value).intValue());
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key11111111114 = entry.getKey();
                                            Object value11111111114 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key11111111114);
                                            C5052.m8574(c2100, enumC1497, i23, value11111111114);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 13:
                                            iM40411 = C2100.m4048(((Integer) value).intValue());
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key11111111115 = entry.getKey();
                                            Object value11111111115 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key11111111115);
                                            C5052.m8574(c2100, enumC1497, i23, value11111111115);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iM40411 = 4;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key11111111116 = entry.getKey();
                                            Object value11111111116 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key11111111116);
                                            C5052.m8574(c2100, enumC1497, i23, value11111111116);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iM40411 = 8;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key11111111117 = entry.getKey();
                                            Object value11111111117 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key11111111117);
                                            C5052.m8574(c2100, enumC1497, i23, value11111111117);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 16:
                                            int iIntValue6 = ((Integer) value).intValue();
                                            iM40411 = C2100.m4049((iIntValue6 >> 31) ^ (iIntValue6 << 1));
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key11111111118 = entry.getKey();
                                            Object value11111111118 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key11111111118);
                                            C5052.m8574(c2100, enumC1497, i23, value11111111118);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 17:
                                            long jLongValue6 = ((Long) value).longValue();
                                            iM40411 = C2100.m4048((jLongValue6 << i) ^ (jLongValue6 >> 63));
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key11111111119 = entry.getKey();
                                            Object value11111111119 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key11111111119);
                                            C5052.m8574(c2100, enumC1497, i23, value11111111119);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                                    ((Integer) key).getClass();
                                    iM4048 = 4;
                                    i5 = iM4048 + iM40413;
                                    iM4047 = C2100.m4047(i23);
                                    if (enumC1497 == c5329) {
                                        iM4047 *= 2;
                                    }
                                    switch (enumC1497.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iM40411 = 8;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key111111111110 = entry.getKey();
                                            Object value111111111110 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key111111111110);
                                            C5052.m8574(c2100, enumC1497, i23, value111111111110);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iM40411 = 4;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key111111111111 = entry.getKey();
                                            Object value111111111111 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key111111111111);
                                            C5052.m8574(c2100, enumC1497, i23, value111111111111);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                                            iM40411 = C2100.m4048(((Long) value).longValue());
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key111111111112 = entry.getKey();
                                            Object value111111111112 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key111111111112);
                                            C5052.m8574(c2100, enumC1497, i23, value111111111112);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                                            iM40411 = C2100.m4048(((Long) value).longValue());
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key111111111113 = entry.getKey();
                                            Object value111111111113 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key111111111113);
                                            C5052.m8574(c2100, enumC1497, i23, value111111111113);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case C4261.LONG_FIELD_NUMBER /* 4 */:
                                            iM40411 = C2100.m4048(((Integer) value).intValue());
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key111111111114 = entry.getKey();
                                            Object value111111111114 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key111111111114);
                                            C5052.m8574(c2100, enumC1497, i23, value111111111114);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case C4261.STRING_FIELD_NUMBER /* 5 */:
                                            ((Long) value).getClass();
                                            iM40411 = 8;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key111111111115 = entry.getKey();
                                            Object value111111111115 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key111111111115);
                                            C5052.m8574(c2100, enumC1497, i23, value111111111115);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                                            ((Integer) value).getClass();
                                            iM40411 = 4;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key111111111116 = entry.getKey();
                                            Object value111111111116 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key111111111116);
                                            C5052.m8574(c2100, enumC1497, i23, value111111111116);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                                            ((Boolean) value).getClass();
                                            iM40411 = i;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key111111111117 = entry.getKey();
                                            Object value111111111117 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key111111111117);
                                            C5052.m8574(c2100, enumC1497, i23, value111111111117);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 8:
                                            if (value instanceof C0533) {
                                                size2 = ((C0533) value).size();
                                                iM40412 = C2100.m4049(size2);
                                                iM40411 = size2 + iM40412;
                                            } else {
                                                iM40411 = C2100.m4050((String) value);
                                            }
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key111111111118 = entry.getKey();
                                            Object value111111111118 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key111111111118);
                                            C5052.m8574(c2100, enumC1497, i23, value111111111118);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 9:
                                            iM40411 = ((AbstractC0318) ((AbstractC0066) value)).mo677(null);
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key111111111119 = entry.getKey();
                                            Object value111111111119 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key111111111119);
                                            C5052.m8574(c2100, enumC1497, i23, value111111111119);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 10:
                                            size2 = ((AbstractC0318) ((AbstractC0066) value)).mo677(null);
                                            iM40412 = C2100.m4049(size2);
                                            iM40411 = size2 + iM40412;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key1111111111110 = entry.getKey();
                                            Object value1111111111110 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key1111111111110);
                                            C5052.m8574(c2100, enumC1497, i23, value1111111111110);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 11:
                                            if (value instanceof C0533) {
                                                size2 = ((C0533) value).size();
                                                iM40412 = C2100.m4049(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                iM40412 = C2100.m4049(size2);
                                            }
                                            iM40411 = size2 + iM40412;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key1111111111111 = entry.getKey();
                                            Object value1111111111111 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key1111111111111);
                                            C5052.m8574(c2100, enumC1497, i23, value1111111111111);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 12:
                                            iM40411 = C2100.m4049(((Integer) value).intValue());
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key1111111111112 = entry.getKey();
                                            Object value1111111111112 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key1111111111112);
                                            C5052.m8574(c2100, enumC1497, i23, value1111111111112);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 13:
                                            iM40411 = C2100.m4048(((Integer) value).intValue());
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key1111111111113 = entry.getKey();
                                            Object value1111111111113 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key1111111111113);
                                            C5052.m8574(c2100, enumC1497, i23, value1111111111113);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iM40411 = 4;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key1111111111114 = entry.getKey();
                                            Object value1111111111114 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key1111111111114);
                                            C5052.m8574(c2100, enumC1497, i23, value1111111111114);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iM40411 = 8;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key1111111111115 = entry.getKey();
                                            Object value1111111111115 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key1111111111115);
                                            C5052.m8574(c2100, enumC1497, i23, value1111111111115);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 16:
                                            int iIntValue7 = ((Integer) value).intValue();
                                            iM40411 = C2100.m4049((iIntValue7 >> 31) ^ (iIntValue7 << 1));
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key1111111111116 = entry.getKey();
                                            Object value1111111111116 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key1111111111116);
                                            C5052.m8574(c2100, enumC1497, i23, value1111111111116);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 17:
                                            long jLongValue7 = ((Long) value).longValue();
                                            iM40411 = C2100.m4048((jLongValue7 << i) ^ (jLongValue7 >> 63));
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key1111111111117 = entry.getKey();
                                            Object value1111111111117 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key1111111111117);
                                            C5052.m8574(c2100, enumC1497, i23, value1111111111117);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                                    ((Boolean) key).getClass();
                                    iM4048 = i;
                                    i5 = iM4048 + iM40413;
                                    iM4047 = C2100.m4047(i23);
                                    if (enumC1497 == c5329) {
                                        iM4047 *= 2;
                                    }
                                    switch (enumC1497.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iM40411 = 8;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key1111111111118 = entry.getKey();
                                            Object value1111111111118 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key1111111111118);
                                            C5052.m8574(c2100, enumC1497, i23, value1111111111118);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iM40411 = 4;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key1111111111119 = entry.getKey();
                                            Object value1111111111119 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key1111111111119);
                                            C5052.m8574(c2100, enumC1497, i23, value1111111111119);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                                            iM40411 = C2100.m4048(((Long) value).longValue());
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key11111111111110 = entry.getKey();
                                            Object value11111111111110 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key11111111111110);
                                            C5052.m8574(c2100, enumC1497, i23, value11111111111110);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                                            iM40411 = C2100.m4048(((Long) value).longValue());
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key11111111111111 = entry.getKey();
                                            Object value11111111111111 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key11111111111111);
                                            C5052.m8574(c2100, enumC1497, i23, value11111111111111);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case C4261.LONG_FIELD_NUMBER /* 4 */:
                                            iM40411 = C2100.m4048(((Integer) value).intValue());
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key11111111111112 = entry.getKey();
                                            Object value11111111111112 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key11111111111112);
                                            C5052.m8574(c2100, enumC1497, i23, value11111111111112);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case C4261.STRING_FIELD_NUMBER /* 5 */:
                                            ((Long) value).getClass();
                                            iM40411 = 8;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key11111111111113 = entry.getKey();
                                            Object value11111111111113 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key11111111111113);
                                            C5052.m8574(c2100, enumC1497, i23, value11111111111113);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                                            ((Integer) value).getClass();
                                            iM40411 = 4;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key11111111111114 = entry.getKey();
                                            Object value11111111111114 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key11111111111114);
                                            C5052.m8574(c2100, enumC1497, i23, value11111111111114);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                                            ((Boolean) value).getClass();
                                            iM40411 = i;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key11111111111115 = entry.getKey();
                                            Object value11111111111115 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key11111111111115);
                                            C5052.m8574(c2100, enumC1497, i23, value11111111111115);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 8:
                                            if (value instanceof C0533) {
                                                size2 = ((C0533) value).size();
                                                iM40412 = C2100.m4049(size2);
                                                iM40411 = size2 + iM40412;
                                            } else {
                                                iM40411 = C2100.m4050((String) value);
                                            }
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key11111111111116 = entry.getKey();
                                            Object value11111111111116 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key11111111111116);
                                            C5052.m8574(c2100, enumC1497, i23, value11111111111116);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 9:
                                            iM40411 = ((AbstractC0318) ((AbstractC0066) value)).mo677(null);
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key11111111111117 = entry.getKey();
                                            Object value11111111111117 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key11111111111117);
                                            C5052.m8574(c2100, enumC1497, i23, value11111111111117);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 10:
                                            size2 = ((AbstractC0318) ((AbstractC0066) value)).mo677(null);
                                            iM40412 = C2100.m4049(size2);
                                            iM40411 = size2 + iM40412;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key11111111111118 = entry.getKey();
                                            Object value11111111111118 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key11111111111118);
                                            C5052.m8574(c2100, enumC1497, i23, value11111111111118);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 11:
                                            if (value instanceof C0533) {
                                                size2 = ((C0533) value).size();
                                                iM40412 = C2100.m4049(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                iM40412 = C2100.m4049(size2);
                                            }
                                            iM40411 = size2 + iM40412;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key11111111111119 = entry.getKey();
                                            Object value11111111111119 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key11111111111119);
                                            C5052.m8574(c2100, enumC1497, i23, value11111111111119);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 12:
                                            iM40411 = C2100.m4049(((Integer) value).intValue());
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key111111111111110 = entry.getKey();
                                            Object value111111111111110 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key111111111111110);
                                            C5052.m8574(c2100, enumC1497, i23, value111111111111110);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 13:
                                            iM40411 = C2100.m4048(((Integer) value).intValue());
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key111111111111111 = entry.getKey();
                                            Object value111111111111111 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key111111111111111);
                                            C5052.m8574(c2100, enumC1497, i23, value111111111111111);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iM40411 = 4;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key111111111111112 = entry.getKey();
                                            Object value111111111111112 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key111111111111112);
                                            C5052.m8574(c2100, enumC1497, i23, value111111111111112);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iM40411 = 8;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key111111111111113 = entry.getKey();
                                            Object value111111111111113 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key111111111111113);
                                            C5052.m8574(c2100, enumC1497, i23, value111111111111113);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 16:
                                            int iIntValue8 = ((Integer) value).intValue();
                                            iM40411 = C2100.m4049((iIntValue8 >> 31) ^ (iIntValue8 << 1));
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key111111111111114 = entry.getKey();
                                            Object value111111111111114 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key111111111111114);
                                            C5052.m8574(c2100, enumC1497, i23, value111111111111114);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 17:
                                            long jLongValue8 = ((Long) value).longValue();
                                            iM40411 = C2100.m4048((jLongValue8 << i) ^ (jLongValue8 >> 63));
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key111111111111115 = entry.getKey();
                                            Object value111111111111115 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key111111111111115);
                                            C5052.m8574(c2100, enumC1497, i23, value111111111111115);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 8:
                                    if (key instanceof C0533) {
                                        size = ((C0533) key).size();
                                        iM4049 = C2100.m4049(size);
                                        iM4048 = size + iM4049;
                                    } else {
                                        iM4048 = C2100.m4050((String) key);
                                    }
                                    i5 = iM4048 + iM40413;
                                    iM4047 = C2100.m4047(i23);
                                    if (enumC1497 == c5329) {
                                        iM4047 *= 2;
                                    }
                                    switch (enumC1497.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iM40411 = 8;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key111111111111116 = entry.getKey();
                                            Object value111111111111116 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key111111111111116);
                                            C5052.m8574(c2100, enumC1497, i23, value111111111111116);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iM40411 = 4;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key111111111111117 = entry.getKey();
                                            Object value111111111111117 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key111111111111117);
                                            C5052.m8574(c2100, enumC1497, i23, value111111111111117);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                                            iM40411 = C2100.m4048(((Long) value).longValue());
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key111111111111118 = entry.getKey();
                                            Object value111111111111118 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key111111111111118);
                                            C5052.m8574(c2100, enumC1497, i23, value111111111111118);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                                            iM40411 = C2100.m4048(((Long) value).longValue());
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key111111111111119 = entry.getKey();
                                            Object value111111111111119 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key111111111111119);
                                            C5052.m8574(c2100, enumC1497, i23, value111111111111119);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case C4261.LONG_FIELD_NUMBER /* 4 */:
                                            iM40411 = C2100.m4048(((Integer) value).intValue());
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key1111111111111110 = entry.getKey();
                                            Object value1111111111111110 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key1111111111111110);
                                            C5052.m8574(c2100, enumC1497, i23, value1111111111111110);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case C4261.STRING_FIELD_NUMBER /* 5 */:
                                            ((Long) value).getClass();
                                            iM40411 = 8;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key1111111111111111 = entry.getKey();
                                            Object value1111111111111111 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key1111111111111111);
                                            C5052.m8574(c2100, enumC1497, i23, value1111111111111111);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                                            ((Integer) value).getClass();
                                            iM40411 = 4;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key1111111111111112 = entry.getKey();
                                            Object value1111111111111112 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key1111111111111112);
                                            C5052.m8574(c2100, enumC1497, i23, value1111111111111112);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                                            ((Boolean) value).getClass();
                                            iM40411 = i;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key1111111111111113 = entry.getKey();
                                            Object value1111111111111113 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key1111111111111113);
                                            C5052.m8574(c2100, enumC1497, i23, value1111111111111113);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 8:
                                            if (value instanceof C0533) {
                                                size2 = ((C0533) value).size();
                                                iM40412 = C2100.m4049(size2);
                                                iM40411 = size2 + iM40412;
                                            } else {
                                                iM40411 = C2100.m4050((String) value);
                                            }
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key1111111111111114 = entry.getKey();
                                            Object value1111111111111114 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key1111111111111114);
                                            C5052.m8574(c2100, enumC1497, i23, value1111111111111114);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 9:
                                            iM40411 = ((AbstractC0318) ((AbstractC0066) value)).mo677(null);
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key1111111111111115 = entry.getKey();
                                            Object value1111111111111115 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key1111111111111115);
                                            C5052.m8574(c2100, enumC1497, i23, value1111111111111115);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 10:
                                            size2 = ((AbstractC0318) ((AbstractC0066) value)).mo677(null);
                                            iM40412 = C2100.m4049(size2);
                                            iM40411 = size2 + iM40412;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key1111111111111116 = entry.getKey();
                                            Object value1111111111111116 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key1111111111111116);
                                            C5052.m8574(c2100, enumC1497, i23, value1111111111111116);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 11:
                                            if (value instanceof C0533) {
                                                size2 = ((C0533) value).size();
                                                iM40412 = C2100.m4049(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                iM40412 = C2100.m4049(size2);
                                            }
                                            iM40411 = size2 + iM40412;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key1111111111111117 = entry.getKey();
                                            Object value1111111111111117 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key1111111111111117);
                                            C5052.m8574(c2100, enumC1497, i23, value1111111111111117);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 12:
                                            iM40411 = C2100.m4049(((Integer) value).intValue());
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key1111111111111118 = entry.getKey();
                                            Object value1111111111111118 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key1111111111111118);
                                            C5052.m8574(c2100, enumC1497, i23, value1111111111111118);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 13:
                                            iM40411 = C2100.m4048(((Integer) value).intValue());
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key1111111111111119 = entry.getKey();
                                            Object value1111111111111119 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key1111111111111119);
                                            C5052.m8574(c2100, enumC1497, i23, value1111111111111119);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iM40411 = 4;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key11111111111111110 = entry.getKey();
                                            Object value11111111111111110 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key11111111111111110);
                                            C5052.m8574(c2100, enumC1497, i23, value11111111111111110);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iM40411 = 8;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key11111111111111111 = entry.getKey();
                                            Object value11111111111111111 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key11111111111111111);
                                            C5052.m8574(c2100, enumC1497, i23, value11111111111111111);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 16:
                                            int iIntValue9 = ((Integer) value).intValue();
                                            iM40411 = C2100.m4049((iIntValue9 >> 31) ^ (iIntValue9 << 1));
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key11111111111111112 = entry.getKey();
                                            Object value11111111111111112 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key11111111111111112);
                                            C5052.m8574(c2100, enumC1497, i23, value11111111111111112);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 17:
                                            long jLongValue9 = ((Long) value).longValue();
                                            iM40411 = C2100.m4048((jLongValue9 << i) ^ (jLongValue9 >> 63));
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key11111111111111113 = entry.getKey();
                                            Object value11111111111111113 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key11111111111111113);
                                            C5052.m8574(c2100, enumC1497, i23, value11111111111111113);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 9:
                                    iMo677 = ((AbstractC0318) ((AbstractC0066) key)).mo677(null);
                                    iM4048 = iMo677;
                                    i5 = iM4048 + iM40413;
                                    iM4047 = C2100.m4047(i23);
                                    if (enumC1497 == c5329) {
                                        iM4047 *= 2;
                                    }
                                    switch (enumC1497.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iM40411 = 8;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key11111111111111114 = entry.getKey();
                                            Object value11111111111111114 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key11111111111111114);
                                            C5052.m8574(c2100, enumC1497, i23, value11111111111111114);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iM40411 = 4;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key11111111111111115 = entry.getKey();
                                            Object value11111111111111115 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key11111111111111115);
                                            C5052.m8574(c2100, enumC1497, i23, value11111111111111115);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                                            iM40411 = C2100.m4048(((Long) value).longValue());
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key11111111111111116 = entry.getKey();
                                            Object value11111111111111116 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key11111111111111116);
                                            C5052.m8574(c2100, enumC1497, i23, value11111111111111116);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                                            iM40411 = C2100.m4048(((Long) value).longValue());
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key11111111111111117 = entry.getKey();
                                            Object value11111111111111117 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key11111111111111117);
                                            C5052.m8574(c2100, enumC1497, i23, value11111111111111117);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case C4261.LONG_FIELD_NUMBER /* 4 */:
                                            iM40411 = C2100.m4048(((Integer) value).intValue());
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key11111111111111118 = entry.getKey();
                                            Object value11111111111111118 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key11111111111111118);
                                            C5052.m8574(c2100, enumC1497, i23, value11111111111111118);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case C4261.STRING_FIELD_NUMBER /* 5 */:
                                            ((Long) value).getClass();
                                            iM40411 = 8;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key11111111111111119 = entry.getKey();
                                            Object value11111111111111119 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key11111111111111119);
                                            C5052.m8574(c2100, enumC1497, i23, value11111111111111119);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                                            ((Integer) value).getClass();
                                            iM40411 = 4;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key111111111111111110 = entry.getKey();
                                            Object value111111111111111110 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key111111111111111110);
                                            C5052.m8574(c2100, enumC1497, i23, value111111111111111110);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                                            ((Boolean) value).getClass();
                                            iM40411 = i;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key111111111111111111 = entry.getKey();
                                            Object value111111111111111111 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key111111111111111111);
                                            C5052.m8574(c2100, enumC1497, i23, value111111111111111111);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 8:
                                            if (value instanceof C0533) {
                                                size2 = ((C0533) value).size();
                                                iM40412 = C2100.m4049(size2);
                                                iM40411 = size2 + iM40412;
                                            } else {
                                                iM40411 = C2100.m4050((String) value);
                                            }
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key111111111111111112 = entry.getKey();
                                            Object value111111111111111112 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key111111111111111112);
                                            C5052.m8574(c2100, enumC1497, i23, value111111111111111112);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 9:
                                            iM40411 = ((AbstractC0318) ((AbstractC0066) value)).mo677(null);
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key111111111111111113 = entry.getKey();
                                            Object value111111111111111113 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key111111111111111113);
                                            C5052.m8574(c2100, enumC1497, i23, value111111111111111113);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 10:
                                            size2 = ((AbstractC0318) ((AbstractC0066) value)).mo677(null);
                                            iM40412 = C2100.m4049(size2);
                                            iM40411 = size2 + iM40412;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key111111111111111114 = entry.getKey();
                                            Object value111111111111111114 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key111111111111111114);
                                            C5052.m8574(c2100, enumC1497, i23, value111111111111111114);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 11:
                                            if (value instanceof C0533) {
                                                size2 = ((C0533) value).size();
                                                iM40412 = C2100.m4049(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                iM40412 = C2100.m4049(size2);
                                            }
                                            iM40411 = size2 + iM40412;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key111111111111111115 = entry.getKey();
                                            Object value111111111111111115 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key111111111111111115);
                                            C5052.m8574(c2100, enumC1497, i23, value111111111111111115);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 12:
                                            iM40411 = C2100.m4049(((Integer) value).intValue());
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key111111111111111116 = entry.getKey();
                                            Object value111111111111111116 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key111111111111111116);
                                            C5052.m8574(c2100, enumC1497, i23, value111111111111111116);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 13:
                                            iM40411 = C2100.m4048(((Integer) value).intValue());
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key111111111111111117 = entry.getKey();
                                            Object value111111111111111117 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key111111111111111117);
                                            C5052.m8574(c2100, enumC1497, i23, value111111111111111117);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iM40411 = 4;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key111111111111111118 = entry.getKey();
                                            Object value111111111111111118 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key111111111111111118);
                                            C5052.m8574(c2100, enumC1497, i23, value111111111111111118);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iM40411 = 8;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key111111111111111119 = entry.getKey();
                                            Object value111111111111111119 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key111111111111111119);
                                            C5052.m8574(c2100, enumC1497, i23, value111111111111111119);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 16:
                                            int iIntValue10 = ((Integer) value).intValue();
                                            iM40411 = C2100.m4049((iIntValue10 >> 31) ^ (iIntValue10 << 1));
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key1111111111111111110 = entry.getKey();
                                            Object value1111111111111111110 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key1111111111111111110);
                                            C5052.m8574(c2100, enumC1497, i23, value1111111111111111110);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 17:
                                            long jLongValue10 = ((Long) value).longValue();
                                            iM40411 = C2100.m4048((jLongValue10 << i) ^ (jLongValue10 >> 63));
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key1111111111111111111 = entry.getKey();
                                            Object value1111111111111111111 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key1111111111111111111);
                                            C5052.m8574(c2100, enumC1497, i23, value1111111111111111111);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 10:
                                    int iMo678 = ((AbstractC0318) ((AbstractC0066) key)).mo677(null);
                                    iMo677 = iMo678 + C2100.m4049(iMo678);
                                    iM4048 = iMo677;
                                    i5 = iM4048 + iM40413;
                                    iM4047 = C2100.m4047(i23);
                                    if (enumC1497 == c5329) {
                                        iM4047 *= 2;
                                    }
                                    switch (enumC1497.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iM40411 = 8;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key1111111111111111112 = entry.getKey();
                                            Object value1111111111111111112 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key1111111111111111112);
                                            C5052.m8574(c2100, enumC1497, i23, value1111111111111111112);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iM40411 = 4;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key1111111111111111113 = entry.getKey();
                                            Object value1111111111111111113 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key1111111111111111113);
                                            C5052.m8574(c2100, enumC1497, i23, value1111111111111111113);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                                            iM40411 = C2100.m4048(((Long) value).longValue());
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key1111111111111111114 = entry.getKey();
                                            Object value1111111111111111114 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key1111111111111111114);
                                            C5052.m8574(c2100, enumC1497, i23, value1111111111111111114);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                                            iM40411 = C2100.m4048(((Long) value).longValue());
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key1111111111111111115 = entry.getKey();
                                            Object value1111111111111111115 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key1111111111111111115);
                                            C5052.m8574(c2100, enumC1497, i23, value1111111111111111115);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case C4261.LONG_FIELD_NUMBER /* 4 */:
                                            iM40411 = C2100.m4048(((Integer) value).intValue());
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key1111111111111111116 = entry.getKey();
                                            Object value1111111111111111116 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key1111111111111111116);
                                            C5052.m8574(c2100, enumC1497, i23, value1111111111111111116);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case C4261.STRING_FIELD_NUMBER /* 5 */:
                                            ((Long) value).getClass();
                                            iM40411 = 8;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key1111111111111111117 = entry.getKey();
                                            Object value1111111111111111117 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key1111111111111111117);
                                            C5052.m8574(c2100, enumC1497, i23, value1111111111111111117);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                                            ((Integer) value).getClass();
                                            iM40411 = 4;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key1111111111111111118 = entry.getKey();
                                            Object value1111111111111111118 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key1111111111111111118);
                                            C5052.m8574(c2100, enumC1497, i23, value1111111111111111118);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                                            ((Boolean) value).getClass();
                                            iM40411 = i;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key1111111111111111119 = entry.getKey();
                                            Object value1111111111111111119 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key1111111111111111119);
                                            C5052.m8574(c2100, enumC1497, i23, value1111111111111111119);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 8:
                                            if (value instanceof C0533) {
                                                size2 = ((C0533) value).size();
                                                iM40412 = C2100.m4049(size2);
                                                iM40411 = size2 + iM40412;
                                            } else {
                                                iM40411 = C2100.m4050((String) value);
                                            }
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key11111111111111111110 = entry.getKey();
                                            Object value11111111111111111110 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key11111111111111111110);
                                            C5052.m8574(c2100, enumC1497, i23, value11111111111111111110);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 9:
                                            iM40411 = ((AbstractC0318) ((AbstractC0066) value)).mo677(null);
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key11111111111111111111 = entry.getKey();
                                            Object value11111111111111111111 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key11111111111111111111);
                                            C5052.m8574(c2100, enumC1497, i23, value11111111111111111111);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 10:
                                            size2 = ((AbstractC0318) ((AbstractC0066) value)).mo677(null);
                                            iM40412 = C2100.m4049(size2);
                                            iM40411 = size2 + iM40412;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key11111111111111111112 = entry.getKey();
                                            Object value11111111111111111112 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key11111111111111111112);
                                            C5052.m8574(c2100, enumC1497, i23, value11111111111111111112);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 11:
                                            if (value instanceof C0533) {
                                                size2 = ((C0533) value).size();
                                                iM40412 = C2100.m4049(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                iM40412 = C2100.m4049(size2);
                                            }
                                            iM40411 = size2 + iM40412;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key11111111111111111113 = entry.getKey();
                                            Object value11111111111111111113 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key11111111111111111113);
                                            C5052.m8574(c2100, enumC1497, i23, value11111111111111111113);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 12:
                                            iM40411 = C2100.m4049(((Integer) value).intValue());
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key11111111111111111114 = entry.getKey();
                                            Object value11111111111111111114 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key11111111111111111114);
                                            C5052.m8574(c2100, enumC1497, i23, value11111111111111111114);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 13:
                                            iM40411 = C2100.m4048(((Integer) value).intValue());
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key11111111111111111115 = entry.getKey();
                                            Object value11111111111111111115 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key11111111111111111115);
                                            C5052.m8574(c2100, enumC1497, i23, value11111111111111111115);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iM40411 = 4;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key11111111111111111116 = entry.getKey();
                                            Object value11111111111111111116 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key11111111111111111116);
                                            C5052.m8574(c2100, enumC1497, i23, value11111111111111111116);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iM40411 = 8;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key11111111111111111117 = entry.getKey();
                                            Object value11111111111111111117 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key11111111111111111117);
                                            C5052.m8574(c2100, enumC1497, i23, value11111111111111111117);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 16:
                                            int iIntValue11 = ((Integer) value).intValue();
                                            iM40411 = C2100.m4049((iIntValue11 >> 31) ^ (iIntValue11 << 1));
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key11111111111111111118 = entry.getKey();
                                            Object value11111111111111111118 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key11111111111111111118);
                                            C5052.m8574(c2100, enumC1497, i23, value11111111111111111118);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 17:
                                            long jLongValue11 = ((Long) value).longValue();
                                            iM40411 = C2100.m4048((jLongValue11 << i) ^ (jLongValue11 >> 63));
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key11111111111111111119 = entry.getKey();
                                            Object value11111111111111111119 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key11111111111111111119);
                                            C5052.m8574(c2100, enumC1497, i23, value11111111111111111119);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 11:
                                    if (key instanceof C0533) {
                                        size = ((C0533) key).size();
                                        iM4049 = C2100.m4049(size);
                                    } else {
                                        size = ((byte[]) key).length;
                                        iM4049 = C2100.m4049(size);
                                    }
                                    iM4048 = size + iM4049;
                                    i5 = iM4048 + iM40413;
                                    iM4047 = C2100.m4047(i23);
                                    if (enumC1497 == c5329) {
                                        iM4047 *= 2;
                                    }
                                    switch (enumC1497.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iM40411 = 8;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key111111111111111111110 = entry.getKey();
                                            Object value111111111111111111110 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key111111111111111111110);
                                            C5052.m8574(c2100, enumC1497, i23, value111111111111111111110);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iM40411 = 4;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key111111111111111111111 = entry.getKey();
                                            Object value111111111111111111111 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key111111111111111111111);
                                            C5052.m8574(c2100, enumC1497, i23, value111111111111111111111);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                                            iM40411 = C2100.m4048(((Long) value).longValue());
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key111111111111111111112 = entry.getKey();
                                            Object value111111111111111111112 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key111111111111111111112);
                                            C5052.m8574(c2100, enumC1497, i23, value111111111111111111112);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                                            iM40411 = C2100.m4048(((Long) value).longValue());
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key111111111111111111113 = entry.getKey();
                                            Object value111111111111111111113 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key111111111111111111113);
                                            C5052.m8574(c2100, enumC1497, i23, value111111111111111111113);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case C4261.LONG_FIELD_NUMBER /* 4 */:
                                            iM40411 = C2100.m4048(((Integer) value).intValue());
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key111111111111111111114 = entry.getKey();
                                            Object value111111111111111111114 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key111111111111111111114);
                                            C5052.m8574(c2100, enumC1497, i23, value111111111111111111114);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case C4261.STRING_FIELD_NUMBER /* 5 */:
                                            ((Long) value).getClass();
                                            iM40411 = 8;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key111111111111111111115 = entry.getKey();
                                            Object value111111111111111111115 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key111111111111111111115);
                                            C5052.m8574(c2100, enumC1497, i23, value111111111111111111115);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                                            ((Integer) value).getClass();
                                            iM40411 = 4;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key111111111111111111116 = entry.getKey();
                                            Object value111111111111111111116 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key111111111111111111116);
                                            C5052.m8574(c2100, enumC1497, i23, value111111111111111111116);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                                            ((Boolean) value).getClass();
                                            iM40411 = i;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key111111111111111111117 = entry.getKey();
                                            Object value111111111111111111117 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key111111111111111111117);
                                            C5052.m8574(c2100, enumC1497, i23, value111111111111111111117);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 8:
                                            if (value instanceof C0533) {
                                                size2 = ((C0533) value).size();
                                                iM40412 = C2100.m4049(size2);
                                                iM40411 = size2 + iM40412;
                                            } else {
                                                iM40411 = C2100.m4050((String) value);
                                            }
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key111111111111111111118 = entry.getKey();
                                            Object value111111111111111111118 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key111111111111111111118);
                                            C5052.m8574(c2100, enumC1497, i23, value111111111111111111118);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 9:
                                            iM40411 = ((AbstractC0318) ((AbstractC0066) value)).mo677(null);
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key111111111111111111119 = entry.getKey();
                                            Object value111111111111111111119 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key111111111111111111119);
                                            C5052.m8574(c2100, enumC1497, i23, value111111111111111111119);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 10:
                                            size2 = ((AbstractC0318) ((AbstractC0066) value)).mo677(null);
                                            iM40412 = C2100.m4049(size2);
                                            iM40411 = size2 + iM40412;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key1111111111111111111110 = entry.getKey();
                                            Object value1111111111111111111110 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key1111111111111111111110);
                                            C5052.m8574(c2100, enumC1497, i23, value1111111111111111111110);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 11:
                                            if (value instanceof C0533) {
                                                size2 = ((C0533) value).size();
                                                iM40412 = C2100.m4049(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                iM40412 = C2100.m4049(size2);
                                            }
                                            iM40411 = size2 + iM40412;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key1111111111111111111111 = entry.getKey();
                                            Object value1111111111111111111111 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key1111111111111111111111);
                                            C5052.m8574(c2100, enumC1497, i23, value1111111111111111111111);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 12:
                                            iM40411 = C2100.m4049(((Integer) value).intValue());
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key1111111111111111111112 = entry.getKey();
                                            Object value1111111111111111111112 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key1111111111111111111112);
                                            C5052.m8574(c2100, enumC1497, i23, value1111111111111111111112);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 13:
                                            iM40411 = C2100.m4048(((Integer) value).intValue());
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key1111111111111111111113 = entry.getKey();
                                            Object value1111111111111111111113 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key1111111111111111111113);
                                            C5052.m8574(c2100, enumC1497, i23, value1111111111111111111113);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iM40411 = 4;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key1111111111111111111114 = entry.getKey();
                                            Object value1111111111111111111114 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key1111111111111111111114);
                                            C5052.m8574(c2100, enumC1497, i23, value1111111111111111111114);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iM40411 = 8;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key1111111111111111111115 = entry.getKey();
                                            Object value1111111111111111111115 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key1111111111111111111115);
                                            C5052.m8574(c2100, enumC1497, i23, value1111111111111111111115);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 16:
                                            int iIntValue12 = ((Integer) value).intValue();
                                            iM40411 = C2100.m4049((iIntValue12 >> 31) ^ (iIntValue12 << 1));
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key1111111111111111111116 = entry.getKey();
                                            Object value1111111111111111111116 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key1111111111111111111116);
                                            C5052.m8574(c2100, enumC1497, i23, value1111111111111111111116);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 17:
                                            long jLongValue12 = ((Long) value).longValue();
                                            iM40411 = C2100.m4048((jLongValue12 << i) ^ (jLongValue12 >> 63));
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key1111111111111111111117 = entry.getKey();
                                            Object value1111111111111111111117 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key1111111111111111111117);
                                            C5052.m8574(c2100, enumC1497, i23, value1111111111111111111117);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 12:
                                    iM4048 = C2100.m4049(((Integer) key).intValue());
                                    i5 = iM4048 + iM40413;
                                    iM4047 = C2100.m4047(i23);
                                    if (enumC1497 == c5329) {
                                        iM4047 *= 2;
                                    }
                                    switch (enumC1497.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iM40411 = 8;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key1111111111111111111118 = entry.getKey();
                                            Object value1111111111111111111118 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key1111111111111111111118);
                                            C5052.m8574(c2100, enumC1497, i23, value1111111111111111111118);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iM40411 = 4;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key1111111111111111111119 = entry.getKey();
                                            Object value1111111111111111111119 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key1111111111111111111119);
                                            C5052.m8574(c2100, enumC1497, i23, value1111111111111111111119);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                                            iM40411 = C2100.m4048(((Long) value).longValue());
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key11111111111111111111110 = entry.getKey();
                                            Object value11111111111111111111110 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key11111111111111111111110);
                                            C5052.m8574(c2100, enumC1497, i23, value11111111111111111111110);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                                            iM40411 = C2100.m4048(((Long) value).longValue());
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key11111111111111111111111 = entry.getKey();
                                            Object value11111111111111111111111 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key11111111111111111111111);
                                            C5052.m8574(c2100, enumC1497, i23, value11111111111111111111111);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case C4261.LONG_FIELD_NUMBER /* 4 */:
                                            iM40411 = C2100.m4048(((Integer) value).intValue());
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key11111111111111111111112 = entry.getKey();
                                            Object value11111111111111111111112 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key11111111111111111111112);
                                            C5052.m8574(c2100, enumC1497, i23, value11111111111111111111112);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case C4261.STRING_FIELD_NUMBER /* 5 */:
                                            ((Long) value).getClass();
                                            iM40411 = 8;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key11111111111111111111113 = entry.getKey();
                                            Object value11111111111111111111113 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key11111111111111111111113);
                                            C5052.m8574(c2100, enumC1497, i23, value11111111111111111111113);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                                            ((Integer) value).getClass();
                                            iM40411 = 4;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key11111111111111111111114 = entry.getKey();
                                            Object value11111111111111111111114 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key11111111111111111111114);
                                            C5052.m8574(c2100, enumC1497, i23, value11111111111111111111114);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                                            ((Boolean) value).getClass();
                                            iM40411 = i;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key11111111111111111111115 = entry.getKey();
                                            Object value11111111111111111111115 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key11111111111111111111115);
                                            C5052.m8574(c2100, enumC1497, i23, value11111111111111111111115);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 8:
                                            if (value instanceof C0533) {
                                                size2 = ((C0533) value).size();
                                                iM40412 = C2100.m4049(size2);
                                                iM40411 = size2 + iM40412;
                                            } else {
                                                iM40411 = C2100.m4050((String) value);
                                            }
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key11111111111111111111116 = entry.getKey();
                                            Object value11111111111111111111116 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key11111111111111111111116);
                                            C5052.m8574(c2100, enumC1497, i23, value11111111111111111111116);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 9:
                                            iM40411 = ((AbstractC0318) ((AbstractC0066) value)).mo677(null);
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key11111111111111111111117 = entry.getKey();
                                            Object value11111111111111111111117 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key11111111111111111111117);
                                            C5052.m8574(c2100, enumC1497, i23, value11111111111111111111117);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 10:
                                            size2 = ((AbstractC0318) ((AbstractC0066) value)).mo677(null);
                                            iM40412 = C2100.m4049(size2);
                                            iM40411 = size2 + iM40412;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key11111111111111111111118 = entry.getKey();
                                            Object value11111111111111111111118 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key11111111111111111111118);
                                            C5052.m8574(c2100, enumC1497, i23, value11111111111111111111118);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 11:
                                            if (value instanceof C0533) {
                                                size2 = ((C0533) value).size();
                                                iM40412 = C2100.m4049(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                iM40412 = C2100.m4049(size2);
                                            }
                                            iM40411 = size2 + iM40412;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key11111111111111111111119 = entry.getKey();
                                            Object value11111111111111111111119 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key11111111111111111111119);
                                            C5052.m8574(c2100, enumC1497, i23, value11111111111111111111119);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 12:
                                            iM40411 = C2100.m4049(((Integer) value).intValue());
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key111111111111111111111110 = entry.getKey();
                                            Object value111111111111111111111110 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key111111111111111111111110);
                                            C5052.m8574(c2100, enumC1497, i23, value111111111111111111111110);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 13:
                                            iM40411 = C2100.m4048(((Integer) value).intValue());
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key111111111111111111111111 = entry.getKey();
                                            Object value111111111111111111111111 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key111111111111111111111111);
                                            C5052.m8574(c2100, enumC1497, i23, value111111111111111111111111);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iM40411 = 4;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key111111111111111111111112 = entry.getKey();
                                            Object value111111111111111111111112 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key111111111111111111111112);
                                            C5052.m8574(c2100, enumC1497, i23, value111111111111111111111112);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iM40411 = 8;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key111111111111111111111113 = entry.getKey();
                                            Object value111111111111111111111113 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key111111111111111111111113);
                                            C5052.m8574(c2100, enumC1497, i23, value111111111111111111111113);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 16:
                                            int iIntValue13 = ((Integer) value).intValue();
                                            iM40411 = C2100.m4049((iIntValue13 >> 31) ^ (iIntValue13 << 1));
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key111111111111111111111114 = entry.getKey();
                                            Object value111111111111111111111114 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key111111111111111111111114);
                                            C5052.m8574(c2100, enumC1497, i23, value111111111111111111111114);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 17:
                                            long jLongValue13 = ((Long) value).longValue();
                                            iM40411 = C2100.m4048((jLongValue13 << i) ^ (jLongValue13 >> 63));
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key111111111111111111111115 = entry.getKey();
                                            Object value111111111111111111111115 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key111111111111111111111115);
                                            C5052.m8574(c2100, enumC1497, i23, value111111111111111111111115);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 13:
                                    iM4048 = C2100.m4048(((Integer) key).intValue());
                                    i5 = iM4048 + iM40413;
                                    iM4047 = C2100.m4047(i23);
                                    if (enumC1497 == c5329) {
                                        iM4047 *= 2;
                                    }
                                    switch (enumC1497.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iM40411 = 8;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key111111111111111111111116 = entry.getKey();
                                            Object value111111111111111111111116 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key111111111111111111111116);
                                            C5052.m8574(c2100, enumC1497, i23, value111111111111111111111116);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iM40411 = 4;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key111111111111111111111117 = entry.getKey();
                                            Object value111111111111111111111117 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key111111111111111111111117);
                                            C5052.m8574(c2100, enumC1497, i23, value111111111111111111111117);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                                            iM40411 = C2100.m4048(((Long) value).longValue());
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key111111111111111111111118 = entry.getKey();
                                            Object value111111111111111111111118 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key111111111111111111111118);
                                            C5052.m8574(c2100, enumC1497, i23, value111111111111111111111118);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                                            iM40411 = C2100.m4048(((Long) value).longValue());
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key111111111111111111111119 = entry.getKey();
                                            Object value111111111111111111111119 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key111111111111111111111119);
                                            C5052.m8574(c2100, enumC1497, i23, value111111111111111111111119);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case C4261.LONG_FIELD_NUMBER /* 4 */:
                                            iM40411 = C2100.m4048(((Integer) value).intValue());
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key1111111111111111111111110 = entry.getKey();
                                            Object value1111111111111111111111110 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key1111111111111111111111110);
                                            C5052.m8574(c2100, enumC1497, i23, value1111111111111111111111110);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case C4261.STRING_FIELD_NUMBER /* 5 */:
                                            ((Long) value).getClass();
                                            iM40411 = 8;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key1111111111111111111111111 = entry.getKey();
                                            Object value1111111111111111111111111 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key1111111111111111111111111);
                                            C5052.m8574(c2100, enumC1497, i23, value1111111111111111111111111);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                                            ((Integer) value).getClass();
                                            iM40411 = 4;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key1111111111111111111111112 = entry.getKey();
                                            Object value1111111111111111111111112 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key1111111111111111111111112);
                                            C5052.m8574(c2100, enumC1497, i23, value1111111111111111111111112);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                                            ((Boolean) value).getClass();
                                            iM40411 = i;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key1111111111111111111111113 = entry.getKey();
                                            Object value1111111111111111111111113 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key1111111111111111111111113);
                                            C5052.m8574(c2100, enumC1497, i23, value1111111111111111111111113);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 8:
                                            if (value instanceof C0533) {
                                                size2 = ((C0533) value).size();
                                                iM40412 = C2100.m4049(size2);
                                                iM40411 = size2 + iM40412;
                                            } else {
                                                iM40411 = C2100.m4050((String) value);
                                            }
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key1111111111111111111111114 = entry.getKey();
                                            Object value1111111111111111111111114 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key1111111111111111111111114);
                                            C5052.m8574(c2100, enumC1497, i23, value1111111111111111111111114);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 9:
                                            iM40411 = ((AbstractC0318) ((AbstractC0066) value)).mo677(null);
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key1111111111111111111111115 = entry.getKey();
                                            Object value1111111111111111111111115 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key1111111111111111111111115);
                                            C5052.m8574(c2100, enumC1497, i23, value1111111111111111111111115);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 10:
                                            size2 = ((AbstractC0318) ((AbstractC0066) value)).mo677(null);
                                            iM40412 = C2100.m4049(size2);
                                            iM40411 = size2 + iM40412;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key1111111111111111111111116 = entry.getKey();
                                            Object value1111111111111111111111116 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key1111111111111111111111116);
                                            C5052.m8574(c2100, enumC1497, i23, value1111111111111111111111116);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 11:
                                            if (value instanceof C0533) {
                                                size2 = ((C0533) value).size();
                                                iM40412 = C2100.m4049(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                iM40412 = C2100.m4049(size2);
                                            }
                                            iM40411 = size2 + iM40412;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key1111111111111111111111117 = entry.getKey();
                                            Object value1111111111111111111111117 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key1111111111111111111111117);
                                            C5052.m8574(c2100, enumC1497, i23, value1111111111111111111111117);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 12:
                                            iM40411 = C2100.m4049(((Integer) value).intValue());
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key1111111111111111111111118 = entry.getKey();
                                            Object value1111111111111111111111118 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key1111111111111111111111118);
                                            C5052.m8574(c2100, enumC1497, i23, value1111111111111111111111118);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 13:
                                            iM40411 = C2100.m4048(((Integer) value).intValue());
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key1111111111111111111111119 = entry.getKey();
                                            Object value1111111111111111111111119 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key1111111111111111111111119);
                                            C5052.m8574(c2100, enumC1497, i23, value1111111111111111111111119);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iM40411 = 4;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key11111111111111111111111110 = entry.getKey();
                                            Object value11111111111111111111111110 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key11111111111111111111111110);
                                            C5052.m8574(c2100, enumC1497, i23, value11111111111111111111111110);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iM40411 = 8;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key11111111111111111111111111 = entry.getKey();
                                            Object value11111111111111111111111111 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key11111111111111111111111111);
                                            C5052.m8574(c2100, enumC1497, i23, value11111111111111111111111111);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 16:
                                            int iIntValue14 = ((Integer) value).intValue();
                                            iM40411 = C2100.m4049((iIntValue14 >> 31) ^ (iIntValue14 << 1));
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key11111111111111111111111112 = entry.getKey();
                                            Object value11111111111111111111111112 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key11111111111111111111111112);
                                            C5052.m8574(c2100, enumC1497, i23, value11111111111111111111111112);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 17:
                                            long jLongValue14 = ((Long) value).longValue();
                                            iM40411 = C2100.m4048((jLongValue14 << i) ^ (jLongValue14 >> 63));
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key11111111111111111111111113 = entry.getKey();
                                            Object value11111111111111111111111113 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key11111111111111111111111113);
                                            C5052.m8574(c2100, enumC1497, i23, value11111111111111111111111113);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 14:
                                    ((Integer) key).getClass();
                                    iM4048 = 4;
                                    i5 = iM4048 + iM40413;
                                    iM4047 = C2100.m4047(i23);
                                    if (enumC1497 == c5329) {
                                        iM4047 *= 2;
                                    }
                                    switch (enumC1497.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iM40411 = 8;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key11111111111111111111111114 = entry.getKey();
                                            Object value11111111111111111111111114 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key11111111111111111111111114);
                                            C5052.m8574(c2100, enumC1497, i23, value11111111111111111111111114);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iM40411 = 4;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key11111111111111111111111115 = entry.getKey();
                                            Object value11111111111111111111111115 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key11111111111111111111111115);
                                            C5052.m8574(c2100, enumC1497, i23, value11111111111111111111111115);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                                            iM40411 = C2100.m4048(((Long) value).longValue());
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key11111111111111111111111116 = entry.getKey();
                                            Object value11111111111111111111111116 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key11111111111111111111111116);
                                            C5052.m8574(c2100, enumC1497, i23, value11111111111111111111111116);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                                            iM40411 = C2100.m4048(((Long) value).longValue());
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key11111111111111111111111117 = entry.getKey();
                                            Object value11111111111111111111111117 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key11111111111111111111111117);
                                            C5052.m8574(c2100, enumC1497, i23, value11111111111111111111111117);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case C4261.LONG_FIELD_NUMBER /* 4 */:
                                            iM40411 = C2100.m4048(((Integer) value).intValue());
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key11111111111111111111111118 = entry.getKey();
                                            Object value11111111111111111111111118 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key11111111111111111111111118);
                                            C5052.m8574(c2100, enumC1497, i23, value11111111111111111111111118);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case C4261.STRING_FIELD_NUMBER /* 5 */:
                                            ((Long) value).getClass();
                                            iM40411 = 8;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key11111111111111111111111119 = entry.getKey();
                                            Object value11111111111111111111111119 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key11111111111111111111111119);
                                            C5052.m8574(c2100, enumC1497, i23, value11111111111111111111111119);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                                            ((Integer) value).getClass();
                                            iM40411 = 4;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key111111111111111111111111110 = entry.getKey();
                                            Object value111111111111111111111111110 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key111111111111111111111111110);
                                            C5052.m8574(c2100, enumC1497, i23, value111111111111111111111111110);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                                            ((Boolean) value).getClass();
                                            iM40411 = i;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key111111111111111111111111111 = entry.getKey();
                                            Object value111111111111111111111111111 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key111111111111111111111111111);
                                            C5052.m8574(c2100, enumC1497, i23, value111111111111111111111111111);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 8:
                                            if (value instanceof C0533) {
                                                size2 = ((C0533) value).size();
                                                iM40412 = C2100.m4049(size2);
                                                iM40411 = size2 + iM40412;
                                            } else {
                                                iM40411 = C2100.m4050((String) value);
                                            }
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key111111111111111111111111112 = entry.getKey();
                                            Object value111111111111111111111111112 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key111111111111111111111111112);
                                            C5052.m8574(c2100, enumC1497, i23, value111111111111111111111111112);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 9:
                                            iM40411 = ((AbstractC0318) ((AbstractC0066) value)).mo677(null);
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key111111111111111111111111113 = entry.getKey();
                                            Object value111111111111111111111111113 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key111111111111111111111111113);
                                            C5052.m8574(c2100, enumC1497, i23, value111111111111111111111111113);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 10:
                                            size2 = ((AbstractC0318) ((AbstractC0066) value)).mo677(null);
                                            iM40412 = C2100.m4049(size2);
                                            iM40411 = size2 + iM40412;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key111111111111111111111111114 = entry.getKey();
                                            Object value111111111111111111111111114 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key111111111111111111111111114);
                                            C5052.m8574(c2100, enumC1497, i23, value111111111111111111111111114);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 11:
                                            if (value instanceof C0533) {
                                                size2 = ((C0533) value).size();
                                                iM40412 = C2100.m4049(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                iM40412 = C2100.m4049(size2);
                                            }
                                            iM40411 = size2 + iM40412;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key111111111111111111111111115 = entry.getKey();
                                            Object value111111111111111111111111115 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key111111111111111111111111115);
                                            C5052.m8574(c2100, enumC1497, i23, value111111111111111111111111115);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 12:
                                            iM40411 = C2100.m4049(((Integer) value).intValue());
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key111111111111111111111111116 = entry.getKey();
                                            Object value111111111111111111111111116 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key111111111111111111111111116);
                                            C5052.m8574(c2100, enumC1497, i23, value111111111111111111111111116);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 13:
                                            iM40411 = C2100.m4048(((Integer) value).intValue());
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key111111111111111111111111117 = entry.getKey();
                                            Object value111111111111111111111111117 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key111111111111111111111111117);
                                            C5052.m8574(c2100, enumC1497, i23, value111111111111111111111111117);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iM40411 = 4;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key111111111111111111111111118 = entry.getKey();
                                            Object value111111111111111111111111118 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key111111111111111111111111118);
                                            C5052.m8574(c2100, enumC1497, i23, value111111111111111111111111118);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iM40411 = 8;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key111111111111111111111111119 = entry.getKey();
                                            Object value111111111111111111111111119 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key111111111111111111111111119);
                                            C5052.m8574(c2100, enumC1497, i23, value111111111111111111111111119);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 16:
                                            int iIntValue15 = ((Integer) value).intValue();
                                            iM40411 = C2100.m4049((iIntValue15 >> 31) ^ (iIntValue15 << 1));
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key1111111111111111111111111110 = entry.getKey();
                                            Object value1111111111111111111111111110 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key1111111111111111111111111110);
                                            C5052.m8574(c2100, enumC1497, i23, value1111111111111111111111111110);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 17:
                                            long jLongValue15 = ((Long) value).longValue();
                                            iM40411 = C2100.m4048((jLongValue15 << i) ^ (jLongValue15 >> 63));
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key1111111111111111111111111111 = entry.getKey();
                                            Object value1111111111111111111111111111 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key1111111111111111111111111111);
                                            C5052.m8574(c2100, enumC1497, i23, value1111111111111111111111111111);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 15:
                                    ((Long) key).getClass();
                                    iM4048 = 8;
                                    i5 = iM4048 + iM40413;
                                    iM4047 = C2100.m4047(i23);
                                    if (enumC1497 == c5329) {
                                        iM4047 *= 2;
                                    }
                                    switch (enumC1497.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iM40411 = 8;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key1111111111111111111111111112 = entry.getKey();
                                            Object value1111111111111111111111111112 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key1111111111111111111111111112);
                                            C5052.m8574(c2100, enumC1497, i23, value1111111111111111111111111112);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iM40411 = 4;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key1111111111111111111111111113 = entry.getKey();
                                            Object value1111111111111111111111111113 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key1111111111111111111111111113);
                                            C5052.m8574(c2100, enumC1497, i23, value1111111111111111111111111113);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                                            iM40411 = C2100.m4048(((Long) value).longValue());
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key1111111111111111111111111114 = entry.getKey();
                                            Object value1111111111111111111111111114 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key1111111111111111111111111114);
                                            C5052.m8574(c2100, enumC1497, i23, value1111111111111111111111111114);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                                            iM40411 = C2100.m4048(((Long) value).longValue());
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key1111111111111111111111111115 = entry.getKey();
                                            Object value1111111111111111111111111115 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key1111111111111111111111111115);
                                            C5052.m8574(c2100, enumC1497, i23, value1111111111111111111111111115);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case C4261.LONG_FIELD_NUMBER /* 4 */:
                                            iM40411 = C2100.m4048(((Integer) value).intValue());
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key1111111111111111111111111116 = entry.getKey();
                                            Object value1111111111111111111111111116 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key1111111111111111111111111116);
                                            C5052.m8574(c2100, enumC1497, i23, value1111111111111111111111111116);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case C4261.STRING_FIELD_NUMBER /* 5 */:
                                            ((Long) value).getClass();
                                            iM40411 = 8;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key1111111111111111111111111117 = entry.getKey();
                                            Object value1111111111111111111111111117 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key1111111111111111111111111117);
                                            C5052.m8574(c2100, enumC1497, i23, value1111111111111111111111111117);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                                            ((Integer) value).getClass();
                                            iM40411 = 4;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key1111111111111111111111111118 = entry.getKey();
                                            Object value1111111111111111111111111118 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key1111111111111111111111111118);
                                            C5052.m8574(c2100, enumC1497, i23, value1111111111111111111111111118);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                                            ((Boolean) value).getClass();
                                            iM40411 = i;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key1111111111111111111111111119 = entry.getKey();
                                            Object value1111111111111111111111111119 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key1111111111111111111111111119);
                                            C5052.m8574(c2100, enumC1497, i23, value1111111111111111111111111119);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 8:
                                            if (value instanceof C0533) {
                                                size2 = ((C0533) value).size();
                                                iM40412 = C2100.m4049(size2);
                                                iM40411 = size2 + iM40412;
                                            } else {
                                                iM40411 = C2100.m4050((String) value);
                                            }
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key11111111111111111111111111110 = entry.getKey();
                                            Object value11111111111111111111111111110 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key11111111111111111111111111110);
                                            C5052.m8574(c2100, enumC1497, i23, value11111111111111111111111111110);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 9:
                                            iM40411 = ((AbstractC0318) ((AbstractC0066) value)).mo677(null);
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key11111111111111111111111111111 = entry.getKey();
                                            Object value11111111111111111111111111111 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key11111111111111111111111111111);
                                            C5052.m8574(c2100, enumC1497, i23, value11111111111111111111111111111);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 10:
                                            size2 = ((AbstractC0318) ((AbstractC0066) value)).mo677(null);
                                            iM40412 = C2100.m4049(size2);
                                            iM40411 = size2 + iM40412;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key11111111111111111111111111112 = entry.getKey();
                                            Object value11111111111111111111111111112 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key11111111111111111111111111112);
                                            C5052.m8574(c2100, enumC1497, i23, value11111111111111111111111111112);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 11:
                                            if (value instanceof C0533) {
                                                size2 = ((C0533) value).size();
                                                iM40412 = C2100.m4049(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                iM40412 = C2100.m4049(size2);
                                            }
                                            iM40411 = size2 + iM40412;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key11111111111111111111111111113 = entry.getKey();
                                            Object value11111111111111111111111111113 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key11111111111111111111111111113);
                                            C5052.m8574(c2100, enumC1497, i23, value11111111111111111111111111113);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 12:
                                            iM40411 = C2100.m4049(((Integer) value).intValue());
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key11111111111111111111111111114 = entry.getKey();
                                            Object value11111111111111111111111111114 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key11111111111111111111111111114);
                                            C5052.m8574(c2100, enumC1497, i23, value11111111111111111111111111114);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 13:
                                            iM40411 = C2100.m4048(((Integer) value).intValue());
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key11111111111111111111111111115 = entry.getKey();
                                            Object value11111111111111111111111111115 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key11111111111111111111111111115);
                                            C5052.m8574(c2100, enumC1497, i23, value11111111111111111111111111115);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iM40411 = 4;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key11111111111111111111111111116 = entry.getKey();
                                            Object value11111111111111111111111111116 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key11111111111111111111111111116);
                                            C5052.m8574(c2100, enumC1497, i23, value11111111111111111111111111116);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iM40411 = 8;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key11111111111111111111111111117 = entry.getKey();
                                            Object value11111111111111111111111111117 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key11111111111111111111111111117);
                                            C5052.m8574(c2100, enumC1497, i23, value11111111111111111111111111117);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 16:
                                            int iIntValue16 = ((Integer) value).intValue();
                                            iM40411 = C2100.m4049((iIntValue16 >> 31) ^ (iIntValue16 << 1));
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key11111111111111111111111111118 = entry.getKey();
                                            Object value11111111111111111111111111118 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key11111111111111111111111111118);
                                            C5052.m8574(c2100, enumC1497, i23, value11111111111111111111111111118);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 17:
                                            long jLongValue16 = ((Long) value).longValue();
                                            iM40411 = C2100.m4048((jLongValue16 << i) ^ (jLongValue16 >> 63));
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key11111111111111111111111111119 = entry.getKey();
                                            Object value11111111111111111111111111119 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key11111111111111111111111111119);
                                            C5052.m8574(c2100, enumC1497, i23, value11111111111111111111111111119);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 16:
                                    int iIntValue17 = ((Integer) key).intValue();
                                    iM40410 = C2100.m4049((iIntValue17 << 1) ^ (iIntValue17 >> 31));
                                    iM4048 = iM40410;
                                    i5 = iM4048 + iM40413;
                                    iM4047 = C2100.m4047(i23);
                                    if (enumC1497 == c5329) {
                                        iM4047 *= 2;
                                    }
                                    switch (enumC1497.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iM40411 = 8;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key111111111111111111111111111110 = entry.getKey();
                                            Object value111111111111111111111111111110 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key111111111111111111111111111110);
                                            C5052.m8574(c2100, enumC1497, i23, value111111111111111111111111111110);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iM40411 = 4;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key111111111111111111111111111111 = entry.getKey();
                                            Object value111111111111111111111111111111 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key111111111111111111111111111111);
                                            C5052.m8574(c2100, enumC1497, i23, value111111111111111111111111111111);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                                            iM40411 = C2100.m4048(((Long) value).longValue());
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key111111111111111111111111111112 = entry.getKey();
                                            Object value111111111111111111111111111112 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key111111111111111111111111111112);
                                            C5052.m8574(c2100, enumC1497, i23, value111111111111111111111111111112);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                                            iM40411 = C2100.m4048(((Long) value).longValue());
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key111111111111111111111111111113 = entry.getKey();
                                            Object value111111111111111111111111111113 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key111111111111111111111111111113);
                                            C5052.m8574(c2100, enumC1497, i23, value111111111111111111111111111113);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case C4261.LONG_FIELD_NUMBER /* 4 */:
                                            iM40411 = C2100.m4048(((Integer) value).intValue());
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key111111111111111111111111111114 = entry.getKey();
                                            Object value111111111111111111111111111114 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key111111111111111111111111111114);
                                            C5052.m8574(c2100, enumC1497, i23, value111111111111111111111111111114);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case C4261.STRING_FIELD_NUMBER /* 5 */:
                                            ((Long) value).getClass();
                                            iM40411 = 8;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key111111111111111111111111111115 = entry.getKey();
                                            Object value111111111111111111111111111115 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key111111111111111111111111111115);
                                            C5052.m8574(c2100, enumC1497, i23, value111111111111111111111111111115);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                                            ((Integer) value).getClass();
                                            iM40411 = 4;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key111111111111111111111111111116 = entry.getKey();
                                            Object value111111111111111111111111111116 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key111111111111111111111111111116);
                                            C5052.m8574(c2100, enumC1497, i23, value111111111111111111111111111116);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                                            ((Boolean) value).getClass();
                                            iM40411 = i;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key111111111111111111111111111117 = entry.getKey();
                                            Object value111111111111111111111111111117 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key111111111111111111111111111117);
                                            C5052.m8574(c2100, enumC1497, i23, value111111111111111111111111111117);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 8:
                                            if (value instanceof C0533) {
                                                size2 = ((C0533) value).size();
                                                iM40412 = C2100.m4049(size2);
                                                iM40411 = size2 + iM40412;
                                            } else {
                                                iM40411 = C2100.m4050((String) value);
                                            }
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key111111111111111111111111111118 = entry.getKey();
                                            Object value111111111111111111111111111118 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key111111111111111111111111111118);
                                            C5052.m8574(c2100, enumC1497, i23, value111111111111111111111111111118);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 9:
                                            iM40411 = ((AbstractC0318) ((AbstractC0066) value)).mo677(null);
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key111111111111111111111111111119 = entry.getKey();
                                            Object value111111111111111111111111111119 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key111111111111111111111111111119);
                                            C5052.m8574(c2100, enumC1497, i23, value111111111111111111111111111119);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 10:
                                            size2 = ((AbstractC0318) ((AbstractC0066) value)).mo677(null);
                                            iM40412 = C2100.m4049(size2);
                                            iM40411 = size2 + iM40412;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key1111111111111111111111111111110 = entry.getKey();
                                            Object value1111111111111111111111111111110 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key1111111111111111111111111111110);
                                            C5052.m8574(c2100, enumC1497, i23, value1111111111111111111111111111110);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 11:
                                            if (value instanceof C0533) {
                                                size2 = ((C0533) value).size();
                                                iM40412 = C2100.m4049(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                iM40412 = C2100.m4049(size2);
                                            }
                                            iM40411 = size2 + iM40412;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key1111111111111111111111111111111 = entry.getKey();
                                            Object value1111111111111111111111111111111 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key1111111111111111111111111111111);
                                            C5052.m8574(c2100, enumC1497, i23, value1111111111111111111111111111111);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 12:
                                            iM40411 = C2100.m4049(((Integer) value).intValue());
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key1111111111111111111111111111112 = entry.getKey();
                                            Object value1111111111111111111111111111112 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key1111111111111111111111111111112);
                                            C5052.m8574(c2100, enumC1497, i23, value1111111111111111111111111111112);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 13:
                                            iM40411 = C2100.m4048(((Integer) value).intValue());
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key1111111111111111111111111111113 = entry.getKey();
                                            Object value1111111111111111111111111111113 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key1111111111111111111111111111113);
                                            C5052.m8574(c2100, enumC1497, i23, value1111111111111111111111111111113);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iM40411 = 4;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key1111111111111111111111111111114 = entry.getKey();
                                            Object value1111111111111111111111111111114 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key1111111111111111111111111111114);
                                            C5052.m8574(c2100, enumC1497, i23, value1111111111111111111111111111114);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iM40411 = 8;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key1111111111111111111111111111115 = entry.getKey();
                                            Object value1111111111111111111111111111115 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key1111111111111111111111111111115);
                                            C5052.m8574(c2100, enumC1497, i23, value1111111111111111111111111111115);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 16:
                                            int iIntValue18 = ((Integer) value).intValue();
                                            iM40411 = C2100.m4049((iIntValue18 >> 31) ^ (iIntValue18 << 1));
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key1111111111111111111111111111116 = entry.getKey();
                                            Object value1111111111111111111111111111116 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key1111111111111111111111111111116);
                                            C5052.m8574(c2100, enumC1497, i23, value1111111111111111111111111111116);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 17:
                                            long jLongValue17 = ((Long) value).longValue();
                                            iM40411 = C2100.m4048((jLongValue17 << i) ^ (jLongValue17 >> 63));
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key1111111111111111111111111111117 = entry.getKey();
                                            Object value1111111111111111111111111111117 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key1111111111111111111111111111117);
                                            C5052.m8574(c2100, enumC1497, i23, value1111111111111111111111111111117);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 17:
                                    long jLongValue18 = ((Long) key).longValue();
                                    iM40410 = C2100.m4048((jLongValue18 << i) ^ (jLongValue18 >> 63));
                                    iM4048 = iM40410;
                                    i5 = iM4048 + iM40413;
                                    iM4047 = C2100.m4047(i23);
                                    if (enumC1497 == c5329) {
                                        iM4047 *= 2;
                                    }
                                    switch (enumC1497.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iM40411 = 8;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key1111111111111111111111111111118 = entry.getKey();
                                            Object value1111111111111111111111111111118 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key1111111111111111111111111111118);
                                            C5052.m8574(c2100, enumC1497, i23, value1111111111111111111111111111118);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iM40411 = 4;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key1111111111111111111111111111119 = entry.getKey();
                                            Object value1111111111111111111111111111119 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key1111111111111111111111111111119);
                                            C5052.m8574(c2100, enumC1497, i23, value1111111111111111111111111111119);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                                            iM40411 = C2100.m4048(((Long) value).longValue());
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key11111111111111111111111111111110 = entry.getKey();
                                            Object value11111111111111111111111111111110 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key11111111111111111111111111111110);
                                            C5052.m8574(c2100, enumC1497, i23, value11111111111111111111111111111110);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                                            iM40411 = C2100.m4048(((Long) value).longValue());
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key11111111111111111111111111111111 = entry.getKey();
                                            Object value11111111111111111111111111111111 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key11111111111111111111111111111111);
                                            C5052.m8574(c2100, enumC1497, i23, value11111111111111111111111111111111);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case C4261.LONG_FIELD_NUMBER /* 4 */:
                                            iM40411 = C2100.m4048(((Integer) value).intValue());
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key11111111111111111111111111111112 = entry.getKey();
                                            Object value11111111111111111111111111111112 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key11111111111111111111111111111112);
                                            C5052.m8574(c2100, enumC1497, i23, value11111111111111111111111111111112);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case C4261.STRING_FIELD_NUMBER /* 5 */:
                                            ((Long) value).getClass();
                                            iM40411 = 8;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key11111111111111111111111111111113 = entry.getKey();
                                            Object value11111111111111111111111111111113 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key11111111111111111111111111111113);
                                            C5052.m8574(c2100, enumC1497, i23, value11111111111111111111111111111113);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                                            ((Integer) value).getClass();
                                            iM40411 = 4;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key11111111111111111111111111111114 = entry.getKey();
                                            Object value11111111111111111111111111111114 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key11111111111111111111111111111114);
                                            C5052.m8574(c2100, enumC1497, i23, value11111111111111111111111111111114);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                                            ((Boolean) value).getClass();
                                            iM40411 = i;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key11111111111111111111111111111115 = entry.getKey();
                                            Object value11111111111111111111111111111115 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key11111111111111111111111111111115);
                                            C5052.m8574(c2100, enumC1497, i23, value11111111111111111111111111111115);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 8:
                                            if (value instanceof C0533) {
                                                size2 = ((C0533) value).size();
                                                iM40412 = C2100.m4049(size2);
                                                iM40411 = size2 + iM40412;
                                            } else {
                                                iM40411 = C2100.m4050((String) value);
                                            }
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key11111111111111111111111111111116 = entry.getKey();
                                            Object value11111111111111111111111111111116 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key11111111111111111111111111111116);
                                            C5052.m8574(c2100, enumC1497, i23, value11111111111111111111111111111116);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 9:
                                            iM40411 = ((AbstractC0318) ((AbstractC0066) value)).mo677(null);
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key11111111111111111111111111111117 = entry.getKey();
                                            Object value11111111111111111111111111111117 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key11111111111111111111111111111117);
                                            C5052.m8574(c2100, enumC1497, i23, value11111111111111111111111111111117);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 10:
                                            size2 = ((AbstractC0318) ((AbstractC0066) value)).mo677(null);
                                            iM40412 = C2100.m4049(size2);
                                            iM40411 = size2 + iM40412;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key11111111111111111111111111111118 = entry.getKey();
                                            Object value11111111111111111111111111111118 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key11111111111111111111111111111118);
                                            C5052.m8574(c2100, enumC1497, i23, value11111111111111111111111111111118);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 11:
                                            if (value instanceof C0533) {
                                                size2 = ((C0533) value).size();
                                                iM40412 = C2100.m4049(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                iM40412 = C2100.m4049(size2);
                                            }
                                            iM40411 = size2 + iM40412;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key11111111111111111111111111111119 = entry.getKey();
                                            Object value11111111111111111111111111111119 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key11111111111111111111111111111119);
                                            C5052.m8574(c2100, enumC1497, i23, value11111111111111111111111111111119);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 12:
                                            iM40411 = C2100.m4049(((Integer) value).intValue());
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key111111111111111111111111111111110 = entry.getKey();
                                            Object value111111111111111111111111111111110 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key111111111111111111111111111111110);
                                            C5052.m8574(c2100, enumC1497, i23, value111111111111111111111111111111110);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 13:
                                            iM40411 = C2100.m4048(((Integer) value).intValue());
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key111111111111111111111111111111111 = entry.getKey();
                                            Object value111111111111111111111111111111111 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key111111111111111111111111111111111);
                                            C5052.m8574(c2100, enumC1497, i23, value111111111111111111111111111111111);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iM40411 = 4;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key111111111111111111111111111111112 = entry.getKey();
                                            Object value111111111111111111111111111111112 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key111111111111111111111111111111112);
                                            C5052.m8574(c2100, enumC1497, i23, value111111111111111111111111111111112);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iM40411 = 8;
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key111111111111111111111111111111113 = entry.getKey();
                                            Object value111111111111111111111111111111113 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key111111111111111111111111111111113);
                                            C5052.m8574(c2100, enumC1497, i23, value111111111111111111111111111111113);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 16:
                                            int iIntValue19 = ((Integer) value).intValue();
                                            iM40411 = C2100.m4049((iIntValue19 >> 31) ^ (iIntValue19 << 1));
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key111111111111111111111111111111114 = entry.getKey();
                                            Object value111111111111111111111111111111114 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key111111111111111111111111111111114);
                                            C5052.m8574(c2100, enumC1497, i23, value111111111111111111111111111111114);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        case 17:
                                            long jLongValue19 = ((Long) value).longValue();
                                            iM40411 = C2100.m4048((jLongValue19 << i) ^ (jLongValue19 >> 63));
                                            c2100.m4072(iM40411 + iM4047 + i5);
                                            Object key111111111111111111111111111111115 = entry.getKey();
                                            Object value111111111111111111111111111111115 = entry.getValue();
                                            C5052.m8574(c2100, enumC1498, i, key111111111111111111111111111111115);
                                            C5052.m8574(c2100, enumC1497, i23, value111111111111111111111111111111115);
                                            i22 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            it = it2;
                                            i = 1;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                default:
                                    throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                            }
                        }
                    }
                    i3 = i7;
                    i4 = i9;
                    c5087 = c5086;
                    i7 = i3;
                    i9 = i4;
                    i8 += 3;
                    c5088 = c5087;
                    i6 = 1048575;
                    break;
                case 51:
                    if (c2687.m5005(i10, i8, obj)) {
                        c2100.m4060(Double.doubleToRawLongBits(((Double) AbstractC1194.m2515(j, obj)).doubleValue()), i10);
                    }
                    c5087 = c5088;
                    i8 += 3;
                    c5088 = c5087;
                    i6 = 1048575;
                    break;
                case 52:
                    if (c2687.m5005(i10, i8, obj)) {
                        c2100.m4058(i10, Float.floatToRawIntBits(((Float) AbstractC1194.m2515(j, obj)).floatValue()));
                    }
                    c5087 = c5088;
                    i8 += 3;
                    c5088 = c5087;
                    i6 = 1048575;
                    break;
                case 53:
                    if (c2687.m5005(i10, i8, obj)) {
                        c2100.m4059(m4995(j, obj), i10);
                    }
                    c5087 = c5088;
                    i8 += 3;
                    c5088 = c5087;
                    i6 = 1048575;
                    break;
                case 54:
                    if (c2687.m5005(i10, i8, obj)) {
                        c2100.m4059(m4995(j, obj), i10);
                    }
                    c5087 = c5088;
                    i8 += 3;
                    c5088 = c5087;
                    i6 = 1048575;
                    break;
                case 55:
                    if (c2687.m5005(i10, i8, obj)) {
                        c2100.m4075(i10, m4996(j, obj));
                    }
                    c5087 = c5088;
                    i8 += 3;
                    c5088 = c5087;
                    i6 = 1048575;
                    break;
                case 56:
                    if (c2687.m5005(i10, i8, obj)) {
                        c2100.m4060(m4995(j, obj), i10);
                    }
                    c5087 = c5088;
                    i8 += 3;
                    c5088 = c5087;
                    i6 = 1048575;
                    break;
                case 57:
                    if (c2687.m5005(i10, i8, obj)) {
                        c2100.m4058(i10, m4996(j, obj));
                    }
                    c5087 = c5088;
                    i8 += 3;
                    c5088 = c5087;
                    i6 = 1048575;
                    break;
                case 58:
                    if (c2687.m5005(i10, i8, obj)) {
                        c2100.m4077(i10, ((Boolean) AbstractC1194.m2515(j, obj)).booleanValue());
                    }
                    c5087 = c5088;
                    i8 += 3;
                    c5088 = c5087;
                    i6 = 1048575;
                    break;
                case 59:
                    if (c2687.m5005(i10, i8, obj)) {
                        Object object3 = unsafe.getObject(obj, j);
                        if (object3 instanceof String) {
                            c2100.m4052(i10, (String) object3);
                        } else {
                            c2100.m4076(i10, (C0533) object3);
                        }
                    }
                    c5087 = c5088;
                    i8 += 3;
                    c5088 = c5087;
                    i6 = 1048575;
                    break;
                case 60:
                    if (c2687.m5005(i10, i8, obj)) {
                        c2100.m4061(i10, (AbstractC0066) unsafe.getObject(obj, j), c2687.m5014(i8));
                    }
                    c5087 = c5088;
                    i8 += 3;
                    c5088 = c5087;
                    i6 = 1048575;
                    break;
                case 61:
                    if (c2687.m5005(i10, i8, obj)) {
                        c2100.m4076(i10, (C0533) unsafe.getObject(obj, j));
                    }
                    c5087 = c5088;
                    i8 += 3;
                    c5088 = c5087;
                    i6 = 1048575;
                    break;
                case 62:
                    if (c2687.m5005(i10, i8, obj)) {
                        c2100.m4054(i10, m4996(j, obj));
                    }
                    c5087 = c5088;
                    i8 += 3;
                    c5088 = c5087;
                    i6 = 1048575;
                    break;
                case 63:
                    if (c2687.m5005(i10, i8, obj)) {
                        c2100.m4075(i10, m4996(j, obj));
                    }
                    c5087 = c5088;
                    i8 += 3;
                    c5088 = c5087;
                    i6 = 1048575;
                    break;
                case 64:
                    if (c2687.m5005(i10, i8, obj)) {
                        c2100.m4058(i10, m4996(j, obj));
                    }
                    c5087 = c5088;
                    i8 += 3;
                    c5088 = c5087;
                    i6 = 1048575;
                    break;
                case 65:
                    if (c2687.m5005(i10, i8, obj)) {
                        c2100.m4060(m4995(j, obj), i10);
                    }
                    c5087 = c5088;
                    i8 += 3;
                    c5088 = c5087;
                    i6 = 1048575;
                    break;
                case 66:
                    if (c2687.m5005(i10, i8, obj)) {
                        int iM4996 = m4996(j, obj);
                        c2100.m4054(i10, (iM4996 >> 31) ^ (iM4996 << 1));
                    }
                    c5087 = c5088;
                    i8 += 3;
                    c5088 = c5087;
                    i6 = 1048575;
                    break;
                case 67:
                    if (c2687.m5005(i10, i8, obj)) {
                        long jM4995 = m4995(j, obj);
                        c2100.m4059((jM4995 << i) ^ (jM4995 >> 63), i10);
                    }
                    c5087 = c5088;
                    i8 += 3;
                    c5088 = c5087;
                    i6 = 1048575;
                    break;
                case 68:
                    if (c2687.m5005(i10, i8, obj)) {
                        c5088.m8696(i10, unsafe.getObject(obj, j), c2687.m5014(i8));
                    }
                    c5087 = c5088;
                    i8 += 3;
                    c5088 = c5087;
                    i6 = 1048575;
                    break;
                default:
                    c5087 = c5088;
                    i8 += 3;
                    c5088 = c5087;
                    i6 = 1048575;
                    break;
            }
        }
        c2687.f8922.getClass();
        ((AbstractC0318) obj).unknownFields.m9527(c5088);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003b  */
    @Override // p000.InterfaceC1622
    /* JADX INFO: renamed from: ۥۜ */
    public final boolean mo3390(AbstractC0318 abstractC0318, AbstractC0318 abstractC0319) {
        int[] iArr = this.f8920;
        int length = iArr.length;
        int i = 0;
        while (true) {
            boolean zM1131 = true;
            if (i < length) {
                int iM5011 = m5011(i);
                long j = iM5011 & 1048575;
                switch (m4999(iM5011)) {
                    case 0:
                        if (!m5015(abstractC0318, abstractC0319, i)) {
                            zM1131 = false;
                        } else {
                            AbstractC5716 abstractC5716 = AbstractC1194.f4116;
                            if (Double.doubleToLongBits(abstractC5716.mo2642(j, abstractC0318)) != Double.doubleToLongBits(abstractC5716.mo2642(j, abstractC0319))) {
                                zM1131 = false;
                            }
                        }
                        break;
                    case 1:
                        if (!m5015(abstractC0318, abstractC0319, i)) {
                            zM1131 = false;
                        } else {
                            AbstractC5716 abstractC5717 = AbstractC1194.f4116;
                            if (Float.floatToIntBits(abstractC5717.mo2639(j, abstractC0318)) != Float.floatToIntBits(abstractC5717.mo2639(j, abstractC0319))) {
                                zM1131 = false;
                            }
                        }
                        break;
                    case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                        if (!m5015(abstractC0318, abstractC0319, i) || AbstractC1194.m2523(j, abstractC0318) != AbstractC1194.m2523(j, abstractC0319)) {
                            zM1131 = false;
                        }
                        break;
                    case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                        if (!m5015(abstractC0318, abstractC0319, i) || AbstractC1194.m2523(j, abstractC0318) != AbstractC1194.m2523(j, abstractC0319)) {
                            zM1131 = false;
                        }
                        break;
                    case C4261.LONG_FIELD_NUMBER /* 4 */:
                        if (!m5015(abstractC0318, abstractC0319, i) || AbstractC1194.m2513(j, abstractC0318) != AbstractC1194.m2513(j, abstractC0319)) {
                            zM1131 = false;
                        }
                        break;
                    case C4261.STRING_FIELD_NUMBER /* 5 */:
                        if (!m5015(abstractC0318, abstractC0319, i) || AbstractC1194.m2523(j, abstractC0318) != AbstractC1194.m2523(j, abstractC0319)) {
                            zM1131 = false;
                        }
                        break;
                    case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                        if (!m5015(abstractC0318, abstractC0319, i) || AbstractC1194.m2513(j, abstractC0318) != AbstractC1194.m2513(j, abstractC0319)) {
                            zM1131 = false;
                        }
                        break;
                    case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                        if (!m5015(abstractC0318, abstractC0319, i)) {
                            zM1131 = false;
                        } else {
                            AbstractC5716 abstractC5718 = AbstractC1194.f4116;
                            if (abstractC5718.mo2644(j, abstractC0318) != abstractC5718.mo2644(j, abstractC0319)) {
                                zM1131 = false;
                            }
                        }
                        break;
                    case 8:
                        if (!m5015(abstractC0318, abstractC0319, i) || !AbstractC0499.m1131(AbstractC1194.m2515(j, abstractC0318), AbstractC1194.m2515(j, abstractC0319))) {
                            zM1131 = false;
                        }
                        break;
                    case 9:
                        if (!m5015(abstractC0318, abstractC0319, i) || !AbstractC0499.m1131(AbstractC1194.m2515(j, abstractC0318), AbstractC1194.m2515(j, abstractC0319))) {
                            zM1131 = false;
                        }
                        break;
                    case 10:
                        if (!m5015(abstractC0318, abstractC0319, i) || !AbstractC0499.m1131(AbstractC1194.m2515(j, abstractC0318), AbstractC1194.m2515(j, abstractC0319))) {
                            zM1131 = false;
                        }
                        break;
                    case 11:
                        if (!m5015(abstractC0318, abstractC0319, i) || AbstractC1194.m2513(j, abstractC0318) != AbstractC1194.m2513(j, abstractC0319)) {
                            zM1131 = false;
                        }
                        break;
                    case 12:
                        if (!m5015(abstractC0318, abstractC0319, i) || AbstractC1194.m2513(j, abstractC0318) != AbstractC1194.m2513(j, abstractC0319)) {
                            zM1131 = false;
                        }
                        break;
                    case 13:
                        if (!m5015(abstractC0318, abstractC0319, i) || AbstractC1194.m2513(j, abstractC0318) != AbstractC1194.m2513(j, abstractC0319)) {
                            zM1131 = false;
                        }
                        break;
                    case 14:
                        if (!m5015(abstractC0318, abstractC0319, i) || AbstractC1194.m2523(j, abstractC0318) != AbstractC1194.m2523(j, abstractC0319)) {
                            zM1131 = false;
                        }
                        break;
                    case 15:
                        if (!m5015(abstractC0318, abstractC0319, i) || AbstractC1194.m2513(j, abstractC0318) != AbstractC1194.m2513(j, abstractC0319)) {
                            zM1131 = false;
                        }
                        break;
                    case 16:
                        if (!m5015(abstractC0318, abstractC0319, i) || AbstractC1194.m2523(j, abstractC0318) != AbstractC1194.m2523(j, abstractC0319)) {
                            zM1131 = false;
                        }
                        break;
                    case 17:
                        if (!m5015(abstractC0318, abstractC0319, i) || !AbstractC0499.m1131(AbstractC1194.m2515(j, abstractC0318), AbstractC1194.m2515(j, abstractC0319))) {
                            zM1131 = false;
                        }
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        zM1131 = AbstractC0499.m1131(AbstractC1194.m2515(j, abstractC0318), AbstractC1194.m2515(j, abstractC0319));
                        break;
                    case 50:
                        zM1131 = AbstractC0499.m1131(AbstractC1194.m2515(j, abstractC0318), AbstractC1194.m2515(j, abstractC0319));
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                    case 68:
                        long j2 = iArr[i + 2] & 1048575;
                        if (AbstractC1194.m2513(j2, abstractC0318) != AbstractC1194.m2513(j2, abstractC0319) || !AbstractC0499.m1131(AbstractC1194.m2515(j, abstractC0318), AbstractC1194.m2515(j, abstractC0319))) {
                            zM1131 = false;
                        }
                        break;
                }
                if (zM1131) {
                    i += 3;
                }
            } else {
                this.f8922.getClass();
                if (abstractC0318.unknownFields.equals(abstractC0319.unknownFields)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00d7 A[PHI: r3
  0x00d7: PHI (r3v32 int) = (r3v10 int), (r3v33 int) binds: [B:83:0x01f0, B:41:0x00d5] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p000.InterfaceC1622
    /* JADX INFO: renamed from: ۥۣ */
    public final int mo3391(AbstractC0318 abstractC0318) {
        int i;
        int iM6384;
        int i2;
        int[] iArr = this.f8920;
        int length = iArr.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int iM5011 = m5011(i4);
            int i5 = iArr[i4];
            long j = 1048575 & iM5011;
            int i6 = 1237;
            int iHashCode = 37;
            switch (m4999(iM5011)) {
                case 0:
                    i = i3 * 53;
                    iM6384 = AbstractC3576.m6384(Double.doubleToLongBits(AbstractC1194.f4116.mo2642(j, abstractC0318)));
                    i3 = iM6384 + i;
                    break;
                case 1:
                    i = i3 * 53;
                    iM6384 = Float.floatToIntBits(AbstractC1194.f4116.mo2639(j, abstractC0318));
                    i3 = iM6384 + i;
                    break;
                case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                    i = i3 * 53;
                    iM6384 = AbstractC3576.m6384(AbstractC1194.m2523(j, abstractC0318));
                    i3 = iM6384 + i;
                    break;
                case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                    i = i3 * 53;
                    iM6384 = AbstractC3576.m6384(AbstractC1194.m2523(j, abstractC0318));
                    i3 = iM6384 + i;
                    break;
                case C4261.LONG_FIELD_NUMBER /* 4 */:
                    i = i3 * 53;
                    iM6384 = AbstractC1194.m2513(j, abstractC0318);
                    i3 = iM6384 + i;
                    break;
                case C4261.STRING_FIELD_NUMBER /* 5 */:
                    i = i3 * 53;
                    iM6384 = AbstractC3576.m6384(AbstractC1194.m2523(j, abstractC0318));
                    i3 = iM6384 + i;
                    break;
                case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                    i = i3 * 53;
                    iM6384 = AbstractC1194.m2513(j, abstractC0318);
                    i3 = iM6384 + i;
                    break;
                case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                    i2 = i3 * 53;
                    boolean zMo2644 = AbstractC1194.f4116.mo2644(j, abstractC0318);
                    Charset charset = AbstractC3576.f11899;
                    if (zMo2644) {
                        i6 = 1231;
                    }
                    i3 = i6 + i2;
                    break;
                case 8:
                    i = i3 * 53;
                    iM6384 = ((String) AbstractC1194.m2515(j, abstractC0318)).hashCode();
                    i3 = iM6384 + i;
                    break;
                case 9:
                    Object objM2515 = AbstractC1194.m2515(j, abstractC0318);
                    if (objM2515 != null) {
                        iHashCode = objM2515.hashCode();
                    }
                    i3 = (i3 * 53) + iHashCode;
                    break;
                case 10:
                    i = i3 * 53;
                    iM6384 = AbstractC1194.m2515(j, abstractC0318).hashCode();
                    i3 = iM6384 + i;
                    break;
                case 11:
                    i = i3 * 53;
                    iM6384 = AbstractC1194.m2513(j, abstractC0318);
                    i3 = iM6384 + i;
                    break;
                case 12:
                    i = i3 * 53;
                    iM6384 = AbstractC1194.m2513(j, abstractC0318);
                    i3 = iM6384 + i;
                    break;
                case 13:
                    i = i3 * 53;
                    iM6384 = AbstractC1194.m2513(j, abstractC0318);
                    i3 = iM6384 + i;
                    break;
                case 14:
                    i = i3 * 53;
                    iM6384 = AbstractC3576.m6384(AbstractC1194.m2523(j, abstractC0318));
                    i3 = iM6384 + i;
                    break;
                case 15:
                    i = i3 * 53;
                    iM6384 = AbstractC1194.m2513(j, abstractC0318);
                    i3 = iM6384 + i;
                    break;
                case 16:
                    i = i3 * 53;
                    iM6384 = AbstractC3576.m6384(AbstractC1194.m2523(j, abstractC0318));
                    i3 = iM6384 + i;
                    break;
                case 17:
                    Object objM2516 = AbstractC1194.m2515(j, abstractC0318);
                    if (objM2516 != null) {
                        iHashCode = objM2516.hashCode();
                    }
                    i3 = (i3 * 53) + iHashCode;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i = i3 * 53;
                    iM6384 = AbstractC1194.m2515(j, abstractC0318).hashCode();
                    i3 = iM6384 + i;
                    break;
                case 50:
                    i = i3 * 53;
                    iM6384 = AbstractC1194.m2515(j, abstractC0318).hashCode();
                    i3 = iM6384 + i;
                    break;
                case 51:
                    if (m5005(i5, i4, abstractC0318)) {
                        i = i3 * 53;
                        iM6384 = AbstractC3576.m6384(Double.doubleToLongBits(((Double) AbstractC1194.m2515(j, abstractC0318)).doubleValue()));
                        i3 = iM6384 + i;
                    }
                    break;
                case 52:
                    if (m5005(i5, i4, abstractC0318)) {
                        i = i3 * 53;
                        iM6384 = Float.floatToIntBits(((Float) AbstractC1194.m2515(j, abstractC0318)).floatValue());
                        i3 = iM6384 + i;
                    }
                    break;
                case 53:
                    if (m5005(i5, i4, abstractC0318)) {
                        i = i3 * 53;
                        iM6384 = AbstractC3576.m6384(m4995(j, abstractC0318));
                        i3 = iM6384 + i;
                    }
                    break;
                case 54:
                    if (m5005(i5, i4, abstractC0318)) {
                        i = i3 * 53;
                        iM6384 = AbstractC3576.m6384(m4995(j, abstractC0318));
                        i3 = iM6384 + i;
                    }
                    break;
                case 55:
                    if (m5005(i5, i4, abstractC0318)) {
                        i = i3 * 53;
                        iM6384 = m4996(j, abstractC0318);
                        i3 = iM6384 + i;
                    }
                    break;
                case 56:
                    if (m5005(i5, i4, abstractC0318)) {
                        i = i3 * 53;
                        iM6384 = AbstractC3576.m6384(m4995(j, abstractC0318));
                        i3 = iM6384 + i;
                    }
                    break;
                case 57:
                    if (m5005(i5, i4, abstractC0318)) {
                        i = i3 * 53;
                        iM6384 = m4996(j, abstractC0318);
                        i3 = iM6384 + i;
                    }
                    break;
                case 58:
                    if (m5005(i5, i4, abstractC0318)) {
                        i2 = i3 * 53;
                        boolean zBooleanValue = ((Boolean) AbstractC1194.m2515(j, abstractC0318)).booleanValue();
                        Charset charset2 = AbstractC3576.f11899;
                        if (zBooleanValue) {
                            i6 = 1231;
                        }
                        i3 = i6 + i2;
                    }
                    break;
                case 59:
                    if (m5005(i5, i4, abstractC0318)) {
                        i = i3 * 53;
                        iM6384 = ((String) AbstractC1194.m2515(j, abstractC0318)).hashCode();
                        i3 = iM6384 + i;
                    }
                    break;
                case 60:
                    if (m5005(i5, i4, abstractC0318)) {
                        i = i3 * 53;
                        iM6384 = AbstractC1194.m2515(j, abstractC0318).hashCode();
                        i3 = iM6384 + i;
                    }
                    break;
                case 61:
                    if (m5005(i5, i4, abstractC0318)) {
                        i = i3 * 53;
                        iM6384 = AbstractC1194.m2515(j, abstractC0318).hashCode();
                        i3 = iM6384 + i;
                    }
                    break;
                case 62:
                    if (m5005(i5, i4, abstractC0318)) {
                        i = i3 * 53;
                        iM6384 = m4996(j, abstractC0318);
                        i3 = iM6384 + i;
                    }
                    break;
                case 63:
                    if (m5005(i5, i4, abstractC0318)) {
                        i = i3 * 53;
                        iM6384 = m4996(j, abstractC0318);
                        i3 = iM6384 + i;
                    }
                    break;
                case 64:
                    if (m5005(i5, i4, abstractC0318)) {
                        i = i3 * 53;
                        iM6384 = m4996(j, abstractC0318);
                        i3 = iM6384 + i;
                    }
                    break;
                case 65:
                    if (m5005(i5, i4, abstractC0318)) {
                        i = i3 * 53;
                        iM6384 = AbstractC3576.m6384(m4995(j, abstractC0318));
                        i3 = iM6384 + i;
                    }
                    break;
                case 66:
                    if (m5005(i5, i4, abstractC0318)) {
                        i = i3 * 53;
                        iM6384 = m4996(j, abstractC0318);
                        i3 = iM6384 + i;
                    }
                    break;
                case 67:
                    if (m5005(i5, i4, abstractC0318)) {
                        i = i3 * 53;
                        iM6384 = AbstractC3576.m6384(m4995(j, abstractC0318));
                        i3 = iM6384 + i;
                    }
                    break;
                case 68:
                    if (m5005(i5, i4, abstractC0318)) {
                        i = i3 * 53;
                        iM6384 = AbstractC1194.m2515(j, abstractC0318).hashCode();
                        i3 = iM6384 + i;
                    }
                    break;
            }
        }
        this.f8922.getClass();
        return abstractC0318.unknownFields.hashCode() + (i3 * 53);
    }

    /* JADX INFO: renamed from: ۥۧ */
    public final void m5009(Object obj, long j, C4902 c4902, InterfaceC1622 interfaceC1622, C2336 c2336) throws C1423 {
        int iMo5039;
        this.f8926.getClass();
        InterfaceC4997 interfaceC4997M1640 = C0750.m1640(j, obj);
        AbstractC2758 abstractC2758 = (AbstractC2758) c4902.f16167;
        int i = c4902.f16168;
        if ((i & 7) != 3) {
            throw C3406.m6170();
        }
        do {
            AbstractC0318 abstractC0318Mo3393 = interfaceC1622.mo3393();
            c4902.m8289(abstractC0318Mo3393, interfaceC1622, c2336);
            interfaceC1622.mo3387(abstractC0318Mo3393);
            ((C2645) interfaceC4997M1640).add(abstractC0318Mo3393);
            if (abstractC2758.mo5040() || c4902.f16170 != 0) {
                return;
            } else {
                iMo5039 = abstractC2758.mo5039();
            }
        } while (iMo5039 == i);
        c4902.f16170 = iMo5039;
    }

    /* JADX WARN: Code duplicated, block: B:160:0x082a A[Catch: all -> 0x0500, TryCatch #0 {all -> 0x0500, blocks: (B:158:0x0825, B:160:0x082a, B:161:0x082f, B:114:0x04fb, B:117:0x0503, B:118:0x051b, B:119:0x0533, B:120:0x054b, B:121:0x0563, B:122:0x057b, B:123:0x0593, B:124:0x05ab, B:125:0x05c3, B:126:0x05eb, B:127:0x060b, B:128:0x062b, B:129:0x064c, B:130:0x066d, B:131:0x0690, B:132:0x06b0, B:133:0x06c9, B:134:0x06f1, B:135:0x0702, B:136:0x0724, B:137:0x0745, B:138:0x0766, B:139:0x0786, B:140:0x07a6, B:141:0x07c5, B:142:0x07e7, B:148:0x0809), top: B:179:0x0825 }] */
    /* JADX WARN: Code duplicated, block: B:165:0x0839 A[LOOP:2: B:164:0x0837->B:165:0x0839, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:171:0x0850 A[LOOP:3: B:170:0x084e->B:171:0x0850, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:173:0x085a  */
    /* JADX WARN: Code duplicated, block: B:208:0x0835 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:221:? A[RETURN, SYNTHETIC] */
    @Override // p000.InterfaceC1622
    /* JADX INFO: renamed from: ۦؑ */
    public final void mo3392(Object obj, C4902 c4902, C2336 c2336) throws Throwable {
        int[] iArr;
        int i;
        int i2;
        C4902 c4903;
        C2336 c2337;
        int i3;
        C2687 c2687 = this;
        Object obj2 = obj;
        C4902 c4904 = c4902;
        C2336 c2338 = c2336;
        c2338.getClass();
        if (!m5001(obj2)) {
            C0178.m385(obj2, "Mutating immutable message: ");
            return;
        }
        C0841 c0841 = c2687.f8922;
        int[] iArr2 = c2687.f8927;
        int i4 = c2687.f8925;
        int i5 = c2687.f8919;
        C5708 c5708M1754 = null;
        while (true) {
            try {
                int iM8273 = c4904.m8273();
                int iM5002 = c2687.m5002(iM8273);
                if (iM5002 >= 0) {
                    int iM5011 = c2687.m5011(iM5002);
                    try {
                        try {
                            int iM4999 = m4999(iM5011);
                            Unsafe unsafe = f8914;
                            C0750 c0750 = c2687.f8926;
                            switch (iM4999) {
                                case 0:
                                    iArr = iArr2;
                                    i2 = i4;
                                    c2687 = c2687;
                                    c4903 = c4904;
                                    c2337 = c2338;
                                    long jM5000 = m5000(iM5011);
                                    c4903.m8271(1);
                                    try {
                                        try {
                                            AbstractC1194.f4116.mo2641(obj, jM5000, ((AbstractC2758) c4903.f16167).mo5057());
                                            obj2 = obj;
                                            c2687.m5012(iM5002, obj2);
                                        } catch (C1423 unused) {
                                            obj2 = obj;
                                            try {
                                                c0841.getClass();
                                                if (c5708M1754 == null) {
                                                    c5708M1754 = C0841.m1754(obj2);
                                                }
                                                if (!C0841.m1753(0, c4903, c5708M1754)) {
                                                    i3 = i2;
                                                    while (i5 < i3) {
                                                        c2687.m5018(iArr[i5], obj2, c5708M1754);
                                                        i5++;
                                                    }
                                                    if (c5708M1754 == null) {
                                                        return;
                                                    }
                                                    ((AbstractC0318) obj2).unknownFields = c5708M1754;
                                                }
                                            } catch (Throwable th) {
                                                th = th;
                                                i = i2;
                                                while (i5 < i) {
                                                    c2687.m5018(iArr[i5], obj2, c5708M1754);
                                                    i5++;
                                                }
                                                if (c5708M1754 != null) {
                                                    c0841.getClass();
                                                    ((AbstractC0318) obj2).unknownFields = c5708M1754;
                                                }
                                                throw th;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            obj2 = obj;
                                            i = i2;
                                            while (i5 < i) {
                                                c2687.m5018(iArr[i5], obj2, c5708M1754);
                                                i5++;
                                            }
                                            if (c5708M1754 != null) {
                                                c0841.getClass();
                                                ((AbstractC0318) obj2).unknownFields = c5708M1754;
                                            }
                                            throw th;
                                        }
                                    } catch (C1423 unused2) {
                                        obj2 = obj;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        obj2 = obj;
                                    }
                                    c4904 = c4903;
                                    c2338 = c2337;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    c2687 = c2687;
                                    break;
                                case 1:
                                    iArr = iArr2;
                                    i2 = i4;
                                    c2687 = c2687;
                                    c4903 = c4904;
                                    c2337 = c2338;
                                    long jM5001 = m5000(iM5011);
                                    c4903.m8271(5);
                                    AbstractC1194.f4116.mo2647(obj2, jM5001, ((AbstractC2758) c4903.f16167).mo5043());
                                    c2687.m5012(iM5002, obj2);
                                    c4904 = c4903;
                                    c2338 = c2337;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    c2687 = c2687;
                                    break;
                                case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                                    iArr = iArr2;
                                    i2 = i4;
                                    c2687 = c2687;
                                    c4903 = c4904;
                                    c2337 = c2338;
                                    long jM5002 = m5000(iM5011);
                                    c4903.m8271(0);
                                    AbstractC1194.m2524(obj2, jM5002, ((AbstractC2758) c4903.f16167).mo5042());
                                    c2687.m5012(iM5002, obj2);
                                    c4904 = c4903;
                                    c2338 = c2337;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    c2687 = c2687;
                                    break;
                                case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                                    iArr = iArr2;
                                    i2 = i4;
                                    c2687 = c2687;
                                    c4903 = c4904;
                                    c2337 = c2338;
                                    long jM5003 = m5000(iM5011);
                                    c4903.m8271(0);
                                    AbstractC1194.m2524(obj2, jM5003, ((AbstractC2758) c4903.f16167).mo5052());
                                    c2687.m5012(iM5002, obj2);
                                    c4904 = c4903;
                                    c2338 = c2337;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    c2687 = c2687;
                                    break;
                                case C4261.LONG_FIELD_NUMBER /* 4 */:
                                    iArr = iArr2;
                                    i2 = i4;
                                    c2687 = c2687;
                                    c4903 = c4904;
                                    c2337 = c2338;
                                    long jM5004 = m5000(iM5011);
                                    c4903.m8271(0);
                                    AbstractC1194.m2519(((AbstractC2758) c4903.f16167).mo5044(), jM5004, obj2);
                                    c2687.m5012(iM5002, obj2);
                                    c4904 = c4903;
                                    c2338 = c2337;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    c2687 = c2687;
                                    break;
                                case C4261.STRING_FIELD_NUMBER /* 5 */:
                                    iArr = iArr2;
                                    i2 = i4;
                                    c2687 = c2687;
                                    c4903 = c4904;
                                    c2337 = c2338;
                                    long jM5005 = m5000(iM5011);
                                    c4903.m8271(1);
                                    AbstractC1194.m2524(obj2, jM5005, ((AbstractC2758) c4903.f16167).mo5067());
                                    c2687.m5012(iM5002, obj2);
                                    c4904 = c4903;
                                    c2338 = c2337;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    c2687 = c2687;
                                    break;
                                case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                                    iArr = iArr2;
                                    i2 = i4;
                                    c2687 = c2687;
                                    c4903 = c4904;
                                    c2337 = c2338;
                                    long jM5006 = m5000(iM5011);
                                    c4903.m8271(5);
                                    AbstractC1194.m2519(((AbstractC2758) c4903.f16167).mo5068(), jM5006, obj2);
                                    c2687.m5012(iM5002, obj2);
                                    c4904 = c4903;
                                    c2338 = c2337;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    c2687 = c2687;
                                    break;
                                case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                                    iArr = iArr2;
                                    i2 = i4;
                                    c2687 = c2687;
                                    c4903 = c4904;
                                    c2337 = c2338;
                                    long jM5007 = m5000(iM5011);
                                    c4903.m8271(0);
                                    AbstractC1194.f4116.mo2645(obj2, jM5007, ((AbstractC2758) c4903.f16167).mo5064());
                                    c2687.m5012(iM5002, obj2);
                                    c4904 = c4903;
                                    c2338 = c2337;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    c2687 = c2687;
                                    break;
                                case 8:
                                    iArr = iArr2;
                                    i2 = i4;
                                    c2687 = c2687;
                                    c4903 = c4904;
                                    c2337 = c2338;
                                    c2687.m5017(iM5011, c4903, obj2);
                                    c2687.m5012(iM5002, obj2);
                                    c4904 = c4903;
                                    c2338 = c2337;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    c2687 = c2687;
                                    break;
                                case 9:
                                    c2687 = c2687;
                                    iArr = iArr2;
                                    i2 = i4;
                                    c4903 = c4904;
                                    c2337 = c2338;
                                    AbstractC0066 abstractC0066 = (AbstractC0066) c2687.m5016(iM5002, obj2);
                                    InterfaceC1622 interfaceC1622M5014 = c2687.m5014(iM5002);
                                    c4903.m8271(2);
                                    c4903.m8265(abstractC0066, interfaceC1622M5014, c2337);
                                    unsafe.putObject(obj2, c2687.m5011(iM5002) & 1048575, abstractC0066);
                                    c2687.m5012(iM5002, obj2);
                                    c4904 = c4903;
                                    c2338 = c2337;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    c2687 = c2687;
                                    break;
                                case 10:
                                    iArr = iArr2;
                                    i2 = i4;
                                    c2687 = c2687;
                                    c4903 = c4904;
                                    c2337 = c2338;
                                    AbstractC1194.m2525(m5000(iM5011), obj2, c4903.m8282());
                                    c2687.m5012(iM5002, obj2);
                                    c4904 = c4903;
                                    c2338 = c2337;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    c2687 = c2687;
                                    break;
                                case 11:
                                    iArr = iArr2;
                                    i2 = i4;
                                    c2687 = c2687;
                                    c4903 = c4904;
                                    c2337 = c2338;
                                    long jM5008 = m5000(iM5011);
                                    c4903.m8271(0);
                                    AbstractC1194.m2519(((AbstractC2758) c4903.f16167).mo5038(), jM5008, obj2);
                                    c2687.m5012(iM5002, obj2);
                                    c4904 = c4903;
                                    c2338 = c2337;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    c2687 = c2687;
                                    break;
                                case 12:
                                    iArr = iArr2;
                                    i2 = i4;
                                    c2687 = c2687;
                                    c4903 = c4904;
                                    c2337 = c2338;
                                    c4903.m8271(0);
                                    int iMo5065 = ((AbstractC2758) c4903.f16167).mo5065();
                                    c2687.m5013(iM5002);
                                    AbstractC1194.m2519(iMo5065, m5000(iM5011), obj2);
                                    c2687.m5012(iM5002, obj2);
                                    c4904 = c4903;
                                    c2338 = c2337;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    c2687 = c2687;
                                    break;
                                case 13:
                                    iArr = iArr2;
                                    i2 = i4;
                                    c2687 = c2687;
                                    c4903 = c4904;
                                    c2337 = c2338;
                                    long jM5009 = m5000(iM5011);
                                    c4903.m8271(5);
                                    AbstractC1194.m2519(((AbstractC2758) c4903.f16167).mo5045(), jM5009, obj2);
                                    c2687.m5012(iM5002, obj2);
                                    c4904 = c4903;
                                    c2338 = c2337;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    c2687 = c2687;
                                    break;
                                case 14:
                                    iArr = iArr2;
                                    i2 = i4;
                                    c2687 = c2687;
                                    c4903 = c4904;
                                    c2337 = c2338;
                                    long jM50010 = m5000(iM5011);
                                    c4903.m8271(1);
                                    AbstractC1194.m2524(obj2, jM50010, ((AbstractC2758) c4903.f16167).mo5062());
                                    c2687.m5012(iM5002, obj2);
                                    c4904 = c4903;
                                    c2338 = c2337;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    c2687 = c2687;
                                    break;
                                case 15:
                                    iArr = iArr2;
                                    i2 = i4;
                                    c2687 = c2687;
                                    c4903 = c4904;
                                    c2337 = c2338;
                                    long jM50011 = m5000(iM5011);
                                    c4903.m8271(0);
                                    AbstractC1194.m2519(((AbstractC2758) c4903.f16167).mo5066(), jM50011, obj2);
                                    c2687.m5012(iM5002, obj2);
                                    c4904 = c4903;
                                    c2338 = c2337;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    c2687 = c2687;
                                    break;
                                case 16:
                                    iArr = iArr2;
                                    i2 = i4;
                                    c2687 = c2687;
                                    c4903 = c4904;
                                    c2337 = c2338;
                                    long jM50012 = m5000(iM5011);
                                    c4903.m8271(0);
                                    AbstractC1194.m2524(obj2, jM50012, ((AbstractC2758) c4903.f16167).mo5047());
                                    c2687.m5012(iM5002, obj2);
                                    c4904 = c4903;
                                    c2338 = c2337;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    c2687 = c2687;
                                    break;
                                case 17:
                                    c2687 = c2687;
                                    iArr = iArr2;
                                    i2 = i4;
                                    c4903 = c4904;
                                    c2337 = c2338;
                                    AbstractC0066 abstractC0067 = (AbstractC0066) c2687.m5016(iM5002, obj2);
                                    InterfaceC1622 interfaceC1622M5015 = c2687.m5014(iM5002);
                                    c4903.m8271(3);
                                    c4903.m8289(abstractC0067, interfaceC1622M5015, c2337);
                                    unsafe.putObject(obj2, c2687.m5011(iM5002) & 1048575, abstractC0067);
                                    c2687.m5012(iM5002, obj2);
                                    c4904 = c4903;
                                    c2338 = c2337;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    c2687 = c2687;
                                    break;
                                case 18:
                                    iArr = iArr2;
                                    i2 = i4;
                                    c2687 = c2687;
                                    c4903 = c4904;
                                    c2337 = c2338;
                                    long jM50013 = m5000(iM5011);
                                    c0750.getClass();
                                    c4903.m8279(C0750.m1640(jM50013, obj2));
                                    c4904 = c4903;
                                    c2338 = c2337;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    c2687 = c2687;
                                    break;
                                case 19:
                                    iArr = iArr2;
                                    i2 = i4;
                                    c2687 = c2687;
                                    c4903 = c4904;
                                    c2337 = c2338;
                                    long jM50014 = m5000(iM5011);
                                    c0750.getClass();
                                    c4903.m8253(C0750.m1640(jM50014, obj2));
                                    c4904 = c4903;
                                    c2338 = c2337;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    c2687 = c2687;
                                    break;
                                case 20:
                                    iArr = iArr2;
                                    i2 = i4;
                                    c2687 = c2687;
                                    c4903 = c4904;
                                    c2337 = c2338;
                                    long jM50015 = m5000(iM5011);
                                    c0750.getClass();
                                    c4903.m8249(C0750.m1640(jM50015, obj2));
                                    c4904 = c4903;
                                    c2338 = c2337;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    c2687 = c2687;
                                    break;
                                case 21:
                                    iArr = iArr2;
                                    i2 = i4;
                                    c2687 = c2687;
                                    c4903 = c4904;
                                    c2337 = c2338;
                                    long jM50016 = m5000(iM5011);
                                    c0750.getClass();
                                    c4903.m8244(C0750.m1640(jM50016, obj2));
                                    c4904 = c4903;
                                    c2338 = c2337;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    c2687 = c2687;
                                    break;
                                case 22:
                                    iArr = iArr2;
                                    i2 = i4;
                                    c2687 = c2687;
                                    c4903 = c4904;
                                    c2337 = c2338;
                                    long jM50017 = m5000(iM5011);
                                    c0750.getClass();
                                    c4903.m8254(C0750.m1640(jM50017, obj2));
                                    c4904 = c4903;
                                    c2338 = c2337;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    c2687 = c2687;
                                    break;
                                case 23:
                                    iArr = iArr2;
                                    i2 = i4;
                                    c2687 = c2687;
                                    c4903 = c4904;
                                    c2337 = c2338;
                                    long jM50018 = m5000(iM5011);
                                    c0750.getClass();
                                    c4903.m8293(C0750.m1640(jM50018, obj2));
                                    c4904 = c4903;
                                    c2338 = c2337;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    c2687 = c2687;
                                    break;
                                case 24:
                                    iArr = iArr2;
                                    i2 = i4;
                                    c2687 = c2687;
                                    c4903 = c4904;
                                    c2337 = c2338;
                                    long jM50019 = m5000(iM5011);
                                    c0750.getClass();
                                    c4903.m8296(C0750.m1640(jM50019, obj2));
                                    c4904 = c4903;
                                    c2338 = c2337;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    c2687 = c2687;
                                    break;
                                case 25:
                                    iArr = iArr2;
                                    i2 = i4;
                                    c2687 = c2687;
                                    c4903 = c4904;
                                    c2337 = c2338;
                                    long jM50020 = m5000(iM5011);
                                    c0750.getClass();
                                    c4903.m8287(C0750.m1640(jM50020, obj2));
                                    c4904 = c4903;
                                    c2338 = c2337;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    c2687 = c2687;
                                    break;
                                case 26:
                                    iArr = iArr2;
                                    i2 = i4;
                                    c2687 = c2687;
                                    c4903 = c4904;
                                    c2337 = c2338;
                                    try {
                                        c2687.m5007(iM5011, c4903, obj2);
                                    } catch (C1423 unused3) {
                                        c0841.getClass();
                                        if (c5708M1754 == null) {
                                            c5708M1754 = C0841.m1754(obj2);
                                        }
                                        if (!C0841.m1753(0, c4903, c5708M1754)) {
                                            i3 = i2;
                                            while (i5 < i3) {
                                                c2687.m5018(iArr[i5], obj2, c5708M1754);
                                                i5++;
                                            }
                                            if (c5708M1754 == null) {
                                                return;
                                            }
                                            ((AbstractC0318) obj2).unknownFields = c5708M1754;
                                        }
                                    }
                                    c4904 = c4903;
                                    c2338 = c2337;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    c2687 = c2687;
                                    break;
                                case 27:
                                    iArr = iArr2;
                                    i2 = i4;
                                    try {
                                        c2687.m5003(obj2, iM5011, c4904, c2687.m5014(iM5002), c2336);
                                        c4903 = c4904;
                                        c2337 = c2336;
                                        c2687 = c2687;
                                    } catch (C1423 unused4) {
                                        c4903 = c4904;
                                        c2337 = c2336;
                                        c2687 = c2687;
                                        c0841.getClass();
                                        if (c5708M1754 == null) {
                                            c5708M1754 = C0841.m1754(obj2);
                                        }
                                        if (!C0841.m1753(0, c4903, c5708M1754)) {
                                            i3 = i2;
                                            while (i5 < i3) {
                                                c2687.m5018(iArr[i5], obj2, c5708M1754);
                                                i5++;
                                            }
                                            if (c5708M1754 == null) {
                                                return;
                                            }
                                            ((AbstractC0318) obj2).unknownFields = c5708M1754;
                                        }
                                    }
                                    c4904 = c4903;
                                    c2338 = c2337;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    c2687 = c2687;
                                    break;
                                case 28:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jM50021 = m5000(iM5011);
                                    c0750.getClass();
                                    c4904.m8288(C0750.m1640(jM50021, obj2));
                                    c2337 = c2336;
                                    c2687 = c2687;
                                    c4903 = c4904;
                                    c4904 = c4903;
                                    c2338 = c2337;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    c2687 = c2687;
                                    break;
                                case 29:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jM50022 = m5000(iM5011);
                                    c0750.getClass();
                                    c4904.m8258(C0750.m1640(jM50022, obj2));
                                    c2337 = c2336;
                                    c2687 = c2687;
                                    c4903 = c4904;
                                    c4904 = c4903;
                                    c2338 = c2337;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    c2687 = c2687;
                                    break;
                                case 30:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jM50023 = m5000(iM5011);
                                    c0750.getClass();
                                    InterfaceC4997 interfaceC4997M1640 = C0750.m1640(jM50023, obj2);
                                    c4904.m8280(interfaceC4997M1640);
                                    c2687.m5013(iM5002);
                                    AbstractC0499.m1133(obj2, iM8273, interfaceC4997M1640, c5708M1754, c0841);
                                    c2337 = c2336;
                                    c2687 = c2687;
                                    c4903 = c4904;
                                    c4904 = c4903;
                                    c2338 = c2337;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    c2687 = c2687;
                                    break;
                                case 31:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jM50024 = m5000(iM5011);
                                    c0750.getClass();
                                    c4904.m8256(C0750.m1640(jM50024, obj2));
                                    c2337 = c2336;
                                    c2687 = c2687;
                                    c4903 = c4904;
                                    c4904 = c4903;
                                    c2338 = c2337;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    c2687 = c2687;
                                    break;
                                case 32:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jM50025 = m5000(iM5011);
                                    c0750.getClass();
                                    c4904.m8285(C0750.m1640(jM50025, obj2));
                                    c2337 = c2336;
                                    c2687 = c2687;
                                    c4903 = c4904;
                                    c4904 = c4903;
                                    c2338 = c2337;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    c2687 = c2687;
                                    break;
                                case 33:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jM50026 = m5000(iM5011);
                                    c0750.getClass();
                                    c4904.m8291(C0750.m1640(jM50026, obj2));
                                    c2337 = c2336;
                                    c2687 = c2687;
                                    c4903 = c4904;
                                    c4904 = c4903;
                                    c2338 = c2337;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    c2687 = c2687;
                                    break;
                                case 34:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jM50027 = m5000(iM5011);
                                    c0750.getClass();
                                    c4904.m8261(C0750.m1640(jM50027, obj2));
                                    c2337 = c2336;
                                    c2687 = c2687;
                                    c4903 = c4904;
                                    c4904 = c4903;
                                    c2338 = c2337;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    c2687 = c2687;
                                    break;
                                case 35:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jM50028 = m5000(iM5011);
                                    c0750.getClass();
                                    c4904.m8279(C0750.m1640(jM50028, obj2));
                                    c2337 = c2336;
                                    c2687 = c2687;
                                    c4903 = c4904;
                                    c4904 = c4903;
                                    c2338 = c2337;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    c2687 = c2687;
                                    break;
                                case 36:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jM50029 = m5000(iM5011);
                                    c0750.getClass();
                                    c4904.m8253(C0750.m1640(jM50029, obj2));
                                    c2337 = c2336;
                                    c2687 = c2687;
                                    c4903 = c4904;
                                    c4904 = c4903;
                                    c2338 = c2337;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    c2687 = c2687;
                                    break;
                                case 37:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jM50030 = m5000(iM5011);
                                    c0750.getClass();
                                    c4904.m8249(C0750.m1640(jM50030, obj2));
                                    c2337 = c2336;
                                    c2687 = c2687;
                                    c4903 = c4904;
                                    c4904 = c4903;
                                    c2338 = c2337;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    c2687 = c2687;
                                    break;
                                case 38:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jM50031 = m5000(iM5011);
                                    c0750.getClass();
                                    c4904.m8244(C0750.m1640(jM50031, obj2));
                                    c2337 = c2336;
                                    c2687 = c2687;
                                    c4903 = c4904;
                                    c4904 = c4903;
                                    c2338 = c2337;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    c2687 = c2687;
                                    break;
                                case 39:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jM50032 = m5000(iM5011);
                                    c0750.getClass();
                                    c4904.m8254(C0750.m1640(jM50032, obj2));
                                    c2337 = c2336;
                                    c2687 = c2687;
                                    c4903 = c4904;
                                    c4904 = c4903;
                                    c2338 = c2337;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    c2687 = c2687;
                                    break;
                                case 40:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jM50033 = m5000(iM5011);
                                    c0750.getClass();
                                    c4904.m8293(C0750.m1640(jM50033, obj2));
                                    c2337 = c2336;
                                    c2687 = c2687;
                                    c4903 = c4904;
                                    c4904 = c4903;
                                    c2338 = c2337;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    c2687 = c2687;
                                    break;
                                case 41:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jM50034 = m5000(iM5011);
                                    c0750.getClass();
                                    c4904.m8296(C0750.m1640(jM50034, obj2));
                                    c2337 = c2336;
                                    c2687 = c2687;
                                    c4903 = c4904;
                                    c4904 = c4903;
                                    c2338 = c2337;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    c2687 = c2687;
                                    break;
                                case 42:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jM50035 = m5000(iM5011);
                                    c0750.getClass();
                                    c4904.m8287(C0750.m1640(jM50035, obj2));
                                    c2337 = c2336;
                                    c2687 = c2687;
                                    c4903 = c4904;
                                    c4904 = c4903;
                                    c2338 = c2337;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    c2687 = c2687;
                                    break;
                                case 43:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jM50036 = m5000(iM5011);
                                    c0750.getClass();
                                    c4904.m8258(C0750.m1640(jM50036, obj2));
                                    c2337 = c2336;
                                    c2687 = c2687;
                                    c4903 = c4904;
                                    c4904 = c4903;
                                    c2338 = c2337;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    c2687 = c2687;
                                    break;
                                case 44:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jM50037 = m5000(iM5011);
                                    c0750.getClass();
                                    InterfaceC4997 interfaceC4997M1641 = C0750.m1640(jM50037, obj2);
                                    c4904.m8280(interfaceC4997M1641);
                                    c2687.m5013(iM5002);
                                    AbstractC0499.m1133(obj2, iM8273, interfaceC4997M1641, c5708M1754, c0841);
                                    c2337 = c2336;
                                    c2687 = c2687;
                                    c4903 = c4904;
                                    c4904 = c4903;
                                    c2338 = c2337;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    c2687 = c2687;
                                    break;
                                case 45:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jM50038 = m5000(iM5011);
                                    c0750.getClass();
                                    c4904.m8256(C0750.m1640(jM50038, obj2));
                                    c2337 = c2336;
                                    c2687 = c2687;
                                    c4903 = c4904;
                                    c4904 = c4903;
                                    c2338 = c2337;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    c2687 = c2687;
                                    break;
                                case 46:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jM50039 = m5000(iM5011);
                                    c0750.getClass();
                                    c4904.m8285(C0750.m1640(jM50039, obj2));
                                    c2337 = c2336;
                                    c2687 = c2687;
                                    c4903 = c4904;
                                    c4904 = c4903;
                                    c2338 = c2337;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    c2687 = c2687;
                                    break;
                                case 47:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jM50040 = m5000(iM5011);
                                    c0750.getClass();
                                    c4904.m8291(C0750.m1640(jM50040, obj2));
                                    c2337 = c2336;
                                    c2687 = c2687;
                                    c4903 = c4904;
                                    c4904 = c4903;
                                    c2338 = c2337;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    c2687 = c2687;
                                    break;
                                case 48:
                                    iArr = iArr2;
                                    i2 = i4;
                                    try {
                                        long jM50041 = m5000(iM5011);
                                        c0750.getClass();
                                        c4904.m8261(C0750.m1640(jM50041, obj2));
                                        c2337 = c2336;
                                        c2687 = c2687;
                                        c4903 = c4904;
                                    } catch (C1423 unused5) {
                                        c2337 = c2336;
                                        c2687 = c2687;
                                        c4903 = c4904;
                                        c0841.getClass();
                                        if (c5708M1754 == null) {
                                            c5708M1754 = C0841.m1754(obj2);
                                        }
                                        if (!C0841.m1753(0, c4903, c5708M1754)) {
                                            i3 = i2;
                                            while (i5 < i3) {
                                                c2687.m5018(iArr[i5], obj2, c5708M1754);
                                                i5++;
                                            }
                                            if (c5708M1754 == null) {
                                                return;
                                            }
                                            ((AbstractC0318) obj2).unknownFields = c5708M1754;
                                        }
                                    }
                                    c4904 = c4903;
                                    c2338 = c2337;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    c2687 = c2687;
                                    break;
                                case 49:
                                    iArr = iArr2;
                                    i2 = i4;
                                    obj2 = obj;
                                    try {
                                        c2687.m5009(obj2, m5000(iM5011), c4902, c2687.m5014(iM5002), c2336);
                                        c4904 = c4902;
                                        c2337 = c2336;
                                        c2687 = c2687;
                                        c4903 = c4904;
                                    } catch (C1423 unused6) {
                                        c2337 = c2336;
                                        c2687 = c2687;
                                        c4903 = c4902;
                                        c0841.getClass();
                                        if (c5708M1754 == null) {
                                            c5708M1754 = C0841.m1754(obj2);
                                        }
                                        if (!C0841.m1753(0, c4903, c5708M1754)) {
                                            i3 = i2;
                                            while (i5 < i3) {
                                                c2687.m5018(iArr[i5], obj2, c5708M1754);
                                                i5++;
                                            }
                                            if (c5708M1754 == null) {
                                                return;
                                            }
                                            ((AbstractC0318) obj2).unknownFields = c5708M1754;
                                        }
                                    }
                                    c4904 = c4903;
                                    c2338 = c2337;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    c2687 = c2687;
                                    break;
                                case 50:
                                    iArr = iArr2;
                                    i2 = i4;
                                    try {
                                        c2687.m5006(obj2, iM5002, c2687.f8918[(iM5002 / 3) * 2], c2338, c4904);
                                        obj2 = obj;
                                        c4903 = c4902;
                                        c2337 = c2336;
                                        c2687 = c2687;
                                    } catch (C1423 unused7) {
                                        obj2 = obj;
                                        c4903 = c4902;
                                        c2337 = c2336;
                                        c2687 = c2687;
                                        c0841.getClass();
                                        if (c5708M1754 == null) {
                                            c5708M1754 = C0841.m1754(obj2);
                                        }
                                        if (!C0841.m1753(0, c4903, c5708M1754)) {
                                            i3 = i2;
                                            while (i5 < i3) {
                                                c2687.m5018(iArr[i5], obj2, c5708M1754);
                                                i5++;
                                            }
                                            if (c5708M1754 == null) {
                                                return;
                                            }
                                            ((AbstractC0318) obj2).unknownFields = c5708M1754;
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        obj2 = obj;
                                        c2687 = c2687;
                                        i = i2;
                                        while (i5 < i) {
                                            c2687.m5018(iArr[i5], obj2, c5708M1754);
                                            i5++;
                                        }
                                        if (c5708M1754 != null) {
                                            c0841.getClass();
                                            ((AbstractC0318) obj2).unknownFields = c5708M1754;
                                        }
                                        throw th;
                                    }
                                    c4904 = c4903;
                                    c2338 = c2337;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    c2687 = c2687;
                                    break;
                                case 51:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jM50042 = m5000(iM5011);
                                    c4904.m8271(1);
                                    AbstractC1194.m2525(jM50042, obj2, Double.valueOf(((AbstractC2758) c4904.f16167).mo5057()));
                                    c2687.m5010(iM8273, iM5002, obj2);
                                    c4903 = c4904;
                                    c2337 = c2338;
                                    c4904 = c4903;
                                    c2338 = c2337;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    c2687 = c2687;
                                    break;
                                case 52:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jM50043 = m5000(iM5011);
                                    c4904.m8271(5);
                                    AbstractC1194.m2525(jM50043, obj2, Float.valueOf(((AbstractC2758) c4904.f16167).mo5043()));
                                    c2687.m5010(iM8273, iM5002, obj2);
                                    c4903 = c4904;
                                    c2337 = c2338;
                                    c4904 = c4903;
                                    c2338 = c2337;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    c2687 = c2687;
                                    break;
                                case 53:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jM50044 = m5000(iM5011);
                                    c4904.m8271(0);
                                    AbstractC1194.m2525(jM50044, obj2, Long.valueOf(((AbstractC2758) c4904.f16167).mo5042()));
                                    c2687.m5010(iM8273, iM5002, obj2);
                                    c4903 = c4904;
                                    c2337 = c2338;
                                    c4904 = c4903;
                                    c2338 = c2337;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    c2687 = c2687;
                                    break;
                                case 54:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jM50045 = m5000(iM5011);
                                    c4904.m8271(0);
                                    AbstractC1194.m2525(jM50045, obj2, Long.valueOf(((AbstractC2758) c4904.f16167).mo5052()));
                                    c2687.m5010(iM8273, iM5002, obj2);
                                    c4903 = c4904;
                                    c2337 = c2338;
                                    c4904 = c4903;
                                    c2338 = c2337;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    c2687 = c2687;
                                    break;
                                case 55:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jM50046 = m5000(iM5011);
                                    c4904.m8271(0);
                                    AbstractC1194.m2525(jM50046, obj2, Integer.valueOf(((AbstractC2758) c4904.f16167).mo5044()));
                                    c2687.m5010(iM8273, iM5002, obj2);
                                    c4903 = c4904;
                                    c2337 = c2338;
                                    c4904 = c4903;
                                    c2338 = c2337;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    c2687 = c2687;
                                    break;
                                case 56:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jM50047 = m5000(iM5011);
                                    c4904.m8271(1);
                                    AbstractC1194.m2525(jM50047, obj2, Long.valueOf(((AbstractC2758) c4904.f16167).mo5067()));
                                    c2687.m5010(iM8273, iM5002, obj2);
                                    c4903 = c4904;
                                    c2337 = c2338;
                                    c4904 = c4903;
                                    c2338 = c2337;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    c2687 = c2687;
                                    break;
                                case 57:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jM50048 = m5000(iM5011);
                                    c4904.m8271(5);
                                    AbstractC1194.m2525(jM50048, obj2, Integer.valueOf(((AbstractC2758) c4904.f16167).mo5068()));
                                    c2687.m5010(iM8273, iM5002, obj2);
                                    c4903 = c4904;
                                    c2337 = c2338;
                                    c4904 = c4903;
                                    c2338 = c2337;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    c2687 = c2687;
                                    break;
                                case 58:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jM50049 = m5000(iM5011);
                                    c4904.m8271(0);
                                    AbstractC1194.m2525(jM50049, obj2, Boolean.valueOf(((AbstractC2758) c4904.f16167).mo5064()));
                                    c2687.m5010(iM8273, iM5002, obj2);
                                    c4903 = c4904;
                                    c2337 = c2338;
                                    c4904 = c4903;
                                    c2338 = c2337;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    c2687 = c2687;
                                    break;
                                case 59:
                                    iArr = iArr2;
                                    i2 = i4;
                                    c2687.m5017(iM5011, c4904, obj2);
                                    c2687.m5010(iM8273, iM5002, obj2);
                                    c4903 = c4904;
                                    c2337 = c2338;
                                    c4904 = c4903;
                                    c2338 = c2337;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    c2687 = c2687;
                                    break;
                                case 60:
                                    iArr = iArr2;
                                    i2 = i4;
                                    AbstractC0066 abstractC0068 = (AbstractC0066) c2687.m5020(iM8273, iM5002, obj2);
                                    InterfaceC1622 interfaceC1622M5016 = c2687.m5014(iM5002);
                                    c4904.m8271(2);
                                    c4904.m8265(abstractC0068, interfaceC1622M5016, c2338);
                                    unsafe.putObject(obj2, c2687.m5011(iM5002) & 1048575, abstractC0068);
                                    c2687.m5010(iM8273, iM5002, obj2);
                                    c4903 = c4904;
                                    c2337 = c2338;
                                    c4904 = c4903;
                                    c2338 = c2337;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    c2687 = c2687;
                                    break;
                                case 61:
                                    iArr = iArr2;
                                    i2 = i4;
                                    AbstractC1194.m2525(m5000(iM5011), obj2, c4904.m8282());
                                    c2687.m5010(iM8273, iM5002, obj2);
                                    c4903 = c4904;
                                    c2337 = c2338;
                                    c4904 = c4903;
                                    c2338 = c2337;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    c2687 = c2687;
                                    break;
                                case 62:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jM50050 = m5000(iM5011);
                                    c4904.m8271(0);
                                    AbstractC1194.m2525(jM50050, obj2, Integer.valueOf(((AbstractC2758) c4904.f16167).mo5038()));
                                    c2687.m5010(iM8273, iM5002, obj2);
                                    c4903 = c4904;
                                    c2337 = c2338;
                                    c4904 = c4903;
                                    c2338 = c2337;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    c2687 = c2687;
                                    break;
                                case 63:
                                    iArr = iArr2;
                                    i2 = i4;
                                    c4904.m8271(0);
                                    int iMo5066 = ((AbstractC2758) c4904.f16167).mo5065();
                                    c2687.m5013(iM5002);
                                    AbstractC1194.m2525(m5000(iM5011), obj2, Integer.valueOf(iMo5066));
                                    c2687.m5010(iM8273, iM5002, obj2);
                                    c4903 = c4904;
                                    c2337 = c2338;
                                    c4904 = c4903;
                                    c2338 = c2337;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    c2687 = c2687;
                                    break;
                                case 64:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jM50051 = m5000(iM5011);
                                    c4904.m8271(5);
                                    AbstractC1194.m2525(jM50051, obj2, Integer.valueOf(((AbstractC2758) c4904.f16167).mo5045()));
                                    c2687.m5010(iM8273, iM5002, obj2);
                                    c4903 = c4904;
                                    c2337 = c2338;
                                    c4904 = c4903;
                                    c2338 = c2337;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    c2687 = c2687;
                                    break;
                                case 65:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jM50052 = m5000(iM5011);
                                    c4904.m8271(1);
                                    AbstractC1194.m2525(jM50052, obj2, Long.valueOf(((AbstractC2758) c4904.f16167).mo5062()));
                                    c2687.m5010(iM8273, iM5002, obj2);
                                    c4903 = c4904;
                                    c2337 = c2338;
                                    c4904 = c4903;
                                    c2338 = c2337;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    c2687 = c2687;
                                    break;
                                case 66:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jM50053 = m5000(iM5011);
                                    c4904.m8271(0);
                                    AbstractC1194.m2525(jM50053, obj2, Integer.valueOf(((AbstractC2758) c4904.f16167).mo5066()));
                                    c2687.m5010(iM8273, iM5002, obj2);
                                    c4903 = c4904;
                                    c2337 = c2338;
                                    c4904 = c4903;
                                    c2338 = c2337;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    c2687 = c2687;
                                    break;
                                case 67:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jM50054 = m5000(iM5011);
                                    c4904.m8271(0);
                                    AbstractC1194.m2525(jM50054, obj2, Long.valueOf(((AbstractC2758) c4904.f16167).mo5047()));
                                    c2687.m5010(iM8273, iM5002, obj2);
                                    c4903 = c4904;
                                    c2337 = c2338;
                                    c4904 = c4903;
                                    c2338 = c2337;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    c2687 = c2687;
                                    break;
                                case 68:
                                    try {
                                        AbstractC0066 abstractC0069 = (AbstractC0066) c2687.m5020(iM8273, iM5002, obj2);
                                        InterfaceC1622 interfaceC1622M5017 = c2687.m5014(iM5002);
                                        c4904.m8271(3);
                                        c4904.m8289(abstractC0069, interfaceC1622M5017, c2338);
                                        iArr = iArr2;
                                        i2 = i4;
                                        try {
                                            try {
                                                unsafe.putObject(obj2, c2687.m5011(iM5002) & 1048575, abstractC0069);
                                                c2687.m5010(iM8273, iM5002, obj2);
                                                c4903 = c4904;
                                                c2337 = c2338;
                                            } catch (C1423 unused8) {
                                                c4903 = c4904;
                                                c2337 = c2338;
                                                c0841.getClass();
                                                if (c5708M1754 == null) {
                                                    c5708M1754 = C0841.m1754(obj2);
                                                }
                                                if (!C0841.m1753(0, c4903, c5708M1754)) {
                                                    i3 = i2;
                                                    while (i5 < i3) {
                                                        c2687.m5018(iArr[i5], obj2, c5708M1754);
                                                        i5++;
                                                    }
                                                    if (c5708M1754 == null) {
                                                        return;
                                                    }
                                                    ((AbstractC0318) obj2).unknownFields = c5708M1754;
                                                }
                                            }
                                            c4904 = c4903;
                                            c2338 = c2337;
                                            iArr2 = iArr;
                                            i4 = i2;
                                            c2687 = c2687;
                                        } catch (Throwable th5) {
                                            th = th5;
                                            c2687 = c2687;
                                            i = i2;
                                            while (i5 < i) {
                                                c2687.m5018(iArr[i5], obj2, c5708M1754);
                                                i5++;
                                            }
                                            if (c5708M1754 != null) {
                                                c0841.getClass();
                                                ((AbstractC0318) obj2).unknownFields = c5708M1754;
                                            }
                                            throw th;
                                        }
                                    } catch (C1423 unused9) {
                                        iArr = iArr2;
                                        i2 = i4;
                                    } catch (Throwable th6) {
                                        th = th6;
                                        iArr = iArr2;
                                        i2 = i4;
                                    }
                                    break;
                                default:
                                    if (c5708M1754 == null) {
                                        c0841.getClass();
                                        c5708M1754 = C0841.m1754(obj2);
                                    }
                                    c0841.getClass();
                                    if (C0841.m1753(0, c4904, c5708M1754)) {
                                        iArr = iArr2;
                                        i2 = i4;
                                        c4903 = c4904;
                                        c2337 = c2338;
                                        c4904 = c4903;
                                        c2338 = c2337;
                                        iArr2 = iArr;
                                        i4 = i2;
                                        c2687 = c2687;
                                    } else {
                                        while (i5 < i4) {
                                            c2687.m5018(iArr2[i5], obj2, c5708M1754);
                                            i5++;
                                        }
                                        if (c5708M1754 == null) {
                                            return;
                                        }
                                    }
                                    break;
                            }
                        } catch (Throwable th7) {
                            th = th7;
                            c2687 = c2687;
                            iArr = iArr2;
                            i2 = i4;
                        }
                    } catch (C1423 unused10) {
                        iArr = iArr2;
                        i2 = i4;
                    }
                } else if (iM8273 == Integer.MAX_VALUE) {
                    while (i5 < i4) {
                        c2687.m5018(iArr2[i5], obj2, c5708M1754);
                        i5++;
                    }
                    if (c5708M1754 == null) {
                        return;
                    } else {
                        c0841.getClass();
                    }
                } else {
                    c0841.getClass();
                    if (c5708M1754 == null) {
                        c5708M1754 = C0841.m1754(obj2);
                    }
                    if (!C0841.m1753(0, c4904, c5708M1754)) {
                        while (i5 < i4) {
                            c2687.m5018(iArr2[i5], obj2, c5708M1754);
                            i5++;
                        }
                        if (c5708M1754 == null) {
                            return;
                        }
                    }
                }
            } catch (Throwable th8) {
                th = th8;
                c2687 = c2687;
                iArr = iArr2;
                i = i4;
            }
        }
        ((AbstractC0318) obj2).unknownFields = c5708M1754;
    }

    /* JADX INFO: renamed from: ۦؖ */
    public final void m5010(int i, int i2, Object obj) {
        AbstractC1194.m2519(i, this.f8920[i2 + 2] & 1048575, obj);
    }

    /* JADX INFO: renamed from: ۦؗ */
    public final int m5011(int i) {
        return this.f8920[i + 1];
    }

    /* JADX INFO: renamed from: ۦؙ */
    public final void m5012(int i, Object obj) {
        int i2 = this.f8920[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        AbstractC1194.m2519((1 << (i2 >>> 20)) | AbstractC1194.m2513(j, obj), j, obj);
    }

    /* JADX INFO: renamed from: ۦؚ */
    public final void m5013(int i) {
        if (this.f8918[((i / 3) * 2) + 1] == null) {
            return;
        }
        C0178.m382();
    }

    /* JADX INFO: renamed from: ۦٌ */
    public final InterfaceC1622 m5014(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.f8918;
        InterfaceC1622 interfaceC1622 = (InterfaceC1622) objArr[i2];
        if (interfaceC1622 != null) {
            return interfaceC1622;
        }
        InterfaceC1622 interfaceC1622M9541 = C5734.f18904.m9541((Class) objArr[i2 + 1]);
        objArr[i2] = interfaceC1622M9541;
        return interfaceC1622M9541;
    }

    /* JADX INFO: renamed from: ۦِ */
    public final boolean m5015(AbstractC0318 abstractC0318, AbstractC0318 abstractC0319, int i) {
        return m5019(i, abstractC0318) == m5019(i, abstractC0319);
    }

    /* JADX INFO: renamed from: ۦٗ */
    public final Object m5016(int i, Object obj) {
        InterfaceC1622 interfaceC1622M5014 = m5014(i);
        long jM5011 = m5011(i) & 1048575;
        if (!m5019(i, obj)) {
            return interfaceC1622M5014.mo3393();
        }
        Object object = f8914.getObject(obj, jM5011);
        if (m5001(object)) {
            return object;
        }
        AbstractC0318 abstractC0318Mo3393 = interfaceC1622M5014.mo3393();
        if (object != null) {
            interfaceC1622M5014.mo3386(abstractC0318Mo3393, object);
        }
        return abstractC0318Mo3393;
    }

    /* JADX INFO: renamed from: ۦٚ */
    public final void m5017(int i, C4902 c4902, Object obj) throws C1423 {
        if ((536870912 & i) != 0) {
            c4902.m8271(2);
            AbstractC1194.m2525(i & 1048575, obj, ((AbstractC2758) c4902.f16167).mo5046());
        } else if (!this.f8917) {
            AbstractC1194.m2525(i & 1048575, obj, c4902.m8282());
        } else {
            c4902.m8271(2);
            AbstractC1194.m2525(i & 1048575, obj, ((AbstractC2758) c4902.f16167).mo5060());
        }
    }

    @Override // p000.InterfaceC1622
    /* JADX INFO: renamed from: ۦٛ */
    public final AbstractC0318 mo3393() {
        this.f8924.getClass();
        return ((AbstractC0318) this.f8916).m678();
    }

    /* JADX INFO: renamed from: ۦۗ */
    public final void m5018(int i, Object obj, Object obj2) {
        int i2 = this.f8920[i];
        if (AbstractC1194.m2515(m5011(i) & 1048575, obj) == null) {
            return;
        }
        m5013(i);
    }

    @Override // p000.InterfaceC1622
    /* JADX INFO: renamed from: ۦۙ */
    public final boolean mo3394(Object obj) {
        int i;
        int i2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.f8919) {
            int i6 = this.f8927[i5];
            int[] iArr = this.f8920;
            int i7 = iArr[i6];
            int iM5011 = m5011(i6);
            int i8 = iArr[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i3) {
                if (i9 != 1048575) {
                    i4 = f8914.getInt(obj, i9);
                }
                i2 = i4;
                i = i9;
            } else {
                int i11 = i4;
                i = i3;
                i2 = i11;
            }
            if ((268435456 & iM5011) == 0 || m5021(obj, i6, i, i2, i10)) {
                int iM4999 = m4999(iM5011);
                if (iM4999 != 9 && iM4999 != 17) {
                    if (iM4999 != 27) {
                        if (iM4999 == 60 || iM4999 == 68) {
                            if (!m5005(i7, i6, obj) || m5014(i6).mo3394(AbstractC1194.m2515(iM5011 & 1048575, obj))) {
                                i5++;
                                i3 = i;
                                i4 = i2;
                            }
                        } else if (iM4999 != 49) {
                            if (iM4999 != 50) {
                                continue;
                            } else {
                                Object objM2515 = AbstractC1194.m2515(iM5011 & 1048575, obj);
                                this.f8923.getClass();
                                C0303 c0303 = (C0303) objM2515;
                                if (c0303.isEmpty()) {
                                    continue;
                                } else {
                                    if (((EnumC1497) ((C5405) this.f8918[(i6 / 3) * 2]).f17850.f9376).f5077 != EnumC4392.f14473) {
                                        continue;
                                    } else {
                                        InterfaceC1622 interfaceC1622M9541 = null;
                                        for (Object obj2 : c0303.values()) {
                                            if (interfaceC1622M9541 == null) {
                                                interfaceC1622M9541 = C5734.f18904.m9541(obj2.getClass());
                                            }
                                            if (!interfaceC1622M9541.mo3394(obj2)) {
                                            }
                                        }
                                    }
                                }
                            }
                            i5++;
                            i3 = i;
                            i4 = i2;
                        }
                    }
                    List list = (List) AbstractC1194.m2515(iM5011 & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        InterfaceC1622 interfaceC1622M5014 = m5014(i6);
                        for (int i12 = 0; i12 < list.size(); i12++) {
                            if (interfaceC1622M5014.mo3394(list.get(i12))) {
                            }
                        }
                    }
                    i5++;
                    i3 = i;
                    i4 = i2;
                } else if (!m5021(obj, i6, i, i2, i10) || m5014(i6).mo3394(AbstractC1194.m2515(iM5011 & 1048575, obj))) {
                    i5++;
                    i3 = i;
                    i4 = i2;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:69:0x00f0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:70:0x00f1 A[RETURN] */
    /* JADX INFO: renamed from: ۦۚ */
    public final boolean m5019(int i, Object obj) {
        int i2 = this.f8920[i + 2];
        long j = i2 & 1048575;
        if (j != 1048575) {
            if (((1 << (i2 >>> 20)) & AbstractC1194.m2513(j, obj)) != 0) {
                return true;
            }
            return false;
        }
        int iM5011 = m5011(i);
        long j2 = iM5011 & 1048575;
        switch (m4999(iM5011)) {
            case 0:
                if (Double.doubleToRawLongBits(AbstractC1194.f4116.mo2642(j2, obj)) != 0) {
                    return true;
                }
                return false;
            case 1:
                if (Float.floatToRawIntBits(AbstractC1194.f4116.mo2639(j2, obj)) != 0) {
                    return true;
                }
                return false;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                if (AbstractC1194.m2523(j2, obj) != 0) {
                    return true;
                }
                return false;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                if (AbstractC1194.m2523(j2, obj) != 0) {
                    return true;
                }
                return false;
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                if (AbstractC1194.m2513(j2, obj) != 0) {
                    return true;
                }
                return false;
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                if (AbstractC1194.m2523(j2, obj) != 0) {
                    return true;
                }
                return false;
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                if (AbstractC1194.m2513(j2, obj) != 0) {
                    return true;
                }
                return false;
            case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                return AbstractC1194.f4116.mo2644(j2, obj);
            case 8:
                Object objM2515 = AbstractC1194.m2515(j2, obj);
                if (objM2515 instanceof String) {
                    return !((String) objM2515).isEmpty();
                }
                if (objM2515 instanceof C0533) {
                    return !C0533.f1874.equals(objM2515);
                }
                C0178.m393();
                return false;
            case 9:
                if (AbstractC1194.m2515(j2, obj) != null) {
                    return true;
                }
                return false;
            case 10:
                return !C0533.f1874.equals(AbstractC1194.m2515(j2, obj));
            case 11:
                if (AbstractC1194.m2513(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 12:
                if (AbstractC1194.m2513(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 13:
                if (AbstractC1194.m2513(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 14:
                if (AbstractC1194.m2523(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 15:
                if (AbstractC1194.m2513(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 16:
                if (AbstractC1194.m2523(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 17:
                if (AbstractC1194.m2515(j2, obj) != null) {
                    return true;
                }
                return false;
            default:
                C0178.m393();
                return false;
        }
    }

    /* JADX INFO: renamed from: ۦۛ */
    public final Object m5020(int i, int i2, Object obj) {
        InterfaceC1622 interfaceC1622M5014 = m5014(i2);
        if (!m5005(i, i2, obj)) {
            return interfaceC1622M5014.mo3393();
        }
        Object object = f8914.getObject(obj, m5011(i2) & 1048575);
        if (m5001(object)) {
            return object;
        }
        AbstractC0318 abstractC0318Mo3393 = interfaceC1622M5014.mo3393();
        if (object != null) {
            interfaceC1622M5014.mo3386(abstractC0318Mo3393, object);
        }
        return abstractC0318Mo3393;
    }

    /* JADX INFO: renamed from: ۦۨ */
    public final boolean m5021(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return m5019(i, obj);
        }
        return (i3 & i4) != 0;
    }
}
