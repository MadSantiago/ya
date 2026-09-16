package p000;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.util.Log;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: ۥْؖۙٚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1230 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final String f4234 = C1984.m3875("ProcessUtils");

    /* JADX INFO: renamed from: ۥۣ */
    public static final boolean m2596(Context context) {
        String strM4929;
        Object next;
        if (Build.VERSION.SDK_INT >= 28) {
            strM4929 = AbstractC2611.m4929();
        } else {
            strM4929 = null;
            try {
                Method declaredMethod = Class.forName("android.app.ActivityThread", false, C3600.class.getClassLoader()).getDeclaredMethod("currentProcessName", null);
                declaredMethod.setAccessible(true);
                Object objInvoke = declaredMethod.invoke(null, null);
                if (objInvoke instanceof String) {
                    strM4929 = (String) objInvoke;
                } else {
                    int iMyPid = Process.myPid();
                    List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
                    if (runningAppProcesses != null) {
                        Iterator<T> it = runningAppProcesses.iterator();
                        do {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (((ActivityManager.RunningAppProcessInfo) next).pid != iMyPid);
                        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) next;
                        if (runningAppProcessInfo != null) {
                            strM4929 = runningAppProcessInfo.processName;
                        }
                    }
                }
            } catch (Throwable th) {
                if (C1984.m3874().f6551 <= 3) {
                    Log.d(f4234, "Unable to check ActivityThread for processName", th);
                }
            }
        }
        return AbstractC3831.m6874(strM4929, context.getApplicationInfo().processName);
    }
}
