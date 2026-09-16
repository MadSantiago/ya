package p000;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.Arrays;

/* JADX INFO: renamed from: ۦًؓٞؗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3657 extends AbstractC3072 {

    /* JADX INFO: renamed from: ۥَ */
    public final Method f12248;

    public C3657(Method method) {
        this.f12248 = method;
    }

    @Override // p000.AbstractC1605
    /* JADX INFO: renamed from: ۥْ */
    public final Member mo2502() {
        return this.f12248;
    }

    /* JADX INFO: renamed from: ۥۥ */
    public final Object m6534(Object... objArr) {
        m3377();
        return this.f12248.invoke(this.f10320, Arrays.copyOf(objArr, objArr.length));
    }

    /* JADX INFO: renamed from: ۥۨ */
    public final Object m6535(Object... objArr) throws IllegalAccessException, InvocationTargetException {
        m3377();
        Object objInvoke = this.f12248.invoke(this.f10320, Arrays.copyOf(objArr, objArr.length));
        if (objInvoke == null) {
            return null;
        }
        return objInvoke;
    }

    @Override // p000.AbstractC3072
    /* JADX INFO: renamed from: ۦۧ */
    public final AbstractC3072 mo3716(Object obj) {
        m5666(obj);
        return this;
    }
}
