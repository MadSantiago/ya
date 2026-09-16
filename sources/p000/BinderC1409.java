package p000;

import android.os.IBinder;
import android.os.IInterface;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: ۥٕٟؕٗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC1409 extends AbstractBinderC0543 implements InterfaceC2410 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final Object f4844;

    public BinderC1409(Object obj) {
        super("com.google.android.gms.dynamic.IObjectWrapper");
        this.f4844 = obj;
    }

    /* JADX INFO: renamed from: ۥٚ */
    public static InterfaceC2410 m2975(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
        return iInterfaceQueryLocalInterface instanceof InterfaceC2410 ? (InterfaceC2410) iInterfaceQueryLocalInterface : new C3431(iBinder, "com.google.android.gms.dynamic.IObjectWrapper", 1);
    }

    /* JADX INFO: renamed from: ۦۤ */
    public static Object m2976(InterfaceC2410 interfaceC2410) {
        if (interfaceC2410 instanceof BinderC1409) {
            return ((BinderC1409) interfaceC2410).f4844;
        }
        IBinder iBinderAsBinder = interfaceC2410.asBinder();
        Field[] declaredFields = iBinderAsBinder.getClass().getDeclaredFields();
        Field field = null;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i != 1) {
            int length = declaredFields.length;
            C1078.m2272(AbstractC5078.m8673(length, "Unexpected number of IObjectWrapper declared fields: ", new StringBuilder(String.valueOf(length).length() + 53)));
            return null;
        }
        AbstractC0487.m1047(field);
        if (field.isAccessible()) {
            C1078.m2272("IObjectWrapper declared field not private!");
            return null;
        }
        field.setAccessible(true);
        try {
            return field.get(iBinderAsBinder);
        } catch (IllegalAccessException e) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e);
        } catch (NullPointerException e2) {
            throw new IllegalArgumentException("Binder object is null.", e2);
        }
    }
}
