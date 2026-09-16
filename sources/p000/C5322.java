package p000;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.sqlite.SQLiteDatabase;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.google.firebase.crashlytics.CrashlyticsRegistrar;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: renamed from: ۦٍ۟ؑۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5322 implements InterfaceC2740, InterfaceC5346, InterfaceC2429, InterfaceC3662, InterfaceC5109, InterfaceC3562 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ Object f17566;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f17567;

    public /* synthetic */ C5322(int i, Object obj) {
        this.f17567 = i;
        this.f17566 = obj;
    }

    @Override // p000.InterfaceC5109
    /* JADX INFO: renamed from: ۥؗ */
    public Object mo3986() {
        int i = this.f17567;
        Object obj = this.f17566;
        switch (i) {
            case 11:
                C1835 c1835 = (C1835) ((C0474) obj).f1729;
                SQLiteDatabase sQLiteDatabaseM3610 = c1835.m3610();
                sQLiteDatabaseM3610.beginTransaction();
                try {
                    sQLiteDatabaseM3610.compileStatement("DELETE FROM log_event_dropped").execute();
                    sQLiteDatabaseM3610.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + c1835.f6102.mo7674()).execute();
                    sQLiteDatabaseM3610.setTransactionSuccessful();
                    return null;
                } finally {
                    sQLiteDatabaseM3610.endTransaction();
                }
            default:
                C1489 c1489 = (C1489) obj;
                Iterator it = ((Iterable) ((C1835) c1489.f5057).m3611(new C0178(11))).iterator();
                while (it.hasNext()) {
                    ((C2808) c1489.f5058).m5349((C1360) it.next(), 1, false);
                }
                return null;
        }
    }

    /* JADX INFO: renamed from: ۥُ */
    public void m8926() {
        InterfaceC5731 interfaceC5731 = (InterfaceC5731) this.f17566;
        synchronized (AbstractC1538.f5203) {
            AbstractC1538.f5207 = AbstractC0973.m2051(AbstractC1538.f5207, interfaceC5731);
        }
    }

    @Override // p000.InterfaceC2429
    /* JADX INFO: renamed from: ۥّ */
    public Object mo396(C3580 c3580) {
        int i = this.f17567;
        Object obj = this.f17566;
        switch (i) {
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                return (C3580) ((Callable) obj).call();
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                ((Runnable) obj).run();
                return AbstractC5378.m9075(null);
            default:
                ((CountDownLatch) obj).countDown();
                return null;
        }
    }

    @Override // p000.InterfaceC2740
    /* JADX INFO: renamed from: ۥۗ */
    public void mo397(InterfaceC2090 interfaceC2090) {
        C4843 c4843 = (C4843) this.f17566;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics native component now available.", null);
        }
        c4843.f15949.set((C4843) interfaceC2090.get());
    }

    @Override // p000.InterfaceC3562
    /* JADX INFO: renamed from: ۥۣ */
    public InterfaceC2488 mo6355(C3619 c3619) {
        Context context = (Context) this.f17566;
        String str = c3619.f12062;
        C0322 c0322 = c3619.f12060;
        if (str != null && str.length() != 0) {
            return new C1684(context, str, c0322, true, true);
        }
        C1078.m2272("Must set a non-null database name to a configuration that uses the no backup directory.");
        return null;
    }

    /* JADX INFO: renamed from: ۦؑ */
    public C3971 m8927(C2808 c2808) throws IOException {
        C5782 c5782 = (C5782) this.f17566;
        URL url = (URL) c2808.f9378;
        String strConcat = "TRuntime.".concat("CctTransportBackend");
        if (Log.isLoggable(strConcat, 4)) {
            Log.i(strConcat, String.format("Making request to: %s", url));
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(130000);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", "datatransport/3.3.0 android/");
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = (String) c2808.f9376;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    C5086 c5086 = c5782.f19055;
                    C1134 c1134 = (C1134) c2808.f9377;
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                    C0639 c0639 = (C0639) c5086.f16877;
                    C3413 c3413 = new C3413(bufferedWriter, c0639.f2397, c0639.f2396, c0639.f2394, c0639.f2395);
                    c3413.m6179(c1134);
                    c3413.m6182();
                    c3413.f11368.flush();
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    Integer numValueOf = Integer.valueOf(responseCode);
                    String strConcat2 = "TRuntime.".concat("CctTransportBackend");
                    if (Log.isLoggable(strConcat2, 4)) {
                        Log.i(strConcat2, String.format("Status Code: %d", numValueOf));
                    }
                    C3133.m5807("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                    C3133.m5807("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new C3971(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new C3971(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream gZIPInputStream = "gzip".equals(httpURLConnection.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream) : inputStream;
                        try {
                            C3971 c3971 = new C3971(responseCode, null, C0656.m1467(new BufferedReader(new InputStreamReader(gZIPInputStream))).f2434);
                            if (gZIPInputStream != null) {
                                gZIPInputStream.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return c3971;
                        } catch (Throwable th) {
                            if (gZIPInputStream == null) {
                                throw th;
                            }
                            try {
                                gZIPInputStream.close();
                                throw th;
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                                throw th;
                            }
                        }
                    } catch (Throwable th3) {
                        if (inputStream == null) {
                            throw th3;
                        }
                        try {
                            inputStream.close();
                            throw th3;
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                            throw th3;
                        }
                    }
                } catch (Throwable th5) {
                    try {
                        gZIPOutputStream.close();
                        throw th5;
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                        throw th5;
                    }
                }
            } catch (Throwable th7) {
                if (outputStream == null) {
                    throw th7;
                }
                try {
                    outputStream.close();
                    throw th7;
                } catch (Throwable th8) {
                    th7.addSuppressed(th8);
                    throw th7;
                }
            }
        } catch (ConnectException e) {
            e = e;
            C3133.m5800("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new C3971(500, null, 0L);
        } catch (UnknownHostException e2) {
            e = e2;
            C3133.m5800("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new C3971(500, null, 0L);
        } catch (IOException e3) {
            e = e3;
            C3133.m5800("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new C3971(400, null, 0L);
        } catch (C5465 e4) {
            e = e4;
            C3133.m5800("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new C3971(400, null, 0L);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x046c  */
    /* JADX WARN: Code duplicated, block: B:103:0x0474  */
    /* JADX WARN: Code duplicated, block: B:104:0x0479  */
    /* JADX WARN: Code duplicated, block: B:112:0x0584 A[Catch: Exception -> 0x058a, TryCatch #2 {Exception -> 0x058a, blocks: (B:107:0x0486, B:109:0x0551, B:110:0x0556, B:112:0x0584, B:116:0x058e, B:118:0x0596, B:120:0x05a4, B:122:0x05aa, B:124:0x05b3, B:125:0x05b7), top: B:150:0x0486 }] */
    /* JADX WARN: Code duplicated, block: B:127:0x05bb  */
    /* JADX WARN: Code duplicated, block: B:129:0x05c4  */
    /* JADX WARN: Code duplicated, block: B:133:0x05e4  */
    /* JADX WARN: Code duplicated, block: B:141:0x064a  */
    /* JADX WARN: Code duplicated, block: B:143:0x0664  */
    /* JADX WARN: Code duplicated, block: B:148:0x042b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:156:0x0262 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:158:0x022b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:160:0x0375 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:162:0x0370 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:165:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:166:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x0224  */
    /* JADX WARN: Code duplicated, block: B:46:0x0231  */
    /* JADX WARN: Code duplicated, block: B:52:0x0284 A[Catch: NameNotFoundException -> 0x0637, TryCatch #0 {NameNotFoundException -> 0x0637, blocks: (B:50:0x026d, B:52:0x0284, B:55:0x0296, B:58:0x029c, B:54:0x028f), top: B:146:0x026d }] */
    /* JADX WARN: Code duplicated, block: B:54:0x028f A[Catch: NameNotFoundException -> 0x0637, TryCatch #0 {NameNotFoundException -> 0x0637, blocks: (B:50:0x026d, B:52:0x0284, B:55:0x0296, B:58:0x029c, B:54:0x028f), top: B:146:0x026d }] */
    /* JADX WARN: Code duplicated, block: B:57:0x029a  */
    /* JADX WARN: Code duplicated, block: B:61:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:64:0x033c  */
    /* JADX WARN: Code duplicated, block: B:66:0x0344  */
    /* JADX WARN: Code duplicated, block: B:67:0x034d  */
    /* JADX WARN: Code duplicated, block: B:71:0x035b  */
    /* JADX WARN: Code duplicated, block: B:73:0x0361  */
    /* JADX WARN: Code duplicated, block: B:78:0x0389 A[LOOP:3: B:76:0x0383->B:78:0x0389, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:81:0x039d  */
    /* JADX WARN: Code duplicated, block: B:82:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:85:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:91:0x040c  */
    /* JADX WARN: Code duplicated, block: B:93:0x0412  */
    /* JADX WARN: Instruction removed from duplicated block: B:141:0x064a, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:46:0x0231, please report this as an issue */
    @Override // p000.InterfaceC5346
    /* JADX INFO: renamed from: ۦٌ */
    public Object mo400(C2813 c2813) {
        String str;
        C2808 c2808;
        C1377 c1377;
        int i;
        Throwable th;
        String strM6628;
        C5714 c5714;
        long jCurrentTimeMillis;
        String str2;
        PackageInfo packageInfo;
        String string;
        String str3;
        String str4;
        String str5;
        C5534 c5534;
        String str6;
        String strM6629;
        String strM1287;
        C4369 c4369;
        C3121 c3121;
        C5086 c5086;
        C0445 c0445;
        String str7;
        String strReplaceAll;
        String strReplaceAll2;
        int iM4152;
        String string2;
        String[] strArr;
        ArrayList arrayList;
        int i2;
        StringBuilder sb;
        Iterator it;
        String string3;
        String strM4144;
        C5534 c5535;
        boolean z;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        C5040 c5040M9210;
        C1377 c1378;
        C3580 c3580M6396;
        boolean zM4129;
        String str8;
        String str9;
        C2808 c2809;
        boolean zExists;
        NetworkInfo activeNetworkInfo;
        C5040 c5040M9211;
        String str10;
        String str11;
        int i3 = this.f17567;
        Object obj = this.f17566;
        switch (i3) {
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                CrashlyticsRegistrar crashlyticsRegistrar = (CrashlyticsRegistrar) obj;
                int i4 = CrashlyticsRegistrar.f352;
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                C0377 c0377 = (C0377) c2813.mo5371(C0377.class);
                InterfaceC2361 interfaceC2361 = (InterfaceC2361) c2813.mo5371(InterfaceC2361.class);
                C1510 c1510M5375 = c2813.m5375(C4843.class);
                C1510 c1510M5376 = c2813.m5375(InterfaceC4188.class);
                C1510 c1510M5377 = c2813.m5375(InterfaceC5623.class);
                ExecutorService executorService = (ExecutorService) c2813.mo5376(crashlyticsRegistrar.f355);
                ExecutorService executorService2 = (ExecutorService) c2813.mo5376(crashlyticsRegistrar.f354);
                ExecutorService executorService3 = (ExecutorService) c2813.mo5376(crashlyticsRegistrar.f353);
                c0377.m825();
                Context context = c0377.f1410;
                String packageName = context.getPackageName();
                Log.i("FirebaseCrashlytics", "Initializing Firebase Crashlytics 20.1.0 for " + packageName, null);
                C2808 c28010 = new C2808(executorService, executorService2);
                C2711 c2711 = new C2711(context);
                C1377 c1379 = new C1377(c0377);
                C0578 c0578 = new C0578(context, packageName, interfaceC2361, c1379);
                C4843 c4843 = new C4843(c1510M5375);
                C1795 c1795 = new C1795(c1510M5376);
                C2702 c2702 = new C2702(c1379, c2711);
                EnumC1499 enumC1499 = EnumC1499.f5085;
                C0230 c0230 = C0230.f872;
                C0579 c0579M492 = C0230.m492(enumC1499);
                if (c0579M492.f2072 != null) {
                    Log.d("FirebaseSessions", "Subscriber " + enumC1499 + " already registered.");
                } else {
                    c0579M492.f2072 = c2702;
                    Log.d("FirebaseSessions", "Subscriber " + enumC1499 + " registered.");
                    c0579M492.f2073.countDown();
                }
                Context context2 = context;
                C1377 c13710 = c1379;
                C3525 c3525 = new C3525(c0377, c0578, c4843, c13710, new C1898(c1795), new C1898(c1795), c2711, c2702, new C3121(15, c1510M5377), c28010);
                C2808 c28011 = c3525.f11687;
                c0377.m825();
                String str12 = c0377.f1405.f9266;
                int iM4153 = AbstractC2133.m4152(context2, "com.google.firebase.crashlytics.mapping_file_id", "string");
                if (iM4153 == 0) {
                    iM4153 = AbstractC2133.m4152(context2, "com.crashlytics.android.build_id", "string");
                }
                String string4 = iM4153 != 0 ? context2.getResources().getString(iM4153) : null;
                ArrayList<C1669> arrayList2 = new ArrayList();
                int iM4154 = AbstractC2133.m4152(context2, "com.google.firebase.crashlytics.build_ids_lib", "array");
                int iM4155 = AbstractC2133.m4152(context2, "com.google.firebase.crashlytics.build_ids_arch", "array");
                int iM4156 = AbstractC2133.m4152(context2, "com.google.firebase.crashlytics.build_ids_build_id", "array");
                try {
                    if (iM4154 == 0 || iM4155 == 0 || iM4156 == 0) {
                        str = str12;
                        c2808 = c28011;
                        c1377 = c13710;
                        String str13 = String.format("Could not find resources: %d %d %d", Integer.valueOf(iM4154), Integer.valueOf(iM4155), Integer.valueOf(iM4156));
                        i = 3;
                        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                            th = null;
                            Log.d("FirebaseCrashlytics", str13, null);
                        }
                        strM6628 = AbstractC3761.m6628("Mapping file ID is: ", string4);
                        if (Log.isLoggable("FirebaseCrashlytics", i)) {
                            Log.d("FirebaseCrashlytics", strM6628, th);
                        }
                        for (C1669 c1669 : arrayList2) {
                            str11 = "Build id for " + c1669.f5565 + " on " + c1669.f5564 + ": " + c1669.f5563;
                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                Log.d("FirebaseCrashlytics", str11, null);
                            }
                        }
                        C5002 c5002 = new C5002(context2);
                        String packageName2 = context2.getPackageName();
                        String strM1288 = c0578.m1287();
                        packageInfo = context2.getPackageManager().getPackageInfo(packageName2, 0);
                        if (Build.VERSION.SDK_INT >= 28) {
                            string = Long.toString(packageInfo.getLongVersionCode());
                        } else {
                            string = Integer.toString(packageInfo.versionCode);
                        }
                        str3 = string;
                        str4 = packageInfo.versionName;
                        if (str4 == null) {
                            str4 = "0.0";
                        }
                        str5 = str4;
                        c5534 = new C5534(str, string4, arrayList2, strM1288, packageName2, str3, str5, c5002);
                        str6 = str;
                        strM6629 = AbstractC3761.m6628("Installer package name is: ", strM1288);
                        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                            Log.v("FirebaseCrashlytics", strM6629, null);
                        }
                        new C4036(12);
                        strM1287 = c0578.m1287();
                        c4369 = new C4369(1);
                        c3121 = new C3121(19, c4369);
                        c5086 = new C5086(c2711);
                        Locale locale = Locale.US;
                        String strM66210 = AbstractC3761.m6629("https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/", str6, "/settings");
                        c0445 = new C0445();
                        c0445.f1632 = strM66210;
                        String str14 = Build.MANUFACTURER;
                        String str15 = C0578.f2064;
                        str7 = str14.replaceAll(str15, "") + "/" + Build.MODEL.replaceAll(str15, "");
                        strReplaceAll = Build.VERSION.INCREMENTAL.replaceAll(str15, "");
                        strReplaceAll2 = Build.VERSION.RELEASE.replaceAll(str15, "");
                        iM4152 = AbstractC2133.m4152(context2, "com.google.firebase.crashlytics.mapping_file_id", "string");
                        if (iM4152 == 0) {
                            iM4152 = AbstractC2133.m4152(context2, "com.crashlytics.android.build_id", "string");
                        }
                        if (iM4152 != 0) {
                            string2 = context2.getResources().getString(iM4152);
                        } else {
                            string2 = null;
                        }
                        strArr = new String[]{string2, str6, str5, str3};
                        arrayList = new ArrayList();
                        i2 = 0;
                        while (true) {
                            if (i2 < 4) {
                                Context context3 = context2;
                                Collections.sort(arrayList);
                                sb = new StringBuilder();
                                it = arrayList.iterator();
                                while (it.hasNext()) {
                                    sb.append((String) it.next());
                                }
                                string3 = sb.toString();
                                if (string3.length() > 0) {
                                    strM4144 = AbstractC2133.m4144(string3);
                                } else {
                                    strM4144 = null;
                                }
                                int i5 = strM1287 == null ? 1 : 4;
                                int i6 = 3;
                                z = false;
                                c5535 = new C5534(context3, new C4408(str6, str7, strReplaceAll, strReplaceAll2, c0578, strM4144, str5, str3, AbstractC3761.m6617(i5)), c4369, c3121, c5086, c0445, c1377);
                                atomicReference = (AtomicReference) c5535.f18264;
                                atomicReference2 = (AtomicReference) c5535.f18267;
                                if (((Context) c5535.f18265).getSharedPreferences("com.google.firebase.crashlytics", 0).getString("existing_instance_identifier", "").equals(((C4408) c5535.f18263).f14510) || (c5040M9211 = c5535.m9210(1)) == null) {
                                    c5040M9210 = c5535.m9210(3);
                                    if (c5040M9210 != null) {
                                        atomicReference2.set(c5040M9210);
                                        ((C2332) atomicReference.get()).m4374(c5040M9210);
                                    }
                                    c1378 = (C1377) c5535.f18262;
                                    C3580 c3580 = ((C2332) c1378.f4715).f7721;
                                    synchronized (c1378.f4713) {
                                        C3580 c3581 = ((C2332) c1378.f4719).f7721;
                                        break;
                                    }
                                    c3580M6396 = AbstractC5568.m9349(c3580, c3581).m6396((ExecutorC2291) c28010.f9378, new C2346(8, c5535, c28010, z));
                                } else {
                                    atomicReference2.set(c5040M9211);
                                    ((C2332) atomicReference.get()).m4374(c5040M9211);
                                    c3580M6396 = AbstractC5378.m9075(null);
                                }
                                c3580M6396.m6391(executorService3, new C5028(15));
                                C2711 c2712 = c3525.f11683;
                                Context context4 = c3525.f11678;
                                zM4129 = AbstractC2133.m4129(context4, "com.google.firebase.crashlytics.RequireBuildId", AbstractC2133.m4129(context4, "com.crashlytics.RequireBuildId", true));
                                str8 = (String) c5534.f18263;
                                if (zM4129) {
                                    if (TextUtils.isEmpty(str8)) {
                                        Log.e("FirebaseCrashlytics", ".");
                                        Log.e("FirebaseCrashlytics", ".     |  | ");
                                        Log.e("FirebaseCrashlytics", ".     |  |");
                                        Log.e("FirebaseCrashlytics", ".     |  |");
                                        Log.e("FirebaseCrashlytics", ".   \\ |  | /");
                                        Log.e("FirebaseCrashlytics", ".    \\    /");
                                        Log.e("FirebaseCrashlytics", ".     \\  /");
                                        Log.e("FirebaseCrashlytics", ".      \\/");
                                        Log.e("FirebaseCrashlytics", ".");
                                        Log.e("FirebaseCrashlytics", "The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
                                        Log.e("FirebaseCrashlytics", ".");
                                        Log.e("FirebaseCrashlytics", ".      /\\");
                                        Log.e("FirebaseCrashlytics", ".     /  \\");
                                        Log.e("FirebaseCrashlytics", ".    /    \\");
                                        Log.e("FirebaseCrashlytics", ".   / |  | \\");
                                        Log.e("FirebaseCrashlytics", ".     |  |");
                                        Log.e("FirebaseCrashlytics", ".     |  |");
                                        Log.e("FirebaseCrashlytics", ".     |  |");
                                        Log.e("FirebaseCrashlytics", ".");
                                        C1078.m2276("The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
                                        return null;
                                    }
                                } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                                    Log.v("FirebaseCrashlytics", "Configured not to require a build ID.", null);
                                }
                                str9 = new C3042().f10230;
                                try {
                                    int i7 = 18;
                                    c3525.f11675 = new C5002(i7, "crash_marker", c2712, z);
                                    c3525.f11674 = new C5002(i7, "initialization_marker", c2712, z);
                                    c2809 = c2808;
                                    C2711 c2713 = new C2711(str9, c2712, c2809);
                                    C5002 c5003 = new C5002(c2712);
                                    C3369 c3369 = new C3369(new InterfaceC0711[]{new C4036(24)});
                                    ((C1510) c3525.f11686.f10451).m3185(new C0178(i6));
                                    c3525.f11685 = new C4743(c3525.f11678, c3525.f11677, c3525.f11676, c3525.f11683, c3525.f11675, c5534, c2713, c5003, C3571.m6366(c3525.f11678, c3525.f11677, c3525.f11683, c5534, c5003, c2713, c3369, c5535, c3525.f11673, c3525.f11680, c3525.f11687), c3525.f11681, c3525.f11684, c3525.f11680, c3525.f11687);
                                    C5002 c5004 = c3525.f11674;
                                    zExists = new File((File) ((C2711) c5004.f16550).f8980, (String) c5004.f16551).exists();
                                    try {
                                        Boolean.TRUE.equals((Boolean) ((ExecutorC2291) c2809.f9378).f7614.submit(new CallableC4849(0, c3525)).get(3L, TimeUnit.SECONDS));
                                    } catch (Exception unused) {
                                    }
                                    C4743 c4743 = c3525.f11685;
                                    Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
                                    ((ExecutorC2291) c4743.f15655.f9378).m4346(new RunnableC5689(7, c4743, str9));
                                    C3248 c3248 = new C3248(new C4228(14, c4743), c5535, defaultUncaughtExceptionHandler, c4743.f15664);
                                    c4743.f15668 = c3248;
                                    Thread.setDefaultUncaughtExceptionHandler(c3248);
                                    if (Build.VERSION.SDK_INT >= 37) {
                                        c3525.f11685.m8062(str9);
                                    }
                                    if (!zExists && (context4.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0 || ((activeNetworkInfo = ((ConnectivityManager) context4.getSystemService("connectivity")).getActiveNetworkInfo()) != null && activeNetworkInfo.isConnectedOrConnecting()))) {
                                        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                            Log.d("FirebaseCrashlytics", "Crashlytics did not finish previous background initialization. Initializing synchronously.", null);
                                        }
                                        c3525.m6318(c5535);
                                    } else {
                                        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                            Log.d("FirebaseCrashlytics", "Successfully configured exception handler.", null);
                                        }
                                        ((ExecutorC2291) c2809.f9378).m4346(new RunnableC5598(c3525, c5535, 0));
                                    }
                                    break;
                                } catch (Exception e) {
                                    Log.e("FirebaseCrashlytics", "Crashlytics was not started due to an exception during initialization", e);
                                    c3525.f11685 = null;
                                }
                                c5714 = new C5714(c3525);
                                jCurrentTimeMillis = System.currentTimeMillis() - jCurrentTimeMillis2;
                                if (jCurrentTimeMillis > 16) {
                                    return c5714;
                                }
                                str2 = "Initializing Crashlytics blocked main for " + jCurrentTimeMillis + " ms";
                                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                    return c5714;
                                }
                                Log.d("FirebaseCrashlytics", str2, null);
                                return c5714;
                            }
                            str10 = strArr[i2];
                            Context context5 = context2;
                            if (str10 != null) {
                                arrayList.add(str10.replace("-", "").toLowerCase(Locale.US));
                            }
                            i2++;
                            context2 = context5;
                        }
                    } else {
                        String[] stringArray = context2.getResources().getStringArray(iM4154);
                        String[] stringArray2 = context2.getResources().getStringArray(iM4155);
                        String[] stringArray3 = context2.getResources().getStringArray(iM4156);
                        str = str12;
                        if (stringArray.length == stringArray3.length && stringArray2.length == stringArray3.length) {
                            int i8 = 0;
                            while (i8 < stringArray3.length) {
                                int i9 = i8;
                                arrayList2.add(new C1669(stringArray[i9], stringArray2[i9], stringArray3[i9]));
                                i8 = i9 + 1;
                                c13710 = c13710;
                                c28011 = c28011;
                            }
                            c2808 = c28011;
                            c1377 = c13710;
                        } else {
                            c2808 = c28011;
                            c1377 = c13710;
                            String str16 = String.format("Lengths did not match: %d %d %d", Integer.valueOf(stringArray.length), Integer.valueOf(stringArray2.length), Integer.valueOf(stringArray3.length));
                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                Log.d("FirebaseCrashlytics", str16, null);
                            }
                        }
                        i = 3;
                    }
                    String packageName3 = context2.getPackageName();
                    String strM1289 = c0578.m1287();
                    packageInfo = context2.getPackageManager().getPackageInfo(packageName3, 0);
                    if (Build.VERSION.SDK_INT >= 28) {
                        string = Long.toString(packageInfo.getLongVersionCode());
                    } else {
                        string = Integer.toString(packageInfo.versionCode);
                    }
                    str3 = string;
                    str4 = packageInfo.versionName;
                    if (str4 == null) {
                        str4 = "0.0";
                    }
                    str5 = str4;
                    c5534 = new C5534(str, string4, arrayList2, strM1289, packageName3, str3, str5, c5002);
                    str6 = str;
                    strM6629 = AbstractC3761.m6628("Installer package name is: ", strM1289);
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", strM6629, null);
                    }
                    new C4036(12);
                    strM1287 = c0578.m1287();
                    c4369 = new C4369(1);
                    c3121 = new C3121(19, c4369);
                    c5086 = new C5086(c2711);
                    Locale locale2 = Locale.US;
                    String strM66211 = AbstractC3761.m6629("https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/", str6, "/settings");
                    c0445 = new C0445();
                    c0445.f1632 = strM66211;
                    String str17 = Build.MANUFACTURER;
                    String str18 = C0578.f2064;
                    str7 = str17.replaceAll(str18, "") + "/" + Build.MODEL.replaceAll(str18, "");
                    strReplaceAll = Build.VERSION.INCREMENTAL.replaceAll(str18, "");
                    strReplaceAll2 = Build.VERSION.RELEASE.replaceAll(str18, "");
                    iM4152 = AbstractC2133.m4152(context2, "com.google.firebase.crashlytics.mapping_file_id", "string");
                    if (iM4152 == 0) {
                        iM4152 = AbstractC2133.m4152(context2, "com.crashlytics.android.build_id", "string");
                    }
                    if (iM4152 != 0) {
                        string2 = context2.getResources().getString(iM4152);
                    } else {
                        string2 = null;
                    }
                    strArr = new String[]{string2, str6, str5, str3};
                    arrayList = new ArrayList();
                    i2 = 0;
                    while (true) {
                        if (i2 < 4) {
                            Context context6 = context2;
                            Collections.sort(arrayList);
                            sb = new StringBuilder();
                            it = arrayList.iterator();
                            while (it.hasNext()) {
                                sb.append((String) it.next());
                            }
                            string3 = sb.toString();
                            if (string3.length() > 0) {
                                strM4144 = AbstractC2133.m4144(string3);
                            } else {
                                strM4144 = null;
                            }
                            if (strM1287 == null) {
                            }
                            int i10 = 3;
                            z = false;
                            c5535 = new C5534(context6, new C4408(str6, str7, strReplaceAll, strReplaceAll2, c0578, strM4144, str5, str3, AbstractC3761.m6617(i5)), c4369, c3121, c5086, c0445, c1377);
                            atomicReference = (AtomicReference) c5535.f18264;
                            atomicReference2 = (AtomicReference) c5535.f18267;
                            if (((Context) c5535.f18265).getSharedPreferences("com.google.firebase.crashlytics", 0).getString("existing_instance_identifier", "").equals(((C4408) c5535.f18263).f14510)) {
                                c5040M9210 = c5535.m9210(3);
                                if (c5040M9210 != null) {
                                    atomicReference2.set(c5040M9210);
                                    ((C2332) atomicReference.get()).m4374(c5040M9210);
                                }
                                c1378 = (C1377) c5535.f18262;
                                C3580 c3582 = ((C2332) c1378.f4715).f7721;
                                synchronized (c1378.f4713) {
                                    C3580 c3583 = ((C2332) c1378.f4719).f7721;
                                    c3580M6396 = AbstractC5568.m9349(c3582, c3583).m6396((ExecutorC2291) c28010.f9378, new C2346(8, c5535, c28010, z));
                                }
                            } else {
                                c5040M9210 = c5535.m9210(3);
                                if (c5040M9210 != null) {
                                    atomicReference2.set(c5040M9210);
                                    ((C2332) atomicReference.get()).m4374(c5040M9210);
                                }
                                c1378 = (C1377) c5535.f18262;
                                C3580 c3584 = ((C2332) c1378.f4715).f7721;
                                synchronized (c1378.f4713) {
                                    C3580 c3585 = ((C2332) c1378.f4719).f7721;
                                    c3580M6396 = AbstractC5568.m9349(c3584, c3585).m6396((ExecutorC2291) c28010.f9378, new C2346(8, c5535, c28010, z));
                                }
                            }
                            c3580M6396.m6391(executorService3, new C5028(15));
                            C2711 c2714 = c3525.f11683;
                            Context context7 = c3525.f11678;
                            zM4129 = AbstractC2133.m4129(context7, "com.google.firebase.crashlytics.RequireBuildId", AbstractC2133.m4129(context7, "com.crashlytics.RequireBuildId", true));
                            str8 = (String) c5534.f18263;
                            if (zM4129) {
                                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                                    Log.v("FirebaseCrashlytics", "Configured not to require a build ID.", null);
                                }
                            } else if (TextUtils.isEmpty(str8)) {
                                Log.e("FirebaseCrashlytics", ".");
                                Log.e("FirebaseCrashlytics", ".     |  | ");
                                Log.e("FirebaseCrashlytics", ".     |  |");
                                Log.e("FirebaseCrashlytics", ".     |  |");
                                Log.e("FirebaseCrashlytics", ".   \\ |  | /");
                                Log.e("FirebaseCrashlytics", ".    \\    /");
                                Log.e("FirebaseCrashlytics", ".     \\  /");
                                Log.e("FirebaseCrashlytics", ".      \\/");
                                Log.e("FirebaseCrashlytics", ".");
                                Log.e("FirebaseCrashlytics", "The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
                                Log.e("FirebaseCrashlytics", ".");
                                Log.e("FirebaseCrashlytics", ".      /\\");
                                Log.e("FirebaseCrashlytics", ".     /  \\");
                                Log.e("FirebaseCrashlytics", ".    /    \\");
                                Log.e("FirebaseCrashlytics", ".   / |  | \\");
                                Log.e("FirebaseCrashlytics", ".     |  |");
                                Log.e("FirebaseCrashlytics", ".     |  |");
                                Log.e("FirebaseCrashlytics", ".     |  |");
                                Log.e("FirebaseCrashlytics", ".");
                                C1078.m2276("The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
                                return null;
                            }
                            str9 = new C3042().f10230;
                            int i11 = 18;
                            c3525.f11675 = new C5002(i11, "crash_marker", c2714, z);
                            c3525.f11674 = new C5002(i11, "initialization_marker", c2714, z);
                            c2809 = c2808;
                            C2711 c2715 = new C2711(str9, c2714, c2809);
                            C5002 c5005 = new C5002(c2714);
                            C3369 c33610 = new C3369(new InterfaceC0711[]{new C4036(24)});
                            ((C1510) c3525.f11686.f10451).m3185(new C0178(i10));
                            c3525.f11685 = new C4743(c3525.f11678, c3525.f11677, c3525.f11676, c3525.f11683, c3525.f11675, c5534, c2715, c5005, C3571.m6366(c3525.f11678, c3525.f11677, c3525.f11683, c5534, c5005, c2715, c33610, c5535, c3525.f11673, c3525.f11680, c3525.f11687), c3525.f11681, c3525.f11684, c3525.f11680, c3525.f11687);
                            C5002 c5006 = c3525.f11674;
                            zExists = new File((File) ((C2711) c5006.f16550).f8980, (String) c5006.f16551).exists();
                            Boolean.TRUE.equals((Boolean) ((ExecutorC2291) c2809.f9378).f7614.submit(new CallableC4849(0, c3525)).get(3L, TimeUnit.SECONDS));
                            C4743 c4744 = c3525.f11685;
                            Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler2 = Thread.getDefaultUncaughtExceptionHandler();
                            ((ExecutorC2291) c4744.f15655.f9378).m4346(new RunnableC5689(7, c4744, str9));
                            C3248 c3249 = new C3248(new C4228(14, c4744), c5535, defaultUncaughtExceptionHandler2, c4744.f15664);
                            c4744.f15668 = c3249;
                            Thread.setDefaultUncaughtExceptionHandler(c3249);
                            if (Build.VERSION.SDK_INT >= 37) {
                                c3525.f11685.m8062(str9);
                            }
                            if (!zExists) {
                                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                    Log.d("FirebaseCrashlytics", "Successfully configured exception handler.", null);
                                }
                                ((ExecutorC2291) c2809.f9378).m4346(new RunnableC5598(c3525, c5535, 0));
                            } else {
                                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                    Log.d("FirebaseCrashlytics", "Successfully configured exception handler.", null);
                                }
                                ((ExecutorC2291) c2809.f9378).m4346(new RunnableC5598(c3525, c5535, 0));
                            }
                            c5714 = new C5714(c3525);
                            jCurrentTimeMillis = System.currentTimeMillis() - jCurrentTimeMillis2;
                            if (jCurrentTimeMillis > 16) {
                                return c5714;
                            }
                            str2 = "Initializing Crashlytics blocked main for " + jCurrentTimeMillis + " ms";
                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                return c5714;
                            }
                            Log.d("FirebaseCrashlytics", str2, null);
                            return c5714;
                        }
                        str10 = strArr[i2];
                        Context context8 = context2;
                        if (str10 != null) {
                            arrayList.add(str10.replace("-", "").toLowerCase(Locale.US));
                        }
                        i2++;
                        context2 = context8;
                    }
                } catch (PackageManager.NameNotFoundException e2) {
                    Log.e("FirebaseCrashlytics", "Error retrieving app package info.", e2);
                    c5714 = null;
                }
                th = null;
                strM6628 = AbstractC3761.m6628("Mapping file ID is: ", string4);
                if (Log.isLoggable("FirebaseCrashlytics", i)) {
                    Log.d("FirebaseCrashlytics", strM6628, th);
                }
                while (r3.hasNext()) {
                    str11 = "Build id for " + c1669.f5565 + " on " + c1669.f5564 + ": " + c1669.f5563;
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", str11, null);
                    }
                }
                C5002 c5007 = new C5002(context2);
                break;
            default:
                return new C0161((Context) c2813.mo5371(Context.class), ((C0377) c2813.mo5371(C0377.class)).m824(), c2813.mo5365(C1166.m2484(C1397.class)), c2813.mo5372(C2239.class), (Executor) c2813.mo5376((C1166) obj));
        }
    }

    @Override // p000.InterfaceC3662
    /* JADX INFO: renamed from: ۦۙ */
    public C2639 mo284(View view, C2639 c2639) {
        C1909 c1909 = (C1909) this.f17566;
        ArrayList arrayList = c1909.f6298;
        C3470 c3470 = c2639.f8768;
        C5364 c5364M9015 = C5364.m9015(c3470.mo2752(519), c3470.mo2752(64));
        C5364 c5364M9016 = C5364.m9015(c3470.mo2749(519), c3470.mo2749(64));
        if (!c5364M9015.equals(c1909.f6296) || !c5364M9016.equals(c1909.f6300)) {
            c1909.f6296 = c5364M9015;
            c1909.f6300 = c5364M9016;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                C2075 c2075 = (C2075) arrayList.get(size);
                c2075.f6849 = c5364M9015;
                c2075.f6854 = c5364M9016;
                c2075.m4019();
            }
        }
        return c2639;
    }
}
