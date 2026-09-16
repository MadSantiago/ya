package p000;

import java.lang.reflect.Executable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: ۦٟؗ۟ٗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4876 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f16038;

    public /* synthetic */ C4876(int i) {
        this.f16038 = i;
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        C3229 c3229;
        Object c4535;
        int i = this.f16038;
        C2358 c2358 = C2358.f7817;
        boolean z = false;
        switch (i) {
            case 0:
                InterfaceC4137 interfaceC4137 = (InterfaceC4137) obj2;
                InterfaceC3534 interfaceC3534Mo881 = ((InterfaceC3534) obj).mo881(interfaceC4137.getKey());
                C4794 c4794 = C4794.f15814;
                if (interfaceC3534Mo881 == c4794) {
                    return interfaceC4137;
                }
                C0373 c0373 = C0373.f1369;
                AbstractC2132 abstractC2132 = (AbstractC2132) interfaceC3534Mo881.mo865(c0373);
                if (abstractC2132 == null) {
                    c3229 = new C3229(interfaceC3534Mo881, interfaceC4137);
                } else {
                    InterfaceC3534 interfaceC3534Mo882 = interfaceC3534Mo881.mo881(c0373);
                    if (interfaceC3534Mo882 == c4794) {
                        return new C3229(interfaceC4137, abstractC2132);
                    }
                    c3229 = new C3229(new C3229(interfaceC3534Mo882, interfaceC4137), abstractC2132);
                }
                return c3229;
            case 1:
                return Boolean.valueOf(((Boolean) obj).booleanValue());
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                return ((InterfaceC3534) obj).mo860((InterfaceC4137) obj2);
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                return ((InterfaceC3534) obj).mo860((InterfaceC4137) obj2);
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                C2384 c2384 = (C2384) obj2;
                return AbstractC2164.m4188(Integer.valueOf(c2384.m1405()), Float.valueOf(AbstractC4554.m7922(c2384.m1401(), -0.5f, 0.5f)), Integer.valueOf(c2384.mo1406()));
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                return Boolean.valueOf(AbstractC3831.m6874(obj, obj2));
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                C0846 c0846 = (C0846) obj2;
                return AbstractC2164.m4188(Integer.valueOf(c0846.m1761()), Integer.valueOf(((C0169) c0846.f3020.f15684).m360()));
            case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                Map mapMo1715 = ((C2069) obj2).mo1715();
                if (mapMo1715.isEmpty()) {
                    return null;
                }
                return mapMo1715;
            case 8:
                ((Integer) obj2).getClass();
                AbstractC4489.m7773(AbstractC3831.m6835(1), (C5362) obj);
                return c2358;
            case 9:
                ((Integer) obj2).getClass();
                C5063.m8645(AbstractC3831.m6835(1), (C5362) obj);
                return c2358;
            case 10:
                return Boolean.valueOf(((C5818) obj2).f19155.isEnumConstant() == ((Boolean) obj).booleanValue());
            case 11:
                return Boolean.valueOf(((C5818) obj2).f19155.isEnumConstant() != ((Boolean) obj).booleanValue());
            case 12:
                Boolean bool = (Boolean) ((InterfaceC4745) obj).mo211(((C5818) obj2).f19155.getType());
                bool.booleanValue();
                return bool;
            case 13:
                if (obj != null) {
                    throw new ClassCastException();
                }
                ((C5818) obj2).f19155.getGenericType();
                throw null;
            case 14:
                Boolean bool2 = (Boolean) ((InterfaceC4745) obj).mo211(((C5818) obj2).f19155.getGenericType());
                bool2.booleanValue();
                return bool2;
            case 15:
                Set set = (Set) obj;
                List listM509 = AbstractC0246.m509(((Executable) ((C1989) obj2).f6567).getGenericExceptionTypes());
                if (set.size() == listM509.size()) {
                    Iterator it = set.iterator();
                    if (it.hasNext()) {
                        AbstractC2049.m4001(it.next());
                        throw null;
                    }
                    z = true;
                }
                return Boolean.valueOf(!z);
            case 16:
                Set set2 = (Set) obj;
                List listM5010 = AbstractC0246.m509(((Executable) ((C1989) obj2).f6567).getGenericParameterTypes());
                if (set2.size() == listM5010.size()) {
                    Iterator it2 = set2.iterator();
                    if (it2.hasNext()) {
                        AbstractC2049.m4001(it2.next());
                        throw null;
                    }
                    z = true;
                }
                return Boolean.valueOf(z);
            case 17:
                Set set3 = (Set) obj;
                List listM5011 = AbstractC0246.m509(((Executable) ((C1989) obj2).f6567).getGenericParameterTypes());
                if (set3.size() == listM5011.size()) {
                    Iterator it3 = set3.iterator();
                    if (it3.hasNext()) {
                        AbstractC2049.m4001(it3.next());
                        throw null;
                    }
                    z = true;
                }
                return Boolean.valueOf(!z);
            case 18:
                try {
                    Boolean bool3 = (Boolean) ((InterfaceC4745) obj).mo211(((C2246) obj2).f7452.getReturnType());
                    bool3.booleanValue();
                    c4535 = bool3;
                    break;
                } catch (Throwable th) {
                    c4535 = new C4535(th);
                }
                Boolean bool4 = Boolean.FALSE;
                boolean z2 = c4535 instanceof C4535;
                Object obj3 = c4535;
                if (z2) {
                    obj3 = bool4;
                }
                return (Boolean) obj3;
            case 19:
                return Boolean.valueOf(((Executable) ((C1989) obj2).f6567).isVarArgs() == ((Boolean) obj).booleanValue());
            case 20:
                return Boolean.valueOf(((Executable) ((C1989) obj2).f6567).isVarArgs() != ((Boolean) obj).booleanValue());
            case 21:
                ((C1989) obj2).getClass();
                throw new IllegalStateException("getAnnotatedReturnType is not supported on Android.");
            case 22:
                ((C1989) obj2).getClass();
                throw new IllegalStateException("getAnnotatedReturnType is not supported on Android.");
            case 23:
                ((C1989) obj2).getClass();
                throw new IllegalStateException("getAnnotatedReceiverType is not supported on Android.");
            case 24:
                ((C1989) obj2).getClass();
                throw new IllegalStateException("getAnnotatedReceiverType is not supported on Android.");
            case 25:
                ((C1989) obj2).getClass();
                throw new IllegalStateException("getAnnotatedParameterTypes is not supported on Android.");
            case 26:
                if (obj != null) {
                    throw new ClassCastException();
                }
                ((C2246) obj2).f7452.getGenericReturnType();
                throw null;
            case 27:
                ((C1989) obj2).getClass();
                throw new IllegalStateException("getAnnotatedParameterTypes is not supported on Android.");
            case 28:
                ((C1989) obj2).getClass();
                throw new IllegalStateException("getAnnotatedExceptionTypes is not supported on Android.");
            default:
                ((C1989) obj2).getClass();
                throw new IllegalStateException("getAnnotatedExceptionTypes is not supported on Android.");
        }
    }

    public /* synthetic */ C4876(int i, int i2) {
        this.f16038 = i2;
    }
}
