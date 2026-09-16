package p000;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import android.os.Debug;
import android.os.Environment;
import android.os.ProfilingManager;
import android.os.ProfilingResult;
import android.os.ProfilingTrigger;
import android.os.StatFs;
import android.system.OsConstants;
import android.text.TextUtils;
import android.util.Base64;
import android.util.JsonReader;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/* JADX INFO: renamed from: ۦٝؔؕؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4743 {

    /* JADX INFO: renamed from: ۥؗ */
    public final C5002 f15654;

    /* JADX INFO: renamed from: ۥُ */
    public final C2808 f15655;

    /* JADX INFO: renamed from: ۥّ */
    public final C0578 f15656;

    /* JADX INFO: renamed from: ۥۗ */
    public final C1377 f15658;

    /* JADX INFO: renamed from: ۥۜ */
    public final C5534 f15659;

    /* JADX INFO: renamed from: ۥۣ */
    public final Context f15660;

    /* JADX INFO: renamed from: ۦؑ */
    public final C2711 f15661;

    /* JADX INFO: renamed from: ۦؚ */
    public final C2702 f15662;

    /* JADX INFO: renamed from: ۦٌ */
    public final C3571 f15663;

    /* JADX INFO: renamed from: ۦِ */
    public final C4843 f15664;

    /* JADX INFO: renamed from: ۦٛ */
    public final C5002 f15665;

    /* JADX INFO: renamed from: ۦۗ */
    public final C1898 f15666;

    /* JADX INFO: renamed from: ۦۙ */
    public final C2711 f15667;

    /* JADX INFO: renamed from: ۦۚ */
    public C3248 f15668;

    /* JADX INFO: renamed from: ۥٓ */
    public static final C5680 f15653 = new C5680(1);

    /* JADX INFO: renamed from: ۥَ */
    public static final Charset f15652 = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: ۦۨ */
    public final C2332 f15670 = new C2332();

    /* JADX INFO: renamed from: ۦ۟ */
    public final C2332 f15669 = new C2332();

    /* JADX INFO: renamed from: ۥْ */
    public final C2332 f15657 = new C2332();

    public C4743(Context context, C0578 c0578, C1377 c1377, C2711 c2711, C5002 c5002, C5534 c5534, C2711 c2712, C5002 c5003, C3571 c3571, C4843 c4843, C1898 c1898, C2702 c2702, C2808 c2808) {
        new AtomicBoolean(false);
        this.f15660 = context;
        this.f15656 = c0578;
        this.f15658 = c1377;
        this.f15667 = c2711;
        this.f15654 = c5002;
        this.f15659 = c5534;
        this.f15661 = c2712;
        this.f15665 = c5003;
        this.f15664 = c4843;
        this.f15666 = c1898;
        this.f15662 = c2702;
        this.f15663 = c3571;
        this.f15655 = c2808;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final void m8062(final String str) {
        ExecutorService executorService = ((ExecutorC2291) this.f15655.f9376).f7614;
        ProfilingManager profilingManager = (ProfilingManager) this.f15660.getSystemService(ProfilingManager.class);
        Object[] objArr = {new ProfilingTrigger.Builder(7).build(), new ProfilingTrigger.Builder(8).build()};
        ArrayList arrayList = new ArrayList(2);
        for (int i = 0; i < 2; i++) {
            Object obj = objArr[i];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
        }
        profilingManager.addProfilingTriggers(Collections.unmodifiableList(arrayList));
        profilingManager.registerForAllProfilingResults(executorService, new Consumer() { // from class: ۦؒٝٞ
            @Override // java.util.function.Consumer
            public final void accept(Object obj2) {
                String str2;
                C4743 c4743 = this.f10596;
                String str3 = str;
                int triggerType = ((ProfilingResult) obj2).getTriggerType();
                if (triggerType == 8) {
                    str2 = "trigger-type-anomaly";
                } else {
                    str2 = triggerType == 7 ? "trigger-type-oom" : "trigger-type-unknown";
                }
                try {
                    if (c4743.f15667.m5036(str3, str2).createNewFile()) {
                        return;
                    }
                    String str4 = "Trigger file " + str2 + " exists for session: " + str3;
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", str4, null);
                    }
                } catch (IOException unused) {
                    Log.e("FirebaseCrashlytics", "Unable to touch trigger file ".concat(str2), null);
                }
            }
        });
    }

    /* JADX INFO: renamed from: ۥُ */
    public final String m8063() {
        NavigableSet navigableSetM2908 = ((C1372) this.f15663.f11830).m2908();
        if (navigableSetM2908.isEmpty()) {
            return null;
        }
        return (String) navigableSetM2908.first();
    }

    /* JADX INFO: renamed from: ۥّ */
    public final String m8064() throws IOException {
        InputStream resourceAsStream;
        Context context = this.f15660;
        int iM4152 = AbstractC2133.m4152(context, "com.google.firebase.crashlytics.version_control_info", "string");
        String string = iM4152 == 0 ? null : context.getResources().getString(iM4152);
        if (string != null) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Read version control info from string resource", null);
            }
            return Base64.encodeToString(string.getBytes(f15652), 0);
        }
        ClassLoader classLoader = C4743.class.getClassLoader();
        if (classLoader == null) {
            Log.w("FirebaseCrashlytics", "Couldn't get Class Loader", null);
            resourceAsStream = null;
        } else {
            resourceAsStream = classLoader.getResourceAsStream("META-INF/version-control-info.textproto");
        }
        if (resourceAsStream == null) {
            if (resourceAsStream != null) {
                resourceAsStream.close();
            }
            Log.i("FirebaseCrashlytics", "No version control information found", null);
            return null;
        }
        try {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Read version control info from file", null);
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int i = resourceAsStream.read(bArr);
                    if (i == -1) {
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                        String strEncodeToString = Base64.encodeToString(byteArray, 0);
                        resourceAsStream.close();
                        return strEncodeToString;
                    }
                    byteArrayOutputStream.write(bArr, 0, i);
                    try {
                        resourceAsStream.close();
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Throwable th4) {
            resourceAsStream.close();
            throw th4;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r30v0 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9, types: [int] */
    /* JADX INFO: renamed from: ۥۗ */
    public final void m8065(String str, Boolean bool) {
        String str2;
        String str3;
        String str4;
        int i;
        Integer num;
        Map mapUnmodifiableMap;
        List listUnmodifiableList;
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        String strM6628 = AbstractC3761.m6628("Opening a new session with ID ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", strM6628, null);
        }
        Locale locale = Locale.US;
        C0578 c0578 = this.f15656;
        C5534 c5534 = this.f15659;
        C2443 c2443 = new C2443(c0578.f2066, (String) c5534.f18261, (String) c5534.f18262, c0578.m1284().f10877, AbstractC3761.m6617(((String) c5534.f18260) != null ? 4 : 1), (C5002) c5534.f18264);
        String str5 = Build.VERSION.RELEASE;
        String str6 = Build.VERSION.CODENAME;
        C2616 c2616 = new C2616(AbstractC2133.m4133());
        Context context = this.f15660;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockCount = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        EnumC2635 enumC2635 = EnumC2635.f8753;
        String str7 = Build.CPU_ABI;
        if (!TextUtils.isEmpty(str7)) {
            EnumC2635 enumC2636 = (EnumC2635) EnumC2635.f8752.get(str7.toLowerCase(locale));
            if (enumC2636 != null) {
                enumC2635 = enumC2636;
            }
        } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Architecture#getValue()::Build.CPU_ABI returned null or empty", null);
        }
        int iOrdinal = enumC2635.ordinal();
        String str8 = Build.MODEL;
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        long jM4127 = AbstractC2133.m4127(context);
        boolean zM4150 = AbstractC2133.m4150();
        boolean zM4151 = AbstractC2133.m4150();
        ?? r2 = zM4151;
        if (AbstractC2133.m4133()) {
            r2 = (zM4151 ? 1 : 0) | 2;
        }
        ?? r3 = r2;
        if (Debug.waitingForDebugger()) {
            r3 = (r2 == true ? 1 : 0) | 4;
        }
        ?? r30 = r3;
        String str9 = Build.MANUFACTURER;
        String str10 = Build.PRODUCT;
        this.f15664.m8216(str, jCurrentTimeMillis, new C1556(c2443, c2616, new C1757(iOrdinal, iAvailableProcessors, jM4127, blockCount, zM4150, r30 == true ? 1 : 0)));
        if (!bool.booleanValue() || str == null) {
            str2 = str6;
            str3 = str9;
            str4 = str10;
            i = 4;
        } else {
            C2711 c2711 = this.f15661;
            synchronized (((String) c2711.f8985)) {
                c2711.f8985 = str;
                C5911 c5911 = (C5911) ((AtomicMarkableReference) ((C1405) c2711.f8981).f4836).getReference();
                synchronized (c5911) {
                    mapUnmodifiableMap = Collections.unmodifiableMap(new HashMap(c5911.f19498));
                }
                C1115 c1115 = (C1115) c2711.f8982;
                synchronized (c1115) {
                    listUnmodifiableList = Collections.unmodifiableList(new ArrayList(c1115.f3914));
                }
                str3 = str9;
                str2 = str6;
                str4 = str10;
                i = 4;
                ((ExecutorC2291) ((C2808) c2711.f8980).f9376).m4346(new RunnableC3679(c2711, str, mapUnmodifiableMap, listUnmodifiableList, 3));
            }
        }
        C5002 c5002 = this.f15665;
        ((InterfaceC1804) c5002.f16550).mo3588();
        c5002.f16550 = C5002.f16548;
        if (str != null) {
            c5002.f16550 = new C1851(((C2711) c5002.f16551).m5036(str, "userlog"));
        }
        this.f15662.m5026(str);
        C3571 c3571 = this.f15663;
        C0687 c0687 = (C0687) c3571.f11831;
        Charset charset = AbstractC3677.f12283;
        C0541 c0541 = new C0541();
        c0541.f1948 = "20.1.0";
        C5534 c5535 = c0687.f2501;
        String str11 = (String) c5535.f18265;
        if (str11 == null) {
            C0178.m387("Null gmpAppId");
            return;
        }
        c0541.f1946 = str11;
        C0578 c0579 = c0687.f2503;
        String str12 = c0579.m1284().f10877;
        if (str12 == null) {
            C0178.m387("Null installationUuid");
            return;
        }
        c0541.f1949 = str12;
        c0541.f1944 = c0579.m1284().f10876;
        c0541.f1945 = c0579.m1284().f10875;
        String str13 = (String) c5535.f18261;
        if (str13 == null) {
            C0178.m387("Null buildVersion");
            return;
        }
        c0541.f1947 = str13;
        String str14 = (String) c5535.f18262;
        if (str14 == null) {
            C0178.m387("Null displayVersion");
            return;
        }
        c0541.f1953 = str14;
        c0541.f1943 = i;
        c0541.f1951 = (byte) (c0541.f1951 | 1);
        C1572 c1572 = new C1572();
        c1572.f5300 = false;
        byte b = (byte) (c1572.f5306 | 2);
        c1572.f5304 = jCurrentTimeMillis;
        c1572.f5306 = (byte) (b | 1);
        if (str == null) {
            C0178.m387("Null identifier");
            return;
        }
        c1572.f5301 = str;
        String str15 = C0687.f2500;
        if (str15 == null) {
            C0178.m387("Null generator");
            return;
        }
        c1572.f5303 = str15;
        String str16 = c0579.f2066;
        if (str16 == null) {
            C0178.m387("Null identifier");
            return;
        }
        C5002 c5003 = (C5002) c5535.f18264;
        String str17 = c0579.m1284().f10877;
        C2936 c2936 = (C2936) c5003.f16550;
        if (c2936 == null) {
            c2936 = new C2936(c5003);
            c5003.f16550 = c2936;
        }
        C2936 c2937 = c2936;
        String str18 = c2936.f9867;
        if (c2937 == null) {
            c2937 = new C2936(c5003);
            c5003.f16550 = c2937;
        }
        c1572.f5310 = new C4880(str16, str13, str14, str17, str18, c2937.f9866);
        C2185 c2185 = new C2185();
        c2185.f7244 = 3;
        c2185.f7242 = (byte) (c2185.f7242 | 1);
        if (str5 == null) {
            C0178.m387("Null version");
            return;
        }
        c2185.f7243 = str5;
        if (str2 == null) {
            C0178.m387("Null buildVersion");
            return;
        }
        c2185.f7241 = str2;
        c2185.f7245 = AbstractC2133.m4133();
        c2185.f7242 = (byte) (c2185.f7242 | 2);
        c1572.f5308 = c2185.m4238();
        StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
        int iIntValue = 7;
        if (!TextUtils.isEmpty(str7) && (num = (Integer) C0687.f2499.get(str7.toLowerCase(locale))) != null) {
            iIntValue = num.intValue();
        }
        int iAvailableProcessors2 = Runtime.getRuntime().availableProcessors();
        long jM4128 = AbstractC2133.m4127(c0687.f2504);
        long blockCount2 = ((long) statFs2.getBlockCount()) * ((long) statFs2.getBlockSize());
        boolean zM4152 = AbstractC2133.m4150();
        boolean zM4153 = AbstractC2133.m4150();
        ?? r4 = zM4153;
        if (AbstractC2133.m4133()) {
            r4 = (zM4153 ? 1 : 0) | 2;
        }
        ?? r5 = r4;
        if (Debug.waitingForDebugger()) {
            r5 = (r4 == true ? 1 : 0) | 4;
        }
        C0224 c0224 = new C0224();
        c0224.f839 = iIntValue;
        byte b2 = (byte) (c0224.f841 | 1);
        c0224.f841 = b2;
        if (str8 == 0) {
            C0178.m387("Null model");
            return;
        }
        c0224.f837 = str8;
        c0224.f834 = iAvailableProcessors2;
        c0224.f840 = jM4128;
        c0224.f835 = blockCount2;
        c0224.f836 = zM4152;
        c0224.f843 = r5;
        c0224.f841 = (byte) (((byte) (((byte) (((byte) (((byte) (b2 | 2)) | 4)) | 8)) | 16)) | 32);
        String str19 = str3;
        if (str19 == null) {
            C0178.m387("Null manufacturer");
            return;
        }
        c0224.f838 = str19;
        String str20 = str4;
        if (str20 == null) {
            C0178.m387("Null modelClass");
            return;
        }
        c0224.f842 = str20;
        c1572.f5307 = c0224.m480();
        c1572.f5305 = 3;
        c1572.f5306 = (byte) (c1572.f5306 | 4);
        c0541.f1952 = c1572.m3321();
        C2822 c2822M1237 = c0541.m1237();
        C2711 c2712 = ((C1372) c3571.f11830).f4699;
        AbstractC1038 abstractC1038 = c2822M1237.f9435;
        if (abstractC1038 == null) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not get session for report", null);
                return;
            }
            return;
        }
        String str21 = ((C4113) abstractC1038).f13708;
        try {
            C1372.f4697.getClass();
            C1372.m2904(c2712.m5036(str21, "report"), C3404.f11324.m8700(c2822M1237));
            File fileM5036 = c2712.m5036(str21, "start-time");
            long j = ((C4113) abstractC1038).f13711;
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(fileM5036), C1372.f4693);
            try {
                outputStreamWriter.write("");
                fileM5036.setLastModified(j * 1000);
                outputStreamWriter.close();
            } catch (Throwable th) {
                try {
                    outputStreamWriter.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (IOException e) {
            String strM6629 = AbstractC3761.m6628("Could not persist report for session ", str21);
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", strM6629, e);
            }
        }
    }

    /* JADX INFO: renamed from: ۥۜ */
    public final void m8066() {
        try {
            String strM8064 = m8064();
            if (strM8064 != null) {
                try {
                    this.f15661.m5035(strM8064);
                } catch (IllegalArgumentException e) {
                    Context context = this.f15660;
                    if (context != null && (context.getApplicationInfo().flags & 2) != 0) {
                        throw e;
                    }
                    Log.e("FirebaseCrashlytics", "Attempting to set custom attribute with null key, ignoring.", null);
                }
                Log.i("FirebaseCrashlytics", "Saved version control info", null);
            }
        } catch (IOException e2) {
            Log.w("FirebaseCrashlytics", "Unable to save version control info", e2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:199:0x062b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v25, types: [int] */
    /* JADX WARN: Type inference failed for: r10v41 */
    /* JADX WARN: Type inference failed for: r32v0, types: [boolean] */
    /* JADX INFO: renamed from: ۥۣ */
    public final void m8067(boolean z, C5534 c5534, boolean z2) throws Throwable {
        ArrayList arrayList;
        int i;
        int i2;
        boolean z3;
        String str;
        String strSubstring;
        boolean z4;
        String[] list;
        Throwable th;
        List listM3452;
        String strM6364;
        int i3;
        List listUnmodifiableList;
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2;
        C2808.m5331();
        ArrayList arrayList2 = new ArrayList(((C1372) this.f15663.f11830).m2908());
        if (arrayList2.size() <= z) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "No open sessions to be closed.", null);
                return;
            }
            return;
        }
        final String str2 = (String) arrayList2.get(z == true ? 1 : 0);
        if (z2 && c5534.m9209().f16723.f5151) {
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 30) {
                List historicalProcessExitReasons = ((ActivityManager) this.f15660.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons.size() != 0) {
                    C2711 c2711 = this.f15667;
                    C5002 c5002 = new C5002(c2711);
                    c5002.f16550 = C5002.f16548;
                    if (str2 != null) {
                        c5002.f16550 = new C1851(c2711.m5036(str2, "userlog"));
                    }
                    C2711 c2712 = this.f15667;
                    C2808 c2808 = this.f15655;
                    C1640 c1640 = new C1640(c2712);
                    i = 4;
                    C2711 c2713 = new C2711(str2, c2712, c2808);
                    i2 = 8;
                    ((C5911) ((AtomicMarkableReference) ((C1405) c2713.f8981).f4836).getReference()).m9736(c1640.m3455(str2, false));
                    ((C5911) ((AtomicMarkableReference) ((C1405) c2713.f8979).f4836).getReference()).m9736(c1640.m3455(str2, true));
                    ((AtomicMarkableReference) c2713.f8983).set(c1640.m3457(str2), false);
                    C1115 c1115 = (C1115) c2713.f8982;
                    File fileM5036 = c2712.m5036(str2, "rollouts-state");
                    if (!fileM5036.exists() || fileM5036.length() == 0) {
                        C1640.m3454(fileM5036, "The file has a length of zero for session: " + str2);
                        listM3452 = Collections.EMPTY_LIST;
                    } else {
                        try {
                            fileInputStream2 = new FileInputStream(fileM5036);
                            try {
                                try {
                                    listM3452 = C1640.m3452(AbstractC2133.m4151(fileInputStream2));
                                    String str3 = "Loaded rollouts state:\n" + listM3452 + "\nfor session " + str2;
                                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                        Log.d("FirebaseCrashlytics", str3, null);
                                    }
                                    AbstractC2133.m4138(fileInputStream2, "Failed to close rollouts state file.");
                                } catch (Throwable th2) {
                                    th = th2;
                                    fileInputStream = fileInputStream2;
                                    AbstractC2133.m4138(fileInputStream, "Failed to close rollouts state file.");
                                    throw th;
                                }
                            } catch (Exception e) {
                                e = e;
                                Log.w("FirebaseCrashlytics", "Error deserializing rollouts state.", e);
                                C1640.m3451(fileM5036);
                                AbstractC2133.m4138(fileInputStream2, "Failed to close rollouts state file.");
                                listM3452 = Collections.EMPTY_LIST;
                            }
                        } catch (Exception e2) {
                            e = e2;
                            fileInputStream2 = null;
                        } catch (Throwable th3) {
                            th = th3;
                            fileInputStream = null;
                            AbstractC2133.m4138(fileInputStream, "Failed to close rollouts state file.");
                            throw th;
                        }
                    }
                    synchronized (c1115) {
                        c1115.f3914.clear();
                        if (listM3452.size() > 128) {
                            Log.w("FirebaseCrashlytics", "Ignored 0 entries when adding rollout assignments. Maximum allowable: 128", null);
                            c1115.f3914.addAll(listM3452.subList(0, 128));
                        } else {
                            c1115.f3914.addAll(listM3452);
                        }
                    }
                    C3571 c3571 = this.f15663;
                    final int i5 = 0;
                    ApplicationExitInfo applicationExitInfoM6372 = c3571.m6372(str2, historicalProcessExitReasons, new Predicate() { // from class: ۦَؙؑۚ
                        @Override // java.util.function.Predicate
                        public final boolean test(Object obj) {
                            ApplicationExitInfo applicationExitInfo = (ApplicationExitInfo) obj;
                            switch (i5) {
                                case 0:
                                    return applicationExitInfo.getReason() == 6;
                                default:
                                    return (applicationExitInfo.getReason() == 3 && applicationExitInfo.getDescription() != null && applicationExitInfo.getDescription().contains("OOM")) || (applicationExitInfo.getReason() == 2 && applicationExitInfo.getStatus() == OsConstants.SIGKILL);
                            }
                        }
                    });
                    if (applicationExitInfoM6372 == null) {
                        String strM6628 = AbstractC3761.m6628("No relevant ApplicationExitInfo occurred during session: ", str2);
                        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                            Log.v("FirebaseCrashlytics", strM6628, null);
                        }
                        arrayList = arrayList2;
                    } else {
                        C0687 c0687 = (C0687) c3571.f11831;
                        try {
                            InputStream traceInputStream = applicationExitInfoM6372.getTraceInputStream();
                            strM6364 = traceInputStream != null ? C3571.m6364(traceInputStream) : null;
                        } catch (IOException e3) {
                            Log.w("FirebaseCrashlytics", "Could not get input trace in application exit info: " + applicationExitInfoM6372.toString() + " Error: " + e3, null);
                        }
                        C1310 c1310 = new C1310();
                        c1310.f4501 = applicationExitInfoM6372.getImportance();
                        c1310.f4502 = (byte) (c1310.f4502 | 4);
                        String processName = applicationExitInfoM6372.getProcessName();
                        if (processName == null) {
                            C0178.m387("Null processName");
                            return;
                        }
                        c1310.f4498 = processName;
                        c1310.f4495 = applicationExitInfoM6372.getReason();
                        c1310.f4502 = (byte) (c1310.f4502 | 2);
                        c1310.f4504 = applicationExitInfoM6372.getTimestamp();
                        c1310.f4502 = (byte) (c1310.f4502 | 32);
                        c1310.f4500 = applicationExitInfoM6372.getPid();
                        c1310.f4502 = (byte) (c1310.f4502 | 1);
                        c1310.f4496 = applicationExitInfoM6372.getPss();
                        c1310.f4502 = (byte) (c1310.f4502 | 8);
                        c1310.f4497 = applicationExitInfoM6372.getRss();
                        c1310.f4502 = (byte) (c1310.f4502 | 16);
                        c1310.f4499 = strM6364;
                        C5455 c5455M2775 = c1310.m2775();
                        int i6 = c0687.f2504.getResources().getConfiguration().orientation;
                        C4725 c4725 = new C4725();
                        c4725.f15599 = "anr";
                        long j = c5455M2775.f17992;
                        c4725.f15600 = j;
                        c4725.f15602 = (byte) (c4725.f15602 | 1);
                        C5534 c5535 = c0687.f2501;
                        if (!c0687.f2502.m9209().f16723.f5150 || ((ArrayList) c5535.f18267).size() <= 0) {
                            arrayList = arrayList2;
                            i3 = i6;
                            listUnmodifiableList = null;
                        } else {
                            ArrayList arrayList3 = new ArrayList();
                            Iterator it = ((ArrayList) c5535.f18267).iterator();
                            while (it.hasNext()) {
                                C1669 c1669 = (C1669) it.next();
                                int i7 = i6;
                                String str4 = c1669.f5565;
                                if (str4 == null) {
                                    C0178.m387("Null libraryName");
                                    return;
                                }
                                Iterator it2 = it;
                                String str5 = c1669.f5564;
                                if (str5 == null) {
                                    C0178.m387("Null arch");
                                    return;
                                }
                                String str6 = c1669.f5563;
                                if (str6 == null) {
                                    C0178.m387("Null buildId");
                                    return;
                                }
                                arrayList3.add(new C3383(str5, str4, str6));
                                it = it2;
                                i6 = i7;
                                arrayList2 = arrayList2;
                            }
                            arrayList = arrayList2;
                            i3 = i6;
                            listUnmodifiableList = Collections.unmodifiableList(arrayList3);
                        }
                        C1310 c1311 = new C1310();
                        c1311.f4501 = c5455M2775.f17990;
                        byte b = (byte) (c1311.f4502 | 4);
                        c1311.f4502 = b;
                        String str7 = c5455M2775.f17987;
                        if (str7 == null) {
                            C0178.m387("Null processName");
                            return;
                        }
                        c1311.f4498 = str7;
                        c1311.f4495 = c5455M2775.f17984;
                        c1311.f4504 = j;
                        c1311.f4500 = c5455M2775.f17989;
                        c1311.f4496 = c5455M2775.f17985;
                        c1311.f4497 = c5455M2775.f17986;
                        c1311.f4502 = (byte) (((byte) (((byte) (((byte) (((byte) (b | 2)) | 32)) | 1)) | 8)) | 16);
                        c1311.f4499 = c5455M2775.f17988;
                        c1311.f4503 = listUnmodifiableList;
                        C5455 c5455M2776 = c1311.m2775();
                        int i8 = c5455M2776.f17990;
                        Boolean boolValueOf = Boolean.valueOf(i8 != 100);
                        String str8 = c5455M2776.f17987;
                        int i9 = c5455M2776.f17989;
                        C1376 c1376 = new C1376();
                        c1376.f4709 = str8;
                        c1376.f4708 = i9;
                        byte b2 = (byte) (c1376.f4707 | 1);
                        c1376.f4706 = i8;
                        c1376.f4710 = false;
                        c1376.f4707 = (byte) (((byte) (b2 | 2)) | 4);
                        C5498 c5498M2913 = c1376.m2913();
                        C1668 c1668M1537 = C0687.m1537();
                        List listM1540 = c0687.m1540();
                        if (listM1540 == null) {
                            C0178.m387("Null binaries");
                            return;
                        }
                        c4725.f15596 = new C2701(new C3123(null, null, c5455M2776, null, c1668M1537, listM1540), null, null, boolValueOf, c5498M2913, null, i3);
                        c4725.f15601 = c0687.m1539(i3);
                        C3302 c3302M8054 = c4725.m8054();
                        String strM6629 = AbstractC3761.m6628("Persisting anr for session ", str2);
                        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                            Log.d("FirebaseCrashlytics", strM6629, null);
                        }
                        ((C1372) c3571.f11830).m2906(C3571.m6365(C3571.m6363(c3302M8054, c5002, c2713, Collections.EMPTY_MAP), c2713), str2, true);
                    }
                } else {
                    arrayList = arrayList2;
                    i = 4;
                    i2 = 8;
                    String strM66210 = AbstractC3761.m6628("No ApplicationExitInfo available. Session: ", str2);
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", strM66210, null);
                    }
                }
            } else {
                arrayList = arrayList2;
                i = 4;
                i2 = 8;
                String strM8670 = AbstractC5078.m8670(i4, "ANR feature enabled, but device is API ");
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", strM8670, null);
                }
            }
        } else {
            arrayList = arrayList2;
            i = 4;
            i2 = 8;
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "ANR feature disabled.", null);
            }
        }
        if (z2 && this.f15664.m8213()) {
            String strM66211 = AbstractC3761.m6628("Finalizing native report for session ", str2);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                th = null;
                Log.v("FirebaseCrashlytics", strM66211, null);
            } else {
                th = null;
            }
            this.f15664.m8215().getClass();
            Log.w("FirebaseCrashlytics", "No minidump data found for session " + str2, th);
            Log.i("FirebaseCrashlytics", "No Tombstones data found for session " + str2, th);
            Log.w("FirebaseCrashlytics", "No native core present", th);
        }
        if (Build.VERSION.SDK_INT >= 37) {
            ActivityManager activityManager = (ActivityManager) this.f15660.getSystemService("activity");
            C2711 c2714 = this.f15667;
            C5680 c5680 = new C5680(2);
            File file = new File((File) c2714.f8981, str2);
            file.mkdirs();
            int i10 = 0;
            List list2 = (List) C2711.m5033(file.listFiles(c5680)).stream().map(new C4823(i10)).filter(new C1142(i10)).collect(Collectors.toList());
            List historicalProcessExitReasons2 = activityManager.getHistoricalProcessExitReasons(null, 0, 0);
            final C3571 c3572 = this.f15663;
            Optional optionalFindFirst = list2.stream().findFirst();
            if (!optionalFindFirst.isPresent()) {
                final int i11 = 1;
                optionalFindFirst = c3572.m6372(str2, historicalProcessExitReasons2, new Predicate() { // from class: ۦَؙؑۚ
                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        ApplicationExitInfo applicationExitInfo = (ApplicationExitInfo) obj;
                        switch (i11) {
                            case 0:
                                return applicationExitInfo.getReason() == 6;
                            default:
                                return (applicationExitInfo.getReason() == 3 && applicationExitInfo.getDescription() != null && applicationExitInfo.getDescription().contains("OOM")) || (applicationExitInfo.getReason() == 2 && applicationExitInfo.getStatus() == OsConstants.SIGKILL);
                        }
                    }
                }) != null ? Optional.of(7) : Optional.empty();
                Objects.requireNonNull(optionalFindFirst);
            }
            optionalFindFirst.ifPresent(new Consumer() { // from class: ۦؗؓؒۜ
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    String str9 = str2;
                    C1372 c1372 = (C1372) c3572.f11830;
                    C4321 c4321 = new C4321(new C5725(((Integer) obj).intValue()));
                    try {
                        C1372.f4697.getClass();
                        C1372.m2904(c1372.f4699.m5036(str9, "profiling-manager-info"), C3404.f11324.m8700(c4321));
                    } catch (IOException e4) {
                        Log.w("FirebaseCrashlytics", "Could not persist Profiling Manager info " + str9, e4);
                    }
                }
            });
        }
        if (z != 0) {
            z3 = false;
            str = (String) arrayList.get(0);
        } else {
            z3 = false;
            this.f15662.m5026(null);
            str = null;
        }
        C3571 c3573 = this.f15663;
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        C1372 c1372 = (C1372) c3573.f11830;
        C2711 c2715 = c1372.f4699;
        c2715.m5037(".com.google.firebase.crashlytics");
        c2715.m5037(".com.google.firebase.crashlytics-ndk");
        if (!((String) c2715.f8985).isEmpty()) {
            c2715.m5037(".com.google.firebase.crashlytics.files.v1");
            final String str9 = ".com.google.firebase.crashlytics.files.v2" + File.pathSeparator;
            File file2 = (File) c2715.f8984;
            if (file2.exists() && (list = file2.list(new FilenameFilter() { // from class: ۥٌؖٝٚ
                @Override // java.io.FilenameFilter
                public final boolean accept(File file3, String str10) {
                    return str10.startsWith(str9);
                }
            })) != null) {
                int length = list.length;
                for (?? r10 = z3; r10 < length; r10++) {
                    c2715.m5037(list[r10]);
                }
            }
        }
        NavigableSet<String> navigableSetM2908 = c1372.m2908();
        if (str != null) {
            navigableSetM2908.remove(str);
        }
        int i12 = i2;
        if (navigableSetM2908.size() > i12) {
            while (navigableSetM2908.size() > i12) {
                String str10 = (String) navigableSetM2908.last();
                String strM66212 = AbstractC3761.m6628("Removing session over cap: ", str10);
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", strM66212, null);
                }
                C2711.m5034(new File((File) c2715.f8981, str10));
                navigableSetM2908.remove(str10);
            }
        }
        for (String str11 : navigableSetM2908) {
            String strM66213 = AbstractC3761.m6628("Finalizing report for session ", str11);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", strM66213, null);
            }
            C3404 c3404 = C1372.f4697;
            C5680 c5681 = C1372.f4696;
            File file3 = new File((File) c2715.f8981, str11);
            file3.mkdirs();
            List<File> listM5033 = C2711.m5033(file3.listFiles(c5681));
            if (listM5033.isEmpty()) {
                String strM66214 = AbstractC3761.m6629("Session ", str11, " has no events.");
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", strM66214, null);
                }
            } else {
                Collections.sort(listM5033);
                ArrayList arrayList4 = new ArrayList();
                boolean z5 = z3;
                for (File file4 : listM5033) {
                    try {
                        String strM2902 = C1372.m2902(file4);
                        c3404.getClass();
                        try {
                            JsonReader jsonReader = new JsonReader(new StringReader(strM2902));
                            try {
                                C3302 c3302M6164 = C3404.m6164(jsonReader);
                                jsonReader.close();
                                arrayList4.add(c1372.m2907(str11, c3302M6164));
                                if (z5) {
                                    z4 = true;
                                } else {
                                    String name = file4.getName();
                                    if (name.startsWith("event") && name.endsWith("_")) {
                                        z4 = true;
                                    } else {
                                        z4 = z3;
                                    }
                                }
                                z5 = z4;
                            } catch (Throwable th4) {
                                try {
                                    jsonReader.close();
                                } catch (Throwable th5) {
                                    th4.addSuppressed(th5);
                                }
                                throw th4;
                            }
                        } catch (IllegalStateException e4) {
                            throw new IOException(e4);
                        }
                    } catch (IOException e5) {
                        Log.w("FirebaseCrashlytics", "Could not add event to report for " + file4, e5);
                    }
                }
                if (arrayList4.isEmpty()) {
                    Log.w("FirebaseCrashlytics", "Could not parse event files for session " + str11, null);
                } else {
                    String strM3457 = new C1640(c2715).m3457(str11);
                    C2808 c2809 = c1372.f4701.f8960;
                    synchronized (c2809) {
                        if (Objects.equals((String) c2809.f9376, str11)) {
                            strSubstring = (String) c2809.f9377;
                        } else {
                            C2711 c2716 = (C2711) c2809.f9378;
                            C5680 c5682 = C2808.f9373;
                            File file5 = new File((File) c2716.f8981, str11);
                            file5.mkdirs();
                            List listM5034 = C2711.m5033(file5.listFiles(c5682));
                            if (listM5034.isEmpty()) {
                                Log.w("FirebaseCrashlytics", "Unable to read App Quality Sessions session id.", null);
                                strSubstring = null;
                            } else {
                                strSubstring = ((File) Collections.min(listM5034, C2808.f9374)).getName().substring(i);
                            }
                        }
                    }
                    File fileM5037 = c2715.m5036(str11, "report");
                    try {
                        String strM2903 = C1372.m2902(fileM5037);
                        c3404.getClass();
                        C2822 c2822M6165 = C3404.m6165(strM2903);
                        C0541 c0541M5389 = c2822M6165.m5389();
                        AbstractC1038 abstractC1038 = c2822M6165.f9435;
                        if (abstractC1038 != null) {
                            try {
                                C1572 c1572Mo2240 = abstractC1038.mo2240();
                                c1572Mo2240.f5299 = Long.valueOf(jCurrentTimeMillis);
                                c1572Mo2240.f5300 = z5;
                                try {
                                    c1572Mo2240.f5306 = (byte) (c1572Mo2240.f5306 | 2);
                                    if (strM3457 != null) {
                                        c1572Mo2240.f5302 = new C1740(strM3457);
                                    }
                                    c0541M5389.f1952 = c1572Mo2240.m3321();
                                } catch (IOException e6) {
                                    e = e6;
                                    Log.w("FirebaseCrashlytics", "Could not synthesize final report file for " + fileM5037, e);
                                    C2711.m5034(new File((File) c2715.f8981, str11));
                                    z3 = false;
                                    i = 4;
                                }
                            } catch (IOException e7) {
                                e = e7;
                            }
                        }
                        C2822 c2822M1237 = c0541M5389.m1237();
                        C0541 c0541M53810 = c2822M1237.m5389();
                        c0541M53810.f1955 = strSubstring;
                        AbstractC1038 abstractC1039 = c2822M1237.f9435;
                        if (abstractC1039 != null) {
                            C1572 c1572Mo2241 = abstractC1039.mo2240();
                            c1572Mo2241.f5298 = strSubstring;
                            c0541M53810.f1952 = c1572Mo2241.m3321();
                        }
                        C2822 c2822M1238 = c0541M53810.m1237();
                        AbstractC1038 abstractC10310 = c2822M1238.f9435;
                        if (abstractC10310 == null) {
                            throw new IllegalStateException("Reports without sessions cannot have events added to them.");
                        }
                        C0541 c0541M53811 = c2822M1238.m5389();
                        C1572 c1572Mo2242 = abstractC10310.mo2240();
                        c1572Mo2242.f5309 = arrayList4;
                        c0541M53811.f1952 = c1572Mo2242.m3321();
                        C2822 c2822M1239 = c0541M53811.m1237();
                        AbstractC1038 abstractC10311 = c2822M1239.f9435;
                        if (abstractC10311 != null) {
                            String str12 = "appQualitySessionId: " + strSubstring;
                            try {
                                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                    try {
                                        Log.d("FirebaseCrashlytics", str12, null);
                                    } catch (IOException e8) {
                                        e = e8;
                                        Log.w("FirebaseCrashlytics", "Could not synthesize final report file for " + fileM5037, e);
                                    }
                                }
                                C1372.m2904(z5 ? new File((File) c2715.f8982, ((C4113) abstractC10311).f13708) : new File((File) c2715.f8979, ((C4113) abstractC10311).f13708), C3404.f11324.m8700(c2822M1239));
                            } catch (IOException e9) {
                                e = e9;
                                Log.w("FirebaseCrashlytics", "Could not synthesize final report file for " + fileM5037, e);
                            }
                        }
                        e = e8;
                    } catch (IOException e10) {
                        e = e10;
                    }
                    Log.w("FirebaseCrashlytics", "Could not synthesize final report file for " + fileM5037, e);
                }
                C2711.m5034(new File((File) c2715.f8981, str11));
                z3 = false;
                i = 4;
            }
            C2711.m5034(new File((File) c2715.f8981, str11));
            z3 = false;
            i = 4;
        }
        C1984 c1984 = c1372.f4698.m9209().f16724;
        ArrayList arrayListM2905 = c1372.m2905();
        int size = arrayListM2905.size();
        if (size <= 4) {
            return;
        }
        Iterator it3 = arrayListM2905.subList(4, size).iterator();
        while (it3.hasNext()) {
            ((File) it3.next()).delete();
        }
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final boolean m8068(C5534 c5534) throws Throwable {
        C2808.m5331();
        C3248 c3248 = this.f15668;
        if (c3248 != null && c3248.f10911.get()) {
            Log.w("FirebaseCrashlytics", "Skipping session finalization because a crash has already occurred.", null);
            return false;
        }
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Finalizing previously open sessions.", null);
        }
        try {
            m8067(true, c5534, true);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Closed all previously open sessions.", null);
            }
            return true;
        } catch (Exception e) {
            Log.e("FirebaseCrashlytics", "Unable to finalize previously open sessions.", e);
            return false;
        }
    }

    /* JADX INFO: renamed from: ۦٛ */
    public final void m8069(C3580 c3580) {
        C3580 c3581;
        C3580 c3580M9349;
        C2332 c2332 = this.f15670;
        C2711 c2711 = ((C1372) this.f15663.f11830).f4699;
        if (C2711.m5033(((File) c2711.f8979).listFiles()).isEmpty() && C2711.m5033(((File) c2711.f8982).listFiles()).isEmpty() && C2711.m5033(((File) c2711.f8983).listFiles()).isEmpty()) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "No crash reports are available to be sent.", null);
            }
            c2332.m4374(Boolean.FALSE);
            return;
        }
        C1397 c1397 = C1397.f4781;
        c1397.m2966("Crash reports are available to be sent.");
        C1377 c1377 = this.f15658;
        int i = 3;
        if (c1377.m2929()) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Automatic data collection is enabled. Allowing upload.", null);
            }
            c2332.m4374(Boolean.FALSE);
            c3580M9349 = AbstractC5378.m9075(Boolean.TRUE);
        } else {
            c1397.m2965("Automatic data collection is disabled.");
            c1397.m2966("Notifying that unsent reports are available.");
            c2332.m4374(Boolean.TRUE);
            synchronized (c1377.f4713) {
                c3581 = ((C2332) c1377.f4719).f7721;
            }
            C3223 c3223 = new C3223(i);
            c3581.getClass();
            ExecutorC0170 executorC0170 = AbstractC4007.f13360;
            C3580 c3582 = new C3580();
            c3581.f11911.m9159(new C3517(executorC0170, c3223, c3582));
            c3581.m6400();
            c1397.m2965("Waiting for send/deleteUnsentReports to be called.");
            c3580M9349 = AbstractC5568.m9349(c3582, this.f15669.f7721);
        }
        c3580M9349.m6396((ExecutorC2291) this.f15655.f9378, new C5002(17, this, c3580));
    }

    /* JADX INFO: renamed from: ۦۙ */
    public final C3580 m8070() {
        C3580 c3580M9039;
        ArrayList arrayList = new ArrayList();
        for (File file : C2711.m5033(((File) this.f15667.f8980).listFiles(f15653))) {
            try {
                long j = Long.parseLong(file.getName().substring(3));
                try {
                    Class.forName("com.google.firebase.crash.FirebaseCrash");
                    Log.w("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, FirebaseCrash exists", null);
                    c3580M9039 = AbstractC5378.m9075(null);
                } catch (ClassNotFoundException unused) {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Logging app exception event to Firebase Analytics", null);
                    }
                    c3580M9039 = AbstractC5378.m9039(new ScheduledThreadPoolExecutor(1), new CallableC5577(this, j));
                }
                arrayList.add(c3580M9039);
            } catch (NumberFormatException unused2) {
                Log.w("FirebaseCrashlytics", "Could not parse app exception timestamp from file " + file.getName(), null);
            }
            file.delete();
        }
        return AbstractC5378.m9074(arrayList);
    }
}
