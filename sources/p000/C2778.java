package p000;

import java.lang.annotation.Annotation;
import java.lang.reflect.Executable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: ۥۦؑۜۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2778 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ C4229 f9261;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f9262;

    public /* synthetic */ C2778(C4229 c4229, int i) {
        this.f9262 = i;
        this.f9261 = c4229;
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        boolean zM6874;
        int i = this.f9262;
        boolean z = false;
        C4229 c4229 = this.f9261;
        switch (i) {
            case 0:
                zM6874 = AbstractC3831.m6874(((C2246) obj2).f7452.getReturnType(), AbstractC5537.m9264(obj, c4229, "Method: returnType"));
                return Boolean.valueOf(zM6874);
            case 1:
                zM6874 = AbstractC3831.m6874(((C5818) obj2).f19155.getType(), AbstractC5537.m9264(obj, c4229, "Field: type"));
                return Boolean.valueOf(zM6874);
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                List list = (List) obj;
                List listM509 = AbstractC0246.m509(((Executable) ((C1989) obj2).f6567).getParameterTypes());
                if (list.size() == listM509.size()) {
                    int i2 = 0;
                    for (Object obj3 : list) {
                        int i3 = i2 + 1;
                        Class cls = (Class) listM509.get(i2);
                        Class clsM9264 = AbstractC5537.m9264(obj3, c4229, null);
                        Class clsM9037 = AbstractC5378.m9037(AbstractC5041.m8557(AbstractC2198.class));
                        if (clsM9037 == null) {
                            clsM9037 = AbstractC2198.class;
                        }
                        if (AbstractC3831.m6874(clsM9264, clsM9037) || AbstractC3831.m6874(cls, clsM9264)) {
                            i2 = i3;
                        }
                    }
                    z = true;
                }
                return Boolean.valueOf(z);
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                List list2 = (List) obj;
                Annotation[][] parameterAnnotations = ((Executable) ((C1989) obj2).f6567).getParameterAnnotations();
                ArrayList arrayList = new ArrayList(parameterAnnotations.length);
                for (Annotation[] annotationArr : parameterAnnotations) {
                    ArrayList arrayList2 = new ArrayList(annotationArr.length);
                    for (Annotation annotation : annotationArr) {
                        arrayList2.add(AbstractC5041.m8557(annotation.annotationType()).f10543);
                    }
                    arrayList.add(arrayList2);
                }
                if (list2.size() == arrayList.size()) {
                    Iterator it = list2.iterator();
                    int i4 = 0;
                    while (it.hasNext()) {
                        int i5 = i4 + 1;
                        if (AbstractC5537.m9227((Collection) it.next(), (List) arrayList.get(i4), c4229)) {
                            i4 = i5;
                        }
                    }
                    z = true;
                }
                return Boolean.valueOf(z);
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                List list3 = (List) obj;
                Annotation[][] parameterAnnotations2 = ((Executable) ((C1989) obj2).f6567).getParameterAnnotations();
                ArrayList arrayList3 = new ArrayList(parameterAnnotations2.length);
                for (Annotation[] annotationArr2 : parameterAnnotations2) {
                    ArrayList arrayList4 = new ArrayList(annotationArr2.length);
                    for (Annotation annotation2 : annotationArr2) {
                        arrayList4.add(AbstractC5041.m8557(annotation2.annotationType()).f10543);
                    }
                    arrayList3.add(arrayList4);
                }
                if (list3.size() == arrayList3.size()) {
                    Iterator it2 = list3.iterator();
                    int i6 = 0;
                    while (true) {
                        if (it2.hasNext()) {
                            int i7 = i6 + 1;
                            if (AbstractC5537.m9227((Collection) it2.next(), (List) arrayList3.get(i6), c4229)) {
                                i6 = i7;
                            }
                        } else {
                            z = true;
                        }
                    }
                }
                zM6874 = !z;
                return Boolean.valueOf(zM6874);
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                List list4 = (List) obj;
                List listM5010 = AbstractC0246.m509(((Executable) ((C1989) obj2).f6567).getParameterTypes());
                if (list4.size() == listM5010.size()) {
                    Iterator it3 = list4.iterator();
                    int i8 = 0;
                    while (true) {
                        if (it3.hasNext()) {
                            Object next = it3.next();
                            int i9 = i8 + 1;
                            Class cls2 = (Class) listM5010.get(i8);
                            Class clsM9265 = AbstractC5537.m9264(next, c4229, null);
                            Class clsM9038 = AbstractC5378.m9037(AbstractC5041.m8557(AbstractC2198.class));
                            if (clsM9038 == null) {
                                clsM9038 = AbstractC2198.class;
                            }
                            if (AbstractC3831.m6874(clsM9265, clsM9038) || AbstractC3831.m6874(cls2, clsM9265)) {
                                i8 = i9;
                            }
                        } else {
                            z = true;
                        }
                    }
                }
                zM6874 = !z;
                return Boolean.valueOf(zM6874);
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                Set set = (Set) obj;
                List listM5011 = AbstractC0246.m509(((Executable) ((C1989) obj2).f6567).getExceptionTypes());
                if (set.size() == listM5011.size()) {
                    int i10 = 0;
                    for (Object obj4 : set) {
                        int i11 = i10 + 1;
                        Class cls3 = (Class) listM5011.get(i10);
                        Class clsM9266 = AbstractC5537.m9264(obj4, c4229, null);
                        Class clsM9039 = AbstractC5378.m9037(AbstractC5041.m8557(AbstractC2198.class));
                        if (clsM9039 == null) {
                            clsM9039 = AbstractC2198.class;
                        }
                        if (AbstractC3831.m6874(clsM9266, clsM9039) || AbstractC3831.m6874(cls3, clsM9266)) {
                            i10 = i11;
                        }
                    }
                    z = true;
                }
                return Boolean.valueOf(z);
            case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                Set set2 = (Set) obj;
                List listM5012 = AbstractC0246.m509(((Executable) ((C1989) obj2).f6567).getExceptionTypes());
                if (set2.size() == listM5012.size()) {
                    Iterator it4 = set2.iterator();
                    int i12 = 0;
                    while (true) {
                        if (it4.hasNext()) {
                            Object next2 = it4.next();
                            int i13 = i12 + 1;
                            Class cls4 = (Class) listM5012.get(i12);
                            Class clsM9267 = AbstractC5537.m9264(next2, c4229, null);
                            Class clsM90310 = AbstractC5378.m9037(AbstractC5041.m8557(AbstractC2198.class));
                            if (clsM90310 == null) {
                                clsM90310 = AbstractC2198.class;
                            }
                            if (AbstractC3831.m6874(clsM9267, clsM90310) || AbstractC3831.m6874(cls4, clsM9267)) {
                                i12 = i13;
                            }
                        } else {
                            z = true;
                        }
                    }
                }
                zM6874 = !z;
                return Boolean.valueOf(zM6874);
            case 8:
                Set set3 = (Set) obj;
                Annotation[] annotationArrM7947 = ((C4571) obj2).m7947();
                ArrayList arrayList5 = new ArrayList(annotationArrM7947.length);
                for (Annotation annotation3 : annotationArrM7947) {
                    arrayList5.add(AbstractC5041.m8557(annotation3.annotationType()).f10543);
                }
                Set set4 = set3;
                if (set4.size() == arrayList5.size()) {
                    int i14 = 0;
                    for (Object obj5 : set4) {
                        int i15 = i14 + 1;
                        Class cls5 = (Class) arrayList5.get(i14);
                        Class clsM9268 = AbstractC5537.m9264(obj5, c4229, null);
                        Class clsM90311 = AbstractC5378.m9037(AbstractC5041.m8557(AbstractC2198.class));
                        if (clsM90311 == null) {
                            clsM90311 = AbstractC2198.class;
                        }
                        if (AbstractC3831.m6874(clsM9268, clsM90311) || AbstractC3831.m6874(cls5, clsM9268)) {
                            i14 = i15;
                        }
                    }
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                Set set5 = (Set) obj;
                Annotation[] annotationArrM7948 = ((C4571) obj2).m7947();
                ArrayList arrayList6 = new ArrayList(annotationArrM7948.length);
                for (Annotation annotation4 : annotationArrM7948) {
                    arrayList6.add(AbstractC5041.m8557(annotation4.annotationType()).f10543);
                }
                Set set6 = set5;
                if (set6.size() == arrayList6.size()) {
                    Iterator it5 = set6.iterator();
                    int i16 = 0;
                    while (true) {
                        if (it5.hasNext()) {
                            Object next3 = it5.next();
                            int i17 = i16 + 1;
                            Class cls6 = (Class) arrayList6.get(i16);
                            Class clsM9269 = AbstractC5537.m9264(next3, c4229, null);
                            Class clsM90312 = AbstractC5378.m9037(AbstractC5041.m8557(AbstractC2198.class));
                            if (clsM90312 == null) {
                                clsM90312 = AbstractC2198.class;
                            }
                            if (AbstractC3831.m6874(clsM9269, clsM90312) || AbstractC3831.m6874(cls6, clsM9269)) {
                                i16 = i17;
                            }
                        } else {
                            z = true;
                        }
                    }
                }
                zM6874 = !z;
                return Boolean.valueOf(zM6874);
        }
    }
}
