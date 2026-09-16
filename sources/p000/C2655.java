package p000;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: ۥًۤؑؐ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2655 implements InvocationHandler {

    /* JADX INFO: renamed from: ۥؗ */
    public final /* synthetic */ C1414 f8811;

    /* JADX INFO: renamed from: ۥۗ */
    public final /* synthetic */ Class f8812;

    /* JADX INFO: renamed from: ۥۣ */
    public final Object[] f8813 = new Object[0];

    public C2655(C1414 c1414, Class cls) {
        this.f8811 = c1414;
        this.f8812 = cls;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0065 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x0074 A[SYNTHETIC] */
    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        AbstractC5376 abstractC5376M9031;
        Object obj2;
        Class cls = this.f8812;
        if (method.getDeclaringClass() == Object.class) {
            return method.invoke(this, objArr);
        }
        if (objArr == null) {
            objArr = this.f8813;
        }
        Object[] objArr2 = objArr;
        C4992 c4992 = AbstractC4057.f13517;
        if (c4992.mo8217(method)) {
            return c4992.mo8218(method, cls, obj, objArr2);
        }
        C1414 c1414 = this.f8811;
        while (true) {
            Object objPutIfAbsent = ((ConcurrentHashMap) c1414.f4871).get(method);
            if (!(objPutIfAbsent instanceof AbstractC5376)) {
                if (objPutIfAbsent != null) {
                    synchronized (objPutIfAbsent) {
                        obj2 = ((ConcurrentHashMap) c1414.f4871).get(method);
                        if (obj2 == null) {
                            abstractC5376M9031 = (AbstractC5376) obj2;
                            break;
                        }
                    }
                } else {
                    Object obj3 = new Object();
                    synchronized (obj3) {
                        try {
                            objPutIfAbsent = ((ConcurrentHashMap) c1414.f4871).putIfAbsent(method, obj3);
                            if (objPutIfAbsent != null) {
                                synchronized (objPutIfAbsent) {
                                    try {
                                        obj2 = ((ConcurrentHashMap) c1414.f4871).get(method);
                                        if (obj2 == null) {
                                        }
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                                abstractC5376M9031 = (AbstractC5376) obj2;
                                break;
                            }
                            try {
                                abstractC5376M9031 = AbstractC5376.m9031(c1414, cls, method);
                                ((ConcurrentHashMap) c1414.f4871).put(method, abstractC5376M9031);
                                break;
                            } catch (Throwable th2) {
                                ((ConcurrentHashMap) c1414.f4871).remove(method);
                                throw th2;
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
            } else {
                abstractC5376M9031 = (AbstractC5376) objPutIfAbsent;
                break;
            }
        }
        return abstractC5376M9031.mo7864(new C0724(abstractC5376M9031.f17755, obj, objArr2, abstractC5376M9031.f17754, abstractC5376M9031.f17753), objArr2);
    }
}
