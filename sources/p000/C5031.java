package p000;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: ۦۘؕٙۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5031 implements InterfaceC0759 {

    /* JADX INFO: renamed from: ۥؗ */
    public final int f16650;

    /* JADX INFO: renamed from: ۥُ */
    public final AbstractC3127 f16651;

    /* JADX INFO: renamed from: ۥّ */
    public final boolean f16652;

    /* JADX INFO: renamed from: ۥۗ */
    public final Object[] f16653;

    /* JADX INFO: renamed from: ۥۜ */
    public final int f16654;

    /* JADX INFO: renamed from: ۥۣ */
    public final int[] f16655;

    /* JADX INFO: renamed from: ۦؑ */
    public final int f16656;

    /* JADX INFO: renamed from: ۦِ */
    public final C1397 f16657;

    /* JADX INFO: renamed from: ۦٛ */
    public final int f16658;

    /* JADX INFO: renamed from: ۦۙ */
    public final int[] f16659;

    /* JADX INFO: renamed from: ۦۗ */
    public static final int[] f16649 = new int[0];

    /* JADX INFO: renamed from: ۦؚ */
    public static final Unsafe f16648 = AbstractC0667.m1485();

    public C5031(int[] iArr, Object[] objArr, int i, int i2, AbstractC3127 abstractC3127, int[] iArr2, int i3, int i4, C1397 c1397, C4369 c4369) {
        this.f16655 = iArr;
        this.f16653 = objArr;
        this.f16650 = i;
        this.f16656 = i2;
        this.f16652 = abstractC3127 instanceof AbstractC5212;
        this.f16659 = iArr2;
        this.f16654 = i3;
        this.f16658 = i4;
        this.f16657 = c1397;
        this.f16651 = abstractC3127;
    }

    /* JADX INFO: renamed from: ۥؖ */
    public static Field m8455(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String string = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 11 + name.length() + 29 + String.valueOf(string).length());
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            throw new RuntimeException(AbstractC3761.m6621(sb, " not found. Known fields are ", string), e);
        }
    }

    /* JADX INFO: renamed from: ۦؚ */
    public static int m8456(int i) {
        return (i >>> 20) & 255;
    }

    /* JADX INFO: renamed from: ۦٌ */
    public static boolean m8457(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC5212) {
            return ((AbstractC5212) obj).m8824();
        }
        return true;
    }

    /* JADX INFO: renamed from: ۦٕ */
    public static final int m8458(byte[] bArr, int i, int i2, EnumC4646 enumC4646, Class cls, C0958 c0958) throws C5463 {
        EnumC4646 enumC4647 = EnumC4646.f15324;
        switch (enumC4646.ordinal()) {
            case 0:
                int i3 = i + 8;
                c0958.f3397 = Double.valueOf(Double.longBitsToDouble(AbstractC3831.m6864(i, bArr)));
                return i3;
            case 1:
                int i4 = i + 4;
                c0958.f3397 = Float.valueOf(Float.intBitsToFloat(AbstractC3831.m6858(i, bArr)));
                return i4;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                int iM6849 = AbstractC3831.m6849(bArr, i, c0958);
                c0958.f3397 = Long.valueOf(c0958.f3398);
                return iM6849;
            case C4261.LONG_FIELD_NUMBER /* 4 */:
            case 12:
            case 13:
                int iM6881 = AbstractC3831.m6881(bArr, i, c0958);
                c0958.f3397 = Integer.valueOf(c0958.f3399);
                return iM6881;
            case C4261.STRING_FIELD_NUMBER /* 5 */:
            case 15:
                int i5 = i + 8;
                c0958.f3397 = Long.valueOf(AbstractC3831.m6864(i, bArr));
                return i5;
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
            case 14:
                int i6 = i + 4;
                c0958.f3397 = Integer.valueOf(AbstractC3831.m6858(i, bArr));
                return i6;
            case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                int iM68410 = AbstractC3831.m6849(bArr, i, c0958);
                c0958.f3397 = Boolean.valueOf(c0958.f3398 != 0);
                return iM68410;
            case 8:
                return AbstractC3831.m6850(bArr, i, c0958);
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                InterfaceC0759 interfaceC0759M8330 = C4946.f16366.m8330(cls);
                AbstractC5212 abstractC5212Mo1651 = interfaceC0759M8330.mo1651();
                int iM6839 = AbstractC3831.m6839(abstractC5212Mo1651, interfaceC0759M8330, bArr, i, i2, c0958);
                interfaceC0759M8330.mo1654(abstractC5212Mo1651);
                c0958.f3397 = abstractC5212Mo1651;
                return iM6839;
            case 11:
                return AbstractC3831.m6855(bArr, i, c0958);
            case 16:
                int iM6882 = AbstractC3831.m6881(bArr, i, c0958);
                c0958.f3397 = Integer.valueOf(AbstractC4650.m8026(c0958.f3399));
                return iM6882;
            case 17:
                int iM68411 = AbstractC3831.m6849(bArr, i, c0958);
                c0958.f3397 = Long.valueOf(AbstractC4650.m8027(c0958.f3398));
                return iM68411;
        }
    }

    /* JADX INFO: renamed from: ۦۚ */
    public static void m8459(Object obj) {
        if (m8457(obj)) {
            return;
        }
        C1078.m2272("Mutating immutable message: ".concat(String.valueOf(obj)));
    }

    /* JADX INFO: renamed from: ۦ۟ */
    public static long m8460(long j, Object obj) {
        return ((Long) AbstractC0667.m1478(j, obj)).longValue();
    }

    /* JADX INFO: renamed from: ۦۨ */
    public static int m8461(long j, Object obj) {
        return ((Integer) AbstractC0667.m1478(j, obj)).intValue();
    }

    /* JADX INFO: renamed from: ۥؓ */
    public final void m8462(int i, Object obj, Object obj2) {
        if (m8464(i, obj2)) {
            long jM8480 = m8480(i) & 1048575;
            Unsafe unsafe = f16648;
            Object object = unsafe.getObject(obj2, jM8480);
            if (object == null) {
                int i2 = this.f16655[i];
                String string = obj2.toString();
                StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 38 + string.length());
                sb.append("Source subfield ");
                sb.append(i2);
                sb.append(" is present but null: ");
                sb.append(string);
                throw new IllegalStateException(sb.toString());
            }
            InterfaceC0759 interfaceC0759M8463 = m8463(i);
            if (!m8464(i, obj)) {
                if (m8457(object)) {
                    AbstractC5212 abstractC5212Mo1651 = interfaceC0759M8463.mo1651();
                    interfaceC0759M8463.mo1646(abstractC5212Mo1651, object);
                    unsafe.putObject(obj, jM8480, abstractC5212Mo1651);
                } else {
                    unsafe.putObject(obj, jM8480, object);
                }
                m8468(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jM8480);
            if (!m8457(object2)) {
                AbstractC5212 abstractC5212Mo1652 = interfaceC0759M8463.mo1651();
                interfaceC0759M8463.mo1646(abstractC5212Mo1652, object2);
                unsafe.putObject(obj, jM8480, abstractC5212Mo1652);
                object2 = abstractC5212Mo1652;
            }
            interfaceC0759M8463.mo1646(object2, object);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x001e  */
    @Override // p000.InterfaceC0759
    /* JADX INFO: renamed from: ۥؗ */
    public final void mo1646(Object obj, Object obj2) {
        Object obj3;
        m8459(obj);
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.f16655;
            if (i >= iArr.length) {
                AbstractC2569.m4855(obj, obj2);
                return;
            }
            int iM8480 = m8480(i);
            int i2 = 1048575 & iM8480;
            int iM8456 = m8456(iM8480);
            int i3 = iArr[i];
            long j = i2;
            switch (iM8456) {
                case 0:
                    if (!m8464(i, obj2)) {
                        obj3 = obj;
                    } else {
                        AbstractC5716 abstractC5716 = AbstractC0667.f2454;
                        obj3 = obj;
                        abstractC5716.mo5387(obj3, j, abstractC5716.mo5388(j, obj2));
                        m8468(i, obj3);
                    }
                    break;
                case 1:
                    if (m8464(i, obj2)) {
                        AbstractC5716 abstractC5717 = AbstractC0667.f2454;
                        abstractC5717.mo5386(obj, j, abstractC5717.mo5383(j, obj2));
                        m8468(i, obj);
                    }
                    obj3 = obj;
                    break;
                case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                    if (m8464(i, obj2)) {
                        AbstractC0667.m1486(obj, j, AbstractC0667.m1476(j, obj2));
                        m8468(i, obj);
                    }
                    obj3 = obj;
                    break;
                case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                    if (m8464(i, obj2)) {
                        AbstractC0667.m1486(obj, j, AbstractC0667.m1476(j, obj2));
                        m8468(i, obj);
                    }
                    obj3 = obj;
                    break;
                case C4261.LONG_FIELD_NUMBER /* 4 */:
                    if (m8464(i, obj2)) {
                        AbstractC0667.m1475(AbstractC0667.m1480(j, obj2), j, obj);
                        m8468(i, obj);
                    }
                    obj3 = obj;
                    break;
                case C4261.STRING_FIELD_NUMBER /* 5 */:
                    if (m8464(i, obj2)) {
                        AbstractC0667.m1486(obj, j, AbstractC0667.m1476(j, obj2));
                        m8468(i, obj);
                    }
                    obj3 = obj;
                    break;
                case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (m8464(i, obj2)) {
                        AbstractC0667.m1475(AbstractC0667.m1480(j, obj2), j, obj);
                        m8468(i, obj);
                    }
                    obj3 = obj;
                    break;
                case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (m8464(i, obj2)) {
                        AbstractC5716 abstractC5718 = AbstractC0667.f2454;
                        abstractC5718.mo5382(obj, j, abstractC5718.mo5385(j, obj2));
                        m8468(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (m8464(i, obj2)) {
                        AbstractC0667.m1484(j, obj, AbstractC0667.m1478(j, obj2));
                        m8468(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    m8462(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 10:
                    if (m8464(i, obj2)) {
                        AbstractC0667.m1484(j, obj, AbstractC0667.m1478(j, obj2));
                        m8468(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 11:
                    if (m8464(i, obj2)) {
                        AbstractC0667.m1475(AbstractC0667.m1480(j, obj2), j, obj);
                        m8468(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (m8464(i, obj2)) {
                        AbstractC0667.m1475(AbstractC0667.m1480(j, obj2), j, obj);
                        m8468(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (m8464(i, obj2)) {
                        AbstractC0667.m1475(AbstractC0667.m1480(j, obj2), j, obj);
                        m8468(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (m8464(i, obj2)) {
                        AbstractC0667.m1486(obj, j, AbstractC0667.m1476(j, obj2));
                        m8468(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (m8464(i, obj2)) {
                        AbstractC0667.m1475(AbstractC0667.m1480(j, obj2), j, obj);
                        m8468(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (m8464(i, obj2)) {
                        AbstractC0667.m1486(obj, j, AbstractC0667.m1476(j, obj2));
                        m8468(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 17:
                    m8462(i, obj, obj2);
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
                    InterfaceC5083 interfaceC5083Mo4971 = (InterfaceC5083) AbstractC0667.m1478(j, obj);
                    InterfaceC5083 interfaceC5083 = (InterfaceC5083) AbstractC0667.m1478(j, obj2);
                    int size = interfaceC5083Mo4971.size();
                    int size2 = interfaceC5083.size();
                    if (size > 0 && size2 > 0) {
                        if (!((AbstractC1864) interfaceC5083Mo4971).f6207) {
                            interfaceC5083Mo4971 = interfaceC5083Mo4971.mo4971(size2 + size);
                        }
                        interfaceC5083Mo4971.addAll(interfaceC5083);
                    }
                    if (size > 0) {
                        interfaceC5083 = interfaceC5083Mo4971;
                    }
                    AbstractC0667.m1484(j, obj, interfaceC5083);
                    obj3 = obj;
                    break;
                case 50:
                    C1397 c1397 = AbstractC2569.f8579;
                    AbstractC0667.m1484(j, obj, C4452.m7738(AbstractC0667.m1478(j, obj), AbstractC0667.m1478(j, obj2)));
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
                    if (m8478(i3, i, obj2)) {
                        AbstractC0667.m1484(j, obj, AbstractC0667.m1478(j, obj2));
                        m8481(i3, i, obj);
                    }
                    obj3 = obj;
                    break;
                case 60:
                    m8473(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (m8478(i3, i, obj2)) {
                        AbstractC0667.m1484(j, obj, AbstractC0667.m1478(j, obj2));
                        m8481(i3, i, obj);
                    }
                    obj3 = obj;
                    break;
                case 68:
                    m8473(i, obj, obj2);
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
    public final InterfaceC0759 m8463(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        Object[] objArr = this.f16653;
        InterfaceC0759 interfaceC0759 = (InterfaceC0759) objArr[i3];
        if (interfaceC0759 != null) {
            return interfaceC0759;
        }
        InterfaceC0759 interfaceC0759M8330 = C4946.f16366.m8330((Class) objArr[i3 + 1]);
        objArr[i3] = interfaceC0759M8330;
        return interfaceC0759M8330;
    }

    /* JADX WARN: Code duplicated, block: B:72:0x00f5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:73:0x00f6 A[RETURN] */
    /* JADX INFO: renamed from: ۥَ */
    public final boolean m8464(int i, Object obj) {
        int i2 = this.f16655[i + 2];
        long j = i2 & 1048575;
        if (j != 1048575) {
            if (((1 << (i2 >>> 20)) & AbstractC0667.m1480(j, obj)) != 0) {
                return true;
            }
            return false;
        }
        int iM8480 = m8480(i);
        long j2 = iM8480 & 1048575;
        switch (m8456(iM8480)) {
            case 0:
                if (Double.doubleToRawLongBits(AbstractC0667.f2454.mo5388(j2, obj)) != 0) {
                    return true;
                }
                return false;
            case 1:
                if (Float.floatToRawIntBits(AbstractC0667.f2454.mo5383(j2, obj)) != 0) {
                    return true;
                }
                return false;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                if (AbstractC0667.m1476(j2, obj) != 0) {
                    return true;
                }
                return false;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                if (AbstractC0667.m1476(j2, obj) != 0) {
                    return true;
                }
                return false;
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                if (AbstractC0667.m1480(j2, obj) != 0) {
                    return true;
                }
                return false;
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                if (AbstractC0667.m1476(j2, obj) != 0) {
                    return true;
                }
                return false;
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                if (AbstractC0667.m1480(j2, obj) != 0) {
                    return true;
                }
                return false;
            case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                return AbstractC0667.f2454.mo5385(j2, obj);
            case 8:
                Object objM1478 = AbstractC0667.m1478(j2, obj);
                if (objM1478 instanceof String) {
                    if (((String) objM1478).isEmpty()) {
                        return false;
                    }
                    return true;
                }
                if (!(objM1478 instanceof AbstractC4314)) {
                    C0178.m393();
                    return false;
                }
                if (AbstractC4314.f14260.equals(objM1478)) {
                    return false;
                }
                return true;
            case 9:
                if (AbstractC0667.m1478(j2, obj) != null) {
                    return true;
                }
                return false;
            case 10:
                if (AbstractC4314.f14260.equals(AbstractC0667.m1478(j2, obj))) {
                    return false;
                }
                return true;
            case 11:
                if (AbstractC0667.m1480(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 12:
                if (AbstractC0667.m1480(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 13:
                if (AbstractC0667.m1480(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 14:
                if (AbstractC0667.m1476(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 15:
                if (AbstractC0667.m1480(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 16:
                if (AbstractC0667.m1476(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 17:
                if (AbstractC0667.m1478(j2, obj) != null) {
                    return true;
                }
                return false;
            default:
                C0178.m393();
                return false;
        }
    }

    @Override // p000.InterfaceC0759
    /* JADX INFO: renamed from: ۥُ */
    public final void mo1647(Object obj, C2391 c2391) {
        int i;
        AbstractC0438 abstractC0438 = (AbstractC0438) c2391.f7924;
        int i2 = 1048575;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int[] iArr = this.f16655;
            if (i4 >= iArr.length) {
                ((AbstractC5212) obj).zzc.m5889(c2391);
                return;
            }
            int iM8480 = m8480(i4);
            int iM8456 = m8456(iM8480);
            int i6 = iArr[i4];
            Unsafe unsafe = f16648;
            if (iM8456 <= 17) {
                int i7 = iArr[i4 + 2];
                int i8 = i7 & i2;
                if (i8 != i3) {
                    i5 = i8 == i2 ? 0 : unsafe.getInt(obj, i8);
                    i3 = i8;
                }
                i = 1 << (i7 >>> 20);
            } else {
                i = 0;
            }
            long j = iM8480 & i2;
            switch (iM8456) {
                case 0:
                    if (m8466(obj, i4, i3, i5, i)) {
                        abstractC0438.mo949(Double.doubleToRawLongBits(AbstractC0667.f2454.mo5388(j, obj)), i6);
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 1:
                    if (m8466(obj, i4, i3, i5, i)) {
                        abstractC0438.mo951(i6, Float.floatToRawIntBits(AbstractC0667.f2454.mo5383(j, obj)));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                    if (m8466(obj, i4, i3, i5, i)) {
                        abstractC0438.mo943(unsafe.getLong(obj, j), i6);
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                    if (m8466(obj, i4, i3, i5, i)) {
                        abstractC0438.mo943(unsafe.getLong(obj, j), i6);
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case C4261.LONG_FIELD_NUMBER /* 4 */:
                    if (m8466(obj, i4, i3, i5, i)) {
                        abstractC0438.mo938(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case C4261.STRING_FIELD_NUMBER /* 5 */:
                    if (m8466(obj, i4, i3, i5, i)) {
                        abstractC0438.mo949(unsafe.getLong(obj, j), i6);
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (m8466(obj, i4, i3, i5, i)) {
                        abstractC0438.mo951(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (m8466(obj, i4, i3, i5, i)) {
                        abstractC0438.mo947(i6, AbstractC0667.f2454.mo5385(j, obj));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 8:
                    if (m8466(obj, i4, i3, i5, i)) {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof String) {
                            abstractC0438.mo950(i6, (String) object);
                        } else {
                            abstractC0438.mo945(i6, (AbstractC4314) object);
                        }
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 9:
                    if (m8466(obj, i4, i3, i5, i)) {
                        c2391.m4476(i6, unsafe.getObject(obj, j), m8463(i4));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 10:
                    if (m8466(obj, i4, i3, i5, i)) {
                        abstractC0438.mo945(i6, (AbstractC4314) unsafe.getObject(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 11:
                    if (m8466(obj, i4, i3, i5, i)) {
                        abstractC0438.mo939(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 12:
                    if (m8466(obj, i4, i3, i5, i)) {
                        abstractC0438.mo938(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 13:
                    if (m8466(obj, i4, i3, i5, i)) {
                        abstractC0438.mo951(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 14:
                    if (m8466(obj, i4, i3, i5, i)) {
                        abstractC0438.mo949(unsafe.getLong(obj, j), i6);
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 15:
                    if (m8466(obj, i4, i3, i5, i)) {
                        int i9 = unsafe.getInt(obj, j);
                        abstractC0438.mo939(i6, (i9 >> 31) ^ (i9 + i9));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 16:
                    if (m8466(obj, i4, i3, i5, i)) {
                        long j2 = unsafe.getLong(obj, j);
                        abstractC0438.mo943((j2 >> 63) ^ (j2 + j2), i6);
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 17:
                    if (m8466(obj, i4, i3, i5, i)) {
                        Object object2 = unsafe.getObject(obj, j);
                        abstractC0438.mo944(i6, 3);
                        m8463(i4).mo1647((AbstractC3127) object2, c2391);
                        abstractC0438.mo944(i6, 4);
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 18:
                    AbstractC2569.m4858(iArr[i4], (List) unsafe.getObject(obj, j), c2391, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 19:
                    AbstractC2569.m4848(iArr[i4], (List) unsafe.getObject(obj, j), c2391, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 20:
                    AbstractC2569.m4849(iArr[i4], (List) unsafe.getObject(obj, j), c2391, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 21:
                    AbstractC2569.m4866(iArr[i4], (List) unsafe.getObject(obj, j), c2391, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 22:
                    AbstractC2569.m4865(iArr[i4], (List) unsafe.getObject(obj, j), c2391, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 23:
                    AbstractC2569.m4864(iArr[i4], (List) unsafe.getObject(obj, j), c2391, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 24:
                    AbstractC2569.m4867(iArr[i4], (List) unsafe.getObject(obj, j), c2391, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 25:
                    AbstractC2569.m4850(iArr[i4], (List) unsafe.getObject(obj, j), c2391, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 26:
                    int i10 = iArr[i4];
                    List list = (List) unsafe.getObject(obj, j);
                    C1397 c1397 = AbstractC2569.f8579;
                    if (list != null && !list.isEmpty()) {
                        for (int i11 = 0; i11 < list.size(); i11++) {
                            abstractC0438.mo950(i10, (String) list.get(i11));
                        }
                    }
                    break;
                case 27:
                    int i12 = iArr[i4];
                    List list2 = (List) unsafe.getObject(obj, j);
                    InterfaceC0759 interfaceC0759M8463 = m8463(i4);
                    C1397 c1398 = AbstractC2569.f8579;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i13 = 0; i13 < list2.size(); i13++) {
                            c2391.m4476(i12, list2.get(i13), interfaceC0759M8463);
                        }
                    }
                    break;
                case 28:
                    int i14 = iArr[i4];
                    List list3 = (List) unsafe.getObject(obj, j);
                    C1397 c1399 = AbstractC2569.f8579;
                    if (list3 != null && !list3.isEmpty()) {
                        for (int i15 = 0; i15 < list3.size(); i15++) {
                            abstractC0438.mo945(i14, (AbstractC4314) list3.get(i15));
                        }
                    }
                    break;
                case 29:
                    AbstractC2569.m4859(iArr[i4], (List) unsafe.getObject(obj, j), c2391, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 30:
                    AbstractC2569.m4869(iArr[i4], (List) unsafe.getObject(obj, j), c2391, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 31:
                    AbstractC2569.m4870(iArr[i4], (List) unsafe.getObject(obj, j), c2391, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 32:
                    AbstractC2569.m4861(iArr[i4], (List) unsafe.getObject(obj, j), c2391, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 33:
                    AbstractC2569.m4860(iArr[i4], (List) unsafe.getObject(obj, j), c2391, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 34:
                    AbstractC2569.m4856(iArr[i4], (List) unsafe.getObject(obj, j), c2391, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 35:
                    AbstractC2569.m4858(iArr[i4], (List) unsafe.getObject(obj, j), c2391, true);
                    break;
                case 36:
                    AbstractC2569.m4848(iArr[i4], (List) unsafe.getObject(obj, j), c2391, true);
                    break;
                case 37:
                    AbstractC2569.m4849(iArr[i4], (List) unsafe.getObject(obj, j), c2391, true);
                    break;
                case 38:
                    AbstractC2569.m4866(iArr[i4], (List) unsafe.getObject(obj, j), c2391, true);
                    break;
                case 39:
                    AbstractC2569.m4865(iArr[i4], (List) unsafe.getObject(obj, j), c2391, true);
                    break;
                case 40:
                    AbstractC2569.m4864(iArr[i4], (List) unsafe.getObject(obj, j), c2391, true);
                    break;
                case 41:
                    AbstractC2569.m4867(iArr[i4], (List) unsafe.getObject(obj, j), c2391, true);
                    break;
                case 42:
                    AbstractC2569.m4850(iArr[i4], (List) unsafe.getObject(obj, j), c2391, true);
                    break;
                case 43:
                    AbstractC2569.m4859(iArr[i4], (List) unsafe.getObject(obj, j), c2391, true);
                    break;
                case 44:
                    AbstractC2569.m4869(iArr[i4], (List) unsafe.getObject(obj, j), c2391, true);
                    break;
                case 45:
                    AbstractC2569.m4870(iArr[i4], (List) unsafe.getObject(obj, j), c2391, true);
                    break;
                case 46:
                    AbstractC2569.m4861(iArr[i4], (List) unsafe.getObject(obj, j), c2391, true);
                    break;
                case 47:
                    AbstractC2569.m4860(iArr[i4], (List) unsafe.getObject(obj, j), c2391, true);
                    break;
                case 48:
                    AbstractC2569.m4856(iArr[i4], (List) unsafe.getObject(obj, j), c2391, true);
                    break;
                case 49:
                    int i16 = iArr[i4];
                    List list4 = (List) unsafe.getObject(obj, j);
                    InterfaceC0759 interfaceC0759M8464 = m8463(i4);
                    C1397 c13910 = AbstractC2569.f8579;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i17 = 0; i17 < list4.size(); i17++) {
                            AbstractC3127 abstractC3127 = (AbstractC3127) list4.get(i17);
                            abstractC0438.mo944(i16, 3);
                            interfaceC0759M8464.mo1647(abstractC3127, c2391);
                            abstractC0438.mo944(i16, 4);
                        }
                    }
                    break;
                case 50:
                    Object object3 = unsafe.getObject(obj, j);
                    if (object3 != null) {
                        C5460 c5460 = ((C3521) m8479(i4)).f11660;
                        for (Map.Entry entry : ((C3775) object3).entrySet()) {
                            abstractC0438.mo944(i6, 2);
                            abstractC0438.mo941(C3521.m6311(c5460, entry.getKey(), entry.getValue()));
                            C3521.m6312(abstractC0438, c5460, entry.getKey(), entry.getValue());
                        }
                    }
                    break;
                case 51:
                    if (m8478(i6, i4, obj)) {
                        abstractC0438.mo949(Double.doubleToRawLongBits(((Double) AbstractC0667.m1478(j, obj)).doubleValue()), i6);
                    }
                    break;
                case 52:
                    if (m8478(i6, i4, obj)) {
                        abstractC0438.mo951(i6, Float.floatToRawIntBits(((Float) AbstractC0667.m1478(j, obj)).floatValue()));
                    }
                    break;
                case 53:
                    if (m8478(i6, i4, obj)) {
                        abstractC0438.mo943(m8460(j, obj), i6);
                    }
                    break;
                case 54:
                    if (m8478(i6, i4, obj)) {
                        abstractC0438.mo943(m8460(j, obj), i6);
                    }
                    break;
                case 55:
                    if (m8478(i6, i4, obj)) {
                        abstractC0438.mo938(i6, m8461(j, obj));
                    }
                    break;
                case 56:
                    if (m8478(i6, i4, obj)) {
                        abstractC0438.mo949(m8460(j, obj), i6);
                    }
                    break;
                case 57:
                    if (m8478(i6, i4, obj)) {
                        abstractC0438.mo951(i6, m8461(j, obj));
                    }
                    break;
                case 58:
                    if (m8478(i6, i4, obj)) {
                        abstractC0438.mo947(i6, ((Boolean) AbstractC0667.m1478(j, obj)).booleanValue());
                    }
                    break;
                case 59:
                    if (m8478(i6, i4, obj)) {
                        Object object4 = unsafe.getObject(obj, j);
                        if (object4 instanceof String) {
                            abstractC0438.mo950(i6, (String) object4);
                        } else {
                            abstractC0438.mo945(i6, (AbstractC4314) object4);
                        }
                    }
                    break;
                case 60:
                    if (m8478(i6, i4, obj)) {
                        c2391.m4476(i6, unsafe.getObject(obj, j), m8463(i4));
                    }
                    break;
                case 61:
                    if (m8478(i6, i4, obj)) {
                        abstractC0438.mo945(i6, (AbstractC4314) unsafe.getObject(obj, j));
                    }
                    break;
                case 62:
                    if (m8478(i6, i4, obj)) {
                        abstractC0438.mo939(i6, m8461(j, obj));
                    }
                    break;
                case 63:
                    if (m8478(i6, i4, obj)) {
                        abstractC0438.mo938(i6, m8461(j, obj));
                    }
                    break;
                case 64:
                    if (m8478(i6, i4, obj)) {
                        abstractC0438.mo951(i6, m8461(j, obj));
                    }
                    break;
                case 65:
                    if (m8478(i6, i4, obj)) {
                        abstractC0438.mo949(m8460(j, obj), i6);
                    }
                    break;
                case 66:
                    if (m8478(i6, i4, obj)) {
                        int iM8461 = m8461(j, obj);
                        abstractC0438.mo939(i6, (iM8461 >> 31) ^ (iM8461 + iM8461));
                    }
                    break;
                case 67:
                    if (m8478(i6, i4, obj)) {
                        long jM8460 = m8460(j, obj);
                        abstractC0438.mo943((jM8460 >> 63) ^ (jM8460 + jM8460), i6);
                    }
                    break;
                case 68:
                    if (m8478(i6, i4, obj)) {
                        Object object5 = unsafe.getObject(obj, j);
                        abstractC0438.mo944(i6, 3);
                        m8463(i4).mo1647((AbstractC3127) object5, c2391);
                        abstractC0438.mo944(i6, 4);
                    }
                    break;
            }
            i4 += 3;
            i2 = 1048575;
        }
    }

    @Override // p000.InterfaceC0759
    /* JADX INFO: renamed from: ۥّ */
    public final boolean mo1648(Object obj) {
        int i;
        int i2;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1048575;
        while (i3 < this.f16654) {
            int i6 = this.f16659[i3];
            int iM8480 = this.m8480(i6);
            int[] iArr = this.f16655;
            int i7 = iArr[i6 + 2];
            int i8 = i7 & 1048575;
            int i9 = 1 << (i7 >>> 20);
            if (i8 != i5) {
                if (i8 != 1048575) {
                    i4 = f16648.getInt(obj, i8);
                }
                i2 = i4;
                i = i8;
            } else {
                i = i5;
                i2 = i4;
            }
            C5031 c5031 = this;
            Object obj2 = obj;
            if ((268435456 & iM8480) == 0 || c5031.m8466(obj2, i6, i, i2, i9)) {
                int iM8456 = m8456(iM8480);
                if (iM8456 != 9 && iM8456 != 17) {
                    if (iM8456 != 27) {
                        if (iM8456 == 60 || iM8456 == 68) {
                            if (!c5031.m8478(iArr[i6], i6, obj2) || c5031.m8463(i6).mo1648(AbstractC0667.m1478(iM8480 & 1048575, obj2))) {
                                i3++;
                                this = c5031;
                                obj = obj2;
                                i5 = i;
                                i4 = i2;
                            }
                        } else if (iM8456 != 49) {
                            if (iM8456 != 50) {
                                continue;
                            } else {
                                C3775 c3775 = (C3775) AbstractC0667.m1478(iM8480 & 1048575, obj2);
                                if (!c3775.isEmpty() && ((EnumC4646) ((C3521) c5031.m8479(i6)).f11660.f17999).f15328 == EnumC3135.f10558) {
                                    InterfaceC0759 interfaceC0759M8330 = null;
                                    for (Object obj3 : c3775.values()) {
                                        if (interfaceC0759M8330 == null) {
                                            interfaceC0759M8330 = C4946.f16366.m8330(obj3.getClass());
                                        }
                                        if (!interfaceC0759M8330.mo1648(obj3)) {
                                        }
                                    }
                                }
                            }
                            i3++;
                            this = c5031;
                            obj = obj2;
                            i5 = i;
                            i4 = i2;
                        }
                    }
                    List list = (List) AbstractC0667.m1478(iM8480 & 1048575, obj2);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        InterfaceC0759 interfaceC0759M8463 = c5031.m8463(i6);
                        for (int i10 = 0; i10 < list.size(); i10++) {
                            if (interfaceC0759M8463.mo1648(list.get(i10))) {
                            }
                        }
                    }
                    i3++;
                    this = c5031;
                    obj = obj2;
                    i5 = i;
                    i4 = i2;
                } else if (!c5031.m8466(obj2, i6, i, i2, i9) || c5031.m8463(i6).mo1648(AbstractC0667.m1478(iM8480 & 1048575, obj2))) {
                    i3++;
                    this = c5031;
                    obj = obj2;
                    i5 = i;
                    i4 = i2;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: ۥْ */
    public final boolean m8465(AbstractC5212 abstractC5212, AbstractC5212 abstractC5213, int i) {
        return m8464(i, abstractC5212) == m8464(i, abstractC5213);
    }

    /* JADX INFO: renamed from: ۥٓ */
    public final boolean m8466(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return m8464(i, obj);
        }
        return (i3 & i4) != 0;
    }

    /* JADX INFO: renamed from: ۥٕ */
    public final C2068 m8467(int i) {
        int i2 = i / 3;
        return (C2068) this.f16653[i2 + i2 + 1];
    }

    /* JADX INFO: renamed from: ۥٖ */
    public final void m8468(int i, Object obj) {
        int i2 = this.f16655[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        AbstractC0667.m1475((1 << (i2 >>> 20)) | AbstractC0667.m1480(j, obj), j, obj);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 36401. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: ۥٙ */
    public final int m8469(java.lang.Object r40, byte[] r41, int r42, int r43, int r44, p000.C0958 r45) {
        /*
            Method dump skipped, instruction units count: 3640
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C5031.m8469(java.lang.Object, byte[], int, int, int, ۥٍٕؕٓ):int");
    }

    /* JADX INFO: renamed from: ۥۖ */
    public final int m8470(int i, int i2) {
        int[] iArr = this.f16655;
        int length = (iArr.length / 3) - 1;
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

    @Override // p000.InterfaceC0759
    /* JADX INFO: renamed from: ۥۗ */
    public final int mo1649(AbstractC5212 abstractC5212) {
        int i;
        long jDoubleToLongBits;
        int i2;
        int iFloatToIntBits;
        int i3;
        int i4;
        int iHashCode = 0;
        for (int i5 = 0; i5 < this.f16655.length; i5 += 3) {
            int iM8480 = m8480(i5);
            int iM8456 = m8456(iM8480);
            if (iM8456 <= 50 || iM8456 >= 69) {
                long j = iM8480 & 1048575;
                int iHashCode2 = 37;
                switch (iM8456) {
                    case 0:
                        i = iHashCode * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(AbstractC0667.f2454.mo5388(j, abstractC5212));
                        byte[] bArr = AbstractC1963.f6474;
                        i3 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i + i3;
                        break;
                    case 1:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = Float.floatToIntBits(AbstractC0667.f2454.mo5383(j, abstractC5212));
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                        i = iHashCode * 53;
                        jDoubleToLongBits = AbstractC0667.m1476(j, abstractC5212);
                        byte[] bArr2 = AbstractC1963.f6474;
                        i3 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i + i3;
                        break;
                    case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                        i = iHashCode * 53;
                        jDoubleToLongBits = AbstractC0667.m1476(j, abstractC5212);
                        byte[] bArr3 = AbstractC1963.f6474;
                        i3 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i + i3;
                        break;
                    case C4261.LONG_FIELD_NUMBER /* 4 */:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = AbstractC0667.m1480(j, abstractC5212);
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case C4261.STRING_FIELD_NUMBER /* 5 */:
                        i = iHashCode * 53;
                        jDoubleToLongBits = AbstractC0667.m1476(j, abstractC5212);
                        byte[] bArr4 = AbstractC1963.f6474;
                        i3 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i + i3;
                        break;
                    case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = AbstractC0667.m1480(j, abstractC5212);
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                        i = iHashCode * 53;
                        boolean zMo5385 = AbstractC0667.f2454.mo5385(j, abstractC5212);
                        byte[] bArr5 = AbstractC1963.f6474;
                        i3 = zMo5385 ? 1231 : 1237;
                        iHashCode = i + i3;
                        break;
                    case 8:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = ((String) AbstractC0667.m1478(j, abstractC5212)).hashCode();
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 9:
                        i4 = iHashCode * 53;
                        Object objM1478 = AbstractC0667.m1478(j, abstractC5212);
                        if (objM1478 != null) {
                            iHashCode2 = objM1478.hashCode();
                        }
                        iHashCode = i4 + iHashCode2;
                        break;
                    case 10:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = AbstractC0667.m1478(j, abstractC5212).hashCode();
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 11:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = AbstractC0667.m1480(j, abstractC5212);
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 12:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = AbstractC0667.m1480(j, abstractC5212);
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 13:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = AbstractC0667.m1480(j, abstractC5212);
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 14:
                        i = iHashCode * 53;
                        jDoubleToLongBits = AbstractC0667.m1476(j, abstractC5212);
                        byte[] bArr6 = AbstractC1963.f6474;
                        i3 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i + i3;
                        break;
                    case 15:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = AbstractC0667.m1480(j, abstractC5212);
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 16:
                        i = iHashCode * 53;
                        jDoubleToLongBits = AbstractC0667.m1476(j, abstractC5212);
                        byte[] bArr7 = AbstractC1963.f6474;
                        i3 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i + i3;
                        break;
                    case 17:
                        i4 = iHashCode * 53;
                        Object objM1479 = AbstractC0667.m1478(j, abstractC5212);
                        if (objM1479 != null) {
                            iHashCode2 = objM1479.hashCode();
                        }
                        iHashCode = i4 + iHashCode2;
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
                        i2 = iHashCode * 53;
                        iFloatToIntBits = AbstractC0667.m1478(j, abstractC5212).hashCode();
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 50:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = AbstractC0667.m1478(j, abstractC5212).hashCode();
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                }
            }
        }
        int i6 = this.f16658;
        while (true) {
            int[] iArr = this.f16659;
            if (i6 >= iArr.length) {
                return abstractC5212.zzc.hashCode() + (iHashCode * 53);
            }
            int i7 = iArr[i6];
            if (!m8478(0, i7, abstractC5212)) {
                iHashCode = AbstractC0667.m1478(m8480(i7) & 1048575, abstractC5212).hashCode() + (iHashCode * 53);
            }
            i6++;
        }
    }

    /* JADX INFO: renamed from: ۥۙ */
    public final Object m8471(int i, Object obj) {
        InterfaceC0759 interfaceC0759M8463 = m8463(i);
        int iM8480 = m8480(i) & 1048575;
        if (!m8464(i, obj)) {
            return interfaceC0759M8463.mo1651();
        }
        Object object = f16648.getObject(obj, iM8480);
        if (m8457(object)) {
            return object;
        }
        AbstractC5212 abstractC5212Mo1651 = interfaceC0759M8463.mo1651();
        if (object != null) {
            interfaceC0759M8463.mo1646(abstractC5212Mo1651, object);
        }
        return abstractC5212Mo1651;
    }

    /* JADX WARN: Code duplicated, block: B:134:0x0218 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:171:0x01d1 A[SYNTHETIC] */
    @Override // p000.InterfaceC0759
    /* JADX INFO: renamed from: ۥۜ */
    public final boolean mo1650(AbstractC5212 abstractC5212, AbstractC5212 abstractC5213) {
        boolean zM4857;
        int i = 0;
        while (true) {
            int[] iArr = this.f16655;
            if (i < iArr.length) {
                int iM8480 = m8480(i);
                int iM8456 = m8456(iM8480);
                if (iM8456 <= 50 || iM8456 >= 69) {
                    long j = iM8480 & 1048575;
                    switch (iM8456) {
                        case 0:
                            if (m8465(abstractC5212, abstractC5213, i)) {
                                AbstractC5716 abstractC5716 = AbstractC0667.f2454;
                                if (Double.doubleToLongBits(abstractC5716.mo5388(j, abstractC5212)) != Double.doubleToLongBits(abstractC5716.mo5388(j, abstractC5213))) {
                                }
                            }
                            break;
                        case 1:
                            if (m8465(abstractC5212, abstractC5213, i)) {
                                AbstractC5716 abstractC5717 = AbstractC0667.f2454;
                                if (Float.floatToIntBits(abstractC5717.mo5383(j, abstractC5212)) != Float.floatToIntBits(abstractC5717.mo5383(j, abstractC5213))) {
                                }
                            }
                            break;
                        case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                            if (!m8465(abstractC5212, abstractC5213, i) || AbstractC0667.m1476(j, abstractC5212) != AbstractC0667.m1476(j, abstractC5213)) {
                            }
                            break;
                        case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                            if (!m8465(abstractC5212, abstractC5213, i) || AbstractC0667.m1476(j, abstractC5212) != AbstractC0667.m1476(j, abstractC5213)) {
                            }
                            break;
                        case C4261.LONG_FIELD_NUMBER /* 4 */:
                            if (!m8465(abstractC5212, abstractC5213, i) || AbstractC0667.m1480(j, abstractC5212) != AbstractC0667.m1480(j, abstractC5213)) {
                            }
                            break;
                        case C4261.STRING_FIELD_NUMBER /* 5 */:
                            if (!m8465(abstractC5212, abstractC5213, i) || AbstractC0667.m1476(j, abstractC5212) != AbstractC0667.m1476(j, abstractC5213)) {
                            }
                            break;
                        case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                            if (!m8465(abstractC5212, abstractC5213, i) || AbstractC0667.m1480(j, abstractC5212) != AbstractC0667.m1480(j, abstractC5213)) {
                            }
                            break;
                        case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                            if (m8465(abstractC5212, abstractC5213, i)) {
                                AbstractC5716 abstractC5718 = AbstractC0667.f2454;
                                if (abstractC5718.mo5385(j, abstractC5212) != abstractC5718.mo5385(j, abstractC5213)) {
                                }
                            }
                            break;
                        case 8:
                            if (!m8465(abstractC5212, abstractC5213, i) || !AbstractC2569.m4857(AbstractC0667.m1478(j, abstractC5212), AbstractC0667.m1478(j, abstractC5213))) {
                            }
                            break;
                        case 9:
                            if (!m8465(abstractC5212, abstractC5213, i) || !AbstractC2569.m4857(AbstractC0667.m1478(j, abstractC5212), AbstractC0667.m1478(j, abstractC5213))) {
                            }
                            break;
                        case 10:
                            if (!m8465(abstractC5212, abstractC5213, i) || !AbstractC2569.m4857(AbstractC0667.m1478(j, abstractC5212), AbstractC0667.m1478(j, abstractC5213))) {
                            }
                            break;
                        case 11:
                            if (!m8465(abstractC5212, abstractC5213, i) || AbstractC0667.m1480(j, abstractC5212) != AbstractC0667.m1480(j, abstractC5213)) {
                            }
                            break;
                        case 12:
                            if (!m8465(abstractC5212, abstractC5213, i) || AbstractC0667.m1480(j, abstractC5212) != AbstractC0667.m1480(j, abstractC5213)) {
                            }
                            break;
                        case 13:
                            if (!m8465(abstractC5212, abstractC5213, i) || AbstractC0667.m1480(j, abstractC5212) != AbstractC0667.m1480(j, abstractC5213)) {
                            }
                            break;
                        case 14:
                            if (!m8465(abstractC5212, abstractC5213, i) || AbstractC0667.m1476(j, abstractC5212) != AbstractC0667.m1476(j, abstractC5213)) {
                            }
                            break;
                        case 15:
                            if (!m8465(abstractC5212, abstractC5213, i) || AbstractC0667.m1480(j, abstractC5212) != AbstractC0667.m1480(j, abstractC5213)) {
                            }
                            break;
                        case 16:
                            if (!m8465(abstractC5212, abstractC5213, i) || AbstractC0667.m1476(j, abstractC5212) != AbstractC0667.m1476(j, abstractC5213)) {
                            }
                            break;
                        case 17:
                            if (!m8465(abstractC5212, abstractC5213, i) || !AbstractC2569.m4857(AbstractC0667.m1478(j, abstractC5212), AbstractC0667.m1478(j, abstractC5213))) {
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
                            zM4857 = AbstractC2569.m4857(AbstractC0667.m1478(j, abstractC5212), AbstractC0667.m1478(j, abstractC5213));
                            if (zM4857) {
                            }
                            break;
                        case 50:
                            zM4857 = AbstractC2569.m4857(AbstractC0667.m1478(j, abstractC5212), AbstractC0667.m1478(j, abstractC5213));
                            if (zM4857) {
                            }
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
                            if (AbstractC0667.m1480(j2, abstractC5212) == AbstractC0667.m1480(j2, abstractC5213) && AbstractC2569.m4857(AbstractC0667.m1478(j, abstractC5212), AbstractC0667.m1478(j, abstractC5213))) {
                            }
                            break;
                        default:
                            continue;
                    }
                }
                i += 3;
            } else {
                int i2 = this.f16658;
                while (true) {
                    int[] iArr2 = this.f16659;
                    if (i2 < iArr2.length) {
                        int i3 = iArr2[i2];
                        long j3 = iArr[i3 + 2] & 1048575;
                        if (AbstractC0667.m1480(j3, abstractC5212) != AbstractC0667.m1480(j3, abstractC5213)) {
                            return false;
                        }
                        if (!m8478(0, i3, abstractC5212)) {
                            long jM8480 = m8480(i3) & 1048575;
                            if (!AbstractC2569.m4857(AbstractC0667.m1478(jM8480, abstractC5212), AbstractC0667.m1478(jM8480, abstractC5213))) {
                            }
                        }
                        i2++;
                    } else if (abstractC5212.zzc.equals(abstractC5213.zzc)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // p000.InterfaceC0759
    /* JADX INFO: renamed from: ۥۣ */
    public final AbstractC5212 mo1651() {
        return ((AbstractC5212) this.f16651).m8831();
    }

    /* JADX INFO: renamed from: ۥۦ */
    public final void m8472(int i, int i2, Object obj, Object obj2) {
        f16648.putObject(obj, m8480(i2) & 1048575, obj2);
        m8481(i, i2, obj);
    }

    /* JADX INFO: renamed from: ۥۧ */
    public final void m8473(int i, Object obj, Object obj2) {
        int[] iArr = this.f16655;
        int i2 = iArr[i];
        if (m8478(i2, i, obj2)) {
            long jM8480 = m8480(i) & 1048575;
            Unsafe unsafe = f16648;
            Object object = unsafe.getObject(obj2, jM8480);
            if (object == null) {
                int i3 = iArr[i];
                String string = obj2.toString();
                StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 38 + string.length());
                sb.append("Source subfield ");
                sb.append(i3);
                sb.append(" is present but null: ");
                sb.append(string);
                throw new IllegalStateException(sb.toString());
            }
            InterfaceC0759 interfaceC0759M8463 = m8463(i);
            if (!m8478(i2, i, obj)) {
                if (m8457(object)) {
                    AbstractC5212 abstractC5212Mo1651 = interfaceC0759M8463.mo1651();
                    interfaceC0759M8463.mo1646(abstractC5212Mo1651, object);
                    unsafe.putObject(obj, jM8480, abstractC5212Mo1651);
                } else {
                    unsafe.putObject(obj, jM8480, object);
                }
                m8481(i2, i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jM8480);
            if (!m8457(object2)) {
                AbstractC5212 abstractC5212Mo1652 = interfaceC0759M8463.mo1651();
                interfaceC0759M8463.mo1646(abstractC5212Mo1652, object2);
                unsafe.putObject(obj, jM8480, abstractC5212Mo1652);
                object2 = abstractC5212Mo1652;
            }
            interfaceC0759M8463.mo1646(object2, object);
        }
    }

    /* JADX WARN: Code duplicated, block: B:187:0x048d  */
    /* JADX WARN: Code duplicated, block: B:219:0x057d  */
    /* JADX WARN: Code duplicated, block: B:222:0x058b  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:38:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:85:0x01d2  */
    @Override // p000.InterfaceC0759
    /* JADX INFO: renamed from: ۦؑ */
    public final int mo1652(AbstractC3127 abstractC3127) {
        int i;
        int iM935;
        int iM934;
        int iM936;
        int iM8426;
        int iM937;
        int iMo5753;
        int i2;
        int iM938;
        int iM4845;
        int i3;
        int iMo5754;
        int iM939;
        int size;
        int iM4847;
        int iM9310;
        int iM9311;
        int iM9312;
        int size2;
        int iM9313;
        int iMo5755;
        int iM9314;
        int iM9315;
        int iM9316;
        int iM8427;
        int iM8461;
        int iM9317;
        int i4 = 1048575;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        int iM4000 = 0;
        while (true) {
            int[] iArr = this.f16655;
            if (i6 >= iArr.length) {
                return ((AbstractC5212) abstractC3127).zzc.m5887() + iM4000;
            }
            int iM8480 = m8480(i6);
            int iM8456 = m8456(iM8480);
            int i8 = iArr[i6];
            int i9 = iArr[i6 + 2];
            int i10 = i9 & i4;
            Unsafe unsafe = f16648;
            if (iM8456 <= 17) {
                if (i10 != i5) {
                    i7 = i10 == i4 ? 0 : unsafe.getInt(abstractC3127, i10);
                    i5 = i10;
                }
                i = 1 << (i9 >>> 20);
            } else {
                i = 0;
            }
            int i11 = iM8480 & i4;
            if (iM8456 >= EnumC0233.f878.f879) {
                int i12 = EnumC0233.f876.f879;
            }
            long j = i11;
            switch (iM8456) {
                case 0:
                    if (m8466(abstractC3127, i6, i5, i7, i)) {
                        iM4000 = AbstractC2049.m4000(i8 << 3, 8, iM4000);
                    }
                    break;
                case 1:
                    if (m8466(abstractC3127, i6, i5, i7, i)) {
                        iM4000 = AbstractC2049.m4000(i8 << 3, 4, iM4000);
                    }
                    break;
                case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                    if (m8466(abstractC3127, i6, i5, i7, i)) {
                        long j2 = unsafe.getLong(abstractC3127, j);
                        iM935 = AbstractC0438.m935(i8 << 3);
                        iM934 = AbstractC0438.m934(j2);
                        iM4845 = iM934 + iM935;
                        iM4000 += iM4845;
                    }
                    break;
                case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                    if (m8466(abstractC3127, i6, i5, i7, i)) {
                        long j3 = unsafe.getLong(abstractC3127, j);
                        iM935 = AbstractC0438.m935(i8 << 3);
                        iM934 = AbstractC0438.m934(j3);
                        iM4845 = iM934 + iM935;
                        iM4000 += iM4845;
                    }
                    break;
                case C4261.LONG_FIELD_NUMBER /* 4 */:
                    if (m8466(abstractC3127, i6, i5, i7, i)) {
                        long j4 = unsafe.getInt(abstractC3127, j);
                        iM935 = AbstractC0438.m935(i8 << 3);
                        iM934 = AbstractC0438.m934(j4);
                        iM4845 = iM934 + iM935;
                        iM4000 += iM4845;
                    }
                    break;
                case C4261.STRING_FIELD_NUMBER /* 5 */:
                    if (m8466(abstractC3127, i6, i5, i7, i)) {
                        iM4000 = AbstractC2049.m4000(i8 << 3, 8, iM4000);
                    }
                    break;
                case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (m8466(abstractC3127, i6, i5, i7, i)) {
                        iM4000 = AbstractC2049.m4000(i8 << 3, 4, iM4000);
                    }
                    break;
                case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (m8466(abstractC3127, i6, i5, i7, i)) {
                        iM4000 = AbstractC2049.m4000(i8 << 3, 1, iM4000);
                    }
                    break;
                case 8:
                    if (m8466(abstractC3127, i6, i5, i7, i)) {
                        int i13 = i8 << 3;
                        Object object = unsafe.getObject(abstractC3127, j);
                        if (object instanceof AbstractC4314) {
                            iM936 = AbstractC0438.m935(i13);
                            iM8426 = ((AbstractC4314) object).mo7605();
                        } else {
                            iM936 = AbstractC0438.m935(i13);
                            iM8426 = AbstractC5011.m8426((String) object);
                        }
                        iM4000 = AbstractC2049.m3994(iM8426, iM8426, iM936, iM4000);
                    }
                    break;
                case 9:
                    if (m8466(abstractC3127, i6, i5, i7, i)) {
                        Object object2 = unsafe.getObject(abstractC3127, j);
                        InterfaceC0759 interfaceC0759M8463 = m8463(i6);
                        C1397 c1397 = AbstractC2569.f8579;
                        iM937 = AbstractC0438.m935(i8 << 3);
                        iMo5753 = ((AbstractC3127) object2).mo5753(interfaceC0759M8463);
                        iM4000 = AbstractC2049.m3994(iMo5753, iMo5753, iM937, iM4000);
                    }
                    break;
                case 10:
                    if (m8466(abstractC3127, i6, i5, i7, i)) {
                        AbstractC4314 abstractC4314 = (AbstractC4314) unsafe.getObject(abstractC3127, j);
                        iM936 = AbstractC0438.m935(i8 << 3);
                        iM8426 = abstractC4314.mo7605();
                        iM4000 = AbstractC2049.m3994(iM8426, iM8426, iM936, iM4000);
                    }
                    break;
                case 11:
                    if (m8466(abstractC3127, i6, i5, i7, i)) {
                        i2 = unsafe.getInt(abstractC3127, j);
                        iM938 = AbstractC0438.m935(i8 << 3);
                        iM4000 = AbstractC2049.m4000(i2, iM938, iM4000);
                    }
                    break;
                case 12:
                    if (m8466(abstractC3127, i6, i5, i7, i)) {
                        long j5 = unsafe.getInt(abstractC3127, j);
                        iM935 = AbstractC0438.m935(i8 << 3);
                        iM934 = AbstractC0438.m934(j5);
                        iM4845 = iM934 + iM935;
                        iM4000 += iM4845;
                    }
                    break;
                case 13:
                    if (m8466(abstractC3127, i6, i5, i7, i)) {
                        iM4000 = AbstractC2049.m4000(i8 << 3, 4, iM4000);
                    }
                    break;
                case 14:
                    if (m8466(abstractC3127, i6, i5, i7, i)) {
                        iM4000 = AbstractC2049.m4000(i8 << 3, 8, iM4000);
                    }
                    break;
                case 15:
                    if (m8466(abstractC3127, i6, i5, i7, i)) {
                        int i14 = unsafe.getInt(abstractC3127, j);
                        iM938 = AbstractC0438.m935(i8 << 3);
                        i2 = (i14 >> 31) ^ (i14 + i14);
                        iM4000 = AbstractC2049.m4000(i2, iM938, iM4000);
                    }
                    break;
                case 16:
                    if (m8466(abstractC3127, i6, i5, i7, i)) {
                        long j6 = unsafe.getLong(abstractC3127, j);
                        iM935 = AbstractC0438.m935(i8 << 3);
                        iM934 = AbstractC0438.m934((j6 >> 63) ^ (j6 + j6));
                        iM4845 = iM934 + iM935;
                        iM4000 += iM4845;
                    }
                    break;
                case 17:
                    if (m8466(abstractC3127, i6, i5, i7, i)) {
                        AbstractC3127 abstractC3128 = (AbstractC3127) unsafe.getObject(abstractC3127, j);
                        InterfaceC0759 interfaceC0759M8464 = m8463(i6);
                        C1397 c1398 = AbstractC2569.f8579;
                        int iM9318 = AbstractC0438.m935(i8 << 3);
                        i3 = iM9318 + iM9318;
                        iMo5754 = abstractC3128.mo5753(interfaceC0759M8464);
                        iM4845 = iMo5754 + i3;
                        iM4000 += iM4845;
                    }
                    break;
                case 18:
                    iM4845 = AbstractC2569.m4845(i8, (List) unsafe.getObject(abstractC3127, j));
                    iM4000 += iM4845;
                    break;
                case 19:
                    iM4845 = AbstractC2569.m4853(i8, (List) unsafe.getObject(abstractC3127, j));
                    iM4000 += iM4845;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(abstractC3127, j);
                    C1397 c1399 = AbstractC2569.f8579;
                    if (list.size() == 0) {
                        iM939 = 0;
                    } else {
                        iM939 = (AbstractC0438.m935(i8 << 3) * list.size()) + AbstractC2569.m4851(list);
                    }
                    iM4000 += iM939;
                    break;
                case 21:
                    List list2 = (List) unsafe.getObject(abstractC3127, j);
                    C1397 c13910 = AbstractC2569.f8579;
                    size = list2.size();
                    if (size == 0) {
                        iM9311 = 0;
                    } else {
                        iM4847 = AbstractC2569.m4847(list2);
                        iM9310 = AbstractC0438.m935(i8 << 3);
                        iM9311 = (iM9310 * size) + iM4847;
                    }
                    iM4000 += iM9311;
                    break;
                case 22:
                    List list3 = (List) unsafe.getObject(abstractC3127, j);
                    C1397 c13911 = AbstractC2569.f8579;
                    size = list3.size();
                    if (size == 0) {
                        iM9311 = 0;
                    } else {
                        iM4847 = AbstractC2569.m4868(list3);
                        iM9310 = AbstractC0438.m935(i8 << 3);
                        iM9311 = (iM9310 * size) + iM4847;
                    }
                    iM4000 += iM9311;
                    break;
                case 23:
                    iM4845 = AbstractC2569.m4845(i8, (List) unsafe.getObject(abstractC3127, j));
                    iM4000 += iM4845;
                    break;
                case 24:
                    iM4845 = AbstractC2569.m4853(i8, (List) unsafe.getObject(abstractC3127, j));
                    iM4000 += iM4845;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(abstractC3127, j);
                    C1397 c13912 = AbstractC2569.f8579;
                    int size3 = list4.size();
                    if (size3 == 0) {
                        iM939 = 0;
                    } else {
                        iM939 = (AbstractC0438.m935(i8 << 3) + 1) * size3;
                    }
                    iM4000 += iM939;
                    break;
                case 26:
                    List list5 = (List) unsafe.getObject(abstractC3127, j);
                    C1397 c13913 = AbstractC2569.f8579;
                    int size4 = list5.size();
                    if (size4 == 0) {
                        iM9311 = 0;
                    } else {
                        iM9311 = AbstractC0438.m935(i8 << 3) * size4;
                        for (int i15 = 0; i15 < size4; i15++) {
                            Object obj = list5.get(i15);
                            int iMo7605 = obj instanceof AbstractC4314 ? ((AbstractC4314) obj).mo7605() : AbstractC5011.m8426((String) obj);
                            iM9311 = AbstractC2049.m4000(iMo7605, iMo7605, iM9311);
                        }
                    }
                    iM4000 += iM9311;
                    break;
                case 27:
                    List list6 = (List) unsafe.getObject(abstractC3127, j);
                    InterfaceC0759 interfaceC0759M8465 = m8463(i6);
                    C1397 c13914 = AbstractC2569.f8579;
                    int size5 = list6.size();
                    if (size5 == 0) {
                        iM9312 = 0;
                    } else {
                        iM9312 = AbstractC0438.m935(i8 << 3) * size5;
                        for (int i16 = 0; i16 < size5; i16++) {
                            int iMo5756 = ((AbstractC3127) list6.get(i16)).mo5753(interfaceC0759M8465);
                            iM9312 = AbstractC2049.m4000(iMo5756, iMo5756, iM9312);
                        }
                    }
                    iM4000 += iM9312;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(abstractC3127, j);
                    C1397 c13915 = AbstractC2569.f8579;
                    int size6 = list7.size();
                    if (size6 == 0) {
                        iM9311 = 0;
                    } else {
                        iM9311 = AbstractC0438.m935(i8 << 3) * size6;
                        for (int i17 = 0; i17 < list7.size(); i17++) {
                            int iMo7606 = ((AbstractC4314) list7.get(i17)).mo7605();
                            iM9311 = AbstractC2049.m4000(iMo7606, iMo7606, iM9311);
                        }
                    }
                    iM4000 += iM9311;
                    break;
                case 29:
                    List list8 = (List) unsafe.getObject(abstractC3127, j);
                    C1397 c13916 = AbstractC2569.f8579;
                    size = list8.size();
                    if (size == 0) {
                        iM9311 = 0;
                    } else {
                        iM4847 = AbstractC2569.m4854(list8);
                        iM9310 = AbstractC0438.m935(i8 << 3);
                        iM9311 = (iM9310 * size) + iM4847;
                    }
                    iM4000 += iM9311;
                    break;
                case 30:
                    List list9 = (List) unsafe.getObject(abstractC3127, j);
                    C1397 c13917 = AbstractC2569.f8579;
                    size = list9.size();
                    if (size == 0) {
                        iM9311 = 0;
                    } else {
                        iM4847 = AbstractC2569.m4863(list9);
                        iM9310 = AbstractC0438.m935(i8 << 3);
                        iM9311 = (iM9310 * size) + iM4847;
                    }
                    iM4000 += iM9311;
                    break;
                case 31:
                    iM4845 = AbstractC2569.m4853(i8, (List) unsafe.getObject(abstractC3127, j));
                    iM4000 += iM4845;
                    break;
                case 32:
                    iM4845 = AbstractC2569.m4845(i8, (List) unsafe.getObject(abstractC3127, j));
                    iM4000 += iM4845;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(abstractC3127, j);
                    C1397 c13918 = AbstractC2569.f8579;
                    size = list10.size();
                    if (size == 0) {
                        iM9311 = 0;
                    } else {
                        iM4847 = AbstractC2569.m4862(list10);
                        iM9310 = AbstractC0438.m935(i8 << 3);
                        iM9311 = (iM9310 * size) + iM4847;
                    }
                    iM4000 += iM9311;
                    break;
                case 34:
                    List list11 = (List) unsafe.getObject(abstractC3127, j);
                    C1397 c13919 = AbstractC2569.f8579;
                    size = list11.size();
                    if (size == 0) {
                        iM9311 = 0;
                    } else {
                        iM4847 = AbstractC2569.m4852(list11);
                        iM9310 = AbstractC0438.m935(i8 << 3);
                        iM9311 = (iM9310 * size) + iM4847;
                    }
                    iM4000 += iM9311;
                    break;
                case 35:
                    List list12 = (List) unsafe.getObject(abstractC3127, j);
                    C1397 c13920 = AbstractC2569.f8579;
                    size2 = list12.size() * 8;
                    if (size2 > 0) {
                        iM9313 = AbstractC0438.m935(i8 << 3);
                        iM4000 = AbstractC2049.m3994(size2, iM9313, size2, iM4000);
                    }
                    break;
                case 36:
                    List list13 = (List) unsafe.getObject(abstractC3127, j);
                    C1397 c13921 = AbstractC2569.f8579;
                    size2 = list13.size() * 4;
                    if (size2 > 0) {
                        iM9313 = AbstractC0438.m935(i8 << 3);
                        iM4000 = AbstractC2049.m3994(size2, iM9313, size2, iM4000);
                    }
                    break;
                case 37:
                    size2 = AbstractC2569.m4851((List) unsafe.getObject(abstractC3127, j));
                    if (size2 > 0) {
                        iM9313 = AbstractC0438.m935(i8 << 3);
                        iM4000 = AbstractC2049.m3994(size2, iM9313, size2, iM4000);
                    }
                    break;
                case 38:
                    size2 = AbstractC2569.m4847((List) unsafe.getObject(abstractC3127, j));
                    if (size2 > 0) {
                        iM9313 = AbstractC0438.m935(i8 << 3);
                        iM4000 = AbstractC2049.m3994(size2, iM9313, size2, iM4000);
                    }
                    break;
                case 39:
                    size2 = AbstractC2569.m4868((List) unsafe.getObject(abstractC3127, j));
                    if (size2 > 0) {
                        iM9313 = AbstractC0438.m935(i8 << 3);
                        iM4000 = AbstractC2049.m3994(size2, iM9313, size2, iM4000);
                    }
                    break;
                case 40:
                    List list14 = (List) unsafe.getObject(abstractC3127, j);
                    C1397 c13922 = AbstractC2569.f8579;
                    size2 = list14.size() * 8;
                    if (size2 > 0) {
                        iM9313 = AbstractC0438.m935(i8 << 3);
                        iM4000 = AbstractC2049.m3994(size2, iM9313, size2, iM4000);
                    }
                    break;
                case 41:
                    List list15 = (List) unsafe.getObject(abstractC3127, j);
                    C1397 c13923 = AbstractC2569.f8579;
                    size2 = list15.size() * 4;
                    if (size2 > 0) {
                        iM9313 = AbstractC0438.m935(i8 << 3);
                        iM4000 = AbstractC2049.m3994(size2, iM9313, size2, iM4000);
                    }
                    break;
                case 42:
                    List list16 = (List) unsafe.getObject(abstractC3127, j);
                    C1397 c13924 = AbstractC2569.f8579;
                    size2 = list16.size();
                    if (size2 > 0) {
                        iM9313 = AbstractC0438.m935(i8 << 3);
                        iM4000 = AbstractC2049.m3994(size2, iM9313, size2, iM4000);
                    }
                    break;
                case 43:
                    size2 = AbstractC2569.m4854((List) unsafe.getObject(abstractC3127, j));
                    if (size2 > 0) {
                        iM9313 = AbstractC0438.m935(i8 << 3);
                        iM4000 = AbstractC2049.m3994(size2, iM9313, size2, iM4000);
                    }
                    break;
                case 44:
                    size2 = AbstractC2569.m4863((List) unsafe.getObject(abstractC3127, j));
                    if (size2 > 0) {
                        iM9313 = AbstractC0438.m935(i8 << 3);
                        iM4000 = AbstractC2049.m3994(size2, iM9313, size2, iM4000);
                    }
                    break;
                case 45:
                    List list17 = (List) unsafe.getObject(abstractC3127, j);
                    C1397 c13925 = AbstractC2569.f8579;
                    size2 = list17.size() * 4;
                    if (size2 > 0) {
                        iM9313 = AbstractC0438.m935(i8 << 3);
                        iM4000 = AbstractC2049.m3994(size2, iM9313, size2, iM4000);
                    }
                    break;
                case 46:
                    List list18 = (List) unsafe.getObject(abstractC3127, j);
                    C1397 c13926 = AbstractC2569.f8579;
                    size2 = list18.size() * 8;
                    if (size2 > 0) {
                        iM9313 = AbstractC0438.m935(i8 << 3);
                        iM4000 = AbstractC2049.m3994(size2, iM9313, size2, iM4000);
                    }
                    break;
                case 47:
                    size2 = AbstractC2569.m4862((List) unsafe.getObject(abstractC3127, j));
                    if (size2 > 0) {
                        iM9313 = AbstractC0438.m935(i8 << 3);
                        iM4000 = AbstractC2049.m3994(size2, iM9313, size2, iM4000);
                    }
                    break;
                case 48:
                    size2 = AbstractC2569.m4852((List) unsafe.getObject(abstractC3127, j));
                    if (size2 > 0) {
                        iM9313 = AbstractC0438.m935(i8 << 3);
                        iM4000 = AbstractC2049.m3994(size2, iM9313, size2, iM4000);
                    }
                    break;
                case 49:
                    List list19 = (List) unsafe.getObject(abstractC3127, j);
                    InterfaceC0759 interfaceC0759M8466 = m8463(i6);
                    C1397 c13927 = AbstractC2569.f8579;
                    int size7 = list19.size();
                    if (size7 == 0) {
                        iMo5755 = 0;
                    } else {
                        iMo5755 = 0;
                        for (int i18 = 0; i18 < size7; i18++) {
                            AbstractC3127 abstractC3129 = (AbstractC3127) list19.get(i18);
                            int iM9319 = AbstractC0438.m935(i8 << 3);
                            iMo5755 += abstractC3129.mo5753(interfaceC0759M8466) + iM9319 + iM9319;
                        }
                    }
                    iM4000 += iMo5755;
                    break;
                case 50:
                    C3775 c3775 = (C3775) unsafe.getObject(abstractC3127, j);
                    C3521 c3521 = (C3521) m8479(i6);
                    if (c3775.isEmpty()) {
                        iM9311 = 0;
                    } else {
                        iM9311 = 0;
                        for (Map.Entry entry : c3775.entrySet()) {
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            C5460 c5460 = c3521.f11660;
                            int iM9320 = AbstractC0438.m935(i8 << 3);
                            int iM6311 = C3521.m6311(c5460, key, value);
                            iM9311 = AbstractC2049.m3994(iM6311, iM6311, iM9320, iM9311);
                        }
                    }
                    iM4000 += iM9311;
                    break;
                case 51:
                    if (m8478(i8, i6, abstractC3127)) {
                        iM4000 = AbstractC2049.m4000(i8 << 3, 8, iM4000);
                    }
                    break;
                case 52:
                    if (m8478(i8, i6, abstractC3127)) {
                        iM4000 = AbstractC2049.m4000(i8 << 3, 4, iM4000);
                    }
                    break;
                case 53:
                    if (m8478(i8, i6, abstractC3127)) {
                        long jM8460 = m8460(j, abstractC3127);
                        iM9314 = AbstractC0438.m935(i8 << 3);
                        iM9315 = AbstractC0438.m934(jM8460);
                        iM4000 += iM9315 + iM9314;
                    }
                    break;
                case 54:
                    if (m8478(i8, i6, abstractC3127)) {
                        long jM8461 = m8460(j, abstractC3127);
                        iM9314 = AbstractC0438.m935(i8 << 3);
                        iM9315 = AbstractC0438.m934(jM8461);
                        iM4000 += iM9315 + iM9314;
                    }
                    break;
                case 55:
                    if (m8478(i8, i6, abstractC3127)) {
                        long jM8462 = m8461(j, abstractC3127);
                        iM9314 = AbstractC0438.m935(i8 << 3);
                        iM9315 = AbstractC0438.m934(jM8462);
                        iM4000 += iM9315 + iM9314;
                    }
                    break;
                case 56:
                    if (m8478(i8, i6, abstractC3127)) {
                        iM4000 = AbstractC2049.m4000(i8 << 3, 8, iM4000);
                    }
                    break;
                case 57:
                    if (m8478(i8, i6, abstractC3127)) {
                        iM4000 = AbstractC2049.m4000(i8 << 3, 4, iM4000);
                    }
                    break;
                case 58:
                    if (m8478(i8, i6, abstractC3127)) {
                        iM4000 = AbstractC2049.m4000(i8 << 3, 1, iM4000);
                    }
                    break;
                case 59:
                    if (m8478(i8, i6, abstractC3127)) {
                        int i19 = i8 << 3;
                        Object object3 = unsafe.getObject(abstractC3127, j);
                        if (object3 instanceof AbstractC4314) {
                            iM9316 = AbstractC0438.m935(i19);
                            iM8427 = ((AbstractC4314) object3).mo7605();
                        } else {
                            iM9316 = AbstractC0438.m935(i19);
                            iM8427 = AbstractC5011.m8426((String) object3);
                        }
                        iM4000 = AbstractC2049.m3994(iM8427, iM8427, iM9316, iM4000);
                    }
                    break;
                case 60:
                    if (m8478(i8, i6, abstractC3127)) {
                        Object object4 = unsafe.getObject(abstractC3127, j);
                        InterfaceC0759 interfaceC0759M8467 = m8463(i6);
                        C1397 c13928 = AbstractC2569.f8579;
                        iM937 = AbstractC0438.m935(i8 << 3);
                        iMo5753 = ((AbstractC3127) object4).mo5753(interfaceC0759M8467);
                        iM4000 = AbstractC2049.m3994(iMo5753, iMo5753, iM937, iM4000);
                    }
                    break;
                case 61:
                    if (m8478(i8, i6, abstractC3127)) {
                        AbstractC4314 abstractC4315 = (AbstractC4314) unsafe.getObject(abstractC3127, j);
                        iM9316 = AbstractC0438.m935(i8 << 3);
                        iM8427 = abstractC4315.mo7605();
                        iM4000 = AbstractC2049.m3994(iM8427, iM8427, iM9316, iM4000);
                    }
                    break;
                case 62:
                    if (m8478(i8, i6, abstractC3127)) {
                        iM8461 = m8461(j, abstractC3127);
                        iM9317 = AbstractC0438.m935(i8 << 3);
                        iM4000 = AbstractC2049.m4000(iM8461, iM9317, iM4000);
                    }
                    break;
                case 63:
                    if (m8478(i8, i6, abstractC3127)) {
                        long jM8463 = m8461(j, abstractC3127);
                        iM9314 = AbstractC0438.m935(i8 << 3);
                        iM9315 = AbstractC0438.m934(jM8463);
                        iM4000 += iM9315 + iM9314;
                    }
                    break;
                case 64:
                    if (m8478(i8, i6, abstractC3127)) {
                        iM4000 = AbstractC2049.m4000(i8 << 3, 4, iM4000);
                    }
                    break;
                case 65:
                    if (m8478(i8, i6, abstractC3127)) {
                        iM4000 = AbstractC2049.m4000(i8 << 3, 8, iM4000);
                    }
                    break;
                case 66:
                    if (m8478(i8, i6, abstractC3127)) {
                        int iM8462 = m8461(j, abstractC3127);
                        iM9317 = AbstractC0438.m935(i8 << 3);
                        iM8461 = (iM8462 >> 31) ^ (iM8462 + iM8462);
                        iM4000 = AbstractC2049.m4000(iM8461, iM9317, iM4000);
                    }
                    break;
                case 67:
                    if (m8478(i8, i6, abstractC3127)) {
                        long jM8464 = m8460(j, abstractC3127);
                        iM9314 = AbstractC0438.m935(i8 << 3);
                        iM9315 = AbstractC0438.m934((jM8464 >> 63) ^ (jM8464 + jM8464));
                        iM4000 += iM9315 + iM9314;
                    }
                    break;
                case 68:
                    if (m8478(i8, i6, abstractC3127)) {
                        AbstractC3127 abstractC31210 = (AbstractC3127) unsafe.getObject(abstractC3127, j);
                        InterfaceC0759 interfaceC0759M8468 = m8463(i6);
                        C1397 c13929 = AbstractC2569.f8579;
                        int iM9321 = AbstractC0438.m935(i8 << 3);
                        i3 = iM9321 + iM9321;
                        iMo5754 = abstractC31210.mo5753(interfaceC0759M8468);
                        iM4845 = iMo5754 + i3;
                        iM4000 += iM4845;
                    }
                    break;
            }
            i6 += 3;
            i4 = 1048575;
        }
    }

    /* JADX INFO: renamed from: ۦؖ */
    public final Object m8474(int i, int i2, Object obj) {
        InterfaceC0759 interfaceC0759M8463 = m8463(i2);
        if (!m8478(i, i2, obj)) {
            return interfaceC0759M8463.mo1651();
        }
        Object object = f16648.getObject(obj, m8480(i2) & 1048575);
        if (m8457(object)) {
            return object;
        }
        AbstractC5212 abstractC5212Mo1651 = interfaceC0759M8463.mo1651();
        if (object != null) {
            interfaceC0759M8463.mo1646(abstractC5212Mo1651, object);
        }
        return abstractC5212Mo1651;
    }

    /* JADX INFO: renamed from: ۦؗ */
    public final Object m8475(Object obj, int i, Object obj2, C1397 c1397, Object obj3) {
        C2068 c2068M8467;
        int i2 = this.f16655[i];
        Object objM1478 = AbstractC0667.m1478(m8480(i) & 1048575, obj);
        if (objM1478 == null || (c2068M8467 = m8467(i)) == null) {
            return obj2;
        }
        C5460 c5460 = ((C3521) m8479(i)).f11660;
        Iterator it = ((C3775) objM1478).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!c2068M8467.m4013(((Integer) entry.getValue()).intValue())) {
                if (obj2 == null) {
                    c1397.getClass();
                    obj2 = C1397.m2959(obj3);
                }
                int iM6311 = C3521.m6311(c5460, entry.getKey(), entry.getValue());
                C4585 c4585 = AbstractC4314.f14260;
                byte[] bArr = new byte[iM6311];
                boolean z = AbstractC0438.f1609;
                C4155 c4155 = new C4155(iM6311, bArr);
                try {
                    C3521.m6312(c4155, c5460, entry.getKey(), entry.getValue());
                    if (c4155.m7350() > 0) {
                        C1078.m2276("Did not write as much data as expected.");
                        return null;
                    }
                    if (c4155.m7350() < 0) {
                        C1078.m2276("Wrote more data than expected.");
                        return null;
                    }
                    C4585 c4586 = new C4585(bArr);
                    c1397.getClass();
                    ((C3192) obj2).m5890((i2 << 3) | 2, c4586);
                    it.remove();
                } catch (IOException e) {
                    C5028.m8450(e);
                    return null;
                }
            }
        }
        return obj2;
    }

    /* JADX INFO: renamed from: ۦؙ */
    public final void m8476(int i, Object obj, Object obj2) {
        f16648.putObject(obj, m8480(i) & 1048575, obj2);
        m8468(i, obj);
    }

    /* JADX INFO: renamed from: ۦُ */
    public final void m8477(int i, C4902 c4902, Object obj) {
        AbstractC4650 abstractC4650 = (AbstractC4650) c4902.f16167;
        long j = i & 1048575;
        if ((536870912 & i) != 0) {
            c4902.m8260(2);
            AbstractC0667.m1484(j, obj, abstractC4650.mo4619());
        } else if (!this.f16652) {
            AbstractC0667.m1484(j, obj, c4902.m8294());
        } else {
            c4902.m8260(2);
            AbstractC0667.m1484(j, obj, abstractC4650.mo4606());
        }
    }

    @Override // p000.InterfaceC0759
    /* JADX INFO: renamed from: ۦِ */
    public final void mo1653(Object obj, byte[] bArr, int i, int i2, C0958 c0958) {
        m8469(obj, bArr, i, i2, 0, c0958);
    }

    /* JADX INFO: renamed from: ۦٗ */
    public final boolean m8478(int i, int i2, Object obj) {
        return AbstractC0667.m1480((long) (this.f16655[i2 + 2] & 1048575), obj) == i;
    }

    /* JADX INFO: renamed from: ۦٚ */
    public final Object m8479(int i) {
        int i2 = i / 3;
        return this.f16653[i2 + i2];
    }

    /* JADX WARN: Code duplicated, block: B:28:0x006f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x0080 A[SYNTHETIC] */
    @Override // p000.InterfaceC0759
    /* JADX INFO: renamed from: ۦٛ */
    public final void mo1654(Object obj) {
        if (!m8457(obj)) {
            return;
        }
        if (obj instanceof AbstractC5212) {
            AbstractC5212 abstractC5212 = (AbstractC5212) obj;
            abstractC5212.m8828();
            abstractC5212.zza = 0;
            abstractC5212.m8825();
        }
        int i = 0;
        while (true) {
            int[] iArr = this.f16655;
            if (i >= iArr.length) {
                this.f16657.getClass();
                C3192 c3192 = ((AbstractC5212) obj).zzc;
                if (c3192.f10723) {
                    c3192.f10723 = false;
                    return;
                }
                return;
            }
            int iM8480 = m8480(i);
            int i2 = 1048575 & iM8480;
            int iM8456 = m8456(iM8480);
            long j = i2;
            Unsafe unsafe = f16648;
            if (iM8456 != 9) {
                if (iM8456 != 60 && iM8456 != 68) {
                    switch (iM8456) {
                        case 17:
                            if (m8464(i, obj)) {
                                m8463(i).mo1654(unsafe.getObject(obj, j));
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
                            AbstractC1864 abstractC1864 = (AbstractC1864) ((InterfaceC5083) AbstractC0667.m1478(j, obj));
                            if (abstractC1864.f6207) {
                                abstractC1864.f6207 = false;
                            }
                            break;
                        case 50:
                            Object object = unsafe.getObject(obj, j);
                            if (object != null) {
                                ((C3775) object).f12548 = false;
                                unsafe.putObject(obj, j, object);
                            }
                            break;
                    }
                } else if (m8478(iArr[i], i, obj)) {
                    m8463(i).mo1654(unsafe.getObject(obj, j));
                }
            } else if (m8464(i, obj)) {
                m8463(i).mo1654(unsafe.getObject(obj, j));
            }
            i += 3;
        }
    }

    /* JADX INFO: renamed from: ۦۗ */
    public final int m8480(int i) {
        return this.f16655[i + 1];
    }

    /* JADX WARN: Code duplicated, block: B:207:0x07c0 A[LOOP:3: B:206:0x07be->B:207:0x07c0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:209:0x07d5  */
    /* JADX WARN: Code duplicated, block: B:211:0x07e1  */
    /* JADX WARN: Code duplicated, block: B:217:0x07ed A[LOOP:1: B:216:0x07eb->B:217:0x07ed, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:219:0x07fe  */
    /* JADX WARN: Code duplicated, block: B:222:0x07ac A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:324:0x07bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:348:? A[RETURN, SYNTHETIC] */
    @Override // p000.InterfaceC0759
    /* JADX INFO: renamed from: ۦۙ */
    public final void mo1655(Object obj, C4902 c4902, C2955 c2955) throws Throwable {
        Object obj2;
        Object objM8475;
        Object objM8476;
        C5031 c5031;
        C1397 c1397;
        Object obj3;
        C5031 c5032;
        Object objM2959;
        Object obj4;
        C5031 c5033 = this;
        AbstractC4650 abstractC4650 = (AbstractC4650) c4902.f16167;
        int[] iArr = c5033.f16659;
        int i = c5033.f16658;
        int i2 = c5033.f16654;
        c2955.getClass();
        m8459(obj);
        C1397 c1398 = c5033.f16657;
        Object objM29510 = null;
        while (true) {
            try {
                int iM8272 = c4902.m8272();
                int iM8470 = (iM8272 < c5033.f16650 || iM8272 > c5033.f16656) ? -1 : c5033.m8470(iM8272, 0);
                if (iM8470 >= 0) {
                    int iM8480 = c5033.m8480(iM8470);
                    try {
                        try {
                            switch (m8456(iM8480)) {
                                case 0:
                                    obj2 = objM29510;
                                    c1397 = c1398;
                                    C5031 c5034 = c5033;
                                    int i3 = iM8480 & 1048575;
                                    try {
                                        c4902.m8260(1);
                                        c5031 = c5034;
                                        AbstractC0667.f2454.mo5387(obj, i3, abstractC4650.mo4627());
                                        c5031.m8468(iM8470, obj);
                                        c5033 = c5031;
                                        c1398 = c1397;
                                        objM29510 = obj2;
                                    } catch (Throwable th) {
                                        th = th;
                                        c1398 = c1397;
                                        objM29510 = obj2;
                                        objM8475 = objM29510;
                                        while (i2 < i) {
                                            objM8475 = m8475(obj, iArr[i2], objM8475, c1398, obj);
                                            i2++;
                                        }
                                        if (objM8475 != null) {
                                            c1398.getClass();
                                            ((AbstractC5212) obj).zzc = (C3192) objM8475;
                                        }
                                        throw th;
                                    }
                                    break;
                                case 1:
                                    obj2 = objM29510;
                                    c1397 = c1398;
                                    c5032 = c5033;
                                    c4902.m8260(5);
                                    AbstractC0667.f2454.mo5386(obj, iM8480 & 1048575, abstractC4650.mo4626());
                                    c5032.m8468(iM8470, obj);
                                    c5031 = c5032;
                                    c5033 = c5031;
                                    c1398 = c1397;
                                    objM29510 = obj2;
                                    break;
                                case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                                    obj2 = objM29510;
                                    c1397 = c1398;
                                    c5032 = c5033;
                                    c4902.m8260(0);
                                    AbstractC0667.m1486(obj, iM8480 & 1048575, abstractC4650.mo4602());
                                    c5032.m8468(iM8470, obj);
                                    c5031 = c5032;
                                    c5033 = c5031;
                                    c1398 = c1397;
                                    objM29510 = obj2;
                                    break;
                                case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                                    obj2 = objM29510;
                                    c1397 = c1398;
                                    c5032 = c5033;
                                    c4902.m8260(0);
                                    AbstractC0667.m1486(obj, iM8480 & 1048575, abstractC4650.mo4601());
                                    c5032.m8468(iM8470, obj);
                                    c5031 = c5032;
                                    c5033 = c5031;
                                    c1398 = c1397;
                                    objM29510 = obj2;
                                    break;
                                case C4261.LONG_FIELD_NUMBER /* 4 */:
                                    obj2 = objM29510;
                                    c1397 = c1398;
                                    c5032 = c5033;
                                    c4902.m8260(0);
                                    AbstractC0667.m1475(abstractC4650.mo4598(), iM8480 & 1048575, obj);
                                    c5032.m8468(iM8470, obj);
                                    c5031 = c5032;
                                    c5033 = c5031;
                                    c1398 = c1397;
                                    objM29510 = obj2;
                                    break;
                                case C4261.STRING_FIELD_NUMBER /* 5 */:
                                    obj2 = objM29510;
                                    c1397 = c1398;
                                    c5032 = c5033;
                                    c4902.m8260(1);
                                    AbstractC0667.m1486(obj, iM8480 & 1048575, abstractC4650.mo4604());
                                    c5032.m8468(iM8470, obj);
                                    c5031 = c5032;
                                    c5033 = c5031;
                                    c1398 = c1397;
                                    objM29510 = obj2;
                                    break;
                                case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                                    obj2 = objM29510;
                                    c1397 = c1398;
                                    c5032 = c5033;
                                    c4902.m8260(5);
                                    AbstractC0667.m1475(abstractC4650.mo4621(), iM8480 & 1048575, obj);
                                    c5032.m8468(iM8470, obj);
                                    c5031 = c5032;
                                    c5033 = c5031;
                                    c1398 = c1397;
                                    objM29510 = obj2;
                                    break;
                                case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                                    obj2 = objM29510;
                                    c1397 = c1398;
                                    c5032 = c5033;
                                    c4902.m8260(0);
                                    AbstractC0667.f2454.mo5382(obj, iM8480 & 1048575, abstractC4650.mo4625());
                                    c5032.m8468(iM8470, obj);
                                    c5031 = c5032;
                                    c5033 = c5031;
                                    c1398 = c1397;
                                    objM29510 = obj2;
                                    break;
                                case 8:
                                    obj2 = objM29510;
                                    c1397 = c1398;
                                    c5032 = c5033;
                                    c5032.m8477(iM8480, c4902, obj);
                                    c5032.m8468(iM8470, obj);
                                    c5031 = c5032;
                                    c5033 = c5031;
                                    c1398 = c1397;
                                    objM29510 = obj2;
                                    break;
                                case 9:
                                    obj2 = objM29510;
                                    c1397 = c1398;
                                    c5032 = c5033;
                                    AbstractC3127 abstractC3127 = (AbstractC3127) c5032.m8471(iM8470, obj);
                                    InterfaceC0759 interfaceC0759M8463 = c5032.m8463(iM8470);
                                    c4902.m8260(2);
                                    c4902.m8266(abstractC3127, interfaceC0759M8463, c2955);
                                    c5032.m8476(iM8470, obj, abstractC3127);
                                    c5031 = c5032;
                                    c5033 = c5031;
                                    c1398 = c1397;
                                    objM29510 = obj2;
                                    break;
                                case 10:
                                    obj2 = objM29510;
                                    c1397 = c1398;
                                    c5032 = c5033;
                                    AbstractC0667.m1484(iM8480 & 1048575, obj, c4902.m8294());
                                    c5032.m8468(iM8470, obj);
                                    c5031 = c5032;
                                    c5033 = c5031;
                                    c1398 = c1397;
                                    objM29510 = obj2;
                                    break;
                                case 11:
                                    obj2 = objM29510;
                                    c1397 = c1398;
                                    c5032 = c5033;
                                    c4902.m8260(0);
                                    AbstractC0667.m1475(abstractC4650.mo4593(), iM8480 & 1048575, obj);
                                    c5032.m8468(iM8470, obj);
                                    c5031 = c5032;
                                    c5033 = c5031;
                                    c1398 = c1397;
                                    objM29510 = obj2;
                                    break;
                                case 12:
                                    obj2 = objM29510;
                                    c1397 = c1398;
                                    c5032 = c5033;
                                    c4902.m8260(0);
                                    int iMo4611 = abstractC4650.mo4611();
                                    C2068 c2068M8467 = c5032.m8467(iM8470);
                                    if (c2068M8467 != null && !c2068M8467.m4013(iMo4611)) {
                                        C1397 c1399 = AbstractC2569.f8579;
                                        if (obj2 == null) {
                                            c1397.getClass();
                                            objM2959 = C1397.m2959(obj);
                                        } else {
                                            objM2959 = obj2;
                                        }
                                        c1397.getClass();
                                        ((C3192) objM2959).m5890(iM8272 << 3, Long.valueOf(iMo4611));
                                        c5033 = c5032;
                                        objM29510 = objM2959;
                                        c1398 = c1397;
                                    }
                                    AbstractC0667.m1475(iMo4611, iM8480 & 1048575, obj);
                                    c5032.m8468(iM8470, obj);
                                    c5031 = c5032;
                                    c5033 = c5031;
                                    c1398 = c1397;
                                    objM29510 = obj2;
                                    break;
                                case 13:
                                    obj2 = objM29510;
                                    c1397 = c1398;
                                    c5032 = c5033;
                                    c4902.m8260(5);
                                    AbstractC0667.m1475(abstractC4650.mo4597(), iM8480 & 1048575, obj);
                                    c5032.m8468(iM8470, obj);
                                    c5031 = c5032;
                                    c5033 = c5031;
                                    c1398 = c1397;
                                    objM29510 = obj2;
                                    break;
                                case 14:
                                    obj2 = objM29510;
                                    c1397 = c1398;
                                    c5032 = c5033;
                                    c4902.m8260(1);
                                    AbstractC0667.m1486(obj, iM8480 & 1048575, abstractC4650.mo4622());
                                    c5032.m8468(iM8470, obj);
                                    c5031 = c5032;
                                    c5033 = c5031;
                                    c1398 = c1397;
                                    objM29510 = obj2;
                                    break;
                                case 15:
                                    obj2 = objM29510;
                                    c1397 = c1398;
                                    c5032 = c5033;
                                    c4902.m8260(0);
                                    AbstractC0667.m1475(abstractC4650.mo4603(), iM8480 & 1048575, obj);
                                    c5032.m8468(iM8470, obj);
                                    c5031 = c5032;
                                    c5033 = c5031;
                                    c1398 = c1397;
                                    objM29510 = obj2;
                                    break;
                                case 16:
                                    obj2 = objM29510;
                                    c1397 = c1398;
                                    c5032 = c5033;
                                    c4902.m8260(0);
                                    AbstractC0667.m1486(obj, iM8480 & 1048575, abstractC4650.mo4608());
                                    c5032.m8468(iM8470, obj);
                                    c5031 = c5032;
                                    c5033 = c5031;
                                    c1398 = c1397;
                                    objM29510 = obj2;
                                    break;
                                case 17:
                                    obj2 = objM29510;
                                    c1397 = c1398;
                                    c5032 = c5033;
                                    obj3 = obj;
                                    try {
                                        AbstractC3127 abstractC3128 = (AbstractC3127) c5032.m8471(iM8470, obj3);
                                        InterfaceC0759 interfaceC0759M8464 = c5032.m8463(iM8470);
                                        c4902.m8260(3);
                                        c4902.m8247(abstractC3128, interfaceC0759M8464, c2955);
                                        c5032.m8476(iM8470, obj3, abstractC3128);
                                        c5031 = c5032;
                                        c5033 = c5031;
                                        c1398 = c1397;
                                        objM29510 = obj2;
                                    } catch (C1306 unused) {
                                        c5031 = c5032;
                                        objM29510 = obj2;
                                        if (objM29510 == null) {
                                            try {
                                                c1397.getClass();
                                                objM29510 = C1397.m2959(obj3);
                                            } catch (Throwable th2) {
                                                th = th2;
                                                c1398 = c1397;
                                                objM8475 = objM29510;
                                                while (i2 < i) {
                                                    objM8475 = m8475(obj, iArr[i2], objM8475, c1398, obj);
                                                    i2++;
                                                }
                                                if (objM8475 != null) {
                                                    c1398.getClass();
                                                    ((AbstractC5212) obj).zzc = (C3192) objM8475;
                                                }
                                                throw th;
                                            }
                                        }
                                        c1397.getClass();
                                        if (!C1397.m2960(0, c4902, objM29510)) {
                                            objM8476 = objM29510;
                                            while (i2 < i) {
                                                objM8476 = c5031.m8475(obj3, iArr[i2], objM8476, c1397, obj);
                                                i2++;
                                                c5031 = this;
                                                obj3 = obj;
                                            }
                                            c1398 = c1397;
                                            if (objM8476 != null) {
                                                c1398.getClass();
                                                ((AbstractC5212) obj).zzc = (C3192) objM8476;
                                            }
                                        }
                                        c5033 = this;
                                        c1398 = c1397;
                                    }
                                    break;
                                case 18:
                                    c5031 = c5033;
                                    obj2 = objM29510;
                                    c1397 = c1398;
                                    c4902.m8251(C4575.m7948(iM8480 & 1048575, obj));
                                    c5033 = c5031;
                                    c1398 = c1397;
                                    objM29510 = obj2;
                                    break;
                                case 19:
                                    c5031 = c5033;
                                    obj2 = objM29510;
                                    c1397 = c1398;
                                    c4902.m8263(C4575.m7948(iM8480 & 1048575, obj));
                                    c5033 = c5031;
                                    c1398 = c1397;
                                    objM29510 = obj2;
                                    break;
                                case 20:
                                    c5031 = c5033;
                                    obj2 = objM29510;
                                    c1397 = c1398;
                                    c4902.m8286(C4575.m7948(iM8480 & 1048575, obj));
                                    c5033 = c5031;
                                    c1398 = c1397;
                                    objM29510 = obj2;
                                    break;
                                case 21:
                                    c5031 = c5033;
                                    obj2 = objM29510;
                                    c1397 = c1398;
                                    c4902.m8275(C4575.m7948(iM8480 & 1048575, obj));
                                    c5033 = c5031;
                                    c1398 = c1397;
                                    objM29510 = obj2;
                                    break;
                                case 22:
                                    c5031 = c5033;
                                    obj2 = objM29510;
                                    c1397 = c1398;
                                    c4902.m8255(C4575.m7948(iM8480 & 1048575, obj));
                                    c5033 = c5031;
                                    c1398 = c1397;
                                    objM29510 = obj2;
                                    break;
                                case 23:
                                    c5031 = c5033;
                                    obj2 = objM29510;
                                    c1397 = c1398;
                                    c4902.m8264(C4575.m7948(iM8480 & 1048575, obj));
                                    c5033 = c5031;
                                    c1398 = c1397;
                                    objM29510 = obj2;
                                    break;
                                case 24:
                                    c5031 = c5033;
                                    obj2 = objM29510;
                                    c1397 = c1398;
                                    c4902.m8278(C4575.m7948(iM8480 & 1048575, obj));
                                    c5033 = c5031;
                                    c1398 = c1397;
                                    objM29510 = obj2;
                                    break;
                                case 25:
                                    c5031 = c5033;
                                    obj2 = objM29510;
                                    c1397 = c1398;
                                    c4902.m8276(C4575.m7948(iM8480 & 1048575, obj));
                                    c5033 = c5031;
                                    c1398 = c1397;
                                    objM29510 = obj2;
                                    break;
                                case 26:
                                    c5031 = c5033;
                                    obj2 = objM29510;
                                    c1397 = c1398;
                                    if ((536870912 & iM8480) != 0) {
                                        c4902.m8270(C4575.m7948(iM8480 & 1048575, obj), true);
                                    } else {
                                        c4902.m8270(C4575.m7948(iM8480 & 1048575, obj), false);
                                    }
                                    c5033 = c5031;
                                    c1398 = c1397;
                                    objM29510 = obj2;
                                    break;
                                case 27:
                                    c5031 = c5033;
                                    obj2 = objM29510;
                                    c1397 = c1398;
                                    c4902.m8277(C4575.m7948(iM8480 & 1048575, obj), c5031.m8463(iM8470), c2955);
                                    c5033 = c5031;
                                    c1398 = c1397;
                                    objM29510 = obj2;
                                    break;
                                case 28:
                                    c5031 = c5033;
                                    obj2 = objM29510;
                                    c1397 = c1398;
                                    c4902.m8284(C4575.m7948(iM8480 & 1048575, obj));
                                    c5033 = c5031;
                                    c1398 = c1397;
                                    objM29510 = obj2;
                                    break;
                                case 29:
                                    c5031 = c5033;
                                    obj2 = objM29510;
                                    c1397 = c1398;
                                    obj3 = obj;
                                    try {
                                        try {
                                            c4902.m8243(C4575.m7948(iM8480 & 1048575, obj3));
                                            c5033 = c5031;
                                            c1398 = c1397;
                                            objM29510 = obj2;
                                        } catch (C1306 unused2) {
                                            objM29510 = obj2;
                                            if (objM29510 == null) {
                                                c1397.getClass();
                                                objM29510 = C1397.m2959(obj3);
                                            }
                                            c1397.getClass();
                                            if (!C1397.m2960(0, c4902, objM29510)) {
                                                objM8476 = objM29510;
                                                while (i2 < i) {
                                                    objM8476 = c5031.m8475(obj3, iArr[i2], objM8476, c1397, obj);
                                                    i2++;
                                                    c5031 = this;
                                                    obj3 = obj;
                                                }
                                                c1398 = c1397;
                                                if (objM8476 != null) {
                                                    c1398.getClass();
                                                    ((AbstractC5212) obj).zzc = (C3192) objM8476;
                                                }
                                            }
                                            c5033 = this;
                                            c1398 = c1397;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        c1398 = c1397;
                                        objM29510 = obj2;
                                        objM8475 = objM29510;
                                        while (i2 < i) {
                                            objM8475 = m8475(obj, iArr[i2], objM8475, c1398, obj);
                                            i2++;
                                        }
                                        if (objM8475 != null) {
                                            c1398.getClass();
                                            ((AbstractC5212) obj).zzc = (C3192) objM8475;
                                        }
                                        throw th;
                                    }
                                    break;
                                case 30:
                                    c5031 = c5033;
                                    c1397 = c1398;
                                    obj3 = obj;
                                    Object obj5 = objM29510;
                                    try {
                                        InterfaceC5083 interfaceC5083M7948 = C4575.m7948(iM8480 & 1048575, obj3);
                                        c4902.m8292(interfaceC5083M7948);
                                        try {
                                            objM29510 = AbstractC2569.m4846(obj3, iM8272, interfaceC5083M7948, c5031.m8467(iM8470), obj5, c1397);
                                            c1397 = c1397;
                                            c5033 = c5031;
                                            c1398 = c1397;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            obj2 = obj5;
                                            c1397 = c1397;
                                            c1398 = c1397;
                                            objM29510 = obj2;
                                            objM8475 = objM29510;
                                            while (i2 < i) {
                                                objM8475 = m8475(obj, iArr[i2], objM8475, c1398, obj);
                                                i2++;
                                            }
                                            if (objM8475 != null) {
                                                c1398.getClass();
                                                ((AbstractC5212) obj).zzc = (C3192) objM8475;
                                            }
                                            throw th;
                                        }
                                    } catch (C1306 unused3) {
                                        obj2 = obj5;
                                        objM29510 = obj2;
                                        if (objM29510 == null) {
                                            c1397.getClass();
                                            objM29510 = C1397.m2959(obj3);
                                        }
                                        c1397.getClass();
                                        if (!C1397.m2960(0, c4902, objM29510)) {
                                            objM8476 = objM29510;
                                            while (i2 < i) {
                                                objM8476 = c5031.m8475(obj3, iArr[i2], objM8476, c1397, obj);
                                                i2++;
                                                c5031 = this;
                                                obj3 = obj;
                                            }
                                            c1398 = c1397;
                                            if (objM8476 != null) {
                                                c1398.getClass();
                                                ((AbstractC5212) obj).zzc = (C3192) objM8476;
                                            }
                                        }
                                        c5033 = this;
                                    } catch (Throwable th5) {
                                        th = th5;
                                        obj2 = obj5;
                                    }
                                    break;
                                case 31:
                                    c5031 = c5033;
                                    c4902.m8295(C4575.m7948(iM8480 & 1048575, obj));
                                    obj2 = objM29510;
                                    c1397 = c1398;
                                    c5033 = c5031;
                                    c1398 = c1397;
                                    objM29510 = obj2;
                                    break;
                                case 32:
                                    c5031 = c5033;
                                    c4902.m8257(C4575.m7948(iM8480 & 1048575, obj));
                                    obj2 = objM29510;
                                    c1397 = c1398;
                                    c5033 = c5031;
                                    c1398 = c1397;
                                    objM29510 = obj2;
                                    break;
                                case 33:
                                    c5031 = c5033;
                                    c4902.m8259(C4575.m7948(iM8480 & 1048575, obj));
                                    obj2 = objM29510;
                                    c1397 = c1398;
                                    c5033 = c5031;
                                    c1398 = c1397;
                                    objM29510 = obj2;
                                    break;
                                case 34:
                                    c5031 = c5033;
                                    c4902.m8269(C4575.m7948(iM8480 & 1048575, obj));
                                    obj2 = objM29510;
                                    c1397 = c1398;
                                    c5033 = c5031;
                                    c1398 = c1397;
                                    objM29510 = obj2;
                                    break;
                                case 35:
                                    c5031 = c5033;
                                    c4902.m8251(C4575.m7948(iM8480 & 1048575, obj));
                                    obj2 = objM29510;
                                    c1397 = c1398;
                                    c5033 = c5031;
                                    c1398 = c1397;
                                    objM29510 = obj2;
                                    break;
                                case 36:
                                    c5031 = c5033;
                                    c4902.m8263(C4575.m7948(iM8480 & 1048575, obj));
                                    obj2 = objM29510;
                                    c1397 = c1398;
                                    c5033 = c5031;
                                    c1398 = c1397;
                                    objM29510 = obj2;
                                    break;
                                case 37:
                                    c5031 = c5033;
                                    c4902.m8286(C4575.m7948(iM8480 & 1048575, obj));
                                    obj2 = objM29510;
                                    c1397 = c1398;
                                    c5033 = c5031;
                                    c1398 = c1397;
                                    objM29510 = obj2;
                                    break;
                                case 38:
                                    c5031 = c5033;
                                    c4902.m8275(C4575.m7948(iM8480 & 1048575, obj));
                                    obj2 = objM29510;
                                    c1397 = c1398;
                                    c5033 = c5031;
                                    c1398 = c1397;
                                    objM29510 = obj2;
                                    break;
                                case 39:
                                    c5031 = c5033;
                                    c4902.m8255(C4575.m7948(iM8480 & 1048575, obj));
                                    obj2 = objM29510;
                                    c1397 = c1398;
                                    c5033 = c5031;
                                    c1398 = c1397;
                                    objM29510 = obj2;
                                    break;
                                case 40:
                                    c5031 = c5033;
                                    c4902.m8264(C4575.m7948(iM8480 & 1048575, obj));
                                    obj2 = objM29510;
                                    c1397 = c1398;
                                    c5033 = c5031;
                                    c1398 = c1397;
                                    objM29510 = obj2;
                                    break;
                                case 41:
                                    c5031 = c5033;
                                    c4902.m8278(C4575.m7948(iM8480 & 1048575, obj));
                                    obj2 = objM29510;
                                    c1397 = c1398;
                                    c5033 = c5031;
                                    c1398 = c1397;
                                    objM29510 = obj2;
                                    break;
                                case 42:
                                    c5031 = c5033;
                                    c4902.m8276(C4575.m7948(iM8480 & 1048575, obj));
                                    obj2 = objM29510;
                                    c1397 = c1398;
                                    c5033 = c5031;
                                    c1398 = c1397;
                                    objM29510 = obj2;
                                    break;
                                case 43:
                                    c5031 = c5033;
                                    obj3 = obj;
                                    try {
                                        c4902.m8243(C4575.m7948(iM8480 & 1048575, obj3));
                                        obj2 = objM29510;
                                        c1397 = c1398;
                                        c5033 = c5031;
                                        c1398 = c1397;
                                        objM29510 = obj2;
                                    } catch (C1306 unused4) {
                                        obj2 = objM29510;
                                        c1397 = c1398;
                                        objM29510 = obj2;
                                        if (objM29510 == null) {
                                            c1397.getClass();
                                            objM29510 = C1397.m2959(obj3);
                                        }
                                        c1397.getClass();
                                        if (!C1397.m2960(0, c4902, objM29510)) {
                                            objM8476 = objM29510;
                                            while (i2 < i) {
                                                objM8476 = c5031.m8475(obj3, iArr[i2], objM8476, c1397, obj);
                                                i2++;
                                                c5031 = this;
                                                obj3 = obj;
                                            }
                                            c1398 = c1397;
                                            if (objM8476 != null) {
                                                c1398.getClass();
                                                ((AbstractC5212) obj).zzc = (C3192) objM8476;
                                            }
                                        }
                                        c5033 = this;
                                        c1398 = c1397;
                                    }
                                    break;
                                case 44:
                                    c1397 = c1398;
                                    try {
                                        InterfaceC5083 interfaceC5083M7949 = C4575.m7948(iM8480 & 1048575, obj);
                                        c4902.m8292(interfaceC5083M7949);
                                        C2068 c2068M8468 = c5033.m8467(iM8470);
                                        c5031 = c5033;
                                        obj3 = obj;
                                        Object obj6 = objM29510;
                                        try {
                                            try {
                                                objM29510 = AbstractC2569.m4846(obj3, iM8272, interfaceC5083M7949, c2068M8468, obj6, c1397);
                                                c1398 = c1397;
                                                c5033 = c5031;
                                            } catch (C1306 unused5) {
                                                obj2 = obj6;
                                                c1397 = c1397;
                                                objM29510 = obj2;
                                                if (objM29510 == null) {
                                                    c1397.getClass();
                                                    objM29510 = C1397.m2959(obj3);
                                                }
                                                c1397.getClass();
                                                if (!C1397.m2960(0, c4902, objM29510)) {
                                                    objM8476 = objM29510;
                                                    while (i2 < i) {
                                                        objM8476 = c5031.m8475(obj3, iArr[i2], objM8476, c1397, obj);
                                                        i2++;
                                                        c5031 = this;
                                                        obj3 = obj;
                                                    }
                                                    c1398 = c1397;
                                                    if (objM8476 != null) {
                                                        c1398.getClass();
                                                        ((AbstractC5212) obj).zzc = (C3192) objM8476;
                                                    }
                                                }
                                                c5033 = this;
                                                c1398 = c1397;
                                            }
                                        } catch (Throwable th6) {
                                            th = th6;
                                            objM29510 = obj6;
                                            c1398 = c1397;
                                            obj2 = objM29510;
                                            objM29510 = obj2;
                                            objM8475 = objM29510;
                                            while (i2 < i) {
                                                objM8475 = m8475(obj, iArr[i2], objM8475, c1398, obj);
                                                i2++;
                                            }
                                            if (objM8475 != null) {
                                                c1398.getClass();
                                                ((AbstractC5212) obj).zzc = (C3192) objM8475;
                                            }
                                            throw th;
                                        }
                                    } catch (C1306 unused6) {
                                        c5031 = c5033;
                                        obj3 = obj;
                                        obj2 = objM29510;
                                    } catch (Throwable th7) {
                                        th = th7;
                                        c1398 = c1397;
                                    }
                                    break;
                                case 45:
                                    c1397 = c1398;
                                    obj4 = obj;
                                    c4902.m8295(C4575.m7948(iM8480 & 1048575, obj4));
                                    c5031 = c5033;
                                    obj2 = objM29510;
                                    c5033 = c5031;
                                    c1398 = c1397;
                                    objM29510 = obj2;
                                    break;
                                case 46:
                                    c1397 = c1398;
                                    obj4 = obj;
                                    c4902.m8257(C4575.m7948(iM8480 & 1048575, obj4));
                                    c5031 = c5033;
                                    obj2 = objM29510;
                                    c5033 = c5031;
                                    c1398 = c1397;
                                    objM29510 = obj2;
                                    break;
                                case 47:
                                    c1397 = c1398;
                                    obj4 = obj;
                                    c4902.m8259(C4575.m7948(iM8480 & 1048575, obj4));
                                    c5031 = c5033;
                                    obj2 = objM29510;
                                    c5033 = c5031;
                                    c1398 = c1397;
                                    objM29510 = obj2;
                                    break;
                                case 48:
                                    c1397 = c1398;
                                    obj4 = obj;
                                    c4902.m8269(C4575.m7948(iM8480 & 1048575, obj4));
                                    c5031 = c5033;
                                    obj2 = objM29510;
                                    c5033 = c5031;
                                    c1398 = c1397;
                                    objM29510 = obj2;
                                    break;
                                case 49:
                                    c1397 = c1398;
                                    obj4 = obj;
                                    c4902.m8281(C4575.m7948(iM8480 & 1048575, obj4), c5033.m8463(iM8470), c2955);
                                    c5031 = c5033;
                                    obj2 = objM29510;
                                    c5033 = c5031;
                                    c1398 = c1397;
                                    objM29510 = obj2;
                                    break;
                                case 50:
                                    c1397 = c1398;
                                    obj4 = obj;
                                    Object objM8479 = c5033.m8479(iM8470);
                                    long jM8480 = c5033.m8480(iM8470) & 1048575;
                                    Object objM1478 = AbstractC0667.m1478(jM8480, obj4);
                                    if (objM1478 == null) {
                                        objM1478 = C3775.f12547.m6679();
                                        AbstractC0667.m1484(jM8480, obj4, objM1478);
                                    } else if (!((C3775) objM1478).f12548) {
                                        Object objM6679 = C3775.f12547.m6679();
                                        C4452.m7738(objM6679, objM1478);
                                        AbstractC0667.m1484(jM8480, obj4, objM6679);
                                        objM1478 = objM6679;
                                    }
                                    c4902.m8274((C3775) objM1478, ((C3521) objM8479).f11660, c2955);
                                    c5031 = c5033;
                                    obj2 = objM29510;
                                    c5033 = c5031;
                                    c1398 = c1397;
                                    objM29510 = obj2;
                                    break;
                                case 51:
                                    c1397 = c1398;
                                    obj4 = obj;
                                    c4902.m8260(1);
                                    AbstractC0667.m1484(iM8480 & 1048575, obj4, Double.valueOf(abstractC4650.mo4627()));
                                    c5033.m8481(iM8272, iM8470, obj4);
                                    c5031 = c5033;
                                    obj2 = objM29510;
                                    c5033 = c5031;
                                    c1398 = c1397;
                                    objM29510 = obj2;
                                    break;
                                case 52:
                                    c1397 = c1398;
                                    obj4 = obj;
                                    c4902.m8260(5);
                                    AbstractC0667.m1484(iM8480 & 1048575, obj4, Float.valueOf(abstractC4650.mo4626()));
                                    c5033.m8481(iM8272, iM8470, obj4);
                                    c5031 = c5033;
                                    obj2 = objM29510;
                                    c5033 = c5031;
                                    c1398 = c1397;
                                    objM29510 = obj2;
                                    break;
                                case 53:
                                    c1397 = c1398;
                                    obj4 = obj;
                                    c4902.m8260(0);
                                    AbstractC0667.m1484(iM8480 & 1048575, obj4, Long.valueOf(abstractC4650.mo4602()));
                                    c5033.m8481(iM8272, iM8470, obj4);
                                    c5031 = c5033;
                                    obj2 = objM29510;
                                    c5033 = c5031;
                                    c1398 = c1397;
                                    objM29510 = obj2;
                                    break;
                                case 54:
                                    c1397 = c1398;
                                    obj4 = obj;
                                    c4902.m8260(0);
                                    AbstractC0667.m1484(iM8480 & 1048575, obj4, Long.valueOf(abstractC4650.mo4601()));
                                    c5033.m8481(iM8272, iM8470, obj4);
                                    c5031 = c5033;
                                    obj2 = objM29510;
                                    c5033 = c5031;
                                    c1398 = c1397;
                                    objM29510 = obj2;
                                    break;
                                case 55:
                                    c1397 = c1398;
                                    obj4 = obj;
                                    c4902.m8260(0);
                                    AbstractC0667.m1484(iM8480 & 1048575, obj4, Integer.valueOf(abstractC4650.mo4598()));
                                    c5033.m8481(iM8272, iM8470, obj4);
                                    c5031 = c5033;
                                    obj2 = objM29510;
                                    c5033 = c5031;
                                    c1398 = c1397;
                                    objM29510 = obj2;
                                    break;
                                case 56:
                                    c1397 = c1398;
                                    obj4 = obj;
                                    c4902.m8260(1);
                                    AbstractC0667.m1484(iM8480 & 1048575, obj4, Long.valueOf(abstractC4650.mo4604()));
                                    c5033.m8481(iM8272, iM8470, obj4);
                                    c5031 = c5033;
                                    obj2 = objM29510;
                                    c5033 = c5031;
                                    c1398 = c1397;
                                    objM29510 = obj2;
                                    break;
                                case 57:
                                    c1397 = c1398;
                                    obj4 = obj;
                                    c4902.m8260(5);
                                    AbstractC0667.m1484(iM8480 & 1048575, obj4, Integer.valueOf(abstractC4650.mo4621()));
                                    c5033.m8481(iM8272, iM8470, obj4);
                                    c5031 = c5033;
                                    obj2 = objM29510;
                                    c5033 = c5031;
                                    c1398 = c1397;
                                    objM29510 = obj2;
                                    break;
                                case 58:
                                    c1397 = c1398;
                                    obj4 = obj;
                                    c4902.m8260(0);
                                    AbstractC0667.m1484(iM8480 & 1048575, obj4, Boolean.valueOf(abstractC4650.mo4625()));
                                    c5033.m8481(iM8272, iM8470, obj4);
                                    c5031 = c5033;
                                    obj2 = objM29510;
                                    c5033 = c5031;
                                    c1398 = c1397;
                                    objM29510 = obj2;
                                    break;
                                case 59:
                                    c1397 = c1398;
                                    obj4 = obj;
                                    c5033.m8477(iM8480, c4902, obj4);
                                    c5033.m8481(iM8272, iM8470, obj4);
                                    c5031 = c5033;
                                    obj2 = objM29510;
                                    c5033 = c5031;
                                    c1398 = c1397;
                                    objM29510 = obj2;
                                    break;
                                case 60:
                                    c1397 = c1398;
                                    obj4 = obj;
                                    AbstractC3127 abstractC3129 = (AbstractC3127) c5033.m8474(iM8272, iM8470, obj4);
                                    InterfaceC0759 interfaceC0759M8465 = c5033.m8463(iM8470);
                                    c4902.m8260(2);
                                    c4902.m8266(abstractC3129, interfaceC0759M8465, c2955);
                                    c5033.m8472(iM8272, iM8470, obj4, abstractC3129);
                                    c5031 = c5033;
                                    obj2 = objM29510;
                                    c5033 = c5031;
                                    c1398 = c1397;
                                    objM29510 = obj2;
                                    break;
                                case 61:
                                    c1397 = c1398;
                                    obj4 = obj;
                                    AbstractC0667.m1484(iM8480 & 1048575, obj4, c4902.m8294());
                                    c5033.m8481(iM8272, iM8470, obj4);
                                    c5031 = c5033;
                                    obj2 = objM29510;
                                    c5033 = c5031;
                                    c1398 = c1397;
                                    objM29510 = obj2;
                                    break;
                                case 62:
                                    c1397 = c1398;
                                    obj4 = obj;
                                    c4902.m8260(0);
                                    AbstractC0667.m1484(iM8480 & 1048575, obj4, Integer.valueOf(abstractC4650.mo4593()));
                                    c5033.m8481(iM8272, iM8470, obj4);
                                    c5031 = c5033;
                                    obj2 = objM29510;
                                    c5033 = c5031;
                                    c1398 = c1397;
                                    objM29510 = obj2;
                                    break;
                                case 63:
                                    c1397 = c1398;
                                    obj4 = obj;
                                    c4902.m8260(0);
                                    int iMo4612 = abstractC4650.mo4611();
                                    C2068 c2068M8469 = c5033.m8467(iM8470);
                                    if (c2068M8469 != null && !c2068M8469.m4013(iMo4612)) {
                                        C1397 c13910 = AbstractC2569.f8579;
                                        if (objM29510 == null) {
                                            c1397.getClass();
                                            objM2959 = C1397.m2959(obj4);
                                        } else {
                                            objM2959 = objM29510;
                                        }
                                        c1397.getClass();
                                        ((C3192) objM2959).m5890(iM8272 << 3, Long.valueOf(iMo4612));
                                        objM29510 = objM2959;
                                        c1398 = c1397;
                                    }
                                    AbstractC0667.m1484(iM8480 & 1048575, obj4, Integer.valueOf(iMo4612));
                                    c5033.m8481(iM8272, iM8470, obj4);
                                    c5031 = c5033;
                                    obj2 = objM29510;
                                    c5033 = c5031;
                                    c1398 = c1397;
                                    objM29510 = obj2;
                                    break;
                                case 64:
                                    c1397 = c1398;
                                    obj4 = obj;
                                    c4902.m8260(5);
                                    AbstractC0667.m1484(iM8480 & 1048575, obj4, Integer.valueOf(abstractC4650.mo4597()));
                                    c5033.m8481(iM8272, iM8470, obj4);
                                    c5031 = c5033;
                                    obj2 = objM29510;
                                    c5033 = c5031;
                                    c1398 = c1397;
                                    objM29510 = obj2;
                                    break;
                                case 65:
                                    c1397 = c1398;
                                    obj4 = obj;
                                    c4902.m8260(1);
                                    AbstractC0667.m1484(iM8480 & 1048575, obj4, Long.valueOf(abstractC4650.mo4622()));
                                    c5033.m8481(iM8272, iM8470, obj4);
                                    c5031 = c5033;
                                    obj2 = objM29510;
                                    c5033 = c5031;
                                    c1398 = c1397;
                                    objM29510 = obj2;
                                    break;
                                case 66:
                                    c1397 = c1398;
                                    obj4 = obj;
                                    c4902.m8260(0);
                                    AbstractC0667.m1484(iM8480 & 1048575, obj4, Integer.valueOf(abstractC4650.mo4603()));
                                    c5033.m8481(iM8272, iM8470, obj4);
                                    c5031 = c5033;
                                    obj2 = objM29510;
                                    c5033 = c5031;
                                    c1398 = c1397;
                                    objM29510 = obj2;
                                    break;
                                case 67:
                                    c1397 = c1398;
                                    obj4 = obj;
                                    c4902.m8260(0);
                                    AbstractC0667.m1484(iM8480 & 1048575, obj4, Long.valueOf(abstractC4650.mo4608()));
                                    c5033.m8481(iM8272, iM8470, obj4);
                                    c5031 = c5033;
                                    obj2 = objM29510;
                                    c5033 = c5031;
                                    c1398 = c1397;
                                    objM29510 = obj2;
                                    break;
                                case 68:
                                    c1397 = c1398;
                                    obj4 = obj;
                                    try {
                                        AbstractC3127 abstractC31210 = (AbstractC3127) c5033.m8474(iM8272, iM8470, obj4);
                                        InterfaceC0759 interfaceC0759M8466 = c5033.m8463(iM8470);
                                        c4902.m8260(3);
                                        c4902.m8247(abstractC31210, interfaceC0759M8466, c2955);
                                        c5033.m8472(iM8272, iM8470, obj4, abstractC31210);
                                        c5031 = c5033;
                                        obj2 = objM29510;
                                        c5033 = c5031;
                                        c1398 = c1397;
                                        objM29510 = obj2;
                                    } catch (C1306 unused7) {
                                        c5031 = c5033;
                                        obj2 = objM29510;
                                        obj3 = obj4;
                                        objM29510 = obj2;
                                        if (objM29510 == null) {
                                            c1397.getClass();
                                            objM29510 = C1397.m2959(obj3);
                                        }
                                        c1397.getClass();
                                        if (!C1397.m2960(0, c4902, objM29510)) {
                                            objM8476 = objM29510;
                                            while (i2 < i) {
                                                objM8476 = c5031.m8475(obj3, iArr[i2], objM8476, c1397, obj);
                                                i2++;
                                                c5031 = this;
                                                obj3 = obj;
                                            }
                                            c1398 = c1397;
                                            if (objM8476 != null) {
                                                c1398.getClass();
                                                ((AbstractC5212) obj).zzc = (C3192) objM8476;
                                            }
                                        }
                                        c5033 = this;
                                        c1398 = c1397;
                                    } catch (Throwable th8) {
                                        th = th8;
                                        obj2 = objM29510;
                                        c1398 = c1397;
                                        objM29510 = obj2;
                                        objM8475 = objM29510;
                                        while (i2 < i) {
                                            objM8475 = m8475(obj, iArr[i2], objM8475, c1398, obj);
                                            i2++;
                                        }
                                        if (objM8475 != null) {
                                            c1398.getClass();
                                            ((AbstractC5212) obj).zzc = (C3192) objM8475;
                                        }
                                        throw th;
                                    }
                                    break;
                                default:
                                    if (objM29510 == null) {
                                        c1398.getClass();
                                        objM29510 = C1397.m2959(obj);
                                    }
                                    try {
                                        c1398.getClass();
                                        if (C1397.m2960(0, c4902, objM29510)) {
                                            c1397 = c1398;
                                            c1398 = c1397;
                                        } else {
                                            objM8476 = objM29510;
                                            while (i2 < i) {
                                                objM8476 = c5033.m8475(obj, iArr[i2], objM8476, c1398, obj);
                                                i2++;
                                                c1398 = c1398;
                                            }
                                            c1397 = c1398;
                                            c1398 = c1397;
                                        }
                                    } catch (C1306 unused8) {
                                        c1397 = c1398;
                                        c5031 = c5033;
                                        obj3 = obj;
                                        if (objM29510 == null) {
                                            c1397.getClass();
                                            objM29510 = C1397.m2959(obj3);
                                        }
                                        c1397.getClass();
                                        if (!C1397.m2960(0, c4902, objM29510)) {
                                            objM8476 = objM29510;
                                            while (i2 < i) {
                                                objM8476 = c5031.m8475(obj3, iArr[i2], objM8476, c1397, obj);
                                                i2++;
                                                c5031 = this;
                                                obj3 = obj;
                                            }
                                            c1398 = c1397;
                                            if (objM8476 != null) {
                                                c1398.getClass();
                                                ((AbstractC5212) obj).zzc = (C3192) objM8476;
                                            }
                                        }
                                        c5033 = this;
                                    } catch (Throwable th9) {
                                        th = th9;
                                        c1397 = c1398;
                                        c1398 = c1397;
                                        objM8475 = objM29510;
                                        while (i2 < i) {
                                            objM8475 = m8475(obj, iArr[i2], objM8475, c1398, obj);
                                            i2++;
                                        }
                                        if (objM8475 != null) {
                                            c1398.getClass();
                                            ((AbstractC5212) obj).zzc = (C3192) objM8475;
                                        }
                                        throw th;
                                    }
                                    break;
                            }
                        } catch (Throwable th10) {
                            th = th10;
                            obj2 = objM29510;
                        }
                    } catch (C1306 unused9) {
                        c5031 = c5033;
                        obj2 = objM29510;
                        c1397 = c1398;
                        obj3 = obj;
                    }
                } else if (iM8272 == Integer.MAX_VALUE) {
                    objM8476 = objM29510;
                    while (i2 < i) {
                        objM8476 = c5033.m8475(obj, iArr[i2], objM8476, c1398, obj);
                        i2++;
                        c5033 = this;
                    }
                } else {
                    if (objM29510 == null) {
                        c1398.getClass();
                        objM29510 = C1397.m2959(obj);
                    }
                    try {
                        c1398.getClass();
                        if (C1397.m2960(0, c4902, objM29510)) {
                            c5033 = this;
                        } else {
                            objM8476 = objM29510;
                            while (i2 < i) {
                                objM8476 = m8475(obj, iArr[i2], objM8476, c1398, obj);
                                i2++;
                            }
                        }
                    } catch (Throwable th11) {
                        th = th11;
                        objM8475 = objM29510;
                        while (i2 < i) {
                            objM8475 = m8475(obj, iArr[i2], objM8475, c1398, obj);
                            i2++;
                        }
                        if (objM8475 != null) {
                            c1398.getClass();
                            ((AbstractC5212) obj).zzc = (C3192) objM8475;
                        }
                        throw th;
                    }
                }
            } catch (Throwable th12) {
                th = th12;
            }
        }
        if (objM8476 != null) {
            c1398.getClass();
            ((AbstractC5212) obj).zzc = (C3192) objM8476;
        }
    }

    /* JADX INFO: renamed from: ۦۛ */
    public final void m8481(int i, int i2, Object obj) {
        AbstractC0667.m1475(i, this.f16655[i2 + 2] & 1048575, obj);
    }
}
