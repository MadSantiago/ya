package p000;

import android.text.TextUtils;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: ۦٟٜؓٗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class CallableC4849 implements Callable {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ Object f15965;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f15966;

    public /* synthetic */ CallableC4849(int i, Object obj) {
        this.f15966 = i;
        this.f15965 = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws IOException {
        boolean z = false;
        i = 0;
        int i = 0;
        int i2 = 0;
        z = false;
        switch (this.f15966) {
            case 0:
                C4743 c4743 = ((C3525) this.f15965).f11685;
                c4743.getClass();
                C2808.m5331();
                C5002 c5002 = c4743.f15654;
                C2711 c2711 = (C2711) c5002.f16550;
                String str = (String) c5002.f16551;
                if (!new File((File) c2711.f8980, str).exists()) {
                    if (c4743.m8063() != null && c4743.f15664.m8213()) {
                    }
                    return Boolean.valueOf(z);
                }
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Found previous crash marker.", null);
                }
                new File((File) ((C2711) c5002.f16550).f8980, str).delete();
                z = true;
                return Boolean.valueOf(z);
            case 1:
                WorkDatabase workDatabase = ((C1186) this.f15965).f4075;
                Long lM6540 = workDatabase.mo102().m6540("next_job_scheduler_id");
                int iLongValue = lM6540 != null ? (int) lM6540.longValue() : 0;
                int i3 = iLongValue == Integer.MAX_VALUE ? 0 : iLongValue + 1;
                C3680 c3680Mo102 = workDatabase.mo102();
                int i4 = 29;
                AbstractC0487.m1075(c3680Mo102.f12293, false, true, new C0079(i4, c3680Mo102, new C5435("next_job_scheduler_id", Long.valueOf(i3))));
                if (iLongValue < 0 || iLongValue > Integer.MAX_VALUE) {
                    C3680 c3680Mo103 = workDatabase.mo102();
                    AbstractC0487.m1075(c3680Mo103.f12293, false, true, new C0079(i4, c3680Mo103, new C5435("next_job_scheduler_id", 1L)));
                } else {
                    i2 = iLongValue;
                }
                return Integer.valueOf(i2);
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                C5534 c5534 = (C5534) ((C2346) this.f15965).f7785;
                C0445 c0445 = (C0445) c5534.f18261;
                C4408 c4408 = (C4408) c5534.f18263;
                String str2 = c0445.f1632;
                C2808.m5332();
                try {
                    HashMap mapM964 = C0445.m964(c4408);
                    C2808 c2808 = new C2808(str2, mapM964);
                    c2808.m5344("User-Agent", "Crashlytics Android SDK/20.1.0");
                    c2808.m5344("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
                    C0445.m965(c2808, c4408);
                    String strConcat = "Requesting settings from ".concat(str2);
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", strConcat, null);
                    }
                    String str3 = "Settings query params were: " + mapM964;
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", str3, null);
                    }
                    return c0445.m966(c2808.m5357());
                } catch (IOException e) {
                    Log.e("FirebaseCrashlytics", "Settings request failed.", e);
                    return null;
                }
            default:
                C3267 c3267 = (C3267) this.f15965;
                C2106 c2106 = c3267.f10973;
                C2489 c2489 = c3267.f10972;
                try {
                    c3267.f10978.exitValue();
                    throw new IOException("Created process has terminated");
                } catch (IllegalThreadStateException unused) {
                    AbstractC5537.m9275(c2106);
                    AbstractC5537.m9275(c3267.f10971);
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(c2106));
                    try {
                        Charset charset = StandardCharsets.UTF_8;
                        c2489.write("echo SHELL_TEST\n".getBytes(charset));
                        c2489.flush();
                        String line = bufferedReader.readLine();
                        if (TextUtils.isEmpty(line) || !line.contains("SHELL_TEST")) {
                            throw new IOException("Created process is not a shell");
                        }
                        c2489.write("id\n".getBytes(charset));
                        c2489.flush();
                        String line2 = bufferedReader.readLine();
                        if (!TextUtils.isEmpty(line2) && line2.contains("uid=0")) {
                            synchronized (AbstractC2774.class) {
                                AbstractC2774.f9243 = 2;
                                c2489.write(("cd " + AbstractC5537.m9260(System.getProperty("user.dir")) + "\n").getBytes(charset));
                                c2489.flush();
                                i = 1;
                            }
                        }
                        bufferedReader.close();
                        return Integer.valueOf(i);
                    } catch (Throwable th) {
                        try {
                            bufferedReader.close();
                            break;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
        }
    }
}
