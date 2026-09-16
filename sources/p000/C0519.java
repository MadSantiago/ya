package p000;

import android.view.InputDevice;
import android.view.KeyEvent;
import androidx.work.Worker;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: ۥٌؖؒٓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0519 implements InterfaceC4745, InterfaceC5578 {

    /* JADX INFO: renamed from: ۥْ */
    public final Object f1846;

    /* JADX INFO: renamed from: ۦ۟ */
    public final Object f1847;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f1848;

    public /* synthetic */ C0519(int i, Object obj, Object obj2) {
        this.f1848 = i;
        this.f1847 = obj;
        this.f1846 = obj2;
    }

    @Override // p000.InterfaceC5578
    /* JADX INFO: renamed from: ۦؑ */
    public void mo1168(C2147 c2147) {
        ((C2600) this.f1846).mo335(c2147);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0056  */
    @Override // p000.InterfaceC4745
    /* JADX INFO: renamed from: ۦؚ */
    public final Object mo211(Object obj) {
        boolean z;
        long j;
        C5630 c5630;
        Object c4535;
        C5630 c5631;
        int i = 13;
        int i2 = 21;
        int i3 = 6;
        int i4 = 20;
        int i5 = 3;
        int i6 = 5;
        int i7 = 4;
        int i8 = 19;
        int i9 = 2;
        boolean zM3933 = false;
        int i10 = 1;
        switch (this.f1848) {
            case 0:
                KeyEvent keyEvent = ((C2581) obj).f8625;
                InterfaceC4367 interfaceC4367 = (InterfaceC4367) this.f1846;
                if (!((C4153) this.f1847).m7347()) {
                    interfaceC4367.setValue(Boolean.FALSE);
                }
                return Boolean.FALSE;
            case 1:
                try {
                    ((C0201) this.f1847).cancel();
                    break;
                } catch (Throwable unused) {
                }
                return C2358.f7817;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                KeyEvent keyEvent2 = ((C2581) obj).f8625;
                if (((C5837) this.f1847).m9647() == EnumC1546.f5231 && keyEvent2.getKeyCode() == 4 && AbstractC1434.m3056(keyEvent2) == 1) {
                    ((C3635) this.f1846).m6478(null);
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                C5570 c5570 = (C5570) obj;
                synchronized (AbstractC1538.f5203) {
                    j = AbstractC1538.f5204;
                    AbstractC1538.f5204 = 1 + j;
                }
                return new C5038(j, c5570, (InterfaceC4745) this.f1847, (InterfaceC4745) this.f1846);
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                C1405 c1405 = (C1405) this.f1847;
                Object obj2 = c1405.f4836;
                C2600 c2600 = (C2600) this.f1846;
                synchronized (obj2) {
                    ((ArrayList) c1405.f4835).remove(c2600);
                }
                return C2358.f7817;
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                Class cls = (Class) obj;
                C2244 c2244 = (C2244) ((AbstractC2724) this.f1847);
                C4229 c4229 = (C4229) this.f1846;
                C4036 c4036 = c4229.f14027;
                if (c4036 == null) {
                    c4036 = AbstractC5537.f18282;
                }
                int i11 = 16;
                int i12 = 17;
                int i13 = 18;
                C5630 c5632 = new C5630(AbstractC5537.m9228(AbstractC5537.m9228(AbstractC5537.m9228(AbstractC5537.m9228(AbstractC5537.m9228(AbstractC5537.m9228(AbstractC5537.m9228(AbstractC5537.m9228(AbstractC5537.m9228(AbstractC5537.m9228(new C5630(AbstractC5537.m9228(AbstractC5537.m9228(AbstractC5537.m9228(AbstractC5537.m9228(AbstractC5537.m9228(AbstractC5537.m9228(AbstractC5537.m9228(AbstractC5537.m9228(AbstractC5537.m9228(AbstractC5537.m9228(AbstractC5537.m9228(AbstractC5537.m9228(AbstractC5537.m9228(AbstractC5537.m9228(AbstractC5537.m9228(AbstractC5537.m9228(AbstractC5537.m9228(AbstractC5537.m9228(AbstractC5537.m9228(AbstractC5537.m9228(AbstractC5537.m9228(AbstractC5537.m9228(AbstractC5537.m9228(AbstractC5537.m9228(AbstractC5537.m9228(new C5630(AbstractC5537.m9265(new C3527(1, c4036.mo3804(cls)), c2244, c4229), C4515.f14916, 1), c4229, "parameters", c2244.f7447, new C2778(c4229, i9)), c4229, "parametersNot", c2244.f7438, new C2778(c4229, i6)), c4229, "parametersCondition", null, new C4599(0)), c4229, "parameterCount", c2244.f7446, new C4599(i10)), c4229, "parameterCountCondition", null, new C4599(i9)), c4229, "typeParameters", c2244.f7445, new C4599(i5)), c4229, "typeParametersNot", c2244.f7442, new C4599(i7)), c4229, "exceptionTypes", c2244.f7440, new C2778(c4229, i3)), c4229, "exceptionTypesNot", c2244.f7441, new C2778(c4229, 7)), c4229, "genericExceptionTypes", c2244.f7448, new C4599(i3)), c4229, "genericExceptionTypesNot", c2244.f7451, new C4876(15)), c4229, "genericParameters", c2244.f7450, new C4876(i11)), c4229, "genericParametersNot", c2244.f7433, new C4876(i12)), c4229, "isVarArgs", null, new C4876(i8)), c4229, "isVarArgsNot", null, new C4876(i4)), c4229, "parameterAnnotations", c2244.f7434, new C2778(c4229, i5)), c4229, "parameterAnnotationsNot", c2244.f7432, new C2778(c4229, i7)), c4229, "annotatedReturnType", c2244.f7435, new C4876(i2)), c4229, "annotatedReturnTypeNot", c2244.f7444, new C4876(22)), c4229, "annotatedReceiverType", c2244.f7449, new C4876(23)), c4229, "annotatedReceiverTypeNot", c2244.f7437, new C4876(24)), c4229, "annotatedParameterTypes", c2244.f7443, new C4876(25)), c4229, "annotatedParameterTypesNot", c2244.f7436, new C4876(27)), c4229, "annotatedExceptionTypes", c2244.f7431, new C4876(28)), c4229, "annotatedExceptionTypesNot", c2244.f7430, new C4876(29)), C4515.f14915, 1), c4229, "returnType", c2244.f7439, new C2778(c4229, 0)), c4229, "returnTypeCondition", null, new C4876(i13)), c4229, "genericReturnType", null, new C4876(26)), c4229, "genericReturnTypeCondition", null, new C4599(i6)), c4229, "isBridge", null, new C4599(13)), c4229, "isBridgeNot", null, new C4599(i11)), c4229, "isDefault", null, new C4599(i12)), c4229, "isDefaultNot", null, new C4599(i13)), c4229, "defaultValue", null, new C4599(i8)), c4229, "defaultValueCondition", null, new C4599(i4)), new C4618(i8), 1);
                C3131 c3131M8557 = AbstractC5041.m8557(Method.class);
                if (c3131M8557.equals(AbstractC5041.m8557(Method.class))) {
                    c5630 = new C5630(c5632, new C4877(c4229, 3), 1);
                } else if (c3131M8557.equals(AbstractC5041.m8557(Constructor.class))) {
                    c5630 = new C5630(c5632, new C4877(c4229, 4), 1);
                } else {
                    if (!c3131M8557.equals(AbstractC5041.m8557(Field.class))) {
                        C5028.m8449(c5632, "Unsupported member type: ");
                        return null;
                    }
                    c5630 = new C5630(c5632, new C4877(c4229, 5), 1);
                }
                return AbstractC1961.m3843(c5630);
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                Class cls2 = (Class) obj;
                C2749 c2749 = (C2749) this.f1847;
                C4229 c42210 = (C4229) this.f1846;
                Object obj3 = c42210.f14027;
                if (obj3 == null) {
                    obj3 = AbstractC5537.f18282;
                }
                Object obj4 = obj3;
                try {
                    c4535 = AbstractC0246.m509(cls2.getDeclaredFields());
                    break;
                } catch (Throwable th) {
                    c4535 = new C4535(th);
                }
                Throwable thM405 = AbstractC0183.m405(c4535);
                if (thM405 != null) {
                    String str = "Failed to get declared fields in " + obj4 + " because got an exception.";
                    if (AbstractC3761.m6632(AbstractC4009.f13362) <= 2) {
                        AbstractC4009.f13365.mo7234(str, thM405);
                    }
                }
                if (c4535 instanceof C4535) {
                    c4535 = null;
                }
                Object obj5 = (List) c4535;
                if (obj5 == null) {
                    obj5 = C2340.f7777;
                }
                C5630 c5633 = new C5630(AbstractC5537.m9228(AbstractC5537.m9228(AbstractC5537.m9228(AbstractC5537.m9228(AbstractC5537.m9228(AbstractC5537.m9228(new C5630(AbstractC5537.m9265(new C3527(1, obj5), c2749, c42210), C4515.f14917, 1), c42210, "isEnumConstant", null, new C4876(10)), c42210, "isEnumConstantNot", null, new C4876(11)), c42210, "type", null, new C2778(c42210, i10)), c42210, "typeCondition", c2749.f9096, new C4876(12)), c42210, "genericType", null, new C4876(i)), c42210, "genericTypeCondition", null, new C4876(14)), new C4618(i8), 1);
                C3131 c3131M8558 = AbstractC5041.m8557(Field.class);
                if (c3131M8558.equals(AbstractC5041.m8557(Method.class))) {
                    c5631 = new C5630(c5633, new C4877(c42210, 0), 1);
                } else if (c3131M8558.equals(AbstractC5041.m8557(Constructor.class))) {
                    c5631 = new C5630(c5633, new C4877(c42210, 1), 1);
                } else {
                    if (!c3131M8558.equals(AbstractC5041.m8557(Field.class))) {
                        C5028.m8449(c5633, "Unsupported member type: ");
                        return null;
                    }
                    c5631 = new C5630(c5633, new C4877(c42210, 2), 1);
                }
                return AbstractC1961.m3843(c5631);
            case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                KeyEvent keyEvent3 = ((C2581) obj).f8625;
                InterfaceC0475 interfaceC0475 = (InterfaceC0475) this.f1847;
                InputDevice device = keyEvent3.getDevice();
                if (device != null) {
                    if (!device.supportsSource(513) || ((device.isVirtual() && keyEvent3.getSource() != 33554433) || AbstractC1434.m3056(keyEvent3) != 2 || keyEvent3.getSource() == 257)) {
                        zM3933 = false;
                    } else if (AbstractC1631.m3430(19, keyEvent3)) {
                        zM3933 = ((C2016) interfaceC0475).m3933(5, true);
                    } else if (AbstractC1631.m3430(20, keyEvent3)) {
                        zM3933 = ((C2016) interfaceC0475).m3933(6, true);
                    } else if (AbstractC1631.m3430(21, keyEvent3)) {
                        zM3933 = ((C2016) interfaceC0475).m3933(3, true);
                    } else if (AbstractC1631.m3430(22, keyEvent3)) {
                        zM3933 = ((C2016) interfaceC0475).m3933(4, true);
                    } else if (AbstractC1631.m3430(23, keyEvent3)) {
                        InterfaceC3508 interfaceC3508 = ((C5837) this.f1846).f19221;
                        if (interfaceC3508 != null) {
                            ((C3773) interfaceC3508).m6676();
                        }
                        zM3933 = true;
                    } else {
                        zM3933 = false;
                    }
                }
                return Boolean.valueOf(zM3933);
            default:
                Throwable th2 = (Throwable) obj;
                if (th2 instanceof C5771) {
                    ((Worker) this.f1847).f243.compareAndSet(-256, ((C5771) th2).f19022);
                }
                ((C4995) this.f1846).cancel(false);
                return C2358.f7817;
        }
    }

    @Override // p000.InterfaceC5578
    /* JADX INFO: renamed from: ۦٛ */
    public void mo1169(C0201 c0201, IOException iOException) {
        if (c0201.f732) {
            return;
        }
        ((C2600) this.f1846).mo335(new C4535(iOException));
    }
}
