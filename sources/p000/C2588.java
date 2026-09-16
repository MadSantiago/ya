package p000;

import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: ۥٍْۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2588 implements InterfaceC2361 {

    /* JADX INFO: renamed from: ۦؚ */
    public static final Object f8634 = new Object();

    /* JADX INFO: renamed from: ۥؗ */
    public final C3369 f8635;

    /* JADX INFO: renamed from: ۥُ */
    public final C0916 f8636;

    /* JADX INFO: renamed from: ۥّ */
    public final Object f8637;

    /* JADX INFO: renamed from: ۥۗ */
    public final C2914 f8638;

    /* JADX INFO: renamed from: ۥۜ */
    public final ExecutorC3331 f8639;

    /* JADX INFO: renamed from: ۥۣ */
    public final C0377 f8640;

    /* JADX INFO: renamed from: ۦؑ */
    public final C2761 f8641;

    /* JADX INFO: renamed from: ۦِ */
    public final HashSet f8642;

    /* JADX INFO: renamed from: ۦٛ */
    public String f8643;

    /* JADX INFO: renamed from: ۦۗ */
    public final ArrayList f8644;

    /* JADX INFO: renamed from: ۦۙ */
    public final ExecutorService f8645;

    static {
        new AtomicInteger(1);
    }

    public C2588(C0377 c0377, InterfaceC2090 interfaceC2090, ExecutorService executorService, ExecutorC3331 executorC3331) {
        c0377.m825();
        C2914 c2914 = new C2914(c0377.f1410, interfaceC2090);
        C3369 c3369 = new C3369(c0377);
        C4452 c4452 = C4452.f14692;
        if (c4452 == null) {
            c4452 = new C4452(0);
            C4452.f14692 = c4452;
        }
        C2761 c2761 = C2761.f9142;
        if (c2761 == null) {
            c2761 = new C2761(c4452);
            C2761.f9142 = c2761;
        }
        C0916 c0916 = new C0916(new C0771(2, c0377));
        this.f8637 = new Object();
        this.f8642 = new HashSet();
        this.f8644 = new ArrayList();
        this.f8640 = c0377;
        this.f8638 = c2914;
        this.f8635 = c3369;
        this.f8641 = c2761;
        this.f8636 = c0916;
        this.f8645 = executorService;
        this.f8639 = executorC3331;
    }

    /* JADX INFO: renamed from: ۦؑ */
    public static C2588 m4881() {
        C0377 c0377M823 = C0377.m823();
        c0377M823.m825();
        return (C2588) c0377M823.f1411.mo5371(InterfaceC2361.class);
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final C3580 m4882() {
        String str;
        m4884();
        synchronized (this) {
            str = this.f8643;
        }
        if (str != null) {
            return AbstractC5378.m9075(str);
        }
        C2332 c2332 = new C2332();
        C5879 c5879 = new C5879(c2332);
        synchronized (this.f8637) {
            this.f8644.add(c5879);
        }
        C3580 c3580 = c2332.f7721;
        this.f8645.execute(new RunnableC1218(this, 0));
        return c3580;
    }

    /* JADX INFO: renamed from: ۥُ */
    public final C3580 m4883() {
        m4884();
        C2332 c2332 = new C2332();
        C5184 c5184 = new C5184(this.f8641, c2332);
        synchronized (this.f8637) {
            this.f8644.add(c5184);
        }
        C3580 c3580 = c2332.f7721;
        this.f8645.execute(new RunnableC1218(this, 1));
        return c3580;
    }

    /* JADX INFO: renamed from: ۥّ */
    public final void m4884() {
        C0377 c0377 = this.f8640;
        c0377.m825();
        AbstractC0487.m1097(c0377.f1405.f9266, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        c0377.m825();
        AbstractC0487.m1097(c0377.f1405.f9267, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        c0377.m825();
        AbstractC0487.m1097(c0377.f1405.f9268, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        c0377.m825();
        String str = c0377.f1405.f9266;
        Pattern pattern = C2761.f9143;
        AbstractC0487.m1079("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", str.contains(":"));
        c0377.m825();
        AbstractC0487.m1079("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", C2761.f9143.matcher(c0377.f1405.f9268).matches());
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final C2529 m4885(C2529 c2529) throws C5707 {
        int i;
        C1969 c1969;
        C1969 c1969M5490;
        C2914 c2914 = this.f8638;
        C0377 c0377 = this.f8640;
        c0377.m825();
        String str = c0377.f1405.f9268;
        String str2 = c2529.f8376;
        C0377 c0378 = this.f8640;
        c0378.m825();
        String str3 = c0378.f1405.f9267;
        String str4 = c2529.f8377;
        C0154 c0154 = c2914.f9711;
        if (!c0154.m326()) {
            throw new C5707("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL urlM5493 = C2914.m5493("projects/" + str3 + "/installations/" + str2 + "/authTokens:generate");
        int i2 = 0;
        while (true) {
            if (i2 > 1) {
                throw new C5707("Firebase Installations Service is unavailable. Please try again later.");
            }
            TrafficStats.setThreadStatsTag(32771);
            HttpURLConnection httpURLConnectionM5497 = c2914.m5497(urlM5493, str);
            try {
                try {
                    httpURLConnectionM5497.setRequestMethod("POST");
                    httpURLConnectionM5497.addRequestProperty("Authorization", "FIS_v2 " + str4);
                    httpURLConnectionM5497.setDoOutput(true);
                    C2914.m5492(httpURLConnectionM5497);
                    int responseCode = httpURLConnectionM5497.getResponseCode();
                    c0154.m325(responseCode);
                    if (responseCode >= 200 && responseCode < 300) {
                        c1969M5490 = C2914.m5490(httpURLConnectionM5497);
                        httpURLConnectionM5497.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        break;
                    }
                    C2914.m5491(httpURLConnectionM5497, null, str, str3);
                    i = i2;
                    try {
                        if (responseCode == 401 || responseCode == 404) {
                            if (((byte) (0 | 1)) != 1) {
                                throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
                            }
                            c1969 = new C1969(0L, null, 3);
                        } else {
                            if (responseCode == 429) {
                                throw new C5707("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                            }
                            if (responseCode < 500 || responseCode >= 600) {
                                Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                                if (((byte) (0 | 1)) != 1) {
                                    throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
                                }
                                c1969 = new C1969(0L, null, 2);
                            }
                            httpURLConnectionM5497.disconnect();
                            TrafficStats.clearThreadStatsTag();
                            i2 = i + 1;
                        }
                        httpURLConnectionM5497.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        c1969M5490 = c1969;
                        break;
                    } catch (IOException | AssertionError unused) {
                    }
                } catch (IOException | AssertionError unused2) {
                    i = i2;
                }
            } catch (Throwable th) {
                httpURLConnectionM5497.disconnect();
                TrafficStats.clearThreadStatsTag();
                throw th;
            }
        }
        int iM6632 = AbstractC3761.m6632(c1969M5490.f6519);
        if (iM6632 == 0) {
            String str5 = c1969M5490.f6521;
            long j = c1969M5490.f6520;
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            C2414 c2414M4746 = c2529.m4746();
            c2414M4746.f8034 = str5;
            c2414M4746.f8035 = j;
            byte b = (byte) (c2414M4746.f8038 | 1);
            c2414M4746.f8036 = jCurrentTimeMillis;
            c2414M4746.f8038 = (byte) (b | 2);
            return c2414M4746.m4533();
        }
        if (iM6632 == 1) {
            C2414 c2414M4747 = c2529.m4746();
            c2414M4747.f8041 = "BAD CONFIG";
            c2414M4747.f8037 = 5;
            return c2414M4747.m4533();
        }
        if (iM6632 != 2) {
            throw new C5707("Firebase Installations Service is unavailable. Please try again later.");
        }
        synchronized (this) {
            this.f8643 = null;
        }
        C2414 c2414M4748 = c2529.m4746();
        c2414M4748.f8037 = 2;
        return c2414M4748.m4533();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [ۥَؕؒٝ] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX INFO: renamed from: ۥۜ */
    public final C2529 m4886(C2529 c2529) throws C5707 {
        C2931 c2931M5489;
        String str = c2529.f8376;
        String string = 0;
        string = 0;
        string = 0;
        string = 0;
        if (str != null && str.length() == 11) {
            C5127 c5127 = (C5127) this.f8636.get();
            c5127.getClass();
            for (int i = 0; i < 4; i++) {
                String str2 = C5127.f16993[i];
                String str3 = (String) AbstractC5537.m9243(C4794.f15814, new C0023(c5127.f16996, new C3637("|T|" + c5127.f16995 + "|" + str2), string, 28));
                if (str3 != null && !str3.isEmpty()) {
                    if (!str3.startsWith("{")) {
                        string = str3;
                        break;
                    }
                    try {
                        string = new JSONObject(str3).getString("token");
                        break;
                    } catch (JSONException unused) {
                        break;
                    }
                }
            }
        }
        C0377 c0377 = this.f8640;
        c0377.m825();
        String str4 = c0377.f1405.f9268;
        c0377.m825();
        String str5 = c0377.f1405.f9267;
        c0377.m825();
        String str6 = c0377.f1405.f9266;
        C2914 c2914 = this.f8638;
        C0154 c0154 = c2914.f9711;
        if (!c0154.m326()) {
            throw new C5707("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL urlM5493 = C2914.m5493("projects/" + str5 + "/installations");
        int i2 = 0;
        while (true) {
            if (i2 > 1) {
                throw new C5707("Firebase Installations Service is unavailable. Please try again later.");
            }
            TrafficStats.setThreadStatsTag(32769);
            HttpURLConnection httpURLConnectionM5497 = c2914.m5497(urlM5493, str4);
            try {
                try {
                    httpURLConnectionM5497.setRequestMethod("POST");
                    httpURLConnectionM5497.setDoOutput(true);
                    if (string != 0) {
                        httpURLConnectionM5497.addRequestProperty("x-goog-fis-android-iid-migration-auth", string);
                    }
                    C2914.m5496(httpURLConnectionM5497, str, str6);
                    int responseCode = httpURLConnectionM5497.getResponseCode();
                    c0154.m325(responseCode);
                    if (responseCode >= 200 && responseCode < 300) {
                        c2931M5489 = C2914.m5489(httpURLConnectionM5497);
                        httpURLConnectionM5497.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        break;
                    }
                    C2914.m5491(httpURLConnectionM5497, str6, str4, str5);
                    if (responseCode == 429) {
                        throw new C5707("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                        C2931 c2931 = new C2931(null, null, null, null, 2);
                        httpURLConnectionM5497.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        c2931M5489 = c2931;
                        break;
                    }
                    httpURLConnectionM5497.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    i2++;
                } catch (IOException | AssertionError unused2) {
                }
            } catch (Throwable th) {
                httpURLConnectionM5497.disconnect();
                TrafficStats.clearThreadStatsTag();
                throw th;
            }
        }
        int iM6632 = AbstractC3761.m6632(c2931M5489.f9854);
        if (iM6632 != 0) {
            if (iM6632 != 1) {
                throw new C5707("Firebase Installations Service is unavailable. Please try again later.");
            }
            C2414 c2414M4746 = c2529.m4746();
            c2414M4746.f8041 = "BAD CONFIG";
            c2414M4746.f8037 = 5;
            return c2414M4746.m4533();
        }
        String str7 = c2931M5489.f9855;
        String str8 = c2931M5489.f9853;
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        C1969 c1969 = c2931M5489.f9857;
        String str9 = c1969.f6521;
        long j = c1969.f6520;
        C2414 c2414M4747 = c2529.m4746();
        c2414M4747.f8039 = str7;
        c2414M4747.f8037 = 4;
        c2414M4747.f8034 = str9;
        c2414M4747.f8040 = str8;
        c2414M4747.f8035 = j;
        byte b = (byte) (c2414M4747.f8038 | 1);
        c2414M4747.f8036 = jCurrentTimeMillis;
        c2414M4747.f8038 = (byte) (b | 2);
        return c2414M4747.m4533();
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m4887() {
        C2529 c2529M6133;
        int i;
        synchronized (f8634) {
            try {
                C0377 c0377 = this.f8640;
                c0377.m825();
                C5002 c5002M8391 = C5002.m8391(c0377.f1410);
                try {
                    c2529M6133 = this.f8635.m6133();
                    int i2 = c2529M6133.f8375;
                    i = 2;
                    boolean z = true;
                    if (i2 != 2 && i2 != 1) {
                        z = false;
                    }
                    if (z) {
                        String strM4890 = m4890(c2529M6133);
                        C3369 c3369 = this.f8635;
                        C2414 c2414M4746 = c2529M6133.m4746();
                        c2414M4746.f8039 = strM4890;
                        c2414M4746.f8037 = 3;
                        c2529M6133 = c2414M4746.m4533();
                        c3369.m6134(c2529M6133);
                    }
                    if (c5002M8391 != null) {
                        c5002M8391.m8404();
                    }
                } catch (Throwable th) {
                    if (c5002M8391 != null) {
                        c5002M8391.m8404();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        m4888(c2529M6133);
        this.f8639.execute(new RunnableC1218(this, i));
    }

    /* JADX INFO: renamed from: ۦِ */
    public final void m4888(C2529 c2529) {
        synchronized (this.f8637) {
            try {
                Iterator it = this.f8644.iterator();
                while (it.hasNext()) {
                    if (((InterfaceC2119) it.next()).mo4100(c2529)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۦٛ */
    public final void m4889(Exception exc) {
        synchronized (this.f8637) {
            try {
                Iterator it = this.f8644.iterator();
                while (it.hasNext()) {
                    if (((InterfaceC2119) it.next()).mo4101(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003d  */
    /* JADX WARN: Code duplicated, block: B:11:0x003f  */
    /* JADX WARN: Code duplicated, block: B:14:0x0051  */
    /* JADX WARN: Code duplicated, block: B:25:0x0081  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:6:0x001a  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [ۥَؕؒٝ] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX INFO: renamed from: ۦۙ */
    public final String m4890(C2529 c2529) {
        C3990 c3990;
        String strEncodeToString;
        int i;
        C4794 c4794;
        String str;
        String str2;
        PublicKey publicKeyGeneratePublic;
        C0377 c0377 = this.f8640;
        c0377.m825();
        String str3 = c0377.f1408;
        if (!str3.equals("CHIME_ANDROID_SDK")) {
            c0377.m825();
            if ("[DEFAULT]".equals(str3)) {
                if (c2529.f8375 == 1) {
                    c3990 = ((C5127) this.f8636.get()).f16996;
                    strEncodeToString = 0;
                    strEncodeToString = 0;
                    strEncodeToString = 0;
                    i = 28;
                    C0023 c0023 = new C0023(c3990, C5127.f16994, strEncodeToString, i);
                    c4794 = C4794.f15814;
                    str = (String) AbstractC5537.m9243(c4794, c0023);
                    if (str != null) {
                        strEncodeToString = str;
                    } else {
                        str2 = (String) AbstractC5537.m9243(c4794, new C0023(c3990, C5127.f16992, strEncodeToString, i));
                        if (str2 != null) {
                            try {
                                publicKeyGeneratePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str2, 8)));
                            } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e) {
                                Log.w("ContentValues", "Invalid key stored " + e);
                                publicKeyGeneratePublic = null;
                            }
                            if (publicKeyGeneratePublic != null) {
                                try {
                                    byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(publicKeyGeneratePublic.getEncoded());
                                    bArrDigest[0] = (byte) (((bArrDigest[0] & 15) + 112) & 255);
                                    strEncodeToString = Base64.encodeToString(bArrDigest, 0, 8, 11);
                                } catch (NoSuchAlgorithmException unused) {
                                    Log.w("ContentValues", "Unexpected error, device missing required algorithms");
                                }
                            }
                        }
                    }
                    if (TextUtils.isEmpty(strEncodeToString)) {
                        return C5814.m9624();
                    }
                    return strEncodeToString;
                }
            }
        } else if (c2529.f8375 == 1) {
            c3990 = ((C5127) this.f8636.get()).f16996;
            strEncodeToString = 0;
            strEncodeToString = 0;
            strEncodeToString = 0;
            i = 28;
            C0023 c0024 = new C0023(c3990, C5127.f16994, strEncodeToString, i);
            c4794 = C4794.f15814;
            str = (String) AbstractC5537.m9243(c4794, c0024);
            if (str != null) {
                strEncodeToString = str;
            } else {
                str2 = (String) AbstractC5537.m9243(c4794, new C0023(c3990, C5127.f16992, strEncodeToString, i));
                if (str2 != null) {
                    publicKeyGeneratePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str2, 8)));
                    if (publicKeyGeneratePublic != null) {
                        byte[] bArrDigest2 = MessageDigest.getInstance("SHA1").digest(publicKeyGeneratePublic.getEncoded());
                        bArrDigest2[0] = (byte) (((bArrDigest2[0] & 15) + 112) & 255);
                        strEncodeToString = Base64.encodeToString(bArrDigest2, 0, 8, 11);
                    }
                }
            }
            if (TextUtils.isEmpty(strEncodeToString)) {
                return C5814.m9624();
            }
            return strEncodeToString;
        }
        return C5814.m9624();
    }
}
