package p000;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.SensorManager;
import android.os.Environment;
import android.os.StatFs;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: ۥؘؗٓۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0687 {

    /* JADX INFO: renamed from: ۥّ */
    public static final HashMap f2499;

    /* JADX INFO: renamed from: ۦۙ */
    public static final String f2500;

    /* JADX INFO: renamed from: ۥؗ */
    public final C5534 f2501;

    /* JADX INFO: renamed from: ۥُ */
    public final C5534 f2502;

    /* JADX INFO: renamed from: ۥۗ */
    public final C0578 f2503;

    /* JADX INFO: renamed from: ۥۣ */
    public final Context f2504;

    /* JADX INFO: renamed from: ۦؑ */
    public final C3369 f2505;

    static {
        HashMap map = new HashMap();
        f2499 = map;
        map.put("armeabi", 5);
        map.put("armeabi-v7a", 6);
        map.put("arm64-v8a", 9);
        map.put("x86", 0);
        map.put("x86_64", 1);
        Locale locale = Locale.US;
        f2500 = "Crashlytics Android SDK/20.1.0";
    }

    public C0687(Context context, C0578 c0578, C5534 c5534, C3369 c3369, C5534 c5535) {
        this.f2504 = context;
        this.f2503 = c0578;
        this.f2501 = c5534;
        this.f2505 = c3369;
        this.f2502 = c5535;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public static C4257 m1536(C1489 c1489, int i) {
        String str = (String) c1489.f5057;
        String str2 = (String) c1489.f5059;
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) c1489.f5058;
        int i2 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        C1489 c14810 = (C1489) c1489.f5056;
        if (i >= 8) {
            C1489 c14811 = c14810;
            while (c14811 != null) {
                c14811 = (C1489) c14811.f5056;
                i2++;
            }
        }
        int i3 = i2;
        List listM1538 = m1538(stackTraceElementArr, 4);
        if (listM1538 == null) {
            C0178.m387("Null frames");
            return null;
        }
        byte b = (byte) (0 | 1);
        C4257 c4257M1536 = (c14810 == null || i3 != 0) ? null : m1536(c14810, i + 1);
        if (b == 1) {
            return new C4257(str, str2, listM1538, c4257M1536, i3);
        }
        StringBuilder sb = new StringBuilder();
        if ((b & 1) == 0) {
            sb.append(" overflowCount");
        }
        C1078.m2276(AbstractC3761.m6636("Missing required properties:", sb));
        return null;
    }

    /* JADX INFO: renamed from: ۥُ */
    public static C1668 m1537() {
        return new C1668(0L, "0", "0");
    }

    /* JADX INFO: renamed from: ۦؑ */
    public static List m1538(StackTraceElement[] stackTraceElementArr, int i) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            C4325 c4325 = new C4325();
            c4325.f14292 = i;
            c4325.f14293 = (byte) (c4325.f14293 | 4);
            long lineNumber = 0;
            long jMax = stackTraceElement.isNativeMethod() ? Math.max(stackTraceElement.getLineNumber(), 0L) : 0L;
            String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            String fileName = stackTraceElement.getFileName();
            if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
                lineNumber = stackTraceElement.getLineNumber();
            }
            c4325.f14295 = jMax;
            byte b = (byte) (c4325.f14293 | 1);
            c4325.f14294 = str;
            c4325.f14291 = fileName;
            c4325.f14296 = lineNumber;
            c4325.f14293 = (byte) (b | 2);
            arrayList.add(c4325.m7627());
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0051  */
    /* JADX WARN: Code duplicated, block: B:35:0x0070  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a7  */
    /* JADX INFO: renamed from: ۥۗ */
    public final C4376 m1539(int i) {
        boolean z;
        Float fValueOf;
        int i2;
        long j;
        Context context = this.f2504;
        boolean z2 = false;
        try {
            Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (intentRegisterReceiver != null) {
                int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
                z = intExtra != -1 && (intExtra == 2 || intExtra == 5);
                try {
                    int intExtra2 = intentRegisterReceiver.getIntExtra("level", -1);
                    int intExtra3 = intentRegisterReceiver.getIntExtra("scale", -1);
                    if (intExtra2 != -1 && intExtra3 != -1) {
                        fValueOf = Float.valueOf(intExtra2 / intExtra3);
                    }
                } catch (IllegalStateException e) {
                    e = e;
                    Log.e("FirebaseCrashlytics", "An error occurred getting battery state.", e);
                }
                Double dValueOf = fValueOf != null ? Double.valueOf(fValueOf.doubleValue()) : null;
                if (z || fValueOf == null) {
                    i2 = 1;
                } else {
                    i2 = ((double) fValueOf.floatValue()) < 0.99d ? 2 : 3;
                }
                if (!AbstractC2133.m4150() && ((SensorManager) context.getSystemService("sensor")).getDefaultSensor(8) != null) {
                    z2 = true;
                }
                long jM4127 = AbstractC2133.m4127(context);
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
                j = jM4127 - memoryInfo.availMem;
                if (j <= 0) {
                    j = 0;
                }
                StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
                long blockSize = statFs.getBlockSize();
                long blockCount = (((long) statFs.getBlockCount()) * blockSize) - (blockSize * ((long) statFs.getAvailableBlocks()));
                C5406 c5406 = new C5406();
                c5406.f17855 = dValueOf;
                c5406.f17854 = i2;
                byte b = (byte) (c5406.f17857 | 1);
                c5406.f17851 = z2;
                c5406.f17856 = i;
                c5406.f17852 = j;
                c5406.f17853 = blockCount;
                c5406.f17857 = (byte) (((byte) (((byte) (((byte) (b | 2)) | 4)) | 8)) | 16);
                return c5406.m9087();
            }
            z = false;
        } catch (IllegalStateException e2) {
            e = e2;
            z = false;
        }
        fValueOf = null;
        if (fValueOf != null) {
        }
        if (z) {
            i2 = 1;
        } else {
            i2 = 1;
        }
        if (!AbstractC2133.m4150()) {
            z2 = true;
        }
        long jM4128 = AbstractC2133.m4127(context);
        ActivityManager.MemoryInfo memoryInfo2 = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo2);
        j = jM4128 - memoryInfo2.availMem;
        if (j <= 0) {
            j = 0;
        }
        StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
        long blockSize2 = statFs2.getBlockSize();
        long blockCount2 = (((long) statFs2.getBlockCount()) * blockSize2) - (blockSize2 * ((long) statFs2.getAvailableBlocks()));
        C5406 c5407 = new C5406();
        c5407.f17855 = dValueOf;
        c5407.f17854 = i2;
        byte b2 = (byte) (c5407.f17857 | 1);
        c5407.f17851 = z2;
        c5407.f17856 = i;
        c5407.f17852 = j;
        c5407.f17853 = blockCount2;
        c5407.f17857 = (byte) (((byte) (((byte) (((byte) (b2 | 2)) | 4)) | 8)) | 16);
        return c5407.m9087();
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final List m1540() {
        byte b = (byte) (((byte) (0 | 1)) | 2);
        C5534 c5534 = this.f2501;
        String str = (String) c5534.f18266;
        if (str == null) {
            C0178.m387("Null name");
            return null;
        }
        String str2 = (String) c5534.f18263;
        if (b == 3) {
            return Collections.singletonList(new C5126(0L, 0L, str, str2));
        }
        StringBuilder sb = new StringBuilder();
        if ((b & 1) == 0) {
            sb.append(" baseAddress");
        }
        if ((b & 2) == 0) {
            sb.append(" size");
        }
        C1078.m2276(AbstractC3761.m6636("Missing required properties:", sb));
        return null;
    }
}
