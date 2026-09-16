package p000;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Member;

/* JADX INFO: renamed from: ۦٕؗٚۦ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4266 {

    /* JADX INFO: renamed from: ۥۣ */
    public static volatile boolean f14126 = true;

    /* JADX INFO: renamed from: ۥۗ */
    public static final boolean m7561(AccessibleObject accessibleObject) {
        Object c4535;
        try {
            if (!accessibleObject.isAccessible()) {
                accessibleObject.setAccessible(true);
            }
            c4535 = Boolean.TRUE;
        } catch (Throwable th) {
            c4535 = new C4535(th);
        }
        Object obj = Boolean.FALSE;
        if (c4535 instanceof C4535) {
            c4535 = obj;
        }
        return ((Boolean) c4535).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۥۣ */
    public static final boolean m7562(Member member) {
        Object c4535;
        boolean zBooleanValue;
        AccessibleObject accessibleObject = member instanceof AccessibleObject ? (AccessibleObject) member : null;
        if (accessibleObject == null) {
            return false;
        }
        if (f14126) {
            try {
                c4535 = Boolean.valueOf(accessibleObject.trySetAccessible());
            } catch (Throwable th) {
                c4535 = new C4535(th);
            }
            if (AbstractC0183.m405(c4535) != null) {
                f14126 = false;
                c4535 = Boolean.valueOf(m7561(accessibleObject));
            }
            zBooleanValue = ((Boolean) c4535).booleanValue();
        } else {
            zBooleanValue = m7561(accessibleObject);
        }
        return zBooleanValue;
    }
}
