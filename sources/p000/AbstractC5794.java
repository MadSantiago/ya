package p000;

import android.os.Looper;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;

/* JADX INFO: renamed from: ۦۦٗٝ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5794 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final C5136 f19088;

    static {
        String property;
        int i = AbstractC1768.f5896;
        Object next = null;
        try {
            property = System.getProperty("kotlinx.coroutines.fast.service.loader");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null) {
            Boolean.parseBoolean(property);
        }
        try {
            Iterator it = AbstractC1961.m3843(new C4299(new C3527(2, Arrays.asList(new C3796()).iterator()))).iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    ((C3796) next).getClass();
                    do {
                        ((C3796) it.next()).getClass();
                    } while (it.hasNext());
                }
            }
            if (((C3796) next) == null) {
                C1078.m2276("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
                return;
            }
            Looper mainLooper = Looper.getMainLooper();
            if (mainLooper != null) {
                f19088 = new C5136(AbstractC5487.m9189(mainLooper));
            } else {
                C1078.m2276("The main looper is not available");
            }
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
