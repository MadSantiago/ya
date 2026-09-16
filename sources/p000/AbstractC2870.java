package p000;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: ۥۧؔۡؗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2870 implements InterfaceC0443, InterfaceC4853, Serializable {

    /* JADX INFO: renamed from: ۦۨ */
    public final InterfaceC0443 f9589;

    public AbstractC2870(InterfaceC0443 interfaceC0443) {
        this.f9589 = interfaceC0443;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object objMo5439 = mo5439();
        if (objMo5439 == null) {
            objMo5439 = getClass().getName();
        }
        sb.append(objMo5439);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۥَ */
    public StackTraceElement mo5439() {
        int iIntValue;
        String strM7746c;
        Method method;
        Object objInvoke;
        Method method2;
        Object objInvoke2;
        InterfaceC4470 interfaceC4470 = (InterfaceC4470) getClass().getAnnotation(InterfaceC4470.class);
        String str = null;
        if (interfaceC4470 == null || interfaceC4470.m7750v() < 1) {
            return null;
        }
        try {
            Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            iIntValue = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            iIntValue = -1;
        }
        int i = iIntValue >= 0 ? interfaceC4470.m7748l()[iIntValue] : -1;
        C4682 c4682 = AbstractC4489.f14852;
        C4682 c4683 = AbstractC4489.f14845;
        if (c4683 == null) {
            try {
                C4682 c4684 = new C4682(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                AbstractC4489.f14845 = c4684;
                c4683 = c4684;
            } catch (Exception unused2) {
                AbstractC4489.f14845 = c4682;
                c4683 = c4682;
            }
        }
        if (c4683 != c4682 && (method = c4683.f15423) != null && (objInvoke = method.invoke(getClass(), null)) != null && (method2 = c4683.f15422) != null && (objInvoke2 = method2.invoke(objInvoke, null)) != null) {
            Method method3 = c4683.f15421;
            Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
            if (objInvoke3 instanceof String) {
                str = (String) objInvoke3;
            }
        }
        if (str == null) {
            strM7746c = interfaceC4470.m7746c();
        } else {
            strM7746c = str + '/' + interfaceC4470.m7746c();
        }
        return new StackTraceElement(strM7746c, interfaceC4470.m7749m(), interfaceC4470.m7747f(), i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // p000.InterfaceC0443
    /* JADX INFO: renamed from: ۥّ */
    public final void mo335(Object obj) {
        ?? r2 = this;
        while (true) {
            AbstractC2870 abstractC2870 = (AbstractC2870) r2;
            InterfaceC0443 interfaceC0443 = abstractC2870.f9589;
            try {
                obj = abstractC2870.mo218(obj);
                if (obj == EnumC2282.f7590) {
                    return;
                }
            } catch (Throwable th) {
                obj = new C4535(th);
            }
            abstractC2870.mo1662();
            if (!(interfaceC0443 instanceof AbstractC2870)) {
                interfaceC0443.mo335(obj);
                return;
            }
            r2 = interfaceC0443;
        }
    }

    /* JADX INFO: renamed from: ۥٓ */
    public InterfaceC0443 mo217(InterfaceC0443 interfaceC0443, Object obj) {
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    /* JADX INFO: renamed from: ۥٖ */
    public abstract Object mo218(Object obj);

    @Override // p000.InterfaceC4853
    /* JADX INFO: renamed from: ۦؑ */
    public InterfaceC4853 mo3583() {
        InterfaceC0443 interfaceC0443 = this.f9589;
        if (interfaceC0443 instanceof InterfaceC4853) {
            return (InterfaceC4853) interfaceC0443;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦٗ */
    public void mo1662() {
    }
}
