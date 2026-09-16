package p000;

import android.os.StrictMode;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;

/* JADX INFO: renamed from: ۦٕٞؔۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4795 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final C1149 f15815;

    static {
        C1149 c1149;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                Iterator it = Arrays.asList(new C1149[0]).iterator();
                if (it.hasNext()) {
                    c1149 = (C1149) it.next();
                    AbstractC0949.m1966("Expected at most one FlagsService", !it.hasNext());
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                } else {
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                    c1149 = new C1149();
                }
                f15815 = c1149;
            } catch (Throwable th) {
                throw new ServiceConfigurationError(th.getMessage(), th);
            }
        } catch (Throwable th2) {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            throw th2;
        }
    }
}
