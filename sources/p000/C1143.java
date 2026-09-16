package p000;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: ۥّؑۘۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1143 implements InvocationHandler {

    /* JADX INFO: renamed from: ۥؗ */
    public String f3985;

    /* JADX INFO: renamed from: ۥۗ */
    public boolean f3986;

    /* JADX INFO: renamed from: ۥۣ */
    public final ArrayList f3987;

    public C1143(ArrayList arrayList) {
        this.f3987 = arrayList;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        if (objArr == null) {
            objArr = new Object[0];
        }
        String name = method.getName();
        Class<?> returnType = method.getReturnType();
        if (AbstractC3831.m6874(name, "supports") && AbstractC3831.m6874(Boolean.TYPE, returnType)) {
            return Boolean.TRUE;
        }
        if (AbstractC3831.m6874(name, "unsupported") && AbstractC3831.m6874(Void.TYPE, returnType)) {
            this.f3986 = true;
            return null;
        }
        boolean zM6874 = AbstractC3831.m6874(name, "protocols");
        ArrayList arrayList = this.f3987;
        if (zM6874 && objArr.length == 0) {
            return arrayList;
        }
        if ((AbstractC3831.m6874(name, "selectProtocol") || AbstractC3831.m6874(name, "select")) && String.class.equals(returnType) && objArr.length == 1) {
            Object obj2 = objArr[0];
            if (obj2 instanceof List) {
                List list = (List) obj2;
                int size = list.size();
                if (size >= 0) {
                    int i = 0;
                    while (true) {
                        String str = (String) list.get(i);
                        if (arrayList.contains(str)) {
                            this.f3985 = str;
                            return str;
                        }
                        if (i != size) {
                            i++;
                        }
                    }
                }
                String str2 = (String) arrayList.get(0);
                this.f3985 = str2;
                return str2;
            }
        }
        if ((!AbstractC3831.m6874(name, "protocolSelected") && !AbstractC3831.m6874(name, "selected")) || objArr.length != 1) {
            return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
        }
        this.f3985 = (String) objArr[0];
        return null;
    }
}
