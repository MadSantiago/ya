package p000;

import java.lang.reflect.Constructor;
import java.lang.reflect.Executable;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: ۦٍٛؑٞ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4599 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f15170;

    public /* synthetic */ C4599(int i) {
        this.f15170 = i;
    }

    /* JADX WARN: Code duplicated, block: B:230:0x0095 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x0090 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0092 A[LOOP:0: B:13:0x004b->B:26:0x0092, LOOP_END] */
    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        Object c4535;
        Object c4536;
        Object c4537;
        Object c4538;
        Object c4539;
        String genericString;
        Object c45310;
        boolean z = false;
        switch (this.f15170) {
            case 0:
                try {
                    c4535 = (Boolean) ((InterfaceC4745) obj).mo211(AbstractC0246.m509(((Executable) ((C1989) obj2).f6567).getParameterTypes()));
                    c4535.getClass();
                    break;
                } catch (Throwable th) {
                    c4535 = new C4535(th);
                }
                Object obj3 = Boolean.FALSE;
                if (c4535 instanceof C4535) {
                    c4535 = obj3;
                }
                return (Boolean) c4535;
            case 1:
                return Boolean.valueOf(((Executable) ((C1989) obj2).f6567).getParameterCount() == ((Integer) obj).intValue());
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                try {
                    c4536 = (Boolean) ((InterfaceC4745) obj).mo211(Integer.valueOf(((Executable) ((C1989) obj2).f6567).getParameterCount()));
                    c4536.getClass();
                    break;
                } catch (Throwable th2) {
                    c4536 = new C4535(th2);
                }
                Object obj4 = Boolean.FALSE;
                if (c4536 instanceof C4535) {
                    c4536 = obj4;
                }
                return (Boolean) c4536;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                Set set = (Set) obj;
                List listM509 = AbstractC0246.m509(((Executable) ((C1989) obj2).f6567).getTypeParameters());
                if (set.size() == listM509.size()) {
                    Iterator it = set.iterator();
                    if (it.hasNext()) {
                        AbstractC2049.m4001(it.next());
                        throw null;
                    }
                    z = true;
                }
                return Boolean.valueOf(z);
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                Set set2 = (Set) obj;
                List listM5010 = AbstractC0246.m509(((Executable) ((C1989) obj2).f6567).getTypeParameters());
                if (set2.size() == listM5010.size()) {
                    Iterator it2 = set2.iterator();
                    if (it2.hasNext()) {
                        AbstractC2049.m4001(it2.next());
                        throw null;
                    }
                    z = true;
                }
                return Boolean.valueOf(!z);
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                try {
                    Boolean bool = (Boolean) ((InterfaceC4745) obj).mo211(((C2246) obj2).f7452.getGenericReturnType());
                    bool.booleanValue();
                    c4537 = bool;
                    break;
                } catch (Throwable th3) {
                    c4537 = new C4535(th3);
                }
                Boolean bool2 = Boolean.FALSE;
                boolean z2 = c4537 instanceof C4535;
                Object obj5 = c4537;
                if (z2) {
                    obj5 = bool2;
                }
                return (Boolean) obj5;
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                Set set3 = (Set) obj;
                List listM5011 = AbstractC0246.m509(((Executable) ((C1989) obj2).f6567).getGenericExceptionTypes());
                if (set3.size() == listM5011.size()) {
                    Iterator it3 = set3.iterator();
                    if (it3.hasNext()) {
                        AbstractC2049.m4001(it3.next());
                        throw null;
                    }
                    z = true;
                }
                return Boolean.valueOf(z);
            case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                return Boolean.valueOf(AbstractC3831.m6874(((C4571) obj2).mo3892().getName(), (String) obj));
            case 8:
                try {
                    c4538 = (Boolean) ((InterfaceC4745) obj).mo211(((C4571) obj2).mo3892().getName());
                    c4538.getClass();
                    break;
                } catch (Throwable th4) {
                    c4538 = new C4535(th4);
                }
                Object obj6 = Boolean.FALSE;
                if (c4538 instanceof C4535) {
                    c4538 = obj6;
                }
                return (Boolean) c4538;
            case 9:
                C4571 c4571 = (C4571) obj2;
                Set set4 = (Set) obj;
                if ((set4 instanceof Collection) && set4.isEmpty()) {
                    z = true;
                } else {
                    Iterator it4 = set4.iterator();
                    while (it4.hasNext()) {
                        if ((((EnumC1801) it4.next()).f6001 & c4571.mo3892().getModifiers()) != 0) {
                        }
                    }
                    z = true;
                }
                return Boolean.valueOf(z);
            case 10:
                C4571 c4572 = (C4571) obj2;
                Set set5 = (Set) obj;
                if ((set5 instanceof Collection) && set5.isEmpty()) {
                    z = true;
                } else {
                    Iterator it5 = set5.iterator();
                    while (it5.hasNext()) {
                        if ((((EnumC1801) it5.next()).f6001 & c4572.mo3892().getModifiers()) != 0) {
                        }
                    }
                    z = true;
                }
                return Boolean.valueOf(z);
            case 11:
                InterfaceC4745 interfaceC4745 = (InterfaceC4745) obj;
                try {
                    int modifiers = ((C4571) obj2).mo3892().getModifiers();
                    C4681 c4681 = EnumC1801.f5999;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj7 : c4681) {
                        if ((((EnumC1801) obj7).f6001 & modifiers) != 0) {
                            arrayList.add(obj7);
                        }
                    }
                    c4539 = (Boolean) interfaceC4745.mo211(AbstractC0973.m2052(arrayList));
                    c4539.getClass();
                    break;
                } catch (Throwable th5) {
                    c4539 = new C4535(th5);
                }
                Object obj8 = Boolean.FALSE;
                if (c4539 instanceof C4535) {
                    c4539 = obj8;
                }
                return (Boolean) c4539;
            case 12:
                return Boolean.valueOf(((C4571) obj2).mo3892().isSynthetic() == ((Boolean) obj).booleanValue());
            case 13:
                return Boolean.valueOf(((C2246) obj2).f7452.isBridge() == ((Boolean) obj).booleanValue());
            case 14:
                return Boolean.valueOf(((C4571) obj2).mo3892().isSynthetic() != ((Boolean) obj).booleanValue());
            case 15:
                String str = (String) obj;
                C4571 c4573 = (C4571) obj2;
                Member memberMo3892 = c4573.mo3892();
                if (memberMo3892 instanceof Method) {
                    genericString = ((Method) c4573.mo3892()).toGenericString();
                } else if (memberMo3892 instanceof Constructor) {
                    genericString = ((Constructor) c4573.mo3892()).toGenericString();
                } else {
                    if (!(memberMo3892 instanceof Field)) {
                        C0178.m383(c4573.mo3892(), "Unsupported member type: ");
                        return null;
                    }
                    genericString = ((Field) c4573.mo3892()).toGenericString();
                }
                return Boolean.valueOf(AbstractC3831.m6874(genericString, str));
            case 16:
                return Boolean.valueOf(((C2246) obj2).f7452.isBridge() != ((Boolean) obj).booleanValue());
            case 17:
                return Boolean.valueOf(((C2246) obj2).f7452.isDefault() == ((Boolean) obj).booleanValue());
            case 18:
                return Boolean.valueOf(((C2246) obj2).f7452.isDefault() != ((Boolean) obj).booleanValue());
            case 19:
                return Boolean.valueOf(AbstractC3831.m6874(((C2246) obj2).f7452.getDefaultValue(), obj));
            case 20:
                try {
                    Boolean bool3 = (Boolean) ((InterfaceC4745) obj).mo211(((C2246) obj2).f7452.getDefaultValue());
                    bool3.booleanValue();
                    c45310 = bool3;
                    break;
                } catch (Throwable th6) {
                    c45310 = new C4535(th6);
                }
                Boolean bool4 = Boolean.FALSE;
                boolean z3 = c45310 instanceof C4535;
                Object obj9 = c45310;
                if (z3) {
                    obj9 = bool4;
                }
                return (Boolean) obj9;
            case 21:
                return Integer.valueOf(((InterfaceC1827) obj).mo3596(((Integer) obj2).intValue()));
            case 22:
                return Integer.valueOf(((InterfaceC1827) obj).mo3599(((Integer) obj2).intValue()));
            case 23:
                return Integer.valueOf(((InterfaceC1827) obj).mo3598(((Integer) obj2).intValue()));
            case 24:
                return Integer.valueOf(((InterfaceC1827) obj).mo3600(((Integer) obj2).intValue()));
            case 25:
                return Integer.valueOf(((Integer) obj).intValue() + 1);
            case 26:
                C5108 c5108 = (C5108) obj2;
                Map map = c5108.f16954;
                C3262 c3262 = c5108.f16953;
                Object[] objArr = c3262.f10947;
                Object[] objArr2 = c3262.f10944;
                long[] jArr = c3262.f10948;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    int i4 = (i << 3) + i3;
                                    Object obj10 = objArr[i4];
                                    Map mapMo1715 = ((InterfaceC0814) objArr2[i4]).mo1715();
                                    if (mapMo1715.isEmpty()) {
                                        map.remove(obj10);
                                    } else {
                                        map.put(obj10, mapMo1715);
                                    }
                                }
                                j >>= 8;
                            }
                            if (i2 == 8) {
                                if (i != length) {
                                    i++;
                                }
                            }
                        } else if (i != length) {
                            i++;
                        }
                    }
                }
                if (map.isEmpty()) {
                    return null;
                }
                return map;
            case 27:
                return obj2;
            case 28:
                C1249 c1249 = (C1249) obj2;
                return AbstractC2164.m4212(c1249.f4307, AbstractC0539.m1236(c1249.f4308, AbstractC0539.f1919, (C5869) obj));
            default:
                return Integer.valueOf(((C1690) obj2).f5637);
        }
    }
}
