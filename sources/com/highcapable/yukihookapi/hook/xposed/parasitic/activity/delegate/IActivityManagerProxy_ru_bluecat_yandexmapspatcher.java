package com.highcapable.yukihookapi.hook.xposed.parasitic.activity.delegate;

import android.content.ComponentName;
import android.content.Intent;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;
import p000.AbstractC2405;
import p000.AbstractC3831;
import p000.AbstractC4554;
import p000.AbstractC5041;
import p000.AbstractC5378;
import p000.C1967;
import p000.C4535;
import p000.InterfaceC4656;

/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class IActivityManagerProxy_ru_bluecat_yandexmapspatcher implements InvocationHandler {
    public static final int $stable = 8;
    private final Object baseInstance;

    public IActivityManagerProxy_ru_bluecat_yandexmapspatcher(Object obj) {
        this.baseInstance = obj;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00d0  */
    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        ComponentName component;
        ClassLoader classLoader;
        Object c4535;
        String str;
        Object obj2 = this.baseInstance;
        if (AbstractC3831.m6874(method != null ? method.getName() : null, "startActivity") && objArr != null) {
            int length = objArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                }
                if (objArr[i] instanceof Intent) {
                    break;
                }
                i++;
            }
            Object obj3 = objArr[i];
            Intent intent = obj3 instanceof Intent ? (Intent) obj3 : null;
            if (intent != null && (component = intent.getComponent()) != null) {
                String packageName = component.getPackageName();
                C1967.f6501.getClass();
                if (AbstractC3831.m6874(packageName, C1967.m3847()) && (classLoader = AbstractC4554.class.getClassLoader()) != null && AbstractC2405.m4528(classLoader, component.getClassName())) {
                    Intent intent2 = new Intent();
                    String packageName2 = component.getPackageName();
                    Class<?> clsM4531 = AbstractC2405.m4531(component.getClassName(), null, 3);
                    if (clsM4531 != null) {
                        try {
                            Class<InterfaceC4656> cls = InterfaceC4656.class;
                            if (AbstractC5041.m8557(cls).f10543.isAssignableFrom(clsM4531)) {
                                try {
                                    Object[] objArrCopyOf = Arrays.copyOf(new Object[0], 0);
                                    AbstractC2405.m4529(clsM4531, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
                                    Class<InterfaceC4656> clsM9037 = AbstractC5378.m9037(AbstractC5041.m8557(cls));
                                    if (clsM9037 != null) {
                                        cls = clsM9037;
                                    }
                                    throw new IllegalStateException((clsM4531 + "'s instance cannot be cast to type " + cls + ".").toString());
                                } catch (Throwable unused) {
                                }
                            }
                            c4535 = null;
                        } catch (Throwable th) {
                            c4535 = new C4535(th);
                        }
                        if (c4535 != null) {
                            c4535 = null;
                        }
                        str = (String) c4535;
                        if (str == null) {
                            str = "";
                        }
                    } else {
                        str = "";
                    }
                    intent2.setClassName(packageName2, str);
                    intent2.putExtra("", intent);
                    objArr[i] = intent2;
                }
            }
        }
        if (method == null) {
            return null;
        }
        if (objArr == null) {
            objArr = new Object[0];
        }
        return method.invoke(obj2, Arrays.copyOf(objArr, objArr.length));
    }
}
